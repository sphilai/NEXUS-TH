/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.ws;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_SUCCESS;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WS_RESULT_ERROR;
import static junit.framework.Assert.assertEquals;

// 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
import java.text.SimpleDateFormat;
import java.util.Date;
// 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<

import org.junit.Before;
import org.junit.Test;

import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.ResultDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10171 $
 */
public class Ws6002RestServiceTest extends AbstractEca0027Test {
    
    /**
     * Serviceクラス
     */
    protected Ws6002RestService ws6002RestService;

    /**
     * デフォルトコンストラクタです。
     */
    public Ws6002RestServiceTest() {
        super();
    }
    
    /**
     * Setter method for ws6002RestService.
     *
     * @param ws6002RestService Set for ws6002RestService
     */
    public void setWs6002RestService(Ws6002RestService ws6002RestService) {
        this.ws6002RestService = ws6002RestService;
    }

    /**
     * Serviceクラスインスタンス生成
     */
    @Before
    public void setUp(){
        ws6002RestService = (Ws6002RestService) getContext().getBean("ws6002RestService");
    }
    
    /**
     * <br />正常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testCancelSalesOdrInvntry() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        String normalInvoiceNo = "300111";
        String cancelInvoiceNo = "300112";
        // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date invoiceIssueDt = dateFormat.parse("20141218");
        // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
        String libPgm = "CQDTALIB5-PGM";
        String jobDescription = "CQDTALIB5-DESC";
        String jobHost = "172.17.0.53";
        String jobUser = "JOB_USER";
        String jobPassword = "JOB_PASSWORD";
        
        // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
//        ResultDomain resultDomain = ws6002RestService.cancelSalesOdrInvntry(compCd, normalInvoiceNo, cancelInvoiceNo, libPgm, jobHost, jobUser, jobPassword, jobDescription);
        ResultDomain resultDomain = ws6002RestService.cancelSalesOdrInvntry(compCd, normalInvoiceNo, cancelInvoiceNo, invoiceIssueDt, libPgm, jobHost, jobUser, jobPassword, jobDescription);
        // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
        assertEquals(resultDomain.getResultCode(), WS_RESULT_SUCCESS);
    }
    
    /**
     * <br />異常系テスト
     *
     * @throws Exception エラーが発生した場合
     */
//    @Test
    public void testNoCancelSalesOdrInvntry() throws Exception {
        
        // 入力パラメータの設定
        String compCd = "MYF";
        String normalInvoiceNo = "98";
        String cancelInvoiceNo = "99";
        // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date invoiceIssueDt = dateFormat.parse("20141218");
        // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<
        String libPgm = "CQDTALIB5-PGM";
        String jobDescription = "CQDTALIB5-DESC";
        String jobHost = "172.17.0.53";
        String jobUser = "JOB_USER";
        String jobPassword = "JOB_PASSWORD";
        
        // 2014/12/18 DNJP.Kawamura UT027対応 START >>>>>
//        ResultDomain resultDomain = ws6002RestService.cancelSalesOdrInvntry(compCd, normalInvoiceNo, cancelInvoiceNo, libPgm, jobHost, jobUser, jobPassword, jobDescription);
        ResultDomain resultDomain = ws6002RestService.cancelSalesOdrInvntry(compCd, normalInvoiceNo, cancelInvoiceNo, invoiceIssueDt, libPgm, jobHost, jobUser, jobPassword, jobDescription);
        // 2014/12/18 DNJP.Kawamura UT027対応 END <<<<<        
        assertEquals(resultDomain.getResultCode(), WS_RESULT_ERROR);
    }
}
