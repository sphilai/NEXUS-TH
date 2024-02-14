/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0007;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_I0_0009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9022B;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PERMIT_FUNC_ID_W9022R;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W9022CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W9022DeleteFacadeServiceImpl;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.DeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator;
import com.globaldenso.gscm.framework.util.ActionUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The Delete action class Invoice Template MA Inquiry screen.
 * <br />Invoice Template MA Inquiry画面のDeleteアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐"success": W9022
 *     ‐"error": W9022
 *     ‐"W9022": /W9022Init.do
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9587 $
 */
public class W9022DeleteAction extends W9022AbstractAction {

    /**
     * Delete Facade Service
     * <br />Delete Facadeサービス
     */
    protected DeleteFacadeService<W9022UpdateDomain, W9022UpdateDomain> w9022DeleteFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9022DeleteAction() {
        super();
    }

    /**
     * Setter method for w9022DeleteFacadeService.
     *
     * @param deleteFacadeService Set for w9022DeleteFacadeService
     */
    public void setW9022DeleteFacadeService(DeleteFacadeService<W9022UpdateDomain, W9022UpdateDomain> deleteFacadeService) {
        w9022DeleteFacadeService = deleteFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of mass update domain
     *     Set to {@link W9022UpdateDomain}.
     * 
     * ‐Execution of the removal process
     *     Call the {@link W9022DeleteFacadeServiceImpl}.
     * 
     * 
     * ‐一括更新ドメインの設定
     *     {@link W9022UpdateDomain}に設定します。
     * 
     * ‐削除処理の実行
     *     {@link W9022DeleteFacadeServiceImpl}を呼出す。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W9022ActionForm w9022Form = (W9022ActionForm) form;
        w9022Form.setCountPerPage(PAGE_MAX_COUNT);
        
        // Set of mass update domain.
        // 一括更新ドメインの設定
        W9022UpdateDomain updateDomain = prepareUpdateDomain(request, mapping, w9022Form);
        
        // Execution of the removal process.
        // 削除処理の実行
        W9022UpdateDomain resultDomain = w9022DeleteFacadeService.delete(updateDomain);
        updateDomain.getCriteriaDomain().setSelected(null);
        
        // Delete Complete Message
        addGlobalMessage(request, GSCM_I0_0007, resultDomain.getCriteriaDomain().getDeleteCount());
        
        return FORWARD_SUCCESS;
    }

    /**
     * Create a {@link W9022UpdateDomain}.
     * <br />{@link W9022UpdateDomain}を作成します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param mapping Action mapping<br />アクション・マッピング
     * @param form Action Form <br />アクション・フォーム
     * @return {@link W9022UpdateDomain} that created <br />作成した{@link W9022UpdateDomain}
     * @throws GscmApplicationException If do not have permission of Packaging Instruction (= Pull) <br />梱包指示の権限がない場合
     */
    protected W9022UpdateDomain prepareUpdateDomain(HttpServletRequest request, ActionMapping mapping, W9022ActionForm form) throws GscmApplicationException {
        
        W9022UpdateDomain updateDomain = new W9022UpdateDomain();
        W9022CriteriaDomain criteriaDomain = form.getW9022CriteriaDomain();
        
        // Set of common information screen.
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        // Page control processing.
        // ページ制御処理
        PageInfoCreator pageInfoCreator = new ActionPageInfoCreator(form, mapping, request);
        criteriaDomain.setPageInfoCreator(pageInfoCreator);
        
        // execution permission settings.
        // 権限の設定
        if (userAuthService.hasRegisterAll() || userAuthService.hasBrowseAll()) {
            criteriaDomain.setUserAuthList(null);
        } else {
            String[] permitFuncIdList = { PERMIT_FUNC_ID_W9022B, PERMIT_FUNC_ID_W9022R };
            List<? extends UserAuthDomain> userAuthList = userAuthService.getUserAuthList(permitFuncIdList);
            
            if (userAuthList.size() == 0) {
                throw new GscmApplicationException(GSCM_I0_0009);
            }
            criteriaDomain.setUserAuthList(userAuthList);
        }
        
        // Set of mass update domain.
        // 一括更新ドメインの設定
        updateDomain.setCriteriaDomain(form.getW9022CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }
}
