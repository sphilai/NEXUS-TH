/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L1008TtPltzItemByDetailDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpShipToShippingDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpShipToShippingCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.L2001TtPltzInstrItemNoBySumBoxQtyDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzBySingleDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzItemByDetailDomain;
import com.globaldenso.eca0027.core.business.domain.L2003TtPltzItemByItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L1008TtPltzItemByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzBySingleCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByDetailCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2003TtPltzItemByItemNoCriteriaDomain;

/**
 * <br />L2000番台の帳票を作成するときに使用するDAOのインターフェースです。
 * <pre>
 * bean id:rpEisProductDao
 * </pre>
 * 
 * @author $Author: 400616000407 $
 * @version $Revision: 12983 $
 */
public interface RpEisProductDao {

    /**
     * <br />梱包指示品番の箱数・ネット総重量 を 梱包指示NO・品目番号・包装区分 単位にサマリした件数を取得します。
     * <pre>
     * - 梱包指示品番を検索
     *     criteriaDomainを引数に、{@link RpEisProductDao#searchTtPltzInstrItemNoBySumBoxQty(L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 検索結果を返却
     * </pre>
     *
     * @param criteria L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain
     * @return TtPltzInstrItemNoBySumBoxQtyDomain
     * @throws ApplicationException application exception
     */
    List<L2001TtPltzInstrItemNoBySumBoxQtyDomain> searchTtPltzInstrItemNoBySumBoxQty(L2001TtPltzInstrItemNoBySumBoxQtyCriteriaDomain criteria) throws ApplicationException;

    /**
     * <br />パレタイズ対象品のメインマーク、メインマークに含まれる品目番号の種類のカウントを取得します。
     * <pre>
     * - パレタイズを検索
     *     criteriaDomainを引数に、{@link RpEisProductDao#searchTtPltzItemByItemNo(L2003TtPltzItemByItemNoCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 検索結果を返却
     * </pre>
     *
     * @param criteria L2003TtPltzItemByItemNoCriteriaDomain
     * @return TtPltzItemByPltzInstrNoDomain
     * @throws ApplicationException application exception
     */
    List<L2003TtPltzItemByItemNoDomain> searchTtPltzItemByItemNo(L2003TtPltzItemByItemNoCriteriaDomain criteria) throws ApplicationException;

    /**
     * <br />パレタイズのヘッダー情報の取得（単品）を取得します。
     * <pre>
     * - パレタイズを検索
     *     criteriaDomainを引数に、{@link RpEisProductDao#searchTtPltzBySingle(L2003TtPltzBySingleCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 検索結果を返却
     * </pre>
     *
     * @param criteria L2003TtPltzBySingleCriteriaDomain
     * @return TtPltzBySingleDomain
     * @throws ApplicationException application exception
     */
    List<L2003TtPltzBySingleDomain> searchTtPltzBySingle(L2003TtPltzBySingleCriteriaDomain criteria) throws ApplicationException;

    /**
     * <br />明細情報を取得します。
     * <pre>
     * - パレタイズを検索
     *     criteriaDomainを引数に、{@link RpEisProductDao#searchTtPltzItemByDetail(L2003TtPltzItemByDetailCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 検索結果を返却
     * </pre>
     *
     * @param criteria L2003TtPltzItemByDetailCriteriaDomain
     * @return TtPltzItemByDetailDomain
     * @throws ApplicationException application exception
     */
    List<L2003TtPltzItemByDetailDomain> searchTtPltzItemByDetail(L2003TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException;

	// NL012 DEL START
	//     // A.Chonthicha: Total number of box
	//     /**
	//      * <br />Total number of box
	//      * <pre>
	//      * Get the summary of TAG_QTY
	//      * </pre>
	//      *
	//      * @param criteria L2003TtPltzItemByDetailCriteriaDomain
	//      * @return sumNoOfBox
	//      * @throws ApplicationException application exception
	//      */
	//     int searchTtPltzItemForTotalNoOfBox(L2003TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException;
	//
	//     // NL009 MERGE START
	//     // A.Chonthicha: Total number of box for manual registration
	//     /**
	//      * <br />Total number of box for manual registration
	//      * <pre>
	//      * Get the summary of TAG_QTY
	//      * </pre>
	//      *
	//      * @param criteria L2003TtPltzItemByDetailCriteriaDomain
	//      * @return sumNoOfBox
	//      * @throws ApplicationException application exception
	//      */
	//     int searchTtPltzItemForTotalNoOfBoxOfManualRegist(L2003TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException;
	//     // NL009 MERGE END
	// NL012 DEL END
    
	// NL047 ADD START
    /**
     * Search for one valid record from TM_EXP_SHIP_TO_SHIPPING.
     * <br />TM_EXP_SHIP_TO_SHIPPINGから有効レコードを1件検索する。
     *  
     * @param criteria search condition/検索条件
     * @return search result/検索結果
     * @throws ApplicationException application exception/アプリケーション例外
     */
    public TmExpShipToShippingDomain searchExpShipToShippingMa(TmExpShipToShippingCriteriaDomain criteria)
        throws ApplicationException;
    // NL047 ADD END
    
    /**
     * <br />明細情報を取得します。
     * <pre>
     * - パレタイズを検索
     *     criteriaDomainを引数に、{@link RpEisProductDao#searchTtPltzItemL1008ByDetail(L1008TtPltzItemByDetailCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 検索結果を返却
     * </pre>
     *
     * @param criteria L1008TtPltzItemByDetailCriteriaDomain
     * @return TtPltzItemByDetailDomain
     * @throws ApplicationException application exception
     */
    List<L1008TtPltzItemByDetailDomain> searchTtPltzItemL1008ByDetail(L1008TtPltzItemByDetailCriteriaDomain criteria) throws ApplicationException;
    /**
     * <br />パレタイズのヘッダー情報の取得（単品）を取得します。
     * <pre>
     * - パレタイズを検索
     *     criteriaDomainを引数に、{@link RpEisProductDao#searchTtPltzL1008BySingle(L2003TtPltzBySingleCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 検索結果を返却
     * </pre>
     *
     * @param criteria L2003TtPltzBySingleCriteriaDomain
     * @return TtPltzBySingleDomain
     * @throws ApplicationException application exception
     */
    List<L2003TtPltzBySingleDomain> searchTtPltzL1008BySingle(L2003TtPltzBySingleCriteriaDomain criteria) throws ApplicationException;
    /**
     * <br />パレタイズ対象品のメインマーク、メインマークに含まれる品目番号の種類のカウントを取得します。
     * <pre>
     * - パレタイズを検索
     *     criteriaDomainを引数に、{@link RpEisProductDao#SearchTtPltzItemW1008ByPltzInstrNo(L2003TtPltzItemByItemNoCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 検索結果を返却
     * </pre>
     *
     * @param criteria L2003TtPltzItemByItemNoCriteriaDomain
     * @return TtPltzItemByPltzInstrNoDomain
     * @throws ApplicationException application exception
     */
    List<L2003TtPltzItemByItemNoDomain> searchTtPltzItemW1008ByPltzInstrNo(L2003TtPltzItemByItemNoCriteriaDomain criteria) throws ApplicationException;
}
