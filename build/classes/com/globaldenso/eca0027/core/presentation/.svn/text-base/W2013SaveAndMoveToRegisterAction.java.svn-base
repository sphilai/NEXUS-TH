/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W2020;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W2009_CML_MODE_EDIT;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_ERROR;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2013ListDomain;
import com.globaldenso.eca0027.core.business.domain.W2013UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2013SaveAndMoveToRegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 *    This is a SaveAndMoveToRegister action class of a CML PKG Info Detail screen.
 * <br />CML PKG Info Detail画面のSaveAndMoveToRegisterアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/W2012Init.do
 *     - "error":W2013.jsp
 *     - "W2020":/W2020Init.do
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2013SaveAndMoveToRegisterAction extends W2013AbstractAction {

    /**
     * SaveAndMoveToRegister Facade service
     * <br />SaveAndMoveToRegister Facade サービス
     */
    protected TransactFacadeService<Void, W2013UpdateDomain> w2013SaveAndMoveToRegisterFacadeService;

    /**
     * constructor.
     */
    public W2013SaveAndMoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for w2013SaveAndMoveToRegisterFacadeService.
     * 
     * @param saveAndMoveToRegisterFacadeService Set for w2013SaveAndMoveToRegisterFacadeService
     */
    public void setW2013SaveAndMoveToRegisterFacadeService(TransactFacadeService<Void, W2013UpdateDomain> saveAndMoveToRegisterFacadeService){
        w2013SaveAndMoveToRegisterFacadeService = saveAndMoveToRegisterFacadeService;
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - A screen input information is acquired.
     *     {@link W2013ActionForm} is acquired.
     *
     * Only in the case of - register mode, register the information currently shown on the screen by the following Palletize Item Package Works.
     *
     *     - A screen common information is set up.
     *
     *     - Setting which sets up a mass update domain
     *       It acquired from {@link W2013ActionForm} to {@link W2013UpdateDomain}.
     *       The list of {@link W2013CriteriaDomain} and {@link W2013ListDomain} is set up.
     *
     *     - The information inputted in the pictures is reflected in DB.
     *       Make into an argument {@link W2013UpdateDomain} created above.
     *       {@link W2013SaveAndMoveToRegisterFacadeServiceImpl W2013SaveAndMoveToRegisterFacadeServiceImpl#transact(W2013UpdateDomain)} is called.
     *
     * Change to - CML Register screen.
     *
     * - 画面入力情報を取得する
     *   {@link W2013ActionForm} を取得する。
     * 
     * - 登録モードの場合のみ以下のパレタイズ対象品PKGワークに画面に表示されている情報を登録する。
     * 
     *   - 画面共通情報を設定する
     * 
     *   - 一括更新ドメインを設定する設定
     *     {@link W2013UpdateDomain} に {@link W2013ActionForm} から取得した
     *     {@link W2013CriteriaDomain} と {@link W2013ListDomain} のリストを設定する。
     * 
     *   - 画面で入力した情報をDBに反映する
     *     上記で作成した{@link W2013UpdateDomain} を引数にして 
     *     {@link W2013SaveAndMoveToRegisterFacadeServiceImpl W2013SaveAndMoveToRegisterFacadeServiceImpl#transact(W2013UpdateDomain)} を呼出す。
     * 
     * - CML Register 画面へ遷移
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

        // Acquisition of a condition domain
        // 条件ドメインの取得
        W2013ActionForm w2013Form = (W2013ActionForm) form;
        
        String functionMode = w2013Form.getW2013CriteriaDomain().getFunctionMode();
        String mainMark = w2013Form.getW2013CriteriaDomain().getMainMark();
        
        if (W2009_CML_MODE_EDIT.equals(functionMode)) {
            
            W2013UpdateDomain updateDomain = new W2013UpdateDomain();

            // Setting of a mass update domain
            // 一括更新ドメインの設定
            updateDomain = prepareUpdateDomain(w2013Form);
            
            // Implementation of registration and an update process
            // 登録・更新処理の実施
            w2013SaveAndMoveToRegisterFacadeService.transact(updateDomain);
            
            // Registration of a registration completion message
            // 登録完了メッセージの登録
            // UT110 TRIAL SHIPMENT/号試品対応 ADD if
            int updateCount = getUpdateCount(updateDomain);
            if (0 < updateCount) {
                addGlobalMessage(request, GSCM_I0_0008, updateCount);
            }
        }
        
        // processing-mode MAIN MARK is set up.
        // 処理モード・メインマークを設定
        request.setAttribute("functionMode", functionMode);
        request.setAttribute("mainMark", mainMark);
        
        // It changes to a CML Register screen.
        // CML Register 画面へ遷移
        // UT304 MULTI LABEL ADD START
        if (SCREEN_ID_W2020.equals(w2013Form.getW2013CriteriaDomain().getOriginalScreenId())) {
            return SCREEN_ID_W2020;
        }
        // UT304 MULTI LABEL ADD END
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
     * - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} It carries out.
     *
     * - エラー発生時の画面再表示時
     *   - 画面項目の表示制御を行います。
     * 
     * - エラーなしの場合
     *   - {@link W2009AbstractAction#postInvokeExecute(ActionMapping, ActionForm, HttpServletRequest, HttpServletResponse, String)} を実施します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.presentation.W2013AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response,
        String forwardName){

        if (FORWARD_ERROR.equals(forwardName)) {
            // Display control
            // 表示制御
            controlDisplay(request, (W2013ActionForm)form);
        } else {
            super.postInvokeExecute(mapping, form, request, response, forwardName);
        }
    }
    
    /**
     *    A Update domain is created.
     * <br />Updateドメインを作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Update domain<br />Updateドメイン
     */
    protected W2013UpdateDomain prepareUpdateDomain(W2013ActionForm form) {
        W2013UpdateDomain updateDomain = new W2013UpdateDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // Setting of LANGUAGE CODE, and a DSC-ID (required for an input check, and registration and an update process)  
        // 言語コード・DSC-IDの設定 (入力チェックおよび登録・更新処理に必要)
        if (form.getListDomainList() != null) {
            for (W2013ListDomain listDomain : form.getListDomainList()) {
                listDomain.setLanguageCd(form.getLanguageCd());
                listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
            }
        }
        // A setting of a Criteria domain
        // Criteriaドメインの設定
        updateDomain.setCriteriaDomain(form.getW2013CriteriaDomain());
        
        // A setting of a List domain
        // Listドメインの設定
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }

    /**
     * 
     * Get update count
     * <br />更新件数を取得する。
     * 
     * @param updateDomain Update domain<br />Updateドメイン
     * @return Update count<br />更新件数
     */
    protected int getUpdateCount(W2013UpdateDomain updateDomain) {
        
        int count = 0;
        
        if (updateDomain.getListDomainList() != null) {
            for (W2013ListDomain listDomain : updateDomain.getListDomainList()) {
                if (!CheckUtil.isBlankOrNull(listDomain.getPkgItemNo())) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
}
