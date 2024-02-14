/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7005CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7005ViewFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of view action of B / L Update screen.
 * <br />船荷証券更新画面のViewアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"error": /W7005
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7005ViewAction extends W7005AbstractAction {

    /**
     * View Facade Service
     * <br />View Facadeサービス
     */
    protected ProcessFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> w7005ViewFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7005ViewAction() {
        super();
    }
    
    /**
     * Setter method for w7005ViewFacadeService.
     *
     * @param viewFacadeService Set for w7005ViewFacadeService
     */
    public void setW7005ViewFacadeService(ProcessFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> viewFacadeService) {
        w7005ViewFacadeService = viewFacadeService;
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
     *     Set the i{@link W7005CriteriaDomain}.
     * 
     * ‐FILE DATA acquisition
     *     Call {@link W7005ViewFacadeServiceImpl}.
     * 
     * ‐Display of the obtained file
     *     Displayed in the Viewer file that obtained.
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link W7005CriteriaDomain}を設定します。
     * 
     * ‐ファイルデータ取得
     *     {@link W7005ViewFacadeServiceImpl}を呼び出します。
     * 
     * ‐取得したファイルの表示 
     *     取得したファイルをViewerに表示します。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W7005ActionForm w7005Form = (W7005ActionForm) form;
        
        ByteArrayOutputStream byteOutStrm = new ByteArrayOutputStream();
        W7005CriteriaDomain criteriaDomain = prepareCriteriaDomain(w7005Form, byteOutStrm);
        // Get file data.
        // ファイルデータの取得
        w7005ViewFacadeService.process(criteriaDomain);
        // Download  the binary file.
        // 取得したファイルの表示
        ActionUtil.downloadBinary(byteOutStrm.toByteArray(), criteriaDomain.getFileName(), response);
        
        return null;
    }

    /**
     * Set the {@link W7005CriteriaDomain}.
     * <br />{@link W7005CriteriaDomain}を設定します。
     *
     * @param form Action Form of B / L Update screen<br />
     * 船荷証券更新画面のアクションフォーム
     * @param byteOutStrm Output stream<br />
     * 出力ストリーム
     * @return  {@link W7005CriteriaDomain} It set up.<br />
     * 設定した{@link W7005CriteriaDomain}
     * @throws IOException If can not set the domain<br />
     * ドメインの設定ができない場合
     */
    protected W7005CriteriaDomain prepareCriteriaDomain(W7005ActionForm form, ByteArrayOutputStream byteOutStrm) throws IOException {
        W7005CriteriaDomain criteriaDomain = form.getW7005CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        criteriaDomain.setOutStream(byteOutStrm);
        
        return criteriaDomain;
    }
}
