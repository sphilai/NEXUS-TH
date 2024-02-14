/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L6003TtInvoiceAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6003TtScAttachedBySumQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L6008TtPackingAttachedByHeaderAndDetailDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtInvoiceAttachedBySumQtyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6003TtScAttachedBySumQtyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain;

/**
 * The DAO interface for creating a form of L6000 series.
 * <br />L6000番台の帳票を作成するときに使用するDAOのインターフェースです。
 * <pre>
 * bean id:rpDocDao
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public interface RpDocDao {

    /**
     * Get the Invoice Attached items.
     * <br />インボイスアタッチ の各項目を取得します。
     * <pre>
     * - Search The Invoice Attached
     *   an argument criteriaDomain, call the searchTtInvoiceAttachedBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - To return the data retrieved
     * </pre>
     * <pre>
     * - インボイスアタッチを検索
     *     criteriaDomainを引数に、{@link RpDocDao#searchTtInvoiceAttachedBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 取得したデータを返却
     * </pre>
     *
     * @param criteria L6003TtInvoiceAttachedBySumQtyCriteriaDomain 
     * @return List<L6003TtInvoiceAttachedBySumQtyDomain>
     * @throws ApplicationException application exception
     */
    List<L6003TtInvoiceAttachedBySumQtyDomain> searchTtInvoiceAttachedBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Get each item Invoice, Packing Header, Packing Attached CML, of Packing Attached Item No.
     * <br />インボイス、パッキングヘッダ、パッキングアタッチ_CML、パッキングアタッチ_品目番号の各項目を取得します。
     * <pre>
     * - Search by binding Invoice, Packing Header, Packing Attached CML, the Packing Attached Item No
     *   an argument criteriaDomain, call RpDocDao # searchPackingAttachedMainInfo(L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - To return the data retrieved
     * </pre>
     * <pre>
     * - インボイス、パッキングヘッダ、パッキングアタッチ_CML、パッキングアタッチ_品目番号 を結合して検索
     *    criteriaDomainを引数に、{@link RpDocDao#searchPackAtchedForMain(L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain)}を呼び出し、
     *    取得件数が0であれば、エラーとします。
     *    
     * - 取得したデータを返却
     * </pre>
     *
     * @param criteria L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain 
     * @return List<L6008TtPackingAttachedByHeaderAndDetailDomain>
     * @throws ApplicationException application exception
     */
    List<L6008TtPackingAttachedByHeaderAndDetailDomain> searchPackAtchedForMain(L6008TtPackingAttachedByHeaderAndDetailCriteriaDomain criteria) throws ApplicationException;

    /**
     * Get the Sales Contract Attached items.
     * <br />セールスコントラクトアタッチの各項目を取得します。
     * <pre>
     * - Search Sales Contract Attached
     *   an argument criteriaDomain, call the searchTtScAttachedBySumQty(L6003TtScAttachedBySumQtyCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - Return the data retrieved.
     * </pre>
     * <pre>
     * - セールスコントラクトアタッチを検索
     *     criteriaDomainを引数に、{@link RpDocDao#searchTtScAttachedBySumQty(L6003TtScAttachedBySumQtyCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 取得したデータを返却
     * </pre>
     *
     * @param criteria L6003TtScAttachedBySumQtyCriteriaDomain 
     * @return List<L6003TtScAttachedBySumQtyDomain>
     * @throws ApplicationException application exception
     */
    List<L6003TtScAttachedBySumQtyDomain> searchTtScAttachedBySumQty(L6003TtScAttachedBySumQtyCriteriaDomain criteria) throws ApplicationException;

    // 2015/3/11 DNJP.Kawamura UT202対応 START >>>>>
    /**
     * Get the Packing Attached items.
     * <br />パッキングアタッチ品番 の数量、数量単位を取得します。
     * <pre>
     * - Search The Packing Attached
     *   an argument criteriaDomain, call the searchTtPackingAttachedItemBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - To return the data retrieved
     * </pre>
     * <pre>
     * - パッキングアタッチ品番を検索
     *     criteriaDomainを引数に、{@link RpDocDao#searchTtPackingAttachedItemBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 取得したデータを返却
     * </pre>
     *
     * @param criteria L6003TtInvoiceAttachedBySumQtyCriteriaDomain 
     * @return List<L6003TtInvoiceAttachedBySumQtyDomain>
     * @throws ApplicationException application exception
     */
    List<L6003TtInvoiceAttachedBySumQtyDomain> searchTtPackingAttachedItemBySumQty(L6003TtInvoiceAttachedBySumQtyCriteriaDomain criteria) throws ApplicationException;
    // 2015/3/11 DNJP.Kawamura UT202対応 END <<<<<
    
}
