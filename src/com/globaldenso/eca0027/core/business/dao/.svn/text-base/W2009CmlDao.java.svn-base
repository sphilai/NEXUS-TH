/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2009CmlPltzItemOdrDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2009CmlCriteriaDomain;

/**
 * The DAO interface of CML.
 * <br />CMLのDAOインタフェースです。
 * 
 * <pre>
 * bean id: w2009CMLDao
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public interface W2009CmlDao {

    /**
     * Delete the record of a Packing material from a Palletize-Item table for a MAIN MARK to a key.
     * <br />メインマークをキーにパレタイズ対象品テーブルから包装材のレコードを削除する。
     * <pre>
     * - In the inside of the Palletize Item applicable to the specified MAIN MARK,
     *     PKG_TYP deletes the thing of null as a Packing material.
     * 
     * - 指定したメインマークに該当するパレタイズ対象品の中で、
     *   PKG_TYP が null のものを、包装材として削除する。
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return Delete number<br />削除件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int deleteTtPltzItemOnTransReviseRegister(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Lock the Palletize Instruction Receive Order applicable to a search condition, and return search results.
     * <br />検索条件に該当する梱包指示品目番号受注情報をロックし、検索結果を返す。
     * <pre>
     * - When the lock is already acquired, an exception occurs.
     * 
     * - 既にロックが取得されている場合、例外が発生する。
     * </pre>
     * 
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return List of {@link TtPltzInstrOdrDomain}<br />{@link TtPltzInstrOdrDomain}のリスト
     * @throws ApplicationException When can not get lock<br /> ロックが取得できない場合
     */
    public List<? extends TtPltzInstrOdrDomain> lockTtPltzInstrOrd(
        TtPltzInstrOdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * Lock the Export Receive Order applicable to a search condition, and return search results.
     * <br />検索条件に該当する輸出受注をロックし、検索結果を返却します。
     * <pre>
     * - When the lock is already acquired, an exception occurs.
     * 
     * - 既にロックが取得されている場合、例外が発生する。
     * </pre>
     * 
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return List of {@link TtExpRcvOdrDomain}<br />{@link TtExpRcvOdrDomain}のリスト
     * @throws ApplicationException When can not get lock<br /> ロックが取得できない場合
     */
    public List<? extends TtExpRcvOdrDomain> lockTtExpRcvOdr(
        TtExpRcvOdrCriteriaDomain criteria) throws ApplicationException;

    /**
     * Get the number of packaging specifications
     * <br />包装仕様の件数を取得
     * <pre>
     * - count from PKG Set MA (Detail) and PKG Materials MA
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchCountTmPkgSetDtl
     * 
     * - 包装組み合わせ原単位(明細)、包装材原単位から件数を取得する。
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchCountTmPkgSetDtl を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountTmPkgSetDtl(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Acquisition of the data number (4.3. acquisition of search data)
     * <br />データ件数の取得(4.3.検索データの取得)
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchCountTtPltz
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchCountTtPltz を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountTtPltz(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Acquire the number of a Palletize and a Palletize Item based on optional conditions.
     * <br />任意の条件を元に、パレタイズ、パレタイズ対象品の件数を取得します。
     *
     * <pre>
     * - A Palletize, the search number acquisition of a Palletize Item
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchCountTtPltzByCml
     * - Return of the search number
     * 
     * - パレタイズ、パレタイズ対象品の検索件数取得
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchCountTtPltzByCml を実行する
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountTtPltzByCml(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * The list display number acquisition in the case of having changed from a CML Register screen Main screen
     * <br />CML Register画面 Main画面から遷移してきた場合の一覧表示件数取得
     * <pre>
     *   - Set the criteria to argument, and run sql_id:W2009Cml.SearchCountTtPltzByMainMarkMixTagNo
     *   - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchCountTtPltzByMainMarkMixTagNo を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountTtPltzByMainMarkMixTagNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * The list display number acquisition in the case of having changed from a CML Register screen or CML Create screen
     * <br />CML Register画面 Create画面から遷移してきた場合の一覧表示件数取得
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchCountTwPltzItemItemNoForLimitNumChkOnCreate
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchCountTwPltzItemItemNoForLimitNumChkOnCreate を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountTwPltzItemItemNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Count the Palletize Item Work which corresponds to conditions, for the registration number check.
     * <br />登録件数チェックの為に、条件に該当するパレタイズ対象品ワークをカウントする。
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchCountTwPltzItemItemNoForLimitNumChkOnCreate
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchCountTwPltzItemItemNoForLimitNumChkOnCreate を実行する。
     * <pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountTwPltzItemItemNoForLimitNumChkOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Count the Palletize Item Work which corresponds to conditions, for a single article ITEM-NO check.
     * <br />単品品目番号チェックの為に、条件に該当するパレタイズ対象品ワークをカウントする。
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchCountTwPltzItemItemNoForLimitNumChkOnCreate
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchCountTwPltzItemItemNoForLimitNumChkOnCreate を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountTwPltzItemItemNoForSingleChkOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquire the number of a Packing material from a Palletize-Item table for a MAIN MARK to a key.
     * <br />メインマークをキーにパレタイズ対象品テーブルから包装材の件数を取得する。
     * 
     * <pre>
     * - In the inside of the Palletize Item applicable to the specified MAIN MARK,
     *   PKG_TYP counts the number of cases for the thing of null as a Packing material.
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearhcCountTtPltzItemOnTransReviseRegister
     * 
     * - 指定したメインマークに該当するパレタイズ対象品の中で、
     *   PKG_TYP が null のものを、包装材として件数をカウントする。
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.searhcCountTtPltzItemOnTransReviseRegister を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searhcCountTtPltzItemOnTransReviseRegister(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Acquisition of the data number (4.2. acquisition of search data)  
     * <br />データ件数の取得(4.2.検索データの取得)
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchCountTwPltzItemPkg
     *
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchCountTwPltzItemPkg を実行する
     * <pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchCountTwPltzItemPkg(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * 4.3. Acquisition of search data (in the case of transit from a CML Register screen, and reference mode)  
     * <br/>4.3.検索データの取得(CML Register画面からの遷移  かつ  参照モードの場合)
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchForPagingTtPltz
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchForPagingTtPltz を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML domains<br />CMLドメインのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public W2009CmlDomain searchForPagingTtPltz(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search a Palletize and a Palletize Item based on optional conditions (those with an authority check). 
     * <br />任意の条件を元に、パレタイズ、パレタイズ対象品を検索(権限チェックあり)
     * <pre>
     * - A Palletize and a Palletize Item are searched.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchForPagingTtPltzByCml
     * 
     * - パレタイズ、パレタイズ対象品を検索
     *   引数にcriteriaを設定し、sql id:Cml.SearchForPagingTtPltzByCml を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML domains<br />CMLドメインのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlDomain> searchForPagingTtPltzByCml(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * 4.2. Acquisition of search data (in the case transit from a CML Register screen, and register mode) 
     * <br />4.2.検索データの取得(CML Register画面からの遷移  かつ  登録モードの場合)
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchForPagingTwPltzItemPkg
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchForPagingTwPltzItemPkg を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Itemドメインのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchForPagingTwPltzItemPkg(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquire the information displayed on a CML Create screen (information with a Packaging Instruction).  
     * <br />CML Create画面に表示する情報を取得する(梱包指示ありの情報)
     * <pre>
     * - Acquisition in the acquisition-MIX tag unit of a Palletize Instruction Item No
     *     Mix Tag, 
     *     MIXED ITEM NO, 
     *     Palletize Item Work
     *   UNION ALL
     *   Acquisition of the acquisition-ITEM-NO data of a Palletize Instruction Item No
     *     Export Formality Item No Master,
     *     Export Receive Order,
     *     Export Shipping Item No Special Information Master,
     *     Palletize Item Work,
     *     Temp Stock,
     *     NEXUS Company Master,
     *     PKG Specification MA(Header), 
     *     PKG Specification MA(Detail),
     *     Package Specification Revision Master
     *
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchMixTagItemNoOnCreate
     *   
     * 
     * - 梱包指示品目番号の取得-MIXタグ単位での取得
     *     MIXED現品票、
     *     MIXED品目番号、
     *     パレタイズ対象品ワーク
     *   UNION ALL
     *   梱包指示品目番号の取得-品目番号データの取得
     *     輸出手続品目番号原単位、
     *     輸出受注、
     *     輸出出荷品目番号原単位、
     *     パレタイズ対象品ワーク、
     *     仮在庫、NEXUS会社原単位、
     *     包装仕様原単位（ヘッダ）、
     *     包装仕様原単位（明細）、
     *     包装仕様有効リビジョン原単位
     *   
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchMixTagItemNoOnCreate を実行する
     * 
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchMixTagItemNoOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquire the information on the result ITEM NO displayed on a CML Create screen.(Those with an authority check)
     * <br />CML Create画面に表示する、成行品目番号の情報を取得する。(権限チェックあり)
     * <pre>
     * - Acquisition of a result ITEM NO (those with an authority check)
     *     MIX thing acquisition of a result ITEM NO
     *       Acquisition object
     *         Mix Tag
     *         MIXED ITEM NO
     *         Palletize Item Work
     *     UNION ALL
     *     Acquisition of ITEM-NO data
     *       Acquisition object
     *         Export Formality Item No Master
     *         Export Receive Order
     *         Export Shipping Item No Special Information Master
     *         Palletize Item Work
     *         Temp Stock
     *         NEXUS Company Master
     *         PKG Specification MA(Header)
     *         PKG Specification MA(Detail)
     *         Package Specification Revision Master
     *
     *     Set the criteria to argument, and run sql_id:W2009Cml.SearchNonInstructionItemNoOnCreate
     * 
     * - 成行品目番号の取得(権限チェックあり)
     *   成行品目番号のMIX現品取得
     *     取得対象
     *       MIXED現品票
     *       MIXED品目番号
     *       パレタイズ対象品ワーク
     *     UNION ALL
     *   品目番号データの取得
     *     取得対象
     *       輸出手続品目番号原単位
     *       輸出受注
     *       輸出出荷品目番号原単位
     *       パレタイズ対象品ワーク
     *       仮在庫
     *       NEXUS会社原単位
     *       包装仕様原単位（ヘッダ）
     *       包装仕様原単位（明細）
     *       包装仕様有効リビジョン原単位
     *     
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchNonInstructionItemNoOnCreate を実行する
     * 
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchNonInstructionItemNoOnCreate(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Based on optional condition, this is COUNT about a CIGMA Customer Cross Reference Master and a NEXUS Company Master.
     * <br />任意の条件を元に、NEXUS荷受人クロスリファレンス原単位、NEXUS会社原単位をCOUNT
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTmCigmaCustomerToXref
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmCigmaCustomerToXref を実行する
     * </pre>
     *
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return Consignee<br />荷受人
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String searchTmCigmaCustomerToXref(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Acquire a CIGMA Ship To Cross Reference Master and a NEXUS Ship To Master based on optional condition.
     * <br />任意の条件を元に、NEXUS送荷先クロスリファレンス原単位、NEXUS送荷先原単位を取得
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTmCigmaShipToXref
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmCigmaShipToXref を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return Ship to<br />送荷先
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String searchTmCigmaShipToXref(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search the CIGMA-Warehouse-Cross-Reference-Master, based on optional conditions.(those with an authority check)
     * <br />任意の条件を元に、倉庫クロスリファレンス原単位を検索する(権限チェックあり)
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTmCigmaWhXrefByAuth
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmCigmaWhXrefByAuth を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of PlantCd with authority<br />権限のあるPlantCdのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<String> searchTmCigmaWhXrefByAuth(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search the CIGMA Warehouse Cross Reference Master, based on optional conditions.(those with an authority check)
     * <br />任意の条件を元に、倉庫クロスリファレンス原単位を検索する(権限チェックあり)
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTmCigmaWhXrefByAuthList
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmCigmaWhXrefByAuthList を実行する
     * <pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML domains<br />CMLドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlDomain> searchTmCigmaWhXrefByAuthList(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquisition of search data (in the case of transit from a CML Main Screen) 
     * <br />検索データの取得(CML Main Screen画面からの遷移の場合)
     * <pre>
     * - Search the Palletize and the Measure Unit Master, based on optional conditions. 
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTmMeasureUnit
     *     
     * - 任意の条件を元に、パレタイズ、計量単位原単位を検索する
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmMeasureUnit を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return  CML domain<br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public W2009CmlDomain searchTmMeasureUnit(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search the packing combination master (details) and the PKG Materials MA.
     * <br />包装組合せ原単位（明細）、包装材原単位を検索
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTmMeasureUnit
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmPkgSetDtl を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメインのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTmPkgSetDtl(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Search the volume-volume unit by ITEM NO
     * <br />品目番号を条件にして、容積・容積単位を検索する
     * <pre>
     * - Search from NEXUS Company Master, PKG Specification MA(Detail), and Package Specification Revision Master.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTmPkgSpecificationDtl
     * 
     * - NEXUS会社原単位、包装仕様原単位（明細）、包装仕様有効リビジョン原単から検索する
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmPkgSpecificationDtl を実行する
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML domains<br />CMLドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlDomain> searchTmPkgSpecificationDtl(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * On a CML Register screen, this is called and acquire a packing specification from PkgMaterial action.
     * (When the time of a convert and a single-palletize lot crack have not occurred)
     * <br />CML Register画面でPkgMaterialアクションから、呼ばれ包装仕様を取得する。(編集時、かつ単品パレタイズロット割れが発生していない場合)
     * <pre>
     * - Search from NEXUS Company Master, PKG Specification MA(Detail), Package Specification Revision Master, PKG Materials MA, and Palletize Item Work.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTmPkgSpecificationDtlByAuto
     * 
     * - NEXUS会社原単位、包装仕様原単位（明細）、包装仕様有効リビジョン原単位、包装材原単位、パレタイズ対象品ワークから検索する
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmPkgSpecificationDtlByAuto を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTmPkgSpecificationDtlByAuto(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * On a CML Register screen, this is called and acquire a packing specification from PkgMaterial action.
     * <br />CML Register画面でPkgMaterialアクションから、呼ばれ包装仕様を取得する。
     * <pre>
     * - Search from NEXUS Company Master, PKG Specification MA(Detail), Package Specification Revision Master, PKG Materials MA, and Palletize Item.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTmPkgSpecificationDtlByInner
     * 
     * - NEXUS会社原単位、包装仕様原単位（明細）、包装仕様有効リビジョン原単位、包装材原単位、パレタイズ対象品ワークから検索する。
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTmPkgSpecificationDtlByInner を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTmPkgSpecificationDtlByInner(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Search MIXED ITEM NO based on an optional condition (those with an authority check).  
     * <br />任意の条件を元に、MIXED品目番号を検索(権限チェックあり)
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.searchTtMixtagItemNo
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtMixtagItemNo を実行する
     * <pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTtMixtagItemNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Search Mix Tag RT and a Palletize Item Work based on optional condition.
     * <br />任意の条件を元に、MIXED用RT材、パレタイズ対象品ワークを検索
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTtMixtagRt
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtMixtagRt を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTtMixtagRt(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquire the data for a reference of a CML Register screen.
     * <br />CML Register画面の参照用データを取得
     * <pre>
     * - Data acquisition for a reference (those with an authority check)
     *   Search data (for reference)-MIX tag data from
     *       Palletize 
     *       Palletize Item
     *       Measure Unit Master are searched.
     *   UNION ALL
     *   Search data (for reference)-ITEM-NO data from
     *       Palletize
     *       Palletize Item
     *       Measure Unit Master
     *       Palletize Instruction Item No
     *
     *   Set the criteria to argument, and run sql_id:W2009Cml.searchTtPltzByMainMarkMixTagNo
     * 
     * - 参照用データ取得(権限チェックあり)
     *   検索データの取得(参照用データの取得)-MIXタグデータの取得
     *     パレタイズ
     *     パレタイズ対象品
     *     計量単位原単位を検索
     *   UNION ALL
     *   検索データの取得(参照用データの取得)-品目番号データの取得
     *     パレタイズ
     *     パレタイズ対象品
     *     計量単位原単位
     *     梱包指示品目番号
     *   
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzByMainMarkMixTagNo を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML domain<br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public W2009CmlDomain searchTtPltzByMainMarkMixTagNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquisition of the palette No
     * <br />パレットNoの取得
     * <pre>
     * - Search Palletize based on optional condition.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzByPalletNo
     * 
     * - 任意の条件を元に、パレタイズを検索
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzByPalletNo を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return palette No<br />パレットNo
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public String searchTtPltzByPalletNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search Packaging Instruction and CIGMA Warehouse Cross Reference Master (those with an authority check).  
     * <br />梱包指示、倉庫クロスリファレンス原単位を検索(権限チェックあり)
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzInstr
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzInstr を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public W2009CmlDomain searchTtPltzInstr(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Acquisition by the acquisition-unit of ITEM NO of the acquisition (in case of transit from CML Main Screen)-retrieval result data of search data
     * <br />検索データの取得(CML Main Screen画面からの遷移の場合)-検索結果データの取得-品番単位での取得
     * <pre>
     * - Search Palletize Item and Palletize Instruction Item No, based on an optional condition.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzInstrItemNo
     * 
     * - 任意の条件を元に、パレタイズ対象品、梱包指示品番を検索
     *      引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzInstrItemNo を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of CML Item domains<br />CML Item ドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTtPltzInstrItemNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Return the sum total of a packed up number for Palletize Instr. No.
     * <br />梱包指示Noをキーに、梱包済数の合計を返却します。
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzInstrItemNoByPltzInstrNo
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzInstrItemNoByPltzInstrNo を実行する
     * </pre>
     * 
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return The sum total of a packed up number<br />梱包済数の合計
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchTtPltzInstrItemNoByPltzInstrNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Lock a Palletize Instruction Item No based on pltzInstrNo
     * <br />pltzInstrNoを元に、梱包指示品目番号をロック
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzInstrItemNoLockBypltzInstrNoNowait
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.searchTtPltzInstrItemNoLockBypltzInstrNoNowait を実行する
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of Palletize Instruction Item No<br />梱包指示品目番号のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<String> searchTtPltzInstrItemNoLockBypltzInstrNoNowait(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquisition by the acquisition-unit of ITEM NO of the acquisition (from CML Main Screen ) - retrieval result data of search data
     * <br />検索データの取得(CML Main Screen画面からの遷移の場合)-検索結果データの取得-品番単位での取得
     * <pre>
     * - Search on Palletize Item and a Palletize Instruction Item No , based on an optional condition.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzInstrItemNoTransPkg
     *
     * - 任意の条件を元に、パレタイズ対象品、梱包指示品番を検索
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzInstrItemNoTransPkg を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return CmlItem domain List<br />CmlItemドメイン のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTtPltzInstrItemNoTransPkg(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquisition of maximum BRANCH for updating of Palletize-Item data (Packing material)
     * <br />パレタイズ対象品データ（包装材）更新-枝番の取得
     * <pre>
     * - Search maximum BRANCH from Palletize Item, based on an optional condition.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzItemByBrch
     *
     * - 任意の条件を元に、パレタイズ対象品からmax(BRCH)を取得
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzItemByBrch を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The maximum of the BRANCH of a Palletize Item<br />パレタイズ対象品の枝番の最大値
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public BigDecimal searchTtPltzItemByBrch(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search Palletize Item with MAIN MARK as a search key.
     * <br />メインマークをキーに、パレタイズ対象品を取得します。
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzItemByMainMark
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzItemByMainMark を実行する
     * </pre>
     * 
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return list of {@link W2009CmlItemDomain}<br />{@link W2009CmlItemDomain}のリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTtPltzItemByMainMark(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Lock Palletize Item with MAIN MARK as a search key.
     * <br />MainMarkを元に、パレタイズ対象品をロック 
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzInstrItemNoLockBypltzInstrNoNowait
     *
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzItemLockByMainMarkNowait を実行する
     * </pre>
     * 
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return The list of MAIN MARKs<br />メインマークのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<String> searchTtPltzItemLockByMainMarkNowait(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Search Palletize Item and  Palletize Item Receive Order, based on an optional condition.
     * <br />任意の条件を元に、パレタイズ対象品、パレタイズ対象品受注情報を検索
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.searchTtPltzItemOdr
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzItemOdr を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return CML domain<br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlPltzItemOdrDomain> searchTtPltzItemOdr(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Acquisition of a DUE DATE
     * <br />納期の取得
     * <pre>
     * - A Palletize Item Receive Order is searched based on an optional condition.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzItemOdrByPalletNo
     *
     * - 任意の条件を元に、パレタイズ対象品受注情報を検索
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzItemOdrByPalletNo を実行する
     * <pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return CML domain<br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public Date searchTtPltzItemOdrByPalletNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get Lo from the postal code by MAIN MARK as a search key.
     * <br />MainMarkを元に、パレタイズ対象品受注情報をロック
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzItemOdrLockByMainMarkNowait
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzItemOdrLockByMainMarkNowait を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return List of MAIN MARKs<br />メインマークのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<String> searchTtPltzItemOdrLockByMainMarkNowait(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Acquire a Packing material from a Palletize-Item table for MainMark and PkgTyp to a key.
     * <br />MainMark と PkgTyp をキーに、パレタイズ対象品テーブルから包装材を取得する。
     * <pre>
     * - When pkgTyp refers to set-up pkgTyp and has not set up pkgTyp
     *   pkgTyp acquires the information which is not null.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzItemOnTransRevise
     * 
     * - pkgTyp が設定されたpkgTypで検索し、pkgTypが未設定の場合は
     *   pkgTyp が null でない情報を取得する。
     *      引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzItemOnTransRevise を実行する
     * </pre>
     *
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of Palletize Items PKG<br />パレタイズ対象品PKGのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTtPltzItemOnTransRevise(W2009CmlCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Lock a Palletize Item KANBAN based on MainMark.
     * <br />MainMarkを元に、パレタイズ対象品かんばん情報をロック
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTtPltzKanbanLockByMainMarkNowait
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTtPltzKanbanLockByMainMarkNowait を実行する
     * </pre>
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return The list of MAIN MARKs <br />メインマークのリスト
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<String> searchTtPltzKanbanLockByMainMarkNowait(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * Acquisition of acquisition / search-results item data of MIX tag data (ITEM NO)  
     * <br />MIXタグデータの取得/検索結果項目データの取得（品目番号）
     * <pre>
     * - Search a Palletize Item Work based on - optional condition.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTwPltzItemItemNo
     * 
     * - 任意の条件を元に、パレタイズ対象品ワークを検索
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTwPltzItemItemNo を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return CML domain<br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlItemDomain> searchTwPltzItemItemNo(
        W2009CmlCriteriaDomain criteria) throws ApplicationException;

    /**
     * The greatest BRANCH acquisition.
     * <br />最大の枝番取得。
     * <pre>
     * - Search Palletize Item Work, based on an optional condition.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTwPltzItemItemNoByBrch
     * 
     * - 任意の条件を元に、パレタイズ対象品ワークを検索
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTwPltzItemItemNoByBrch を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return maximum BRANCH<br /> 最大の枝番
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public BigDecimal searchTwPltzItemItemNoByBrch(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * A setting of N/W
     * <br />N/Wの設定
     * <pre>
     * - Search optional condition after concentration and search a Palletize Item Work to origin.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTwPltzItemItemNoByDscId
     *     
     * - 任意の条件を元に、集約後、パレタイズ対象品ワークを検索
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTwPltzItemItemNoByDscId を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return CML domain<br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlDomain> searchTwPltzItemItemNoByDscId(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Acquire the information on a checked object from a Palletize Item Work.
     * <br />パレタイズ対象品ワークからチェック対象の情報を取得する。
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.SearchTwPltzItemItemNoForChkOnCreate
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.SearchTwPltzItemItemNoForChkOnCreate を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return number<br />件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int searchTwPltzItemItemNoForChkOnCreate(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * A setting of G/W
     * <br />G/Wの設定
     * <pre>
     * - Search optional condition after concentration and search a Palletize Item Package Work to origin.
     *   Set the criteria to argument, and run sql_id:W2009Cml.SearchTwPltzItemPkg
     * 
     * - 任意の条件を元に、集約後、パレタイズ対象品PKGワークを検索
     *   引数にcriteriaを設定し、sql_id: W2009Cml.SearchTwPltzItemPkg を実行する
     * </pre>
     * 
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return CML domain<br />CMLドメイン
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public List<? extends W2009CmlDomain> searchTwPltzItemPkgByDscId(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Update the Status of the Packaging Instruction of the specified Palletize Instruction Item No.
     * <br />指定した梱包指示品目番号の梱包指示のステータスを更新する。
     * <pre>
     * - Set the criteria to argument, and run sql_id:W2009Cml.UpdateTtPltzInstrStatusByPltzInstrNo
     * 
     * - 引数にcriteriaを設定し、sql_id: W2009Cml.UpdateTtPltzInstrStatusByPltzInstrNo を実行する
     * </pre>
     *
     * @param criteria CML search-condition domain<br />CML検索条件ドメイン
     * @return Update number<br />更新件数
     * @throws ApplicationException When an error occurs in processing of DB<br />DBの処理でエラーが発生した場合
     */
    public int updateTtPltzInstrStatusByPltzInstrNo(W2009CmlCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Search processing of Multi Label Register Screen
     * <br />Multi Label Register画面の検索処理
     *
     * <pre>
     * UT304 MULTI LABEL ADD
     * </pre>
     *
     * @param cmlCriteriaDomain 検索条件
     * @return Search Result/検索結果
     * @throws ApplicationException 業務例外
     */
    public W2009CmlDomain searchOnMultiLabelRegister(W2009CmlCriteriaDomain cmlCriteriaDomain)
        throws ApplicationException;

    /**
     * PKG work registration process of the Multi Label Register Screen.
     * <br />Multi Label Register画面のPKGワーク登録処理。
     *
     * <pre>
     * Export in the label part number, since that is determined to one,
     * to register the packaging material in bulk from the packaging specifications.
     * Multi Labelでは品番は1つに決まるため、包装仕様から包装材を一括で登録する。
     *
     * UT304 MULTI LABEL ADD
     * </pre>
     *
     * @param cmlCriteriaDomain 検索条件
     * @throws ApplicationException 業務例外
     */
    public void createTwPltzItemPkgOnMultiLabelRegister(W2009CmlCriteriaDomain cmlCriteriaDomain)
        throws ApplicationException;
}
