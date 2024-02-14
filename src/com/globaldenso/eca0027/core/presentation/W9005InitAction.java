/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9004;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W9005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9005UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * The initial display of class action User ID MA Edit screen.
 * <br />User ID MA Edit画面の初期表示アクションクラスです。
 * 
 * <pre>
 * forward name-path mappings:
 *     - "success":W9005.jsp
 *     - "error":W9005.jsp
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9005InitAction extends W9005AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected SearchFacadeService<W9005UpdateDomain, W9005CriteriaDomain> w9005InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9005InitAction() {
        super();
    }

    /**
     * Setter method for w9005InitFacadeService.
     *
     * @param initFacadeService Set for w9005InitFacadeService
     */
    public void setW9005InitFacadeService(SearchFacadeService<W9005UpdateDomain, W9005CriteriaDomain> initFacadeService) {
        w9005InitFacadeService = initFacadeService;
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

        W9005CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9005Form);
        w9005Form.setW9005CriteriaDomain(criteriaDomain);

        super.controlDisplay(w9005Form, request);
        
        if (!MODE_NEW.equals(w9005Form.getW9005CriteriaDomain().getProcMode())) {
            W9005UpdateDomain upDomain = w9005InitFacadeService.search(criteriaDomain);
            // Not MODE_NEW
            // 検索結果を画面に設定(新規モード以外の場合)
            criteriaDomain.setDscId(upDomain.getCriteriaDomain().getDscId());
            criteriaDomain.setUsrNmEn(upDomain.getCriteriaDomain().getUsrNmEn());
            criteriaDomain.setMailAdd1(upDomain.getCriteriaDomain().getMailAdd1());
            criteriaDomain.setCompCd(upDomain.getCriteriaDomain().getCompCd());
            criteriaDomain.setLastUpdate(upDomain.getCriteriaDomain().getLastUpdate());
            criteriaDomain.setPrmDscId(upDomain.getCriteriaDomain().getPrmDscId());
            
            w9005Form.setAreaDomain(upDomain.getAreaDomain());
            w9005Form.setCompListDomain(upDomain.getCompListDomain());
            w9005Form.setPlantListDomain(upDomain.getPlantListDomain());
            
            criteriaDomain.setEnabledRefer(true);
        }
        
        return FORWARD_SUCCESS;
    }

    
    /**
     * Set the {@link W9005CriteriaDomain}.
     * <br />{@link W9005CriteriaDomain}を設定します。
     *
     * @param form Action Form of User ID MA Edit screen <br />User ID MA Edit画面のアクション・フォーム
     * @return  {@link W9005CriteriaDomain} It set up. <br />設定した{@link W9005CriteriaDomain}
     */
    protected W9005CriteriaDomain prepareCriteriaDomain (W9005ActionForm form) {
        W9005CriteriaDomain criteriaDomain = form.getW9005CriteriaDomain();
        
        String compCd = criteriaDomain.getCompCd();
        String usrNmEn = criteriaDomain.getUsrNmEn();
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        criteriaDomain.setCompCd(compCd);
        criteriaDomain.setUsrNmEn(usrNmEn);

        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W9004);
        
        if (screenInfo != null) {
            W9004ActionForm w9004Form = (W9004ActionForm) screenInfo.getActionForm();
            criteriaDomain.setDscId(w9004Form.getDscId());
            criteriaDomain.setFunctionNo(w9004Form.getFunctionNo());
        }
        
        return criteriaDomain;
    }

}
