/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L5001InvoiceDomain;

/**
 * The DAO interface when creating a form of L5000 series.
 * </br>L5000番台の帳票を作成するときに使用するDAOのインターフェースです。
 * 
 * <pre>
 * bean id:rpShippingFirmDao
 * </pre>
 * 
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 12922 $
 */
public interface RpShippingFirmDao {

    /**
     * Search the Staging actuality No that output to L5001 report
     * </br>L5001出荷確認帳票に出力する山作り実績Noを検索する。
     *
     * @param shippingFirmNo shippig confirmation No./出荷確認No.
     * @return list of staging instruction No./荷揃え指示No.のリスト
     * @throws ApplicationException application exception/業務例外
     */
    List<String> searchStgNoByShiipingFirmNo(String shippingFirmNo) throws ApplicationException;

    /**
     * Search L5001 detail data that invoice unit
     * </br>L5001出荷確認帳票に出力するインボイス単位の明細データを検索する。
     *
     * @param shippingFirmNo shippig confirmation No./出荷確認No.
     * @return detail list of invoice unit/インボイス単位の明細リスト
     * @throws ApplicationException application exception/業務例外
     */
    List<? extends L5001InvoiceDomain> searchInvoiceByShiipingFirmNo(String shippingFirmNo) throws ApplicationException;
}
