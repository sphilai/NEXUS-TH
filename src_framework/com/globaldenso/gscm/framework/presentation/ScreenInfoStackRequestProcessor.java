/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 *
 * ScreenInfoStackRequestProcessorクラス
 * ScreenInfoStackRequestProcessor class
 *
 * Version.
 * 1.1.0
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.REQUEST_KEY_RETURN_ACTION;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.SqlTimestampConverter;
import org.apache.commons.lang.SerializationUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.RequestUtils;
import org.springframework.web.struts.AutowiringTilesRequestProcessor;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.Resource;

/**
 * ScreenInfoStackRequestProcessorクラス
 * ScreenInfoStackRequestProcessor class
 * <p>
 * 画面情報をDensoContext汎用エリアへ保持する為のRequestProcessorです。
 * RequestProcessor for storing into the DensoContext common fields 
 * </p>
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15480 $
 */
public class ScreenInfoStackRequestProcessor extends AutowiringTilesRequestProcessor {
    /**
     * BeanUtilsBeanクラス
     * BeanUtilsBean class
     */
    private BeanUtilsBean beanUtils = null;

    /**
     * Resouceクラス
     * Resouce class
     */
    private Resource resource = null;

    /**
     * デフォルトコンストラクタ
     * Default constructor
     */
    public ScreenInfoStackRequestProcessor() {
        super();
    }

