/*
 * PROJECT：eca0027
 * 
 * VtPltzStgInstr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtPltzStgInstrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtPltzStgInstrDomain;


/**
 * VtPltzStgInstr のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/05 10:41:01<BR>
 * 
 * テーブル定義から2014/03/05に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtPltzStgInstrDaoImpl extends SqlMapClientDaoSupport implements VtPltzStgInstrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtPltzStgInstrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtPltzStgInstrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtPltzStgInstrDomain> searchByCondition(VtPltzStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<VtPltzStgInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("VtPltzStgInstr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtPltzStgInstrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtPltzStgInstrDomain> searchByConditionForPaging(VtPltzStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<VtPltzStgInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("VtPltzStgInstr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtPltzStgInstrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtPltzStgInstrCriteriaDomain)
     */
    public int searchCount(VtPltzStgInstrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtPltzStgInstr.SearchCount", criteria);
        return cnt;
    }


}
