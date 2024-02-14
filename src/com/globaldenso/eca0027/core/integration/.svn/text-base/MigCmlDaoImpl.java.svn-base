/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.MigCmlDao;
import com.globaldenso.eca0027.core.business.domain.MigCmlDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.MigCmlCriteriaDomain;

/**
 * This is an implement class of Migration CML DAO.
 * <br />Migration CML DAOの実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11742 $
 */
public class MigCmlDaoImpl extends SqlMapClientDaoSupport implements MigCmlDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public MigCmlDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.MigCmlDao#searchByKeyMigCmlForHeadDistinct()
     */
    @SuppressWarnings("unchecked")
    public List<? extends MigCmlDomain> searchByKeyMigCmlForHeadDistinct() throws ApplicationException {
        return (List<MigCmlDomain>) getSqlMapClientTemplate()
            .queryForList("WsR001MigrationCmlPrint.SearchByKeyMigCmlForHeadDistinct");
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.MigCmlDao#searchByCondtionMigCmlForCmlHead(com.globaldenso.eca0027.core.business.domain.criteria.MigCmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public MigCmlDomain searchByCondtionMigCmlForCmlHead(
        MigCmlCriteriaDomain criteria) throws ApplicationException {
        return (MigCmlDomain) getSqlMapClientTemplate()
            .queryForObject("WsR001MigrationCmlPrint.SearchByCondtionMigCmlForCmlHead", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.MigCmlDao#searchByCondtionMigCmlForCmlDtil(com.globaldenso.eca0027.core.business.domain.criteria.MigCmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends MigCmlDomain> searchByCondtionMigCmlForCmlDtil(
        MigCmlCriteriaDomain criteria) throws ApplicationException {
        return (List<MigCmlDomain>) getSqlMapClientTemplate()
            .queryForList("WsR001MigrationCmlPrint.SearchByCondtionMigCmlForCmlDtil", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.MigCmlDao#searchByKeyMigCmlForPrinterInfo(com.globaldenso.eca0027.core.business.domain.criteria.MigCmlCriteriaDomain)
     */
    // ST958 MOD result:MigCmlDomain->List<String>
    @SuppressWarnings("unchecked")
    public List<String> searchByKeyMigCmlForPrinterInfo(
        MigCmlCriteriaDomain criteria) throws ApplicationException {
        return (List<String>) getSqlMapClientTemplate()
            .queryForList("WsR001MigrationCmlPrint.SearchByKeyMigCmlForPrinterInfo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.MigCmlDao#searchByConditionMigCmlForCmlDtl(com.globaldenso.eca0027.core.business.domain.criteria.MigCmlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends MigCmlDomain> searchByConditionMigCmlForCmlDtl(MigCmlCriteriaDomain criteria) throws ApplicationException {
        return (List<MigCmlDomain>) getSqlMapClientTemplate()
            .queryForList("WsR001MigrationCmlPrint.SearchByConditionMigCmlForCmlDtl", criteria);
    }

}

