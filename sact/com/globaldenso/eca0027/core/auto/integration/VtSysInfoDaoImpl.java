/*
 * PROJECT：eca0027
 * 
 * VtSysInfo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/01/19  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtSysInfoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtSysInfoDomain;


/**
 * VtSysInfo のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/01/19 16:51:32<BR>
 * 
 * テーブル定義から2015/01/19に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 10410 $
 */
public class VtSysInfoDaoImpl extends SqlMapClientDaoSupport implements VtSysInfoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtSysInfoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtSysInfoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtSysInfoDomain> searchByCondition(VtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<VtSysInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("VtSysInfo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtSysInfoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtSysInfoDomain> searchByConditionForPaging(VtSysInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<VtSysInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("VtSysInfo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtSysInfoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtSysInfoCriteriaDomain)
     */
    public int searchCount(VtSysInfoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtSysInfo.SearchCount", criteria);
        return cnt;
    }


}
