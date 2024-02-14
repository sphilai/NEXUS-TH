/*
 * PROJECT：NEXUS
 * 
 * VtRpShippingFirm のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpShippingFirmDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpShippingFirmDomain;


/**
 * VtRpShippingFirm のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/27 16:15:58<BR>
 * 
 * テーブル定義から2014/02/27に自動生成したモジュールです。
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12982 $
 */
public class VtRpShippingFirmDaoImpl extends SqlMapClientDaoSupport implements VtRpShippingFirmDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpShippingFirmDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpShippingFirmDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpShippingFirmDomain> searchByCondition(VtRpShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpShippingFirmDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpShippingFirm.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpShippingFirmDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpShippingFirmDomain> searchByConditionForPaging(VtRpShippingFirmCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpShippingFirmDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpShippingFirm.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpShippingFirmDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpShippingFirmCriteriaDomain)
     */
    public int searchCount(VtRpShippingFirmCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpShippingFirm.SearchCount", criteria);
        return cnt;
    }


}
