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

import com.globaldenso.eca0027.core.business.domain.Wt011CntrySelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt011CntrySelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt011CntrySelectService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt011CountrySelectServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt011CntrySelectServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt011CntrySelectServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     */
    public void testSearchByConditionForPaging() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt011CntrySelectService testService
            = (Wt011CntrySelectService)getContext().getBean("wt011CntrySelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt011CntrySelectCriteriaDomain criteriaDomain
            = new Wt011CntrySelectCriteriaDomain();
        criteriaDomain.setCntryCd("SG");
        criteriaDomain.setCntryNm("Singapore");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt011CntrySelectDomain expectation = new Wt011CntrySelectDomain();
        expectation.setCntryCd("SG");
        expectation.setCntryNm("Singapore");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt011CntrySelectDomain> result = new ArrayList<Wt011CntrySelectDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getCntryCd(), result.get(0).getCntryCd());
        assertEquals(expectation.getCntryNm(), result.get(0).getCntryNm());
        
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
        Wt011CntrySelectService testService
            = (Wt011CntrySelectService)getContext().getBean("wt011CntrySelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt011CntrySelectCriteriaDomain criteriaDomain
            = new Wt011CntrySelectCriteriaDomain();
        criteriaDomain.setCntryCd("SG");
        criteriaDomain.setCntryNm("Singapore");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT011");
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
