/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.EXT_PDF;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7004CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7004PrintClpFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of Print CLP action for Shipping Actuality Register screen.
 * <br />船積実績Register画面のPrint CLPアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"error": W7004
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7004PrintClpAction extends W7004AbstractAction {

    /**
     * Print CLP Facade Service<br />
     * Print CLP Facadeサービス
     */
    protected ProcessFacadeService<W7004CriteriaDomain, W7004CriteriaDomain> w7004PrintClpFacadeService;
    
    /**
     * default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004PrintClpAction() {
        super();
    }
    
    /**
     * Setter method for w7004PrintClpFacadeService.
     *
     * @param printClpFacadeService Set for w7004PrintClpFacadeService
     */
    public void setW7004PrintClpFacadeService(
        ProcessFacadeService<W7004CriteriaDomain, W7004CriteriaDomain> printClpFacadeService) {
        w7004PrintClpFacadeService = printClpFacadeService;
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
     *   Set to{@link W7004CriteriaDomain}.
     *
     * - Get FILE DATA
     *   Call the {@link W7004PrintClpFacadeServiceImpl} process.
     *
     * - Display of the obtained file
     *   Displayed in the Viewer file that you obtained.
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link W7004CriteriaDomain}に設定します。
     * 
     * ‐ファイルデータの取得
     *     {@link W7004PrintClpFacadeServiceImpl}を呼出します。
     * 
     * ‐取得したファイルの表示
     *     取得したファイルをViewerに表示します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W7004ActionForm w7004Form = (W7004ActionForm) form;
        
        ByteArrayOutputStream byteOutStrm = new ByteArrayOutputStream();
        W7004CriteriaDomain criteriaDomain = prepareCriteriaDomain(w7004Form, byteOutStrm);
        // Get file data.
        // ファイルデータの取得
        w7004PrintClpFacadeService.process(criteriaDomain);
        // Download PDF file.
        // 取得したファイルの表示
        String fileName = criteriaDomain.getShippingActNo() + EXT_PDF;
        ActionUtil.downloadBinary(byteOutStrm.toByteArray(), fileName, response);
        
        byteOutStrm.close();
        
        return null;
    }

    /**
     * Set the {@link W7004CriteriaDomain} .
     * <br />{@link W7004CriteriaDomain}を設定します。
     *
     * @param form of action form Shipping Actuality Register screen<br /> 船積実績Register画面のアクションフォーム
     * @param byteOutStrm output stream<br /> 出力ストリーム
     * @return You set {@link W7004CriteriaDomain} <br />設定した{@link W7004CriteriaDomain}
     * @throws IOException If the configuration of the domain can not be<br />ドメインの設定ができない場合
     */
    protected W7004CriteriaDomain prepareCriteriaDomain (W7004ActionForm form, ByteArrayOutputStream byteOutStrm) throws IOException {
        W7004CriteriaDomain criteriaDomain = form.getW7004CriteriaDomain();
         // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        criteriaDomain.setFileData(byteOutStrm);
        
        return criteriaDomain;
    }
}
