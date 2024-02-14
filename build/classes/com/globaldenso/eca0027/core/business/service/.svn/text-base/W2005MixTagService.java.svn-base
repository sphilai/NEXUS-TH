/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmPkgMtrlDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtTmpStockDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwMixtagRtDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaWhXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmMeasureUnitCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixKanbanCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtPltzInstrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtTmpStockCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwMixtagRtCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaWhXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixKanbanService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagOdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagRtService;
import com.globaldenso.eca0027.core.auto.business.service.TtMixtagService;
import com.globaldenso.eca0027.core.auto.business.service.TtPltzInstrService;
import com.globaldenso.eca0027.core.auto.business.service.TtTmpStockService;
import com.globaldenso.eca0027.core.auto.business.service.TwMixtagRtService;
import com.globaldenso.eca0027.core.auto.business.service.TwMixtagService;
import com.globaldenso.eca0027.core.business.dao.W2005MixTagDao;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagItemDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagOdrDomain;
import com.globaldenso.eca0027.core.business.domain.W2005MixTagRtDomain;
import com.globaldenso.eca0027.core.business.domain.Ws2005ParamDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L2002ReportCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2005MixTagRtCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws2004RestService;
import com.globaldenso.eca0027.core.business.ws.Ws2005RestService;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;

