/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.service;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_INVOICE_NO_SUPPLIER_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_INVOICE_NO_SUPPLIER_FORMAT_FRT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CANCEL_TYP_CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CIGMA_FREIGHT_RESPONSIBLE_CD_COLLECT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CIGMA_FREIGHT_RESPONSIBLE_CD_PREPAID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_CIGMA;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FREIGHT_RESPONSIBLE_CD_PREPAID;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.GRP_NO2_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_FULL_RT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CLASS_MAIN;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.KEY;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.MANUAL_TYP_RE_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0031;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E7_0120;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PROCESS_TYP;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_LC;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REM_LC_TYP_REM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W6009;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_KEY_CANCEL_INVOICE_NO;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SEQ_KEY_RE_INVOICE_NO_CANCEL;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_PROC_TYP_INVOICE;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.TRANS_GINV_REQ_REC_STATUS_NOT_YET;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.UNIT_CD_CR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_ERT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_C;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_N;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CML_TYPE_MISCELLANEOUS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.INVOICE_CTGRY_I;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.asia.business.dao.W6001DocAsiaDao;
import com.globaldenso.eca0027.asia.business.ws.Ws6002AsiaRestService;
import com.globaldenso.eca0027.asia.business.ws.Ws6007AsiaRestService;
import com.globaldenso.eca0027.core.auto.business.domain.TmCancelInvSeqTypDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceAttachedDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtInvoiceHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtOnlineReqJobParamDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackAtchItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingAttachedCmlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPackingHeadDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwInvoiceDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceAttachedCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtInvoiceHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackAtchItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingAttachedCmlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPackingHeadCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ErrorParamListItemDomain;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6001ParamItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6005ParamEDT45PRDomain;
import com.globaldenso.eca0027.core.business.domain.Ws6005ParamEDT47PRDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W6001DocServiceImpl;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.globaldenso.gscm.framework.util.StringUtil;

/**
 * Service implementation class of Documentation.
 * 
 * @author $Author: A.Chonthicha $
 * @version $Revision: 10397 $
 */
public class W6001DocAsiaServiceImpl extends W6001DocServiceImpl {

    // A.Chonthicha DocDao for unique function
    /**
     * Documentation Dao for Asia unique function
     */
    protected W6001DocAsiaDao w6001DocAsiaDao;

    // A.Chonthicha Re-invoice
    /**
     * Web service client (Ws6007)/ For Re-invoice
     * Ws6007AsiaRestService
     */
    protected Ws6007AsiaRestService ws6007AsiaRestService;

    /**
     * Web service client (Ws6002)<br />
     */
    protected Ws6002AsiaRestService ws6002AsiaRestService;

    /**
     * Service Form L6008<br /> 
     */
    protected L6008ReportAsiaService l6008ReportAsiaService;

    /**
     * Default constructor.<br />
     */
    public W6001DocAsiaServiceImpl() {
        super();
    }

    // --- Setter ----------------------------------------------------------------------------------

    /**
     * Setter method for w6001DocDaoAsia.
     *
     * @param docAsiaDao Set for w6001DocDao
     */
    public void setW6001DocAsiaDao(W6001DocAsiaDao docAsiaDao) {
        w6001DocAsiaDao = docAsiaDao;
    }

    // A.Chonthicha Re-invoice for cancel
    /**
     * Setter method for ws6002AsiaRestService.
     *
     * @param Ws6002AsiaRestService Set for Ws6002AsiaRestService
     */
    public void setWs6002AsiaRestService(Ws6002AsiaRestService Ws6002AsiaRestService) {
        this.ws6002AsiaRestService = Ws6002AsiaRestService;
    }

    // A.Chonthicha Re-invoice
    /**
     * <p>Setter method for ws6007AsiaRestService/ For Re-invoice.</p>
     *
     * @param ws6007AsiaRestService Set for ws6007AsiaRestService
     */
    public void setWs6007AsiaRestService(Ws6007AsiaRestService ws6007AsiaRestService) {
        this.ws6007AsiaRestService = ws6007AsiaRestService;
    }

