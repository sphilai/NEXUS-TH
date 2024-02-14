/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain;

/**
 * Interface of the DAO to access the Staging Instruction
 * <br />荷揃え指示へアクセスするDAOの実装クラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W4001StgInstrDaoImpl extends SqlMapClientDaoSupport implements W4001StgInstrDao {

    /**
     * constructor.
     */
    public W4001StgInstrDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(
        W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        return (Integer)getSqlMapClientTemplate()
            .queryForObject("W4001StgInstr.SearchCountForPagingOnMainSearch", stgInstrCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4001StgInstrDomain> searchForPagingOnMainSearch(
        W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        return (List<W4001StgInstrDomain>) getSqlMapClientTemplate()
            .queryForList("W4001StgInstr.SearchForPagingOnMainSearch", stgInstrCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchCountForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain)
     */
    public int searchCountForPagingOnCreateSearch(
        W4001PltzCriteriaDomain pltzCriteriaDomain) throws ApplicationException {

        return (Integer)getSqlMapClientTemplate()
            .queryForObject("W4001StgInstr.SearchCountForPagingOnCreateSearch", pltzCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.criteria.W4001PltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4001PltzDomain> searchForPagingOnCreateSearch(
        W4001PltzCriteriaDomain pltzCriteriaDomain) throws ApplicationException {

        return (List<W4001PltzDomain>) getSqlMapClientTemplate()
            .queryForList("W4001StgInstr.SearchForPagingOnCreateSearch", pltzCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchCountOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public int searchCountOnRegisterInitByFromMain(
        W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        return (Integer)getSqlMapClientTemplate()
            .queryForObject("W4001StgInstr.SearchCountOnRegisterInitByFromMain", stgInstrCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    public W4001StgInstrDomain searchOnRegisterInitByFromMain(
        W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        @SuppressWarnings("unchecked")
        List<W4001StgInstrDomain> resultStgInstrDomainList =
            (List<W4001StgInstrDomain>) getSqlMapClientTemplate()
                .queryForList("W4001StgInstr.SearchOnRegisterInitByFromMain", stgInstrCriteriaDomain);

        if (0 < resultStgInstrDomainList.size()) {
            return resultStgInstrDomainList.get(0);
        }

        return null;
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchOnRegisterInitByFromCreate(com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4001PltzDomain> searchOnRegisterInitByFromCreate(
        W4001StgInstrCriteriaDomain stgInstrCriteriaDomain)
        throws ApplicationException {

        return (List<W4001PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4001StgInstr.SearchOnRegisterInitByFromCreate", stgInstrCriteriaDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchTwStgInstrByShipToSummary(com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchTwStgInstrByShipToSummary(String loginUserDscId)
        throws ApplicationException {

        return (List<String>) getSqlMapClientTemplate()
            .queryForList("W4001StgInstr.SearchTwStgInstrByShipToSummary", loginUserDscId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchOnRegisterInitByWeightSummary(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4001PltzDomain> searchOnRegisterInitByWeightSummary(String loginUserDscId)
        throws ApplicationException {

        return (List<W4001PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4001StgInstr.SearchOnRegisterInitByWeightSummary", loginUserDscId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchOnRegisterInitByVolumeSummary(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4001PltzDomain> searchOnRegisterInitByVolumeSummary(String loginUserDscId)
        throws ApplicationException {

        return (List<W4001PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4001StgInstr.SearchOnRegisterInitByVolumeSummary", loginUserDscId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#lockTtPltzByMainMarkListNoWait(java.util.List)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4001PltzDomain> lockTtPltzByMainMarkListNoWait(
        List<String> mainMarkList) throws ApplicationException {

        return (List<W4001PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4001StgInstr.LockTtPltzByMainMarkListNoWait", mainMarkList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W4001StgInstrDao#searchTtPltzByExpReq(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W4001PltzDomain> searchTtPltzByExpReq(
        String loginUserDscId) throws ApplicationException {

        return (List<W4001PltzDomain>)getSqlMapClientTemplate()
            .queryForList("W4001StgInstr.SearchTtPltzByExpReq", loginUserDscId);
    }
}
