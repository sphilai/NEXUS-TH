/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2013/12/25
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.business.domain.Ws2509ResultDomain;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2509Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 7416 $
 */
public class Ws2509ResourceTest extends AbstractEca0027Test {

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2509ResourceTest() {
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase 1-1-1, 1-1-2
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintMixTag3() throws Exception {
        
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2509");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2509
        wsCallerRestDomain.setParamMap("compCd", "");
        wsCallerRestDomain.setParamMap("printerId", "");
        // ↓MIXタグ
        wsCallerRestDomain.setParamMap("mixTagNo", "MMY7WH01404230003");
        
        // Webサービスを呼び出す
        Ws2509ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2509ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase 1-2-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintMixTag4() throws Exception {
        
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2509");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2509
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        // ↓MIXタグ
        wsCallerRestDomain.setParamMap("mixTagNo", "");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2509ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2509ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }



    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase 1-2-4
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintMixTag7() throws Exception {
        
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2509");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2509
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        // ↓MIXタグ
        wsCallerRestDomain.setParamMap("mixTagNo", "MMY7WH01404230003");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014/07/26 00:00:00");
        
        // Webサービスを呼び出す
        Ws2509ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2509ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase 2-1-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintMixTag8() throws Exception {
        
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2509");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2509
        wsCallerRestDomain.setParamMap("compCd", "ZZZ");
        wsCallerRestDomain.setParamMap("printerId", "99");
        // ↓MIXタグ
        wsCallerRestDomain.setParamMap("mixTagNo", "MMY7WH01404230003");
        
        // Webサービスを呼び出す
        Ws2509ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2509ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5018"));
    }

    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase 1-2-3, 3-1-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintMixTag10() throws Exception {
        
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2509");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2509
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        // ↓MIXタグ
        wsCallerRestDomain.setParamMap("mixTagNo", "MMY7WH01404230003");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2509ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2509ResultDomain>(){});
        assertThat(resultDomain.getResultCode(), is("0"));
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase 1-2-2, 3-1-2
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintMixTag11() throws Exception {
        
        setDensoContext("fukui07");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2509");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2509
        wsCallerRestDomain.setParamMap("compCd", "MYB");
        wsCallerRestDomain.setParamMap("printerId", "01");
        // ↓MIXタグ
        wsCallerRestDomain.setParamMap("mixTagNo", "");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-06 18:10:30.790");

        // Webサービスを呼び出す
        Ws2509ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2509ResultDomain>(){});
        assertThat(resultDomain.getResultCode(), is("0")); 
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase -----
     * @throws Exception テストに失敗した場合
     */
//    @Test
//    public void testSearchOnPrintMixTag1() throws Exception {
//        
//        setDensoContext("nexus");
//        
//        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
//        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2509");
//        wsCallerRestDomain.setAddDensoContext(true);
//        wsCallerRestDomain.setUserName("bht");
//        wsCallerRestDomain.setPassword("bht");
//        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
//        
//        // 2509
//        wsCallerRestDomain.setParamMap("compCd", "MY7");
//        wsCallerRestDomain.setParamMap("printerId", "01");
//        // ↓MIXタグ
//        wsCallerRestDomain.setParamMap("mixTagNo", "MMY7WH01404230003");
//        
//        // Webサービスを呼び出す
//        Ws2509ResultDomain resultDomain
//            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2509ResultDomain>(){});
//        
//        assertThat(resultDomain.getResultCode(), is("0"));
//    }
//    
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * TestCase -----
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSearchOnPrintMixTag2() throws Exception {
//        // SysError
//        setDensoContext("nexus");
//        
//        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
//        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2509");
//        wsCallerRestDomain.setAddDensoContext(true);
//        wsCallerRestDomain.setUserName("bht");
//        wsCallerRestDomain.setPassword("bht");
//        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
//        
//        // 2509
//        wsCallerRestDomain.setParamMap("compCd", "MY7");
//        wsCallerRestDomain.setParamMap("printerId", "01");
//        // ↓MIXタグ
//        wsCallerRestDomain.setParamMap("mixTagNo", "MMY7WH01400000000");
//        
//        // Webサービスを呼び出す
//        Ws2509ResultDomain resultDomain
//            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2509ResultDomain>(){});
//        
//        assertThat(resultDomain.getResultCode(), is("9"));
//    }
}
