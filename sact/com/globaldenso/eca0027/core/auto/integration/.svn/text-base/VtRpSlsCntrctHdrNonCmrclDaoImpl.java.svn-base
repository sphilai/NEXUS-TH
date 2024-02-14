/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctHdrNonCmrcl のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrNonCmrclDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctHdrNonCmrclDomain;


/**
 * VtRpSlsCntrctHdrNonCmrcl のDAO実装クラスです。<BR>
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
public class VtRpSlsCntrctHdrNonCmrclDaoImpl extends SqlMapClientDaoSupport implements VtRpSlsCntrctHdrNonCmrclDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctHdrNonCmrclDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrNonCmrclDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSlsCntrctHdrNonCmrclDomain> searchByCondition(VtRpSlsCntrctHdrNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSlsCntrctHdrNonCmrclDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSlsCntrctHdrNonCmrcl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrNonCmrclDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSlsCntrctHdrNonCmrclDomain> searchByConditionForPaging(VtRpSlsCntrctHdrNonCmrclCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSlsCntrctHdrNonCmrclDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSlsCntrctHdrNonCmrcl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrNonCmrclDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrNonCmrclCriteriaDomain)
     */
    public int searchCount(VtRpSlsCntrctHdrNonCmrclCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpSlsCntrctHdrNonCmrcl.SearchCount", criteria);
        return cnt;
    }


}
