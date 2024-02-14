/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: UpdateFacadeServiceTest.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
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
 * UpdateFacadeServiceのテスト
 * 
 * <p>
 * UpdateFacadeServiceのテスト
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class UpdateFacadeServiceTest {

    /** Springのコンテキスト */
    private static ApplicationContext context = null;
    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public UpdateFacadeServiceTest(){}

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
     * updateメソッドのテスト
     * 
     * <p>
     * 1.Updateテスト
     * 2.トランザクションの確認
     * </p>
     * @throws ApplicationException エラー
     *
     */
    @Test
    @SuppressWarnings("unchecked")
    public void testUpdate() throws ApplicationException {
        
        TestFacadeTableDao dao =
            (TestFacadeTableDao)context.getBean("testFacadeTableDao");
        
        // とりあえず何件か追加        
        for (int i = 0; i < 5; i++) {
            TestFacadeTableDomain domain = new TestFacadeTableDomain();
            domain.setId(i);
            domain.setItem("test" + i);
            dao.create(domain);
        }
        
        UpdateFacadeService<Integer, TestArgDomain> service =
            (UpdateFacadeService<Integer, TestArgDomain>)context.getBean("updateFacadeServiceTest");
        
        // 1.Updateテスト
        ArrayList<TestFacadeTableDomain> tableDomainList = new ArrayList<TestFacadeTableDomain>();
        for (int i = 0; i < 5; i++) {
            TestFacadeTableDomain domain = new TestFacadeTableDomain();
            domain.setId(i);
            domain.setItem("UPDATE" + i);
            tableDomainList.add(domain);
        }
        TestArgDomain argDomain = new TestArgDomain();
        argDomain.setTableDomainList(tableDomainList);
        int count1 = service.update(argDomain);
        Assert.assertEquals("update count", 5, count1);
        
        // updateの確認
        List<TestFacadeTableDomain> selectList1 = dao.selectAll();
        for (int i = 0; i < selectList1.size(); i++) {
            TestFacadeTableDomain resultDomain = selectList1.get(i);
            Assert.assertEquals("check update", "UPDATE" + i, resultDomain.getItem());
        }
        
        // さらに更新
        tableDomainList.clear();
        for (int i = 0; i < 5; i++) {
            TestFacadeTableDomain domain = new TestFacadeTableDomain();
            domain.setId(i);
            domain.setItem("update" + i);
            tableDomainList.add(domain);
        }
        service.update(argDomain);
        List<TestFacadeTableDomain> selectList2 = dao.selectAll();
        for (int i = 0; i < selectList2.size(); i++) {
            TestFacadeTableDomain resultDomain = selectList2.get(i);
            Assert.assertEquals("check update", "update" + i, resultDomain.getItem());
        }
        
        // 2.トランザクションの確認
        // 途中でロールバック
        tableDomainList.clear();
        for (int i = 0; i < 5; i++) {
            TestFacadeTableDomain domain = new TestFacadeTableDomain();
            domain.setId(i);
            domain.setItem("rollback" + i);
            tableDomainList.add(domain);
        }
        TestFacadeTableDomain rollbackDomain = new TestFacadeTableDomain();
        rollbackDomain.setId(0);
        tableDomainList.add(rollbackDomain);    // NOT NULL 制約でエラー
        
        try {
            service.update(argDomain);
            Assert.fail("exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<TestFacadeTableDomain> selectListRollback = dao.selectAll();
        for (int i = 0; i < selectListRollback.size(); i++) {
            TestFacadeTableDomain resultDomain = selectListRollback.get(i);
            //System.out.println(resultDomain.getItem());
            Assert.assertEquals("check update", "update" + i, resultDomain.getItem());
        }
    }

}
