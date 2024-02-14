/*
 * PROJECT：eca0027
 * 
 * VmGetQrCheck のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VmGetQrCheckDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmGetQrCheckDomain;


/**
 * VmGetQrCheck のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/07 14:20:24<BR>
 * 
 * テーブル定義から2014/03/07に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmGetQrCheckDaoImpl extends SqlMapClientDaoSupport implements VmGetQrCheckDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VmGetQrCheckDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmGetQrCheckDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmGetQrCheckDomain> searchByCondition(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException {
        return (List<VmGetQrCheckDomain>)getSqlMapClientTemplate()
                    .queryForList("VmGetQrCheck.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmGetQrCheckDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VmGetQrCheckDomain> searchByConditionForPaging(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException {
        return (List<VmGetQrCheckDomain>)getSqlMapClientTemplate()
                    .queryForList("VmGetQrCheck.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VmGetQrCheckDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VmGetQrCheckCriteriaDomain)
     */
    public int searchCount(VmGetQrCheckCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VmGetQrCheck.SearchCount", criteria);
        return cnt;
    }


}
