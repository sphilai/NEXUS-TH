/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest.put;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkDtlIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwCaseMarkHdrIfCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkDtlIfService;
import com.globaldenso.eca0027.core.auto.business.service.TwCaseMarkHdrIfService;
import com.globaldenso.eca0027.core.business.domain.WsR001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001MigrationCaseMarkRootCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001migrationCaseMarkDetailItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsR001migrationCaseMarkItemCriteriaDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.eca0027.core.common.util.XmlUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />WsR001Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 9131 $
 */
@RunWith(Ws25xxResourceTestRunner.class)
public class WsR001ResourceTest extends AbstractEca0027Test {

    /** WEBサービスの結果タイプ */
    private static final GenericType<WsR001ResultDomain> RESULT_TYPE = new GenericType<WsR001ResultDomain>() {};
    
    /** TtCmlErrorHeaderDomain リストのコンパレータ */
    private static final Comparator<TtCmlErrorHeaderDomain> ERROR_HEADER_COMPARATOR = new Comparator<TtCmlErrorHeaderDomain>() {
        public int compare(TtCmlErrorHeaderDomain o1, TtCmlErrorHeaderDomain o2) {
            return o1.getErrCreateTimestamp().compareTo(o2.getErrCreateTimestamp());
        }
    };

    /** WebServiceCallerRestDomain オブジェクト */
    private WebServiceCallerRestDomain wsCallerRestDomain;

    /** テスト開始日時 */
    private Timestamp startTimestamp;

    /**
     * <br />デフォルトコンストラクタ
     */
    public WsR001ResourceTest() {
    }

