/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.business.domain.Wt015UnitPriceErrListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt015UnitPriceErrListCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt015UnitPriceErrListService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt015UnitPriceErrorListServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt015UnitPriceErrListServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt015UnitPriceErrListServiceImplTest() {
    }
    
    /**
     * Test method for searchByCondition
     * <br /> searchByConditionメソッドのテスト。
     */
    public void testSearchByCondition() {
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt015UnitPriceErrListService testService
            = (Wt015UnitPriceErrListService)getContext().getBean("wt015UnitPriceErrListService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt015UnitPriceErrListCriteriaDomain criteriaDomain
            = new Wt015UnitPriceErrListCriteriaDomain();
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setLoginUserDscId("10088NXS0001");
        criteriaDomain.setGrpNo1("1");
        criteriaDomain.setGrpNo2("0");
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt015UnitPriceErrListDomain expectation = new Wt015UnitPriceErrListDomain();
        expectation.setCustomerCd("30001205");
        expectation.setCurrCd("THB");
        expectation.setUnitPrice("N");
        expectation.setItemNo("TG146532-22005X");
        expectation.setCustomerPoNo("1Y08K01");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt015UnitPriceErrListDomain> result
            = new ArrayList<Wt015UnitPriceErrListDomain>();
        try {
            result = testService.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getCustomerCd(), result.get(0).getCustomerCd());
        assertEquals(expectation.getCurrCd(), result.get(0).getCurrCd());
        assertEquals(expectation.getUnitPrice(), result.get(0).getUnitPrice());
        assertEquals(expectation.getItemNo(), result.get(0).getItemNo());
        assertEquals(expectation.getCustomerPoNo(), result.get(0).getCustomerPoNo());

        
        // Log output of search results
        Debug.dump(result);
    }
    
    /**
     * Test method for searchCount
     * <br /> searchCountメソッドのテスト。
     */
    public void testSearchCount() {
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt015UnitPriceErrListService testService
            = (Wt015UnitPriceErrListService)getContext().getBean("wt015UnitPriceErrListService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt015UnitPriceErrListCriteriaDomain criteriaDomain
            = new Wt015UnitPriceErrListCriteriaDomain();
        criteriaDomain.setShipperCd("TG0");
        criteriaDomain.setLoginUserDscId("10088NXS0001");
        criteriaDomain.setGrpNo1("1");
        criteriaDomain.setGrpNo2("0");
        criteriaDomain.setScreenId("WT015");
        criteriaDomain.setLanguageCd("jp");
        
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
