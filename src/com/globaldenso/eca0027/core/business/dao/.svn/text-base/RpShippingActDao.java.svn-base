/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
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
 * The DAO interface when creating a form of L7000 series.
 * </br>L7000番台の帳票を作成するときに使用するDAOのインターフェースです。
 * 
 * <pre>
 * bean id:rpShippingActDao
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface RpShippingActDao {

    /**
     * Get the information on the condition of PK than Shipping Actuality.
     * </br>船積実績よりPKを条件に情報を取得します。
     * <pre>
     * - Search by combining Shipping Actuality, Invoice, Port Master, Palletize, a Shipping Confirmation.
     *   # argument to the condition, sql id: Run the SearchClpHeadInfo.
     * 
     * - To return the data that has been acquired
     * </pre>
     * <pre>
     * - 船積実績、インボイス、港原単位、パレタイズ、出荷確認 を結合して検索します。
     *     conditionを引数に、sql id:SearchClpHeadInfoを実行します。
     *     
     * - 取得したデータを返却する
     * </pre>
     *
     * @param condition search condition
     * @return List<TtShippingActByHeaderDomain>
     * @throws ApplicationException application exception
     */
    List<L7001TtShippingActByHeaderDomain> searchTtShippingActByHeader(L7001TtShippingActByHeaderCriteriaDomain condition) throws ApplicationException;

    /**
     * Get the Export number on condition SHIPPING CONFIRM NO than Palletize.
     * </br>パレタイズより出荷確認NOを条件にExport件数を取得します。
     * <pre>
     * - Find the Palletize
     *   # argument to the condition, sql id: Run the SearchTtPltzByHeader.
     * 
     * - And then returns the retrieved data
     * </pre>
     * <pre>
     * - パレタイズを検索します。
     *     conditionを引数に、sql id:SearchTtPltzByHeaderを実行します。
     *     
     * - 取得したデータを返却します。
     * </pre>
     *
     * @param condition search condition
     * @return List<TtPltzByHeaderDomain>
     * @throws ApplicationException application exception
     */
    List<L7001TtPltzByHeaderDomain> searchTtPltzByHeader(L7001TtPltzByHeaderCriteriaDomain condition) throws ApplicationException;

    /**
     * Get the Import number on condition SHIPPING CONFIRM NO than Palletize.
     * </br>パレタイズより出荷確認NOを条件にImport件数を取得します。
     * <pre>
     * - Search by combining Palletize, the NEXUS Ship To Master
     *   # argument to the condition, sql id: Run the SearchTtPltzByImporter.
     * 
     * - And then returns the retrieved data
     * </pre>
     * <pre>
     * - パレタイズ、NEXUS送荷先原単位 を結合して検索します。
     *     conditionを引数に、sql id:SearchTtPltzByImporterを実行します。
     *     
     * - 取得したデータを返却します。
     * </pre>
     *
     * @param condition search condition
     * @return List<TtPltzByImporterDomain>
     * @throws ApplicationException application exception
     */
    List<L7001TtPltzByImporterDomain> searchTtPltzByImporter(L7001TtPltzByImporterCriteriaDomain condition) throws ApplicationException;

    /**
     * Get a number NoOfInvoice on condition SHIPPING CONFIRM NO than Palletize.
     * </br>パレタイズより出荷確認NOを条件にNoOfInvoice件数を取得します。
     * <pre>
     * - Find the Palletize
     *   # argument to the condition, sql id: Run the SearchTtPltzByNoOfInvoice.
     * 
     * - And then returns the retrieved data
     * </pre>
     * <pre>
     * - パレタイズを検索します。
     *     conditionを引数に、sql id:SearchTtPltzByNoOfInvoiceを実行します。
     *     
     * - 取得したデータを返却します。
     * </pre>
     *
     * @param condition search condition
     * @return int
     * @throws ApplicationException application exception
     */
    int searchTtPltzByNoOfInvoice(L7001TtPltzByNoOfInvoiceCriteriaDomain condition) throws ApplicationException;

    /**
     * Get information on conditions SHIPPING CONFIRM NO, INVOICE CLASS, the SHIPPING ACTUALITY NO from Shipping Confirmation.
     * </br>出荷確認より出荷確認NO、インボイス種類、船積実績NO を条件に情報を取得します。
     * <pre>
     * - Search binds Shipping Confirmation, Palletize, Invoice, Staging Actuality, Transportation Type Master, the Shipping Actuality. 
     *   # argument to the condition, sql id: Run the SearchTtShippingFirmByHeader.
     * 
     * - And then returns the retrieved data
     * </pre>
     * <pre>
     * - 出荷確認、パレタイズ、インボイス、山作り実績、輸送手段種別原単位、船積実績 を結合し検索します。
     *     conditionを引数に、sql id:SearchTtShippingFirmByHeaderを実行します。
     *     
     * - 取得したデータを返却します。
     * </pre>
     *
     * @param condition search condition
     * @return List<TtShippingFirmByHeaderDomain>
     * @throws ApplicationException application exception
     */
    List<L7001TtShippingFirmByHeaderDomain> searchTtShippingFirmByHeader(L7001TtShippingFirmByHeaderCriteriaDomain condition) throws ApplicationException;

    /**
     * Get information on the condition SHIPPING CONFIRM NO from Shipping Confirmation.
     * </br>出荷確認より 出荷確認NO を条件に情報を取得します。
     * <pre>
     * - Search binds Shipping Confirmation, Palletize, Invoice, NEXUS Ship To Master, the Shipping Actuality.
     *   # argument to the condition, sql id: Run the SearchTtShippingFirmByDetail.
     * 
     * - And then returns the retrieved data
     * </pre>
     * <pre>
     * - 出荷確認、パレタイズ、インボイス、NEXUS送荷先原単位、船積実績 を結合し検索します。
     *     conditionを引数に、sql id:SearchTtShippingFirmByDetailを実行します。
     *     
     * - 取得したデータを返却します。
     * </pre>
     *
     * @param condition search condition
     * @return List<TtShippingFirmByHeaderDomain>
     * @throws ApplicationException application exception
     */
    List<L7002TtShippingFirmByDetailDomain> searchTtShippingFirmByDetail(L7002TtShippingFirmByDetailCriteriaDomain condition) throws ApplicationException;

}
