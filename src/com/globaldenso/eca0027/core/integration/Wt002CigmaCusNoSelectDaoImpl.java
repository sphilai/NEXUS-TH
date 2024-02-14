/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :May 28, 2015
 * Development company name:XXXXXXXXXXX
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.Wt002CigmaCusNoSelectDao;
import com.globaldenso.eca0027.core.business.domain.Wt002CigmaCusNoShipToDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt002CigmaCusNoShipToCriteriaDomain;

/**
 * <p>Type in the functional overview of the class.</p>
 *
 * @author XXXXXXXXXXX
 * @version 1.00
 */
public class Wt002CigmaCusNoSelectDaoImpl extends SqlMapClientDaoSupport implements
    Wt002CigmaCusNoSelectDao {

    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public Wt002CigmaCusNoSelectDaoImpl() {
        // TODO Auto-generated constructor stub
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.Wt002CigmaCusNoSelectDao#searchByConditionForPaging(com.globaldenso.eca0027.core.business.domain.Wt002CigmaCusNoShipToCriteriaDomain)
     */

    @SuppressWarnings("unchecked")
    public List<Wt002CigmaCusNoShipToDomain> searchByConditionForPaging(
        Wt002CigmaCusNoShipToCriteriaDomain criteria) throws ApplicationException {
        return (List<Wt002CigmaCusNoShipToDomain>)getSqlMapClientTemplate().queryForList(
            "Wt002CusNoSelect.SearchByConditionForPaging", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.Wt002CigmaCusNoSelectDao#searchCount(com.globaldenso.eca0027.core.business.domain.Wt002CigmaCusNoShipToCriteriaDomain)
     */

    public int searchCount(Wt002CigmaCusNoShipToCriteriaDomain criteria)
        throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate().queryForObject("Wt002CusNoSelect.SearchCount",
            criteria);
        return cnt;
    }

}
