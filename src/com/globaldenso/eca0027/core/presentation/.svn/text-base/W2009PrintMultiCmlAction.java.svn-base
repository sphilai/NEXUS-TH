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

import com.globaldenso.eca0027.core.business.domain.W2004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2009PrintMultiCmlFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    This is a Print Multi CML action class of a CML main screen.
 * <br />CML メイン画面のPrint Multi CMLアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W2009.jsp
 * UT414 ADD
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12605 $
 */
public class W2009PrintMultiCmlAction extends W2009AbstractAction {

    /**
     * PrintMultiCml Facade service
     * <br />PrintMultiCml Facade サービス
     */
    protected TransactFacadeService<File, W2009CriteriaDomain> w2009PrintMultiCmlFacadeService;
    
    /**
     * constructor.
     */
    public W2009PrintMultiCmlAction() {
        super();
    }

    /**
     * Setter method for w2012PrintMultiCmlFacadeService.
     * 
     * @param printMultiCmlFacadeService Set for w2012PrintMultiCmlFacadeService
     */
    public void setW2009PrintMultiCmlFacadeService(
        TransactFacadeService<File, W2009CriteriaDomain> printMultiCmlFacadeService) {
        w2009PrintMultiCmlFacadeService = printMultiCmlFacadeService;
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
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2009CriteriaDomain}.
     *         - Screen common information
     *
     * A create of - PDF list
     *       {@link W2009PrintMultiCmlFacadeServiceImpl W2009PrintMultiCmlFacadeServiceImpl#transact(W2009CriteriaDomain)} is called for {@link W2004CriteriaDomain} to an argument.
     *
     * Download of - PDF list
     *       {@link ActionUtil#downloadBinary(byte[], String, HttpServletResponse)} is called,
     *       The created PDF list is outputted.
     *
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2009CriteriaDomain}に設定する
     *       - 画面共通情報
     *       
     * - PDF帳票の作成
     *     {@link W2004CriteriaDomain}を引数に{@link W2009PrintMultiCmlFacadeServiceImpl W2009PrintMultiCmlFacadeServiceImpl#transact(W2009CriteriaDomain)}を呼出す
     *     
     * - PDF帳票のダウンロード
     *     {@link ActionUtil#downloadBinary(byte[], String, HttpServletResponse)}を呼出し、
     *     作成したPDF帳票を出力する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm w2009form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Get PL domain
        // PLドメイン取得
        W2009ActionForm form = (W2009ActionForm)w2009form;
        W2009CriteriaDomain criteriaDomain  = form.getW2009CriteriaDomain();
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setListDomainList(form.getListDomainList());

        // Call the PDF form creation services.
        // PDF帳票作成サービスを呼び出す。
        File report = w2009PrintMultiCmlFacadeService.transact(criteriaDomain);

        // Return the PDF form to download response .
        // PDF帳票ダウンロードのレスポンス返す。
        if (form.getListDomainList() != null && report != null) {
            if (0 < form.getListDomainList().size()) {
                String fileName = form.getListDomainList().get(0).getMainMark();
                if (1 < form.getListDomainList().size()) {
                    fileName += 
                        "_" + form.getListDomainList().get(form.getListDomainList().size() - 1).getMainMark();
                }
                fileName += EXT_PDF;
                ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
            }
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.presentation.W2009AbstractAction#postInvokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.String)
     */
    @Override
    protected void postInvokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response, String forwardName) {

        controlDisplay((W2009ActionForm)form, request);
    }
}
