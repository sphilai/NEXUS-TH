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
import com.globaldenso.eca0027.core.business.domain.W7007UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W7007OthersUploadFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class action Others Upload of B / L upload screen.
 * <br />B/Lアップロード画面のOthers Uploadアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W7007
 *     ‐"error": W7007
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7007OthersUploadAction extends W7007AbstractAction {

    /**
     * Others Upload Facade Service
     * <br />Others Upload Facadeサービス
     */
    protected CreateFacadeService<W7007UpdateDomain, W7007UpdateDomain> w7007OthersUploadFacadeService;
    
    /**
     * Is the default constructor
     * <br />デフォルトコンストラクタです。
     */
    public W7007OthersUploadAction() {
        super();
    }
    
    /**
     * Setter method for w7007OthersUploadFacadeService.
     *
     * @param othersUploadFacadeService Set for w7007OthersUploadFacadeService
     */
    public void setW7007OthersUploadFacadeService(CreateFacadeService<W7007UpdateDomain, W7007UpdateDomain> othersUploadFacadeService) {
        w7007OthersUploadFacadeService = othersUploadFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Setting the action form
     *     Call {@link #prepareForm(W7007ActionForm)}.
     * 
     * ‐Set of mass update domain
     *     Set the {@link W7007UpdateDomain}.
     * 
     * ‐File upload, search
     *     Call {@link W7007OthersUploadFacadeServiceImpl}.
     * 
     * ‐Set of search results
     * 
     * </pre>
     * <pre>
     * ‐アクションフォームの設定
     *     {@link #prepareForm(W7007ActionForm)}を呼び出します。
     * 
     * ‐一括更新ドメインの設定
     *     {@link W7007UpdateDomain}を設定します。
     * 
     * ‐ファイルのアップロード、再検索
     *     {@link W7007OthersUploadFacadeServiceImpl}を呼び出します。
     * 
     * ‐検索結果の設定
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W7007ActionForm w7007Form = prepareForm((W7007ActionForm) form); 
        
        W7007UpdateDomain updateDomain = prepareUpdateDomain(w7007Form);
        
        W7007UpdateDomain resultDomain = w7007OthersUploadFacadeService.create(updateDomain);
        
        w7007Form.setListDomainList(resultDomain.getListDomainList());
        
        addGlobalMessage(request, GSCM_I0_0008, resultDomain.getUpdateCount());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W7007UpdateDomain}.
     * <br />{@link W7007UpdateDomain}を設定します。
     *
     * @param form Action Form of B / L upload screen<br />
     * B/Lアップロード画面のアクションフォーム
     * @return  {@link W7007UpdateDomain} It set up.<br />
     * 設定した{@link W7007UpdateDomain}
     */
    protected W7007UpdateDomain prepareUpdateDomain(W7007ActionForm form) {
        W7007UpdateDomain updateDomain = new W7007UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
     
        updateDomain.setCriteriaDomain(form.getW7007CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        try {
            if (null != form.getOthersFileData()) {
                updateDomain.getCriteriaDomain().setUploadOthersFileData(form.getOthersFileData().getInputStream());
                updateDomain.getCriteriaDomain().setUploadOthersFileName(form.getOthersFileData().getFileName());
                updateDomain.getCriteriaDomain().setUploadOthersFileSize(form.getOthersFileData().getFileSize());
            }
        }  catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        
        return updateDomain;
    }
}
