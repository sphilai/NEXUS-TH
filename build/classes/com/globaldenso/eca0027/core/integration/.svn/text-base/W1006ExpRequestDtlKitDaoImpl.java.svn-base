/*
 * PROJECT：eca0027
 * 
 * W1006ExpRequestDtlKit のDAO実装クラス
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
import com.globaldenso.eca0027.core.business.dao.W1006ExpRequestDtlKitDao;
import com.globaldenso.eca0027.core.business.domain.W1006ExpRequestDtlKitDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1006ExpRequestDtlKitCriteriaDomain;


/**
 * W1006ExpRequestDtlKit のDAO実装クラスです。<BR>
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
public class W1006ExpRequestDtlKitDaoImpl extends SqlMapClientDaoSupport implements W1006ExpRequestDtlKitDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1006ExpRequestDtlKitDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDtlKitDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlKitCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1006ExpRequestDtlKitDomain> searchByCondition(W1006ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        return (List<W1006ExpRequestDtlKitDomain>)getSqlMapClientTemplate()
                    .queryForList("W1006ExpRequestDtlKit.SearchByCondition", criteria);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1006ExpRequestDtlKitDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1006ExpRequestDtlKitCriteriaDomain)
     */
    public int searchCount(W1006ExpRequestDtlKitCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("W1006ExpRequestDtlKit.SearchCount", criteria);
        return cnt;
    }

}
