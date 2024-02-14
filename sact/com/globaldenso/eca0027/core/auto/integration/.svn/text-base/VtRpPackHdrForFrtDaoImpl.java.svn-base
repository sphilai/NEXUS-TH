/*
 * PROJECT：eca0027
 * 
 * VtRpPackHdrForFrt のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.integration;

import java.util.List;

import com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForFrtDao;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtRpPackHdrForFrtDomain;


/**
 * VtRpPackHdrForFrt のDAO実装クラスです。<BR>
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
public class VtRpPackHdrForFrtDaoImpl extends SqlMapClientDaoSupport implements VtRpPackHdrForFrtDao {

    /**
     * デフォルトコンストラクタ。
     */
    public VtRpPackHdrForFrtDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForFrtDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPackHdrForFrtDomain> searchByCondition(VtRpPackHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPackHdrForFrtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPackHdrForFrt.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForFrtDao#searchByConditionForPaging(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<VtRpPackHdrForFrtDomain> searchByConditionForPaging(VtRpPackHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        return (List<VtRpPackHdrForFrtDomain>)getSqlMapClientTemplate()
                    .queryForList("VtRpPackHdrForFrt.SearchByConditionForPaging", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.VtRpPackHdrForFrtDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.VtRpPackHdrForFrtCriteriaDomain)
     */
    public int searchCount(VtRpPackHdrForFrtCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("VtRpPackHdrForFrt.SearchCount", criteria);
        return cnt;
    }


}
