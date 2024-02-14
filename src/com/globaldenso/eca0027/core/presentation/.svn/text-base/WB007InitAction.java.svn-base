/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GSCM_E0_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_WB006;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB007ListDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.SearchFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 *    Initial display action of a Last Digit Change Register Screen.
 * <br />品番末尾変更登録画面の初期表示アクション。
 * <pre>
 * forward name-path mappings:
 *     - "success":WB007.jsp
 *     - "error":WB007.jsp
 * </pre>
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6762 $
 */
public class WB007InitAction extends WB007AbstractAction {

    /**
     * InitFacade service
     * <br />InitFacadeサービス
     */
    protected SearchFacadeService<List<? extends WB007ListDomain>, WB007CriteriaDomain> wb007InitFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public WB007InitAction() {
        super();
    }

    /**
     * Setter method for wb007InitFacadeService.
     * 
     * @param initFacadeService Set for wb007InitFacadeService
     */
    public void setWb007InitFacadeService(
        SearchFacadeService<List<? extends WB007ListDomain>, WB007CriteriaDomain> initFacadeService) {
        wb007InitFacadeService = initFacadeService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Setting of action form
        // アクションフォームの設定
        WB007ActionForm wb007Form = prepareForm((WB007ActionForm) form);

        // Setting of a search-condition domain
        // 検索条件ドメインの設定
        WB007CriteriaDomain criteriaDomain = prepareCriteriaDomain(wb007Form);
        
        // Acquisition of a request parameter
        // リクエストパラメータの取得
        if (StringUtils.equals(wb007Form.getCallScreenId(), SCREEN_ID_WB006)) {
            criteriaDomain.setRcvOdrCompCd((String)request.getAttribute("wb007CriteriaDomain.rcvOdrCompCd"));
            criteriaDomain.setCompNm((String)request.getAttribute("wb007CriteriaDomain.compNm"));
            criteriaDomain.setCustomerCd((String)request.getAttribute("wb007CriteriaDomain.customerCd"));
            criteriaDomain.setLgcyShipTo((String)request.getAttribute("wb007CriteriaDomain.lgcyShipTo"));
            criteriaDomain.setShipToNm((String)request.getAttribute("wb007CriteriaDomain.shipToNm"));
            criteriaDomain.setTrnsCd((String)request.getAttribute("wb007CriteriaDomain.trnsCd"));
            criteriaDomain.setTrnsCdDisp((String)request.getAttribute("wb007CriteriaDomain.trnsCdDisp"));
            criteriaDomain.setShippingDt((String)request.getAttribute("wb007CriteriaDomain.shippingDt"));
            criteriaDomain.setItemNoOrg((String)request.getAttribute("wb007CriteriaDomain.itemNoOrg"));
            criteriaDomain.setPkgCd((String)request.getAttribute("wb007CriteriaDomain.pkgCd"));
            criteriaDomain.setItemDescription((String)request.getAttribute("wb007CriteriaDomain.itemDescription"));
            criteriaDomain.setCustomerPoNo((String)request.getAttribute("wb007CriteriaDomain.customerPoNo"));
            criteriaDomain.setOdrQty((String)request.getAttribute("wb007CriteriaDomain.odrQty"));
            criteriaDomain.setOdrCtrlNo((String)request.getAttribute("wb007CriteriaDomain.odrCtrlNo"));
        }
        
        try {
            // Execution of retrieval processing
            // 検索処理の実行
            List<? extends WB007ListDomain> listDomainList = wb007InitFacadeService.search(criteriaDomain);
            // Set of search results
            // 検索結果のセット
            wb007Form.setWb007ListDomainList(listDomainList);
            return FORWARD_SUCCESS;
        } catch (ApplicationException e) {
            if (GSCM_E0_0001.equals(e.getCode()) 
                && StringUtils.equals(wb007Form.getCallScreenId(), SCREEN_ID_WB006)) {
                ActionMessages errors = new ActionMessages();
                errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(GSCM_E0_0001, null));
                saveErrors(request, errors);
                return wb007Form.getCallScreenId();
            } else {
                throw e;
            }
        }
    }
    
    /**
     *    A search-condition domain is set up.
     * <br />検索条件ドメインを設定します。
     *
     * @param form Action form<br />アクション・フォーム
     * @return Search-condition domain<br />検索条件ドメイン
     * @throws ApplicationException When there is no authority<br />権限がない場合
     */
    protected WB007CriteriaDomain prepareCriteriaDomain(WB007ActionForm form) 
        throws ApplicationException {
        // Create of a search-condition domain
        // 検索条件ドメインの作成
        WB007CriteriaDomain criteriaDomain = form.getWb007CriteriaDomain();
        
        // Setting of a screen common information
        // 画面共通情報の設定
        ActionUtil.prepareBusinessDomain(criteriaDomain, form.getWindowId(), form.getScreenId());
        
        return criteriaDomain;
    }
    
    /**
     *    Action form is set up.
     * <br />アクションフォームを設定します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Action form<br />アクションフォーム
     */
    protected WB007ActionForm prepareForm(WB007ActionForm form) {
        // Setting of action form
        // アクション・フォームの設定 
        form.setWb007ListDomainList(null);
        
        return form;
    }
}
