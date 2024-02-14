/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6009CriteriaDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W6009CalculateAmountFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 * Calculate the Documentation Invoice Register screen is (Amount) class action.
 * <br />通関書類作成業務 Invoice Register画面のCalculate(Amount)アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success":W6009
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6009CalculateAmountAction extends W6009AbstractAction {
    /**
     * W6009CalculateAmountFacadeService
     */
    protected ProcessFacadeService<W6009CriteriaDomain, W6009CriteriaDomain> w6009CalculateAmountFacadeService;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6009CalculateAmountAction() {
        super();
    }

    /**
     * Setter method for w6009CalculateAmountFacadeService.
     *
     * @param calculateAmountFacadeService Set for w6009CalculateAmountFacadeService
     */
    public void setW6009CalculateAmountFacadeService(ProcessFacadeService<W6009CriteriaDomain, W6009CriteriaDomain> calculateAmountFacadeService) {
        w6009CalculateAmountFacadeService = calculateAmountFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * ‐Set of search criteria domain
     *     Set a common item
     * 
     * ‐Amount calculation processing Calculate.
     *     Call {@link W6009CalculateAmountFacadeServiceImpl}.
     * 
     * ‐Set the screen to get the results.
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     共通項目を設定する
     * 
     * ‐金額計算処理を行います。
     *     {@link W6009CalculateAmountFacadeServiceImpl}を呼び出します。
     * 
     * ‐取得結果を画面に設定します。
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {

        W6009ActionForm w6009Form = (W6009ActionForm)form;
        
        W6009CriteriaDomain criteriaDomain = prepareCriteriaDomain(request, mapping, w6009Form);
        
        W6009CriteriaDomain resultDomain =  w6009CalculateAmountFacadeService.process(criteriaDomain);

        w6009Form.setW6009CriteriaDomain(resultDomain);
        
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
