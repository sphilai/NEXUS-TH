/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2008CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W2008PrintTagFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The PrintTag action class of Multiple Item No. in 1Box PKG Main Screen
 * <br />小箱内多品番Register画面のPrintTagアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "error":W2008.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public class W2008PrintTagAction extends W2008AbstractAction {

    /**
     * PrintTagFacade service
     * <br />PrintTagFacadeサービス
     */
    protected TransactFacadeService<File, W2008CriteriaDomain> w2008PrintTagFacadeService;
    
    /**
     * constructor.
     */
    public W2008PrintTagAction() {
        super();
    }

    /**
     * Setter method for w2008PrintTagFacadeService.
     *
     * @param transactFacadeService Set for w2008PrintTagFacadeService
     */
    public void setW2008PrintTagFacadeService(
        TransactFacadeService<File, W2008CriteriaDomain> transactFacadeService) {
        w2008PrintTagFacadeService = transactFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - Setting of a search-condition domain
     *       The following informations are set as {@link W2008CriteriaDomain}.
     *         - Screen common information
     *
     * A create of - PDF list
     *       {@link W2008PrintTagFacadeServiceImpl W2008PrintTagFacadeServiceImpl#transact (W2008CriteriaDomain)} is called for {@link W2008CriteriaDomain} to an argument.
     *
     * Download of - PDF list
     *       {@link ActionUtil#downloadBinary (byte[], String, HttpServletResponse)} is called,
     *       The created PDF list is outputted.
     * 
     * 
     * - 検索条件ドメインの設定
     *     以下の情報を{@link W2008CriteriaDomain}に設定する
     *       - 画面共通情報
     *       
     * - PDF帳票の作成
     *     {@link W2008CriteriaDomain}を引数に{@link W2008PrintTagFacadeServiceImpl W2008PrintTagFacadeServiceImpl#transact(W2008CriteriaDomain)}を呼出す
     *     
     * - PDF帳票のダウンロード
     *     {@link ActionUtil#downloadBinary(byte[], String, HttpServletResponse)}を呼出し、
     *     作成したPDF帳票を出力する
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        W2008ActionForm w2008Form = (W2008ActionForm) form;
        
        if (!w2008Form.isDownload()) {
            // Setting of a search-condition domain
            // 検索条件ドメインの設定
            W2008CriteriaDomain criteriaDomain = prepareCriteriaDomain(w2008Form);

            // A create of PDF list
            // PDF帳票の作成
            File report = w2008PrintTagFacadeService.transact(criteriaDomain);
            
            // Preservation of PDF list
            // PDF帳票の保存
            saveReport(w2008Form, report);
            
            // Setting of a download flag
            // ダウンロードフラグの設定
            w2008Form.setDownload(true);
            
            return FORWARD_SUCCESS;
            
        } else {
            // Acquisition of PDF list
            // PDF帳票の取得
            File report = getReport(w2008Form);
            
            // Download of PDF list
            // PDF帳票のダウンロード
            String fileName = w2008Form.getMixTagNo() + EXT_PDF;
            ActionUtil.downloadBinary(IOUtils.toByteArray(new FileInputStream(report)), fileName, response);

            return null;
        }
    }
    
    /**
     * A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Search-condition domain<br />検索条件ドメイン
     */
    protected W2008CriteriaDomain prepareCriteriaDomain(W2008ActionForm form) {
        W2008CriteriaDomain criteriaDomain = form.getW2008CriteriaDomain();
        
        String weightUnitDisp = criteriaDomain.getWeightUnitDisp();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // This is used for the activity of PrintTag, and non-activity.
        // PrintTagの活性、非活性に使用
        form.setMixTagNo(criteriaDomain.getMixTagNo());
        
        criteriaDomain.setWeightUnitDisp(weightUnitDisp);
        
        return criteriaDomain;
    }
}