    /**
     * ActionForm構築処理
     * Process for building ActionForm
     * <P>
     * 各業務画面のActionが実行される前に、ActionFormの内容をDensoContext汎用エリアで保持している情報に変更する。<br/>
     * Update the ActionForm to the information of DensoContext common fields before processing the action class for each screen.<br/>
     * ActionFormの内容を変更後、親クラスのprocessPopulateメソッドを実行し、送信された情報をマージする。
     * After updating the ActionForm ,execute the processPopulate method of super class and merge the request information.
     * </P>
     * {@inheritDoc}
     *
     * @see org.apache.struts.action.RequestProcessor#processPopulate(javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse,
     *      org.apache.struts.action.ActionForm,
     *      org.apache.struts.action.ActionMapping)
     */
    protected void processPopulate(HttpServletRequest request, HttpServletResponse response,
        ActionForm form, ActionMapping mapping) throws ServletException {

        // アクションパスから画面IDを取得する。
        // Get screen ID from action path
        String screenId = getScreenId(mapping.getType());
        // サブミットを実行した画面の画面IDをリクエストパラメータから取得する。
        // Get screen ID which is submitted from request parameter
        String submittedScreenId = request.getParameter("submittedScreenId");
        // 戻るボタンによる画面遷移かどうかをチェック
        // Check if the back button was pressed
        Boolean back = Boolean.valueOf(request.getParameter("back"));

        WindowInfoDomain windowInfo = getWindowInfoDomain(request.getParameter("windowId"));

        if (null != windowInfo && !CheckUtil.isBlankOrNull(screenId)
                && form instanceof AbstractActionForm) {
            // 画面IDをFormとリクエストパラメータ(ウィンドウタイトル用)に設定する。
            // Set the screen ID to the form and request parameter
            ((AbstractActionForm)form).setScreenId(screenId);
            request.setAttribute("screenId", screenId);

            // ウィンドウ情報より、画面情報を取得
            // Get the screen information from window information
            Map<String, ScreenInfoDomain> screenInfo = windowInfo.getScreenInfo();
            // 画面情報内に、アクションパスから取得した画面IDに合致する情報が存在する場合、ActionFormの情報をDensoContext汎用エリアの情報で復元する。
            // If the screen ID exists in screen information, restore the DensoContext common field to ActionForm.
            // JavaScript関数「gscm.submitBack()」による「戻る」遷移または、自画面内遷移(検索処理など)の場合に限る。
            // Limited by transfer of Back which is executed at JavaScript method,gscm.submitBack(),or transfer at self screen like search process
            if (screenInfo.containsKey(screenId) && (back || screenId.equals(submittedScreenId))) {
                ScreenInfoDomain domain = (ScreenInfoDomain)screenInfo.get(screenId);
                ActionForm targetForm = (ActionForm)domain.getActionForm();
                try {
                    // スタックしている画面情報をディープコピーでActionFormにコピーする。
                    // Copy screen information stacked with deep copy to ActionForm
                    // シャローコピーは参照元のアドレスをコピーする為、
                    // ActionFormを変更するとスタックする/しない に関わらず、スタックしている画面情報も変わってしまう。
                    // Because shallow copy copys reference address,after change ActionForm,stacked screen information is changed neverthless stacked or not 
                    ActionForm targetFormDeepCopy = (ActionForm)SerializationUtils.clone(targetForm);
                    BeanUtils.copyProperties(form, targetFormDeepCopy);
                } catch (Exception e) {
                    throw new ServletException(e);
                }
            }
            // 画面IDスタック処理
            // Screen ID stack process
            // 画面IDをスタックするタイミングは、他画面へ遷移した時に行う。(自画面内遷移時、「戻る」遷移時はスタックしない)
            // Stack screen ID when transfer to other screen.Not stack screen id when transfer at self screen and transfer of "Back" 
            // 他画面遷移の判断は、アクションパスから取得する画面IDと他画面遷移をサブミットした画面の画面IDが違う時とする。
            // When screen ID  gotten from action path and screen id which is submitted to transfer of other screen are different,transfer to oher screen is done
            if (!back && !CheckUtil.isBlankOrNull(submittedScreenId) && !screenId.equals(submittedScreenId)) {
                List<String[]> screenIdList = windowInfo.getScreenIdList();
                // 画面IDと、「戻る」遷移時に利用するアクションパスを保持する。
                // Save the screen ID and the action path for using when the back button is pressed.
                String[] screenIdInfo = new String[] {submittedScreenId, request.getParameter(REQUEST_KEY_RETURN_ACTION)};
                // 遷移先の画面IDが、画面IDスタックリストに存在する場合、以下の処理を実施する。
                // When the transfer screen ID is exist at stack list,execute the follow process 
                if (existScreenId(screenIdList, screenId)) {
                    // 遷移先の画面IDまで削除処理を実施する。
                    // Delete screen ID until the transfer screen id
                    Iterator<String[]> ite = screenIdList.iterator();
                    while(ite.hasNext()) {
                        String wkScreenId = ite.next()[0];
                        // 画面IDスタックリストから、不要な画面IDを削除する。
                        // Delete unnecessary screen ID from screen id stack list
                        ite.remove();
                        // 画面IDスタックリストから削除した画面IDと紐付く、画面スタック情報を削除する。
                        // Delete screen stack information which is related to deleted screen ID from screen ID stack list
                        screenInfo.remove(wkScreenId);
                        // 遷移先の画面IDと同じ画面IDとなったタイミングで削除処理を終了する。
                        // End delete process when executing screen ID is equals to the transfer screen ID 
                        if (screenId.equals(wkScreenId)) {
                            break;
                        }
                    }
                }
                screenIdList.add(screenIdInfo);

                // 画面情報を保持する制限が設けられている場合は、以下の処理を実施する。
                // When it is limited to maintain screen information,execute the follow process
                // TM_RESOURCESテーブルより、キー値「maxScreenInfoStackCnt」にて画面情報の保持制限数を取得する。
                // Get the limited maintenance number of screen information from  TM_RESOURCES table with key value,'maxScreenInfoStackCnt'
                int maxScreenInfoStackCnt = 0;
                Resource resources = getResourceInstance();
                String resourceVal = resources.getResource("maxScreenInfoStackCnt");
                // TM_RESOURCESテーブルより取得した値をチェックし、半角数値以外は、保持制限を持たない状態とする。
                // Check the value gotten from TM_RESOURCES table,when the value is halfwidth numerical value,take limited maintenance
                if (CheckUtil.isNumeric(resourceVal)) {
                    maxScreenInfoStackCnt = Integer.parseInt(resourceVal);
                }
                // 画面IDスタックリストのサイズが保持制限数より多い場合、溢れた過去の画面IDを削除する。
                // If the size of screen ID stack list is more than the limited maintenance number,delete extra screen ID
                if (0 < maxScreenInfoStackCnt && maxScreenInfoStackCnt < screenIdList.size()) {
                    Iterator<String[]> ite = screenIdList.iterator();
                    while(ite.hasNext()) {
                        // 画面IDスタックリストの保持数が保持制限数と同じ場合、処理を終了する。
                        // If the maintenance number of screen ID stack list is equals to the limited maintenance number,end process
                        if (screenIdList.size() == maxScreenInfoStackCnt) {
                            break;
                        }
                        String wkScreenId = ite.next()[0];
                        // 保持制限数を超えた画面IDスタックリストの画面IDは、リストより削除する。
                        // Delete extra screen ID which is over the limited maintenance number from the list
                        ite.remove();
                        // 画面IDスタックリストから削除した画面IDと紐付く、画面スタック情報を削除する。
                        // Delete screen stack information associated to the screen ID which is deleted from screen ID stack list
                        screenInfo.remove(wkScreenId);
                    }
                }
                windowInfo.setScreenIdList(screenIdList);
            }
            // 他画面遷移の場合、呼び元画面IDを設定する。
            // If transfered from other screen,set source screen ID
            if (!screenId.equals(submittedScreenId)) {
                ((AbstractActionForm)form).setCallScreenId(submittedScreenId);
            }
        }

        // 「戻る」時は、親クラスのprocessPopulateは実行しない。
        // processPopulateを実行すると送信されてきた情報と合致するプロパティが存在すると
        // セッターメソッドによって値がセットされてしまう為。
        // If the back button is pressed, do not execute processPopulate of super class.
        // Because, if processPopulate is executed and property that matches the request information,
        // setter method sets the values.
        if (!back) {
            super.processPopulate(request, response, form, mapping);
        } else if (null != windowInfo && form instanceof AbstractActionForm) {
            // javaScript関数「gscm.submitBack()」を利用し、画面遷移した場合は、以下の処理を実施する。
            // Execute the follow process when transfer screen with javaScript function 'gscm.submitBack()'
            // リクエストパラメータに設定されているウィンドウIDをFormにセットする。
            // Set window id which is set at request argument to Form 
            AbstractActionForm abstractActionForm = (AbstractActionForm)form;
            abstractActionForm.setWindowId(request.getParameter("windowId"));

            Map<String, ScreenInfoDomain> screenInfo = windowInfo.getScreenInfo();
            List<String[]> screenIdList = windowInfo.getScreenIdList();
            // 画面IDスタックリスト内に、戻り先の画面IDが存在する場合のみ処理対象とする。
            // Only if screen ID of back exists at screen stack list,execute this process
            if (existScreenId(screenIdList, screenId)) {
                // 「戻る」遷移を実行した画面IDの画面スタック情報がある場合は、画面スタック情報を削除する。
                // If screen stack information of the screen ID,'Back' transfer,delete  screen stack information
                // 最後に遷移した画面は、画面IDスタックリストには保持されないが、
                // 遷移した画面がスタック対象の場合、保持した画面情報がゴミとして残らないようにする。
                // While the last transfer screen is not maintained at screen ID stack list,
                // if destination transfer screen is object to stack,delete maintained screen information
                if (screenInfo.containsKey(submittedScreenId)) {
                    screenInfo.remove(submittedScreenId);
                }
                // 画面IDスタックリストのリスト内容を、戻り先の画面IDまで削除するため、リストを逆順ソートする。
                // Sort list in reverse order for  deleting list content of screen ID stack list to screen ID of destination back 
                Collections.reverse(screenIdList);
                Iterator<String[]> ite = screenIdList.iterator();
                while(ite.hasNext()) {
                    String wkScreenId = ite.next()[0];
                    // 画面IDスタックリストから不要な画面IDを削除する。
                    // Delete unnecessary screen ID from screen ID stack list
                    ite.remove();
                    // 画面IDスタックリストから削除した画面IDと紐付く、画面スタック情報を削除する。
                    // Delete screen stack information which is related to deleted screen ID from screen ID stack list
                    screenInfo.remove(wkScreenId);
                    // 戻り先の画面IDと同じ画面IDとなったタイミングで削除処理を終了する。
                    // End delete process when executing screen ID is equals to the destination back screen ID 
                    if (screenId.equals(wkScreenId)) {
                        break;
                    }
                }
                // 画面IDスタックリストの並び順を元に戻す。
                // Return the order of screen ID stack list
                Collections.reverse(screenIdList);
            } else {
                // 戻り先に指定する画面IDが存在しない場合は、全てのスタック情報を削除する。
                // Delete all stack information if the screen ID which is specified at destination back does not exist
                // この条件に合致するパターンは、業務にて戻り先のアクションを指定し「戻る」遷移を行い、
                // 画面情報の保持制限数により戻り先の画面IDが画面IDスタックリストから無くなっている場合となる。
                // The pattern of matching this condition is that destination back screen ID is not exist because of limited maintenance of screen information. 
                // When upper case,specify action of destination back at the work and transfer 'Back'
                // 画面IDスタックリストを初期化する。
                // Initialize screen stack list
                screenIdList = new ArrayList<String[]>();
                windowInfo.setScreenIdList(screenIdList);
                // 画面スタック情報を初期化する。
                // Initialize screen stack information
                screenInfo = new HashMap<String, ScreenInfoDomain>();
                windowInfo.setScreenInfo(screenInfo);
            }

            String returnActionPath = "";
            if (0 < screenIdList.size()) {
                // 「戻る」時に実行するアクションパスを画面IDリストから取得する。
                //  Get the action path from screen ID list.(The action path when the back button is pressed.)
                returnActionPath = (screenIdList.get(screenIdList.size() - 1))[1];
            }
            ((AbstractActionForm)form).setReturnAction(returnActionPath);
        }
    }

