/*
 * PROJECT：eca0027
 * 
 * VtTrnsTypStgAct のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtTrnsTypStgActDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtTrnsTypStgActDomain;


/**
 * VtTrnsTypStgAct のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/05 10:41:01<BR>
 * 
 * テーブル定義から2014/03/05に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtTrnsTypStgActDaoImpl extends SqlMapClientDaoSupport implements VtTrnsTypStgActDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtTrnsTypStgActDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtTrnsTypStgActDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtTrnsTypStgActDomain> searchByCondition(VtTrnsTypStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<VtTrnsTypStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("VtTrnsTypStgAct.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtTrnsTypStgActDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtTrnsTypStgActDomain> searchByConditionForPaging(VtTrnsTypStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<VtTrnsTypStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("VtTrnsTypStgAct.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtTrnsTypStgActDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtTrnsTypStgActCriteriaDomain)
     */
    public int searchCount(VtTrnsTypStgActCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtTrnsTypStgAct.SearchCount", criteria);
        return cnt;
    }


}
