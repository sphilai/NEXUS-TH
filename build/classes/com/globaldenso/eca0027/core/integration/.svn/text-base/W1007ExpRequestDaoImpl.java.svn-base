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
import com.globaldenso.eca0027.core.business.dao.W1007ExpRequestDao;
import com.globaldenso.eca0027.core.business.domain.W1007ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007ExpRequestCriteriaDomain;


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
public class W1007ExpRequestDaoImpl extends SqlMapClientDaoSupport implements W1007ExpRequestDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1007ExpRequestDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007ExpRequestCriteriaDomain)
     */
    public W1007ExpRequestDomain searchByKey(W1007ExpRequestCriteriaDomain criteria) throws ApplicationException {
        return (W1007ExpRequestDomain)getSqlMapClientTemplate()
                    .queryForObject("W1007ExpRequest.SearchByKey", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007ExpRequestDao#update(com.globaldenso.eca0027.core.auto.business.domain.W1007ExpRequestDomain)
     */
    public int update(W1007ExpRequestDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("W1007ExpRequest.Update", domain);
    }

   
}
