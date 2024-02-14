/*
 * PROJECT：eca0027
 * 
 * VtRpMixtag のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpMixtagDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpMixtagDomain;


/**
 * VtRpMixtag のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpMixtagDaoImpl extends SqlMapClientDaoSupport implements VtRpMixtagDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpMixtagDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpMixtagDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpMixtagDomain> searchByCondition(VtRpMixtagCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpMixtagDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpMixtag.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpMixtagDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpMixtagDomain> searchByConditionForPaging(VtRpMixtagCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpMixtagDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpMixtag.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpMixtagDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpMixtagCriteriaDomain)
     */
    public int searchCount(VtRpMixtagCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpMixtag.SearchCount", criteria);
        return cnt;
    }


}
