/*
 * PROJECT：eca0027
 * 
 * VmServerInfo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VmServerInfoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmServerInfoDomain;


/**
 * VmServerInfo のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/20 19:19:06<BR>
 * 
 * テーブル定義から2014/02/20に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmServerInfoDaoImpl extends SqlMapClientDaoSupport implements VmServerInfoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VmServerInfoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmServerInfoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmServerInfoDomain> searchByCondition(VmServerInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<VmServerInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("VmServerInfo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmServerInfoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmServerInfoDomain> searchByConditionForPaging(VmServerInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<VmServerInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("VmServerInfo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmServerInfoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain)
     */
    public int searchCount(VmServerInfoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VmServerInfo.SearchCount", criteria);
        return cnt;
    }


}