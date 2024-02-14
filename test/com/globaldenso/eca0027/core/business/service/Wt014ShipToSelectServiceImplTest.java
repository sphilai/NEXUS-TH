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

import com.globaldenso.eca0027.core.business.domain.Wt014ShipToSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt014ShipToSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt014ShipToSelectService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt014ShipToSelectServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt014ShipToSelectServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt014ShipToSelectServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     */
    public void testSearchByConditionForPaging() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt014ShipToSelectService testService
            = (Wt014ShipToSelectService)getContext().getBean("wt014ShipToSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt014ShipToSelectCriteriaDomain criteriaDomain
            = new Wt014ShipToSelectCriteriaDomain();
        criteriaDomain.setShipToCd("PH000");
        criteriaDomain.setShipToNmAbb("PAC E/P");
        criteriaDomain.setShipToNm("PHILIPPINE AUTO COMPONENTS, INC.");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt014ShipToSelectDomain expectation = new Wt014ShipToSelectDomain();
        expectation.setShipToCd("PH000");
        expectation.setShipToNmAbb("PAC E/P");
        expectation.setShipToNm("PHILIPPINE AUTO COMPONENTS, INC.");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt014ShipToSelectDomain> result = new ArrayList<Wt014ShipToSelectDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getShipToCd(), result.get(0).getShipToCd());
        assertEquals(expectation.getShipToNmAbb(), result.get(0).getShipToNmAbb());
        assertEquals(expectation.getShipToNm(), result.get(0).getShipToNm());
        
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
        Wt014ShipToSelectService testService
            = (Wt014ShipToSelectService)getContext().getBean("wt014ShipToSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt014ShipToSelectCriteriaDomain criteriaDomain
            = new Wt014ShipToSelectCriteriaDomain();
        criteriaDomain.setShipToCd("PH000");
        criteriaDomain.setShipToNmAbb("PAC E/P");
        criteriaDomain.setShipToNm("PHILIPPINE AUTO COMPONENTS, INC.");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT014");
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
