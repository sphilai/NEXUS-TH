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
import com.globaldenso.eca0027.core.business.domain.Ws2501ResultDomain;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2501Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 7244 $
 */
public class Ws2501ResourceTest extends AbstractEca0027Test {

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2501ResourceTest() {
    }


    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase1-1-1
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr2() throws Exception {
        // pltzInstrNo 未入力
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        
        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }
    
   /**
     * <br />
     * Webサービスのテスト (異常系)
     * TestCase2-1-1
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr3() throws Exception {
        // pltzInstrNo 存在しない
        setDensoContext("nexus");

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "ZZZZZ");

        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5038"));
    }
    
    
    /**
     * <br />
     * Webサービスのテスト (異常系)
     * TestCase2-2-1
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr4() throws Exception {
        // pltzInstrNo 存在しない
        setDensoContext("nexus");

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        
        // pltz_instr_status = '40'
        wsCallerRestDomain.setParamMap("pltzInstrNo", "DNMY000150");

        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5015"));
        
    }
    
    /**
     * <br />
     * Webサービスのテスト (異常系)
     * TestCase2-2-2
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr5() throws Exception {
        // pltzInstrNo 存在しない
        setDensoContext("nexus");

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        
        // pltz_instr_status = '50'
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY60000005");

        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5015"));
    }
    
    /**
     * <br />
     * Webサービスのテスト (正常系)
     * TestCase3-1-1
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr6() throws Exception {
        // pltzInstrNo 存在しない
        setDensoContext("nexus");

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        
        // 
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MA80000001");

        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});

        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    }
    
    /**
     * <br />
     * Webサービスのテスト (正常系)
     * TestCase3-1-2
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr7() throws Exception {
        // pltzInstrNo 存在しない
        setDensoContext("nexus");

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        
        //
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0430003");

        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});

        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    }
    
    /**
     * <br />
     * Webサービスのテスト (正常系)
     * TestCase3-2-1
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr8() throws Exception {
        // pltzInstrNo 存在しない
        setDensoContext("nexus");

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        
        //
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0000148");

        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});

        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
    }
    
    /**
     * <br />
     * Webサービスのテスト (正常系)
     * TestCase3-2-2
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr9() throws Exception {
        // pltzInstrNo 存在しない
        setDensoContext("nexus");

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        
        // 
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY40612001");

        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});

        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
    }
    
    /**
     * <br />
     * Webサービスのテスト (正常系)
     * TestCase3-3-1
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testGetPltzInstr10() throws Exception {
        // pltzInstrNo 存在しない
        setDensoContext("nexus");

        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MA20513001");

        // Webサービスを呼び出す
        Ws2501ResultDomain resultDomain
            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5064"));

    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase---
     * @throws Exception エラーが発生した場合
     */
//    @Test
//    public void testGetPltzInstr1() throws Exception {
//
//        setDensoContext("nexus");
//        
//        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
//        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2501");
//        wsCallerRestDomain.setAddDensoContext(true);
//        wsCallerRestDomain.setUserName("bht");
//        wsCallerRestDomain.setPassword("bht");
//        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621001");
//        
//        // Webサービスを呼び出す
//        Ws2501ResultDomain resultDomain
//            = (Ws2501ResultDomain)WebServiceCallerRest.get(wsCallerRestDomain, new GenericType<Ws2501ResultDomain>(){});
//        
//        assertThat(resultDomain.getResultCode(), is("0"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
////        assertThat(resultDomain., is(1));
//    }
}
