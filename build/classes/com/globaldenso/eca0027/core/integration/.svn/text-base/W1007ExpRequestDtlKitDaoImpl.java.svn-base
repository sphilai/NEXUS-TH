/*
 * PROJECT：eca0027
 * 
 * W1007ExpRequestDtlKit のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/28  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1007ExpRequestDtlKitDao;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain;


/**
 * W1007ExpRequestDtlKit のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/28 16:15:38<BR>
 * 
 * テーブル定義から2558/04/28に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1007ExpRequestDtlKitDaoImpl extends SqlMapClientDaoSupport implements W1007ExpRequestDtlKitDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1007ExpRequestDtlKitDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDtlKitDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain)
     */
    public W1007ExpRequestDtlKitDomain searchByKey(W1007ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (W1007ExpRequestDtlKitDomain)getSqlMapClientTemplate()
                    .queryForObject("W1007ExpRequestDtlKit.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDtlKitDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestDtlKitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1007ExpRequestDtlKitDomain> searchByCondition(W1007ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (List<W1007ExpRequestDtlKitDomain>)getSqlMapClientTemplate()
                    .queryForList("W1007ExpRequestDtlKit.SearchByCondition", criteria);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDtlKitDao#update(com.globaldenso.eca0027.core.auto.business.domain.W1007ExpRequestDtlKitDomain)
     */
    public int update(W1007ExpRequestDtlKitDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("W1007ExpRequestDtlKit.Update", domain);
    }


}
