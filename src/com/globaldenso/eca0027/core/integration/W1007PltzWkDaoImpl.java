/*
 * PROJECT：eca0027
 * 
 * TtPltzWk のDAO実装クラス
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/05/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W1007PltzWkDao;
import com.globaldenso.eca0027.core.business.domain.W1007PltzWkDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1007PltzWkCriteriaDomain;


/**
 * TtPltzWk のDAO実装クラスです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/05/26 15:53:05<BR>
 * 
 * テーブル定義から2558/05/26に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1007PltzWkDaoImpl extends SqlMapClientDaoSupport implements W1007PltzWkDao {

    /**
     * デフォルトコンストラクタ。
     */
    public W1007PltzWkDaoImpl() {
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzWkDao#searchByKey(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzWkCriteriaDomain)
     */
    public W1007PltzWkDomain searchByKey(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return (W1007PltzWkDomain)getSqlMapClientTemplate()
                    .queryForObject("W1007PltzWk.SearchByKey", criteria);
    }
    /**
     * Issue 098
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.TtPltzWkDao#searchByType(com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzWkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1007PltzWkDomain> searchByType(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return (List<W1007PltzWkDomain>)getSqlMapClientTemplate()
                    .queryForList("W1007PltzWk.SearchByType", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007PltzWkDao#searchByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1007PltzWkDomain> searchByCondition(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return (List<W1007PltzWkDomain>)getSqlMapClientTemplate()
                    .queryForList("W1007PltzWk.SearchByCondition", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007PltzWkDao#searchJoinByCondition(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W1007PltzWkDomain> searchJoinByCondition(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return (List<W1007PltzWkDomain>)getSqlMapClientTemplate()
                    .queryForList("W1007PltzWk.SearchJoinByCondition", criteria);
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007PltzWkDao#searchMaxId()
     */
    public int searchMaxId() throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("W1007PltzWk.SearchMaxId");
        return cnt;
    }
    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007PltzWkDao#searchCount(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public int searchCountDistinct(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
                    .queryForObject("W1007PltzWk.SearchCountDistinct", criteria);
        if(cnt == 0){
            cnt = -1;
        }
        return cnt;
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007PltzWkDao#create(com.globaldenso.eca0027.core.auto.business.domain.W1007PltzWkDomain)
     */
    public void create(W1007PltzWkDomain domain) throws ApplicationException {
        getSqlMapClientTemplate()
                .insert("W1007PltzWk.Create", domain);
    }

    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007PltzWkDao#update(com.globaldenso.eca0027.core.auto.business.domain.W1007PltzWkDomain)
     */
    public int update(W1007PltzWkDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate()
                .update("W1007PltzWk.Update", domain);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007PltzWkDao#delete(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public int delete(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("W1007PltzWk.Delete", criteria);
    }


    /**
     * 
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.auto.business.dao.W1007PltzWkDao#deleteByExpRequestNo(com.globaldenso.eca0027.core.auto.business.domain.criteria.W1007PltzWkCriteriaDomain)
     */
    public int deleteByExpRequestNo(W1007PltzWkCriteriaDomain criteria) throws ApplicationException {
        return getSqlMapClientTemplate()
                .delete("W1007PltzWk.DeleteByExpRequestNo", criteria);
    }

}
