/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao;
import com.globaldenso.eca0027.core.business.domain.T0400F010InvDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F020CmlDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F030CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F040InvItemDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F050CtnrDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F060ShpActDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F070AttCtlDomain;
import com.globaldenso.eca0027.core.business.domain.T0400F7007ClpDomain;
import com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain;

/**
 * This is a DAO implement class of an EDI-Receive-Order registration batch.
 * <br />船積書類GINV送信バッチのDAO実装クラスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 14032 $
 */
public class JbTransferToGinvDaoImpl extends SqlMapClientDaoSupport implements JbTransferToGinvDao {

    /**
     * constructor.
     * <br />コンストラクタです。
     */
    public JbTransferToGinvDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchReequstParam(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400TransferToGinvDomain> searchReequstParam(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400TransferToGinvDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchReequstParam", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#updateReequstParamComplate(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    public int updateReequstParamComplate(List<? extends T0400TransferToGinvDomain> transferToGinvDomainList) throws ApplicationException {
        return getSqlMapClientTemplate()
            .update("JbTransferToGinv.UpdateReequstParamComplate", transferToGinvDomainList);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F010Inv(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F010InvDomain> searchT0400F010Inv(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F010InvDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F010Inv", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F020Cml(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F020CmlDomain> searchT0400F020Cml(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F020CmlDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F020Cml", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F030CmlItem(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F030CmlItemDomain> searchT0400F030CmlItem(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F030CmlItemDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F030CmlItem", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F040InvItem(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F040InvItemDomain> searchT0400F040InvItem(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F040InvItemDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F040InvItem", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F050Ctnr(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F050CtnrDomain> searchT0400F050Ctnr(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F050CtnrDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F050Ctnr", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F060ShpAct(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F060ShpActDomain> searchT0400F060ShpAct(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F060ShpActDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F060ShpAct", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F070AttCtlWhenInvoice(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F070AttCtlDomain> searchT0400F070AttCtlWhenInvoice(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F070AttCtlDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F070AttCtlWhenInvoice", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchBlldFileSummary(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F070AttCtlDomain> searchBlldFileSummary(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F070AttCtlDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchBlldFileSummary", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F070AttCtlWhenBilld(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F070AttCtlDomain> searchT0400F070AttCtlWhenBilld(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F070AttCtlDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F070AttCtlWhenBilld", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F070AttCtlWhenClp(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F070AttCtlDomain> searchT0400F070AttCtlWhenClp(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F070AttCtlDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F070AttCtlWhenClp", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchClp(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F7007ClpDomain> searchClp(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F7007ClpDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchClp", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#SearchOtherDocFileSummary(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F070AttCtlDomain> searchOtherDocFileSummary(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F070AttCtlDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchOtherDocFileSummary", transferToGinvDomain);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.JbTransferToGinvDao#searchT0400F070AttCtlWhenOtherDoc(com.globaldenso.eca0027.core.business.domain.T0400TransferToGinvDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends T0400F070AttCtlDomain> searchT0400F070AttCtlWhenOtherDoc(T0400TransferToGinvDomain transferToGinvDomain)
        throws ApplicationException
    {
        return (List<? extends T0400F070AttCtlDomain>) getSqlMapClientTemplate()
            .queryForList("JbTransferToGinv.SearchT0400F070AttCtlWhenOtherDoc", transferToGinvDomain);
    }
}
