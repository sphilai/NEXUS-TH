/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_2;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6001UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W6001UploadFrtInvFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Class action UploadFrtInv of Documentation Invoice Main Screen screen.
 * <br />通関書類作成業務 Invoice Main Screen画面のUploadFrtInvアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": /W6002Init.do
 *     ‐ "error": W6001
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6001UploadFrtInvAction extends W6001AbstractAction {
    
    /**
     * W6001Update FacadeService
     */
    protected ProcessFacadeService<W6001UpdateDomain, W6001UpdateDomain> w6001UploadFrtInvFacadeService;

    /**
     * The default constructor.
     * デフォルトコンストラクタです。
     */
    public W6001UploadFrtInvAction() {
        super();
    }

    /**
     * Setter method for w6001UploadFrtInvFacadeService.
     *
     * @param uploadFrtInvFacadeService Set for w6001UploadFrtInvFacadeService
     */
    public void setW6001UploadFrtInvFacadeService(ProcessFacadeService<W6001UpdateDomain, W6001UpdateDomain> uploadFrtInvFacadeService) {
        w6001UploadFrtInvFacadeService = uploadFrtInvFacadeService;
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#isScreenInfoStack()
     */
    protected boolean isScreenInfoStack() {
        return false;
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     *  - Set of search criteria domain
     * Common information screen, the page control information {@link W6001UpdateDomain} set to.
     *
     * - The execution of the search process
     * Call W6001UploadFrtInvFacadeServiceImpl.
     * </pre>
     * <pre>
     * ‐検索条件ドメインの設定
     *     画面共通情報、ページ制御情報を{@link W6001UpdateDomain}に設定します。
     * 
     * ‐検索処理の実行
     *     {@link W6001UploadFrtInvFacadeServiceImpl}を呼出す。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W6001ActionForm w6001Form = (W6001ActionForm) form;
        
        W6001UpdateDomain updateDomain = prepareUpdateDomain(w6001Form);
        
        // FRT Invoice add determination.
        // FRT Invoice追加可否判定
        W6001UpdateDomain resultDomain = w6001UploadFrtInvFacadeService.process(updateDomain);
        W6001ListDomain listDomanin = resultDomain.getListDomainList().get(0);
        
        // Parameter setting to the next screen.
        // 遷移先画面への引継値設定
        request.setAttribute("functionNo", W6002_FUNCTION_NO_2);
        request.setAttribute("shipperCd", listDomanin.getShipperCd());
        request.setAttribute("parInvoiceNo", listDomanin.getInvoiceNo());
        request.setAttribute("invoiceNo", listDomanin.getInvoiceNo());
        request.setAttribute("invoiceIssueDt", listDomanin.getInvoiceIssueDt());
        
        return FORWARD_SUCCESS;
    }
    
    /**
     * Get the domain of the selected row, and set as the search criteria.
     * <br />選択行のドメインを取得、検索条件として設定します。
     * 
     * @param form of Action Form W6001<br />W6001のアクションフォーム
     * @return Domain information of the selected row<br />選択行のドメイン情報
     */
    protected W6001UpdateDomain prepareUpdateDomain(W6001ActionForm form) {
        W6001UpdateDomain updateDomain = new W6001UpdateDomain();
        
        ActionUtil.prepareBusinessDomain(updateDomain, form.getWindowId(), form.getScreenId());
        
        updateDomain.setW6001CriteriaDomain(form.getW6001CriteriaDomain());
        updateDomain.setListDomainList(form.getListDomainList());
        
        return updateDomain;
    }

}