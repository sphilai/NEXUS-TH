/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO IT SOLUTIONS,INC. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.business.domain.Wt007ItemNoInfoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt007ItemNoInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt007ItemNoInfoService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt007ItemNoInfoServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt007ItemNoInfoServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt007ItemNoInfoServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByCondition
     * <br /> searchByConditionメソッドのテスト(MAINMARKver)
     */
    public void testSearchByConditionTtPltzItem() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt007ItemNoInfoService testService
            = (Wt007ItemNoInfoService)getContext().getBean("wt007ItemNoInfoService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt007ItemNoInfoCriteriaDomain criteriaDomain
            = new Wt007ItemNoInfoCriteriaDomain();
        criteriaDomain.setMainMark("DTG0A101404010002");
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt007ItemNoInfoDomain expectation = new Wt007ItemNoInfoDomain();
        expectation.setItemNo("TG197400-5081BT");
        expectation.setPkgCd("103");
        expectation.setShipLot("101");
        expectation.setActualPkgQty("100");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt007ItemNoInfoDomain> result = new ArrayList<Wt007ItemNoInfoDomain>();
        try {
            result = testService.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Check result
        assertEquals(expectation.getItemNo(), result.get(10).getItemNo());
        assertEquals(expectation.getPkgCd(), result.get(10).getPkgCd());
        assertEquals(expectation.getShipLot(), result.get(10).getShipLot());
        assertEquals(expectation.getActualPkgQty(), result.get(10).getActualPkgQty());
        
        // Log output of search results
        Debug.dump(result);
    }
    
    /**
     * Test method for searchByCondition
     * <br /> searchByConditionメソッドのテスト(MixTagNo ver)
     */
    public void testSearchByConditionTtMixtagItemNo() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt007ItemNoInfoService testService
            = (Wt007ItemNoInfoService)getContext().getBean("wt007ItemNoInfoService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt007ItemNoInfoCriteriaDomain criteriaDomain
            = new Wt007ItemNoInfoCriteriaDomain();
        criteriaDomain.setMixTagNo("DTG0A101404010002");
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt007ItemNoInfoDomain expectation = new Wt007ItemNoInfoDomain();
        expectation.setItemNo("989923-0623");
        expectation.setPkgCd("101");
        expectation.setShipLot("101");
        expectation.setActualPkgQty("20");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt007ItemNoInfoDomain> result = new ArrayList<Wt007ItemNoInfoDomain>();
        try {
            result = testService.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Check result
        assertEquals(expectation.getItemNo(), result.get(1).getItemNo());
        assertEquals(expectation.getPkgCd(), result.get(1).getPkgCd());
        assertEquals(expectation.getShipLot(), result.get(1).getShipLot());
        assertEquals(expectation.getActualPkgQty(), result.get(1).getActualPkgQty());
        
        // Log output of search results
        Debug.dump(result);
    }
    
    /**
     * Test method for searchCount
     * <br /> searchCountメソッドのテスト(MainMark ver)
     */
    public void testSearchCountTtPltzItem() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt007ItemNoInfoService testService
            = (Wt007ItemNoInfoService)getContext().getBean("wt007ItemNoInfoService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt007ItemNoInfoCriteriaDomain criteriaDomain
            = new Wt007ItemNoInfoCriteriaDomain();
        criteriaDomain.setMainMark("DTG0A101404010002");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT007");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        int searchCount = -1;
        try {
            searchCount = testService.searchCount(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(14, searchCount);
        
        // Log output of search results
        Debug.dump(searchCount);
    }
    
    /**
     * Test method for searchCount
     * <br /> searchCountメソッドのテスト(MixTagNo ver)
     */
    public void testSearchCountTtMixtagItemNo() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt007ItemNoInfoService testService
            = (Wt007ItemNoInfoService)getContext().getBean("wt007ItemNoInfoService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt007ItemNoInfoCriteriaDomain criteriaDomain
            = new Wt007ItemNoInfoCriteriaDomain();
        criteriaDomain.setMixTagNo("DTG0A101404010002");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT007");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        int searchCount = -1;
        try {
            searchCount = testService.searchCount(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(13, searchCount);
        
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
}
