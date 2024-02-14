/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt018ContainerInfoDao;
import com.globaldenso.eca0027.core.business.domain.Wt018ContainerInfoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt018ContainerInfoCriteriaDomain;

/**
 * The search dao implementation class of Container No Information Sub Screen.
 * <br />
 * コンテナNo表示子画面のDAO実装クラスです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class Wt018ContainerInfoDaoImpl extends SqlMapClientDaoSupport
    implements Wt018ContainerInfoDao {

    /**
     * Default constructor.
     */
    public Wt018ContainerInfoDaoImpl() {
    }
    
    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<Wt018ContainerInfoDomain> searchByConditionTtShippingFirm(
        Wt018ContainerInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt018ContainerInfoDomain>)getSqlMapClientTemplate()
            .queryForList("Wt018ContainerInfo.SearchByConditionTtShippingFirm", criteria);
    }

    /**
     * {@inheritDoc}
     */
    public int searchCountTtShippingFirm(Wt018ContainerInfoCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "Wt018ContainerInfo.SearchCountTtShippingFirm", criteria);
        return cnt;
    }
}
