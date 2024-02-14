/*
 * PROJECT：eca0027
 * 
 * VtRpTransferItemNo のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/07/22  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferItemNoDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpTransferItemNoDomain;


/**
 * VtRpTransferItemNo のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/07/22 13:43:05<BR>
 * 
 * テーブル定義から2014/07/22に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class VtRpTransferItemNoDaoImpl extends SqlMapClientDaoSupport implements VtRpTransferItemNoDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpTransferItemNoDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferItemNoDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpTransferItemNoDomain> searchByCondition(VtRpTransferItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpTransferItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpTransferItemNo.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferItemNoDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpTransferItemNoDomain> searchByConditionForPaging(VtRpTransferItemNoCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpTransferItemNoDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpTransferItemNo.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpTransferItemNoDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpTransferItemNoCriteriaDomain)
     */
    public int searchCount(VtRpTransferItemNoCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpTransferItemNo.SearchCount", criteria);
        return cnt;
    }


}
