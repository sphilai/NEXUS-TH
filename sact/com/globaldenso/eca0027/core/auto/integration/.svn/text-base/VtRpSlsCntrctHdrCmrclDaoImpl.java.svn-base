/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctHdrCmrcl のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrCmrclDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrCmrclCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctHdrCmrclDomain;


/**
 * VtRpSlsCntrctHdrCmrcl のDAO実装クラスです。<BR>
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
public class VtRpSlsCntrctHdrCmrclDaoImpl extends SqlMapClientDaoSupport implements VtRpSlsCntrctHdrCmrclDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctHdrCmrclDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrCmrclDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrCmrclCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSlsCntrctHdrCmrclDomain> searchByCondition(VtRpSlsCntrctHdrCmrclCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSlsCntrctHdrCmrclDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSlsCntrctHdrCmrcl.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrCmrclDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrCmrclCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSlsCntrctHdrCmrclDomain> searchByConditionForPaging(VtRpSlsCntrctHdrCmrclCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSlsCntrctHdrCmrclDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSlsCntrctHdrCmrcl.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctHdrCmrclDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctHdrCmrclCriteriaDomain)
     */
    public int searchCount(VtRpSlsCntrctHdrCmrclCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpSlsCntrctHdrCmrcl.SearchCount", criteria);
        return cnt;
    }


}
