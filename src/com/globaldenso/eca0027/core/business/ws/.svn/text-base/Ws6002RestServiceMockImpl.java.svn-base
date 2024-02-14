/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.Date;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;

/**
 * The mock class for the Web Call Service (WS6002)
 * <br />Webサービス(WS6002)呼出しサービスのMockクラスです。
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10171 $
 */
public class Ws6002RestServiceMockImpl implements Ws6002RestService {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws6002RestServiceMockImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.ws.Ws6002RestService#cancelSalesOdrInvntry(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
//    public ResultDomain cancelSalesOdrInvntry(String compCd, String normalInvoiceNo, String cancelInvoiceNo, 
//        String libPgm, String jobHost, String jobUser, String jobPassword,  String jobDescription) throws ApplicationException {
    public ResultDomain cancelSalesOdrInvntry(String compCd
        , String normalInvoiceNo
        , String cancelInvoiceNo
        , Date invoiceIssueDt
        , String libPgm
        , String jobHost
        , String jobUser
        , String jobPassword
        , String jobDescription) throws ApplicationException {
    // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
        return new ResultDomain(WS_RESULT_SUCCESS);
    }

}
