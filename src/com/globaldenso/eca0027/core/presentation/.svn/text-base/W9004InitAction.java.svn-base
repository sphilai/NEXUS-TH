/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MODE_REF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_AREA_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_COMP_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.ROLE_PLNT_ADMIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9005;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9004CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * Action class of initial display of User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面の初期表示アクションクラスです。
 *  * <pre>
 * forward name-path mapping
 *     ‐ "success":W9004
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W9004InitAction extends W9004AbstractAction {

    /**
     * Search Facade Service
     * <br />検索Facadeサービス
     */
    protected ProcessFacadeService<Void, W9004CriteriaDomain> w9004InitFacadeService;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9004InitAction() {
        super();
    }

    /**
     * Setter method for w9004InitFacadeService.
     *
     * @param initFacadeService Set for w9004InitFacadeService
     */
    public void setW9004InitFacadeService(
        ProcessFacadeService<Void, W9004CriteriaDomain> initFacadeService) {
        w9004InitFacadeService = initFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * - Display control
     *     Active control of the screen item ({@link W9004AbstractAction#controlDisplay(W9004ActionForm, HttpServletRequest)})
     *     Hide the search results area
     * - 表示制御
     *     画面項目の活性制御を行う ({@link W9004AbstractAction#controlDisplay(W9004ActionForm, HttpServletRequest)})
     *     検索結果エリアを非表示にする
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9004ActionForm w9004Form = (W9004ActionForm) form;
        
        // Check authority
        if (!userAuthService.hasRole(ROLE_AREA_ADMIN) 
            && !hasRoleForCompany(ROLE_COMP_ADMIN, w9004Form.getOwnerCompCd(), w9004Form.getUserAuthList())
            && !hasRoleForCompany(ROLE_PLNT_ADMIN, w9004Form.getOwnerCompCd(), w9004Form.getUserAuthList())) {
            w9004Form.setFunctionNo(MODE_REF);
            w9004Form.setDscId(w9004Form.getLoginUserDscId());
            return SCREEN_ID_W9005;
        }
        // reset result list.
        w9004Form.setListDomainList(null);
        
        return FORWARD_SUCCESS;
    }
}
