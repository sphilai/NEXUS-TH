/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest.post;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_Y;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SHIPPED_TYP_INCOMPLATE_PACKING;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkMixTagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkMixTagService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2508ResultDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2508Resourceのテストクラスです。
 *
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 *
 * @version $Revision: 11315 $
 */
@RunWith(Ws25xxResourceTestRunner.class)
public class Ws2508ResourceTest extends AbstractEca0027Test {

    /** WEBサービスの結果タイプ */
    private static final GenericType<Ws2508ResultDomain> RESULT_TYPE = new GenericType<Ws2508ResultDomain>() {};

    /** エラー作成日時のフォーマット */
    private static final SimpleDateFormat ERR_CREATE_TIMESTAMP_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    /** WebServiceCallerRestDomain オブジェクト */
    private WebServiceCallerRestDomain wsCallerRestDomain;

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2508ResourceTest() {
    }

    /**
     * テストデータの準備
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Before
    public void setUpData() throws ApplicationException {
        
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TmPkgSpecHdrService tmPkgSpecificationHdrService = (TmPkgSpecHdrService) getContext().getBean("tmPkgSpecificationHdrService");
        TmPkgSpecDtlService tmPkgSpecificationDtlService = (TmPkgSpecDtlService) getContext().getBean("tmPkgSpecificationDtlService");
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService = (TmExpItemNoSpInfoService) getContext().getBean("tmExpItemNoSpInfoService");
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TmCigmaWhXrefService tmCigmaWhXrefService = (TmCigmaWhXrefService) getContext().getBean("tmCigmaWhXrefService");
        
        if ("testSetPalletizeInfo2_1_2".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_1_3".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_1_4".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_2_2".equals(testNameRule.getMethodName())) {
            TmPkgSpecHdrCriteriaDomain criteria = new TmPkgSpecHdrCriteriaDomain();
            criteria.setOwnerComp("MYA");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            TmPkgSpecHdrDomain domain = new TmPkgSpecHdrDomain();
            domain.setPkgCd("XXX");
            //tmPkgSpecificationHdrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_2".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setLgcyWhCd("X");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_4".equals(testNameRule.getMethodName())) {
            TmCigmaWhXrefCriteriaDomain criteria = new TmCigmaWhXrefCriteriaDomain();
            criteria.setLgcyLibCompCd("MYA");
            criteria.setPlntCd("M1");
            criteria.setLgcyWhCd("1");
            TmCigmaWhXrefDomain domain = new TmCigmaWhXrefDomain();
            domain.setWhCd("XXXX");
            tmCigmaWhXrefService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYA");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-001");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_2".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setInvoiceKey("XXX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_3".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerSortingKey("XXXXX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_5".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_BACK);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_6".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_Y);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_7".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerLooseTyp(Eca0027Constants.CONTAINER_LOOSE_TYP_L);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_8".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setCustomTimingTyp(Eca0027Constants.CUSTOM_TIMING_TYPE_Z);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_9".equals(testNameRule.getMethodName())) {
            TmPkgSpecHdrCriteriaDomain criteria = new TmPkgSpecHdrCriteriaDomain();
            criteria.setOwnerComp("MYA");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            TmPkgSpecHdrDomain domain = new TmPkgSpecHdrDomain();
            //domain.setMltInBoxArrowFlg(Eca0027Constants.FLAG_N);
            //tmPkgSpecificationHdrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_5".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLgcyShipTo("XX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_6".equals(testNameRule.getMethodName())) {
            TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("a002TB0091B02N");
            tmExpFormalitiItemNoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1".equals(testNameRule.getMethodName())) {
            TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            criteria.setMixTagStatus(Eca0027Constants.MIX_TAG_STATUS_MIXTAG);
            TtMixtagDomain domain = new TtMixtagDomain();
            domain.setMixTagStatus("-");
            ttMixtagService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfoX_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecHdrCriteriaDomain criteria = new TmPkgSpecHdrCriteriaDomain();
            criteria.setOwnerComp("MYA");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            TmPkgSpecHdrDomain domain = new TmPkgSpecHdrDomain();
            //domain.setNetWeightA(new BigDecimal("9999999.999"));
            //tmPkgSpecificationHdrService.updateByCondition(domain, criteria);
            
        }
    }

    /**
     * WebServiceCallerRestDomain の準備
     */
    @Before
    public void setUpWebServiceCallerRestDomain() {

        setDensoContext("seo07");

        wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2508");
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
        
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TmPkgSpecHdrService tmPkgSpecificationHdrService = (TmPkgSpecHdrService) getContext().getBean("tmPkgSpecificationHdrService");
        TmPkgSpecDtlService tmPkgSpecificationDtlService = (TmPkgSpecDtlService) getContext().getBean("tmPkgSpecificationDtlService");
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService = (TmExpItemNoSpInfoService) getContext().getBean("tmExpItemNoSpInfoService");
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TmCigmaWhXrefService tmCigmaWhXrefService = (TmCigmaWhXrefService) getContext().getBean("tmCigmaWhXrefService");
        
        if ("testSetPalletizeInfo2_1_2".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_1_3".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_1_4".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_2_2".equals(testNameRule.getMethodName())) {
            TmPkgSpecHdrCriteriaDomain criteria = new TmPkgSpecHdrCriteriaDomain();
            criteria.setOwnerComp("MYA");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("XXX");
            TmPkgSpecHdrDomain domain = new TmPkgSpecHdrDomain();
            domain.setPkgCd("110");
            //tmPkgSpecificationHdrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_2".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setLgcyWhCd("1");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_4".equals(testNameRule.getMethodName())) {
            TmCigmaWhXrefCriteriaDomain criteria = new TmCigmaWhXrefCriteriaDomain();
            criteria.setLgcyLibCompCd("MYA");
            criteria.setPlntCd("M1");
            criteria.setLgcyWhCd("1");
            TmCigmaWhXrefDomain domain = new TmCigmaWhXrefDomain();
            domain.setWhCd("WH01");
            tmCigmaWhXrefService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYA");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-001");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_2".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setInvoiceKey("NMY");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_3".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerSortingKey("ZA001001");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_5".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_DOOR);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_6".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_N);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_7".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerLooseTyp(Eca0027Constants.CONTAINER_LOOSE_TYP_C);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_8".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setCustomTimingTyp(Eca0027Constants.CUSTOM_TIMING_TYPE_A);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_9".equals(testNameRule.getMethodName())) {
            TmPkgSpecHdrCriteriaDomain criteria = new TmPkgSpecHdrCriteriaDomain();
            criteria.setOwnerComp("MYA");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            TmPkgSpecHdrDomain domain = new TmPkgSpecHdrDomain();
            //domain.setMltInBoxArrowFlg(Eca0027Constants.FLAG_Y);
            //tmPkgSpecificationHdrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_5".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001205");
            criteria.setLgcyShipTo("XX");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLgcyShipTo("00");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_6".equals(testNameRule.getMethodName())) {
            TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
            criteria.setCompCd("MYA");
            criteria.setItemNo("a002TB0091B02N");
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("A002TB0091B02N");
            tmExpFormalitiItemNoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1".equals(testNameRule.getMethodName())) {
            TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
            criteria.setPltzInstrNo("MYA0624004");
            criteria.setMixTagStatus("-");
            TtMixtagDomain domain = new TtMixtagDomain();
            domain.setMixTagStatus(Eca0027Constants.MIX_TAG_STATUS_MIXTAG);
            ttMixtagService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfoX_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecHdrCriteriaDomain criteria = new TmPkgSpecHdrCriteriaDomain();
            criteria.setOwnerComp("MYA");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B02N");
            criteria.setPkgCd("110");
            TmPkgSpecHdrDomain domain = new TmPkgSpecHdrDomain();
            //domain.setNetWeightA(new BigDecimal("50"));
            //tmPkgSpecificationHdrService.updateByCondition(domain, criteria);
            
        }
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.1.1～1.1.13
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_1() throws Exception {

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(11));
        
        int count = 0;
        for (ErrorListItemDomain error : resultDomain.getErrorList()) {
            if ("NXS_E1_5016".equals(error.getErrorCode())) {
                count++;
            }
        }
        assertThat(count, is(11));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.1
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.3.1
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_3_1() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.3.2
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_3_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.3.3
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_3_3() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.3.4
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_3_4() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.3.5
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_3_5() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.3.6
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_3_6() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.4.1
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_4_1() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.4.2
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_4_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.4.3
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_4_3() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.4.4
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_4_4() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.4.5
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_4_5() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.4.6
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_4_6() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.5.1
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_5_1() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "DUMMY");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "UNLOCK1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/04/01 09:01:00");

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.5.2
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_5_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "DUMMY");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", "SCREEN1");
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "UNLOCK1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/04/01 09:01:00");

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.5.3
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_5_3() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "DUMMY");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", "SCREEN1");
        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/04/01 09:01:00");

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.5.4
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_5_4() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "DUMMY");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "UNLOCK1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/04/01 09:01:00");

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.5.5
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_5_5() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "DUMMY");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", "SCREEN1");
        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "UNLOCK1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: DSC-ID 不正
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_x() throws Exception {
        
        setDensoContext("X");
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/04/01 09:01:00");

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5031"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.1
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_1() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "XXXXX");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5038"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.2
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5015"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.3
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_3() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5015"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.4
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_4() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5015"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.1
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_1() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "XXXXX");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5009"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.2
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", null);
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", null);
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5010"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.3.1, 2.3.6
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_1() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "XX");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultA(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.3.2, 2.3.6
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultC(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.3.3, 2.3.6
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_3() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "X");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultC(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.3.4, 2.3.6
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_4() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultD(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.3.5, 2.3.6
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_5() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "XXXX");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultD(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.1, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_1() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultE(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.2, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultF(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.3, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_3() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultG(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.4, 3.2.4, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_4() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B04N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultH(), is("NG"));
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.5, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_5() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultI(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.6, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_6() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultJ(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.7, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_7() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultK(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.8, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_8() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultL(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.1.9, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_9() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultS(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.2.1, 3.2.3, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_1() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "300000,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultM(), is("NG"));
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultO(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.2.2, 3.2.3, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_2() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "3000,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultN(), is("NG"));
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultO(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.2.5, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_5() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "3000,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.2.6, 3.2.7
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_6() throws Exception {

        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "3000,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 2);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 4
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo4_1() throws Exception {

        Timestamp startTimestamp = new Timestamp(new Date().getTime());
        
        TtExpRcvOdrService ttExpRcvOdrService = (TtExpRcvOdrService) getContext().getBean("ttExpRcvOdrService");
        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteria.setRcvOdrCompCd("MYA");
        ttExpRcvOdrCriteria.setCustomerCd("30001205");
        ttExpRcvOdrCriteria.setLgcyShipTo("00");
        ttExpRcvOdrCriteria.setTrnsCd("S");
        ttExpRcvOdrCriteria.setItemNo("A002TB0091B02N");
        ttExpRcvOdrCriteria.setPkgCd("110");
        ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);
        ttExpRcvOdrCriteria.setShippedTyp(SHIPPED_TYP_INCOMPLATE_PACKING);
        List<TtExpRcvOdrDomain> ttExpRcvOdrList = ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);
        TtExpRcvOdrDomain beforeTtExpRcvOdrDomain = ttExpRcvOdrList.get(0);
        
        TtTmpStockService ttTmpStockService = (TtTmpStockService) getContext().getBean("ttTmpStockService");
        TtTmpStockCriteriaDomain ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
        ttTmpStockCriteria.setShipperCd("MYA");
        ttTmpStockCriteria.setLgcyWhCd("1");
        ttTmpStockCriteria.setItemNo("A002TB0091B02N");
        ttTmpStockCriteria.setPkgCd("110");
        TtTmpStockDomain beforeTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYA0624004");
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", null);
        wsCallerRestDomain.setParamMap("lgcyShipTo", null);
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", null);
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/04/01 09:01:00");

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getMixedTagHeader(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getMixedTagHeader().getMixTagNo()), is(false));
        
        String mixTagNo = resultDomain.getMixedTagHeader().getMixTagNo();

        // 4.1.1
        ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteria.setRcvOdrCompCd(beforeTtExpRcvOdrDomain.getRcvOdrCompCd());
        ttExpRcvOdrCriteria.setCustomerCd(beforeTtExpRcvOdrDomain.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(beforeTtExpRcvOdrDomain.getLgcyShipTo());
        ttExpRcvOdrCriteria.setItemNo(beforeTtExpRcvOdrDomain.getItemNo());
        ttExpRcvOdrCriteria.setPkgCd(beforeTtExpRcvOdrDomain.getPkgCd());
        ttExpRcvOdrCriteria.setTrnsCd(beforeTtExpRcvOdrDomain.getTrnsCd());
        ttExpRcvOdrCriteria.setEtdDueDt(beforeTtExpRcvOdrDomain.getEtdDueDt());
        ttExpRcvOdrCriteria.setCustomerPoNo(beforeTtExpRcvOdrDomain.getCustomerPoNo());
        ttExpRcvOdrCriteria.setCustomerItemNo(beforeTtExpRcvOdrDomain.getCustomerItemNo());
        ttExpRcvOdrCriteria.setCustomerItemNoOrg(beforeTtExpRcvOdrDomain.getCustomerItemNoOrg());
        ttExpRcvOdrCriteria.setOdrCtrlNo(beforeTtExpRcvOdrDomain.getOdrCtrlNo());
        TtExpRcvOdrDomain afterTtExpRcvOdr = ttExpRcvOdrService.searchByKey(ttExpRcvOdrCriteria);
        assertThat(afterTtExpRcvOdr.getPltzAllocQty(), is(beforeTtExpRcvOdrDomain.getPltzAllocQty()));
        
        // 4.1.2
        TtMixtagOdrService ttMixtagOdrService = (TtMixtagOdrService) getContext().getBean("ttMixtagOdrService");
        TtMixtagOdrCriteriaDomain ttMixtagOdrCriteria = new TtMixtagOdrCriteriaDomain();
        ttMixtagOdrCriteria.setMixTagNo(mixTagNo);
        ttMixtagOdrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagOdrService.searchCount(ttMixtagOdrCriteria), is(0));
        
        // 4.2
        TtMixKanbanService ttMixKanbanService = (TtMixKanbanService) getContext().getBean("ttMixKanbanService");
        TtMixKanbanCriteriaDomain ttMixKanbanCriteria = new TtMixKanbanCriteriaDomain();
        ttMixKanbanCriteria.setMixTagNo(mixTagNo);
        ttMixKanbanCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixKanbanService.searchCount(ttMixKanbanCriteria), not(0));
        
        // 4.3
        TtMixtagItemNoService ttMixtagItemNoService = (TtMixtagItemNoService) getContext().getBean("ttMixtagItemNoService");
        TtMixtagItemNoCriteriaDomain ttMixtagitemnoCriteria = new TtMixtagItemNoCriteriaDomain();
        ttMixtagitemnoCriteria.setMixTagNo(mixTagNo);
        ttMixtagitemnoCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagItemNoService.searchCount(ttMixtagitemnoCriteria), not(0));
        
        // 4.4
        TtMixtagRtService ttMixtagRtService = (TtMixtagRtService) getContext().getBean("ttMixtagRtService");
        TtMixtagRtCriteriaDomain ttMixtagRtCriteria = new TtMixtagRtCriteriaDomain();
        ttMixtagRtCriteria.setMixTagNo(mixTagNo);
        ttMixtagRtCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagRtService.searchCount(ttMixtagRtCriteria), not(0));
        
        // 4.5
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
        ttMixtagCriteria.setMixTagNo(mixTagNo);
        ttMixtagCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagService.searchCount(ttMixtagCriteria), is(1));
        
        // 4.6
        ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
        ttTmpStockCriteria.setShipperCd(beforeTtTmpStockDomain.getShipperCd());
        ttTmpStockCriteria.setLgcyWhCd(beforeTtTmpStockDomain.getLgcyWhCd());
        ttTmpStockCriteria.setItemNo(beforeTtTmpStockDomain.getItemNo());
        ttTmpStockCriteria.setPkgCd(beforeTtTmpStockDomain.getPkgCd());
        TtTmpStockDomain afterTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
        assertThat(afterTtTmpStockDomain.getQty(), is(beforeTtTmpStockDomain.getQty()));
        
        // 4.8.1
        TtBhtWorkTimeService ttBhtWorkTimeService = (TtBhtWorkTimeService) getContext().getBean("ttBhtWorkTimeService");
        TtBhtWorkTimeCriteriaDomain ttBhtWorkTimeCriteria = new TtBhtWorkTimeCriteriaDomain();
        ttBhtWorkTimeCriteria.setDscId(DensoContext.get().getDscId());
        ttBhtWorkTimeCriteria.setCompCd("MYA");
        ttBhtWorkTimeCriteria.setPreferredOrder("WORK_TIME_NO desc");
        List<TtBhtWorkTimeDomain> ttBhtWorkTimeList = ttBhtWorkTimeService.searchByCondition(ttBhtWorkTimeCriteria);
        assertThat(startTimestamp.compareTo(ttBhtWorkTimeList.get(0).getComCreateTimestamp()), is(-1));
        
        // 4.8.2
        TtBhtWorkMixTagService ttBhtWorkMixTagService = (TtBhtWorkMixTagService) getContext().getBean("ttBhtWorkMixTagService");
        TtBhtWorkMixTagCriteriaDomain ttBhtWorkMixTagCriteria = new TtBhtWorkMixTagCriteriaDomain();
        ttBhtWorkMixTagCriteria.setWorkTimeNo(ttBhtWorkTimeList.get(0).getWorkTimeNo());
        ttBhtWorkMixTagCriteria.setSearchCountCheckFlg(false);
        assertThat(ttBhtWorkMixTagService.searchCount(ttBhtWorkMixTagCriteria), is(1));
        
        // 4.8.3
        TtBhtWorkErrService ttBhtWorkErrService = (TtBhtWorkErrService) getContext().getBean("ttBhtWorkErrService");
        TtBhtWorkErrCriteriaDomain ttBhtWorkErrCriteria = new TtBhtWorkErrCriteriaDomain();
        ttBhtWorkErrCriteria.setWorkTimeNo(ttBhtWorkTimeList.get(0).getWorkTimeNo());
        ttBhtWorkErrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttBhtWorkErrService.searchCount(ttBhtWorkErrCriteria), is(1));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 4
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo4_2() throws Exception {

        TtExpRcvOdrService ttExpRcvOdrService = (TtExpRcvOdrService) getContext().getBean("ttExpRcvOdrService");
        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteria.setRcvOdrCompCd("MYA");
        ttExpRcvOdrCriteria.setCustomerCd("30001205");
        ttExpRcvOdrCriteria.setLgcyShipTo("00");
        ttExpRcvOdrCriteria.setTrnsCd("S");
        ttExpRcvOdrCriteria.setItemNo("A002TB0091B02N");
        ttExpRcvOdrCriteria.setPkgCd("110");
        ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);
        ttExpRcvOdrCriteria.setShippedTyp(SHIPPED_TYP_INCOMPLATE_PACKING);
        List<TtExpRcvOdrDomain> ttExpRcvOdrList = ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);
        TtExpRcvOdrDomain beforeTtExpRcvOdrDomain = ttExpRcvOdrList.get(0);
        
        TtTmpStockService ttTmpStockService = (TtTmpStockService) getContext().getBean("ttTmpStockService");
        TtTmpStockCriteriaDomain ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
        ttTmpStockCriteria.setShipperCd("MYA");
        ttTmpStockCriteria.setLgcyWhCd("1");
        ttTmpStockCriteria.setItemNo("A002TB0091B02N");
        ttTmpStockCriteria.setPkgCd("110");
        TtTmpStockDomain beforeTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "M1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", null);
        wsCallerRestDomain.setParamMap("whCd", null);
        wsCallerRestDomain.setParamMap("whFlg", "N");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getMixedTagHeader(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getMixedTagHeader().getMixTagNo()), is(false));

        String mixTagNo = resultDomain.getMixedTagHeader().getMixTagNo();

        // 4.1.1
        ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteria.setRcvOdrCompCd(beforeTtExpRcvOdrDomain.getRcvOdrCompCd());
        ttExpRcvOdrCriteria.setCustomerCd(beforeTtExpRcvOdrDomain.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(beforeTtExpRcvOdrDomain.getLgcyShipTo());
        ttExpRcvOdrCriteria.setItemNo(beforeTtExpRcvOdrDomain.getItemNo());
        ttExpRcvOdrCriteria.setPkgCd(beforeTtExpRcvOdrDomain.getPkgCd());
        ttExpRcvOdrCriteria.setTrnsCd(beforeTtExpRcvOdrDomain.getTrnsCd());
        ttExpRcvOdrCriteria.setEtdDueDt(beforeTtExpRcvOdrDomain.getEtdDueDt());
        ttExpRcvOdrCriteria.setCustomerPoNo(beforeTtExpRcvOdrDomain.getCustomerPoNo());
        ttExpRcvOdrCriteria.setCustomerItemNo(beforeTtExpRcvOdrDomain.getCustomerItemNo());
        ttExpRcvOdrCriteria.setCustomerItemNoOrg(beforeTtExpRcvOdrDomain.getCustomerItemNoOrg());
        ttExpRcvOdrCriteria.setOdrCtrlNo(beforeTtExpRcvOdrDomain.getOdrCtrlNo());
        TtExpRcvOdrDomain afterTtExpRcvOdr = ttExpRcvOdrService.searchByKey(ttExpRcvOdrCriteria);
        assertThat(afterTtExpRcvOdr.getPltzAllocQty(), not(beforeTtExpRcvOdrDomain.getPltzAllocQty()));
        
        // 4.1.2
        TtMixtagOdrService ttMixtagOdrService = (TtMixtagOdrService) getContext().getBean("ttMixtagOdrService");
        TtMixtagOdrCriteriaDomain ttMixtagOdrCriteria = new TtMixtagOdrCriteriaDomain();
        ttMixtagOdrCriteria.setMixTagNo(mixTagNo);
        ttMixtagOdrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagOdrService.searchCount(ttMixtagOdrCriteria), not(0));
        
        // 4.2
        TtMixKanbanService ttMixKanbanService = (TtMixKanbanService) getContext().getBean("ttMixKanbanService");
        TtMixKanbanCriteriaDomain ttMixKanbanCriteria = new TtMixKanbanCriteriaDomain();
        ttMixKanbanCriteria.setMixTagNo(mixTagNo);
        ttMixKanbanCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixKanbanService.searchCount(ttMixKanbanCriteria), not(0));
        
        // 4.3
        TtMixtagItemNoService ttMixtagItemNoService = (TtMixtagItemNoService) getContext().getBean("ttMixtagItemNoService");
        TtMixtagItemNoCriteriaDomain ttMixtagitemnoCriteria = new TtMixtagItemNoCriteriaDomain();
        ttMixtagitemnoCriteria.setMixTagNo(mixTagNo);
        ttMixtagitemnoCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagItemNoService.searchCount(ttMixtagitemnoCriteria), not(0));
        
        // 4.4
        TtMixtagRtService ttMixtagRtService = (TtMixtagRtService) getContext().getBean("ttMixtagRtService");
        TtMixtagRtCriteriaDomain ttMixtagRtCriteria = new TtMixtagRtCriteriaDomain();
        ttMixtagRtCriteria.setMixTagNo(mixTagNo);
        ttMixtagRtCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagRtService.searchCount(ttMixtagRtCriteria), not(0));
        
        // 4.5
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
        ttMixtagCriteria.setMixTagNo(mixTagNo);
        ttMixtagCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagService.searchCount(ttMixtagCriteria), is(1));
        
        // 4.6
        ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
        ttTmpStockCriteria.setShipperCd(beforeTtTmpStockDomain.getShipperCd());
        ttTmpStockCriteria.setLgcyWhCd(beforeTtTmpStockDomain.getLgcyWhCd());
        ttTmpStockCriteria.setItemNo(beforeTtTmpStockDomain.getItemNo());
        ttTmpStockCriteria.setPkgCd(beforeTtTmpStockDomain.getPkgCd());
        TtTmpStockDomain afterTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
        assertThat(afterTtTmpStockDomain.getQty(), not(beforeTtTmpStockDomain.getQty()));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 4
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo4_3() throws Exception {

        TtExpRcvOdrService ttExpRcvOdrService = (TtExpRcvOdrService) getContext().getBean("ttExpRcvOdrService");
        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteria.setRcvOdrCompCd("MYA");
        ttExpRcvOdrCriteria.setCustomerCd("30001205");
        ttExpRcvOdrCriteria.setLgcyShipTo("00");
        ttExpRcvOdrCriteria.setTrnsCd("S");
        ttExpRcvOdrCriteria.setItemNo("A002TB0091B02N");
        ttExpRcvOdrCriteria.setPkgCd("110");
        ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);
        ttExpRcvOdrCriteria.setShippedTyp(SHIPPED_TYP_INCOMPLATE_PACKING);
        List<TtExpRcvOdrDomain> ttExpRcvOdrList = ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);
        TtExpRcvOdrDomain beforeTtExpRcvOdrDomain = ttExpRcvOdrList.get(0);
        
        TtTmpStockService ttTmpStockService = (TtTmpStockService) getContext().getBean("ttTmpStockService");
        TtTmpStockCriteriaDomain ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
        ttTmpStockCriteria.setShipperCd("MYA");
        ttTmpStockCriteria.setLgcyWhCd("1");
        ttTmpStockCriteria.setItemNo("A002TB0091B02N");
        ttTmpStockCriteria.setPkgCd("110");
        TtTmpStockDomain beforeTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);

        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getMixedTagHeader(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getMixedTagHeader().getMixTagNo()), is(false));

        String mixTagNo = resultDomain.getMixedTagHeader().getMixTagNo();

        // 4.1.1
        ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
        ttExpRcvOdrCriteria.setRcvOdrCompCd(beforeTtExpRcvOdrDomain.getRcvOdrCompCd());
        ttExpRcvOdrCriteria.setCustomerCd(beforeTtExpRcvOdrDomain.getCustomerCd());
        ttExpRcvOdrCriteria.setLgcyShipTo(beforeTtExpRcvOdrDomain.getLgcyShipTo());
        ttExpRcvOdrCriteria.setItemNo(beforeTtExpRcvOdrDomain.getItemNo());
        ttExpRcvOdrCriteria.setPkgCd(beforeTtExpRcvOdrDomain.getPkgCd());
        ttExpRcvOdrCriteria.setTrnsCd(beforeTtExpRcvOdrDomain.getTrnsCd());
        ttExpRcvOdrCriteria.setEtdDueDt(beforeTtExpRcvOdrDomain.getEtdDueDt());
        ttExpRcvOdrCriteria.setCustomerPoNo(beforeTtExpRcvOdrDomain.getCustomerPoNo());
        ttExpRcvOdrCriteria.setCustomerItemNo(beforeTtExpRcvOdrDomain.getCustomerItemNo());
        ttExpRcvOdrCriteria.setCustomerItemNoOrg(beforeTtExpRcvOdrDomain.getCustomerItemNoOrg());
        ttExpRcvOdrCriteria.setOdrCtrlNo(beforeTtExpRcvOdrDomain.getOdrCtrlNo());
        TtExpRcvOdrDomain afterTtExpRcvOdr = ttExpRcvOdrService.searchByKey(ttExpRcvOdrCriteria);
        assertThat(afterTtExpRcvOdr.getPltzAllocQty(), not(beforeTtExpRcvOdrDomain.getPltzAllocQty()));
        
        // 4.1.2
        TtMixtagOdrService ttMixtagOdrService = (TtMixtagOdrService) getContext().getBean("ttMixtagOdrService");
        TtMixtagOdrCriteriaDomain ttMixtagOdrCriteria = new TtMixtagOdrCriteriaDomain();
        ttMixtagOdrCriteria.setMixTagNo(mixTagNo);
        ttMixtagOdrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagOdrService.searchCount(ttMixtagOdrCriteria), not(0));
        
        // 4.2
        TtMixKanbanService ttMixKanbanService = (TtMixKanbanService) getContext().getBean("ttMixKanbanService");
        TtMixKanbanCriteriaDomain ttMixKanbanCriteria = new TtMixKanbanCriteriaDomain();
        ttMixKanbanCriteria.setMixTagNo(mixTagNo);
        ttMixKanbanCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixKanbanService.searchCount(ttMixKanbanCriteria), not(0));
        
        // 4.3
        TtMixtagItemNoService ttMixtagItemNoService = (TtMixtagItemNoService) getContext().getBean("ttMixtagItemNoService");
        TtMixtagItemNoCriteriaDomain ttMixtagitemnoCriteria = new TtMixtagItemNoCriteriaDomain();
        ttMixtagitemnoCriteria.setMixTagNo(mixTagNo);
        ttMixtagitemnoCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagItemNoService.searchCount(ttMixtagitemnoCriteria), not(0));
        
        // 4.4
        TtMixtagRtService ttMixtagRtService = (TtMixtagRtService) getContext().getBean("ttMixtagRtService");
        TtMixtagRtCriteriaDomain ttMixtagRtCriteria = new TtMixtagRtCriteriaDomain();
        ttMixtagRtCriteria.setMixTagNo(mixTagNo);
        ttMixtagRtCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagRtService.searchCount(ttMixtagRtCriteria), not(0));
        
        // 4.5
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
        ttMixtagCriteria.setMixTagNo(mixTagNo);
        ttMixtagCriteria.setSearchCountCheckFlg(false);
        assertThat(ttMixtagService.searchCount(ttMixtagCriteria), is(1));
        
        // 4.6
        ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
        ttTmpStockCriteria.setShipperCd(beforeTtTmpStockDomain.getShipperCd());
        ttTmpStockCriteria.setLgcyWhCd(beforeTtTmpStockDomain.getLgcyWhCd());
        ttTmpStockCriteria.setItemNo(beforeTtTmpStockDomain.getItemNo());
        ttTmpStockCriteria.setPkgCd(beforeTtTmpStockDomain.getPkgCd());
        TtTmpStockDomain afterTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
        assertThat(afterTtTmpStockDomain.getQty(), not(beforeTtTmpStockDomain.getQty()));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (N/W)
     *
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "10,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
    public void testSetPalletizeInfoX_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", null);
        wsCallerRestDomain.setParamMap("shipperCd", "MYA");
        wsCallerRestDomain.setParamMap("customerCd", "30001205");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", null);
        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
        wsCallerRestDomain.setParamMap("whCompCd", "MYA");
        wsCallerRestDomain.setParamMap("whCd", "WH01");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("boxNo", "1234");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B02N,A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("indusTypCd", "AAAA,AAAA");
        wsCallerRestDomain.setParamMap("kanbanTyp", "TT,TT");
        wsCallerRestDomain.setParamMap("tagSeq", "10001,10002");
        wsCallerRestDomain.setParamMap("lotSize", "30,30");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customerTagSeq", null);
        wsCallerRestDomain.setParamMap("pkgItemNo", "PKGITEMENO-001,PKGITEMENO-002");
        wsCallerRestDomain.setParamMap("pkgItemQty", "9999999,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/04/01 09:00:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/04/01 17:30:00");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);

        // Webサービスを呼び出す
        Ws2508ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("G/W"));
    }



    /**
     * 
     * <br />TT_CML_ERROR_HEADER の件数をチェックする。
     *
     * @param errCreateTimestamp エラー作成日時
     * @return TtCmlErrorHeaderDomain
     * @throws Exception エラーが発生した場合
     */
    private TtCmlErrorHeaderDomain assertCountTtCmlErrorHeader(String errCreateTimestamp) throws Exception {
        
        TtCmlErrorHeaderService ttCmlErrorHeaderService = (TtCmlErrorHeaderService) getContext().getBean("ttCmlErrorHeaderService");
        TtCmlErrorHeaderCriteriaDomain criteria = new TtCmlErrorHeaderCriteriaDomain();
        criteria.setDscId(DensoContext.get().getDscId());
        criteria.setErrCreateTimestamp(toTimestamp(errCreateTimestamp));
        criteria.setSearchCountCheckFlg(false);
        TtCmlErrorHeaderDomain domain = ttCmlErrorHeaderService.searchByKey(criteria);
        assertThat(errCreateTimestamp, domain, notNullValue());
        
        return domain;
    }

    /**
     * 
     * <br />TT_CML_ERROR_DTL の件数をチェックする。
     *
     * @param errCreateTimestamp エラー作成日時
     * @param expectedCount 期待値
     * @throws Exception エラーが発生した場合
     */
    private void assertCountTtCmlErrorDtl(String errCreateTimestamp, int expectedCount) throws Exception {
        
        TtCmlErrorDtlService ttCmlErrorDtlService = (TtCmlErrorDtlService) getContext().getBean("ttCmlErrorDtlService");
        TtCmlErrorDtlCriteriaDomain ttCmlErrorDtlCriteria = new TtCmlErrorDtlCriteriaDomain();
        ttCmlErrorDtlCriteria.setDscId(DensoContext.get().getDscId());
        ttCmlErrorDtlCriteria.setErrCreateTimestamp(toTimestamp(errCreateTimestamp));
        ttCmlErrorDtlCriteria.setSearchCountCheckFlg(false);
        assertThat(errCreateTimestamp, ttCmlErrorDtlService.searchCount(ttCmlErrorDtlCriteria), is(expectedCount));
    }
    
    /**
     * 
     * <br />Timestamp に変換する。
     *
     * @param timestamp 文字列
     * @return Timestamp
     * @throws Exception エラーが発生した場合
     */
    private Timestamp toTimestamp(String timestamp) throws Exception {
        
        String s = timestamp + "000";
        Date d = ERR_CREATE_TIMESTAMP_FORMAT.parse(s.substring(0, 23));
        return new Timestamp(d.getTime());
    }
}