/**
 * This is an interface of Multiple Item No. in 1Box PKG service.
 * <br />小箱内多品サービスのインタフェースです。
 * <pre>
 * bean id: w2005MixTagService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public interface W2005MixTagService {

    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    
    /**
     * 
     * Perform the correlation check of a MixTag day (FROM-TO).
     * <br />MixTag日(FROM-TO)の相関チェックを行います。
     * <pre>
     *   The correlation check (beginning date <= end date) of [common-specifications No.10] date is performed.
     * 
     * 
     * 【共通仕様No.10】日付の相関チェック(開始日付 <= 終了日付)を行います
     * </pre>
     * @param dateFormat Date format<br />日付フォーマット
     * @param fromDate Beginning date<br />開始日付
     * @param toDate End date<br />終了日付
     * @return If this is a beginning date <= end date, they are true, otherwise, false.<br />開始日付 If this is a beginning date <= end date, they are true, otherwise, false.<= 終了日付であればtrue、そうでなければfalse
     */
    public boolean validateConsistencyFmIssueDateToIssueDate(String dateFormat, String fromDate, String toDate);
    
    /**
     * Perform a QUANTITY check and a TAG-QUANTITY check.
     * <br />数量チェック、タグ数チェックを行います。
     * <pre>
     * - QUANTITY check
     *       Actual PKG QTY -- < --    the case of 1 -- error (00 and 000 grades regard it as 0)
     * - TAG-QUANTITY check
     *       Actual Tag QTY -- < --    the case of 1 -- error (00 and 000 grades regard it as 0)
     * 
     * 
     * - 数量チェック
     *     Actual PKG QTY <  1の場合 (00、000等は0とみなす)エラー
     * - タグ数チェック
     *     Actual Tag QTY <  1の場合 (00、000等は0とみなす)エラー
     * </pre>
     * 
     * @param qty QTY 
     * @return check result (true or false)
     */
    public boolean validateConsistencyQty(BigDecimal qty);
        
    /**
     * Check [ whether all the selected data is the same and ].
     * <br />選択された全データが同一かどうかチェックを行います。
     * <pre>
     * 
     * - CONTAINER-SORTING-KEY check
     *       An error is made when containerSortingKey of all the selected data differs.
     * 
     * - C/L check
     *       An error is made when C/L of all the selected data differs.
     * 
     * - Inv. Key check
     *       An error is made when invoiceKey of all the selected data differs.
     * 
     * - CUSTOM-TIMING-TYPE check
     *       An error is made when C/C TYPE of all the selected data differs.
     * 
     * - Currency check
     *       An error is made when currCd of all the selected data differs.
     * 
     * 
     * - コンテナ層別キーチェック
     *     選択された全データのcontainerSortingKeyが異なる場合エラー
     *
     * - コンテナルーズチェック
     *     選択された全データのC/Lが異なる場合エラー
     *
     * - インボイスキーチェック
     *     選択された全データのinvoiceKeyが異なる場合エラー
     *     
     * - 通関タイミング区分チェック
     *     選択された全データのC/C TYPEが異なる場合エラー
     *     
     * - 通貨チェック
     *     選択された全データのcurrCdが異なる場合エラー
     *       
     * </pre>
     * 
     * @param inputList List which stored the string which carries out the same check in some numbers<br />各種同一チェックする文字列を格納したList
     * @return check result (true or false)
     */
    public boolean validateConsistencyAllSame(List<String> inputList);
        
    /**
     * Confirm whether a string is NULL ("").
     * <br />文字列がNULL("")かどうかチェックします。
     * <pre>
     * - Special-Information number information acquisition check
     *       In C/L ="" (blank), an error is made.
     *
     * - export-formalities ITEM-NO information acquisition check
     *       In DngrItemFlg(hidden) ="", an error is made.
     *
     * - Survey WEIGHT check
     *       In N/W / Ship Lot(XXXX) ="", an error is made.
     * 
     * 
     * - 輸出出荷品目番号情報取得チェック
     *     C/L　＝　""(空白)の場合エラー
     *     
     * - 輸出手続き品目番号情報取得チェック
     *     DngrItemFlg(hidden)　＝　""の場合エラー
     *     
     * - 実測重量チェック
     *     N/W / Ship Lot(XXXX)　＝　""の場合エラー
     * </pre>
     * 
     * @param input C/L, DngrItemFlg(hidden,  N/W / Ship Lot(XXXX)などの文字列
     * @return check result (true or false)
     */
    public boolean validateConsistencyBlankOrNull(String input);
    
    /**
     * Perform a CIGMA information acquisition check.
     * <br />CIGMA情報取得チェックを行います。
     * <pre>
     * - CIGMA information acquisition check
     *       An error is made when "" exists in currencyCD (hidden), qtyUnit (hidden), or plantcd (hidden).
     * 
     * 
     * - CIGMA情報取得チェック
     *     currencyCD(hidden)、qtyUnit(hidden)、plantcd(hidden)のいずれかに""が存在する場合エラー
     * </pre>
     * 
     * @param currencycd Currency CD
     * @param qtyunit QTY Unit
     * @param plantcd Plant CD
     * @return check result (true or false)
     */
    public boolean validateConsistencyCurrencyCdQtyUnitPlantCd(String currencycd, String qtyunit, String plantcd);
    
    /**
     * Perform a directions over check.
     * <br />指示超えチェックを行います。
     * <pre>
     * - Packaging Instruction (=Pull) check
     *       In pltzInstrNo="", this is true about a return VALUE.
     *
     * - Directions over check
     *       In Actual PKG QTY > (Instr. QTY - Instr. PKGed QTY), an error is made.
     * 
     * 
     * - 梱包指示チェック
     *     pltzInstrNo=""の場合、戻り値をtrue
     * 
     * - 指示超えチェック
     *     Actual PKG QTY > (Instr. QTY - Instr. PKGed QTY)の場合エラー
     * </pre>
     * 
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @param actualPkgQty Actual PKG QTY 
     * @param instrQty Instr. QTY 
     * @param instrPkgedQty Instr. PKGed QTY
     * @return check result (true or false)
     */
    public boolean validateConsistencyInstrQtyInstrPKGedQtyOver(String pltzInstrNo, 
        BigDecimal actualPkgQty, BigDecimal instrQty, BigDecimal instrPkgedQty);
        
    /**
     * Perform a loading position code check.
     * <br />荷積み位置コードチェックを行います。
     * <pre>
     * - loading position code check
     *       An error is made when "D" (Door) and "B" (Back) are intermingled in LD CD of all the selected data.
     *       *"F" (Free) can be intermingled [ other CDs and ].
     * 
     * 
     * - 荷積み位置コードチェック
     *     選択された全データのLD CDに"D"（Door）と"B"（Back）が混在している場合エラー　
     *     ※"F"（Free）は他コードと混在可
     * </pre>
     * 
     * @param ldCdList LD CD List
     * @return check result (true or false)
     */
    public boolean validateConsistencyLdCd(List<String> ldCdList);
    
    /**
     * Perform an order over check.
     * <br />オーダー超えチェックを行います。
     * <pre>
     * - Order over check
     *       In Actual PKG QTY > Order QTY, an error is made.
     * 
     * 
     * - オーダー超えチェック
     *     Actual PKG QTY > Order QTYの場合エラー
     * </pre>
     * 
     * @param actualPkgQty Actual PKG QTY 
     * @param orderQty Order QTY
     * @return check result (true or false)
     */
    public boolean validateConsistencyOrderQtyOver(BigDecimal actualPkgQty, BigDecimal orderQty);
    
    /**
     * Perform the unique check of a Packing material.
     * <br />包装材のユニークチェックを行います。
     * <pre>
     * Perform the unique check of a Packing material.
     * 
     * 
     * - 包装材のユニークチェック
     *     入力したPakage Item No.に同じ品番が存在する場合
     * </pre>
     * 
     * @param pakageItemNoMap Pakage Item No.
     * @param pkgItemList List of the inputted same Pakage Item No<br />入力した同じPakage Item NoのList
     * @return check result (true or false)
     */
    public boolean validateConsistencyPakageItemNo(Map<Integer, String> pakageItemNoMap, List<Integer> pkgItemList);
    
    /**
    * Perform a Packing-material registration-confirmed check.
      * <br />包装材登録確認チェックを行います。
     * <pre>
     * - Packing-material registration-confirmed check
     *       An error is made when PKG I/P is N.
     * 
     * 
     * - 包装材登録確認チェック
     *     PKG I/PがNの場合エラー
     * </pre>
     * 
     * @param pkgIp PKG I/P
     * @return check result (true or false)
     */
    public boolean validateConsistencyPkgIp(String pkgIp);
    
    /**
     * Perform the minimum PKG check.
     * <br />最小梱包チェックを行います。
     * <pre>
     * - The minimum PKG check
     *       In PKG object record < 2 affair or (PKG object record = one affair   and Actual Tag QTY < 2), an error is made.
     * 
     * 
     * - 最小梱包チェック
     *     梱包対象レコード < 2件 or (梱包対象レコード = 1件　かつ　Actual Tag QTY < 2)の場合エラー
     * </pre>
     * 
     * @param count Record Count
     * @param actualTagQty Actual Tag QTY 
     * @return check result (true or false)
     */
    public boolean validateConsistencyPltzTargetRecordActualTagQty(int count, BigDecimal actualTagQty);
    
    /**
     * Perform a SHIPPING-LOT over check.
     * <br />出荷ロット超えチェックを行います。
     * <pre>
     * - SHIPPING-LOT over check
     *       (Actual PKG QTY /Actual Tag QTY) In > Ship Lot, an error is made.
     * 
     * 
     * - 出荷ロット超えチェック
     *     (Actual PKG QTY / Actual Tag QTY) > Ship Lotの場合エラー
     * </pre>
     * 
     * @param actualPkgQty Actual PKG QTY 
     * @param actualTagQty Actual Tag QTY
     * @param shipLot Ship Lot
     * @return check result (true or false)
     */
    public boolean validateConsistencyShipLotOver(BigDecimal actualPkgQty, BigDecimal actualTagQty, BigDecimal shipLot);
    
    /**
     * Perform a Warning check check.
     * <br />Warning確認チェックを行います。
     * <pre>
     * - Warning check check
     *       Although WarningFlg(hidden) =1 exists, an error is made when Ignore Warnings is not chosen.
     * 
     * 
     * - Warning確認チェック
     *     WarningFlg(hidden)=1が存在するが、Ignore Warningsが選択されていない場合エラー
     * </pre>
     * 
     * @param warningFlgList Warning Flg List
     * @param ignoreWarnings Ignore Warnings
     * @return check result (true or false)
     */
    public boolean validateConsistencyWarningFlgIgnoreWarnings(List<String> warningFlgList, String ignoreWarnings);

    // Database check method validateDatabase
    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     * Check the use propriety of CIGMA.
     * <br />CIGMAの利用可否をチェックします。
     * <pre>
    * Shipper confirms whether to be among a night batch.
     * details -- common-specifications .xls -- "-- functional specification common: -- refer to behavior" in a CIGMA night batch
      * 
     * 
     * Shipperが夜間バッチ中かをチェックします。
     * 詳細は共通仕様.xls「機能仕様共通：CIGMA夜間バッチ中の振る舞い」を参照
     * </pre>
     * 
     * @param isShipping24hFunc The functional flag corresponding to 24H shipment<br />24H出荷対応機能フラグ
     * @param compCd COMPANY CODE<br />会社コード
     * @return If CIGMA can be used, they will be true, otherwise, false.<br />CIGMAが利用可能であればtrue、そうでなければfalse
     * @throws ApplicationException When use propriety of CIGMA cannot be judged<br />CIGMAの利用可否を判定できない場合
     */
    public boolean validateDatabaseCigmaAvailable(boolean isShipping24hFunc, String compCd)
        throws ApplicationException;
    
    /**
     * Confirm whether the combination of W/H Company and W/H is right.
     * <br />W/H Company、W/H　の組み合わせが正しいかどうかをチェックします。
     * <pre>
     * W/H Company and NEXUS W/H Combination check
     * details -- common-specifications .xls -- "-- functional specification common: -- refer to W/H Company and the NEXUS W/H combination check "
     * 
     * 
     * W/H Company、NEXUS W/H　組み合わせチェック
     * 詳細は共通仕様.xls「機能仕様共通：W/H Company、NEXUS W/H　組み合わせチェック」を参照
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param whCd W/H CD<br />倉庫コード
     * @return If a W/H company and the combination of W/H exist in a NEXUS Warehouse Master, they will be true, otherwise, false.<br />W/H会社、W/Hの組み合わせが倉庫原単位に存在すればtrue、そうでなければfalse
     * @throws ApplicationException When a NEXUS Warehouse Master cannot be referred to<br />倉庫原単位が参照できない場合
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd)
        throws ApplicationException;
    
    /**
     * Confirm whether the inputted COMPANY CODE exists in a NEXUS Company Master as a shipper.
     * <br />入力された会社コードがNEXUS会社原単位に荷主として存在するかどうかをチェックします。
     * <pre>
     * Shipper existence check
     * details -- common-specifications .xls -- "-- functional specification common: -- refer to the Shipper existence check "
     * 
     * 
     * Shipper存在チェック
     * 詳細は共通仕様.xls「機能仕様共通：Shipper存在チェック」を参照
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @return if a COMPANY CODE exists in a NEXUS Company Master as a shipper -- true -- if it kicks right [ that ] -- false<br />会社コードが荷主としてNEXUS会社原単位に存在すればtrue、そうでければfalse
     * @throws ApplicationException When the COMPANY CODE is not defined as a NEXUS Company Master as a shipper<br />会社コードが荷主としてNEXUS会社原単位に定義されていない場合
     */
    public boolean validateDatabaseShipper(String compCd)
        throws ApplicationException;
    
    /**
     * Confirm whether the combination of Shipper, Customer, and Ship to is right.
     * <br />Shipper、Customer、Ship to　の組み合わせが正しいかどうかをチェックします。
     * <pre>
     * Shipper, Customer, and Ship to Combination check
     * details -- common-specifications .xls -- "-- functional specification common: -- refer to Shipper, Customer, and the Ship to combination check "
     * 
     * 
     * Shipper、Customer、Ship to　組み合わせチェック
     * 詳細は共通仕様.xls「機能仕様共通：Shipper、Customer、Ship to　組み合わせチェック」を参照
     * </pre>
     * 
     * @param lgcyLibCompCd COMPANY CODE<br />会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipToCd SHIP TO CODE<br />送荷先コード
     * @return It will be true if the combination of a company, a customer, and a Ship to exists in a CIGMA Ship To Cross Reference Master,<br />会社、得意先、送荷先の組み合わせがNEXUS送荷先クロスリファレンス原単位に存在すればtrue、そうでなければfalse
     * @throws ApplicationException * Otherwise, false When a CIGMA Ship To Cross Reference Master cannot be referred to<br />NEXUS送荷先クロスリファレンス原単位が参照できない場合
     */
    public boolean validateDatabaseShipperCustomerShipTo(String lgcyLibCompCd, String customerCd, String lgcyShipToCd)
        throws ApplicationException;
    
    /**
     * Perform an authority check.
     * <br />権限チェックを行います。
     * <pre>
     * - Authority check (update authority)  
     *       The following is made into an argument and this is a call about {@link UserAuthService#hasUserAuthForCompPlnt (String, String, String)}.
     *         - Approval ID:W 2005R
     *         - COMPANY CODE
     *         - PLANT CODE
     * 
     * 
     * - 権限チェック(更新権限)
     *     以下を引数にして、{@link UserAuthService#hasUserAuthForCompPlnt(String, String, String)}を呼出
     *       - 認可ID:W2005R
     *       - 会社コード
     *       - 製造部工場区分
     * </pre>
     * 
     * @param shipperCd COMPANY CODE<br />会社コード
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @return If there is a functional utilization right over the COMPANY CODE and PLANT CODE which were specified, they will be true, otherwise, false.<br />指定された会社コード、製造部工場区分に対する機能利用権限があればtrue、そうでなければfalse
     * @throws ApplicationException When an authority check is not made<br />権限チェックができない場合
     */
    public boolean validateDatabaseShipperPlantAuth(String shipperCd, String plntCd)
        throws ApplicationException;
    
    /**
     * Confirm whether the combination of Shipper, W/H, and Plant is right.
     * <br />Shipper、W/H、Plantの組み合わせが正しいかどうかをチェックします。
     * <pre>
     * Shipper, W/H, and Plant Combination check
     * details -- common-specifications .xls -- "-- functional specification common: -- refer to Shipper, W/H, and the Plant combination check "
     * 
     * 
     * Shipper、W/H、Plant　組み合わせチェック
     * 詳細は共通仕様.xls「機能仕様共通：Shipper、W/H、Plant　組み合わせチェック」を参照
     * </pre>
     * 
     * @param lgcyLibCompCd COMPANY CODE<br />会社コード
     * @param lgcyWhCd W/H CD<br />倉庫コード
     * @param plantCd Factory code<br />工場コード
     * @return It will be true if the combination of a company, W/H, and a factory code exists in a NEXUS CIGMA Warehouse Cross Reference Master, Otherwise, false<br />会社、W/H、工場コードの組み合わせがNEXUS倉庫クロスリファレンス原単位に存在すればtrue、そうでなければfalse
     * @exception ApplicationException * When a @exception ApplicationException NEXUS CIGMA Warehouse Cross Reference Master cannot be referred to<br />NEXUS倉庫クロスリファレンス原単位が参照できない場合
     */
    public boolean validateDatabaseShipperWhPlant(String lgcyLibCompCd, String lgcyWhCd, String plantCd)
        throws ApplicationException;
    
    /**
     * Check existence of a CIGMA Warehouse Cross Reference Master.
     * <br />倉庫クロスリファレンス原単位の存在をチェックをします。(権限チェックあり)
     * <pre>
     * - Authority information is acquired (update authority).
     *       Approval ID:W 2005R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String ...)}.
     *
     * - CIGMA Warehouse Cross Reference Master's existence check
     *     The following items are set as {@link W2005MixTagCriteriaDomain}.
     *       - This is {@link UserAuthDomain} as a result of acquisition (update authority) of the above-mentioned authority information.
     *       - lgcyLibCompCd COMPANY CODE
     *       - compCd / COMPANY CODE
     *       - whCd / W/H CD
     *
     *     This is a call about {@link W2005MixTagDao#searchTmCigmaWhXrefByAuth (W2005MixTagCriteriaDomain)}.
     * 
     * 
     * - 権限情報を取得(更新権限)
     *     認可ID:W2005Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     * 
     * - 倉庫クロスリファレンス原単位の存在チェック
     *   {@link W2005MixTagCriteriaDomain}に以下の項目を設定
     *     - 上記の権限情報を取得(更新権限)の結果{@link UserAuthDomain}
     *     - lgcyLibCompCd 会社コード
     *     - compCd/会社コード
     *     - whCd/倉庫コード
     *     
     *   {@link W2005MixTagDao#searchTmCigmaWhXrefByAuth(W2005MixTagCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param lgcyLibCompCd COMPANY CODE<br />会社コード
     * @param lgcyWhCd  lgcyWhCd<br />lgcyWhCd
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @param compCd COMPANY CODE<br />会社コード
     * @param whCd W/H CD<br />倉庫コード
     * @param serverId SERVER ID<br />サーバーID
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a CIGMA Warehouse Cross Reference Master cannot be referred to<br />倉庫クロスリファレンス原単位が参照できない場合
     */
    public boolean validateDatabaseTmCigmaWhXrefOnHeaderMoveToCreate(String lgcyLibCompCd, String[] lgcyWhCd, String plntCd, String[] compCd, String[] whCd, String serverId)
        throws ApplicationException;
    
    /**
     * Check existence of a Packing material.
     * <br />包装材の存在をチェックをします。
     * <pre>
     * - Check of a PKG Materials MA
     *       The following items are set to {@link TmPkgMtrlCriteriaDomain}.
     *         - ownerComp / OWNER COMPANY
     *         - pkgItemNo / PACKAGE ITEM NO
     *
     *       This is a call about {@link TmPkgMtrlService#searchByKey (TmPkgMtrlCriteriaDomain)}.
     * 
     * 
     * - 包装材原単位のチェック
     *     {@link TmPkgMtrlCriteriaDomain}に以下の項目を設定
     *       - ownerComp/責任会社
     *       - pkgItemNo/包装材品目番号
     *       
     *     {@link TmPkgMtrlService#searchByKey(TmPkgMtrlCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param ownerComp OWNER COMPANY<br />責任会社
     * @param pkgItemNo PACKAGE ITEM NO<br />包装材品目番号
     * @param mtrlDomain TmPkgMtrlDomain which stores search results<br />検索結果を格納するTmPkgMtrlDomain
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a PKG Materials MA and a PKG Materials Name MA cannot be referred to<br />包装材原単位、包装材名称原単位が参照できない場合
     */
    public boolean validateDatabaseTmPkgMaterialsOnDetailSave(String ownerComp, String pkgItemNo, TmPkgMtrlDomain mtrlDomain)
        throws ApplicationException;
    
    /**
     * Check a directions over.
     * <br />指示超えをチェックします。
     * <pre>
     * - Packaging Instruction (=Pull) check
     *       In pltzInstrNo="", this is true about a return VALUE.
     *
     * Acquire the sum total of a PKG QTY from - Mix Tag and a MIXED ITEM NO.
     *       The following items are set as {@link W2005MixTagCriteriaDomain}.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *
     *       This is a call about {@link W2005MixTagDao#searchTtMixtagItemNoByActualQtyOver (W2005MixTagCriteriaDomain)}.
     *
     * - Directions over check
     *       In Actual PKG QTY > (Instr. QTY - the above-mentioned result QTY of {@link W2005MixTagItemDomain}), an error is made.
     * 
     * 
     * - 梱包指示チェック
     *     pltzInstrNo=""の場合、戻り値をtrue
     *   
     * - MIXED現品票、MIXED品目番号より梱包数量の合計を取得
     *     {@link W2005MixTagCriteriaDomain}に以下の項目を設定
     *       - pltzInstrNo/梱包指示NO
     *       
     *     {@link W2005MixTagDao#searchTtMixtagItemNoByActualQtyOver(W2005MixTagCriteriaDomain)}を呼出
     *     
     * - 指示超えチェック
     *     Actual PKG QTY > (Instr. QTY － 上記の結果{@link W2005MixTagItemDomain}のQTY)の場合エラー
     * </pre>
     * 
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @param pkgCd pkgCd PACKAGE CODE<br />包装区分
     * @param itemNo ITEM NO<br />品目番号
     * @param actualPkgQty Actual PKG QTY 
     * @param instrQty Instr. QTY 
     * @return If this is not over directions, they are true, otherwise, false.<br />指示を越えていなければtrue、そうでなければfalse
     * @throws ApplicationException When a Mix Tag and a MIXED ITEM NO cannot be referred to<br />MIXED現品票、MIXED品目番号を参照できない場合
     */
    public boolean validateDatabaseTtMixtagItemNoOnRegister(String pltzInstrNo, String itemNo, String pkgCd, BigDecimal actualPkgQty, BigDecimal instrQty)
        throws ApplicationException;
    
    /**
     * Existence-check [ of a Mix Tag ], and reach and carry out a Status check.
     * <br />MIXED現品票の存在チェック、及び、ステータスチェックします。
     * <pre>
     * A - Mix Tag's existence check and a Status check
     *       The following items are set to {@link TtMixtagCriteriaDomain}.
     *         - mixTagNo / MIX TAG NO
     *
     *       This is a call about {@link TtMixtagService#lockByKey (TtMixtagCriteriaDomain)}.
     * 
     * 
     * - MIXED現品票の存在チェック、及び、ステータスチェック
     *     {@link TtMixtagCriteriaDomain}に以下の項目を設定
     *       - mixTagNo/MIXタグNO
     *       
     *     {@link TtMixtagService#lockByKey(TtMixtagCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param mixTagNo MIX TAG NO<br />MIXタグNO
     * @return When applicable data does not exist, this is GSCM_E 0_0010.<br />該当するデータが存在しない場合はGSCM_E0_0010<br />
     *         When a Status is except "10", this is NXS_E 1_0011.<br />ステータスが"10"以外の場合はNXS_E1_0011<br />
     *         This is null except it.<br />それ以外はnull
     * @throws ApplicationException When a Mix Tag cannot be referred to<br />MIXED現品票を参照できない場合
     */
    public String validateDatabaseTtMixtagOnRegisterCancel(String mixTagNo)
        throws ApplicationException;
    
    /**
     * Check existence of a Packaging Instruction (=Pull).
     * <br />梱包指示の存在をチェックします。
     * <pre>
     * - Packaging Instruction (=Pull) check
     *       In pltzInstrNo="", this is true about a return VALUE.
     *
     * - Packaging Instruction (=Pull) existence check
     *       The following is set to {@link TtPltzInstrCriteriaDomain}.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *
     *       This is a call about {@link TtPltzInstrService#lockByKey (TtPltzInstrCriteriaDomain)}.
     * 
     * 
     * - 梱包指示チェック
     *     pltzInstrNo=""の場合、戻り値をtrue
     * 
     * - 梱包指示存在チェック
     *     {@link TtPltzInstrCriteriaDomain}に以下を設定
     *       - pltzInstrNo/梱包指示NO
     *       
     *     {@link TtPltzInstrService#lockByKey(TtPltzInstrCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param pltzInstrNo Packaging Instruction (=Pull) NO<br />梱包指示NO
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a Packaging Instruction (=Pull) cannot be referred to<br />梱包指示が参照できない場合
     */
    public boolean validateDatabaseTtPltzInstrOnRegister(String pltzInstrNo)
        throws ApplicationException;
    
    /**
     * Check a Packaging Instruction (=Pull) information.
     * <br />梱包指示情報をチェックします。
     * <pre>
     * - Authority information is acquired (update authority).  
     *       Approval ID:W 2005R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String ...)}.
     *
     * - Packaging Instruction (=Pull) and CIGMA Warehouse Cross Reference Master's existence check
     *       The following items are set as {@link W2005MixTagCriteriaDomain}.
     *         - This is {@link UserAuthDomain} as a result of acquisition (update authority) of the above-mentioned authority information.
     *         - pltzInstrNo / Packaging Instruction (=Pull) NO
     *
     *       This is a call about {@link W2005MixTagDao#searchTtPltzInstrOnHeaderMoveToCreate (W2005MixTagCriteriaDomain)}.
     * 
     * 
     * - 権限情報を取得(更新権限)
     *     認可ID:W2005Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     * 
     * - 梱包指示、倉庫クロスリファレンス原単位の存在チェック
     *     {@link W2005MixTagCriteriaDomain}に以下の項目を設定
     *       - 上記の権限情報を取得(更新権限)の結果{@link UserAuthDomain}
     *       - pltzInstrNo/梱包指示NO
     *       
     *     {@link W2005MixTagDao#searchTtPltzInstrOnHeaderMoveToCreate(W2005MixTagCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param mixTag Mix-Tag domain * This is used as a return VALUE.<br />MIXED現品票ドメイン ※戻り値として使用
     * @param mixTagCriteria Mix-Tag condition domain<br />MIXED現品票条件ドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a Packaging Instruction (=Pull) and a CIGMA Warehouse Cross Reference Master cannot be referred to<br />梱包指示、倉庫クロスリファレンス原単位を参照できない場合
     */
    public boolean validateDatabaseTtPltzOnHeaderMoveToCreate(W2005MixTagDomain mixTag, W2005MixTagCriteriaDomain mixTagCriteria)
        throws ApplicationException;
    
    /**
     * Check NEXUS warehouse information acquisition.
     * <br />NEXUS倉庫情報取得をチェックします。
     * <pre>
     * Check - NEXUS warehouse information acquisition.
     *       The VALUE of compCd is checked.
     * 
     * 
     * - NEXUS倉庫情報取得をチェック
     *     compCdの値をチェック
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @return If compCd is "", they are true, otherwise, false.<br />compCdが""であればtrue、そうでなければfalse
     */
    public boolean validateDatabaseTtPltzOnHeaderMoveToCreateByCompCd(String compCd);
    
    /**
     * Check ending with the completion of a PKG.
     * <br />梱包完了済みをチェックします。
     * <pre>
     * - Check completed [ PKG ]
     *       The VALUE of pltzInstrStatus is checked.
     * 
     * 
     * - 梱包完了済みチェック
     *     pltzInstrStatusの値をチェック
     * </pre>
     * 
     * @param pltzInstrStatus PALLETIZE INSTRUCTION STATUS<br />梱包指示ステータス
     * @return If pltzInstrStatus is except ("40"or"50"), they are true, otherwise, false.<br />pltzInstrStatusが("40" or "50")以外であればtrue、そうでなければfalse
     */
    public boolean validateDatabaseTtPltzOnHeaderMoveToCreateByCompletion(String pltzInstrStatus);
    
    /**
     * Check Packaging Instruction (=Pull) document printing before.
     * <br />梱包指示書印刷前をチェックします。
     * <pre>
     * - Packaging Instruction (=Pull) document printing check
     *       The VALUE of pltzInstrStatus is checked.
     * 
     * 
     * - 梱包指示書印刷チェック
     *     pltzInstrStatusの値をチェック
     * </pre>
     * 
     * @param pltzInstrStatus PALLETIZE INSTRUCTION STATUS<br />梱包指示ステータス
     * @return If pltzInstrStatus is except "10", they are true, otherwise, false.<br />pltzInstrStatusが"10"以外であればtrue、そうでなければfalse
     */
    public boolean validateDatabaseTtPltzOnHeaderMoveToCreateByPrint(String pltzInstrStatus);
    
    /**
     * Confirm whether a Mix Tag Work exists.
     * <br />MIXED品目番号ワークが存在するかチェックします。
     * <pre>
     * - Create of a search-condition domain
     *       {@link TwMixtagCriteriaDomain} is created and the DSC-ID of an argument is set up.
     *       searchCountCheckFlg of a search-condition domain is set as flase.
     *
     * A search of - Mix Tag Work
     *       {@link TwMixtagService#searchCount (TwMixtagCriteriaDomain)} is called,
     *       If the acquisition number is 0, it will be considered as an error.
     * 
     * 
     * - 検索条件ドメインの作成
     *     {@link TwMixtagCriteriaDomain}を作成し、引数のDSC-IDを設定する
     *     検索条件ドメインのsearchCountCheckFlgをflaseに設定する
     *     
     * - MIXED品目番号ワークの検索
     *     {@link TwMixtagService#searchCount(TwMixtagCriteriaDomain)}を呼出し、
     *     取得件数が0であれば、エラーとする
     * </pre>
     * 
     * 
     * @param dscId DSC-ID
     * @return If a Mix Tag Work exists, they will be true, otherwise, false.<br />MIXED品目番号ワークが存在すればtrue、そうでなければfalse
     * @throws ApplicationException When a Mix Tag Work cannot be referred to<br />MIXED品目番号ワークが参照できない場合
     */
    public boolean validateDatabaseTwMixtagOnCreateMoveToRegister(String dscId)
        throws ApplicationException;
    
    /**
     * Perform a Multiple Item No. in 1Box PKG number of the same condition check.
     * <br />同一小箱内多品番条件チェックを行います。
     * <pre>
     * - Create of a search-condition domain
     *       {@link TwMixtagCriteriaDomain} is created and the DSC-ID of an argument is set up.
     *
     *
     * A search of - Mix Tag Work
     *       {@link TwMixtagService#searchByConditionForPaging (TwMixtagCriteriaDomain)} is called,
     *
     *       To a Mix Tag Work, a DSC-ID is [52]:Cont. Sort Key equally,
     *       [53] : LD CD ("D" (Door) and "B" (Back) are intermingled),
     *       [57] : C/L, [66]:Inv. Set Key, [68]:C/C TYPE,
     *       [74] : When the data in which currencyCD(s) (hidden) differ exists, this is considered as an error.
     *       * When data does not exist, this is not considered as a target.
     * 
     * 
     * - 検索条件ドメインの作成
     *     {@link TwMixtagCriteriaDomain}を作成し、引数のDSC-IDを設定する
     *     
     *     
     * - MIXED品目番号ワークの検索
     *     {@link TwMixtagService#searchByConditionForPaging(TwMixtagCriteriaDomain)}を呼出し、
     *     
     *     MIXED品目番号ワークに、DSC-IDが等しく【52】:Cont. Sort Key、
     *     【53】:LD CD("D"（Door）と"B"（Back）が混在)、
     *     【57】:C/L、【66】:Inv. Set Key、【68】:C/C TYPE、
     *     【74】:currencyCD(hidden)が異なるデータが存在する場合エラーとする
     *     ※データが存在しない場合は対象としない
     * </pre>
     * 
     * 
     * @param dscId DSC-ID
     * @param domainList The list of selected screens<br />選択した画面のリスト
     * @param paramsList Parameter list<br />パラメータリスト
     * @return If a Mix Tag Work exists, they will be true, otherwise, false.<br />MIXED品目番号ワークが存在すればtrue、そうでなければfalse
     * @throws ApplicationException When a Mix Tag Work cannot be referred to<br />MIXED品目番号ワークが参照できない場合
     */
    public boolean validateDatabaseTwMixtagOnCreateUpdateByCondition(
        String dscId, List<W2005MixTagItemDomain> domainList, List<String> paramsList)
        throws ApplicationException;
    
    /**
     * Perform the registration number check.
     * <br />登録件数チェックを行います。
     *
     * @param dscId DSC-ID
     * @param registerNum Registration number<br />登録件数
     * @return The number + of a Mix Tag Work Registration number <= If this is {@link Eca0027Constants#TW_MIX_TAG_ITEM_NO_MAX_COUNT}, this is [ true and ] false except it.<br />MIXED品目番号ワークの件数 + 登録件数 The number + of a Mix Tag Work Registration number <= If this is {@link Eca0027Constants#TW_MIX_TAG_ITEM_NO_MAX_COUNT}, this is [ true and ] false except it.<= {@link Eca0027Constants#TW_MIX_TAG_ITEM_NO_MAX_COUNT}であればtrue、それ以外はfalse
     * @throws ApplicationException When the number of a Mix Tag Work is unacquirable<br />MIXED品目番号ワークの件数が取得できない場合
     */
    public boolean validateDatabaseTwMixtagOnCreateUpdateByCount(String dscId, int registerNum)
        throws ApplicationException;
    
    // Registration system method create
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    
    // Search system method search
    // --------------------------------- 検索系メソッド search -----------------------------------------------------------
    /**
     * Acquire the search number of a multiple-p/n-packaged-in-box Main Screen.
     * <br />小箱内多品番梱包Main Screen画面の検索件数を取得します。
     * <pre>
     * - Authority information is acquired (reference authority).
     *       Approval ID:W 2005B is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String ...)}.
     *
     * - Authority information is acquired (update authority).
     *       Approval ID:W 2005R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String ...)}.
     *
     * - Mix Tag, the search number acquisition of a MIXED ITEM NO
     *       The above-mentioned authority information list of {@link UserAuthDomain} is set to criteria.
     *       criteria is made into an argument and this is a call about {@link W2005MixTagDao#searchCountTtMixtag (W2005MixTagCriteriaDomain)}.
     *       Refer to {the @link #searchForPagingOnMainSearch (W2005MixTagCriteriaDomain criteria)} for the details of retrieval processing.
     *
     * - The search number is returned.
     * 
     * 
     * - 権限情報を取得(参照権限)
     *     認可ID:W2005Bを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:W2005Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - MIXED現品票、MIXED品目番号の検索件数取得
     *     criteriaに上記の権限情報{@link UserAuthDomain}のリストを設定
     *     criteriaを引数にして、{@link W2005MixTagDao#searchCountTtMixtag(W2005MixTagCriteriaDomain)}を呼出
     *     検索処理の詳細は{@link #searchForPagingOnMainSearch(W2005MixTagCriteriaDomain criteria)}を参照
     *     
     * - 検索件数を返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When a Mix Tag and a MIXED ITEM NO cannot be referred to<br />MIXED現品票、MIXED品目番号が参照できない場合
     */
    public int searchCountForPagingOnMainSearch(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing (in the case of the result) of a multiple-p/n-packaged-in-box Create screen.
     * <br />小箱内多品番梱包Create画面の検索処理(成行の場合)を行います。
     * <pre>
     * - An Export Receive Order is used as the main tables, and is searched.
     *       criteria is made into an argument and {@link W2005MixTagDao#searchTtExpRcvOdr (W2005MixTagItemCriteriaDomain)} is called,
     *       The data which fulfills all the following conditions is acquired.
     *         - It corresponds to the conditions specified from the screen.
     *
     *       It sorts in following order.
     *         - CONTAINER SORTING KEY / CONTAINER SORTING KEY (ascending order)
     *         - LOADING CODE / L/D CD (ascending order)
     *         - ITEM NO / ITEM NO (ascending order)
     *         - PACKAGE CODE / PACKAGE CODE (ascending order)
     *
     * Narrowing down of - factory code (when the W/H CD of NEXUS is chosen, it processes (when {@link W2005MixTagDomain#getPlntCd()} is ""))
     *       Approval ID:W 2005R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String ...)}.
     *
     *       The following items are acquired from criteria.
     *         - shipperCd / Shipper CD
     *         - whCompCd / W/H Company CD
     *         - whCd / W/H CD
     *
     *       The item acquired from authority information list of {@link UserAuthDomain} and criteria is set as {@link W2005MixTagCriteriaDomain},
     *       This is a call about {@link W2005MixTagDao#searchTmCigmaWhXrefByAuth (W2005MixTagCriteriaDomain)}.
     *
     * - Acquisition of ITEM-NO number information
     *       The following items are acquired from criteria.
     *         - plntCd / PLANT CODE (it acquires, when the W/H CD of CIGMA is chosen, and this is except {@link W2005MixTagDomain#getPlntCd()} -- "" --)
     *         - lgcyWhCd / LEGACY WAREHOUSE CODE
     *         - customerCd / CUSTOMER CODE
     *
     *       A PLANT CODE is acquired (when the W/H CD of NEXUS is chosen, it acquires (when {@link W2005MixTagDomain#getPlntCd()} is "")).
     *         - PLANT CODE as a result of {@link W2005MixTagDao#searchTmCigmaWhXrefByAuth (W2005MixTagCriteriaDomain)}
     *
     *       The following items are acquired from the result of {@link W2005MixTagDao#searchTtExpRcvOdr (W2005MixTagItemCriteriaDomain)}.
     *         - itemNo * two or more acquisition
     *
     *       The acquired item is made into an argument,
     *       Web service (WS2004) {@link Ws2004RestService#searchItemInfoForCml (String, List, String, List, String)} is called,
     *       The information on the ITEM NO of {@link W2005MixTagDao#searchTtExpRcvOdr (W2005MixTagItemCriteriaDomain)} is acquired.
     *
     * - Converted of a QUANTITY UNIT
     *       The following items as a result of Web service (WS2004) are set to {@link TmMeasureUnitCriteriaDomain},
     *       This is a call about {@link TmCigmaWhXrefService#searchCount (TmCigmaWhXrefCriteriaDomain)}.
     *         - unitMeasure / QUANTITY UNIT
     *
     * - Combination of data
     *       The ITEM NO of an ITEM-NO information (result of {@link W2005MixTagDao#searchTtExpRcvOdr (W2005MixTagItemCriteriaDomain)}) is used as a key,
     *       The result and combination (the data which was not able to acquire the result of Web service is excepted) of Web service (WS2004)
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagItemDomain}.
     * 
     * 
     * - 輸出受注を主なテーブルとして検索
     *     criteriaを引数にして、{@link W2005MixTagDao#searchTtExpRcvOdr(W2005MixTagItemCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *     
     *     下記の順にソート
     *       - CONTAINER SORTING KEY/コンテナ層別キー (昇順)
     *       - LOADING CODE/荷積位置コード (昇順)
     *       - ITEM NO/品目番号 (昇順)
     *       - PACKAGE CODE/包装区分 (昇順)
     *     
     * - 工場コードの絞込み(NEXUSの倉庫コードを選択した場合({@link W2005MixTagDomain#getPlntCd()}が""の場合)処理)
     *     認可ID:W2005Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     *     criteriaより以下の項目を取得
     *       - shipperCd/荷主コード
     *       - whCompCd/倉庫会社コード
     *       - whCd/倉庫コード
     *       
     *     {@link W2005MixTagCriteriaDomain}に権限情報{@link UserAuthDomain}のリストとcriteriaより取得した項目を設定し、
     *     {@link W2005MixTagDao#searchTmCigmaWhXrefByAuth(W2005MixTagCriteriaDomain)}を呼出
     *     
     * - 品目番号番号情報の取得
     *     criteriaより以下の項目を取得
     *       - plntCd/製造部工場区分(CIGMAの倉庫コードを選択した場合({@link W2005MixTagDomain#getPlntCd()}が""以外の場合)取得)
     *       - lgcyWhCd/LEGACY倉庫コード
     *       - customerCd/得意先コード
     *       
     *     製造部工場区分を取得(NEXUSの倉庫コードを選択した場合({@link W2005MixTagDomain#getPlntCd()}が""の場合)取得)
     *       - {@link W2005MixTagDao#searchTmCigmaWhXrefByAuth(W2005MixTagCriteriaDomain)}の結果の製造部工場区分
     *       
     *     {@link W2005MixTagDao#searchTtExpRcvOdr(W2005MixTagItemCriteriaDomain)}の結果より以下の項目を取得
     *       - itemNo ※複数取得
     *       
     *     取得した項目を引数にして、
     *     Webサービス(WS2004){@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}を呼出し、
     *     {@link W2005MixTagDao#searchTtExpRcvOdr(W2005MixTagItemCriteriaDomain)}の品目番号に対する情報を取得
     *     
     * - 数量単位の変換
     *     {@link TmMeasureUnitCriteriaDomain}にWebサービス(WS2004)の結果の以下の項目を設定し、
     *     {@link TmCigmaWhXrefService#searchCount(TmCigmaWhXrefCriteriaDomain)}を呼出
     *       - unitMeasure/数量単位
     *
     * - データの結合
     *     品目番号情報({@link W2005MixTagDao#searchTtExpRcvOdr(W2005MixTagItemCriteriaDomain)}の結果)の品目番号をキーにして、
     *     Webサービス(WS2004)の結果と結合(Webサービスの結果が取得できなかったデータは除外する)
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagItemDomain}のリストで返却
     * </pre>
     * 
     * @param criteria MIXED-ITEM-NO search-condition domain<br />MIXED品目番号検索条件ドメイン
     * @param errMessages List which stores an error message<br />エラーメッセージを格納するList
     * @return MIXED-ITEM-NO domain<br />MIXED品目番号ドメイン
     * @throws ApplicationException When an Export Receive Order etc. cannot be referred to<br />輸出受注等が参照できない場合
     */
    public List<? extends W2005MixTagItemDomain> searchForPagingOnCreateSearchByNonInstr(W2005MixTagItemCriteriaDomain criteria, List<String> errMessages)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing (in the case of a Packaging Instruction (=Pull)) of a multiple-p/n-packaged-in-box Create screen.
     * <br />小箱内多品番梱包Create画面の検索処理(梱包指示の場合)を行います。
     * <pre>
     * - A Packaging Instruction (=Pull) and a Palletize Instruction Item No are used as the main tables, and are searched.
     *       criteria is made into an argument and {@link W2005MixTagDao#searchTtPltzInstr (W2005MixTagItemCriteriaDomain)} is called,
     *       The data which fulfills all the following conditions is acquired.
     *         - It corresponds to the conditions specified from the screen.
     *
     *       It sorts in following order.
     *         - CONTAINER SORTING KEY / CONTAINER SORTING KEY (ascending order)
     *         - LOADING CODE / L/D CD (ascending order)
     *         - ITEM NO / ITEM NO (ascending order)
     *         - PACKAGE CODE / PACKAGE CODE (ascending order)
     *
     * Narrowing down of - factory code
     *       * With this method, processing is unnecessary.
     *
     * - Acquisition of ITEM-NO number information
     *       The following items are acquired from criteria.
     *         - plntCd / PLANT CODE
     *         - lgcyWhCd / LEGACY WAREHOUSE CODE
     *         - customerCd / CUSTOMER CODE
     *
     *       The following items are acquired from the result of {@link W2005MixTagDao#searchTtPltzInstr (W2005MixTagItemCriteriaDomain)}.
     *         - itemNo * two or more acquisition
     *
     *       The acquired item is made into an argument,
     *       Web service (WS2004) {@link Ws2004RestService#searchItemInfoForCml (String, List, String, List, String)} is called,
     *       The information on the ITEM NO of {@link W2005MixTagDao#searchTtPltzInstr (W2005MixTagItemCriteriaDomain)} is acquired.
     *
     * - Converted of a QUANTITY UNIT
     *       The following items as a result of Web service (WS2004) are set to {@link TmMeasureUnitCriteriaDomain},
     *       This is a call about {@link TmCigmaWhXrefService#searchCount (TmCigmaWhXrefCriteriaDomain)}.
     *         - unitMeasure / QUANTITY UNIT
     *
     * - Combination of data
     *       The ITEM NO of an ITEM-NO information {@link W2005MixTagDao#searchTtPltzInstr (W2005MixTagItemCriteriaDomain)} is used as a key,
     *       The result and combination (the data which was not able to acquire the result of Web service is excepted) of Web service (WS2004)
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagItemDomain}.
     * 
     * 
     * - 梱包指示、梱包指示品目番号を主なテーブルとして検索
     *     criteriaを引数にして、{@link W2005MixTagDao#searchTtPltzInstr(W2005MixTagItemCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *     
     *     下記の順にソート
     *       - CONTAINER SORTING KEY/コンテナ層別キー (昇順)
     *       - LOADING CODE/荷積位置コード (昇順)
     *       - ITEM NO/品目番号 (昇順)
     *       - PACKAGE CODE/包装区分 (昇順)
     *     
     * - 工場コードの絞込み
     *     ※このメソッドでは処理不要
     *     
     * - 品目番号番号情報の取得
     *     criteriaより以下の項目を取得
     *       - plntCd/製造部工場区分
     *       - lgcyWhCd/LEGACY倉庫コード
     *       - customerCd/得意先コード
     *       
     *     {@link W2005MixTagDao#searchTtPltzInstr(W2005MixTagItemCriteriaDomain)}の結果より以下の項目を取得
     *       - itemNo ※複数取得
     *       
     *     取得した項目を引数にして、
     *     Webサービス(WS2004){@link Ws2004RestService#searchItemInfoForCml(String, List, String, List, String)}を呼出し、
     *     {@link W2005MixTagDao#searchTtPltzInstr(W2005MixTagItemCriteriaDomain)}の品目番号に対する情報を取得
     *
     * - 数量単位の変換
     *     {@link TmMeasureUnitCriteriaDomain}にWebサービス(WS2004)の結果の以下の項目を設定し、
     *     {@link TmCigmaWhXrefService#searchCount(TmCigmaWhXrefCriteriaDomain)}を呼出
     *       - unitMeasure/数量単位
     *
     * - データの結合
     *     品目番号情報{@link W2005MixTagDao#searchTtPltzInstr(W2005MixTagItemCriteriaDomain)}の品目番号をキーにして、
     *     Webサービス(WS2004)の結果と結合(Webサービスの結果が取得できなかったデータは除外する)
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagItemDomain}のリストで返却
     * </pre>
     * 
     * @param criteria MIXED-ITEM-NO search-condition domain<br />MIXED品目番号検索条件ドメイン
     * @param errMessages List which stores an error message<br />エラーメッセージを格納するList
     * @return MIXED-ITEM-NO domain<br />MIXED品目番号ドメイン
     * @throws ApplicationException When a Packaging Instruction (=Pull) and a Palletize Instruction Item No cannot be referred to<br />梱包指示、梱包指示品目番号が参照できない場合
     */
    public List<? extends W2005MixTagItemDomain> searchForPagingOnCreateSearchByPltzInstr(W2005MixTagItemCriteriaDomain criteria, List<String> errMessages)
        throws ApplicationException;

    /**
     * Perform retrieval processing of a multiple-p/n-packaged-in-box Main Screen.
     * <br />小箱内多品番梱包Main Screen画面の検索処理を行います。
     * <pre>
     * - Authority information is acquired (reference authority).
     *       Approval ID:W 2005B is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String...)}.
     *
     * - Authority information is acquired (update authority).
     *       Approval ID:W 2005R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String...)}.
     *
     * A search of - Mix Tag and a MIXED ITEM NO
     *       The above-mentioned authority information list of {@link UserAuthDomain} is set to criteria.
     *       criteria is made into an argument and {@link W2005MixTagDao#searchForPagingTtMixtag (W2005MixTagCriteriaDomain)} is called,
     *       The data which fulfills all the following conditions is acquired.
     *         - It corresponds to the conditions specified from the screen.
     *         - This is contained in the specified page.
     *         - Shipper CD and a PLANT CODE correspond to the authority which a login user has.
     *
     *       It sorts in following order.
     *         - CUSTOMER CODE / CUSTOMER CODE (ascending order)
     *         - LEGACY SHIP TO / LEGACY SHIP TO (ascending order)
     *         - TRANSPORT CODE / TRANSPORT CODE (ascending order)
     *         - PLANT CODE / PLANT CODE (ascending order)
     *         - LEGACY WAREHOUSE CODE / LEGACY WAREHOUSE CODE (ascending order)
     *         - MULTI ITEM NO IN BOX STATUS / MULTI ITEM NO IN BOX STATUS (ascending order)
     *         - MIX TAG NO / MIX TAG NO (descending order)
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagDomain}.
     * 
     * 
     * - 権限情報を取得(参照権限)
     *     認可ID:W2005Bを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:W2005Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - MIXED現品票、MIXED品目番号の検索
     *     criteriaに上記の権限情報{@link UserAuthDomain}のリストを設定
     *     criteriaを引数にして、{@link W2005MixTagDao#searchForPagingTtMixtag(W2005MixTagCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *       - 指定されたページに含まれる
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当
     *     
     *     下記の順にソート
     *       - CUSTOMER CODE/得意先コード (昇順)
     *       - LEGACY SHIP TO/LEGACY送荷先 (昇順)
     *       - TRANSPORT CODE/輸送手段コード (昇順)
     *       - PLANT CODE/製造部工場区分 (昇順)
     *       - LEGACY WAREHOUSE CODE/LEGACY倉庫コード (昇順)
     *       - MULTI ITEM NO IN BOX STATUS/小箱内多品ステータス (昇順)
     *       - MIX TAG NO/MIXタグNO (降順)
     *
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When a Mix Tag and a MIXED ITEM NO cannot be referred to<br />MIXED現品票、MIXED品目番号が参照できない場合
     */
    public List<? extends W2005MixTagDomain> searchForPagingOnMainSearch(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing of a multiple-p/n-packaged-in-box PKG Info Detail screen (at the time [ Multiple-p/n-packaged-in-box Create screen ] of changes).
     * <br />小箱内多品番梱包PKG Info Detail画面(小箱内多品番梱包Create画面より遷移時)の検索処理を行います。
     * <pre>
     * A search of - Mix Tag RT Work
     *       The following items of criteria are set to {@link TwMixtagRtCriteriaDomain},
     *       This is a call about {@link TwMixtagRtService#searchByCondition (TwMixtagRtCriteriaDomain)}.
     *       - dscId/DSC-ID
     *
     *       It sorts in following order.
     *         - BOX FLAG / BOX FLAG (descending order)
     *         - PACKAGE ITEM NO / PACKAGE ITEM NO (ascending order)
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagRtDomain}.
     * 
     * 
     * - MIXED用RT材ワークの検索
     *     {@link TwMixtagRtCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwMixtagRtService#searchByCondition(TwMixtagRtCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *     
     *     下記の順にソート
     *       - BOX FLAG/箱フラグ (降順)
     *       - PACKAGE ITEM NO/包装材品目番号 (昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagRtDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag-RT search-condition domain<br />MIXED用RT材検索条件ドメイン
     * @return Mix-Tag-RT domain<br />MIXED用RT材ドメイン
     * @throws ApplicationException When a Mix Tag RT Work cannot be referred to<br />MIXED用RT材ワークが参照できない場合
     */ 
    public List<? extends W2005MixTagRtDomain> searchOnDetailInitByFromCreate(W2005MixTagRtCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing of a multiple-p/n-packaged-in-box PKG Info Detail screen (at the time [ Multiple-p/n-packaged-in-box Main Screen ] of changes).
     * <br />小箱内多品番梱包PKG Info Detail画面(小箱内多品番梱包Main Screen画面より遷移時)の検索処理を行います。
     * <pre>
     * A search of - Mix Tag RT
     *       The following items of criteria are set to {@link TtMixtagRtCriteriaDomain},
     *       This is a call about {@link TtMixtagRtService#searchByCondition (TtMixtagRtCriteriaDomain)}.
     *         - mixTagNo / MIX TAG NO
     *
     *       It sorts in following order.
     *         - BOX FLAG / BOX FLAG (descending order)
     *         - PACKAGE ITEM NO / PACKAGE ITEM NO (ascending order)
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagRtDomain}.
     * 
     * 
     * - MIXED用RT材の検索
     *     {@link TtMixtagRtCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TtMixtagRtService#searchByCondition(TtMixtagRtCriteriaDomain)}を呼出
     *       - mixTagNo/MIXタグNO
     *     
     *     下記の順にソート
     *       - BOX FLAG/箱フラグ (降順)
     *       - PACKAGE ITEM NO/包装材品目番号 (昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagRtDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag-RT search-condition domain<br />MIXED用RT材検索条件ドメイン
     * @return Mix-Tag-RT domain<br />MIXED用RT材ドメイン
     * @throws ApplicationException When a Mix Tag RT cannot be referred to<br />MIXED用RT材が参照できない場合
     */ 
    public List<? extends W2005MixTagRtDomain> searchOnDetailInitByFromMain(W2005MixTagRtCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing (at the time [ Multiple-p/n-packaged-in-box Create screen ] of changes) of a multiple-p/n-packaged-in-box Register screen.
     * <br />小箱内多品番梱包Register画面の検索処理(小箱内多品番梱包Create画面より遷移時)を行います。
     * <pre>
     * A search of - Mix Tag Work
     *       The following items of criteria are set to {@link TwMixtagCriteriaDomain},
     *       This is a call about {@link TwMixtagService#searchByCondition (TwMixtagCriteriaDomain)}.
     *       - dscId/DSC-ID
     *
     *       It sorts in following order.
     *         - ITEM NO / ITEM NO (ascending order)
     *         - PACKAGE CODE / PACKAGE CODE (ascending order)
     *
     * - N/W calculation
     *       NW is calculated from the result of {@link TwMixtagService#searchByCondition (TwMixtagCriteriaDomain)}.
     *       NW = SUM (itemWeight/WEIGHT-UNIT  x qty / PKG QTY)
     *
     * A search of - Mix Tag RT Work
     *       The following items of criteria are set to {@link TwMixtagRtCriteriaDomain},
     *       This is a call about {@link TwMixtagService#searchCount (TwMixtagCriteriaDomain)}.
     *       - dscId/DSC-ID
     *
     * - Return of search results
     *       Search results are returned by the list of {@link W2005MixTagDomain}.
     * 
     * 
     * - MIXED品目番号ワークの検索
     *     {@link TwMixtagCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwMixtagService#searchByCondition(TwMixtagCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *     
     *     下記の順にソート
     *       - ITEM NO/品目番号 (昇順)
     *       - PACKAGE CODE/包装区分 (昇順)
     *       
     * - N/W計算
     *     {@link TwMixtagService#searchByCondition(TwMixtagCriteriaDomain)}の結果よりNWを計算
     *     NW ＝ SUM( itemWeight/重量単位 × qty/梱包数量 )
     *     
     * - MIXED用RT材ワークの検索
     *     {@link TwMixtagRtCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwMixtagService#searchCount(TwMixtagCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *     
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When a Mix Tag Work and a Mix Tag RT Work cannot be referred to<br />MIXED品目番号ワーク、MIXED用RT材ワークが参照できない場合
     */    
    public W2005MixTagDomain searchOnRegisterInitByFromCreate(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing (at the time [ Multiple-p/n-packaged-in-box Main Screen ] of changes) of a multiple-p/n-packaged-in-box Register screen.
     * <br />小箱内多品番梱包Register画面の検索処理(小箱内多品番梱包Main Screen画面より遷移時)を行います。
     * <pre>
     * - Authority information is acquired (reference authority).
     *       Approval ID:W 2005B is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String...)}.
     *
     * - Authority information is acquired (update authority).
     *       Approval ID:W 2005R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String...)}.
     *
     * A search of - Mix Tag and a MIXED ITEM NO
     *       The above-mentioned authority information list of {@link UserAuthDomain} is set as {@link W2005MixTagCriteriaDomain},
     *       {@link W2005MixTagDao#searchTtMixtagItemNo (W2005MixTagCriteriaDomain)} is called,
     *       The data which fulfills all the following conditions is acquired.
     *         - It corresponds to the conditions specified from the screen.
     *         - Shipper CD and a PLANT CODE correspond to the authority which a login user has.
     *
     *       It sorts in following order.
     *         - ITEM NO / ITEM NO (ascending order)
     *         - PACKAGE CODE / PACKAGE CODE (ascending order)
     *
     * - Return of search results
     *       Search results are returned by {@link W2005MixTagDomain}.
     * 
     * 
     * - 権限情報を取得(参照権限)
     *     認可ID:W2005Bを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:W2005Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - MIXED現品票、MIXED品目番号の検索
     *     {@link W2005MixTagCriteriaDomain}に上記の権限情報{@link UserAuthDomain}のリストを設定し、
     *     {@link W2005MixTagDao#searchTtMixtagItemNo(W2005MixTagCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当
     *     
     *     下記の順にソート
     *       - ITEM NO/品目番号 (昇順)
     *       - PACKAGE CODE/包装区分 (昇順)
     *
     * - 検索結果の返却
     *     検索結果を{@link W2005MixTagDomain}で返却
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When a Mix Tag and a MIXED ITEM NO cannot be referred to<br />MIXED現品票、MIXED品目番号が参照できない場合
     */
    public List<? extends W2005MixTagDomain> searchOnRegisterInitByFromMain(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;

    // Update system method update
    // --------------------------------- 更新系メソッド update -----------------------------------------------------------
    
    // Delete system method delete
    // --------------------------------- 削除系メソッド delete -----------------------------------------------------------
    /**
     * Perform the hard delete of a Mix Tag RT Work.
     * <br />MIXED用RT材ワークの物理削除を行います。
     * <pre>
     * The hard delete of - Mix Tag RT Work
     *       The following items of criteria are set to {@link TwMixtagRtCriteriaDomain},
     *       This is a call about {@link TwMixtagRtService#deleteByCondition (TwMixtagRtCriteriaDomain)}.
     *       - dscId/DSC-ID
     *         - pkgItemNo / PACKAGE ITEM NO
     *
     * - Re retrieval of a screen (at the time [ Multiple-p/n-packaged-in-box Create screen ] of changes)
     *       This is a call about * {@link W2005MixTagService#searchOnDetailInitByFromCreate(W2005MixTagRtCriteriaDomain)}.
     * 
     * 
     * - MIXED用RT材ワークの物理削除
     *     {@link TwMixtagRtCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwMixtagRtService#deleteByCondition(TwMixtagRtCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *       - pkgItemNo/包装材品目番号
     *     
     * - 画面の再検索(小箱内多品番梱包Create画面より遷移時)
     *     {@link W2005MixTagService#searchOnDetailInitByFromCreate(W2005MixTagRtCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param mixTagRtCriteriaList Mix-Tag-RT search-condition domain<br />MIXED用RT材検索条件ドメイン
     * @return Mix-Tag-RT domain<br />MIXED用RT材ドメイン
     * @throws ApplicationException When a Mix Tag RT Work cannot be deleted<br />MIXED用RT材ワークの削除できない場合
     */ 
    public List<? extends W2005MixTagRtDomain> deleteOnDetailDelete(List<? extends W2005MixTagRtCriteriaDomain> mixTagRtCriteriaList)
        throws ApplicationException;
    
    /**
     * Perform the hard delete of a Mix Tag Work and a Mix Tag RT Work.
     * <br />MIXED品目番号ワーク、MIXED用RT材ワークの物理削除を行います。
     * <pre>
     * The hard delete of - Mix Tag Work
     *       The following items of criteria are set to {@link TwMixtagCriteriaDomain},
     *       This is a call about {@link TwMixtagService#deleteByCondition (TwMixtagCriteriaDomain)}.
     *       - dscId/DSC-ID
     *
     * The hard delete of - Mix Tag RT Work
     *       The following items of criteria are set to {@link TwMixtagRtCriteriaDomain},
     *       This is a call about {@link TwMixtagRtService#deleteByCondition (TwMixtagRtCriteriaDomain)}.
     *       - dscId/DSC-ID
     * 
     * 
     * - MIXED品目番号ワークの物理削除
     *     {@link TwMixtagCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwMixtagService#deleteByCondition(TwMixtagCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *       
     * - MIXED用RT材ワークの物理削除
     *     {@link TwMixtagRtCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwMixtagRtService#deleteByCondition(TwMixtagRtCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *       
     * </pre>
     * 
     * @param criteria Mix-Tag search-condition domain<br />MIXED現品票検索条件ドメイン
     * @return Delete number list<br />削除件数リスト
     * @throws ApplicationException When a delete of a Mix Tag Work and a Mix Tag RT Work cannot be performed<br />MIXED品目番号ワーク、MIXED用RT材ワークの削除ができない場合
     */ 
    public List<Integer> deleteOnHeaderInit(W2005MixTagCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform the hard delete of a Mix Tag Work.
     * <br />MIXED品目番号ワークの物理削除を行います。
     * <pre>
     * The hard delete of - Mix Tag Work
     *       The following items of criteria are set to {@link TwMixtagCriteriaDomain},
     *       This is a call about {@link TwMixtagService#deleteByCondition (TwMixtagCriteriaDomain)}.
     *       - dscId/DSC-ID
     *         - itemNo / ITEM NO
     *         - pkgCd / PACKAGE CODE
     *
     * - Re retrieval of a screen (at the time [ Multiple-p/n-packaged-in-box Create screen ] of changes)
     *       This is a call about {@link W2005MixTagService#searchOnRegisterInitByFromCreate (W2005MixTagCriteriaDomain)}.
     * 
     * 
     * - MIXED品目番号ワークの物理削除
     *     {@link TwMixtagCriteriaDomain}にcriteriaの以下の項目を設定し、
     *     {@link TwMixtagService#deleteByCondition(TwMixtagCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *     
     * - 画面の再検索(小箱内多品番梱包Create画面より遷移時)
     *     {@link W2005MixTagService#searchOnRegisterInitByFromCreate(W2005MixTagCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param mixTagItemList MIXED-ITEM-NO search-condition domain<br />MIXED品目番号検索条件ドメイン
     * @return MIXED-ITEM-NO domain<br />MIXED品目番号ドメイン
     * @throws ApplicationException When a delete of a Mix Tag Work cannot be performed<br />MIXED品目番号ワークの削除ができない場合
     */ 
    public W2005MixTagDomain deleteOnRegisterDelete(List<? extends W2005MixTagItemDomain> mixTagItemList)
        throws ApplicationException;
    
    // Transaction system method transact
    // -------------------------------- トランザクション系メソッド transact ----------------------------------------------
    /**
     * Perform registration and the update process of a Mix Tag Work.
     * <br />MIXED品目番号ワークの登録・更新処理を行います。
     * <pre>
     * - Judgment of registration and an update process
     *       The following items are acquired from criteria.
     *         - disabledFlg / use improper flag
     *
     *       It updates, when disabledFlg is "Y."
     In except, it registers.
     *
     * - Either registration or an update process is carried out.
     *       - In the case of registration
     *           The following items are set to {@link TwMixtagDomain} and this is a call about {@link TwMixtagService#create (TwMixtagDomain)}.
     *             Property of {@link W2005MixTagItemDomain} of - mixTagItemList
     *             - itemTyp / ITEM TYPE: null
     *
     *       - In the case of an update
     *           The following items of mixTagItemList are set to {@link TwMixtagDomain}.
     *             - qty / PKG QTY
     *             - tagQty / TAG QUANTITY
     *
     *           The following items of mixTagItemList are set to {@link TwMixtagCriteriaDomain}.
     *           - dscId/DSC-ID
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *
     *           This is a call about {@link TwMixtagService#updateByCondition (TwMixtagDomain, TwMixtagCriteriaDomain)}.
     * 
     * 
     * - 登録・更新処理の判定
     *     criteriaより以下の項目を取得
     *       - disabledFlg/利用不可フラグ
     *       
     *     disabledFlgが"Y"の場合、更新。以外の場合、登録。
     *     
     * - 登録または更新処理のいずれかを実施
     *     - 登録の場合、
     *         {@link TwMixtagDomain}に以下の項目を設定し、{@link TwMixtagService#create(TwMixtagDomain)}を呼出
     *           - mixTagItemListの{@link W2005MixTagItemDomain}のプロパティ
     *           - itemTyp/品目区分:null
     *     
     *     - 更新の場合、
     *         {@link TwMixtagDomain}にmixTagItemListの以下の項目を設定
     *           - qty/梱包数量
     *           - tagQty/タグ数
     *         
     *         {@link TwMixtagCriteriaDomain}にmixTagItemListの以下の項目を設定
     *           - dscId/DSC-ID
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *         
     *         {@link TwMixtagService#updateByCondition(TwMixtagDomain, TwMixtagCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param mixTagItemList MIXED-ITEM-NO domain<br />MIXED品目番号ドメイン
     * @throws ApplicationException When update of a Mix Tag Work and registration cannot be performed<br />MIXED品目番号ワークの更新、登録ができない場合
     */ 
    public void transactOnCreateUpdate(List<? extends W2005MixTagItemDomain> mixTagItemList)
        throws ApplicationException;
    
    /**
     * Perform the hard delete of a Mix Tag RT Work, and registration processing.
     * <br />MIXED用RT材ワークの物理削除、登録処理を行います。
     * <pre>
     * The hard delete of - Mix Tag RT Work
     *       The following items of mixTagRtList are set to {@link TwMixtagRtCriteriaDomain},
     *       This is a call about {@link TwMixtagRtService#deleteByCondition (TwMixtagRtCriteriaDomain)}.
     *       - dscId/DSC-ID
     *
     * Registration of - Mix Tag RT Work
     *       The following items are set to {@link TwMixtagRtDomain} and this is a call about {@link TwMixtagRtService#create (TwMixtagRtDomain)}.
     *         Property of {@link W2005MixTagRtDomain} of - mixTagRtList
     *
     * - Re retrieval of a screen (at the time [ Multiple-p/n-packaged-in-box Create screen ] of changes)
     *       This is a call about {@link W2005MixTagService#searchOnDetailInitByFromCreate (W2005MixTagRtCriteriaDomain)}.
     * 
     * 
     * - MIXED用RT材ワークの物理削除
     *     {@link TwMixtagRtCriteriaDomain}にmixTagRtListの以下の項目を設定し、
     *     {@link TwMixtagRtService#deleteByCondition(TwMixtagRtCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *     
     * - MIXED用RT材ワークの登録
     *     {@link TwMixtagRtDomain}に以下の項目を設定し、{@link TwMixtagRtService#create(TwMixtagRtDomain)}を呼出
     *       - mixTagRtListの{@link W2005MixTagRtDomain}のプロパティ
     *     
     * - 画面の再検索(小箱内多品番梱包Create画面より遷移時)
     *     {@link W2005MixTagService#searchOnDetailInitByFromCreate(W2005MixTagRtCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param mixTagRtList Mix-Tag-RT domain<br />MIXED用RT材ドメイン
     * @return Nothing<br />なし
     * @throws ApplicationException A delete of a Mix Tag RT Work, when it cannot register<br />MIXED用RT材ワークの削除、登録できない場合
     */ 
    public List<? extends W2005MixTagRtDomain>  transactOnDetailSave(List<? extends W2005MixTagRtDomain> mixTagRtList)
        throws ApplicationException;
    
    /**
     * Perform registration processing of a Multiple Item No. in 1Box PKG-related table group.
     * <br />小箱内多品関連のテーブル群の登録処理を行います。
     * <pre>
     * - Firm-order-receipt alloc processing
     *       A part for the number of cases of mixTagItemDomainList of - mixTag {@link W2005MixTagItemDomain} and the following are repeated.
     *
     *       - Export-Receive-Order data is acquired (lock lump).
     *           The following items of mixTag are set to {@link TtExpRcvOdrCriteriaDomain}.
     *             - shipperCd / Shipper CD
     *             - customerCd / CUSTOMER CODE
     *             - lgcyShipTo / LEGACY SHIP TO
     *             - trnsCd / TRANSPORT CODE
     *           - dscId/DSC-ID
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *             - odrFirmFlg / ORDER FIRM FLAG
     *             - shippedTyp / SHIPPED TYPE
     *
     *           It sorts in following order.
     *             - ETD DUE DATE / ETD DUE DATE (ascending order)
     *             - CUSTOMER PO NO / CUSTOMER PO NO (ascending order)
     *             - ORDER CONTROL NO / ORDER CONTROL NO (ascending order)
     *
     *           {@link TtExpRcvOdrCriteriaDomain} is made into an argument,
     *           This is a call about {@link W2005MixTagDao#lockTtExpRcvOdr (TtExpRcvOdrCriteriaDomain)}.
     *
     *       - An Alloc QTY is most drawn and updated from the past data.
     *           The following items are computed and set to {@link TtExpRcvOdrDomain}.
     *             - Alloc QTY (Alloc-QTY +Min (Actual PKG QTY, Shipment-remaining QUANTITY) is set up)
     *             - SHIPPED TYPE (ORDER QUANTITY = = 2 is set up only when it becomes an Alloc QTY)
     *
     *           The following items of {@link TtExpRcvOdrDomain} are set to {@link TtExpRcvOdrCriteriaDomain} as a result of an Export Receive Order.
     *             - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *             - customerCd / CUSTOMER CODE
     *             - lgcyShipTo / LEGACY SHIP TO
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *             - trnsCd / TRANSPORT CODE
     *             - etdDueDt / ETD DUE DATE
     *             - customerPoNo / CUSTOMER PO NO
     *             - customerItemNo / CUSTOMER ITEM NO
     *             - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL
     *             - odrCtrlNo / ORDER CONTROL NO
     *
     *           {@link TtExpRcvOdrDomain} and {@link TtExpRcvOdrCriteriaDomain} are made into an argument,
     *           This is a call about * {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}.
     *
     *           * An error is made when the alloc for Actual PKG QTY is not made.
     *
     *       - The result of {@link W2005MixTagDao#lockTtExpRcvOdr (TtExpRcvOdrCriteriaDomain)} is set to {@link W2005MixTagOdrDomain}.
     *         This is used at the time of Mix-Tag-Receive-Order registration and registration (starting of Web service) of an ordering alloc track record.
     *
     * Registration of - Mix Tag
     *       Acquisition of - Mix Tag No.
     *           The following is made into an argument,
     *           This is a call about * {@link CommonService#transactSequence(java.lang.String, java.lang.String, int, java.lang.String)}.
     *             - assignment-of-order-numbers key: Acquire the following items from criteria and create an assignment-of-order-numbers key.
     *                 - shipperCd / Shipper CD
     *                 - whCd / W/H CD
     *             - assignment-of-order-numbers classification: "05"
     *             - the number of the SEQUENCE NO to acquire: One
     *             - function ID: Constant ({@link Eca0027Constants#SCREEN_ID_W2008})  
     *
     *       Calculation of - G/W
     *           - data acquisition
     *               The following items of mixTag are set to {@link W2005MixTagRtCriteriaDomain},
     *               This is a call about {@link W2005MixTagDao#searchTwMixtagRt(W2005MixTagRtCriteriaDomain)}.
     *               - dscId/DSC-ID
     *
     *           WEIGHT-UNIT acquisition of - Shipper
     *               The following items of mixTag are set to {@link TmNxsCompCriteriaDomain},
     *               This is a call about {@link TmNxsCompService#searchByKey (TmNxsCompCriteriaDomain)}.
     *                 - shipperCd / Shipper CD
     *
     *           - Unit converted
     *               The following is made into an argument and this is a call about {@link CommonService#convertVolumeUnit (BigDecimal, String, String)}.
     *                 - SUM as a result of VALUE:: {@link W2005MixTagDao#searchTwMixtagRt (W2005MixTagRtCriteriaDomain)} to change (qty/QUANTITY * pkgWeight / PACKAGE WEIGHT)  
     *                 - weightUnit/WEIGHT UNIT as a result of unit: {@link W2005MixTagDao#searchTwMixtagRt (W2005MixTagRtCriteriaDomain)} before a converted
     *                 - weightUnit as a result of unit: {@link TmNxsCompDomain} after a converted
     *
     *           - GROSS WEIGHT / GROSS WEIGHT is computed.
     *               G/W = they are netWeight/NET WEIGHT of +mixTag as a result of the above-mentioned unit converted.
     *
     *       - Registration processing (Mix Tag)
     *           The following items are set to {@link TtMixtagDomain} and this is a call about {@link TtMixtagService#create (TtMixtagDomain)}.
     *             - mixTagNo / MIX TAG NO: Result of acquisition of above-mentioned Mix Tag No.
     *             Property of - mixTag {@link W2005MixTagDomain}
     *             - mixTagStatus / MULTI ITEM NO IN BOX STATUS: "10"
     *             - grossWeight / GROSS WEIGHT: This is a computed result about the above-mentioned GROSS WEIGHT/GROSS WEIGHT.
     *             - weightUnit / WEIGHT UNIT: Result of WEIGHT-UNIT acquisition {@link TmNxsCompService#searchByKey (TmNxsCompCriteriaDomain)} of above Shipper
     *             - boxNo / BOX NO: "0001"
     *
     * Registration of - MIXED ITEM NO
     *       The following processings are carried out to all the record.
     * Set the following items as       {@link TtMixtagItemNoDomain}, and this is a call about {@link TtMixtagItemNoService#create (TtMixtagItemNoDomain)}.
     *         - mixTagNo / MIX TAG NO: Result of acquisition of Mix Tag No. of registration of the above-mentioned Mix Tag
     *         - mixTagItemDomainList of {@link W2005MixTagDomain}
     *         - itemTyp / ITEM TYPE: null
     *         - customerItemNo / CUSTOMER ITEM NO: null
     *
     * Registration of - Mix Tag Receive Order
     *       It registers per record for several order minutes.
     * Set the following items as       {@link TtMixtagOdrDomain}, and this is a call about {@link TtMixtagOdrService#create (TtMixtagOdrDomain)}.
     *         - mixTagNo / MIX TAG NO: Result of acquisition of Mix Tag No. of registration of the above-mentioned Mix Tag
     *         - Property of {@link W2005MixTagOdrDomain} of the above-mentioned firm-order-receipt alloc processing
     *
     * The hard delete of - Mix Tag Work
     * Set the following items as       {@link TwMixtagCriteriaDomain}, and this is a call about {@link TwMixtagService#deleteByCondition (TwMixtagCriteriaDomain)}.
     *         dscId/DSC-ID of - mixTag
     *
     * Registration of - Mix Tag RT
     * Set the following items as       {@link TwMixtagRtCriteriaDomain}, and this is a call about {@link TwMixtagRtService#searchByCondition (TwMixtagRtCriteriaDomain)}.
     *         dscId/DSC-ID of - mixTag
     *
     * Set the following items as       {@link TtMixtagRtDomain}, and this is a call about {@link TtMixtagRtService#create (TtMixtagRtDomain)}.
     *         - mixTagNo / MIX TAG NO: Result of acquisition of Mix Tag No. of registration of the above-mentioned Mix Tag
     *         - The above-mentioned result is the property of {@link TwMixtagRtDomain}.
     *
     * A delete of - Mix Tag RT Work
     * Set the following items as       {@link TwMixtagRtCriteriaDomain}, and this is a call about {@link TwMixtagRtService#deleteByCondition (TwMixtagRtCriteriaDomain)}.
     *         dscId/DSC-ID of - mixTag
     *
     * - An update and registration of a Temp Stock
     *       - A Temp Stock is locked.
     * Set the following items as           {@link TtTmpStockCriteriaDomain}, and this is a call about {@link TtTmpStockService#lockByKey (TtTmpStockCriteriaDomain)}.
     *             - each key item: Each VALUE of mixTag
     *
     *       - An update or registration of a Temp Stock
     *           - In the case of an update
     *               The following items are set to {@link TtTmpStockCriteriaDomain}.
     *                 - each key item: This is a key item of {@link TtTmpStockDomain} about the above-mentioned Temp Stock as a result of a lock.
     *
     *               The following items are set to {@link TtTmpStockDomain}.
     *                 - qty / QUANTITY: They are qty/QUANTITY of {@link TtTmpStockDomain} about the above-mentioned Temp Stock as a result of a lock.   qty/PKG QTY of mixTagItemDomainList of +mixTag
     *
     *               This is a call about * {@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}.
     *
     *           - In the case of registration
     * Set the following items as               {@link TtTmpStockDomain}, and this is a call about {@link TtTmpStockService#create (TtTmpStockDomain)}).
     *                 Property of mixTagItemDomainList of - mixTag {@link W2005MixTagDomain}
     *
     * - Registration of an ordering alloc track record (starting of Web service)
     *       When pltzInstrNo / Packaging Instruction (=Pull) NO of mixTag are "", it carries out (when {@link W2005MixTagDomain#getPltzInstrNo} is "").
     *       The following is made into an argument,
     *       This is a call about Web service (WS2005) {@link Ws2005RestService#createRcvOdrAlloc (String, String, Ws2005ParamDomain)}.
     *         - Property of {@link W2005MixTagOdrDomain} set up by the above-mentioned firm-order-receipt alloc processing
     *
     * - Re retrieval of a screen (at the time [ Multiple-p/n-packaged-in-box Main Screen ] of changes)
     *       This is a call about {@link W2005MixTagService#searchOnRegisterInitByFromMain (W2005MixTagDomain)}.
     * 
     * 
     * - 確定受注引当処理
     *     - mixTag{@link W2005MixTagItemDomain}のmixTagItemDomainListの件数分、以下を繰り返す
     *     
     *     - 輸出受注データを取得(ロック込み)
     *         {@link TtExpRcvOdrCriteriaDomain}にmixTagの以下の項目を設定
     *           - shipperCd/荷主コード
     *           - customerCd/得意先コード
     *           - lgcyShipTo/LEGACY送荷先
     *           - trnsCd/輸送手段コード
     *           - dscId/DSC-ID
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *           - odrFirmFlg/受注確定フラグ
     *           - shippedTyp/出荷済み区分
     *       
     *         下記の順にソート
     *           - ETD DUE DATE/船積期限 (昇順)
     *           - CUSTOMER PO NO/得意先PO NO (昇順)
     *           - ORDER CONTROL NO/オーダーコントロールNO (昇順)
     *       
     *         {@link TtExpRcvOdrCriteriaDomain}を引数にして、
     *         {@link W2005MixTagDao#lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain)}を呼出
     *       
     *     - 一番過去のデータより梱包引当数量を引き当て更新
     *         {@link TtExpRcvOdrDomain}に以下の項目を算出し設定
     *           - 梱包引当数量 (梱包引当数量 + Min(Actual PKG QTY, 出荷残数量)を設定)
     *           - 出荷済み区分 (注文数量 == 梱包引当数量となった場合のみ、2を設定)
     *           
     *         {@link TtExpRcvOdrCriteriaDomain}に輸出受注の結果{@link TtExpRcvOdrDomain}の以下の項目を設定
     *           - rcvOdrCompCd/受注会社コード
     *           - customerCd/得意先コード
     *           - lgcyShipTo/LEGACY送荷先
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *           - trnsCd/輸送手段コード
     *           - etdDueDt/船積期限
     *           - customerPoNo/得意先PO NO
     *           - customerItemNo/得意先品目番号
     *           - customerItemNoOrg/得意先品目番号オリジナル
     *           - odrCtrlNo/オーダーコントロールNO
     *         
     *         {@link TtExpRcvOdrDomain}、{@link TtExpRcvOdrCriteriaDomain}を引数にして、
     *         {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出
     *         
     *         ※Actual PKG QTY分の引当ができなかった場合はエラー
     *         
     *     - {@link W2005MixTagOdrDomain}に{@link W2005MixTagDao#lockTtExpRcvOdr(TtExpRcvOdrCriteriaDomain)}の結果を設定
     *       MIXED品目番号受注情報登録、受注引当実績の登録（Webサービスの起動）時に使用
     *         
     * - MIXED現品票の登録
     *     - Mix Tag No.の取得
     *         以下を引数にして、
     *         {@link CommonService#transactSequence(java.lang.String, java.lang.String, int, java.lang.String)}を呼出
     *           - 採番キー:criteriaより以下の項目を取得し採番キーを作成
     *               - shipperCd/荷主コード
     *               - whCd/倉庫コード
     *           - 採番区分:"05"
     *           - 取得する連番の個数:1
     *           - 機能ID:コンスタント({@link Eca0027Constants#SCREEN_ID_W2008})
     *         
     *     - G/Wの計算
     *         - データ取得
     *             {@link W2005MixTagRtCriteriaDomain}にmixTagの以下の項目を設定し、
     *             {@link W2005MixTagDao#searchTwMixtagRt(W2005MixTagRtCriteriaDomain)}を呼出
     *               - dscId/DSC-ID
     *         
     *         - Shipperの重量単位取得
     *             {@link TmNxsCompCriteriaDomain}にmixTagの以下の項目を設定し、
     *             {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出
     *               - shipperCd/荷主コード
     *             
     *         - 単位変換
     *             以下を引数にして、{@link CommonService#convertVolumeUnit(BigDecimal, String, String)}を呼出
     *               - 変換する値::{@link W2005MixTagDao#searchTwMixtagRt(W2005MixTagRtCriteriaDomain)}の結果のSUM(qty/数量 * pkgWeight/包装材重量)
     *               - 変換前の単位:{@link W2005MixTagDao#searchTwMixtagRt(W2005MixTagRtCriteriaDomain)}の結果のweightUnit/重量単位
     *               - 変換後の単位:{@link TmNxsCompDomain}の結果のweightUnit
     *         
     *         - GROSS WEIGHT/グロス重量を算出。
     *             G/W = 上記の単位変換の結果 + mixTagのnetWeight/ネット重量
     *         
     *     - 登録処理(MIXED現品票)
     *         {@link TtMixtagDomain}に以下の項目を設定し、{@link TtMixtagService#create(TtMixtagDomain)}を呼出
     *           - mixTagNo/MIXタグNO:上記のMix Tag No.の取得の結果
     *           - mixTag{@link W2005MixTagDomain}のプロパティ
     *           - mixTagStatus/小箱内多品ステータス:"10"
     *           - grossWeight/グロス重量:上記のGROSS WEIGHT/グロス重量を算出結果
     *           - weightUnit/重量単位:上記のShipperの重量単位取得{@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}の結果
     *           - boxNo/箱番号:"0001"
     * 
     * - MIXED品目番号の登録
     *     全てのレコードに対して、以下の処理を実施
     *     {@link TtMixtagItemNoDomain}に以下の項目を設定し、{@link TtMixtagItemNoService#create(TtMixtagItemNoDomain)}を呼出
     *       - mixTagNo/MIXタグNO:上記のMIXED現品票の登録のMix Tag No.の取得の結果
     *       - {@link W2005MixTagDomain}のmixTagItemDomainList
     *       - itemTyp/品目区分:null
     *       - customerItemNo/得意先品目番号:null
     * 
     * - MIXED品目番号受注情報の登録
     *     オーダー数分のレコード単位で登録
     *     {@link TtMixtagOdrDomain}に以下の項目を設定し、{@link TtMixtagOdrService#create(TtMixtagOdrDomain)}を呼出
     *       - mixTagNo/MIXタグNO:上記のMIXED現品票の登録のMix Tag No.の取得の結果
     *       - 上記の確定受注引当処理の{@link W2005MixTagOdrDomain}のプロパティ
     * 
     * - MIXED品目番号ワークの物理削除
     *     {@link TwMixtagCriteriaDomain}に以下の項目を設定し、{@link TwMixtagService#deleteByCondition(TwMixtagCriteriaDomain)}を呼出
     *       - mixTagのdscId/DSC-ID
     * 
     * - MIXED用RT材の登録
     *     {@link TwMixtagRtCriteriaDomain}に以下の項目を設定し、{@link TwMixtagRtService#searchByCondition(TwMixtagRtCriteriaDomain)}を呼出
     *       - mixTagのdscId/DSC-ID
     *       
     *     {@link TtMixtagRtDomain}に以下の項目を設定し、{@link TtMixtagRtService#create(TtMixtagRtDomain)}を呼出
     *       - mixTagNo/MIXタグNO:上記のMIXED現品票の登録のMix Tag No.の取得の結果
     *       - 上記の結果{@link TwMixtagRtDomain}のプロパティ
     * 
     * - MIXED用RT材ワークの削除
     *     {@link TwMixtagRtCriteriaDomain}に以下の項目を設定し、{@link TwMixtagRtService#deleteByCondition(TwMixtagRtCriteriaDomain)}を呼出
     *       - mixTagのdscId/DSC-ID
     * 
     * - 仮在庫の更新・登録
     *     - 仮在庫をロック
     *         {@link TtTmpStockCriteriaDomain}に以下の項目を設定し、{@link TtTmpStockService#lockByKey(TtTmpStockCriteriaDomain)}を呼出
     *           - 各キー項目:mixTagの各値
     *           
     *     - 仮在庫の更新または登録
     *         - 更新の場合
     *             {@link TtTmpStockCriteriaDomain}に以下の項目を設定
     *               - 各キー項目:上記の仮在庫をロックの結果{@link TtTmpStockDomain}のキー項目
     *             
     *             {@link TtTmpStockDomain}に以下の項目を設定
     *               - qty/数量:上記の仮在庫をロックの結果{@link TtTmpStockDomain}のqty/数量 ＋ mixTagのmixTagItemDomainListのqty/梱包数量
     *               
     *             {@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}を呼出
     *             
     *         - 登録の場合
     *             {@link TtTmpStockDomain}に以下の項目を設定し、{@link TtTmpStockService#create(TtTmpStockDomain)}を呼出
     *               - mixTag{@link W2005MixTagDomain}のmixTagItemDomainListのプロパティ
     * 
     * - 受注引当実績の登録（Webサービスの起動）
     *     mixTagのpltzInstrNo/梱包指示NOが""の場合({@link W2005MixTagDomain#getPltzInstrNo}が""の場合)に実施
     *     以下を引数にして、
     *     Webサービス(WS2005){@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}を呼出
     *       - 上記の確定受注引当処理で設定した{@link W2005MixTagOdrDomain}のプロパティ
     * 
     * - 画面の再検索(小箱内多品番梱包Main Screen画面より遷移時)
     *     {@link W2005MixTagService#searchOnRegisterInitByFromMain(W2005MixTagCriteriaDomain)}を呼出
     * </pre>
     * 
     * @param mixTag Mix-Tag domain<br />MIXED現品票ドメイン
     * @return Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When registration processing is not completed<br />登録処理ができなかった場合
     */ 
    public List<? extends W2005MixTagDomain> transactOnRegister(W2005MixTagDomain mixTag)
        throws ApplicationException;
    
    /**
     * Perform cancellation processing of a Multiple Item No. in 1Box PKG-related table group.
     * <br />小箱内多品関連のテーブル群のキャンセル処理を行います。
     * <pre>
     * - Ordering alloc cancellation
     *       - Mix-Tag-Receive-Order acquisition
     *           The following items are set to {@link TtMixtagOdrCriteriaDomain},
     *           this is a call about {@link TtMixtagOdrService#searchByCondition (TtMixtagOdrCriteriaDomain)}.
     *             - mixTagNo / MIX TAG NO: Same name item of mixTag
     *
     *           It sorts in following order.
     *             - MIX TAG NO / MIX TAG NO (ascending order)
     *             - ITEM NO / ITEM NO (ascending order)
     *             - PACKAGE CODE / PACKAGE CODE (ascending order)
     *             - RECEIVE ORDER COMPANY CODE / RECEIVE ORDER COMPANY CODE (ascending order)
     *             - CUSTOMER CODE / CUSTOMER CODE (ascending order)
     *             - LEGACY SHIP TO / LEGACY SHIP TO (ascending order)
     *             - TRANSPORT CODE / TRANSPORT CODE (ascending order)
     *             - ETD DUE DATE / ETD DUE DATE (ascending order)
     *             - CUSTOMER PO NO / CUSTOMER PO NO (ascending order)
     *             - CUSTOMER ITEM NO / CUSTOMER ITEM NO (ascending order)
     *             - CUSTOMER ITEM NO ORIGINAL / CUSTOMER ITEM NO ORIGINAL (ascending order)
     *             - ORDER CONTROL NO / ORDER CONTROL NO (ascending order)
     *
     *       - The above-mentioned result repeats a part for the number of cases of {@link TtMixtagOdrDomain}, and the following.
     *
     *       - Export-Receive-Order data is acquired.
     *           The above-mentioned result sets the following items of {@link TtMixtagOdrDomain} to {@link TtExpRcvOdrCriteriaDomain}.
     *             - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *             - customerCd / CUSTOMER CODE
     *             - lgcyShipTo / LEGACY SHIP TO
     *             - itemNo / ITEM NO
     *             - pkgCd / PACKAGE CODE
     *             - trnsCd / TRANSPORT CODE
     *             - etdDueDt / ETD DUE DATE
     *             - customerPoNo / CUSTOMER PO NO
     *             - customerItemNo / CUSTOMER ITEM NO
     *             - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL
     *             - odrCtrlNo / ORDER CONTROL NO
     *
     *           The following items are set to {@link TtExpRcvOdrDomain}.
     *             - PltzAllocQtyCd / Alloc QTY: They are allocQty/ALLOC QUANTITY of {@link TtMixtagOdrDomain} as a result of Mix-Tag-Receive-Order [ The VALUE of the same clause eye before an update - ] acquisition.
     *             - ShippedTyp / SHIPPED TYPE: "1" (at the time of an order create)
     *
     *           {@link TtExpRcvOdrCriteriaDomain} and {@link TtExpRcvOdrDomain} are made into an argument,
     *           This is a call about * {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}.
     *
     *       {@link TtMixtagOdrDomain} is set as {@link W2005MixTagOdrDomain} as a result of - Mix-Tag-Receive-Order acquisition.
     *         Following, This is used by {@link TtMixtagOdrCriteriaDomain}.
     *
     * - data deletion
     *       Hard delete of - Mix Tag
     *           The following items are set to {@link TtMixtagCriteriaDomain},
     *           This is a call about {@link TtMixtagService#deleteByCondition (TtMixtagCriteriaDomain)}.
     *             - mixTagNo / MIX TAG NO: Same clause eye of mixTag
     *
     *       Hard delete of - MIXED ITEM NO
     *           The following items are set to {@link TtMixtagItemNoCriteriaDomain},
     *          this is a call about {@link TtMixtagItemNoService#deleteByCondition (TtMixtagItemNoCriteriaDomain)}.
     *             - mixTagNo / MIX TAG NO: Same clause eye of mixTag
     *
     *       Hard delete of - Mix Tag Receive Order
     *           The following items are set to {@link TtMixtagOdrCriteriaDomain},
     *           this is a call about {@link TtMixtagOdrService#deleteByCondition (TtMixtagOdrCriteriaDomain)}.
     *             - mixTagNo / MIX TAG NO: Same clause eye of mixTag
     *
     *       Hard delete of - Mix Tag KANBAN
     *           The following items are set to {@link TtMixKanbanCriteriaDomain},
     *           this is a call about {@link TtMixKanbanService#deleteByCondition (TtMixKanbanCriteriaDomain)}.
     *             - mixTagNo / MIX TAG NO: Same clause eye of mixTag
     *
     * - An update and registration of a Temp Stock
     *       - A Temp Stock is locked.
     *           The following items are set to {@link TtTmpStockCriteriaDomain},
     *           this is a call about {@link TtTmpStockService#lockByKey (TtTmpStockCriteriaDomain)}.
     *             - each key item: Each VALUE of mixTag
     *
     *       - Update of a Temp Stock
     *           The following items are set to {@link TtTmpStockCriteriaDomain}.
     *             - each key item: This is a key item of {@link TtTmpStockDomain} about the above-mentioned Temp Stock as a result of a lock.
     *
     *           The following items are set to {@link TtTmpStockDomain}.
     *             - qty / QUANTITY: qty/PKG QTY of mixTagItemDomainList of The VALUE of the same name item before an update - mixTag
     *
     *          this is a call about {@link TtTmpStockService#updateByCondition (TtTmpStockDomain, TtTmpStockCriteriaDomain)}.
     *
     * - Registration of an ordering alloc track record (starting of Web service)
     *       When pltzInstrNo / Packaging Instruction (=Pull) NO of mixTag are "", it carries out (when {@link W2005MixTagDomain#getPltzInstrNo} is "").
     *       The following is made into an argument,
     *       This is a call about Web service (WS2005){@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}.
     *         - Property of {@link W2005MixTagOdrDomain} acquired by Mix-Tag-Receive-Order acquisition of the above-mentioned ordering alloc cancellation
     * 
     * 
     * - 受注引当キャンセル
     *     - MIXED品目番号受注情報取得
     *         {@link TtMixtagOdrCriteriaDomain}に以下の項目を設定し、
     *         {@link TtMixtagOdrService#searchByCondition(TtMixtagOdrCriteriaDomain)}を呼出
     *           - mixTagNo/MIXタグNO:mixTagの同名項目
     *           
     *         下記の順にソート
     *           - MIX TAG NO/MIXタグNO (昇順)
     *           - ITEM NO/品目番号 (昇順)
     *           - PACKAGE CODE/包装区分 (昇順)
     *           - RECEIVE ORDER COMPANY CODE/受注会社コード (昇順)
     *           - CUSTOMER CODE/得意先コード (昇順)
     *           - LEGACY SHIP TO/LEGACY送荷先 (昇順)
     *           - TRANSPORT CODE/輸送手段コード (昇順)
     *           - ETD DUE DATE/船積期限 (昇順)
     *           - CUSTOMER PO NO/得意先PO NO (昇順)
     *           - CUSTOMER ITEM NO/得意先品目番号 (昇順)
     *           - CUSTOMER ITEM NO ORIGINAL/得意先品目番号オリジナル (昇順)
     *           - ORDER CONTROL NO/オーダーコントロールNO (昇順)
     *           
     *     - 上記の結果{@link TtMixtagOdrDomain}の件数分、以下を繰り返す
     *     
     *     - 輸出受注データを取得
     *         {@link TtExpRcvOdrCriteriaDomain}に上記の結果{@link TtMixtagOdrDomain}の以下の項目を設定
     *           - rcvOdrCompCd/受注会社コード
     *           - customerCd/得意先コード
     *           - lgcyShipTo/LEGACY送荷先
     *           - itemNo/品目番号
     *           - pkgCd/包装区分
     *           - trnsCd/輸送手段コード
     *           - etdDueDt/船積期限
     *           - customerPoNo/得意先PO NO
     *           - customerItemNo/得意先品目番号
     *           - customerItemNoOrg/得意先品目番号オリジナル
     *           - odrCtrlNo/オーダーコントロールNO
     *           
     *         {@link TtExpRcvOdrDomain}に以下の項目を設定
     *           - PltzAllocQtyCd/梱包引当数量:更新前の同項目の値 － MIXED品目番号受注情報取得の結果{@link TtMixtagOdrDomain}のallocQty/引当数量
     *           - ShippedTyp/出荷済み区分:"1"(オーダー作成時)
     *           
     *         {@link TtExpRcvOdrCriteriaDomain}、{@link TtExpRcvOdrDomain}を引数にして、
     *         {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出
     *         
     *     - MIXED品目番号受注情報取得の結果{@link TtMixtagOdrDomain}を{@link W2005MixTagOdrDomain}に設定
     *       下記、 {@link TtMixtagOdrCriteriaDomain}で使用
     *         
     * - データ削除
     *     - MIXED現品票の物理削除
     *         {@link TtMixtagCriteriaDomain}に以下の項目を設定し、
     *         {@link TtMixtagService#deleteByCondition(TtMixtagCriteriaDomain)}を呼出
     *           - mixTagNo/MIXタグNO:mixTagの同項目
     * 
     *     - MIXED品目番号の物理削除
     *         {@link TtMixtagItemNoCriteriaDomain}に以下の項目を設定し、
     *         {@link TtMixtagItemNoService#deleteByCondition(TtMixtagItemNoCriteriaDomain)}を呼出
     *           - mixTagNo/MIXタグNO:mixTagの同項目
     * 
     *     - MIXED品目番号受注情報の物理削除
     *         {@link TtMixtagOdrCriteriaDomain}に以下の項目を設定し、
     *         {@link TtMixtagOdrService#deleteByCondition(TtMixtagOdrCriteriaDomain)}を呼出
     *           - mixTagNo/MIXタグNO:mixTagの同項目
     * 
     *     - MIX品かんばん情報の物理削除
     *         {@link TtMixKanbanCriteriaDomain}に以下の項目を設定し、
     *         {@link TtMixKanbanService#deleteByCondition(TtMixKanbanCriteriaDomain)}を呼出
     *           - mixTagNo/MIXタグNO:mixTagの同項目
     * 
     * - 仮在庫の更新・登録
     *     - 仮在庫をロック
     *         {@link TtTmpStockCriteriaDomain}に以下の項目を設定し、
     *         {@link TtTmpStockService#lockByKey(TtTmpStockCriteriaDomain)}を呼出
     *           - 各キー項目:mixTagの各値
     *           
     *     - 仮在庫の更新
     *         {@link TtTmpStockCriteriaDomain}に以下の項目を設定
     *           - 各キー項目:上記の仮在庫をロックの結果{@link TtTmpStockDomain}のキー項目
     *         
     *         {@link TtTmpStockDomain}に以下の項目を設定
     *           - qty/数量:更新前の同名項目の値 － mixTagのmixTagItemDomainListのqty/梱包数量
     *           
     *         {@link TtTmpStockService#updateByCondition(TtTmpStockDomain, TtTmpStockCriteriaDomain)}を呼出
     * 
     * - 受注引当実績の登録（Webサービスの起動）
     *     mixTagのpltzInstrNo/梱包指示NOが""の場合({@link W2005MixTagDomain#getPltzInstrNo}が""の場合)に実施
     *     以下を引数にして、
     *     Webサービス(WS2005){@link Ws2005RestService#createRcvOdrAlloc(String, String, Ws2005ParamDomain)}を呼出
     *       - 上記の受注引当キャンセルのMIXED品目番号受注情報取得で取得した{@link W2005MixTagOdrDomain}のプロパティ
     * </pre>
     * 
     * @param mixTag Mix-Tag domain<br />MIXED現品票ドメイン
     * @throws ApplicationException When a delete process is not completed<br />削除処理ができなかった場合
     */ 
    public void transactOnRegisterCancel(W2005MixTagDomain mixTag)
        throws ApplicationException;

    // Print system method print
    // -------------------------------- プリント系メソッド print ---------------------------------------------------------
    /**
     * Create a list (L2002_Mix Tag).
     * <br />帳票(L2002_Mix Tag)を作成します。
     * <pre>
     * A create of - PDF list
     *       The following items are set as {@link L2002ReportCriteriaDomain}.
     *         - mixTagNo / MIX TAG NO
     *       {@link L2002ReportService#searchMixTag (String, String)} is called and a PDF list is created.
     * 
     * 
     * - PDF帳票の作成
     *     {@link L2002ReportCriteriaDomain}に以下の項目を設定
     *       - mixTagNo/MIXタグNO
     *     {@link L2002ReportService#searchMixTag(String, String)}を呼出し、PDF帳票を作成する
     * </pre>
     * 
     * @param mixTag Mix-Tag domain<br />MIXED現品票ドメイン
     * @param reportDateFormat List Date format<br />帳票日付フォーマット
     * @return PDF list<br />PDF帳票
     * @throws ApplicationException When a PDF list cannot be created<br />PDF帳票が作成できない場合
     */
    public File printOnRegisterPrintTag(W2005MixTagDomain mixTag, String reportDateFormat)
        throws ApplicationException;

}