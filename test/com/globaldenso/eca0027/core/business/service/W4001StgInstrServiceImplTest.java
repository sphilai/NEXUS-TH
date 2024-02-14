/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for W4001StgInstrServiceImpl.
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5941 $
 */
public class W4001StgInstrServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public W4001StgInstrServiceImplTest() {
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
        W4001StgInstrService testService = (W4001StgInstrService)getContext().getBean("w4001StgInstrService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4001StgInstrCriteriaDomain criteriaDomain = new W4001StgInstrCriteriaDomain();
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP");
        criteriaDomain.setContainerLooseTyp("C");
        criteriaDomain.setCustomTimingTyp("A");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setStgInstrNo("AWSTGINSTR");
        criteriaDomain.setStgInstrStatus("10");
        criteriaDomain.setEtd(null);
        criteriaDomain.setWorkedId("");
        criteriaDomain.setStgInstrDtFrom(toDatetime("2014/04/01 00:00:00"));
        criteriaDomain.setStgInstrDtTo(toDatetime("2014/04/30 00:00:00"));
        criteriaDomain.setStgInstrIssuerId("1");
        criteriaDomain.setCarrierCompCd(null);
        criteriaDomain.setMainMark("AWMAINMARK");
        criteriaDomain.setExpRequestNo("");
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat(null);
        criteriaDomain.setScreenId("W4001");
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
        assertEquals(3, result);
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
        W4001StgInstrService testService = (W4001StgInstrService)getContext().getBean("w4001StgInstrService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成

        W4001StgInstrCriteriaDomain criteriaDomain = new W4001StgInstrCriteriaDomain();
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP");
        criteriaDomain.setContainerLooseTyp("C");
        criteriaDomain.setCustomTimingTyp("A");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setStgInstrNo("AWSTGINSTR");
        criteriaDomain.setStgInstrStatus("10");
        criteriaDomain.setEtd(null);
        criteriaDomain.setWorkedId("");
        criteriaDomain.setStgInstrDtFrom(toDatetime("2014/04/01 00:00:00"));
        criteriaDomain.setStgInstrDtTo(toDatetime("2014/04/30 00:00:00"));
        criteriaDomain.setStgInstrIssuerId("1");
        criteriaDomain.setCarrierCompCd(null);
        criteriaDomain.setMainMark("AWMAINMARK");
        criteriaDomain.setExpRequestNo("");
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat(null);
        criteriaDomain.setScreenId("W4001");
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
        List<? extends W4001StgInstrDomain> result = null;
        try {
            result = testService.searchForPagingOnMainSearch(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertEquals(3, result.size());

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected = {
            "whCompCd=XT0",
            "whCd=IEC1",
            "trnsCd=S",
            "containerSortingKey=JP000001",
            "containerLooseTyp=C",
            "customTimingTyp=A",
            "shipperCd=TG0",
            "stgInstrNo=AWSTGINSTR004",
            "stgInstrStatus=10",
            "etd=2014/08/01 00:00:00",
            "workedId=null",
            "stgInstrDt=2014/04/25 16:19:50",
            "workedDt=null",
            "workedMethValue=Instr.",
            "stgInstrIssuerId=null",
            "stgInstrIssuerNm=Awata1 Taro 12345678901234567890123456789012345678",
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
        W4001StgInstrService testService = (W4001StgInstrService)getContext().getBean("w4001StgInstrService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4001PltzCriteriaDomain criteriaDomain = new W4001PltzCriteriaDomain();
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP000001");
        criteriaDomain.setContainerLooseTyp("C");
        criteriaDomain.setCustomTimingTyp("A");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setEtd(toDatetime("2014/06/07 00:00:00"));
        criteriaDomain.setCarrierCompCd("MOL");
        criteriaDomain.setMainMark("AWMAINMARK");
        criteriaDomain.setExpRequestNo("");
        criteriaDomain.setLoadingCd("F");
        criteriaDomain.setShipToCd("JP");
        criteriaDomain.setDngrItemFlg("N");
        criteriaDomain.setLastTrRcvDtFrom(toDatetime("2014/04/01 00:00:00"));
        criteriaDomain.setLastTrRcvDtTo(toDatetime("2014/04/30 00:00:00"));
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setScreenId("W4003");
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

        // Call the test method.
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
        assertEquals(27, result);
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
        W4001StgInstrService testService = (W4001StgInstrService)getContext().getBean("w4001StgInstrService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4001PltzCriteriaDomain criteriaDomain = new W4001PltzCriteriaDomain();
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP000001");
        criteriaDomain.setContainerLooseTyp("C");
        criteriaDomain.setCustomTimingTyp("A");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setEtd(toDatetime("2014/06/07 00:00:00"));
        criteriaDomain.setCarrierCompCd("MOL");
        criteriaDomain.setMainMark("AWMAINMARK");
        criteriaDomain.setExpRequestNo("");
        criteriaDomain.setLoadingCd("F");
        criteriaDomain.setShipToCd("JP");
        criteriaDomain.setDngrItemFlg("N");
        criteriaDomain.setLastTrRcvDtFrom(toDatetime("2014/04/01 00:00:00"));
        criteriaDomain.setLastTrRcvDtTo(toDatetime("2014/04/30 00:00:00"));
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setScreenId("W4003");
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

        // Call the test method.
        // テスト対象メソッドの呼び出し
        List<? extends W4001PltzDomain> result = null;
        try {
            result = testService.searchForPagingOnCreateSearch(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);

        // Assert search count
        // 検索件数をassert
        assertEquals(27, result.size());

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected = {
            "mainMark=AWMAINMARK029",
            "shipToCd=JP000",
            "weightUnit=KG",
            "weightUnitDisp=kg",
            "grossWeight=200.000",
            "volumeUnit=CR",
            "volumeUnitDisp=m3",
            "volume=0.200",
            "dueDt=2014/08/31 00:00:00",
            "loadingCd=F",
            "dngrItemFlg=N",
            "lastTrRcvDt=2014/04/24 19:39:58",
            "expRequestNo=null",
            "disabledFlg=Y",
            "expRequestAllCmlIssuedFlg=null",
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
        W4001StgInstrService testService = (W4001StgInstrService)getContext().getBean("w4001StgInstrService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4001StgInstrCriteriaDomain criteriaDomain = new W4001StgInstrCriteriaDomain();
        criteriaDomain.setWhCompCd(null);
        criteriaDomain.setWhCd(null);
        criteriaDomain.setTrnsCd(null);
        criteriaDomain.setContainerSortingKey(null);
        criteriaDomain.setContainerLooseTyp(null);
        criteriaDomain.setCustomTimingTyp(null);
        criteriaDomain.setShipperCd(null);
        criteriaDomain.setStgInstrNo("XT0SI0521005");
        criteriaDomain.setStgInstrStatus(null);
        criteriaDomain.setEtd(null);
        criteriaDomain.setWorkedId(null);
        criteriaDomain.setStgInstrDtFrom(null);
        criteriaDomain.setStgInstrDtTo(null);
        criteriaDomain.setStgInstrIssuerId(null);
        criteriaDomain.setCarrierCompCd(null);
        criteriaDomain.setMainMark(null);
        criteriaDomain.setExpRequestNo(null);
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat("dd/MM/yyyy");
        criteriaDomain.setScreenId("W4004");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone(null);
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(0);
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

        // Call the test method.
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
        assertEquals(7, result);
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
        W4001StgInstrService testService = (W4001StgInstrService)getContext().getBean("w4001StgInstrService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4001StgInstrCriteriaDomain criteriaDomain = new W4001StgInstrCriteriaDomain();
        criteriaDomain.setWhCompCd(null);
        criteriaDomain.setWhCd(null);
        criteriaDomain.setTrnsCd(null);
        criteriaDomain.setContainerSortingKey(null);
        criteriaDomain.setContainerLooseTyp(null);
        criteriaDomain.setCustomTimingTyp(null);
        criteriaDomain.setShipperCd(null);
        criteriaDomain.setStgInstrNo("XT0SI0521005");
        criteriaDomain.setStgInstrStatus(null);
        criteriaDomain.setEtd(null);
        criteriaDomain.setWorkedId(null);
        criteriaDomain.setStgInstrDtFrom(null);
        criteriaDomain.setStgInstrDtTo(null);
        criteriaDomain.setStgInstrIssuerId(null);
        criteriaDomain.setCarrierCompCd(null);
        criteriaDomain.setMainMark(null);
        criteriaDomain.setExpRequestNo(null);
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat("dd/MM/yyyy");
        criteriaDomain.setScreenId("W4004");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone(null);
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(0);
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

        // Call the test method.
        // テスト対象メソッドの呼び出し
        W4001StgInstrDomain result = null;
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
        assertEquals(7, result.getPltzDomainList().size());

        // Assert search result header
        // 検索結果ヘッダをassert
        String[] expected1 = {
            "whCompCd=XT0",
            "whCd=IEC1",
            "trnsCd=S",
            "containerSortingKey=JP000000",
            "containerLooseTyp=C",
            "customTimingTyp=A",
            "shipperCd=TG0",
            "stgInstrNo=XT0SI0521005",
            "stgInstrStatus=10",
            "etd=2014/05/23 00:00:00",
            "workedId=null",
            "stgInstrDt=2014/05/21 23:59:59",
            "workedDt=null",
            "workedMethValue=null",
            "stgInstrIssuerId=null",
            "stgInstrIssuerNm=Taro DensoMMMMMMMMMMMMMMMMMMMM",
            "pkgQty=7",
            "grossWeight=70.777",
            "weightUnit=KG",
            "weightUnitDisp=kg",
            "volume=7.000",
            "volumeUnit=CR",
            "volumeUnitDisp=m3",
            "workedIssuerNm=null",
            "carrierCompCd=MOL",
            "comUpdateTimestamp=2014/05/20 10:57:20",
        };
        String[] targetFields1 = MatchingUtil.getTargetFields(expected1);
        assertEquals(MatchingUtil.expectedToString(expected1),
            MatchingUtil.actualToString(result, targetFields1));

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected2 = {
            "mainMark=DTG0A11C405190051",
            "shipToCd=JP000",
            "weightUnit=KG",
            "weightUnitDisp=null",
            "grossWeight=10.111",
            "volumeUnit=CR",
            "volumeUnitDisp=null",
            "volume=1.000",
            "dueDt=2014/05/20 00:00:00",
            "loadingCd=D",
            "dngrItemFlg=N",
            "lastTrRcvDt=2014/05/07 00:00:00",
            "expRequestNo=null",
            "disabledFlg=null",
            "expRequestAllCmlIssuedFlg=null",
            "pltzStatus=null",
            "lastTrStatus=null",
            "auth=1",
            "createFlg=null",
            "comUpdateTimestamp=2014/05/20 10:57:20",
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
        W4001StgInstrService testService = (W4001StgInstrService)getContext().getBean("w4001StgInstrService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W4001StgInstrCriteriaDomain criteriaDomain = new W4001StgInstrCriteriaDomain();
        criteriaDomain.setWhCompCd("XT0");
        criteriaDomain.setWhCd("IEC1");
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setContainerSortingKey("JP000001");
        criteriaDomain.setContainerLooseTyp("C");
        criteriaDomain.setCustomTimingTyp("A");
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setStgInstrNo(null);
        criteriaDomain.setStgInstrStatus(null);
        criteriaDomain.setEtd(toDatetime("2014/06/07 00:00:00"));
        criteriaDomain.setWorkedId(null);
        criteriaDomain.setStgInstrDtFrom(null);
        criteriaDomain.setStgInstrDtTo(null);
        criteriaDomain.setStgInstrIssuerId(null);
        criteriaDomain.setCarrierCompCd("MOL");
        criteriaDomain.setMainMark(null);
        criteriaDomain.setExpRequestNo(null);
        criteriaDomain.setServerId("SERVER_TH");
        criteriaDomain.setReportDateFormat("dd/MM/yyyy");
        criteriaDomain.setScreenId("W4004");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setTimeZone("1070001000");
        criteriaDomain.setOwnerCompCd("TG0");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setSelected(null);
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(0);
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

        // Call the test method.
        // テスト対象メソッドの呼び出し
        W4001StgInstrDomain result = null;
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
        assertEquals(3, result.getPltzDomainList().size());

        // Assert search result header
        // 検索結果ヘッダをassert
        String[] expected1 = {
            "whCompCd=XT0",
            "whCd=IEC1",
            "trnsCd=S",
            "containerSortingKey=JP000001",
            "containerLooseTyp=C",
            "customTimingTyp=A",
            "shipperCd=TG0",
            "stgInstrNo=null",
            "stgInstrStatus=null",
            "etd=2014/06/07 00:00:00",
            "workedId=null",
            "stgInstrDt=null",
            "workedDt=null",
            "workedMethValue=null",
            "stgInstrIssuerId=null",
            "stgInstrIssuerNm=null",
            "pkgQty=3",
            "grossWeight=600.000",
            "weightUnit=KG",
            "weightUnitDisp=kg",
            "volume=0.600",
            "volumeUnit=CR",
            "volumeUnitDisp=m3",
            "workedIssuerNm=null",
            "carrierCompCd=MOL",
            "comUpdateTimestamp=null",
        };
        String[] targetFields1 = MatchingUtil.getTargetFields(expected1);
        assertEquals(MatchingUtil.expectedToString(expected1),
            MatchingUtil.actualToString(result, targetFields1));

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected2 = {
            "mainMark=AWMAINMARK029",
            "shipToCd=JP000",
            "weightUnit=KG",
            "weightUnitDisp=null",
            "grossWeight=200.000",
            "volumeUnit=CR",
            "volumeUnitDisp=null",
            "volume=0.200",
            "dueDt=2014/08/31 00:00:00",
            "loadingCd=F",
            "dngrItemFlg=N",
            "lastTrRcvDt=2014/04/24 19:39:58",
            "expRequestNo=null",
            "disabledFlg=null",
            "expRequestAllCmlIssuedFlg=null",
            "pltzStatus=null",
            "lastTrStatus=null",
            "auth=null",
            "createFlg=null",
            "comUpdateTimestamp=2014/06/03 09:56:39",
        };
        String[] targetFields2 = MatchingUtil.getTargetFields(expected2);
        assertEquals(MatchingUtil.expectedToString(expected2),
            MatchingUtil.actualToString(result.getPltzDomainList().get(0), targetFields2));
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

//    /**
//     * Conversion datetime string -> java.sql.Timestamp
//     *
//     * @param s datetime string
//     * @return java.sql.Timestamp
//     */
//    private Timestamp toTimestamp(String s) {
//        return new Timestamp(toDatetime(s).getTime());
//    }
}
