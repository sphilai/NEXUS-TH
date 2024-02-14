package com.globaldenso.eca0027.core.integration;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.WsBhtStgDao;
import com.globaldenso.eca0027.core.business.domain.ECA0027_WS_4501Domain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByConditionCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByMainMarkCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtStgInstrByStgInstrNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtXpltzByXMainMarkCriteriaDomain;

/**
 * 
 * <p>
 * Implement Class of TtStgInstrExtDao 
 * TtStgInstrExtDaoの実装クラス
 * </p>
 *
 * @version 1.00
 */
public class WsBhtStgDaoImpl  extends SqlMapClientDaoSupport implements WsBhtStgDao {

    /**
     * Constructor
     */
    WsBhtStgDaoImpl(){}

    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtStgDao#searchTtStgInstrByCondition(com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtStgInstrByStgInstrNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<ECA0027_WS_4501Domain> searchTtStgInstrByCondition(WS4501TtStgInstrByStgInstrNoCriteriaDomain criteria)
        throws ApplicationException {
        return (List<ECA0027_WS_4501Domain>)getSqlMapClientTemplate()
            .queryForList("Stg.SearchTtStgInstrByCondition", criteria);
    }

    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtStgDao#lockTtPltzByConditionNoWait(com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByConditionCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<ECA0027_WS_4501Domain> lockTtPltzByConditionNoWait(
        WS4501TtPltzByConditionCriteriaDomain criteria) throws ApplicationException {
        return (List<ECA0027_WS_4501Domain>)getSqlMapClientTemplate()
            .queryForList("Stg.LockTtPltzByConditionNoWait", criteria);
    }



    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtStgDao#searchTtPltzByKeys(com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtPltzByMainMarkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<ECA0027_WS_4501Domain> searchTtPltzByKeys(
        WS4501TtPltzByMainMarkCriteriaDomain inputDomain) throws ApplicationException {
        return (List<ECA0027_WS_4501Domain>)getSqlMapClientTemplate()
            .queryForList("Stg.SearchTtPltzByKeys", inputDomain);
    }

    /**
     *  {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtStgDao#searchTtXpltzByKeys(com.globaldenso.eca0027.core.business.domain.criteria.WS4501TtXpltzByXMainMarkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<ECA0027_WS_4501Domain> searchTtXpltzByKeys(
        WS4501TtXpltzByXMainMarkCriteriaDomain inputDomain) throws ApplicationException {
        return (List<ECA0027_WS_4501Domain>)getSqlMapClientTemplate()
            .queryForList("Stg.SearchTtXpltzByKeys", inputDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtStgDao#updStgInstrIncludedInStgAct(java.util.Map)
     */
    public int updStgInstrIncludedInStgAct(Map<String, Object> inputMap) throws ApplicationException {
        return getSqlMapClientTemplate().update("Stg.UpdateStgInstrIncludedInStgAct", inputMap);
    }
}
