/*
 * PROJECT：eca0027
 * 
 * VtRpInvHdrForNonCmrcl のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForNonCmrclDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForNonCmrclCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvHdrForNonCmrclDomain;


/**
 * VtRpInvHdrForNonCmrcl のDAO実装クラスです。<BR>
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
public class VtRpInvHdrForNonCmrclDaoImpl extends SqlMapClientDaoSupport implements VtRpInvHdrForNonCmrclDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvHdrForNonCmrclDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForNonCmrclDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForNonCmrclCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvHdrForNonCmrclDomain> searchByCondition(VtRpInvHdrForNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvHdrForNonCmrclDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvHdrForNonCmrcl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForNonCmrclDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForNonCmrclCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvHdrForNonCmrclDomain> searchByConditionForPaging(VtRpInvHdrForNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvHdrForNonCmrclDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvHdrForNonCmrcl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForNonCmrclDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForNonCmrclCriteriaDomain)
     */
    public int searchCount(VtRpInvHdrForNonCmrclCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpInvHdrForNonCmrcl.SearchCount", criteria);
        return cnt;
    }


}
