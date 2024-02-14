/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W6001PrintDocumentFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The PrintDocument class action of Documentation Invoice Main screen.
 * <br />通関書類作成業務 Invoice Main画面のPrintDocumentアクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11677 $
 */
public class W6001PrintDocumentAction extends W6001AbstractAction {
    /**
     * PrintDocument FacadeService
     */
    protected SearchFacadeService<File, W6001ListDomain> w6001PrintDocumentFacadeService;

    /**
     * The default constructor.
     * デフォルトコンストラクタです。
     */
    public W6001PrintDocumentAction() {
        super();
    }

    /**
     * Setter method for w6001PrintDocumentFacadeService.
     *
     * @param printDocumentFacadeService Set for w6001PrintDocumentFacadeService
     */
    public void setW6001PrintDocumentFacadeService(SearchFacadeService<File, W6001ListDomain> printDocumentFacadeService) {
        w6001PrintDocumentFacadeService = printDocumentFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Set of search criteria domain
     * Common information screen, the page control information {@link W6001ListDomain} set to.
     *
     * - The execution of the search process
     * Call W6001PrintDocumentFacadeServiceImpl.
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     画面共通情報、ページ制御情報を{@link W6001ListDomain}に設定します。
     * 
     * ‐検索処理の実行
     *     {@link W6001PrintDocumentFacadeServiceImpl}を呼出す。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W6001ActionForm w6001Form = (W6001ActionForm) form;
        
        W6001ListDomain listDomain = prepareListDomain(w6001Form);
        
        File zipFile = w6001PrintDocumentFacadeService.search(listDomain);
        
        // Display of the obtained file.
        // 取得したファイルの表示
        // UT186 ZIP DOWNLOAD MOD START
        //String fileName = listDomain.getInvoiceNo() + EXT_PDF;
        String fileName =
            String.format(
                "%s_%s_%s.zip",
                listDomain.getShipperCd(),
                listDomain.getInvoiceNo(),
                new SimpleDateFormat("yyyyMMddHHmmss").format(listDomain.getInvoiceIssueDt())
            )
        ;
        // UT186 ZIP DOWNLOAD MOD END
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(zipFile)), fileName, response);
        
        w6001Form.getW6001CriteriaDomain().setSelected(null);
        
        return null;
    }

    /**
     * Get the domain of the selected row, and set as the search criteria.
     * <br />選択行のドメインを取得、検索条件として設定します。
     * 
     * @param form of Action Form W6001<br />W6001のアクションフォーム
     * @return Domain information of the selected row<br />選択行のドメイン情報
     */
    protected W6001ListDomain prepareListDomain(W6001ActionForm form) {
        int selectedRow = Integer.parseInt(form.getPrintRow());

        W6001ListDomain listDomain = form.getListDomainList().get(selectedRow);
        
        ActionUtil.prepareBusinessDomain(listDomain, form.getWindowId(), form.getScreenId());
        
        return listDomain;
    }
}

