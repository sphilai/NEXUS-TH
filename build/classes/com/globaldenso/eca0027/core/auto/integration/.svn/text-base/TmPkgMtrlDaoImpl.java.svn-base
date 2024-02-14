/*
 * PROJECT：eca0027
 * 
 * TmPkgMtrl のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.TmPkgMtrlDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;


/**
 * TmPkgMtrl のDAO実装クラスです。<BR>
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
public class TmPkgMtrlDaoImpl extends SqlMapClientDaoSupport implements TmPkgMtrlDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgMtrlDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgMtrlDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    public TmPkgMtrlDomain searchByKey(TmPkgMtrlCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgMtrlDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgMtrl.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgMtrlDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgMtrlDomain> searchByCondition(TmPkgMtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgMtrlDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgMtrl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgMtrlDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgMtrlDomain> searchByConditionForPaging(TmPkgMtrlCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgMtrlDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgMtrl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgMtrlDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgMtrlCriteriaDomain)
     */
    public int searchCount(TmPkgMtrlCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPkgMtrl.SearchCount", criteria);
        return cnt;
    }


}
