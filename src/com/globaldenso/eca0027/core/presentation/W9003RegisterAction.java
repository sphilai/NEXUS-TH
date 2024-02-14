/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9003UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Register action class of Agent MA Edit screen.
 * <br />Agent MA Edit画面のRegisterアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9003RegisterAction extends W9003AbstractAction {

    /**
     * Register Facade Service<br />
     * Register Facadeサービス
     */
    protected TransactFacadeService<Integer, W9003UpdateDomain> w9003RegisterFacadeService;
    
    /**
     * Default constructor
     * <br />デフォルトコンストラクタです。
     */
    public W9003RegisterAction() {
        super();
    }

    /**
     * Setter method for w9003RegisterFacadeService.
     *
     * @param registerFacadeService Set for w9003RegisterFacadeService
     */
    public void setW9003RegisterFacadeService(TransactFacadeService<Integer, W9003UpdateDomain> registerFacadeService) {
        w9003RegisterFacadeService = registerFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W9003ActionForm w9003Form = (W9003ActionForm) form;
        
        W9003UpdateDomain updateDomain = prepareUpdateDomain(w9003Form);
        
        int updateCount = w9003RegisterFacadeService.transact(updateDomain);
        
        String procMode = updateDomain.getCriteriaDomain().getProcMode();
        if (MODE_NEW.equals(procMode) || MODE_COPY_NEW.equals(procMode)) {
            addGlobalMessage(request, GSCM_I0_0008, updateCount);
        } else if (MODE_EDIT.equals(procMode)) {
            // Delete Complete Message
            addGlobalMessage(request, GSCM_I0_0006, updateCount);
        }
        
        return FORWARD_SUCCESS;
    }

    /**
     * Make  {@link W9003CriteriaDomain}
     * <br />{@link W9003CriteriaDomain}を作成します。
     *
     * @param form Action form of Agent MA Edit screen<br />
     * Agent MA Edit画面のアクションフォーム
     * @return  {@link W9003CriteriaDomain} after creation<br />
     * 作成した{@link W9003CriteriaDomain}
     */
    protected W9003UpdateDomain prepareUpdateDomain(W9003ActionForm form) {
        
        W9003UpdateDomain updateDomain = new W9003UpdateDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9003CriteriaDomain());
        
        return updateDomain;
    }
}