    /**
     * 画面情報保持処理
     * Screen information saving process
     * <P>
     * 各業務画面のAction実行後、その画面のActionFormをDensoContext汎用エリアへ保持する。
     * Save the ActionForm into DensoContext common fields after executing action class for each screen.
     * </P>
     * {@inheritDoc}
     *
     * @see org.apache.struts.action.RequestProcessor#processActionPerform(javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse,
     *      org.apache.struts.action.Action,
     *      org.apache.struts.action.ActionForm,
     *      org.apache.struts.action.ActionMapping)
     */
    protected ActionForward processActionPerform(HttpServletRequest request,
        HttpServletResponse response, Action action, ActionForm form, ActionMapping mapping)
        throws IOException, ServletException {

        // 業務画面のアクション処理を実施する。
        // Execute action process of work screen
        ActionForward forward = super
            .processActionPerform(request, response, action, form, mapping);
        
        if (form instanceof AbstractActionForm) {
            // 画面情報をスタックするかどうかの判定情報を取得する。
            // Get the information if screen ID stack or not.
            boolean stackScreenInfoFlg = ((AbstractActionForm)form).isStackScreenInfoFlg();

            if (stackScreenInfoFlg) {
                String screenId = getScreenId(mapping.getType());

                WindowInfoDomain windowInfo = getWindowInfoDomain(((AbstractActionForm)form).getWindowId());

                if (null != windowInfo && !CheckUtil.isBlankOrNull(screenId)) {
                    Map<String, ScreenInfoDomain> screenInfo = windowInfo.getScreenInfo();
                    ActionForm saveForm = RequestUtils.createActionForm(mapping.getModuleConfig()
                            .findFormBeanConfig(mapping.getName()), super.servlet);
                    try {
                        // TM_RESOURCESテーブルより、スタック除外プロパティ名群を取得するために使用するActionFormクラス名を取得する。
                        // Get ActionForm class name for getting stack except property name from TM_RESOURCES table
                        String formName = form.getClass().getName();
                        // パッケージは除き、ActionFormクラス名のみとする。
                        // Set only ActionForm class name except package
                        formName = formName.substring(formName.lastIndexOf(".") + 1);
                        // スタックする情報を作成する。
                        // Create information for stack
                        createStackObject(form.getClass(), saveForm, form, screenId, formName, "");
                    } catch (Exception e) {
                        throw new ServletException(e);
                    }
                    ScreenInfoDomain screenInfoDomain = null;
                    if (screenInfo.containsKey(screenId)) {
                        screenInfoDomain = screenInfo.get(screenId);
                        screenInfoDomain.setActionForm(saveForm);
                    } else {
                        screenInfoDomain = new ScreenInfoDomain(saveForm);
                    }
                    screenInfo.put(screenId, screenInfoDomain);
                }
            }

            // PageInfo情報がある場合、リクエストに設定する。
            // In case of the PageInfo is not null ,set the PageInfo to request.
            PageInfo pageInfo = ((AbstractActionForm)form).getPageInfo();
            if (null != pageInfo) {
                ActionPageInfoCreator.storePageInfoToRequest(pageInfo, request);
            }
        }

        return forward;
    }

