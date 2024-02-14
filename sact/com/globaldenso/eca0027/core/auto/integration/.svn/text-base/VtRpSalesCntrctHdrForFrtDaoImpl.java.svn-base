/*
 * PROJECT：eca0027
 * 
 * VtRpSalesCntrctHdrForFrt のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpSalesCntrctHdrForFrtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSalesCntrctHdrForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpSalesCntrctHdrForFrtDomain;


/**
 * VtRpSalesCntrctHdrForFrt のDAO実装クラスです。<BR>
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
public class VtRpSalesCntrctHdrForFrtDaoImpl extends SqlMapClientDaoSupport implements VtRpSalesCntrctHdrForFrtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpSalesCntrctHdrForFrtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSalesCntrctHdrForFrtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSalesCntrctHdrForFrtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSalesCntrctHdrForFrtDomain> searchByCondition(VtRpSalesCntrctHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSalesCntrctHdrForFrtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSalesCntrctHdrForFrt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSalesCntrctHdrForFrtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSalesCntrctHdrForFrtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpSalesCntrctHdrForFrtDomain> searchByConditionForPaging(VtRpSalesCntrctHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpSalesCntrctHdrForFrtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpSalesCntrctHdrForFrt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpSalesCntrctHdrForFrtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpSalesCntrctHdrForFrtCriteriaDomain)
     */
    public int searchCount(VtRpSalesCntrctHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpSalesCntrctHdrForFrt.SearchCount", criteria);
        return cnt;
    }


}
