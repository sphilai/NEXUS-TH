/*
 * PROJECT：eca0027
 * 
 * VtRpPackHdrForMain のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForMainDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackHdrForMainDomain;


/**
 * VtRpPackHdrForMain のDAO実装クラスです。<BR>
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
public class VtRpPackHdrForMainDaoImpl extends SqlMapClientDaoSupport implements VtRpPackHdrForMainDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackHdrForMainDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForMainDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPackHdrForMainDomain> searchByCondition(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPackHdrForMainDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPackHdrForMain.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForMainDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPackHdrForMainDomain> searchByConditionForPaging(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPackHdrForMainDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPackHdrForMain.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForMainDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForMainCriteriaDomain)
     */
    public int searchCount(VtRpPackHdrForMainCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpPackHdrForMain.SearchCount", criteria);
        return cnt;
    }


}
