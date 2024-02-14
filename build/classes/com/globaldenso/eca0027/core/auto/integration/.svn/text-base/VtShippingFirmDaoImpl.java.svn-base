/*
 * PROJECT：eca0027
 * 
 * VtShippingFirm のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtShippingFirmDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtShippingFirmDomain;


/**
 * VtShippingFirm のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/07 14:20:24<BR>
 * 
 * テーブル定義から2014/03/07に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtShippingFirmDaoImpl extends SqlMapClientDaoSupport implements VtShippingFirmDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtShippingFirmDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtShippingFirmDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtShippingFirmDomain> searchByCondition(VtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (List<VtShippingFirmDomain>)getSqlMapClientTemplate()
                    .queryForList("VtShippingFirm.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtShippingFirmDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtShippingFirmDomain> searchByConditionForPaging(VtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (List<VtShippingFirmDomain>)getSqlMapClientTemplate()
                    .queryForList("VtShippingFirm.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtShippingFirmDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtShippingFirmCriteriaDomain)
     */
    public int searchCount(VtShippingFirmCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtShippingFirm.SearchCount", criteria);
        return cnt;
    }


}
