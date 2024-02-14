/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.sql.Timestamp;

import jp.co.dgic.testing.common.virtualmock.MockObjectManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.globaldenso.ai.library.filemanagerstream.business.domain.FileManagementDomain;
import com.globaldenso.ai.library.filemanagerstream.business.service.FileManagementServiceImpl;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.service.TmAgentService;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthServiceImpl;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13885 $
 */
public class W7001ShippingActServiceTest extends AbstractEca0027Test {

    /**
     * Type in the role of the field.
     */
    private W7001ShippingActService w7001ShippingActService;

    /**
     * Type in the role of the field.
     */
    private TmAgentService tmAgentService;

    /**
     * Type in the role of the field.
     */
    private CommonService commonService;
    
    /**
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActServiceTest() {
        super();
    }
    
    /**
     * 
     * 前処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @Transactional
    @Before
    public void setUp() throws Exception {
        w7001ShippingActService = (W7001ShippingActService) getContext().getBean("w7001ShippingActService");
        tmAgentService = (TmAgentService) getContext().getBean("tmAgentService");
        commonService = (CommonService) getContext().getBean("commonService");
        MockObjectManager.initialize();
        if (tmAgentService == null) {;};
        if (commonService == null) {;};
    }
    
    /**
     * 
     * 後処理
     *
     * @throws Exception エラーが発生した場合が発生した場合
     */
    @After
    public void endUp() throws Exception {
        w7001ShippingActService = (W7001ShippingActService) getContext().getBean("w7001ShippingActService");
        tmAgentService = (TmAgentService) getContext().getBean("tmAgentService");
        commonService = (CommonService) getContext().getBean("commonService");
    }


    /* ========== テストケース ================================================================== */
    // --- validateConsistencyAtdEta ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateConsistencyAtdEta001() throws Exception {
        
        String dateFormat = "dd/MM/yy";
        
        // 結果取得用ドメイン
        boolean result;
        
        // 開始日 == null、終了日 == null
        result = w7001ShippingActService.validateConsistencyAtdEta(null, null, dateFormat);
        assertThat(result, is(true));
        
