/*
 * PROJECT：eca0027
 * 
 * VtRpCmlMixtagErrRep のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/06/10  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlMixtagErrRepDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpCmlMixtagErrRepDomain;


/**
 * VtRpCmlMixtagErrRep のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/06/10 11:06:48<BR>
 * 
 * テーブル定義から2014/06/10に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpCmlMixtagErrRepDaoImpl extends SqlMapClientDaoSupport implements VtRpCmlMixtagErrRepDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpCmlMixtagErrRepDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlMixtagErrRepDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpCmlMixtagErrRepDomain> searchByCondition(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpCmlMixtagErrRepDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpCmlMixtagErrRep.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlMixtagErrRepDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpCmlMixtagErrRepDomain> searchByConditionForPaging(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpCmlMixtagErrRepDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpCmlMixtagErrRep.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpCmlMixtagErrRepDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpCmlMixtagErrRepCriteriaDomain)
     */
    public int searchCount(VtRpCmlMixtagErrRepCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpCmlMixtagErrRep.SearchCount", criteria);
        return cnt;
    }


}
