/*
 * Project : NEXUS_EXPORT
 *
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W3TransferCarryOutListDao;
import com.globaldenso.eca0027.core.business.domain.W3TransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain;

/**
 * <p>
 * DAO use for Transfer.
 * </p>
 * 
 * @author DIAT Chonthicha.A
 * @version 1.00
 */
public class W3TransferCarryOutListDaoImpl extends SqlMapClientDaoSupport implements
    W3TransferCarryOutListDao {

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public W3TransferCarryOutListDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferCarryOutListDao#searchCountCarryOutListByCml(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain)
     */
    public int searchCountCarryOutListByCml(W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3TransferCarryOutList.SearchCountCarryOutListByCml", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferCarryOutListDao#searchPrintCarryOutListByCml(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchPrintCarryOutListByCml(
        W3TransferCarryOutListCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3TransferCarryOutList.SearchPrintCarryOutListByCml", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferCarryOutListDao#searchCountCarryOutByItemNo(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain)
     */
    public int searchCountCarryOutByItemNo(W3TransferCarryOutListCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate().queryForObject(
            "W3TransferCarryOutList.SearchCountCarryOutByItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W3TransferCarryOutListDao#searchPrintCarryOutListByItemNo(
     *      com.globaldenso.eca0027.core.business.domain.criteria.W3TransferCarryOutListCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W3TransferDomain> searchPrintCarryOutListByItemNo(
        W3TransferCarryOutListCriteriaDomain criteria) throws ApplicationException {
        return (List<W3TransferDomain>)getSqlMapClientTemplate().queryForList(
            "W3TransferCarryOutList.SearchPrintCarryOutListByItemNo", criteria);
    }
}
