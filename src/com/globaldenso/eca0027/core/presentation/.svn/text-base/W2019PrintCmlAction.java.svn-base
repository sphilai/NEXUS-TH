/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2019PrintCmlFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a PrintCml action class of a CML Trans Revise screen.
 * <br />CML Trans Revise画面のPrintCmlアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W2019.jsp
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class W2019PrintCmlAction extends W2019AbstractAction {

    /**
     * PrintCml Facade service
     * <br />PrintCml Facade サービス
     */
    protected TransactFacadeService<File, W2019CriteriaDomain> w2019PrintCmlFacadeService;
    
    /**
     * constructor.
     */
    public W2019PrintCmlAction() {
        super();
    }
    
    /**
     * Setter method for w2019PrintCmlFacadeService.
     * 
     * @param printCmlFacadeService Set for w2019PrintCmlFacadeService
     */
    public void setW2019PrintCmlFacadeService(
        TransactFacadeService<File, W2019CriteriaDomain> printCmlFacadeService) {
        w2019PrintCmlFacadeService = printCmlFacadeService;
    }
    
    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - CML list create
     *     {@link W2019PrintCmlFacadeServiceImpl W2019PrintCmlFacadeServiceImpl#transact(W2019CriteriaDomain)} is called and a list is created.
     *
     * - Output file download
     *
     * - CML帳票作成
     *   {@link W2019PrintCmlFacadeServiceImpl W2019PrintCmlFacadeServiceImpl#transact(W2019CriteriaDomain)} を呼出し、帳票を作成します。
     * 
     * - 出力ファイルダウンロード
     *
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W2019ActionForm w2019Form = (W2019ActionForm) form;
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W2019CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2019Form);
        
        // A create of PDF list
        // PDF帳票の作成
        File report = w2019PrintCmlFacadeService.transact(criteriaDomain);
        
        // Download of PDF list
        // PDF帳票のダウンロード
        String fileName = w2019Form.getW2019CriteriaDomain().getMainMark() + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
        
        return null;  
    }

    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2019CriteriaDomain prepareCriteriaDomain(W2019ActionForm form) {
        W2019CriteriaDomain criteriaDomain  = form.getW2019CriteriaDomain();
        
        String volumeUnit = criteriaDomain.getVolumeUnit();
        String weightUnit = criteriaDomain.getWeightUnit();
        String lengthUnit = criteriaDomain.getLengthUnit(); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        criteriaDomain.setVolumeUnit(volumeUnit);
        criteriaDomain.setWeightUnit(weightUnit);
        criteriaDomain.setLengthUnit(lengthUnit); // UT110 TRIAL SHIPMENT/号試品対応 ADD
        
        return criteriaDomain;
    }
}
