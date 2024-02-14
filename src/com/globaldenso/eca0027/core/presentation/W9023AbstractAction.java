/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_INVOICE_CLASS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_INV_CTGY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_CLASS_OF_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CD_TYPE_INV_CTGRY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_FULL_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9022R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PULLDOWN_DISP_TYPE_CODE_VALUE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9023;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.upload.FormFile;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * Base action class of the Invoice Template MA Edit screen.
 * <br />Invoice Template MA Edit画面の基底アクションクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11048 $
 */
public abstract class W9023AbstractAction extends AbstractAction {
    
    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /** 
     * common services
     * <br />共通サービス
     */
    protected CommonService commonService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9023AbstractAction() {
        super();
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Acquisition of common screen information
     *     Set the screen common items (language code) in Action Form
     * ‐Acquisition of the pull-down list
     *     Call CommonService.searchPullDownList () for argument classification values:
     *         ‐Transport
     *         ‐containerLoose classification
     *         ‐Freight Res. Cd
     *         ‐Vessel product performance Status
     *         ‐Flag
     *     then, set them in the request attribute pull-down list obtained
     * 
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * ‐プルダウンリストの取得
     *     次の区分値を引数にCommonService.searchPullDownList()を呼び出す
     *         ‐輸送手段
     *         ‐コンテナルーズ区分
     *         ‐運賃支払いコード
     *         ‐船積実績ステータス
     *         ‐フラグ
     *     取得したプルダウンリストをリクエスト属性に設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W9023ActionForm w9023Form = (W9023ActionForm) form;
        
        // Get of common entry screen.
        // 画面共通項目の取得
        setCommonInfo(w9023Form);
        
        // Setting of the pull-down list.
        // プルダウンリストの設定
        searchPullDownList(request, w9023Form.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Specification of transition original screen ID
     *     Set the transition source screen ID in Action Form
     * 
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request
        , HttpServletResponse response, String forwardName) {
        
        W9023ActionForm w9023Form = (W9023ActionForm) form;
        
        // Display control of the Main screen.
        // Main画面の表示制御
        controlDisplay(w9023Form, request);
        
        w9023Form.setCallScreenId(SCREEN_ID_W9023);
        
        resetFileData(w9023Form);
    }
    
    /**
     * Set the items in the common information screen in the action form.
     * <br />アクション・フォームに画面共通情報の項目を設定します。
     *
     * @param form Action Form <br />アクション・フォーム
     */
    protected void setCommonInfo(W9023ActionForm form) {
        
        // Get of screen common information domain.
        // 画面共通情報ドメインの取得
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        // setting the language code.
        // 言語コードの設定
        form.setLanguageCd(commonInfo.getLanguageCd());
    }
    
    /**
     * Get a pull-down list to be displayed on the screen.
     * <br />画面に表示するプルダウンリストを取得します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param langCd Language code <br />言語コード
     * @throws ApplicationException can not get a pull-down list <br />プルダウンリストを取得できない場合
     */
    protected void searchPullDownList(HttpServletRequest request, String langCd) throws ApplicationException {
        
        // Acquisition of each pull-down list.
        // 各プルダウンリストの取得
        List<? extends SelectListItemDomain> invCategoryList 
            = commonService.searchPullDownList(CD_TYPE_INV_CTGRY, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        List<? extends SelectListItemDomain> tmpClassOfInvoiceList 
            = commonService.searchPullDownList(CD_CLASS_OF_INVOICE, langCd, PULLDOWN_DISP_TYPE_CODE_VALUE, true);
        
        // Pull-down list of data Class of Invoice only FRT and Main.
        // Class of InvoiceのプルダウンリストデータはMainとFRTのみ
        List<SelectListItemDomain> classOfInvoiceList = new ArrayList<SelectListItemDomain>();
        classOfInvoiceList.add(new SelectListItemDomain());
        for (SelectListItemDomain domain : tmpClassOfInvoiceList) {
            if (INVOICE_CLASS_MAIN.equals(domain.getId()) 
                || INVOICE_CLASS_FULL_RT.equals(domain.getId())) {
                classOfInvoiceList.add(domain);
            }
        }
        
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_INV_CTGY, invCategoryList);
        request.setAttribute(ATTR_INVOICE_CLASS, classOfInvoiceList);
    }
    
    /**
     * Make the screen display control.
     * <br />画面表示制御を行います。
     * <pre>
     * - If W9016B authority or W9016R authority there are no such
     *     Inactive the Register button
     *  
     * - W9016R権限またはW9016B権限が1つもない場合
     *     Registerボタンを非活性
     * </pre>
     * 
     * @param form Action Form <br />アクションフォーム
     * @param request HTTP request <br />HTTPリクエスト
     */
    protected void controlDisplay(W9023ActionForm form, HttpServletRequest request) {
        
        List<String> disableElementList = new ArrayList<String>();
        
        if (MODE_NEW.equals(form.getProcMode())) {
            // New mode.
            disableElementList.add("printSample");
        } else if (MODE_EDIT.equals(form.getProcMode())) {
            // Edit mode.
            disableElementList.add("w9023CriteriaDomain.invoiceCtgry");
            disableElementList.add("w9023CriteriaDomain.invoiceClass");
        } else {
            // Reference mode.
            disableElementList.add("register");
            disableElementList.add("master1");
            disableElementList.add("w9023CriteriaDomain.master2");
            disableElementList.add("w9023CriteriaDomain.master3");
            disableElementList.add("w9023CriteriaDomain.master4");
            disableElementList.add("master5");
            disableElementList.add("w9023CriteriaDomain.m5Delete");
            disableElementList.add("master6");
            disableElementList.add("w9023CriteriaDomain.master7");
            disableElementList.add("w9023CriteriaDomain.master8");
            disableElementList.add("master9");
            disableElementList.add("w9023CriteriaDomain.m9Delete");
            disableElementList.add("w9023CriteriaDomain.master10");
            disableElementList.add("w9023CriteriaDomain.master11");
            disableElementList.add("master12");
            disableElementList.add("w9023CriteriaDomain.m12Delete");
            disableElementList.add("master13");
            disableElementList.add("w9023CriteriaDomain.m13Delete");
            disableElementList.add("w9023CriteriaDomain.invoiceCtgry");
            disableElementList.add("w9023CriteriaDomain.invoiceClass");
        }
        // Setting request attributes.
        // リクエスト属性の設定
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);
    }
    
