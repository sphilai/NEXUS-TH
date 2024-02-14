/*
 * PROJECT：eca0027
 * 
 * VmRpInvTplPkgHeader のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplPkgHeaderDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplPkgHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmRpInvTplPkgHeaderDomain;


/**
 * VmRpInvTplPkgHeader のDAO実装クラスです。<BR>
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
public class VmRpInvTplPkgHeaderDaoImpl extends SqlMapClientDaoSupport implements VmRpInvTplPkgHeaderDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplPkgHeaderDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplPkgHeaderDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplPkgHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmRpInvTplPkgHeaderDomain> searchByCondition(VmRpInvTplPkgHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<VmRpInvTplPkgHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("VmRpInvTplPkgHeader.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplPkgHeaderDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplPkgHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmRpInvTplPkgHeaderDomain> searchByConditionForPaging(VmRpInvTplPkgHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<VmRpInvTplPkgHeaderDomain>)getSqlMapClientTemplate()
                    .queryForList("VmRpInvTplPkgHeader.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmRpInvTplPkgHeaderDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmRpInvTplPkgHeaderCriteriaDomain)
     */
    public int searchCount(VmRpInvTplPkgHeaderCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VmRpInvTplPkgHeader.SearchCount", criteria);
        return cnt;
    }


}
