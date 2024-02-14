/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecDtl のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecDtlDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecDtlDomain;


/**
 * TmPkgSpecDtl のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/05/15 10:10:46<BR>
 * 
 * テーブル定義から2015/05/15に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TmPkgSpecDtlDaoImpl extends SqlMapClientDaoSupport implements TmPkgSpecDtlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecDtlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecDtlDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    public TmPkgSpecDtlDomain searchByKey(TmPkgSpecDtlCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecDtlDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecDtl.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecDtlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSpecDtlDomain> searchByCondition(TmPkgSpecDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSpecDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSpecDtl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecDtlDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSpecDtlDomain> searchByConditionForPaging(TmPkgSpecDtlCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSpecDtlDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSpecDtl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecDtlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain)
     */
    public int searchCount(TmPkgSpecDtlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecDtl.SearchCount", criteria);
        return cnt;
    }


}
