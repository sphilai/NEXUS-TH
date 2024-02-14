/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.ws.rest.resource;

import static com.globaldenso.ai.library.webservicecallrest.WebServiceCallerRest.post;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.AbstractEca0027Test;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaEnvDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpItemNoSpInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaEnvCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtCmlErrorHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaEnvService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.business.domain.Ws2503ResultDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.sun.jersey.api.client.GenericType;

/**
 * <br />Ws2503Resourceのテストクラス
 * <pre>
 * 「djUnit テスト」で実行すること。
 * </pre>
 * 
 * @version $Revision: 11315 $
 */
@RunWith(Ws25xxResourceTestRunner.class)
public class Ws2503ResourceTest extends AbstractEca0027Test {

    /** WEBサービスの結果タイプ */
    private static final GenericType<Ws2503ResultDomain> RESULT_TYPE = new GenericType<Ws2503ResultDomain>() {};

    /** エラー作成日時のフォーマット */
    private static final SimpleDateFormat ERR_CREATE_TIMESTAMP_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    /** WebServiceCallerRestDomain オブジェクト */
    private WebServiceCallerRestDomain wsCallerRestDomain;

    /**
     * <br />デフォルトコンストラクタ
     */
    public Ws2503ResourceTest() {
    }

    /**
     * テストデータの準備
     * 
     * @throws ApplicationException 何らかのエラーが発生した場合
     */
    @Before
    public void setUpData() throws ApplicationException {
        
        TmCigmaEnvService tmCigmaEnvService = (TmCigmaEnvService) getContext().getBean("tmCigmaEnvService");
        TmPkgSpecDtlService tmPkgSpecificationDtlService = (TmPkgSpecDtlService) getContext().getBean("tmPkgSpecificationDtlService");
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService = (TmExpItemNoSpInfoService) getContext().getBean("tmExpItemNoSpInfoService");
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TtMixtagItemNoService ttMixtagItemNoService = (TtMixtagItemNoService) getContext().getBean("ttMixtagItemNoService");
        TmPkgSetHdrService tmPkgSetHdrService = (TmPkgSetHdrService) getContext().getBean("tmPkgSetHdrService");
        TmNxsCompService tmNxsCompService = (TmNxsCompService) getContext().getBean("tmNxsCompService");
        
        if ("testSetPalletizeInfo2".equals(testNameRule.getMethodName())) {
            TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
            criteria.setCompCd("TG0");
            TmCigmaEnvDomain domain = new TmCigmaEnvDomain();
            domain.setAccessibilityTyp(Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NA);
            tmCigmaEnvService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_5".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            domain.setLengthUnit("");
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp("X");
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_2".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
            criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B07N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-007");
            domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_3".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setInvoiceKey("XXX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_4".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerSortingKey("XXX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_6".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_BACK);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_7".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_Y);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_8".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerLooseTyp(Eca0027Constants.CONTAINER_LOOSE_TYP_L);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_9".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setCustomTimingTyp(Eca0027Constants.CUSTOM_TIMING_TYPE_Z);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_2_3".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo5_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_2_5".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLgcyShipTo("XX");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_2_6".equals(testNameRule.getMethodName())) {
            TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("a002TB0091B06N");
            tmExpFormalitiItemNoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_3_2".equals(testNameRule.getMethodName())) {
            TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
            criteria.setMixTagNo("MMYBWH01406230001");
            TtMixtagDomain domain = new TtMixtagDomain();
            domain.setMixTagStatus(Eca0027Constants.MIX_TAG_STATUS_CML);
            ttMixtagService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_3_3".equals(testNameRule.getMethodName())) {
            TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
            criteria.setMixTagNo("MMYBWH01406230001");
            TtMixtagDomain domain = new TtMixtagDomain();
            domain.setWhCompCd("XXX");
            ttMixtagService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo6_2".equals(testNameRule.getMethodName())
            || testNameRule.getMethodName().startsWith("testSetPalletizeInfoX_")) {
            String mixTagNo = "MMYBWH01406230001";
            
            TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
            criteria.setMixTagNo(mixTagNo);
            TtMixtagDomain domain = new TtMixtagDomain();
            domain.setMixTagStatus(Eca0027Constants.MIX_TAG_STATUS_MIXTAG);
            ttMixtagService.updateByCondition(domain, criteria);
            
            if ("testSetPalletizeInfoX_1".equals(testNameRule.getMethodName())) {
                TtMixtagItemNoCriteriaDomain ttMixtagItemNoCriteria = new TtMixtagItemNoCriteriaDomain();
                ttMixtagItemNoCriteria.setMixTagNo(mixTagNo);
                ttMixtagItemNoCriteria.setItemNo("A002TB0091B06N");
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
                tmPkgSetHdrDomain.setWidth(new BigDecimal("9999.999"));
                //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
                
                TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
                tmNxsCompCriteria.setCompCd("MYB");
                TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
                tmNxsCompDomain.setLengthUnit("MM");
                tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
                
            } else if ("testSetPalletizeInfoX_5".equals(testNameRule.getMethodName())) {
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
                
            } else if ("testSetPalletizeInfoX_6".equals(testNameRule.getMethodName())) {
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
                
            } else if ("testSetPalletizeInfoX_7".equals(testNameRule.getMethodName())) {
                TmPkgSpecDtlCriteriaDomain tmPkgSpecificationDtlCriteria = new TmPkgSpecDtlCriteriaDomain();
                tmPkgSpecificationDtlCriteria.setOwnerComp("MYB");
                tmPkgSpecificationDtlCriteria.setItemNoGrp("G1");
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B06N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-006");
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
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B06N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-006");
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
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B06N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-006");
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
                tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B06N");
                tmPkgSpecificationDtlCriteria.setPkgCd("110");
                tmPkgSpecificationDtlCriteria.setTrnsCd("S");
                //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
                //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
                tmPkgSpecificationDtlCriteria.setNProc(" ");
                tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
                tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-006");
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
                
            }
            
        } else if ("testSetPalletizeInfo6_3".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_SINGLE);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
        }
    }

    /**
     * WebServiceCallerRestDomain の準備
     */
    @Before
    public void setUpWebServiceCallerRestDomain() {

        setDensoContext("10088NXS0010");

        wsCallerRestDomain = new WebServiceCallerRestDomain();
        wsCallerRestDomain.setUrl("http://localhost:8080/NEXUS_EXPORT/rest/ws2503");
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
        TmPkgSpecDtlService tmPkgSpecificationDtlService = (TmPkgSpecDtlService) getContext().getBean("tmPkgSpecificationDtlService");
        TmExpItemNoSpInfoService tmExpItemNoSpInfoService = (TmExpItemNoSpInfoService) getContext().getBean("tmExpItemNoSpInfoService");
        TmExpFormalitiItemNoService tmExpFormalitiItemNoService = (TmExpFormalitiItemNoService) getContext().getBean("tmExpFormalitiItemNoService");
        TtMixtagService ttMixtagService = (TtMixtagService) getContext().getBean("ttMixtagService");
        TtMixtagItemNoService ttMixtagItemNoService = (TtMixtagItemNoService) getContext().getBean("ttMixtagItemNoService");
        TmPkgSetHdrService tmPkgSetHdrService = (TmPkgSetHdrService) getContext().getBean("tmPkgSetHdrService");
        TmNxsCompService tmNxsCompService = (TmNxsCompService) getContext().getBean("tmNxsCompService");
        
        if ("testSetPalletizeInfo2".equals(testNameRule.getMethodName())) {
            TmCigmaEnvCriteriaDomain criteria = new TmCigmaEnvCriteriaDomain();
            criteria.setCompCd("MYB");
            TmCigmaEnvDomain domain = new TmCigmaEnvDomain();
            domain.setAccessibilityTyp(Eca0027Constants.CIGMA_ENV_ACCESSIBILITY_TYP_NORMAL);
            tmCigmaEnvService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo3_2_5".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            domain.setLengthUnit("CM");
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_2".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
            criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B07N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-007");
            domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_3".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setInvoiceKey("NMY");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_4".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerSortingKey("ZA001001");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_6".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLoadingCd(Eca0027Constants.LOADING_CD_DOOR);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_7".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setStgInstrItemFlg(Eca0027Constants.FLAG_N);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_8".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setContainerLooseTyp(Eca0027Constants.CONTAINER_LOOSE_TYP_C);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_1_9".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("00");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setCustomTimingTyp(Eca0027Constants.CUSTOM_TIMING_TYPE_A);
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_2_3".equals(testNameRule.getMethodName())
            || "testSetPalletizeInfo5_1_1".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_2_5".equals(testNameRule.getMethodName())) {
            TmExpItemNoSpInfoCriteriaDomain criteria = new TmExpItemNoSpInfoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setCustomerCd("30001206");
            criteria.setLgcyShipTo("XX");
            TmExpItemNoSpInfoDomain domain = new TmExpItemNoSpInfoDomain();
            domain.setLgcyShipTo("00");
            tmExpItemNoSpInfoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_2_6".equals(testNameRule.getMethodName())) {
            TmExpFormalitiItemNoCriteriaDomain criteria = new TmExpFormalitiItemNoCriteriaDomain();
            criteria.setCompCd("MYB");
            criteria.setItemNo("a002TB0091B06N");
            TmExpFormalitiItemNoDomain domain = new TmExpFormalitiItemNoDomain();
            domain.setItemNo("A002TB0091B06N");
            tmExpFormalitiItemNoService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo4_3_3".equals(testNameRule.getMethodName())) {
            TtMixtagCriteriaDomain criteria = new TtMixtagCriteriaDomain();
            criteria.setMixTagNo("MMYBWH01406230001");
            TtMixtagDomain domain = new TtMixtagDomain();
            domain.setWhCompCd("MYB");
            ttMixtagService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfo6_3".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
            TmPkgSpecDtlDomain domain = new TmPkgSpecDtlDomain();
            //domain.setPkgFormTyp(Eca0027Constants.PKG_FORM_TYP_MULTI);
            //tmPkgSpecificationDtlService.updateByCondition(domain, criteria);
            
        } else if ("testSetPalletizeInfoX_1".equals(testNameRule.getMethodName())) {
            TtMixtagItemNoCriteriaDomain ttMixtagItemNoCriteria = new TtMixtagItemNoCriteriaDomain();
            ttMixtagItemNoCriteria.setMixTagNo("MMYBWH01406230001");
            ttMixtagItemNoCriteria.setItemNo("A002TB0091B06N");
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
            tmPkgSetHdrDomain.setWidth(new BigDecimal("0.97"));
            //tmPkgSetHdrService.updateByCondition(tmPkgSetHdrDomain, tmPkgSetHdrCriteria);
            
            TmNxsCompCriteriaDomain tmNxsCompCriteria = new TmNxsCompCriteriaDomain();
            tmNxsCompCriteria.setCompCd("MYB");
            TmNxsCompDomain tmNxsCompDomain = new TmNxsCompDomain();
            tmNxsCompDomain.setLengthUnit("MR");
            tmNxsCompService.updateByCondition(tmNxsCompDomain, tmNxsCompCriteria);
            
        } else if ("testSetPalletizeInfoX_5".equals(testNameRule.getMethodName())) {
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
            
        } else if ("testSetPalletizeInfoX_6".equals(testNameRule.getMethodName())) {
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
            
        } else if ("testSetPalletizeInfoX_7".equals(testNameRule.getMethodName())) {
            TmPkgSpecDtlCriteriaDomain criteria = new TmPkgSpecDtlCriteriaDomain();
            criteria.setOwnerComp("MYB");
            criteria.setItemNoGrp("G1");
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
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
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
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
            criteria.setItemNo("A002TB0091B06N");
            criteria.setPkgCd("110");
            criteria.setTrnsCd("S");
            //criteria.setIsltdPurchaseFlg("0");
            //criteria.setIsltdStorageFlg("0");
            //criteria.setIsltdShippingFlg("1");
            criteria.setNProc(" ");
            criteria.setRev(new BigDecimal("1"));
            criteria.setPkgItemNo("PKGITEMENO-006");
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
            tmPkgSpecificationDtlCriteria.setItemNo("A002TB0091B06N");
            tmPkgSpecificationDtlCriteria.setPkgCd("110");
            tmPkgSpecificationDtlCriteria.setTrnsCd("S");
            //tmPkgSpecificationDtlCriteria.setIsltdPurchaseFlg("0");
            //tmPkgSpecificationDtlCriteria.setIsltdStorageFlg("0");
            //tmPkgSpecificationDtlCriteria.setIsltdShippingFlg("1");
            tmPkgSpecificationDtlCriteria.setNProc(" ");
            tmPkgSpecificationDtlCriteria.setRev(new BigDecimal("1"));
            tmPkgSpecificationDtlCriteria.setPkgItemNo("PKGITEMENO-006");
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
            
        }
    }
    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.1.1～1.1.4
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_1() throws Exception {
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(4));
//        
//        int count = 0;
//        for (ErrorListItemDomain error : resultDomain.getErrorList()) {
//            if ("NXS_E1_5016".equals(error.getErrorCode())) {
//                count++;
//            }
//        }
//        assertThat(count, is(4));
//    }
    
    /**
     * <br />Webサービスのテスト (異常系)
     * テストケース: 1.2.1
     * 
     * @throws Exception テストに失敗した場合
     */
    @Test
    public void testSetPalletizeInfo1_2_1() throws Exception {
        
        // パラメータを設定する
        wsCallerRestDomain.setParamMap("shipperCd", "TG0");
        wsCallerRestDomain.setParamMap("customerCd", "30004400");
        wsCallerRestDomain.setParamMap("lgcyShipTo", "04");
        wsCallerRestDomain.setParamMap("trnsCd", "S");
        wsCallerRestDomain.setParamMap("plntCd", "A1");
        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
        wsCallerRestDomain.setParamMap("whCompCd", "TG0");
        wsCallerRestDomain.setParamMap("whCd", "A11C");
        wsCallerRestDomain.setParamMap("whFlg", "Y");
        wsCallerRestDomain.setParamMap("palletNo", "S902");
        wsCallerRestDomain.setParamMap("itemNo", "TG104210-98109L");
        wsCallerRestDomain.setParamMap("pkgCd", " ");
        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
        wsCallerRestDomain.setParamMap("indusTypCd", "1");
        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
        wsCallerRestDomain.setParamMap("kanbanQty", "10");
        wsCallerRestDomain.setParamMap("outerCd", "CB02");
        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
        wsCallerRestDomain.setParamMap("outerCdItemNo", "SHIBATA1");
        wsCallerRestDomain.setParamMap("outerCdQty", "1");
        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
        wsCallerRestDomain.setParamMap("errScreenId", null);
        wsCallerRestDomain.setParamMap("errMsgId", null);
        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
        
        // Webサービスを呼び出す
        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
        
        assertThat(resultDomain.getResultCode(), is("1"));
        assertThat(resultDomain.getErrorList().size(), is(1));
        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
    }
    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.2.2
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_2_2() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N,A002TB0091B08N,MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110,110,");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N,N,Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1,1,");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1,1,");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1,1,");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10,10,0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.2.3
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_2_3() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N,A002TB0091B08N,MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110,110,");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N,N,Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1,1,");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1,1,");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1,1,");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10,10,0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.2.4
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_2_4() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N,A002TB0091B08N,MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110,110,");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N,N,Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1,1,");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1,1,");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1,1,");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10,10,0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.2.5
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_2_5() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N,A002TB0091B08N,MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110,110,");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N,N,Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1,1,");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1,1,");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1,1,");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10,10,0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.3.1
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_3_1() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", null);
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.3.2
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_3_2() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", null);
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.3.3
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_3_3() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", null);
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.3.4
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_3_4() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", null);
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.3.5
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_3_5() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", null);
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.3.6
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_3_6() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", null);
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.3.7
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_3_7() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", null);
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.3.8
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_3_8() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", null);
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.4.1
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_4_1() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", null);
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.4.2
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_4_2() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", null);
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.5.1
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_5_1() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", null);
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.5.2
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_5_2() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", null);
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.6.1
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_6_1() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", null);
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.6.2
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_6_2() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", null);
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.6.3
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_6_3() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/19 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/19 21:06:30");
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.6.4
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_6_4() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/19 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/19 21:06:30");
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.6.5
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_6_5() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
//        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/19 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/19 21:06:30");
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.6.6
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_6_6() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
//        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/19 21:06:30");
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 1.6.7
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo1_6_7() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:15:35");
//        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
//        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/19 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5016"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 2.1.1
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo2() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5062"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: DSC-ID 不正
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo2_x() throws Exception {
//
//        setDensoContext("X");
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
//        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/19 21:06:30");
//        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/19 21:07:30");
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5031"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.2.1
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_2_1() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "XXXX");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030,PKGITEMENO-200");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3,20");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5008"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.2.2
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_2_2() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "XXXX");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5009"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.2.3
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_2_3() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "XXXXX");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5010"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.2.4
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_2_4() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B01NY");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5068"));
//    }
//    
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.2.5
//     * 
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_2_5() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//        
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//        
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5070"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.3.1, 3.3.5
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_3_1() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "XX");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultA(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.3.2, 3.3.5
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_3_2() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "XXXXX");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultB(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.3.3, 3.3.5
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_3_3() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "X");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultC(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 3.3.4, 3.3.5
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo3_3_4() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "XXXX");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultD(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.1, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_1() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultE(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.2, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_2() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultE(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.3, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_3() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultF(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.4, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_4() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultG(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.5, 4.2.4, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_5() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B09N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultH(), is("NG"));
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.6, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_6() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultI(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.7, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_7() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultJ(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.8, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_8() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultK(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.1.9, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_1_9() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultL(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.2.1, 4.2.2, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_2_1() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "300000,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultM(), is("NG"));
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultO(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.2.3, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_2_3() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "300000");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 1);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultO(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.2.5, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_2_5() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.2.6, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_2_6() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 2);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultP(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.3.2, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_3_2() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 1);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultQ(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 4.3.3, 4.4.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo4_3_3() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("3"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getErrorReport(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getErrorReport().getErrCreateTimestamp()), is(false));
//
//        String timestamp = resultDomain.getErrorReport().getErrCreateTimestamp();
//        TtCmlErrorHeaderDomain ttCmlErrorHeaderDomain = assertCountTtCmlErrorHeader(timestamp);
//        assertCountTtCmlErrorDtl(timestamp, 1);
//        assertThat(timestamp, ttCmlErrorHeaderDomain.getChkResultR(), is("NG"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 5.1.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo5_1_1() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "1");
//        wsCallerRestDomain.setParamMap("outerCd", null);
//        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("2"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//    }
//
//    /**
//     * <br />Webサービスのテスト (異常系)
//     * テストケース: 5.2.1
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo5_2_1() throws Exception {
//
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "1");
//        wsCallerRestDomain.setParamMap("outerCd", null);
//        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("2"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 6, 7
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo6_1() throws Exception {
//
//        Timestamp startTimestamp = new Timestamp(new Date().getTime());
//        
//        TtExpRcvOdrService ttExpRcvOdrService = (TtExpRcvOdrService) getContext().getBean("ttExpRcvOdrService");
//        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
//        ttExpRcvOdrCriteria.setRcvOdrCompCd("MYB");
//        ttExpRcvOdrCriteria.setCustomerCd("30001206");
//        ttExpRcvOdrCriteria.setLgcyShipTo("00");
//        ttExpRcvOdrCriteria.setTrnsCd("S");
//        ttExpRcvOdrCriteria.setItemNo("A002TB0091B06N");
//        ttExpRcvOdrCriteria.setPkgCd("110");
//        ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);
//        ttExpRcvOdrCriteria.setShippedTyp(SHIPPED_TYP_INCOMPLATE_PACKING);
//        List<TtExpRcvOdrDomain> ttExpRcvOdrList = ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);
//        TtExpRcvOdrDomain beforeTtExpRcvOdrDomain = ttExpRcvOdrList.get(0);
//        
//        TtTmpStockService ttTmpStockService = (TtTmpStockService) getContext().getBean("ttTmpStockService");
//        TtTmpStockCriteriaDomain ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
//        ttTmpStockCriteria.setShipperCd("MYB");
//        ttTmpStockCriteria.setLgcyWhCd("1");
//        ttTmpStockCriteria.setItemNo("A002TB0091B06N");
//        ttTmpStockCriteria.setPkgCd("110");
//        TtTmpStockDomain beforeTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N,A002TB0091B07N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110,110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N,N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1,1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1,1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "10,10");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
//        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/19 21:06:30");
//        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/19 21:07:30");
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("0"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getPalletizeHeader(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getPalletizeHeader().getMainMark()), is(false));
//        
//        String mainMark = resultDomain.getPalletizeHeader().getMainMark();
//
//        // 6.1.1
//        ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
//        ttExpRcvOdrCriteria.setRcvOdrCompCd(beforeTtExpRcvOdrDomain.getRcvOdrCompCd());
//        ttExpRcvOdrCriteria.setCustomerCd(beforeTtExpRcvOdrDomain.getCustomerCd());
//        ttExpRcvOdrCriteria.setLgcyShipTo(beforeTtExpRcvOdrDomain.getLgcyShipTo());
//        ttExpRcvOdrCriteria.setItemNo(beforeTtExpRcvOdrDomain.getItemNo());
//        ttExpRcvOdrCriteria.setPkgCd(beforeTtExpRcvOdrDomain.getPkgCd());
//        ttExpRcvOdrCriteria.setTrnsCd(beforeTtExpRcvOdrDomain.getTrnsCd());
//        ttExpRcvOdrCriteria.setEtdDueDt(beforeTtExpRcvOdrDomain.getEtdDueDt());
//        ttExpRcvOdrCriteria.setCustomerPoNo(beforeTtExpRcvOdrDomain.getCustomerPoNo());
//        ttExpRcvOdrCriteria.setCustomerItemNo(beforeTtExpRcvOdrDomain.getCustomerItemNo());
//        ttExpRcvOdrCriteria.setCustomerItemNoOrg(beforeTtExpRcvOdrDomain.getCustomerItemNoOrg());
//        ttExpRcvOdrCriteria.setOdrCtrlNo(beforeTtExpRcvOdrDomain.getOdrCtrlNo());
//        TtExpRcvOdrDomain afterTtExpRcvOdr = ttExpRcvOdrService.searchByKey(ttExpRcvOdrCriteria);
//        assertThat(afterTtExpRcvOdr.getPltzAllocQty(), not(beforeTtExpRcvOdrDomain.getPltzAllocQty()));
//        
//        // 6.1.2
//        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
//        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
//        ttPltzItemOdrCriteria.setMainMark(mainMark);
//        ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(2));
//        
//        // 7.1
//        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
//        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
//        ttPltzItemCriteria.setMainMark(mainMark);
//        ttPltzItemCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(9));
//        
//        // 7.2
//        TtPltzKanbanService ttPltzKanbanService = (TtPltzKanbanService) getContext().getBean("ttPltzKanbanService");
//        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
//        ttPltzKanbanCriteria.setMainMark(mainMark);
//        ttPltzKanbanCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzKanbanService.searchCount(ttPltzKanbanCriteria), is(2));
//        
//        // 7.3
//        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
//        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
//        ttPltzCriteria.setMainMark(mainMark);
//        ttPltzCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
//        
//        // 7.5
//        ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
//        ttTmpStockCriteria.setShipperCd(beforeTtTmpStockDomain.getShipperCd());
//        ttTmpStockCriteria.setLgcyWhCd(beforeTtTmpStockDomain.getLgcyWhCd());
//        ttTmpStockCriteria.setItemNo(beforeTtTmpStockDomain.getItemNo());
//        ttTmpStockCriteria.setPkgCd(beforeTtTmpStockDomain.getPkgCd());
//        TtTmpStockDomain afterTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
//        assertThat(afterTtTmpStockDomain.getQty(), not(beforeTtTmpStockDomain.getQty()));
//        
//        // 7.7.1
//        TtBhtWorkTimeService ttBhtWorkTimeService = (TtBhtWorkTimeService) getContext().getBean("ttBhtWorkTimeService");
//        TtBhtWorkTimeCriteriaDomain ttBhtWorkTimeCriteria = new TtBhtWorkTimeCriteriaDomain();
//        ttBhtWorkTimeCriteria.setDscId(DensoContext.get().getDscId());
//        ttBhtWorkTimeCriteria.setCompCd("MYA");
//        ttBhtWorkTimeCriteria.setPreferredOrder("WORK_TIME_NO desc");
//        List<TtBhtWorkTimeDomain> ttBhtWorkTimeList = ttBhtWorkTimeService.searchByCondition(ttBhtWorkTimeCriteria);
//        assertThat(startTimestamp.compareTo(ttBhtWorkTimeList.get(0).getComCreateTimestamp()), is(-1));
//        
//        // 7.7.2
//        TtBhtWorkPltzService ttBhtWorkPltzService = (TtBhtWorkPltzService) getContext().getBean("ttBhtWorkPltzService");
//        TtBhtWorkPltzCriteriaDomain ttBhtWorkPltzCriteria = new TtBhtWorkPltzCriteriaDomain();
//        ttBhtWorkPltzCriteria.setWorkTimeNo(ttBhtWorkTimeList.get(0).getWorkTimeNo());
//        ttBhtWorkPltzCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttBhtWorkPltzService.searchCount(ttBhtWorkPltzCriteria), is(1));
//        
//        // 7.7.3
//        TtBhtWorkErrService ttBhtWorkErrService = (TtBhtWorkErrService) getContext().getBean("ttBhtWorkErrService");
//        TtBhtWorkErrCriteriaDomain ttBhtWorkErrCriteria = new TtBhtWorkErrCriteriaDomain();
//        ttBhtWorkErrCriteria.setWorkTimeNo(ttBhtWorkTimeList.get(0).getWorkTimeNo());
//        ttBhtWorkErrCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttBhtWorkErrService.searchCount(ttBhtWorkErrCriteria), is(1));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 6, 7
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo6_2() throws Exception {
//        
//        TtMixtagItemNoService ttMixtagItemNoService = (TtMixtagItemNoService) getContext().getBean("ttMixtagItemNoService");
//        TtMixtagItemNoCriteriaDomain ttMixtagItemNoCriteria = new TtMixtagItemNoCriteriaDomain();
//        ttMixtagItemNoCriteria.setMixTagNo("MMYBWH01406230001");
//        List<TtMixtagItemNoDomain> ttMixTagItemNoList = ttMixtagItemNoService.searchByCondition(ttMixtagItemNoCriteria);
//        TtMixtagItemNoDomain ttMixtagItemNoDomain = ttMixTagItemNoList.get(0);
//        
//        TtExpRcvOdrService ttExpRcvOdrService = (TtExpRcvOdrService) getContext().getBean("ttExpRcvOdrService");
//        TtExpRcvOdrCriteriaDomain ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
//        ttExpRcvOdrCriteria.setRcvOdrCompCd("MYB");
//        ttExpRcvOdrCriteria.setCustomerCd("30001206");
//        ttExpRcvOdrCriteria.setLgcyShipTo("00");
//        ttExpRcvOdrCriteria.setTrnsCd("S");
//        ttExpRcvOdrCriteria.setItemNo(ttMixtagItemNoDomain.getItemNo());
//        ttExpRcvOdrCriteria.setPkgCd(ttMixtagItemNoDomain.getPkgCd());
//        ttExpRcvOdrCriteria.setOdrFirmFlg(FLAG_Y);
//        ttExpRcvOdrCriteria.setShippedTyp(SHIPPED_TYP_INCOMPLATE_PACKING);
//        List<TtExpRcvOdrDomain> ttExpRcvOdrList = ttExpRcvOdrService.searchByCondition(ttExpRcvOdrCriteria);
//        TtExpRcvOdrDomain beforeTtExpRcvOdrDomain = ttExpRcvOdrList.get(0);
//        
//        TtTmpStockService ttTmpStockService = (TtTmpStockService) getContext().getBean("ttTmpStockService");
//        TtTmpStockCriteriaDomain ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
//        ttTmpStockCriteria.setShipperCd("MYB");
//        ttTmpStockCriteria.setLgcyWhCd("1");
//        ttTmpStockCriteria.setItemNo(ttMixtagItemNoDomain.getItemNo());
//        ttTmpStockCriteria.setPkgCd(ttMixtagItemNoDomain.getPkgCd());
//        TtTmpStockDomain beforeTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("0"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getPalletizeHeader(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getPalletizeHeader().getMainMark()), is(false));
//        
//        String mainMark = resultDomain.getPalletizeHeader().getMainMark();
//        
//        ttExpRcvOdrCriteria = new TtExpRcvOdrCriteriaDomain();
//        ttExpRcvOdrCriteria.setRcvOdrCompCd(beforeTtExpRcvOdrDomain.getRcvOdrCompCd());
//        ttExpRcvOdrCriteria.setCustomerCd(beforeTtExpRcvOdrDomain.getCustomerCd());
//        ttExpRcvOdrCriteria.setLgcyShipTo(beforeTtExpRcvOdrDomain.getLgcyShipTo());
//        ttExpRcvOdrCriteria.setItemNo(beforeTtExpRcvOdrDomain.getItemNo());
//        ttExpRcvOdrCriteria.setPkgCd(beforeTtExpRcvOdrDomain.getPkgCd());
//        ttExpRcvOdrCriteria.setTrnsCd(beforeTtExpRcvOdrDomain.getTrnsCd());
//        ttExpRcvOdrCriteria.setEtdDueDt(beforeTtExpRcvOdrDomain.getEtdDueDt());
//        ttExpRcvOdrCriteria.setCustomerPoNo(beforeTtExpRcvOdrDomain.getCustomerPoNo());
//        ttExpRcvOdrCriteria.setCustomerItemNo(beforeTtExpRcvOdrDomain.getCustomerItemNo());
//        ttExpRcvOdrCriteria.setCustomerItemNoOrg(beforeTtExpRcvOdrDomain.getCustomerItemNoOrg());
//        ttExpRcvOdrCriteria.setOdrCtrlNo(beforeTtExpRcvOdrDomain.getOdrCtrlNo());
//        TtExpRcvOdrDomain afterTtExpRcvOdr = ttExpRcvOdrService.searchByKey(ttExpRcvOdrCriteria);
//        assertThat(afterTtExpRcvOdr.getPltzAllocQty(), is(beforeTtExpRcvOdrDomain.getPltzAllocQty()));
//        
//        // 6.2.1
//        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
//        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
//        ttPltzItemOdrCriteria.setMainMark(mainMark);
//        ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(2));
//        
//        // 7.1
//        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
//        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
//        ttPltzItemCriteria.setMainMark(mainMark);
//        ttPltzItemCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(10));
//        
//        // 7.2
//        TtPltzKanbanService ttPltzKanbanService = (TtPltzKanbanService) getContext().getBean("ttPltzKanbanService");
//        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
//        ttPltzKanbanCriteria.setMainMark(mainMark);
//        ttPltzKanbanCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzKanbanService.searchCount(ttPltzKanbanCriteria), is(2));
//        
//        // 7.3
//        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
//        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
//        ttPltzCriteria.setMainMark(mainMark);
//        ttPltzCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
//        
//        ttTmpStockCriteria = new TtTmpStockCriteriaDomain();
//        ttTmpStockCriteria.setShipperCd(beforeTtTmpStockDomain.getShipperCd());
//        ttTmpStockCriteria.setLgcyWhCd(beforeTtTmpStockDomain.getLgcyWhCd());
//        ttTmpStockCriteria.setItemNo(beforeTtTmpStockDomain.getItemNo());
//        ttTmpStockCriteria.setPkgCd(beforeTtTmpStockDomain.getPkgCd());
//        TtTmpStockDomain afterTtTmpStockDomain = ttTmpStockService.searchByKey(ttTmpStockCriteria);
//        assertThat(afterTtTmpStockDomain.getQty(), is(beforeTtTmpStockDomain.getQty()));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 6, 7
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfo6_3() throws Exception {
//
//        Timestamp startTimestamp = new Timestamp(new Date().getTime());
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", null);
//        wsCallerRestDomain.setParamMap("lgcyWhCd", null);
//        wsCallerRestDomain.setParamMap("whCompCd", "MYB");
//        wsCallerRestDomain.setParamMap("whCd", "WH01");
//        wsCallerRestDomain.setParamMap("whFlg", "Y");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "20");
//        wsCallerRestDomain.setParamMap("outerCd", "");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "");
//        wsCallerRestDomain.setParamMap("outerCdQty", "");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", "SCR1");
//        wsCallerRestDomain.setParamMap("errMsgId", "MSG1");
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", "1");
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", "2014/06/19 21:06:30");
//        wsCallerRestDomain.setParamMap("workTimeEndErr", "2014/06/19 21:07:30");
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("0"));
//        assertThat(resultDomain.getErrorList().size(), is(0));
//        assertThat(resultDomain.getPalletizeHeader(), notNullValue());
//        assertThat(CheckUtil.isBlankOrNull(resultDomain.getPalletizeHeader().getMainMark()), is(false));
//        
//        String mainMark = resultDomain.getPalletizeHeader().getMainMark();
//        
//        // 6.1.2
//        TtPltzItemOdrService ttPltzItemOdrService = (TtPltzItemOdrService) getContext().getBean("ttPltzItemOdrService");
//        TtPltzItemOdrCriteriaDomain ttPltzItemOdrCriteria = new TtPltzItemOdrCriteriaDomain();
//        ttPltzItemOdrCriteria.setMainMark(mainMark);
//        ttPltzItemOdrCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzItemOdrService.searchCount(ttPltzItemOdrCriteria), is(1));
//        
//        // 7.1
//        TtPltzItemService ttPltzItemService = (TtPltzItemService) getContext().getBean("ttPltzItemService");
//        TtPltzItemCriteriaDomain ttPltzItemCriteria = new TtPltzItemCriteriaDomain();
//        ttPltzItemCriteria.setMainMark(mainMark);
//        ttPltzItemCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzItemService.searchCount(ttPltzItemCriteria), is(2));
//        
//        // 7.2
//        TtPltzKanbanService ttPltzKanbanService = (TtPltzKanbanService) getContext().getBean("ttPltzKanbanService");
//        TtPltzKanbanCriteriaDomain ttPltzKanbanCriteria = new TtPltzKanbanCriteriaDomain();
//        ttPltzKanbanCriteria.setMainMark(mainMark);
//        ttPltzKanbanCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzKanbanService.searchCount(ttPltzKanbanCriteria), is(1));
//        
//        // 7.3
//        TtPltzService ttPltzService = (TtPltzService) getContext().getBean("ttPltzService");
//        TtPltzCriteriaDomain ttPltzCriteria = new TtPltzCriteriaDomain();
//        ttPltzCriteria.setMainMark(mainMark);
//        ttPltzCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttPltzService.searchCount(ttPltzCriteria), is(1));
//        
//        // 7.7.1
//        TtBhtWorkTimeService ttBhtWorkTimeService = (TtBhtWorkTimeService) getContext().getBean("ttBhtWorkTimeService");
//        TtBhtWorkTimeCriteriaDomain ttBhtWorkTimeCriteria = new TtBhtWorkTimeCriteriaDomain();
//        ttBhtWorkTimeCriteria.setDscId(DensoContext.get().getDscId());
//        ttBhtWorkTimeCriteria.setCompCd("MYA");
//        ttBhtWorkTimeCriteria.setPreferredOrder("WORK_TIME_NO desc");
//        List<TtBhtWorkTimeDomain> ttBhtWorkTimeList = ttBhtWorkTimeService.searchByCondition(ttBhtWorkTimeCriteria);
//        assertThat(startTimestamp.compareTo(ttBhtWorkTimeList.get(0).getComCreateTimestamp()), is(-1));
//        
//        // 7.7.2
//        TtBhtWorkPltzService ttBhtWorkPltzService = (TtBhtWorkPltzService) getContext().getBean("ttBhtWorkPltzService");
//        TtBhtWorkPltzCriteriaDomain ttBhtWorkPltzCriteria = new TtBhtWorkPltzCriteriaDomain();
//        ttBhtWorkPltzCriteria.setWorkTimeNo(ttBhtWorkTimeList.get(0).getWorkTimeNo());
//        ttBhtWorkPltzCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttBhtWorkPltzService.searchCount(ttBhtWorkPltzCriteria), is(1));
//        
//        // 7.7.3
//        TtBhtWorkErrService ttBhtWorkErrService = (TtBhtWorkErrService) getContext().getBean("ttBhtWorkErrService");
//        TtBhtWorkErrCriteriaDomain ttBhtWorkErrCriteria = new TtBhtWorkErrCriteriaDomain();
//        ttBhtWorkErrCriteria.setWorkTimeNo(ttBhtWorkTimeList.get(0).getWorkTimeNo());
//        ttBhtWorkErrCriteria.setSearchCountCheckFlg(false);
//        assertThat(ttBhtWorkErrService.searchCount(ttBhtWorkErrCriteria), is(1));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (N/W)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_1() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("N/W"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (G/W)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_2() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "499999");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("N/W"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (Length)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_3() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Length"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (Width)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_4() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Width"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (Height)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_5() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Height"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (Volume)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_6() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "MMYBWH01406230001");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "Y");
//        wsCallerRestDomain.setParamMap("indusTypCd", "");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "");
//        wsCallerRestDomain.setParamMap("kanbanQty", "0");
//        wsCallerRestDomain.setParamMap("outerCd", "7777");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "Y");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Vol."));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (Length)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_7() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "20");
//        wsCallerRestDomain.setParamMap("outerCd", "");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Length"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (Width)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_8() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "20");
//        wsCallerRestDomain.setParamMap("outerCd", "");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Width"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (Height)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_9() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "20");
//        wsCallerRestDomain.setParamMap("outerCd", "");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Height"));
//    }
//
//    /**
//     * <br />Webサービスのテスト (正常系)
//     * テストケース: 桁あふれ (Volume)
//     *
//     * @throws Exception テストに失敗した場合
//     */
//    @Test
//    public void testSetPalletizeInfoX_10() throws Exception {
//        
//        // パラメータを設定する
//        wsCallerRestDomain.setParamMap("shipperCd", "MYB");
//        wsCallerRestDomain.setParamMap("customerCd", "30001206");
//        wsCallerRestDomain.setParamMap("lgcyShipTo", "00");
//        wsCallerRestDomain.setParamMap("trnsCd", "S");
//        wsCallerRestDomain.setParamMap("plntCd", "M1");
//        wsCallerRestDomain.setParamMap("lgcyWhCd", "1");
//        wsCallerRestDomain.setParamMap("whCompCd", null);
//        wsCallerRestDomain.setParamMap("whCd", null);
//        wsCallerRestDomain.setParamMap("whFlg", "N");
//        wsCallerRestDomain.setParamMap("palletNo", "S902");
//        wsCallerRestDomain.setParamMap("itemNo", "A002TB0091B06N");
//        wsCallerRestDomain.setParamMap("pkgCd", "110");
//        wsCallerRestDomain.setParamMap("mixTagFlg", "N");
//        wsCallerRestDomain.setParamMap("indusTypCd", "1");
//        wsCallerRestDomain.setParamMap("kanbanTyp", "1");
//        wsCallerRestDomain.setParamMap("tagSeqNo", "1");
//        wsCallerRestDomain.setParamMap("kanbanQty", "20");
//        wsCallerRestDomain.setParamMap("outerCd", "");
//        wsCallerRestDomain.setParamMap("outerCdFlg", "N");
//        wsCallerRestDomain.setParamMap("outerCdItemNo", "PKGITEMENO-030");
//        wsCallerRestDomain.setParamMap("outerCdQty", "3");
//        wsCallerRestDomain.setParamMap("workTimeStrt", "2014/06/20 21:06:00");
//        wsCallerRestDomain.setParamMap("workTimeEnd", "2014/06/20 21:06:30");
//        wsCallerRestDomain.setParamMap("errScreenId", null);
//        wsCallerRestDomain.setParamMap("errMsgId", null);
//        wsCallerRestDomain.setParamMap("bhtUnlockAuthFlg", null);
//        wsCallerRestDomain.setParamMap("workTimeStrtErr", null);
//        wsCallerRestDomain.setParamMap("workTimeEndErr", null);
//
//        // Webサービスを呼び出す
//        Ws2503ResultDomain resultDomain = post(wsCallerRestDomain, RESULT_TYPE);
//
//        assertThat(resultDomain.getResultCode(), is("1"));
//        assertThat(resultDomain.getErrorList().size(), is(1));
//        assertThat(resultDomain.getErrorList().get(0).getErrorCode(), is("NXS_E1_5071"));
//        assertThat(resultDomain.getErrorList().get(0).getErrorParamList().get(0).getParam(), is("Vol."));
//    }



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
