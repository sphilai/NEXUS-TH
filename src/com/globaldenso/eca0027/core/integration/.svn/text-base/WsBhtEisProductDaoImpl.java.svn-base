/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao;
import com.globaldenso.eca0027.core.business.domain.Ws2501CmlPrintNumDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501CntShipperCdDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsNonInstDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsNonPltzInstNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoNxsPltzInstNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagItemNoNwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501MixedTagRtGwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501NxsPkgSpecificationDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501OuterSumWeightDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgMaterialsDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSetMaterialsNxsCompNmDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecMaterialsNameRevDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecRevHisDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PltzInstrInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PltzNxsShipToDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501SumCmlWeightForUnitDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmCustomerQrPatternHdrByDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmExpShipToShippingByKeyDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TmNxsWhByXrefDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtMixTagDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemByKanbanDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemDeliveryTimeDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemGwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501TtPltzItemNwDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501UnpackagedItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501CmlPrintNumCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501CntShipperCdCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonInstCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsPltzInstNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagItemNoNwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagRtGwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501NxsPkgSpecificationCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501OuterSumWeightCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgMaterialsCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecMaterialsNameRevCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecRevHisCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PltzInstrInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PltzNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501SumCmlWeightForUnitCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmExpShipToShippingByKeyCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmNxsWhByXrefCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtMixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemByKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemDeliveryTimeCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemGwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemNwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501UnpackagedItemNoCriteriaDomain;

