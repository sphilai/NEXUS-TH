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

import com.globaldenso.eca0027.core.business.domain.Wt010WhSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt010WhSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt010WhSelectService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt010WhSelectServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt010WhSelectServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt010WhSelectServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     */
    public void testSearchByConditionForPaging() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt010WhSelectService testService
            = (Wt010WhSelectService)getContext().getBean("wt010WhSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt010WhSelectCriteriaDomain criteriaDomain
            = new Wt010WhSelectCriteriaDomain();
        criteriaDomain.setCompCd("MA0");
        criteriaDomain.setWhCd("A101");
        criteriaDomain.setWhNm("DENSO (MALAYSIA) SDN.BHD.");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt010WhSelectDomain expectation = new Wt010WhSelectDomain();
        expectation.setCompCd("MA0");
        expectation.setWhCd("A101");
        expectation.setWhNm("DENSO (MALAYSIA) SDN.BHD.");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt010WhSelectDomain> result = new ArrayList<Wt010WhSelectDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getCompCd(), result.get(0).getCompCd());
        assertEquals(expectation.getWhCd(), result.get(0).getWhCd());
        assertEquals(expectation.getWhNm(), result.get(0).getWhNm());
        
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
        Wt010WhSelectService testService
            = (Wt010WhSelectService)getContext().getBean("wt010WhSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt010WhSelectCriteriaDomain criteriaDomain
            = new Wt010WhSelectCriteriaDomain();
        criteriaDomain.setCompCd("MA0");
        criteriaDomain.setWhCd("A101");
        criteriaDomain.setWhNm("DENSO (MALAYSIA) SDN.BHD.");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT010");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        int searchCount = -1;
        try {
            searchCount = testService.searchCount(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(1, searchCount);
        
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
