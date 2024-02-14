/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.UpdateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NOT_RECEIVED_PACKING;

/**
 * This is a Print approve sheet action class of a Export Request [Register & Print Request] Main screen.
 * <br />梱包指示Register画面のPrint approve sheetアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W1006.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006PrintApprovalSheetAction extends W1006AbstractAction {

    /**
     * PrintApproveSheetFacade service
     * <br />PrintInstr Facadeサービス
     */
    protected UpdateFacadeService<File, W1006CriteriaDomain> w1006PrintApprovalSheetFacadeService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1006PrintApprovalSheetAction() {
        super();
    }

    /**
     * Setter method for w1006PrintApprovalSheetFacadeService.
     *
     * @param printApprovalSheetFacadeService Set for w1006PrintApprovalSheetFacadeService
     */
    public void setW1006PrintApprovalSheetFacadeService(
        UpdateFacadeService<File, W1006CriteriaDomain> printApprovalSheetFacadeService) {
        w1006PrintApprovalSheetFacadeService = printApprovalSheetFacadeService;
    }
    
    /**
     * {@inheritDoc}
     */
    protected boolean isScreenInfoStack() {
        return false;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W1006ActionForm w1006Form = (W1006ActionForm) form;
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W1006CriteriaDomain criteriaDomain = prepareCriteriaDomain(w1006Form);
        
        // create of PDF list
        // PDF帳票の作成
        File report = w1006PrintApprovalSheetFacadeService.update(criteriaDomain);
        
        // Download of PDF list
        // PDF帳票のダウンロード
        String fileName = w1006Form.getW1006CriteriaDomain().getExpRequestNo() + "_APPROVAL_SHEET" + EXT_PDF;
        ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);
        
        criteriaDomain.setRequestStatus(Integer.parseInt(NOT_RECEIVED_PACKING));

        return null;
    }

    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W1006CriteriaDomain prepareCriteriaDomain(W1006ActionForm form) {
        W1006CriteriaDomain criteriaDomain = form.getW1006CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
