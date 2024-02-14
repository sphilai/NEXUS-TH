/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: SearchFacadeServiceTest.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;



import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * 
 * AbstractSearchFacadeServiceのテスト
 * 
 * <p>
 * AbstractSearchFacadeServiceのテスト
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class SearchFacadeServiceTest {
    
    /** Springのコンテキスト */
    private static ApplicationContext context = null;
    
    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public SearchFacadeServiceTest(){}


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
     * searchメソッドのテスト
     * 
     * <p>
     * searchメソッドのテスト
     * 1.検索OKのパターン
     * 2.filterDomainで例外が発生するパターン
     * 3.validateItemsで例外が発生するパターン
     * 4.validateConsistencyで例外が発生するパターン
     * 5.validateDatabaseで例外が発生するパターン
     * 6.callServicesで例外が発生するパターン
     * 
     * </p>
     * @throws ApplicationException エラー
     * @throws ValidationException 検査エラー
     *
     */
    @Test
    public void testSearch() throws ValidationException, ApplicationException {
        
        @SuppressWarnings("unchecked")
        SearchFacadeService<List<TestSearchResultDomain>, TestArgDomain> searchFacadeService =
            (SearchFacadeService<List<TestSearchResultDomain>, TestArgDomain>)context.getBean("searchFacadeService");
        
        
        // 1.検索OKのパターン
        TestArgDomain argDomain1 = new TestArgDomain();
        List<TestSearchResultDomain> resultList1 = searchFacadeService.search(argDomain1);
        Assert.assertEquals("Assert Size", 5, resultList1.size());
        for (int i = 0; i < resultList1.size(); i++) {
            TestSearchResultDomain resultDomain = resultList1.get(i);
            Assert.assertEquals("Assert Field", "test" + i, resultDomain.getField1());
        }
        
        // 2.filterDomainで例外が発生するパターン
        TestArgDomain argDomainException = new TestArgDomain();
        argDomainException.setThrowException(TestExceptionEnum.FILTER_DOMAIN);
        try {
            searchFacadeService.search(argDomainException);
            Assert.fail("exception filterDomain");
        } catch (ApplicationException e) {
            Assert.assertNotNull("exception filterDomain", e);
        }

        // 3.validateItemsで例外が発生するパターン
        argDomainException.setThrowException(TestExceptionEnum.VALIDATE_ITEMS);
        try {
            searchFacadeService.search(argDomainException);
            Assert.fail("exception validateItems");
        } catch (ApplicationException e) {
            Assert.assertNotNull("exception validateItems", e);
        }

        // 4.validateConsistencyで例外が発生するパターン
        argDomainException.setThrowException(TestExceptionEnum.VALIDATE_CONSISTENCY);
        try {
            searchFacadeService.search(argDomainException);
            Assert.fail("exception validateConsistency");
        } catch (ApplicationException e) {
            Assert.assertNotNull("exception validateConsistency", e);
        }

        // 5.validateDatabaseで例外が発生するパターン
        argDomainException.setThrowException(TestExceptionEnum.VALIDATE_DATABASE);
        try {
            searchFacadeService.search(argDomainException);
            Assert.fail("exception validateDatabase");
        } catch (ApplicationException e) {
            Assert.assertNotNull("exception validateDatabase", e);
        }

        // 6.callServicesで例外が発生するパターン
        argDomainException.setThrowException(TestExceptionEnum.CALL_SERVICES);
        try {
            searchFacadeService.search(argDomainException);
            Assert.fail("exception callServices");
        } catch (ApplicationException e) {
            Assert.assertNotNull("exception callServices", e);
        }
        
        
    }

}
