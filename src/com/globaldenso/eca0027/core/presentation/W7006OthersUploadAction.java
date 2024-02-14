/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W7006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W7006UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7006OthersUploadFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class action Others Upload of Shipping Document Upload screen.
 * <br />船積書類アップロード画面のOthers Uploadアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": /W7006
 *     ‐"error": /W7006
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7006OthersUploadAction extends W7006AbstractAction {

    /**
     * Others Upload Facade Service
     * <br />Others Upload Facadeサービス
     */
    protected CreateFacadeService<W7006UpdateDomain, W7006UpdateDomain> w7006OthersUploadFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7006OthersUploadAction() {
        super();
    }

    /**
     * Setter method for w7006OthersUploadFacadeService.
     *
     * @param othersUploadFacadeService Set for w7006OthersUploadFacadeService
     */
    public void setW7006OthersUploadFacadeService(CreateFacadeService<W7006UpdateDomain, W7006UpdateDomain> othersUploadFacadeService) {
        w7006OthersUploadFacadeService = othersUploadFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of search criteria domain
     *     Set the {@link W7006CriteriaDomain}.
     * 
     * ‐File upload, search
     *     Call the {@link W7006OthersUploadFacadeServiceImpl}.
     * 
     * ‐Set of search results
     * 
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     {@link W7006CriteriaDomain}を設定します。
     * 
     * ‐ファイルのアップロード、再検索
     *     {@link W7006OthersUploadFacadeServiceImpl}を呼出します。
     * 
     * ‐検索結果の設定
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W7006ActionForm w7006Form = (W7006ActionForm) form;
        
        W7006UpdateDomain udpateDomain = prepareCriteriaDomain(w7006Form);
        
        W7006UpdateDomain resultDomain = w7006OthersUploadFacadeService.create(udpateDomain);
        
        w7006Form.setW7006CriteriaDomain(resultDomain.getW7006CriteriaDomain());
        w7006Form.setListDomainList(resultDomain.getListDomainList());
        
        addGlobalMessage(request, GSCM_I0_0008, resultDomain.getUpdateCount());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W7006UpdateDomain}.
     * <br />{@link W7006UpdateDomain}を設定します。
     *
     * @param form Action Form of Shipping Document Upload screen<br />
     * 船積書類アップロード画面のアクションフォーム
     * @return  {@link W7006UpdateDomain} It set up.<br />
     * 設定した{@link W7006UpdateDomain}
     */
    protected W7006UpdateDomain prepareCriteriaDomain (W7006ActionForm form) {
        W7006UpdateDomain updateDomain = new W7006UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setW7006CriteriaDomain(form.getW7006CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        try {
            int index = form.getW7006CriteriaDomain().getSelectedRow();
            if (null != form.getFileDataList(index)) {
                updateDomain.getListDomainList().get(index).setUploadFileData(form.getFileDataList(index).getInputStream());
                updateDomain.getListDomainList().get(index).setUploadFileName(form.getFileDataList(index).getFileName());
                updateDomain.getListDomainList().get(index).setUploadFileSize(form.getFileDataList(index).getFileSize());
            }

        }  catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        
        return updateDomain;
    }
}
