/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_NON_DNG_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_RE_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_3;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_5;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6001UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W6001UploadNonDnGInvOrReInvFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Action class Upload Non DN-G Inv of Documentation Invoice Main screen. Or Re-Inv.
 * <br />通関書類作成業務 Invoice Main画面のUpload Non DN-G Inv. or Re-Inv.アクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "success": /W6002Init.do
 *     ‐ "error": W6001
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11671 $
 */
public class W6001UploadNonDnGInvOrReInvAction extends W6001AbstractAction {
   
    /**
     * Upload Non DN-G Inv. or Re-Inv. FacadeService
     */
    protected ProcessFacadeService<W6001ListDomain, W6001UpdateDomain> w6001UploadNonDnGInvOrReInvFacadeService;

    /**
     * The default constructor.
     * デフォルトコンストラクタです。
     */
    public W6001UploadNonDnGInvOrReInvAction() {
        super();
    }

    /**
     * Setter method for w6001UploadNonDnGInvOrReInvFacadeService.
     *
     * @param uploadNonDnGInvOrReInvFacadeService Set for w6001UploadNonDnGInvOrReInvFacadeService
     */
    public void setW6001UploadNonDnGInvOrReInvFacadeService(ProcessFacadeService<W6001ListDomain, W6001UpdateDomain> uploadNonDnGInvOrReInvFacadeService) {
        w6001UploadNonDnGInvOrReInvFacadeService = uploadNonDnGInvOrReInvFacadeService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Setting of Action Form
     * Clear the List domain list.
     *
     *- Set of search criteria domain
     * Common information screen, the page control information W6001UpdateDomain set to.
     *
     * - The execution of the search process
     * Call W6001UploadNonDnGInvOrReInvFacadeServiceImpl.
     * </pre>
     * <pre>
     * ‐アクション・フォームの設定
     *     Listドメインリストをクリアします。
     * 
     * ‐検索条件ドメインの設定
     *     画面共通情報、ページ制御情報を{@link W6001UpdateDomain}に設定します。
     * 
     * ‐検索処理の実行
     *     {@link W6001UploadNonDnGInvOrReInvFacadeServiceImpl}を呼出す。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W6001ActionForm w6001Form = (W6001ActionForm) form;
        
        W6001UpdateDomain updateDomain = prepareUpdateDomain(w6001Form);
        
        W6001ListDomain listDomain = w6001UploadNonDnGInvOrReInvFacadeService.process(updateDomain);
        
        // Set the takeover VALUE to the next screen.
        // 遷移先画面への引継値設定
        setActionFormParam(w6001Form, request, listDomain.getManualTyp());
        
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
    
    /**
     * Set the takeover VALUE to the next screen.
     * <br />遷移先画面への引継値を設定します。
     * 
     * @param form W6001 Action Form
     * @param request HTTP request
     * @param manualTyp manual type obtained in the decision process<br />判定処理で取得したマニュアルタイプ
     */
    protected void setActionFormParam (W6001ActionForm form, HttpServletRequest request, String manualTyp) {
        
        int selectedRow = Integer.parseInt(form.getW6001CriteriaDomain().getSelected());
        W6001ListDomain listDomain = form.getListDomainList().get(selectedRow);
        
        if (MANUAL_TYP_NON_DNG_INVOICE.equals(manualTyp) || manualTyp == null) { // ST946 MANUAL SCREEN TRANSITION MOD
            request.setAttribute("functionNo", W6002_FUNCTION_NO_3);
            request.setAttribute("frtContainFlg", listDomain.getFrtContainFlg());
            
        } else if (MANUAL_TYP_RE_INVOICE.equals(manualTyp)) {
            request.setAttribute("functionNo", W6002_FUNCTION_NO_5);
        }
        
        // The invoice should initial display in the W6002 is always the main invoice that has been selected in the W6001,
        // parInvoiceShipperCd,parInvoiceNo,parInvoiceIssueDt does not take over.
        // The reason, if the main invoice has been canceled, it is not possible to transition to the next screen.
        // W6002で初期表示すべきインボイスは必ずW6001で選択されたメインインボイスとなるため、
        // parInvoiceShipperCd、parInvoiceNo、parInvoiceIssueDtは引き継がない。
        // メインインボイスがキャンセルされている場合、次画面には遷移できないことによる。
        request.setAttribute("shipperCd", listDomain.getShipperCd());
        request.setAttribute("invoiceNo", listDomain.getInvoiceNo());
        request.setAttribute("invoiceIssueDt", listDomain.getInvoiceIssueDt());
        //request.setAttribute("parInvoiceNo", listDomain.getInvoiceNo()); // ST946 MANUAL SCREEN TRANSITION DEL
    }
}

