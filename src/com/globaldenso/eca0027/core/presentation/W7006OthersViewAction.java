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
import com.globaldenso.eca0027.core.business.domain.W7006UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7006OthersViewFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class action Others Upload of Shipping Document Upload screen.
 * <br />船積書類アップロード画面のOthers Uploadアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"error": /W7006
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7006OthersViewAction extends W7006AbstractAction {

    /**
     * Others View Facade Service
     * <br />Others View Facadeサービス
     */
    protected ProcessFacadeService<OutputStream, W7006UpdateDomain> w7006OthersViewFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7006OthersViewAction() {
        super();
    }
    
    /**
     * Setter method for w7006OthersViewFacadeService.
     *
     * @param othersViewFacadeService Set for w7006OthersViewFacadeService
     */
    public void setW7006OthersViewFacadeService(ProcessFacadeService<OutputStream, W7006UpdateDomain> othersViewFacadeService) {
        w7006OthersViewFacadeService = othersViewFacadeService;
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
     *     Call the {@link W7006OthersViewFacadeServiceImpl}.
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
     *     {@link W7006OthersViewFacadeServiceImpl}を呼出します。
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
        W7006UpdateDomain updateDomain = prepareCriteriaDomain(w7006Form, byteOutStrm);
        // Get file data.
        // ファイルデータの取得
        w7006OthersViewFacadeService.process(updateDomain);
        // Download binary file.
        // 取得したファイルの表示
        int selectedRow = w7006Form.getW7006CriteriaDomain().getSelectedRow();
        String selectedFileName = w7006Form.getListDomainList().get(selectedRow).getFileName();
        ActionUtil.downloadBinary(byteOutStrm.toByteArray(), selectedFileName, response);
        
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
     * @return  {@link W7006CriteriaDomain}  It set up.<br />
     * 設定した{@link W7006CriteriaDomain}
     * @throws IOException If can not set the domain<br />
     * ドメインの設定ができない場合
     */
    protected W7006UpdateDomain prepareCriteriaDomain (W7006ActionForm form, ByteArrayOutputStream byteOutStrm) throws IOException {
        W7006UpdateDomain updateDomain = new W7006UpdateDomain();
        W7006CriteriaDomain criteriaDomain = form.getW7006CriteriaDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());

        criteriaDomain.setViewData(byteOutStrm);
        
        updateDomain.setW7006CriteriaDomain(criteriaDomain);
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
