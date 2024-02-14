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
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;


/**
 * This is a Print Inspect action class of a Export Request [Register & Print Request] Main screen.
 * <br />梱包指示Register画面のPrint Inspectアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W1006.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006PrintInspectSlipAction extends W1006AbstractAction {

    /**
     * PrintInspect Facade service
     * <br />PrintInstr Facadeサービス
     */
    protected ProcessFacadeService<File, W1006CriteriaDomain> w1006PrintInspectSheetFacadeService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1006PrintInspectSlipAction() {
        super();
    }

    /**
     * <p>Setter method for w1006PrintInspectSheetFacadeService.</p>
     *
     * @param printInspectSheetFacadeService Set for w1006PrintInspectSheetFacadeService
     */
    public void setW1006PrintInspectSheetFacadeService(
        ProcessFacadeService<File, W1006CriteriaDomain> printInspectSheetFacadeService) {
        w1006PrintInspectSheetFacadeService = printInspectSheetFacadeService;
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

        W1006ActionForm w1006Form = (W1006ActionForm) form;
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W1006CriteriaDomain criteriaDomain = prepareCriteriaDomain(w1006Form);
        
        // create of PDF list
        // PDF帳票の作成
        File report = w1006PrintInspectSheetFacadeService.process(criteriaDomain);
        
        // Download of PDF list
        // PDF帳票のダウンロード
        String fileName = criteriaDomain.getExpRequestNo() + "_INSPECTION_SLIP" +EXT_PDF;
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
    protected W1006CriteriaDomain prepareCriteriaDomain(W1006ActionForm form) {
        W1006CriteriaDomain criteriaDomain = form.getW1006CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
