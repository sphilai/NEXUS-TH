/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: CreateFacadeServiceTest.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * CreateFacadeServiceのテスト
 * 
 * <p>
 * CreateFacadeServiceのテスト
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class CreateFacadeServiceTest {

    /** Springのコンテキスト */
    private static ApplicationContext context = null;
    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public CreateFacadeServiceTest(){}

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
     * 1.Insertテスト
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
        
        CreateFacadeService<Integer, TestArgDomain> service =
            (CreateFacadeService<Integer, TestArgDomain>)context.getBean("createFacadeServiceTest");
        
        // 1.Insertテスト
        ArrayList<TestFacadeTableDomain> tableDomainList = new ArrayList<TestFacadeTableDomain>();
        for (int i = 0; i < 5; i++) {
            TestFacadeTableDomain domain = new TestFacadeTableDomain();
            domain.setId(i);
            domain.setItem("test" + i);
            tableDomainList.add(domain);
        }
        TestArgDomain argDomain = new TestArgDomain();
        argDomain.setTableDomainList(tableDomainList);
        int count1 = service.create(argDomain);
        Assert.assertEquals("create count", 5, count1);
        
        // insertの確認
        List<TestFacadeTableDomain> selectList = dao.selectAll();
        Assert.assertEquals("select count", 5, selectList.size());
        
        // さらにinsertの確認
        tableDomainList.clear();
        for (int i = 5; i < 10; i++) {
            TestFacadeTableDomain domain = new TestFacadeTableDomain();
            domain.setId(i);
            domain.setItem("test" + i);
            tableDomainList.add(domain);
        }
        service.create(argDomain);
        selectList = dao.selectAll();
        Assert.assertEquals("select count", 10, selectList.size());
        
        // 2.トランザクションの確認
        // 途中でロールバック
        tableDomainList.clear();
        TestFacadeTableDomain domainRollback1 = new TestFacadeTableDomain();
        TestFacadeTableDomain domainRollback2 = new TestFacadeTableDomain();
        TestFacadeTableDomain domainRollback3 = new TestFacadeTableDomain();
        domainRollback1.setId(20);
        domainRollback1.setItem("rollback");
        domainRollback2.setId(21);  
        domainRollback2.setItem("rollback");
        domainRollback3.setId(21);  // 一意制約になる
        domainRollback3.setItem("rollback");
        tableDomainList.add(domainRollback1);
        tableDomainList.add(domainRollback2);
        tableDomainList.add(domainRollback3);
        
        try {
            service.create(argDomain);
            Assert.fail("exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<TestFacadeTableDomain> selectListRollback = dao.selectAll();
        Assert.assertEquals("select count", 10, selectListRollback.size());  // rollbackしてあるはず
    }

}
