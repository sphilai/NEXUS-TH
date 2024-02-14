/*
 * PROJECT：eca0027
 * 
 * VtRpSlsCntrctAtchedRt のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedRtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSlsCntrctAtchedRtDomain;


/**
 * VtRpSlsCntrctAtchedRt のDAO実装クラスです。<BR>
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
public class VtRpSlsCntrctAtchedRtDaoImpl extends SqlMapClientDaoSupport implements VtRpSlsCntrctAtchedRtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSlsCntrctAtchedRtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedRtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSlsCntrctAtchedRtDomain> searchByCondition(VtRpSlsCntrctAtchedRtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSlsCntrctAtchedRtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSlsCntrctAtchedRt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedRtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSlsCntrctAtchedRtDomain> searchByConditionForPaging(VtRpSlsCntrctAtchedRtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSlsCntrctAtchedRtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSlsCntrctAtchedRt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSlsCntrctAtchedRtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSlsCntrctAtchedRtCriteriaDomain)
     */
    public int searchCount(VtRpSlsCntrctAtchedRtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpSlsCntrctAtchedRt.SearchCount", criteria);
        return cnt;
    }


}
