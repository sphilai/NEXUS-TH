/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO IT SOLUTIONS,INC. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListBorderDateDomain;
import com.globaldenso.eca0027.core.business.domain.Wt017ShippingActWarnListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt017ShippingActWarnListCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt017ShippingActWarnListService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt017ShippingActualityWarningListServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt017ShippingActWarnListServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt017ShippingActWarnListServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionTmNxsComp
     * <br /> searchByConditionTmNxsCompメソッドのテスト。
     */
    public void testSearchByConditionTmNxsComp() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt017ShippingActWarnListService testService
            = (Wt017ShippingActWarnListService)getContext().getBean("wt017ShippingActWarnListService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt017ShippingActWarnListCriteriaDomain criteriaDomain
            = new Wt017ShippingActWarnListCriteriaDomain();
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();
        UserAuthDomain userAuthDomain = new UserAuthDomain();
        userAuthDomain.setAuthMgtComp("TG0");
        userAuthList.add(userAuthDomain);
        criteriaDomain.setUserAuthList(userAuthList);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt017ShippingActWarnListDomain expectation = new Wt017ShippingActWarnListDomain();
        expectation.setShipperCd("TG0");
        expectation.setTimezoneId("JST");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt017ShippingActWarnListDomain> result
            = new ArrayList<Wt017ShippingActWarnListDomain>();
        try {
            result = testService.searchByConditionTmNxsComp(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getShipperCd(), result.get(0).getShipperCd());
        assertEquals(expectation.getTimezoneId(), result.get(0).getTimezoneId());
        
        // Log output of search results
        Debug.dump(result);
    }
    
    /**
     * Test method for searchCountTmNxsComp
     * <br /> searchCountTmNxsCompメソッドのテスト。
     */
    public void testSearchCountTmNxsComp() {
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt017ShippingActWarnListService testService
            = (Wt017ShippingActWarnListService)getContext().getBean("wt017ShippingActWarnListService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt017ShippingActWarnListCriteriaDomain criteriaDomain
            = new Wt017ShippingActWarnListCriteriaDomain();
        List<UserAuthDomain> userAuthList = new ArrayList<UserAuthDomain>();
        UserAuthDomain userAuthDomain = new UserAuthDomain();
        userAuthDomain.setAuthMgtComp("TG0");
        criteriaDomain.setScreenId("WT017");
        criteriaDomain.setLanguageCd("jp");
        userAuthList.add(userAuthDomain);
        criteriaDomain.setUserAuthList(userAuthList);
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        int searchCount = -1;
        try {
            searchCount = testService.searchCountTmNxsComp(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(1, searchCount);
        
        // Log output of search results
        Debug.dump(searchCount);
    }
    
    /**
     * Test method for searchByConditionForPagingTtInvoice
     * <br /> searchByConditionForPagingTtInvoiceメソッドのテスト。
     */
    public void testSearchByConditionForPagingTtInvoice() {
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt017ShippingActWarnListService testService
            = (Wt017ShippingActWarnListService)getContext().getBean("wt017ShippingActWarnListService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt017ShippingActWarnListCriteriaDomain criteriaDomain
            = new Wt017ShippingActWarnListCriteriaDomain();
        List<Wt017ShippingActWarnListBorderDateDomain> dateDomainList =
            new ArrayList<Wt017ShippingActWarnListBorderDateDomain>();
        Wt017ShippingActWarnListBorderDateDomain dateDomain =
            new Wt017ShippingActWarnListBorderDateDomain();
        dateDomain.setShipperCd("TG0");
        dateDomain.setEtdBorderDate(toDatetime("2014/04/10 10:00:00"));
        dateDomainList.add(dateDomain);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        criteriaDomain.setEtdBorderDateList(dateDomainList);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt017ShippingActWarnListDomain expectation = new Wt017ShippingActWarnListDomain();
        expectation.setShipperCd("TG0");
        expectation.setEtd(toDatetime("2014/04/04 10:00:00"));
        expectation.setTrnsCd("S");
        expectation.setInvoiceNo("100001");
        expectation.setCmlTyp("1");
        expectation.setConsigneeCd("JP0");
        expectation.setShipToCd("JP000");
        expectation.setCustomerCd("30001205");
        expectation.setLgcyShipTo("09");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt017ShippingActWarnListDomain> result
            = new ArrayList<Wt017ShippingActWarnListDomain>();
        try {
            result = testService.searchByConditionForPagingTtInvoice(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Check result
        assertEquals(expectation.getShipperCd(), result.get(0).getShipperCd());
        assertEquals(expectation.getEtd(), result.get(0).getEtd());
        assertEquals(expectation.getTrnsCd(), result.get(0).getTrnsCd());
        assertEquals(expectation.getInvoiceNo(), result.get(0).getInvoiceNo());
        assertEquals(expectation.getCmlTyp(), result.get(0).getCmlTyp());
        assertEquals(expectation.getConsigneeCd(), result.get(0).getConsigneeCd());
        assertEquals(expectation.getShipToCd(), result.get(0).getShipToCd());
        assertEquals(expectation.getCustomerCd(), result.get(0).getCustomerCd());
        assertEquals(expectation.getLgcyShipTo(), result.get(0).getLgcyShipTo());
        
        // Log output of search results
        Debug.dump(result);
    }
    
    /**
     * Test method for searchCountTtInvoice
     * <br /> searchCountTtInvoiceメソッドのテスト。
     */
    public void testSearchCountTtInvoice() {
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt017ShippingActWarnListService testService
            = (Wt017ShippingActWarnListService)getContext().getBean("wt017ShippingActWarnListService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt017ShippingActWarnListCriteriaDomain criteriaDomain
            = new Wt017ShippingActWarnListCriteriaDomain();
        List<Wt017ShippingActWarnListBorderDateDomain> dateDomainList =
            new ArrayList<Wt017ShippingActWarnListBorderDateDomain>();
        Wt017ShippingActWarnListBorderDateDomain dateDomain =
            new Wt017ShippingActWarnListBorderDateDomain();
        dateDomain.setShipperCd("TG0");
        dateDomain.setEtdBorderDate(toDatetime("2014/04/10 10:00:00"));
        dateDomainList.add(dateDomain);
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        criteriaDomain.setScreenId("WT017");
        criteriaDomain.setLanguageCd("jp");
        criteriaDomain.setEtdBorderDateList(dateDomainList);
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        int searchCount = -1;
        try {
            searchCount = testService.searchCountTtInvoice(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(12, searchCount);
        
        // Log output of search results
        Debug.dump(searchCount);
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
