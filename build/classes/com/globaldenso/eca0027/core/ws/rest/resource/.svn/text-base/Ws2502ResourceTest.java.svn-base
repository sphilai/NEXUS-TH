/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest.post;
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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaWhXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmSeqDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmSeqCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkErrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtBhtWorkTimeCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzItemOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TmSeqService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.business.domain.ErrorListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502RegisterDataListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2502ResultDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.DateUtil;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2502Resourceのテストクラスです。
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 11315 $
 */
@RunWith(Ws25xxResourceTestRunner.class)
public class Ws2502ResourceTest extends AbstractEca0027Test {

    /** WEBサービスの結果タイプ */
    private static final GenericType<Ws2502ResultDomain> RESULT_TYPE = new GenericType<Ws2502ResultDomain>() {};

    /** エラー作成日時のフォーマット */
    private static final SimpleDateFormat ERR_CREATE_TIMESTAMP_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    /** WebServiceCallerRestDomain オブジェクト */
    private WebServiceCallerRestDomain wsCallerRestDomain;

    /** TmSeqDomain */
    private TmSeqDomain originalTmSeqDomain;
    
    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2502ResourceTest() {
    }

    /**
     * テストデータの準備
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Before
    public void setUpData() throws ApplicationException {
        
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TmCigmaEnvService tmCigmaEnvService = (TmCigmaEnvService) getContext().getBean("tmCigmaEnvService");
        TmPkgSpecDtlService tmPkgSpecificationDtlService = (TmPkgSpecDtlService) getContext().getBean("tmPkgSpecificationDtlService");
        TmCigmaWhXrefService tmCigmaWhXrefService = (TmCigmaWhXrefService) getContext().getBean("tmCigmaWhXrefService");
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService = (TmExpItemNoSpInfoService) getContext().getBean("tmExpItemNoSpInfoService");
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        TtPltzInstrItemNoService ttPltzInstrItemNoService = (TtPltzInstrItemNoService) getContext().getBean("ttPltzInstrItemNoService");
        TtPltzInstrOdrService ttPltzInstrOdrService = (TtPltzInstrOdrService) getContext().getBean("ttPltzInstrOdrService");
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtMixtagItemNoService ttMixtagItemNoService = (TtMixtagItemNoService) getContext().getBean("ttMixtagItemNoService");
        TmPkgSetHdrService tmPkgSetHdrService = (TmPkgSetHdrService) getContext().getBean("tmPkgSetHdrService");
        TmNxsCompService tmNxsCompService = (TmNxsCompService) getContext().getBean("tmNxsCompService");
        TmSeqService tmSeqService = (TmSeqService) getContext().getBean("tmSeqService");
        CommonService commonService = (CommonService) getContext().getBean("commonService");
        
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MYB0621002");
        TtPltzInstrDomain ttPltzInstrDomain = new TtPltzInstrDomain();
        ttPltzInstrDomain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
        ttPltzInstrService.updateByCondition(ttPltzInstrDomain, ttPltzInstrCriteria);
        
        if ("testSetPalletizeInfo2_1_2".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_CREATED);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_1_3".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_1_4".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_PRINT_OUT);
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_1_5".equals(testNameRule.getMethodName())) {
            TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
            criteria.setCompCd("MYB");
            TmCigmaEnvDomain domain = new TmCigmaEnvDomain();
            domain.setAccessibilityTyp(Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NA);
            tmCigmaEnvService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_2_5".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            domain.setLengthUnit("");
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_1".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setLgcyShipTo("XX");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_2".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setCustomerCd("XXXXXXX");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_3".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPlntCd("XX");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_4".equals(testNameRule.getMethodName())) {
            TmCigmaWhXrefCriteriaDomain criteria = new TmCigmaWhXrefCriteriaDomain();
            criteria.setLgcyLibCompCd("MYB");
            criteria.setPlntCd("M1");
            criteria.setLgcyWhCd("1");
            TmCigmaWhXrefDomain domain = new TmCigmaWhXrefDomain();
            domain.setWhCd("XXXX");
            tmCigmaWhXrefService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp("X");
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_2".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
            criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B04N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_3".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setInvoiceKey("XXX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_4".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerSortingKey("XXX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_5".equals(testNameRule.getMethodName())) {
            TtPltzInstrItemNoCriteriaDomain criteria = new TtPltzInstrItemNoCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            TtPltzInstrItemNoDomain domain = new TtPltzInstrItemNoDomain();
            domain.setItemNo("A002TB0091B09N");
            ttPltzInstrItemNoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_6".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_BACK);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_7".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_Y);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_8".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerLooseTyp(Eca0027Constants.CONTAINER_LOOSE_TYP_L);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_9".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setCustomTimingTyp(Eca0027Constants.CUSTOM_TIMING_TYPE_Z);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_3".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo4_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_5".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLgcyShipTo("XX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_6".equals(testNameRule.getMethodName())) {
            TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("a002TB0091B03N");
            tmExpFormalitiItemNoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo5_1".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo5_2".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo5_3".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo5_4".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo5_5".equals(testNameRule.getMethodName())
            || testNameRule.getMethodName().startsWith("testSetPalletizeInfoX_")
            || testNameRule.getMethodName().startsWith("testSetPalletizeInfoY_")) {
            
            String pltzInstrNo = null;
            String mixTagNo = null;
            int numOfItems = 2;
            if ("testSetPalletizeInfo5_1".equals(testNameRule.getMethodName())) {
                pltzInstrNo = "MYB0803001";
            } else if ("testSetPalletizeInfo5_2".equals(testNameRule.getMethodName())
                || "testSetPalletizeInfoX_7".equals(testNameRule.getMethodName())
                || "testSetPalletizeInfoX_8".equals(testNameRule.getMethodName())
                || "testSetPalletizeInfoX_9".equals(testNameRule.getMethodName())
                || "testSetPalletizeInfoX_10".equals(testNameRule.getMethodName())) {
                pltzInstrNo = "MYB0803002";
            } else if ("testSetPalletizeInfo5_3".equals(testNameRule.getMethodName())) {
                pltzInstrNo = "MYB0803003";
                mixTagNo = "MMYBWH01408030001";
            } else if ("testSetPalletizeInfo5_4".equals(testNameRule.getMethodName())
                || testNameRule.getMethodName().startsWith("testSetPalletizeInfoX_")
                || testNameRule.getMethodName().startsWith("testSetPalletizeInfoY_")) {
                pltzInstrNo = "MYB0805001";
                mixTagNo = "MMYBWH01408050002";
            } else if ("testSetPalletizeInfo5_5".equals(testNameRule.getMethodName())) {
                pltzInstrNo = "MYB0827001";
                numOfItems = 1;
            }
            
            if (!CheckUtil.isBlankOrNull(mixTagNo)) {
                TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
                criteria.setMixTagNo(mixTagNo);
                TtMixtagDomain domain = new TtMixtagDomain();
                domain.setMixTagStatus(Eca0027Constants.MIX_TAG_STATUS_MIXTAG);
                ttMixtagService.updateByCondition(domain, criteria);
            }
            
            TtPltzInstrItemNoCriteriaDomain criteria = new TtPltzInstrItemNoCriteriaDomain();
            criteria.setPltzInstrNo(pltzInstrNo);
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            TtPltzInstrItemNoDomain domain = new TtPltzInstrItemNoDomain();
            domain.setPackedQty(new BigDecimal("0"));
            ttPltzInstrItemNoService.updateByCondition(domain, criteria);
            
            if (numOfItems > 1) {
                criteria = new TtPltzInstrItemNoCriteriaDomain();
                criteria.setPltzInstrNo(pltzInstrNo);
                criteria.setItemNo("A002TB0091B04N");
                criteria.setPkgCd("110");
                domain = new TtPltzInstrItemNoDomain();
                domain.setPackedQty(new BigDecimal("0"));
                ttPltzInstrItemNoService.updateByCondition(domain, criteria);
            }
            
            TtPltzInstrOdrCriteriaDomain criteria2 = new TtPltzInstrOdrCriteriaDomain();
            criteria2.setPltzInstrNo(pltzInstrNo);
            criteria2.setItemNo("A002TB0091B03N");
            criteria2.setPkgCd("110");
            TtPltzInstrOdrDomain domain2 = new TtPltzInstrOdrDomain();
            domain2.setPackedQty(new BigDecimal("0"));
            domain2.setPackedFlg(Eca0027Constants.FLAG_N);
            ttPltzInstrOdrService.updateByCondition(domain2, criteria2);
            
            if (numOfItems > 1) {
                criteria2 = new TtPltzInstrOdrCriteriaDomain();
                criteria2.setPltzInstrNo(pltzInstrNo);
                criteria2.setItemNo("A002TB0091B04N");
                criteria2.setPkgCd("110");
                domain2 = new TtPltzInstrOdrDomain();
                domain2.setPackedQty(new BigDecimal("0"));
                domain2.setPackedFlg(Eca0027Constants.FLAG_N);
                ttPltzInstrOdrService.updateByCondition(domain2, criteria2);
            }
            
            TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
            ttPltzCriteria.setPltzInstrNo(pltzInstrNo);
            ttPltzCriteria.setSearchCountCheckFlg(false);
            if (ttPltzService.searchCount(ttPltzCriteria) > 0) {
                TtPltzDomain ttPltzDomain = new TtPltzDomain();
                ttPltzDomain.setPltzInstrNo(pltzInstrNo.toLowerCase());
                ttPltzService.updateByCondition(ttPltzDomain, ttPltzCriteria);
            }
            
            TtPltzItemCriteriaDomain ttPltzItemCriteriaDomain = new TtPltzItemCriteriaDomain();
            ttPltzItemCriteriaDomain.setPltzInstrNo(pltzInstrNo);
            ttPltzItemCriteriaDomain.setSearchCountCheckFlg(false);
            if (ttPltzItemService.searchCount(ttPltzItemCriteriaDomain) > 0) {
                TtPltzItemDomain ttPltzItemDomain = new TtPltzItemDomain();
                ttPltzItemDomain.setPltzInstrNo(pltzInstrNo.toLowerCase());
                ttPltzItemService.updateByCondition(ttPltzItemDomain, ttPltzItemCriteriaDomain);
            }
            
            ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
            ttPltzInstrCriteria.setPltzInstrNo(pltzInstrNo);
            ttPltzInstrDomain = new TtPltzInstrDomain();
            ttPltzInstrDomain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_INSTRUCTION_PRINT_OUT);
            ttPltzInstrService.updateByCondition(ttPltzInstrDomain, ttPltzInstrCriteria);
            
            if ("testSetPalletizeInfo5_5".equals(testNameRule.getMethodName())) {
                TmPkgSpecDtlCriteriaDomain tmPkgSpecificationDtlCriteria = new TmPkgSpecDtlCriteriaDomain();
                tmPkgSpecificationDtlCriteria.setOwnerComp("MYB");
                tmPkgSpecificationDtlCriteria.setItemNoGrp("G1");
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B03N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-003");
                TmPkgSpecDtlDomain tmPkgSpecificationDtlDomain = new TmPkgSpecDtlDomain();
                //tmPkgSpecificationDtlDomain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
                //tmPkgSpecificationDtlService.updateByCondition(tmPkgSpecificationDtlDomain, tmPkgSpecificationDtlCriteria);
                
            } else if ("testSetPalletizeInfoX_1".equals(testNameRule.getMethodName())) {
                TtMixtagItemNoCriteriaDomain ttMixtagItemNoCriteria = new TtMixtagItemNoCriteriaDomain();
                ttMixtagItemNoCriteria.setMixTagNo(mixTagNo);
                ttMixtagItemNoCriteria.setItemNo("A002TB0091B03N");
                TtMixtagItemNoDomain ttMixtagItemNoDomain = new TtMixtagItemNoDomain();
                ttMixtagItemNoDomain.setItemWeight(new BigDecimal("499999.95"));
                ttMixtagItemNoService.updateByCondition(ttMixtagItemNoDomain, ttMixtagItemNoCriteria);
                
            } else if ("testSetPalletizeInfoX_3".equals(testNameRule.getMethodName())) {
                TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
                tmPkgSetHdrCriteria.setOwnerComp("MYB");
                tmPkgSetHdrCriteria.setOuterPkgCd("7777");
                TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
                tmPkgSetHdrDomain.setLength(new BigDecimal("9999.999"));
                //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setLengthUnit("MM");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoX_4".equals(testNameRule.getMethodName())) {
                TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
                tmPkgSetHdrCriteria.setOwnerComp("MYB");
                tmPkgSetHdrCriteria.setOuterPkgCd("7777");
                TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
                tmPkgSetHdrDomain.setVolume(new BigDecimal("999999999999.999"));
                //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setVolumeUnit("CC");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoX_5".equals(testNameRule.getMethodName())) {
                TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
                tmPkgSetHdrCriteria.setOwnerComp("MYB");
                tmPkgSetHdrCriteria.setOuterPkgCd("7777");
                TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
                tmPkgSetHdrDomain.setWidth(new BigDecimal("9999.999"));
                //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setLengthUnit("MM");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoX_6".equals(testNameRule.getMethodName())) {
                TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
                tmPkgSetHdrCriteria.setOwnerComp("MYB");
                tmPkgSetHdrCriteria.setOuterPkgCd("7777");
                TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
                tmPkgSetHdrDomain.setHeight(new BigDecimal("9999.999"));
                //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setLengthUnit("MM");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoX_7".equals(testNameRule.getMethodName())) {
                TmPkgSpecDtlCriteriaDomain tmPkgSpecificationDtlCriteria = new TmPkgSpecDtlCriteriaDomain();
                tmPkgSpecificationDtlCriteria.setOwnerComp("MYB");
                tmPkgSpecificationDtlCriteria.setItemNoGrp("G1");
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B03N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-003");
                TmPkgSpecDtlDomain tmPkgSpecificationDtlDomain = new TmPkgSpecDtlDomain();
                //tmPkgSpecificationDtlDomain.setLengthPalletize(new BigDecimal("9999.999"));
                tmPkgSpecificationDtlDomain.setLengthUnit("MR");
                //tmPkgSpecificationDtlDomain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
                tmPkgSpecificationDtlDomain.setLotSize(new BigDecimal("20"));
                //tmPkgSpecificationDtlService.updateByCondition(tmPkgSpecificationDtlDomain, tmPkgSpecificationDtlCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setLengthUnit("MR");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoX_8".equals(testNameRule.getMethodName())) {
                TmPkgSpecDtlCriteriaDomain tmPkgSpecificationDtlCriteria = new TmPkgSpecDtlCriteriaDomain();
                tmPkgSpecificationDtlCriteria.setOwnerComp("MYB");
                tmPkgSpecificationDtlCriteria.setItemNoGrp("G1");
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B03N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-003");
                TmPkgSpecDtlDomain tmPkgSpecificationDtlDomain = new TmPkgSpecDtlDomain();
                //tmPkgSpecificationDtlDomain.setWidthPalletize(new BigDecimal("9999.999"));
                tmPkgSpecificationDtlDomain.setLengthUnit("MR");
                //tmPkgSpecificationDtlDomain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
                tmPkgSpecificationDtlDomain.setLotSize(new BigDecimal("20"));
                //tmPkgSpecificationDtlService.updateByCondition(tmPkgSpecificationDtlDomain, tmPkgSpecificationDtlCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setLengthUnit("MR");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoX_9".equals(testNameRule.getMethodName())) {
                TmPkgSpecDtlCriteriaDomain tmPkgSpecificationDtlCriteria = new TmPkgSpecDtlCriteriaDomain();
                tmPkgSpecificationDtlCriteria.setOwnerComp("MYB");
                tmPkgSpecificationDtlCriteria.setItemNoGrp("G1");
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B03N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-003");
                TmPkgSpecDtlDomain tmPkgSpecificationDtlDomain = new TmPkgSpecDtlDomain();
                //tmPkgSpecificationDtlDomain.setHeightPalletize(new BigDecimal("9999.999"));
                tmPkgSpecificationDtlDomain.setLengthUnit("MR");
                //tmPkgSpecificationDtlDomain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
                tmPkgSpecificationDtlDomain.setLotSize(new BigDecimal("20"));
                //tmPkgSpecificationDtlService.updateByCondition(tmPkgSpecificationDtlDomain, tmPkgSpecificationDtlCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setLengthUnit("MR");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoX_10".equals(testNameRule.getMethodName())) {
                TmPkgSpecDtlCriteriaDomain tmPkgSpecificationDtlCriteria = new TmPkgSpecDtlCriteriaDomain();
                tmPkgSpecificationDtlCriteria.setOwnerComp("MYB");
                tmPkgSpecificationDtlCriteria.setItemNoGrp("G1");
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B03N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-003");
                TmPkgSpecDtlDomain tmPkgSpecificationDtlDomain = new TmPkgSpecDtlDomain();
                //tmPkgSpecificationDtlDomain.setVolumePalletize(new BigDecimal("999999999999.999"));
                //tmPkgSpecificationDtlDomain.setVolumeUnit("LT");
                //tmPkgSpecificationDtlDomain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
                tmPkgSpecificationDtlDomain.setLotSize(new BigDecimal("20"));
                //tmPkgSpecificationDtlService.updateByCondition(tmPkgSpecificationDtlDomain, tmPkgSpecificationDtlCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setVolumeUnit("CC");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoY_1".equals(testNameRule.getMethodName())) {
                Date sysdate = DateUtil.convertTime(new Date(), commonService.searchTimezone("MYB"));
                TmSeqCriteriaDomain tmSeqCriteria = new TmSeqCriteriaDomain();
                tmSeqCriteria.setSeqKey("DMYBWH01" + DateUtil.formatDate(sysdate, "yyMMdd").substring(1));
                tmSeqCriteria.setSeqTyp(Eca0027Constants.SEQ_TYP_CML_NO_DN);
                originalTmSeqDomain = tmSeqService.searchByKey(tmSeqCriteria);
                if (originalTmSeqDomain != null) {
                    TmSeqDomain tmSeqUpdate = new TmSeqDomain();
                    tmSeqUpdate.setSeqNo(new BigDecimal(Eca0027Constants.SEQ_MAX_CML_NO_DN));
                    tmSeqService.updateByCondition(tmSeqUpdate, tmSeqCriteria);
                } else {
                    TmSeqDomain tmSeqUpdate = new TmSeqDomain();
                    tmSeqUpdate.setSeqKey(tmSeqCriteria.getSeqKey());
                    tmSeqUpdate.setSeqTyp(tmSeqCriteria.getSeqTyp());
                    tmSeqUpdate.setSeqNo(new BigDecimal(Eca0027Constants.SEQ_MAX_CML_NO_DN));
                    tmSeqUpdate.setComCreateFuncId(getClass().getSimpleName());
                    tmSeqUpdate.setComCreateUserId("TEST");
                    tmSeqUpdate.setComUpdateFuncId(getClass().getSimpleName());
                    tmSeqUpdate.setComUpdateUserId("TEST");
                    tmSeqService.create(tmSeqUpdate);
                }
                
            }
            
        }
        
    }

    /**
     * WebServiceCallerRestDomain の準備
     */
    @Before
    public void setUpWebServiceCallerRestDomain() {

        setDensoContext("fukui07");

        wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2502");
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
        TmCigmaEnvService tmCigmaEnvService = (TmCigmaEnvService) getContext().getBean("tmCigmaEnvService");
        TmPkgSpecDtlService tmPkgSpecificationDtlService = (TmPkgSpecDtlService) getContext().getBean("tmPkgSpecificationDtlService");
        TmCigmaWhXrefService tmCigmaWhXrefService = (TmCigmaWhXrefService) getContext().getBean("tmCigmaWhXrefService");
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService = (TmExpItemNoSpInfoService) getContext().getBean("tmExpItemNoSpInfoService");
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        TtPltzInstrItemNoService ttPltzInstrItemNoService = (TtPltzInstrItemNoService) getContext().getBean("ttPltzInstrItemNoService");
        TtMixtagItemNoService ttMixtagItemNoService = (TtMixtagItemNoService) getContext().getBean("ttMixtagItemNoService");
        TmPkgSetHdrService tmPkgSetHdrService = (TmPkgSetHdrService) getContext().getBean("tmPkgSetHdrService");
        TmNxsCompService tmNxsCompService = (TmNxsCompService) getContext().getBean("tmNxsCompService");
        TmSeqService tmSeqService = (TmSeqService) getContext().getBean("tmSeqService");
        CommonService commonService = (CommonService) getContext().getBean("commonService");
        
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MYB0621002");
        TtPltzInstrDomain ttPltzInstrDomain = new TtPltzInstrDomain();
        ttPltzInstrDomain.setPltzInstrStatus(Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE);
        ttPltzInstrService.updateByCondition(ttPltzInstrDomain, ttPltzInstrCriteria);
        
        if ("testSetPalletizeInfo2_1_5".equals(testNameRule.getMethodName())) {
            TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
            criteria.setCompCd("MYB");
            TmCigmaEnvDomain domain = new TmCigmaEnvDomain();
            domain.setAccessibilityTyp(Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL);
            tmCigmaEnvService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_2_5".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            domain.setLengthUnit("CM");
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_1".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setLgcyShipTo("00");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_2".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setCustomerCd("30001206");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_3".equals(testNameRule.getMethodName())) {
            TtPltzInstrCriteriaDomain criteria = new TtPltzInstrCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            TtPltzInstrDomain domain = new TtPltzInstrDomain();
            domain.setPlntCd("M1");
            ttPltzInstrService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo2_3_4".equals(testNameRule.getMethodName())) {
            TmCigmaWhXrefCriteriaDomain criteria = new TmCigmaWhXrefCriteriaDomain();
            criteria.setLgcyLibCompCd("MYB");
            criteria.setPlntCd("M1");
            criteria.setLgcyWhCd("1");
            TmCigmaWhXrefDomain domain = new TmCigmaWhXrefDomain();
            domain.setWhCd("WH01");
            tmCigmaWhXrefService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_1".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo3_2_3".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo4_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_2".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
            criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B04N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_3".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setInvoiceKey("NMY");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_4".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerSortingKey("ZA001001");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_5".equals(testNameRule.getMethodName())) {
            TtPltzInstrItemNoCriteriaDomain criteria = new TtPltzInstrItemNoCriteriaDomain();
            criteria.setPltzInstrNo("MYB0621002");
            criteria.setItemNo("A002TB0091B09N");
            criteria.setPkgCd("110");
            TtPltzInstrItemNoDomain domain = new TtPltzInstrItemNoDomain();
            domain.setItemNo("A002TB0091B03N");
            ttPltzInstrItemNoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_6".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_DOOR);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_7".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_N);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_8".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerLooseTyp(Eca0027Constants.CONTAINER_LOOSE_TYP_C);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_1_9".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setCustomTimingTyp(Eca0027Constants.CUSTOM_TIMING_TYPE_A);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_5".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("XX");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLgcyShipTo("00");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_6".equals(testNameRule.getMethodName())) {
            TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("a002TB0091B03N");
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("A002TB0091B03N");
            tmExpFormalitiItemNoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo5_5".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfoX_1".equals(testNameRule.getMethodName())) {
            TtMixtagItemNoCriteriaDomain ttMixtagItemNoCriteria = new TtMixtagItemNoCriteriaDomain();
            ttMixtagItemNoCriteria.setMixTagNo("MMYBWH01408050002");
            ttMixtagItemNoCriteria.setItemNo("A002TB0091B03N");
            TtMixtagItemNoDomain ttMixtagItemNoDomain = new TtMixtagItemNoDomain();
            ttMixtagItemNoDomain.setItemWeight(new BigDecimal("50"));
            ttMixtagItemNoService.updateByCondition(ttMixtagItemNoDomain, ttMixtagItemNoCriteria);
            
        } else if ("testSetPalletizeInfoX_3".equals(testNameRule.getMethodName())) {
            TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
            tmPkgSetHdrCriteria.setOwnerComp("MYB");
            tmPkgSetHdrCriteria.setOuterPkgCd("7777");
            TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
            tmPkgSetHdrDomain.setLength(new BigDecimal("1.13"));
            //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setLengthUnit("MR");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoX_4".equals(testNameRule.getMethodName())) {
            TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
            tmPkgSetHdrCriteria.setOwnerComp("MYB");
            tmPkgSetHdrCriteria.setOuterPkgCd("7777");
            TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
            tmPkgSetHdrDomain.setVolume(new BigDecimal("250"));
            //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setVolumeUnit("LT");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoX_5".equals(testNameRule.getMethodName())) {
            TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
            tmPkgSetHdrCriteria.setOwnerComp("MYB");
            tmPkgSetHdrCriteria.setOuterPkgCd("7777");
            TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
            tmPkgSetHdrDomain.setWidth(new BigDecimal("0.97"));
            //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setLengthUnit("MR");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoX_6".equals(testNameRule.getMethodName())) {
            TmPkgSetHdrCriteriaDomain tmPkgSetHdrCriteria = new TmPkgSetHdrCriteriaDomain();
            tmPkgSetHdrCriteria.setOwnerComp("MYB");
            tmPkgSetHdrCriteria.setOuterPkgCd("7777");
            TmPkgSetHdrDomain tmPkgSetHdrDomain = new TmPkgSetHdrDomain();
            tmPkgSetHdrDomain.setHeight(new BigDecimal("0.73"));
            //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setLengthUnit("MR");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoX_7".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setLengthPalletize(new BigDecimal("3"));
            domain.setLengthUnit("CM");
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            domain.setLotSize(new BigDecimal("200"));
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setLengthUnit("MR");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoX_8".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setWidthPalletize(new BigDecimal("3.5"));
            domain.setLengthUnit("CM");
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            domain.setLotSize(new BigDecimal("200"));
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setLengthUnit("MR");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoX_9".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B03N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setHeightPalletize(new BigDecimal("2.5"));
            domain.setLengthUnit("CM");
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            domain.setLotSize(new BigDecimal("200"));
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setLengthUnit("MR");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoX_10".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain tmPkgSpecificationDtlCriteria = new TmPkgSpecDtlCriteriaDomain();
            tmPkgSpecificationDtlCriteria.setOwnerComp("MYB");
            tmPkgSpecificationDtlCriteria.setItemNoGrp("G1");
            tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B03N");
            tmPkgSpecificationDtlCriteria.setPkgCd("110");
            tmPkgSpecificationDtlCriteria.setTrnsCd("S");
            //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
            //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
            //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
            tmPkgSpecificationDtlCriteria.setNProc(" ");
            tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
            tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-003");
            TmPkgSpecDtlDomain tmPkgSpecificationDtlDomain = new TmPkgSpecDtlDomain();
            //tmPkgSpecificationDtlDomain.setVolumePalletize(new BigDecimal("26250"));
            //tmPkgSpecificationDtlDomain.setVolumeUnit("CC");
            //tmPkgSpecificationDtlDomain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            tmPkgSpecificationDtlDomain.setLotSize(new BigDecimal("20"));
            //tmPkgSpecificationDtlService.updateByCondition(tmPkgSpecificationDtlDomain, tmPkgSpecificationDtlCriteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setVolumeUnit("LT");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoY_1".equals(testNameRule.getMethodName())) {
            Date sysdate = DateUtil.convertTime(new Date(), commonService.searchTimezone("MYB"));
            TmSeqCriteriaDomain tmSeqCriteria = new TmSeqCriteriaDomain();
            tmSeqCriteria.setSeqKey("DMYBWH01" + DateUtil.formatDate(sysdate, "yyMMdd").substring(1));
            tmSeqCriteria.setSeqTyp(Eca0027Constants.SEQ_TYP_CML_NO_DN);
            TmSeqDomain tmSeqUpdate = new TmSeqDomain();
            if (originalTmSeqDomain != null) {
                tmSeqUpdate.setSeqNo(originalTmSeqDomain.getSeqNo());
            } else {
                tmSeqUpdate.setSeqNo(new BigDecimal("1"));
            }
            tmSeqService.updateByCondition(tmSeqUpdate, tmSeqCriteria);
            
        }
        
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.1.1, 1.1.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_1() throws Exception {
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(2));
        
