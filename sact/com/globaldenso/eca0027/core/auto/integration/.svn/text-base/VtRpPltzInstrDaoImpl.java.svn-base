/*
 * PROJECT：eca0027
 * 
 * VtRpPltzInstr のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/04/12  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpPltzInstrDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPltzInstrDomain;


/**
 * VtRpPltzInstr のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/04/12 13:45:52<BR>
 * 
 * テーブル定義から2017/04/12に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 14083 $
 */
public class VtRpPltzInstrDaoImpl extends SqlMapClientDaoSupport implements VtRpPltzInstrDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPltzInstrDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPltzInstrDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPltzInstrDomain> searchByCondition(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPltzInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPltzInstr.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPltzInstrDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPltzInstrDomain> searchByConditionForPaging(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPltzInstrDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPltzInstr.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPltzInstrDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPltzInstrCriteriaDomain)
     */
    public int searchCount(VtRpPltzInstrCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpPltzInstr.SearchCount", criteria);
        return cnt;
    }


}
