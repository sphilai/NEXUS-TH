/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2019ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2019RegisterFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Register action class of a CML Trans Revise screen.
 * <br />CML Trans Revise画面のRegisterアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W2019.jsp
 *     - "error":W2019.jsp
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2019RegisterAction extends W2019AbstractAction {

    /**
     * Register Facade Service
     */
    protected TransactFacadeService<List<? extends W2019ListDomain>, W2019CriteriaDomain> w2019RegisterFacadeService;

    /**
     * constructor.
     */
    public W2019RegisterAction() {
        super();
    }

    /**
     * Setter method for w2019RegisterFacadeService.
     * 
     * @param registerFacadeService Set for w2019RegisterFacadeService
     */
    public void setW2019RegisterFacadeService(
        TransactFacadeService<List<? extends W2019ListDomain>, W2019CriteriaDomain> registerFacadeService) {
        w2019RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return true;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of an update domain
     *       The following informations are set as {@link W2019CriteriaDomain}.
     *         - Screen common information
     *         - Search-condition domain ({@link W2019CriteriaDomain})  
     *         - List domain ({@link W2019ActionForm#setListDomainList(List)})
     *
     * - Execution of registration processing
     *       Created {@link W2019CriteriaDomain} is made into an argument, and {@link W2019RegisterFacadeServiceImpl W2019RegisterFacadeServiceImpl#transact(W2019CriteriaDomain)} is called.
     *
     * - Setting of a re retrieval result
     *       The re retrieval result after registration is set as action form.
     *
     * - Screen fields attributes
     *       Set screen field attributes {@link #controlDisplay(W2019ActionForm, HttpServletRequest)}.
     *
     * - 更新ドメインの設定
     *     以下の情報を{@link W2019CriteriaDomain}に設定する
     *       - 画面共通情報
     *       - 検索条件ドメイン ({@link W2019CriteriaDomain})
     *       - Listドメイン ({@link W2019ActionForm#setListDomainList(List)})
     *       
     * - 登録処理の実行
     *     作成した{@link W2019CriteriaDomain}を引数にして、{@link W2019RegisterFacadeServiceImpl W2019RegisterFacadeServiceImpl#transact(W2019CriteriaDomain)}を呼出す
     *     
     * - 再検索結果の設定
     *     登録後の再検索結果をアクションフォームに設定する
     *     
     * - 画面表示制御
     *     {@link #controlDisplay(W2019ActionForm, HttpServletRequest)}を呼出し、画面項目の活性制御を行う
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws ApplicationException {
        
        W2019ActionForm w2019Form = (W2019ActionForm) form;
        
        // Setting of an update domain
        // 更新ドメインの設定
        W2019CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2019Form);
        
        // Execution of registration processing
        // 登録処理の実行
        List<? extends W2019ListDomain> listDomainList = w2019RegisterFacadeService.transact(criteriaDomain);
        
        // Registration of a registration completion message
        // 登録完了メッセージの登録
        addGlobalMessage(request, GSCM_I0_0008, w2019Form.getListDomainList().size());
        
        // Setting of search results
        // 検索結果の設定
        w2019Form.setListDomainList(listDomainList);
        w2019Form.setW2019CriteriaDomain(criteriaDomain);
        
        // Screen fields attributes
        // 画面表示制御
        controlDisplay(w2019Form, request);
        
        return FORWARD_SUCCESS;
    }

    /**
     *    {@link W2019CriteriaDomain} is created.
     * <br />{@link W2019CriteriaDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return {@link W2019CriteriaDomain}
     */
    protected W2019CriteriaDomain prepareCriteriaDomain(W2019ActionForm form) {
        
        // A setting of condition domain, and a List domain
        // 条件ドメイン、Listドメインの設定
        W2019CriteriaDomain criteriaDomain = form.getW2019CriteriaDomain();
        
        // Backup of the last modification time
        // 最終更新時刻の退避
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        
        String volumeUnit = criteriaDomain.getVolumeUnit();
        String weightUnit = criteriaDomain.getWeightUnit();
        String lengthUnit = criteriaDomain.getLengthUnit(); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Resetting of the last modification time
        // 最終更新時刻の再設定
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
        
        criteriaDomain.setVolumeUnit(volumeUnit);
        criteriaDomain.setWeightUnit(weightUnit);
        criteriaDomain.setLengthUnit(lengthUnit); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        
        return criteriaDomain;
    }
}