        int count = 0;
        for (ErrorListItemDomain error : resultDomain.getErrorList()) {
            if ("NXS_E1_5016".equals(error.getErrorCode())) {
                count++;
            }
        }
        assertThat(count, is(2));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", null);
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", null);
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.3
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_3() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", null);
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.4
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_4() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", null);
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.5
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", null);
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.6
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_6() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", null);
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.7
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_7() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", null);
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.8
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_8() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", null);
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.9
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_9() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", null);
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "1");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.10
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_10() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406210003");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "CUSTITEMNO");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.11
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_11() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", null);
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "1");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", null);
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", null);
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", null);
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", null);
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", null);
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", null);
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.5.6
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_5_6() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.5.7
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_5_7() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "XXXXX");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
//    @Test
//    public void testSetPalletizeInfo2_1_1() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("pltzInstrNo", "XXXXX");
//        wsCallerRestDomain.setParamMap("palletNo", "S901");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("customerItemNo", "");
//        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
//        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
//        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
//        
//        // Webサービスを呼び出す
//        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5038"));
//    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.2
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5015"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.1.5
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_1_5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5062"));
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "XXXX");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5008"));
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "XXXX,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5009"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.3
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_3() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "XXXX");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5010"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.4
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_4() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B01NY");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5068"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.2.5
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_2_5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5070"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.3.1, 2.3.5
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 2.3.2, 2.3.5
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultB(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 2.3.3, 2.3.5
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_3() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 2.3.4, 2.3.5
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo2_3_4() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.1, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.2, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.3, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_3() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.4, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_4() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.5, 3.2.4, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B09N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.6, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_6() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.7, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_7() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.8, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_8() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.1.9, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_1_9() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.2.1, 3.2.2, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "300000,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.2.1, 3.2.3, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_3() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "300000");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 1);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultN(), is("NG"));
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultO(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 3.2.5, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.2.6, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_2_6() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
     * テストケース: 3.3.2, 3.4.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo3_3_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406210003");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("3"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getErrorReport(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));

        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
        assertCountTtCmlErrorDtl(timestamp, 1);
        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultQ(), is("NG"));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.1.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo4_1_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "1");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", null);
        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("2"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    }

    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 4.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo4_2_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0621002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "1,1");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", null);
        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("2"));
        assertThat(resultDomain.getErrorList().size(), is(0));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 5, 6
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo5_1() throws Exception {

        Timestamp startTimestamp = new Timestamp(new Date().getTime());
        
        TtPltzInstrOdrService ttPltzInstrOdrService = (TtPltzInstrOdrService) getContext().getBean("ttPltzInstrOdrService");
        TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo("MYB0803001");
        ttPltzInstrOdrCriteria.setItemNo("A002TB0091B03N");
        ttPltzInstrOdrCriteria.setPkgCd("110");
        List<TtPltzInstrOdrDomain> ttPltzInstrOdrList = ttPltzInstrOdrService.searchByCondition(ttPltzInstrOdrCriteria);
        TtPltzInstrOdrDomain beforeTtPltzInstrOdrDomain = ttPltzInstrOdrList.get(0);
        
        TtPltzInstrItemNoService ttPltzInstrItemNoService = (TtPltzInstrItemNoService) getContext().getBean("ttPltzInstrItemNoService");
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo("MYB0803001");
        ttPltzInstrItemNoCriteria.setItemNo("A002TB0091B03N");
        ttPltzInstrItemNoCriteria.setPkgCd("110");
        TtPltzInstrItemNoDomain beforeTtPltzInstrItemNoDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0803001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", "W2504,W2504");
        wsCallerRestDomain.setParamMap("errMsgId", "NXS_E7_0128,NXS_E7_0128");
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1,1");
        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/20 21:06:01,2014/06/20 21:07:20");
        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/20 21:06:05,2014/06/20 21:08:00");
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getCreateData(), notNullValue());
        
        String mainMark = resultDomain.getCreateData().getMainMark();
        
        assertThat(resultDomain.getPalletizeInstrHeader(), notNullValue());
        assertThat(resultDomain.getPalletizeInstrHeader().getRegisterDataList(), notNullValue());
        
        Ws2502RegisterDataListItemDomain rdli = resultDomain.getPalletizeInstrHeader().getRegisterDataList().get(0);
        assertThat(rdli.getMainMarkList(), notNullValue());
        assertThat(rdli.getMainMarkList().get(0).getMainMark(), is(mainMark));
        assertThat(rdli.getKanbanList(), notNullValue());
        assertThat(rdli.getKanbanList().size(), is(2));
        assertThat(rdli.getMixTagList(), notNullValue());
        assertThat(rdli.getMixTagList().size(), is(0));

        // 5.1.1
        ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo(beforeTtPltzInstrOdrDomain.getPltzInstrNo());
        ttPltzInstrOdrCriteria.setItemNo(beforeTtPltzInstrOdrDomain.getItemNo());
        ttPltzInstrOdrCriteria.setPkgCd(beforeTtPltzInstrOdrDomain.getPkgCd());
        ttPltzInstrOdrCriteria.setRcvOdrCompCd(beforeTtPltzInstrOdrDomain.getRcvOdrCompCd());
        ttPltzInstrOdrCriteria.setCustomerCd(beforeTtPltzInstrOdrDomain.getCustomerCd());
        ttPltzInstrOdrCriteria.setLgcyShipTo(beforeTtPltzInstrOdrDomain.getLgcyShipTo());
        ttPltzInstrOdrCriteria.setTrnsCd(beforeTtPltzInstrOdrDomain.getTrnsCd());
        ttPltzInstrOdrCriteria.setEtdDueDt(beforeTtPltzInstrOdrDomain.getEtdDueDt());
        ttPltzInstrOdrCriteria.setCustomerPoNo(beforeTtPltzInstrOdrDomain.getCustomerPoNo());
        ttPltzInstrOdrCriteria.setCustomerItemNo(beforeTtPltzInstrOdrDomain.getCustomerItemNo());
        ttPltzInstrOdrCriteria.setCustomerItemNoOrg(beforeTtPltzInstrOdrDomain.getCustomerItemNoOrg());
        ttPltzInstrOdrCriteria.setOdrCtrlNo(beforeTtPltzInstrOdrDomain.getOdrCtrlNo());
        TtPltzInstrOdrDomain afterTtPltzInstrOdrDomain = ttPltzInstrOdrService.searchByKey(ttPltzInstrOdrCriteria);
        assertThat(afterTtPltzInstrOdrDomain.getPackedQty(), not(beforeTtPltzInstrOdrDomain.getPackedQty()));
        assertThat(afterTtPltzInstrOdrDomain.getPackedFlg(), is(Eca0027Constants.FLAG_N));
        
        // 5.1.2
        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
        ttPltzItemOdrCriteria.setMainMark(mainMark);
        ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(2));
        
        // 6.1
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteria.setMainMark(mainMark);
        ttPltzItemCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(10));
        
        // 6.2
        TtPltzKanbanService ttPltzKanbanService = (TtPltzKanbanService) getContext().getBean("ttPltzKanbanService");
        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
        ttPltzKanbanCriteria.setMainMark(mainMark);
        ttPltzKanbanCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzKanbanService.searchCount(ttPltzKanbanCriteria), is(2));
        
        // 6.3
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMark(mainMark);
        ttPltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
        
        // 6.4
        ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo(beforeTtPltzInstrItemNoDomain.getPltzInstrNo());
        ttPltzInstrItemNoCriteria.setItemNo(beforeTtPltzInstrItemNoDomain.getItemNo());
        ttPltzInstrItemNoCriteria.setPkgCd(beforeTtPltzInstrItemNoDomain.getPkgCd());
        TtPltzInstrItemNoDomain afterTtPltzInstrItemNoDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
        assertThat(afterTtPltzInstrItemNoDomain.getPackedQty(), not(beforeTtPltzInstrItemNoDomain.getPackedQty()));
        
        // 6.5
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MYB0803001");
        TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.searchByKey(ttPltzInstrCriteria);
        assertThat(ttPltzInstrDomain.getPltzInstrStatus(), is(Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE));
        
        // 6.7.1
        TtBhtWorkTimeService ttBhtWorkTimeService = (TtBhtWorkTimeService) getContext().getBean("ttBhtWorkTimeService");
        TtBhtWorkTimeCriteriaDomain ttBhtWorkTimeCriteria = new TtBhtWorkTimeCriteriaDomain();
        ttBhtWorkTimeCriteria.setDscId(DensoContext.get().getDscId());
        ttBhtWorkTimeCriteria.setCompCd("MY7");
        ttBhtWorkTimeCriteria.setPreferredOrder("WORK_TIME_NO desc");
        List<TtBhtWorkTimeDomain> ttBhtWorkTimeList = ttBhtWorkTimeService.searchByCondition(ttBhtWorkTimeCriteria);
        assertThat(startTimestamp.compareTo(ttBhtWorkTimeList.get(0).getComCreateTimestamp()), is(-1));
        
        // 6.7.2
        TtBhtWorkPltzService ttBhtWorkPltzService = (TtBhtWorkPltzService) getContext().getBean("ttBhtWorkPltzService");
        TtBhtWorkPltzCriteriaDomain ttBhtWorkPltzCriteria = new TtBhtWorkPltzCriteriaDomain();
        ttBhtWorkPltzCriteria.setWorkTimeNo(ttBhtWorkTimeList.get(0).getWorkTimeNo());
        ttBhtWorkPltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttBhtWorkPltzService.searchCount(ttBhtWorkPltzCriteria), is(1));
        
        // 6.7.3
        TtBhtWorkErrService ttBhtWorkErrService = (TtBhtWorkErrService) getContext().getBean("ttBhtWorkErrService");
        TtBhtWorkErrCriteriaDomain ttBhtWorkErrCriteria = new TtBhtWorkErrCriteriaDomain();
        ttBhtWorkErrCriteria.setWorkTimeNo(ttBhtWorkTimeList.get(0).getWorkTimeNo());
        ttBhtWorkErrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttBhtWorkErrService.searchCount(ttBhtWorkErrCriteria), is(2));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 5, 6
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo5_2() throws Exception {
        
        TtPltzInstrOdrService ttPltzInstrOdrService = (TtPltzInstrOdrService) getContext().getBean("ttPltzInstrOdrService");
        TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo("MYB0803002");
        ttPltzInstrOdrCriteria.setItemNo("A002TB0091B03N");
        ttPltzInstrOdrCriteria.setPkgCd("110");
        List<TtPltzInstrOdrDomain> ttPltzInstrOdrList = ttPltzInstrOdrService.searchByCondition(ttPltzInstrOdrCriteria);
        TtPltzInstrOdrDomain beforeTtPltzInstrOdrDomain = ttPltzInstrOdrList.get(0);
        
        TtPltzInstrItemNoService ttPltzInstrItemNoService = (TtPltzInstrItemNoService) getContext().getBean("ttPltzInstrItemNoService");
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo("MYB0803002");
        ttPltzInstrItemNoCriteria.setItemNo("A002TB0091B03N");
        ttPltzInstrItemNoCriteria.setPkgCd("110");
        TtPltzInstrItemNoDomain beforeTtPltzInstrItemNoDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0803002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N,A002TB0091B04N");
        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
        wsCallerRestDomain.setParamMap("kanbanQty", "20,20");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getCreateData(), notNullValue());
        
        String mainMark = resultDomain.getCreateData().getMainMark();
        
        assertThat(resultDomain.getPalletizeInstrHeader(), notNullValue());
        assertThat(resultDomain.getPalletizeInstrHeader().getRegisterDataList(), notNullValue());
        
        Ws2502RegisterDataListItemDomain rdli = resultDomain.getPalletizeInstrHeader().getRegisterDataList().get(0);
        assertThat(rdli.getMainMarkList(), notNullValue());
        assertThat(rdli.getMainMarkList().get(0).getMainMark(), is(mainMark));
        assertThat(rdli.getKanbanList(), notNullValue());
        assertThat(rdli.getKanbanList().size(), is(2));
        assertThat(rdli.getMixTagList(), notNullValue());
        assertThat(rdli.getMixTagList().size(), is(0));

        // 5.1.1
        ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo(beforeTtPltzInstrOdrDomain.getPltzInstrNo());
        ttPltzInstrOdrCriteria.setItemNo(beforeTtPltzInstrOdrDomain.getItemNo());
        ttPltzInstrOdrCriteria.setPkgCd(beforeTtPltzInstrOdrDomain.getPkgCd());
        ttPltzInstrOdrCriteria.setRcvOdrCompCd(beforeTtPltzInstrOdrDomain.getRcvOdrCompCd());
        ttPltzInstrOdrCriteria.setCustomerCd(beforeTtPltzInstrOdrDomain.getCustomerCd());
        ttPltzInstrOdrCriteria.setLgcyShipTo(beforeTtPltzInstrOdrDomain.getLgcyShipTo());
        ttPltzInstrOdrCriteria.setTrnsCd(beforeTtPltzInstrOdrDomain.getTrnsCd());
        ttPltzInstrOdrCriteria.setEtdDueDt(beforeTtPltzInstrOdrDomain.getEtdDueDt());
        ttPltzInstrOdrCriteria.setCustomerPoNo(beforeTtPltzInstrOdrDomain.getCustomerPoNo());
        ttPltzInstrOdrCriteria.setCustomerItemNo(beforeTtPltzInstrOdrDomain.getCustomerItemNo());
        ttPltzInstrOdrCriteria.setCustomerItemNoOrg(beforeTtPltzInstrOdrDomain.getCustomerItemNoOrg());
        ttPltzInstrOdrCriteria.setOdrCtrlNo(beforeTtPltzInstrOdrDomain.getOdrCtrlNo());
        TtPltzInstrOdrDomain afterTtPltzInstrOdrDomain = ttPltzInstrOdrService.searchByKey(ttPltzInstrOdrCriteria);
        assertThat(afterTtPltzInstrOdrDomain.getPackedQty(), not(beforeTtPltzInstrOdrDomain.getPackedQty()));
        assertThat(afterTtPltzInstrOdrDomain.getPackedFlg(), is(Eca0027Constants.FLAG_Y));
        
        // 5.1.2
        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
        ttPltzItemOdrCriteria.setMainMark(mainMark);
        ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(2));
        
        // 6.1
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteria.setMainMark(mainMark);
        ttPltzItemCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(10));
        
        // 6.2
        TtPltzKanbanService ttPltzKanbanService = (TtPltzKanbanService) getContext().getBean("ttPltzKanbanService");
        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
        ttPltzKanbanCriteria.setMainMark(mainMark);
        ttPltzKanbanCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzKanbanService.searchCount(ttPltzKanbanCriteria), is(2));
        
        // 6.3
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMark(mainMark);
        ttPltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
        
        // 6.4
        ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo(beforeTtPltzInstrItemNoDomain.getPltzInstrNo());
        ttPltzInstrItemNoCriteria.setItemNo(beforeTtPltzInstrItemNoDomain.getItemNo());
        ttPltzInstrItemNoCriteria.setPkgCd(beforeTtPltzInstrItemNoDomain.getPkgCd());
        TtPltzInstrItemNoDomain afterTtPltzInstrItemNoDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
        assertThat(afterTtPltzInstrItemNoDomain.getPackedQty(), not(beforeTtPltzInstrItemNoDomain.getPackedQty()));
        
        // 6.5
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MYB0803002");
        TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.searchByKey(ttPltzInstrCriteria);
        assertThat(ttPltzInstrDomain.getPltzInstrStatus(), is(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 5, 6
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo5_3() throws Exception {
        
        TtPltzInstrOdrService ttPltzInstrOdrService = (TtPltzInstrOdrService) getContext().getBean("ttPltzInstrOdrService");
        TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo("MYB0803003");
        ttPltzInstrOdrCriteria.setItemNo("A002TB0091B03N");
        ttPltzInstrOdrCriteria.setPkgCd("110");
        List<TtPltzInstrOdrDomain> ttPltzInstrOdrList = ttPltzInstrOdrService.searchByCondition(ttPltzInstrOdrCriteria);
        TtPltzInstrOdrDomain beforeTtPltzInstrOdrDomain = ttPltzInstrOdrList.get(0);
        
        TtPltzInstrItemNoService ttPltzInstrItemNoService = (TtPltzInstrItemNoService) getContext().getBean("ttPltzInstrItemNoService");
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo("MYB0803003");
        ttPltzInstrItemNoCriteria.setItemNo("A002TB0091B03N");
        ttPltzInstrItemNoCriteria.setPkgCd("110");
        TtPltzInstrItemNoDomain beforeTtPltzInstrItemNoDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0803003");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408030001");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getCreateData(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getCreateData().getMainMark()), is(false));
        
        String mainMark = resultDomain.getCreateData().getMainMark();
        
        assertThat(resultDomain.getPalletizeInstrHeader(), notNullValue());
        assertThat(resultDomain.getPalletizeInstrHeader().getRegisterDataList(), notNullValue());
        
        Ws2502RegisterDataListItemDomain rdli = resultDomain.getPalletizeInstrHeader().getRegisterDataList().get(0);
        assertThat(rdli.getMainMarkList(), notNullValue());
        assertThat(rdli.getMainMarkList().get(0).getMainMark(), is(mainMark));
        assertThat(rdli.getKanbanList(), notNullValue());
        assertThat(rdli.getKanbanList().size(), is(0));
        assertThat(rdli.getMixTagList(), notNullValue());
        assertThat(rdli.getMixTagList().size(), is(1));

        // 5.2.1
        ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo(beforeTtPltzInstrOdrDomain.getPltzInstrNo());
        ttPltzInstrOdrCriteria.setItemNo(beforeTtPltzInstrOdrDomain.getItemNo());
        ttPltzInstrOdrCriteria.setPkgCd(beforeTtPltzInstrOdrDomain.getPkgCd());
        ttPltzInstrOdrCriteria.setRcvOdrCompCd(beforeTtPltzInstrOdrDomain.getRcvOdrCompCd());
        ttPltzInstrOdrCriteria.setCustomerCd(beforeTtPltzInstrOdrDomain.getCustomerCd());
        ttPltzInstrOdrCriteria.setLgcyShipTo(beforeTtPltzInstrOdrDomain.getLgcyShipTo());
        ttPltzInstrOdrCriteria.setTrnsCd(beforeTtPltzInstrOdrDomain.getTrnsCd());
        ttPltzInstrOdrCriteria.setEtdDueDt(beforeTtPltzInstrOdrDomain.getEtdDueDt());
        ttPltzInstrOdrCriteria.setCustomerPoNo(beforeTtPltzInstrOdrDomain.getCustomerPoNo());
        ttPltzInstrOdrCriteria.setCustomerItemNo(beforeTtPltzInstrOdrDomain.getCustomerItemNo());
        ttPltzInstrOdrCriteria.setCustomerItemNoOrg(beforeTtPltzInstrOdrDomain.getCustomerItemNoOrg());
        ttPltzInstrOdrCriteria.setOdrCtrlNo(beforeTtPltzInstrOdrDomain.getOdrCtrlNo());
        TtPltzInstrOdrDomain afterTtPltzInstrOdrDomain = ttPltzInstrOdrService.searchByKey(ttPltzInstrOdrCriteria);
        assertThat(afterTtPltzInstrOdrDomain.getPackedQty(), not(beforeTtPltzInstrOdrDomain.getPackedQty()));
        assertThat(afterTtPltzInstrOdrDomain.getPackedFlg(), is(Eca0027Constants.FLAG_N));
        
        // 5.2.2
        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
        ttPltzItemOdrCriteria.setMainMark(mainMark);
        ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(2));
        
        // 6.1
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteria.setMainMark(mainMark);
        ttPltzItemCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(9));
        
        // 6.2
        TtPltzKanbanService ttPltzKanbanService = (TtPltzKanbanService) getContext().getBean("ttPltzKanbanService");
        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
        ttPltzKanbanCriteria.setMainMark(mainMark);
        ttPltzKanbanCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzKanbanService.searchCount(ttPltzKanbanCriteria), is(0));
        
        // 6.3
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMark(mainMark);
        ttPltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
        
        // 6.4
        ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo(beforeTtPltzInstrItemNoDomain.getPltzInstrNo());
        ttPltzInstrItemNoCriteria.setItemNo(beforeTtPltzInstrItemNoDomain.getItemNo());
        ttPltzInstrItemNoCriteria.setPkgCd(beforeTtPltzInstrItemNoDomain.getPkgCd());
        TtPltzInstrItemNoDomain afterTtPltzInstrItemNoDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
        assertThat(afterTtPltzInstrItemNoDomain.getPackedQty(), not(beforeTtPltzInstrItemNoDomain.getPackedQty()));
        
        // 6.5
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MYB0803003");
        TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.searchByKey(ttPltzInstrCriteria);
        assertThat(ttPltzInstrDomain.getPltzInstrStatus(), is(Eca0027Constants.PLTZ_INSTR_STATUS_IN_PROCSS_OF_CML_CREATE));
        
        // 6.6
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
        ttMixtagCriteria.setMixTagNo("MMYBWH01408030001");
        TtMixtagDomain ttMixtagDomain = ttMixtagService.searchByKey(ttMixtagCriteria);
        assertThat(ttMixtagDomain.getMixTagStatus(), is(Eca0027Constants.MIX_TAG_STATUS_CML));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 5, 6
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo5_4() throws Exception {
        
        TtPltzInstrOdrService ttPltzInstrOdrService = (TtPltzInstrOdrService) getContext().getBean("ttPltzInstrOdrService");
        TtPltzInstrOdrCriteriaDomain ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo("MYB0805001");
        ttPltzInstrOdrCriteria.setItemNo("A002TB0091B03N");
        ttPltzInstrOdrCriteria.setPkgCd("110");
        List<TtPltzInstrOdrDomain> ttPltzInstrOdrList = ttPltzInstrOdrService.searchByCondition(ttPltzInstrOdrCriteria);
        TtPltzInstrOdrDomain beforeTtPltzInstrOdrDomain = ttPltzInstrOdrList.get(0);
        
        TtPltzInstrItemNoService ttPltzInstrItemNoService = (TtPltzInstrItemNoService) getContext().getBean("ttPltzInstrItemNoService");
        TtPltzInstrItemNoCriteriaDomain ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo("MYB0805001");
        ttPltzInstrItemNoCriteria.setItemNo("A002TB0091B03N");
        ttPltzInstrItemNoCriteria.setPkgCd("110");
        TtPltzInstrItemNoDomain beforeTtPltzInstrItemNoDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getCreateData(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getCreateData().getMainMark()), is(false));
        
        String mainMark = resultDomain.getCreateData().getMainMark();
        
        assertThat(resultDomain.getPalletizeInstrHeader(), notNullValue());
        assertThat(resultDomain.getPalletizeInstrHeader().getRegisterDataList(), notNullValue());
        
        Ws2502RegisterDataListItemDomain rdli = resultDomain.getPalletizeInstrHeader().getRegisterDataList().get(0);
        assertThat(rdli.getMainMarkList(), notNullValue());
        assertThat(rdli.getMainMarkList().get(0).getMainMark(), is(mainMark));
        assertThat(rdli.getKanbanList(), notNullValue());
        assertThat(rdli.getKanbanList().size(), is(0));
        assertThat(rdli.getMixTagList(), notNullValue());
        assertThat(rdli.getMixTagList().size(), is(1));

        // 5.2.1
        ttPltzInstrOdrCriteria = new TtPltzInstrOdrCriteriaDomain();
        ttPltzInstrOdrCriteria.setPltzInstrNo(beforeTtPltzInstrOdrDomain.getPltzInstrNo());
        ttPltzInstrOdrCriteria.setItemNo(beforeTtPltzInstrOdrDomain.getItemNo());
        ttPltzInstrOdrCriteria.setPkgCd(beforeTtPltzInstrOdrDomain.getPkgCd());
        ttPltzInstrOdrCriteria.setRcvOdrCompCd(beforeTtPltzInstrOdrDomain.getRcvOdrCompCd());
        ttPltzInstrOdrCriteria.setCustomerCd(beforeTtPltzInstrOdrDomain.getCustomerCd());
        ttPltzInstrOdrCriteria.setLgcyShipTo(beforeTtPltzInstrOdrDomain.getLgcyShipTo());
        ttPltzInstrOdrCriteria.setTrnsCd(beforeTtPltzInstrOdrDomain.getTrnsCd());
        ttPltzInstrOdrCriteria.setEtdDueDt(beforeTtPltzInstrOdrDomain.getEtdDueDt());
        ttPltzInstrOdrCriteria.setCustomerPoNo(beforeTtPltzInstrOdrDomain.getCustomerPoNo());
        ttPltzInstrOdrCriteria.setCustomerItemNo(beforeTtPltzInstrOdrDomain.getCustomerItemNo());
        ttPltzInstrOdrCriteria.setCustomerItemNoOrg(beforeTtPltzInstrOdrDomain.getCustomerItemNoOrg());
        ttPltzInstrOdrCriteria.setOdrCtrlNo(beforeTtPltzInstrOdrDomain.getOdrCtrlNo());
        TtPltzInstrOdrDomain afterTtPltzInstrOdrDomain = ttPltzInstrOdrService.searchByKey(ttPltzInstrOdrCriteria);
        assertThat(afterTtPltzInstrOdrDomain.getPackedQty(), not(beforeTtPltzInstrOdrDomain.getPackedQty()));
        assertThat(afterTtPltzInstrOdrDomain.getPackedFlg(), is(Eca0027Constants.FLAG_Y));
        
        // 5.2.2
        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
        ttPltzItemOdrCriteria.setMainMark(mainMark);
        ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(2));
        
        // 6.1
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteria.setMainMark(mainMark);
        ttPltzItemCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(10));
        
        // 6.2
        TtPltzKanbanService ttPltzKanbanService = (TtPltzKanbanService) getContext().getBean("ttPltzKanbanService");
        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
        ttPltzKanbanCriteria.setMainMark(mainMark);
        ttPltzKanbanCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzKanbanService.searchCount(ttPltzKanbanCriteria), is(2));
        
        // 6.3
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMark(mainMark);
        ttPltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
        
        // 6.4
        ttPltzInstrItemNoCriteria = new TtPltzInstrItemNoCriteriaDomain();
        ttPltzInstrItemNoCriteria.setPltzInstrNo(beforeTtPltzInstrItemNoDomain.getPltzInstrNo());
        ttPltzInstrItemNoCriteria.setItemNo(beforeTtPltzInstrItemNoDomain.getItemNo());
        ttPltzInstrItemNoCriteria.setPkgCd(beforeTtPltzInstrItemNoDomain.getPkgCd());
        TtPltzInstrItemNoDomain afterTtPltzInstrItemNoDomain = ttPltzInstrItemNoService.searchByKey(ttPltzInstrItemNoCriteria);
        assertThat(afterTtPltzInstrItemNoDomain.getPackedQty(), not(beforeTtPltzInstrItemNoDomain.getPackedQty()));
        
        // 6.5
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MYB0805001");
        TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.searchByKey(ttPltzInstrCriteria);
        assertThat(ttPltzInstrDomain.getPltzInstrStatus(), is(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE));
        
        // 6.6
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TtMixtagCriteriaDomain ttMixtagCriteria = new TtMixtagCriteriaDomain();
        ttMixtagCriteria.setMixTagNo("MMYBWH01408050002");
        TtMixtagDomain ttMixtagDomain = ttMixtagService.searchByKey(ttMixtagCriteria);
        assertThat(ttMixtagDomain.getMixTagStatus(), is(Eca0027Constants.MIX_TAG_STATUS_CML));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 5, 6
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo5_5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0827001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "20");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "");
        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "");
        wsCallerRestDomain.setParamMap("outerCdQty", "");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("0"));
        assertThat(resultDomain.getErrorList().size(), is(0));
        assertThat(resultDomain.getCreateData(), notNullValue());
        assertThat(CheckUtil.isBlankOrNull(resultDomain.getCreateData().getMainMark()), is(false));
        
        String mainMark = resultDomain.getCreateData().getMainMark();
        
        assertThat(resultDomain.getPalletizeInstrHeader(), notNullValue());
        assertThat(resultDomain.getPalletizeInstrHeader().getRegisterDataList(), notNullValue());
        
        Ws2502RegisterDataListItemDomain rdli = resultDomain.getPalletizeInstrHeader().getRegisterDataList().get(0);
        assertThat(rdli.getMainMarkList(), notNullValue());
        assertThat(rdli.getMainMarkList().get(0).getMainMark(), is(mainMark));
        assertThat(rdli.getKanbanList(), notNullValue());
        assertThat(rdli.getKanbanList().size(), is(1));
        assertThat(rdli.getMixTagList(), notNullValue());
        assertThat(rdli.getMixTagList().size(), is(0));
        
        // 5.2.2
        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
        ttPltzItemOdrCriteria.setMainMark(mainMark);
        ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(1));
        
        // 6.1
        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
        ttPltzItemCriteria.setMainMark(mainMark);
        ttPltzItemCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(2));
        
        // 6.2
        TtPltzKanbanService ttPltzKanbanService = (TtPltzKanbanService) getContext().getBean("ttPltzKanbanService");
        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
        ttPltzKanbanCriteria.setMainMark(mainMark);
        ttPltzKanbanCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzKanbanService.searchCount(ttPltzKanbanCriteria), is(1));
        
        // 6.3
        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
        ttPltzCriteria.setMainMark(mainMark);
        ttPltzCriteria.setSearchCountCheckFlg(false);
        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
        
        // 6.5
        TtPltzInstrService ttPltzInstrService = (TtPltzInstrService) getContext().getBean("ttPltzInstrService");
        TtPltzInstrCriteriaDomain ttPltzInstrCriteria = new TtPltzInstrCriteriaDomain();
        ttPltzInstrCriteria.setPltzInstrNo("MYB0827001");
        TtPltzInstrDomain ttPltzInstrDomain = ttPltzInstrService.searchByKey(ttPltzInstrCriteria);
        assertThat(ttPltzInstrDomain.getPltzInstrStatus(), is(Eca0027Constants.PLTZ_INSTR_STATUS_ALL_CML_CREATE));
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
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
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,499999");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("G/W"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (Length)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_3() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Length"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (Volume)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_4() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Vol."));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (Width)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_5() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Width"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (Height)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_6() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Height"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (Length)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_7() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0803002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "20");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "");
        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
        wsCallerRestDomain.setParamMap("outerCdQty", "3");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Length"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (Width)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_8() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0803002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "20");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "");
        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
        wsCallerRestDomain.setParamMap("outerCdQty", "3");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Width"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (Height)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_9() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0803002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "20");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "");
        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
        wsCallerRestDomain.setParamMap("outerCdQty", "3");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Height"));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 桁あふれ (Volume)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoX_10() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0803002");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B03N");
        wsCallerRestDomain.setParamMap("pkgCd", "110");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "20");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "");
        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
        wsCallerRestDomain.setParamMap("outerCdQty", "3");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Vol."));
    }

    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 採番 (範囲オーバー)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfoY_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_0005"));
    }

    // CommonService#transactSequence をデバッグで止めてエラーが発生する状況を作る必要がある
    /**
     * <br />Webサービスのテスト (正常系)
     * テストケース: 採番 (データ競合)
     * 
     * @throws Exception テストに失敗した場合
     */
    @Ignore
    @Test
    public void testSetPalletizeInfoY_2() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("pltzInstrNo", "MYB0805001");
        wsCallerRestDomain.setParamMap("palletNo", "S901");
        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01408050002");
        wsCallerRestDomain.setParamMap("pkgCd", "");
        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
        wsCallerRestDomain.setParamMap("indusTypCd", "");
        wsCallerRestDomain.setParamMap("kanbanTyp", "");
        wsCallerRestDomain.setParamMap("tagSeqNo", "");
        wsCallerRestDomain.setParamMap("kanbanQty", "0");
        wsCallerRestDomain.setParamMap("customerItemNo", "");
        wsCallerRestDomain.setParamMap("customeTagSeqNo", "");
        wsCallerRestDomain.setParamMap("outerCd", "7777");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
        wsCallerRestDomain.setParamMap("outerCdQty", "3,10");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2502ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E7_0005"));
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
