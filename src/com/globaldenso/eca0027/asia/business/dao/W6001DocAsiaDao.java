/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.asia.business.dao;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W6001DocDao;
import com.globaldenso.eca0027.core.business.domain.W6001DocInvoiceDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W6001DocCriteriaDomain;

/**
 * DAO interface of Documentation.
 * <br />DocumentationのDAOインタフェースです。
 * <pre>
 * bean id: W6001DocDao
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12132 $
 */
public interface W6001DocAsiaDao extends W6001DocDao {

    /**
     * Get information to pass to the Web service corresponding to the search condition (header part).
     * <br />検索条件に該当するWebサービスに渡す情報(ヘッダ部分）を取得します。
     * <pre>
     * - Search information to be passed to the Web service (header part) 
     *   to get the following data corresponding to the search criteria. 
     *   - Invoice 
     *   - Invoice Header 
     *   - CIGMA Environment Master 
     *   - NEXUS Company Master
     *
     * ※ If search result has exceeded the search limit or the number of 0 Listings , to throw GscmApplicationException. 
     *
     *
     * - return of the search results
     * </pre>
     * <pre>
     * - Webサービスに渡す情報(ヘッダ部分）の検索
     *     検索条件に該当する下記のデータを取得する
     *       - インボイス
     *       - インボイスヘッダ
     *       - CIGMA環境原単位
     *       - NEXUS会社原単位
     *
     *     ※検索結果が0件または検索上限数を超えた場合、GscmApplicationExceptionをスローする
     *     
     *     
     * - 検索結果の返却
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException if (header part) is unable to obtain information to be passed to the Web service.<br />Webサービスに渡す情報(ヘッダ部分）が取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByHeaderRegisterAsia(W6001DocCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get information to pass to the Web service corresponding to the search condition (EDT46PR).
     * <br />検索条件に該当するWebサービスに渡す情報(EDT46PR）を取得します。
     * <pre>
     * - same searchTtInvoiceByHeaderRegister
     * </pre>
     * <pre>
     * - searchTtInvoiceByHeaderRegisterと同じ
     * </pre>
     * 
     * @param criteria search conditions<br />検索条件
     * @return list of {@link W6001DocInvoiceDomain}
     * @throws ApplicationException if (header part) is unable to obtain information to be passed to the Web service.<br />Webサービスに渡す情報(ヘッダ部分）が取得できない場合
     */
    public W6001DocInvoiceDomain searchTtInvoiceByEDT46PRRegisterAsia(W6001DocCriteriaDomain criteria)
        throws ApplicationException;
    
}
