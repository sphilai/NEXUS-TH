/*
 * PROJECT：eca0027
 * 
 * VtRpStgInstr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/25  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpStgInstrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpStgInstrDomain;


/**
 * VtRpStgInstr のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/25 13:55:48<BR>
 * 
 * テーブル定義から2014/03/25に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpStgInstrDaoImpl extends SqlMapClientDaoSupport implements VtRpStgInstrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpStgInstrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpStgInstrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpStgInstrDomain> searchByCondition(VtRpStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpStgInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpStgInstr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpStgInstrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpStgInstrDomain> searchByConditionForPaging(VtRpStgInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpStgInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpStgInstr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpStgInstrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpStgInstrCriteriaDomain)
     */
    public int searchCount(VtRpStgInstrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpStgInstr.SearchCount", criteria);
        return cnt;
    }


}
