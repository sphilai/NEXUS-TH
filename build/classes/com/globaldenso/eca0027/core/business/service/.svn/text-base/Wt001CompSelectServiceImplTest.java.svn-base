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

import com.globaldenso.eca0027.core.business.domain.Wt001CompSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt001CompSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt001CompSelectService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt001CompanySelectServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt001CompSelectServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt001CompSelectServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     */
    public void testSearchByConditionForPaging() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt001CompSelectService testService
            = (Wt001CompSelectService)getContext().getBean("wt001CompSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt001CompSelectCriteriaDomain criteriaDomain
            = new Wt001CompSelectCriteriaDomain();
        criteriaDomain.setCompCd("TG");
        criteriaDomain.setCompNm("B_DENSO");
        criteriaDomain.setCompNmAbb("DNTH");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt001CompSelectDomain expectation = new Wt001CompSelectDomain();
        expectation.setCompCd("TG1");
        expectation.setCompNm("B_DENSO");
        expectation.setCompNmAbb("DNTH");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt001CompSelectDomain> result = new ArrayList<Wt001CompSelectDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getCompCd(), result.get(0).getCompCd());
        assertEquals(expectation.getCompNm(), result.get(0).getCompNm());
        assertEquals(expectation.getCompNmAbb(), result.get(0).getCompNmAbb());
        
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
        Wt001CompSelectService testService
            = (Wt001CompSelectService)getContext().getBean("wt001CompSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt001CompSelectCriteriaDomain criteriaDomain
            = new Wt001CompSelectCriteriaDomain();
        criteriaDomain.setCompCd("TG");
        criteriaDomain.setCompNm("B_DENSO");
        criteriaDomain.setCompNmAbb("DNTH");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT001");
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
        assertEquals(7, searchCount);
        
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
