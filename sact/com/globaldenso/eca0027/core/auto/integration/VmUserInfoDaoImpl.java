/*
 * PROJECT：eca0027
 * 
 * VmUserInfo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VmUserInfoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;


/**
 * VmUserInfo のDAO実装クラスです。<BR>
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
public class VmUserInfoDaoImpl extends SqlMapClientDaoSupport implements VmUserInfoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VmUserInfoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmUserInfoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmUserInfoDomain> searchByCondition(VmUserInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<VmUserInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("VmUserInfo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmUserInfoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmUserInfoDomain> searchByConditionForPaging(VmUserInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<VmUserInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("VmUserInfo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmUserInfoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain)
     */
    public int searchCount(VmUserInfoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VmUserInfo.SearchCount", criteria);
        return cnt;
    }


}
