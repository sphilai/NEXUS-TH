/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_BROWSE_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.AUTH_REGISTER_NUMERIC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W8001B;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W8003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8003ListDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Action class of initial display of the case mark Progress Control list screen.
 * <br />進度管理ケースマーク一覧画面の初期表示アクションクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8003InitAction extends W8003AbstractAction {

    /**
     * Initial display Facade Service
     * <br />初期表示Facadeサービス
     */
    protected SearchFacadeService<List<? extends W8003ListDomain>, W8003CriteriaDomain> w8003InitFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8003InitAction() {
        super();
    }

    /**
     * Setter method for w8003InitFacadeService.
     *
     * @param initFacadeService Set for w8003InitFacadeService
     */
    public void setW8003InitFacadeService(
        SearchFacadeService<List<? extends W8003ListDomain>, W8003CriteriaDomain> initFacadeService) {
        w8003InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Display the initial Progress Control case mark list screen.
     *     
     * </pre>
     * <pre>
     * ‐進度管理ケースマーク一覧画面に初期表示します。
     *     
     * </pre>
     * @see com.globaldenso.eca0027.core.presentation.W8003AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W8003ActionForm w8003Form = prepareForm((W8003ActionForm)form);

        W8003CriteriaDomain criteriaDomain = prepareCriteriaDomain(w8003Form);
        
        criteriaDomain.setSelectSort("3");
        
        List<? extends W8003ListDomain> listDomainList = w8003InitFacadeService.search(criteriaDomain);
        
        w8003Form.setW8003CriteriaDomain(criteriaDomain);
        
        w8003Form.setW8003ListDomainList(listDomainList);
        
        return FORWARD_SUCCESS;
    }
    /**
     * Set the action form.
     * <br />アクションフォームの設定をします。
     *
     * @param form Action Form<br />
     * アクションフォーム
     * @return Action Form<br />
     * アクションフォーム
     */
    protected W8003ActionForm prepareForm(W8003ActionForm form) {
        form.setW8003ListDomainList(null);
        
        return form;
    }

    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException If it fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W8003CriteriaDomain prepareCriteriaDomain(W8003ActionForm form) 
        throws ApplicationException {
        W8003CriteriaDomain criteriaDomain = form.getW8003CriteriaDomain();
        // Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        // Set user authority.
        // 権限の設定
        if (userAuthService.hasRegisterAll()) {
            criteriaDomain.setUserAuthList(null);
            criteriaDomain.setAuthFlag(AUTH_REGISTER_NUMERIC);
            
        } else if (userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
            criteriaDomain.setAuthFlag(AUTH_BROWSE_NUMERIC);
            
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W8001B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }

        return criteriaDomain;
    }
}
