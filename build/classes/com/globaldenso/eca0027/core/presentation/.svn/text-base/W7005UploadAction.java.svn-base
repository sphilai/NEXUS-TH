/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import com.globaldenso.ai.common.core.exception.SystemException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W7005CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7005UploadFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class of upload action for B / L Update screen.
 * <br />船荷証券更新画面のUploadアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7005
 *     ‐"error": /W7005
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7005UploadAction extends W7005AbstractAction {

    /**
     * Upload Facade Service
     * <br />Upload Facadeサービス
     */
    protected TransactFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> w7005UploadFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7005UploadAction() {
        super();
    }

    /**
     * Setter method for w7005UploadFacadeService.
     *
     * @param uploadFacadeService Set for w7005UploadFacadeService
     */
    public void setW7005UploadFacadeService(
        TransactFacadeService<W7005CriteriaDomain, W7005CriteriaDomain> uploadFacadeService) {
        w7005UploadFacadeService = uploadFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    @Override
    protected boolean isScreenInfoStack() {
        return true;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of search criteria domain
     *     Set the {@link W7005CriteriaDomain}.
     *     
     * ‐File upload, search
     *     Call the {@link W7005UploadFacadeServiceImpl}.
     * 
     * ‐Set of search results
     * 
     * ‐Screen display control
     *     Call the {@link #controlDisplay(W7005ActionForm, HttpServletRequest)}.
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link W7005CriteriaDomain}を設定します。
     *     
     * ‐ファイルのアップロード、再検索
     *     {@link W7005UploadFacadeServiceImpl}を呼出します。
     * 
     * ‐検索結果の設定
     * 
     * ‐画面表示制御
     *     {@link #controlDisplay(W7005ActionForm, HttpServletRequest)}を呼出します。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W7005ActionForm w7005Form = (W7005ActionForm) form;
        
        W7005CriteriaDomain criteriaDomain = prepareCriteriaDomain(w7005Form);

        W7005CriteriaDomain resultDomain = w7005UploadFacadeService.transact(criteriaDomain);
        
        setResult(w7005Form, resultDomain);
        
        addGlobalMessage(request, GSCM_I0_0008, resultDomain.getUpdateCount());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the search results.
     * <br />検索結果を設定します。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @param resultDomain Domain search results is stored<br />
     * 検索結果が格納されたドメイン
     */
    protected void setResult(W7005ActionForm form, W7005CriteriaDomain resultDomain) {
        W7005CriteriaDomain criteriaDomain = form.getW7005CriteriaDomain();

        criteriaDomain.setFileName(resultDomain.getFileName());
        criteriaDomain.setComUpdateTimestamp(resultDomain.getComUpdateTimestamp());
        
    }
    
    /**
     * Set the {@link W7005CriteriaDomain}.
     * <br />{@link W7005CriteriaDomain}を設定します。
     *
     * @param form Action Form of B / L Update screen<br />
     * 船荷証券更新画面のアクションフォーム
     * @return  {@link W7005CriteriaDomain} It set up.<br />
     * 設定した{@link W7005CriteriaDomain}
     */
    protected W7005CriteriaDomain prepareCriteriaDomain(W7005ActionForm form) {
        W7005CriteriaDomain criteriaDomain = form.getW7005CriteriaDomain();
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        
        // Set the initial value to business domain from CommonInfoDomain.
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
        
        try {
            if (null != form.getFormFileData()) {
                criteriaDomain.setUploadFileData(form.getFormFileData().getInputStream());
                criteriaDomain.setUploadFileName(form.getFormFileData().getFileName());
                criteriaDomain.setUploadFileSize(form.getFormFileData().getFileSize());
            }
        }  catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        
        return criteriaDomain;
    }
}
