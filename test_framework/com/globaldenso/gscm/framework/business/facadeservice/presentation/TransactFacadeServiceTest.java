/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: TransactFacadeServiceTest.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
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
 * TransactFacadeServiceのテスト
 * 
 * <p>
 * TransactFacadeServiceのテスト
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TransactFacadeServiceTest {

    /** Springのコンテキスト */
    private static ApplicationContext context = null;
    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public TransactFacadeServiceTest(){}

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
    public void testTransact() throws ApplicationException {
        
        TestFacadeTableDao dao =
            (TestFacadeTableDao)context.getBean("testFacadeTableDao");
        
        TransactFacadeService<Integer, TestArgDomain> service =
            (TransactFacadeService<Integer, TestArgDomain>)context.getBean("transactFacadeServiceTest");
        
        // 1.Transactテスト
        
        // Insert
        ArrayList<TestFacadeTableDomain> tableDomainList = new ArrayList<TestFacadeTableDomain>();
        for (int i = 0; i < 5; i++) {
            TestTransactFacadeTableDomain domain = new TestTransactFacadeTableDomain();
            domain.setId(i);
            domain.setItem("insert" + i);
            domain.setTransact(TransactEnum.INSERT);
            tableDomainList.add(domain);
        }
        
        // Update
        TestTransactFacadeTableDomain updateDomain0 = new TestTransactFacadeTableDomain();
        updateDomain0.setId(0);
        updateDomain0.setItem("update" + 0);
        updateDomain0.setTransact(TransactEnum.UPDATE);
        tableDomainList.add(updateDomain0);
        updateDomain0 = null;
        TestTransactFacadeTableDomain updateDomain2 = new TestTransactFacadeTableDomain();
        updateDomain2.setId(2);
        updateDomain2.setItem("update" + 2);
        updateDomain2.setTransact(TransactEnum.UPDATE);
        tableDomainList.add(updateDomain2);
        updateDomain2 = null;
        TestTransactFacadeTableDomain updateDomain4 = new TestTransactFacadeTableDomain();
        updateDomain4.setId(4);
        updateDomain4.setItem("update" + 4);
        updateDomain4.setTransact(TransactEnum.UPDATE);
        tableDomainList.add(updateDomain4);
        updateDomain4 = null;
        
        // Delete
        TestTransactFacadeTableDomain deleteDomain2 = new TestTransactFacadeTableDomain();
        deleteDomain2.setId(2);
        deleteDomain2.setTransact(TransactEnum.DELETE);
        tableDomainList.add(deleteDomain2);
        deleteDomain2 = null;
        
        TestArgDomain argDomain = new TestArgDomain();
        argDomain.setTableDomainList(tableDomainList);
        
        // 実行
        service.transact(argDomain);
        
        // 処理の確認
        List<TestFacadeTableDomain> selectList = dao.selectAll();
        Assert.assertEquals("select count", 4, selectList.size());
        
        TestFacadeTableDomain selectDomain0 = selectList.get(0);
        Assert.assertEquals("select0", 0, selectDomain0.getId().intValue());
        Assert.assertEquals("select0", "update0", selectDomain0.getItem());
        selectDomain0 = null;
        TestFacadeTableDomain selectDomain1 = selectList.get(1);
        Assert.assertEquals("select1", 1, selectDomain1.getId().intValue());
        Assert.assertEquals("select1", "insert1", selectDomain1.getItem());
        selectDomain1 = null;
        TestFacadeTableDomain selectDomain2 = selectList.get(2);
        Assert.assertEquals("select2", 3, selectDomain2.getId().intValue());
        Assert.assertEquals("select2", "insert3", selectDomain2.getItem());
        selectDomain2 = null;
        TestFacadeTableDomain selectDomain3 = selectList.get(3);
        Assert.assertEquals("select2", 4, selectDomain3.getId().intValue());
        Assert.assertEquals("select2", "update4", selectDomain3.getItem());
        selectDomain3 = null;
        selectList = null;
        
        
        // 2.トランザクションの確認
        tableDomainList.clear();
        
        // Insert
        TestTransactFacadeTableDomain rollbackDomain1 = new TestTransactFacadeTableDomain();
        rollbackDomain1.setId(10);
        rollbackDomain1.setItem("insert rollback");
        rollbackDomain1.setTransact(TransactEnum.INSERT);
        tableDomainList.add(rollbackDomain1);
        rollbackDomain1 = null;
        
        // Update
        TestTransactFacadeTableDomain rollbackDomain2 = new TestTransactFacadeTableDomain();
        rollbackDomain2.setId(0);
        rollbackDomain2.setItem("update rollback");
        rollbackDomain2.setTransact(TransactEnum.UPDATE);
        tableDomainList.add(rollbackDomain2);
        rollbackDomain2 = null;

        // Delete
        TestTransactFacadeTableDomain rollbackDomain3 = new TestTransactFacadeTableDomain();
        rollbackDomain3.setId(3);
        rollbackDomain3.setTransact(TransactEnum.DELETE);
        tableDomainList.add(rollbackDomain3);
        rollbackDomain3 = null;
        
        // 一意制約で落ちるためのInsert
        TestTransactFacadeTableDomain rollbackDomain4 = new TestTransactFacadeTableDomain();
        rollbackDomain4.setId(1);
        rollbackDomain4.setItem("insert rollback");
        rollbackDomain4.setTransact(TransactEnum.INSERT);
        tableDomainList.add(rollbackDomain4);
        rollbackDomain4 = null;
        
        try {
            service.transact(argDomain);
            Assert.fail("exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 処理の確認
        // 前回と変わっていないはず
        List<TestFacadeTableDomain> selectListRollback = dao.selectAll();
        Assert.assertEquals("select count", 4, selectListRollback.size());
        
        TestFacadeTableDomain selectDomainRollback0 = selectListRollback.get(0);
        Assert.assertEquals("select0", 0, selectDomainRollback0.getId().intValue());
        Assert.assertEquals("select0", "update0", selectDomainRollback0.getItem());
        selectDomainRollback0 = null;
        TestFacadeTableDomain selectDomainRollback1 = selectListRollback.get(1);
        Assert.assertEquals("select1", 1, selectDomainRollback1.getId().intValue());
        Assert.assertEquals("select1", "insert1", selectDomainRollback1.getItem());
        selectDomainRollback1 = null;
        TestFacadeTableDomain selectDomainRollback2 = selectListRollback.get(2);
        Assert.assertEquals("select2", 3, selectDomainRollback2.getId().intValue());
        Assert.assertEquals("select2", "insert3", selectDomainRollback2.getItem());
        selectDomainRollback2 = null;
        TestFacadeTableDomain selectDomainRollback3 = selectListRollback.get(3);
        Assert.assertEquals("select2", 4, selectDomainRollback3.getId().intValue());
        Assert.assertEquals("select2", "update4", selectDomainRollback3.getItem());
        selectDomainRollback3 = null;
        selectListRollback = null;
        
    }

}
