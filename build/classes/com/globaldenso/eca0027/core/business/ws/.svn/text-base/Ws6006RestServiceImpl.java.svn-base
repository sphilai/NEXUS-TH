/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0058;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_E1_0060;
//2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_CIGMA_DATE_FORMAT;
//2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR_SYSTEM;
//2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.ai.library.webservicecallrest.exception.WebServiceCallerRestException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.sun.jersey.api.client.GenericType;

/**
 * The implementation class for the Web Call Service (WS6006)
 * <br />Webサービス(WS6006)呼出しサービスの実装クラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7289 $
 */
public class Ws6006RestServiceImpl implements Ws6006RestService {

    /**
     * common service
     * <br />共通サービス
     */
    private CommonService commonService;

    /**
     * constructor. 
     * <br />デフォルトコンストラクタです。
     */
    public Ws6006RestServiceImpl() {
    }

    /**
     * Setter method for commonService.
     *
     * @param commonService Set for commonService
     */
    public void setCommonService(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws6006RestService#cancelSalesOdrInvntry(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
//    public ResultDomain cancelInvDb(String compCd
//        , String normalInvoiceNo
//        , String cancelInvoiceNo
//        , String libInvDb
//        , String newLincSubsidiaryCd) throws ApplicationException {
    public ResultDomain cancelInvDb(String compCd
        , String normalInvoiceNo
        , String cancelInvoiceNo
        , Date invoiceIssueDt
        , String libInvDb
        , String newLincSubsidiaryCd) throws ApplicationException {
    // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
        
        // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
        DateFormat df = new SimpleDateFormat(WS_CIGMA_DATE_FORMAT);
        // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<

        String webServicePath = "ws6006";
        WebServiceCallerRestDomain wsCallerRestDomain
            = commonService.searchCigmaWebServiceCallerRestDomain(compCd, webServicePath);

        wsCallerRestDomain.setParamMap("normalInvoiceNo", normalInvoiceNo);
        wsCallerRestDomain.setParamMap("cancelInvoiceNo", cancelInvoiceNo);
        // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
        if (invoiceIssueDt != null) {
            wsCallerRestDomain.setParamMap("invoiceIssueDt", df.format(invoiceIssueDt));
        }
        // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
        wsCallerRestDomain.setParamMap("libInvDb", libInvDb);
        wsCallerRestDomain.setParamMap("ogccd", newLincSubsidiaryCd);

        try {
            // Webサービスを呼び出す
            ResultDomain resultDomain
                = WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<ResultDomain>(){});
            
            if (WS_RESULT_ERROR.equals(resultDomain.getResultCode())) {
                if (NXS_E1_0060.equals(resultDomain.getErrorList().get(0).getErrorCode())) {
                    throw new GscmApplicationException(NXS_E1_0060);
                }
            }
            
            if (WS_RESULT_ERROR_SYSTEM.equals(resultDomain.getResultCode())) {
                throw new SystemException(NXS_E1_0058);
            }

            return resultDomain;

        } catch (WebServiceCallerRestException e) {
            throw new SystemException(e);
        }
    }

}