    /**
     * Setter method for L6008ReportAsiaService.
     *
     * @param reportAsiaService Set for L6008ReportAsiaService
     */
    public void setL6008ReportAsiaService(L6008ReportAsiaService reportAsiaService) {
        l6008ReportAsiaService = reportAsiaService;
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
     * Create a Web service parameters of "sales and orders and stock registration".
     * <pre>
     * - Data acquisition of the header information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.EsuieiarushietchiTtInvoiceByHeaderRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE 
     *
     * - Data acquisition of specification information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.SearchTtInvoiceAttached (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * @param invoiceNo Invoice No<br />
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * @return Call parameters domain of Web services<br />
     * @throws ApplicationException If the parameter Creating Web Services "in sales and orders and stock registration" can not be<br />
     */
    protected Ws6001ParamDomain prepareWs6001ParamDomain (String shipperCd, String invoiceNo, Date invoiceIssueDt)
        throws ApplicationException {
        
        Ws6001ParamDomain paramDomain = new Ws6001ParamDomain();
        List<Ws6001ParamItemDomain> itemDomainList = new ArrayList<Ws6001ParamItemDomain>();
        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        // Get information to pass to the Web service corresponding to the search condition (header part). 
        W6001DocInvoiceDomain headDomain = w6001DocAsiaDao.searchTtInvoiceByHeaderRegisterAsia(criteria);

        paramDomain.setInvoiceNo(StringUtils.defaultString(headDomain.getInvoiceNo()));
        paramDomain.setCustomerCd(StringUtils.defaultString(headDomain.getCustomerCd()));
        paramDomain.setShipToNo(StringUtils.defaultString(headDomain.getLgcyShipTo()));
        paramDomain.setDateOfIssuedDocument(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getInvoiceIssueDt(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setDDNo(StringUtils.defaultString(headDomain.getRelateInvoiceNo()));
        paramDomain.setShippedDate(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getShippedDt(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setTypeOfShipment(StringUtils.left(StringUtils.defaultString(headDomain.getTrnsNm()), 10)); // UT369 ADD
        paramDomain.setEstimatedArrivalDate(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getEta(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setEstimatedArrivalTime(StringUtils.defaultString(headDomain.getArrivalTime()));
        paramDomain.setShipToName(StringUtils.defaultString(headDomain.getShipToNm1()));
        paramDomain.setShipToAddress1(StringUtils.defaultString(headDomain.getShipToAddr1()));
        paramDomain.setShipToAddress2(StringUtils.defaultString(headDomain.getShipToAddr2()));
        paramDomain.setShipToAddress3(StringUtils.defaultString(headDomain.getShipToAddr3()));
        paramDomain.setShipToCountryCode(StringUtils.defaultString(headDomain.getCntryCdShipTo()));
        // 2015/11/02 A.Chonthicha: set total no of CML/invoice as total package
        // paramDomain.setNoOfCartons("0");
        paramDomain.setNoOfCartons(headDomain.getPltzItemQty().toPlainString());
        // UT395 MOD START
        //paramDomain.setTotalGrossWeight(headDomain.getTotalGrossWeight().toPlainString());
        //paramDomain.setTotalNetWeight(headDomain.getTotalNetWeight().toPlainString());

        // If overflow CIGMA integer digit number 6, to set the 999999.999.
        // CIGMAの桁数6を超えている場合、999999.999を設定する。
        BigDecimal totalGrossWeightWork = headDomain.getTotalGrossWeight();
        if (6 < totalGrossWeightWork.precision() - totalGrossWeightWork.scale()) {
            totalGrossWeightWork = new BigDecimal("999999.999");
        }
        paramDomain.setTotalGrossWeight(totalGrossWeightWork.toPlainString());
        // If overflow CIGMA integer digit number 6, to set the 999999.999.
        // CIGMAの桁数6を超えている場合、999999.999を設定する。
        BigDecimal totalNetWeightWork = headDomain.getTotalNetWeight();
        if (6 < totalNetWeightWork.precision() - totalNetWeightWork.scale()) {
            totalNetWeightWork = new BigDecimal("999999.999");
        }
        paramDomain.setTotalNetWeight(totalNetWeightWork.toPlainString());
        // UT395 MOD END

        paramDomain.setWeightUnit(StringUtils.defaultString(headDomain.getLgcyUnitCd()));
        paramDomain.setWeightUnitonDoc(StringUtils.defaultString(headDomain.getTotalNetWeightUnit()));

        // UT395 MOD START
        //BigDecimal totalVol = commonService.convertVolumeUnit(headDomain.getTotalVolume(), headDomain.getVolumeUnit(), UNIT_CD_CR);
        //if (totalVol == null) {
        //    Object[] params = { 
        //        commonService.getResource(headDomain.getLocale(), "label.totalVol") 
        //    };
        //    throw new GscmApplicationException(NXS_E7_0157, params); 
        //}
        //paramDomain.setTotalVolume(totalVol.setScale(0, BigDecimal.ROUND_UP).toPlainString());

        // It converted to m3 for volume.
        // If overflow CIGMA integer digit number 7, to set the 9999999.
        // 容積についてはm3に変換する。
        // CIGMAの桁数7を超えている場合、9999999を設定する。
        BigDecimal totaVolumeWork
            = commonService.convertVolumeUnitNoOverflowCheck(headDomain.getTotalVolume(),
                headDomain.getVolumeUnit(), UNIT_CD_CR).setScale(0, BigDecimal.ROUND_UP);
        if (7 < totaVolumeWork.precision() - totaVolumeWork.scale()) {
            totaVolumeWork = new BigDecimal("9999999");
        }
        paramDomain.setTotalVolume(totaVolumeWork.toPlainString());
        // UT395 MOD END

        paramDomain.setCarrierName(StringUtils.defaultString(headDomain.getCarrierCompNmAbb()));
        paramDomain.setCarrierAddress1(StringUtils.defaultString(headDomain.getPrintCompAddr1()));
        paramDomain.setCarrierAddress2(StringUtils.defaultString(headDomain.getPrintCompAddr2()));
        paramDomain.setCarrierAddress3(StringUtils.defaultString(headDomain.getPrintCompAddr3()));
        paramDomain.setCarrierCountryCode(StringUtils.defaultString(headDomain.getCntryCdCarrier()));
        // UT321 MOD START
        String spInfoWork = "";
        String[] spInfoLines = StringUtils.defaultString(headDomain.getSpInfo()).split("\n");
        for (String spInfoLine : spInfoLines) {
//            spInfoWork += StringUtils.rightPad(spInfoLine, 30, ' ');
            spInfoWork = spInfoWork.concat(StringUtils.rightPad(spInfoLine, 30, ' '));
        }
        paramDomain.setSpecialInfomation(StringUtils.mid(spInfoWork, 0, 30));
        // UT321 MOD END
        paramDomain.setSenderName(StringUtils.defaultString(headDomain.getShipperCompNm1()));
        paramDomain.setSenderAddress1(StringUtils.defaultString(headDomain.getShipperCompAddr1()));
        paramDomain.setSenderAddress2(StringUtils.defaultString(headDomain.getShipperCompAddr2()));
        paramDomain.setSenderAddress3(StringUtils.defaultString(headDomain.getShipperCompAddr3()));
        paramDomain.setSenderCountryCode(StringUtils.defaultString(headDomain.getCntryCdShipper()));
        paramDomain.setBilingCompanyVatNo(StringUtils.defaultString(headDomain.getShipperTaxIdNo()));
        // UT317 START >>>>>
        paramDomain.setBillingTelNo(StringUtils.defaultString(headDomain.getShipperCompTel()));
        paramDomain.setBillingFaxNo(StringUtils.defaultString(headDomain.getShipperCompFax()));
        // UT317 END <<<<<
        paramDomain.setAccounteeNo("");
        paramDomain.setAccounteeName("");
        paramDomain.setAccounteeAddress1("");
        paramDomain.setAccounteeAddress2("");
        paramDomain.setAccounteeAddress3("");
        paramDomain.setAccounteeCountryCode("");
        paramDomain.setPaymentTerms(StringUtils.defaultString(headDomain.getPayTerms()));
        paramDomain.setTradeTerms(StringUtils.defaultString(headDomain.getTradeTerms()));
        paramDomain.setDeliveryPoint(StringUtils.defaultString(headDomain.getDlivPoint()));
        paramDomain.setPriceTerms(StringUtils.defaultString(headDomain.getPriceTerms()));
        paramDomain.setInvoiceAuthorizedName(StringUtils.left(StringUtils.defaultString(headDomain.getApprovalNm()), 20));
        paramDomain.setInvoiceAuthorizedPosition(StringUtils.left(StringUtils.defaultString(headDomain.getApprovalPosition()), 20));
        paramDomain.setInvoiceAmount(headDomain.getTotalInvoiceAmount().toPlainString());
        paramDomain.setInvoiceAmountCurCd3Digit(StringUtils.defaultString(headDomain.getTotalInvoiceAmountCurrCd()));
        paramDomain.setTax(headDomain.getVat().toPlainString());
        paramDomain.setTaxpc(headDomain.getVatRatio().toPlainString());
        paramDomain.setInsurance(headDomain.getInsurance().toPlainString());
        paramDomain.setFreight(headDomain.getFreight().toPlainString());
        
        paramDomain.setLibPgm(StringUtils.defaultString(headDomain.getLibPgm()));
        paramDomain.setJobHost(StringUtils.defaultString(headDomain.getJobHost()));
        paramDomain.setJobUser(StringUtils.defaultString(headDomain.getJobUser()));
        paramDomain.setJobPassword(StringUtils.defaultString(headDomain.getJobPassword()));
        paramDomain.setJobDescription(StringUtils.defaultString(headDomain.getJobDescription()));
        
        // Freight Status
        if (FREIGHT_RESPONSIBLE_CD_PREPAID.equals(headDomain.getFreightResponsibleCd())) {
            paramDomain.setFreightStatus(CIGMA_FREIGHT_RESPONSIBLE_CD_PREPAID); // UT285 MOD
        } else {
            paramDomain.setFreightStatus(CIGMA_FREIGHT_RESPONSIBLE_CD_COLLECT); // UT285 MOD
        }
        // REM LC TYP:REM
        if (REM_LC_TYP_REM.equals(headDomain.getRemLcTyp())) {
            paramDomain.setBankName(StringUtils.defaultString(headDomain.getRemBankNm()));
            paramDomain.setBankAddress1(StringUtils.defaultString(headDomain.getRemBankAddress1()));
            paramDomain.setBankAddress2(StringUtils.defaultString(headDomain.getRemBankAddress2()));
            paramDomain.setBankAddress3(StringUtils.defaultString(headDomain.getRemBankAddress3()));
            paramDomain.setBankAccountNo(StringUtils.defaultString(headDomain.getRemBankAccountNo()));
        }
        // REM LC TYP:LC
        if (REM_LC_TYP_LC.equals(headDomain.getRemLcTyp())) {
            paramDomain.setBankName(StringUtils.defaultString(headDomain.getLcBank1()));
            paramDomain.setBankAddress1("");
            paramDomain.setBankAddress2("");
            paramDomain.setBankAddress3("");
            paramDomain.setBankAccountNo("");
        }
        
        if (25 < paramDomain.getShipToAddress1().length()) {
            paramDomain.setShipToAddress1(paramDomain.getShipToAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getShipToAddress2().length()) {
            paramDomain.setShipToAddress2(paramDomain.getShipToAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getShipToAddress3().length()) {
            paramDomain.setShipToAddress3(paramDomain.getShipToAddress3().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress1().length()) {
            paramDomain.setCarrierAddress1(paramDomain.getCarrierAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress2().length()) {
            paramDomain.setCarrierAddress2(paramDomain.getCarrierAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress3().length()) {
            paramDomain.setCarrierAddress3(paramDomain.getCarrierAddress3().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress1().length()) {
            paramDomain.setSenderAddress1(paramDomain.getSenderAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress2().length()) {
            paramDomain.setSenderAddress2(paramDomain.getSenderAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress3().length()) {
            paramDomain.setSenderAddress3(paramDomain.getSenderAddress3().substring(0, 25));
        }
        // Get the information to be passed to the Web service corresponding to the search criteria. 
        List<? extends W6001DocInvoiceDomain> dtlDomainList = w6001DocDao.searchTtInvoiceAttached(criteria);
        
        for (W6001DocInvoiceDomain dtlDomain : dtlDomainList) {
            for (W6001DocPltzDomain pltzDomain : dtlDomain.getDocPltzList()) {
                for (W6001DocPltzItemDomain pltzItemDomain : pltzDomain.getDocPltzItemList()) {
                    Ws6001ParamItemDomain itemDomain = new Ws6001ParamItemDomain();
                    
                    itemDomain.setPartNo(StringUtils.defaultString(dtlDomain.getItemNo()));
                    itemDomain.setEtdDueDate(DateUtil.formatDate(pltzItemDomain.getEtdDueDt(), WS_CIGMA_DATE_FORMAT));
                    itemDomain.setCustomerPoNo(StringUtils.defaultString(dtlDomain.getCustomerPoNo()));
                    itemDomain.setCustomerPartNo(StringUtils.defaultString(dtlDomain.getCustomerItemNo()));
                    itemDomain.setInstructedShippingQty(pltzItemDomain.getAllocQty().toPlainString());
                    itemDomain.setShippedQty(pltzItemDomain.getAllocQty().toPlainString());
                    itemDomain.setSalesCompanyPoNo(StringUtils.defaultString(pltzItemDomain.getSalesCompPoNo()));
                    itemDomain.setUnitOfMeasure(StringUtils.defaultString(dtlDomain.getLgcyUnitCd()));
                    itemDomain.setUnitOfMeasureOnDocument(StringUtils.defaultString(dtlDomain.getQtyUnit()));
                    itemDomain.setSalesUnitPrice(StringUtils.defaultString(dtlDomain.getUnitPrice()));
                    itemDomain.setSalesUnitPriceCurCd3Digit(StringUtils.defaultString(dtlDomain.getUnitPriceCurrCd()));
                    itemDomain.setCurrentWarehouse(StringUtils.defaultString(pltzDomain.getCurLgcyWhCd()));
                    // UT413-3 ADD START
                    if (pltzItemDomain.getShippingLot() != null) {
                        itemDomain.setShippingLot(pltzItemDomain.getShippingLot().toPlainString());
                    }
                    // UT413-3 ADD END
                    // UT436 ADD START
                    itemDomain.setItemDescription(
                        StringUtils.defaultString(StringUtils.left(pltzItemDomain.getItemDescription(), 25))
                    );
                    // UT436 ADD END
                    
                    itemDomainList.add(itemDomain);
                }
            }
        }
        paramDomain.setSalesDetailList(itemDomainList);
        return paramDomain;
    }

    /**
     * Create a Web service parameters of "InvoiceDB registration".
     * <pre>
     * - Data acquisition of the EDT46PR information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.searchTtInvoiceByEDT46PRRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE 
     *
     * - Data acquisition of the EDT47PR information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.searchTtInvoiceAttachedByEDT47PRRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *
     * - Data acquisition of the EDT45PR information
     *   W6001DocCriteriaDomain Set the following items,
     *   Call W6001DocDao.searchTtInvoiceAttachedByEDT45PRRegister (W6001DocCriteriaDomain).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * @param invoiceNo Invoice No<br />
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * @param libInvDb LIB(INVOICE_DB)<br />
     * @param newLincSubsidiaryCd NEW LINC SUBSIDIARY CODE<br />
     * @return Call parameters domain of Web services<br />
     * @throws ApplicationException If the parameter Creating Web Services "InvoiceDB registration" can not be<br />
     */
    protected Ws6005ParamDomain prepareWs6005ParamDomain (String shipperCd
        , String invoiceNo
        , Date invoiceIssueDt
        , String libInvDb
        , String newLincSubsidiaryCd)
        throws ApplicationException {
        
        Ws6005ParamDomain paramDomain = new Ws6005ParamDomain();
        List<Ws6005ParamEDT47PRDomain> itemDomainList = new ArrayList<Ws6005ParamEDT47PRDomain>();
        List<Ws6005ParamEDT45PRDomain> itemDomain2List = new ArrayList<Ws6005ParamEDT45PRDomain>();

        // IN162 ADD START
        // Search Shipper unit.
        // シッパー単位系の検索
        VtCompMeasureUnitDomain vtCompMeasureUnitDomain = commonService.searchMeasureUnit(shipperCd);
        // IN162 ADD END

        
        W6001DocCriteriaDomain criteria = new W6001DocCriteriaDomain();
        criteria.setShipperCd(shipperCd);
        criteria.setInvoiceNo(invoiceNo);
        criteria.setInvoiceIssueDt(invoiceIssueDt);
        // Get information to pass to the Web service corresponding to the search condition (EDT46PR). 
        W6001DocInvoiceDomain headDomain = w6001DocAsiaDao.searchTtInvoiceByEDT46PRRegisterAsia(criteria);

        paramDomain.setInvoiceNo(StringUtils.defaultString(headDomain.getInvoiceNo()));
        paramDomain.setCustomerCd(StringUtils.defaultString(headDomain.getCustomerCd()));
        paramDomain.setShipToNo(StringUtils.defaultString(headDomain.getLgcyShipTo()));
        paramDomain.setDateOfIssuedDocument(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getInvoiceIssueDt(), WS_CIGMA_DATE_FORMAT)));
        // 2014/11/18 DNJP.Kawamura ST074 START >>>>>
        paramDomain.setDDNo(StringUtils.defaultString(headDomain.getRelateInvoiceNo()));
        // 2014/11/18 DNJP.Kawamura ST074 END <<<<<
        paramDomain.setShippedDate(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getShippedDt(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setTypeOfShipment(StringUtils.left(StringUtils.defaultString(headDomain.getTrnsNm()), 10)); // UT369 ADD
        paramDomain.setEstimatedArrivalDate(StringUtils.defaultString(DateUtil.formatDate(
            headDomain.getEta(), WS_CIGMA_DATE_FORMAT)));
        paramDomain.setEstimatedArrivalTime(StringUtils.defaultString(headDomain.getArrivalTime()));
        paramDomain.setShipToName(StringUtils.defaultString(headDomain.getShipToNm1()));
        paramDomain.setShipToAddress1(StringUtils.defaultString(headDomain.getShipToAddr1()));
        paramDomain.setShipToAddress2(StringUtils.defaultString(headDomain.getShipToAddr2()));
        paramDomain.setShipToAddress3(StringUtils.defaultString(headDomain.getShipToAddr3()));
        paramDomain.setShipToCountryCode(StringUtils.defaultString(headDomain.getCntryCdShipTo()));
        // 2015/11/02 A.Chonthicha: set total no of CML/invoice as total package
        // paramDomain.setNoOfCartons("0");
        paramDomain.setNoOfCartons(headDomain.getPltzItemQty().toPlainString());
        // UT395 MOD START
        //paramDomain.setTotalGrossWeight(headDomain.getTotalGrossWeight().toPlainString());
        //paramDomain.setTotalNetWeight(headDomain.getTotalNetWeight().toPlainString());

        // If overflow CIGMA integer digit number 6, to set the 999999.999.
        // CIGMAの桁数6を超えている場合、999999.999を設定する。
        BigDecimal totalGrossWeightWork = headDomain.getTotalGrossWeight();
        if (6 < totalGrossWeightWork.precision() - totalGrossWeightWork.scale()) {
            totalGrossWeightWork = new BigDecimal("999999.999");
        }
        paramDomain.setTotalGrossWeight(totalGrossWeightWork.toPlainString());
        // If overflow CIGMA integer digit number 6, to set the 999999.999.
        // CIGMAの桁数6を超えている場合、999999.999を設定する。
        BigDecimal totalNetWeightWork = headDomain.getTotalNetWeight();
        if (6 < totalNetWeightWork.precision() - totalNetWeightWork.scale()) {
            totalNetWeightWork = new BigDecimal("999999.999");
        }
        paramDomain.setTotalNetWeight(totalNetWeightWork.toPlainString());
        // UT395 MOD END

        paramDomain.setWeightUnit(StringUtils.defaultString(headDomain.getLgcyUnitCd()));
        paramDomain.setWeightUnitonDoc(StringUtils.defaultString(headDomain.getTotalNetWeightUnit()));

        // UT395 MOD START
        //BigDecimal totalVol = commonService.convertVolumeUnit(headDomain.getTotalVolume(), headDomain.getVolumeUnit(), UNIT_CD_CR);
        //if (totalVol == null) {
        //    Object[] params = { 
        //        commonService.getResource(headDomain.getLocale(), "label.totalVol") 
        //    };
        //    throw new GscmApplicationException(NXS_E7_0157, params); 
        //}
        //paramDomain.setTotalVolume(totalVol.setScale(0, BigDecimal.ROUND_UP).toPlainString());

        // It converted to m3 for volume.
        // 容積についてはm3に変換する。
        BigDecimal totaVolumeConverted
            = commonService.convertVolumeUnitNoOverflowCheck(headDomain.getTotalVolume(),
                headDomain.getVolumeUnit(), UNIT_CD_CR);
        // If overflow CIGMA integer digit number 7, to set the 9999999.
        // CIGMAの桁数7を超えている場合、9999999を設定する。
        BigDecimal totaVolumeWork = totaVolumeConverted.setScale(0, BigDecimal.ROUND_UP);
        if (7 < totaVolumeWork.precision() - totaVolumeWork.scale()) {
            totaVolumeWork = new BigDecimal("9999999");
        }
        paramDomain.setTotalVolume(totaVolumeWork.toPlainString());
        // If overflow CIGMA integer digit number 9, to set the 999999999.999 .
        // CIGMAの桁数9を超えている場合、999999999.999を設定する。
        totaVolumeWork = totaVolumeConverted;
        if (9 < totaVolumeWork.precision() - totaVolumeWork.scale()) {
            totaVolumeWork = new BigDecimal("999999999.999");
        }
        paramDomain.setTotalVolume2(totaVolumeWork.toPlainString());
        // UT395 MOD END
        
        paramDomain.setCarrierName(StringUtils.defaultString(headDomain.getCarrierCompNmAbb()));
        paramDomain.setCarrierAddress1(StringUtils.defaultString(headDomain.getPrintCompAddr1()));
        paramDomain.setCarrierAddress2(StringUtils.defaultString(headDomain.getPrintCompAddr2()));
        paramDomain.setCarrierAddress3(StringUtils.defaultString(headDomain.getPrintCompAddr3()));
        paramDomain.setCarrierCountryCode(StringUtils.defaultString(headDomain.getCntryCdCarrier()));
        // UT321 MOD START
        String spInfoWork = "";
        String[] spInfoLines = StringUtils.defaultString(headDomain.getSpInfo()).split("\n");
        for (String spInfoLine : spInfoLines) {
//            spInfoWork += StringUtils.rightPad(spInfoLine, 30, ' ');
            spInfoWork = spInfoWork.concat(StringUtils.rightPad(spInfoLine, 30, ' '));
        }
        paramDomain.setSpecialInfomation(StringUtils.mid(spInfoWork, 0, 30));
        paramDomain.setSpecialInfomation1(StringUtils.mid(spInfoWork, 30, 60));
        paramDomain.setSpecialInfomation2(StringUtils.mid(spInfoWork, 90, 60));
        // UT321 MOD END
        paramDomain.setSenderName(StringUtils.defaultString(headDomain.getShipperCompNm1()));
        paramDomain.setSenderAddress1(StringUtils.defaultString(headDomain.getShipperCompAddr1()));
        paramDomain.setSenderAddress2(StringUtils.defaultString(headDomain.getShipperCompAddr2()));
        paramDomain.setSenderAddress3(StringUtils.defaultString(headDomain.getShipperCompAddr3()));
        paramDomain.setSenderCountryCode(StringUtils.defaultString(headDomain.getCntryCdShipper()));
        paramDomain.setBilingCompanyVatNo(StringUtils.defaultString(headDomain.getShipperTaxIdNo()));
        // UT317 START >>>>>
        // 2014/11/18 DNJP.Kawamura ST162 START >>>>>
        paramDomain.setBillingTelNo(StringUtils.defaultString(headDomain.getShipperCompTel()));
        paramDomain.setBillingFaxNo(StringUtils.defaultString(headDomain.getShipperCompFax()));
        // 2014/11/18 DNJP.Kawamura ST162 END <<<<<
        // UT317 END <<<<<
        paramDomain.setAccounteeNo("");
        paramDomain.setAccounteeName("");
        paramDomain.setAccounteeAddress1("");
        paramDomain.setAccounteeAddress2("");
        paramDomain.setAccounteeAddress3("");
        paramDomain.setAccounteeCountryCode("");
        paramDomain.setPaymentTerms(StringUtils.defaultString(headDomain.getPayTerms()));
        paramDomain.setTradeTerms(StringUtils.defaultString(headDomain.getTradeTerms()));
        paramDomain.setDeliveryPoint(StringUtils.defaultString(headDomain.getDlivPoint()));
        paramDomain.setPriceTerms(StringUtils.defaultString(headDomain.getPriceTerms()));
        paramDomain.setInvoiceAuthorizedName(StringUtils.left(StringUtils.defaultString(headDomain.getApprovalNm()), 20));
        paramDomain.setInvoiceAuthorizedPosition(StringUtils.left(StringUtils.defaultString(headDomain.getApprovalPosition()), 20));
        paramDomain.setInvoiceAmount(headDomain.getTotalInvoiceAmount().toPlainString());
        paramDomain.setInvoiceAmountCurCd3Digit(StringUtils.defaultString(headDomain.getTotalInvoiceAmountCurrCd()));
        paramDomain.setTax(headDomain.getVat().toPlainString());
        paramDomain.setTaxpc(headDomain.getVatRatio().toPlainString());
        paramDomain.setInsurance(headDomain.getInsurance().toPlainString());
        paramDomain.setFreight(headDomain.getFreight().toPlainString());
        paramDomain.setLibInvDb(libInvDb);
        paramDomain.setOgccd(newLincSubsidiaryCd);
        
        // Freight Status
        if (FREIGHT_RESPONSIBLE_CD_PREPAID.equals(headDomain.getFreightResponsibleCd())) {
            paramDomain.setFreightStatus(CIGMA_FREIGHT_RESPONSIBLE_CD_PREPAID); // UT285 MOD
        } else {
            paramDomain.setFreightStatus(CIGMA_FREIGHT_RESPONSIBLE_CD_COLLECT); // UT285 MOD
        }
        // REM LC TYP:REM
        if (REM_LC_TYP_REM.equals(headDomain.getRemLcTyp())) {
            paramDomain.setBankName(StringUtils.defaultString(headDomain.getRemBankNm()));
            paramDomain.setBankAddress1(StringUtils.defaultString(headDomain.getRemBankAddress1()));
            paramDomain.setBankAddress2(StringUtils.defaultString(headDomain.getRemBankAddress2()));
            paramDomain.setBankAddress3(StringUtils.defaultString(headDomain.getRemBankAddress3()));
            paramDomain.setBankAccountNo(StringUtils.defaultString(headDomain.getRemBankAccountNo()));
        }
        // REM LC TYP:LC
        if (REM_LC_TYP_LC.equals(headDomain.getRemLcTyp())) {
            paramDomain.setBankName(StringUtils.defaultString(headDomain.getLcBank1()));
            paramDomain.setBankAddress1("");
            paramDomain.setBankAddress2("");
            paramDomain.setBankAddress3("");
            paramDomain.setBankAccountNo("");
        }
        
        if (25 < paramDomain.getShipToAddress1().length()) {
            paramDomain.setShipToAddress1(paramDomain.getShipToAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getShipToAddress2().length()) {
            paramDomain.setShipToAddress2(paramDomain.getShipToAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getShipToAddress3().length()) {
            paramDomain.setShipToAddress3(paramDomain.getShipToAddress3().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress1().length()) {
            paramDomain.setCarrierAddress1(paramDomain.getCarrierAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress2().length()) {
            paramDomain.setCarrierAddress2(paramDomain.getCarrierAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getCarrierAddress3().length()) {
            paramDomain.setCarrierAddress3(paramDomain.getCarrierAddress3().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress1().length()) {
            paramDomain.setSenderAddress1(paramDomain.getSenderAddress1().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress2().length()) {
            paramDomain.setSenderAddress2(paramDomain.getSenderAddress2().substring(0, 25));
        }
        if (25 < paramDomain.getSenderAddress3().length()) {
            paramDomain.setSenderAddress3(paramDomain.getSenderAddress3().substring(0, 25));
        }
                
        // Get the information to be passed to the Web service corresponding to the search criteria(EDT47PR). 
        List<? extends W6001DocInvoiceDomain> dtlDomainList = w6001DocDao.searchTtInvoiceAttachedByEDT47PRRegister(criteria);
        
        for (W6001DocInvoiceDomain dtlDomain : dtlDomainList) {
            for (W6001DocPltzDomain pltzDomain : dtlDomain.getDocPltzList()) {
                for (W6001DocPltzItemDomain pltzItemDomain : pltzDomain.getDocPltzItemList()) {
                    Ws6005ParamEDT47PRDomain itemDomain = new Ws6005ParamEDT47PRDomain();
                    
                    itemDomain.setPartNo(StringUtils.defaultString(dtlDomain.getItemNo()));
                    itemDomain.setEtdDueDate(DateUtil.formatDate(pltzItemDomain.getEtdDueDt(), WS_CIGMA_DATE_FORMAT));
                    itemDomain.setCustomerPoNo(StringUtils.defaultString(dtlDomain.getCustomerPoNo()));
                    itemDomain.setCustomerPartNo(StringUtils.defaultString(dtlDomain.getCustomerItemNo()));
                    itemDomain.setInstructedShippingQty(pltzItemDomain.getAllocQty().toPlainString());
                    itemDomain.setShippedQty(pltzItemDomain.getAllocQty().toPlainString());
                    itemDomain.setSalesCompanyPoNo(StringUtils.defaultString(pltzItemDomain.getSalesCompPoNo()));
                    itemDomain.setUnitOfMeasure(StringUtils.defaultString(dtlDomain.getLgcyUnitCd()));
                    itemDomain.setUnitOfMeasureOnDocument(StringUtils.defaultString(dtlDomain.getQtyUnit()));
                    itemDomain.setSalesUnitPrice(StringUtils.defaultString(dtlDomain.getUnitPrice()));
                    itemDomain.setSalesUnitPriceCurCd3Digit(StringUtils.defaultString(dtlDomain.getUnitPriceCurrCd()));
                    itemDomain.setCurrentWarehouse(StringUtils.defaultString(pltzDomain.getCurLgcyWhCd()));
                    itemDomain.setCountryOfOrigin(StringUtils.defaultString(pltzItemDomain.getOriginCntryCd()));
                    // UT413-3 ADD START
                    if (pltzItemDomain.getShippingLot() != null) {
                        itemDomain.setShippingLot(pltzItemDomain.getShippingLot().toPlainString());
                    }
                    // UT413-3 ADD END
                    // UT436 ADD START
                    itemDomain.setItemDescription(
                        StringUtils.defaultString(StringUtils.left(pltzItemDomain.getItemDescription(), 25))
                    );
                    // UT436 ADD END
                    
                    itemDomainList.add(itemDomain);
                }
            }
        }        
        paramDomain.setEDT47PRList(itemDomainList);

        // Get the information to be passed to the Web service corresponding to the search criteria(EDT45PR).
        List<? extends W6001DocInvoiceDomain> dtlDomain2List = w6001DocDao.searchTtInvoiceAttachedByEDT45PRRegister(criteria);
        
        for (W6001DocInvoiceDomain dtlDomain2 : dtlDomain2List) {
            for (W6001DocPltzDomain pltzDomain2 : dtlDomain2.getDocPltzList()) {
                for (W6001DocPltzItemDomain pltzItemDomain2 : pltzDomain2.getDocPltzItemList()) {
                    Ws6005ParamEDT45PRDomain itemDomain2 = new Ws6005ParamEDT45PRDomain();

                    itemDomain2.setFreight(dtlDomain2.getFreight().toPlainString());
                    itemDomain2.setInsurance(dtlDomain2.getInsurance().toPlainString());
                    itemDomain2.setInvoiceAmount(dtlDomain2.getTotalInvoiceAmount().toPlainString());
                    itemDomain2.setCustomerPoNo(StringUtils.defaultString(dtlDomain2.getCustomerPoNo()));
                    itemDomain2.setCustomerPartNo(StringUtils.defaultString(dtlDomain2.getCustomerItemNo()));
                    itemDomain2.setPartNo(StringUtils.defaultString(dtlDomain2.getItemNo()));                    
                    itemDomain2.setSalesUnitPrice(StringUtils.defaultString(dtlDomain2.getUnitPrice()));
                    itemDomain2.setSalesUnitPriceCurCd3Digit(StringUtils.defaultString(dtlDomain2.getUnitPriceCurrCd()));
                    itemDomain2.setNetAmount(dtlDomain2.getNetAmount().toPlainString());
                    // IN162 MOD START
                    // Convert N/W shipper unit.
                    // If overflow CIGMA integer digit number 11, to set the 99999999999.999.
                    // N/Wをシッパーの単位へ変換。
                    // CIGMAの桁数11を超えている場合、99999999999.999を設定する。
                    BigDecimal convertedNetWeight
                        = commonService.convertWeightUnitNoOverflowCheck(dtlDomain2.getTotalNetWeight(),
                            pltzItemDomain2.getWeightUnit(), vtCompMeasureUnitDomain.getWeightUnit());
                    if (11 < convertedNetWeight.precision() - convertedNetWeight.scale()) {
                        convertedNetWeight = new BigDecimal("99999999999.999");
                    }
                    itemDomain2.setNetWeight(convertedNetWeight.toPlainString());
                    // IN162 MOD END
                    // 2014/12/10 DNJP.Kawamura ST183 START >>>>>
                    itemDomain2.setUnitOfMeasureOnDocument(StringUtils.defaultString(dtlDomain2.getQtyUnit()));
                    // 2014/12/10 DNJP.Kawamura ST183 END <<<<<
                    itemDomain2.setCml(StringUtils.defaultString(pltzDomain2.getMainMark()));
                    itemDomain2.setGrossWeight(pltzDomain2.getGrossWeight().toPlainString());
                    itemDomain2.setItemWeight(pltzItemDomain2.getItemWeight().toPlainString());
                    itemDomain2.setShippedQty(pltzItemDomain2.getAllocQty().toPlainString());
                    // UT432 ADD START
                    itemDomain2.setItemDescription(
                        StringUtils.defaultString(StringUtils.left(pltzItemDomain2.getItemDescription(), 25))
                    );
                    // UT432 ADD END
                    
                    itemDomain2List.add(itemDomain2);
                }
            }
        }
        
        paramDomain.setEDT45PRList(itemDomain2List);
        return paramDomain;
    }

    /**
     * Acquisition of Invoice No cancellation numbering object data
     * <pre>
     * - Invoice search
     *   TtInvoiceDomain Set the following items,
     *   TtInvoiceService.SearchByCondition (TtInvoiceCriteriaDomain) Calls.
     *     - Parent Invoice No: Invoice No
     *     - SHIPPER CODE parent of Invoice: SHIPPER CODE
     *     - Parent INVOICE ISSUE DATE: INVOICE ISSUE DATE
     * </pre>
     * 
     * @param shipperCd SHIPPER CODE<br />
     * @param invoiceNo Invoice No<br />
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * @return List of canceled Invoice No numbering target data obtained<br />
     * @throws ApplicationException Unable to obtain cancellation of Invoice No numbering object data<br />
     */
    protected List<? extends TtInvoiceDomain> searchTtInvoiceOnRegisterByCancel (String shipperCd, String invoiceNo, Date invoiceIssueDt) 
        throws ApplicationException {
        
        TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
        criteria.setParInvoiceNo(invoiceNo);
        criteria.setParInvoiceShipperCd(shipperCd);
        criteria.setParInvoiceIssueDt(invoiceIssueDt);

        criteria.setPreferredOrder("INVOICE_CLASS desc, INVOICE_NO");

        List<TtInvoiceDomain> invoiceList = ttInvoiceService.searchByCondition(criteria);

        List<TtInvoiceDomain> domainList = new ArrayList<TtInvoiceDomain>();
        for (int i = 0; i < invoiceList.size(); i++) {
            TtInvoiceDomain cancelDomain = invoiceList.get(i);
            if (cancelDomain.getRelateInvoiceNo() != null){
                TtInvoiceCriteriaDomain reInvoiceCriteria = new TtInvoiceCriteriaDomain();
                reInvoiceCriteria.setShipperCd(cancelDomain.getRelateInvoiceShipperCd());
                reInvoiceCriteria.setInvoiceNo(cancelDomain.getRelateInvoiceNo());
                reInvoiceCriteria.setInvoiceIssueDt(cancelDomain.getRelateInvoiceIssueDt());

                TtInvoiceDomain orgReInvoiceDomain = ttInvoiceService.searchByKey(reInvoiceCriteria);

                domainList.add(cancelDomain);
                domainList.add(orgReInvoiceDomain);
            } else {
                domainList.add(cancelDomain);
            }
        }

        return domainList;
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

        criteria.setInvoiceNo(normInvNoList.get(0));
        criteria.setInvoiceIssueDt(invIssueDt);
        
        return  searchOnRegisterInitByFromMain(criteria); 
    }
    
    /**
     * Create a document PDF, can register on the File Manage.
     * <br />帳票PDFを作成し、ファイル管理に登録します。
     * 
     * @param shipperCd SHIPPER CODE<br />
     * 荷主コード
     * @param invoiceNo Invoice No<br />
     * インボイスNo
     * @param invoiceIssueDt INVOICE ISSUE DATE<br />
     * インボイス発行日
     * @param invTplNo Invoice Template No<br />
     * インボイステンプレートNo
     * @param dscId Login DSC-ID<br />
     * ログインDSC-ID
     * @param cmlTyp CML TYPE<br />
     * ケースマーク区分
     * @param invCtgry Invoice category<br />
     * インボイスカテゴリ
     * @param invClass Invoice Class
     * @param dateFormat Document for date format<br />
     * 帳票用日付フォーマット
     * @param charCd CHAR CODE<br />
     * 文字コード
     * @param reportSc Create a form Sales Contract Header when TRUE, then the Sales Contract Attached<br />
     * TRUEの時セールスコントラクトヘッダ、セールスコントラクトアタッチの帳票を作成する
     * @throws ApplicationException Creation of a form PDF, registration can not be<br />
     * 帳票PDFの作成、登録ができない場合
     */
    protected void createPdfFileOnRegister(String shipperCd, String invoiceNo, Date invoiceIssueDt, String invTplNo
        , String dscId, String cmlTyp, String invCtgry, String invClass, String dateFormat, String charCd, boolean reportSc) 
        throws ApplicationException {
        // Set initial data to PDF creation flag.
        // PDF作成有無
        boolean l600301 = false;
        boolean l600302 = false;
        boolean l600303 = false;
        boolean l600304 = false;
        boolean l600305 = false;
        boolean l600306 = false;
        boolean l600307 = false;
        boolean l600308 = false;
        boolean l600309 = false;
        boolean l600310 = false;
        boolean l600311 = false;
        boolean l600312 = false;
        boolean l600313 = false;
        boolean l600314 = false;
        boolean l600315 = false;
        boolean l600316 = false; // NL023 ADD
        
        if (CML_TYPE_CIGMA.equals(cmlTyp)) {
            // product
            // 製部品
            if (!INVOICE_CLASS_FULL_RT.equals(invClass)) {
                // except FRT
                // FRT以外
                if (INVOICE_CTGRY_C.equals(invCtgry)) {
                    // charged
                    // 有償
                    l600301 = true;
                    l600304 = true;
                    l600306 = true;
                    l600308 = true;
                    l600311 = true;
                    l600314 = true;
                    l600316 = true; // NL023 ADD
                }
            } else {
                // FRT
                l600303 = true;
                l600305 = true;
                l600307 = true;
                l600309 = true;
                l600313 = true;
                l600315 = true;
            }
            
        } else if (CML_TYPE_ERT.equals(cmlTyp)) {
            // ERT
            if (INVOICE_CTGRY_N.equals(invCtgry)) {
                // free
                // 無償
                l600302 = true;
                l600305 = true;
                l600306 = true;
                l600310 = true;
                l600312 = true;
                l600315 = true;
            }
            
        } else if (CML_TYPE_MISCELLANEOUS.equals(cmlTyp)) {
            // miscellaneous goods
            // 非製部品
            if (!INVOICE_CLASS_FULL_RT.equals(invClass)) {
                // except FRT
                // FRT以外
                if (INVOICE_CTGRY_C.equals(invCtgry) || INVOICE_CTGRY_I.equals(invCtgry)) {
                    // charged
                    // 有償, Intangible
                    l600301 = true;
                    l600304 = true;
                    l600306 = true;
                    l600308 = true;
                    l600311 = true;
                    l600314 = true;
                } else if (INVOICE_CTGRY_N.equals(invCtgry)) {
                    // free
                    // 無償
                    l600302 = true;
                    l600304 = true;
                    l600306 = true;
                    l600308 = true;
                    l600312 = true;
                    l600314 = true;
                }
            } else {
                // FRT
                l600303 = true;
                l600305 = true;
                l600307 = true;
                l600309 = true;
                l600313 = true;
                l600315 = true;
            }
        }
        if (!reportSc) {
            l600311 = false;
            l600312 = false;
            l600313 = false;
            l600314 = false;
            l600315 = false;
        }
        // Set invoice header file data.
        // インボイスヘッダファイル
        File invoiceHeadFile = null;
        if (l600301) {
            invoiceHeadFile = l6001ReportService.searchInvHdrForCmrclIntang(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600302) {
            invoiceHeadFile = l6002ReportService.searchInvHdrForNonCmrcl(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600303) {
            invoiceHeadFile = l6003ReportService.searchIvnHdrForFrt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        }
        // Set invoice attache file data.
        // インボイスアタッチ
        File invoiceAttachFile = null;
        if (l600304) {
            invoiceAttachFile = l6004ReportService.searchInvAtchedForMain(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, charCd);
        } else if (l600305) {
            invoiceAttachFile = l6005ReportService.searchInvAtchedForRt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, charCd);
        }

        // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
//        if (invoiceHeadFile != null && invoiceAttachFile != null) {
//            // InvoiceHeader + Invoice Attach
//            File file = meargeReport(invoiceHeadFile, invoiceAttachFile);
        if (invoiceHeadFile != null) {
            File file = null;
            if (invoiceAttachFile != null) {
                // InvoiceHeader + Invoice Attach
                file = meargeReport(invoiceHeadFile, invoiceAttachFile);
            } else {
                file = invoiceHeadFile;
            }
        // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
            // Register with the File Manage. 
            // ファイル管理に登録
            String fileName = makeDocumentationFileNameOnAuto(shipperCd, invoiceNo, invoiceIssueDt, "INV", "pdf"); // UT186 ZIP DOWNLOAD ADD
            String fileId = createFileUpload(file, fileName, dscId);
            // Update the FILE ID of Invoice Header. 
            // インボイスヘッダに登録
            updateTtInvoiceHeaderByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, SCREEN_ID_W6009);
        }
        
        // Set packing header file data.
        // パッキングヘッダ
        File packHeadFile = null;
        if (l600306) {
            packHeadFile = l6006ReportService.searchPackHdrForMain(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat);
        } else if (l600307) {
            packHeadFile = l6007ReportService.searchPackHdrForFrt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat);
        }
        // Set packing attach file data.
        // パッキングアタッチ
        File packAttachFile = null;
        if (l600308) {
            packAttachFile = l6008ReportAsiaService.searchPackAtchedForMain(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600309) {
            packAttachFile = l6009ReportService.searchPackAtchedForFrt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo);
        } else if (l600310) {
            packAttachFile = l6010ReportService.searchPackAtchedForErt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat);
        }
        // NL023 ADD START
        // Set packing summary file data.
        // パッキングサマリ
        File packSummaryFile = null;
        if (l600316) {
            // Add the Packing Summary Attach Flag to the Judgment on necessity./Packing Summary Attach Flagを要否判断に加える。
            // Serch TT_INVOICE to get Ship to Code.
            TtInvoiceCriteriaDomain criteriaTtInvoiceServiceSearchByKeyDomain = new TtInvoiceCriteriaDomain();
            criteriaTtInvoiceServiceSearchByKeyDomain.setShipperCd(shipperCd);
            criteriaTtInvoiceServiceSearchByKeyDomain.setInvoiceNo(invoiceNo);
            criteriaTtInvoiceServiceSearchByKeyDomain.setInvoiceIssueDt(invoiceIssueDt);
            TtInvoiceDomain resultTtInvoiceServiceSearchByKeyDomain = ttInvoiceService.searchByKey(criteriaTtInvoiceServiceSearchByKeyDomain);
            // Serch TM_EXP_SHIP_TO_SHIPPING.
            W6001DocCriteriaDomain criteriaSerchPackingSummaryAtchFlgDomain = new W6001DocCriteriaDomain();
            criteriaSerchPackingSummaryAtchFlgDomain.setShipperCd(resultTtInvoiceServiceSearchByKeyDomain.getShipperCd());
            criteriaSerchPackingSummaryAtchFlgDomain.setShipToCd(resultTtInvoiceServiceSearchByKeyDomain.getShipToCd());
            Date localDate = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd)), Calendar.DAY_OF_MONTH);
            criteriaSerchPackingSummaryAtchFlgDomain.setAplyStrtDt(localDate);
            String packingSummaryAtchFlg = w6001DocDao.serchPackingSummaryAtchFlg(criteriaSerchPackingSummaryAtchFlgDomain);
            if (packingSummaryAtchFlg == null) {
                Object[] params = {
                    "Export Ship To Shipping Master",
                    resultTtInvoiceServiceSearchByKeyDomain.getShipperCd() + "," + resultTtInvoiceServiceSearchByKeyDomain.getShipToCd()
                };
                throw new GscmApplicationException(NXS_E1_0031, params);
            }
            if (FLAG_Y.equals(packingSummaryAtchFlg)) {
                packSummaryFile = l6016ReportService.searchPackingSummary(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat);
            }
        }
        // NL023 ADD END

        if (packHeadFile != null && packAttachFile != null) {
            // NL023 MOD START
            // Packing Summary File + Packing Header File + Packing Attach file
            //File file = meargeReport(packHeadFile, packAttachFile);
            File mergedFile = commonService.mergePdf(packHeadFile.getName(), packSummaryFile, packHeadFile, packAttachFile);
            // NL023 MOD END
            // Register with the File Manage. 
            // ファイル管理に登録
            String fileName = makeDocumentationFileNameOnAuto(shipperCd, invoiceNo, invoiceIssueDt, "PL", "pdf"); // UT186 ZIP DOWNLOAD ADD
            String fileId = createFileUpload(mergedFile, fileName, dscId);
            // Update the FILE ID of Packing Header. 
            // パッキングヘッダに登録
            updateTtPackingHeadByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, SCREEN_ID_W6009);
        }
        
        // Set sales contract header file data.
        // セールスコントラクトヘッダ
        File scHeadFile = null;
        if (l600311) {
            scHeadFile = l6011ReportService.searchSalesCntrctHdrForCmrclIntang(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600312) {
            scHeadFile = l6012ReportService.searchSalesCntrctHdrForNonCmrcl(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        } else if (l600313) {
            scHeadFile = l6013ReportService.searchSalesCntrctHdrForFrt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, dateFormat, charCd);
        }
        // Set sales contract attach file data.
        // セールスコントラクトアタッチ
        File scAttachFile = null;
        if (l600314) {
            scAttachFile = l6014ReportService.searchSalesCntrctAtchedForMain(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, charCd, dateFormat);
        } else if (l600315) {
            scAttachFile = l6015ReportService.searchSalesCntrctAtchedForRt(shipperCd, invoiceNo, invoiceIssueDt, invTplNo, charCd, dateFormat);
        }

        // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
//        if (scHeadFile != null && scAttachFile != null) {
//            // SC Header File + SC Attach file
//            File file = meargeReport(scHeadFile, scAttachFile);
        if (scHeadFile != null) {
            File file = null;
            if (scAttachFile != null) {
                // SC Header File + SC Attach file
                file = meargeReport(scHeadFile, scAttachFile);
            } else {
                file = scHeadFile;
            }
        // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
            // Register with the File Manage. 
            // ファイル管理に登録
            String fileName = makeDocumentationFileNameOnAuto(shipperCd, invoiceNo, invoiceIssueDt, "SC", "pdf"); // UT186 ZIP DOWNLOAD ADD
            String fileId = createFileUpload(file, fileName, dscId);
            // Update the FILE ID of the sales contract. 
            // セールスコントラクトヘッダに登録
            updateTtScHeaderByFileId(fileId, shipperCd, invoiceNo, invoiceIssueDt, SCREEN_ID_W6009);
        }
    }

    /**
     * Registered in the table, the data were numbered Cancel Invoice No.
     * <pre>
     * - Get INVOICE ISSUE DATE.  Call CommonService.searchTimezone(String).
     *
     * - Login user name acquisition getDscName(String)
     * 
     * - Registered in the target table data to be canceled.
     *   - Invoice
     *     Call createTtInvoiceOnRegisterByCancel(List, List, Date, String, String).
     *   
     *   - Invoice Header
     *     Call createTtInvoiceHeaderOnRegisterByCancel(List, List, List, Date).
     *     
     *   - Invoice Attached
     *     Call createTtInvoiceAttachedOnRegisterByCancel(List, List, List, Date).
     *     
     *   - Packing Header
     *     Call createTtPackingHeadOnRegisterByCancel(List, List, List, Date).
     *   
     *   - (No registration FRT products) Packing Attached CML
     *     Call createTtPackingAttachedCmlOnRegisterByCancel(List, List, List, Date).
     *   
     *   - (No registration FRT product) packing attach _ Part
     *     Call createTtPackAtchItemNoOnRegisterByCancel(List, List, List, Date).
     *   
     *   - PDF file creation
     *     Call createPdfFileOnRegister(String, String, Date, String, String, String, String, String, String, String, boolean).
     *    
     *   - Invoice data update before cancellation
     *     Call updateTtInvoiceOnRegisterbyCancel(List).
     * </pre>
     * 
     * @param cancelList Be canceled Invoice No<br />
     * @param cancelInvNoList Cancel Invoice No have numbered<br />
     * @param criteria Search conditions domain of the screen<br />
     * @return Data registered in the Invoice<br />
     * @throws ApplicationException Registration processing of the data can not be<br />
     */
    protected List<? extends TtInvoiceDomain> createCancelInvoiceNoOnRegister (List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, W6001DocCriteriaDomain criteria)
        throws ApplicationException {

        String shipperCd = criteria.getShipperCd();
        String dscId = criteria.getDscId();

        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD START
        //Date invIssueDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd)), Calendar.DAY_OF_MONTH);
        Date invIssueDt = DateUtils.truncate(DateUtil.convertTime(new Date(), commonService.searchTimezone(shipperCd)), Calendar.SECOND);
        // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD END
        // Get the user name.
        String dscNm = getDscName(dscId);
        // Registered in the Invoice Cancel Invoice No.
        List<? extends TtInvoiceDomain> invoiceList = createTtInvoiceOnRegisterByCancel(cancelList, cancelInvNoList, invIssueDt, dscId, dscNm);
        // Registered in the Invoice Header Cancel Invoice No.
        createTtInvoiceHeaderOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Registered in Packing Header Cancel Invoice No.
        createTtPackingHeadOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Registered in the Invoice Attached Cancel Invoice No.
        createTtInvoiceAttachedOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Registered in the Invoice Attached Cancel Invoice No.
        createTtPackingAttachedCmlOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Registered in the packing attach Part Cancel Invoice No.
        createTtPackAtchItemNoOnRegisterByCancel(cancelList, cancelInvNoList, invoiceList, invIssueDt);
        // Create a document PDF, can register on the File Manage.
        for (int i = 0; i < invoiceList.size(); i++) {
            TtInvoiceDomain ttInvDomain = cancelList.get(i);

            if(!MANUAL_TYP_RE_INVOICE.equals(ttInvDomain.getManualTyp())){
                createPdfFileOnRegister(ttInvDomain.getShipperCd(), cancelInvNoList.get(i)
                    , invIssueDt, ttInvDomain.getInvTplNo(), dscId
                    , ttInvDomain.getCmlTyp(), ttInvDomain.getInvoiceCtgry(), ttInvDomain.getInvoiceClass()
                    , criteria.getReportDateFormat(), criteria.getCharCd(), false);
            }
        }
        // Update the Invoice data before cancellation.
        updateTtInvoiceOnRegisterbyCancel(cancelList);

        return invoiceList;
    }

    /**
     * Numbered Cancel Invoice No.
     * <pre>
     * [If the vendor Invoice No is Numbering
     *   Numbered the Cancel Invoice No from the vendor Invoice No.
     * 
     *   [For the main Invoice] 
     *     Vendor Invoice No. + "C" 
     *   [For FRT Invoice]
     *     Vendor Invoice No. + "C" + SEQUENCE NO 
     * 
     * [If the vendor Invoice No are not numbered]
     *   - Get the Cancel Invoice numbering classification
     *     Call the searchTmCancelInvSeqTyp (String) in the argument SHIPPER CODE.
     * 
     *   - Create Invoice numbering key
     *     "System ID (ECA0027)" + "_" + Number type (※) + "_" + Cancel Invoice numbering classification
     *   
     *   - Cancel Invoice No acquisition
     *     Numbering key that just created, call searchTmInvSeqOnRegister(String, String) with argument SHIPPER CODE.
     * </pre>
     * 
     * @param criteria Search conditions domain of the screen<br />
     * @param ttInvoiceList Cancel Invoice No numbering target data list<br />
     * @return List of Invoice No cancellation was numbered<br />
     * @throws ApplicationException Numbering of cancellation Invoice No can not be.<br />
     */
    protected List<String> transactSequenceCancelInvNo (W6001DocCriteriaDomain criteria, List<? extends TtInvoiceDomain> ttInvoiceList) 
        throws ApplicationException {
   
        List<String> cancelInvoiceNoList = new ArrayList<String>();
        
        int frtCnt = 0;
        for (TtInvoiceDomain ttInvoiceDomain : ttInvoiceList) {
            String cancelInvoiceNo = null;

            if (StringUtils.isNotEmpty(ttInvoiceDomain.getSupplierInvoiceNo())) {

                if (!INVOICE_CLASS_FULL_RT.equals(ttInvoiceDomain.getInvoiceClass())) {

                    cancelInvoiceNo = String.format(CANCEL_INVOICE_NO_SUPPLIER_FORMAT, ttInvoiceDomain.getSupplierInvoiceNo());
                } else {

                    cancelInvoiceNo = String.format(CANCEL_INVOICE_NO_SUPPLIER_FORMAT_FRT, ttInvoiceDomain.getSupplierInvoiceNo(), frtCnt);
                    frtCnt++;
                }

            } else if (MANUAL_TYP_RE_INVOICE.equals(ttInvoiceDomain.getManualTyp())){
                String seqKey = String.format(SEQ_KEY_RE_INVOICE_NO_CANCEL, ttInvoiceDomain.getShipperCd());
                // Numbered the Invoice No new from Invoice Sequence Master.
                cancelInvoiceNo = searchTmInvSeqOnRegister(seqKey, ttInvoiceDomain.getRelateInvoiceShipperCd());
            } else {
                // Get the Cancel Invoice numbering classification. 
                TmCancelInvSeqTypDomain tmCancelinvSeqTypDomain = searchTmCancelInvSeqTyp(ttInvoiceDomain.getShipperCd());
                if (null == tmCancelinvSeqTypDomain) {
                    throw new GscmApplicationException(NXS_E7_0120);
                }
                
                // 2015/11/17 DNJP.Kawamura START >>>>>
//                String seqKey = String.format(SEQ_KEY_CANCEL_INVOICE_NO
//                    , ttInvoiceDomain.getCmlTyp(), tmCancelinvSeqTypDomain.getCancelInvSeqTyp());
                String seqKey = null;
                if (!INVOICE_CLASS_FULL_RT.equals(ttInvoiceDomain.getInvoiceClass())) {
                    seqKey = String.format(SEQ_KEY_CANCEL_INVOICE_NO
                        , ttInvoiceDomain.getCmlTyp(), tmCancelinvSeqTypDomain.getCancelInvSeqTyp());
                } else {
                    seqKey = String.format(SEQ_KEY_CANCEL_INVOICE_NO
                        , INVOICE_CLASS_FULL_RT, tmCancelinvSeqTypDomain.getCancelInvSeqTyp());                    
                }
                // 2015/11/17 DNJP.Kawamura END <<<<<
                
                // Numbered the Invoice No new from Invoice Sequence Master. 
                // 2016/04/04 MOD START
                //cancelInvoiceNo = searchTmInvSeqOnRegister(seqKey, criteria.getShipperCd());
                cancelInvoiceNo = searchTmInvSeqOnRegister(seqKey, ttInvoiceDomain.getShipperCd());
                // 2016/04/04 MOD END
            }
            cancelInvoiceNoList.add(cancelInvoiceNo);
        }
        return cancelInvoiceNoList;
    }

    /**
     * Registered in the Invoice Cancel Invoice No.
     * <pre>
     * - Get Invoice information before cancellation
     *   Set the following items TtInvoiceCriteriaDomain,
     *   Call (TtInvoiceCriteriaDomain) TtInvoiceService.searchByKey.
     * 
     * - Register to Invoice
     *   Set the following items TtInvoiceDomain, 
     *   Call TtInvoiceService.create(List).
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * @param dscId DSC-ID of the login's<br />
     * @param dscNm Login name of person<br />
     * @return Registration data list of Invoice<br />
     * @throws ApplicationException Can not register on the Cancel Invoice Invoice No<br />
     */
    protected List<? extends TtInvoiceDomain> createTtInvoiceOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, Date invIssueDt, String dscId, String dscNm) 
        throws ApplicationException {

        List<TtInvoiceDomain> domainList = new ArrayList<TtInvoiceDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);

            if(MANUAL_TYP_RE_INVOICE.equals(cancelDomain.getManualTyp())){

                TtInvoiceDomain cancelReInvoiceDomain = new TtInvoiceDomain();
                CommonUtil.copyPropertiesDomainToDomain(cancelReInvoiceDomain, cancelDomain);

                cancelReInvoiceDomain.setInvoiceNo(cancelInvNoList.get(i));
                cancelReInvoiceDomain.setInvoiceIssueDt(invIssueDt);
                cancelReInvoiceDomain.setCancelTyp(CANCEL_TYP_CANCEL);
                cancelReInvoiceDomain.setCancelInvoiceNo(cancelDomain.getInvoiceNo());
                cancelReInvoiceDomain.setCancelInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
                cancelReInvoiceDomain.setParInvoiceIssueDt(invIssueDt);
                cancelReInvoiceDomain.setRelateInvoiceNo(cancelInvNoList.get(i - 1));
                cancelReInvoiceDomain.setRelateInvoiceIssueDt(invIssueDt);
                cancelReInvoiceDomain.setInvoiceIssuerId(dscId);
                cancelReInvoiceDomain.setInvoiceIssuerNm(dscNm);

                commonService.setCommonPropertyForRegist(cancelReInvoiceDomain, SCREEN_ID_W6009);

                domainList.add(cancelReInvoiceDomain);
            }else{

                TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
                criteria.setShipperCd(cancelDomain.getShipperCd());
                criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
                criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());

                TtInvoiceDomain orgDomain = ttInvoiceService.searchByKey(criteria);
            
                String parCancelInvNo = cancelInvNoList.get(i);
                if (INVOICE_CLASS_FULL_RT.equals(cancelDomain.getInvoiceClass())) {
                    parCancelInvNo = cancelInvNoList.get(0);
                }
            
                TtInvoiceDomain domain = new TtInvoiceDomain();
                CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);
            
                domain.setInvoiceNo(cancelInvNoList.get(i));
                domain.setInvoiceIssueDt(invIssueDt);
                domain.setManualInvoiceIssueDt(invIssueDt);
                domain.setCancelTyp(CANCEL_TYP_CANCEL);
                domain.setCancelInvoiceNo(cancelDomain.getInvoiceNo());

                if (cancelDomain.getRelateInvoiceNo() != null){
                    domain.setRelateInvoiceNo(cancelInvNoList.get(i + 1));
                    domain.setRelateInvoiceIssueDt(invIssueDt);
                }

                domain.setCancelInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
                domain.setParInvoiceNo(parCancelInvNo);
                domain.setParInvoiceIssueDt(invIssueDt);
                domain.setNetAmount(orgDomain.getNetAmount().negate());
                domain.setFreight(orgDomain.getFreight().negate());
                domain.setInsurance(orgDomain.getInsurance().negate());
                domain.setSubTotal(orgDomain.getSubTotal().negate());
                domain.setVat(orgDomain.getVat().negate());
                domain.setHandlingCharge(orgDomain.getHandlingCharge().negate());
                domain.setAdditionalCharge(orgDomain.getAdditionalCharge().negate());
                domain.setTotalInvoiceAmount(orgDomain.getTotalInvoiceAmount().negate());
                domain.setNoCharge(orgDomain.getNoCharge().negate());
                domain.setInvoiceIssuerId(dscId);
                domain.setInvoiceIssuerNm(dscNm);

                commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);

                domainList.add(domain);
            }
        }

        ttInvoiceService.create(domainList);

        return domainList;
    }

    /**
     * Registered in the Invoice Header Cancel Invoice No.
     * <pre>
     * - Get Invoice Header information before cancellation
     *   Set the following items TtInvoiceHeaderCriteriaDomain,
     *   Call (TtInvoiceHeaderCriteriaDomain) TtInvoiceHeaderService.searchByKey.
     * 
     * - Register to Invoice Header
     *   Set the following items TtInvoiceHeaderDomain,
     *   Call TtInvoiceHeaderService.create(List).
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * @param createInvoiceList Data registered in the Invoice<br />
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * @throws ApplicationException Can not register on the Invoice Header Cancel Invoice No<br />
     */
    protected void createTtInvoiceHeaderOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {

        List<TtInvoiceHeaderDomain> domainList = new ArrayList<TtInvoiceHeaderDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);

            if (MANUAL_TYP_RE_INVOICE.equals(cancelDomain.getManualTyp())){

                TtInvoiceHeaderDomain cancelReInvoiceDomain = new TtInvoiceHeaderDomain();
                CommonUtil.copyPropertiesDomainToDomain(cancelReInvoiceDomain, cancelDomain);

                cancelReInvoiceDomain.setInvoiceNo(cancelInvNoList.get(i));
                cancelReInvoiceDomain.setInvoiceIssueDt(invIssueDt);
                cancelReInvoiceDomain.setCancelTyp(CANCEL_TYP_CANCEL);
                cancelReInvoiceDomain.setCancelInvoiceNo(cancelDomain.getInvoiceNo());
                cancelReInvoiceDomain.setCancelInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());

                cancelReInvoiceDomain.setFileId(null);
                cancelReInvoiceDomain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());

                commonService.setCommonPropertyForRegist(cancelReInvoiceDomain, SCREEN_ID_W6009);

                domainList.add(cancelReInvoiceDomain);
            } else {
                TtInvoiceHeaderCriteriaDomain criteria = new TtInvoiceHeaderCriteriaDomain();
                criteria.setShipperCd(cancelDomain.getShipperCd());
                criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
                criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());

                TtInvoiceHeaderDomain orgDomain = ttInvoiceHeaderService.searchByKey(criteria);

                TtInvoiceHeaderDomain domain = new TtInvoiceHeaderDomain();
                CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);

                domain.setInvoiceNo(cancelInvNoList.get(i));
                domain.setInvoiceIssueDt(invIssueDt);
                domain.setCancelTyp(CANCEL_TYP_CANCEL);
                domain.setCancelInvoiceNo(cancelDomain.getInvoiceNo());

                domain.setCancelInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
                domain.setNetAmount(orgDomain.getNetAmount().negate());
                domain.setFreight(orgDomain.getFreight().negate());
                domain.setInsurance(orgDomain.getInsurance().negate());
                domain.setSubTotal(orgDomain.getSubTotal().negate());
                domain.setVat(orgDomain.getVat().negate());
                domain.setHandlingCharge(orgDomain.getHandlingCharge().negate());
                domain.setAdditionalCharge(orgDomain.getAdditionalCharge().negate());
                domain.setTotalInvoiceAmount(orgDomain.getTotalInvoiceAmount().negate());
                domain.setNoCharge(orgDomain.getNoCharge().negate());
                domain.setFileId(null);
                domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());

                commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);

                domainList.add(domain);
            }
        }

        ttInvoiceHeaderService.create(domainList);
    }

    /**
     * Registered in Packing Header Cancel Invoice No.
     * <pre>
     * - Get Packing Header information before cancellation
     *   Set the following items TtPackingHeadCriteriaDomain,
     *   Call TtPackingHeadService.searchByKey(TtPackingHeadCriteriaDomain).
     * 
     * - Register to Packing Header
     *   Set the following items TtPackingHeadDomain,
     *   Call TtPackingHeadService.create(List).
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * @param createInvoiceList List of data registered in the Invoice<br />
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * @throws ApplicationException Can not register on the Packing Header Cancel Invoice No<br />
     */
    protected void createTtPackingHeadOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
    
        List<TtPackingHeadDomain> domainList = new ArrayList<TtPackingHeadDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);

            if (!MANUAL_TYP_RE_INVOICE.equals(cancelDomain.getManualTyp())){
                TtPackingHeadCriteriaDomain criteria = new TtPackingHeadCriteriaDomain();
                criteria.setShipperCd(cancelDomain.getShipperCd());
                criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
                criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());

                TtPackingHeadDomain orgDomain = ttPackingHeadService.searchByKey(criteria);

                TtPackingHeadDomain domain = new TtPackingHeadDomain();
                CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);

                domain.setInvoiceNo(cancelInvNoList.get(i));
                domain.setInvoiceIssueDt(invIssueDt);
                domain.setCancelTyp(CANCEL_TYP_CANCEL);
                domain.setCancelInvoiceNo(cancelDomain.getInvoiceNo());
                domain.setCancelInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
                domain.setFileId(null);
                domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());

                commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);

