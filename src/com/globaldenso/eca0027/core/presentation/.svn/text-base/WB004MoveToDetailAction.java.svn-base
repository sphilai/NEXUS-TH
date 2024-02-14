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
import com.globaldenso.eca0027.core.business.domain.WB004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB004ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB004UpdateDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;

/**
 *    This is a Move to Detail action class of an ordering search main screen.
 * <br />受注検索メイン画面のMove to Detailアクションクラスです。
 * <pre>
 * forward name-path mappings:
 *     - "success":/WB005Init.do
 *     - "error":WB004.jsp
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB004MoveToDetailAction extends WB004AbstractAction {
    
    /**
     * ConfirmDetailFacade service
     * <br />ConfirmDetailFacadeサービス
     */
    protected ProcessFacadeService<WB004UpdateDomain, WB004UpdateDomain> wb004MoveToDetailFacadeService;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB004MoveToDetailAction() {
        super();
    }

    /**
     * Setter method for wb004MoveToDetailFacadeService.
     *
     * @param wb004MoveToDetailFacadeService Set for wb004MoveToDetailFacadeService
     */
    public void setWb004MoveToDetailFacadeService(
        ProcessFacadeService<WB004UpdateDomain, WB004UpdateDomain> wb004MoveToDetailFacadeService) {
        this.wb004MoveToDetailFacadeService = wb004MoveToDetailFacadeService;
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
        
        WB004ActionForm wB004ActionForm = (WB004ActionForm) form;
        
        // Create of a mass update domain
        // 一括更新ドメインの作成
        WB004UpdateDomain updateDomain = prepareUpdateDomain(wB004ActionForm);
        
        // Detailed line selection check
        // 明細行選択チェック
        wb004MoveToDetailFacadeService.process(updateDomain);
        
        // Condition acquisition
        // 条件取得
        WB004CriteriaDomain criteriaDomain = wB004ActionForm.getWb004CriteriaDomain();
        // Selection line acquisition
        // 選択行取得
        int selectedIndex = Integer.parseInt(wB004ActionForm.getSelectedIndex());
        WB004ListDomain wB004ListDomain = wB004ActionForm.getListDomainList(selectedIndex);
        // selection line information, and a search condition are added to a request parameter.
        // 選択行情報および検索条件をリクエストパラメータに追加
        request.setAttribute("rcvOdrCompCd", criteriaDomain.getRcvOdrCompCdHidden());
        request.setAttribute("compNm", criteriaDomain.getCompNmHidden());
        request.setAttribute("itemNo", criteriaDomain.getItemNoHidden());
        request.setAttribute("itemDescription", criteriaDomain.getItemDescriptionHidden());
        request.setAttribute("customerCd", wB004ListDomain.getCustomerCdHidden());
        request.setAttribute("lgcyShipTo", wB004ListDomain.getLgcyShipToHidden());
        request.setAttribute("shipToNm", wB004ListDomain.getShipToNmHidden());
        request.setAttribute("trnsCd", wB004ListDomain.getTrnsCdHidden());
        request.setAttribute("pkgCd", wB004ListDomain.getPkgCdHidden());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     *    {@link WB004UpdateDomain} is created.
     * <br />{@link WB004UpdateDomain}を作成します。
     *
     * @param form Action form<br />アクションフォーム
     * @return Created {@link WB004UpdateDomain}<br />作成した{@link WB004UpdateDomain}
     */
    protected WB004UpdateDomain prepareUpdateDomain(WB004ActionForm form) {
        
        WB004UpdateDomain updateDomain = new WB004UpdateDomain();
        
        updateDomain.setSelectedIndex(form.getSelectedIndex());
        
        return updateDomain;
    }
}
