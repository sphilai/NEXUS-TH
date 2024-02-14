/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_I1_0004;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6009_CMD_REGIST;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;

/**
 * The class of action for Documentation Invoice Register screen.
 * <br />通関書類作成業務 Invoice Register画面のRegisterアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W6009
 *     ‐ "error":W6009
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10689 $
 */
public class W6009RegisterAction extends W6009AbstractAction {

    /**
     * W6009Register Facade Service
     * <br />W6009Register Facadeサービス
     */
    protected TransactFacadeService<W6009CriteriaDomain, W6009CriteriaDomain> w6009RegisterFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6009RegisterAction() {
        super();
    }

    /**
     * Setter method for w6009RegisterFacadeService.
     *
     * @param registerFacadeService Set for w6009RegisterFacadeService
     */
    public void setW6009RegisterFacadeService(TransactFacadeService<W6009CriteriaDomain, W6009CriteriaDomain> registerFacadeService) {
        w6009RegisterFacadeService = registerFacadeService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W6009ActionForm w6009Form = (W6009ActionForm) form;

        W6009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w6009Form);

        W6009CriteriaDomain resultDomain = w6009RegisterFacadeService.transact(criteriaDomain);
        
//        if (StringUtils.isNotEmpty(resultDomain.getInvoiceNo())) {
//            resultDomain.setOriginalScreenId(SCREEN_ID_W6009);
//        }
        resultDomain.setCommand(W6009_CMD_REGIST);
        
        w6009Form.setW6009CriteriaDomain(resultDomain);

        addGlobalMessage(request, NXS_I1_0004);

        return FORWARD_SUCCESS;
    }
    
    /**
     * Set the search criteria domain.
     * <br />検索条件ドメインを設定します。
     * 
     * @param request HTTP request<br />
     * HTTPリクエスト
     * @param mapping Action mapping<br />
     * アクション・マッピング
     * @param form Action Form<br />
     * アクション・フォーム
     * @return Search conditions domain<br />
     * 検索条件ドメイン
     * @throws ApplicationException If it fails to set the search criteria domain<br />
     * 検索条件ドメインの設定に失敗した場合
     */
    protected W6009CriteriaDomain prepareCriteriaDomain(HttpServletRequest request, ActionMapping mapping, W6009ActionForm form) 
        throws ApplicationException {
        W6009CriteriaDomain criteriaDomain = form.getW6009CriteriaDomain();
        
        //  Setting of a screen common information.
        // 画面共通情報の設定
        prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
}