/**
 * This is a DAO implement class of BHT.
 * <br />BHTのDAO実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public class WsBhtEisProductDaoImpl extends SqlMapClientDaoSupport implements WsBhtEisProductDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsBhtEisProductDaoImpl() {
    }


    /**
     * The lock of an Export Receive Order
     * <br />輸出受注のロック
     *
     * <pre>
     * - Lock of an ordering information
     *     An internal variable (details) . MIX TAG FLAG processes to all the data of "N."
     *     A lock is covered so that the others cannot update select data.
     *
     * - 受注情報のロック
     *   内部変数（明細）.MIXタグフラグが"N"のデータ全てに対して処理を行う
     *   選択データを他者が更新出来ないようにロックをかける
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return Ws2501TtExpRcvOdrDomain lock result domain<br />ロック結果ドメイン
     * @throws ApplicationException when lock cannot acquire<br />ロックできない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501TtExpRcvOdrDomain> lockByKeyNoWaitTtExpRcvOdr(Ws2501TtExpRcvOdrCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends Ws2501TtExpRcvOdrDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.LockByKeyNoWaitTtExpRcvOdr", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#lockByConditionNoWaitTtMixTag(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtMixTagCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501TtMixTagDomain> lockByConditionNoWaitTtMixTag(
        Ws2501TtMixTagCriteriaDomain criteria) throws ApplicationException {

        return (List<? extends Ws2501TtMixTagDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.LockByConditionNoWaitTtMixTag", criteria);
    }

    /**
     * The lock of a Palletize Instruction Item No
     * <br />梱包指示品目番号のロック
     *
     * <pre>
     * Cover a lock so that the others cannot update - select data.
     *
     * - 選択データを他者が更新出来ないようにロックをかける
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return TtPltzInstrItemNoDomain lock result domain<br />ロック結果ドメイン
     * @throws ApplicationException when lock cannot acquire<br />ロックできない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtPltzInstrItemNoDomain> lockByKeyNoWaitTtPltzInstrItemNo(TtPltzInstrItemNoCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends TtPltzInstrItemNoDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.LockByKeyNoWaitTtPltzInstrItemNo", criteria);
    }


    /**
     * The lock of a Palletize Instruction Receive Order
     * <br />梱包指示品目番号受注情報のロック
     *
     * <pre>
     * Cover a lock so that the others cannot update - select data.
     * 
     * - 選択データを他者が更新出来ないようにロックをかける
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return TtPltzInstrOdrDomain lock result domain<br />ロック結果ドメイン
     * @throws ApplicationException when lock cannot acquire<br />ロックできない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends TtPltzInstrOdrDomain> lockByKeyNoWaitTtPltzInstrOdr(TtPltzInstrOdrCriteriaDomain criteria)
        throws ApplicationException {
        return (List<? extends TtPltzInstrOdrDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.LockByKeyNoWaitTtPltzInstrOdr", criteria);
    }

    /**
     * Acquisition of printing number of sheets (Palletize   NEXUS Company Master)  
     * <br />印刷枚数の取得（パレタイズ NEXUS会社原単位）
     *
     *
     * <pre>
     * - The printing number of sheets of shipper of a printing object is acquired.
     *
     * - Return of search results
     *     Search results are returned by Integer.
     * 
     * - 印刷対象のshipperの印刷枚数を取得する。
     *
     * - 検索結果の返却
     *   検索結果をIntegerで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return number<br />件数
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    public Ws2501CmlPrintNumDomain searchCmlPrintNum(Ws2501CmlPrintNumCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501CmlPrintNumDomain) getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchCmlPrintNum", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#searchItemNoNxsNonInst(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonInstCriteriaDomain)
     */
    public Ws2501ItemNoNxsNonInstDomain searchItemNoNxsNonInst(Ws2501ItemNoNxsNonInstCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501ItemNoNxsNonInstDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchItemNoNxsNonInst", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#searchItemNoNxsNonInstErrOdr(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonInstCriteriaDomain)
     */
    public Ws2501ItemNoNxsNonInstDomain searchItemNoNxsNonInstErrOdr(Ws2501ItemNoNxsNonInstCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501ItemNoNxsNonInstDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchItemNoNxsNonInstErrOdr", criteria);
    }
    
    /**
     * Acquisition of an ITEM-NO information (NEXUS side information)  
     * <br />品目番号情報の取得（NEXUS側情報）
     *
     *
     * <pre>
     * - Acquisition of an ITEM-NO information (NEXUS side information)  
     *       all the following conditions are fulfilled -- data acquisition is carried out
     *       - It corresponds to the conditions specified from the screen.
     *       - This is contained in the specified page.
     *       - It corresponds to the authority which a login user has.
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501ItemNoNxsDomain}.
     * 
     * - 品目番号情報の取得（NEXUS側情報）
     *     下記の条件をすべて満たすデータ取得する
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     - ログインユーザが持つ権限に該当する
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501ItemNoNxsDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return Packaging Instruction (=Pull)<br />梱包指示
     * @throws ApplicationException When Packaging Instruction (=Pull) cannot acquire<br />梱包指示が取得できない場合
     */
    public Ws2501ItemNoNxsDomain searchItemNoNxs(Ws2501ItemNoNxsCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501ItemNoNxsDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchItemNoNxs", criteria);
    }

    /**
     * Setting of an internal variable (MIX ITEM NO)   (a Mix Tag, MIXED ITEM NO)  
     * <br />内部変数（MIX品目番号）の設定　（MIXED現品票、MIXED品目番号）
     *
     *
     * <pre>
     * Store - MIX ITEM-NO information in an internal variable.
     *     Set-up internal variable (MIX ITEM NO)
     *     This is used as contents of registration of a check and a MIX ITEM NO.
     *     An internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "Y."
     *
     * - Storing of an internal variable (MIX ITEM NO)
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501CmlPrintNumCriteriaDomain}.
     * 
     * - MIX品目番号情報を内部変数に格納する
     *   設定した内部変数（MIX品目番号）は
     *   チェックおよびMIX品目番号の登録内容として使用する
     *   内部変数（明細）.MIXタグフラグが"Y"のデータ全てに対して以下の処理を行う
     *
     * - 内部変数（MIX品目番号）の格納
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501CmlPrintNumCriteriaDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501MixedTagItemDomain> searchMixedTagItem(Ws2501MixedTagItemCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501MixedTagItemDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchMixedTagItem", criteria);
    }

    /**
     * Acquisition of N/W (MIXED ITEM NO)  
     * <br />N/Wの取得（MIXED品目番号）
     *
     *
     * <pre>
     * - MIXED ITEM NO
     *
     * - Converted of a unit
     *       It changes and totals to the WEIGHT UNIT of the shipper who came out of and acquired the acquired VALUE.
     *       About a unit converted, this is BHT common-specifications .xls [a functional specification common:unit converted]. This is referred to.
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501MixedTagItemNoNwDomain}.
     * 
     * - MIXED品目番号
     *
     * - 単位の変換
     *     取得した値をで取得した荷主の重量単位に変換して合計する
     *     単位変換については、BHT共通仕様.xls[機能仕様共通：単位変換] 参照
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501MixedTagItemNoNwDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501MixedTagItemNoNwDomain> searchMixedTagItemNoNw(Ws2501MixedTagItemNoNwCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501MixedTagItemNoNwDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchMixedTagItemNoNw", criteria);
    }

    /**
     * Acquisition of G/W (Mix Tag RT)  
     * <br />G/Wの取得（MIXED用RT材）
     *
     *
     * <pre>
     * - The WEIGHT of a Packing material is acquired and it totals with N/W.
     *
     * - Converted of a unit
     *       It changes and totals to the WEIGHT UNIT of the shipper who acquired the acquired VALUE.
     *       About a unit converted, this is BHT common-specifications .xls [a functional specification common:unit converted]. This is referred to.
     *
     * A calculation of - G/W
     *       G/W = N/W+ The WEIGHT sum total of the computed Packing material
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501MixedTagRtGwDomain}.
     * 
     * - 包装材の重量を取得し、N/Wと合計する
     *
     * - 単位の変換
     *     取得した値を取得した荷主の重量単位に変換して合計する
     *     単位変換については、BHT共通仕様.xls[機能仕様共通：単位変換] 参照
     *
     * - G/Wの算出
     *     G/W = N/W + 算出した包装材の重量合計
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501MixedTagRtGwDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501MixedTagRtGwDomain> searchMixedTagRtGw(Ws2501MixedTagRtGwCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501MixedTagRtGwDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchMixedTagRtGw", criteria);
    }

    /**
     * Acquisition of a Packing material
     * <br />包装材の取得
     *
     *
     * <pre>
     *  - Search Packing material
     *     search Packing material from master data by OWNER COMP and PACKAGE ITEM NO
     *
     *  - Return of search result
     *     Return {@link Ws2501PkgMaterialsDomain}.
     *
     *  - 包装材の取得
     *      OWNER COMP、PACKAGE ITEM NOをキーに包装材の情報をマスタから取得する。
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501PkgMaterialsDomain}を返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    public Ws2501PkgMaterialsDomain searchPkgMaterials(Ws2501PkgMaterialsCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501PkgMaterialsDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchPkgMaterials", criteria);
    }

    /**
     * Acquisition of exterior cases
     * <br />外装材の取得
     *
     *
     * <pre>
     * -
     *   Registration of the data acquired from (3) exterior cases
     * Only when a * internal variable (header) . exterior sign has a setting, carry out.
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501CmlPrintNumCriteriaDomain}.
     * 
     * -
     * (3)外装材から取得したデータの登録
     * ※内部変数（ヘッダ）.外装記号に設定がある場合のみ実施
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501CmlPrintNumCriteriaDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501PkgSetMaterialsNxsCompNmDomain> searchPkgSetMaterialsNxsCompNm(Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501PkgSetMaterialsNxsCompNmDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchPkgSetMaterialsNxsCompNm", criteria);
    }

    /**
     * Packing specification existence check
     *   (a NEXUS Company Master, a PKG Specification MA(Header), a PKG Specification MA(Detail), Package Specification Revision Master)
     * <br />包装仕様存在チェック
     * （NEXUS会社原単位、包装仕様原単位（ヘッダ）、包装仕様原単位（明細）、包装仕様有効リビジョン原単位）
     *
     * <pre>
     * - A MIX TAG FLAG processes to all the data of "N" in a parameter . ITEM-NO list.
     *   (the data of the same ITEM NO and a packing CD is carried out once)
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501CmlPrintNumCriteriaDomain}.
     * 
     * - パラメタ.品目番号リストの中でMIXタグフラグが"N"のデータ全てに対して処理を行う
     * （同一品目番号・包装コードのデータは一回のみ実施）
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501CmlPrintNumCriteriaDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501PkgSpecDomain> searchPkgSpec(Ws2501PkgSpecCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501PkgSpecDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchPkgSpec", criteria);
    }

    /**
     * Acquisition of a Packing material
     * <br />包装材の取得
     *
     * <pre>
     *   At the time of registration of the data acquired from (1) packing specification
     * - A MIX TAG FLAG processes to all the records of "N" in an internal variable (details).
     *
     * - Calculation of a Packing-material USE QUANTITY
     *     Packing-material USE-QUANTITY  = (internal variable (details) . QUANTITY / PKG-Specification-MA(Detail) .LOT_SIZE) * PKG-Specification-MA(Detail) .QTY
     *     Below the a small number of point of * (an internal variable (details) . QUANTITY / PKG-Specification-MA(Detail) .LOT_SIZE) is upvaluation.
     *
     * - Total of a Packing-material USE QUANTITY
     *     The data conclusion of the same PACKAGE ITEM NO and a Packing-material USE QUANTITY are totaled, and duplicate data is deleted.
     *
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501MixedTagItemDomain}.
     * 
     * (1)包装仕様から取得したデータの登録時
     * - 内部変数（明細）の中でMIXタグフラグが"N"のレコード全てに対して、処理を行う
     *
     * - 包装材使用数の算出
     *   包装材使用数 ＝ （内部変数（明細）.数量 / 包装仕様原単位（明細）.LOT_SIZE） * 包装仕様原単位（明細）.QTY
     *   ※（内部変数（明細）.数量 / 包装仕様原単位（明細）.LOT_SIZE）の少数点以下は切り上げ
     *
     * - 包装材使用数の合算
     *   同一包装材品目番号のデータまとめ、包装材使用数を合計し、重複データを削除する
     *
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501MixedTagItemDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501PkgSpecMaterialsNameRevDomain> searchPkgSpecMaterialsNameRev(Ws2501PkgSpecMaterialsNameRevCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501PkgSpecMaterialsNameRevDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchPkgSpecMaterialsNameRev", criteria);
    }

    /**
     * Acquisition (NEXUS side information) (when the Palletize Instr. No. is inputted) of an ITEM NO INFORMATION  
     * <br />品番情報の取得（NEXUS側情報）（梱包指示Noが入力されている場合）
     *
     *
     * <pre>
     * - Acquisition of an ITEM-NO information (NEXUS side information)
     *       all the following conditions are fulfilled -- data acquisition is carried out
     *       - It corresponds to the conditions specified from the screen.
     *       - This is contained in the specified page.
     *       - It corresponds to the authority which a login user has.
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501ItemNoNxsPltzInstNoDomain}.
     * 
     * - 品目番号情報の取得（NEXUS側情報）
     *     下記の条件をすべて満たすデータ取得する
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     - ログインユーザが持つ権限に該当する
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501ItemNoNxsPltzInstNoDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return The list of Packaging Instruction (=Pull)s<br />梱包指示のリスト
     * @throws ApplicationException When Packaging Instruction (=Pull) cannot acquire<br />梱包指示が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501ItemNoNxsPltzInstNoDomain> searchItemNoNxsPltzInstNo(Ws2501ItemNoNxsPltzInstNoCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501ItemNoNxsPltzInstNoDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchItemNoNxsPltzInstNo", criteria);
    }

   /**
    * Acquisition (NEXUS side information) (when the Palletize Instr. No. is not inputted) of an ITEM NO INFORMATION  
    * <br />品番情報の取得（NEXUS側情報）（梱包指示Noが入力されていない、かつ、受注あり場合）
    *
    *
    * <pre>
    * - Acquisition of an ITEM-NO information (NEXUS side information)
    *       all the following conditions are fulfilled -- data acquisition is carried out
    *       - It corresponds to the conditions specified from the screen.
    *       - This is contained in the specified page.
    *       - It corresponds to the authority which a login user has.
    *
    * - Return of search results
    *     Search results are returned by the list of {@link Ws2501ItemNoNxsNonPltzInstNoDomain}.
    * 
    * - 品目番号情報の取得（NEXUS側情報）
    *     下記の条件をすべて満たすデータ取得する
    *     - 画面から指定された条件に該当する
    *     - 指定されたページに含まれる
    *     - ログインユーザが持つ権限に該当する
    *
    * - 検索結果の返却
    *   検索結果を{@link Ws2501ItemNoNxsNonPltzInstNoDomain}のリストで返却します。
    * </pre>
    *
    * @param criteria search-condition domain<br />検索条件ドメイン
    * @return The list of Packaging Instruction (=Pull)s<br />梱包指示のリスト
    * @throws ApplicationException When Packaging Instruction (=Pull) cannot acquire<br />梱包指示が取得できない場合
   */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501ItemNoNxsNonPltzInstNoDomain> searchItemNoNxsNonPltzInstNo(Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501ItemNoNxsNonPltzInstNoDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchItemNoNxsNonPltzInstNo", criteria);
    }

    /**
     * Acquisition (NEXUS side information) (when the Palletize Instr. No. is not inputted) of an ITEM NO INFORMATION  
     * <br />品番情報の取得（NEXUS側情報）（梱包指示Noが入力されていない、かつ、受注なし場合）
     *
     *
     * <pre>
     * - Acquisition of an ITEM-NO information (NEXUS side information)
     *       all the following conditions are fulfilled -- data acquisition is carried out
     *       - It corresponds to the conditions specified from the screen.
     *       - This is contained in the specified page.
     *       - It corresponds to the authority which a login user has.
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501ItemNoNxsNonPltzInstNoDomain}.
     * 
     * - 品目番号情報の取得（NEXUS側情報）
     *     下記の条件をすべて満たすデータ取得する
     *     - 画面から指定された条件に該当する
     *     - 指定されたページに含まれる
     *     - ログインユーザが持つ権限に該当する
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501ItemNoNxsNonPltzInstNoDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return The list of Packaging Instruction (=Pull)s<br />梱包指示のリスト
     * @throws ApplicationException When Packaging Instruction (=Pull) cannot acquire<br />梱包指示が取得できない場合
    */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501ItemNoNxsNonPltzInstNoDomain> searchItemNoNxsNonPltzInstNoErrOdr(Ws2501ItemNoNxsNonPltzInstNoCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501ItemNoNxsNonPltzInstNoDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchItemNoNxsNonPltzInstNoErrOdr", criteria);
    }
    /**
     * Acquisition of a Packaging Instruction (=Pull) information
     *   (a CIGMA Ship To Cross Reference Master, a CIGMA Customer Cross Reference Master, a Packaging Instruction (=Pull), a CIGMA Warehouse Cross Reference Master, NEXUS Warehouse Master)
     * <br />梱包指示情報の取得
     * （NEXUS送荷先クロスリファレンス原単位、NEXUS荷受人クロスリファレンス原単位、梱包指示、倉庫クロスリファレンス原単位、倉庫原単位）
     *
     * <pre>
     * Store - header information in an internal variable.
     * Use the set-up internal variable (header) as a search condition and contents of registration.
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501CmlPrintNumCriteriaDomain}.
     * 
     * - ヘッダ情報を内部変数に格納する
     * 設定した内部変数（ヘッダ）は検索条件および登録内容として使用する
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501CmlPrintNumCriteriaDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public Ws2501PltzInstrInfoDomain searchPltzInstrInfo(Ws2501PltzInstrInfoCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501PltzInstrInfoDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchPltzInstrInfo", criteria);
    }

    /**
     * Acquisition of the Shipper-CD number
     * <br />荷主コード件数の取得
     *
     *
     * <pre>
     * - The PACKAGE CATEGORY of Shipper CD contained in CML for registration is acquired.
     *
     * - Return of search results
     *     Search results are returned by {@link Ws2501CntShipperCdDomain}.
     * 
     * - 登録対象のCMLに含まれる荷主コードの種類を取得する。
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501CntShipperCdDomain}で返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    public Ws2501CntShipperCdDomain searchCntShipperCd(Ws2501CntShipperCdCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501CntShipperCdDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchCntShipperCd", criteria);
    }

    /**
     * A calculation of a WEIGHT
     * <br />重量の算出
     *
     *
     * <pre>
     * - The WEIGHT of CML for registration is acquired for every WEIGHT UNIT, and is changed into the unit to register.
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501SumCmlWeightForUnitDomain}.
     * 
     * - 登録対象のCMLの重量を重量単位毎に取得し、登録する単位に変換する。
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501SumCmlWeightForUnitDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501SumCmlWeightForUnitDomain> searchSumCmlWeightForUnit(Ws2501SumCmlWeightForUnitCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501SumCmlWeightForUnitDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchSumCmlWeightForUnit", criteria);
    }

    /**
     * W/H Company and NEXUS W/H Combination check
     * <br />W/H Company、NEXUS W/H　組み合わせチェック
     *
     *
     * <pre>
     * - It carries out, only when a parameter .NEXUS W/H flag is "Y."
     *
     * - Existence check
     *     The applicable number of cases   = 0
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501TmNxsWhByXrefDomain}.
     * 
     * - パラメタ.NEXUS倉庫フラグが"Y"の場合のみ実施
     *
     * - 存在チェック
     *   該当件数　＝　0
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501TmNxsWhByXrefDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501TmNxsWhByXrefDomain> searchTmNxsWhByXref(Ws2501TmNxsWhByXrefCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501TmNxsWhByXrefDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchTmNxsWhByXref", criteria);
    }


    /**
     * Acquisition of a DUE DATE
     * <br />納期の取得
     *
     *
     * <pre>
     * Acquisition from - Palletize Item Receive Order
     *
     * - Return of search results
     *     Search results are returned by {@link Ws2501TtPltzItemDeliveryTimeDomain}.
     * 
     * - パレタイズ対象品受注情報からの取得
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501TtPltzItemDeliveryTimeDomain}で返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    public Ws2501TtPltzItemDeliveryTimeDomain searchTtPltzItemDeliveryTime(Ws2501TtPltzItemDeliveryTimeCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501TtPltzItemDeliveryTimeDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchTtPltzItemDeliveryTime", criteria);
    }


    /**
     * Acquisition of G/W
     * <br />G/Wの取得
     *
     *
     * <pre>
     * - Converted of a unit
     *       When WEIGHT_UNIT and the WEIGHT UNIT which were acquired differ from each other, a WEIGHT is changed into a WEIGHT UNIT and added together.
     *       * common-specifications .xls[functional-specification common: Refer to unit converted ].
     *
     * - Return of search results
     *     Search results are returned by {@link Ws2501TtPltzItemGwDomain}.
     * 
     * - 単位の変換
     *     取得したWEIGHT_UNITと重量単位が異なる場合は重量を重量単位に変換して合算する
     *     ※共通仕様.xls[機能仕様共通：単位変換] 参照
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501TtPltzItemGwDomain}で返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501TtPltzItemGwDomain> searchTtPltzItemGw(Ws2501TtPltzItemGwCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501TtPltzItemGwDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchTtPltzItemGw", criteria);
    }


    /**
     * Acquisition of N/W
     * <br />N/Wの取得
     *
     *
     * <pre>
     * - Converted of a unit
     *       When WEIGHT_UNIT and the WEIGHT UNIT which were acquired differ from each other, a WEIGHT is changed into a WEIGHT UNIT and added together.
     *       * common-specifications .xls[functional-specification common: Refer to unit converted ].
     *
     * - Return of search results
     *     Search results are returned by {@link Ws2501TtPltzItemNwDomain}.
     * 
     * - 単位の変換
     *     取得したWEIGHT_UNITと重量単位が異なる場合は重量を重量単位に変換して合算する
     *     ※共通仕様.xls[機能仕様共通：単位変換] 参照
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501TtPltzItemNwDomain}で返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501TtPltzItemNwDomain> searchTtPltzItemNw(Ws2501TtPltzItemNwCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501TtPltzItemNwDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchTtPltzItemNw", criteria);
    }

    /**
     * Acquisition of a working-hours No sequence
     * <br />作業時間Noシーケンスの取得
     *
     * @return working hours No<br />作業時間No
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    public BigDecimal searchNextWorkTimeNo() throws ApplicationException {
        return (BigDecimal) getSqlMapClientTemplate().queryForObject("WsBhtEisProduct.SearchNextWorkTimeNo");
    }

    /**
     * Packing specification existence check
     * <br />包装仕様存在チェック
     *
     *
     * <pre>
     * - Only the number of parameter . ITEM NOs is repeated.
     *     (the data of the same ITEM NO and a packing CD is carried out once)  
     *
     * - Existence check
     *       The applicable number of cases   = 0
     *
     * - Return of search results
     *     Search results are returned by the list of {@link Ws2501CmlPrintNumCriteriaDomain}.
     * 
     * - パラメタ.品目番号の数だけ繰り返す
     *   （同一品目番号・包装コードのデータは一回のみ実施）
     *
     * - 存在チェック
     *     該当件数　＝　0
     *
     * - 検索結果の返却
     *   検索結果を{@link Ws2501CmlPrintNumCriteriaDomain}のリストで返却します。
     * </pre>
     *
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return result list<br />結果リスト
     * @throws ApplicationException when result cannot acquire<br />結果が取得できない場合
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501NxsPkgSpecificationDomain> searchNxsPkgSpecification(Ws2501NxsPkgSpecificationCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501NxsPkgSpecificationDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchNxsPkgSpecification", criteria);
    }



    // --------------------------------- ECA0027_WS_2501_Get Palletize Instruction ---------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#searchTmCustomerQrPatternHdrByDtl(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501TmCustomerQrPatternHdrByDtlDomain> searchTmCustomerQrPatternHdrByDtl(
        Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501TmCustomerQrPatternHdrByDtlDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchTmCustomerQrPatternHdrByDtl", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#searchTtPltzItemByKanban(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemByKanbanCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501TtPltzItemByKanbanDomain> searchTtPltzItemByKanban(
        Ws2501TtPltzItemByKanbanCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501TtPltzItemByKanbanDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchTtPltzItemByKanban", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#searchUnpackagedItemNo(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501UnpackagedItemNoCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501UnpackagedItemNoDomain> searchUnpackagedItemNo(
        Ws2501UnpackagedItemNoCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501UnpackagedItemNoDomain>) getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchUnpackagedItemNo", criteria);
    }

    // --------------------------------- ECA0027_WS_2502_Create Inst Palletize -------------------------------------------

    // --------------------------------- ECA0027_WS_2503_Create Non Inst Palletize ---------------------------------------

    // --------------------------------- ECA0027_WS_2504_Create E-RT Palletize -------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#searchOuterSumWeight(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501OuterSumWeightCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends Ws2501OuterSumWeightDomain> searchOuterSumWeight(Ws2501OuterSumWeightCriteriaDomain criteria)
        throws ApplicationException {

        return (List<? extends Ws2501OuterSumWeightDomain>)getSqlMapClientTemplate()
            .queryForList("WsBhtEisProduct.SearchOuterSumWeight", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#searchTmExpShipToShippingByKey(Ws2501TmExpShipToShippingByKeyCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public Ws2501TmExpShipToShippingByKeyDomain searchTmExpShipToShippingByKey(Ws2501TmExpShipToShippingByKeyCriteriaDomain criteria)
        throws ApplicationException{

        return (Ws2501TmExpShipToShippingByKeyDomain) getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchTmExpShipToShippingByKey", criteria);

    }


    // --------------------------------- ECA0027_WS_2505_Create PKG Spec -------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#searchPkgSpecRevHis(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PkgSpecRevHisCriteriaDomain)
     */

    public Ws2501PkgSpecRevHisDomain searchPkgSpecRevHis(Ws2501PkgSpecRevHisCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501PkgSpecRevHisDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.SearchPkgSpecRevHis", criteria);
    }





    // --------------------------------- ECA0027_WS_2507_Print Case Mark Label -------------------------------------------

    // --------------------------------- ECA0027_WS_2508_Create Mixed Label ----------------------------------------------

    // --------------------------------- ECA0027_WS_2509_Print Mixed Label -----------------------------------------------

    // --------------------------------- ECA0027_WS_2510_Create X CML ----------------------------------------------------
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#lockByKeyNoWaitPltzNxsShipTo(com.globaldenso.eca0027.core.business.domain.criteria.Ws2501PltzNxsShipToCriteriaDomain)
     */
    public Ws2501PltzNxsShipToDomain lockByKeyNoWaitPltzNxsShipTo(Ws2501PltzNxsShipToCriteriaDomain criteria)
        throws ApplicationException {

        return (Ws2501PltzNxsShipToDomain)getSqlMapClientTemplate()
            .queryForObject("WsBhtEisProduct.LockByKeyNoWaitPltzNxsShipTo", criteria);
    }


    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao#updateTtPltzByXmainMark(String, List)
     */
    public int updateTtPltzByXmainMark(String xmainMark, List<String> criteriaList)
        throws ApplicationException {

        Map<String, Object> pltzListMap = getUpdateByConditionMap(xmainMark, criteriaList);
        return getSqlMapClientTemplate()
            .update("WsBhtEisProduct.UpdateTtPltzByXmainMark", pltzListMap);
    }


    /**
     * This is a method which generates the conditional update parameter Map.
     * <br />条件付更新パラメーターMapを生成するメソッドです。
     *
     * @param xmainMark X MAIN MARK<br />Xメインマーク
     * @param criteriaList MAIN-MARK list<br />メインマークリスト
     * @return conditional update parameter Map<br />条件付更新パラメーターMap
     */
    protected Map<String, Object> getUpdateByConditionMap(String xmainMark, Object criteriaList) {

        Map<String, Object> updateByConditionMap = new HashMap<String, Object>();

        // update item is set as a map.
        // 更新項目をマップに設定する
        updateByConditionMap.put("xmainMark", xmainMark);
        // update conditions are set as a map.
        // 更新条件をマップに設定する
        updateByConditionMap.put("condition", criteriaList);

        return updateByConditionMap;
    }

    // --------------------------------- ECA0027_WS_2511_Print X CML -----------------------------------------------------

    // --------------------------------- ECA0027_WS_2512_Print Case Mark Label(E-RT) -------------------------------------

}
