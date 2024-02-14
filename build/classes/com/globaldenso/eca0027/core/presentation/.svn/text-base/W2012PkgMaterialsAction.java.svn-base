/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2012UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 *    This is a PkgMaterials action class of a CML Register screen.
 * <br />CML Register画面のPkgMaterialsアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2013Init.do
 *     - "error":W2012.jsp
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2012PkgMaterialsAction extends W2012AbstractAction {

    /**
     * PkgMaterials Facade service
     * <br />PkgMaterials Facade サービス
     */
    protected TransactFacadeService<Void, W2012UpdateDomain> w2012PkgMaterialsFacadeService;

    /**
     * constructor.
     */
    public W2012PkgMaterialsAction() {
        super();
    }

    /**
     * Setter method for w2012PkgMaterialsFacadeService.
     * 
     * @param pkgMaterialsFacadeService Set for w2012PkgMaterialsFacadeService
     */
    public void setW2012PkgMaterialsFacadeService(
        TransactFacadeService<Void, W2012UpdateDomain> pkgMaterialsFacadeService) {
        w2012PkgMaterialsFacadeService = pkgMaterialsFacadeService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        // A setting of mass update domain
        // 一括更新ドメインの設定
        W2012ActionForm w2012Form = (W2012ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2012UpdateDomain updateDomain = prepareUpdateDomain(w2012Form);
        
        // Execution of processing
        // 処理の実行
        w2012PkgMaterialsFacadeService.transact(updateDomain);
        
        // Screen taking over item
        // 画面引継ぎ項目
        request.setAttribute("functionMode", w2012Form.getW2012CriteriaDomain().getFunctionMode());
        request.setAttribute("mainMark", w2012Form.getW2012CriteriaDomain().getMainMark());
        
        return FORWARD_SUCCESS;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - At the time of the screen re-display at the time of error generation
     *     - Display control of a screen item is performed.
     *
     * - At the time of the screen re-display at the time of no error generation
     * - {@link W2012AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2012AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2009AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        if (FORWARD_ERROR.equals(forwardName)) {
            controlDisplay(request, (W2012ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }

    }
    
    /**
     *    {@link W2012UpdateDomain} is created.
     * <br />{@link W2012UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W2012UpdateDomain}
     */
    protected W2012UpdateDomain prepareUpdateDomain(W2012ActionForm form) {
        W2012UpdateDomain updateDomain = new W2012UpdateDomain();

        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        // A setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        updateDomain.setCriteriaDomain(form.getW2012CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());

        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoManager windowInfo = new WindowInfoManager(WINDOW_ID_0);
        CommonInfoDomain commonInfo = windowInfo.getCommonInfo();
        
        updateDomain.getCriteriaDomain().setLoginUserDscId(commonInfo.getLoginUserDscId());
        updateDomain.getCriteriaDomain().setUsrNmEn(commonInfo.getUserName());

        return updateDomain;
    }
}
