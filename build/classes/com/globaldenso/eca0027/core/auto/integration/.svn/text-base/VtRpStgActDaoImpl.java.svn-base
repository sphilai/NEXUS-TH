/*
 * PROJECT：eca0027
 * 
 * VtRpStgAct のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/04/02  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpStgActDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpStgActDomain;


/**
 * VtRpStgAct のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/04/02 14:14:58<BR>
 * 
 * テーブル定義から2014/04/02に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpStgActDaoImpl extends SqlMapClientDaoSupport implements VtRpStgActDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpStgActDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpStgActDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpStgActDomain> searchByCondition(VtRpStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpStgAct.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpStgActDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpStgActDomain> searchByConditionForPaging(VtRpStgActCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpStgActDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpStgAct.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpStgActDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgActCriteriaDomain)
     */
    public int searchCount(VtRpStgActCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpStgAct.SearchCount", criteria);
        return cnt;
    }


}
