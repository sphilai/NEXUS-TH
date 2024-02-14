/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RpErtDao;
import com.globaldenso.eca0027.core.business.domain.LC001TtPltzByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.LC001TtPltzItemByDetailErtDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzItemByDetailErtCriteriaDomain;


/**
 * The DAO implementation class to use for creating the form of LC001 series.<br />
 * LC001の帳票作成時に使用するDAO実装クラスです。
 *
 * @version $Revision: 7765 $
 */
public class RpErtDaoImpl extends SqlMapClientDaoSupport implements RpErtDao {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public RpErtDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpErtDao#searchTtPltzByHeader(com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzByHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<LC001TtPltzByHeaderDomain> searchTtPltzByHeader(LC001TtPltzByHeaderCriteriaDomain criteria) throws ApplicationException {
        return (List<LC001TtPltzByHeaderDomain>) getSqlMapClientTemplate().queryForList("RpErt.SearchTtPltzByHeader", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpErtDao#searchTtPltzItemByDetailErt(com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzItemByDetailErtCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<LC001TtPltzItemByDetailErtDomain> searchTtPltzItemByDetailErt(LC001TtPltzItemByDetailErtCriteriaDomain criteria) throws ApplicationException {
        return (List<LC001TtPltzItemByDetailErtDomain>) getSqlMapClientTemplate().queryForList("RpErt.SearchTtPltzItemByDetailErt", criteria);
    }
}
