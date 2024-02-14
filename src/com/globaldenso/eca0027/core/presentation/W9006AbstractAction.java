/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The base action class of NEXUS Ship to MA Inquiry Screen. <br />
 * NEXUS Ship to MA Inquiry画面の基底アクションクラスです。
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 7948 $
 */
public abstract class W9006AbstractAction extends AbstractAction {

    
    /** 
     * commonService
     */
    protected CommonService commonService;

    
    /**
     * Default constructor.
     */
    public W9006AbstractAction() {
        super();
    }

    
    /**
     * <p>Getter method for commonService.</p>
     *
     * @return the commonService
     */
    public CommonService getCommonService() {
        return commonService;
    }

     /**
     * <p>Setter method for commonService.</p>
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }
    

    /**
     * {@inheritDoc}
     * <pre>
     * - Pretreatment.
     * - 前処理を行います。
     * 
     * - Acquisition of screen common information 
     *     A screen common item (linguistic code) is set as action form. 
     * 
     * - 画面共通情報の取得
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #preInvokeExecute(org.apache.struts.action.ActionMapping, 
     *                        org.apache.struts.action.ActionForm, 
     *                        javax.servlet.http.HttpServletRequest,
     *                        javax.servlet.http.HttpServletResponse)
     */

    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {

        W9006ActionForm w9006Form = (W9006ActionForm) form;

        // Call the method setCommonInfo.
        setCommonInfo(w9006Form);

        // Go to this screen.
        return FORWARD_SUCCESS;
    }

    /**
     * - The item of screen common information and languageCd are set to action form.
     * 
     * - アクション・フォームに画面共通情報の項目と言語コードを設定します。
     *
     * @param form アクションフォーム
     */
    protected void setCommonInfo(W9006ActionForm form) {

        // Get the common screen information.
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea
            (form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        // Set language code.
        form.setLanguageCd(commonInfo.getLanguageCd());
    }



    /**
     * {@inheritDoc}
     * 後処理を行う。
     * Post-processing
     * 
     * <pre>
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する。
     * 
     * - A setup of changing agency screen ID 
     *     Changing agency screen ID is set to action form. 
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction
     *      #postInvokeExecute(org.apache.struts.action.ActionMapping, 
     *                         org.apache.struts.action.ActionForm, 
     *                         javax.servlet.http.HttpServletRequest,
     *                         javax.servlet.http.HttpServletResponse, 
     *                         java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        //Set transition source screen ID.
        ((W9006ActionForm) form).setCallScreenId(SCREEN_ID_W9006);
    }
}