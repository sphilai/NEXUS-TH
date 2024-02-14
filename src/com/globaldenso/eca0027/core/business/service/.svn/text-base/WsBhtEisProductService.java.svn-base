/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSetHdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgSpecRevHisDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkErrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtBhtWorkTimeDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorDtlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtCmlErrorHeaderDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzInstrOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzItemOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzKanbanDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaCustomerXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecDtlCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSpecRevCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPrinterCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaCustomerXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmMeasureUnitService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevHisService;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSpecRevService;
import com.globaldenso.eca0027.core.auto.business.service.TmPrinterService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkErrService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtBhtWorkTimeService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorDtlService;
import com.globaldenso.eca0027.core.auto.business.service.TtCmlErrorHeaderService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzItemService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TtXpltzService;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.business.dao.WsBhtEisProductDao;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableDtlDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501InternalVariableHdrDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgItemNoDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501PkgSpecDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2501ProductivityDataInfoDomain;
import com.globaldenso.eca0027.core.business.domain.WsBhtEisProductDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501CmlPrintNumCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501CntShipperCdCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501ItemNoNxsNonInstCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501MixedTagItemCriteriaDomain;
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
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TmNxsWhByXrefCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtMixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemByKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemDeliveryTimeCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemGwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501TtPltzItemNwCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2501UnpackagedItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws2504PkgItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WsBhtEisProductCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestService;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.business.service.TmUserService;


