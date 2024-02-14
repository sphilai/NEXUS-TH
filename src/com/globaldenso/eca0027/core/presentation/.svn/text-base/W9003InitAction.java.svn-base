/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9002;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_EDIT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9002R;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9003UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Action class for initial display of Agent MA Edit screen.
 * <br />Agent MA Edit画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9003
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9003InitAction extends W9003AbstractAction {

    /**
     * Initial display Facade Service<br />
     * 初期表示Facadeサービス
     */
    protected TransactFacadeService<W9003UpdateDomain, W9003CriteriaDomain> w9003InitFacadeService;
    
    /**
     * Default constructor
     * <br />デフォルトコンストラクタです。
     */
    public W9003InitAction() {
        super();
    }

    /**
     * Setter method for w9003InitFacadeService.
     *
     * @param initFacadeService Set for w9003InitFacadeService
     */
    public void setW9003InitFacadeService(
        TransactFacadeService<W9003UpdateDomain, W9003CriteriaDomain> initFacadeService) {
        w9003InitFacadeService = initFacadeService;
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
        
        W9003CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9003Form);

        // Check proc mode.
        String mode = checkProcMode(criteriaDomain.getFunctionNo(), criteriaDomain.getOrgCompCd());
        criteriaDomain.setProcMode(mode);
        
        W9003UpdateDomain updateDomain = w9003InitFacadeService.transact(criteriaDomain);
        
        CommonUtil.copyPropertiesDomainToDomain(
            w9003Form.getW9003CriteriaDomain(), updateDomain.getCriteriaDomain());
        
        w9003Form.getW9003CriteriaDomain().setLanguageCd(w9003Form.getLanguageCd());        
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Set {@link W9003CriteriaDomain}
     * <br />{@link W9003CriteriaDomain}を設定します。
     *
     * @param form Action Form of Export Ship to Shipping MA Edit screen<br />
     * Export Ship to Shipping MA Edit画面のアクション・フォーム
     * @return   {@link W9003CriteriaDomain} after setting<br />設定した{@link W9003CriteriaDomain}
     * 
     */
    protected W9003CriteriaDomain prepareCriteriaDomain (W9003ActionForm form) {

        W9003CriteriaDomain criteriaDomain = form.getW9003CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 条件ドメインの設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W9002);
        
        if (screenInfo != null) {
            W9002ActionForm w9002Form = (W9002ActionForm) screenInfo.getActionForm();
            CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w9002Form);
        }
        
        return criteriaDomain;
    }
    
    /**
     * 
     * Check process mode.
     * 
     * @param functionNo function no.
     * @param orgCompCd original company code.
     * @return process mode.
     * @throws ApplicationException ApplicationException
     */
    protected String checkProcMode(String functionNo, String orgCompCd) throws ApplicationException {
        if (MODE_NEW.equals(functionNo)) {
            return MODE_NEW;
        } else if (MODE_EDIT.equals(functionNo)) {
            if (userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9002R, orgCompCd)) {
                return MODE_EDIT;
            } else {
                return MODE_REF;
            }
        }
        return MODE_REF;
    }
}
