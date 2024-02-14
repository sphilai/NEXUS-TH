/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_RE_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6002;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.W6002_FUNCTION_NO_4;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W6001ListDomain;
import com.globaldenso.eca0027.core.business.domain.W6001UpdateDomain;
import com.globaldenso.eca0027.core.business.facadeservice.presentation.W6001CancelInvFacadeServiceImpl;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.ProcessFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Class action CancelInv of Documentation Invoice Main Screen screen.
 * <br />通関書類作成業務 Invoice Main Screen画面のCancelInvアクションクラスです。
 * <pre>
 * forward name-path mapping:
 *     ‐ "error": W6001
 *     ‐ "W6009": /W6009Init.do
 *     ‐ "W6002": /W6002Init.do
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11667 $
*/
public class W6001CancelInvAction extends W6001AbstractAction {
    
    /**
     * CancelInv FacadeService
     */
    protected ProcessFacadeService<W6001UpdateDomain, W6001UpdateDomain> w6001CancelInvFacadeService;

    /**
     * The default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001CancelInvAction() {
        super();
    }

    /**
     * Setter method for w6001CancelInvFacadeService.
     *
     * @param cancelInvFacadeService Set for w6001CancelInvFacadeService
     */
    public void setW6001CancelInvFacadeService(ProcessFacadeService<W6001UpdateDomain, W6001UpdateDomain> cancelInvFacadeService) {
        w6001CancelInvFacadeService = cancelInvFacadeService;
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
     * - Setting of Action Form
     * Clear the List domain list.
     *
     * - Set of search criteria domain
     * Common information screen, the page control information {@link W6001UpdateDomain} set to.
     * 
     * - The execution of the search process
     *  Call W6001CancelInvFacadeServiceImpl.
     * </pre>
     * <pre>
     * ‐アクション・フォームの設定
     *     Listドメインリストをクリアします。
     * 
     * ‐検索条件ドメインの設定
     *     画面共通情報、ページ制御情報を{@link W6001UpdateDomain}に設定します。
     * 
     * ‐検索処理の実行
     *     {@link W6001CancelInvFacadeServiceImpl}を呼出す。
     * 
     * </pre>
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected String invokeExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        
        W6001ActionForm w6001Form = (W6001ActionForm) form;
        
        W6001UpdateDomain updateDomain = prepareUpdateDomain(w6001Form);
        
        // Cancel determination.
        // Cancel可否判定
        W6001UpdateDomain resultDomain = w6001CancelInvFacadeService.process(updateDomain);
        W6001ListDomain parInvoiceDomain = resultDomain.getListDomainList().get(0);
        
        // ST950, ST951 MOD START
        // Transition destination decision.
        // 遷移先判定
        //if (FLAG_Y.equals(listDomain.getManualFlg())
        //    || (FLAG_N.equals(listDomain.getManualFlg()) 
        //        && StringUtils.isEmpty(listDomain.getManualTyp()) 
        //        && FLAG_N.equals(listDomain.getDnBaseFlg()))) {
        //
        // if manual or re-invoice
        // マニュアルかリインボイスの場合
        if (FLAG_Y.equals(parInvoiceDomain.getManualFlg()) || MANUAL_TYP_RE_INVOICE.equals(parInvoiceDomain.getManualTyp())) {
        // ST950, ST951 MOD END
            
            request.setAttribute("functionNo", W6002_FUNCTION_NO_4);
            
            // ST946 MANUAL SCREEN TRANSITION DEL START
            //request.setAttribute("shipperCd", listDomain.getShipperCd());
            //request.setAttribute("parInvoiceNo", listDomain.getInvoiceNo());
            //request.setAttribute("invoiceNo", listDomain.getInvoiceNo());
            //request.setAttribute("invoiceIssueDt", listDomain.getInvoiceIssueDt());
            // ST946 MANUAL SCREEN TRANSITION DEL END
            request.setAttribute("frtContainFlg", parInvoiceDomain.getFrtContainFlg());
            
            // ST946 MANUAL SCREEN TRANSITION ADD START
            // The invoice should initial display in the W6002 is likely to differ from the main invoice that has been selected in the W6001,
            // so it takes over the parInvoiceShipperCd,parInvoiceNo,parInvoiceIssueDt together with shipperCd,invoiceNo,invoiceIssueDt.
            // W6002で初期表示すべきインボイスがW6001で選択されたメインインボイスと異なる可能性があるため、
            // shipperCd、invoiceNo、invoiceIssueDtとは別にparInvoiceShipperCd、parInvoiceNo、parInvoiceIssueDtを引き継ぐ。
            W6001ListDomain nextInvoiceDomain = resultDomain.getListDomainList().get(1);
            // key of main invoice that selected
            // 選択されたメインインボイスのキー
            request.setAttribute("parInvoiceShipperCd", parInvoiceDomain.getShipperCd());
            request.setAttribute("parInvoiceNo", parInvoiceDomain.getInvoiceNo());
            request.setAttribute("parInvoiceIssueDt", parInvoiceDomain.getInvoiceIssueDt());
            // Key of the first invoice that has not been canceled including the FRT invoice.
            // FRTインボイスを含みキャンセルされていない最初のインボイスのキー。
            request.setAttribute("shipperCd", nextInvoiceDomain.getShipperCd());
            request.setAttribute("invoiceNo", nextInvoiceDomain.getInvoiceNo());
            request.setAttribute("invoiceIssueDt", nextInvoiceDomain.getInvoiceIssueDt());
            // ST946 MANUAL SCREEN TRANSITION ADD END
            
            return SCREEN_ID_W6002;
        }
        // ST950, ST951 MOD START
        //if (FLAG_N.equals(mainInvoiceDomain.getManualFlg())
        //    && !(StringUtils.isEmpty(mainInvoiceDomain.getManualTyp()) && FLAG_N.equals(mainInvoiceDomain.getDnBaseFlg()))) {
        else {
        // ST950, ST951 MOD END

            request.setAttribute("shipperCd", parInvoiceDomain.getShipperCd());
            request.setAttribute("invoiceNo", parInvoiceDomain.getInvoiceNo());
            request.setAttribute("invoiceIssueDt", parInvoiceDomain.getInvoiceIssueDt());
            request.setAttribute("invoiceType", parInvoiceDomain.getInvoiceTyp());
            
            return SCREEN_ID_W6009;
        }
        
        //return FORWARD_ERROR; // ST946 MANUAL SCREEN TRANSITION DEL
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
