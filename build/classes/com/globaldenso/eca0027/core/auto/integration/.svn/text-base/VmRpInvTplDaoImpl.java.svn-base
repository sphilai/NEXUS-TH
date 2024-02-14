/*
 * PROJECT：eca0027
 * 
 * VmRpInvTpl のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmRpInvTplDomain;


/**
 * VmRpInvTpl のDAO実装クラスです。<BR>
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
public class VmRpInvTplDaoImpl extends SqlMapClientDaoSupport implements VmRpInvTplDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmRpInvTplDomain> searchByCondition(VmRpInvTplCriteriaDomain criteria) throws ApplicationException {
        return (List<VmRpInvTplDomain>)getSqlMapClientTemplate()
                    .queryForList("VmRpInvTpl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmRpInvTplDomain> searchByConditionForPaging(VmRpInvTplCriteriaDomain criteria) throws ApplicationException {
        return (List<VmRpInvTplDomain>)getSqlMapClientTemplate()
                    .queryForList("VmRpInvTpl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplCriteriaDomain)
     */
    public int searchCount(VmRpInvTplCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VmRpInvTpl.SearchCount", criteria);
        return cnt;
    }


}
