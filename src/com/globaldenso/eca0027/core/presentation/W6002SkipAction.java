/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6001;
import static com.globaldenso.gscm.framework.constants.Constants.FORWARD_SUCCESS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W6002CriteriaDomain;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.TransactFacadeService;
import com.globaldenso.gscm.framework.util.ActionUtil;

/**
 * Class action of Skip Documentation Manual Invoice Upload screen.
 * <br />通関書類作成業務 Manual Invoice Upload画面のSkipアクションクラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11669 $
 */
public class W6002SkipAction extends W6002AbstractAction  {
    /**
     * Search FacadeService
     * <br />検索FacadeService
     */
    protected TransactFacadeService<W6002CriteriaDomain, W6002CriteriaDomain> w6002SkipFacadeService;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6002SkipAction() {
        super();
    }

    /**
     * Setter method for w6002SkipFacadeService.
     *
     * @param skipFacadeService Set for w6002SkipFacadeService
     */
    public void setW6002SkipFacadeService(TransactFacadeService<W6002CriteriaDomain, W6002CriteriaDomain> skipFacadeService) {
        w6002SkipFacadeService = skipFacadeService;
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * - Invoice Search
     * </pre>
     * <pre>
     * - インボイスを検索
     * </pre>
     * 
     * 
     * @see com.globaldenso.gscm.framework.presentation.AbstractAction#invokeExecute(org.apache.struts.action.ActionMapping,
     *      org.apache.struts.action.ActionForm,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse)
     */
    protected String invokeExecute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response) throws ApplicationException {
        
        // Search condition acquisition 
        // 検索条件取得
        W6002ActionForm w6002Form = (W6002ActionForm) form;

        if (FLAG_N.equals(w6002Form.getFrtContainFlg())) {
            return SCREEN_ID_W6001;
        }

        W6002CriteriaDomain criteriaDomain = w6002Form.getW6002CriteriaDomain();
        ActionUtil.prepareBusinessDomain(criteriaDomain, w6002Form.getWindowId(), w6002Form.getScreenId());
        criteriaDomain.setFunctionNo(w6002Form.getFunctionNo());
        criteriaDomain.setTakeOverInvoiceNo(w6002Form.getTakeOverInvoiceNo());
        criteriaDomain.setTakeOverShipperCd(w6002Form.getTakeOverShipperCd());
        //criteriaDomain.setTakeOverParInvoiceNo(w6002Form.getParInvoiceNo()); // ST946 MANUAL SCREEN TRANSITION DEL
        criteriaDomain.setTakeOverInvoiceIssueDt(w6002Form.getTakeOverInvoiceIssueDt());
        criteriaDomain.setTakeOverFrtContainFlg(w6002Form.getFrtContainFlg());
        // ST946 MANUAL SCREEN TRANSITION ADD START
        criteriaDomain.setTakeOverParInvoiceShipperCd(w6002Form.getTakeOverParInvoiceShipperCd());
        criteriaDomain.setTakeOverParInvoiceNo(w6002Form.getTakeOverParInvoiceNo());
        criteriaDomain.setTakeOverParInvoiceIssueDt(w6002Form.getTakeOverParInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION ADD END
        
        // Search invoice
        // インボイスを検索
        W6002CriteriaDomain resultDomain = w6002SkipFacadeService.transact(criteriaDomain);
        
        // Changes to Main Screen (W6001).
        // Main Screen(W6001)に遷移
        if (resultDomain == null) {
            return SCREEN_ID_W6001;
        }
        // Change to Manual Invoice Upload(W6002).
        // Manual Invoice Upload(W6002)に遷移
        request.setAttribute("functionNo", criteriaDomain.getFunctionNo());
        // ST946 MANUAL SCREEN TRANSITION MOD START
        //request.setAttribute("shipperCd", criteriaDomain.getTakeOverShipperCd());
        //request.setAttribute("invoiceNo", resultDomain.getTakeOverInvoiceNo());
        //request.setAttribute("invoiceIssueDt", criteriaDomain.getTakeOverInvoiceIssueDt());
        //if (W6002_FUNCTION_NO_4.equals(criteriaDomain.getFunctionNo())) {
        //    request.setAttribute("parInvoiceNo", criteriaDomain.getTakeOverParInvoiceNo());
        //} else if (W6002_FUNCTION_NO_3.equals(criteriaDomain.getFunctionNo())) {
        //    request.setAttribute("parInvoiceNo", criteriaDomain.getInvoiceNo());
        //}
        request.setAttribute("shipperCd", resultDomain.getTakeOverShipperCd());
        request.setAttribute("invoiceNo", resultDomain.getTakeOverInvoiceNo());
        request.setAttribute("invoiceIssueDt", resultDomain.getTakeOverInvoiceIssueDt());
        // ST946 MANUAL SCREEN TRANSITION MOD END
        request.setAttribute("frtContainFlg", criteriaDomain.getTakeOverFrtContainFlg());
        //request.setAttribute("sortInvoice", Integer.toString(Integer.parseInt(criteriaDomain.getSortInvoice()) + 1)); // ST946 MANUAL SCREEN TRANSITION DEL
        
        return FORWARD_SUCCESS;
    }
}