    /**
     * テストデータの準備
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Before
    public void setUpData() throws ApplicationException {
        
        TwCaseMarkHdrIfService twCaseMarkHdrIfService = (TwCaseMarkHdrIfService) getContext().getBean("twCaseMarkHdrIfService");
        TwCaseMarkDtlIfService twCaseMarkDtlIfService = (TwCaseMarkDtlIfService) getContext().getBean("twCaseMarkDtlIfService");
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService = (TmExpItemNoSpInfoService) getContext().getBean("tmExpItemNoSpInfoService");
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        TmCigmaWhXrefService tmCigmaWhXrefService = (TmCigmaWhXrefService) getContext().getBean("tmCigmaWhXrefService");
        
        TwCaseMarkHdrIfCriteriaDomain twCaseMarkHdrIfCriteria = new TwCaseMarkHdrIfCriteriaDomain();
        twCaseMarkHdrIfCriteria.setSearchCountCheckFlg(false);
        if (twCaseMarkHdrIfService.searchCount(twCaseMarkHdrIfCriteria) > 0) {
            twCaseMarkHdrIfService.deleteByCondition(twCaseMarkHdrIfCriteria);
        }
        
        TwCaseMarkDtlIfCriteriaDomain twCaseMarkDtlIfCriteria = new TwCaseMarkDtlIfCriteriaDomain();
        twCaseMarkDtlIfCriteria.setSearchCountCheckFlg(false);
        if (twCaseMarkDtlIfService.searchCount(twCaseMarkDtlIfCriteria) > 0) {
            twCaseMarkDtlIfService.deleteByCondition(twCaseMarkDtlIfCriteria);
        }
        
        TmExpItemNoSpInfoCriteriaDomain tmExpItemNoSpInfoCriteria = new TmExpItemNoSpInfoCriteriaDomain();
        tmExpItemNoSpInfoCriteria.setCompCd("MYB");
        tmExpItemNoSpInfoCriteria.setItemNo("A002TB0091B03N");
        tmExpItemNoSpInfoCriteria.setPkgCd(" ");
        tmExpItemNoSpInfoCriteria.setCustomerCd("30001206");
        tmExpItemNoSpInfoCriteria.setLgcyShipTo("00");
        
        TmExpFormalitiItemNoCriteriaDomain tmExpFormalitiItemNoCriteria = new TmExpFormalitiItemNoCriteriaDomain();
        tmExpFormalitiItemNoCriteria.setCompCd("MYB");
        tmExpFormalitiItemNoCriteria.setItemNo("A002TB0091B03N");
        
        if ("testSetPalletizeInfo2_2_3".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setInvoiceKey("XXX");
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_4".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerSortingKey("XXXXX");
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_6".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_BACK);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_7".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_Y);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_8".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerLooseTyp(Eca0027Constants.CONTAINER_LOOSE_TYP_L);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_9".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setCustomTimingTyp(Eca0027Constants.CUSTOM_TYMING_TYP_Z);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_12".equals(testNameRule.getMethodName())) {
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("a002TB0091B03N");
            tmExpFormalitiItemNoService.updateByCondition(domain, tmExpFormalitiItemNoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_13".equals(testNameRule.getMethodName())) {
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("a002TB0091B03N");
            tmExpFormalitiItemNoService.updateByCondition(domain, tmExpFormalitiItemNoCriteria);
            
        } else if ("testSetPalletizeInfo3_2_1".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_FREE);
            
            String[] itemNos = {"A002TB0091B03N", "A002TB0091B06N", "A002TB0091B07N"};
            for (String itemNo : itemNos) {
                tmExpItemNoSpInfoCriteria.setItemNo(itemNo);
                tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            }
            
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_BACK);
            tmExpItemNoSpInfoCriteria.setItemNo("A002TB0091B05N");
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
            TmExpFormalitiItemNoDomain tmExpFormalitiItemNoDomain = new TmExpFormalitiItemNoDomain();
            tmExpFormalitiItemNoDomain.setExpLimitTyp("");
            
            String[] itemNos2 = {"A002TB0091B04N", "A002TB0091B05N", "A002TB0091B06N", "A002TB0091B07N"};
            for (String itemNo : itemNos2) {
                tmExpFormalitiItemNoCriteria.setItemNo(itemNo);
                tmExpFormalitiItemNoService.updateByCondition(tmExpFormalitiItemNoDomain, tmExpFormalitiItemNoCriteria);
            }
            
            tmExpFormalitiItemNoDomain.setExpLimitTyp("L001");
            tmExpFormalitiItemNoDomain.setDngrItemFlg(Eca0027Constants.FLAG_Y);
            tmExpFormalitiItemNoCriteria.setItemNo("A002TB0091B03N");
            tmExpFormalitiItemNoService.updateByCondition(tmExpFormalitiItemNoDomain, tmExpFormalitiItemNoCriteria);
            
        } else if ("testSetPalletizeInfo3_2_5".equals(testNameRule.getMethodName())) {
            TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteria = new TmCigmaWhXrefCriteriaDomain();
            tmCigmaWhXrefCriteria.setLgcyLibCompCd("MYB");
            tmCigmaWhXrefCriteria.setLgcyWhCd("1");
            tmCigmaWhXrefCriteria.setPlntCd("M1");
            TmCigmaWhXrefDomain tmCigmaWhXrefDomain = tmCigmaWhXrefService.searchByKey(tmCigmaWhXrefCriteria);
            tmCigmaWhXrefDomain.setLgcyWhCd("9");
            tmCigmaWhXrefDomain.setPlntCd("99");
            tmCigmaWhXrefService.create(tmCigmaWhXrefDomain);
            
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_FREE);
            
            String[] itemNos = {"A002TB0091B03N", "A002TB0091B04N", "A002TB0091B05N"};
            for (String itemNo : itemNos) {
                tmExpItemNoSpInfoCriteria.setItemNo(itemNo);
                tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            }
            
        }
        
    }
    
    /**
     * WebServiceCallerRestDomain の準備
     */
    @Before
    public void setUpWebServiceCallerRestDomain() {
        
        wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/wsr001");
        wsCallerRestDomain.setAddDensoContext(false);
        wsCallerRestDomain.setUserName("bht");
        wsCallerRestDomain.setPassword("bht");
        
        startTimestamp = new Timestamp(new Date().getTime());
    }
    
