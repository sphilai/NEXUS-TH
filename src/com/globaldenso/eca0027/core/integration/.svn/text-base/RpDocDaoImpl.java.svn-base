/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RpDocDao;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6003TtScAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6008TtPackingAttachedByHeaderAndDetailDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtScAttachedBySumQtyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain;


/**
 * The DAO implementation class to use for creating the form of L6000 series.<br />
 * L6000番台の帳票作成時に使用するDAO実装クラスです。
 *
 * @version $Revision: 10963 $
 */
public class RpDocDaoImpl extends SqlMapClientDaoSupport implements RpDocDao {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public RpDocDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpDocDao#searchTtInvoiceAttachedBySumQty(com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L6003TtInvoiceAttachedBySumQtyDomain> searchTtInvoiceAttachedBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria)
        throws ApplicationException {
        return (List<L6003TtInvoiceAttachedBySumQtyDomain>) getSqlMapClientTemplate()
                    .queryForList("RpDoc.SearchTtInvoiceAttachedBySumQty", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpDocDao#searchPackAtchedForMain(com.globaldenso.eca0027.core.business.domain.criteria.L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L6008TtPackingAttachedByHeaderAndDetailDomain> searchPackAtchedForMain(L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain criteria)
        throws ApplicationException {
        return (List<L6008TtPackingAttachedByHeaderAndDetailDomain>) getSqlMapClientTemplate()
                    .queryForList("RpDoc.SearchTtPackingAttachedByHeaderAndDetail", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpDocDao#searchTtScAttachedBySumQty(com.globaldenso.eca0027.core.business.domain.criteria.L6003TtScAttachedBySumQtyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L6003TtScAttachedBySumQtyDomain> searchTtScAttachedBySumQty(L6003TtScAttachedBySumQtyCriteriaDomain criteria)
        throws ApplicationException {
        return (List<L6003TtScAttachedBySumQtyDomain>) getSqlMapClientTemplate()
                    .queryForList("RpDoc.SearchTtScAttachedBySumQty", criteria);
    }
    
    // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpDocDao#searchTtPackingAttachedItemBySumQty(com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L6003TtInvoiceAttachedBySumQtyDomain> searchTtPackingAttachedItemBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria)
        throws ApplicationException {
        return (List<L6003TtInvoiceAttachedBySumQtyDomain>) getSqlMapClientTemplate()
                    .queryForList("RpDoc.SearchTtPackingAttachedItemBySumQty", criteria);
    }
    // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<

}