    /**
     * 画面ID取得
     * Get the screen ID
     * <p>
     * アクションパスから画面IDを抽出し返却する。
     * Get the screen ID from action path
     * </p>
     *
     * @param mappingType アクションパス
     * @param mappingType Action path
     * @return 画面ID
     * @return Screen ID
     */
    private String getScreenId(String mappingType) {
        if (CheckUtil.isBlankOrNull(mappingType)) {
            return null;
        }
        return (mappingType.substring(mappingType.lastIndexOf(".") + 1)).substring(0, 5).toUpperCase();
    }

    /**
     * ウィンドウ情報取得
     * Get the window information
     * <p>
     * DensoContextよりパラメータのWindowIdに該当するウィンドウ情報を取得する。
     * Get the window information corresponding to the parameters of WindowId from DensoContext.
     * </p>
     *
     * @param windowId ウィンドウID
     * @param windowId Window ID
     * @return ウィンドウ情報
     * @return Window information
     */
    private WindowInfoDomain getWindowInfoDomain(String windowId) {
        if (CheckUtil.isBlankOrNull(windowId)) {
            return null;
        }
        return (WindowInfoDomain)DensoContext.get().getGeneralArea(windowId);
    }

    /**
     * スタック情報作成
     * Create stack information
     * <P>
     * スタックする情報を作成する。<br/>
     * Create stack information
     * TM_RESOURCESテーブルに定義する、スタック除外プロパティは、スタック対象外とする。
     * Property excempt from stack defined at TM_RESOURCES table is not as stack object
     * </P>
     * @param stackObjectClass スタック対象クラス
     * @param stackObjectClass Stack object class
     * @param resultObject 処理結果オブジェクト
     * @param resultObject Result object
     * @param stackObject スタック対象オブジェクト
     * @param stackObject Stack object
     * @param screenId 画面ID
     * @param screenId Screen ID
     * @param formName ActionFormクラス名
     * @param formName ActionForm class name
     * @param propertyPrefix プロパティの接頭辞
     * @param propertyPrefix Property prefix
     * @throws ServletException ServletException
     * @throws ServletException ServletException
     */
    @SuppressWarnings("unchecked")
    private void createStackObject(Class stackObjectClass,
                                   Object resultObject,
                                   Object stackObject,
                                   String screenId,
                                   String formName,
                                   String propertyPrefix) throws ServletException {
        // 本メソッドが処理対象とするパッケージは「com.globaldenso.」から始まるクラスとする。
        // Object package of this method is the class which starts at "com.globaldenso."
        // 「java.lang」パッケージ等のクラスは処理対象外とする。
        // Class such as "java.lang" package is exempt from process
        String targetPagckage = "com.globaldenso.";

        // 処理結果オブジェクトがnullの場合、処理を抜ける。
        // If the result object is null,exit function
        if (null == resultObject) {
            return;
        }

        // 処理対象外クラスの場合、処理を抜ける。
        // If the class is exempt,exit function
        if (!stackObjectClass.getName().startsWith(targetPagckage)) {
            return;
        }

        // 親クラスの取得
        // Get parent class
        Class superClass = stackObjectClass.getSuperclass();
        if (null != superClass) {
            // 親クラスが存在する場合、親クラス内のプロパティもスタック情報作成の対象とする。
            // If parent class exists,property at parent class is object of stack information,too
            createStackObject(superClass, resultObject, stackObject, screenId, formName, propertyPrefix);
        }

        // スタック除外プロパティ名を取得する。
        // Get property name exempt from stack
        String[] notStackProperties = getNotStackPropertyNames(screenId, formName);

        BeanUtilsBean beanUtils = getBeanUtilsBeanIncetance();

        // スタック対象オブジェクトのプロパティ情報を取得する。
        // Get property information of stack object
        Field[] fields = stackObjectClass.getDeclaredFields();

        PropertyDescriptor propDesc = null;
        for (Field field : fields) {
            // プロパティ名を取得する。
            // Get property name
            String propertyName = field.getName();
            // 対象プロパティのクラス名を取得する。
            // Get class name of object property
            String propertyClassName = field.getType().getName();

            // スタック除外対象のプロパティであるか判定する。
            // Check whether property is stack object or not
            if (isNotStackTargetProperty(notStackProperties, propertyPrefix + propertyName)) {
                continue;
            }

            try {
                if (propertyClassName.startsWith(targetPagckage)) {
                    // 対象パッケージ下にあるクラスを処理対象とする。
                    // Class beneath object package is object process
                    // 対象プロパティ名を利用し、PropertyDescriptorをインスタンス化する。
                    // Instantiate PropertyDescriptor with object property name
                    propDesc = new PropertyDescriptor(propertyName, stackObject.getClass());
                    // 対象プロパティのGetterメソッドを作成する。
                    // Create Getter method of object property
                    Method orgMethod = propDesc.getReadMethod();
                    // 対象プロパティのGetterメソッドを利用し、スタック対象のオブジェクトを取得する。
                    // Get stack object with Getter method of object property
                    Object orgObj = orgMethod.invoke(stackObject, (Object[])null);
                    if (null != orgObj) {
                        // スタック対象オブジェクトと同じクラスとなる、スタック用のオブジェクトを作成する。
                        // Create object for stack which is same class as stack object
                        Object destObj = orgObj.getClass().newInstance();

                        // 階層的に持つ、プロパティ用に接頭辞を作成する。
                        // Create prefix for hierarchical property
                        // TM_RESOUCESテーブルには、上位階層のプロパティ名 + "." + 下位階層のプロパティ名の持ち方で、スタック除外プロパティ名は指定される。
                        // Property name exempt stack is specified as upper-hierarchical property name + "." + under-hierarchical at TM_RESOUCES table
                        String prefix = propertyPrefix + propertyName + ".";
                        // 対象プロパティのSetterメソッドを作成する。
                        // Create Setter method of object property
                        Method destSetterMethod = propDesc.getWriteMethod();
                        // 対象プロパティのSetterメソッドを利用し、引数の処理結果オブジェクトに作成した、スタック用オブジェクトを設定する。
                        // Set object for stack created at process result object of argument with Setter method of object property
                        // このタイミングでは、まだ、スタック用オブジェクトの中身は空となっている。
                        // At this time,object for stack is empty
                        destSetterMethod.invoke(resultObject, destObj);

                        // 作成したスタック用オブジェクトに、取得したスタック対象プロパティの内容を利用しスタック情報を作成する。
                        // For created object for stack,create stack information with content of stack object property
                        createStackObject(orgObj.getClass(), destObj, orgObj, screenId, formName, prefix);
                    }
                    continue;
                } else {
                    // Listインタフェース、Mapインタフェースを実装しているクラスを処理対象とする。
                    // Make class which implements List Interface and Map Interface object for process
                    // 階層的に持つ、プロパティ用に接頭辞を作成する。
                    // Create prefix for hierarchical property
                    String prefix = propertyPrefix + propertyName + ".";
                    // Privateプロパティへのアクセスを可能にする。
                    // Enable access to Private property
                    field.setAccessible(true);
                    // スタック対象オブジェクトを取得する。
                    // Get stack object
                    Object obj = field.get(stackObject);
                    if (obj instanceof List) {
                        // Listインタフェース実装時
                        // At List Interface implement
                        List<?> orgList = (List<?>)obj;
                        // スタック対象Listオブジェクトと同じクラスとなる、スタック用のListオブジェクトを作成する。
                        // Create object for stack which is same class as stack object
                        List destList = (List)obj.getClass().newInstance();
                        for (Object getObj : orgList) {
                            // スタック対象のListオブジェクト内で保持しているオブジェクトと同じクラスとなる、スタック用のオブジェクトを作成する。
                            // Create object for stack which is same class as maintained object at List object of stack object
                            Object destObj = getObj.getClass().newInstance();
                            if (destObj.getClass().getName().startsWith(targetPagckage)) {
                                // 対象パッケージ下にあるクラスを処理対象とする。
                                // Make class beneath object package process object
                                // 作成したスタック用オブジェクトに、取得したスタック対象オブジェクトの内容を利用しスタック情報を作成する。
                                // For created object for stack,create stack information with content of stack object
                                createStackObject(getObj.getClass(), destObj, getObj, screenId, formName, prefix);
                            } else {
                                // 対象パッケージ下にないクラスは、単純移送とする。
                                // Class which does not exist beneath object package transfer simply 
                                destObj = getObj;
                            }
                            // スタック用のListオブジェクトに、スタック用オブジェクトを設定する。
                            // Set object for stack at List object for stack
                            destList.add(destObj);
                        }
                        // 対象プロパティ名を利用し、PropertyDescriptorをインスタンス化する。
                        // Instantiate PropertyDescriptor with object property name
                        propDesc = new PropertyDescriptor(propertyName, resultObject.getClass());
                        // 対象プロパティのSetterメソッドを作成する。
                        // Create Setter method of object property
                        Method destSetterMethod = propDesc.getWriteMethod();
                        // 対象プロパティのSetterメソッドを利用し、引数の処理結果オブジェクトに作成した、スタック用オブジェクトListを設定する。
                        // Set object List for stack created at process result object of argument with Setter method of object property
                        destSetterMethod.invoke(resultObject, destList);
                        continue;
                    } else if (obj instanceof Map) {
                        // Mapインタフェース実装時
                        // At Map Interface implement
                        Map<?, ?> orgMap = (Map<?, ?>)obj;
                        // スタック対象Mapオブジェクトと同じクラスとなる、スタック用のMapオブジェクトを作成する。
                        // Create Map object for stack which is same class as stack object Map
                        Map destMap = (Map)obj.getClass().newInstance();
                        for(Map.Entry ent : orgMap.entrySet()) {
                            // スタック対象のMapオブジェクト内で保持しているオブジェクトと同じクラスとなる、スタック用のオブジェクトを作成する。
                            // Create Map object for stack which is same class as maintained object at Map object of stack object
                            Object destObj = ent.getValue().getClass().newInstance();
                            if (destObj.getClass().getName().startsWith(targetPagckage)) {
                                // 対象パッケージ下にあるクラスを処理対象とする。
                                // Make class beneath object package process object
                                // 作成したスタック用オブジェクトに、取得したスタック対象オブジェクトの内容を利用しスタック情報を作成する。
                                // For created object for stack,create stack information with content of stack object
                                createStackObject(ent.getValue().getClass(), destObj, ent.getValue(), screenId, formName, prefix);
                            } else {
                                // 対象パッケージ下にないクラスは、単純移送とする。
                                // Class which does not exist beneath object package transfer simply 
                                destObj = ent.getValue();
                            }
                            // スタック用のMapオブジェクトに、スタック用オブジェクトを設定する。
                            // Set object for stack at Map object for stack
                            Object key = ent.getKey();
                            destMap.put(key, destObj);
                        }
                        // 対象プロパティ名を利用し、PropertyDescriptorをインスタンス化する。
                        // Instantiate PropertyDescriptor with object property name
                        propDesc = new PropertyDescriptor(propertyName, resultObject.getClass());
                        // 対象プロパティのSetterメソッドを作成する。
                        // Create Setter method of object property
                        Method destSetterMethod = propDesc.getWriteMethod();
                        // 対象プロパティのSetterメソッドを利用し、引数の処理結果オブジェクトに作成した、スタック用オブジェクトMapを設定する。
                        // Set object Map for stack created at process result object of argument with Setter method of object property
                        destSetterMethod.invoke(resultObject, destMap);
                        continue;
                    }
                }
                // 対象パッケージ下にないクラス、Listインタフェース、Mapインタフェースを実装していないクラスは、以下の処理を実施する。
                // Class which does not exist beneath object package or does not implement List and Map Interface does follow process
                propDesc = new PropertyDescriptor(propertyName, stackObject.getClass());
                // 対象プロパティのGetterメソッドを作成する。
                // Create Getter method of object property
                Method getterMethod = propDesc.getReadMethod();
                // BeanUtils#copyPropertyを利用し、スタック対象オブジェクトの内容をスタック用オブジェクトにコピーする。
                // Copy content of stack object to object for stack with BeanUtils#copyProperty
                beanUtils.copyProperty(resultObject, propertyName, getterMethod.invoke(stackObject, (Object[])null));
            } catch (SecurityException e) {
                // セキュリティ違反の場合は、ServletException例外をスローする。
                // Throw ServletException at security breach
                throw new ServletException (e);
            } catch (IllegalAccessException e) {
                // スタック用オブジェクトのインスタンス化できなかった場合は、エラーとはせず無視する。
                // When IllegalAccessException occurs,not make it error and continue
                continue;
            } catch (InvocationTargetException e) {
                // 対象プロパティのSetter/Getterにて発生する例外は、エラーとはせず無視する。
                // When exception occurs at Setter/Getter of object property,not make it error and continue
                continue;
            } catch (InstantiationException e) {
                // スタック用オブジェクトのインスタンス化できなかった場合は、エラーとはせず無視する。
                // When not instantiate object for stack,not make it error and continue
                // com.globaldenso.gscm.framework.presentation.ActionPageInfoCreatorはインスタンス化出来ないがエラーには出来ないので無視する。
                // it is impossible to instantiate com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator, but continue becasuse not enable it error
                continue;
            } catch (IntrospectionException e) {
                // 対象プロパティ名をClassオブジェクトにマッピング出来なかった場合は、エラーとはせず無視する。
                // When not make object property name mapping to Class object,not make it error and continue
                // プロパティのみ存在し、そのプロパティへのアクセッサが存在しない場合など。(例：serialVersionUID)
                // Only propert exists and there is no access to the property(Example:serialVersionUID)
                continue;
            }
        }
    }

