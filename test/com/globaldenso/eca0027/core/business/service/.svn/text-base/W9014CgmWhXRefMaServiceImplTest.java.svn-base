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

import com.globaldenso.eca0027.core.business.domain.W9014CgmWhXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9014CgmWhXRefMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9014CgmWhXRefMaService;
import com.globaldenso.eca0027.core.common.util.Debug;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for W9014CgmWhXRefMaServiceImpl.
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9014CgmWhXRefMaServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public W9014CgmWhXRefMaServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for searchByCondition
     * <br /> searchByConditionメソッドのテスト。
     */
    public void testSearchByCondition() {

        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9014CgmWhXRefMaService testService
            = (W9014CgmWhXRefMaService)getContext().getBean("w9014CgmWhXRefMaService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9014CgmWhXRefMaCriteriaDomain criteriaDomain
            = new W9014CgmWhXRefMaCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd("SZK");
        criteriaDomain.setLgcyWhCd("1");
        criteriaDomain.setPlntCd("A2");
        
        // Create search expectation domain
        // 検索予想ドメイン作成
        W9014CgmWhXRefMaDomain expectation = new W9014CgmWhXRefMaDomain();
        expectation.setLgcyLibCompCd("SZK");
        expectation.setLgcyWhCd("1");
        expectation.setPlntCd("A2");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        List<? extends W9014CgmWhXRefMaDomain> result = new ArrayList<W9014CgmWhXRefMaDomain>();
        try {
            result = testService.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Check result
        assertEquals(expectation.getLgcyLibCompCd(), result.get(0).getLgcyLibCompCd());
        assertEquals(expectation.getLgcyWhCd(), result.get(0).getLgcyWhCd());
        assertEquals(expectation.getPlntCd(), result.get(0).getPlntCd());
        
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
        W9014CgmWhXRefMaService testService
            = (W9014CgmWhXRefMaService)getContext().getBean("w9014CgmWhXRefMaService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 検索条件ドメイン作成
        W9014CgmWhXRefMaCriteriaDomain criteriaDomain
            = new W9014CgmWhXRefMaCriteriaDomain();
        criteriaDomain.setLgcyLibCompCd("SZK");
        criteriaDomain.setLocale(Locale.JAPAN);
        criteriaDomain.setServerId("dev");
        criteriaDomain.setScreenId("W9014");
        
        // Call the test method
        // テスト対象メソッドの呼び出し
        int searchCount = -1;
        try {
            searchCount = testService.searchCount(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check result
        assertEquals(12, searchCount);
        
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
                ,   "WEB-INF/applicationContext-aij2-jdbc.xml"
                ,   "WEB-INF/applicationContext-aij2-aop.xml"
                ,   "WEB-INF/applicationContext-library.xml"
            }
        );
        return context;
    }

}