    /**
     * テストデータの後処理
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @After
    public void tearDownData() throws ApplicationException {
        
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService = (TmExpItemNoSpInfoService) getContext().getBean("tmExpItemNoSpInfoService");
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        TmCigmaWhXrefService tmCigmaWhXrefService = (TmCigmaWhXrefService) getContext().getBean("tmCigmaWhXrefService");
        
        TmExpItemNoSpInfoCriteriaDomain tmExpItemNoSpInfoCriteria = new TmExpItemNoSpInfoCriteriaDomain();
        tmExpItemNoSpInfoCriteria.setCompCd("MYB");
        tmExpItemNoSpInfoCriteria.setItemNo("A002TB0091B03N");
        tmExpItemNoSpInfoCriteria.setPkgCd(" ");
        tmExpItemNoSpInfoCriteria.setCustomerCd("30001206");
        tmExpItemNoSpInfoCriteria.setLgcyShipTo("00");
        
        TmExpFormalitiItemNoCriteriaDomain tmExpFormalitiItemNoCriteria = new TmExpFormalitiItemNoCriteriaDomain();
        tmExpFormalitiItemNoCriteria.setCompCd("MYB");
        tmExpFormalitiItemNoCriteria.setItemNo("A002TB0091B03N");
        
        if ("testSetPalletizeInfo2_2_3".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setInvoiceKey("NMY");
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_4".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerSortingKey("ZA001001");
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_6".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_DOOR);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_7".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_N);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_8".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerLooseTyp(Eca0027Constants.CONTAINER_LOOSE_TYP_C);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_9".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setCustomTimingTyp(Eca0027Constants.CUSTOM_TYMING_TYP_A);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_12".equals(testNameRule.getMethodName())) {
            tmExpFormalitiItemNoCriteria.setItemNo("a002TB0091B03N");
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("A002TB0091B03N");
            tmExpFormalitiItemNoService.updateByCondition(domain, tmExpFormalitiItemNoCriteria);
            
        } else if ("testSetPalletizeInfo2_2_13".equals(testNameRule.getMethodName())) {
            tmExpFormalitiItemNoCriteria.setItemNo("a002TB0091B03N");
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("A002TB0091B03N");
            tmExpFormalitiItemNoService.updateByCondition(domain, tmExpFormalitiItemNoCriteria);
            
        } else if ("testSetPalletizeInfo3_2_1".equals(testNameRule.getMethodName())) {
            tmExpItemNoSpInfoCriteria.setItemNo(null);
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_DOOR);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
            TmExpFormalitiItemNoDomain tmExpFormalitiItemNoDomain = new TmExpFormalitiItemNoDomain();
            tmExpFormalitiItemNoDomain.setDngrItemFlg(Eca0027Constants.FLAG_N);
            tmExpFormalitiItemNoDomain.setExpLimitTyp("L001");
            
            String[] itemNos2 = {"A002TB0091B03N", "A002TB0091B04N", "A002TB0091B05N", "A002TB0091B06N", "A002TB0091B07N"};
            for (String itemNo : itemNos2) {
                tmExpFormalitiItemNoCriteria.setItemNo(itemNo);
                tmExpFormalitiItemNoService.updateByCondition(tmExpFormalitiItemNoDomain, tmExpFormalitiItemNoCriteria);
            }
            
        } else if ("testSetPalletizeInfo3_2_5".equals(testNameRule.getMethodName())) {
            TmCigmaWhXrefCriteriaDomain tmCigmaWhXrefCriteria = new TmCigmaWhXrefCriteriaDomain();
            tmCigmaWhXrefCriteria.setLgcyLibCompCd("MYB");
            tmCigmaWhXrefCriteria.setLgcyWhCd("9");
            tmCigmaWhXrefCriteria.setPlntCd("99");
            tmCigmaWhXrefCriteria.setSearchCountCheckFlg(false);
            if (tmCigmaWhXrefService.searchCount(tmCigmaWhXrefCriteria) > 0) {
                tmCigmaWhXrefService.deleteByCondition(tmCigmaWhXrefCriteria);
            }
            
            tmExpItemNoSpInfoCriteria.setItemNo(null);
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_DOOR);
            tmExpItemNoSpInfoService.updateByCondition(domain, tmExpItemNoSpInfoCriteria);
            
        }
        
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.1, 2.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_1() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        // Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(2);
        root.getMigrationCaseMarkItemList().get(0).setShipTo("XX");
        root.getMigrationCaseMarkItemList().get(1).setShipTo("XX");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(2);
        assertCountTwCaseMarkDtlIf(4);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 2);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 0);
        assertThat(ttCmlErrorHeaderDomain.getChkResultA(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.2, 2.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_2() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        // Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(2);
        root.getMigrationCaseMarkItemList().get(0).setCustomerNo("XXXXXXX");
        root.getMigrationCaseMarkItemList().get(1).setCustomerNo("XXXXXXX");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(2);
        assertCountTwCaseMarkDtlIf(4);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 2);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 0);
        assertThat(ttCmlErrorHeaderDomain.getChkResultB(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.3, 2.1.4, 2.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_3() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        // Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(2);
        root.getMigrationCaseMarkItemList().get(0).setWhCd("X");
        root.getMigrationCaseMarkItemList().get(1).setWhCd("X");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(2);
        assertCountTwCaseMarkDtlIf(4);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 2);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 0);
        assertThat(ttCmlErrorHeaderDomain.getChkResultC(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_2() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        WsR001migrationCaseMarkItemCriteriaDomain item = root.getMigrationCaseMarkItemList().get(0);
        item.setMultiPartNoFlg("N");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultE(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.3
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_3() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultF(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.4
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_4() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultG(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.5
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_5() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        WsR001migrationCaseMarkItemCriteriaDomain item = root.getMigrationCaseMarkItemList().get(0);
        WsR001migrationCaseMarkDetailItemCriteriaDomain detail = item.getMigrationCaseMarkDetailItemList().get(0);
        detail.setCurrencyCd("XXX");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultH(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.6
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_6() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultI(), is("NG"));
    }
    
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.7
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_7() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultJ(), is("NG"));
    }
    
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.8
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_8() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultK(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.9
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_9() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultL(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.10
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_10() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        WsR001migrationCaseMarkItemCriteriaDomain item = root.getMigrationCaseMarkItemList().get(0);
        item.setMultiPartNoFlg("N");
        item.getMigrationCaseMarkDetailItemList().remove(1);
        WsR001migrationCaseMarkDetailItemCriteriaDomain detail = item.getMigrationCaseMarkDetailItemList().get(0);
        detail.setShipLotQty("10");
        detail.setAllocQty("20");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(1);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 1);
        assertThat(ttCmlErrorHeaderDomain.getChkResultO(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.11
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_11() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        WsR001migrationCaseMarkItemCriteriaDomain item = root.getMigrationCaseMarkItemList().get(0);
        WsR001migrationCaseMarkDetailItemCriteriaDomain detail = item.getMigrationCaseMarkDetailItemList().get(0);
        detail.setCurrencyCd("");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.12
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_12() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.13
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_13() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(1);
        assertCountTwCaseMarkDtlIf(2);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 2);
        assertThat(ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.1, 3.1.4
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_1() throws Exception {
        
        // データ登録 CMLエラーレポートヘッダ登録(パレタイズチェックでNGが存在する場合に実施)
        //Tables: TT_CML_ERROR_HEADER
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(2);
        root.getMigrationCaseMarkItemList().get(0).setShipTo("XX");
        root.getMigrationCaseMarkItemList().get(1).setCustomerNo("XXXXXXX");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(2);
        assertCountTwCaseMarkDtlIf(4);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 2);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 0);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain2 = ttCmlErrorHeaderDomainList.get(1);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain2.getErrCreateTimestamp(), 0);
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.2, 3.1.4
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_2() throws Exception {
        
        // データ登録 CMLエラーレポート明細登録(明細情報チェックでNGが存在する場合に実施)
        // Tables: TT_CML_ERROR_DTL
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(2);
        WsR001migrationCaseMarkItemCriteriaDomain item = root.getMigrationCaseMarkItemList().get(0);
        item.setMultiPartNoFlg("N");
        item.getMigrationCaseMarkDetailItemList().remove(1);
        WsR001migrationCaseMarkDetailItemCriteriaDomain detail = item.getMigrationCaseMarkDetailItemList().get(0);
        detail.setShipLotQty("10");
        detail.setAllocQty("20");
        WsR001migrationCaseMarkItemCriteriaDomain item2 = root.getMigrationCaseMarkItemList().get(1);
        WsR001migrationCaseMarkDetailItemCriteriaDomain detail2 = item2.getMigrationCaseMarkDetailItemList().get(0);
        detail2.setCurrencyCd("XXX");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(2);
        assertCountTwCaseMarkDtlIf(3);
        
        List<TtCmlErrorHeaderDomain> ttCmlErrorHeaderDomainList = assertCountTtCmlErrorHeader(startTimestamp, 2);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = ttCmlErrorHeaderDomainList.get(0);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain.getErrCreateTimestamp(), 1);
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain2 = ttCmlErrorHeaderDomainList.get(1);
        assertCountTtCmlErrorDtl(ttCmlErrorHeaderDomain2.getErrCreateTimestamp(), 2);
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.3
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_3() throws Exception {
        
        // Tables: None
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(1);
        root.getMigrationCaseMarkItemList().get(0).setShipTo("XX");
        root.getMigrationCaseMarkItemList().get(0).setPlantCd("XX");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).startsWith("No data found"), is(true));
        
        assertCountTwCaseMarkHdrIf(0);
        assertCountTwCaseMarkDtlIf(0);
        
        assertCountTtCmlErrorHeader(startTimestamp, 0);
    }
    
    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 3.2.x (3.2.5 以外), 1.1.1, 1.1.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_1() throws Exception {
        
        // データ登録 パレタイズ登録 (パレタイズチェックでNGが存在しない場合)
        // Tables: TT_PLTZ
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(2);
        WsR001migrationCaseMarkItemCriteriaDomain item1 = root.getMigrationCaseMarkItemList().get(0);
        item1.getMigrationCaseMarkDetailItemList().get(0).setEtdDueDt("20140801");
        WsR001migrationCaseMarkItemCriteriaDomain item2 = root.getMigrationCaseMarkItemList().get(1);
        addDetailItemCriteriaDomain(item2, prepareDetailItemCriteriaDomain("A002TB0091B05N"));
        item2.getMigrationCaseMarkDetailItemList().get(0).setPartNo("A002TB0091B06N");
        item2.getMigrationCaseMarkDetailItemList().get(1).setPartNo("A002TB0091B07N");
        item2.getMigrationCaseMarkDetailItemList().get(1).setEtdDueDt("20140720");
        item2.getMigrationCaseMarkDetailItemList().get(2).setEtdDueDt("20140810");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        
        assertCountTwCaseMarkHdrIf(2);
        assertCountTwCaseMarkDtlIf(5);
        
        assertCountTtCmlErrorHeader(startTimestamp, 0);
        
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
        
        String[] expectedLoadingCds = {"D", "B"};
        String[] expectedExpLimitFlgs = {"Y", "N"};
        String[] expectedDngrItemFlgs = {"Y", "N"};
        for (int i = 0; i < root.getMigrationCaseMarkItemList().size(); i++) {
            WsR001migrationCaseMarkItemCriteriaDomain domain = root.getMigrationCaseMarkItemList().get(i);
            String mainMark = domain.getMainMark();
            int detailCount = domain.getMigrationCaseMarkDetailItemList().size();
            
            // 3.2.1
            TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
            ttPltzCriteria.setMainMark(mainMark);
            ttPltzCriteria.setSearchCountCheckFlg(false);
            TtPltzDomain ttPltzDomain = ttPltzService.searchByKey(ttPltzCriteria);
            assertThat(mainMark, ttPltzDomain, notNullValue());
            
            // 3.2.2
            TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
            ttPltzItemCriteria.setMainMark(mainMark);
            ttPltzItemCriteria.setSearchCountCheckFlg(false);
            assertThat(mainMark, ttPltzItemService.searchCount(ttPltzItemCriteria), is(detailCount));
            
            // 3.2.3
            TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
            ttPltzItemOdrCriteria.setMainMark(mainMark);
            ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
            assertThat(mainMark, ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(detailCount));
            
            // 3.2.4
            assertThat(mainMark, DateUtil.formatDate(ttPltzDomain.getDueDt(), "yyyy/MM/dd"), is(getDueDate(domain)));
            
            // おまけ
            assertThat(mainMark, ttPltzDomain.getLoadingCd(), is(expectedLoadingCds[i]));
            assertThat(mainMark, ttPltzDomain.getExpLimitFlg(), is(expectedExpLimitFlgs[i]));
            assertThat(mainMark, ttPltzDomain.getDngrItemFlg(), is(expectedDngrItemFlgs[i]));
        }
    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.2.x, 1.1.1, 1.1.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_5() throws Exception {
        
        //Tables: None
        
        // パラメータを設定する
        WsR001MigrationCaseMarkRootCriteriaDomain root = prepareRootCriteriaDomain(2);
        WsR001migrationCaseMarkItemCriteriaDomain item1 = root.getMigrationCaseMarkItemList().get(0);
        item1.setPlantCd("99");
        item1.setWhCd("9");
        WsR001migrationCaseMarkItemCriteriaDomain item2 = root.getMigrationCaseMarkItemList().get(1);
        addDetailItemCriteriaDomain(item2, prepareDetailItemCriteriaDomain("A002TB0091B05N"));
        item2.getMigrationCaseMarkDetailItemList().get(1).setEtdDueDt("20140810");
        item2.getMigrationCaseMarkDetailItemList().get(2).setEtdDueDt("20140801");
        
        String xml = XmlUtil.marshal(root);
        wsCallerRestDomain.setParamMap("wsR001Criteria", xml);
        
        // Webサービスを呼び出す
        WsR001ResultDomain resultDomain = put(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).startsWith("No data found"), is(true));
        
        assertCountTwCaseMarkHdrIf(0);
        assertCountTwCaseMarkDtlIf(0);
        
        assertCountTtCmlErrorHeader(startTimestamp, 0);
        
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
        
        for (int i = 0; i < root.getMigrationCaseMarkItemList().size(); i++) {
            WsR001migrationCaseMarkItemCriteriaDomain domain = root.getMigrationCaseMarkItemList().get(i);
            String mainMark = domain.getMainMark();
            
            // 3.2.1
            TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
            ttPltzCriteria.setMainMark(mainMark);
            ttPltzCriteria.setSearchCountCheckFlg(false);
            TtPltzDomain ttPltzDomain = ttPltzService.searchByKey(ttPltzCriteria);
            assertThat(mainMark, ttPltzDomain, nullValue());
            
            // 3.2.2
            TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
            ttPltzItemCriteria.setMainMark(mainMark);
            ttPltzItemCriteria.setSearchCountCheckFlg(false);
            assertThat(mainMark, ttPltzItemService.searchCount(ttPltzItemCriteria), is(0));
            
            // 3.2.3
            TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
            ttPltzItemOdrCriteria.setMainMark(mainMark);
            ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
            assertThat(mainMark, ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(0));
        }
    }



    /**
     * 
     * <br />TT_CML_ERROR_HEADER の件数をチェックする。
     *
     * @param startTimestamp テスト開始日時
     * @param expectedCount 期待値
     * @return TtCmlErrorHeaderDomain のリスト
     * @throws Exception エラーが発生した場合
     */
    private List<TtCmlErrorHeaderDomain> assertCountTtCmlErrorHeader(Timestamp startTimestamp, int expectedCount) throws Exception {
        
        TtCmlErrorHeaderService ttCmlErrorHeaderService = (TtCmlErrorHeaderService) getContext().getBean("ttCmlErrorHeaderService");
        TtCmlErrorHeaderCriteriaDomain criteria = new TtCmlErrorHeaderCriteriaDomain();
        criteria.setDscId(Eca0027Constants.MIGRATION_DSCID);
        criteria.setPreferredOrder("ERR_CREATE_TIMESTAMP desc");
        criteria.setSearchCountCheckFlg(false);
        List<TtCmlErrorHeaderDomain> searchList = ttCmlErrorHeaderService.searchByCondition(criteria);
        List<TtCmlErrorHeaderDomain> resultList = new ArrayList<TtCmlErrorHeaderDomain>();
        
        for (TtCmlErrorHeaderDomain domain : searchList) {
            if (startTimestamp.compareTo(domain.getErrCreateTimestamp()) < 0) {
                resultList.add(domain);
            } else {
                break;
            }
        }
        
        assertThat(resultList.size(), is(expectedCount));
        
        Collections.sort(resultList, ERROR_HEADER_COMPARATOR);
        
        return resultList;
    }
    
