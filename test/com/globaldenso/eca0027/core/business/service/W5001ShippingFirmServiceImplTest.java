/*
 * Project : SCOPE
 *
 * Copyright (c) 2012 DENSO IT SOLUTIONS,INC. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgDomain;
import com.globaldenso.eca0027.core.business.service.W5001ShippingFirmService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

import junit.framework.TestCase;

/**
 * Test class for W5001ShippingFirmServiceImpl.
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5941 $
 */
public class W5001ShippingFirmServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public W5001ShippingFirmServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchCountForPagingOnMainSearch
     * <br />searchCountForPagingOnMainSearchメソッドのテスト。
     */
    public void testSearchCountForPagingOnMainSearch01() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W5001ShippingFirmService testService = (W5001ShippingFirmService)getContext().getBean("w5001ShippingFirmService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W5001ShippingFirmCriteriaDomain criteriaDomain = new W5001ShippingFirmCriteriaDomain();
        criteriaDomain.setCarrierCompCd("AAA");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setCheckValidateWarning(false);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setContainerLooseTyp("C");
        criteriaDomain.setContainerNo("1");
        criteriaDomain.setContainerSortingKey("1");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setFmEtd(toDatetime("2014/01/01 00:00:00"));
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setMainMark(null);
        criteriaDomain.setOwnerCompCd("DNJ");
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(0);
        criteriaDomain.setScreenId("W5001");
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setSelected(null);
        criteriaDomain.setServerId("dev");
        criteriaDomain.setShippingFirmIssuerId("nexus");
        criteriaDomain.setShippingFirmNo("000");
        criteriaDomain.setShippingFirmStatus("10");
        criteriaDomain.setStgActNo(null);
        criteriaDomain.setStgInstrNo(null);
        criteriaDomain.setTimeZone("JST");
        criteriaDomain.setToEtd(toDatetime("2014/05/01 00:00:00"));
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setWhCd("A101");
        criteriaDomain.setWhCompCd("TG0");
        criteriaDomain.setWorkedIssuerId("nexus");
        criteriaDomain.setXmainMark(null);
        
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthority("2");
        authDomain1.setAuthMgtComp("DNJ");
        authDomain1.setProcMfgDivCd("*");
        authDomain1.setPermitFuncId("W5001R");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthority("2");
        authDomain2.setAuthMgtComp("DNJ");
        authDomain2.setProcMfgDivCd("*");
        authDomain2.setPermitFuncId("W5001R");
        authDomainList.add(authDomain2);
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
        assertEquals(8, result);
    }

    /**
     * Test method for searchForPagingOnMainSearch
     * <br />searchForPagingOnMainSearchメソッドのテスト。
     * 
     * @throws IllegalAccessException IllegalAccessException
     * @throws NoSuchFieldException NoSuchFieldException
     */
    public void testSearchForPagingOnMainSearch01() throws NoSuchFieldException, IllegalAccessException {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W5001ShippingFirmService testService = (W5001ShippingFirmService)getContext().getBean("w5001ShippingFirmService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成

        W5001ShippingFirmCriteriaDomain criteriaDomain = new W5001ShippingFirmCriteriaDomain();
        criteriaDomain.setCarrierCompCd("AAA");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setCheckValidateWarning(false);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setContainerLooseTyp("C");
        criteriaDomain.setContainerNo("1");
        criteriaDomain.setContainerSortingKey("1");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setFmEtd(toDatetime("2014/01/01 00:00:00"));
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setMainMark(null);
        criteriaDomain.setOwnerCompCd("DNJ");
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(100);
        criteriaDomain.setScreenId("W5001");
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setSelected(null);
        criteriaDomain.setServerId("dev");
        criteriaDomain.setShippingFirmIssuerId("nexus");
        criteriaDomain.setShippingFirmNo("000");
        criteriaDomain.setShippingFirmStatus("10");
        criteriaDomain.setStgActNo(null);
        criteriaDomain.setStgInstrNo(null);
        criteriaDomain.setTimeZone("JST");
        criteriaDomain.setToEtd(toDatetime("2014/05/01 00:00:00"));
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setWhCd("A101");
        criteriaDomain.setWhCompCd("TG0");
        criteriaDomain.setWorkedIssuerId("nexus");
        criteriaDomain.setXmainMark(null);
        
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthority("2");
        authDomain1.setAuthMgtComp("DNJ");
        authDomain1.setProcMfgDivCd("*");
        authDomain1.setPermitFuncId("W5001R");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthority("2");
        authDomain2.setAuthMgtComp("DNJ");
        authDomain2.setProcMfgDivCd("*");
        authDomain2.setPermitFuncId("W5001R");
        authDomainList.add(authDomain2);
        criteriaDomain.setUserAuthList(authDomainList);
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<? extends W5001ShippingFirmDomain> result = null;
        try {
            result = testService.searchForPagingOnMainSearch(criteriaDomain);
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
            "shippingFirmNo=00046",
            "whCompCd=TG0",
            "whCd=A101",
            "trnsCd=S",
            "containerSortingKey=1",
            "containerLooseTyp=C",
            "shippingFirmStatus=10",
            "etd=2014/03/18 00:00:00",
            "carrierCompCd=AAA",
            "containerNo=1",
            "shippingFirmDt=2014/02/05 00:00:00",
            "shippingFirmIssuerNm=出荷確認者45",
            "workedDt=2014/02/07 00:00:00",
            "value=Instr.",
            "trnsTypCd=null",
            "pkgQty=null",
            "grossWeight=null",
            "weightUnit=null",
            "volume=null",
            "volumeUnit=null",
            "stgActNo=null",
            "stgInstrNo=null",
            "workedIssuerNm=null",
            "comUpdateTimestamp=null",
            "cmlDomainList=null",
            "screenId=null",
            "languageCd=null",
            "timeZone=null",
            "ownerCompCd=null",
            "charCd=null",
            "dateFormat=null",
            "selected=null",
            "rowNumFrom=0",
            "rowNumTo=0",
            "searchCountCheckFlg=true",
            "comCreateTimestamp=null",
            "comCreateUserId=null",
            "comCreateFuncId=null",
            "comUpdateTimestamp=null",
            "comUpdateUserId=null",
            "comUpdateFuncId=null",
            "loginUserDscId=null",
            "locale=null",
            "checkValidateWarning=false"
        };
        String[] targetFields = MatchingUtil.getTargetFields(expected);
        assertEquals(MatchingUtil.expectedToString(expected),
            MatchingUtil.actualToString(result.get(0), targetFields));
    }

    /**
     * Test method for searchCountForPagingOnCreateSearch
     * <br />searchCountForPagingOnCreateSearchメソッドのテスト。
     */
    public void testSearchCountForPagingOnCreateSearch01() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W5001ShippingFirmService testService = (W5001ShippingFirmService)getContext().getBean("w5001ShippingFirmService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W5001StgCriteriaDomain criteriaDomain = new W5001StgCriteriaDomain();
        criteriaDomain.setCarrierCompCd("AAA");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setCheckValidateWarning(false);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setContainerLooseTyp("L");
        criteriaDomain.setContainerSortingKey("111111");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setFmEtd(toDatetime("2014/03/01 00:00:00"));
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setOwnerCompCd("DNJ");
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(0);
        criteriaDomain.setScreenId("W5003");
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setSelected(null);
        criteriaDomain.setServerId("dev");
        criteriaDomain.setStgActNo("14");
        criteriaDomain.setStgInstrNo("123");
        criteriaDomain.setTimeZone("JST");
        criteriaDomain.setToEtd(toDatetime("2014/05/01 00:00:00"));
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setWhCd("A101");
        criteriaDomain.setWhCompCd("TG0");
            
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthority("2");
        authDomain1.setAuthMgtComp("DNJ");
        authDomain1.setProcMfgDivCd("*");
        authDomain1.setPermitFuncId("W5001R");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthority("2");
        authDomain2.setAuthMgtComp("DNJ");
        authDomain2.setProcMfgDivCd("*");
        authDomain2.setPermitFuncId("W5001R");
        authDomainList.add(authDomain2);
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
        assertEquals(7, result);
    }

    /**
     * Test method for searchForPagingOnCreateSearch
     * <br />searchForPagingOnCreateSearchメソッドのテスト。
     * 
     * @throws IllegalAccessException IllegalAccessException
     * @throws NoSuchFieldException NoSuchFieldException
     */
    public void testSearchForPagingOnCreateSearch01() throws NoSuchFieldException, IllegalAccessException {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W5001ShippingFirmService testService = (W5001ShippingFirmService)getContext().getBean("w5001ShippingFirmService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W5001StgCriteriaDomain criteriaDomain = new W5001StgCriteriaDomain();
        criteriaDomain.setCarrierCompCd("AAA");
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setCheckValidateWarning(false);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setContainerLooseTyp("L");
        criteriaDomain.setContainerSortingKey("111111");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setFmEtd(toDatetime("2014/03/01 00:00:00"));
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setOwnerCompCd("DNJ");
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(100);
        criteriaDomain.setScreenId("W5003");
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setSelected(null);
        criteriaDomain.setServerId("dev");
        criteriaDomain.setStgActNo("14");
        criteriaDomain.setStgInstrNo("123");
        criteriaDomain.setTimeZone("JST");
        criteriaDomain.setToEtd(toDatetime("2014/05/01 00:00:00"));
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setWhCd("A101");
        criteriaDomain.setWhCompCd("TG0");
            
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthority("2");
        authDomain1.setAuthMgtComp("DNJ");
        authDomain1.setProcMfgDivCd("*");
        authDomain1.setPermitFuncId("W5001R");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthority("2");
        authDomain2.setAuthMgtComp("DNJ");
        authDomain2.setProcMfgDivCd("*");
        authDomain2.setPermitFuncId("W5001R");
        authDomainList.add(authDomain2);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method.
        // テスト対象メソッドの呼び出し
        List<? extends W5001StgDomain> result = null;
        try {
            result = testService.searchForPagingOnCreateSearch(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);
        
        // Assert search count
        // 検索件数をassert
        assertEquals(7, result.size());

        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected = {
            "containerLooseTyp=L",
            "stgInstrNo=null",
            "stgActNo=142",
            "etd=2014/04/01 01:00:00",
            "carrierCompCd=AAA",
            "pkgQty=1",
            "grossWeight=1",
            "weightUnit=KG",
            "volume=1",
            "volumeUnit=KG",
            "screenId=null",
            "languageCd=null",
            "timeZone=null",
            "ownerCompCd=null",
            "charCd=null",
            "dateFormat=null",
            "selected=null",
            "rowNumFrom=0",
            "rowNumTo=0",
            "searchCountCheckFlg=true",
            "comCreateTimestamp=null",
            "comCreateUserId=null",
            "comCreateFuncId=null",
            "comUpdateTimestamp=null",
            "comUpdateUserId=null",
            "comUpdateFuncId=null",
            "loginUserDscId=null",
            "locale=null",
            "checkValidateWarning=false",
        };
        String[] targetFields = MatchingUtil.getTargetFields(expected);
        assertEquals(MatchingUtil.expectedToString(expected),
            MatchingUtil.actualToString(result.get(0), targetFields));
        
    }

    /**
     * Test method for searchOnRegisterInitByFromMain
     * <br />searchOnRegisterInitByFromMainメソッドのテスト。
     * 
     * @throws IllegalAccessException IllegalAccessException
     * @throws NoSuchFieldException NoSuchFieldException
     */
    public void testSearchOnRegisterInitByFromMain01() throws NoSuchFieldException, IllegalAccessException {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W5001ShippingFirmService testService = (W5001ShippingFirmService)getContext().getBean("w5001ShippingFirmService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W5001ShippingFirmCriteriaDomain criteriaDomain = new W5001ShippingFirmCriteriaDomain();
        criteriaDomain.setCarrierCompCd(null);
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setCheckValidateWarning(false);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setContainerLooseTyp(null);
        criteriaDomain.setContainerNo(null);
        criteriaDomain.setContainerSortingKey(null);
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setFmEtd(null);
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setMainMark(null);
        criteriaDomain.setOwnerCompCd("DNJ");
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(0);
        criteriaDomain.setScreenId("W5004");
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setSelected(null);
        criteriaDomain.setServerId("dev");
        criteriaDomain.setShippingFirmIssuerId(null);
        criteriaDomain.setShippingFirmNo("00001");
        criteriaDomain.setShippingFirmStatus(null);
        criteriaDomain.setStgActNo(null);
        criteriaDomain.setStgInstrNo(null);
        criteriaDomain.setTimeZone("JST");
        criteriaDomain.setToEtd(null);
        criteriaDomain.setTrnsCd(null);
        criteriaDomain.setWhCd(null);
        criteriaDomain.setWhCompCd(null);
        criteriaDomain.setWorkedIssuerId(null);
        criteriaDomain.setXmainMark(null);
        
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthority("2");
        authDomain1.setAuthMgtComp("DNJ");
        authDomain1.setProcMfgDivCd("*");
        authDomain1.setPermitFuncId("W5001R");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthority("2");
        authDomain2.setAuthMgtComp("DNJ");
        authDomain2.setProcMfgDivCd("*");
        authDomain2.setPermitFuncId("W5001R");
        authDomainList.add(authDomain2);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method.
        // テスト対象メソッドの呼び出し
        W5001ShippingFirmDomain result = null;
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
        assertEquals(14, result.getCmlDomainList().size());
        
        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected = {
            "shippingFirmNo=00001",
            "whCompCd=TG0",
            "whCd=A101",
            "trnsCd=T",
            "containerSortingKey=10002",
            "containerLooseTyp=L",
            "shippingFirmStatus=20",
            "etd=2014/02/01 00:00:00",
            "carrierCompCd=AAA",
            "containerNo=CON0001",
            "shippingFirmDt=2014/02/05 00:00:00",
            "shippingFirmIssuerNm=出荷確認者123456789101123456",
            "workedDt=2014/02/07 00:00:00",
            "value=Instr.",
            "trnsTypCd=7",
            "pkgQty=1",
            "grossWeight=1",
            "weightUnit=KG",
            "volume=1",
            "volumeUnit=KG",
            "stgActNo=111",
            "stgInstrNo=1111",
            "workedIssuerNm=テストデータ",
            "comUpdateTimestamp=2014/02/07 00:00:00",
            "screenId=null",
            "languageCd=null",
            "timeZone=null",
            "ownerCompCd=null",
            "charCd=null",
            "dateFormat=null",
            "selected=null",
            "rowNumFrom=0",
            "rowNumTo=0",
            "searchCountCheckFlg=true",
            "comCreateTimestamp=null",
            "comCreateUserId=null",
            "comCreateFuncId=null",
            "comUpdateUserId=null",
            "comUpdateFuncId=null",
            "loginUserDscId=null",
            "locale=null",
            "checkValidateWarning=false",
        };
        
        String[] targetFields = MatchingUtil.getTargetFields(expected);
        assertEquals(MatchingUtil.expectedToString(expected),
            MatchingUtil.actualToString(result, targetFields));
        
     // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected2 = {
            "shipperCd=null",
            "xmainMark=XMARK1",
            "mainMark=null",
            "invoiceEtd=null",
            "invoiceCarrierCompCd=null",
            "pltzGrossWeight=1",
            "pltzWeightUnit=KG",
            "pltzVolume=1",
            "pltzVolumeUnit=KG",
            "pltzStatus=null",
            "customTimingTyp=null",
            "shippingActNo=null",
            "containerLooseTyp=null",
            "invoiceNo=null",
            "auth=2",
            "screenId=null",
            "languageCd=null",
            "timeZone=null",
            "ownerCompCd=null",
            "charCd=null",
            "dateFormat=null",
            "selected=null",
            "rowNumFrom=0",
            "rowNumTo=0",
            "searchCountCheckFlg=true",
            "comCreateTimestamp=null",
            "comCreateUserId=null",
            "comCreateFuncId=null",
            "comUpdateTimestamp=null",
            "comUpdateUserId=null",
            "comUpdateFuncId=null",
            "loginUserDscId=null",
            "locale=null",
            "checkValidateWarning=false",
        };
        String[] targetFields2 = MatchingUtil.getTargetFields(expected2);
        assertEquals(MatchingUtil.expectedToString(expected2),
            MatchingUtil.actualToString(result.getCmlDomainList().get(0), targetFields2));
    }

    /**
     * Test method for searchOnRegisterInitByFromCreateStgInstr
     * <br />searchOnRegisterInitByFromCreateStgInstrメソッドのテスト。
     * 
     * @throws IllegalAccessException IllegalAccessException
     * @throws NoSuchFieldException NoSuchFieldException
     */
    public void testSearchOnRegisterInitByFromCreateStgInstr01() throws NoSuchFieldException, IllegalAccessException {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W5001ShippingFirmService testService = (W5001ShippingFirmService)getContext().getBean("w5001ShippingFirmService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W5001ShippingFirmCriteriaDomain criteriaDomain = new W5001ShippingFirmCriteriaDomain();
        criteriaDomain.setCarrierCompCd(null);
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setCheckValidateWarning(false);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setContainerLooseTyp(null);
        criteriaDomain.setContainerNo(null);
        criteriaDomain.setContainerSortingKey("111111");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setFmEtd(null);
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setMainMark(null);
        criteriaDomain.setOwnerCompCd("DNJ");
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(0);
        criteriaDomain.setScreenId("W5004");
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setSelected(null);
        criteriaDomain.setServerId("dev");
        criteriaDomain.setShippingFirmIssuerId(null);
        criteriaDomain.setShippingFirmNo(null);
        criteriaDomain.setShippingFirmStatus(null);
        criteriaDomain.setStgActNo(null);
        criteriaDomain.setStgInstrNo("5001");
        criteriaDomain.setTimeZone("JST");
        criteriaDomain.setToEtd(null);
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setWhCd("A101");
        criteriaDomain.setWhCompCd("TG0");
        criteriaDomain.setWorkedIssuerId(null);
        criteriaDomain.setXmainMark(null);
        
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthority("2");
        authDomain1.setAuthMgtComp("DNJ");
        authDomain1.setProcMfgDivCd("*");
        authDomain1.setPermitFuncId("W5001R");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthority("2");
        authDomain2.setAuthMgtComp("DNJ");
        authDomain2.setProcMfgDivCd("*");
        authDomain2.setPermitFuncId("W5001R");
        authDomainList.add(authDomain2);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method.
        // テスト対象メソッドの呼び出し
        W5001ShippingFirmDomain result = null;
        try {
            result = testService.searchOnRegisterInitByFromCreateStgInstr(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);
        
        // Assert search count
        // 検索件数をassert
        assertNotNull(result);
        assertEquals(12, result.getCmlDomainList().size());
        
        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected = {
            "shippingFirmNo=null",
            "whCompCd=null",
            "whCd=null",
            "trnsCd=null",
            "containerSortingKey=null",
            "containerLooseTyp=L",
            "shippingFirmStatus=null",
            "etd=null",
            "carrierCompCd=null",
            "containerNo=null",
            "shippingFirmDt=null",
            "shippingFirmIssuerNm=null",
            "workedDt=null",
            "value=null",
            "trnsTypCd=null",
            "pkgQty=1",
            "grossWeight=1",
            "weightUnit=KG",
            "volume=1000000000",
            "volumeUnit=KG",
            "stgActNo=null",
            "stgInstrNo=5001",
            "workedIssuerNm=null",
            "screenId=null",
            "languageCd=null",
            "timeZone=null",
            "ownerCompCd=null",
            "charCd=null",
            "dateFormat=null",
            "selected=null",
            "rowNumFrom=0",
            "rowNumTo=0",
            "searchCountCheckFlg=true",
            "comCreateTimestamp=null",
            "comCreateUserId=null",
            "comCreateFuncId=null",
            "comUpdateTimestamp=null",
            "comUpdateUserId=null",
            "comUpdateFuncId=null",
            "loginUserDscId=null",
            "locale=null",
            "checkValidateWarning=false",
        };
        
        String[] targetFields = MatchingUtil.getTargetFields(expected);
        assertEquals(MatchingUtil.expectedToString(expected),
            MatchingUtil.actualToString(result, targetFields));
        
     // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected2 = {
            "shipperCd=DNJ",
            "xmainMark=null",
            "mainMark=MMARK71",
            "invoiceEtd=2014/02/17 00:00:00",
            "invoiceCarrierCompCd=1",
            "pltzGrossWeight=1",
            "pltzWeightUnit=KG",
            "pltzVolume=1",
            "pltzVolumeUnit=KG",
            "pltzStatus=null",
            "customTimingTyp=null",
            "shippingActNo=null",
            "containerLooseTyp=null",
            "invoiceNo=null",
            "auth=null",
            "screenId=null",
            "languageCd=null",
            "timeZone=null",
            "ownerCompCd=null",
            "charCd=null",
            "dateFormat=null",
            "selected=null",
            "rowNumFrom=0",
            "rowNumTo=0",
            "searchCountCheckFlg=true",
            "comCreateTimestamp=null",
            "comCreateUserId=null",
            "comCreateFuncId=null",
            "comUpdateTimestamp=null",
            "comUpdateUserId=null",
            "comUpdateFuncId=null",
            "loginUserDscId=null",
            "locale=null",
            "checkValidateWarning=false",
        };
        String[] targetFields2 = MatchingUtil.getTargetFields(expected2);
        assertEquals(MatchingUtil.expectedToString(expected2),
            MatchingUtil.actualToString(result.getCmlDomainList().get(0), targetFields2));
    }

    /**
     * Test method for searchOnRegisterInitByFromCreateStgAct
     * <br />searchOnRegisterInitByFromCreateStgActメソッドのテスト。
     * 
     * @throws IllegalAccessException IllegalAccessException
     * @throws NoSuchFieldException NoSuchFieldException
     */
    public void testSearchOnRegisterInitByFromCreateStgAct01() throws NoSuchFieldException, IllegalAccessException {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W5001ShippingFirmService testService = (W5001ShippingFirmService)getContext().getBean("w5001ShippingFirmService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W5001ShippingFirmCriteriaDomain criteriaDomain = new W5001ShippingFirmCriteriaDomain();
        criteriaDomain.setCarrierCompCd(null);
        criteriaDomain.setCharCd("utf-8");
        criteriaDomain.setCheckValidateWarning(false);
        criteriaDomain.setComCreateFuncId(null);
        criteriaDomain.setComCreateTimestamp(null);
        criteriaDomain.setComCreateUserId(null);
        criteriaDomain.setComUpdateFuncId(null);
        criteriaDomain.setComUpdateTimestamp(null);
        criteriaDomain.setComUpdateUserId(null);
        criteriaDomain.setContainerLooseTyp(null);
        criteriaDomain.setContainerNo(null);
        criteriaDomain.setContainerSortingKey("111111");
        criteriaDomain.setDateFormat(null);
        criteriaDomain.setFmEtd(null);
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLocale(new Locale("en"));
        criteriaDomain.setLoginUserDscId("nexus");
        criteriaDomain.setMainMark(null);
        criteriaDomain.setOwnerCompCd("DNJ");
        criteriaDomain.setRowNumFrom(0);
        criteriaDomain.setRowNumTo(0);
        criteriaDomain.setScreenId("W5004");
        criteriaDomain.setSearchCountCheckFlg(true);
        criteriaDomain.setSelected(null);
        criteriaDomain.setServerId("dev");
        criteriaDomain.setShippingFirmIssuerId(null);
        criteriaDomain.setShippingFirmNo(null);
        criteriaDomain.setShippingFirmStatus(null);
        criteriaDomain.setStgActNo("142");
        criteriaDomain.setStgInstrNo(null);
        criteriaDomain.setTimeZone("JST");
        criteriaDomain.setToEtd(null);
        criteriaDomain.setTrnsCd("S");
        criteriaDomain.setWhCd("A101");
        criteriaDomain.setWhCompCd("TG0");
        criteriaDomain.setWorkedIssuerId(null);
        criteriaDomain.setXmainMark(null);
        
        List<UserAuthDomain> authDomainList = new ArrayList<UserAuthDomain>();
        UserAuthDomain authDomain1 = new UserAuthDomain();
        authDomain1.setAuthority("2");
        authDomain1.setAuthMgtComp("DNJ");
        authDomain1.setProcMfgDivCd("*");
        authDomain1.setPermitFuncId("W5001R");
        authDomainList.add(authDomain1);
        UserAuthDomain authDomain2 = new UserAuthDomain();
        authDomain2.setAuthority("2");
        authDomain2.setAuthMgtComp("DNJ");
        authDomain2.setProcMfgDivCd("*");
        authDomain2.setPermitFuncId("W5001R");
        authDomainList.add(authDomain2);
        criteriaDomain.setUserAuthList(authDomainList);

        // Call the test method.
        // テスト対象メソッドの呼び出し
        W5001ShippingFirmDomain result = null;
        try {
            result = testService.searchOnRegisterInitByFromCreateStgAct(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Log output of search results
        Debug.dump(result);
        
        // Assert search count
        // 検索件数をassert
        assertNotNull(result);
        assertEquals(24, result.getCmlDomainList().size());
        
        // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected = {
            "shippingFirmNo=null",
            "whCompCd=null",
            "whCd=null",
            "trnsCd=null",
            "containerSortingKey=null",
            "containerLooseTyp=null",
            "shippingFirmStatus=null",
            "etd=null",
            "carrierCompCd=null",
            "containerNo=null",
            "shippingFirmDt=null",
            "shippingFirmIssuerNm=null",
            "workedDt=null",
            "value=null",
            "trnsTypCd=1",
            "pkgQty=1",
            "grossWeight=1",
            "weightUnit=KG",
            "volume=1",
            "volumeUnit=KG",
            "stgActNo=142",
            "stgInstrNo=null",
            "workedIssuerNm=null",
            "screenId=null",
            "languageCd=null",
            "timeZone=null",
            "ownerCompCd=null",
            "charCd=null",
            "dateFormat=null",
            "selected=null",
            "rowNumFrom=0",
            "rowNumTo=0",
            "searchCountCheckFlg=true",
            "comCreateTimestamp=null",
            "comCreateUserId=null",
            "comCreateFuncId=null",
            "comUpdateTimestamp=null",
            "comUpdateUserId=null",
            "comUpdateFuncId=null",
            "loginUserDscId=null",
            "locale=null",
            "checkValidateWarning=false",
        };
        
        String[] targetFields = MatchingUtil.getTargetFields(expected);
        assertEquals(MatchingUtil.expectedToString(expected),
            MatchingUtil.actualToString(result, targetFields));
        
     // Assert 1 items search result
        // 検索結果1件目をassert
        String[] expected2 = {
            "shipperCd=null",
            "xmainMark=XMARK52",
            "mainMark=null",
            "invoiceEtd=null",
            "invoiceCarrierCompCd=null",
            "pltzGrossWeight=1",
            "pltzWeightUnit=KG",
            "pltzVolume=1",
            "pltzVolumeUnit=KG",
            "pltzStatus=null",
            "customTimingTyp=null",
            "shippingActNo=null",
            "containerLooseTyp=null",
            "invoiceNo=null",
            "auth=null",
            "screenId=null",
            "languageCd=null",
            "timeZone=null",
            "ownerCompCd=null",
            "charCd=null",
            "dateFormat=null",
            "selected=null",
            "rowNumFrom=0",
            "rowNumTo=0",
            "searchCountCheckFlg=true",
            "comCreateTimestamp=null",
            "comCreateUserId=null",
            "comCreateFuncId=null",
            "comUpdateTimestamp=null",
            "comUpdateUserId=null",
            "comUpdateFuncId=null",
            "loginUserDscId=null",
            "locale=null",
            "checkValidateWarning=false",
        };
        String[] targetFields2 = MatchingUtil.getTargetFields(expected2);
        assertEquals(MatchingUtil.expectedToString(expected2),
            MatchingUtil.actualToString(result.getCmlDomainList().get(0), targetFields2));
    }
    
    //--------------------------------- Private methods below ----------------------------------

    /**
     * Get an ApplicationContext
     * @return ApplicationContext
     */
    private ApplicationContext getContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {
                "WEB-INF/applicationContext-aij2.xml"
                , "WEB-INF/applicationContext-aij2-jdbc.xml"
                , "WEB-INF/applicationContext-aij2-aop.xml"
                , "WEB-INF/applicationContext-library.xml"
            }
        );
        return context;
    }

    /**
     * Conversion datetime string -> java.util.Date
     * @param s date
     * @return date
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
}
