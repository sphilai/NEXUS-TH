/*
 * PROJECT：eca0027
 * 
 * VtRpInvAtchedForMain のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/08/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForMainDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvAtchedForMainDomain;


/**
 * VtRpInvAtchedForMain のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/08/18 17:18:16<BR>
 * 
 * テーブル定義から2015/08/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11913 $
 */
public class VtRpInvAtchedForMainDaoImpl extends SqlMapClientDaoSupport implements VtRpInvAtchedForMainDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvAtchedForMainDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForMainDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvAtchedForMainDomain> searchByCondition(VtRpInvAtchedForMainCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvAtchedForMainDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvAtchedForMain.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForMainDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvAtchedForMainDomain> searchByConditionForPaging(VtRpInvAtchedForMainCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvAtchedForMainDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvAtchedForMain.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForMainDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForMainCriteriaDomain)
     */
    public int searchCount(VtRpInvAtchedForMainCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpInvAtchedForMain.SearchCount", criteria);
        return cnt;
    }


}
