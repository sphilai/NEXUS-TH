/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ATTR_DISABLE_ELEMENT_LIST;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.presentation.AbstractAction;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * The class of base action of Order Upload screen.
 * <br />受注アップロード画面の基底アクションクラスです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15503 $
 */
public abstract class WB020AbstractAction extends AbstractAction {

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB020AbstractAction() {
        super();
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Acquisition of common screen information
     *     Set the screen common item (LANGUAGE CODE) in Action Form.
     * </pre>
     * <pre>
     * ‐画面共通情報の取得
     *     アクション・フォームに画面共通項目(言語コード)を設定する
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#preInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String preInvokeExecute(ActionMapping mapping, ActionForm actForm, HttpServletRequest request, HttpServletResponse response) 
        throws ApplicationException {
        
        WB020ActionForm form = (WB020ActionForm)actForm;

        WindowInfoDomain windowInfo
            = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();

        form.setLanguageCd(commonInfo.getLanguageCd());
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of transition source SCREEN ID
     *     Call the {@link #controlDisplay(WB020ActionForm, HttpServletRequest)}.
     * 
     * ‐Set of transition source SCREEN ID
     *     Set the transition source SCREEN ID in Action Form.
     * </pre>
     * <pre>
     * ‐画面表示制御
     *     {@link #controlDisplay(WB020ActionForm, HttpServletRequest)}を呼出します。
     * 
     * ‐遷移元画面IDの設定
     *     アクション・フォームに遷移元画面IDを設定する
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm actForm,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        WB020ActionForm form = (WB020ActionForm)actForm;

        List<String> disableElementList = new ArrayList<String>();
        if (form.getWb020ListDomainList().size() == 0) {
            disableElementList.add("display");
        }
        request.setAttribute(ATTR_DISABLE_ELEMENT_LIST, disableElementList);

        form.setFormFileData(null); // NL033 ADD
    }
}
