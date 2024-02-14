/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO IT SOLUTIONS,INC. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.globaldenso.eca0027.core.auto.business.domain.TmActualItemWeightDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmActualItemWeightService;
import com.globaldenso.eca0027.core.business.domain.criteria.W9025ActualItemWeightCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9025ActualItemWeightService;
import com.globaldenso.gscm.framework.util.ResourcesFactory;

/**
 * Test class for W9025ActualItemWeightServiceImpl.
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 11574 $
 */
public class W9025ActualItemWeightServiceImplTest extends TestCase {

    /**
     * Constructor.
     */
    public W9025ActualItemWeightServiceImplTest() {
    }

    //--------------------------------- 検索系メソッド search ----------------------------------

    /**
     * Test method for transactOnRegister
     * <br /> transactOnRegisterメソッドのテスト(登録)。
     */
    public void testTransactOnRegister1() {
        
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9025ActualItemWeightService testService1
            = (W9025ActualItemWeightService)getContext().getBean("w9025ActualItemWeightService");
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        TmActualItemWeightService testService2
            = (TmActualItemWeightService)getContext().getBean("tmActualItemWeightService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 登録ドメイン作成
        W9025ActualItemWeightCriteriaDomain createDomain
            = new W9025ActualItemWeightCriteriaDomain();
        createDomain.setOwnerComp("TG0");
        createDomain.setItemNo("TG017490-26029M");
        createDomain.setWeightUnit("ME");
        createDomain.setNetWeightA("100");
        createDomain.setFunctionId("1");
        
        // Create search expectation domain
        // 登録予想ドメイン作成
        TmActualItemWeightCriteriaDomain criteriaDomain = new TmActualItemWeightCriteriaDomain();
        criteriaDomain.setOwnerComp("TG0");
        criteriaDomain.setItemNo("TG017490-26029M");
                
        // Call the test method
        // 登録メソッドの呼び出し
        try {
            testService1.transactOnRegister(createDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Call the test method
        // 登録結果の検索メソッドの呼び出し
        List<TmActualItemWeightDomain> result = new ArrayList<TmActualItemWeightDomain>();
        try {
            result = testService2.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // 登録Check result
        assertEquals(createDomain.getOwnerComp(), result.get(0).getOwnerComp());
        assertEquals("DG", result.get(0).getItemNoGrp());
        assertEquals(createDomain.getItemNo(), result.get(0).getItemNo());
        assertEquals(createDomain.getWeightUnit(), result.get(0).getWeightUnit());
        assertEquals(createDomain.getNetWeightA(), result.get(0).getNetWeightA());
        assertEquals("W9025", result.get(0).getComCreateFuncId());
        assertEquals("W9025", result.get(0).getComUpdateFuncId());
    }
    
    /**
     * Test method for transactOnRegister
     * <br /> transactOnRegisterメソッドのテスト(更新)。
     */
    public void testTransactOnRegister2() {
        
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9025ActualItemWeightService testService1
            = (W9025ActualItemWeightService)getContext().getBean("w9025ActualItemWeightService");
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        TmActualItemWeightService testService2
            = (TmActualItemWeightService)getContext().getBean("tmActualItemWeightService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 更新ドメイン作成
        W9025ActualItemWeightCriteriaDomain updateDomain
            = new W9025ActualItemWeightCriteriaDomain();
        updateDomain.setOwnerComp("TG0");
        updateDomain.setItemNo("TG017490-26029M");
        updateDomain.setWeightUnit("KG");
        updateDomain.setNetWeightA("50");
        updateDomain.setFunctionId("2");
        
        // Create search expectation domain
        // 更新予想ドメイン作成
        TmActualItemWeightCriteriaDomain criteriaDomain = new TmActualItemWeightCriteriaDomain();
        criteriaDomain.setOwnerComp("TG0");
        criteriaDomain.setItemNo("TG017490-26029M");
        
        // Call the test method
        // 更新メソッドの呼び出し
        try {
            testService1.transactOnRegister(updateDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Call the test method
        // 更新結果の検索メソッドの呼び出し
        List<TmActualItemWeightDomain> result = new ArrayList<TmActualItemWeightDomain>();
        try {
            result = testService2.searchByCondition(criteriaDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // 更新Check result
        assertEquals(updateDomain.getOwnerComp(), result.get(0).getOwnerComp());
        assertEquals("DG", result.get(0).getItemNoGrp());
        assertEquals(updateDomain.getItemNo(), result.get(0).getItemNo());
        assertEquals(updateDomain.getWeightUnit(), result.get(0).getWeightUnit());
        assertEquals(updateDomain.getNetWeightA(), result.get(0).getNetWeightA());
        assertEquals("W9025", result.get(0).getComCreateFuncId());
        assertEquals("W9025", result.get(0).getComUpdateFuncId());
    }
    
    /**
     * Test method for transactOnRegister
     * <br /> transactOnRegisterメソッドのテスト(登録一意エラー)。
     */
    public void testTransactOnRegister3() {
        
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9025ActualItemWeightService testService1
            = (W9025ActualItemWeightService)getContext().getBean("w9025ActualItemWeightService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 登録ドメイン作成(一意制約違反)
        W9025ActualItemWeightCriteriaDomain createDomain
            = new W9025ActualItemWeightCriteriaDomain();
        createDomain.setOwnerComp("TG0");
        createDomain.setItemNo("TG017732-60909I");
        createDomain.setWeightUnit("ME");
        createDomain.setNetWeightA("100");
        createDomain.setFunctionId("1");

        // Call the test method
        // 登録メソッドの呼び出し
        try {
            testService1.transactOnRegister(createDomain);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            testService1.transactOnRegister(createDomain);
            fail("This row should not be executed.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    /**
     * Test method for transactOnRegister
     * <br /> transactOnRegisterメソッドのテスト(更新null制約違反エラー)。
     */
    public void testTransactOnRegister4() {
        
        // Get an instance of the test class from Spring
        // Springからテスト対象クラスのインスタンスを取得
        W9025ActualItemWeightService testService1
            = (W9025ActualItemWeightService)getContext().getBean("w9025ActualItemWeightService");
        // Load TM_RESOURCES
        new ResourcesFactory().createResources("");

        // Create search criteria domain
        // 更新ドメイン作成(桁数違反(weightUnit))
        W9025ActualItemWeightCriteriaDomain updateDomain
            = new W9025ActualItemWeightCriteriaDomain();
        updateDomain.setOwnerComp("TG0");
        updateDomain.setItemNo("TG017490-26029M");
        updateDomain.setWeightUnit("ZZZ");
        updateDomain.setNetWeightA("100");
        updateDomain.setFunctionId("2");

        // Call the test method
        // 更新メソッドの呼び出し
        try {
            testService1.transactOnRegister(updateDomain);
            fail("This row should not be executed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
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
                ,   "library-config/applicationContext-aijbutil.xml"
            }
        );
        return context;
    }

}
