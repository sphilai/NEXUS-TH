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

import com.globaldenso.eca0027.core.business.domain.Wt008PortSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt008PortSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt008PortSelectService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt008PortSelectServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt008PortSelectServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt008PortSelectServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     */
    public void testSearchByConditionForPaging() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt008PortSelectService testService
            = (Wt008PortSelectService)getContext().getBean("wt008PortSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt008PortSelectCriteriaDomain criteriaDomain
            = new Wt008PortSelectCriteriaDomain();
        criteriaDomain.setPortNm("PARIS");
        criteriaDomain.setCntryCd("FR");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt008PortSelectDomain expectation = new Wt008PortSelectDomain();
        expectation.setPortCd("100");
        expectation.setPortNm("PARIS");
        expectation.setCntryCd("FR");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt008PortSelectDomain> result = new ArrayList<Wt008PortSelectDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Check result
        assertEquals(expectation.getPortCd(), result.get(0).getPortCd());
        assertEquals(expectation.getPortNm(), result.get(0).getPortNm());
        assertEquals(expectation.getCntryCd(), result.get(0).getCntryCd());

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
        Wt008PortSelectService testService
            = (Wt008PortSelectService)getContext().getBean("wt008PortSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt008PortSelectCriteriaDomain criteriaDomain
            = new Wt008PortSelectCriteriaDomain();
        criteriaDomain.setPortNm("PARIS");
        criteriaDomain.setCntryCd("FR");
        criteriaDomain.setLanguageCd("JA");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT008");
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
        assertEquals(83, searchCount);
        
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
