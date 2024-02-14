/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: ProcessFacadeServiceTest.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 *  ProcessFacadeServiceのテスト
 * 
 * <p>
 *　ProcessFacadeServiceのテスト
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class ProcessFacadeServiceTest {

    /** Springのコンテキスト */
    private static ApplicationContext context = null;
    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public ProcessFacadeServiceTest(){}

    /**
     * 
     * 初期処理
     * 
     * <p>
     * 初期処理
     * </p>
     * 
     * @throws Exception 例外
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try {
            context = FacadeTestHelper.getContext();
            FacadeTestHelper.createTable();
            
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 
     * 後処理
     * 
     * <p>
     * 後処理
     * </p>
     * 
     * @throws Exception 例外
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        try {
            context = null;
            FacadeTestHelper.dropTable();
            
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 
     * createメソッドのテスト
     * 
     * <p>
     * 1.Transactテスト
     * 2.トランザクションの確認
     * </p>
     * @throws ApplicationException エラー
     *
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testCreate() throws ApplicationException {
        
        TestFacadeTableDao dao =
            (TestFacadeTableDao)context.getBean("testFacadeTableDao");
        
        ProcessFacadeService<String, TestArgDomain> service =
            (ProcessFacadeService<String, TestArgDomain>)context.getBean("processFacadeServiceTest");
        
        // 1.Processテスト
        TestArgDomain testArgDomain = new TestArgDomain();
        testArgDomain.setLocale(Locale.JAPANESE);
        String result = service.process(testArgDomain);
        Assert.assertEquals("result check", "ja", result);
        
        // Insert
        ArrayList<TestFacadeTableDomain> tableDomainList = new ArrayList<TestFacadeTableDomain>();
        for (int i = 0; i < 5; i++) {
            TestTransactFacadeTableDomain domain = new TestTransactFacadeTableDomain();
            domain.setId(i);
            domain.setItem("insert" + i);
            tableDomainList.add(domain);
        }
        
        // 一意制約で落とす
        TestTransactFacadeTableDomain errDomain = new TestTransactFacadeTableDomain();
        errDomain.setId(2);
        errDomain.setItem("error");
        tableDomainList.add(errDomain);
        
        TestArgDomain argDomain = new TestArgDomain();
        argDomain.setTableDomainList(tableDomainList);
        
        
        try {
            service.process(argDomain);
            Assert.fail("exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 処理の確認
        // 前回と変わっていないはず
        List<TestFacadeTableDomain> selectList = dao.selectAll();
        Assert.assertEquals("select count", 5, selectList.size());
        
    }

}
