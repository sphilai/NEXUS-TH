/*
 * PROJECT：eca0027
 * 
 * TmPkgSetHdr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetHdrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;


/**
 * TmPkgSetHdr のDAO実装クラスです。<BR>
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
public class TmPkgSetHdrDaoImpl extends SqlMapClientDaoSupport implements TmPkgSetHdrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public TmPkgSetHdrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetHdrDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain)
     */
    public TmPkgSetHdrDomain searchByKey(TmPkgSetHdrCriteriaDomain criteria) throws ApplicationException {
        return (TmPkgSetHdrDomain)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSetHdr.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetHdrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSetHdrDomain> searchByCondition(TmPkgSetHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSetHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSetHdr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetHdrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<TmPkgSetHdrDomain> searchByConditionForPaging(TmPkgSetHdrCriteriaDomain criteria) throws ApplicationException {
        return (List<TmPkgSetHdrDomain>)getSqlMapClientTemplate()
                    .queryForList("TmPkgSetHdr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TmPkgSetHdrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain)
     */
    public int searchCount(TmPkgSetHdrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("TmPkgSetHdr.SearchCount", criteria);
        return cnt;
    }


}
