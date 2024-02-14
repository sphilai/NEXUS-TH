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
import com.globaldenso.eca0027.core.business.domain.WB006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB006ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB006UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 *    This is a Move to Register action class of a Last Digit Change Main Screen.
 * <br />品番末尾変更メイン画面のMove to Registerアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/WB007Init.do
 *     - "error":WB006.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB006MoveToRegisterAction extends WB006AbstractAction {

    /**
     * ConfirmDetailFacade service
     * <br />ConfirmDetailFacadeサービス
     */
    protected ProcessFacadeService<WB006UpdateDomain, WB006UpdateDomain> wb006MoveToRegisterFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB006MoveToRegisterAction() {
        super();
    }

    /**
     * Setter method for wb006MoveToRegisterFacadeService.
     *
     * @param wb006MoveToRegisterFacadeService Set for wb006MoveToRegisterFacadeService
     */
    public void setWb006MoveToRegisterFacadeService(
        ProcessFacadeService<WB006UpdateDomain, WB006UpdateDomain> wb006MoveToRegisterFacadeService) {
        this.wb006MoveToRegisterFacadeService = wb006MoveToRegisterFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
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
        
        WB006ActionForm wB006ActionForm = (WB006ActionForm) form;

        // Create of a mass update domain
        // 一括更新ドメインの作成
        WB006UpdateDomain updateDomain = prepareUpdateDomain(wB006ActionForm);
        
        // Detailed line selection check
        // 明細行選択チェック
        wb006MoveToRegisterFacadeService.process(updateDomain);
        
        // Acquisition of a search-condition domain
        // 検索条件ドメインの取得
        WB006CriteriaDomain criteriaDomain = wB006ActionForm.getWb006CriteriaDomain();
        
        // Selection line acquisition
        // 選択行取得
        int selectedIndex = Integer.parseInt(wB006ActionForm.getSelectedIndex());
        WB006ListDomain listDomainList = wB006ActionForm.getWb006ListDomainList(selectedIndex);
        
        // selection line information is added to a request parameter.
        // 選択行情報をリクエストパラメータに追加
        request.setAttribute("wb007CriteriaDomain.rcvOdrCompCd", criteriaDomain.getRcvOdrCompCdHidden());
        request.setAttribute("wb007CriteriaDomain.compNm", criteriaDomain.getCompNmHidden());
        request.setAttribute("wb007CriteriaDomain.customerCd", criteriaDomain.getCustomerCdHidden());
        request.setAttribute("wb007CriteriaDomain.lgcyShipTo", criteriaDomain.getLgcyShipToHidden());
        request.setAttribute("wb007CriteriaDomain.shipToNm", criteriaDomain.getShipToNmHidden());
        request.setAttribute("wb007CriteriaDomain.trnsCd", criteriaDomain.getTrnsCdHidden());
        request.setAttribute("wb007CriteriaDomain.trnsCdDisp", criteriaDomain.getTrnsCdDisp());
        request.setAttribute("wb007CriteriaDomain.shippingDt", criteriaDomain.getShippingDtHidden());
        request.setAttribute("wb007CriteriaDomain.itemNoOrg", criteriaDomain.getItemNoHidden());
        request.setAttribute("wb007CriteriaDomain.pkgCd", listDomainList.getPkgCdHidden());
        request.setAttribute("wb007CriteriaDomain.itemDescription", criteriaDomain.getItemDescriptionHidden());
        request.setAttribute("wb007CriteriaDomain.customerPoNo", listDomainList.getCustomerPoNoHidden());
        request.setAttribute("wb007CriteriaDomain.odrQty", listDomainList.getOdrQtyHidden());
        request.setAttribute("wb007CriteriaDomain.odrCtrlNo", listDomainList.getOdrCtrlNo());
        
        return FORWARD_SUCCESS;
    }

    /**
     *    {@link WB006UpdateDomain} is created.
     * <br />{@link WB006UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link WB006UpdateDomain}<br />作成した{@link WB006UpdateDomain}
     */
    protected WB006UpdateDomain prepareUpdateDomain(WB006ActionForm form) {
        WB006UpdateDomain updateDomain = new WB006UpdateDomain();
        updateDomain.setSelectedIndex(form.getSelectedIndex());
        
        return updateDomain;
    }
}
