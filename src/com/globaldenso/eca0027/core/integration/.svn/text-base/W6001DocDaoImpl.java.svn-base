/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W6001DocDao;
import com.globaldenso.eca0027.core.business.domain.F6051CmlAtchFileDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemDomain;
import com.globaldenso.eca0027.core.business.domain.W6001DocPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;

/**
 * The DAO implementation class of Documentation.
 * <br />DocumentationのDAO実装クラスです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class W6001DocDaoImpl extends SqlMapClientDaoSupport implements W6001DocDao {
    
    /**
     * Default constructor
     * <br />デフォルトコンストラクタです。
     */
    public W6001DocDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTtInvoice(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchCountTtInvoice(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTtInvoice", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtPltzByCreate(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W6001DocPltzDomain> searchTtPltzByCreate(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTtPltzByCreate", criteria);
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchForPagingTtInvoice(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocInvoiceDomain> searchForPagingTtInvoice(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchForPagingTtInvoice", criteria);
    }
    
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTtPltzByTypA(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchCountTtPltzByTypA(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTtPltzByTypA", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchForPagingTtPltzByTypA(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchForPagingTtPltzByTypA(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchForPagingTtPltzByTypA", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTtPltzByTypB(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchCountTtPltzByTypB(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTtPltzByTypB", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchForPagingTtPltzByTypB(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchForPagingTtPltzByTypB(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchForPagingTtPltzByTypB", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTtPltzByTypZ(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchCountTtPltzByTypZ(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTtPltzByTypZ", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchForPagingTtPltzByTypZ(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchForPagingTtPltzByTypZ(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchForPagingTtPltzByTypZ", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTmExpFormalitiItemNo(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzItemDomain> searchTmExpFormalitiItemNo(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzItemDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTmExpFormalitiItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvItemByDetailFull(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByDetailFull(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzItemDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvItemByDetailFull", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTwInvItemByUnitPrice(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchCountTwInvItemByUnitPrice(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTwInvItemByUnitPrice", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByDetail(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByDetail(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByDetail", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTwInvItemByCurrencyCheck(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchCountTwInvItemByCurrencyCheck(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTwInvItemByCurrencyCheck", criteria);
    }

    // UT186 ZIP DOWNLOAD MOD START
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByFileManager(W6001DocCriteriaDomain)
     */
//    @SuppressWarnings("unchecked")
//    public W6001DocInvoiceDomain searchTtInvoiceByFileManager(W6001DocCriteriaDomain criteria)
//        throws  ApplicationException {
//        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
//            .queryForObject("W6001Doc.SearchTtInvoiceByFileManager", criteria);
//    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchFileIdByParentInvoiceKey(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W6001DocInvoiceDomain> searchFileIdByParentInvoiceKey(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (List<W6001DocInvoiceDomain>)getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchFileIdByParentInvoiceKey", criteria);
    }
    // UT186 ZIP DOWNLOAD MOD END

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchUploadedCountByFileName(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public int searchUploadedCountByFileName(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer)getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchUploadedCountByFileName", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchNextInvoiceBySameParent(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public W6001DocInvoiceDomain searchNextInvoiceBySameParent(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (W6001DocInvoiceDomain)getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchNextInvoiceBySameParent", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTmInvTplShipToReacquisition(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocDomain> searchTmInvTplShipToReacquisition(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTmInvTplShipToReacquisition", criteria);
    }

    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTmInvTplShipToReacquisition(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocDomain searchTmInvTplShipToReacquisitionForDefault(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTmInvTplShipToReacquisitionForDefault", criteria);
    }
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvByRegisterInit(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocInvoiceDomain> searchTwInvByRegisterInit(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvByRegisterInit", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTmInvTplShipTo(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocDomain> searchTmInvTplShipTo(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTmInvTplShipTo", criteria);
    }

    // 2015/1/19 DNJP.Kawamura UT011対応 START >>>>>
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTmInvTplShipToForDefault(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocDomain searchTmInvTplShipToForDefault(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTmInvTplShipToForDefault", criteria);
    }
    // 2015/1/19 DNJP.Kawamura UT011対応 END <<<<<

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByConsignee(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByConsignee(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByConsignee", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByShipper(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByShipper(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByShipper", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByRegister(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByRegister", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByUploadInit(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByUploadInit(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByUploadInit", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByOperationNo(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByOperationNo (W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByOperationNo", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByOperationNoTypA(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByOperationNoTypA(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByOperationNoTypA", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByOperationNoTypB(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByOperationNoTypB(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByOperationNoTypB", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByOperationNoTypZ(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByOperationNoTypZ(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByOperationNoTypZ", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByShipperCd(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByShipperCd(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByShipperCd", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByGropingInfo(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByGropingInfo(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByGropingInfo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTmPkgMtrl(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzItemDomain> searchTmPkgMtrl(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzItemDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTmPkgMtrl", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByGroupNo1(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByGroupNo1(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByGroupNo1", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzBySearchInvoice(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzBySearchInvoice(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzBySearchInvoice", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvItemByGroupNo2(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByGroupNo2(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzItemDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvItemByGroupNo2", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByGroup(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByGroup(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByGroup", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceAttached(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocInvoiceDomain> searchTtInvoiceAttached(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTtInvoiceAttached", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByHeaderRegister", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtPltzByRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTtPltzByRegister(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTtPltzByRegister", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtPltzItemOdr(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzItemOdrDomain> searchTtPltzItemOdr(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocPltzItemOdrDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTtPltzItemOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvByFree(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocDomain searchTwInvByFree(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTwInvByFree", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvoiceByRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTwInvoiceByRegister(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTwInvoiceByRegister", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByContainerNo(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> searchTwInvPltzByContainerNo(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzByContainerNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTmExpShipToShipping(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocPltzItemDomain searchTmExpShipToShipping(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocPltzItemDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTmExpShipToShipping", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#lockByNoWaitTtPltz(W6001DocCriteriaDomain)
     */
    // ST944 MOD result type:W6001DocPltzDomain→List<W6001DocPltzDomain>
    @SuppressWarnings("unchecked")
    public List<W6001DocPltzDomain> lockByNoWaitTtPltz(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.LockByNoWaitTtPltz", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtPltz(W6001DocCriteriaDomain)
     */
    // ST944 MOD result type:W6001DocPltzDomain→List<W6001DocPltzDomain>
    @SuppressWarnings("unchecked")
    public List<W6001DocInvoiceDomain> searchTtPltz(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTtPltz", criteria);
    }

// Deleted because of no use.
// 使用なしのため削除。
//    /**
//     * {@inheritDoc}
//     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtPltzByRegisterCancel(W6001DocCriteriaDomain)
//     */
//    @SuppressWarnings("unchecked")
//    public W6001DocPltzDomain searchTtPltzByRegisterCancel(W6001DocCriteriaDomain criteria)
//        throws  ApplicationException {
//        return (W6001DocPltzDomain) getSqlMapClientTemplate()
//            .queryForObject("W6001Doc.SearchTtPltzByRegisterCancel", criteria);
//    }
//
//    /**
//     * {@inheritDoc}
//     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtPltzItemOdrByRegisterCancel(W6001DocCriteriaDomain)
//     */
//    @SuppressWarnings("unchecked")
//    public W6001DocPltzItemOdrDomain searchTtPltzItemOdrByRegisterCancel(W6001DocCriteriaDomain criteria)
//        throws  ApplicationException {
//        return (W6001DocPltzItemOdrDomain) getSqlMapClientTemplate()
//            .queryForObject("W6001Doc.SearchTtPltzItemOdrByRegisterCancel", criteria);
//    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByHeaderCancel(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByHeaderCancel(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByHeaderCancel", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByCancelInv(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocInvoiceDomain> searchTtInvoiceByCancelInv(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<? extends W6001DocInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTtInvoiceByCancelInv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByNonDnGInvOrReInv(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByNonDnGInvOrReInv(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByNonDnGInvOrReInv", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByUploadRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByUploadRegister(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByUploadRegister", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvItemByNecessityEnforcement(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchTwInvItemByNecessityEnforcement(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTwInvItemByNecessityEnforcement", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzByCigmaCheck(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchTwInvPltzByCigmaCheck(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTwInvPltzByCigmaCheck", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTwInvByTempInvoiceNo(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int searchCountTwInvByTempInvoiceNo(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTwInvByTempInvoiceNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#updateClearPriceByTwInvItem(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public int updateClearPriceByTwInvItem(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().update("W6001Doc.UpdateClearPriceByTwInvItem", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#lockByNoWaitTtPltzByPltzStatus(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzDomain> lockByNoWaitTtPltzByPltzStatus(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.LockByNoWaitTtPltzByPltzStatus", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#updateTtPltzByPltzStatus(W6001DocCriteriaDomain)
     */
    public int updateTtPltzByPltzStatus(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().update("W6001Doc.UpdateTtPltzByPltzStatus", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#updateTtInvoiceByKey(W6001DocCriteriaDomain)
     */
    public int updateTtInvoiceByKey(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().update("W6001Doc.UpdateTtInvoiceByKey", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#updateTtInvoiceHeaderByKey(W6001DocCriteriaDomain)
     */
    public int updateTtInvoiceHeaderByKey(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().update("W6001Doc.UpdateTtInvoiceHeaderByKey", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#updateTwInvItemOnInvoiceDetailForClear(W6001DocCriteriaDomain)
     */
    public int updateTwInvItemOnInvoiceDetailForClear(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return getSqlMapClientTemplate().update("W6001Doc.UpdateTwInvItemOnInvoiceDetailForClear", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTwInvItemBySortNo(W6001DocCriteriaDomain)
     */
    public int searchCountTwInvItemBySortNo(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTwInvItemBySortNo", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchCountTwInvItemByRemoveSortNo(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByRemoveGrpNo2(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends W6001DocPltzItemDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvItemByRemoveGrpNo2", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvItemByInvoiceAttached(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByInvoiceAttached(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends W6001DocPltzItemDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvItemByInvoiceAttached", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvItemByPackingAttachedItem(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocPltzItemDomain> searchTwInvItemByPackingAttachedItem(W6001DocCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends W6001DocPltzItemDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvItemByPackingAttachedItem", criteria);
    }
    
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 START >>>>>
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceByHeaderRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public W6001DocInvoiceDomain searchTtInvoiceByEDT46PRRegister(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (W6001DocInvoiceDomain) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchTtInvoiceByHeaderRegister", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceAttachedByEDT47PRRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocInvoiceDomain> searchTtInvoiceAttachedByEDT47PRRegister(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTtInvoiceAttachedByEDT47PRRegister", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTtInvoiceAttachedByEDT45PRRegister(W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W6001DocInvoiceDomain> searchTtInvoiceAttachedByEDT45PRRegister(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (List<W6001DocInvoiceDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTtInvoiceAttachedByEDT45PRRegister", criteria);
    }
    // 2014/09/01 DNJP.Kawamura (DIAT)InvoiceDB対応 END <<<<<
    
    // 2014/11/25 DNJP.Kawamura UT149,ST180対応 START >>>>>
    /**
    * {@inheritDoc}
    * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#SearchCountTwInvItemByCurrencyCheckInvoice(W6001DocCriteriaDomain)
    */
    @SuppressWarnings("unchecked")
    public int searchCountTwInvItemByCurrencyCheckInvoice(W6001DocCriteriaDomain criteria)
        throws  ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SearchCountTwInvItemByCurrencyCheckInvoice", criteria);
    }
   // 2014/11/25 DNJP.Kawamura UT149,ST180対応 END <<<<<

    /**
     * {@inheritDoc}
     * 
     * ST959 UNIT CONVERSION ADD
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchTwInvPltzOnRegisterByWorkPhase(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<W6001DocPltzDomain> searchTwInvPltzOnRegisterByWorkPhase(
        W6001DocCriteriaDomain criteria) throws ApplicationException {
        return (List<W6001DocPltzDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchTwInvPltzOnRegisterByWorkPhase", criteria);
    }

    /**
     * {@inheritDoc}
     * 
     * UT205 CML ATTACH CSV ADD
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#searchForCreateCmlAttachCsvFile(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<F6051CmlAtchFileDomain> searchForCreateCmlAttachCsvFile(
        W6001DocCriteriaDomain criteria) throws ApplicationException {
        return (List<F6051CmlAtchFileDomain>) getSqlMapClientTemplate()
            .queryForList("W6001Doc.SearchForCreateCmlAttachCsvFile", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * UT284 ADD
     *
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#updateTwInvItemBySearchForTradeTermsRevice(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public void updateTwInvItemBySearchForTradeTermsRevice(
        W6001DocCriteriaDomain criteria) throws ApplicationException {
        getSqlMapClientTemplate().update("W6001Doc.UpdateTwInvItemBySearchForTradeTermsRevice", criteria);
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.W6001DocDao#serchPackingSummaryAtchFlg(com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain)
     */
    public String serchPackingSummaryAtchFlg(W6001DocCriteriaDomain criteria) throws ApplicationException {
        return (String)getSqlMapClientTemplate()
            .queryForObject("W6001Doc.SerchPackingSummaryAtchFlg", criteria);
    }

}