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

import com.globaldenso.eca0027.core.business.domain.W1006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;


/**
 *    This is a Print Inspect action class of  Export Request Header screen
 * <br />梱包指示Register画面のPrint Inspectアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1007.jsp
 *     - "error":W1007.jsp
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5759 $
 */
public class W1007PrintInspectSlipAction extends W1007AbstractAction {
    /**
     * PrintInspectSheetFacade service
     * <br />PrintInstr Facadeサービス
     */
    protected ProcessFacadeService<File, W1006CriteriaDomain> w1007PrintInspectSheetFacadeService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1007PrintInspectSlipAction() {
        super();
    }

    /**
     * <p>Setter method for w1007PrintInspectSheetFacadeService.</p>
     *
     * @param printInspectSheetFacadeService Set for w1007PrintInspectSheetFacadeService
     */
    public void setW1007PrintInspectSheetFacadeService(
        ProcessFacadeService<File, W1006CriteriaDomain> printInspectSheetFacadeService) {
        w1007PrintInspectSheetFacadeService = printInspectSheetFacadeService;
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
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W1007ActionForm w1006Form = (W1007ActionForm) form;
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W1006CriteriaDomain criteriaDomain = prepareCriteriaDomain(w1006Form);
        
        // create of PDF list
        // PDF帳票の作成
        File report = w1007PrintInspectSheetFacadeService.process(criteriaDomain);
        
        // Download of PDF list
        // PDF帳票のダウンロード
        String fileName = criteriaDomain.getExpRequestNo() + "_INSPECTION_SLIP" + EXT_PDF;
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
    protected W1006CriteriaDomain prepareCriteriaDomain(W1007ActionForm form) {
        W1007CriteriaDomain criteriaDomain = form.getW1007CriteriaDomain();
        W1006CriteriaDomain w1006CriteriaDomain = new W1006CriteriaDomain();
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Copy properties domain to domain
        CommonUtil.copyPropertiesDomainToDomain(w1006CriteriaDomain, criteriaDomain);
        
        return w1006CriteriaDomain;
    }
}
