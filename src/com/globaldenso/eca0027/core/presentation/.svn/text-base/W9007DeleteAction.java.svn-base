/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9007B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9007R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9007ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9007UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9007DeleteFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The class of delete action for Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W9007
 *     ‐"error": W9007
 *     ‐"W9007": /W9007Init.do
 * </pre>
 * @author $Author: 810833843 $
 * @version $Revision: 9587 $
 */
public class W9007DeleteAction extends W9007AbstractAction {

    /**
     * Delete Facade Service
     * <br />Delete Facadeサービス
     */
    protected DeleteFacadeService<W9007UpdateDomain, W9007UpdateDomain> w9007DeleteFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007DeleteAction() {
        super();
    }

    /**
     * Setter method for w9007DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w9007DeleteFacadeService
     */
    public void setW9007DeleteFacadeService(DeleteFacadeService<W9007UpdateDomain, W9007UpdateDomain> deleteFacadeService) {
        w9007DeleteFacadeService = deleteFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of mass update domain
     *     Set to {@link W9007UpdateDomain}.
     * 
     * ‐Execution of the removal process
     *     Call the {@link W9007DeleteFacadeServiceImpl}.
     * 
     * ‐一括更新ドメインの設定
     *     {@link W9007UpdateDomain}に設定します。
     * 
     * ‐削除処理の実行
     *     {@link W9007DeleteFacadeServiceImpl}を呼出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        W9007ActionForm w9007Form = (W9007ActionForm) form;

        W9007UpdateDomain updateDomain = prepareUpdateDomain(request, mapping, w9007Form);

        W9007UpdateDomain resultDomain = w9007DeleteFacadeService.delete(updateDomain);
        
        addGlobalMessage(request, GSCM_I0_0007, resultDomain.getUpdateCount());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Create a {@link W9007UpdateDomain}.
     * <br />{@link W9007UpdateDomain}を作成します。
     *
     * @param request HTTP request <br />HTTPリクエスト
     * @param mapping Action mapping <br />アクション・マッピング
     * @param form Action Form <br />アクション・フォーム
     * @return  {@link W9007UpdateDomain} It created<br />作成した{@link W9007UpdateDomain}
     * @throws ApplicationException error
     */
    protected W9007UpdateDomain prepareUpdateDomain(HttpServletRequest request, ActionMapping mapping, W9007ActionForm form)
        throws ApplicationException {
        
        W9007UpdateDomain updateDomain = new W9007UpdateDomain();
        //  Set the initial value to business domain from CommonInfoDomain.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        // Set DSC-ID.
        // DSC-IDの設定
        for (W9007ListDomain listDomain : form.getListDomainList()) {
            listDomain.setLoginUserDscId(updateDomain.getLoginUserDscId());
        }
        
        W9007CriteriaDomain criteriaDomain = form.getW9007CriteriaDomain();

        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        // Set user authority.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W9007R, PERMIT_FUNC_ID_W9007B };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        updateDomain.setCriteriaDomain(form.getW9007CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