    /**
     * 
     * <br />TT_CML_ERROR_DTL の件数をチェックする。
     *
     * @param errCreateTimestamp エラー作成日時
     * @param expectedCount 期待値
     * @throws Exception エラーが発生した場合
     */
    private void assertCountTtCmlErrorDtl(Timestamp errCreateTimestamp, int expectedCount) throws Exception {
        
        TtCmlErrorDtlService ttCmlErrorDtlService = (TtCmlErrorDtlService) getContext().getBean("ttCmlErrorDtlService");
        TtCmlErrorDtlCriteriaDomain ttCmlErrorDtlCriteria = new TtCmlErrorDtlCriteriaDomain();
        ttCmlErrorDtlCriteria.setDscId(Eca0027Constants.MIGRATION_DSCID);
        ttCmlErrorDtlCriteria.setErrCreateTimestamp(errCreateTimestamp);
        ttCmlErrorDtlCriteria.setSearchCountCheckFlg(false);
        assertThat(errCreateTimestamp.toString(), ttCmlErrorDtlService.searchCount(ttCmlErrorDtlCriteria), is(expectedCount));
    }
    
    /**
     * 
     * <br />TW_CASE_MARK_HDR_IF の件数をチェックする。
     *
     * @param expectedCount 期待値
     * @throws Exception エラーが発生した場合
     */
    private void assertCountTwCaseMarkHdrIf(int expectedCount) throws Exception {
        
        TwCaseMarkHdrIfService twCaseMarkHdrIfService = (TwCaseMarkHdrIfService) getContext().getBean("twCaseMarkHdrIfService");
        TwCaseMarkHdrIfCriteriaDomain criteria = new TwCaseMarkHdrIfCriteriaDomain();
        criteria.setSearchCountCheckFlg(false);
        assertThat(twCaseMarkHdrIfService.searchCount(criteria), is(expectedCount));
    }
    
