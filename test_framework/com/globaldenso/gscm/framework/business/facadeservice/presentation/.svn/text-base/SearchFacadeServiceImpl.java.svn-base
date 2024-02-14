/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 * Last Update Author        Detail
 * 2013/07/11  DNITS         Create
 *
 * $Id: SearchFacadeServiceImpl.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * SearchFacadeServiceテスト用スタブ
 * Testing class for SearchFacadeService
 * 
 * <p>
 * SearchFacadeServiceテスト用スタブ
 * Testing class for SearchFacadeService
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class SearchFacadeServiceImpl extends AbstractSearchFacadeService<List<TestSearchResultDomain>, TestArgDomain> {
    
    /**
     * 
     * デフォルトコンストラクタ。
     * Default constructor
     *
     */
    public SearchFacadeServiceImpl(){}

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected TestArgDomain filterDomain(TestArgDomain argDomain) throws ApplicationException {
        if (argDomain.getThrowException() == TestExceptionEnum.FILTER_DOMAIN) {
            throw new ApplicationException("");
        }
        TestArgDomain filterDomain = new TestArgDomain();
        filterDomain.setThrowException(argDomain.getThrowException());
        return filterDomain;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(TestArgDomain filterDomain) throws ApplicationException,
        ValidationException {
        if (filterDomain.getThrowException() == TestExceptionEnum.VALIDATE_ITEMS) {
            throw new ValidationException("");
        }
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(TestArgDomain filterDomain) throws ApplicationException,
        ValidationException {
        if (filterDomain.getThrowException() == TestExceptionEnum.VALIDATE_CONSISTENCY) {
            throw new ValidationException("");
        }
        
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(TestArgDomain filterDomain) throws ApplicationException,
        ValidationException {
        if (filterDomain.getThrowException() == TestExceptionEnum.VALIDATE_DATABASE) {
            throw new ValidationException("");
        }
        
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<TestSearchResultDomain> callServices(TestArgDomain filterDomain) throws ApplicationException {

        if (filterDomain.getThrowException() == TestExceptionEnum.CALL_SERVICES) {
            throw new ApplicationException("");
        }
        
        List<TestSearchResultDomain> resultList = new ArrayList<TestSearchResultDomain>();
        for (int i = 0; i < 5; i++) {
            TestSearchResultDomain resultDomain = new TestSearchResultDomain();
            resultDomain.setField1("test" + i);
            resultList.add(resultDomain);
        }
        
        return resultList;
    }

}
