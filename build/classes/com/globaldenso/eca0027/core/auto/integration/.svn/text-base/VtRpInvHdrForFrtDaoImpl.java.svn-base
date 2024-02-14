/*
 * PROJECT：eca0027
 * 
 * VtRpInvHdrForFrt のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/11/08  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForFrtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvHdrForFrtDomain;


/**
 * VtRpInvHdrForFrt のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/11/08 17:44:57<BR>
 * 
 * テーブル定義から2017/11/08に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15068 $
 */
public class VtRpInvHdrForFrtDaoImpl extends SqlMapClientDaoSupport implements VtRpInvHdrForFrtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvHdrForFrtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForFrtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvHdrForFrtDomain> searchByCondition(VtRpInvHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvHdrForFrtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvHdrForFrt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForFrtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvHdrForFrtDomain> searchByConditionForPaging(VtRpInvHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvHdrForFrtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvHdrForFrt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForFrtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForFrtCriteriaDomain)
     */
    public int searchCount(VtRpInvHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpInvHdrForFrt.SearchCount", criteria);
        return cnt;
    }


}