                domainList.add(domain);
            }
        }

        ttPackingHeadService.create(domainList);
    }

    /**
     * Registered in the Invoice Attached Cancel Invoice No.
     * <pre>
     * - Get Invoice Attached information before cancellation
     *   Set the following items TtInvoiceAttachedCriteriaDomain,
     *   Call TtInvoiceAttachedService.searchByKey(TtInvoiceAttachedCriteriaDomain).
     * 
     * - Register to Invoice Attached
     *   Set the following items TtInvoiceAttachedDomain,
     *   Call TtInvoiceAttachedService.create(List).
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * @param createInvoiceList List of data registered in the Invoice<br />
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * @throws ApplicationException Can not register on the Invoice Attached Cancel Invoice No<br />
     */
    protected void createTtInvoiceAttachedOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
    
        List<TtInvoiceAttachedDomain> domainList = new ArrayList<TtInvoiceAttachedDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);

            if (!MANUAL_TYP_RE_INVOICE.equals(cancelDomain.getManualTyp())){
                TtInvoiceAttachedCriteriaDomain criteria = new TtInvoiceAttachedCriteriaDomain();
                criteria.setShipperCd(cancelDomain.getShipperCd());
                criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
                criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());

                List<? extends TtInvoiceAttachedDomain> orgList = ttInvoiceAttachedService.searchByCondition(criteria);

                for (TtInvoiceAttachedDomain orgDomain : orgList) {
                    TtInvoiceAttachedDomain domain = new TtInvoiceAttachedDomain();
                    CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);

                    domain.setInvoiceNo(cancelInvNoList.get(i));
                    domain.setInvoiceIssueDt(invIssueDt);
                    domain.setCancelTyp(CANCEL_TYP_CANCEL);
                    domain.setQty(orgDomain.getQty().negate());
                    domain.setAmount(orgDomain.getAmount().negate());
                    domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());
                
                    commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);

                    domainList.add(domain);
                }
            }
        }

        ttInvoiceAttachedService.create(domainList);
    }

    /**
     * Registered in the Invoice Attached Cancel Invoice No.
     * <pre>
     * Following only the main Invoice.
     * - Get packing attach CML information before cancellation
     *   Set the following items TtPackingAttachedCmlCriteriaDomain,
     *   Call TtPackingAttachedCmlService.searchByKey(TtPackingAttachedCmlCriteriaDomain).
     * 
     * - Register to attach packing CML
     *   Set the following items TtPackingAttachedCmlDomain,
     *   Call TtPackingAttachedCmlService.create(List).
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * @param createInvoiceList List of data registered in the Invoice<br />
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * @throws ApplicationException Can not register on the packing attach CML Cancel Invoice No<br />
     */
    protected void createTtPackingAttachedCmlOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
    
        List<TtPackingAttachedCmlDomain> domainList = new ArrayList<TtPackingAttachedCmlDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);

            if (!MANUAL_TYP_RE_INVOICE.equals(cancelDomain.getManualTyp())){
                // Check the invoice class as a main invoice class.
                if (!INVOICE_CLASS_FULL_RT.equals(cancelDomain.getInvoiceClass())) {
                    TtPackingAttachedCmlCriteriaDomain criteria = new TtPackingAttachedCmlCriteriaDomain();
                    criteria.setShipperCd(cancelDomain.getShipperCd());
                    criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
                    criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());

                    List<? extends TtPackingAttachedCmlDomain> orgList = ttPackingAttachedCmlService.searchByCondition(criteria);

                    for (TtPackingAttachedCmlDomain orgDomain : orgList) {
                        TtPackingAttachedCmlDomain domain = new TtPackingAttachedCmlDomain();
                        CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);

                        domain.setInvoiceNo(cancelInvNoList.get(i));
                        domain.setInvoiceIssueDt(invIssueDt);
                        domain.setCancelTyp(CANCEL_TYP_CANCEL);
                        domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());

                        commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);

                        domainList.add(domain);
                    }
                }
            }
        }

        ttPackingAttachedCmlService.create(domainList);
    }

    /**
     * Registered in the packing attach Part Cancel Invoice No.
     * <pre>
     * Following only the main Invoice.
     * - Get packing attach part number information before cancellation
     *   Set the following items TtPackAtchItemNoCriteriaDomain,
     *   Call TtPackAtchItemNoService.searchByKey(TtPackAtchItemNoCriteriaDomain).
     * 
     * - Register to attach packing Part
     *   Set the following items TtPackAtchItemNoDomain,
     *   Call TtPackAtchItemNoService.create (List).
     * </pre>
     * 
     * @param cancelList List of data be canceled<br />
     * @param cancelInvNoList List of Invoice No cancellation was numbered<br />
     * @param createInvoiceList List of data registered in the Invoice<br />
     * @param invIssueDt INVOICE ISSUE DATE<br />
     * @throws ApplicationException Can not register on the packing attach Part Cancel Invoice No<br />
     */
    protected void createTtPackAtchItemNoOnRegisterByCancel(List<? extends TtInvoiceDomain> cancelList, List<String> cancelInvNoList, List<? extends TtInvoiceDomain> createInvoiceList, Date invIssueDt) 
        throws ApplicationException {
    
        List<TtPackAtchItemNoDomain> domainList = new ArrayList<TtPackAtchItemNoDomain>();
        for (int i = 0; i < cancelList.size(); i++) {
            TtInvoiceDomain cancelDomain = cancelList.get(i);

            if (!MANUAL_TYP_RE_INVOICE.equals(cancelDomain.getManualTyp())){
                // Check the invoice class as a main invoice class.
                if (!INVOICE_CLASS_FULL_RT.equals(cancelDomain.getInvoiceClass())) {

                    TtPackAtchItemNoCriteriaDomain criteria = new TtPackAtchItemNoCriteriaDomain();
                    criteria.setShipperCd(cancelDomain.getShipperCd());
                    criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
                    criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());

                    List<? extends TtPackAtchItemNoDomain> orgList = ttPackAtchItemNoService.searchByCondition(criteria);

                    for (TtPackAtchItemNoDomain orgDomain : orgList) {

                        TtPackAtchItemNoDomain domain = new TtPackAtchItemNoDomain();
                        CommonUtil.copyPropertiesDomainToDomain(domain, orgDomain);

                        domain.setInvoiceNo(cancelInvNoList.get(i));
                        domain.setInvoiceIssueDt(invIssueDt);
                        domain.setCancelTyp(CANCEL_TYP_CANCEL);
                        domain.setQty(orgDomain.getQty().negate());
                        domain.setDeleteFlg(createInvoiceList.get(i).getDeleteFlg());

                        commonService.setCommonPropertyForRegist(domain, SCREEN_ID_W6009);

                        domainList.add(domain);
                    }
                }
            }
        }

        ttPackAtchItemNoService.create(domainList);
    }

    /**
     * Update the Invoice data before cancellation.
     * <pre>
     * Make a CANCEL FLAG of Invoice table
     * - Invoice update
     *   Set the narrowing-down condition updates to TtInvoiceDomain, to TtInvoiceCriteriaDomain
     *   Call TtInvoiceService.updateByCondition(List, List).
     *     Updated content
     *       - CANCEL FLAG: 'Y'
     *     Narrowing conditions
     *       - SHIPPER CODE
     *       - Invoice No
     *       - INVOICE ISSUE DATE
     * </pre>
     * 
     * @param cancelList List of target cancellation Invoice data<br />
     * @return Update Counts<br />
     * @throws ApplicationException Can not update the Invoice data.<br />
     */
    protected int updateTtInvoiceOnRegisterbyCancel (List<? extends TtInvoiceDomain> cancelList) 
        throws ApplicationException {
        
        List<TtInvoiceDomain> domainList = new ArrayList<TtInvoiceDomain>();
        List<TtInvoiceCriteriaDomain> criteriaList = new ArrayList<TtInvoiceCriteriaDomain>();
        
        for (TtInvoiceDomain cancelDomain : cancelList) {
            TtInvoiceDomain domain = new TtInvoiceDomain();
            domain.setCancelFlg(FLAG_Y);

            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
            
            TtInvoiceCriteriaDomain criteria = new TtInvoiceCriteriaDomain();
            criteria.setShipperCd(cancelDomain.getShipperCd());
            criteria.setInvoiceNo(cancelDomain.getInvoiceNo());
            criteria.setInvoiceIssueDt(cancelDomain.getInvoiceIssueDt());
            
            commonService.setCommonPropertyForUpdate(domain, SCREEN_ID_W6009);
            
            domainList.add(domain);
            criteriaList.add(criteria);
        }
        
        return ttInvoiceService.updateByCondition(domainList, criteriaList);
    }

    //**************** Web Service ****************//

    /**
     * For CIGMA, perform the sales and orders and stock cancellation.
     * <pre>
     * -Web to get the data to pass to the service, create a delivery parameters.
     *  Argument in the following items that have been registered to Invoice
     *  Call searchTtInvoiceOnRegisterByCancelForWs(String, String, Date).
     *    - SHIPPER CODE
     *    - Invoice No
     *    - INVOICE ISSUE DATE
     * 
     * - Web service call
     *   Argument in the following items:
     *   Call Ws6002AsiaRestService.cancelSalesOdrInvntry(String, String, String, String, String).
     *     - COMPANY CODE
     *     - Created Delivery parameters
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * @param ttInvoiceList Invoice registration data list<br />
     * @throws ApplicationException For CIGMA, Not possible to sales, orders and stock registration<br />
     */
    protected void callWebService6002(String compCd, List<? extends TtInvoiceDomain> ttInvoiceList)
        throws ApplicationException {

        String reInvoiceFlg = FLAG_N;
        String cancelReInvoiceNo = null;
        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if(MANUAL_TYP_RE_INVOICE.equals(ttInvDomain.getManualTyp())){
                reInvoiceFlg = FLAG_Y;
                cancelReInvoiceNo = ttInvDomain.getInvoiceNo();
            }
        }

        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if (!(CML_TYPE_CIGMA.equals(ttInvDomain.getCmlTyp()) && INVOICE_CLASS_MAIN.equals(ttInvDomain.getInvoiceClass())
                && !MANUAL_TYP_RE_INVOICE.equals(ttInvDomain.getManualTyp()))) {
                continue;
            }
            // Get the information to be passed to the Web service. 
            W6001DocInvoiceDomain docInvDomain = searchTtInvoiceOnRegisterByCancelForWs(ttInvDomain.getShipperCd()
                , ttInvDomain.getInvoiceNo(), ttInvDomain.getInvoiceIssueDt());
            ResultDomain resultDomain = new ResultDomain();
            if (FLAG_Y.equals(reInvoiceFlg)){
                // Get the information of shipping documents MA by using the (WS6002) Web Services. 
                resultDomain = ws6002AsiaRestService.cancelSalesOdrInvntry(compCd
                    , StringUtil.getEmptyToBlank(docInvDomain.getCancelInvoiceNo())
                    , StringUtil.getEmptyToBlank(docInvDomain.getInvoiceNo())
                    , docInvDomain.getInvoiceIssueDt()
                    , StringUtil.getEmptyToBlank(docInvDomain.getLibPgm())
                    , StringUtil.getEmptyToBlank(docInvDomain.getJobHost())
                    , StringUtil.getEmptyToBlank(docInvDomain.getJobUser())
                    , StringUtil.getEmptyToBlank(docInvDomain.getJobPassword())
                    , StringUtil.getEmptyToBlank(docInvDomain.getJobDescription())
                    , StringUtil.getEmptyToBlank(cancelReInvoiceNo));
            } else {
                resultDomain = ws6002RestService.cancelSalesOdrInvntry(compCd
                    , StringUtil.getEmptyToBlank(docInvDomain.getCancelInvoiceNo())
                    , StringUtil.getEmptyToBlank(docInvDomain.getInvoiceNo())
                    // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
                    , docInvDomain.getInvoiceIssueDt()
                    // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
                    , StringUtil.getEmptyToBlank(docInvDomain.getLibPgm())
                    , StringUtil.getEmptyToBlank(docInvDomain.getJobHost())
                    , StringUtil.getEmptyToBlank(docInvDomain.getJobUser())
                    , StringUtil.getEmptyToBlank(docInvDomain.getJobPassword())
                    , StringUtil.getEmptyToBlank(docInvDomain.getJobDescription()));
            }
            if (WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                // 処理なし
            } else if(WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                throw new GscmApplicationException(NXS_E1_0058);
            } else {
                ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                
                if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                    List<Object> params = new ArrayList<Object>();
                    for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                        params.add(param.getParam());
                    }
                    throw new GscmApplicationException(errorListItem.getErrorCode(), params.toArray());
                } else {
                    throw new GscmApplicationException(errorListItem.getErrorCode());
                }
            }
        }
    }

    /**
     * For CIGMA, perform the InvoiceDB cancellation.
     * <pre>
     * -Web to get the data to pass to the service, create a delivery parameters.
     *  Argument in the following items that have been registered to Invoice
     *  Call searchTtInvoiceOnRegisterByCancelForWs(String, String, Date).
     *    - SHIPPER CODE
     *    - Invoice No
     *    - INVOICE ISSUE DATE
     * 
     * - Web service call
     *   Argument in the following items:
     *   Call ws6006RestService.cancelInvDb(String, String, String, String, String).
     *     - SHIPPER CODE
     *     - Invoice No
     *     - INVOICE ISSUE DATE
     *     - LIB(INVOICE_DB)
     *     - NEW LINC SUBSIDIARY CODE
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />
     * @param ttInvoiceList Invoice registration data list<br />
     * @param tmCigmaEnvDomain cigma
     * @param tmNxsCompDomain nexus
     * @throws ApplicationException For CIGMA, Not possible to InvoiceDB registration<br />
     */
    protected void callWebService6006(String compCd
        , List<? extends TtInvoiceDomain> ttInvoiceList
        , TmCigmaEnvDomain tmCigmaEnvDomain
        , TmNxsCompDomain tmNxsCompDomain)
        throws ApplicationException {
        
        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if (!(CML_TYPE_CIGMA.equals(ttInvDomain.getCmlTyp()) && INVOICE_CLASS_MAIN.equals(ttInvDomain.getInvoiceClass())
                && !MANUAL_TYP_RE_INVOICE.equals(ttInvDomain.getManualTyp()))) {
                continue;
            }
            // Get the information to be passed to the Web service. 
            W6001DocInvoiceDomain docInvDomain = searchTtInvoiceOnRegisterByCancelForWs(ttInvDomain.getShipperCd()
                , ttInvDomain.getInvoiceNo(), ttInvDomain.getInvoiceIssueDt());
            // Get the information of shipping documents MA by using the (WS6002) Web Services. 
            ResultDomain resultDomain = ws6006RestService.cancelInvDb(
                compCd
                , StringUtil.getEmptyToBlank(docInvDomain.getCancelInvoiceNo())
                , StringUtil.getEmptyToBlank(docInvDomain.getInvoiceNo())
                , docInvDomain.getInvoiceIssueDt()
                , StringUtil.getEmptyToBlank(tmCigmaEnvDomain.getLibInvDb())
                , StringUtil.getEmptyToBlank(tmNxsCompDomain.getNewLincSubsidiaryCd()));
            if (WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                // 処理なし
            } else if(WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                throw new GscmApplicationException(NXS_E1_0058);
            } else {
                ErrorListItemDomain errorListItem = resultDomain.getErrorList().get(0);
                
                if (!CollectionUtils.isEmpty(errorListItem.getErrorParamList())) {
                    List<Object> params = new ArrayList<Object>();
                    for (ErrorParamListItemDomain param : errorListItem.getErrorParamList()) {
                        params.add(param.getParam());
                    }
                    throw new GscmApplicationException(errorListItem.getErrorCode(), params.toArray());
                } else {
                    throw new GscmApplicationException(errorListItem.getErrorCode());
                }
            }
        }
    }

    // 2014/11/17 A.Chonthicha Re-invoice
       /**
        * For CIGMA perform Re-invoice job submission.
        * <pre>
        * -Web page get the data and pass to web service, create a delivery parameters.
        *    - Shipper Code
        *    - Invoice No
        * 
        * - Web service call
        *   Argument in the following items:
        *   Call ws6007AsiaRestService.submitReInvoiceJob(String, String).
        *     - Shipper Code
        *     - Invoice No
        * </pre>
        * 
        * @param compCd Company code
        * @param ttInvoiceList Invoice registration/cancelation data list
        * @throws ApplicationException For CIGMA, Not possible to InvoiceDB registration
        */
    protected void callWebService6007(String compCd, List<? extends TtInvoiceDomain> ttInvoiceList)
        throws ApplicationException {

        for (TtInvoiceDomain ttInvDomain : ttInvoiceList) {
            if (!(CML_TYPE_CIGMA.equals(ttInvDomain.getCmlTyp()) && INVOICE_CLASS_MAIN.equals(ttInvDomain.getInvoiceClass())
                && !MANUAL_TYP_RE_INVOICE.equals(ttInvDomain.getManualTyp()))) {
                continue;
            }
            // Call web service Ws6007
            ResultDomain resultDomain = ws6007AsiaRestService.submitReInvoiceJob(
                compCd, ttInvDomain.getInvoiceNo());
            if (!WS_RESULT_SUCCESS.equals(resultDomain.getResultCode())) {
                throw new GscmApplicationException(NXS_E1_0058);
            }
        }
    }
}
