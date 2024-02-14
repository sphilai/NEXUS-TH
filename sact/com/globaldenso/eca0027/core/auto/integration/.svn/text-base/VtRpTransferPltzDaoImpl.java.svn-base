/*
 * PROJECT：eca0027
 * 
 * VtRpTransferPltz のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/10/16  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferPltzDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpTransferPltzDomain;


/**
 * VtRpTransferPltz のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/10/16 17:05:03<BR>
 * 
 * テーブル定義から2015/10/16に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class VtRpTransferPltzDaoImpl extends SqlMapClientDaoSupport implements VtRpTransferPltzDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpTransferPltzDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferPltzDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpTransferPltzDomain> searchByCondition(VtRpTransferPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpTransferPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpTransferPltz.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferPltzDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpTransferPltzDomain> searchByConditionForPaging(VtRpTransferPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpTransferPltzDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpTransferPltz.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferPltzDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferPltzCriteriaDomain)
     */
    public int searchCount(VtRpTransferPltzCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpTransferPltz.SearchCount", criteria);
        return cnt;
    }


}
