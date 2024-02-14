/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest.post;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgMtrlService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2504ResultDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2504Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 11315 $
 */
@RunWith(Ws25xxResourceTestRunner.class)
public class Ws2504ResourceTest extends AbstractEca0027Test {

    /** WEBサービスの結果タイプ */
    private static final GenericType<Ws2504ResultDomain> RESULT_TYPE = new GenericType<Ws2504ResultDomain>() {};

    /** WebServiceCallerRestDomain オブジェクト */
    private WebServiceCallerRestDomain wsCallerRestDomain;

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2504ResourceTest() {
    }

    /**
     * テストデータの準備
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Before
    public void setUpData() throws ApplicationException {
        
        TmCigmaEnvService tmCigmaEnvService = (TmCigmaEnvService) getContext().getBean("tmCigmaEnvService");
        TmPkgMtrlService tmPkgMtrlService = (TmPkgMtrlService) getContext().getBean("tmPkgMtrlService");
        
        if ("testTransactOnErtPltz2".equals(testNameRule.getMethodName())) {
            TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
            criteria.setCompCd("MY7");
            TmCigmaEnvDomain domain = new TmCigmaEnvDomain();
            domain.setAccessibilityTyp(Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NA);
            tmCigmaEnvService.updateByCondition(domain, criteria);
            
        } else if ("testTransactOnErtPltz4_9".equals(testNameRule.getMethodName())) {
            TmPkgMtrlCriteriaDomain criteria = new TmPkgMtrlCriteriaDomain();
            criteria.setOwnerComp("MY7");
            criteria.setPkgItemNo("PKGITEMENO001");
            TmPkgMtrlDomain domain = new TmPkgMtrlDomain();
            domain.setRtTyp(Eca0027Constants.RT_TYP_1WAY);
            //tmPkgMtrlService.updateByCondition(domain, criteria);
            
        } else if ("testTransactOnErtPltz4_10".equals(testNameRule.getMethodName())) {
            TmPkgMtrlCriteriaDomain criteria = new TmPkgMtrlCriteriaDomain();
            criteria.setOwnerComp("MY7");
            criteria.setPkgItemNo("PKGITEMENO001");
            TmPkgMtrlDomain domain = new TmPkgMtrlDomain();
            domain.setCurrCd("XXX");
            //tmPkgMtrlService.updateByCondition(domain, criteria);
            
        }
    }

    /**
     * WebServiceCallerRestDomain の準備
     */
    @Before
    public void setUpWebServiceCallerRestDomain() {

        setDensoContext("fukui07", new Locale("en"));

        wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2504");
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
        
        TmCigmaEnvService tmCigmaEnvService = (TmCigmaEnvService) getContext().getBean("tmCigmaEnvService");
        TmPkgMtrlService tmPkgMtrlService = (TmPkgMtrlService) getContext().getBean("tmPkgMtrlService");
        
        if ("testTransactOnErtPltz2".equals(testNameRule.getMethodName())) {
            TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
            criteria.setCompCd("MY7");
            TmCigmaEnvDomain domain = new TmCigmaEnvDomain();
            domain.setAccessibilityTyp(Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL);
            tmCigmaEnvService.updateByCondition(domain, criteria);
            
        } else if ("testTransactOnErtPltz4_9".equals(testNameRule.getMethodName())) {
            TmPkgMtrlCriteriaDomain criteria = new TmPkgMtrlCriteriaDomain();
            criteria.setOwnerComp("MY7");
            criteria.setPkgItemNo("PKGITEMENO001");
            TmPkgMtrlDomain domain = new TmPkgMtrlDomain();
            domain.setRtTyp(Eca0027Constants.RT_TYP_GLOBAL);
            //tmPkgMtrlService.updateByCondition(domain, criteria);
            
        } else if ("testTransactOnErtPltz4_10".equals(testNameRule.getMethodName())) {
            TmPkgMtrlCriteriaDomain criteria = new TmPkgMtrlCriteriaDomain();
            criteria.setOwnerComp("MY7");
            criteria.setPkgItemNo("PKGITEMENO001");
            TmPkgMtrlDomain domain = new TmPkgMtrlDomain();
            domain.setCurrCd("002");
            //tmPkgMtrlService.updateByCondition(domain, criteria);
            
        }
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.1.1～1.1.21
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz1() throws Exception {
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(21));
        
        int count = 0;
        for (ErrorListItemDomain error : resultDomain.getErrorList()) {
            if ("NXS_E1_5016".equals(error.getErrorCode())) {
                count++;
            }
        }
        assertThat(count, is(21));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5062"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz3() throws Exception {
        
        setDensoContext("X", new Locale("en"));
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5031"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.1.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "XX");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5041"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "XX");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5042"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.3.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_3() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "XX");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5043"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_4() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "XXX");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5066"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.5.1, 4.5.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "XXXXX");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5044"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5050"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.6.1～4.6.3
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_6() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "XX");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5056"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.6.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_6_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "XX");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5057"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.6.3
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_6_3() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "XX");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5058"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.7.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_7() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WHXX");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("GSCM_E0_0029"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.8.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_8() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "XX");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5009"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.9.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_9() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5046"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.10.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_10() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5047"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.11.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_11() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5048"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.12.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz4_12() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "XX");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5017"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 5.1, 5.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltz5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "5,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getRegistCmlList().size(), is(1));
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getRegistCmlList().get(0).getMainMark()), is(false));
        
        String mainMark = resultDomain.getRegistCmlList().get(0).getMainMark();
        
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMark(mainMark);
        ttPltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
        
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteria.setMainMark(mainMark);
        ttPltzItemCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(2));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 桁あふれ (N/W)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltzX_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "MY7");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "999999,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("N/W"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: CIGMA夜間バッチ中チェック
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testTransactOnErtPltzZ_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "XXX");
        wsCallerRestDomain.setParamMap("shipToCd", "MA000");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("payTerms", "C");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("whCompCd", "MY7");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("priceTerms", "FOB");
        wsCallerRestDomain.setParamMap("returnStyleCd", "1");
        wsCallerRestDomain.setParamMap("cmlCreateQty", "1");
        wsCallerRestDomain.setParamMap("weightUnit", "KG");
        wsCallerRestDomain.setParamMap("grossWeight", "1000");
        wsCallerRestDomain.setParamMap("lengthUnit", "MR");
        wsCallerRestDomain.setParamMap("length", "1");
        wsCallerRestDomain.setParamMap("width", "1");
        wsCallerRestDomain.setParamMap("height", "1");
        wsCallerRestDomain.setParamMap("volumeUnit", "LT");
        wsCallerRestDomain.setParamMap("volume", "10");
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO001,PKGITEMENO002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,3");
        
        // Webサービスを呼び出す
        Ws2504ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5062"));
    }

}
