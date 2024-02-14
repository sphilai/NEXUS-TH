/*
 * PROJECT：eca0027
 * 
 * VmTimeDiffInfo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VmTimeDiffInfoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmTimeDiffInfoDomain;


/**
 * VmTimeDiffInfo のDAO実装クラスです。<BR>
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
public class VmTimeDiffInfoDaoImpl extends SqlMapClientDaoSupport implements VmTimeDiffInfoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VmTimeDiffInfoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmTimeDiffInfoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmTimeDiffInfoDomain> searchByCondition(VmTimeDiffInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<VmTimeDiffInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("VmTimeDiffInfo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmTimeDiffInfoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmTimeDiffInfoDomain> searchByConditionForPaging(VmTimeDiffInfoCriteriaDomain criteria) throws ApplicationException {
        return (List<VmTimeDiffInfoDomain>)getSqlMapClientTemplate()
                    .queryForList("VmTimeDiffInfo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmTimeDiffInfoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain)
     */
    public int searchCount(VmTimeDiffInfoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VmTimeDiffInfo.SearchCount", criteria);
        return cnt;
    }


}
