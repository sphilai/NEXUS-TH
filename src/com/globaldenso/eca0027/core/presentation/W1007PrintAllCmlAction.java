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

import com.globaldenso.eca0027.core.business.domain.W1007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1008CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;

/**
 *    This is a Print All CML action class of a Export Request Header screen
 * <br />梱包指示Register画面のPrint CMLアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W1007.jsp
 *     - "error":W1007.jsp
 * </pre>
 *
 * @author $Author: DCS
 * @version $Revision: 5759 $
 */
public class W1007PrintAllCmlAction extends W1007AbstractAction {

    /**
     * PrintCml Facade service
     * <br />PintrCml Facadeサービス
     */
    protected SearchFacadeService<File, W1008CriteriaDomain> w1008PrintCmlFacadeService;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1007PrintAllCmlAction() {
        super();
    }

    /**
     * Setter method for w1008PrintCmlFacadeService.
     *
     * @param printCmlFacadeService Set for w1008PrintCmlFacadeService
     */
    public void setW1008PrintCmlFacadeService(
        SearchFacadeService<File, W1008CriteriaDomain> printCmlFacadeService) {
        w1008PrintCmlFacadeService = printCmlFacadeService;
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
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {

        W1007ActionForm w1007Form = (W1007ActionForm) form;
        
        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        W1008CriteriaDomain criteriaDomain = prepareCriteriaDomain(w1007Form);
        
        // create of PDF list
        // PDF帳票の作成
        File report = w1008PrintCmlFacadeService.search(criteriaDomain);

        // Download of PDF list
        // PDF帳票のダウンロード
        String fileName = "EXP.REQ." + w1007Form.getW1007CriteriaDomain().getExpRequestNo() + "_CML" + EXT_PDF;
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
    protected W1008CriteriaDomain prepareCriteriaDomain(W1007ActionForm form) {
        W1007CriteriaDomain criteriaDomain = form.getW1007CriteriaDomain();
        W1008CriteriaDomain w1008CriteriaDomain = new W1008CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Copy properties domain to domain
        CommonUtil.copyPropertiesDomainToDomain(w1008CriteriaDomain, criteriaDomain);
        
        return w1008CriteriaDomain;
    }
}
