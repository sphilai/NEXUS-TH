/*
 * Project : GSCMFramework
 *
 * 更新日      更新者        更新内容
 * 2013/07/11  DNITS         新規作成
 *
 * $Id: TestFacadeTableDaoImpl.java 5759 2014-06-27 08:14:53Z 10088DS01586 $
 *
 * Copyright (c) 2011 DENSO IT SOLUTIONS. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.facadeservice.presentation;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;

/**
 * テスト用テーブルDaoの実装
 * 
 * <p>
 * テスト用テーブルDaoの実装
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TestFacadeTableDaoImpl extends SqlMapClientDaoSupport implements TestFacadeTableDao {

    /**
     * 
     * デフォルトコンストラクタ。
     *
     */
    public TestFacadeTableDaoImpl(){}
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDao#select(com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TestFacadeTableDomain> selectAll() throws ApplicationException {
        return (List<TestFacadeTableDomain>)getSqlMapClientTemplate()
            .queryForList("TestFacadeTable.SelectAll", null);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDao#selectPk(com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDomain)
     */
    public TestFacadeTableDomain selectPk(TestFacadeTableDomain domain) throws ApplicationException {
        return (TestFacadeTableDomain)getSqlMapClientTemplate().queryForObject("TestFacadeTable.SelectPk", domain);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDao#create(com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDomain)
     */

    public void create(TestFacadeTableDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
            .insert("TestFacadeTable.Create", domain);
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDao#update(com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDomain)
     */
    public int update(TestFacadeTableDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate().update("TestFacadeTable.Update", domain);
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDao#update(com.globaldenso.gscm.framework.business.facadeservice.presentation.TestFacadeTableDomain)
     */
    public int delete(TestFacadeTableDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate().delete("TestFacadeTable.Delete", domain);
    }

}