    /**
     * Return the availability of the Register button. <br />
     * Registerボタンの利用可否を返します。
     * 
     * @return True:get one more privileges of W9022R, false:other 
     *         <br />
     *         W9022Rの権限が1つ以上あればtrue、そうでなければfalse
     */
    protected boolean enableRegister() {
        return !userAuthService.getUserAuthList(PERMIT_FUNC_ID_W9022R).isEmpty();
    }
    
    /**
     * Add the specified message to {@link ActionMessages#GLOBAL_MESSAGE}.
     * 
     * @param request HTTP request
     * @param messageId MESSAGE ID
     * @param createCount Number of create count.
     * @param updateCount Number of update count.
     */
    protected void addGlobalMessage(HttpServletRequest request, String messageId, int createCount, int updateCount) {
        // Add Message
        ActionMessages messages = getMessages(request);
        
        if (createCount > 0) {
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, createCount));
        }
        if (updateCount > 0) {
            messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(messageId, updateCount));
        }
        // Register GLOBAL_MESSAGE
        addMessages(request, messages);
    }
    
    /**
     * 
     * reset file data setting.
     * 
     * @param form W6002 Action form
     */
    protected void resetFileData(W9023ActionForm form) {

        W9023CriteriaDomain criteriaDomain = form.getW9023CriteriaDomain();
        try {
            if (criteriaDomain.getMaster1FileStream() != null) {
                criteriaDomain.getMaster1FileStream().close();
                criteriaDomain.setMaster1FileStream(null);
                criteriaDomain.setMaster1FileSize(0);
                criteriaDomain.setMaster1(null);
            }
            if (criteriaDomain.getMaster5FileStream() != null) {
                criteriaDomain.getMaster5FileStream().close();
                criteriaDomain.setMaster5FileStream(null);
                criteriaDomain.setMaster5FileSize(0);
                criteriaDomain.setMaster5(null);
            }
            if (criteriaDomain.getMaster6FileStream() != null) {
                criteriaDomain.getMaster6FileStream().close();
                criteriaDomain.setMaster6FileStream(null);
                criteriaDomain.setMaster6FileSize(0);
                criteriaDomain.setMaster6(null);
            }
            if (criteriaDomain.getMaster9FileStream() != null) {
                criteriaDomain.getMaster9FileStream().close();
                criteriaDomain.setMaster9FileStream(null);
                criteriaDomain.setMaster9FileSize(0);
                criteriaDomain.setMaster9(null);
            }
            if (criteriaDomain.getMaster12FileStream() != null) {
                criteriaDomain.getMaster12FileStream().close();
                criteriaDomain.setMaster12FileStream(null);
                criteriaDomain.setMaster12FileSize(0);
                criteriaDomain.setMaster12(null);
            }
            if (criteriaDomain.getMaster13FileStream() != null) {
                criteriaDomain.getMaster13FileStream().close();
                criteriaDomain.setMaster13FileStream(null);
                criteriaDomain.setMaster13FileSize(0);
                criteriaDomain.setMaster13(null);
            }
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001); 
        } finally {
            // FormFileの削除を追加
            boolean hasErr = false;
            hasErr = destroyFormFile(form.getMaster1());
            hasErr = destroyFormFile(form.getMaster5());
            hasErr = destroyFormFile(form.getMaster6());
            hasErr = destroyFormFile(form.getMaster9());
            hasErr = destroyFormFile(form.getMaster12());
            hasErr = destroyFormFile(form.getMaster13());
            form.setMaster1(null);
            form.setMaster5(null);
            form.setMaster6(null);
            form.setMaster9(null);
            form.setMaster12(null);
            form.setMaster13(null);
            if (hasErr) {
                throw new SystemException(NXS_91_0001);
            }
        }
    }

    /**
     * Destroy temporary file.
     *
     * @param f FormFile object.
     * @return result If an error occurs return true, otherwise false.
     */
    private boolean destroyFormFile(FormFile f) {
        boolean hasErr = false;
        if (f != null) {
            InputStream in;
            try {
                in = f.getInputStream();
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                // No Action.
                hasErr = true;
            }
            f.destroy();
        }
        return hasErr;
    }
}
