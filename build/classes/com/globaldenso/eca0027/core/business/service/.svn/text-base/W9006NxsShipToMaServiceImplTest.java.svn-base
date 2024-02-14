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

import com.globaldenso.eca0027.core.business.domain.W9006NxsShipToMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9006NxsShipToMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9006NxsShipToMaService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for W9006NxsShipToMaServiceImpl.
 * 
 * @author $Author: 10088DS01498 $
 * @version $Revision: 6665 $
 */
public class W9006NxsShipToMaServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public W9006NxsShipToMaServiceImplTest() {
    }

    // --------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging <br />
     * searchByConditionForPagingメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchByConditionForPaging() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9006NxsShipToMaService testService = (W9006NxsShipToMaService)getContext()
            .getBean("w9006NxsShipToMaService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9006NxsShipToMaCriteriaDomain criteriaDomain = new W9006NxsShipToMaCriteriaDomain();
        criteriaDomain.setShipToCd("JP");
        criteriaDomain.setShipToNm("DENSO CORPORATION");
        criteriaDomain.setShipToNmAbb("DNJP");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);

        // Create search expectation domain
        // 検索予想ドメイン作成
        W9006NxsShipToMaCriteriaDomain expectation = new W9006NxsShipToMaCriteriaDomain();
        expectation.setShipToCd("JP000");
        expectation.setShipToNm("DENSO CORPORATION");
        expectation.setShipToNmAbb("DNJP");

        // Call the test method
        // テスト対象メソッドの呼び出し
        List<W9006NxsShipToMaDomain> result = new ArrayList<W9006NxsShipToMaDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getShipToCd(), result.get(0).getShipToCd());
        assertEquals(expectation.getShipToNm(), result.get(0).getShipToNm());
        assertEquals(expectation.getShipToNmAbb(), result.get(0)
            .getShipToNmAbb());

        // Log output of search results
        Debug.dump(result);
    }

    /**
     * Test method for searchCount <br />
     * searchCountメソッドのテスト。
     * 
     * @throws Exception exception
     */
    public void testSearchCount() throws Exception {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9006NxsShipToMaService testService = (W9006NxsShipToMaService)getContext()
            .getBean("w9006NxsShipToMaService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9006NxsShipToMaCriteriaDomain criteriaDomain = new W9006NxsShipToMaCriteriaDomain();
        criteriaDomain.setShipToCd("PH");
        criteriaDomain.setShipToNm("PHILIPPINE AUTO COMPONENTS, INC.");
        criteriaDomain.setShipToNmAbb("PAC");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("W9006");
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
        assertEquals(9, searchCount);

        // Log output of search results
        Debug.dump(searchCount);
    }

    // --------------------------------- Private methods below ----------------------------------

    /**
     * Get an ApplicationContext
     * 
     * @return ApplicationContext
     */
    private ApplicationContext getContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] {"WEB-INF/applicationContext-aij2.xml",
                "WEB-INF/applicationContext-aij2-jdbc.xml",
                "WEB-INF/applicationContext-aij2-aop.xml",
                "WEB-INF/applicationContext-library.xml"});
        return context;
    }
}
