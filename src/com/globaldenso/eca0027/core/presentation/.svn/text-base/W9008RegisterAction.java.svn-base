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

import com.globaldenso.eca0027.core.business.domain.W9008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * 
 * <br />Export Ship to Shipping MA Edit画面のRegisterアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9008RegisterAction extends W9008AbstractAction {

    /**
     * The class action Register of Export Ship to Shipping MA Edit screen.
     * <br />Register Facadeサービス
     */
    protected TransactFacadeService<Integer, W9008UpdateDomain> w9008RegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9008RegisterAction() {
        super();
    }

    /**
     * Setter method for w9008RegisterFacadeService.
     *
     * @param registerFacadeService Set for w9008RegisterFacadeService
     */
    public void setW9008RegisterFacadeService(
        TransactFacadeService<Integer, W9008UpdateDomain> registerFacadeService) {
        w9008RegisterFacadeService = registerFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9008ActionForm w9008Form = (W9008ActionForm) form;
        
        W9008UpdateDomain updateDomain = prepareUpdateDomain(w9008Form);
        
        int updateCount = w9008RegisterFacadeService.transact(updateDomain);
        String procMode = updateDomain.getCriteriaDomain().getProcMode();
        if (MODE_NEW.equals(procMode) || MODE_COPY_NEW.equals(procMode)) {
            addGlobalMessage(request, GSCM_I0_0008, updateCount);
        } else if (MODE_EDIT.equals(procMode)) {
            addGlobalMessage(request, GSCM_I0_0006, updateCount);
        }

        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9008UpdateDomain}.
     * <br />{@link W9008UpdateDomain}を作成します。
     *
     * @param form Action Form of Export Ship to Shipping MA Edit screen <br />Export Ship to Shipping MA Edit画面のアクションフォーム
     * @return  {@link W9008UpdateDomain} It createds <br />作成した{@link W9008UpdateDomain}
     */
    protected W9008UpdateDomain prepareUpdateDomain(W9008ActionForm form) {
        W9008UpdateDomain updateDomain = new W9008UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9008CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