        // 開始日 == null、終了日 != null
        result = w7001ShippingActService.validateConsistencyAtdEta(null, "06/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 開始日 != null、終了日 == null
        result = w7001ShippingActService.validateConsistencyAtdEta("06/03/14", null, dateFormat);
        assertThat(result, is(true));
        
        // 開始日 < 終了日
        result = w7001ShippingActService.validateConsistencyAtdEta("06/03/14", "13/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 開始日 = 終了日
        result = w7001ShippingActService.validateConsistencyAtdEta("06/03/14", "06/03/14", dateFormat);
        assertThat(result, is(true));
        
        // 終了日 < 開始日
        result = w7001ShippingActService.validateConsistencyAtdEta("13/03/14", "06/03/14", dateFormat);
        
    }
    
//    /* ========== テストケース ================================================================== */
//    // --- validateConsistencyFileExistence ----------------------------------------------------------
//    /**
//     * 正常ケース
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testValidateConsistencyFileExistence001() throws Exception {
//        
//        //入力パラメータ
//        FormFile filedata = (FormFile)new File("C:/junitTest/file.txt");
//        
//        // 結果取得用ドメイン
//        boolean result;
//        
//        // 開始日 == null、終了日 == null
//        result = w7001ShippingActService.validateConsistencyFileExistence(filedata);
//        assertThat(result, is(true));
//    }
//    
//    /* ========== テストケース ================================================================== */
//    // --- validateConsistencyFileExistence ----------------------------------------------------------
//    /**
//     * 正常ケース
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testValidateConsistencyFilePathInput001() throws Exception {
//        
//        //入力パラメータ
//        FormFile filedata = (FormFile)new File("C:/junitTest/file.txt");
//        
//        // 結果取得用ドメイン
//        boolean result;
//        
//        // 開始日 == null、終了日 == null
//        result = w7001ShippingActService.validateConsistencyFileExistence(filedata);
//        assertThat(result, is(true));
//    }
//    
//    /* ========== テストケース ================================================================== */
//    // --- validateConsistencyFileSize ----------------------------------------------------------
//    /**
//     * 正常ケース
//     *  
//     *  @throws Exception 例外発生した場合
//     */
//    @Test
//    public void testValidateConsistencyFileSize001() throws Exception {
//        
//        //入力パラメータ
//        FormFile filedata = (FormFile)objFrm.get(PICT);  
//        
//        // 結果取得用ドメイン
//        boolean result;
//        
//        // 開始日 == null、終了日 == null
//        result = w7001ShippingActService.validateConsistencyFileSize(filedata);
//        assertThat(result, is(true));
//    }
//    
    /* ========== テストケース ================================================================== */
    // --- validateConsistencyShipperAuth ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateConsistencyShipperAuth001() throws Exception {
        boolean result = false;
        // 権限あり
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", true);
        result = w7001ShippingActService.validateConsistencyShipperAuth("W7001R");
        assertThat(result, is(true));
        
        // 権限なし
        MockObjectManager.setReturnValueAtAllTimes(UserAuthServiceImpl.class, "hasUserAuthForComp", false);
        result = w7001ShippingActService.validateConsistencyShipperAuth("W7001R");
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseCarrier ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseCarrier001() throws Exception {
        
        // 入力ドメインの設定
        String shipperCd = "MAE";
        
        // 結果取得用ドメイン
        boolean result;
        
        result = w7001ShippingActService.validateDatabaseCarrier(shipperCd);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseCarrier ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseCarrier002() throws Exception {
        
        // 入力ドメインの設定
        String shipperCd = "THE";
        
        // 結果取得用ドメイン
        boolean result;
        
        result = w7001ShippingActService.validateDatabaseCarrier(shipperCd);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseCigmaAvailable ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseCigmaAvailable001() throws Exception {
        
        // 入力ドメインの設定
        boolean isShipping24hFunc = true;
        String shipperCd = "THE";
        String invoiceNo = "1";
        //String invoiceIssueDt = "2014/04/14";
        Date invoiceIssueDt = null;
        String dateFormat = "yyyy/mm/dd";
        
        // 結果取得用ドメイン
        String result;
        
        result = w7001ShippingActService.validateDatabaseCigmaAvailable(isShipping24hFunc, shipperCd, invoiceNo, invoiceIssueDt, dateFormat);
        if (null == result) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseCigmaAvailable ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseCigmaAvailable002() throws Exception {
        
        // 入力ドメインの設定
        boolean isShipping24hFunc = true;
        String shipperCd = "THE";
        String invoiceNo = "1";
        //String invoiceIssueDt = "1";
        Date invoiceIssueDt = null;
        String dateFormat = "dd/MM/yy";
        
        // 結果取得用ドメイン
        String result;
        
        result = w7001ShippingActService.validateDatabaseCigmaAvailable(isShipping24hFunc, shipperCd, invoiceNo, invoiceIssueDt, dateFormat);
        if (null == result) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseShipper ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseShipper001() throws Exception {
        
        boolean result = false;
        
        // 正常系 存在する
        result = w7001ShippingActService.validateDatabaseShipper("MY3");
        assertThat(result, is(true));

        // 異常系 存在しない
        result = w7001ShippingActService.validateDatabaseShipper("ZZ1");
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseCompCd ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseShipper002() throws Exception {
        // 組み合わせ (正)
        boolean result = false;
        result = w7001ShippingActService.validateDatabaseShipper("TG0");
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseConsignee ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseConsignee001() throws Exception {
        // 組み合わせ (正)
        boolean result = false;
        FileManagementDomain fileDomain = null;
        result = w7001ShippingActService.validateDatabaseFileManager("TG0", null);
        assertThat(result, is(false));
        
        MockObjectManager.setReturnValueAtAllTimes(FileManagementServiceImpl.class, "searchFileDownload", new IOException());
        result = w7001ShippingActService.validateDatabaseFileManager("TG0", fileDomain);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseFileManager ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseFileManager001() throws Exception {
        boolean result = false;
        String fileId = "test.txt";
//        FileManagementDomain fileDomain = null;
        // 権限あり
        result = w7001ShippingActService.validateDatabaseFileManager(fileId, null);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseLbFileManagerByShippingActDoc ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseLbFileManagerByShippingActDoc001() throws Exception {
        //パラメータ
        W7001ShippingActDocDomain shippingActDocDomain = new W7001ShippingActDocDomain();
        shippingActDocDomain.setFileId("00000000000000000265");
        // 組み合わせ (正)
        boolean result = false;
        result = w7001ShippingActService.validateDatabaseLbFileManagerByShippingActDoc(shippingActDocDomain);
        assertThat(result, is(true));

        shippingActDocDomain.setFileId("00000000000000000264");
        // 組み合わせ (正)
        result = w7001ShippingActService.validateDatabaseLbFileManagerByShippingActDoc(shippingActDocDomain);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseLbFileManagerByShippingActDoc ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseLbFileManagerByShippingActDoc002() throws Exception {
        //パラメータ
        W7001ShippingActDocDomain shippingActDocDomain = new W7001ShippingActDocDomain();
        // 組み合わせ (異)
        boolean result = false;
        result = w7001ShippingActService.validateDatabaseLbFileManagerByShippingActDoc(shippingActDocDomain);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseOfRegisterPringClp ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseOfRegisterPringClp001() throws Exception {
        //パラメータ
        String shippingActNo = "1";
        OutputStream fileData = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (異)
        boolean result = false;
        result = w7001ShippingActService.validateDatabaseOfRegisterPringClp(shippingActNo, fileData);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseOfRegisterPringClp ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseShippingActStatus001() throws Exception {
        //パラメータ
        boolean isShipping24hFunc = true;
        String compCd = "1";
        String trnsCd = "1";
        String dscId = "2";
        String procMode = "1";
        // 組み合わせ (正)
        String result;
        result = w7001ShippingActService.validateDatabaseShippingActStatus(isShipping24hFunc, compCd, trnsCd, dscId, procMode, null);
        assertNull(result);
        
        //パラメータ
        isShipping24hFunc = true;
        compCd = "1";
        trnsCd = "1";
        dscId = "2";
        procMode = "2";
        // 組み合わせ (正)
        result = w7001ShippingActService.validateDatabaseShippingActStatus(isShipping24hFunc, compCd, trnsCd, dscId, procMode, null);
        assertNull(result);
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseOfRegisterPringClp ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseShippingActStatus002() throws Exception {
        //パラメータ
        boolean isShipping24hFunc = true;
        String compCd = "1";
        String trnsCd = "1";
        String dscId = "1";
        String procMode = "1";
        // 組み合わせ (異)
        String result;
        result = w7001ShippingActService.validateDatabaseShippingActStatus(isShipping24hFunc, compCd, trnsCd, dscId, procMode, null);
        assertNull(result);
        
        isShipping24hFunc = false;
        compCd = "1";
        trnsCd = "1";
        dscId = "1";
        procMode = "1";
        // 組み合わせ (異)
        result = w7001ShippingActService.validateDatabaseShippingActStatus(isShipping24hFunc, compCd, trnsCd, dscId, procMode, null);
        assertNull(result);
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoice ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtInvoice001() throws Exception {
        
        //パラメータ
        String shipperCd = "MYF";
        String invoiceNo = "W7003A006abcdefghij";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtInvoice(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoice ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtInvoice002() throws Exception {
        //パラメータ
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/04/21");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtInvoice(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoiceOnRegister ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtInvoiceOnRegister001() throws Exception {
        //パラメータ
        String shipperCd = "MYF";
        String invoiceNo = "W7001001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        String[] cmlTyp = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtInvoiceOnRegister(shipperCd, invoiceNo, invoiceIssueDt, cmlTyp);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoiceOnRegister ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtInvoiceOnRegister002() throws Exception {
        //パラメータ
        String shipperCd = "MYF";
        String invoiceNo = "W7001001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/20");
        String[] cmlTyp = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtInvoiceOnRegister(shipperCd, invoiceNo, invoiceIssueDt, cmlTyp);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoiceOnRegisterCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtInvoiceOnRegisterCancel001() throws Exception {
        
        //パラメータ
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setShippingActNo("SHIP_ACT_1");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtInvoiceOnRegisterCancel(criteria);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoiceOnRegisterCancel ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtInvoiceOnRegisterCancel002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setShippingActNo("1");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtInvoiceOnRegisterCancel(criteria);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoiceOnRegisterChangeStatus ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtInvoiceOnRegisterChangeStatus001() throws Exception {
        //パラメータ
        String shipperCd = "MYF";
        String invoiceNo = "W7001002";
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtInvoiceOnRegisterChangeStatus(shipperCd, invoiceNo);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoiceOnRegisterChangeStatus ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtInvoiceOnRegisterChangeStatus002() throws Exception {
        //パラメータ
        String shipperCd = "1";
        String invoiceNo = "1";
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtInvoiceOnRegisterChangeStatus(shipperCd, invoiceNo);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtInvoiceOnRegisterChangeStatus ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOdrOnRegister001() throws Exception {
        //パラメータ
        String shippingActNo = "1";
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("1899/12/30");
        boolean checkCount = true;
        String[] lockFlag = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOdrOnRegister(shippingActNo, shipperCd, invoiceNo, invoiceIssueDt, checkCount, lockFlag);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOdrOnRegister ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOdrOnRegister002() throws Exception {
        //パラメータ
        String shippingActNo = "2";
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/20");
        boolean checkCount = true;
        String[] lockFlag = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOdrOnRegister(shippingActNo, shipperCd, invoiceNo, invoiceIssueDt, checkCount, lockFlag);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOdrOnRegisterCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOdrOnRegisterCancel001() throws Exception {
        //パラメータ
        String shippingActNo = "2";
        boolean checkCount = true;
        String[] lockFlag = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOdrOnRegisterCancel(shippingActNo, checkCount, lockFlag);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOdrOnRegisterCancel ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOdrOnRegisterCancel002() throws Exception {
        //パラメータ
        String shippingActNo = "MYF";
        boolean checkCount = true;
        String[] lockFlag = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOdrOnRegisterCancel(shippingActNo, checkCount, lockFlag);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnBlUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnBlUpload001() throws Exception {
        //パラメータ
        String shippingActNo = "SHIPACTE2";
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnBlUpload(shippingActNo);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnBlUpload ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnBlUpload002() throws Exception {
        //パラメータ
        String shippingActNo = "MYF";
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnBlUpload(shippingActNo);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnBlUploadCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnBlUploadCancel001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setShippingActNo("SHIPACTE6");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse("20140325184630");
        Timestamp object = new Timestamp(date.getTime());
        criteria.setComUpdateTimestamp(object);
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnBlUploadCancel(criteria);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnBlUploadCancel ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnBlUploadCancel002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setShippingActNo("MYF");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnBlUploadCancel(criteria);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnBlUploadView ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnBlUploadView001() throws Exception {
        //パラメータ
        String shippingActNo = "SHIPACTE2";
        OutputStream fileData = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnBlUploadView(shippingActNo, fileData);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnBlUploadView ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnBlUploadView002() throws Exception {
        //パラメータ
        String shippingActNo = "SHIP";
        OutputStream fileData = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnBlUploadView(shippingActNo, fileData);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus001() throws Exception {
        //パラメータ
        String shippingActNo = "SHIPACTE3";
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setShippingActNo(shippingActNo);
        
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus(criteria);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus002() throws Exception {
        //パラメータ
        String shippingActNo = "MYF";
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setShippingActNo(shippingActNo);
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualChangeStatus(criteria);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel001() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        String[] fileId = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel(shipperCd, invoiceNo, invoiceIssueDt, fileId);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel002() throws Exception {
        //パラメータ
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/20");
        String[] fileId = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel(shipperCd, invoiceNo, invoiceIssueDt, fileId);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualCoView ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualCoView001() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003004";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        OutputStream fileData = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualCoView(shipperCd, invoiceNo, invoiceIssueDt, fileData);
        assertThat(result, is(true));
    }

    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualCoView ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualCoView002() throws Exception {
        //パラメータ
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/20");
        OutputStream fileData = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualCoView(shipperCd, invoiceNo, invoiceIssueDt, fileData);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenCancel001() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        String[] fileId = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenCancel(shipperCd, invoiceNo, invoiceIssueDt, fileId);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualCoCancel ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenCancel002() throws Exception {
        //パラメータ
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/20");
        String[] fileId = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenCancel(shipperCd, invoiceNo, invoiceIssueDt, fileId);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenView ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenView001() throws Exception {
        //パラメータ
        String shipperCd = "MYF";
        String invoiceNo = "W7001004";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        OutputStream fileData = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualCoView(shipperCd, invoiceNo, invoiceIssueDt, fileData);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenView ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenView002() throws Exception {
        //パラメータ
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/20");
        OutputStream fileData = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualNonWoodenView(shipperCd, invoiceNo, invoiceIssueDt, fileData);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel001() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        BigDecimal brch = new BigDecimal("1");
        String[] fileId = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel(shipperCd, invoiceNo, invoiceIssueDt, brch,  fileId);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel002() throws Exception {
        //パラメータ
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/20");
        BigDecimal brch = new BigDecimal("1");
        String[] fileId = {"", "", ""};
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersCancel(shipperCd, invoiceNo, invoiceIssueDt, brch, fileId);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView001() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        BigDecimal brch = new BigDecimal(1);
        OutputStream fileId = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView(shipperCd, invoiceNo, invoiceIssueDt, brch,  fileId);
        assertThat(result, is(true));
    }

    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    public void testValidateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView002() throws Exception {
        //パラメータ
        String shipperCd = "1";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/20");
        BigDecimal brch = new BigDecimal(1);
        OutputStream fileId = new BufferedOutputStream(new FileOutputStream("C:/JunitTest/file.txt"));
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnOtherDocUploadIndividualOthersView(shipperCd, invoiceNo, invoiceIssueDt, brch, fileId);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnRegister ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnRegister001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setShippingActNo("SHIPACTE2");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnRegister(shippingActCriteriaDomain);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnRegister ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnRegister002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setShippingActNo("1");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnRegister(shippingActCriteriaDomain);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnRegisterCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnRegisterCancel001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setShippingActNo("SHIP_ACT_1");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnRegisterCancel(shippingActCriteriaDomain);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnRegisterCancel ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnRegisterCancel002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setShippingActNo("1");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnRegisterCancel(shippingActCriteriaDomain);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnRegisterChangeStatus ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnRegisterChangeStatus001() throws Exception {
        //パラメータ
        String shippingActNo = "MMAE140400013";
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setShippingActNo(shippingActNo);
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnRegisterChangeStatus(criteria);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingActOnRegisterChangeStatus ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingActOnRegisterChangeStatusCancel002() throws Exception {
        //パラメータ
        String shippingActNo = "1";
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setShippingActNo(shippingActNo);
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingActOnRegisterChangeStatus(criteria);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload001() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload002() throws Exception {
        //パラメータ
        String shipperCd = "A";
        String invoiceNo = "20";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryCoUpload(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload001() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/04/19");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload002() throws Exception {
        //パラメータ
        String shipperCd = "20";
        String invoiceNo = "20";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryNonWoodenUpload(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload001() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/04/19");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload002() throws Exception {
        //パラメータ
        String shipperCd = "20";
        String invoiceNo = "20";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingDocumentOnOtherDocUploadSummaryOthersUpload(shipperCd, invoiceNo, invoiceIssueDt);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingDocumentOnRegister ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingDocumentOnRegister001() throws Exception {
        //パラメータ
        String shipperCd = "2";
        String invoiceNo = "1";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/03/19");
        List<W7001ShippingActDocDomain> shippingActDocList = new ArrayList<W7001ShippingActDocDomain>();
        boolean checkCount = false;
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingDocumentOnRegister(shipperCd, invoiceNo, invoiceIssueDt, shippingActDocList, checkCount);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTtShippingDocumentOnRegister ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTtShippingDocumentOnRegister002() throws Exception {
        //パラメータ
        String shipperCd = "MAE";
        String invoiceNo = "W7003001";
        Date invoiceIssueDt = DateFormat.getDateInstance().parse("2014/04/19");
        List<W7001ShippingActDocDomain> shippingActDocList = new ArrayList<W7001ShippingActDocDomain>();
        boolean checkCount = true;
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTtShippingDocumentOnRegister(shipperCd, invoiceNo, invoiceIssueDt, shippingActDocList, checkCount);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnCreateMoveToRegister ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTwShippingActInvoiceOnCreateMoveToRegister001() throws Exception {
        //パラメータ
        String dscId = "1";
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnCreateMoveToRegister(dscId);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnCreateMoveToRegister ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTwShippingActInvoiceOnCreateMoveToRegister002() throws Exception {
        //パラメータ
        String dscId = "0";
        // 組み合わせ (正)
        boolean result;
        result = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnCreateMoveToRegister(dscId);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnCreateUpdate ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTwShippingActInvoiceOnCreateUpdate001() throws Exception {
        //パラメータ
        String dscId = "1";
        int activeCheckedCnt = 1;
        int activePkgQty = 1;
        String[] params = {"", "", ""};
        // 組み合わせ (正)
        String result;
        result = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnCreateUpdate(dscId, activeCheckedCnt, activePkgQty, params);
        assertNull(result);
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnCreateUpdate ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTwShippingActInvoiceOnCreateUpdate002() throws Exception {
        //パラメータ
        String dscId = "99";
        int activeCheckedCnt = 10;
        int activePkgQty = 10;
        String[] params = {"", "", ""};
        // 組み合わせ (正)
        String result;
        result = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnCreateUpdate(dscId, activeCheckedCnt, activePkgQty, params);
        assertThat(result, is("NXS_91_0001"));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnRegister ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTwShippingActInvoiceOnRegister001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setDscId("1");
        // 組み合わせ (正)
        boolean result = true;
        result = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnRegister(criteria);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnRegister ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTwShippingActInvoiceOnRegister002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain criteria = new W7001ShippingActCriteriaDomain();
        criteria.setDscId("2");
        // 組み合わせ (正)
        boolean result = false;
        result = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnRegister(criteria);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen001() throws Exception {
        //パラメータ
        String dscId = "1";
        // 組み合わせ (正)
        boolean result = true;
        result = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen(dscId);
        assertThat(result, is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testValidateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen002() throws Exception {
        //パラメータ
        String dscId = "2";
        // 組み合わせ (正)
        boolean result = false;
        result = w7001ShippingActService.validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen(dscId);
        assertThat(result, is(false));
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchForPagingOnCreateSearch001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setAutoInvoiceRegisterFlg("Y");
        shippingActCriteriaDomain.setShipperCd("1");
        shippingActCriteriaDomain.setFreightResponsibleCd("1");
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setCarrierCompCd("1");
        shippingActCriteriaDomain.setVessel("1");
        shippingActCriteriaDomain.setInvoiceNo("1");
        shippingActCriteriaDomain.setContainerLooseTyp("1");
        shippingActCriteriaDomain.setDscId("1");
        shippingActCriteriaDomain.setLocale(new Locale("ja"));
        // 組み合わせ (正)
        List<? extends W7001ShippingActInvoiceDomain> result = w7001ShippingActService.searchForPagingOnCreateSearch(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- validateDatabaseTwShippingActInvoiceOnRegisterBackToMainScreen ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchForPagingOnCreateSearch002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setAutoInvoiceRegisterFlg("N");
        shippingActCriteriaDomain.setShipperCd("1");
        shippingActCriteriaDomain.setFreightResponsibleCd("1");
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setCarrierCompCd("1");
        shippingActCriteriaDomain.setVessel("1");
        shippingActCriteriaDomain.setInvoiceNo("1");
        shippingActCriteriaDomain.setContainerLooseTyp("1");
        shippingActCriteriaDomain.setDscId("1");
        shippingActCriteriaDomain.setLocale(new Locale("ja"));
        // 組み合わせ (正)
        List<? extends W7001ShippingActInvoiceDomain> result = w7001ShippingActService.searchForPagingOnCreateSearch(shippingActCriteriaDomain);
//        assertThat(result, is(false));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchForPagingOnMainSearch ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchForPagingOnMainSearch001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setToRegisterDt(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setFmRegisterDt(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setShipperCd("1");
        shippingActCriteriaDomain.setConsigneeCd("1");
        shippingActCriteriaDomain.setCarrierCompCd("1");
        shippingActCriteriaDomain.setVessel("1");
        shippingActCriteriaDomain.setFreightResponsibleCd("1");
        shippingActCriteriaDomain.setBilldNo("1");
        shippingActCriteriaDomain.setShippingActStatus("1");
        List<String> sList = new ArrayList<String>();
        sList.add("1");
        shippingActCriteriaDomain.setBilldFileIdList(sList);
        shippingActCriteriaDomain.setToAtd(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setFmAtd(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setDeleteFlag("N");
        shippingActCriteriaDomain.setInvoiceNo("1");
        shippingActCriteriaDomain.setContainerNo("1");
        shippingActCriteriaDomain.setLocale(new Locale("ja"));
        // 組み合わせ (正)
        List<? extends W7001ShippingActDomain> result = w7001ShippingActService.searchForPagingOnMainSearch(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchForPagingOnMainSearch ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchForPagingOnMainSearch002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setToRegisterDt(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setFmRegisterDt(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setShipperCd("1");
        shippingActCriteriaDomain.setConsigneeCd("1");
        shippingActCriteriaDomain.setCarrierCompCd("1");
        shippingActCriteriaDomain.setVessel("1");
        shippingActCriteriaDomain.setFreightResponsibleCd("1");
        shippingActCriteriaDomain.setBilldNo("1");
        shippingActCriteriaDomain.setShippingActStatus("1");
        List<String> sList = new ArrayList<String>();
        sList.add("1");
        shippingActCriteriaDomain.setBilldFileIdList(sList);
        shippingActCriteriaDomain.setToAtd(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setFmAtd(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setDeleteFlag("N");
        shippingActCriteriaDomain.setInvoiceNo("1");
        shippingActCriteriaDomain.setContainerNo("1");
        shippingActCriteriaDomain.setLocale(new Locale("ja"));
        // 組み合わせ (正)
        List<? extends W7001ShippingActDomain> result = w7001ShippingActService.searchForPagingOnMainSearch(shippingActCriteriaDomain);
//        assertThat(result, is(false));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnBlUploadInit ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnBlUploadInit001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        // 組み合わせ (正)
        W7001ShippingActDocDomain result = w7001ShippingActService.searchOnBlUploadInit(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnBlUploadInit ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnBlUploadInit002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        // 組み合わせ (正)
        W7001ShippingActDocDomain result = w7001ShippingActService.searchOnBlUploadInit(shippingActCriteriaDomain);
//        assertThat(result, is(false));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnOtherDocUploadIndividualInit ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnOtherDocUploadIndividualInit001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.searchOnOtherDocUploadIndividualInit(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnOtherDocUploadIndividualInit ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnOtherDocUploadIndividualInit002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.searchOnOtherDocUploadIndividualInit(shippingActCriteriaDomain);
//        assertThat(result, is(false));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnOtherDocUploadSummary ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnOtherDocUploadSummary001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        // 組み合わせ (正)
        List<? extends W7001ShippingActInvoiceDomain>  result = w7001ShippingActService.searchOnOtherDocUploadSummary(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnOtherDocUploadSummary ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnOtherDocUploadSummary002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        // 組み合わせ (正)
        List<? extends W7001ShippingActInvoiceDomain>  result = w7001ShippingActService.searchOnOtherDocUploadSummary(shippingActCriteriaDomain);
//        assertThat(result, is(false));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnRegisterInitByFromCreate ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnRegisterInitByFromCreate001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.searchOnRegisterInitByFromCreate(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnRegisterInitByFromCreate ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnRegisterInitByFromCreate002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.searchOnRegisterInitByFromCreate(shippingActCriteriaDomain);
//        assertThat(result, is(false));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnRegisterInitByFromCreate ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnRegisterInitByFromMain001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setAutoInvoiceRegisterFlg("N");
        shippingActCriteriaDomain.setShipperCd("1");
        shippingActCriteriaDomain.setFreightResponsibleCd("1");
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setCarrierCompCd("1");
        shippingActCriteriaDomain.setVessel("1");
        shippingActCriteriaDomain.setInvoiceNo("1");
        shippingActCriteriaDomain.setContainerLooseTyp("1");
        shippingActCriteriaDomain.setDscId("1");
        shippingActCriteriaDomain.setLocale(new Locale("ja"));
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.searchOnRegisterInitByFromMain(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- searchOnRegisterInitByFromCreate ----------------------------------------------------------
    /**
     * 異常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testSearchOnRegisterInitByFromMain002() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setAutoInvoiceRegisterFlg("N");
        shippingActCriteriaDomain.setShipperCd("1");
        shippingActCriteriaDomain.setFreightResponsibleCd("1");
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/19"));
        shippingActCriteriaDomain.setCarrierCompCd("1");
        shippingActCriteriaDomain.setVessel("1");
        shippingActCriteriaDomain.setInvoiceNo("1");
        shippingActCriteriaDomain.setContainerLooseTyp("1");
        shippingActCriteriaDomain.setDscId("1");
        shippingActCriteriaDomain.setLocale(new Locale("ja"));
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.searchOnRegisterInitByFromMain(shippingActCriteriaDomain);
//        assertThat(result, is(false));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- createOnCreateUpdate ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnCreateUpdate001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActCriteriaDomain = new W7001ShippingActInvoiceDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setPkgQty(new BigDecimal("20"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setDeleteFlagForDoc("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActCriteriaDomain);
        // 組み合わせ (正)
        w7001ShippingActService.createOnCreateUpdate(shippingActCriteriaList);
//        assertThat(result.get(0).getCmlTyp(), is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- createOnOtherDocUploadIndividualCoUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnOtherDocUploadIndividualCoUpload001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.createOnOtherDocUploadIndividualCoUpload(shippingActCriteriaDomain);
        
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }

    
    /* ========== テストケース ================================================================== */
    // --- createOnOtherDocUploadIndividualNonWoodenUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnOtherDocUploadIndividualNonWoodenUpload001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");

        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.createOnOtherDocUploadIndividualNonWoodenUpload(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- createOnOtherDocUploadIndividualOthersUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnOtherDocUploadIndividualOthersUpload001() throws Exception {
        //パラメータ
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.createOnOtherDocUploadIndividualOthersUpload(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- createOnOtherDocUploadSummaryCoUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnOtherDocUploadSummaryCoUpload001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        
        // 組み合わせ (正)
        W7001ShippingActDomain shippingActDomain = w7001ShippingActService.createOnOtherDocUploadSummaryCoUpload(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (shippingActDomain == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- createOnOtherDocUploadSummaryCoUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnOtherDocUploadSummaryNonWoodenUpload001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        // 組み合わせ (正)
        W7001ShippingActDomain shippingActDomain = w7001ShippingActService.createOnOtherDocUploadSummaryNonWoodenUpload(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (shippingActDomain == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- createOnOtherDocUploadSummaryOthersUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testCreateOnOtherDocUploadSummaryOthersUpload001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        // 組み合わせ (正)
        W7001ShippingActDomain shippingActDomain = w7001ShippingActService.createOnOtherDocUploadSummaryOthersUpload(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (shippingActDomain == null) {;}
    }
    
    
    /* ========== テストケース ================================================================== */
    // --- updateOnOtherDocUploadIndividualChangeStatus ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testUpdateOnOtherDocUploadIndividualChangeStatus001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.updateOnOtherDocUploadIndividualChangeStatus(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- deleteOnCreateInit ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnCreateInit001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        
        // 組み合わせ (正)
        w7001ShippingActService.deleteOnCreateInit(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- deleteOnHeaderInit ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnHeaderInit001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        
        // 組み合わせ (正)
        w7001ShippingActService.deleteOnHeaderInit(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
    }
   
    /* ========== テストケース ================================================================== */
    // --- deleteOnMainInit ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnMainInit001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        
        // 組み合わせ (正)
        w7001ShippingActService.deleteOnMainInit(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
    }
    
    /* ========== テストケース ================================================================== */
    // --- deleteOnOtherDocUploadIndividualCoCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnOtherDocUploadIndividualCoCancel001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.deleteOnOtherDocUploadIndividualCoCancel(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- deleteOnOtherDocUploadIndividualNonWoodenCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnOtherDocUploadIndividualNonWoodenCancel001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.deleteOnOtherDocUploadIndividualNonWoodenCancel(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- deleteOnOtherDocUploadIndividualOthersCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnOtherDocUploadIndividualOthersCancel001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.deleteOnOtherDocUploadIndividualOthersCancel(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- deleteOnRegisterDelete ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testDeleteOnRegisterDelete001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        String procMode = "2";
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.deleteOnRegisterDelete(procMode, shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- transactOnBlUpload ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnBlUpload001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        String procMode = "2";
        // 組み合わせ (正)
        W7001ShippingActDocDomain result = w7001ShippingActService.transactOnBlUpload(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (procMode == null) {;}
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- transactOnBlUploadCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnBlUploadCancel001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        String procMode = "2";
        // 組み合わせ (正)
        W7001ShippingActDocDomain result = w7001ShippingActService.transactOnBlUploadCancel(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (procMode == null) {;}
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- transactOnRegisterByFromCreate ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnRegisterByFromCreate001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        String reportDateFormat = "yyyy/mm/dd";
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.transactOnRegisterByFromCreate(shippingActCriteriaDomain, reportDateFormat);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- transactOnRegisterByFromMain ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnRegisterByFromMain001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        String reportDateFormat = "yyyy/mm/dd";
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.transactOnRegisterByFromMain(shippingActCriteriaDomain, reportDateFormat);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- transactOnRegisterCancel ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnRegisterCancel001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        String reportDateFormat = "yyyy/mm/dd";
        // 組み合わせ (正)
        w7001ShippingActService.transactOnRegisterCancel(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (reportDateFormat == null) {;}
    }
    
    /* ========== テストケース ================================================================== */
    // --- transactOnRegisterChangeStatus ----------------------------------------------------------
    /**
     * 正常ケース
     *  
     *  @throws Exception 例外発生した場合
     */
    @Test
    @Transactional
    public void testTransactOnRegisterChangeStatus001() throws Exception {
        //パラメータ
        List<W7001ShippingActInvoiceDomain> shippingActCriteriaList = new ArrayList<W7001ShippingActInvoiceDomain>();
        W7001ShippingActInvoiceDomain shippingActInvoiceDomain = new W7001ShippingActInvoiceDomain();
        shippingActInvoiceDomain.setDscId("20");
        shippingActInvoiceDomain.setShipperCd("20");
        shippingActInvoiceDomain.setInvoiceNo("20");
        shippingActInvoiceDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setPkgQty(new BigDecimal("20"));
        shippingActInvoiceDomain.setShippingActStatus("20");
        shippingActInvoiceDomain.setContainerLooseTyp("20");
        shippingActInvoiceDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActInvoiceDomain.setCarrierCompCd("20");
        shippingActInvoiceDomain.setVessel("20");
        shippingActInvoiceDomain.setDeleteFlagForDoc("20");
        shippingActInvoiceDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaList.add(shippingActInvoiceDomain);
        
        W7001ShippingActCriteriaDomain shippingActCriteriaDomain = new W7001ShippingActCriteriaDomain();
        shippingActCriteriaDomain.setDscId("20");
        shippingActCriteriaDomain.setShipperCd("20");
        shippingActCriteriaDomain.setInvoiceNo("20");
        shippingActCriteriaDomain.setInvoiceIssueDt(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setShippingActStatus("20");
        shippingActCriteriaDomain.setContainerLooseTyp("20");
        shippingActCriteriaDomain.setEtd(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setEta(DateFormat.getDateInstance().parse("2014/04/22"));
        shippingActCriteriaDomain.setCarrierCompCd("20");
        shippingActCriteriaDomain.setVessel("20");
        shippingActCriteriaDomain.setComUpdateTimestamp(new Timestamp(new SimpleDateFormat("yyyy/MM/dd").parse("2014/04/22").getTime()));
        shippingActCriteriaDomain.setFileData(new BufferedInputStream(new FileInputStream("C:/JunitTest/file.txt")));
        shippingActCriteriaDomain.setFileName("C:/JunitTest/file.txt");
        shippingActCriteriaDomain.setShippingActInvoiceList(shippingActCriteriaList);
        // 組み合わせ (正)
        W7001ShippingActDomain result = w7001ShippingActService.transactOnRegisterChangeStatus(shippingActCriteriaDomain);
//        assertThat(result.get(0).getCmlTyp(), is(true));
        if (result == null) {;}
    }
}
