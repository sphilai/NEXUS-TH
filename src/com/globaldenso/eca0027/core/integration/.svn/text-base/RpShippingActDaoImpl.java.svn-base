/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RpShippingActDao;
import com.globaldenso.eca0027.core.business.domain.L7001TtPltzByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.L7001TtPltzByImporterDomain;
import com.globaldenso.eca0027.core.business.domain.L7001TtShippingActByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.L7001TtShippingFirmByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.L7002TtShippingFirmByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByImporterCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByNoOfInvoiceCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtShippingActByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtShippingFirmByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7002TtShippingFirmByDetailCriteriaDomain;


/**
 * The DAO implementation class to use for creating the form of L7000 series.<br />
 * L7000番台の帳票作成時に使用するDAO実装クラスです。
 *
 * @version $Revision: 7765 $
 */
public class RpShippingActDaoImpl extends SqlMapClientDaoSupport implements RpShippingActDao {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public RpShippingActDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpShippingActDao#searchTtShippingActByHeader(L7001TtShippingActByHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L7001TtShippingActByHeaderDomain> searchTtShippingActByHeader(L7001TtShippingActByHeaderCriteriaDomain condition) throws ApplicationException {
        return (List<L7001TtShippingActByHeaderDomain>) getSqlMapClientTemplate()
               .queryForList("RpShippingAct.SearchTtShippingActByHeader", condition);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpShippingActDao#searchTtPltzByHeader(com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public  List<L7001TtPltzByHeaderDomain> searchTtPltzByHeader(L7001TtPltzByHeaderCriteriaDomain condition) throws ApplicationException {
        return ( List<L7001TtPltzByHeaderDomain>) getSqlMapClientTemplate()
                .queryForList("RpShippingAct.SearchTtPltzByHeader", condition);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpShippingActDao#searchTtPltzByImporter(com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByImporterCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L7001TtPltzByImporterDomain> searchTtPltzByImporter(L7001TtPltzByImporterCriteriaDomain condition) throws ApplicationException {
        return ( List<L7001TtPltzByImporterDomain>) getSqlMapClientTemplate()
                .queryForList("RpShippingAct.SearchTtPltzByImporter", condition);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpShippingActDao#searchTtPltzByNoOfInvoice(com.globaldenso.eca0027.core.business.domain.criteria.L7001TtPltzByNoOfInvoiceCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchTtPltzByNoOfInvoice(L7001TtPltzByNoOfInvoiceCriteriaDomain condition) throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("RpShippingAct.SearchTtPltzByNoOfInvoice", condition);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpShippingActDao#searchTtShippingFirmByHeader(com.globaldenso.eca0027.core.business.domain.criteria.L7001TtShippingFirmByHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L7001TtShippingFirmByHeaderDomain> searchTtShippingFirmByHeader(L7001TtShippingFirmByHeaderCriteriaDomain condition) throws ApplicationException {
        return ( List<L7001TtShippingFirmByHeaderDomain>) getSqlMapClientTemplate()
            .queryForList("RpShippingAct.SearchTtShippingFirmByHeader", condition);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpShippingActDao#searchTtShippingFirmByDetail(com.globaldenso.eca0027.core.business.domain.criteria.L7002TtShippingFirmByDetailCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L7002TtShippingFirmByDetailDomain> searchTtShippingFirmByDetail(L7002TtShippingFirmByDetailCriteriaDomain condition) throws ApplicationException {
        return ( List<L7002TtShippingFirmByDetailDomain>) getSqlMapClientTemplate()
            .queryForList("RpShippingAct.SearchTtShippingFirmByDetail", condition);
    }


}
