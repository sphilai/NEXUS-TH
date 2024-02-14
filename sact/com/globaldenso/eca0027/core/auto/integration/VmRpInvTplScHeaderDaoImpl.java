/*
 * PROJECT：eca0027
 * 
 * VmRpInvTplScHeader のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplScHeaderDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplScHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmRpInvTplScHeaderDomain;


/**
 * VmRpInvTplScHeader のDAO実装クラスです。<BR>
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
public class VmRpInvTplScHeaderDaoImpl extends SqlMapClientDaoSupport implements VmRpInvTplScHeaderDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplScHeaderDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplScHeaderDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplScHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmRpInvTplScHeaderDomain> searchByCondition(VmRpInvTplScHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<VmRpInvTplScHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("VmRpInvTplScHeader.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplScHeaderDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplScHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmRpInvTplScHeaderDomain> searchByConditionForPaging(VmRpInvTplScHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<VmRpInvTplScHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("VmRpInvTplScHeader.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplScHeaderDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplScHeaderCriteriaDomain)
     */
    public int searchCount(VmRpInvTplScHeaderCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VmRpInvTplScHeader.SearchCount", criteria);
        return cnt;
    }


}
