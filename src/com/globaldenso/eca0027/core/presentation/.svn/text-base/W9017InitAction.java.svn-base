/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9016R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9016;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.business.domain.W9008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9017CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial display of class action Export Shipping Item Special Information MA Edit screen.
 * <br />Export Shipping Item Special Information MA Edit画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9017
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9017InitAction extends W9017AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected SearchFacadeService<W9017CriteriaDomain, W9017CriteriaDomain> w9017InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9017InitAction() {
        super();
    }
    
    /**
     * Setter method for w9017InitFacadeService.
     *
     * @param initFacadeService Set for w9017InitFacadeService
     */
    public void setW9017InitFacadeService(SearchFacadeService<W9017CriteriaDomain, W9017CriteriaDomain> initFacadeService) {
        w9017InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9017ActionForm w9017Form = (W9017ActionForm) form;

        W9017CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9017Form);
        
        // Check process mode.
        if (userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9016R, criteriaDomain.getCompCd())) {
            if (MODE_NEW.equals(criteriaDomain.getProcMode())) {
                criteriaDomain.setProcMode(MODE_NEW);
            } else if (MODE_EDIT_REF.equals(criteriaDomain.getProcMode())) {
                criteriaDomain.setProcMode(MODE_EDIT);
            } else if (MODE_COPY_NEW.equals(criteriaDomain.getProcMode())) {
                criteriaDomain.setProcMode(MODE_COPY_NEW);
            } else {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
        } else {
            if(MODE_EDIT_REF.equals(criteriaDomain.getProcMode())){
                criteriaDomain.setProcMode(MODE_REF);
            } else {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
        }
        w9017Form.setW9017CriteriaDomain(w9017InitFacadeService.search(criteriaDomain));

        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W9008CriteriaDomain}.
     * <br />{@link W9008CriteriaDomain}を設定します。
     *
     * @param form Action Form of Export Shipping Item Special Information MA Edit screen <br />Export Shipping Item Special Information MA Edit画面のアクション・フォーム
     * @return  {@link W9017CriteriaDomain} have set <br />設定した{@link W9017CriteriaDomain}
     */
    protected W9017CriteriaDomain prepareCriteriaDomain (W9017ActionForm form) {
        
        W9017CriteriaDomain criteriaDomain = form.getW9017CriteriaDomain();
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W9016);
        
        // Set Condition domain.
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());

        if (screenInfo != null) {
            W9016ActionForm w9016Form = (W9016ActionForm) screenInfo.getActionForm();
            CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w9016Form);
            criteriaDomain.setSelected(w9016Form.getW9016CriteriaDomain().getSelected());
        }
        return criteriaDomain;
    }
}