    /**
     * 
     * <br />TW_CASE_MARK_DTL_IF の件数をチェックする。
     *
     * @param expectedCount 期待値
     * @throws Exception エラーが発生した場合
     */
    private void assertCountTwCaseMarkDtlIf(int expectedCount) throws Exception {
        
        TwCaseMarkDtlIfService twCaseMarkDtlIfService = (TwCaseMarkDtlIfService) getContext().getBean("twCaseMarkDtlIfService");
        TwCaseMarkDtlIfCriteriaDomain criteria = new TwCaseMarkDtlIfCriteriaDomain();
        criteria.setSearchCountCheckFlg(false);
        assertThat(twCaseMarkDtlIfService.searchCount(criteria), is(expectedCount));
    }
    
    /**
     * 
     * <br />WsR001MigrationCaseMarkRootCriteriaDomain を準備する。
     *
     * @param itemCount WsR001migrationCaseMarkItemCriteriaDomain の個数
     * @return WsR001MigrationCaseMarkRootCriteriaDomain
     */
    private WsR001MigrationCaseMarkRootCriteriaDomain prepareRootCriteriaDomain(int itemCount) {
        
        WsR001MigrationCaseMarkRootCriteriaDomain domain = new WsR001MigrationCaseMarkRootCriteriaDomain();
        List<WsR001migrationCaseMarkItemCriteriaDomain> itemList = new ArrayList<WsR001migrationCaseMarkItemCriteriaDomain>();
        
        domain.setShipperCd("MYB");
        domain.setMigrationCaseMarkItemList(itemList);
        
        String mainMarkPrefix = String.format("%s-%s-", "MIG", DateUtil.formatDate(new Date(), "yyMMddHHmmss"));
        for (int i = 1; i <= itemCount; i++ ) {
            itemList.add(prepareItemCriteriaDomain(mainMarkPrefix + i));
        }
        
        return domain;
    }
    
