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

import com.globaldenso.eca0027.core.business.domain.W5004CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;


/**
 * Shipping Confirmation form output action class of Shipping Confirmation Register screen
 * <br />出荷確認Register画面のShipping Confirmation帳票出力アクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W5004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5004PrintConfirmationAction extends W5004AbstractAction {

    /**
     * Print confirmation facade service.
     */
    protected TransactFacadeService<File, W5004CriteriaDomain> w5004PrintConfirmationFacadeService;
    
    /**
     * constructor.
     */
    public W5004PrintConfirmationAction() {
        super();
    }

    /**
     * Setter method for W5004PrintConfirmationFacadeService.
     *
     * @param printConfirmationFacadeService Set for w5004PrintConfirmationFacadeService
     */
    public void setW5004PrintConfirmationFacadeService(
        TransactFacadeService<File, W5004CriteriaDomain> printConfirmationFacadeService) {
        w5004PrintConfirmationFacadeService = printConfirmationFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Call the W5004PrintConfirmationFacadeService.search an argument form.criteriaDomain
     * - Download the PDF response form
     *    Argument to the result of calling W5004PrintConfirmationFacadeService.search, Call the ActionUtil.downloadBinary
     *
     * - form.criteriaDomainを引数にW5004PrintConfirmationFacadeService.searchの呼び出し
     * - PDF帳票のダウンロードレスポンス
     *    W5004PrintConfirmationFacadeService.searchの呼び出し結果を引数に、ActionUtil.downloadBinaryの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W5004ActionForm w5004Form = (W5004ActionForm) form;
        
        // Set of search criteria domain.
        // 検索条件ドメインの設定
        W5004CriteriaDomain criteriaDomain = prepareCriteriaDomain(w5004Form);
        
        // Create a PDF document.
        // PDF帳票の作成
        File report = w5004PrintConfirmationFacadeService.transact(criteriaDomain);
        
        // Download PDF document.
        // PDF帳票のダウンロード
        String fileName = criteriaDomain.getShippingFirmNo() + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
        
        return null;
    }

    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param form action form
     * @return Search conditions domain 
     */
    protected W5004CriteriaDomain prepareCriteriaDomain(W5004ActionForm form) {
        W5004CriteriaDomain criteriaDomain = form.getW5004CriteriaDomain();
        
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return false;
    }
}
