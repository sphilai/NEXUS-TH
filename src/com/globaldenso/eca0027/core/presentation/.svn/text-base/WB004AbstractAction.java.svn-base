/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;


import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB004;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.presentation.AbstractAction;

/**
 *    This is a base action class.
 * <br />基底アクションクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public abstract class WB004AbstractAction extends AbstractAction {

    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public WB004AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String preInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Set transition original screen id
     *       Transition-original-screen ID is set to action form.
     *
     * - 遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        // Screen fields attributes
        // 画面表示制御
        controlDisplay((WB004ActionForm)form, request);
        
        ((WB004ActionForm) form).setCallScreenId(SCREEN_ID_WB004);
    }
    
    /**
     * Screen fields attributes.
     * <br />画面表示制御を行います。
     * <pre>
     * - Non-display in a detailed list in other than a self-screen
     *
     * - 自画面以外の場合、明細リストを非表示
     * </pre>
     * 
     * @param form Action form<br />アクションフォーム
     * @param request HTTP request<br />HTTPリクエスト
     */
    protected void controlDisplay(WB004ActionForm form, HttpServletRequest request) {
        
        if (SCREEN_ID_WB004.equals(form.getCallScreenId())) {
            if (form.getListDomainList() == null){
                form.setDisplayList(false);
            } else {
                form.setDisplayList(true);
            }
        } else {
            form.setDisplayList(false);
        }
    }
}
