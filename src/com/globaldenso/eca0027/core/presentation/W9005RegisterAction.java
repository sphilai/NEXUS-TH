/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0006;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0008;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9005UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The class action Register of User ID MA Edit screen.
 * <br />User ID MA Edit画面のRegisterアクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9005RegisterAction extends W9005AbstractAction {

    /**
     * Register Facade Service
     * <br />Register Facadeサービス
     */
    protected TransactFacadeService<W9005UpdateDomain, W9005UpdateDomain> w9005RegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9005RegisterAction() {
        super();
    }

    /**
     * Setter method for w9005RegisterFacadeService.
     *
     * @param registerFacadeService Set for w9005RegisterFacadeService
     */
    public void setW9005RegisterFacadeService(
        TransactFacadeService<W9005UpdateDomain, W9005UpdateDomain> registerFacadeService) {
        w9005RegisterFacadeService = registerFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9005ActionForm w9005Form = (W9005ActionForm) form;

        W9005UpdateDomain updateDomain = prepareUpdateDomain(w9005Form);
        
        W9005UpdateDomain upDomain = w9005RegisterFacadeService.transact(updateDomain);
        
        if (upDomain != null) {
            // Set result.
            // 検索結果を画面に設定
            W9005CriteriaDomain criteriaDomain = w9005Form.getW9005CriteriaDomain();
            criteriaDomain.setDscId(upDomain.getCriteriaDomain().getDscId());
            criteriaDomain.setUsrNmEn(upDomain.getCriteriaDomain().getUsrNmEn());
            criteriaDomain.setMailAdd1(upDomain.getCriteriaDomain().getMailAdd1());
            criteriaDomain.setCompCd(upDomain.getCriteriaDomain().getCompCd());
            criteriaDomain.setLastUpdate(upDomain.getCriteriaDomain().getLastUpdate());
            criteriaDomain.setPrmDscId(upDomain.getCriteriaDomain().getPrmDscId());
            // Change the mode to MODE_EDIT_REF from MODE_NEW.
            // 新規モードを修正・参照モードに変更
            if (MODE_NEW.equals(criteriaDomain.getFunctionNo())) {
                criteriaDomain.setFunctionNo(MODE_EDIT_REF);
                addGlobalMessage(request, GSCM_I0_0008, updateDomain.getCreateCount());
            }else{
                addGlobalMessage(request, GSCM_I0_0006, updateDomain.getUpdateCount());
            }
            
            super.controlDisplay(w9005Form, request);
            
            criteriaDomain.setEnabledRefer(true);
            
            w9005Form.setAreaDomain(upDomain.getAreaDomain());
            w9005Form.setCompListDomain(upDomain.getCompListDomain());
            w9005Form.setPlantListDomain(upDomain.getPlantListDomain());
        }
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9005CriteriaDomain}.
     * <br />{@link W9005CriteriaDomain}を作成します。
     *
     * @param form Action Form of Agent MA Edit screen <br />Agent MA Edit画面のアクションフォーム
     * @return  {@link W9005CriteriaDomain} It created <br />作成した{@link W9005CriteriaDomain}
     */
    protected W9005UpdateDomain prepareUpdateDomain(W9005ActionForm form) {
        
        W9005UpdateDomain updateDomain = new W9005UpdateDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setCriteriaDomain(form.getW9005CriteriaDomain());
        updateDomain.setAreaDomain(form.getAreaDomain());
        updateDomain.setCompListDomain(form.getCompListDomain());
        updateDomain.setPlantListDomain(form.getPlantListDomain());
        
        return updateDomain;
    }
}
