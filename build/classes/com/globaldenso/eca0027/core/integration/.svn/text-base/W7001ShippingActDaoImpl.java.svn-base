/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TwShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDocDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActOdrDomain;
import com.globaldenso.eca0027.core.business.domain.W7001ShippingActPltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain;

/**
 * 
 * <br />The DAO implementation class of Shipping Actuality.
 * <br />船積実績のDAO実装クラスです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12986 $
 */
public class W7001ShippingActDaoImpl extends SqlMapClientDaoSupport implements W7001ShippingActDao {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001ShippingActDaoImpl() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchCountTtInvoice(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public int searchCountTtInvoice(W7001ShippingActCriteriaDomain criteria) throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchCountTtInvoice", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchForPagingTtInvoice(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActInvoiceDomain> searchForPagingTtInvoice(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchForPagingTtInvoice", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchCountTtInvoiceByNoPltz(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public int searchCountTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchCountTtInvoiceByNoPltz", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchForPagingTtInvoiceByNoPltz(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActInvoiceDomain> searchForPagingTtInvoiceByNoPltz(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchForPagingTtInvoiceByNoPltz", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchCountTtShippingAct(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public int searchCountTtShippingAct(W7001ShippingActCriteriaDomain criteria) throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchCountTtShippingAct", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchForPagingTtShippingAct(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActDomain> searchForPagingTtShippingAct(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchForPagingTtShippingAct", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchCountTwShippingActInvoice(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public int searchCountTwShippingActInvoice(W7001ShippingActCriteriaDomain criteria) throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchCountTwShippingActInvoice", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchForPagingTwShippingActInvoice(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActInvoiceDomain> searchForPagingTwShippingActInvoice(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchForPagingTwShippingActInvoice", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTtInvoice(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActInvoiceDomain> searchTtInvoice(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchTtInvoice", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTtPltz(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActPltzDomain> searchTtPltz(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchTtPltz", criteria);
    }    
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTtShippingActOdrByInvoiceNo(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActOdrDomain> searchTtShippingActOdrByInvoiceNo(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActOdrDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchTtShippingActOdrByInvoiceNo", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTtShippingDocumentByBrch(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActDocDomain searchTtShippingDocumentByBrch(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (W7001ShippingActDocDomain) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchTtShippingDocumentByBrch", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTtShippingDocumentByFileId(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActDocDomain> searchTtShippingDocumentByFileId(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        return (List<W7001ShippingActDocDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchTtShippingDocumentByFileId", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchCountTtShippingDocumentByShipper(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActInvoiceDomain searchCountTtShippingDocumentByShipper(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        return (W7001ShippingActInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchCountTtShippingDocumentByShipper", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTtShippingFirm(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActPltzDomain searchTtShippingFirm(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (W7001ShippingActPltzDomain) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchTtShippingFirm", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTwShippingActInvoice(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActInvoiceDomain> searchTwShippingActInvoice(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        return (List<W7001ShippingActInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchTwShippingActInvoice", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTwShippingActInvoiceByCount(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActInvoiceDomain searchTwShippingActInvoiceByCount(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (W7001ShippingActInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchTwShippingActInvoiceByCount", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTwShippingActInvoiceBySumPkgQty(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    public W7001ShippingActInvoiceDomain searchTwShippingActInvoiceBySumPkgQty(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (W7001ShippingActInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.SearchTwShippingActInvoiceBySumPkgQty", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#lockByNoWaitTtInvoice(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActInvoiceDomain> lockByNoWaitTtInvoice(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.LockByNoWaitTtInvoice", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#lockByNoWaitTtShippingAct(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActDomain> lockByNoWaitTtShippingAct(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.LockByNoWaitTtShippingAct", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#lockByNoWaitTtShippingActOdr(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActOdrDomain> lockByNoWaitTtShippingActOdr(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActOdrDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.LockByNoWaitTtShippingActOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#lockByNoWaitTtShippingDocument(com.globaldenso.eca0027.core.business.domain.criteria.W7001ShippingActCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActDocDomain> lockByNoWaitTtShippingDocument(W7001ShippingActCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<W7001ShippingActDocDomain>) getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.LockByNoWaitTtShippingDocument", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#createTwShippingActInvoice(TwShippingActInvoiceDomain)
     */
    public void createTwShippingActInvoice(TwShippingActInvoiceDomain domain)
        throws ApplicationException {
        getSqlMapClientTemplate()
            .insert("W7001ShippingAct.CreateTwShippingActInvoice", domain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTtPltzByInvoice(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchTtPltzByInvoice(String dscId) throws ApplicationException {
        return (List<String>)getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchTtPltzByInvoice", dscId);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#updateTtShippingAct(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public int updateTtShippingAct(W7001ShippingActCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate()
            .update("W7001ShippingAct.UpdateTtShippingAct", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#searchTtShippingActByShippingFirmNo(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W7001ShippingActDomain> searchTtShippingActByShippingFirmNo(
        W7001ShippingActCriteriaDomain criteria) throws ApplicationException {
        return (List<W7001ShippingActDomain>)getSqlMapClientTemplate()
            .queryForList("W7001ShippingAct.SearchTtShippingActByShippingFirmNo", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W7001ShippingActDao#getClpGroupSeqNextValue(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public String getClpGroupSeqNextValue() throws ApplicationException {
        return (String)getSqlMapClientTemplate()
            .queryForObject("W7001ShippingAct.GetClpGroupSeqNextValue");
    }
}
