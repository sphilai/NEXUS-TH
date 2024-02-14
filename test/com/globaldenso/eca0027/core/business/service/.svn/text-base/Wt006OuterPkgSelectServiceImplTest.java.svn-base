/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO IT SOLUTIONS,INC. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.business.domain.Wt006OuterPkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt006OuterPkgSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt006OuterPkgSelectService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt006OuterPkgSelectServiceImpl.
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10090 $
 */
public class Wt006OuterPkgSelectServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt006OuterPkgSelectServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     */
    public void testSearchByConditionForPaging() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt006OuterPkgSelectService testService
            = (Wt006OuterPkgSelectService)getContext().getBean("wt006OuterPkgSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt006OuterPkgSelectCriteriaDomain criteriaDomain
            = new Wt006OuterPkgSelectCriteriaDomain();
        criteriaDomain.setOwnerComp("MA0");
        criteriaDomain.setOuterPkgCd("AS3X");
        criteriaDomain.setPkgItemNo("9890000010");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt006OuterPkgSelectDomain expectation = new Wt006OuterPkgSelectDomain();
        expectation.setOuterPkgCd("AS3X");
        expectation.setVolumeAfter(BigDecimal.valueOf(1000));
        expectation.setWidthAfter(BigDecimal.valueOf(100));
        expectation.setHeightAfter(BigDecimal.valueOf(100));
        expectation.setPkgItemNo("9890000010");
        
        // Call the test method
        // テスト対象メソッドの呼び出しWt006OuterPkgSelectDomain
        List<Wt006OuterPkgSelectDomain> result = new ArrayList<Wt006OuterPkgSelectDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getOuterPkgCd(), result.get(0).getOuterPkgCd());
        assertEquals(expectation.getVolumeAfter(), result.get(0).getVolumeAfter());
        assertEquals(expectation.getWidthAfter(), result.get(0).getWidthAfter());
        assertEquals(expectation.getHeightAfter(), result.get(0).getHeightAfter());
        assertEquals(expectation.getPkgItemNo(), result.get(0).getPkgItemNo());
        
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
        Wt006OuterPkgSelectService testService
            = (Wt006OuterPkgSelectService)getContext().getBean("wt006OuterPkgSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt006OuterPkgSelectCriteriaDomain criteriaDomain
            = new Wt006OuterPkgSelectCriteriaDomain();
        criteriaDomain.setOwnerComp("MA0");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT006");
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
        assertEquals(8, searchCount);
        
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
