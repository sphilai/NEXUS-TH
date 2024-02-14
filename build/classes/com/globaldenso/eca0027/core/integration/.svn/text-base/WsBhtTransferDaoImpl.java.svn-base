/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.WsBhtTransferDao;
import com.globaldenso.eca0027.core.business.domain.Ws3501CmlListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3501ItemNoListItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3504SearchResultDomain;
import com.globaldenso.eca0027.core.business.domain.Ws3506UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtTransferDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws3504CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain;

/**
 * <p>
 * Implementation class for BHT WebService Transfer DAO
 * </p>
 * 
 * @version 1.00
 */
public class WsBhtTransferDaoImpl extends SqlMapClientDaoSupport implements
    WsBhtTransferDao {

    /**
     * <p>
     * Constructor method.
     * </p>
     */
    public WsBhtTransferDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtTransferDao#searchWs3001ParamForCml(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<WsBhtTransferDomain> searchWs3001ParamForCml(
        WsBhtTransferCriteriaDomain criteria) throws ApplicationException {
        return (List<WsBhtTransferDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtTransfer.SearchWs3001ParamForCml", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtTransferDao#searchWs3001ParamForParts(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<WsBhtTransferDomain> searchWs3001ParamForParts(
        WsBhtTransferCriteriaDomain criteria) throws ApplicationException {
        return (List<WsBhtTransferDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtTransfer.SearchWs3001ParamForParts", criteria);
    }

    // ********** SNT 追加 Start **********//
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtTransferDao#searchTransferInfoDetailByCml(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<Ws3501CmlListItemDomain> searchTransferInfoDetailByCml(
        WsBhtTransferCriteriaDomain criteria) throws ApplicationException {
        return (List<Ws3501CmlListItemDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtTransfer.SearchTransferInfoDetailByCml",
                criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtTransferDao#searchTransferInfoDetailByItemNo(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTransferCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<Ws3501ItemNoListItemDomain> searchTransferInfoDetailByItemNo(
        WsBhtTransferCriteriaDomain criteria) throws ApplicationException {
        return (List<Ws3501ItemNoListItemDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtTransfer.SearchTransferInfoDetailByItemNo",
                criteria);
    }
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtTransferDao#searchMainMarkList(com.globaldenso.eca0027.core.business.domain.WsBhtTransferDomain)
     */
    @SuppressWarnings("unchecked")
    public List<Ws3506UpdateDomain> searchMainMarkList(
        WsBhtTransferDomain domain) throws ApplicationException {
        return (List<Ws3506UpdateDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtTransfer.SearchMainMarkList",
                domain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtTransferDao#searchTransferListByItemNo(com.globaldenso.eca0027.core.business.domain.criteria.Ws3504CriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<Ws3504SearchResultDomain> searchTransferListByItemNo(
        Ws3504CriteriaDomain domain) throws ApplicationException {
        return (List<Ws3504SearchResultDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtTransfer.SearchTransferListByItemNo",
                domain);
    }
    // ********** SNT 追加 End **********//
}
