/*
 * PROJECT：eca0027
 * 
 * VtBhtLockuser のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtBhtLockuserDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtBhtLockuserDomain;


/**
 * VtBhtLockuser のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/07 14:20:24<BR>
 * 
 * テーブル定義から2014/03/07に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtBhtLockuserDaoImpl extends SqlMapClientDaoSupport implements VtBhtLockuserDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtBhtLockuserDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtBhtLockuserDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtBhtLockuserDomain> searchByCondition(VtBhtLockuserCriteriaDomain criteria) throws ApplicationException {
        return (List<VtBhtLockuserDomain>)getSqlMapClientTemplate()
                    .queryForList("VtBhtLockuser.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtBhtLockuserDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtBhtLockuserDomain> searchByConditionForPaging(VtBhtLockuserCriteriaDomain criteria) throws ApplicationException {
        return (List<VtBhtLockuserDomain>)getSqlMapClientTemplate()
                    .queryForList("VtBhtLockuser.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtBhtLockuserDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtBhtLockuserCriteriaDomain)
     */
    public int searchCount(VtBhtLockuserCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtBhtLockuser.SearchCount", criteria);
        return cnt;
    }


}
