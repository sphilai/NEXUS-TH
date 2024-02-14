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

import com.globaldenso.eca0027.core.business.domain.Wt005CmlInfoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt005CmlInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt005CmlInfoService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt005CmlInfoServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt005CmlInfoServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt005CmlInfoServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByCondition
     * <br /> searchByConditionメソッドのテスト。
     */
    public void testSearchByCondition() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt005CmlInfoService testService
            = (Wt005CmlInfoService)getContext().getBean("wt005CmlInfoService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt005CmlInfoCriteriaDomain criteriaDomain
            = new Wt005CmlInfoCriteriaDomain();
        criteriaDomain.setXmainMark("2");
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt005CmlInfoDomain expectation = new Wt005CmlInfoDomain();
        expectation.setMainMark("DTG0A101404010014");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt005CmlInfoDomain> result = new ArrayList<Wt005CmlInfoDomain>();
        try {
            result = testService.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Check result
        assertEquals(expectation.getMainMark(), result.get(0).getMainMark());
        
        // Log output of search results
        Debug.dump(result);
    }
    
    /**
     * Test method for searchByCount
     * <br /> searchCountメソッドのテスト。
     */
    public void testSearchCount() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt005CmlInfoService testService
            = (Wt005CmlInfoService)getContext().getBean("wt005CmlInfoService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt005CmlInfoCriteriaDomain criteriaDomain
            = new Wt005CmlInfoCriteriaDomain();
        criteriaDomain.setXmainMark("1");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT005");
        
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
