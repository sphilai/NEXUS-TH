/*
 * PROJECT：eca0027
 * 
 * VtRpInvAtchedForRt のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForRtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvAtchedForRtDomain;


/**
 * VtRpInvAtchedForRt のDAO実装クラスです。<BR>
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
public class VtRpInvAtchedForRtDaoImpl extends SqlMapClientDaoSupport implements VtRpInvAtchedForRtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvAtchedForRtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForRtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvAtchedForRtDomain> searchByCondition(VtRpInvAtchedForRtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvAtchedForRtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvAtchedForRt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForRtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvAtchedForRtDomain> searchByConditionForPaging(VtRpInvAtchedForRtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvAtchedForRtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvAtchedForRt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvAtchedForRtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvAtchedForRtCriteriaDomain)
     */
    public int searchCount(VtRpInvAtchedForRtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpInvAtchedForRt.SearchCount", criteria);
        return cnt;
    }


}