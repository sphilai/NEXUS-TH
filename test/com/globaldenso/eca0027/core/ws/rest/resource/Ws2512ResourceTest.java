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
import com.globaldenso.eca0027.core.business.domain.Ws2512ResultDomain;
import com.sun.jersey.api.client.GenericType;

/**
 * <br/>Ws2512Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 7244 $
 */
public class Ws2512ResourceTest extends AbstractEca0027Test {

    /**
     * <br/>デフォルトコンストラクタ
     */
    public Ws2512ResourceTest() {
    }
    
    /**
     * <br />異常系
     * TestCase 1-1-1,2,3
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnPrintErt3() throws Exception {
        // SysError
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2512");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2512
        wsCallerRestDomain.setParamMap("compCd", "");
        wsCallerRestDomain.setParamMap("printerId", "");
        wsCallerRestDomain.setParamMap("mainMark", "");
        
        // Webサービスを呼び出す
        Ws2512ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2512ResultDomain>(){});
        
        // 1が返却されるはず
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }
    
    /**
     * <br />異常系
     * TestCase 2-1-1
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnPrintErt4() throws Exception {
        // SysError
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2512");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2512
        wsCallerRestDomain.setParamMap("compCd", "ZZZ"); 
        wsCallerRestDomain.setParamMap("printerId", "99");
        wsCallerRestDomain.setParamMap("mainMark", "DMY7L201404250010");
        
        // Webサービスを呼び出す
        Ws2512ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2512ResultDomain>(){});
        
        // 1が返却されるはず
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5018"));
    }
    
    /**
     * <br />異常系
     * TestCase 2-2-1
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnPrintErt5() throws Exception {
        // SysError
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2512");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2512
        wsCallerRestDomain.setParamMap("compCd", "MY7"); 
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "DMY7L999999999999");
        
        // Webサービスを呼び出す
        Ws2512ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2512ResultDomain>(){});
        
        // 1が返却されるはず
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5067"));
    }
    
    /**
     * <br />CML出力
     * TestCase 3-1--
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnPrintErt1() throws Exception {
        
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2512");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2512
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", 
            "DMY7L201404250010,DMY7L201404250011,DMY7L201404250012");
        
        // Webサービスを呼び出す
        Ws2512ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2512ResultDomain>(){});
        
        // 0が返却されるはず
        assertThat(resultDomain.getResultCode(), is("0"));
    }

    /**
     * <br />異常系
     * TestCase -----
     * @throws Exception エラーが発生した場合
     */
    @Test
    public void testSearchOnPrintErt2() throws Exception {
        // SysError
        setDensoContext("nexus");
        
        WebServiceCallerRestDomain wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2512");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
        
        // 2512
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "");
        
        // Webサービスを呼び出す
        Ws2512ResultDomain resultDomain
            = WebServiceCallerRest.put(wsCallerRestDomain, new GenericType<Ws2512ResultDomain>(){});
        
        // 9が返却されるはず
        assertThat(resultDomain.getResultCode(), is("9"));
    }
    
}
