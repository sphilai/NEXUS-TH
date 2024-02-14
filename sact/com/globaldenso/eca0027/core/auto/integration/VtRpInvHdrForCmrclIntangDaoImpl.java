/*
 * PROJECT：eca0027
 * 
 * VtRpInvHdrForCmrclIntang のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForCmrclIntangDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForCmrclIntangCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpInvHdrForCmrclIntangDomain;


/**
 * VtRpInvHdrForCmrclIntang のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtRpInvHdrForCmrclIntangDaoImpl extends SqlMapClientDaoSupport implements VtRpInvHdrForCmrclIntangDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpInvHdrForCmrclIntangDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForCmrclIntangDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForCmrclIntangCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvHdrForCmrclIntangDomain> searchByCondition(VtRpInvHdrForCmrclIntangCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvHdrForCmrclIntangDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvHdrForCmrclIntang.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForCmrclIntangDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForCmrclIntangCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpInvHdrForCmrclIntangDomain> searchByConditionForPaging(VtRpInvHdrForCmrclIntangCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpInvHdrForCmrclIntangDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpInvHdrForCmrclIntang.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpInvHdrForCmrclIntangDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpInvHdrForCmrclIntangCriteriaDomain)
     */
    public int searchCount(VtRpInvHdrForCmrclIntangCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpInvHdrForCmrclIntang.SearchCount", criteria);
        return cnt;
    }


}
