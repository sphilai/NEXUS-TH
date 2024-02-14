/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/24  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1006ExpRequestDao;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestCriteriaDomain;


/**
 * TtExpRequest のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/24 15:48:14<BR>
 * 
 * テーブル定義から2558/04/24に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1006ExpRequestDaoImpl extends SqlMapClientDaoSupport implements W1006ExpRequestDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1006ExpRequestDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestCriteriaDomain)
     */
    public W1006ExpRequestDomain searchByKey(W1006ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (W1006ExpRequestDomain)getSqlMapClientTemplate()
                    .queryForObject("W1006ExpRequest.SearchByKey", criteria);
    }
    
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestCriteriaDomain)
     */
    public W1006ExpRequestDomain searchPrintByKey(W1006ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (W1006ExpRequestDomain)getSqlMapClientTemplate()
                    .queryForObject("W1006ExpRequest.SearchPrintByKey", criteria);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDao#update(com.globaldenso.eca0027.core.auto.business.domain.W1006ExpRequestDomain)
     */
    public int update(W1006ExpRequestDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("W1006ExpRequest.Update", domain);
    }


}
