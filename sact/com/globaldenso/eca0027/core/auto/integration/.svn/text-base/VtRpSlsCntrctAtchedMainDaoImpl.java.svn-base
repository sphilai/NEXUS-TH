/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctAtchedMain のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedMainDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctAtchedMainDomain;


/**
 * VtRpSlsCntrctAtchedMain のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 13:29:08<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpSlsCntrctAtchedMainDaoImpl extends SqlMapClientDaoSupport implements VtRpSlsCntrctAtchedMainDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctAtchedMainDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedMainDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedMainCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSlsCntrctAtchedMainDomain> searchByCondition(VtRpSlsCntrctAtchedMainCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSlsCntrctAtchedMainDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSlsCntrctAtchedMain.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedMainDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedMainCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSlsCntrctAtchedMainDomain> searchByConditionForPaging(VtRpSlsCntrctAtchedMainCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSlsCntrctAtchedMainDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSlsCntrctAtchedMain.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedMainDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedMainCriteriaDomain)
     */
    public int searchCount(VtRpSlsCntrctAtchedMainCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpSlsCntrctAtchedMain.SearchCount", criteria);
        return cnt;
    }


}
