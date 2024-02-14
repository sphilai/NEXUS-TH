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
import com.globaldenso.eca0027.core.business.domain.Ws2511ResultDomain;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2511Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 7244 $
 */
public class Ws2511ResourceTest extends AbstractEca0027Test {

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2511ResourceTest() {
    }
   
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase1-1-1,2,3
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3() throws Exception {
        // Error
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2511");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2511
        wsCallerRestDomain.setParamMap("compCd", "");
        wsCallerRestDomain.setParamMap("printerId", "");
        wsCallerRestDomain.setParamMap("xMainMark", "");
        
        // Webサービスを呼び出す
        Ws2511ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2511ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase2-1-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag4() throws Exception {
        // Error
        setDensoContext("X");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2511");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2511
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("xMainMark", "XWH01404150004");
        
        // Webサービスを呼び出す
        Ws2511ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2511ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5031"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase2-2-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag5() throws Exception {
        // Error
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2511");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2511
        wsCallerRestDomain.setParamMap("compCd", "ZZZ");
        wsCallerRestDomain.setParamMap("printerId", "99");
        wsCallerRestDomain.setParamMap("xMainMark", "XWH01404150004");
        
        // Webサービスを呼び出す
        Ws2511ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2511ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5018"));
    }

    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase3-1--
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag1() throws Exception {

        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2511");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2511
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("xMainMark", "XWH01404150004");
        
        // Webサービスを呼び出す
        Ws2511ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2511ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("0"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase -----
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag2() throws Exception {
        // Error
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2511");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2511
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("xMainMark", "");
        
        // Webサービスを呼び出す
        Ws2511ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2511ResultDomain>(){});
        
        assertThat(resultDomain.getResultCode(), is("9"));
    }
}
