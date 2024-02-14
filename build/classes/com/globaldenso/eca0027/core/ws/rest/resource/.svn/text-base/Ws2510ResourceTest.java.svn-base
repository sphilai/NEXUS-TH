/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2013/12/25
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest.post;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtXpltzService;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2510ResultDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2510Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 7336 $
 */
@RunWith(Ws25xxResourceTestRunner.class)
public class Ws2510ResourceTest extends AbstractEca0027Test {

    /** WEBサービスの結果タイプ */
    private static final GenericType<Ws2510ResultDomain> RESULT_TYPE = new GenericType<Ws2510ResultDomain>() {};

    /** WebServiceCallerRestDomain オブジェクト */
    private WebServiceCallerRestDomain wsCallerRestDomain;

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2510ResourceTest() {
    }

    /**
     * テスト対象データの準備
     * 
     * TT_PLTZ.XMAIN_MARK を NULL に戻す。
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Before
    public void setUpData() throws ApplicationException {

        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");

        String[] mainMarks = {"DMY711505190001", "DMY711505190002"};
        for (String mainMark : mainMarks) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark(mainMark);
            TtPltzDomain domain = new TtPltzDomain();
            domain.setXmainMark("");
            ttPltzService.updateByCondition(domain, criteria);
        }
        
        if ("testSearchOnPrintXtag3_7".equals(testNameRule.getMethodName())
            || "testSearchOnPrintXtag3_8".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setLoadingCd("X");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_10".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setCmlTyp("X");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_11".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setStgInstrItemFlg("Y");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_12".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setCurWhCompCd("XXX");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_13".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setCurWhCd("XXXX");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_14".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setPltzStatus("XX");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_15".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setLastTrStatus("XX");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_16".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setXmainMark("XXXXXXXXXXXX");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_17".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setMigrationFlg("Y");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtagX_1".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setNetWeight(new BigDecimal("9999999.999"));
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtagX_2".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setGrossWeight(new BigDecimal("9999999.999"));
            ttPltzService.updateByCondition(domain, criteria);
            
        }
    }

    /**
     * WebServiceCallerRestDomain の準備
     */
    @Before
    public void setUpWebServiceCallerRestDomain() {

        setDensoContext("nexus");

        wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2510");
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
        
        if ("testSearchOnPrintXtag3_7".equals(testNameRule.getMethodName())
            || "testSearchOnPrintXtag3_8".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_DOOR);
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_10".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setCmlTyp(Eca0027Constants.CML_TYPE_CIGMA);
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_11".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_N);
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_12".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setCurWhCompCd("MY7");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_13".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setCurWhCd("WH01");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_14".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setPltzStatus(Eca0027Constants.PLTZ_STATUS_PLTZ);
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_15".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setLastTrStatus(Eca0027Constants.LAST_TR_STATUS_BLANK);
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_16".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setXmainMark("");
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtag3_17".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setMigrationFlg(Eca0027Constants.FLAG_N);
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtagX_1".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setNetWeight(new BigDecimal("3000"));
            ttPltzService.updateByCondition(domain, criteria);
            
        } else if ("testSearchOnPrintXtagX_2".equals(testNameRule.getMethodName())) {
            TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
            criteria.setMainMark("DMY711505190001");
            TtPltzDomain domain = new TtPltzDomain();
            domain.setGrossWeight(new BigDecimal("6000"));
            ttPltzService.updateByCondition(domain, criteria);
            
        }
        
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.1.1～1.1.9
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag1_1() throws Exception {
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(9));
        
        int count = 0;
        for (ErrorListItemDomain error : resultDomain.getErrorList()) {
            if ("NXS_E1_5016".equals(error.getErrorCode())) {
                count++;
            }
        }
        assertThat(count, is(9));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag1_2() throws Exception {

        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5005"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag2() throws Exception {
        
        setDensoContext("X");
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5031"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_1() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "XX,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5001"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_2() throws Exception {
        
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzCriteriaDomain criteria = new TtPltzCriteriaDomain();
        criteria.setMainMark("DMY711506170001");
        ttPltzService.lockByKey(criteria);
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711506170001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5004"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.3.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_3() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "XXXXX");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_4() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "X");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.5.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_5() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "XXX");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.6.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_6() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "F");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.7.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_7() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "D");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.8.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_8() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "B");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.9.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_9() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "X");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.10.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_10() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.11.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_11() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5021"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.12.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_12() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5019"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.13.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_13() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5020"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.14.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_14() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5006"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.15.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_15() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5025"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.16.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_16() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5039"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.17.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_17() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5059"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.18.1, 3.19.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag3_18() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "XXXX");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5008"));
        assertThat(resultDomain.getErrorList().get(1).getErrorCode(), is("NXS_E1_5008"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 4.1.1, 4.1.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtag4() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getXMainMarkInfo(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getXMainMarkInfo().getXmainMark()), is(false));
        
        String xmainMark = resultDomain.getXMainMarkInfo().getXmainMark();
        
        TtXpltzService ttXpltzService = (TtXpltzService) getContext().getBean("ttXpltzService");
        TtXpltzCriteriaDomain ttXpltzCriteria = new TtXpltzCriteriaDomain();
        ttXpltzCriteria.setXmainMark(xmainMark);
        ttXpltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttXpltzService.searchCount(ttXpltzCriteria), is(1));
        
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMarkLikeFront("DMY71150519000");
        ttPltzCriteria.setXmainMark(xmainMark);
        ttPltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(2));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (N/W)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtagX_1() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("N/W"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (G/W)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSearchOnPrintXtagX_2() throws Exception {
        
        wsCallerRestDomain.setParamMap("compCd", "MY7");
        wsCallerRestDomain.setParamMap("printerId", "01");
        wsCallerRestDomain.setParamMap("palletNo", "S119");
        wsCallerRestDomain.setParamMap("containerSortingKey", "ZA001001");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("shipToCompCd", "MY7");
        wsCallerRestDomain.setParamMap("loadingCd", "D");
        wsCallerRestDomain.setParamMap("customTimingTyp", "A");
        wsCallerRestDomain.setParamMap("mainMark", "DMY711505190001,DMY711505190002");
        wsCallerRestDomain.setParamMap("outerPkgComCd", "MY7");
        wsCallerRestDomain.setParamMap("outerPkgCd", "7777");
        
        Ws2510ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("G/W"));
    }
}