    /**
     * スタック除外プロパティ名取得
     * Get property name exempt from stack
     * <P>
     * TM_RESOURCESより、スタック除外プロパティ名の取得を行う。
     * Get property name exempt from stack from TM_RESOURCES
     * </P>
     * @param screenId 画面ID
     * @param screenId Screen ID
     * @param formName ActionFormクラス名
     * @param formName ActioinForm class name
     * @return スタック除外プロパティ名群
     * @return Names exempt from stack 
     */
    private String[] getNotStackPropertyNames(String screenId, String formName) {
        String[] result = null;

        // Resourceクラスのインスタンス取得
        // Get instance of Resource class
        Resource resources = getResourceInstance();

        // 画面IDとActionFormクラス名のみでResourceを検索する。
        // Search Resource with only screen ID and ActionForm class name
        String value = resources.getResource(String.format("%s.%s", screenId, formName));

        if (CheckUtil.isBlankOrNull(value)) {
            // 画面IDとActionFormクラス名で作成したキー情報がTM_RESOURCESに存在しない場合、以下の処理を行う。
            // If key information created with screen ID and ActionForm class name does not exist at TM_RESOURCES,do follow process
            List<String> resultList = new ArrayList<String>();
            // 画面ID、ActionFormクラス名、連番(1～5)にてResourceを再検索する。
            // Re-search with screen ID,ActionForm class name and sequence number(from 1 to 5)
            for (int i = 1; i < 6; i++) {
                value = resources.getResource(String.format("%s.%s_%d", screenId, formName, i));
                if (!CheckUtil.isBlankOrNull(value)) {
                    // 連番付きのキー情報で取得できた内容を","(半角カンマ)で分割しArrayListへ設定する。
                    // Split content gotten by key information with sequence number with ","(halfwidth comma) and set to ArrayList
                    resultList.addAll(Arrays.asList(value.split(",")));
                }
            }
            if (null != resultList) {
                // 連番付きのキー情報でスタック除外プロパティ名が取得できた場合は、String配列に変換する。
                // If get property name exempt from stack by key information with sequence number,convert to String array
                result = (String[])resultList.toArray(new String[]{});
            }
        } else {
            // 画面IDとActionFormクラス名で作成したキー情報がTM_RESOURCESに存在する場合、取得した値を","(半角カンマ)で分割する。
            // If key information created by screen ID and ActionForm class name exists,split gotten value with ","(halfwidth comma)
            result = value.split(",");
        }

        return result;
    }

