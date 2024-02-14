/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9019CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.CreateFacadeService;

/**
 * The class action Register of Export Formalities by Item MA Edit screen.
 * <br />Export Formalities by Item MA Edit画面のRegisterアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9019RegisterAction extends W9019AbstractAction {

    /**
     * Register Facade Service
     * <br />Register Facadeサービス
     */
    protected CreateFacadeService<Integer, W9019CriteriaDomain> w9019RegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9019RegisterAction() {
        super();
    }
    
    /**
     * Setter method for w9019RegisterFacadeService.
     *
     * @param registerFacadeService Set for w9019RegisterFacadeService
     */
    public void setW9019RegisterFacadeService(CreateFacadeService<Integer, W9019CriteriaDomain> registerFacadeService) {
        w9019RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9019ActionForm w9019Form = (W9019ActionForm) form;
        
        // Set of mass update domain.
        // 一括更新ドメインの設定
        W9019CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9019Form);
        
        // Execution of the registration process.
        // 登録処理の実行
        int updateCount = w9019RegisterFacadeService.create(criteriaDomain);
        
        if (MODE_NEW.equals(criteriaDomain.getMode()) || MODE_COPY_NEW.equals(criteriaDomain.getMode())) {
            addGlobalMessage(request, GSCM_I0_0008, updateCount);
        } else if (MODE_EDIT.equals(criteriaDomain.getMode())) {
            // Delete Complete Message
            addGlobalMessage(request, GSCM_I0_0006, updateCount);
        }
        
        // Transition to packing instruction Create screen.
        // 梱包指示Create画面へ遷移
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9019CriteriaDomain}
     * <br />{@link W9019CriteriaDomain}を作成します。
     *
     * @param form Action Form of Export Ship to Shipping MA Edit screen <br />Export Ship to Shipping MA Edit画面のアクションフォーム
     * @return  {@link W9019CriteriaDomain} It created <br />作成した{@link W9019CriteriaDomain}
     */
    protected W9019CriteriaDomain prepareCriteriaDomain(W9019ActionForm form) {
        W9019CriteriaDomain criteriaDomain = form.getW9019CriteriaDomain();
    
        // Set of common information screen.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
