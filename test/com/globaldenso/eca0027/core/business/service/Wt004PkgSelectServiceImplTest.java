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

import com.globaldenso.eca0027.core.business.domain.Wt004PkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt004PkgSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt004PkgSelectService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for Wt004PkgSelectServiceImpl.
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10090 $
 */
public class Wt004PkgSelectServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public Wt004PkgSelectServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByConditionForPaging
     * <br /> searchByConditionForPagingメソッドのテスト。
     */
    public void testSearchByConditionForPaging() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        Wt004PkgSelectService testService
            = (Wt004PkgSelectService)getContext().getBean("wt004PkgSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt004PkgSelectCriteriaDomain criteriaDomain
            = new Wt004PkgSelectCriteriaDomain();
        criteriaDomain.setOwnerComp("TG0");
        criteriaDomain.setPkgItemNo("9890000010");
        criteriaDomain.setRtTyp("1");
        criteriaDomain.setModelCd("KB03");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLngCdDefault("en");
        criteriaDomain.setRowNumFrom(1);
        criteriaDomain.setRowNumTo(5);
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        Wt004PkgSelectDomain expectation = new Wt004PkgSelectDomain();
        expectation.setRtTyp("1");
        expectation.setModelCd("KB03");
        expectation.setPkgMtrlNm("Return Box");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<Wt004PkgSelectDomain> result = new ArrayList<Wt004PkgSelectDomain>();
        try {
            result = testService.searchByConditionForPaging(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(expectation.getRtTyp(), result.get(0).getRtTyp());
        assertEquals(expectation.getModelCd(), result.get(0).getModelCd());
        assertEquals(expectation.getPkgMtrlNm(), result.get(0).getPkgMtrlNm());
        
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
        Wt004PkgSelectService testService
            = (Wt004PkgSelectService)getContext().getBean("wt004PkgSelectService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        Wt004PkgSelectCriteriaDomain criteriaDomain
            = new Wt004PkgSelectCriteriaDomain();
        criteriaDomain.setOwnerComp("TG0");
        criteriaDomain.setPkgItemNo("9890000010");
        criteriaDomain.setRtTyp("1");
        criteriaDomain.setModelCd("KB03");
        criteriaDomain.setLanguageCd("en");
        criteriaDomain.setLngCdDefault("jp");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setScreenId("WT017");
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