/**
 *    This is an interface of the Web service of EIS Product.
 * <br />EIS ProductのWebサービスのインタフェースです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public interface WsBhtEisProductService {
    // --------------------------------- ECA0027_WS_2501_Get Palletize Instruction ---------------------------------------
    /**
     *    Acquisition of [ws2501] Packaging Instruction (=Pull) (an existence check, a PALLETIZE-INSTRUCTION-STATUS check)
     * <br />[ws2501]梱包指示を取得(存在チェック、梱包指示ステータスチェック)します。
     *
     * <pre>
     * - Acquisition of a Packaging Instruction (=Pull)
     *     - The following items are set to {@link TtPltzInstrCriteriaDomain} from criteria.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *     - This is a call about {@link TtPltzInstrService#searchByCondition (TtPltzInstrCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5038).
     *     - PALLETIZE-INSTRUCTION-STATUS check
     *         In the case of 40 or 50, an error is made (NXS_E 1_5015).
     *
     * - 梱包指示の取得
     *   - {@link TtPltzInstrCriteriaDomain}にcriteriaより以下の項目を設定
     *       - pltzInstrNo/梱包指示NO
     *   - {@link TtPltzInstrService#searchByCondition(TtPltzInstrCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5038)
     *   - 梱包指示ステータスチェック
     *       40、又は、50の場合エラー(NXS_E1_5015)
     * </pre>
     *
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @param result the object into which the Packaging Instruction (=Pull) data is to be stored.<br />取得した梱包指示を格納するためのオブジェクト
     * @return Error code<br />エラーコード
     * @throws ApplicationException When a Packaging Instruction (=Pull) cannot be referred to<br />梱包指示を参照できない場合
     */
    public abstract String validateDatabaseTtPltzOnPltzInstr(String pltzInstrNo, TtPltzInstrDomain result) throws ApplicationException;

    /**
     *    Acquisition of [ws2501] data
     * <br />[ws2501]データを取得します。
     *
     * <pre>
     * - Acquisition of packed up data
     *     - Acquisition of a MAIN-MARK list
     *         The following items are set as {@link TtPltzCriteriaDomain} from criteria.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *         Setting of a sort order
     *           - MAIN_MARK descending order
     *         This is a call about {@link TtPltzService#searchByCondition(TtPltzCriteriaDomain)}.
     *
     *     Acquisition of - KANBAN list
     *         The following items are set to {@link Ws2501TtPltzItemByKanbanCriteriaDomain} from criteria.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *         "" is set to the following items of {@link Ws2501TtPltzItemByKanbanCriteriaDomain}.
     *           - mixTagNo / MIX TAG NO
     *         Setting of a sort order
     *           - PLTZ_ITEM_NO ascending order
     *           - PKG_CD ascending order
     *           - EXP_INDUS_TYP_CD ascending order
     *           - EXP_KANBAN_TYP ascending order
     *           - EXP_REGULATE_NO ascending order
     *         This is a call about {@link WsBhtEisProductDao#searchTtPltzItemByKanban(Ws2501TtPltzItemByKanbanCriteriaDomain)}.
     *
     *     Acquisition of - MIX tag list
     *         The following items are set to {@link TtMixtagCriteriaDomain} from criteria.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *         "20" is set to the following items of {@link TtMixtagCriteriaDomain}.
     *           - mixTagStatus / MULTI ITEM NO IN BOX STATUS
     *         Setting of a sort order
     *           - MIX_TAG_NO ascending order
     *         This is a call about {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)}.
     *
     * - Acquisition of unpacked up data
     *     - Acquisition of a Unpackaged-Item-No list
     *         The following items are set to {@link Ws2501UnpackagedItemNoCriteriaDomain} from criteria.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *           The conditions of *, in addition instrQty/INSTRUCTION QUANTITY are indicated to SQLMap.
     *         "10" is set to the following items of {@link Ws2501UnpackagedItemNoCriteriaDomain}.
     *           - mixTagStatus / MULTI ITEM NO IN BOX STATUS
     *         Setting of a sort order
     *           - ITEM_NO ascending order
     *           - PKG_CD ascending order
     *         This is a call about {@link WsBhtEisProductDao#searchUnpackagedItemNo(Ws2501UnpackagedItemNoCriteriaDomain)}.
     *
     *     - Acquisition of an unpacked up MIX tag list
     *         The following items are set to {@link TtMixtagCriteriaDomain} from criteria.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *         "10" is set to the following items of {@link TtMixtagCriteriaDomain}.
     *           - mixTagStatus / MULTI ITEM NO IN BOX STATUS
     *         Setting of a sort order
     *           - MIX_TAG_NO ascending order
     *         This is a call about {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)}.
     *
     * - Acquisition of a customer KANBAN QR information
     *         The following items are set to {@link Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain} from criteria.
     *           - compCd/COMPANY-CODE  * shipperCd is set up.
     *           - collateMethTyp / COLLATE METHOD TYPE
     *         Setting of a sort order
     *           - STRT_POS ascending order. This is a call about
     *       {@link WsBhtEisProductDao#searchTmCustomerQrPatternHdrByDtl(Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain)}.
     *
     * - Return of search results
     *       A result is returned by {@link WsBhtEisProductDomain}.
     *
     * - 梱包済みデータの取得
     *   - メインマークリストの取得
     *       {@link TtPltzCriteriaDomain}にcriteriaより以下の項目を設定
     *         - pltzInstrNo/梱包指示NO
     *       ソート順の設定
     *         - MAIN_MARK 降順
     *       {@link TtPltzService#searchByCondition(TtPltzCriteriaDomain)}を呼出
     *
     *   - かんばんリストの取得
     *       {@link Ws2501TtPltzItemByKanbanCriteriaDomain}にcriteriaより以下の項目を設定
     *         - pltzInstrNo/梱包指示NO
     *       {@link Ws2501TtPltzItemByKanbanCriteriaDomain}の以下の項目に""を設定
     *         - mixTagNo/MIXタグNO
     *       ソート順の設定
     *         - PLTZ_ITEM_NO 昇順
     *         - PKG_CD 昇順
     *         - EXP_INDUS_TYP_CD 昇順
     *         - EXP_KANBAN_TYP 昇順
     *         - EXP_REGULATE_NO 昇順
     *       {@link WsBhtEisProductDao#searchTtPltzItemByKanban(Ws2501TtPltzItemByKanbanCriteriaDomain)}を呼出
     *
     *   - MIXタグリストの取得
     *       {@link TtMixtagCriteriaDomain}にcriteriaより以下の項目を設定
     *         - pltzInstrNo/梱包指示NO
     *       {@link TtMixtagCriteriaDomain}の以下の項目に"20"を設定
     *         - mixTagStatus/小箱内多品ステータス
     *       ソート順の設定
     *         - MIX_TAG_NO 昇順
     *       {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)}を呼出
     *
     * - 未梱包データの取得
     *   - 未梱包品番リストの取得
     *       {@link Ws2501UnpackagedItemNoCriteriaDomain}にcriteriaより以下の項目を設定
     *         - pltzInstrNo/梱包指示NO
     *         ※尚、instrQty/梱包指示数量の条件はSQLMapに記載
     *       {@link Ws2501UnpackagedItemNoCriteriaDomain}の以下の項目に"10"を設定
     *         - mixTagStatus/小箱内多品ステータス
     *       ソート順の設定
     *         - ITEM_NO 昇順
     *         - PKG_CD 昇順
     *       {@link WsBhtEisProductDao#searchUnpackagedItemNo(Ws2501UnpackagedItemNoCriteriaDomain)}を呼出
     *
     *   - 未梱包MIXタグリストの取得
     *       {@link TtMixtagCriteriaDomain}にcriteriaより以下の項目を設定
     *         - pltzInstrNo/梱包指示NO
     *       {@link TtMixtagCriteriaDomain}の以下の項目に"10"を設定
     *         - mixTagStatus/小箱内多品ステータス
     *       ソート順の設定
     *         - MIX_TAG_NO 昇順
     *       {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)}を呼出
     *
     * - 得意先かんばんQR情報の取得
     *       {@link Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain}にcriteriaより以下の項目を設定
     *         - compCd/会社コード ※shipperCdを設定
     *         - collateMethTyp/照合方式区分
     *       ソート順の設定
     *         - STRT_POS 昇順
     *       {@link WsBhtEisProductDao#searchTmCustomerQrPatternHdrByDtl(Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain)}を呼出
     *
     * - 検索結果の返却
     *     結果を{@link WsBhtEisProductDomain}で返却
     * </pre>
     *
     * @param criteria EisProduct search-condition domain<br />EisProduct検索条件ドメイン
     * @return EisProduct domain<br />EisProductドメイン
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public abstract WsBhtEisProductDomain searchOnPltzInstr(
        WsBhtEisProductCriteriaDomain criteria) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2502_Create Inst Palletize -------------------------------------------
    /**
     *    [ws2502] ITEM-NO list combination check (conditional [ of a CUSTOMER ITEM NO ])
     * <br />[ws2502]品目番号リスト組み合わせをチェック（得意先品目番号の条件付き）します。
     *
     * <pre>
     * Check the combination of the ITEM-NO list succeeded from - BHT.
     *
     * - BHTから引継いだ品目番号リストの組み合わせを確認
     * </pre>
     *
     * @param itemNoList The list of ITEM-NO domains<br />品目番号ドメインのリスト
     * @return Checked result<br />チェック結果
     */
    public abstract boolean validateConsistencyItemListCstmr(List<? extends Ws2501ItemNoDomain> itemNoList);

    /**
     *    [ws2502] [ws2503] exterior sign setting check
     * <br />[ws2502][ws2503]外装記号の設定をチェックします。
     *
     * <pre>
     * Check the contents of the exterior sign succeeded from - BHT.
     *
     * - BHTから引継いだ外装記号の内容を確認
     * </pre>
     *
     * @param outerCd Exterior sign<br />外装記号
     * @param outerCdFlg Exterior sign flag<br />外装記号フラグ
     * @return Checked result<br />チェック結果
     */
    public abstract boolean validateConsistencyOuterNumber(String outerCd, String outerCdFlg);

    /**
     *    [ws2502] [ws2503] PACKAGE-ITEM-NO list combination check
     * <br />[ws2502][ws2503]包装材品目番号リスト組み合わせをチェックします。
     *
     * <pre>
     * Check the combination of the PACKAGE-ITEM-NO list succeeded from - BHT.
     *
     * - BHTから引継いだ包装材品目番号リストの組み合わせを確認
     * </pre>
     *
     * @param pkgItemNoList PACKAGE-ITEM-NO list<br />包装材品目番号リスト
     * @return Checked result<br />チェック結果
     */
    public abstract boolean validateConsistencyPkgMtrlItemList(List<? extends Ws2501PkgItemNoDomain> pkgItemNoList);

    /**
     *    [ws2502] [ws2503] [ws2508] productivity data collection information setting check
     * <br />[ws2502][ws2503][ws2508]生産性データ収集情報の設定をチェックします。
     *
     * <pre>
     * Check the contents of the productivity data error information list succeeded from - BHT.
     *
     * - BHTから引継いだ生産性データエラー情報リストの内容を確認
     * </pre>
     *
     * @param businessStartTime At the time of a business opening day<br />業務開始日時
     * @param businessEndTime Business finishing time<br />業務終了日時
     * @param productivityDataInfoList The list of productivity data information domains<br />生産性データ情報ドメインのリスト
     * @return Checked result<br />チェック結果
     */
    public abstract boolean validateConsistencyPrdctData(String businessStartTime, String businessEndTime,
        List<? extends Ws2501ProductivityDataInfoDomain> productivityDataInfoList);

    /**
     *    [ws2502] dummy Packing-material existence check
     * <br />[ws2502]ダミー包装材を存在チェックします。
     *
     * <pre>
     * - Only the number of the PACKAGE-ITEM-NO lists of arguments repeats the following.
     *     - Acquisition of a PKG Materials MA
     *       - In the following items of {@link TmPkgMtrlCriteriaDomain}
     *         Each VALUE of shipperCd of an argument and pkgItemNoList is set up.
     *           - ownerComp / OWNER COMPANY
     *           - pkgItemNo / PACKAGE ITEM NO
     *       - This is a call about {@link TmPkgMtrlService#searchByKey (TmPkgMtrlCriteriaDomain)}.
     *       - Existence check
     *           In the case of absence, an error is made (NXS_E 1_5009).
     *
     * - 引数の包装材品目番号リストの数だけ以下を繰り返す
     *   - 包装材原単位の取得
     *     - {@link TmPkgMtrlCriteriaDomain}の以下の項目に
     *       引数のshipperCdとpkgItemNoListの各値を設定
     *         - ownerComp/責任会社
     *         - pkgItemNo/包装材品目番号
     *     - {@link TmPkgMtrlService#searchByKey(TmPkgMtrlCriteriaDomain)}を呼出
     *     - 存在チェック
     *         不存在の場合エラー(NXS_E1_5009)
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param pkgItemNoList PACKAGE-ITEM-NO list<br />包装材品目番号リスト
     * @param pkgItemNoErrList PACKAGE-ITEM-NO error list  * For return VALUEs<br />包装材品目番号エラーリスト ※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a PKG Materials MA cannot be referred to<br />包装材原単位を参照できない場合
     */
    public abstract boolean validateDatabaseTmPkgMaterialsOnInstrPltz(String[] shipperCd, List<String> pkgItemNoList, List<String> pkgItemNoErrList)
        throws ApplicationException;

    /**
     *    [ws2502] exterior sign existence check
     * <br />[ws2502]外装記号を存在チェックします。
     *
     * <pre>
     * Acquisition of - Shipper CD and a TRANSPORT CODE
     *     - pltzInstrNo of an argument is set to the following items of {@link TtPltzInstrCriteriaDomain}.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *     - This is a call about {@link TtPltzInstrService#searchByKey (TtPltzInstrCriteriaDomain)}.
     *   -
     *
     * - It carries out, only when the exterior sign of the argument is set up.
     *     - Acquisition of a packing combination master (header)
     *       - In the following items of {@link TmPkgSetHdrCriteriaDomain}
     *         outerCd of an argument is set to shipperCd/Shipper CD of the acquisition result of the above-mentioned Shipper CD.
     *           - ownerComp / OWNER COMPANY
     *           - outerCd / exterior sign
     *       - This is a call about {@link TmPkgSetHdrService#searchByKey (TmPkgSetHdrCriteriaDomain)}.
     *       - Existence check
     *           In the case of absence, an error is made (NXS_E 1_5008).
     *       - VOLUME information registration check
     *           An error is made when either of the VALUEs of the acquired item is not set up (NXS_E 1_5017).
     *
     * - 荷主コード、輸送手段コードの取得
     *   - {@link TtPltzInstrCriteriaDomain}の以下の項目に引数のpltzInstrNoを設定
     *       - pltzInstrNo/梱包指示NO
     *   - {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)}を呼出
     *   -
     *
     * - 引数の外装記号が設定されている場合のみ行う
     *   - 包装組合せ原単位（ヘッダ）の取得
     *     - {@link TmPkgSetHdrCriteriaDomain}の以下の項目に
     *       上記の荷主コードの取得結果のshipperCd/荷主コードと引数のouterCdを設定
     *         - ownerComp/責任会社
     *         - outerCd/外装記号
     *     - {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}を呼出
     *     - 存在チェック
     *         不存在の場合エラー(NXS_E1_5008)
     *     - 容積情報登録チェック
     *         取得した項目の値のいずれかが設定されていない場合エラー(NXS_E1_5017)
     * </pre>
     *
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @param outerCd Exterior sign<br />外装記号
     * @param shipperCd Shipper-CD  * For return VALUEs<br />荷主コード ※戻り値用
     * @param trnsCd TRANSPORT-CODE  * For return VALUEs<br />輸送手段コード ※戻り値用
     * @param tmPkgSetHdr Packing combination master (header) domain  * For return VALUEs<br />包装組合せ原単位（ヘッダ）ドメイン ※戻り値用
     * @return Error code<br />エラーコード
     * @throws ApplicationException When a packing combination master (header) cannot be referred to<br />包装組合せ原単位（ヘッダ）を参照できない場合
     */
    public abstract String validateDatabaseTmPkgSetDtlOnInstrPltz(String pltzInstrNo, String outerCd, String[] shipperCd, String[] trnsCd, TmPkgSetHdrDomain tmPkgSetHdr)
        throws ApplicationException;

    /**
     *    [ws2502] packing specification existence check
     * <br />[ws2502]包装仕様を存在チェックします。
     *
     * <pre>
     * - A MIX TAG FLAG performs the following processings to all the data of "N" in the ITEM-NO Mix tag flag map of an argument.
     *     In the ITEM-NO packing CD map of an argument, the data of the same ITEM NO and a packing CD is accepted once, and is carried out.
     *
     *     Acquisition of - PKG Specification MA(Header), a PKG Specification MA(Detail), and a Package Specification Revision Master
     *       - In the following items of {@link Ws2501PkgSpecCriteriaDomain}
     *         shipperCd of an argument, and every of the ITEM-NO packing CD map of an argument -- itemNo, pkgCd, and trnsCd of an argument are set up
     *           - compCd / COMPANY CODE
     *           - itemNo / ITEM NO
     *           - pkgCd / PACKAGE CODE
     *           - trnsCd / TRANSPORT CODE
     *       - This is a call about {@link WsBhtEisProductDao#searchPkgSpec(Ws2501PkgSpecCriteriaDomain)}.
     *       - Existence check
     *           In the case of absence, an error is made (NXS_E 1_5010).
     *       - Survey WEIGHT registration check
     *           An error is made when PKG-Specification-MA(Header) .ITEM_WEIGHT_A is not set up (NXS_E 1_5068).
     *       - VOLUME information registration check
     *           PKG-Specification-MA(Detail) .PKG_FORM_TYP = S And
     *           An error is made when following either of the PKG Specification MA(Detail)s is not set up (NXS_E 1_5070).
     *             VOLUME_UINIT, VOLUME_PALLETIZE,
     *             LENGH_UNIT, LENGTH_PALLETIZE, WIDTH_PALLETIZE, HEIGHT_PALLETIZE
     *
     * - 引数の品目番号Mixタグフラグマップの中でMIXタグフラグが"N"のデータ全てに対して以下の処理を行う
     *   引数の品目番号包装コードマップの中で同一品目番号・包装コードのデータは一回のみ実施する
     *
     *   - 包装仕様原単位（ヘッダ）、包装仕様原単位（明細）、包装仕様有効リビジョン原単位の取得
     *     - {@link Ws2501PkgSpecCriteriaDomain}の以下の項目に
     *       引数のshipperCd、引数の品目番号包装コードマップの各itemNo、及び、pkgCd、引数のtrnsCdを設定
     *         - compCd/会社コード
     *         - itemNo/品目番号
     *         - pkgCd/包装区分
     *         - trnsCd/輸送手段コード
     *     - {@link WsBhtEisProductDao#searchPkgSpec(Ws2501PkgSpecCriteriaDomain)}を呼出
     *     - 存在チェック
     *         不存在の場合エラー(NXS_E1_5010)
     *     - 実測重量登録チェック
     *         包装仕様原単位（ヘッダ）.ITEM_WEIGHT_Aが設定されていない場合エラー(NXS_E1_5068)
     *     - 容積情報登録チェック
     *         包装仕様原単位（明細）.PKG_FORM_TYP　＝　S　且つ
     *         包装仕様原単位（明細）の以下のいずれかが設定されていない場合エラー(NXS_E1_5070)
     *           VOLUME_UINIT、VOLUME_PALLETIZE、
     *           LENGH_UNIT、LENGTH_PALLETIZE、WIDTH_PALLETIZE、HEIGHT_PALLETIZE
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param itemNoList The list of ITEM-NO domains<br />品目番号ドメインのリスト
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param singlePkgSpec Packing specification<br />包装仕様
     * @return ITEM-NO error MAP<br />品目番号エラーMAP
     * @throws ApplicationException When a PKG Specification MA(Header), a PKG Specification MA(Detail), and a Package Specification Revision Master cannot be referred to<br />包装仕様原単位（ヘッダ）、包装仕様原単位（明細）、包装仕様有効リビジョン原単位を参照できない場合
     */
    public abstract Map<String, List<String>> validateDatabaseTmPkgSpecificationDtOnInstrPltz(String[] shipperCd, List<? extends Ws2501ItemNoDomain> itemNoList, String[] trnsCd,
        Ws2501PkgSpecDomain singlePkgSpec) throws ApplicationException;

    /**
     *    [ws2502] Instructed(=Pull) Palletizing achievement information registration
     * <br />[ws2502]指示パレタイズ実績情報を登録します。
     *
     * <pre>
     * - Lock of data
     *     - Lock of a Packaging Instruction (=Pull)
     *       - pltzInstrNo of an argument is set to the following items of {@link TtPltzInstrCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - This is a call about {@link TtPltzInstrService#lockByKeyNoWait(TtPltzInstrCriteriaDomain)}.
     *     - Lock of a Palletize Instruction Item No
     *       - pltzInstrNo of an argument is set to the following items of {@link TtPltzInstrItemNoCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     This is a call about * - {@link WsBhtEisProductDao#lockByKeyNoWaitTtPltzInstrItemNo(TtPltzInstrItemNoCriteriaDomain)}.
     *     - Lock of a Palletize Instruction Receive Order
     *       - pltzInstrNo of an argument is set to the following items of {@link TtPltzInstrOdrCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - This is a call about {@link WsBhtEisProductDao#lockByKeyNoWaitTtPltzInstrOdr(TtPltzInstrOdrCriteriaDomain)}.
     *     Lock of - Mix Tag
     *       - pltzInstrNo of an argument is set to the following items of {@link TtMixtagCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - This is a call about {@link WsBhtEisProductDao#lockByConditionNoWaitTtMixTag(Ws2501TtMixTagCriteriaDomain)}.
     *
     * - Setting of an internal variable (header)
     *     Acquisition of - Packaging Instruction (=Pull) information (a CIGMA Ship To Cross Reference Master, CIGMA Customer Cross Reference Master)
     *                            A Packaging Instruction (=Pull), a CIGMA Warehouse Cross Reference Master, NEXUS Warehouse Master
     *       - pltzInstrNo of an argument is set to the following items of {@link Ws2501PltzInstrInfoCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - This is a call about {@link WsBhtEisProductDao#searchPltzInstrInfo(Ws2501PltzInstrInfoCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5038).
     *     Check among - CIGMA night batch
     *       - This is a call about {@link CommonService#searchCigmaAvailable(boolean, String)}.
     *     - PALLETIZE-INSTRUCTION-STATUS check
     *         An error is made when Statuses are 10, 40, and 50 (NXS_E 1_5015).
     *     - Setting of an internal variable (header)
     *       - The above-mentioned result is set up.
     *
     * - A company and W/H combination check
     *     - The combination as a result of a setting of the above-mentioned internal variable (header) is checked.
     *     - When an error occurs, a CML Error Report Header is registered.
     *       - The following VALUEs are set to {@link TtCmlErrorHeaderDomain}.
     *           - Internal variable (header)
     *         - DSC-ID
     *           - Login person name
     *           - Time stamp
     *           - CHECK RESULT A-D * NG is set to the item which became an error.
     *       - This is a call about {@link TtCmlErrorHeaderService#create(TtCmlErrorHeaderDomain)}.
     *
     * - Setting of an internal variable (details)
     *     - Acquisition of an ITEM-NO information (NEXUS side information)
     *       A - internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "N."
     *         - The following items are set to {@link Ws2501ItemNoNxsCriteriaDomain}.
     *             - Internal variable (header)
     *             - Internal variable (details)
     *         - This is a call about {@link WsBhtEisProductDao#searchItemNoNxs(Ws2501ItemNoNxsCriteriaDomain)}.
     *         - Setting of an internal variable (details)
     *            - The above-mentioned result is set up.
     *     - Acquisition of an ITEM-NO information (CIGMA side information)
     *       - A MIX TAG FLAG makes the data of "N" an argument in an internal variable (details), and it calls Web service.
     *         - This is a call about {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}.
     *         - Converted of a QUANTITY UNIT
     *           - It repeats by the result of above Ws2004.
     *             - unitMeasure of the result of Ws2004 is set to the following items of {@link TmMeasureUnitCriteriaDomain}.
     *                 - lgcyUnitCd / LEGACY UNIT CODE
     *             - This is a call about {@link TmMeasureUnitService#searchByConditionForPaging(TmMeasureUnitCriteriaDomain)}.
     *             - The 1st affair is acquired.
     *         - Setting of an internal variable (details)
     *           - The above-mentioned result is set up.
     *     Acquisition of - MIXE thing vote information
     *       - An internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "Y."
     *         - The VALUE of an internal variable (detailed) is set to the following items of {@link TtMixtagCriteriaDomain}.
     *             - mixTagNo / MIX TAG NO
     *         - This is a call about {@link TtMixtagService#searchByKey(TtMixtagCriteriaDomain)}.
     *         - Setting of an internal variable (details)
     *           - The above-mentioned result is set up.
     *
     * - Setting of an internal variable (MIX ITEM NO)
     *     - Mix Tag and a MIXED ITEM NO are acquired.
     *       - An internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "Y."
     *         - The VALUE of an internal variable (detailed) is set to the following items of {@link Ws2501MixedTagItemCriteriaDomain}.
     *             - mixTagNo / MIX TAG NO
     *         - This is a call about {@link WsBhtEisProductDao#searchMixedTagItem(Ws2501MixedTagItemCriteriaDomain)}.
     *         - Setting of an internal variable (MIX ITEM NO)
     *           - The above-mentioned result is set up.
     *
     * - input check
     *     - An internal variable (details) . acquisition flag carries out the data of "N" the outside of a checked object.
     *       - Correlation check
     *       - ITEM-NO check
     *       - Multiple Item No. in 1Box PKG check
     *       - When an error occurs
     *         - CML-Error-Report-Header registration
     *           - The following items are set to {@link TtCmlErrorHeaderDomain}.
     *               - Internal variable (header)
     *           - This is a call about {@link TtCmlErrorHeaderService#create(TtCmlErrorHeaderDomain)}.
     *         - CML-Error-Report-Detail registration
     *           - The following items are set to {@link TtCmlErrorDtlDomain}.
     *               - Internal variable (details)
     *               - Result of acquisition of a time stamp
     *           - This is a call about {@link TtCmlErrorDtlService#create(TtCmlErrorDtlDomain)}.
     *
     * - Exterior sign check
     *     - The combination of an internal variable (header) and an internal variable (details) is checked.
     *
     * Acquisition of - Main Mark
     *     - This is a call about {@link CommonService#transactSequence(String, String, int, String)}.
     *
     * - Palletize-Instruction-Receive-Order alloc processing (a part for an ITEM NO)
     *     - A MIX TAG FLAG performs the following processings to all the records of "N" in an internal variable (details).
     *       - Alloc of a Palletize Instruction Receive Order
     *         - An internal variable (header) and an internal variable (detailed) are set to the following items of {@link TtPltzInstrOdrCriteriaDomain}.
     *             - pltzInstrNo / Packaging Instruction (=Pull) NO
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *         - "N" is set to the following items of {@link TtPltzInstrOdrCriteriaDomain}.
     *             - packedFlg / PACKED FLAG
     *         - sort order
     *           - ETD_DUE_DT
     *           - CUSTOMER_CD
     *           - ODR_CTRL_NO
     *         - This is a call about {@link TtPltzInstrOdrService#searchByCondition(TtPltzInstrOdrCriteriaDomain)}.
     *       - Update of a Palletize Instruction Receive Order
     *         - The VALUE of the alloc of a Palletize Instruction Receive Order is set to the item Key of {@link TtPltzInstrOdrCriteriaDomain}.
     *         - It draws in the following items of {@link TtPltzInstrOdrDomain} and sets up a result.
     *             - packedQty / PACKED QUANTITY
     *         - "Y" is set to the following items of {@link TtPltzInstrOdrDomain}.
     *             - packedFlg / PACKED FLAG
     This is a call about * - {@link TtPltzInstrOdrService#updateByCondition(TtPltzInstrOdrDomain, TtPltzInstrOdrCriteriaDomain)}.
     *       Registration of - Palletize Item Receive Order
     *         - The following items are set to {@link TtPltzItemOdrDomain}.
     *             Result of acquisition of - Main Mark
     *             - Internal variable (details)
     *             - Result of the alloc of a Palletize Instruction Receive Order
     *         - This is a call about {@link TtPltzItemOdrService#create(TtPltzItemOdrDomain)}.
     *
     * - Palletize-Instruction-Receive-Order alloc processing (a part for a MIX ITEM NO)
     *     - The following processings are performed to all the records of an internal variable (MIX ITEM NO).
     *       - Alloc of a Palletize Instruction Receive Order
     *         - An internal variable (header) and an internal variable (detailed) are set to the following items of {@link TtPltzInstrOdrCriteriaDomain}.
     *             - pltzInstrNo / Packaging Instruction (=Pull) NO
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *         - "N" is set to the following items of {@link TtPltzInstrOdrCriteriaDomain}.
     *             - packedFlg / PACKED FLAG
     *         - sort order
     *           - ETD_DUE_DT
     *           - CUSTOMER_CD
     *           - ODR_CTRL_NO
     *         - This is a call about {@link TtPltzInstrOdrService#searchByCondition(TtPltzInstrOdrCriteriaDomain)}.
     *       - Update of a Palletize Instruction Receive Order
     *         - The VALUE of the alloc of a Palletize Instruction Receive Order is set to the item Key of {@link TtPltzInstrOdrCriteriaDomain}.
     *         - It draws in the following items of {@link TtPltzInstrOdrDomain} and sets up a result.
     *             - packedQty / PACKED QUANTITY
     *         - "Y" is set to the following items of {@link TtPltzInstrOdrDomain}.
     *             - packedFlg / PACKED FLAG
     This is a call about * - {@link TtPltzInstrOdrService#updateByCondition(TtPltzInstrOdrDomain, TtPltzInstrOdrCriteriaDomain)}.
     *       Registration of - Palletize Item Receive Order
     *         - The following items are set to {@link TtPltzItemOdrDomain}.
     *             Result of acquisition of - Main Mark
     *             - Internal variable (details)
     *             - Result of the alloc of a Palletize Instruction Receive Order
     *         - This is a call about {@link TtPltzItemOdrService#create(TtPltzItemOdrDomain)}.
     *
     * Register - Palletize-Item data (ITEM NO).
     *     - A MIX TAG FLAG performs the following processings to all the records of "N" in an internal variable (details).
     *       - Palletize-Item (ITEM NO) registration
     *         - The following items are set to {@link TtPltzItemDomain}.
     *             Result of acquisition of - Main Mark
     *             - Internal variable (header)
     *             - Internal variable (details)
     *         - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *     - The following processings are performed to all the records of an internal variable (MIX ITEM NO).
     *       - Palletize-Item (Mix ITEM NO) registration
     *         - The following items are set to {@link TtPltzItemDomain}.
     *             Result of acquisition of - Main Mark
     *             - Internal variable (header)
     *             - Internal variable (MIX ITEM NO)
     *         - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *
     * Register - Palletize-Item data (packing).
     *     - Registration of a Packing material (registration of the data acquired from the packing specification)
     *       - A MIX TAG FLAG performs the following processings to all the records of "N" in an internal variable (details).
     *         - Acquisition of a Packing material
     *           - The VALUE of an internal variable (detailed) is set to the following items of {@link Ws2501PkgSpecMaterialsNameRevCriteriaDomain}.
     *             - itemNo
     *             - pkgCd
     *           - The VALUE of an internal variable (header) is set to the following items of {@link Ws2501PkgSpecMaterialsNameRevCriteriaDomain}.
     *             - compCd
     *             - trnsCd
     This is a call about * - {@link WsBhtEisProductDao#searchPkgSpecMaterialsNameRev(Ws2501PkgSpecMaterialsNameRevCriteriaDomain)}.
     *         - Calculation of a Packing-material USE QUANTITY
     *         - Total of a Packing-material USE QUANTITY
     *         Registration of - Palletize Item
     *           - The following items are set to {@link TtPltzItemDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable header
     *               - Result of a total of a Packing-material USE QUANTITY
     *           - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *     - Registration of a Packing material (registration of the data acquired from the MIX tag)
     *       - A MIX TAG FLAG performs the following processings to all the records of "Y" in an internal variable (details).
     *         Acquisition of - Mix Tag RT
     *           - The VALUE of an internal variable (detailed) is set to the following items of {@link TtMixtagRtCriteriaDomain}.
     *               - mixTagNo / MIX TAG NO
     *           - This is a call about {@link TtMixtagRtService#searchByCondition (TtMixtagRtCriteriaDomain)}.
     *         Registration of - Palletize Item
     *           - The following items are set to {@link TtPltzItemDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable header
     *               Result of acquisition of - Mix Tag RT
     *           - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *     - Registration of a Packing material (registration of the data acquired from exterior cases)
     *       - It carries out, only when an internal variable (header) . exterior sign has a setting.
     *         - A packing combination master (details), a PKG Materials MA, a PKG Materials Name MA, NEXUS-Company-Master acquisition
     *           - shipperCd of an internal variable (header) and outerPkgCd are set to the following items of {@link Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain}.
     *             - ownerComp
     *             - outerPkgCd
     This is a call about * - {@link WsBhtEisProductDao#searchPkgSetMaterialsNxsCompNm(Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain)}.
     *         Registration of - Palletize Item
     *           - The following items are set to {@link TtPltzItemDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable header
     *               - Result of a packing combination master (details), a PKG Materials MA, a PKG Materials Name MA, and NEXUS-Company-Master acquisition
     *           - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *     - Registration of a Packing material (registration of a dummy Packing material)
     *       - The following processings are performed to all parameter . PACKAGE ITEM NOs.
     *         - Acquisition of a PKG Materials MA, a PKG Materials Name MA, and a NEXUS Company Master
     *           - shipperCd of an internal variable (header) is set to the following items of {@link Ws2501PkgMaterialsCriteriaDomain}.
     *             - ownerComp
     *           - pkgItemNo of the PACKAGE-ITEM-NO list of EisProduct search-condition domains is set to the following items of {@link Ws2501PkgMaterialsCriteriaDomain}.
     *             - pkgItemNo
     *           - This is a call about {@link WsBhtEisProductDao#searchPkgMaterials(Ws2501PkgMaterialsCriteriaDomain)}.
     *         Registration of - Palletize Item
     *           - The following items are set to {@link TtPltzItemDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable header
     *               - Result of acquisition of a PKG Materials MA, a PKG Materials Name MA, and a NEXUS Company Master
     *               pkgQty of the PACKAGE-ITEM-NO list of - EisProduct search-condition domains
     *           - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *
     * Register - Palletize-Item-KANBAN data.
     *     - This is registration of a link KANBAN information to an ITEM NO.
     *       - The following processings are performed to all the data of an internal variable (details) . KANBAN list.
     *           - The following items are set to {@link TtPltzKanbanDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable details
     *           - This is a call about {@link TtPltzKanbanService#create(TtPltzKanbanDomain)}.
     *     This is registration of a link KANBAN information to - MIX tag.
     *       - The following processings are performed to all the data of an internal variable (MIX ITEM NO).
     *         - Mix-Tag-KANBAN acquisition
     *           - shipperCd of an internal variable (MIX ITEM NO) is set to the following items of {@link TtMixKanbanCriteriaDomain}.
     *               - mixTagNo / MIX TAG NO
     *               - itemNo / ITEM NO
     *               - pkgCd / PACKAGE CODE
     *           - This is a call about {@link TtMixKanbanService#searchByCondition(TtMixKanbanCriteriaDomain)}.
     *         - Palletize-Item-KANBAN registration
     *           - The following items are set to {@link TtPltzKanbanDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable (MIX ITEM NO)
     *               Result of - Mix-Tag-KANBAN acquisition
     *           - This is a call about {@link TtPltzKanbanService#create(TtPltzKanbanDomain)}.
     *
     * - Palletize data is registered.
     *     - Acquisition of a WEIGHT, a VOLUME, and a LENGTH UNIT
     *       - shipperCd of an internal variable header is made into an argument, and this is a call about {@link CommonService#searchWeightUnit(String)}.
     *       - shipperCd of an internal variable header is made into an argument, and this is a call about {@link CommonService#searchLengthUnit(String)}.
     *       - shipperCd of an internal variable header is made into an argument, and this is a call about {@link CommonService#searchVolumeUnit(String)}.
     *     Acquisition of - N/W
     *       - A MainMark acquisition result is set to the following items of {@link Ws2501TtPltzItemNwCriteriaDomain}.
     *         - mainMark
     *       - This is a call about {@link WsBhtEisProductDao#searchTtPltzItemNw(Ws2501TtPltzItemNwCriteriaDomain)}.
     *       - This is a call about {@link CommonService#convertWeightUnit (BigDecimal, String, String)}.
     *     Acquisition of - G/W
     *       - A MainMark acquisition result is set to the following items of {@link Ws2501TtPltzItemGwCriteriaDomain}.
     *         - mainMark
     *       - This is a call about {@link WsBhtEisProductDao#searchTtPltzItemGw(Ws2501TtPltzItemGwCriteriaDomain)}.
     *       - This is a call about {@link CommonService#convertWeightUnit (BigDecimal, String, String)}.
     *     - Acquisition of a DUE DATE
     *       - A MainMark acquisition result is set to the following items of {@link Ws2501TtPltzItemDeliveryTimeCriteriaDomain}.
     *         - mainMark
     This is a call about * - {@link WsBhtEisProductDao#searchTtPltzItemDeliveryTime(Ws2501TtPltzItemDeliveryTimeCriteriaDomain)}.
     *     - Registration processing (Palletize)
     *       - The following items are set to {@link TtPltzDomain}.
     *           Result of acquisition of - Main Mark
     *           - Internal variable (header)
     *           - Internal variable (details)
     *           - Result of acquisition of a WEIGHT, a VOLUME, and a LENGTH UNIT
     *           Result of acquisition of - N/W
     *           Result of acquisition of - G/W
     *           - Result of acquisition of a DUE DATE
     *       - This is a call about {@link TtPltzService#create(TtPltzDomain)}.
     *
     * - PACKED-QUANTITY update process (a part for an ITEM NO)
     *     - A MIX TAG FLAG performs the following processings to all the records of "N" in an internal variable (details).
     *       - Palletize-Instruction-Item-No acquisition
     *         - The same name item of an internal variable (header) and an internal variable (detailed) is set to the following items of {@link TtPltzInstrItemNoCriteriaDomain}.
     *             - pltzInstrNo / Packaging Instruction (=Pull) NO
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *         - This is a call about {@link TtPltzInstrItemNoService#searchByKey(TtPltzInstrItemNoCriteriaDomain)}.
     *       - Update of a Palletize Instruction Item No
     *         - qty of an internal variable (detailed) is added and set to the following items of {@link TtPltzInstrItemNoDomain}.
     *             - packedQty / PACKED QUANTITY
     *         - The same name item of an internal variable (header) and an internal variable (detailed) is set to the following items of {@link TtPltzInstrItemNoCriteriaDomain}.
     *             - pltzInstrNo / Packaging Instruction (=Pull) NO
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     This is a call about * - {@link TtPltzInstrItemNoService#updateByCondition(TtPltzInstrItemNoDomain, TtPltzInstrItemNoCriteriaDomain)}.
     *
     * - PACKED-QUANTITY update process (a part for a MIX ITEM NO)
     *     - The following processings are performed to all the records of an internal variable (MIX ITEM NO).
     *       - Palletize-Instruction-Item-No acquisition
     *         - The same name item of an internal variable (header) and an internal variable (MIX ITEM NO) is set to the following items of {@link TtPltzInstrItemNoCriteriaDomain}.
     *             - pltzInstrNo / Packaging Instruction (=Pull) NO
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *         - This is a call about {@link TtPltzInstrItemNoService#searchByKey(TtPltzInstrItemNoCriteriaDomain)}.
     *       - Update of a Palletize Instruction Item No
     *         - qty of an internal variable (MIX ITEM NO) is added and set to the following items of {@link TtPltzInstrItemNoDomain}.
     *             - packedQty / PACKED QUANTITY
     *         - The same name item of an internal variable (header) and an internal variable (MIX ITEM NO) is set to the following items of {@link TtPltzInstrItemNoCriteriaDomain}.
     *             - pltzInstrNo / Packaging Instruction (=Pull) NO
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     This is a call about * - {@link TtPltzInstrItemNoService#updateByCondition(TtPltzInstrItemNoDomain, TtPltzInstrItemNoCriteriaDomain)}.
     *
     * - PACKING-STATUS update process
     *     - Palletize-Instruction-Item-No acquisition
     *       - The same name item of an internal variable (header) is set to the following items of {@link TtPltzInstrItemNoCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - This is a call about {@link TtPltzInstrItemNoService#searchByCondition(TtPltzInstrItemNoCriteriaDomain)}.
     *     - Update of a Packaging Instruction (=Pull)
     *       - The VALUE judged from the result of Palletize-Instruction-Item-No acquisition is set to the following items of {@link TtPltzInstrDomain}.
     *           - pltzInstrStatus / PALLETIZE INSTRUCTION STATUS
     *       - The same name item of an internal variable (header) is set to the following items of {@link TtPltzInstrCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - This is a call about {@link TtPltzInstrService#updateByCondition(TtPltzInstrDomain, TtPltzInstrCriteriaDomain)}.
     *
     * - MULTI-ITEM-NO-IN-BOX-STATUS update process
     *     - MIX_TAG_FLG performs the following processings to all the records of "Y" in an internal variable (details).
     *       - Update of a Packaging Instruction (=Pull)
     *         - The VALUE judged from the result of Palletize-Instruction-Item-No acquisition is set to the following items of {@link TtMixtagDomain}.
     *             - mixTagStatus / MULTI ITEM NO IN BOX STATUS
     *         - The same name item of an internal variable (detailed) is set to the following items of {@link TtMixtagCriteriaDomain}.
     *             - mixTagNo / MIX TAG NO
     *         - This is a call about {@link TtMixtagService#updateByCondition(TtMixtagDomain, TtMixtagCriteriaDomain)}.
     *
     * Register - BHT productivity data information.
     *     Acquisition of - user's information
     *       - The login ID of criteria is set to the following items of {@link TmUserConfCriteriaDomain}.
     *         - dscId
     *       - This is a call about {@link TmUserConfService#searchByKey(TmUserConfCriteriaDomain)}.
     *     Registration of - BHT-Work-Time table
     *       - The following items are set to {@link TtBhtWorkTimeDomain}.
     *           Result of acquisition of - user's information
     *           - Internal variable (header)
     *           - Parameter
     *           Result of acquisition of - Main Mark
     *       - This is a call about {@link TtBhtWorkTimeService#create(TtBhtWorkTimeDomain)}.
     *     Registration of - BHT Work Time For Palletize
     *       - The following items are set to {@link TtBhtWorkPltzDomain}.
     *           WORK TIME NO at the time of registration of - BHT-Work-Time table
     *           - Internal variable (details)
     *           - Parameter
     *       - This is a call about {@link TtBhtWorkPltzService#create(TtBhtWorkPltzDomain)}.
     *     Registration of - BHT-Work-Error table
     *       - The following items are set to {@link TtBhtWorkErrDomain}.
     *           WORK TIME NO at the time of registration of - BHT-Work-Time table
     *           - Parameter
     *           - Internal variable (header)
     *       - This is a call about {@link TtBhtWorkErrService#create(TtBhtWorkErrDomain)}.
     *
     * - Acquisition of the packed up data for responses
     *     - Acquisition of a MAIN-MARK list
     *       - The same name item of an internal variable (header) is set to the following items of {@link TtPltzCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - A sort order is set as {@link TtPltzCriteriaDomain}.
     *           - MAIN_MARK descending order
     *       - This is a call about {@link TtPltzService#searchByCondition(TtPltzCriteriaDomain)}.
     *     Acquisition of - KANBAN list
     *       - The same name item of an internal variable (header) is set to the following items of {@link Ws2501TtPltzItemByKanbanCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - This is a call about {@link WsBhtEisProductDao#searchTtPltzItemByKanban(Ws2501TtPltzItemByKanbanCriteriaDomain)}.
     *     Acquisition of - MIX tag list
     *       - The same name item of an internal variable (header) is set to the following items of {@link TtMixtagCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - Sorting is set to {@link TtMixtagCriteriaDomain}.
     *           - MIX_TAG_NO ascending order
     *       - This is a call about {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)}.
     *
     * - Acquisition of the unpacked up data for responses
     *     - Acquisition of an unpacked up ITEM-NO list
     *       - The same name item of an internal variable (header) is set to the following items of {@link Ws2501UnpackagedItemNoCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - This is a call about {@link WsBhtEisProductDao#searchUnpackagedItemNo(Ws2501UnpackagedItemNoCriteriaDomain)}.
     *     - Acquisition of an unpacked up MIX tag list
     *       - The same name item of an internal variable (header) is set to the following items of {@link TtMixtagCriteriaDomain}.
     *           - pltzInstrNo / Packaging Instruction (=Pull) NO
     *       - Sorting is set to {@link TtMixtagCriteriaDomain}.
     *           - MIX_TAG_NO ascending order
     *       - This is a call about {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)}.
     *
     * - データのロック
     *   - 梱包指示のロック
     *     - {@link TtPltzInstrCriteriaDomain}の以下の項目に引数のpltzInstrNoを設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link TtPltzInstrService#lockByKeyNoWait(TtPltzInstrCriteriaDomain)}を呼出
     *   - 梱包指示品目番号のロック
     *     - {@link TtPltzInstrItemNoCriteriaDomain}の以下の項目に引数のpltzInstrNoを設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link WsBhtEisProductDao#lockByKeyNoWaitTtPltzInstrItemNo(TtPltzInstrItemNoCriteriaDomain)}を呼出
     *   - 梱包指示品目番号受注情報のロック
     *     - {@link TtPltzInstrOdrCriteriaDomain}の以下の項目に引数のpltzInstrNoを設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link WsBhtEisProductDao#lockByKeyNoWaitTtPltzInstrOdr(TtPltzInstrOdrCriteriaDomain)}を呼出
     *   - MIXED現品票のロック
     *     - {@link TtMixtagCriteriaDomain}の以下の項目に引数のpltzInstrNoを設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link WsBhtEisProductDao#lockByConditionNoWaitTtMixTag(Ws2501TtMixTagCriteriaDomain)}を呼出
     *
     * - 内部変数（ヘッダ）の設定
     *   - 梱包指示情報の取得（NEXUS送荷先クロスリファレンス原単位、NEXUS荷受人クロスリファレンス原単位、
     *                         梱包指示、倉庫クロスリファレンス原単位、倉庫原単位）
     *     - {@link Ws2501PltzInstrInfoCriteriaDomain}の以下の項目に引数のpltzInstrNoを設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link WsBhtEisProductDao#searchPltzInstrInfo(Ws2501PltzInstrInfoCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5038)
     *   - CIGMA夜間バッチ中チェック
     *     - {@link CommonService#searchCigmaAvailable(boolean, String)}を呼出
     *   - 梱包指示ステータスチェック
     *       ステータスが10,40,50の場合エラー(NXS_E1_5015)
     *   - 内部変数（ヘッダ）の設定
     *     - 上記の結果を設定
     *
     * - 会社・倉庫組合せチェック
     *   - 上記の内部変数（ヘッダ）の設定の結果の組み合わせを確認する
     *   - エラーが発生した場合、CMLエラーレポートヘッダを登録する
     *     - {@link TtCmlErrorHeaderDomain}に以下の値を設定
     *         - 内部変数（ヘッダ）
     *         - DSC-ID
     *         - ログイン者名
     *         - タイムスタンプ
     *         - CHECK RESULT A～D ※エラーになった項目にNGを設定
     *     - {@link TtCmlErrorHeaderService#create(TtCmlErrorHeaderDomain)}を呼出
     *
     * - 内部変数（明細）の設定
     *   - 品目番号情報の取得（NEXUS側情報)
     *     -内部変数（明細）.MIXタグフラグが"N"のデータ全てに対して以下の処理を行う
     *       - {@link Ws2501ItemNoNxsCriteriaDomain}に以下の項目を設定
     *           - 内部変数（ヘッダ）
     *           - 内部変数（明細）
     *       - {@link WsBhtEisProductDao#searchItemNoNxs(Ws2501ItemNoNxsCriteriaDomain)}を呼出
     *       - 内部変数（明細）の設定
     *          - 上記の結果を設定
     *   - 品目番号情報の取得（CIGMA側情報)
     *     - 内部変数（明細）の中でMIXタグフラグが"N"のデータを引数にして、Webサービスをコールする
     *       - {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}を呼出
     *       - 数量単位の変換
     *         - 上記のWs2004の結果分繰り返す
     *           - {@link TmMeasureUnitCriteriaDomain}の以下の項目にWs2004の結果のunitMeasureを設定
     *               - lgcyUnitCd/LEGACY単位コード
     *           - {@link TmMeasureUnitService#searchByConditionForPaging(TmMeasureUnitCriteriaDomain)}を呼出
     *           - 1件目を取得する
     *       - 内部変数（明細）の設定
     *         - 上記の結果を設定
     *   - MIXE現品票情報の取得
     *     - 内部変数（明細）.MIXタグフラグが"Y"のデータ全てに対して以下の処理を行う
     *       - {@link TtMixtagCriteriaDomain}の以下の項目に内部変数（明細）の値を設定
     *           - mixTagNo/MIXタグNO
     *       - {@link TtMixtagService#searchByKey(TtMixtagCriteriaDomain)}を呼出
     *       - 内部変数（明細）の設定
     *         - 上記の結果を設定
     *
     * - 内部変数（MIX品目番号）の設定
     *   - MIXED現品票、MIXED品目番号を取得
     *     - 内部変数（明細）.MIXタグフラグが"Y"のデータ全てに対して以下の処理を行う
     *       - {@link Ws2501MixedTagItemCriteriaDomain}の以下の項目に内部変数（明細）の値を設定
     *           - mixTagNo/MIXタグNO
     *       - {@link WsBhtEisProductDao#searchMixedTagItem(Ws2501MixedTagItemCriteriaDomain)}を呼出
     *       - 内部変数（MIX品目番号）の設定
     *         - 上記の結果を設定
     *
     * - 入力チェック
     *   - 内部変数（明細）.取得フラグが"N"のデータはチェック対象外とする
     *     - 相関チェック
     *     - 品目番号チェック
     *     - 小箱内多品チェック
     *     - エラーが発生した場合
     *       - CMLエラーレポートヘッダ登録
     *         - {@link TtCmlErrorHeaderDomain}に以下の項目を設定する
     *             - 内部変数（ヘッダ）
     *         - {@link TtCmlErrorHeaderService#create(TtCmlErrorHeaderDomain)}を呼出
     *       - CMLエラーレポート明細登録
     *         - {@link TtCmlErrorDtlDomain}に以下の項目を設定する
     *             - 内部変数（明細）
     *             - タイムスタンプの取得の結果
     *         - {@link TtCmlErrorDtlService#create(TtCmlErrorDtlDomain)}を呼出
     *
     * - 外装記号チェック
     *   - 内部変数（ヘッダ）、内部変数（明細）の組み合わせを確認する
     *
     * - Main Markの取得
     *   - {@link CommonService#transactSequence(String, String, int, String)}を呼出
     *
     * - 梱包指示品目番号受注情報引当処理（品目番号分）
     *   - 内部変数（明細）の中でMIXタグフラグが"N"のレコード全てに対して、以下の処理を行う
     *     - 梱包指示品目番号受注情報の引当
     *       - {@link TtPltzInstrOdrCriteriaDomain}の以下の項目に内部変数（ヘッダ）、内部変数（明細）を設定
     *           - pltzInstrNo/梱包指示NO
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *       - {@link TtPltzInstrOdrCriteriaDomain}の以下の項目に"N"を設定
     *           - packedFlg/梱包済フラグ
     *       - ソート順
     *           - ETD_DUE_DT
     *           - CUSTOMER_CD
     *           - ODR_CTRL_NO
     *       - {@link TtPltzInstrOdrService#searchByCondition(TtPltzInstrOdrCriteriaDomain)}を呼出
     *     - 梱包指示品目番号受注情報の更新
     *       - {@link TtPltzInstrOdrCriteriaDomain}のKey項目に梱包指示品目番号受注情報の引当の値を設定
     *       - {@link TtPltzInstrOdrDomain}の以下の項目に引き当て結果を設定
     *           - packedQty/梱包済数量
     *       - {@link TtPltzInstrOdrDomain}の以下の項目に"Y"を設定
     *           - packedFlg/梱包済フラグ
     *       - {@link TtPltzInstrOdrService#updateByCondition(TtPltzInstrOdrDomain, TtPltzInstrOdrCriteriaDomain)}を呼出
     *     - パレタイズ対象品受注情報の登録
     *       - {@link TtPltzItemOdrDomain}に以下の項目を設定
     *           - Main Markの取得の結果
     *           - 内部変数（明細）
     *           - 梱包指示品目番号受注情報の引当の結果
     *       - {@link TtPltzItemOdrService#create(TtPltzItemOdrDomain)}を呼出
     *
     * - 梱包指示品目番号受注情報引当処理（MIX品目番号分）
     *   - 内部変数（MIX品目番号）のレコード全てに対して、以下の処理を行う
     *     - 梱包指示品目番号受注情報の引当
     *       - {@link TtPltzInstrOdrCriteriaDomain}の以下の項目に内部変数（ヘッダ）、内部変数（明細）を設定
     *           - pltzInstrNo/梱包指示NO
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *       - {@link TtPltzInstrOdrCriteriaDomain}の以下の項目に"N"を設定
     *           - packedFlg/梱包済フラグ
     *       - ソート順
     *           - ETD_DUE_DT
     *           - CUSTOMER_CD
     *           - ODR_CTRL_NO
     *       - {@link TtPltzInstrOdrService#searchByCondition(TtPltzInstrOdrCriteriaDomain)}を呼出
     *     - 梱包指示品目番号受注情報の更新
     *       - {@link TtPltzInstrOdrCriteriaDomain}のKey項目に梱包指示品目番号受注情報の引当の値を設定
     *       - {@link TtPltzInstrOdrDomain}の以下の項目に引き当て結果を設定
     *           - packedQty/梱包済数量
     *       - {@link TtPltzInstrOdrDomain}の以下の項目に"Y"を設定
     *           - packedFlg/梱包済フラグ
     *       - {@link TtPltzInstrOdrService#updateByCondition(TtPltzInstrOdrDomain, TtPltzInstrOdrCriteriaDomain)}を呼出
     *     - パレタイズ対象品受注情報の登録
     *       - {@link TtPltzItemOdrDomain}に以下の項目を設定
     *           - Main Markの取得の結果
     *           - 内部変数（明細）
     *           - 梱包指示品目番号受注情報の引当の結果
     *       - {@link TtPltzItemOdrService#create(TtPltzItemOdrDomain)}を呼出
     *
     * - パレタイズ対象品データ（品目番号）を登録
     *   - 内部変数（明細）の中でMIXタグフラグが"N"のレコード全てに対して、以下の処理を行う
     *     - パレタイズ対象品(品目番号)登録
     *       - {@link TtPltzItemDomain}に以下の項目を設定
     *           - Main Markの取得の結果
     *           - 内部変数（ヘッダ）
     *           - 内部変数（明細）
     *       - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *   - 内部変数（MIX品目番号）のレコード全てに対して、以下の処理を行う
     *     - パレタイズ対象品(Mix品目番号)登録
     *       - {@link TtPltzItemDomain}に以下の項目を設定
     *           - Main Markの取得の結果
     *           - 内部変数（ヘッダ）
     *           - 内部変数（MIX品目番号）
     *       - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *
     * - パレタイズ対象品データ（包装）を登録
     *   - 包装材の登録（包装仕様から取得したデータの登録）
     *     - 内部変数（明細）の中でMIXタグフラグが"N"のレコード全てに対して、以下の処理を行う
     *       - 包装材の取得
     *         - {@link Ws2501PkgSpecMaterialsNameRevCriteriaDomain}の以下の項目に内部変数（明細）の値を設定
     *             - itemNo
     *             - pkgCd
     *         - {@link Ws2501PkgSpecMaterialsNameRevCriteriaDomain}の以下の項目に内部変数（ヘッダ）の値を設定
     *             - compCd
     *             - trnsCd
     *         - {@link WsBhtEisProductDao#searchPkgSpecMaterialsNameRev(Ws2501PkgSpecMaterialsNameRevCriteriaDomain)}を呼出
     *       - 包装材使用数の算出
     *       - 包装材使用数の合算
     *       - パレタイズ対象品の登録
     *         - {@link TtPltzItemDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数ヘッダ
     *             - 包装材使用数の合算の結果
     *         - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *   - 包装材の登録（MIXタグから取得したデータの登録）
     *     - 内部変数（明細）の中でMIXタグフラグが"Y"のレコード全てに対して、以下の処理を行う
     *       - MIXED用RT材の取得
     *         - {@link TtMixtagRtCriteriaDomain}の以下の項目に内部変数（明細）の値を設定
     *             - mixTagNo/MIXタグNO
     *         - {@link TtMixtagRtService#searchByCondition(TtMixtagRtCriteriaDomain)}を呼出
     *       - パレタイズ対象品の登録
     *         - {@link TtPltzItemDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数ヘッダ
     *             - MIXED用RT材の取得の結果
     *         - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *   - 包装材の登録（外装材から取得したデータの登録）
     *     - 内部変数（ヘッダ）.外装記号に設定がある場合のみ実施
     *       - 包装組合せ原単位（明細）、包装材原単位、包装材名称原単位、NEXUS会社原単位取得
     *         - {@link Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain}の以下の項目に内部変数（ヘッダ）のshipperCd、outerPkgCdを設定
     *             - ownerComp
     *             - outerPkgCd
     *         - {@link WsBhtEisProductDao#searchPkgSetMaterialsNxsCompNm(Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain)}を呼出
     *       - パレタイズ対象品の登録
     *         - {@link TtPltzItemDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数ヘッダ
     *             - 包装組合せ原単位（明細）、包装材原単位、包装材名称原単位、NEXUS会社原単位取得の結果
     *         - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *   - 包装材の登録（ダミー包装材の登録）
     *     - パラメタ.包装材品目番号全てに対して以下の処理を行う
     *       - 包装材原単位、包装材名称原単位、NEXUS会社原単位の取得
     *         - {@link Ws2501PkgMaterialsCriteriaDomain}の以下の項目に内部変数（ヘッダ）のshipperCdを設定
     *             - ownerComp
     *         - {@link Ws2501PkgMaterialsCriteriaDomain}の以下の項目にEisProduct検索条件ドメインの包装材品目番号リストのpkgItemNoを設定
     *             - pkgItemNo
     *         - {@link WsBhtEisProductDao#searchPkgMaterials(Ws2501PkgMaterialsCriteriaDomain)}を呼出
     *       - パレタイズ対象品の登録
     *         - {@link TtPltzItemDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数ヘッダ
     *             - 包装材原単位、包装材名称原単位、NEXUS会社原単位の取得の結果
     *             - EisProduct検索条件ドメインの包装材品目番号リストのpkgQty
     *         - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *
     * - パレタイズ対象品かんばん情報データを登録
     *   - 品目番号に紐づくかんばん情報の登録
     *     - 内部変数（明細）.かんばんリストの全てのデータに対して、以下の処理を行う
     *         - {@link TtPltzKanbanDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数明細
     *         - {@link TtPltzKanbanService#create(TtPltzKanbanDomain)}を呼出
     *   - MIXタグに紐づくかんばん情報の登録
     *     - 内部変数（MIX品目番号）のデータ全てに対して、以下の処理を行う
     *       - MIX品かんばん情報取得
     *         - {@link TtMixKanbanCriteriaDomain}の以下の項目に内部変数（MIX品目番号）のshipperCdを設定
     *             - mixTagNo/MIXタグNO
     *             - itemNo/品目番号
     *             - pkgCd/包装区分
     *         - {@link TtMixKanbanService#searchByCondition(TtMixKanbanCriteriaDomain)}を呼出
     *       - パレタイズ対象品かんばん情報登録
     *         - {@link TtPltzKanbanDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数（MIX品目番号）
     *             - MIX品かんばん情報取得の結果
     *         - {@link TtPltzKanbanService#create(TtPltzKanbanDomain)}を呼出
     *
     * - パレタイズデータを登録
     *   - 重量・容積・長さ単位の取得
     *     - 内部変数ヘッダのshipperCdを引数にして、{@link CommonService#searchWeightUnit(String)}を呼出
     *     - 内部変数ヘッダのshipperCdを引数にして、{@link CommonService#searchLengthUnit(String)}を呼出
     *     - 内部変数ヘッダのshipperCdを引数にして、{@link CommonService#searchVolumeUnit(String)}を呼出
     *   - N/Wの取得
     *     - {@link Ws2501TtPltzItemNwCriteriaDomain}の以下の項目にMainMark取得結果を設定
     *         - mainMark
     *     - {@link WsBhtEisProductDao#searchTtPltzItemNw(Ws2501TtPltzItemNwCriteriaDomain)}を呼出
     *     - {@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *   - G/Wの取得
     *     - {@link Ws2501TtPltzItemGwCriteriaDomain}の以下の項目にMainMark取得結果を設定
     *         - mainMark
     *     - {@link WsBhtEisProductDao#searchTtPltzItemGw(Ws2501TtPltzItemGwCriteriaDomain)}を呼出
     *     - {@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *   - 納期の取得
     *     - {@link Ws2501TtPltzItemDeliveryTimeCriteriaDomain}の以下の項目にMainMark取得結果を設定
     *         - mainMark
     *     - {@link WsBhtEisProductDao#searchTtPltzItemDeliveryTime(Ws2501TtPltzItemDeliveryTimeCriteriaDomain)}を呼出
     *   - 登録処理(パレタイズ)
     *     - {@link TtPltzDomain}に以下の項目を設定
     *         - Main Markの取得の結果
     *         - 内部変数（ヘッダ）
     *         - 内部変数（明細）
     *         - 重量・容積・長さ単位の取得の結果
     *         - N/Wの取得の結果
     *         - G/Wの取得の結果
     *         - 納期の取得の結果
     *     - {@link TtPltzService#create(TtPltzDomain)}を呼出
     *
     * - 梱包済数量更新処理（品目番号分）
     *   - 内部変数（明細）の中でMIXタグフラグが"N"のレコード全てに対して、以下の処理を行う
     *     - 梱包指示品目番号取得
     *       - {@link TtPltzInstrItemNoCriteriaDomain}の以下の項目に内部変数（ヘッダ）、内部変数（明細）の同名項目を設定
     *           - pltzInstrNo/梱包指示NO
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *       - {@link TtPltzInstrItemNoService#searchByKey(TtPltzInstrItemNoCriteriaDomain)}を呼出
     *     - 梱包指示品目番号更新
     *       - {@link TtPltzInstrItemNoDomain}の以下の項目に内部変数（明細）のqtyを加算して設定
     *           - packedQty/梱包済数量
     *       - {@link TtPltzInstrItemNoCriteriaDomain}の以下の項目に内部変数（ヘッダ）、内部変数（明細）の同名項目を設定
     *           - pltzInstrNo/梱包指示NO
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *       - {@link TtPltzInstrItemNoService#updateByCondition(TtPltzInstrItemNoDomain, TtPltzInstrItemNoCriteriaDomain)}を呼出
     *
     * - 梱包済数量更新処理（MIX品目番号分）
     *   - 内部変数（MIX品目番号）のレコード全てに対して、以下の処理を行う
     *     - 梱包指示品目番号取得
     *       - {@link TtPltzInstrItemNoCriteriaDomain}の以下の項目に内部変数（ヘッダ）、内部変数（MIX品目番号）の同名項目を設定
     *           - pltzInstrNo/梱包指示NO
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *       - {@link TtPltzInstrItemNoService#searchByKey(TtPltzInstrItemNoCriteriaDomain)}を呼出
     *     - 梱包指示品目番号更新
     *       - {@link TtPltzInstrItemNoDomain}の以下の項目に内部変数（MIX品目番号）のqtyを加算して設定
     *           - packedQty/梱包済数量
     *       - {@link TtPltzInstrItemNoCriteriaDomain}の以下の項目に内部変数（ヘッダ）、内部変数（MIX品目番号）の同名項目を設定
     *           - pltzInstrNo/梱包指示NO
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *       - {@link TtPltzInstrItemNoService#updateByCondition(TtPltzInstrItemNoDomain, TtPltzInstrItemNoCriteriaDomain)}を呼出
     *
     * - 梱包ステータス更新処理
     *   - 梱包指示品目番号取得
     *     - {@link TtPltzInstrItemNoCriteriaDomain}の以下の項目に内部変数（ヘッダ）の同名項目を設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link TtPltzInstrItemNoService#searchByCondition(TtPltzInstrItemNoCriteriaDomain)}を呼出
     *   - 梱包指示更新
     *     - {@link TtPltzInstrDomain}の以下の項目に梱包指示品目番号取得の結果より判定した値を設定
     *         - pltzInstrStatus/梱包指示ステータス
     *     - {@link TtPltzInstrCriteriaDomain}の以下の項目に内部変数（ヘッダ）の同名項目を設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link TtPltzInstrService#updateByCondition(TtPltzInstrDomain, TtPltzInstrCriteriaDomain)}を呼出
     *
     * - 小箱内多品ステータス更新処理
     *   - 内部変数（明細）の中でMIX_TAG_FLGが"Y"のレコード全てに対して、以下の処理を行う
     *     - 梱包指示更新
     *       - {@link TtMixtagDomain}の以下の項目に梱包指示品目番号取得の結果より判定した値を設定
     *           - mixTagStatus/小箱内多品ステータス
     *       - {@link TtMixtagCriteriaDomain}の以下の項目に内部変数（明細）の同名項目を設定
     *           - mixTagNo/MIXタグNO
     *       - {@link TtMixtagService#updateByCondition(TtMixtagDomain, TtMixtagCriteriaDomain)}を呼出
     *
     * - BHT生産性データ情報を登録
     *   - ユーザー情報の取得
     *     - {@link TmUserConfCriteriaDomain}の以下の項目にcriteriaのログインIDを設定
     *         - dscId
     *     - {@link TmUserConfService#searchByKey(TmUserConfCriteriaDomain)}を呼出
     *   - BHT作業時間テーブルの登録
     *     - {@link TtBhtWorkTimeDomain}に以下の項目を設定
     *         - ユーザー情報の取得の結果
     *         - 内部変数（ヘッダ）
     *         - パラメタ
     *         - Main Markの取得の結果
     *     - {@link TtBhtWorkTimeService#create(TtBhtWorkTimeDomain)}を呼出
     *   - BHT作業情報テーブル(パレタイズ)の登録
     *     - {@link TtBhtWorkPltzDomain}に以下の項目を設定
     *         - BHT作業時間テーブルの登録時の作業時間NO
     *         - 内部変数（明細）
     *         - パラメタ
     *     - {@link TtBhtWorkPltzService#create(TtBhtWorkPltzDomain)}を呼出
     *   - BHT作業エラーテーブルの登録
     *     - {@link TtBhtWorkErrDomain}に以下の項目を設定
     *         - BHT作業時間テーブルの登録時の作業時間NO
     *         - パラメタ
     *         - 内部変数（ヘッダ）
     *     - {@link TtBhtWorkErrService#create(TtBhtWorkErrDomain)}を呼出
     *
     * - レスポンス用梱包済みデータの取得
     *   - メインマークリストの取得
     *     - {@link TtPltzCriteriaDomain}の以下の項目に内部変数（ヘッダ）の同名項目を設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link TtPltzCriteriaDomain}にソート順を設定
     *         - MAIN_MARK 降順
     *     - {@link TtPltzService#searchByCondition(TtPltzCriteriaDomain)}を呼出
     *   - かんばんリストの取得
     *     - {@link Ws2501TtPltzItemByKanbanCriteriaDomain}の以下の項目に内部変数（ヘッダ）の同名項目を設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link WsBhtEisProductDao#searchTtPltzItemByKanban(Ws2501TtPltzItemByKanbanCriteriaDomain)}を呼出
     *   - MIXタグリストの取得
     *     - {@link TtMixtagCriteriaDomain}の以下の項目に内部変数（ヘッダ）の同名項目を設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link TtMixtagCriteriaDomain}にソートを設定
     *         - MIX_TAG_NO 昇順
     *     - {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)}を呼出
     *
     * - レスポンス用未梱包データの取得
     *   - 未梱包品目番号リストの取得
     *     - {@link Ws2501UnpackagedItemNoCriteriaDomain}の以下の項目に内部変数（ヘッダ）の同名項目を設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link WsBhtEisProductDao#searchUnpackagedItemNo(Ws2501UnpackagedItemNoCriteriaDomain)}を呼出
     *   - 未梱包MIXタグリストの取得
     *     - {@link TtMixtagCriteriaDomain}の以下の項目に内部変数（ヘッダ）の同名項目を設定
     *         - pltzInstrNo/梱包指示NO
     *     - {@link TtMixtagCriteriaDomain}にソートを設定
     *         - MIX_TAG_NO 昇順
     *     - {@link TtMixtagService#searchByCondition(TtMixtagCriteriaDomain)}を呼出
     * </pre>
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @return Eis Product domain<br />Eis Productドメイン
     * @throws ApplicationException When a database cannot be accessed<br />データベースにアクセスできない場合
     */
    public abstract WsBhtEisProductDomain transactOnInstPltz(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2503_Create Non Inst Palletize ---------------------------------------
    /**
     *    [ws2503] ITEM-NO list combination check
     * <br />[ws2503]品目番号リストの組み合わせをチェックします。
     *
     * <pre>
     * Check the contents of the parameter succeeded from - BHT.
     *
     * - BHTから引継いだパラメータの内容を確認
     * </pre>
     *
     * @param itemNoList The list of ITEM-NO domains<br />品目番号ドメインのリスト
     * @return Checked result<br />チェック結果
     */
    public abstract boolean validateConsistencyItemList(List<? extends Ws2501ItemNoDomain> itemNoList);


    /**
     *    [ws2503] W/H combination check
     * <br />[ws2503]倉庫組み合わせをチェックします。
     *
     * <pre>
     * Check the contents of the parameter succeeded from - BHT.
     *
     * - BHTから引継いだパラメータの内容を確認
     * </pre>
     *
     * @param nexusWhFlg NEXUS W/H flag<br />NEXUS倉庫フラグ
     * @param whCompCd NEXUS W/H Company CD<br />NEXUS倉庫会社コード
     * @param whCd NEXUS W/H CD<br />NEXUS倉庫コード
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @param lgcyWhCd LEGACY WAREHOUSE CODE<br />LEGACY倉庫コード
     * @return Checked result<br />チェック結果
     */
    public abstract boolean validateConsistencyStock(String nexusWhFlg, String whCompCd, String whCd, String plntCd, String lgcyWhCd);

    /*
     *   [Common] CIGMA night-batch check   Functional-specification common: Behavior in a CIGMA night batch
     * <br />[共通]CIGMA夜間バッチチェック 機能仕様共通：CIGMA夜間バッチ中の振る舞い
     */
    // validateDatabaseCigmaNightBatchRunning

    /**
     *    [ws2503] Consignee existence check
     * <br />[ws2503]荷受人を存在チェックします。
     *
     * <pre>
     * - This is a call about {@link TmCigmaCustomerXrefService#searchByKey (TmCigmaCustomerXrefCriteriaDomain)}.
     * - Existence check
     *       An error is made when it does not exist.
     *
     * - {@link TmCigmaCustomerXrefService#searchByKey(TmCigmaCustomerXrefCriteriaDomain)}を呼出
     * - 存在チェック
     *     存在しない場合エラー
     * </pre>
     *
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param compCd COMPANY CODE<br />会社コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmCigmaCustomerXrefOnNonInstrPltz(String lgcyLibCompCd, String customerCd, String[] compCd)
        throws ApplicationException;

    /**
     *    [ws2503] and [ws2508] Shipper, Customer, and Ship to Combination check
     * <br />[ws2503][ws2508]Shipper、Customer、Ship to　組み合わせをチェックします。
     *
     * <pre>
     * - This is a call about {@link TmCigmaWhXrefService#searchByKey(TmCigmaWhXrefCriteriaDomain)}.
     * - Existence check
     *       An error is made when it does not exist.
     *
     * - {@link TmCigmaWhXrefService#searchByKey(TmCigmaWhXrefCriteriaDomain)}を呼出
     * - 存在チェック
     *     存在しない場合エラー
     * </pre>
     *
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipToCd LEGACY SHIP TO<br />LEGACY送荷先
     * @param shipToCd SHIP TO CODE<br />送荷先コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmCigmaShipToXrefOnNonInstrPltz(String lgcyLibCompCd, String customerCd, String lgcyShipToCd, String[] shipToCd)
        throws ApplicationException;

    /**
     *    [ws2503] Shipper, W/H, and Plant Combination check
     * <br />[ws2503]Shipper、W/H、Plant　組み合わせをチェックします。
     *
     * <pre>
     * - This is a call about {@link TmCigmaWhXrefService#searchByKey(TmCigmaWhXrefCriteriaDomain)}.
     * - Existence check
     *       An error is made when it does not exist.
     *
     * - {@link TmCigmaWhXrefService#searchByKey(TmCigmaWhXrefCriteriaDomain)}を呼出
     * - 存在チェック
     *     存在しない場合エラー
     * </pre>
     *
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param lgcyWhCd LEGACY WAREHOUSE CODE<br />LEGACY倉庫コード
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @param compCd COMPANY CODE<br />会社コード
     * @param whCd W/H CD<br />倉庫コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmCigmaWhXrefOnNonInstrPltz(String lgcyLibCompCd, String lgcyWhCd, String plntCd, String[] compCd, String[] whCd)
        throws ApplicationException;

    /**
     *    [ws2503] W/H Company and NEXUS W/H Combination check
     * <br />[ws2503]W/H Company、NEXUS W/H　組み合わせをチェックします。
     *
     * <pre>
     * - This is a call about {@link WsBhtEisProductDao#searchTmNxsWhByXref(Ws2501TmNxsWhByXrefCriteriaDomain)}.
     * - Existence check
     *       An error is made when it does not exist.
     *
     * - {@link WsBhtEisProductDao#searchTmNxsWhByXref(Ws2501TmNxsWhByXrefCriteriaDomain)}を呼出
     * - 存在チェック
     *     存在しない場合エラー
     * </pre>
     *
     * @param compCd COMPANY CODE<br />会社コード
     * @param whCd W/H CD<br />倉庫コード
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param lgcyWhCd LEGACY WAREHOUSE CODE<br />LEGACY倉庫コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a NEXUS Warehouse Master and a CIGMA Warehouse Cross Reference Master cannot be referred to<br />倉庫原単位、倉庫クロスリファレンス原単位を参照できない場合
     */
    public abstract boolean validateDatabaseTmNxsWhOnNonInstrPltz(String compCd, String whCd, String lgcyLibCompCd, String[] lgcyWhCd) throws ApplicationException;

    /**
     *    [ws2503] dummy Packing-material existence check
     * <br />[ws2503]ダミー包装材を存在チェックします。
     *
     * <pre>
     * - Only the number of the PACKAGE-ITEM-NO lists of arguments repeats the following.
     *     - Acquisition of a PKG Materials MA
     *       - In the following items of {@link TmPkgMtrlCriteriaDomain}
     *         Each VALUE of shipperCd of an argument and pkgItemNoList is set up.
     *           - ownerComp / OWNER COMPANY
     *           - pkgItemNo / PACKAGE ITEM NO
     *       - This is a call about {@link TmPkgMtrlService#searchByKey (TmPkgMtrlCriteriaDomain)}.
     *       - Existence check
     *           In the case of absence, an error is made (NXS_E 1_5009).
     *
     * - 引数の包装材品目番号リストの数だけ以下を繰り返す
     *   - 包装材原単位の取得
     *     - {@link TmPkgMtrlCriteriaDomain}の以下の項目に
     *       引数のshipperCdとpkgItemNoListの各値を設定
     *         - ownerComp/責任会社
     *         - pkgItemNo/包装材品目番号
     *     - {@link TmPkgMtrlService#searchByKey(TmPkgMtrlCriteriaDomain)}を呼出
     *     - 存在チェック
     *         不存在の場合エラー(NXS_E1_5009)
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param pkgItemNoList PACKAGE-ITEM-NO list<br />包装材品目番号リスト
     * @param pkgItemNoErrList PACKAGE-ITEM-NO error list  * For return VALUEs<br />包装材品目番号エラーリスト ※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmPkgMaterialsOnNonInstrPltz(String[] shipperCd, List<String> pkgItemNoList, List<String> pkgItemNoErrList)
        throws ApplicationException;

    /**
     *    [ws2503] exterior sign existence check
     * <br />[ws2503]外装記号を存在チェックします。
     *
     * <pre>
     * Acquisition of - Shipper CD and a TRANSPORT CODE
     *     - pltzInstrNo of an argument is set to the following items of {@link TtPltzInstrCriteriaDomain}.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *     - This is a call about {@link TtPltzInstrService#searchByKey (TtPltzInstrCriteriaDomain)}.
     *   -
     *
     * - It carries out, only when the exterior sign of the argument is set up.
     *     - Acquisition of a packing combination master (header)
     *       - In the following items of {@link TmPkgSetHdrCriteriaDomain}
     *         outerCd of an argument is set to shipperCd/Shipper CD of the acquisition result of the above-mentioned Shipper CD.
     *           - ownerComp / OWNER COMPANY
     *           - outerCd / exterior sign
     *       - This is a call about {@link TmPkgSetHdrService#searchByKey (TmPkgSetHdrCriteriaDomain)}.
     *       - Existence check
     *           In the case of absence, an error is made (NXS_E 1_5008).
     *       - VOLUME information registration check
     *           An error is made when either of the VALUEs of the acquired item is not set up (NXS_E 1_5017).
     *
     * - 荷主コード、輸送手段コードの取得
     *   - {@link TtPltzInstrCriteriaDomain}の以下の項目に引数のpltzInstrNoを設定
     *       - pltzInstrNo/梱包指示NO
     *   - {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)}を呼出
     *   -
     *
     * - 引数の外装記号が設定されている場合のみ行う
     *   - 包装組合せ原単位（ヘッダ）の取得
     *     - {@link TmPkgSetHdrCriteriaDomain}の以下の項目に
     *       上記の荷主コードの取得結果のshipperCd/荷主コードと引数のouterCdを設定
     *         - ownerComp/責任会社
     *         - outerCd/外装記号
     *     - {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}を呼出
     *     - 存在チェック
     *         不存在の場合エラー(NXS_E1_5008)
     *     - 容積情報登録チェック
     *         取得した項目の値のいずれかが設定されていない場合エラー(NXS_E1_5017)
     * </pre>
     *
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @param outerCd Exterior sign<br />外装記号
     * @param shipperCd Shipper-CD  * For return VALUEs<br />荷主コード ※戻り値用
     * @param trnsCd TRANSPORT-CODE  * For return VALUEs<br />輸送手段コード ※戻り値用
     * @param tmPkgSetHdr Packing combination master (header) domain  * For return VALUEs<br />包装組合せ原単位（ヘッダ）ドメイン ※戻り値用
     * @return Error code<br />エラーコード
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract String validateDatabaseTmPkgSetDtlOnNonInstrPltz(String pltzInstrNo, String outerCd, String[] shipperCd, String[] trnsCd, TmPkgSetHdrDomain tmPkgSetHdr)
        throws ApplicationException;

    /**
     *    [ws2503] packing specification existence check
     * <br />[ws2503]包装仕様を存在チェックします。
     *
     * <pre>
     * - A MIX TAG FLAG performs the following processings to all the data of "N" in the ITEM-NO Mix tag flag map of an argument.
     *     In the ITEM-NO packing CD map of an argument, the data of the same ITEM NO and a packing CD is accepted once, and is carried out.
     *
     *     Acquisition of - PKG Specification MA(Header), a PKG Specification MA(Detail), and a Package Specification Revision Master
     *       - In the following items of {@link Ws2501PkgSpecCriteriaDomain}
     *         shipperCd of an argument, and every of the ITEM-NO packing CD map of an argument -- itemNo, pkgCd, and trnsCd of an argument are set up
     *           - compCd / COMPANY CODE
     *           - itemNo / ITEM NO
     *           - pkgCd / PACKAGE CODE
     *           - trnsCd / TRANSPORT CODE
     *       - This is a call about {@link WsBhtEisProductDao#searchPkgSpec(Ws2501PkgSpecCriteriaDomain)}.
     *       - Existence check
     *           In the case of absence, an error is made (NXS_E 1_5010).
     *       - Survey WEIGHT registration check
     *           An error is made when PKG-Specification-MA(Header) .ITEM_WEIGHT_A is not set up (NXS_E 1_5068).
     *       - VOLUME information registration check
     *           PKG-Specification-MA(Detail) .PKG_FORM_TYP = S And
     *           An error is made when following either of the PKG Specification MA(Detail)s is not set up (NXS_E 1_5070).
     *             VOLUME_UINIT, VOLUME_PALLETIZE,
     *             LENGH_UNIT, LENGTH_PALLETIZE, WIDTH_PALLETIZE, HEIGHT_PALLETIZE
     *
     * - 引数の品目番号Mixタグフラグマップの中でMIXタグフラグが"N"のデータ全てに対して以下の処理を行う
     *   引数の品目番号包装コードマップの中で同一品目番号・包装コードのデータは一回のみ実施する
     *
     *   - 包装仕様原単位（ヘッダ）、包装仕様原単位（明細）、包装仕様有効リビジョン原単位の取得
     *     - {@link Ws2501PkgSpecCriteriaDomain}の以下の項目に
     *       引数のshipperCd、引数の品目番号包装コードマップの各itemNo、及び、pkgCd、引数のtrnsCdを設定
     *         - compCd/会社コード
     *         - itemNo/品目番号
     *         - pkgCd/包装区分
     *         - trnsCd/輸送手段コード
     *     - {@link WsBhtEisProductDao#searchPkgSpec(Ws2501PkgSpecCriteriaDomain)}を呼出
     *     - 存在チェック
     *         不存在の場合エラー(NXS_E1_5010)
     *     - 実測重量登録チェック
     *         包装仕様原単位（ヘッダ）.ITEM_WEIGHT_Aが設定されていない場合エラー(NXS_E1_5068)
     *     - 容積情報登録チェック
     *         包装仕様原単位（明細）.PKG_FORM_TYP　＝　S　且つ
     *         包装仕様原単位（明細）の以下のいずれかが設定されていない場合エラー(NXS_E1_5070)
     *           VOLUME_UINIT、VOLUME_PALLETIZE、
     *           LENGH_UNIT、LENGTH_PALLETIZE、WIDTH_PALLETIZE、HEIGHT_PALLETIZE
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param itemNoList The list of ITEM-NO domains<br />品目番号ドメインのリスト
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param singlePkgSpec Packing specification<br />包装仕様
     * @return ITEM-NO error MAP<br />品目番号エラーMAP
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract Map<String, List<String>> validateDatabaseTmPkgSpecificationDtOnNonInstrPltz(String[] shipperCd, List<? extends Ws2501ItemNoDomain> itemNoList, String[] trnsCd, Ws2501PkgSpecDomain singlePkgSpec)
        throws ApplicationException;

    /**
     *    [ws2503] [ws2508] CML-Error-Report-Header registration
     * <br />[ws2503][ws2508]CMLエラーレポートヘッダを登録します。
     *
     * <pre>
     * - This is a call about {@link TtCmlErrorHeaderService#create (TtCmlErrorHeaderDomain)}.
     *
     * - {@link TtCmlErrorHeaderService#create(TtCmlErrorHeaderDomain)}を呼出
     * </pre>
     *
     * @param screenId WEB service ID<br />WEBサービスID
     * @param wsBhtEisProductCriteria COMPANY CODE<br />会社コード
     * @param errChkList Error-checking list<br />エラーチェックリスト
     * @return ERROR CREATE TIMESTAMP<br />エラーレポート作成日時
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public Timestamp validateDatabaseTtCmlErrorHeaderOnNonInstrPltz(String screenId, WsBhtEisProductCriteriaDomain wsBhtEisProductCriteria, List<String> errChkList)
        throws ApplicationException;

    /**
     *    [ws2503] result Palletize achievement information registration
     * <br />[ws2503]成行パレタイズ実績情報を登録します。
     *
     * <pre>
     * - Setting of an internal variable (header)
     *     - It sets to {@link Ws2501InternalVariableHdrDomain} from criteria.
     *
     * - Setting of an internal variable (details)
     *     - An internal variable (detailed) is set to {@link Ws2501InternalVariableDtlDomain} from criteria.
     *     - Lock of data
     *       - Lock of an ordering information
     *         - An internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "N."
     *           - The item of an internal variable (header) is set to the following items of {@link Ws2501TtExpRcvOdrCriteriaDomain}.
     *               - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *               - customerCd / CUSTOMER CODE
     *               - lgcyShipTo / LEGACY SHIP TO
     *               - trnsCd / TRANSPORT CODE
     *           - The item of an internal variable (detailed) is set to the following items of {@link Ws2501TtExpRcvOdrCriteriaDomain}.
     *               - itemNo / ITEM NO
     *               - pkgCd / PACKAGE CODE
     *           - Call of {@link WsBhtEisProductDao#lockByKeyNoWaitTtExpRcvOdr(Ws2501TtExpRcvOdrCriteriaDomain)}
     *       Lock of - Mix Tag
     *         - An internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "Y."
     *           - The item of an internal variable (detailed) is set to the following items of {@link Ws2501TtMixTagCriteriaDomain}.
     *               - mixTagNo / MIX TAG NO
     *           - Call of {@link WsBhtEisProductDao#lockByConditionNoWaitTtMixTag(Ws2501TtMixTagCriteriaDomain)}
     *     - Acquisition of an ITEM-NO information (NEXUS side information)
     *       - An internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "N."
     *         - The item of an internal variable (header) is set to the following items of {@link Ws2501ItemNoNxsNonInstCriteriaDomain}.
     *             - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *             - customerCd / CUSTOMER CODE
     *             - lgcyShipTo / LEGACY SHIP TO
     *             - trnsCd / TRANSPORT CODE
     *             - lgcyWhCd / LEGACY WAREHOUSE CODE
     *         - The item of an internal variable (header) is set to the following items of {@link Ws2501ItemNoNxsNonInstCriteriaDomain}.
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *         - The time zone converted date of an internal variable (header) . Shipper CD is set to the following items of {@link Ws2501ItemNoNxsNonInstCriteriaDomain}.
     *             - aplyStrtDt / APPLY START DATE
     *         - Call of {@link WsBhtEisProductDao#searchItemNoNxsNonInst(Ws2501ItemNoNxsNonInstCriteriaDomain)}
     *         - An internal variable (detailed) is set up from the above-mentioned result.
     *     - Acquisition of an ITEM-NO information (CIGMA side information)
     *       - A MIX TAG FLAG makes the data of "N" an argument in an internal variable (details), and it calls Web service.
     *         In * internal variable (details), a MIX TAG FLAG does not carry out, when the data of "N" does not exist.
     *         When the W/H CD of - CIGMA is chosen (when an internal variable (header) .NEXUS W/H flag is "N")
     *           - Call of {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}
     *         When the W/H CD of - NEXUS is chosen (when an internal variable (header) .NEXUS W/H flag is "Y")
     *           - The item of an internal variable (header) is set to the following items of {@link TmCigmaWhXrefCriteriaDomain}.
     *               - lgcyLibCompCd / LEGACY LIBRARY COMPANY CODE
     *               - lgcyWhCd / LEGACY WAREHOUSE CODE
     *           - Call of {@link TmCigmaWhXrefService#searchByCondition (TmCigmaWhXrefCriteriaDomain)}
     *           - Call of {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}
     *         - Converted of a QUANTITY UNIT
     *           - Result of the above [ items / of {@link TmMeasureUnitCriteriaDomain} / following ]
     *               - lgcyUnitCd / LEGACY UNIT CODE
     *           - Call of {@link TmMeasureUnitService#searchByConditionForPaging(TmMeasureUnitCriteriaDomain)}
     *         - An internal variable (detailed) is set up from the above-mentioned result.
     *     Acquisition of - MIXE thing vote information
     *       - An internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "Y."
     *         - Call of {@link TtMixtagService#searchByKey(TtMixtagCriteriaDomain)}
     *         - An internal variable (detailed) is set up from the above-mentioned result.
     *
     * - Setting of an internal variable (MIX ITEM NO)
     *     - An internal variable (details) . MIX TAG FLAG performs the following processings to all the data of "Y."
     *       - The item of an internal variable (detailed) is set to the following items of {@link Ws2501MixedTagItemCriteriaDomain}.
     *           - mixTagNo / MIX TAG NO
     *     - {@link WsBhtEisProductDao#searchMixedTagItem(Ws2501MixedTagItemCriteriaDomain)}
     *       - An internal variable (MIX ITEM NO) is set up from the above-mentioned result.
     *
     * - input check (clarify the order of a check)
     *     - An internal variable (details) . acquisition flag carries out the data of "N" the outside of a checked object.
     *       - Correlation check
     *       - ITEM-NO check
     *       - Multiple Item No. in 1Box PKG check
     *       - When an error occurs
     *         - CML-Error-Report-Header registration
     *           - The following items are set to {@link TtCmlErrorHeaderDomain}.
     *               - Internal variable (header)
     *           - This is a call about {@link TtCmlErrorHeaderService#create(TtCmlErrorHeaderDomain)}.
     *         - CML-Error-Report-Detail registration
     *           - The following items are set to {@link TtCmlErrorDtlDomain}.
     *               - Internal variable (details)
     *               - Result of acquisition of a time stamp
     *           - This is a call about {@link TtCmlErrorDtlService#create(TtCmlErrorDtlDomain)}.
     *
     * - Exterior sign check
     *     - The combination of an internal variable (header) and an internal variable (details) is checked.
     *
     * Acquisition of - Main Mark
     *     - This is a call about {@link CommonService#transactSequence(String, String, int, String)}.
     *
     * - Firm-order-receipt alloc processing
     *     - Alloc of a firm order receipt
     *       - A MIX TAG FLAG performs the following processings to all the records of "N" in an internal variable (details).
     *         - Alloc of a firm order receipt
     *           - The item of an internal variable (header) is set to the following items of {@link Ws2501TtExpRcvOdrCriteriaDomain}.
     *               - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *               - customerCd / CUSTOMER CODE
     *               - lgcyShipTo / LEGACY SHIP TO
     *           - The item of an internal variable (detailed) is set to the following items of {@link Ws2501TtExpRcvOdrCriteriaDomain}.
     *               - itemNo / ITEM NO
     *               - pkgCd / PACKAGE CODE
     *           - A sort order is set to {@link Ws2501TtExpRcvOdrCriteriaDomain}.
     *               - ETD_DUE_DT ascending order
     *               - CUSTOMER_PO_NO ascending order
     *               - ODR_CTRL_NO ascending order
     *           - This is a call about {@link TtExpRcvOdrService#searchByCondition(TtExpRcvOdrCriteriaDomain)}.
     *           It draws with two or more orders until the QUANTITY of - object record is set to 0.
     *             - Export Receive Order Update
     *               - A calculated value and a judgment result are set to the following items of {@link TtExpRcvOdrDomain}.
     *                   - pltzAllocQty / Alloc QTY
     *                   - shippedTyp / SHIPPED TYPE
     *               - The above-mentioned search results are set to the item KEY of {@link TtExpRcvOdrCriteriaDomain}.
     This is a call about * - {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}.
     *             - Registration of the ordering information for a Palletize
     *               - The following items are set to {@link TtPltzItemDomain}.
     *                   Result of acquisition of - Main Mark
     *                   - Internal variable (details)
     *               - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *
     * Registration of - Palletize Item Receive Order (this is copy registration of an alloc finishing order received to a MIX tag)
     *     - data acquisition
     *       - The VALUE of an internal variable (MIXED ITEM NO) is set to the following items of {@link TtMixtagOdrCriteriaDomain}.
     *           - mixTagNo / MIX TAG NO
     *           - itemNo / ITEM NO
     *           - pkgCd / PACKAGE CODE
     *       - This is a call about {@link TtMixtagOdrService#searchByCondition(TtMixtagOdrCriteriaDomain)}.
     *     - Palletize-Item-Receive-Order registration
     *       - The following items are set to {@link TtPltzItemOdrDomain}.
     *           Result of acquisition of - Main Mark
     *           - Internal variable (MIX ITEM NO)
     *           - The above-mentioned data acquisition result
     *       - This is a call about {@link TtPltzItemOdrService#create(TtPltzItemOdrDomain)}.
     *
     * Register - Palletize-Item data (ITEM NO).
     *     - The contents of registration (ITEM NO)
     *       - A MIX TAG FLAG performs the following processings to all the records of "N" in an internal variable (details).
     *         - The following items are set to {@link TtPltzItemDomain}.
     *             Result of acquisition of - Main Mark
     *             - Internal variable (details)
     *         - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *     - The contents of registration (MIX ITEM NO)
     *       - The following processings are performed to all the records of an internal variable (MIX ITEM NO).
     *         - The following items are set to {@link TtPltzItemDomain}.
     *             Result of acquisition of - Main Mark
     *             - Internal variable (MIXED ITEM NO)
     *         - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *
     * Register - Palletize-Item data (packing).
     *     - Registration of a Packing material (registration of the data acquired from the packing specification)
     *       - A MIX TAG FLAG performs the following processings to all the records of "N" in an internal variable (details).
     *         - Acquisition of a Packing material
     *           - The VALUE of an internal variable (detailed) is set to the following items of {@link Ws2501PkgSpecMaterialsNameRevCriteriaDomain}.
     *             - itemNo
     *             - pkgCd
     *           - The VALUE of an internal variable (header) is set to the following items of {@link Ws2501PkgSpecMaterialsNameRevCriteriaDomain}.
     *             - compCd
     *             - trnsCd
     This is a call about * - {@link WsBhtEisProductDao#searchPkgSpecMaterialsNameRev(Ws2501PkgSpecMaterialsNameRevCriteriaDomain)}.
     *         - Calculation of a Packing-material USE QUANTITY
     *         - Total of a Packing-material USE QUANTITY
     *         Registration of - Palletize Item
     *           - The following items are set to {@link TtPltzItemDomain}.
     *               Result of acquisition of - Main Mark
     *               - Result of a total of a Packing-material USE QUANTITY
     *           - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *     - Registration of a Packing material (registration of the data acquired from the MIX tag)
     *       - A MIX TAG FLAG performs the following processings to all the records of "Y" in an internal variable (details).
     *         Acquisition of - Mix Tag RT
     *           - The VALUE of an internal variable (detailed) is set to the following items of {@link TtMixtagRtCriteriaDomain}.
     *               - mixTagNo / MIX TAG NO
     *           - This is a call about {@link TtMixtagRtService#searchByCondition(TtMixtagRtCriteriaDomain)}.
     *         Registration of - Palletize Item
     *           - The following items are set to {@link TtPltzItemDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable header
     *               Result of acquisition of - Mix Tag RT
     *           - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *     - Registration of a Packing material (registration of the data acquired from exterior cases)
     *       - It carries out, only when an internal variable (header) . exterior sign has a setting.
     *         - A packing combination master (details), a PKG Materials MA, a PKG Materials Name MA, NEXUS-Company-Master acquisition
     *           - shipperCd of an internal variable (header) and outerPkgCd are set to the following items of {@link Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain}.
     *             - ownerComp
     *             - outerPkgCd
     This is a call about * - {@link WsBhtEisProductDao#searchPkgSetMaterialsNxsCompNm(Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain)}.
     *         Registration of - Palletize Item
     *           - The following items are set to {@link TtPltzItemDomain}.
     *               Result of acquisition of - Main Mark
     *               - Result of a packing combination master (details), a PKG Materials MA, a PKG Materials Name MA, and NEXUS-Company-Master acquisition
     *           - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *     - Registration of a Packing material (registration of a dummy Packing material)
     *       - The following processings are performed to all parameter . PACKAGE ITEM NOs.
     *         - Acquisition of a PKG Materials MA, a PKG Materials Name MA, and a NEXUS Company Master
     *           - shipperCd of an internal variable (header) is set to the following items of {@link Ws2501PkgMaterialsCriteriaDomain}.
     *             - ownerComp
     *           - pkgItemNo of the PACKAGE-ITEM-NO list of EisProduct search-condition domains is set to the following items of {@link Ws2501PkgMaterialsCriteriaDomain}.
     *             - pkgItemNo
     *           - This is a call about {@link WsBhtEisProductDao#searchPkgMaterials(Ws2501PkgMaterialsCriteriaDomain)}.
     *         Registration of - Palletize Item
     *           - The following items are set to {@link TtPltzItemDomain}.
     *               Result of acquisition of - Main Mark
     *               - Result of acquisition of a PKG Materials MA, a PKG Materials Name MA, and a NEXUS Company Master
     *               pkgQty of the PACKAGE-ITEM-NO list of - EisProduct search-condition domains
     *           - This is a call about {@link TtPltzItemService#create(TtPltzItemDomain)}.
     *
     * Register - Palletize-Item-KANBAN data.
     *     - This is registration of a link KANBAN information to an ITEM NO.
     *       - The following processings are performed to all the data of an internal variable (details) . KANBAN list.
     *           - The following items are set to {@link TtPltzKanbanDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable details
     *           - This is a call about {@link TtPltzKanbanService#create(TtPltzKanbanDomain)}.
     *     This is registration of a link KANBAN information to - MIX tag.
     *       - The following processings are performed to all the data of an internal variable (MIX ITEM NO).
     *         - Mix-Tag-KANBAN acquisition
     *           - shipperCd of an internal variable (MIX ITEM NO) is set to the following items of {@link TtMixKanbanCriteriaDomain}.
     *               - mixTagNo / MIX TAG NO
     *               - itemNo / ITEM NO
     *               - pkgCd / PACKAGE CODE
     *           - This is a call about {@link TtMixKanbanService#searchByCondition(TtMixKanbanCriteriaDomain)}.
     *         - Palletize-Item-KANBAN registration
     *           - The following items are set to {@link TtPltzKanbanDomain}.
     *               Result of acquisition of - Main Mark
     *               - Internal variable (MIX ITEM NO)
     *               Result of - Mix-Tag-KANBAN acquisition
     *           - This is a call about {@link TtPltzKanbanService#create(TtPltzKanbanDomain)}.
     *
     * - Palletize data is registered.
     *     - Acquisition of a WEIGHT, a VOLUME, and a LENGTH UNIT
     *       - shipperCd of an internal variable header is made into an argument, and this is a call about {@link CommonService#searchWeightUnit(String)}.
     *       - shipperCd of an internal variable header is made into an argument, and this is a call about {@link CommonService#searchLengthUnit(String)}.
     *       - shipperCd of an internal variable header is made into an argument, and this is a call about {@link CommonService#searchVolumeUnit(String)}.
     *     Acquisition of - N/W
     *       - A MainMark acquisition result is set to the following items of {@link Ws2501TtPltzItemNwCriteriaDomain}.
     *         - mainMark
     *       - This is a call about {@link WsBhtEisProductDao#searchTtPltzItemNw(Ws2501TtPltzItemNwCriteriaDomain)}.
     *       - This is a call about {@link CommonService#convertWeightUnit (BigDecimal, String, String)}.
     *     Acquisition of - G/W
     *       - A MainMark acquisition result is set to the following items of {@link Ws2501TtPltzItemGwCriteriaDomain}.
     *         - mainMark
     *       - This is a call about {@link WsBhtEisProductDao#searchTtPltzItemGw(Ws2501TtPltzItemGwCriteriaDomain)}.
     *       - This is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *     - Acquisition of a DUE DATE
     *       - A MainMark acquisition result is set to the following items of {@link Ws2501TtPltzItemDeliveryTimeCriteriaDomain}.
     *         - mainMark
     This is a call about * - {@link WsBhtEisProductDao#searchTtPltzItemDeliveryTime(Ws2501TtPltzItemDeliveryTimeCriteriaDomain)}.
     *     - Registration processing (Palletize)
     *       - The following items are set to {@link TtPltzDomain}.
     *           Result of acquisition of - Main Mark
     *           - Internal variable (header)
     *           - Internal variable (details)
     *           - Result of acquisition of a WEIGHT, a VOLUME, and a LENGTH UNIT
     *           Result of acquisition of - N/W
     *           Result of acquisition of - G/W
     *           - Result of acquisition of a DUE DATE
     *       - This is a call about {@link TtPltzService#create (TtPltzDomain)}.
     *
     * - Mix-Tag information update processing
     *     - MIX_TAG_FLG performs the following processings to all the records of "Y" in an internal variable (details).
     *       Update of - MULTI ITEM NO IN BOX STATUS
     *         - 20:Issue CML is set to the following items of {@link TtMixtagDomain}.
     *             - mixTagStatus / MULTI ITEM NO IN BOX STATUS
     *         - itemNo of an internal variable (detailed) is set to {@link TtMixtagCriteriaDomain}.
     *             - mixTagNo / MIX TAG NO
     *       - {@link TtMixtagService#updateByCondition(TtMixtagDomain, TtMixtagCriteriaDomain)}
     *
     * - A Temp Stock is updated and registered.
     *     - MIX_TAG_FLG performs the following processings to all the records of "N" in an internal variable (details).
     *       - Acquisition of a Temp Stock
     *         - The item of an internal variable (header) is set to the following items of {@link TtTmpStockCriteriaDomain}.
     *             - shipperCd / Shipper CD
     *             - lgcyWhCd / LEGACY WAREHOUSE CODE
     *         - The item of an internal variable (detailed) is set to the following items of {@link TtTmpStockCriteriaDomain}.
     *             - itemNoList / ITEM-NO list
     *             - pkgCdList / PACKAGE-CODE list
     *         - This is a call about {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}.
     *       - Update process of a Temp Stock
     *         - A calculation result is set to the following items of {@link TtTmpStockDomain}.
     *             - qty / QUANTITY
     *         - The result of acquisition of a Temp Stock is set to the key item of {@link TtTmpStockCriteriaDomain}.
     *         - This is a call about {@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}.
     *       - Registration processing of a Temp Stock
     *         - The following items are set to {@link TtTmpStockCriteriaDomain}.
     *             - Result of acquisition of a Temp Stock
     *             - QUANTITY of a calculation result
     *         - This is a call about {@link TtTmpStockService#create(TtTmpStockDomain)}.
     *
     * - Registration of an ordering alloc track record (starting of Web service)
     *     - This is a call about {@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}.
     *
     * Register - BHT productivity data information.
     *     Acquisition of - user's information
     *       - The login ID of criteria is set to the following items of {@link TmUserConfCriteriaDomain}.
     *         - dscId
     *       - This is a call about {@link TmUserConfService#searchByKey(TmUserConfCriteriaDomain)}.
     *     Registration of - BHT-Work-Time table
     *       - The following items are set to {@link TtBhtWorkTimeDomain}.
     *           Result of acquisition of - user's information
     *           - Internal variable (header)
     *           - Parameter
     *           Result of acquisition of - Main Mark
     *       - This is a call about {@link TtBhtWorkTimeService#create(TtBhtWorkTimeDomain)}.
     *     Registration of - BHT Work Time For Palletize
     *       - The following items are set to {@link TtBhtWorkPltzDomain}.
     *           WORK TIME NO at the time of registration of - BHT-Work-Time table
     *           - Internal variable (details)
     *           - Parameter
     *       - This is a call about {@link TtBhtWorkPltzService#create(TtBhtWorkPltzDomain)}.
     *     Registration of - BHT-Work-Error table
     *       - The following items are set to {@link TtBhtWorkErrDomain}.
     *           WORK TIME NO at the time of registration of - BHT-Work-Time table
     *           - Parameter
     *           - Internal variable (header)
     *       - This is a call about {@link TtBhtWorkErrService#create(TtBhtWorkErrDomain)}.
     *
     * - Response of an execution result
     *     - It returns by {@link WsBhtEisProductDomain}.
     *
     * - 内部変数（ヘッダ）の設定
     *   - {@link Ws2501InternalVariableHdrDomain}にcriteriaより設定
     *
     * - 内部変数（明細）の設定
     *   - {@link Ws2501InternalVariableDtlDomain}にcriteriaより内部変数（明細）を設定
     *   - データのロック
     *     - 受注情報のロック
     *       - 内部変数（明細）.MIXタグフラグが"N"のデータ全てに対して以下の処理を行う
     *         - {@link Ws2501TtExpRcvOdrCriteriaDomain}の以下の項目に内部変数（ヘッダ）の項目を設定
     *             - rcvOdrCompCd/受注会社コード
     *             - customerCd/得意先コード
     *             - lgcyShipTo/LEGACY送荷先
     *             - trnsCd/輸送手段コード
     *         - {@link Ws2501TtExpRcvOdrCriteriaDomain}の以下の項目に内部変数（明細）の項目を設定
     *             - itemNo/品目番号
     *             - pkgCd/包装区分
     *         - {@link WsBhtEisProductDao#lockByKeyNoWaitTtExpRcvOdr(Ws2501TtExpRcvOdrCriteriaDomain)}の呼出
     *     - MIXED現品票のロック
     *       - 内部変数（明細）.MIXタグフラグが"Y"のデータ全てに対して以下の処理を行う
     *         - {@link Ws2501TtMixTagCriteriaDomain}の以下の項目に内部変数（明細）の項目を設定
     *             - mixTagNo/MIXタグNO
     *         - {@link WsBhtEisProductDao#lockByConditionNoWaitTtMixTag(Ws2501TtMixTagCriteriaDomain)}の呼出
     *   - 品目番号情報の取得（NEXUS側情報）
     *     - 内部変数（明細）.MIXタグフラグが"N"のデータ全てに対して以下の処理を行う
     *       - {@link Ws2501ItemNoNxsNonInstCriteriaDomain}の以下の項目に内部変数（ヘッダ）の項目を設定
     *           - rcvOdrCompCd/受注会社コード
     *           - customerCd/得意先コード
     *           - lgcyShipTo/LEGACY送荷先
     *           - trnsCd/輸送手段コード
     *           - lgcyWhCd/LEGACY倉庫コード
     *       - {@link Ws2501ItemNoNxsNonInstCriteriaDomain}の以下の項目に内部変数（ヘッダ）の項目を設定
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *       - {@link Ws2501ItemNoNxsNonInstCriteriaDomain}の以下の項目に内部変数（ヘッダ）.荷主コードのタイムゾーン変換日付を設定
     *           - aplyStrtDt/適用開始日
     *       - {@link WsBhtEisProductDao#searchItemNoNxsNonInst(Ws2501ItemNoNxsNonInstCriteriaDomain)}の呼出
     *       - 上記の結果より内部変数（明細）を設定
     *   - 品目番号情報の取得（CIGMA側情報)
     *     - 内部変数（明細）の中でMIXタグフラグが"N"のデータを引数にして、Webサービスをコールする
     *       ※内部変数（明細）の中にMIXタグフラグが"N"のデータが存在しない場合は実施しない
     *       - CIGMAの倉庫コードを選択した場合(内部変数（ヘッダ）.NEXUS倉庫フラグが"N"の場合)
     *         - {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}の呼出
     *       - NEXUSの倉庫コードを選択した場合(内部変数（ヘッダ）.NEXUS倉庫フラグが"Y"の場合)
     *         - {@link TmCigmaWhXrefCriteriaDomain}の以下の項目に内部変数（ヘッダ）の項目を設定
     *             - lgcyLibCompCd/(LEGACYライブラリ)会社コード
     *             - lgcyWhCd/LEGACY倉庫コード
     *         - {@link TmCigmaWhXrefService#searchByCondition(TmCigmaWhXrefCriteriaDomain)}の呼出
     *         - {@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}の呼出
     *       - 数量単位の変換
     *         - {@link TmMeasureUnitCriteriaDomain}の以下の項目に上記の結果
     *             - lgcyUnitCd/LEGACY単位コード
     *         - {@link TmMeasureUnitService#searchByConditionForPaging(TmMeasureUnitCriteriaDomain)}の呼出
     *       - 上記の結果より内部変数（明細）を設定
     *   - MIXE現品票情報の取得
     *     - 内部変数（明細）.MIXタグフラグが"Y"のデータ全てに対して以下の処理を行う
     *       - {@link TtMixtagService#searchByKey(TtMixtagCriteriaDomain)}の呼出
     *       - 上記の結果より内部変数（明細）を設定
     *
     * - 内部変数（MIX品目番号）の設定
     *   - 内部変数（明細）.MIXタグフラグが"Y"のデータ全てに対して以下の処理を行う
     *     - {@link Ws2501MixedTagItemCriteriaDomain}の以下の項目に内部変数（明細）の項目を設定
     *         - mixTagNo/MIXタグNO
     *     - {@link WsBhtEisProductDao#searchMixedTagItem(Ws2501MixedTagItemCriteriaDomain)}
     *     - 上記の結果より内部変数（MIX品目番号）を設定
     *
     * - 入力チェック（チェック順を明確にすること）
     *   - 内部変数（明細）.取得フラグが"N"のデータはチェック対象外とする
     *     - 相関チェック
     *     - 品目番号チェック
     *     - 小箱内多品チェック
     *     - エラーが発生した場合
     *       - CMLエラーレポートヘッダ登録
     *         - {@link TtCmlErrorHeaderDomain}に以下の項目を設定
     *             - 内部変数（ヘッダ）
     *         - {@link TtCmlErrorHeaderService#create(TtCmlErrorHeaderDomain)}を呼出
     *       - CMLエラーレポート明細登録
     *         - {@link TtCmlErrorDtlDomain}に以下の項目を設定
     *             - 内部変数（明細）
     *             - タイムスタンプの取得の結果
     *         - {@link TtCmlErrorDtlService#create(TtCmlErrorDtlDomain)}を呼出
     *
     * - 外装記号チェック
     *   - 内部変数（ヘッダ）、内部変数（明細）の組み合わせを確認する
     *
     * - Main Markの取得
     *   - {@link CommonService#transactSequence(String, String, int, String)}を呼出
     *
     * - 確定受注引当処理
     *   - 確定受注の引当
     *     - 内部変数（明細）の中でMIXタグフラグが"N"のレコード全てに対して、以下の処理を行う
     *       - 確定受注の引当
     *         - {@link Ws2501TtExpRcvOdrCriteriaDomain}の以下の項目に内部変数（ヘッダ）の項目を設定
     *             - rcvOdrCompCd/受注会社コード
     *             - customerCd/得意先コード
     *             - lgcyShipTo/LEGACY送荷先
     *         - {@link Ws2501TtExpRcvOdrCriteriaDomain}の以下の項目に内部変数（明細）の項目を設定
     *             - itemNo/品目番号
     *             - pkgCd/包装区分
     *         - {@link Ws2501TtExpRcvOdrCriteriaDomain}にソート順を設定
     *             - ETD_DUE_DT 昇順
     *             - CUSTOMER_PO_NO 昇順
     *             - ODR_CTRL_NO 昇順
     *         - {@link TtExpRcvOdrService#searchByCondition(TtExpRcvOdrCriteriaDomain)}を呼出
     *         - 対象レコードの数量が0になるまで、複数のオーダーと引当てる
     *           - 輸出受注更新
     *             - {@link TtExpRcvOdrDomain}の以下の項目に計算値と判定結果を設定
     *                 - pltzAllocQty/梱包引当数量
     *                 - shippedTyp/出荷済み区分
     *             - {@link TtExpRcvOdrCriteriaDomain}のKEY項目に上記の検索結果を設定
     *             - {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出
     *           - パレタイズ対象受注情報の登録
     *             - {@link TtPltzItemDomain}に以下の項目を設定
     *                 - Main Markの取得の結果
     *                 - 内部変数（明細）
     *             - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *
     * - パレタイズ対象品受注情報の登録(MIXタグに引当済み受注のコピー登録)
     *   - データ取得
     *     - {@link TtMixtagOdrCriteriaDomain}の以下の項目に内部変数（MIXED品目番号）の値を設定
     *         - mixTagNo/MIXタグNO
     *         - itemNo/品目番号
     *         - pkgCd/包装区分
     *     - {@link TtMixtagOdrService#searchByCondition(TtMixtagOdrCriteriaDomain)}を呼出
     *   - パレタイズ対象品受注情報登録
     *     - {@link TtPltzItemOdrDomain}に以下の項目を設定
     *         - Main Markの取得の結果
     *         - 内部変数（MIX品目番号）
     *         - 上記のデータ取得結果
     *     - {@link TtPltzItemOdrService#create(TtPltzItemOdrDomain)}を呼出
     *
     * - パレタイズ対象品データ（品目番号）を登録
     *   - 登録内容（品目番号）
     *     - 内部変数（明細）の中でMIXタグフラグが"N"のレコード全てに対して、以下の処理を行う
     *       - {@link TtPltzItemDomain}に以下の項目を設定
     *           - Main Markの取得の結果
     *           - 内部変数（明細）
     *       - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *   - 登録内容（MIX品目番号）
     *     - 内部変数（MIX品目番号）のレコード全てに対して、以下の処理を行う
     *       - {@link TtPltzItemDomain}に以下の項目を設定
     *           - Main Markの取得の結果
     *           - 内部変数（MIXED品目番号）
     *       - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *
     * - パレタイズ対象品データ（包装）を登録
     *   - 包装材の登録（包装仕様から取得したデータの登録）
     *     - 内部変数（明細）の中でMIXタグフラグが"N"のレコード全てに対して、以下の処理を行う
     *       - 包装材の取得
     *         - {@link Ws2501PkgSpecMaterialsNameRevCriteriaDomain}の以下の項目に内部変数（明細）の値を設定
     *             - itemNo
     *             - pkgCd
     *         - {@link Ws2501PkgSpecMaterialsNameRevCriteriaDomain}の以下の項目に内部変数（ヘッダ）の値を設定
     *             - compCd
     *             - trnsCd
     *         - {@link WsBhtEisProductDao#searchPkgSpecMaterialsNameRev(Ws2501PkgSpecMaterialsNameRevCriteriaDomain)}を呼出
     *       - 包装材使用数の算出
     *       - 包装材使用数の合算
     *       - パレタイズ対象品の登録
     *         - {@link TtPltzItemDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 包装材使用数の合算の結果
     *         - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *   - 包装材の登録（MIXタグから取得したデータの登録）
     *     - 内部変数（明細）の中でMIXタグフラグが"Y"のレコード全てに対して、以下の処理を行う
     *       - MIXED用RT材の取得
     *         - {@link TtMixtagRtCriteriaDomain}の以下の項目に内部変数（明細）の値を設定
     *             - mixTagNo/MIXタグNO
     *         - {@link TtMixtagRtService#searchByCondition(TtMixtagRtCriteriaDomain)}を呼出
     *       - パレタイズ対象品の登録
     *         - {@link TtPltzItemDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数ヘッダ
     *             - MIXED用RT材の取得の結果
     *         - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *   - 包装材の登録（外装材から取得したデータの登録）
     *     - 内部変数（ヘッダ）.外装記号に設定がある場合のみ実施
     *       - 包装組合せ原単位（明細）、包装材原単位、包装材名称原単位、NEXUS会社原単位取得
     *         - {@link Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain}の以下の項目に内部変数（ヘッダ）のshipperCd、outerPkgCdを設定
     *             - ownerComp
     *             - outerPkgCd
     *         - {@link WsBhtEisProductDao#searchPkgSetMaterialsNxsCompNm(Ws2501PkgSetMaterialsNxsCompNmCriteriaDomain)}を呼出
     *       - パレタイズ対象品の登録
     *         - {@link TtPltzItemDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 包装組合せ原単位（明細）、包装材原単位、包装材名称原単位、NEXUS会社原単位取得の結果
     *         - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *   - 包装材の登録（ダミー包装材の登録）
     *     - パラメタ.包装材品目番号全てに対して以下の処理を行う
     *       - 包装材原単位、包装材名称原単位、NEXUS会社原単位の取得
     *         - {@link Ws2501PkgMaterialsCriteriaDomain}の以下の項目に内部変数（ヘッダ）のshipperCdを設定
     *             - ownerComp
     *         - {@link Ws2501PkgMaterialsCriteriaDomain}の以下の項目にEisProduct検索条件ドメインの包装材品目番号リストのpkgItemNoを設定
     *             - pkgItemNo
     *         - {@link WsBhtEisProductDao#searchPkgMaterials(Ws2501PkgMaterialsCriteriaDomain)}を呼出
     *       - パレタイズ対象品の登録
     *         - {@link TtPltzItemDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 包装材原単位、包装材名称原単位、NEXUS会社原単位の取得の結果
     *             - EisProduct検索条件ドメインの包装材品目番号リストのpkgQty
     *         - {@link TtPltzItemService#create(TtPltzItemDomain)}を呼出
     *
     * - パレタイズ対象品かんばん情報データを登録
     *   - 品目番号に紐づくかんばん情報の登録
     *     - 内部変数（明細）.かんばんリストの全てのデータに対して、以下の処理を行う
     *         - {@link TtPltzKanbanDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数明細
     *         - {@link TtPltzKanbanService#create(TtPltzKanbanDomain)}を呼出
     *   - MIXタグに紐づくかんばん情報の登録
     *     - 内部変数（MIX品目番号）のデータ全てに対して、以下の処理を行う
     *       - MIX品かんばん情報取得
     *         - {@link TtMixKanbanCriteriaDomain}の以下の項目に内部変数（MIX品目番号）のshipperCdを設定
     *             - mixTagNo/MIXタグNO
     *             - itemNo/品目番号
     *             - pkgCd/包装区分
     *         - {@link TtMixKanbanService#searchByCondition(TtMixKanbanCriteriaDomain)}を呼出
     *       - パレタイズ対象品かんばん情報登録
     *         - {@link TtPltzKanbanDomain}に以下の項目を設定
     *             - Main Markの取得の結果
     *             - 内部変数（MIX品目番号）
     *             - MIX品かんばん情報取得の結果
     *         - {@link TtPltzKanbanService#create(TtPltzKanbanDomain)}を呼出
     *
     * - パレタイズデータを登録
     *   - 重量・容積・長さ単位の取得
     *     - 内部変数ヘッダのshipperCdを引数にして、{@link CommonService#searchWeightUnit(String)}を呼出
     *     - 内部変数ヘッダのshipperCdを引数にして、{@link CommonService#searchLengthUnit(String)}を呼出
     *     - 内部変数ヘッダのshipperCdを引数にして、{@link CommonService#searchVolumeUnit(String)}を呼出
     *   - N/Wの取得
     *     - {@link Ws2501TtPltzItemNwCriteriaDomain}の以下の項目にMainMark取得結果を設定
     *         - mainMark
     *     - {@link WsBhtEisProductDao#searchTtPltzItemNw(Ws2501TtPltzItemNwCriteriaDomain)}を呼出
     *     - {@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *   - G/Wの取得
     *     - {@link Ws2501TtPltzItemGwCriteriaDomain}の以下の項目にMainMark取得結果を設定
     *         - mainMark
     *     - {@link WsBhtEisProductDao#searchTtPltzItemGw(Ws2501TtPltzItemGwCriteriaDomain)}を呼出
     *     - {@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *   - 納期の取得
     *     - {@link Ws2501TtPltzItemDeliveryTimeCriteriaDomain}の以下の項目にMainMark取得結果を設定
     *         - mainMark
     *     - {@link WsBhtEisProductDao#searchTtPltzItemDeliveryTime(Ws2501TtPltzItemDeliveryTimeCriteriaDomain)}を呼出
     *   - 登録処理(パレタイズ)
     *     - {@link TtPltzDomain}に以下の項目を設定
     *         - Main Markの取得の結果
     *         - 内部変数（ヘッダ）
     *         - 内部変数（明細）
     *         - 重量・容積・長さ単位の取得の結果
     *         - N/Wの取得の結果
     *         - G/Wの取得の結果
     *         - 納期の取得の結果
     *     - {@link TtPltzService#create(TtPltzDomain)}を呼出
     *
     * - MIXED現品票情報更新処理
     *   - 内部変数（明細）の中でMIX_TAG_FLGが"Y"のレコード全てに対して、以下の処理を行う
     *     - 小箱内多品ステータス更新
     *       - {@link TtMixtagDomain}の以下の項目に20:Issue CMLを設定
     *           - mixTagStatus/小箱内多品ステータス
     *       - {@link TtMixtagCriteriaDomain}に内部変数（明細）のitemNoを設定
     *           - mixTagNo/MIXタグNO
     *       - {@link TtMixtagService#updateByCondition(TtMixtagDomain, TtMixtagCriteriaDomain)}
     *
     * - 仮在庫を更新・登録
     *   - 内部変数（明細）の中でMIX_TAG_FLGが"N"のレコード全てに対して、以下の処理を行う
     *     - 仮在庫の取得
     *       - {@link TtTmpStockCriteriaDomain}の以下の項目に内部変数（ヘッダ）の項目を設定
     *           - shipperCd/荷主コード
     *           - lgcyWhCd/LEGACY倉庫コード
     *       - {@link TtTmpStockCriteriaDomain}の以下の項目に内部変数（明細）の項目を設定
     *           - itemNoList/品目番号リスト
     *           - pkgCdList/包装区分リスト
     *       - {@link TtTmpStockService#lockByKeyNoWait(TtTmpStockCriteriaDomain)}を呼出
     *     - 仮在庫の更新処理
     *       - {@link TtTmpStockDomain}の以下の項目に計算結果を設定
     *           - qty/数量
     *       - {@link TtTmpStockCriteriaDomain}のキー項目に仮在庫の取得の結果を設定
     *       - {@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}を呼出
     *     - 仮在庫の登録処理
     *       - {@link TtTmpStockCriteriaDomain}に以下の項目を設定
     *           - 仮在庫の取得の結果
     *           - 計算結果の数量
     *       - {@link TtTmpStockService#create(TtTmpStockDomain)}を呼出
     *
     * - 受注引当実績の登録（Webサービスの起動）
     *   - {@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}を呼出
     *
     * - BHT生産性データ情報を登録
     *   - ユーザー情報の取得
     *     - {@link TmUserConfCriteriaDomain}の以下の項目にcriteriaのログインIDを設定
     *         - dscId
     *     - {@link TmUserConfService#searchByKey(TmUserConfCriteriaDomain)}を呼出
     *   - BHT作業時間テーブルの登録
     *     - {@link TtBhtWorkTimeDomain}に以下の項目を設定
     *         - ユーザー情報の取得の結果
     *         - 内部変数（ヘッダ）
     *         - パラメタ
     *         - Main Markの取得の結果
     *     - {@link TtBhtWorkTimeService#create(TtBhtWorkTimeDomain)}を呼出
     *   - BHT作業情報テーブル(パレタイズ)の登録
     *     - {@link TtBhtWorkPltzDomain}に以下の項目を設定
     *         - BHT作業時間テーブルの登録時の作業時間NO
     *         - 内部変数（明細）
     *         - パラメタ
     *     - {@link TtBhtWorkPltzService#create(TtBhtWorkPltzDomain)}を呼出
     *   - BHT作業エラーテーブルの登録
     *     - {@link TtBhtWorkErrDomain}に以下の項目を設定
     *         - BHT作業時間テーブルの登録時の作業時間NO
     *         - パラメタ
     *         - 内部変数（ヘッダ）
     *     - {@link TtBhtWorkErrService#create(TtBhtWorkErrDomain)}を呼出
     *
     * - 実行結果のレスポンス
     *   - {@link WsBhtEisProductDomain}で返却
     * </pre>
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product検索条件ドメイン
     * @return Eis Product domain<br />Eis Productドメイン
     * @throws ApplicationException When a database cannot be accessed<br />データベースにアクセスできない場合
     */
    public abstract WsBhtEisProductDomain transactOnNonInstPltz(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2504_Create E-RT Palletize -------------------------------------------
    /**
     *    [ws2504] L/D CD's existence check
     * <br />[ws2504]荷積位置コードを存在チェックします。
     *
     * <pre>
     * - Also when there is an error on the way, all the checks are performed.
     *     All the check sets '1' (abnormal end) to a CD as a result of the internal variable ., when an after-completion error is also one.
     *     An execution result is outputted.
     *
     * - 途中でエラーがあった場合も全てのチェックを行う。
     *   全てのチェックが完了後エラーが1つでもあった場合は内部変数.結果コードに'1'（異常終了）をセットし
     *   実行結果を出力する
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param loadingCd L/D CD<br />荷積位置コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseLoadPositionCd(String languageCd, String loadingCd) throws ApplicationException ;

    /**
     *    [ws2504] TRANSPORT CODE's existence check
     * <br />[ws2504]輸送手段コードを存在チェックします。
     *
     * <pre>
     * - Also when there is an error on the way, all the checks are performed.
     *     All the check sets '1' (abnormal end) to a CD as a result of the internal variable ., when an after-completion error is also one.
     *     An execution result is outputted.
     *
     * - 途中でエラーがあった場合も全てのチェックを行う。
     *   全てのチェックが完了後エラーが1つでもあった場合は内部変数.結果コードに'1'（異常終了）をセットし
     *   実行結果を出力する
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param trnsCd TRANSPORT-CODE conditions<br />輸送手段コード条件
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTransWayCd(String languageCd, String trnsCd) throws ApplicationException ;

    /**
     *    [ws2504] Freight-Res conditions' existence check
     * <br />[ws2504]運賃支払い条件を存在チェックします。
     *
     * <pre>
     * - Also when there is an error on the way, all the checks are performed.
     *     All the check sets '1' (abnormal end) to a CD as a result of the internal variable ., when an after-completion error is also one.
     *     An execution result is outputted.
     *
     * - 途中でエラーがあった場合も全てのチェックを行う。
     *   全てのチェックが完了後エラーが1つでもあった場合は内部変数.結果コードに'1'（異常終了）をセットし
     *   実行結果を出力する
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param payTerms Freight-Res conditions<br />運賃支払い条件
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabasePayFare(String languageCd, String payTerms) throws ApplicationException ;

    /**
     *    [ws2504] PRICE TERMS's existence check
     * <br />[ws2504]建値区分を存在チェックします。
     *
     * <pre>
     * - Also when there is an error on the way, all the checks are performed.
     *     All the check sets '1' (abnormal end) to a CD as a result of the internal variable ., when an after-completion error is also one.
     *     An execution result is outputted.
     *
     * - 途中でエラーがあった場合も全てのチェックを行う。
     *   全てのチェックが完了後エラーが1つでもあった場合は内部変数.結果コードに'1'（異常終了）をセットし
     *   実行結果を出力する
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param priceTerms Price quotation<br />建値
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseQuotesCd(String languageCd, String priceTerms) throws ApplicationException ;

    /**
     *    [ws2504] Export Ship To Shipping Master's existence check
     * <br />[ws2504]輸出送荷先出荷原単位を存在チェックします。
     *
     * <pre>
     * - This is confirmed whether the combination of the Shipper CD read into the Export Ship To Shipping Master and a SHIP TO CODE (between bases) exists.
     *
     * - 輸出送荷先出荷原単位に読み込んだ荷主コード、送荷先コード(拠点間)の組合せが存在するかをチェックする
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param shipToCd SHIP TO CODE (between bases)<br />送荷先コード(拠点間)
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmExpShipToShippingOnErtPltz(
        String shipperCd, String shipToCd) throws ApplicationException;

    /**
     *    [ws2504] Ship-to master COMPANY CODE's existence check
     * <br />[ws2504]送荷先原単位会社コードを存在チェックします。
     *
     * <pre>
     * - A Ship-to master COMPANY CODE's existence check is performed.
     *
     * - 送荷先原単位会社コードの存在チェックを行う
     * </pre>
     *
     * @param shipToCd SHIP TO CODE (between bases)<br />送荷先コード(拠点間)
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmNxsShipToOnErtPltz(
        String shipToCd) throws ApplicationException;

    /**
     *    [ws2504] unit's existence check
     * <br />[ws2504]単位を存在チェックします。
     *
     * <pre>
     * Confirm whether to exist in a Measure Unit Master about the WEIGHT UNIT of a parameter, a LENGTH UNIT, and a Unit of Vol.
     * - W/H Company CD (between bases)
     * The check of - W/H CD (between bases)
     *
     * パラメタの重量単位、長さ単位、容積単位について、計量単位原単位に存在するかそれぞれチェックをする
     * - 倉庫会社コード(拠点間)
     * - 倉庫コード(拠点間)のチェック
     * </pre>
     *
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param weightUnit WEIGHT UNIT<br />重量単位
     * @param lengthUnit LENGTH UNIT<br />長さ単位
     * @param volumeUnit Unit of Vol.<br />容積単位
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract int validateDatabaseTmNxsCompOnErtPltz(
        String shipperCd,
        String weightUnit,
        String lengthUnit,
        String volumeUnit) throws ApplicationException;

    /**
     *    [ws2504] W/H Company and NEXUS W/H Combination check
     * <br />[ws2504]W/H Company、NEXUS W/H を組み合わせチェックします。
     *
     * <pre>
     * - This is a call about {@link CommonService#validateCompWh(String, String)}.
     * - Existence check
     *       An error is made when it does not exist.
     *
     * - {@link CommonService#validateCompWh(String, String)}を呼出
     * - 存在チェック
     *     存在しない場合エラー
     * </pre>
     *
     * @param compCd COMPANY CODE<br />会社コード
     * @param whCd W/H CD<br />倉庫コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a NEXUS Warehouse Master and a CIGMA Warehouse Cross Reference Master cannot be referred to<br />倉庫原単位、倉庫クロスリファレンス原単位を参照できない場合
     */
    public abstract boolean validateDatabaseTmNxsWhOnErtPltz(String compCd, String whCd) throws ApplicationException;

    /**
     *    [ws2504] Packing-material related check
     * <br />[ws2504]包装材を関連チェックします。
     *
     * <pre>
     * Repeat only the number of parameter . list of PACKAGE ITEM NOs.
     * - RT material check
     * - CURRENCY-CODE coincidence check
     *
     * パラメタ.包装材品番リストの数だけ繰り返す
     * - RT材チェック
     * - 通貨コード一致チェック
     * </pre>
     *
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param whCompCd W/H Company CD (between bases)<br />倉庫会社コード(拠点間)
     * @param lgcyWhCd W/H CD (between bases)<br />倉庫コード(拠点間)
     * @param pkgItemNoList List of PACKAGE ITEM NO<br />包装材品番リスト
     * @param resultList Result list<br />結果リスト
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseShipperWhPlant(
        String shipperCd,
        String whCompCd,
        String lgcyWhCd,
        List<? extends Ws2504PkgItemNoCriteriaDomain> pkgItemNoList,
        List<String> resultList) throws ApplicationException;


    /**
     *    Registration of a [ws2504] E-RT Palletize
     * <br />[ws2504]E-RTパレタイズを登録します。
     *
     * <pre>
     * A calculation of - NET WEIGHT
     * Acquisition of - Main Mark
     * - Registration of a Palletize information
     * Registration of - Palletize-Item information
     *
     * - NET重量の算出
     * - Main Markの取得
     * - パレタイズ情報の登録
     * - パレタイズ対象品情報の登録
     * </pre>
     *
     * @param criteriaDomain Registration information domain<br />登録情報ドメイン
     * @return Registration information domain<br />登録情報ドメイン
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract WsBhtEisProductDomain transactOnErtPltz(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2505_Create PKG Spec -------------------------------------------------
    /**
     *    [ws2505] NEXUS-Company-Master existence check
     * <br />[ws2505]NEXUS会社原単位を存在チェックします。
     *
     * <pre>
     * Acquisition of - NEXUS Company Master
     *     - compCd is set to the following items of {@link TmNxsCompCriteriaDomain}.
     *         - compCd / COMPANY CODE
     *     - This is a call about {@link TmNxsCompService#searchByKey (TmNxsCompCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5007).
     *
     * - NEXUS会社原単位の取得
     *   - {@link TmNxsCompCriteriaDomain}の以下の項目にcompCdを設定
     *       - compCd/会社コード
     *   - {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5007)
     * </pre>
     *
     * @param compCd COMPANY CODE<br />会社コード
     * @param itemNoGrp ITEM-NO-GROUP  * For return VALUEs<br />品目番号グループ ※戻り値用
     * @param timeZone TIMEZONE-ID  * For return VALUEs<br />タイムゾーンID ※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a NEXUS Company Master cannot be referred to<br />NEXUS会社原単位を参照できない場合
     */
    public abstract boolean validateDatabaseCompCd(String compCd, String[] itemNoGrp, String[] timeZone) throws ApplicationException;

    /**
     *    [ws2505] PKG-Specification-MA(Detail) existence check
     * <br />[ws2505]包装仕様原単位(明細)を存在チェックします。
     *
     * <pre>
     * Acquisition of - PKG Specification MA(Detail)
     *     This is an argument about - criteria.
     *       This is a call about {@link TmPkgSpecDtlService#searchByCondition (TmPkgSpecDtlCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5060).
     *
     * - 包装仕様原単位(明細)の取得
     *   - criteriaを引数に
     *     {@link TmPkgSpecDtlService#searchByCondition(TmPkgSpecDtlCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5060)
     * </pre>
     *
     * @param criteria PKG-Specification-MA(Detail) search-condition domain<br />包装仕様原単位(ヘッダ)検索条件ドメイン
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a PKG Specification MA(Detail) cannot be referred to<br />包装仕様原単位(明細)を参照できない場合
     */
    public abstract boolean validateDatabaseTmPkgSpecHdrOnPkgSpec(TmPkgSpecHdrCriteriaDomain criteria) throws ApplicationException;

    /**
     *    The registration/update of [ws2505] Package Specification Revision Master
     * <br />[ws2505]包装仕様有効リビジョン原単位を登録/更新します。
     *
     * <pre>
     * The lock of - Package Specification Revision Master
     *     - The same name item of criteria is set to the following items of {@link TmPkgSpecRevCriteriaDomain}.
     *         - compCd / COMPANY CODE
     *         - itemNoGrp / ITEM NO GROUP
     *         - itemNo / ITEM NO
     *         - pkgCd / PACKAGE CODE
     *         - trnsCd / TRANSPORT CODE
     *         - isltdPurchaseFlg / ISOLATED PURCHASE
     *         - isltdStorageFlg / ISOLATED STORAGE
     *         - isltdShippingFlg / ISOLATED SHIPPING
     *         - nProc / NEXT PROCESS
     *     - This is a call about {@link TmPkgSpecRevService#lockByKeyNoWait(TmPkgSpecRevCriteriaDomain)}.
     *
     * Only when the result of the lock of - Package Specification Revision Master is able to be acquired, carry out.
     *     - Acquisition of a BRANCH
     *       - The same name item of criteria is set to the following items of {@link TmPkgSpecRevCriteriaDomain}.
     *           - compCd / COMPANY CODE
     *           - itemNoGrp / ITEM NO GROUP
     *           - itemNo / ITEM NO
     *           - pkgCd / PACKAGE CODE
     *           - trnsCd / TRANSPORT CODE
     *           - isltdPurchaseFlg / ISOLATED PURCHASE
     *           - isltdStorageFlg / ISOLATED STORAGE
     *           - isltdShippingFlg / ISOLATED SHIPPING
     *           - nProc / NEXT PROCESS
     *       - This is a call about {@link WsBhtEisProductDao#searchPkgSpecRevHis(Ws2501PkgSpecRevHisCriteriaDomain)}.
     *       - Add 1 to the BRANCH
     *
     *     - Table registration, update
     *       Registration of - Package Specification Revision History Master
     *         - In the following items of {@link TmPkgSpecRevHisDomain}
     *           The same name item of {@link TmPkgSpecRevHisDomain} is set up as a result of the lock of a Package Specification Revision Master.
     *             - compCd / COMPANY CODE
     *             - itemNoGrp / ITEM NO GROUP
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *             - trnsCd / TRANSPORT CODE
     *             - isltdPurchaseFlg / ISOLATED PURCHASE
     *             - isltdStorageFlg / ISOLATED STORAGE
     *             - isltdShippingFlg / ISOLATED SHIPPING
     *             - nProc / NEXT PROCESS
     *             - rev / REVISION
     *             - aplyStrtDt / APPLY START DATE
     *         - The result of acquisition of a BRANCH is set to {@link TmPkgSpecRevHisDomain#brch}.
     *         - This is a call about {@link TmPkgSpecRevHisService#create(TmPkgSpecRevHisDomain)}.
     *
     *       Update of - Package Specification Revision Master
     *         - The same name item of criteria is set to the following items of {@link TmPkgSpecRevDomain}.
     *             - rev / REVISION
     *         - A time zone converted date is set to the following items of {@link TmPkgSpecRevDomain}.
     *             - aplyStrtDt / APPLY START DATE
     *
     *         - The same name item of criteria is set to the following items of {@link TmPkgSpecRevCriteriaDomain}.
     *             - compCd / COMPANY CODE
     *             - itemNoGrp / ITEM NO GROUP
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *             - trnsCd / TRANSPORT CODE
     *             - isltdPurchaseFlg / ISOLATED PURCHASE
     *             - isltdStorageFlg / ISOLATED STORAGE
     *             - isltdShippingFlg / ISOLATED SHIPPING
     *             - nProc / NEXT PROCESS
     *
     This is a call about * - {@link TmPkgSpecRevService#updateByCondition(TmPkgSpecRevDomain, TmPkgSpecRevCriteriaDomain)}.
     *
     * Only when the result of the lock of - Package Specification Revision Master cannot be acquired, carry out.
     *     - Table registration, update
     *       Registration of - Package Specification Revision Master
     *         - The same name item of criteria is set to the following items of {@link TmPkgSpecRevDomain}.
     *             - compCd / COMPANY CODE
     *             - itemNoGrp / ITEM NO GROUP
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *             - trnsCd / TRANSPORT CODE
     *             - isltdPurchaseFlg / ISOLATED PURCHASE
     *             - isltdStorageFlg / ISOLATED STORAGE
     *             - isltdShippingFlg / ISOLATED SHIPPING
     *             - nProc / NEXT PROCESS
     *             - rev / REVISION
     *         - A time zone converted date is set to the following items of {@link TmPkgSpecRevDomain}.
     *             - aplyStrtDt / APPLY START DATE
     *         - This is a call about {@link TmPkgSpecRevService#create(TmPkgSpecRevDomain)}.
     *
     * - 包装仕様有効リビジョン原単位のロック
     *   - {@link TmPkgSpecRevCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *       - compCd/会社コード
     *       - itemNoGrp/品目番号グループ
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - trnsCd/輸送手段コード
     *       - isltdPurchaseFlg/層別（購入）
     *       - isltdStorageFlg/層別（入庫）
     *       - isltdShippingFlg/層別（出荷）
     *       - nProc/次区
     *   - {@link TmPkgSpecRevService#lockByKeyNoWait(TmPkgSpecRevCriteriaDomain)}を呼出
     *
     * - 包装仕様有効リビジョン原単位のロックの結果が取得できた場合のみ実施する
     *   - 枝番の取得
     *     - {@link TmPkgSpecRevCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *         - compCd/会社コード
     *         - itemNoGrp/品目番号グループ
     *         - itemNo/品目番号
     *         - pkgCd/包装区分
     *         - trnsCd/輸送手段コード
     *         - isltdPurchaseFlg/層別（購入）
     *         - isltdStorageFlg/層別（入庫）
     *         - isltdShippingFlg/層別（出荷）
     *         - nProc/次区
     *     - {@link WsBhtEisProductDao#searchPkgSpecRevHis(Ws2501PkgSpecRevHisCriteriaDomain)}を呼出
     *     - 枝番に1を加算
     *
     *   - テーブル登録、更新
     *     - 包装仕様有効リビジョン履歴原単位の登録
     *       - {@link TmPkgSpecRevHisDomain}の以下の項目に
     *         包装仕様有効リビジョン原単位のロックの結果{@link TmPkgSpecRevHisDomain}の同名項目を設定
     *           - compCd/会社コード
     *           - itemNoGrp/品目番号グループ
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *           - trnsCd/輸送手段コード
     *           - isltdPurchaseFlg/層別（購入）
     *           - isltdStorageFlg/層別（入庫）
     *           - isltdShippingFlg/層別（出荷）
     *           - nProc/次区
     *           - rev/リビジョン
     *           - aplyStrtDt/適用開始日
     *       - {@link TmPkgSpecRevHisDomain#brch}に枝番の取得の結果を設定
     *       - {@link TmPkgSpecRevHisService#create(TmPkgSpecRevHisDomain)}を呼出
     *
     *     - 包装仕様有効リビジョン原単位の更新
     *       - {@link TmPkgSpecRevDomain}の以下の項目にcriteriaの同名項目を設定
     *           - rev/リビジョン
     *       - {@link TmPkgSpecRevDomain}の以下の項目にタイムゾーン変換日付を設定
     *           - aplyStrtDt/適用開始日
     *
     *       - {@link TmPkgSpecRevCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *           - compCd/会社コード
     *           - itemNoGrp/品目番号グループ
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *           - trnsCd/輸送手段コード
     *           - isltdPurchaseFlg/層別（購入）
     *           - isltdStorageFlg/層別（入庫）
     *           - isltdShippingFlg/層別（出荷）
     *           - nProc/次区
     *
     *       - {@link TmPkgSpecRevService#updateByCondition(TmPkgSpecRevDomain, TmPkgSpecRevCriteriaDomain)}を呼出
     *
     * - 包装仕様有効リビジョン原単位のロックの結果が取得できない場合のみ実施する
     *   - テーブル登録、更新
     *     - 包装仕様有効リビジョン原単位の登録
     *       - {@link TmPkgSpecRevDomain}の以下の項目にcriteriaの同名項目を設定
     *           - compCd/会社コード
     *           - itemNoGrp/品目番号グループ
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *           - trnsCd/輸送手段コード
     *           - isltdPurchaseFlg/層別（購入）
     *           - isltdStorageFlg/層別（入庫）
     *           - isltdShippingFlg/層別（出荷）
     *           - nProc/次区
     *           - rev/リビジョン
     *       - {@link TmPkgSpecRevDomain}の以下の項目にタイムゾーン変換日付を設定
     *           - aplyStrtDt/適用開始日
     *       - {@link TmPkgSpecRevService#create(TmPkgSpecRevDomain)}を呼出
     * </pre>
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product 検索条件ドメイン
     * @throws ApplicationException A Package Specification Revision Master and a Package Specification Revision History Master cannot be accessed. When an error occurs in common processing<br />包装仕様有効リビジョン原単位、包装仕様有効リビジョン履歴原単位にアクセスできない、共通処理でエラーが発生した場合
     */
    public abstract void transactOnPkgSpec(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2507_Print Case Mark Label -------------------------------------------
    /**
     *    [Ws2507] Printing of CML and a CML error report
     * <br />[Ws2507] CML、CMLエラーレポートを印刷します。
     *
     * <pre>
     * From the parameter of an HTTP request, acquire printed information and create the PDF file of CML.
     *
     * Acquisition of - printer information
     *     - The same name item of criteria is set to the following items of {@link TmPrinterCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *       - printerId / PRINTER ID
     *     - This is a call about {@link TmPrinterService#searchByKey(TmPrinterCriteriaDomain)}.
     *
     * - Lock of a Packaging Instruction (=Pull) information
     *     - The same name item of criteria is set to the following items of {@link TtPltzInstrCriteriaDomain}.
     *       - pltzInstrNo / Palletize Instr. No.
     *     - This is a call about {@link TtPltzInstrService#lockByKeyNoWait(TtPltzInstrCriteriaDomain)}.
     *
     * - Acquisition of a Palletize information
     *     - The same name item of criteria is set to the following items of {@link TtPltzCriteriaDomain}.
     *       - pltzInstrNo / Palletize Instr. No.
     *     - This is a call about {@link TtPltzService#searchByCondition(TtPltzCriteriaDomain)}.
     *
     * - Acquisition of a print-copies information
     *     - The same name item of criteria is set to the following items of {@link TmNxsCompCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *     - This is a call about {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}.
     *
     * - Update of a Packaging Instruction (=Pull) information
     *     - The same name item of criteria is set to the following items of {@link TtPltzInstrDomain}.
     *       - pltzInstrStatus / PALLETIZE INSTRUCTION STATUS = '50' (All CML Print out)
     *     - This is a call about {@link TtPltzInstrService#update(TtPltzInstrDomain)}.
     *
     * A create of - PDF
     *     - This is a call about {@link L2003ReportService#searchCml(String pltzInstrNo, String cmlNo, String dateFormat)}.
     *
     * - printing
     *     - This is a call about {@link CommonService#printPdf(File pdf, int copy, String printer)}.
     *
     * HTTPリクエストのパラメタから、印刷情報を取得し、CMLのPDFファイルを作成する
     *
     * - プリンタ情報の取得
     *   - {@link TmPrinterCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *     - compCd/会社コード
     *     - printerId/プリンタID
     *   - {@link TmPrinterService#searchByKey(TmPrinterCriteriaDomain)}を呼出
     *
     * - 梱包指示情報のロック
     *   - {@link TtPltzInstrCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *     - pltzInstrNo/梱包指示No
     *   - {@link TtPltzInstrService#lockByKeyNoWait(TtPltzInstrCriteriaDomain)}を呼出
     *
     * - パレタイズ情報の取得
     *   - {@link TtPltzCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *     - pltzInstrNo/梱包指示No
     *   - {@link TtPltzService#searchByCondition(TtPltzCriteriaDomain)}を呼出
     *
     * - 印刷部数情報の取得
     *   - {@link TmNxsCompCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *     - compCd/会社コード
     *   - {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出
     *
     * - 梱包指示情報の更新
     *   - {@link TtPltzInstrDomain}の以下の項目にcriteriaの同名項目を設定
     *     - pltzInstrStatus/梱包指示ステータス = '50'(All CML Print out)
     *   - {@link TtPltzInstrService#update(TtPltzInstrDomain)}を呼出
     *
     * - PDFの作成
     *   - {@link L2003ReportService#searchCml(String pltzInstrNo, String cmlNo, String dateFormat)}を呼出
     *
     * -印刷
     *   - {@link CommonService#printPdf(File pdf, int copy, String printer)}を呼出
     *
     * </pre>
     *
     * @param criteriaDomain Domain<br />ドメイン
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public abstract void transactOnPrintCml(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2508_Create Mixed Label ----------------------------------------------
    /**
     *    Check of the necessary items for every [ws2508] NEXUS W/H flag
     * <br />[ws2508]NEXUS倉庫フラグ毎の必須項目をチェックします。
     *
     * <pre>
     * This is defined by the VALUE of - NEXUS W/H flag as shown in the following tables.
     *     When the required parameter is not inputted, an execution result is outputted as an error.
     *
     * - NEXUS倉庫フラグの値によって以下の表のように定義されている
     *   必須パラメタが入力されていない場合はエラーとして実行結果を出力する
     * </pre>
     *
     * @param criteria Domain<br />ドメイン
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateConsistencyNxsStockFlg(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException;

    /**
     *    [ws2508] Shipper, W/H, and Plant Combination check
     * <br />[ws2508]Shipper、W/H、Plant を組み合わせチェックします。
     *
     * <pre>
     * - It checks that the combination of a company and a W/H is right.
     *     Also when an error occurs in the middle of *, a check is continued, and all the checked results are registered into a CML Error Report Header.
     *    (when [   ] the Palletize Instr. No. is inputted, or when a NEXUS W/H flag is 'N')
     *
     * - 会社および倉庫の組み合わせが正しいことを確認する
     *   ※途中でエラーが発生した場合もチェックを継続し、全てのチェック結果をCMLエラーレポートヘッダに登録する
     *  （梱包指示Noが入力されている場合　または　NEXUS倉庫フラグが'N'の場合）
     * </pre>
     *
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param lgcyWhCd LEGACY WAREHOUSE CODE<br />LEGACY倉庫コード
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @param whCompCd W/H-Company-CD (between bases) * For return VALUEs<br />倉庫会社コード(拠点間) ※戻り値用
     * @param whCd W/H-CD (between bases) * For return VALUEs<br />倉庫コード(拠点間) ※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmCigmaWhXrefOnMixTag(
        String lgcyLibCompCd, String lgcyWhCd, String plntCd, String[] whCompCd, String[] whCd) throws ApplicationException;

    /**
     *    [ws2508] W/H Company and NEXUS W/H Combination check
     * <br />[ws2508]W/H Company、NEXUS W/H を組み合わせチェックします。
     *
     * <pre>
     * - It checks that the combination of a company and a W/H is right.
     *     Also when an error occurs in the middle of *, a check is continued, and all the checked results are registered into a CML Error Report Header.
     *    (when   or the NEXUS W/H flag into which Palletize Instr. No. . is inputted is 'Y')
     *
     * - 会社および倉庫の組み合わせが正しいことを確認する
     *   ※途中でエラーが発生した場合もチェックを継続し、全てのチェック結果をCMLエラーレポートヘッダに登録する
     *  （梱包指示No.が入力されている　または　NEXUS倉庫フラグが'Y'の場合）
     * </pre>
     *
     * @param whCompCd W/H Company CD (between bases)<br />倉庫会社コード(拠点間)
     * @param whCd W/H CD (between bases)<br />倉庫コード(拠点間)
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param lgcyWhCd For LEGACY-WAREHOUSE-CODE * return VALUEs<br />LEGACY倉庫コード※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmNxsWhOnMixTag(String whCompCd, String whCd, String lgcyLibCompCd, String[] lgcyWhCd) throws ApplicationException;

    /**
     *    [ws2508] interior material existence check
     * <br />[ws2508]内装材を存在チェックします。
     *
     * <pre>
     * Check that the information on the Packing material succeeded from - BHT exists in the master.
     *     When the following checks were performed and an error occurs
     *     A result CD, an error code, and an error parameter are set as an internal variable, and an execution result is outputted.
     *     Also when an error occurs in the middle of *, a check is continued, and all the checked results are registered into a response.
     * - Interior material existence check
     * - Acquisition of a PKG Materials MA, a PKG Materials Name MA, and a NEXUS Company Master
     *     - ownerComp, pkgItemNo, and lngCd are set to the following items of {@link Ws2501PkgMaterialsCriteriaDomain}.
     *         - ownerComp / Shipper CD
     *         - pkgItemNoList / PACKAGE ITEM NO
     *     - This is a call about {@link WsBhtEisProductDao#searchPkgMaterials (Ws2501PkgMaterialsCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5008).
     *
     * - BHTから引継がれた包装材の情報が原単位に存在していることを確認する
     *   以下のチェックを行い、エラーが発生した場合は
     *   結果コード、エラーコード、エラーパラメタを内部変数に設定し実行結果を出力する
     *   ※途中でエラーが発生した場合もチェックを継続し、全てのチェック結果をレスポンスに登録する
     * - 内装材存在チェック
     * - 包装材原単位、包装材名称原単位、NEXUS会社原単位の取得
     *   - {@link Ws2501PkgMaterialsCriteriaDomain}の以下の項目にownerComp、pkgItemNo、lngCdを設定
     *       - ownerComp/荷主コード
     *       - pkgItemNoList/包装材品番
     *   - {@link WsBhtEisProductDao#searchPkgMaterials(Ws2501PkgMaterialsCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5008)
     * </pre>
     * @param shipperCd Shipper CD<br />荷主コード
     * @param itemNoList List of PACKAGE ITEM NO<br />包装材品番リスト
     * @param resultList Result list<br />結果リスト
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmPkgMaterialsOnMixTag(
        String shipperCd,
        List<? extends Ws2501ItemNoDomain> itemNoList,
        List<String> resultList ) throws ApplicationException;

    /**
     *    [ws2508] packing specification existence check
     * <br />[ws2508]包装仕様を存在チェックします。
     *
     * <pre>
     * Check that the information on the Packing material succeeded from - BHT exists in the master.
     *     When the following checks were performed and an error occurs
     *     A result CD, an error code, and an error parameter are set as an internal variable, and an execution result is outputted.
     *     Also when an error occurs in the middle of *, a check is continued, and all the checked results are registered into a response.
     * - Packing specification existence check
     *     In the ITEM-NO packing CD map of an argument, the data of the same ITEM NO and a packing CD is accepted once, and is carried out.
     *     Acquisition of - PKG Specification MA(Header), a PKG Specification MA(Detail), and a Package Specification Revision Master
     *       - In the following items of {@link Ws2501NxsPkgSpecificationCriteriaDomain}
     *         shipperCd of an argument, and every of the ITEM-NO packing CD map of an argument -- itemNo, pkgCd, and trnsCd of an argument are set up
     *           - compCd / COMPANY CODE
     *           - itemNo / ITEM NO
     *           - pkgCd / PACKAGE CODE
     *           - trnsCd / TRANSPORT CODE
     This is a call about * - {@link WsBhtEisProductDao#searchNxsPkgSpecification(Ws2501NxsPkgSpecificationCriteriaDomain)}.
     *       - Existence check
     *           In the case of absence, an error is made (NXS_E 1_5010).
     *
     * - BHTから引継がれた包装材の情報が原単位に存在していることを確認する
     *   以下のチェックを行い、エラーが発生した場合は
     *   結果コード、エラーコード、エラーパラメタを内部変数に設定し実行結果を出力する
     *   ※途中でエラーが発生した場合もチェックを継続し、全てのチェック結果をレスポンスに登録する
     * - 包装仕様存在チェック
     *   引数の品目番号包装コードマップの中で同一品目番号・包装コードのデータは一回のみ実施する
     *   - 包装仕様原単位（ヘッダ）、包装仕様原単位（明細）、包装仕様有効リビジョン原単位の取得
     *     - {@link Ws2501NxsPkgSpecificationCriteriaDomain}の以下の項目に
     *       引数のshipperCd、引数の品目番号包装コードマップの各itemNo、及び、pkgCd、引数のtrnsCdを設定
     *         - compCd/会社コード
     *         - itemNo/品目番号
     *         - pkgCd/包装区分
     *         - trnsCd/輸送手段コード
     *     - {@link WsBhtEisProductDao#searchNxsPkgSpecification(Ws2501NxsPkgSpecificationCriteriaDomain)}を呼出
     *     - 存在チェック
     *         不存在の場合エラー(NXS_E1_5010)
     * </pre>
     *
     * @param shipperCd Shipper CD<br />荷主コード
     * @param itemNoList The list of ITEM-NO domains<br />品目番号ドメインのリスト
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param resultList Result list<br />結果リスト
     * @return ITEM-NO error MAP<br />品目番号エラーMAP
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseTmPkgSpecificationDtOnMixTag(
        String shipperCd,
        List<? extends Ws2501ItemNoDomain> itemNoList,
        String trnsCd,
        List<String> resultList) throws ApplicationException;

    /**
     *    The [ws2508] acquisition number check, PALLETIZE-INSTRUCTION-STATUS check
     * <br />[ws2508]取得件数チェック、梱包指示ステータスをチェックします。
     *
     * <pre>
     * - Acquisition of a Packaging Instruction (=Pull)
     *     - The following items are set to {@link TtPltzInstrCriteriaDomain} from criteria.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *     - This is a call about {@link TtPltzInstrService#searchByKey (TtPltzInstrCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5038).
     *     - PALLETIZE-INSTRUCTION-STATUS check
     *         In the case of 10, 40, and 50, an error is made (NXS_E 1_5015).
     *
     * - 梱包指示の取得
     *   - {@link TtPltzInstrCriteriaDomain}にcriteriaより以下の項目を設定
     *       - pltzInstrNo/梱包指示NO
     *   - {@link TtPltzInstrService#searchByKey(TtPltzInstrCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5038)
     *   - 梱包指示ステータスチェック
     *       10、40、50の場合エラー(NXS_E1_5015)
     * </pre>
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @param shipperCd Shipper-CD  * For return VALUEs<br />荷主コード ※戻り値用
     * @param customerCd CUSTOMER-CODE  * For return VALUEs<br />得意先コード ※戻り値用
     * @param lgcyShipTo SHIP-TO-CODE  * For return VALUEs<br />送荷先コード ※戻り値用
     * @param trnsCd TRANSPORT-CODE  * For return VALUEs<br />輸送手段コード ※戻り値用
     * @param plntCd Factory code (LEGACY) * For return VALUEs<br />工場コード(LEGACY) ※戻り値用
     * @param lgcyWhCd W/H-CD (LEGACY) * For return VALUEs<br />倉庫コード(LEGACY) ※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract String validateDatabaseTtPltzInstrOnMixTag(
        String pltzInstrNo,
        String[] shipperCd,
        String[] customerCd,
        String[] lgcyShipTo,
        String[] trnsCd,
        String[] plntCd,
        String[] lgcyWhCd)throws ApplicationException;

    /**
     *    Registration of [ws2508] Mix Tag
     * <br />[ws2508]MIXED現品票を登録します。
     *
     * <pre>
     * - Lock of data
     * - Lock of a Packaging Instruction (=Pull)
     * - Lock of a Palletize Instruction Item No
     * - Lock of a Palletize Instruction Receive Order
     * The lock of - Mix Tag
     * - Setting of an internal variable (header)
     * - Setting of an internal variable (details)
     * Acquisition of - Mix Tag No.
     * - Firm-order-receipt alloc processing (it carries out, only when the Palletize Instr. No. is not set up)
     * Register - Mix Tag KANBAN.
     * Register - MIXED ITEM NO.
     * Register - Mix Tag RT.
     * Register - Mix Tag.
     * - A Temp Stock is updated and registered.
     * - Registration of an ordering alloc track record (starting of Web service)
     * Register - BHT productivity data information.
     *
     * - データのロック
     * - 梱包指示のロック
     * - 梱包指示品目番号のロック
     * - 梱包指示品目番号受注情報のロック
     * - MIXED現品票のロック
     * - 内部変数の設定（ヘッダ）
     * - 内部変数（明細）の設定
     * - Mix Tag No.の取得
     * - 確定受注引当処理(梱包指示Noが設定されていない場合のみ実施)
     * - MIX品かんばん情報を登録する
     * - MIXED品目番号を登録する
     * - MIXED用RT材を登録する
     * - MIXED現品票を登録する
     * - 仮在庫を更新・登録する
     * - 受注引当実績の登録（Webサービスの起動）
     * - BHT生産性データ情報を登録する。
     * </pre>
     *
     * @param criteria Search-condition domain<br />検索条件ドメイン
     * @return Eis Product domain<br />Eis Productドメイン
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract WsBhtEisProductDomain transactOnMixTag(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2509_Print Mixed Label -----------------------------------------------
    /**
     *   Printing of a [ws2509] Mix tag and a Mix tag error report
     * <br />[ws2509]Mixタグ、Mixタグエラーレポートを印刷します。
     *
     * <pre>
     * From the parameter of an HTTP request, acquire printed information and create the PDF file of a Mix tag and a Mix tag error report.
     * Acquisition of - User Information
     *     - The following items are set to {@link VmUserInfoCriteriaDomain} from criteria.
     *         DSCID of - dscId / login user
     *     - This is a call about {@link VmUserInfoService#searchByCondition(VmUserInfoCriteriaDomain)}.
     *
     *
     * Acquisition of - printer information
     *     - The same name item of criteria is set to the following items of {@link TmPrinterCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *       - printerId / PRINTER ID
     *     - This is a call about {@link TmPrinterService#searchByKey(TmPrinterCriteriaDomain)}.
     *
     * A create of - PDF
     *     - A Mix tag is created when a parameter .MIX tag has a setting.
     *       - This is a call about {@link L2002ReportService#searchMixTag(String mixTagNo, String formatDate)}.
     *     - When a parameter . error report output flag is 'Y', a Mix tag error report is created.
     This is a call about * - {@link L2005ReportService#searchCmlMixTagErrRep(String dscId, Timestamp errRpDate, String formatDate)}.
     *
     * - Printing
     *     - This is a call about {@link CommonService#printPdf(File pdf, int copy, String printer)}.
     *
     * HTTPリクエストのパラメタから、印刷情報を取得し、Mixタグ、MixタグエラーレポートのPDFファイルを作成する
     * - ユーザ情報の取得
     *   - {@link VmUserInfoCriteriaDomain}にcriteriaより以下の項目を設定
     *       - dscId/ログインユーザのDSCID
     *   - {@link VmUserInfoService#searchByCondition(VmUserInfoCriteriaDomain)}を呼出
     *
     *
     * - プリンタ情報の取得
     *   - {@link TmPrinterCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *     - compCd/会社コード
     *     - printerId/プリンタID
     *   - {@link TmPrinterService#searchByKey(TmPrinterCriteriaDomain)}を呼出
     *
     * - PDFの作成
     *   - パラメタ.MIXタグに設定がある場合、Mixタグを作成する。
     *     - {@link L2002ReportService#searchMixTag(String mixTagNo, String formatDate)}を呼出
     *   - パラメタ.エラーレポート出力フラグが'Y'の場合、Mixタグエラーレポートを作成する。
     *     - {@link L2005ReportService#searchCmlMixTagErrRep(String dscId, Timestamp errRpDate, String formatDate)}を呼出
     *
     * - 印刷
     *   - {@link CommonService#printPdf(File pdf, int copy, String printer)}を呼出
     * </pre>
     *
     * @param criteriaDomain Domain<br />ドメイン
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract void searchOnPrintMixTag(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2510_Create X CML ----------------------------------------------------
    /**
     *    WEIGHT acquisition of [ws2510] exterior cases
     * <br />[ws2510]外装材の重量を取得します。
     *
     * <pre>
     * Acquisition of - PKG Set MA(Header), a PKG Set MA(Detail), and a PKG Materials MA
     *     - outerPkgComCd and outerPkgCd are set to the following items of {@link Ws2501OuterSumWeightCriteriaDomain}.
     *         - ownerComp / OWNER COMPANY
     *         - outerCd / exterior sign
     *     - This is a call about {@link WsBhtEisProductDao#searchOuterSumWeight (Ws2501OuterSumWeightCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5008).
     *
     * - 包装組み合わせ原単位(ヘッダ)、包装組み合わせ原単位(明細)、包装材原単位の取得
     *   - {@link Ws2501OuterSumWeightCriteriaDomain}の以下の項目にouterPkgComCd、outerPkgCdを設定
     *       - ownerComp/責任会社
     *       - outerCd/外装記号
     *   - {@link WsBhtEisProductDao#searchOuterSumWeight(Ws2501OuterSumWeightCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5008)
     * </pre>
     *
     * @param outerPkgComCd OUTER PACKAGE COM CODE<br />外装会社コード
     * @param outerPkgCd OUTER PACKAGE CODE<br />外装コード
     * @param weightMap WEIGHT MAP * for every WEIGHT UNIT For return VALUEs<br />重量単位ごとの重量MAP ※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a PKG Set MA(Header), a PKG Set MA(Detail), and a PKG Materials MA cannot be referred to<br />包装組み合わせ原単位(ヘッダ)、包装組み合わせ原単位(明細)、包装材原単位を参照できない場合
     */
    public abstract boolean validateDatabaseTmPkgSetDtlOnXtag(String outerPkgComCd, String outerPkgCd, Map<String, BigDecimal> weightMap) throws ApplicationException;

    /**
     *    VOLUME acquisition of [ws2510] exterior cases
     * <br />[ws2510]外装材の容積を取得します。
     *
     * <pre>
     * Acquisition of - PKG Set MA(Header)
     *     - outerPkgComCd and outerPkgCd are set to the following items of {@link TmPkgSetHdrCriteriaDomain}.
     *         - ownerComp / OWNER COMPANY
     *         - outerCd / exterior sign
     *     - This is a call about {@link TmPkgSetHdrService#searchByKey (TmPkgSetHdrCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5008).
     *
     * - 包装組み合わせ原単位(ヘッダ)の取得
     *   - {@link TmPkgSetHdrCriteriaDomain}の以下の項目にouterPkgComCd、outerPkgCdを設定
     *       - ownerComp/責任会社
     *       - outerCd/外装記号
     *   - {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5008)
     * </pre>
     *
     * @param outerPkgComCd OUTER PACKAGE COM CODE<br />外装会社コード
     * @param outerPkgCd OUTER PACKAGE CODE<br />外装コード
     * @param volumeMap VOLUME MAP * for every Unit of Vol. For return VALUEs<br />容積単位ごとの容積MAP ※戻り値用
     * @return Checked result<br />チェック結果
     * @throws ApplicationException When a PKG Set MA(Header) cannot be referred to<br />包装組み合わせ原単位(ヘッダ)を参照できない場合
     */
    public abstract boolean validateDatabaseTmPkgSetHdrOnXtag(String outerPkgComCd, String outerPkgCd, Map<String, BigDecimal> volumeMap) throws ApplicationException;

    /**
     *    [ws2510] MAIN MARK's existence check
     * <br />[ws2510]メインマークを存在チェックします。
     *
     * <pre>
     * - A Palletize information is locked based on a parameter . MAIN MARK.
     *     - mainMarkList is set to the following items of {@link Ws2501PltzNxsShipToCriteriaDomain}.
     *         - mainMarkList / MAIN-MARK list
     *     - This is a call about {@link WsBhtEisProductDao#lockByKeyNoWaitPltzNxsShipTo (Ws2501PltzNxsShipToCriteriaDomain)}.
     *     - Existence check
     *         In the case of absence, an error is made (NXS_E 1_5001).
     *     - When it cannot lock
     *         Error (NXS_E 1_5004)
     *
     * - Item check of a Palletize information
     *       An error is made when a checked result is NG (NXS_E 1_5021).
     *
     * - パラメタ.メインマークを元にパレタイズ情報をロック
     *   - {@link Ws2501PltzNxsShipToCriteriaDomain}の以下の項目にmainMarkListを設定
     *       - mainMarkList/メインマークリスト
     *   - {@link WsBhtEisProductDao#lockByKeyNoWaitPltzNxsShipTo(Ws2501PltzNxsShipToCriteriaDomain)}を呼出
     *   - 存在チェック
     *       不存在の場合エラー(NXS_E1_5001)
     *   - ロックできない場合
     *       エラー(NXS_E1_5004)
     *
     * - パレタイズ情報の項目チェック
     *     チェック結果がNGの場合エラー(NXS_E1_5021)
     * </pre>
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product 検索条件ドメイン
     * @param curWhCompCd com
     * @param curWhCd cur
     * @return Error code Map<br />エラーコードMap
     * @throws ApplicationException When a Palletize information cannot be locked<br />パレタイズ情報をロックできない場合
     */
    public abstract Map<String, String> validateDatabaseTtPltzOnXtag(
        WsBhtEisProductCriteriaDomain criteria, String[] curWhCompCd, String[] curWhCd) throws ApplicationException;

    /**
     * User Info existence check
     * <br />ユーザ情報を存在チェックします。
     *
     * <pre>
     * - This is a call about {@link VmUserInfoService#searchCount(VmUserInfoCriteriaDomain)}.
     * - Existence check
     *       An error is made when it does not exist.
     *
     * - {@link VmUserInfoService#searchCount(VmUserInfoCriteriaDomain)}を呼出
     * - 存在チェック
     *     存在しない場合エラー
     * </pre>
     *
     * @param dscId DSC-ID<br />DSC-ID
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseVmUserInfo(String dscId) throws ApplicationException;

    /**
     *    Registration of [ws2510] X Palletize
     * <br />[ws2510]まとめパレタイズを登録します。
     *
     * <pre>
     * Acquisition of - User Information
     *     - usrNmEn / name (alphabet character) acquisition
     *       - The same name item of criteria is set to the following items of {@link TmUserCriteriaDomain}.
     *         - dscId/DSC-ID
     *       - This is a call about {@link TmUserService#searchByKey(TmUserCriteriaDomain)}.
     *     - ownerComp acquisition
     *       - The same name item of criteria is set to the following items of {@link TmUserConfCriteriaDomain}.
     *         - dscId/DSC-ID
     *       - This is a call about {@link TmUserConfService#searchByKey(TmUserConfCriteriaDomain)}.
     *     - weightUnit, volumeUnit acquisition
     *       - ownerComp is set to the following items of {@link TmNxsCompCriteriaDomain}.
     *           - compCd / COMPANY CODE
     *       - This is a call about {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}.
     *
     * Acquisition of the - Shipper-CD number
     *     - The same name item of criteria is set to the following items of {@link Ws2501CntShipperCdCriteriaDomain}.
     *         - mainMarkList / MAIN-MARK list
     *     - This is a call about {@link WsBhtEisProductDao#searchCntShipperCd(Ws2501CntShipperCdCriteriaDomain)}.
     *
     * - Calculation of a WEIGHT
     *     - WEIGHT acquisition
     *       - The same name item of criteria is set to the following items of {@link Ws2501SumCmlWeightForUnitCriteriaDomain}.
     *           - mainMarkList / MAIN-MARK list
     This is a call about * - {@link WsBhtEisProductDao#searchSumCmlWeightForUnit(Ws2501SumCmlWeightForUnitCriteriaDomain)}.
     *     - WEIGHT calculation
     *       - Gross Weight calculation
     *         This is an argument about grossWeight of - criteria, weightUnit, and weightUnit of acquisition {@link TmUserService#searchByKey(TmUserCriteriaDomain)} of above-mentioned User Information.
     *           This is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *.
     - grossWeight of the above-mentioned WEIGHT acquisition {@link WsBhtEisProductDao#searchSumCmlWeightForUnit(Ws2501SumCmlWeightForUnitCriteriaDomain)},
     weightUnit,
     *           This is an argument about weightUnit of acquisition {@link TmUserService#searchByKey(TmUserCriteriaDomain)} of above-mentioned User Information.
     *           This is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *         - The above-mentioned result is added.
     *       - Net Weight calculation
     *.
     - netWeight of the above-mentioned WEIGHT acquisition {@link WsBhtEisProductDao#searchSumCmlWeightForUnit(Ws2501SumCmlWeightForUnitCriteriaDomain)}, weightUnit,
     *           This is an argument about weightUnit of acquisition {@link TmUserService#searchByKey(TmUserCriteriaDomain)} of above-mentioned User Information.
     *           This is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *
     * - Calculation of a VOLUME
     *     This is an argument about volume of - criteria, volumeUnit, and volumeUnit of acquisition {@link TmUserService#searchByKey(TmUserCriteriaDomain)} of above-mentioned User Information.
     *       This is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *
     * Registration of - X-Palletize information
     *     Acquisition of - X-TAG
     *       - This is a call about {@link CommonService#transactSequence(String, String, int, String)} to an argument in an assignment-of-order-numbers key, 04 and 1, and WS2510.
     *     Registration of - X-Palletize information
     *       - The following items are set to {@link TtXpltzDomain}.
     *         - criteria
     *           Result of acquisition {@link CommonService#transactSequence(String, String, int, String)} of - X-TAG
     *           - Result of a calculation of a WEIGHT
     *           - Result of a calculation of a VOLUME
     *           Result of acquisition {@link TmUserService#searchByKey(TmUserCriteriaDomain)} of - User Information
     *           - Time zone converted date
     *           Result of acquisition {@link WsBhtEisProductDao#searchCntShipperCd(Ws2501CntShipperCdCriteriaDomain)} of the - Shipper-CD number
     *       - This is a call about {@link TtXpltzService#create(TtXpltzDomain)}.
     * - Update of a Palletize information
     *     - The following items are set to {@link TtPltzDomain}.
     *         Result of acquisition {@link CommonService#transactSequence(String, String, int, String)} of - X-TAG
     *     - Each VALUE of mainMarkList of criteria is set to the following items of {@link TtPltzCriteriaDomain}.
     *         - mainMark / MAIN MARK
     *     - This is a call about {@link WsBhtEisProductDao#updateTtPltzByXmainMark(String, List)}.
     *
     * - ユーザ情報の取得
     *   - usrNmEn/氏名(英字)取得
     *     - {@link TmUserCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *         - dscId/DSC-ID
     *     - {@link TmUserService#searchByKey(TmUserCriteriaDomain)}を呼出
     *   - ownerComp取得
     *     - {@link TmUserConfCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *         - dscId/DSC-ID
     *     - {@link TmUserConfService#searchByKey(TmUserConfCriteriaDomain)}を呼出
     *   - weightUnit、volumeUnit取得
     *     - {@link TmNxsCompCriteriaDomain}の以下の項目にownerCompを設定
     *         - compCd/会社コード
     *     - {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出
     *
     * - 荷主コード件数の取得
     *   - {@link Ws2501CntShipperCdCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *       - mainMarkList/メインマークリスト
     *   - {@link WsBhtEisProductDao#searchCntShipperCd(Ws2501CntShipperCdCriteriaDomain)}を呼出
     *
     * - 重量の算出
     *   - 重量取得
     *     - {@link Ws2501SumCmlWeightForUnitCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *         - mainMarkList/メインマークリスト
     *     - {@link WsBhtEisProductDao#searchSumCmlWeightForUnit(Ws2501SumCmlWeightForUnitCriteriaDomain)}を呼出
     *   - 重量算出
     *     - Gross Weight算出
     *       - criteriaのgrossWeight、weightUnit、上記のユーザ情報の取得{@link TmUserService#searchByKey(TmUserCriteriaDomain)}のweightUnitを引数に
     *         {@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *       - 上記の重量取得{@link WsBhtEisProductDao#searchSumCmlWeightForUnit(Ws2501SumCmlWeightForUnitCriteriaDomain)}のgrossWeight、weightUnit、
     *         上記のユーザ情報の取得{@link TmUserService#searchByKey(TmUserCriteriaDomain)}のweightUnitを引数に
     *         {@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *       - 上記の結果を加算
     *     - Net Weight算出
     *       - 上記の重量取得{@link WsBhtEisProductDao#searchSumCmlWeightForUnit(Ws2501SumCmlWeightForUnitCriteriaDomain)}のnetWeight、weightUnit、
     *         上記のユーザ情報の取得{@link TmUserService#searchByKey(TmUserCriteriaDomain)}のweightUnitを引数に
     *         {@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *
     * - 容積の算出
     *   - criteriaのvolume、volumeUnit、上記のユーザ情報の取得{@link TmUserService#searchByKey(TmUserCriteriaDomain)}のvolumeUnitを引数に
     *     {@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *
     * - まとめパレタイズ情報の登録
     *   - まとめメインマークの取得
     *     - 採番キー、04、1、WS2510を引数に、{@link CommonService#transactSequence(String, String, int, String)}を呼出
     *   - まとめパレタイズ情報の登録
     *     - {@link TtXpltzDomain}に以下の項目を設定
     *         - criteria
     *         - まとめメインマークの取得{@link CommonService#transactSequence(String, String, int, String)}の結果
     *         - 重量の算出の結果
     *         - 容積の算出の結果
     *         - ユーザ情報の取得{@link TmUserService#searchByKey(TmUserCriteriaDomain)}の結果
     *         - タイムゾーン変換日付
     *         - 荷主コード件数の取得{@link WsBhtEisProductDao#searchCntShipperCd(Ws2501CntShipperCdCriteriaDomain)}の結果
     *     - {@link TtXpltzService#create(TtXpltzDomain)}を呼出
     * - パレタイズ情報の更新
     *   - {@link TtPltzDomain}に以下の項目を設定
     *       - まとめメインマークの取得{@link CommonService#transactSequence(String, String, int, String)}の結果
     *   - {@link TtPltzCriteriaDomain}の以下の項目にcriteriaのmainMarkListの各値を設定
     *       - mainMark/メインマーク
     *   - {@link WsBhtEisProductDao#updateTtPltzByXmainMark(String, List)}を呼出
     * </pre>
     *
     * @param criteria Eis Product search-condition domain<br />Eis Product 検索条件ドメイン
     * @return Eis Product domain<br />Eis Product ドメイン
     * @throws ApplicationException When an error occurs in the common processing which cannot access a table<br />テーブルにアクセスできない、共通処理でエラーが発生した場合
     */
    public abstract WsBhtEisProductDomain transactOnXtag(WsBhtEisProductCriteriaDomain criteria) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2511_Print X CML -----------------------------------------------------
    /**
     *    Printing of [ws2511] X-TAG
     * <br />[ws2511]まとめCMLを印刷します。
     *
     * <pre>
     * From the parameter of an HTTP request, acquire printed information and create the PDF file of a X-TAG.
     * Acquisition of - User Information
     *     - The following items are set to {@link VmUserInfoCriteriaDomain} from criteria.
     *         DSCID of - dscId / login user
     *     - This is a call about {@link VmUserInfoService#searchByCondition(VmUserInfoCriteriaDomain)}.
     *
     *
     * Acquisition of - printer information
     *     - The same name item of criteria is set to the following items of {@link TmPrinterCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *       - printerId / PRINTER ID
     *     - This is a call about {@link TmPrinterService#searchByKey(TmPrinterCriteriaDomain)}.
     *
     * A create of - PDF
     *     - This is a call about {@link L2004ReportService#searchXtag(String xTagNo, String compCd, String formatDate)}.
     *
     * - Printing
     *     - This is a call about {@link CommonService#printPdf(File pdf, int copy, String printer)}.
     *
     * HTTPリクエストのパラメタから、印刷情報を取得し、まとめCMLのPDFファイルを作成する
     * - ユーザ情報の取得
     *   - {@link VmUserInfoCriteriaDomain}にcriteriaより以下の項目を設定
     *       - dscId/ログインユーザのDSCID
     *   - {@link VmUserInfoService#searchByCondition(VmUserInfoCriteriaDomain)}を呼出
     *
     *
     * - プリンタ情報の取得
     *   - {@link TmPrinterCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *     - compCd/会社コード
     *     - printerId/プリンタID
     *   - {@link TmPrinterService#searchByKey(TmPrinterCriteriaDomain)}を呼出
     *
     * - PDFの作成
     *   - {@link L2004ReportService#searchXtag(String xTagNo, String compCd, String formatDate)}を呼出
     *
     * - 印刷
     *   - {@link CommonService#printPdf(File pdf, int copy, String printer)}を呼出
     * </pre>
     *
     * @param criteriaDomain Domain<br />ドメイン
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract void searchOnPrintXtag(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException;

    // --------------------------------- ECA0027_WS_2512_Print Case Mark Label(E-RT) -------------------------------------
    /**
     *    Printing of [ws2512] CML (E-RT)
     * <br />[ws2512]CML(E-RT)を印刷します。
     *
     * <pre>
     * From the parameter of an HTTP request, acquire printed information and create the PDF file of CML (E-RT).
     * Acquisition of - printer information
     *     - The same name item of criteria is set to the following items of {@link TmPrinterCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *       - printerId / PRINTER ID
     *     - This is a call about {@link TmPrinterService#searchByKey(TmPrinterCriteriaDomain)}.
     *
     * - Acquisition of a print-copies information
     *     - The same name item of criteria is set to the following items of {@link Ws2501CmlPrintNumCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *       - printerId / PRINTER ID
     *     - This is a call about {@link WsBhtEisProductDao#searchCmlPrintNum(Ws2501CmlPrintNumCriteriaDomain)}.
     *
     * A create of - PDF
     *     - This is a call about {@link LC001ReportService#searchErt(String, String, String)}.
     *
     * - Printing
     *     - This is a call about {@link CommonService#printPdf(File pdf, int copy, String printer)}.
     *
     * HTTPリクエストのパラメタから、印刷情報を取得し、CML(E-RT)のPDFファイルを作成する
     * - プリンタ情報の取得
     *   - {@link TmPrinterCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *     - compCd/会社コード
     *     - printerId/プリンタID
     *   - {@link TmPrinterService#searchByKey(TmPrinterCriteriaDomain)}を呼出
     *
     * - 印刷部数情報の取得
     *   - {@link Ws2501CmlPrintNumCriteriaDomain}の以下の項目にcriteriaの同名項目を設定
     *     - compCd/会社コード
     *     - printerId/プリンタID
     *   - {@link WsBhtEisProductDao#searchCmlPrintNum(Ws2501CmlPrintNumCriteriaDomain)}を呼出
     *
     * - PDFの作成
     *   - {@link LC001ReportService#searchErt(String, String, String)}を呼出
     *
     * - 印刷
     *   - {@link CommonService#printPdf(File pdf, int copy, String printer)}を呼出
     * </pre>
     *
     * @param criteriaDomain Domain<br />ドメイン
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract void searchOnPrintErt(WsBhtEisProductCriteriaDomain criteriaDomain) throws ApplicationException;

    // --------------------------------- Common ----------------------------------------------------------------------------
    // --------------------------------- 共通 ----------------------------------------------------------------------------
    /**
     *    [Common] CIGMA night-batch check
     * <br />[共通]CIGMA夜間バッチをチェックします。
     *
     * <pre>
     * Functional specification common : behavior in a CIGMA night batch
     *
     * 機能仕様共通：CIGMA夜間バッチ中の振る舞い
     * </pre>
     *
     * @param shipperCd shipperCd<br />荷主コード
     * @return Checked result<br />チェック結果
     * @throws ApplicationException  Application exception<br />アプリケーション例外
     */
    public abstract boolean validateDatabaseCigmaNightBatchRunning(String shipperCd) throws ApplicationException;
    
    /**
     *    [ws2502][ws2503] pallet/carton existence check
     * <br />[ws2502][ws2503]パレット/カートン区分存在チェック
     *
     * <pre>
     * Check the contents of the parameter succeeded from - BHT.
     *
     * - BHTから引継いだパラメータの内容を確認
     * </pre>
     *
     * @param languageCd LANGUAGE CODE<br />言語コード
     * @param palletNo PALLET NO<br />パレットNo
     * @return Error Code<br />エラーコード
     * @throws ApplicationException Application exception<br />アプリケーション例外
     */
    public abstract String validateDatabasePalletCartonTyp(String languageCd, String palletNo) throws ApplicationException ;
}
