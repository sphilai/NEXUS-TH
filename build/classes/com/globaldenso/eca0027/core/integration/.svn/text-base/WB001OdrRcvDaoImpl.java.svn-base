/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;

/**
 * This is an implement class of the ordering registration DAO.
 * <br />受注登録DAOの実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB001OdrRcvDaoImpl extends SqlMapClientDaoSupport implements
    WB001OdrRcvDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB001OdrRcvDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchCountTtExpRcvOdrByDetailInit(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    public int searchCountTtExpRcvOdrByDetailInit(
        WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        Integer resultCount = (Integer)getSqlMapClientTemplate()
            .queryForObject("WB001OdrRcv.SearchCountTtExpRcvOdrByDetailInit",
                criteria);
        
        return resultCount;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchCountTtExpRcvOdrByLstDgtChgMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    public int searchCountTtExpRcvOdrByLstDgtChgMainSearch(
        WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        Integer resultCount = (Integer)getSqlMapClientTemplate()
            .queryForObject(
                "WB001OdrRcv.SearchCountTtExpRcvOdrByLstDgtChgMainSearch",
                criteria);
        
        return resultCount;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchCountTtExpRcvOdrByMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    public int searchCountTtExpRcvOdrByMainSearch(
        WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        Integer resultCount = (Integer)getSqlMapClientTemplate()
            .queryForObject("WB001OdrRcv.SearchCountTtExpRcvOdrByMainSearch",
                criteria);
        
        return resultCount;
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchForPagingTtExpRcvOdrByDetailInit(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends WB001OdrRcvDomain> searchForPagingTtExpRcvOdrByDetailInit(
        WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        return (List<WB001OdrRcvDomain>)getSqlMapClientTemplate().queryForList(
            "WB001OdrRcv.SearchForPagingTtExpRcvOdrByDetailInit", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchForPagingTtExpRcvOdrByLstDgtChgMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends WB001OdrRcvDomain> searchForPagingTtExpRcvOdrByLstDgtChgMainSearch(
        WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        return (List<WB001OdrRcvDomain>)getSqlMapClientTemplate().queryForList(
            "WB001OdrRcv.SearchForPagingTtExpRcvOdrByLstDgtChgMainSearch",
            criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchForPagingTtExpRcvOdrByMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends WB001OdrRcvDomain> searchForPagingTtExpRcvOdrByMainSearch(
        WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        return (List<WB001OdrRcvDomain>)getSqlMapClientTemplate().queryForList(
            "WB001OdrRcv.SearchForPagingTtExpRcvOdrByMainSearch", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchTtExpRcvOdrByLstDgtChgRegisterInit(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends WB001OdrRcvDomain> searchTtExpRcvOdrByLstDgtChgRegisterInit(
        WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        return (List<WB001OdrRcvDomain>)getSqlMapClientTemplate().queryForList(
            "WB001OdrRcv.SearchTtExpRcvOdrByLstDgtChgRegisterInit", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchTtExpRcvOdrByLstDgtChgRegisterInitPost(com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends WB001OdrRcvDomain> searchTtExpRcvOdrByLstDgtChgRegisterInitPost(
        WB001OdrRcvCriteriaDomain criteria) throws ApplicationException {
        return (List<WB001OdrRcvDomain>)getSqlMapClientTemplate().queryForList(
            "WB001OdrRcv.SearchTtExpRcvOdrByLstDgtChgRegisterInitPost",
            criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao#searchTtExpRcvOdrByRegisterInit(com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends WB001OdrRcvDomain> searchTtExpRcvOdrByRegisterInit(
        WB001OdrRcvDomain odrRcv) throws ApplicationException {

        return (List<WB001OdrRcvDomain>)getSqlMapClientTemplate().queryForList(
            "WB001OdrRcv.SearchTtExpRcvOdrByRegister", odrRcv);
    }
}
