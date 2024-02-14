/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9025B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9025R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9025CriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * Action class AddOrRefer of Actual Item No Weight MA Edit screen.
 * <br />Actual Item No Weight MA 画面のAddOrReferアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":W9025.jsp
 * </pre>
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 11574 $
 */
public class W9025AddOrReferAction extends W9025AbstractAction {

    /**
     * Add Facade Service
     * <br />Add Facadeサービス
     */
    protected SearchFacadeService<W9025CriteriaDomain, W9025CriteriaDomain> w9025AddOrReferFacadeService;

    /**
     * User function use authorization service
     * <br />ユーザ機能利用権限サービス
     */
    protected UserAuthService userAuthService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9025AddOrReferAction() {
        super();
    }

    /**
     * Setter method for w9025AddOrReferFacadeService.
     *
     * @param addOrReferFacadeService Set for w9025AddOrReferFacadeService
     */
    public void setW9025AddOrReferFacadeService(SearchFacadeService<W9025CriteriaDomain, W9025CriteriaDomain> addOrReferFacadeService) {
        w9025AddOrReferFacadeService = addOrReferFacadeService;
    }
    
    /**
     * Setter method for userAuthService.
     *
     * @param userAuthService Set for userAuthService
     */
    public void setUserAuthService(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9025ActionForm w9025Form = (W9025ActionForm) form;
        
        // Creation of search condition domain.
        // 検索条件ドメインの作成
        W9025CriteriaDomain criteriaDomain = prepareUpdateDomain(w9025Form);
        criteriaDomain.setEnableRegister(FLAG_N);
        
        // Get of data.
        // データ取得
        W9025CriteriaDomain resultDomain = w9025AddOrReferFacadeService.search(criteriaDomain);
        
        // Authority check.
        // 権限チェック
        boolean userAuthComp = userAuthService.hasUserAuthForComp(PERMIT_FUNC_ID_W9025R, criteriaDomain.getOwnerComp());
        resultDomain.setUserAuthForComp(userAuthComp);
        
        resultDomain.setEnableRegister(FLAG_Y);
        w9025Form.setW9025CriteriaDomain(resultDomain);
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create {@link W9025CriteriaDomain}.
     * <br />{@link W9025CriteriaDomain}を作成します。
     *
     * @param form Action Form <br />アクションフォーム
     * @return  {@link W9025CriteriaDomain} <br />作成した{@link W9025CriteriaDomain}
     * @throws ApplicationException 異常終了時
     */
    protected W9025CriteriaDomain prepareUpdateDomain(W9025ActionForm form)
        throws ApplicationException {
        
        W9025CriteriaDomain criteriaDomain = form.getW9025CriteriaDomain();
        
        // Set of common information screen.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        // Setting Permissions.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W9025R, PERMIT_FUNC_ID_W9025B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        return criteriaDomain;
    }
}
