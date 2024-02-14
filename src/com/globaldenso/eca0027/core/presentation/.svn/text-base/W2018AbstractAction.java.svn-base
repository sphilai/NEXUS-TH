/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2018;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2018ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of Multiple Item No. in 1Box PKG Detail
 * <br />小箱内多品番梱包PKG Info Detail画面の基底アクションクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class W2018AbstractAction extends AbstractAction {

    /**
     * constructor.
     */
    public W2018AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Acquisition of a screen common information
     *       A screen common items (LANGUAGE CODE) is set to action form.
     * 
     * 
     * - 画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Get screen common items
        // 画面共通項目の取得
        W2018ActionForm w2018Form = (W2018ActionForm) form;
        
        // Get screen common items
        // 画面共通項目の取得
        setCommonInfo(w2018Form);
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
     * 
     * 
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {
        
        W2018ActionForm w2018Form = (W2018ActionForm) form;
        
        // Display control
        // 表示制御
        controlDisplay(request, w2018Form);
        
        ((W2018ActionForm) form).setCallScreenId(SCREEN_ID_W2018);
    }
    
    /**
     *    The item of a screen common information is set to action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action form<br />アクション・フォーム
     */
    protected void setCommonInfo(W2018ActionForm form) {
        // Acquisition of a screen-common-information domain
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // Set LANGUAGE CODE
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
        
        // The display control of list area is initialized.
        // 一覧エリアの表示制御を初期化
        form.setDisplayList(true);
    }
    
    /**
     *    Display control of a Multiple Item No. in 1Box PKG Detail screen is performed.
     * <br />小箱内多品Detail画面の表示制御を行います。
     * @param request Request<br />リクエスト
     * @param form Action form of a Multiple Item No. in 1Box PKG Detail screen<br />小箱内多品Detail画面のアクション・フォーム
     */
    protected void controlDisplay(HttpServletRequest request, W2018ActionForm form) {

        List<String> disableList = new ArrayList<String>();

        // When there is Session (W2008.Mix Tag No.), it changes from a Main Screen.
        // Session(W2008.Mix Tag No.)がある場合、Main Screen画面からの遷移
        if (!CheckUtil.isBlankOrNull(form.getW2018CriteriaDomain().getMixTagNo())) {

            disableList.add("delete");
            disableList.add("save");
            List<? extends W2018ListDomain> listDomainList = form.getListDomainList();
            if (!CollectionUtils.isEmpty(listDomainList)) {
                for (int i = 0; i < listDomainList.size(); i++) {
                    disableList.add(String.format("listDomainList[%d].selected", i));
                    disableList.add(String.format("listDomainList[%d].pkgItemNo", i));
                    disableList.add(String.format("select[%d]", i));
                    disableList.add(String.format("listDomainList[%d].qty", i));
                }
            }
        }else{
            
            // Set screen field and button attributes.
            // 活性制御
            List<? extends W2018ListDomain> listDomainList = form.getListDomainList();
            
            if (!CollectionUtils.isEmpty(listDomainList)) {
                // Non-activity of a Delete button
                // Deleteボタンの非活性
                if(FLAG_Y .equals(listDomainList.get(0).getDeleteBtDisabledFlg())){
                    disableList.add("delete");
                }
                for (int i = 0; i < listDomainList.size(); i++) {

                    W2018ListDomain listDomain = listDomainList.get(i);

                    if (FLAG_Y.equals(listDomain.getDisabledFlg()) 
                        || (CheckUtil.isBlankOrNull(listDomain.getPkgItemNo()) 
                            && CheckUtil.isBlankOrNull(listDomain.getQty()))) {
                        disableList.add(String.format("listDomainList[%d].selected", i));
                    }
                    
                    if(CheckUtil.isBlankOrNull(listDomain.getPkgItemNo()) 
                        && CheckUtil.isBlankOrNull(listDomain.getQty())) {
                        listDomain.setModelCd("");
                    }

                }
            }
        }

        // Setting of an un-active item
        // 非活性項目の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableList);
    }
    
    /**
     *    The specified message is added as {@link ActionMessages#GLOBAL_MESSAGE}.
     * <br />指定されたメッセージを{@link ActionMessages#GLOBAL_MESSAGE}として追加します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param messageId MESSAGE ID<br />メッセージID
     * @param args Message argument<br />メッセージ引数
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, Object... args) {
        // Addition of a message
        // メッセージの追加
        ActionMessages messages = getMessages(request);
        messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, args));
        
        // Registration of GLOBAL_MESSAGE
        // GLOBAL_MESSAGEの登録
        addMessages(request, messages);
    }
}
