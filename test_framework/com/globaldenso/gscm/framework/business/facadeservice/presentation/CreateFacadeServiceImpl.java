/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 * Last Update Author        Detail
 * 2013/07/11  DNITS         Create
 *
 * $Id: CreateFacadeServiceImpl.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * CreateFacadeServiceのテスト実装
 * Testing class for CreateFacadeService
 * 
 * <p>
 * CreateFacadeServiceのテスト実装
 * Testing class for CreateFacadeService
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class CreateFacadeServiceImpl extends AbstractCreateFacadeService<Integer, TestArgDomain> {
    
    /** dao */
    private TestFacadeTableDao testFacadeTableDao = null;
    
    /**
     * 
     * デフォルトコンストラクタ。
     * Default constructor
     *
     */
    public CreateFacadeServiceImpl(){}

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected TestArgDomain filterDomain(TestArgDomain argDomain) throws ApplicationException {
        return argDomain;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(TestArgDomain filterDomain) throws ApplicationException,
        ValidationException {
        
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(TestArgDomain filterDomain) throws ApplicationException,
        ValidationException {
        
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(TestArgDomain filterDomain) throws ApplicationException,
        ValidationException {
        
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(TestArgDomain filterDomain) throws ApplicationException {
        
        List<TestFacadeTableDomain> tableDomainList = filterDomain.getTableDomainList();
        if (tableDomainList == null) {
            return 0;
        }
        
        int count = 0;
        for (TestFacadeTableDomain tableDomain : tableDomainList) {
            testFacadeTableDao.create(tableDomain);
            count++;
        }
        return count;
    }

    /**
     * testFacadeTableDao のセッターメソッドです。
     * Setter method for testFacadeTableDao
     *
     * @param testFacadeTableDao testFacadeTableDao に設定する
     * @param testFacadeTableDao Set testFacadeTableDao
     */
    public void setTestFacadeTableDao(TestFacadeTableDao testFacadeTableDao) {
        this.testFacadeTableDao = testFacadeTableDao;
    }

}
