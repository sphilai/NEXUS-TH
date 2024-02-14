/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;
// 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
import java.util.Date;
// 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * Interface for the Web Call Service (WS6002)
 * <br />Webサービス(WS6002)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10171 $
 */
public interface Ws6002RestService {

    /**
     * Get the information of shipping documents MA by using the (WS6002) Web Services
     * <br />Webサービス(WS6002)を使用して、出荷書類MAの情報を取得します。
     *
     * @param compCd - COMPANY CODE
     * @param normalInvoiceNo - Normal Invoice No. object of cancellation
     * @param cancelInvoiceNo - Cancel Invoice No.
     * @param invoiceIssueDt - Cancel Invoice Issue Date
     * @param libPgm - Library - Parameters of the Stock Update Job
     * @param jobHost - Job Host - Parameters of the Stock Update Job
     * @param jobUser - Job User - Parameters of the Stock Update Job
     * @param jobPassword - Job Password - Parameters of the Stock Update Job
     * @param jobDescription - Job Name - Parameters of the Stock Update Job
     * @return result domain of WS6002
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
//    public ResultDomain cancelSalesOdrInvntry(String compCd, String normalInvoiceNo, String cancelInvoiceNo, 
//        String libPgm, String jobHost, String jobUser, String jobPassword, String jobDescription) throws ApplicationException;
    public ResultDomain cancelSalesOdrInvntry(String compCd
        , String normalInvoiceNo
        , String cancelInvoiceNo
        , Date invoiceIssueDt
        , String libPgm
        , String jobHost
        , String jobUser
        , String jobPassword
        , String jobDescription) throws ApplicationException;
    // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<

}
