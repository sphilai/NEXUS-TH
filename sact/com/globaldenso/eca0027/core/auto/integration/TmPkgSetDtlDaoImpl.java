/*
 * PROJECT：eca0027
 * 
 * TmPkgSetDtl のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetDtlDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetDtlDomain;


/**
 * TmPkgSetDtl のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/05/15 10:10:46<BR>
 * 
 * テーブル定義から2015/05/15に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11315 $
 */
public class TmPkgSetDtlDaoImpl extends SqlMapClientDaoSupport implements TmPkgSetDtlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSetDtlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetDtlDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain)
     */
    public TmPkgSetDtlDomain searchByKey(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSetDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSetDtl.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetDtlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSetDtlDomain> searchByCondition(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSetDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSetDtl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetDtlDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSetDtlDomain> searchByConditionForPaging(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSetDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSetDtl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetDtlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetDtlCriteriaDomain)
     */
    public int searchCount(TmPkgSetDtlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSetDtl.SearchCount", criteria);
        return cnt;
    }


}
