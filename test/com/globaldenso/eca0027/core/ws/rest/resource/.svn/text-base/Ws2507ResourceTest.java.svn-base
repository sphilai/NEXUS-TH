/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest.put;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import java.sql.Timestamp;
import java.text.ParseException;

import org.apache.commons.lang.time.DateUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.domain.Ws2507ResultDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2507Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 7244 $
 */
@RunWith(Ws25xxResourceTestRunner.class)
public class Ws2507ResourceTest extends AbstractEca0027Test {

    /** WEBサービスの結果タイプ */
    private static final GenericType<Ws2507ResultDomain> RESULT_TYPE = new GenericType<Ws2507ResultDomain>() {};

    /** WebServiceCallerRestDomain オブジェクト */
    private WebServiceCallerRestDomain wsCallerRestDomain;

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2507ResourceTest() {
    }

    /**
     * テスト対象データの準備
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Before
    public void setUpData() throws ApplicationException, ParseException {
        
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        
        if ("testTransactOnPrintCml15".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setPltzInstrNo("MY70710001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setPltzInstrNo("XXXXXXX");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testTransactOnPrintCml17".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MY70425001");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setShipperCd("XXX");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testTransactOnPrintCml20".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MY70710001");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE);
            domain.setCmlPrintOutDt(new Timestamp(DateUtils.parseDate("1970/01/01", new String[] {"yyyy/MM/dd"}).getTime()));
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        }
    }
    /**
     * WebServiceCallerRestDomain の準備
     */
    @Before
    public void setUpWebServiceCallerRestDomain() {

        setDensoContext("fukui07");

        wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2507");
        wsCallerRestDomain.setAddDensoContext(true);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        wsCallerRestDomain.setParamMap("screenId", getClass().getSimpleName());
    }

    /**
     * テストデータの後処理
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @After
    public void tearDownData() throws ApplicationException {
        
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        
        if ("testTransactOnPrintCml15".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setPltzInstrNo("XXXXXXX");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setPltzInstrNo("MY70710001");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testTransactOnPrintCml17".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MY70425001");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setShipperCd("MY7");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        }
        
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase1-1-1,2
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "");
        wsCallerRestDomain.setParamMap("printerId", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase1-2-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml6() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        wsCallerRestDomain.setParamMap("mainMark", "");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase1-2-2
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml7() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70425001");
        wsCallerRestDomain.setParamMap("mainMark", "");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase1-2-3
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml8() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));

    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase1-2-4
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml9() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        wsCallerRestDomain.setParamMap("mainMark", "");

        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase1-2-5
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml10() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70425001");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase1-2-6
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml11() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70425001");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        wsCallerRestDomain.setParamMap("mainMark", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase1-2-7
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml12() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase1-2-8
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml13() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70425001");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase2-1-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml14() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70710002");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711507100005");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5040"));
    
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase2-2-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml15() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70710001");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711507100004");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5040"));
    
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase2-3-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml16() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "ZZZ");
        wsCallerRestDomain.setParamMap("printerId", "99");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711507100004");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5018"));
    
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase2-4-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml17() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70425001");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5007"));
    
    }
    
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase2-5-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml18() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "ZZZZZZZZZZZZZZZ");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5067"));
    
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * TestCase2-6-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml19() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "ZZZZZZZZZZZZZZZ");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5067"));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase3-1-1
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml20() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70710001");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711507100004");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MY70710001");
        ttPltzInstrCriteria.setSearchCountCheckFlg(false);
        TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.searchByKey(ttPltzInstrCriteria);
        assertThat(ttPltzInstrDomain.getPltzInstrStatus(), is(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT));
        assertThat(ttPltzInstrDomain.getCmlPrintOutDt(), notNullValue());
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase4-1--
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCm21() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase4-2--
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml22() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70425001");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase4-3--
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml23() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase4-4--
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml24() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        wsCallerRestDomain.setParamMap("mainMark", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase4-5--
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml25() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70425001");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        wsCallerRestDomain.setParamMap("mainMark", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase4-6--
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml26() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * TestCase4-7--
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnPrintCml27() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MY70425001");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("errCreateTimestamp", "2014-08-02 18:53:17.81");
        
        // Webサービスを呼び出す
        Ws2507ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    
    }
}
