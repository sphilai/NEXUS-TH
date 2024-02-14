/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7006CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7006NonWoodenViewFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of Non Wooden Upload action for Shipping Document Upload screen.
 * <br />船積書類アップロード画面のNon Wooden Uploadアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"error": /W7006
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7006NonWoodenViewAction extends W7006AbstractAction {

    /**
     * C / O View Facade Service
     * <br />C/O View Facadeサービス
     */
    protected ProcessFacadeService<OutputStream, W7006CriteriaDomain> w7006NonWoodenViewFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7006NonWoodenViewAction() {
        super();
    }

    /**
     * Setter method for w7006NonWoodenViewFacadeService.
     *
     * @param nonWoodenViewFacadeService Set for w7006NonWoodenViewFacadeService
     */
    public void setW7006NonWoodenViewFacadeService(ProcessFacadeService<OutputStream, W7006CriteriaDomain> nonWoodenViewFacadeService) {
        w7006NonWoodenViewFacadeService = nonWoodenViewFacadeService;
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
     * ‐Set of search criteria domain
     *     Set the {@link W7006CriteriaDomain}.
     * 
     * ‐Getting FILE DATA
     *     Call the {@link W7006NonWoodenViewFacadeServiceImpl}.
     * 
     * ‐Display of the obtained file
     *     To be displayed in the Viewer retrieved files in.
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link W7006CriteriaDomain}を設定します。
     * 
     * ‐ファイルデータの取得
     *     {@link W7006NonWoodenViewFacadeServiceImpl}を呼出します。
     * 
     * ‐取得したファイルの表示
     *     取得したファイルをViewerに表示する
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W7006ActionForm w7006Form = (W7006ActionForm) form;
        
        ByteArrayOutputStream byteOutStrm = new ByteArrayOutputStream();
        W7006CriteriaDomain criteriaDomain = prepareCriteriaDomain(w7006Form, byteOutStrm);
        
        w7006NonWoodenViewFacadeService.process(criteriaDomain);
        
        ActionUtil.downloadBinary(byteOutStrm.toByteArray(), criteriaDomain.getNonWdFileName(), response);
        
        byteOutStrm.close();
        
        return null;
    }
    
    /**
     * Set the {@link W7006CriteriaDomain}.
     * <br />{@link W7006CriteriaDomain}を設定します。
     *
     * @param form Action Form of Shipping Document Upload screen<br />
     * 船積書類アップロード画面のアクションフォーム
     * @param byteOutStrm Output stream<br />
     * 出力ストリーム
     * @return  {@link W7006CriteriaDomain} It set up.<br />
     * 設定した{@link W7006CriteriaDomain}
     * @throws IOException If can not set the domain<br />
     * ドメインの設定ができない場合
     */
    protected W7006CriteriaDomain prepareCriteriaDomain (W7006ActionForm form, ByteArrayOutputStream byteOutStrm) throws IOException {
        W7006CriteriaDomain criteriaDomain = form.getW7006CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        criteriaDomain.setViewData(byteOutStrm);
        
        return criteriaDomain;
    }
}