    /**
     * 
     * <br />WsR001migrationCaseMarkItemCriteriaDomain を準備する。
     *
     * @param mainMark Main mark
     * @return WsR001migrationCaseMarkItemCriteriaDomain
     */
    private WsR001migrationCaseMarkItemCriteriaDomain prepareItemCriteriaDomain(String mainMark) {
        
        WsR001migrationCaseMarkItemCriteriaDomain domain = new WsR001migrationCaseMarkItemCriteriaDomain();
        List<WsR001migrationCaseMarkDetailItemCriteriaDomain> detailItemList = new ArrayList<WsR001migrationCaseMarkDetailItemCriteriaDomain>();
        
        domain.setMainMark(mainMark);
        domain.setPalletNo("P1");
        domain.setCustomerNo("30001206");
        domain.setShipTo("00");
        domain.setTrnsWayCd("S");
        domain.setPlantCd("M1");
        domain.setWhCd("1");
        domain.setMultiPartNoFlg("Y");
        domain.setNetWeight("100");
        domain.setGrossWeight("200");
        domain.setVolume("300");
        domain.setContainerGroupCd("C");
        domain.setMigrationCaseMarkDetailItemList(detailItemList);
        
        detailItemList.add(prepareDetailItemCriteriaDomain("A002TB0091B03N"));
        detailItemList.add(prepareDetailItemCriteriaDomain("A002TB0091B04N"));
        
        return domain;
    }
    
