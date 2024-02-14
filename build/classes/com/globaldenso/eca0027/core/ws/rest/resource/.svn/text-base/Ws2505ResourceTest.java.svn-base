/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws2505ResultDomain;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2505Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 7244 $
 */
public class Ws2505ResourceTest extends AbstractEca0027Test {

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2505ResourceTest() {
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase1-1-1,2,3,4,5,6,7,8,9
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPkgSpec3() throws Exception {
        
        // 異常系(InputError)
        setDensoContext("fukui07");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
      
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "");
        wsCallerRestDomain.setParamMap("itemNo", "");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("trnsCd", "");
        wsCallerRestDomain.setParamMap("rev", "");
        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "");
        wsCallerRestDomain.setParamMap("isltdStorageFlg", "");
        wsCallerRestDomain.setParamMap("isltdShippingFlg", "");
        wsCallerRestDomain.setParamMap("nProc", "");
        
        // Webサービスを呼び出す
        Ws2505ResultDomain resultDomain
            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(9));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase1-2-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPkgSpec4() throws Exception {
        
        // 異常系(InputError)
        setDensoContext("fukui07");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "ZZZ");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B3N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("trnsCd", "A");
        wsCallerRestDomain.setParamMap("rev", "1");
        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "Y");
        wsCallerRestDomain.setParamMap("isltdStorageFlg", "Y");
        wsCallerRestDomain.setParamMap("isltdShippingFlg", "Y");
        wsCallerRestDomain.setParamMap("nProc", " ");
        
        // Webサービスを呼び出す
        Ws2505ResultDomain resultDomain
            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5007"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase1-2-2
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPkgSpec5() throws Exception {
        
        // 異常系(InputError)
        setDensoContext("fukui07");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
       
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("itemNo", "ZZZZZZZZZZZZ");
        wsCallerRestDomain.setParamMap("pkgCd", "999");
        wsCallerRestDomain.setParamMap("trnsCd", "Z");
        wsCallerRestDomain.setParamMap("rev", "0");
        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "Y");
        wsCallerRestDomain.setParamMap("isltdStorageFlg", "Y");
        wsCallerRestDomain.setParamMap("isltdShippingFlg", "Y");
        wsCallerRestDomain.setParamMap("nProc", "Z");
        
        // Webサービスを呼び出す
        Ws2505ResultDomain resultDomain
            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5060"));
    }
    
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase1-3-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPkgSpec6() throws Exception {
        
        setDensoContext("fukui07");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "BHT");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B3N01");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("rev", "1");
        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "N");
        wsCallerRestDomain.setParamMap("isltdStorageFlg", "N");
        wsCallerRestDomain.setParamMap("isltdShippingFlg", "Y");
        wsCallerRestDomain.setParamMap("nProc", " ");
        
        // Webサービスを呼び出す
        Ws2505ResultDomain resultDomain
            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase1-3-2
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPkgSpec7() throws Exception {
        
        setDensoContext("fukui07");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "BHT");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B3N01");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("rev", "2");
        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "N");
        wsCallerRestDomain.setParamMap("isltdStorageFlg", "N");
        wsCallerRestDomain.setParamMap("isltdShippingFlg", "Y");
        wsCallerRestDomain.setParamMap("nProc", " ");
        
        // Webサービスを呼び出す
        Ws2505ResultDomain resultDomain
            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase2-2-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPkgSpec8() throws Exception {
        
        setDensoContext("fukui07");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "BHT");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B3N02");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("rev", "1");
        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "N");
        wsCallerRestDomain.setParamMap("isltdStorageFlg", "N");
        wsCallerRestDomain.setParamMap("isltdShippingFlg", "Y");
        wsCallerRestDomain.setParamMap("nProc", " ");
        
        // Webサービスを呼び出す
        Ws2505ResultDomain resultDomain
            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase2-1-1, 2-2-2
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPkgSpec9() throws Exception {
        
        setDensoContext("fukui07");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "BHT");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B3N02");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("rev", "2");
        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "N");
        wsCallerRestDomain.setParamMap("isltdStorageFlg", "N");
        wsCallerRestDomain.setParamMap("isltdShippingFlg", "Y");
        wsCallerRestDomain.setParamMap("nProc", " ");
         
        // Webサービスを呼び出す
        Ws2505ResultDomain resultDomain
            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
    }
    


    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase-----
     * @throws Exception テストに失敗した場合
     */
//    @Test
//    public void testTransactOnPkgSpec1() throws Exception {
//        
//        setDensoContext("fukui07");
//        
//        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
//        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
//        wsCallerRestDomain.setAddDensoContext(true);
//        wsCallerRestDomain.setUserName("bht");
//        wsCallerRestDomain.setPassword("bht");
//        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
//        wsCallerRestDomain.setParamMap("dscId", "fukui07");
//        wsCallerRestDomain.setParamMap("languageCd", "en");
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("compCd", "MY7");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B3N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("trnsCd", "A");
//        wsCallerRestDomain.setParamMap("rev", "1");
//        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "Y");
//        wsCallerRestDomain.setParamMap("isltdStorageFlg", "Y");
//        wsCallerRestDomain.setParamMap("isltdShippingFlg", "Y");
//        wsCallerRestDomain.setParamMap("nProc", " ");
//        
//        // Webサービスを呼び出す
//        Ws2505ResultDomain resultDomain
//            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
//        
//        assertThat(resultDomain.getResultCode(), is("0"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        
//    }

    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase---
     * @throws Exception テストに失敗した場合
     */
//    @Test
//    public void testTransactOnPkgSpec2() throws Exception {
//        
//        // 異常系(InputError)
//        setDensoContext("fukui07");
//        
//        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
//        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2505");
//        wsCallerRestDomain.setAddDensoContext(true);
//        wsCallerRestDomain.setUserName("bht");
//        wsCallerRestDomain.setPassword("bht");
//        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
//        wsCallerRestDomain.setParamMap("dscId", "fukui07");
//        wsCallerRestDomain.setParamMap("languageCd", "en");
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("compCd", "MY7");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B3N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("trnsCd", "A");
//        wsCallerRestDomain.setParamMap("rev", "1");
//        wsCallerRestDomain.setParamMap("isltdPurchaseFlg", "Y");
//        wsCallerRestDomain.setParamMap("isltdStorageFlg", "Y");
//        wsCallerRestDomain.setParamMap("isltdShippingFlg", "");
//        wsCallerRestDomain.setParamMap("nProc", " ");
//        
//        // Webサービスを呼び出す
//        Ws2505ResultDomain resultDomain
//            = (Ws2505ResultDomain)WebServiceCallerRest.post(wsCallerRestDomain, new GenericType<Ws2505ResultDomain>(){});
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//    }
}
