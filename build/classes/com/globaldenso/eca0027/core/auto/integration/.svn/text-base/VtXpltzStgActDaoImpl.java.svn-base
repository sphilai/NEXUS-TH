/*
 * PROJECT：eca0027
 * 
 * VtXpltzStgAct のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtXpltzStgActDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtXpltzStgActDomain;


/**
 * VtXpltzStgAct のDAO実装クラスです。<BR>
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
public class VtXpltzStgActDaoImpl extends SqlMapClientDaoSupport implements VtXpltzStgActDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtXpltzStgActDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtXpltzStgActDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtXpltzStgActDomain> searchByCondition(VtXpltzStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<VtXpltzStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("VtXpltzStgAct.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtXpltzStgActDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtXpltzStgActDomain> searchByConditionForPaging(VtXpltzStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<VtXpltzStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("VtXpltzStgAct.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtXpltzStgActDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtXpltzStgActCriteriaDomain)
     */
    public int searchCount(VtXpltzStgActCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtXpltzStgAct.SearchCount", criteria);
        return cnt;
    }


}