    /**
     * 
     * <br />WsR001migrationCaseMarkDetailItemCriteriaDomain を準備する。
     *
     * @param partNo 品番
     * @return WsR001migrationCaseMarkDetailItemCriteriaDomain
     */
    private WsR001migrationCaseMarkDetailItemCriteriaDomain prepareDetailItemCriteriaDomain(String partNo) {
        
        WsR001migrationCaseMarkDetailItemCriteriaDomain domain = new WsR001migrationCaseMarkDetailItemCriteriaDomain();
        
        domain.setPartNo(partNo);
        domain.setEtdDueDt("20140820");
        domain.setCustomerPoNo("CUSTPO");
        domain.setCustomerPartNo("CUST");
        domain.setCustomerPartNoOrg("CUSTORG");
        domain.setOdrCtrlNo("1");
        domain.setAllocQty("60");
        domain.setMeasureUnit("mu");
        domain.setItemWeight("50");
        domain.setShipLotQty("10");
        domain.setPlantCd("P");
        domain.setCurrencyCd("YEN");
        
        return domain;
    }
    
    /**
     * 
     * <br />WsR001migrationCaseMarkDetailItemCriteriaDomain を追加する。
     *
     * @param itemDomain WsR001migrationCaseMarkItemCriteriaDomain
     * @param detailDomain WsR001migrationCaseMarkDetailItemCriteriaDomain
     */
    @SuppressWarnings("unchecked")
    private void addDetailItemCriteriaDomain(
        WsR001migrationCaseMarkItemCriteriaDomain itemDomain,
        WsR001migrationCaseMarkDetailItemCriteriaDomain detailDomain) {
        
        List<WsR001migrationCaseMarkDetailItemCriteriaDomain> itemDomainList =
            (List<WsR001migrationCaseMarkDetailItemCriteriaDomain>) itemDomain.getMigrationCaseMarkDetailItemList();
        itemDomainList.add(detailDomain);
    }
    
    /**
     * 
     * <br />最も早いETDを取得する。
     * 
     * @param domain WsR001migrationCaseMarkItemCriteriaDomain
     * @return 最も早いETD
     */
    private String getDueDate(WsR001migrationCaseMarkItemCriteriaDomain domain) {
        
        if (domain.getMigrationCaseMarkDetailItemList() == null) {
            return null;
        }
        
        Date dueDate = null;
        
        for (WsR001migrationCaseMarkDetailItemCriteriaDomain detail : domain.getMigrationCaseMarkDetailItemList()) {
            Date date = DateUtil.parseDate(detail.getEtdDueDt(), Eca0027Constants.WS_CIGMA_DATE_FORMAT);
            if (dueDate == null) {
                dueDate = date;
            } else if (dueDate.after(date)) {
                dueDate = date;
            }
        }
        
        return DateUtil.formatDate(dueDate, "yyyy/MM/dd");
    }
}
