/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RpShippingFirmDao;
import com.globaldenso.eca0027.core.business.domain.L5001InvoiceDomain;


/**
 * The DAO implementation class to use for creating the form of L5001.<br />
 * L5001の帳票作成時に使用するDAO実装クラスです。
 *
 * @version $Revision: 12922 $
 */
public class RpShippingFirmDaoImpl extends SqlMapClientDaoSupport implements RpShippingFirmDao {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public RpShippingFirmDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpShippingFirmDao#searchStgNoByShiipingFirmNo(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<String> searchStgNoByShiipingFirmNo(String shippingFirmNo) throws ApplicationException {
        return (List<String>)getSqlMapClientTemplate()
            .queryForList("RpShippingFirm.searchStgNoByShiipingFirmNo", shippingFirmNo);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpShippingFirmDao#searchInvoiceByShiipingFirmNo(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    public List<? extends L5001InvoiceDomain> searchInvoiceByShiipingFirmNo(String shippingFirmNo) throws ApplicationException {
        return (List<? extends L5001InvoiceDomain>)getSqlMapClientTemplate()
            .queryForList("RpShippingFirm.SearchInvoiceByShiipingFirmNo", shippingFirmNo);
    }
}
