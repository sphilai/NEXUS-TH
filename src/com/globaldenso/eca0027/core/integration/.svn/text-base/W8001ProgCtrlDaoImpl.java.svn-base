/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ProgCtrlPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain;

/**
 * The DAO implementation class of Progress Control.
 * <br />Progress Ctrl のDAO実装クラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8001ProgCtrlDaoImpl extends SqlMapClientDaoSupport implements
    W8001ProgCtrlDao {

    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     */
    public W8001ProgCtrlDaoImpl() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchCountTtPltzByItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    public int searchCountTtPltzByItemNo(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W8001ProgCtrl.SearchCountTtPltzByItemNo", criteria);
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchForPagingTtPltzByItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzByItemNo(
        W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<W8001ProgCtrlDomain>) getSqlMapClientTemplate()
            .queryForList("W8001ProgCtrl.SearchForPagingTtPltzByItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchCountTtPltzByPoNo(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */    
    public int searchCountTtPltzByPoNo(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W8001ProgCtrl.SearchCountTtPltzByPoNo", criteria);
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchForPagingTtPltzByPoNo(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzByPoNo(
        W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<W8001ProgCtrlDomain>) getSqlMapClientTemplate()
            .queryForList("W8001ProgCtrl.SearchForPagingTtPltzByPoNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchTtPltz(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W8001ProgCtrlDomain searchTtPltz(W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (W8001ProgCtrlDomain) getSqlMapClientTemplate()
            .queryForObject("W8001ProgCtrl.SearchTtPltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchCountTtPltzItemByCigma(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    
    public int searchCountTtPltzItemByCigma(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W8001ProgCtrl.SearchCountTtPltzItemByCigma", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchForPagingTtPltzItemByCigma(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzItemByCigma(
        W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<W8001ProgCtrlDomain>) getSqlMapClientTemplate()
            .queryForList("W8001ProgCtrl.SearchForPagingTtPltzItemByCigma", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchForPagingTtPltzItemByCigmaSort(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzItemByCigmaSort(
        W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<W8001ProgCtrlDomain>) getSqlMapClientTemplate()
            .queryForList("W8001ProgCtrl.SearchForPagingTtPltzItemByCigmaSort", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchCountTtPltzItemByMisc(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    
    public int searchCountTtPltzItemByMisc(W8001ProgCtrlCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W8001ProgCtrl.SearchCountTtPltzItemByMisc", criteria);
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchForPagingTtPltzItemByMisc(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzItemByMisc(
        W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<W8001ProgCtrlDomain>) getSqlMapClientTemplate()
            .queryForList("W8001ProgCtrl.SearchForPagingTtPltzItemByMisc", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchForPagingTtPltzItemByMiscSort(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W8001ProgCtrlDomain> searchForPagingTtPltzItemByMiscSort(
        W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<W8001ProgCtrlDomain>) getSqlMapClientTemplate()
            .queryForList("W8001ProgCtrl.SearchForPagingTtPltzItemByMiscSort", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchCountTtPltzItem(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    public int searchCountTtPltzItem(W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W8001ProgCtrl.SearchCountTtPltzItem", criteria);
    }
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W8001ProgCtrlDao#searchForPagingTtPltzItem(com.globaldenso.eca0027.core.business.domain.criteria.W8001ProgCtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W8001ProgCtrlPltzItemDomain> searchForPagingTtPltzItem(
        W8001ProgCtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<W8001ProgCtrlPltzItemDomain>) getSqlMapClientTemplate()
            .queryForList("W8001ProgCtrl.SearchForPagingTtPltzItem", criteria);
    }
 

}
