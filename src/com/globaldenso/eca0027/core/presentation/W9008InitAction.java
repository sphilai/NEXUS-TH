/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_COPY_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_NEW;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9007R;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9007;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9008UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The initial display of class action Export Ship to Shipping MA Edit screen.
 * <br />Export Ship to Shipping MA Edit画面の初期表示アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W9008
 * </pre>
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9008InitAction extends W9008AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected TransactFacadeService<W9008UpdateDomain, W9008CriteriaDomain> w9008InitFacadeService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9008InitAction() {
        super();
    }
    
    /**
     * Setter method for w9008InitFacadeService.
     *
     * @param initFacadeService Set for w9008InitFacadeService
     */
    public void setW9008InitFacadeService(TransactFacadeService<W9008UpdateDomain, W9008CriteriaDomain> initFacadeService) {
        w9008InitFacadeService = initFacadeService;
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
        
        W9008CriteriaDomain criteriaDomain = prepareCriteriaDomain(w9008Form);
        
        // Get the document template Vessel product per unit of the pull-down list.
        // 船積書類テンプレート原単位プルダウンリストの設定
        super.searchInvTemplatePullDownList(request, criteriaDomain.getShipperCd());
        super.controlDisplay(w9008Form, request);
        
        W9008UpdateDomain updateDomain = w9008InitFacadeService.transact(criteriaDomain);
        
        CommonUtil.copyPropertiesDomainToDomain(w9008Form.getW9008CriteriaDomain(), updateDomain.getCriteriaDomain());
        w9008Form.setListDomainList(updateDomain.getListDomainList());
        
        w9008Form.getW9008CriteriaDomain().setLanguageCd(w9008Form.getLanguageCd());
        if (w9008Form.getListDomainList() != null) {
            for (W9008ListDomain listDomain : w9008Form.getListDomainList()) {
                listDomain.setLanguageCd(w9008Form.getLanguageCd());
            }
        }
        
        if (MODE_NEW.equals(w9008Form.getW9008CriteriaDomain().getProcMode())
            || MODE_COPY_NEW.equals(w9008Form.getW9008CriteriaDomain().getProcMode())) {
            w9008Form.setRegisterFlg(true);
        } else {
            w9008Form.setRegisterFlg(false);
        }
        
        return FORWARD_SUCCESS;
    }

    /**
     * Set the {@link W9008CriteriaDomain}.
     * <br />{@link W9008CriteriaDomain}を設定します。
     *
     * @param form Action Form of Export Ship to Shipping MA Edit screen <br /> Export Ship to Shipping MA Edit画面のアクション・フォーム
     * @return  {@link W9008CriteriaDomain} It set up. <br />設定した{@link W9008CriteriaDomain}
     * @throws ApplicationException Erroe occured.
     */
    protected W9008CriteriaDomain prepareCriteriaDomain (W9008ActionForm form) throws ApplicationException {
        W9008CriteriaDomain criteriaDomain = form.getW9008CriteriaDomain();
        
        WindowInfoDomain windowInfo = (WindowInfoDomain) DensoContext.get().getGeneralArea(form.getWindowId());
        ScreenInfoDomain screenInfo = (ScreenInfoDomain) windowInfo.getScreenInfo().get(SCREEN_ID_W9007);
        
        if (screenInfo != null) {
            W9007ActionForm w9007Form = (W9007ActionForm) screenInfo.getActionForm();
            CommonUtil.copyPropertiesActionFormToDomain(criteriaDomain, w9007Form);
        }
        
        // Set common information
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Check user authority.
        // 権限チェック
        if (userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9007R, criteriaDomain.getShipperCd())) {
            criteriaDomain.setUserAuthForComp(FLAG_Y);
        } else {
            criteriaDomain.setUserAuthForComp(FLAG_N);
        }
        
        return criteriaDomain;
    }
}
