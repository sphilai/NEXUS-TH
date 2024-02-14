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
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.business.domain.W9023CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Action class of Register of Invoice Template MA Edit screen.
 * <br />Invoice Template MA Edit画面のRegisterアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9023RegisterAction extends W9023AbstractAction {

    /**
     * Register Facade Service
     * <br />Register Facadeサービス
     */
    protected CreateFacadeService<W9023CriteriaDomain, W9023CriteriaDomain> w9023RegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9023RegisterAction() {
        super();
    }
    
    /**
     * Setter method for w9023RegisterFacadeService.
     *
     * @param registerFacadeService Set for w9023RegisterFacadeService
     */
    public void setW9023RegisterFacadeService(CreateFacadeService<W9023CriteriaDomain, W9023CriteriaDomain> registerFacadeService) {
        w9023RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */

    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9023ActionForm w9023Form = (W9023ActionForm) form;
        
        // Configuring Domain.
        // ドメインの設定
        W9023CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9023Form);
        
        // Register
        W9023CriteriaDomain resultDomain = w9023RegisterFacadeService.create(criteriaDomain);
        
        addGlobalMessage(request, GSCM_I0_0008, resultDomain.getCreateCount(), resultDomain.getUpdateCount());
        
        // search (for edit mode)
        request.setAttribute("company", criteriaDomain.getCompany());
        request.setAttribute("documentNo", criteriaDomain.getDocNo());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create {@link W9023CriteriaDomain}.
     * <br />{@link W9023CriteriaDomain}を作成します。
     *
     * @param form Action Form of Export Ship to Shipping MA Edit screen <br />Export Ship to Shipping MA Edit画面のアクションフォーム
     * @return  {@link W9023CriteriaDomain} <br />作成した{@link W9023CriteriaDomain}
     */
    protected W9023CriteriaDomain prepareCriteriaDomain(W9023ActionForm form) {
        W9023CriteriaDomain criteriaDomain = form.getW9023CriteriaDomain();
    
        Timestamp comUpdateTimestamp = criteriaDomain.getComUpdateTimestamp();
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // 条件ドメインの設定
        criteriaDomain.setProcMode(form.getProcMode());
        criteriaDomain.setComUpdateTimestamp(comUpdateTimestamp);
        
        try {
            if (form.getMaster1() != null) {
                criteriaDomain.setMaster1FileStream(form.getMaster1().getInputStream());
                criteriaDomain.setMaster1(form.getMaster1().getFileName());
                criteriaDomain.setMaster1FileSize(form.getMaster1().getFileSize());
            }
            if (form.getMaster5() != null) {
                criteriaDomain.setMaster5FileStream(form.getMaster5().getInputStream());
                criteriaDomain.setMaster5(form.getMaster5().getFileName());
                criteriaDomain.setMaster5FileSize(form.getMaster5().getFileSize());
            }
            if (form.getMaster6() != null) {
                criteriaDomain.setMaster6FileStream(form.getMaster6().getInputStream());
                criteriaDomain.setMaster6(form.getMaster6().getFileName());
                criteriaDomain.setMaster6FileSize(form.getMaster6().getFileSize());
            }
            if (form.getMaster9() != null) {
                criteriaDomain.setMaster9FileStream(form.getMaster9().getInputStream());
                criteriaDomain.setMaster9(form.getMaster9().getFileName());
                criteriaDomain.setMaster9FileSize(form.getMaster9().getFileSize());
            }
            if (form.getMaster12() != null) {
                criteriaDomain.setMaster12FileStream(form.getMaster12().getInputStream());
                criteriaDomain.setMaster12(form.getMaster12().getFileName());
                criteriaDomain.setMaster12FileSize(form.getMaster12().getFileSize());
            }
            if (form.getMaster13() != null) {
                criteriaDomain.setMaster13FileStream(form.getMaster13().getInputStream());
                criteriaDomain.setMaster13(form.getMaster13().getFileName());
                criteriaDomain.setMaster13FileSize(form.getMaster13().getFileSize());
            }
        } catch (FileNotFoundException e) {
            throw new SystemException(NXS_91_0001);
        } catch (IOException e) {
            throw new SystemException(NXS_91_0001);
        }
        return criteriaDomain;
    }
}