    /**
     * スタック除外対象判定処理
     * Process for checking object exept from stack
     * 
     * <P>
     * スタック除外対象のプロパティであるかどうかの反映を行う。
     * Check whether property is exempt from stack or not
     * </P>
     * @param notStackPropertyNames スタック除外プロパティ名群
     * @param notStackPropertyNames Property names exempt from stack
     * @param checkPropertyName チェック対象プロパティ名
     * @param checkPropertyName Checking property name
     * @return 判定結果(true:スタック除外プロパティ false:スタック対象プロパティ)
     * @return Checking result(true:propert exempt from stack false:property of stack object)
     */
    private boolean isNotStackTargetProperty(String[] notStackPropertyNames, String checkPropertyName) {
        boolean result = false;
        // 引数のスタック除外プロパティ名群が存在する場合、スタック除外対象判定処理を実施する。
        // If property names exempt from stack of argument exists,do process for checking object exept from stack
        if (null != notStackPropertyNames && 0 < notStackPropertyNames.length) {
            for (String notStackPropertyName : notStackPropertyNames) {
                // 引数のチェック対象プロパティ名とスタック除外プロパティ名が一致する場合、スタック除外プロパティとする。
                // If Check property name of argument is consistent with property name exempt from stack,make checking property name of argument property exempt from stack
                if (!CheckUtil.isBlankOrNull(notStackPropertyName) && notStackPropertyName.equals(checkPropertyName)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * BeanUtilsBeanインスタンス取得
     * Get BeanUtilsBean Instance
     * @return BeanUtilsBeanのインスタンス
     * @return Instance of BeanUtilsBean
     */
    private BeanUtilsBean getBeanUtilsBeanIncetance() {
        if (null == beanUtils) {
            beanUtils = new BeanUtilsBean();
            beanUtils.getConvertUtils().register(new DateConverter(null), Date.class);
            beanUtils.getConvertUtils().register(new SqlTimestampConverter(null), Timestamp.class);
            beanUtils.getConvertUtils().register(new BigDecimalConverter(null), BigDecimal.class);
        }
        return beanUtils;
    }

    /**
     * Resourceインスタンス取得
     * Get Resource Instance
     *
     * @return Resourceのインスタンス
     * @return Instance of Resource
     */
    private Resource getResourceInstance() {
        // Resourceクラスのインスタンス化(シングルトン)
        // Instinate Resource class(Singleton)
        if (null == resource) {
            resource = new Resource();
        }
        return resource;
    }

    /**
     * 画面ID存在チェック
     * Check Screen ID existance
     * <p>
     * 画面IDスタックリスト内に、指定する画面IDが存在するか確認を行う。
     * Check whether specified Screen ID exists at Screen ID Stack List or not
     * </p>
     *
     * @param screenIdList 画面IDスタックリスト
     * @param scrrenIdList Screen ID Stack List
     * @param screenId 画面ID
     * @param screenId Screen ID
     * @return 判定結果(true:画面ID有り false:画面ID無し)
     * @return Checking result(true:Screen ID exists false:Screen ID does not exist)
     */
    private boolean existScreenId(List<String[]> screenIdList, String screenId) {
        boolean existScreenId = false;
        for (String[] wkScreenIdInfo : screenIdList) {
            if (screenId.equals(wkScreenIdInfo[0])) {
                existScreenId = true;
                break;
            }
        }
        return existScreenId;
    }
}
