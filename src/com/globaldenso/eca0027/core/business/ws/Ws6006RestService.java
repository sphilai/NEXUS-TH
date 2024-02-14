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
 * Interface for the Web Call Service (WS6006)
 * <br />Webサービス(WS6006)呼出しサービスのインタフェースです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7289 $
 */
public interface Ws6006RestService {

    /**
     * Update(Cancel) the invoiceDB interface table of CIGMA by using the (WS6006) Web Services
     * <br />Webサービス(WS6006)を使用して、CIGMAのInvoiceDB用のテーブルの更新（キャンセル）を行います。
     *
     * @param compCd - COMPANY CODE
     * @param normalInvoiceNo - Normal Invoice No. object of cancellation
     * @param cancelInvoiceNo - Cancel Invoice No.
     * @param invoiceIssueDt - Cancel Invoice Issue Date
     * @param libInvDb - LIB(INVOICE_DB)
     * @param newLincSubsidiaryCd - CIGMA's OGC code
     * @return result domain of WS6006
     * @throws ApplicationException - If an error occurs in the Web services provider
     */
    // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
//    public ResultDomain cancelInvDb(String compCd
//        , String normalInvoiceNo
//        , String cancelInvoiceNo
//        , Date invoiceIssueDt
//        , String libInvDb
//        , String newLincSubsidiaryCd) throws ApplicationException;
    public ResultDomain cancelInvDb(String compCd
        , String normalInvoiceNo
        , String cancelInvoiceNo
        , Date invoiceIssueDt
        , String libInvDb
        , String newLincSubsidiaryCd) throws ApplicationException;
    // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<

}

