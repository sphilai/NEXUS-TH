/*
 * PROJECT：eca0027
 * 
 * TmPkgSpecHdr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecHdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecHdrDomain;


/**
 * TmPkgSpecHdr のDAO実装クラスです。<BR>
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
public class TmPkgSpecHdrDaoImpl extends SqlMapClientDaoSupport implements TmPkgSpecHdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSpecHdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecHdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain)
     */
    public TmPkgSpecHdrDomain searchByKey(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSpecHdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecHdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecHdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSpecHdrDomain> searchByCondition(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSpecHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSpecHdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecHdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSpecHdrDomain> searchByConditionForPaging(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSpecHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSpecHdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSpecHdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain)
     */
    public int searchCount(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSpecHdr.SearchCount", criteria);
        return cnt;
    }


}
