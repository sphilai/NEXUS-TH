/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.th.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.KEY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_RE_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PROCESS_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_REQ_REC_STATUS_NOT_YET;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.asia.business.service.W6001DocAsiaServiceImpl;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.th.business.ws.Ws6008ThRestService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.DateUtil;

/**
 * Service implementation class of Documentation.
 * 
 * @author $Author: A.Chonthicha $
 * @version $Revision: 10397 $
 */
public class W6001DocThServiceImpl extends W6001DocAsiaServiceImpl {

    // A.Chonthicha Excise tax
    /**
     * Web service client (Ws6008)
     * Ws6008ThRestService
     */
    protected Ws6008ThRestService ws6008ThRestService;

    /**
     * Default constructor.<br />
     */
    public W6001DocThServiceImpl() {
        super();
    }

    // A.Chonthicha Excise Tax
    /**
     * <p>Setter method for ws6008ThRestService.</p>
     *
     * @param ws6008ThRestService Set for ws6008ThRestService
     */
    public void setWs6008ThRestService(Ws6008ThRestService ws6008ThRestService) {
        this.ws6008ThRestService = ws6008ThRestService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W6001DocService#transactOnRegisterCancel(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocInvoiceDomain transactOnRegisterCancel(W6001DocCriteriaDomain criteria) 
        throws ApplicationException {
        // Get acquisition of Invoice No cancellation numbering object data.
        List<? extends TtInvoiceDomain> ttInvoiceList =  searchTtInvoiceOnRegisterByCancel(criteria.getShipperCd()
            , criteria.getInvoiceNo(), criteria.getInvoiceIssueDt());
        // Numbered cancel invoice no. 
        List<String> cancelInvNoList = transactSequenceCancelInvNo(criteria, ttInvoiceList);
        // Registered in the table, the data were numbered Cancel Invoice No.
        List<? extends TtInvoiceDomain> createinvoiceList = createCancelInvoiceNoOnRegister(ttInvoiceList, cancelInvNoList, criteria);

        if (ttInvoiceList != null && !ttInvoiceList.isEmpty()) {
            //  Add to the temporary stock.
            updateTtTmpStockOnRegisterByQtyAdd(ttInvoiceList.get(0), criteria);
            // Subtraction SHIPPED QUANTITY, the number of times the shipping instruction.
            updateTtExpRcvOdrOnRegisterSubtract(ttInvoiceList.get(0), criteria);
            // Set Invoice No. Palletize of the table, a change of Palletize STATUS.
            updateTtPltzOnRegisterbyCancel(ttInvoiceList.get(0), criteria);
        }

        // UT453 ADD START
        // If CIGMA part exists.
        // CIGMA品がある場合のみ。
        boolean containsCigmaParts = false;
        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if (CML_TYPE_CIGMA.equals(ttInvDomain.getCmlTyp())) {
                containsCigmaParts = true;
                break;
            }
        }
        if (containsCigmaParts) {
        // UT453 ADD END

            // Cancel the CIGMA, perform the sales and orders and stock data.
            // Webサービス呼出し(売上・受注・在庫のキャンセル)
            callWebService6002(criteria.getShipperCd(), createinvoiceList);
            
            // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
            // Judgment of InvoiceDB processing. 
            // CIGMA環境原単位の取得（InvoicdDB用処理要否判断）
            TmCigmaEnvCriteriaDomain tmCigmaEnvCriteriaDomain = new TmCigmaEnvCriteriaDomain();
            tmCigmaEnvCriteriaDomain.setCompCd(criteria.getShipperCd());
            TmCigmaEnvDomain tmCigmaEnvDomain
                = tmCigmaEnvService.searchByKey(tmCigmaEnvCriteriaDomain);
    
            // call 6006 WebService 
            // 処理要の場合のみ6006のWebserviceを呼ぶ
            if (FLAG_Y.equals(tmCigmaEnvDomain.getInvDbFlg())) {
                // get OGC code
                // NEXUS会社原単位の取得（OGC code）
                TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteriaDomain.setCompCd(criteria.getShipperCd());
                TmNxsCompDomain tmNxsComp = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
    
                // Set data to CIGMA(InvoiceDB).
                // CIGMA(InvoiceDB)への書き込み
                // ST144対応
                // callWebService6006(criteria.getOwnerCompCd(), createinvoiceList, tmCigmaEnvDomain, tmNxsComp);
                callWebService6006(criteria.getShipperCd(), createinvoiceList, tmCigmaEnvDomain, tmNxsComp);
    
            }
            // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<

        }

        // 2014/12/22 DNJP.Kawamura UT029対応 START >>>>>
        criteria.setInvoiceNo(createinvoiceList.get(0).getInvoiceNo());
        criteria.setInvoiceIssueDt(createinvoiceList.get(0).getInvoiceIssueDt());
        // 2014/12/22 DNJP.Kawamura UT029対応 END <<<<<

        // 2017/02/02 A.Chonthicha,(GINV)ST073: Not register cancel re-invoice record. [Start]
        // A.Chonthicha Re-invocie
        // for(TtInvoiceDomain ttInvoiceDomain : createinvoiceList){
        //     if(MANUAL_TYP_RE_INVOICE.equals(ttInvoiceDomain.getManualTyp())){
        //         callWebService6007(criteria.getShipperCd(), createinvoiceList);
        //         break;
        //     }
        // }
        // 2017/02/02 A.Chonthicha,(GINV)ST073: Not register cancel re-invoice record. [End]

        // A.Chonthicha excise tax
        callWebService6008(criteria.getShipperCd(), createinvoiceList);
        
        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W6009);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_INVOICE);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6009);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目
        BigDecimal brch = new BigDecimal(2);
        for (TtInvoiceDomain domain : createinvoiceList) {
            // 2017/02/02 A.Chonthicha,(GINV)ST073: Not register cancel re-invoice record. [Start]
            if(MANUAL_TYP_RE_INVOICE.equals(domain.getManualTyp())){
                callWebService6007(criteria.getShipperCd(), createinvoiceList);
            } else {
            // 2017/02/02 A.Chonthicha,(GINV)ST073: Not register cancel re-invoice record. [End]
                ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
                ttOnlineReqJobParamcriteria.setRequestId(requestId);
                ttOnlineReqJobParamcriteria.setBrch(brch);
                ttOnlineReqJobParamcriteria.setParamNm(KEY);
                ttOnlineReqJobParamcriteria.setParamValue01(domain.getShipperCd());
                ttOnlineReqJobParamcriteria.setParamValue02(domain.getInvoiceNo());
                String formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(domain.getInvoiceIssueDt());
                ttOnlineReqJobParamcriteria.setParamValue03(formatDate);
                ttOnlineReqJobParamcriteria.setParamValue04(FLAG_N);
                ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
                commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6009);
                reqJobList.add(ttOnlineReqJobParamcriteria);
                brch = brch.add(new BigDecimal(1));
            }
        }
        ttOnlineReqJobParamService.create(reqJobList);

        return  searchOnRegisterInitByFromMain(criteria);
    }

    /**
     * Register a regular Invoice No.
     * <pre>
     * - Get regular Invoice No numbering object data
     *   Call searchTwInvOnRegisterForNormInv(String, String, String) the argument to the following items .
     * 
     * - Invoice No regular numbering
     *   # sequenceNormalInvoiceNo (List, String, String)
     * 
     * - Re-Invoice No numbering
     *   # Call sequenceReInvoiceNo(List, String, String).
     * 
     * - INVOICE ISSUE DATE acquisition
     * 
     * - PDF registration form creation to the regular table
     *   Call createNormalInvoiceNoOnRegister(List, W6001DocCriteriaDomain, List, Date).
     * 
     * - Registration of Invoice No. to Palletize table , change of Palletize STATUS
     *   Call updateTtPltzOnRegisterForMainInvoice(List, List, W6001DocCriteriaDomain, Date).
     * 
     * - Subtraction of Temp Stock
     *   Call updateTtTmpStockOnRegisterByQty(List).
     * 
     * - Adding SHIPPED QUANTITY, the number of times the shipping instruction
     *   Call updateTtExpRcvOdrOnRegister(List).
     * 
     * -CIGMA write to
     *   Call callWebService6001(String, List).
     * 
     * -  Screen refresh ( Initial display processing at the transition from the Main screen )
     *   Call searchOnRegisterInitByFromMain(W6001DocCriteriaDomain).
     * </pre>
     * 
     * @param criteria Search conditions domain<br />
     * @return Screen display information<br />
     * @throws ApplicationException Registration of authorized Invoice No can not be<br />
     */
    protected W6001DocInvoiceDomain transactOnRegisterByRegistTtInvoice(W6001DocCriteriaDomain criteria) throws ApplicationException {
        // Get regular Invoice No numbering target data. 
        List<? extends TwInvDomain> twInvList = searchTwInvOnRegisterForNormInv(criteria.getDscId(), criteria.getShipperCd(), criteria.getGrpNo1());
        // Numbered the regular Invoice No. 
        List<String> normInvNoList = sequenceNormalInvoiceNo(twInvList, criteria.getShipperCd(), criteria.getDscId());
        // Numbered the Re-Invoice No. 
        sequenceReInvoiceNo(twInvList, criteria.getShipperCd(), criteria.getDscId());

        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invIssueDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(criteria.getShipperCd())), Calendar.DAY_OF_MONTH);
        Date invIssueDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(criteria.getShipperCd())), Calendar.SECOND);
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        Date mnInvIssueDt = DateUtils.truncate(new Date(), Calendar.SECOND);
        for (int i = 0; i < twInvList.size(); i++) {
            TwInvDomain twInvDomain = twInvList.get(i);
            String invoiceNo = normInvNoList.get(i);
            if (GRP_NO2_MAIN.equals(twInvDomain.getGrpNo2())) {
                // Get Invoice work.
                TwInvoiceDomain twInvoiceDomain = searchTwInvoiceDomainOnRegisterForCreate(criteria.getDscId()
                    , invoiceNo, criteria.getShipperCd(), true);
                mnInvIssueDt = twInvoiceDomain.getManualInvoiceIssueDt();
            }
        }
        // Get Invoice Work from the registration data.
        List<? extends TtInvoiceDomain> ttInvoiceList = createNormalInvoiceNoOnRegister(twInvList, criteria, normInvNoList, invIssueDt, mnInvIssueDt);
        // Registration of Invoice No. Palletize to the table, change of Palletize STATUS 
        updateTtPltzOnRegisterForMainInvoice(twInvList, normInvNoList, criteria, invIssueDt);
        // Subtraction of Temp Stock .
        updateTtTmpStockOnRegisterByQty(ttInvoiceList);
        // Add SHIPPED QUANTITY, the number of times the shipping instruction. 
        updateTtExpRcvOdrOnRegister(ttInvoiceList);
        
        // UT205 CML ATTACH CSV ADD START
        // Create a CML attach CSV file, registe it to the file manager.
        // CMLアタッチCSVファイルを作成し、ファイルマネージャーに登録
        createCmlAttachCsvFile(criteria, normInvNoList.get(0), invIssueDt);
        // UT205 CML ATTACH CSV ADD END

        // AI-JB キュー登録
        String requestId = commonService.createRequestJob(SCREEN_ID_W6009);
        List<TtOnlineReqJobParamDomain> reqJobList
            = new ArrayList<TtOnlineReqJobParamDomain>();
        TtOnlineReqJobParamDomain ttOnlineReqJobParamcriteria
            = new TtOnlineReqJobParamDomain();
        // 1件目
        ttOnlineReqJobParamcriteria.setRequestId(requestId);
        ttOnlineReqJobParamcriteria.setBrch(new BigDecimal(1));
        ttOnlineReqJobParamcriteria.setParamNm(PROCESS_TYP);
        ttOnlineReqJobParamcriteria.setParamValue01(TRANS_GINV_PROC_TYP_INVOICE);
        ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
        commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6009);
        reqJobList.add(ttOnlineReqJobParamcriteria);
        // 2件目以降
        TtInvoiceCriteriaDomain ttInvoiceCriteria = new TtInvoiceCriteriaDomain();
        ttInvoiceCriteria.setParInvoiceShipperCd(criteria.getShipperCd());
        ttInvoiceCriteria.setParInvoiceNo(normInvNoList.get(0));
        ttInvoiceCriteria.setParInvoiceIssueDt(invIssueDt);
        List<TtInvoiceDomain> resultList = ttInvoiceService.searchByCondition(ttInvoiceCriteria);
        BigDecimal brch = new BigDecimal(2);
        for(TtInvoiceDomain domain : resultList) {
            ttOnlineReqJobParamcriteria = new TtOnlineReqJobParamDomain();
            ttOnlineReqJobParamcriteria.setRequestId(requestId);
            ttOnlineReqJobParamcriteria.setBrch(brch);
            ttOnlineReqJobParamcriteria.setParamNm(KEY);
            ttOnlineReqJobParamcriteria.setParamValue01(domain.getShipperCd());
            ttOnlineReqJobParamcriteria.setParamValue02(domain.getInvoiceNo());
            String formatDate = new SimpleDateFormat("yyyyMMddHHmmss").format(domain.getInvoiceIssueDt());
            ttOnlineReqJobParamcriteria.setParamValue03(formatDate);
            ttOnlineReqJobParamcriteria.setParamValue04(FLAG_N);
            ttOnlineReqJobParamcriteria.setParamValue10(TRANS_GINV_REQ_REC_STATUS_NOT_YET); // L005 ADD
            commonService.setCommonPropertyForRegist(ttOnlineReqJobParamcriteria, SCREEN_ID_W6009);
            reqJobList.add(ttOnlineReqJobParamcriteria);
            brch = brch.add(new BigDecimal(1));
        }
        ttOnlineReqJobParamService.create(reqJobList);

        // If CIGMA part exists.
        // CIGMA品がある場合のみ。
        if (0 < ttInvoiceList.size()) { // UT453 ADD if
            // Set data to CIGMA.
            // CIGMAへの書き込み
            callWebService6001(criteria.getShipperCd(), ttInvoiceList);
    
            // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
            // Judgment of InvoiceDB processing. 
            // CIGMA環境原単位の取得（InvoicdDB用処理要否判断）
            TmCigmaEnvCriteriaDomain tmCigmaEnvCriteriaDomain = new TmCigmaEnvCriteriaDomain();
            tmCigmaEnvCriteriaDomain.setCompCd(criteria.getShipperCd());
            TmCigmaEnvDomain tmCigmaEnvDomain
                = tmCigmaEnvService.searchByKey(tmCigmaEnvCriteriaDomain);
    
            // call 6005 Webservice
            // 処理要の場合のみ6005のWebserviceを呼ぶ
            if (FLAG_Y.equals(tmCigmaEnvDomain.getInvDbFlg())) {
                // get OGC code
                // NEXUS会社原単位の取得（OGC code）
                TmNxsCompCriteriaDomain tmNxsCompCriteriaDomain = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteriaDomain.setCompCd(criteria.getShipperCd());
                TmNxsCompDomain tmNxsCompDomain = tmNxsCompService.searchByKey(tmNxsCompCriteriaDomain);
    
                // Set data to CIGMA(InvoiceDB).
                // CIGMA(InvoiceDB)への書き込み
                // ST144対応
                // callWebService6005(criteria.getOwnerCompCd(), ttInvoiceList, tmCigmaEnvDomain, tmNxsCompDomain);
                callWebService6005(criteria.getShipperCd(), ttInvoiceList, tmCigmaEnvDomain, tmNxsCompDomain);
            }
            // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<
        }

        // A.Chonthicha Re-invoice
        for(TwInvDomain twInvDomain : twInvList){
            if(FLAG_Y.equals(twInvDomain.getReInvoiceFlg())){
                callWebService6007(criteria.getShipperCd(), ttInvoiceList);
                break;
            }
        }

        // A.Chonthicha Excise tax
        callWebService6008(criteria.getShipperCd(), ttInvoiceList);

        criteria.setInvoiceNo(normInvNoList.get(0));
        criteria.setInvoiceIssueDt(invIssueDt);
        
        return  searchOnRegisterInitByFromMain(criteria); 
    }

    //**************** Web Service ****************//

    // 2014/11/17 A.Chonthicha Excise Tax
    /**
     * For CIGMA perform Excise Tax registration.
     * <pre>
     * -Web page get the data and pass to web service, create a delivery parameters.
     *    - SHIPPER CODE
     *    - Invoice No
     * 
     * - Web service call
     *   Argument in the following items:
     *   Call ws6008ThRestService.registerExciseTax(String, String).
     *     - SHIPPER CODE
     *     - Invoice No
     * </pre>
     * 
     * @param compCd COMPANY CODE
     * @param ttInvoiceList Invoice registration data list
     * @throws ApplicationException For CIGMA, Not possible to InvoiceDB registration
     */
    protected void callWebService6008(String compCd, List<? extends TtInvoiceDomain> ttInvoiceList)
        throws ApplicationException {

        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if (!(CML_TYPE_CIGMA.equals(ttInvDomain.getCmlTyp()) && INVOICE_CLASS_MAIN.equals(ttInvDomain.getInvoiceClass())
                && !MANUAL_TYP_RE_INVOICE.equals(ttInvDomain.getManualTyp()))) {
                continue;
            }
            // Call web service Ws6008
            ResultDomain resultDomain = ws6008ThRestService.registerExciseTax(
                compCd, ttInvDomain.getInvoiceNo());
            if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                throw new GscmApplicationException(NXS_E1_0058);
            }
        }
    }
}
