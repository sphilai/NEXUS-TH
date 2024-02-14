/*
 * PROJECT：eca0027
 * 
 * VtRpCmlHdrMixedPltz のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/08/02  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlHdrMixedPltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpCmlHdrMixedPltzDomain;


/**
 * VtRpCmlHdrMixedPltz のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/08/02 15:47:26<BR>
 * 
 * テーブル定義から2014/08/02に自動生成したモジュールです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12982 $
 */
public class VtRpCmlHdrMixedPltzDaoImpl extends SqlMapClientDaoSupport implements VtRpCmlHdrMixedPltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpCmlHdrMixedPltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlHdrMixedPltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpCmlHdrMixedPltzDomain> searchByCondition(VtRpCmlHdrMixedPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpCmlHdrMixedPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpCmlHdrMixedPltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlHdrMixedPltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpCmlHdrMixedPltzDomain> searchByConditionForPaging(VtRpCmlHdrMixedPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpCmlHdrMixedPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpCmlHdrMixedPltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlHdrMixedPltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain)
     */
    public int searchCount(VtRpCmlHdrMixedPltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpCmlHdrMixedPltz.SearchCount", criteria);
        return cnt;
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlHdrMixedPltzDao#searchL1008ByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlHdrMixedPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpCmlHdrMixedPltzDomain> searchL1008ByCondition(VtRpCmlHdrMixedPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpCmlHdrMixedPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpCmlHdrMixedPltz.SearchL1008ByCondition", criteria);
    }

}
