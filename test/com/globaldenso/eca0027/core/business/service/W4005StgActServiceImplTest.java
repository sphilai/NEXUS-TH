/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtStgInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtStgInstrService;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for W4005StgActServiceImpl.
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 10403 $
 */
public class W4005StgActServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public W4005StgActServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchCountForPagingOnMainSearch
     * <br />searchCountForPagingOnMainSearchメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchCountForPagingOnMainSearch01() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W4005StgActService testService = (W4005StgActService)getContext().getBean("w4005StgActService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActCriteriaDomain criteriaDomain = new W4005StgActCriteriaDomain();
        criteriaDomain.setStgActNo("AWSTGACT");
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP000001");
        criteriaDomain.setTrnsTypCd(null);
        criteriaDomain.setTrnsTypNm(null);
        criteriaDomain.setStgActDtFrom(toDatetime("2014/05/01 00:00:00"));
        criteriaDomain.setStgActDtTo(toDatetime("2014/05/31 00:00:00"));
        criteriaDomain.setStgActIssuerId("1");
        criteriaDomain.setWeightUnit(null);
        criteriaDomain.setWeightUnitDisp(null);
        criteriaDomain.setVolumeUnit(null);
        criteriaDomain.setVolumeUnitDisp(null);
        criteriaDomain.setXmainMark("");
        criteriaDomain.setMainMark("AWMAINMARK");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setStgInstrNo("AWSTGINSTR");
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat(null);
        criteriaDomain.setScreenId("W4005");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone("1070001000");
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(1000);
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setLoginUserDscId("AWDSCID01");
        criteriaDomain.setLocale(new Locale("en_TH"));
        criteriaDomain.setCheckValidateWarning(false);
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthMgtComp("AH0");
        authDomain1.setProcMfgDivCd("X1");
        authDomain1.setAuthority("1");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthMgtComp("TG0");
        authDomain2.setProcMfgDivCd("A1");
        authDomain2.setAuthority("1");
        authDomainList.add(authDomain2);
        UserAuthDomain authDomain3 = new UserAuthDomain();
        authDomain3.setAuthMgtComp("TG0");
        authDomain3.setProcMfgDivCd("E1");
        authDomain3.setAuthority("1");
        authDomainList.add(authDomain3);
        UserAuthDomain authDomain4 = new UserAuthDomain();
        authDomain4.setAuthMgtComp("AH0");
        authDomain4.setProcMfgDivCd("X2");
        authDomain4.setAuthority("2");
        authDomainList.add(authDomain4);
        UserAuthDomain authDomain5 = new UserAuthDomain();
        authDomain5.setAuthMgtComp("TG0");
        authDomain5.setProcMfgDivCd("G1");
        authDomain5.setAuthority("2");
        authDomainList.add(authDomain5);
        UserAuthDomain authDomain6 = new UserAuthDomain();
        authDomain6.setAuthMgtComp("TG0");
        authDomain6.setProcMfgDivCd("L2");
        authDomain6.setAuthority("2");
        authDomainList.add(authDomain6);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method
        // テスト対象メソッドの呼び出し
        int result = -1;
        try {
            result = testService.searchCountForPagingOnMainSearch(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertEquals(2, result);
    }

    /**
     * Test method for searchForPagingOnMainSearch
     * <br />searchForPagingOnMainSearchメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchForPagingOnMainSearch01() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W4005StgActService testService = (W4005StgActService)getContext().getBean("w4005StgActService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActCriteriaDomain criteriaDomain = new W4005StgActCriteriaDomain();
        criteriaDomain.setStgActNo("AWSTGACT");
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP000001");
        criteriaDomain.setTrnsTypCd(null);
        criteriaDomain.setTrnsTypNm(null);
        criteriaDomain.setStgActDtFrom(toDatetime("2014/05/01 00:00:00"));
        criteriaDomain.setStgActDtTo(toDatetime("2014/05/31 00:00:00"));
        criteriaDomain.setStgActIssuerId("1");
        criteriaDomain.setWeightUnit(null);
        criteriaDomain.setWeightUnitDisp(null);
        criteriaDomain.setVolumeUnit(null);
        criteriaDomain.setVolumeUnitDisp(null);
        criteriaDomain.setXmainMark("");
        criteriaDomain.setMainMark("AWMAINMARK");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setStgInstrNo("AWSTGINSTR");
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat(null);
        criteriaDomain.setScreenId("W4005");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone("1070001000");
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(1000);
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setLoginUserDscId("AWDSCID01");
        criteriaDomain.setLocale(new Locale("en_TH"));
        criteriaDomain.setCheckValidateWarning(false);
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthMgtComp("AH0");
        authDomain1.setProcMfgDivCd("X1");
        authDomain1.setAuthority("1");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthMgtComp("TG0");
        authDomain2.setProcMfgDivCd("A1");
        authDomain2.setAuthority("1");
        authDomainList.add(authDomain2);
        UserAuthDomain authDomain3 = new UserAuthDomain();
        authDomain3.setAuthMgtComp("TG0");
        authDomain3.setProcMfgDivCd("E1");
        authDomain3.setAuthority("1");
        authDomainList.add(authDomain3);
        UserAuthDomain authDomain4 = new UserAuthDomain();
        authDomain4.setAuthMgtComp("AH0");
        authDomain4.setProcMfgDivCd("X2");
        authDomain4.setAuthority("2");
        authDomainList.add(authDomain4);
        UserAuthDomain authDomain5 = new UserAuthDomain();
        authDomain5.setAuthMgtComp("TG0");
        authDomain5.setProcMfgDivCd("G1");
        authDomain5.setAuthority("2");
        authDomainList.add(authDomain5);
        UserAuthDomain authDomain6 = new UserAuthDomain();
        authDomain6.setAuthMgtComp("TG0");
        authDomain6.setProcMfgDivCd("L2");
        authDomain6.setAuthority("2");
        authDomainList.add(authDomain6);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method
        // テスト対象メソッドの呼び出し
        List<? extends W4005StgActDomain> result = null;
        try {
            result = testService.searchForPagingOnMainSearch(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertEquals(2, result.size());

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected = {
            "stgActNo=AWSTGACT201",
            "whCompCd=XT0",
            "whCd=IEC1",
            "trnsCd=S",
            "containerSortingKey=JP000001",
            "trnsTypCd=null",
            "trnsTypNm=null",
            "etd=2014/08/01 00:00:00",
            "stgActDt=2014/05/06 16:19:50",
            "stgActIssuerId=null",
            "stgActIssuerNm=Awata1 Taro 12345678901234567890123456789012345678",
            "carrierCompCd=MOL",
        };
        String[] targetFields = MatchingUtil.getTargetFields(expected);
        assertEquals(MatchingUtil.expectedToString(expected),
            MatchingUtil.actualToString(result.get(0), targetFields));
    }

    /**
     * Test method for searchCountForPagingOnCreateSearch
     * <br />searchCountForPagingOnCreateSearchメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchCountForPagingOnCreateSearch01() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W4005StgActService testService = (W4005StgActService)getContext().getBean("w4005StgActService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005PltzCriteriaDomain criteriaDomain = new W4005PltzCriteriaDomain();
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP000001");
        criteriaDomain.setTrnsTypCd("1");
        criteriaDomain.setTrnsTypNm("S-20FT");
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setVolumeUnit("CR");
        criteriaDomain.setXmainMark("");
        criteriaDomain.setMainMark("AWMAINMARK");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setShipToCd("JP");
        criteriaDomain.setStgInstrNo("");
        criteriaDomain.setLoadingCd("F");
        criteriaDomain.setLastTrRcvDtFrom(toDatetime("2014/04/01 00:00:00"));
        criteriaDomain.setLastTrRcvDtTo(toDatetime("2014/04/30 00:00:00"));
        criteriaDomain.setStgInstrItemFlg("N");
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setScreenId("W4007");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone("1070001000");
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(1000);
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setLoginUserDscId("AWDSCID01");
        criteriaDomain.setLocale(new Locale("en_TH"));
        criteriaDomain.setCheckValidateWarning(false);
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthMgtComp("AH0");
        authDomain1.setProcMfgDivCd("X1");
        authDomain1.setAuthority("1");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthMgtComp("TG0");
        authDomain2.setProcMfgDivCd("A1");
        authDomain2.setAuthority("1");
        authDomainList.add(authDomain2);
        UserAuthDomain authDomain3 = new UserAuthDomain();
        authDomain3.setAuthMgtComp("TG0");
        authDomain3.setProcMfgDivCd("E1");
        authDomain3.setAuthority("1");
        authDomainList.add(authDomain3);
        UserAuthDomain authDomain4 = new UserAuthDomain();
        authDomain4.setAuthMgtComp("AH0");
        authDomain4.setProcMfgDivCd("X2");
        authDomain4.setAuthority("2");
        authDomainList.add(authDomain4);
        UserAuthDomain authDomain5 = new UserAuthDomain();
        authDomain5.setAuthMgtComp("TG0");
        authDomain5.setProcMfgDivCd("G1");
        authDomain5.setAuthority("2");
        authDomainList.add(authDomain5);
        UserAuthDomain authDomain6 = new UserAuthDomain();
        authDomain6.setAuthMgtComp("TG0");
        authDomain6.setProcMfgDivCd("L2");
        authDomain6.setAuthority("2");
        authDomainList.add(authDomain6);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method
        // テスト対象メソッドの呼び出し
        int result = -1;
        try {
            result = testService.searchCountForPagingOnCreateSearch(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertEquals(8, result);
    }

    /**
     * Test method for searchForPagingOnCreateSearch
     * <br />searchForPagingOnCreateSearchメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchForPagingOnCreateSearch01() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W4005StgActService testService = (W4005StgActService)getContext().getBean("w4005StgActService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005PltzCriteriaDomain criteriaDomain = new W4005PltzCriteriaDomain();
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP000001");
        criteriaDomain.setTrnsTypCd("1");
        criteriaDomain.setTrnsTypNm("S-20FT");
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setVolumeUnit("CR");
        criteriaDomain.setXmainMark("");
        criteriaDomain.setMainMark("AWMAINMARK");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setShipToCd("JP");
        criteriaDomain.setStgInstrNo("");
        criteriaDomain.setLoadingCd("F");
        criteriaDomain.setLastTrRcvDtFrom(toDatetime("2014/04/01 00:00:00"));
        criteriaDomain.setLastTrRcvDtTo(toDatetime("2014/04/30 00:00:00"));
        criteriaDomain.setStgInstrItemFlg("N");
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setScreenId("W4007");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone("1070001000");
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(1000);
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setLoginUserDscId("AWDSCID01");
        criteriaDomain.setLocale(new Locale("en_TH"));
        criteriaDomain.setCheckValidateWarning(false);
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthMgtComp("AH0");
        authDomain1.setProcMfgDivCd("X1");
        authDomain1.setAuthority("1");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthMgtComp("TG0");
        authDomain2.setProcMfgDivCd("A1");
        authDomain2.setAuthority("1");
        authDomainList.add(authDomain2);
        UserAuthDomain authDomain3 = new UserAuthDomain();
        authDomain3.setAuthMgtComp("TG0");
        authDomain3.setProcMfgDivCd("E1");
        authDomain3.setAuthority("1");
        authDomainList.add(authDomain3);
        UserAuthDomain authDomain4 = new UserAuthDomain();
        authDomain4.setAuthMgtComp("AH0");
        authDomain4.setProcMfgDivCd("X2");
        authDomain4.setAuthority("2");
        authDomainList.add(authDomain4);
        UserAuthDomain authDomain5 = new UserAuthDomain();
        authDomain5.setAuthMgtComp("TG0");
        authDomain5.setProcMfgDivCd("G1");
        authDomain5.setAuthority("2");
        authDomainList.add(authDomain5);
        UserAuthDomain authDomain6 = new UserAuthDomain();
        authDomain6.setAuthMgtComp("TG0");
        authDomain6.setProcMfgDivCd("L2");
        authDomain6.setAuthority("2");
        authDomainList.add(authDomain6);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method
        // テスト対象メソッドの呼び出し
        List<? extends W4005PltzDomain> result = null;
        try {
            result = testService.searchForPagingOnCreateSearch(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertEquals(8, result.size());

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected = {
            "mainMarkTyp=2",
            "mainMarkOrXmainMark=AWXMAINMARK003",
            "mainMark=null",
            "shipperCd=null",
            "shipToCd=null",
            "stgInstrNo=null",
            "stgActNo=null",
            "loadingCd=F",
            "etd=null",
            "carrierCompCd=null",
            "grossWeight=600.000",
            "weightUnit=KG",
            "volume=0.600",
            "volumeUnit=CR",
            "lastTrRcvDt=null",
            "stgInstrItemFlg=null",
            "customTimingTyp=null",
            "disabledFlg=Y",
            "pltzStatus=null",
            "lastTrStatus=null",
            "auth=null",
            "createFlg=null",
        };
        String[] targetFields = MatchingUtil.getTargetFields(expected);
        assertEquals(MatchingUtil.expectedToString(expected),
            MatchingUtil.actualToString(result.get(0), targetFields));
    }

    /**
     * Test method for searchCountOnRegisterInitByFromMain
     * <br />searchCountOnRegisterInitByFromMainメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchCountOnRegisterInitByFromMain01() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W4005StgActService testService = (W4005StgActService)getContext().getBean("w4005StgActService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActCriteriaDomain criteriaDomain = new W4005StgActCriteriaDomain();
        criteriaDomain.setStgActNo("AWSTGACT201");
        criteriaDomain.setWhCompCd(null);
        criteriaDomain.setWhCd(null);
        criteriaDomain.setTrnsCd(null);
        criteriaDomain.setContainerSortingKey(null);
        criteriaDomain.setTrnsTypCd(null);
        criteriaDomain.setTrnsTypNm(null);
        criteriaDomain.setStgActDtFrom(null);
        criteriaDomain.setStgActDtTo(null);
        criteriaDomain.setStgActIssuerId(null);
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setWeightUnitDisp("kg");
        criteriaDomain.setVolumeUnit("CR");
        criteriaDomain.setVolumeUnitDisp("m3");
        criteriaDomain.setXmainMark(null);
        criteriaDomain.setMainMark(null);
        criteriaDomain.setShipperCd(null);
        criteriaDomain.setStgInstrNo(null);
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat("dd/MM/yyyy");
        criteriaDomain.setScreenId("W4008");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone("1070001000");
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(1000);
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setLoginUserDscId("AWDSCID01");
        criteriaDomain.setLocale(new Locale("en_TH"));
        criteriaDomain.setCheckValidateWarning(false);
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthMgtComp("AH0");
        authDomain1.setProcMfgDivCd("X1");
        authDomain1.setAuthority("1");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthMgtComp("TG0");
        authDomain2.setProcMfgDivCd("A1");
        authDomain2.setAuthority("1");
        authDomainList.add(authDomain2);
        UserAuthDomain authDomain3 = new UserAuthDomain();
        authDomain3.setAuthMgtComp("TG0");
        authDomain3.setProcMfgDivCd("E1");
        authDomain3.setAuthority("1");
        authDomainList.add(authDomain3);
        UserAuthDomain authDomain4 = new UserAuthDomain();
        authDomain4.setAuthMgtComp("AH0");
        authDomain4.setProcMfgDivCd("X2");
        authDomain4.setAuthority("2");
        authDomainList.add(authDomain4);
        UserAuthDomain authDomain5 = new UserAuthDomain();
        authDomain5.setAuthMgtComp("TG0");
        authDomain5.setProcMfgDivCd("G1");
        authDomain5.setAuthority("2");
        authDomainList.add(authDomain5);
        UserAuthDomain authDomain6 = new UserAuthDomain();
        authDomain6.setAuthMgtComp("TG0");
        authDomain6.setProcMfgDivCd("L2");
        authDomain6.setAuthority("2");
        authDomainList.add(authDomain6);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method
        // テスト対象メソッドの呼び出し
        int result = -1;
        try {
            result = testService.searchCountOnRegisterInitByFromMain(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertEquals(6, result);
    }

    /**
     * Test method for searchOnRegisterInitByFromMain
     * <br />searchOnRegisterInitByFromMainメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchOnRegisterInitByFromMain01() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W4005StgActService testService = (W4005StgActService)getContext().getBean("w4005StgActService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActCriteriaDomain criteriaDomain = new W4005StgActCriteriaDomain();
        criteriaDomain.setStgActNo("AWSTGACT201");
        criteriaDomain.setWhCompCd(null);
        criteriaDomain.setWhCd(null);
        criteriaDomain.setTrnsCd(null);
        criteriaDomain.setContainerSortingKey(null);
        criteriaDomain.setTrnsTypCd(null);
        criteriaDomain.setTrnsTypNm(null);
        criteriaDomain.setStgActDtFrom(null);
        criteriaDomain.setStgActDtTo(null);
        criteriaDomain.setStgActIssuerId(null);
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setWeightUnitDisp("kg");
        criteriaDomain.setVolumeUnit("CR");
        criteriaDomain.setVolumeUnitDisp("m3");
        criteriaDomain.setXmainMark(null);
        criteriaDomain.setMainMark(null);
        criteriaDomain.setShipperCd(null);
        criteriaDomain.setStgInstrNo(null);
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat("dd/MM/yyyy");
        criteriaDomain.setScreenId("W4008");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone("1070001000");
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(1000);
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setLoginUserDscId("AWDSCID01");
        criteriaDomain.setLocale(new Locale("en_TH"));
        criteriaDomain.setCheckValidateWarning(false);
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthMgtComp("AH0");
        authDomain1.setProcMfgDivCd("X1");
        authDomain1.setAuthority("1");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthMgtComp("TG0");
        authDomain2.setProcMfgDivCd("A1");
        authDomain2.setAuthority("1");
        authDomainList.add(authDomain2);
        UserAuthDomain authDomain3 = new UserAuthDomain();
        authDomain3.setAuthMgtComp("TG0");
        authDomain3.setProcMfgDivCd("E1");
        authDomain3.setAuthority("1");
        authDomainList.add(authDomain3);
        UserAuthDomain authDomain4 = new UserAuthDomain();
        authDomain4.setAuthMgtComp("AH0");
        authDomain4.setProcMfgDivCd("X2");
        authDomain4.setAuthority("2");
        authDomainList.add(authDomain4);
        UserAuthDomain authDomain5 = new UserAuthDomain();
        authDomain5.setAuthMgtComp("TG0");
        authDomain5.setProcMfgDivCd("G1");
        authDomain5.setAuthority("2");
        authDomainList.add(authDomain5);
        UserAuthDomain authDomain6 = new UserAuthDomain();
        authDomain6.setAuthMgtComp("TG0");
        authDomain6.setProcMfgDivCd("L2");
        authDomain6.setAuthority("2");
        authDomainList.add(authDomain6);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method
        // テスト対象メソッドの呼び出し
        W4005StgActDomain result = null;
        try {
            result = testService.searchOnRegisterInitByFromMain(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertNotNull(result);
        assertEquals(6, result.getPltzDomainList().size());

        // Assert search result header
        // 検索結果ヘッダをassert
        String[] expected1 = {
            "stgActNo=AWSTGACT201",
            "whCompCd=XT0",
            "whCd=IEC1",
            "trnsCd=S",
            "containerSortingKey=JP000001",
            "trnsTypCd=null",
            "trnsTypNm=S-20FT",
            "etd=2014/08/01 00:00:00",
            "stgActDt=2014/05/06 16:19:50",
            "stgActIssuerId=null",
            "stgActIssuerNm=Awata1 Taro 12345678901234567890123456789012345678",
            "carrierCompCd=MOL",
            "pkgQty=2",
            "grossWeight=5000.000",
            "weightUnit=KG",
            "volume=5.000",
            "volumeUnit=CR",
            "loadingRatio=98.7",
            "comUpdateTimestamp=2014/04/25 21:18:13",
        };
        String[] targetFields1 = MatchingUtil.getTargetFields(expected1);
        assertEquals(MatchingUtil.expectedToString(expected1),
            MatchingUtil.actualToString(result, targetFields1));

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected2 = {
            "mainMarkTyp=2",
            "mainMarkOrXmainMark=AWXMAINMARK201",
            "mainMark=null",
            "shipperCd=null",
            "shipToCd=null",
            "stgInstrNo=null",
            "stgActNo=null",
            "loadingCd=F",
            "etd=null",
            "carrierCompCd=null",
            "grossWeight=600.000",
            "weightUnit=KG",
            "volume=0.600",
            "volumeUnit=CR",
            "lastTrRcvDt=null",
            "stgInstrItemFlg=null",
            "customTimingTyp=null",
            "disabledFlg=null",
            "pltzStatus=null",
            "lastTrStatus=null",
            "auth=1",
        };
        String[] targetFields2 = MatchingUtil.getTargetFields(expected2);
        assertEquals(MatchingUtil.expectedToString(expected2),
            MatchingUtil.actualToString(result.getPltzDomainList().get(0), targetFields2));
    }

    /**
     * Test method for searchOnRegisterInitByFromCreate
     * <br />searchOnRegisterInitByFromCreateメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchOnRegisterInitByFromCreate01() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W4005StgActService testService = (W4005StgActService)getContext().getBean("w4005StgActService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActCriteriaDomain criteriaDomain = new W4005StgActCriteriaDomain();
        criteriaDomain.setStgActNo(null);
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP000001");
        criteriaDomain.setTrnsTypCd("1");
        criteriaDomain.setTrnsTypNm("S-20FT");
        criteriaDomain.setStgActDtFrom(null);
        criteriaDomain.setStgActDtTo(null);
        criteriaDomain.setStgActIssuerId(null);
        criteriaDomain.setWeightUnit("KG");
        criteriaDomain.setWeightUnitDisp("kg");
        criteriaDomain.setVolumeUnit("CR");
        criteriaDomain.setVolumeUnitDisp("m3");
        criteriaDomain.setXmainMark(null);
        criteriaDomain.setMainMark(null);
        criteriaDomain.setShipperCd(null);
        criteriaDomain.setStgInstrNo(null);
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat("dd/MM/yyyy");
        criteriaDomain.setScreenId("W4008");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone("1070001000");
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(1000);
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setLoginUserDscId("AWDSCID01");
        criteriaDomain.setLocale(new Locale("en_TH"));
        criteriaDomain.setCheckValidateWarning(false);
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthMgtComp("AH0");
        authDomain1.setProcMfgDivCd("X1");
        authDomain1.setAuthority("1");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthMgtComp("TG0");
        authDomain2.setProcMfgDivCd("A1");
        authDomain2.setAuthority("1");
        authDomainList.add(authDomain2);
        UserAuthDomain authDomain3 = new UserAuthDomain();
        authDomain3.setAuthMgtComp("TG0");
        authDomain3.setProcMfgDivCd("E1");
        authDomain3.setAuthority("1");
        authDomainList.add(authDomain3);
        UserAuthDomain authDomain4 = new UserAuthDomain();
        authDomain4.setAuthMgtComp("AH0");
        authDomain4.setProcMfgDivCd("X2");
        authDomain4.setAuthority("2");
        authDomainList.add(authDomain4);
        UserAuthDomain authDomain5 = new UserAuthDomain();
        authDomain5.setAuthMgtComp("TG0");
        authDomain5.setProcMfgDivCd("G1");
        authDomain5.setAuthority("2");
        authDomainList.add(authDomain5);
        UserAuthDomain authDomain6 = new UserAuthDomain();
        authDomain6.setAuthMgtComp("TG0");
        authDomain6.setProcMfgDivCd("L2");
        authDomain6.setAuthority("2");
        authDomainList.add(authDomain6);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method
        // テスト対象メソッドの呼び出し
        W4005StgActDomain result = null;
        try {
            result = testService.searchOnRegisterInitByFromCreate(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertNotNull(result);
        assertEquals(5, result.getPltzDomainList().size());

        // Assert search result header
        // 検索結果ヘッダをassert
        String[] expected1 = {
            "stgActNo=null",
            "whCompCd=XT0",
            "whCd=IEC1",
            "trnsCd=S",
            "containerSortingKey=JP000001",
            "trnsTypCd=1",
            "trnsTypNm=S-20FT",
            "etd=null",
            "stgActDt=null",
            "stgActIssuerId=null",
            "stgActIssuerNm=null",
            "carrierCompCd=null",
            "pkgQty=5",
            "grossWeight=1200.900",
            "weightUnit=KG",
            "volume=1.206",
            "volumeUnit=CR",
            "loadingRatio=3.7",
        };
        String[] targetFields1 = MatchingUtil.getTargetFields(expected1);
        assertEquals(MatchingUtil.expectedToString(expected1),
            MatchingUtil.actualToString(result, targetFields1));

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected2 = {
            "mainMarkTyp=2",
            "mainMarkOrXmainMark=AWXMAINMARK003",
            "mainMark=null",
            "shipperCd=null",
            "shipToCd=null",
            "stgInstrNo=null",
            "stgActNo=null",
            "loadingCd=F",
            "etd=null",
            "carrierCompCd=null",
            "grossWeight=600.000",
            "weightUnit=KG",
            "volume=0.600",
            "volumeUnit=CR",
            "lastTrRcvDt=null",
            "stgInstrItemFlg=null",
            "customTimingTyp=null",
            "disabledFlg=null",
            "pltzStatus=null",
            "lastTrStatus=null",
            "auth=null",
        };
        String[] targetFields2 = MatchingUtil.getTargetFields(expected2);
        assertEquals(MatchingUtil.expectedToString(expected2),
            MatchingUtil.actualToString(result.getPltzDomainList().get(0), targetFields2));
    }

    //--------------------------------- トランザクション系メソッド transact ----------------------------------

    /**
     * Test method for transactOnRegisterCancel
     * <br />transactOnRegisterCancelメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testTransactOnRegisterCancel01() throws Exception {

        // Get an instance of the class to be used in the test from the Spring
        // Springからテストで使用するクラスのインスタンスを取得
        ApplicationContext context = getContext();
        W4005StgActService testService = (W4005StgActService)context.getBean("w4005StgActService");
        TtPltzService ttPltzService = (TtPltzService)context.getBean("ttPltzService");
        TtStgInstrService ttStgInstrService = (TtStgInstrService)context.getBean("ttStgInstrService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActDomain updateDomain = new W4005StgActDomain();
        updateDomain.setStgActNo("AWSTGACT801");
        updateDomain.setComUpdateTimestamp(toTimestamp("2014/04/25 21:18:13"));

        // Call the test method
        // テスト対象メソッドの呼び出し
        int result = -1;
        try {
            result = testService.transactOnRegisterCancel(updateDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert update count
        // 更新件数をassert
        assertEquals(4, result);

        // Assert palletize update result
        // パレタイズ更新結果をassert

        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK801");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("30", pltsStatus);
        }
        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK802");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("30", pltsStatus);
        }

        // Assert staging instruction update result
        // 荷揃え指示更新結果をassert

        TtStgInstrCriteriaDomain ttStgInstrCriteriaDomain = new TtStgInstrCriteriaDomain();
        ttStgInstrCriteriaDomain.setStgInstrNo("AWSTGINSTR101");
        List<TtStgInstrDomain> ttStgInstrDomainList = ttStgInstrService.searchByCondition(ttStgInstrCriteriaDomain);
        String stgActNo = ttStgInstrDomainList.get(0).getStgActNo();
        assertNull(stgActNo);
    }


    /**
     * Test method for transactOnRegisterCancel
     * <br />transactOnRegisterCancelメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testTransactOnRegisterCancel02() throws Exception {

        // Get an instance of the class to be used in the test from the Spring
        // Springからテストで使用するクラスのインスタンスを取得
        ApplicationContext context = getContext();
        W4005StgActService testService = (W4005StgActService)context.getBean("w4005StgActService");
        TtPltzService ttPltzService = (TtPltzService)context.getBean("ttPltzService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActDomain updateDomain = new W4005StgActDomain();
        updateDomain.setStgActNo("AWSTGACT802");
        updateDomain.setComUpdateTimestamp(toTimestamp("2014/04/25 21:18:13"));

        // Call the test method
        // テスト対象メソッドの呼び出し
        int result = -1;
        try {
            result = testService.transactOnRegisterCancel(updateDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert update count
        // 更新件数をassert
        assertEquals(3, result);

        // Assert palletize update result
        // パレタイズ更新結果をassert

        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK803");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("10", pltsStatus);
        }
        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK804");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("10", pltsStatus);
        }
    }

    /**
     * Test method for transactOnRegisterCancel
     * <br />transactOnRegisterCancelメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testTransactOnRegisterCancel03() throws Exception {

        // Get an instance of the class to be used in the test from the Spring
        // Springからテストで使用するクラスのインスタンスを取得
        ApplicationContext context = getContext();
        W4005StgActService testService = (W4005StgActService)context.getBean("w4005StgActService");
        TtPltzService ttPltzService = (TtPltzService)context.getBean("ttPltzService");
        TtStgInstrService ttStgInstrService = (TtStgInstrService)context.getBean("ttStgInstrService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActDomain updateDomain = new W4005StgActDomain();
        updateDomain.setStgActNo("AWSTGACT803");
        updateDomain.setComUpdateTimestamp(toTimestamp("2014/04/25 21:18:13"));

        // Call the test method
        // テスト対象メソッドの呼び出し
        int result = -1;
        try {
            result = testService.transactOnRegisterCancel(updateDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert update count
        // 更新件数をassert
        assertEquals(4, result);

        // Assert palletize update result
        // パレタイズ更新結果をassert

        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK805");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("30", pltsStatus);
        }
        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK806");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("30", pltsStatus);
        }

        // Assert staging instruction update result
        // 荷揃え指示更新結果をassert

        TtStgInstrCriteriaDomain ttStgInstrCriteriaDomain = new TtStgInstrCriteriaDomain();
        ttStgInstrCriteriaDomain.setStgInstrNo("AWSTGINSTR102");
        List<TtStgInstrDomain> ttStgInstrDomainList = ttStgInstrService.searchByCondition(ttStgInstrCriteriaDomain);
        String stgActNo = ttStgInstrDomainList.get(0).getStgActNo();
        assertNull(stgActNo);
    }

    /**
     * Test method for transactOnRegisterCancel
     * <br />transactOnRegisterCancelメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testTransactOnRegisterCancel04() throws Exception {

        // Get an instance of the class to be used in the test from the Spring
        // Springからテストで使用するクラスのインスタンスを取得
        ApplicationContext context = getContext();
        W4005StgActService testService = (W4005StgActService)context.getBean("w4005StgActService");
        TtPltzService ttPltzService = (TtPltzService)context.getBean("ttPltzService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActDomain updateDomain = new W4005StgActDomain();
        updateDomain.setStgActNo("AWSTGACT804");
        updateDomain.setComUpdateTimestamp(toTimestamp("2014/04/25 21:18:13"));

        // Call the test method
        // テスト対象メソッドの呼び出し
        int result = -1;
        try {
            result = testService.transactOnRegisterCancel(updateDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert update count
        // 更新件数をassert
        assertEquals(3, result);

        // Assert palletize update result
        // パレタイズ更新結果をassert

        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK807");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("10", pltsStatus);
        }
        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK808");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("10", pltsStatus);
        }
    }

    /**
     * Test method for transactOnRegisterCancel
     * <br />transactOnRegisterCancelメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testTransactOnRegisterCancel05() throws Exception {

        // Get an instance of the class to be used in the test from the Spring
        // Springからテストで使用するクラスのインスタンスを取得
        ApplicationContext context = getContext();
        W4005StgActService testService = (W4005StgActService)context.getBean("w4005StgActService");
        TtPltzService ttPltzService = (TtPltzService)context.getBean("ttPltzService");
        TtStgInstrService ttStgInstrService = (TtStgInstrService)context.getBean("ttStgInstrService");

        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4005StgActDomain updateDomain = new W4005StgActDomain();
        updateDomain.setStgActNo("AWSTGACT805");
        updateDomain.setComUpdateTimestamp(toTimestamp("2014/04/25 21:18:13"));

        // Call the test method
        // テスト対象メソッドの呼び出し
        int result = -1;
        try {
            result = testService.transactOnRegisterCancel(updateDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert update count
        // 更新件数をassert
        assertEquals(4, result);

        // Assert palletize update result
        // パレタイズ更新結果をassert

        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK809");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("40", pltsStatus);
        }
        {
            TtPltzCriteriaDomain ttPltzCriteriaDomain = new TtPltzCriteriaDomain();
            ttPltzCriteriaDomain.setMainMark("AWMAINMARK810");
            List<TtPltzDomain> ttPltzDomainList = ttPltzService.searchByCondition(ttPltzCriteriaDomain);
            String pltsStatus = ttPltzDomainList.get(0).getPltzStatus();
            assertEquals("40", pltsStatus);
        }

        // Assert staging instruction update result
        // 荷揃え指示更新結果をassert

        TtStgInstrCriteriaDomain ttStgInstrCriteriaDomain = new TtStgInstrCriteriaDomain();
        ttStgInstrCriteriaDomain.setStgInstrNo("AWSTGINSTR103");
        List<TtStgInstrDomain> ttStgInstrDomainList = ttStgInstrService.searchByCondition(ttStgInstrCriteriaDomain);
        String stgActNo = ttStgInstrDomainList.get(0).getStgActNo();
        assertNull(stgActNo);
    }

    //--------------------------------- Private methods below ----------------------------------

    /**
     * Get an ApplicationContext
     *
     * @return ApplicationContext
     */
    private ApplicationContext getContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {
                "WEB-INF/applicationContext-aij2.xml"
                ,   "WEB-INF/applicationContext-aij2-jdbc.xml"
                ,   "WEB-INF/applicationContext-aij2-aop.xml"
                ,   "WEB-INF/applicationContext-library.xml"
                ,   "library-config/applicationContext-aijbutil.xml"
            }
        );
        return context;
    }

    /**
     * Conversion datetime string -> java.util.Date
     *
     * @param s datetime string
     * @return java.util.Date
     */
    private Date toDatetime(String s) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * Conversion datetime string -> java.sql.Timestamp
     *
     * @param s datetime string
     * @return java.sql.Timestamp
     */
    private Timestamp toTimestamp(String s) {
        return new Timestamp(toDatetime(s).getTime());
    }
}
