/*
 * PROJECT：eca0027
 * 
 * VtCompMeasureUnit のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/20  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtCompMeasureUnitDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;


/**
 * VtCompMeasureUnit のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/20 19:22:34<BR>
 * 
 * テーブル定義から2014/03/20に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtCompMeasureUnitDaoImpl extends SqlMapClientDaoSupport implements VtCompMeasureUnitDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtCompMeasureUnitDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtCompMeasureUnitDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtCompMeasureUnitDomain> searchByCondition(VtCompMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return (List<VtCompMeasureUnitDomain>)getSqlMapClientTemplate()
                    .queryForList("VtCompMeasureUnit.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtCompMeasureUnitDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtCompMeasureUnitDomain> searchByConditionForPaging(VtCompMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        return (List<VtCompMeasureUnitDomain>)getSqlMapClientTemplate()
                    .queryForList("VtCompMeasureUnit.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtCompMeasureUnitDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtCompMeasureUnitCriteriaDomain)
     */
    public int searchCount(VtCompMeasureUnitCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtCompMeasureUnit.SearchCount", criteria);
        return cnt;
    }


}
