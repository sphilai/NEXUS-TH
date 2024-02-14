/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao;
import com.globaldenso.eca0027.core.business.domain.W5001CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001StgDomain;

/**
 * Interface of the DAO to access the Shipping confirm
 * <br />出荷確認のDAO実装です。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 9221 $
 */
public class W5001ShippingFirmDaoImpl extends SqlMapClientDaoSupport implements
    W5001ShippingFirmDao {

    /**
     * constructor.
     */
    public W5001ShippingFirmDaoImpl() {
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#searchCountForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public int searchCountForPagingOnMainSearch(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate()
                    .queryForObject("W5001ShippingFirm.SearchCountOnMainSearch", shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#searchForPagingOnMainSearch(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W5001ShippingFirmDomain> searchForPagingOnMainSearch(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return (List<W5001ShippingFirmDomain>) getSqlMapClientTemplate()
            .queryForList("W5001ShippingFirm.SearchForPagingOnMainSearch", shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#searchCountForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain)
     */
    public int searchCountForPagingOnCreateSearch(
        W5001StgCriteriaDomain stgCriteriaDomain) throws ApplicationException {
        return (Integer)getSqlMapClientTemplate()
                    .queryForObject("W5001ShippingFirm.SearchCountForPagingOnCreateSearch", stgCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#searchForPagingOnCreateSearch(com.globaldenso.eca0027.core.business.domain.W5001StgCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W5001StgDomain> searchForPagingOnCreateSearch(
        W5001StgCriteriaDomain stgCriteriaDomain) throws ApplicationException {
        return (List<? extends W5001StgDomain>) getSqlMapClientTemplate()
                    .queryForList("W5001ShippingFirm.SearchForPagingOnCreateSearch", stgCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#searchOnRegisterInitByFromMain(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromMain(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return (W5001ShippingFirmDomain) getSqlMapClientTemplate()
                    .queryForObject("W5001ShippingFirm.SearchOnRegisterInitByFromMain", shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#searchOnRegisterInitByFromCreateStgInstr(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgInstr(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return (W5001ShippingFirmDomain) getSqlMapClientTemplate()
            .queryForObject("W5001ShippingFirm.SearchOnRegisterInitByFromCreateStgInstr", shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#searchOnRegisterInitByFromCreateStgAct(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    public W5001ShippingFirmDomain searchOnRegisterInitByFromCreateStgAct(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return (W5001ShippingFirmDomain) getSqlMapClientTemplate()
            .queryForObject("W5001ShippingFirm.SearchOnRegisterInitByFromCreateStgAct", shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#lockTtPltzByXmainMarkOrMainMarkNoWait(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W5001CmlDomain> lockTtPltzByXmainMarkOrMainMarkNoWait(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain)
        throws ApplicationException {
        return (List<? extends W5001CmlDomain>) getSqlMapClientTemplate()
            .queryForList("W5001ShippingFirm.LockTtPltzByXmainMarkOrMainMarkNoWait", shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#lockTtPltzTtInvoiceByShippingFirmNoNoWait(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W5001CmlDomain> lockTtPltzTtInvoiceByShippingFirmNoNoWait(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain) throws ApplicationException {
        return (List<? extends W5001CmlDomain>) getSqlMapClientTemplate()
            .queryForList("W5001ShippingFirm.LockTtPltzTtInvoiceByShippingFirmNoNoWait", shippingFirmCriteriaDomain);
    }
    
    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W5001ShippingFirmDao#lockTtPltzByShippingFirmNoNoWait(com.globaldenso.eca0027.core.business.domain.W5001ShippingFirmCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W5001CmlDomain> lockTtPltzByShippingFirmNoNoWait(
        W5001ShippingFirmCriteriaDomain shippingFirmCriteriaDomain) throws ApplicationException {
        return (List<? extends W5001CmlDomain>) getSqlMapClientTemplate()
            .queryForList("W5001ShippingFirm.LockTtPltzByShippingFirmNoNoWait", shippingFirmCriteriaDomain);
    }
}
