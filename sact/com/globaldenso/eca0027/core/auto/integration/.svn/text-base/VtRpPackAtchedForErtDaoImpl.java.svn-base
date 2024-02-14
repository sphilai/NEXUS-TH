/*
 * PROJECT：eca0027
 * 
 * VtRpPackAtchedForErt のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackAtchedForErtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackAtchedForErtDomain;


/**
 * VtRpPackAtchedForErt のDAO実装クラスです。<BR>
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
public class VtRpPackAtchedForErtDaoImpl extends SqlMapClientDaoSupport implements VtRpPackAtchedForErtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackAtchedForErtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackAtchedForErtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPackAtchedForErtDomain> searchByCondition(VtRpPackAtchedForErtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPackAtchedForErtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPackAtchedForErt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackAtchedForErtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPackAtchedForErtDomain> searchByConditionForPaging(VtRpPackAtchedForErtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPackAtchedForErtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPackAtchedForErt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackAtchedForErtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackAtchedForErtCriteriaDomain)
     */
    public int searchCount(VtRpPackAtchedForErtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpPackAtchedForErt.SearchCount", criteria);
        return cnt;
    }


}
