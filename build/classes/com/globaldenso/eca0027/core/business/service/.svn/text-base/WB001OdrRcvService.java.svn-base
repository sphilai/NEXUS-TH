/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmCigmaShipToXrefDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmExpFormalitiItemNoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtExpRcvOdrDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmCigmaShipToXrefCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpFormalitiItemNoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmExpItemNoSpInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsCompCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtExpRcvOdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmCigmaShipToXrefService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpFormalitiItemNoService;
import com.globaldenso.eca0027.core.auto.business.service.TmExpItemNoSpInfoService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsCompService;
import com.globaldenso.eca0027.core.auto.business.service.TmNxsShipToService;
import com.globaldenso.eca0027.core.auto.business.service.TtExpRcvOdrService;
import com.globaldenso.eca0027.core.business.dao.WB001OdrRcvDao;
import com.globaldenso.eca0027.core.business.domain.WB001OdrRcvDomain;
import com.globaldenso.eca0027.core.business.domain.WsB001ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB002ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB005ResultDomain;
import com.globaldenso.eca0027.core.business.domain.WsB007ParamDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.WB001OdrRcvCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.WsB001RestService;
import com.globaldenso.eca0027.core.business.ws.WsB002RestService;
import com.globaldenso.eca0027.core.business.ws.WsB003RestService;
import com.globaldenso.eca0027.core.business.ws.WsB004RestService;
import com.globaldenso.eca0027.core.business.ws.WsB005RestService;
import com.globaldenso.eca0027.core.business.ws.WsB007RestService;
import com.globaldenso.eca0027.core.business.ws.WsB011RestService;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;

/**
 * This is an interface of ordering registration service.
 * <br />受注登録サービスのインタフェースです。
 * <pre>
 * bean id: wB0001OrderEntryService
 * </pre>
 *
 * @author $Author: 810833843 $
 * @version $Revision: 10295 $
 */
public interface WB001OdrRcvService {

    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    /**
     * Perform a CUSTOMER-ITEM-NO change propriety check.
     * <br />得意先品目番号変更可否チェックを行います。
     * <pre>
     * - CUSTOMER-ITEM-NO change propriety check
     *     In 0 <> Alloc. QTY and Customer Part No. <> hidden.Customer Part No., an error is made.
     * - 得意先品目番号変更可否チェック
     *     0 <> Alloc. QTY かつ Customer Part No. <> hidden.Customer Part No.の場合エラー
     * </pre>
     * 
     * @param allocQty Alloc. QTY 
     * @param customerPartNo Customer Part No. 
     * @param customerPartNoOrg Customer Part No. Original
     * @return check result (true or false)
     */
    public boolean validateConsistencyAllocQtyCustomerPartNo(BigDecimal allocQty, String customerPartNo, String customerPartNoOrg);

    /**
     * Perform a customer P/O No. change propriety check.
     * <br />得意先P/O No.変更可否チェックを行います。
     * <pre>
     * - Customer P/O No. change propriety check
     *     In 0 <> Alloc. QTY and Customer P/O No. <> hidden.Customer P/O No., an error is made.
     * - 得意先P/O No.変更可否チェック
     *     0 <> Alloc. QTY かつ Customer P/O No. <> hidden.Customer P/O No.の場合エラー
     * </pre>
     * 
     * @param allocQty Alloc. QTY 
     * @param customerPoNo Customer P/O No. 
     * @param customerPoNoOrg Customer P/O No. Original
     * @return check result (true or false)
     */
    public boolean validateConsistencyAllocQtyCustomerPoNo(BigDecimal allocQty, String customerPoNo, String customerPoNoOrg);

    /**
     * Perform a sales company P/O change propriety check.
     * <br />販売会社P/O変更可否チェックを行います。
     * <pre>
     * - Sales company P/O change propriety check
     *     In 0 <> Alloc. QTY and Sales P/O No. <> hidden.Sales P/O No., an error is made.
     * - 販売会社P/O変更可否チェック
     *     0 <> Alloc. QTY かつ Sales P/O No. <> hidden.Sales P/O No.の場合エラー
     * </pre>
     * 
     * @param allocQty Alloc. QTY 
     * @param salesPoNo Sales P/O No. 
     * @param salesPoNoOrg hidden.Sales P/O No. Original
     * @return check result (true or false)
     */
    public boolean validateConsistencyAllocQtySalesPoNo(BigDecimal allocQty, String salesPoNo, String salesPoNoOrg);

    /**
     * Perform a CUSTOMER-DUE-DATE validity check.
     * <br />顧客納期妥当性チェックを行います。
     * <pre>
     * - CUSTOMER-DUE-DATE validity check
     *     (an error is made when not having become the half a year back * of ETD-> DUE-DATE -> ETD)  
     *     An error is made when not having become the half a year back of Due Date <= Receiving Date <= Due Date.
     *     ①This is simple addition about 6 to the moon of date of record.
     *        Example,
     *             Six months after March is in September.
     *             Six months after October will be got blocked in April, and will be made into 10+6-12= April.
     *           The date is the same.
     *     ②When the date of calculation carried out is not an effective calendar day, the last day of the moon is adopted.
     *        Example:
     *           After half a year of 2012/6/30 are 2012/12/30.
     *           After half a year of 2012/7/31 are 2013/1/31.
     *           After half a year of 2012/8/31 are 2013/2/28.
     *
     * - 顧客納期妥当性チェック
     *     （ETD→納期→ETDの半年後※となっていない場合エラー）
     *     Due Date <= Receiving Date <= Due Dateの半年後となっていない場合エラー
     *     ①基準日の月に6を単純加算。
     *         例えば、
     *           3月の6ヵ月後は9月。
     *           10月の6ヵ月後は4月つまり、10+6-12=4月とする。
     *         日付は同じ。
     *     ②算出した日付が有効な暦日ではない場合、その月の末日を採用。
     *         例：
     *           2012/6/30の半年後は2012/12/30
     *           2012/7/31の半年後は2013/1/31
     *           2012/8/31の半年後は2013/2/28
     * </pre>
     * 
     * @param dueDate Due Date 
     * @param receivingDate Receiving Date 
     * @return check result (true or false)
     */
    public boolean validateConsistencyDateReceivingDate(Date dueDate, Date receivingDate);

    /**
     * Perform a CUSTOMER-DUE-DATE validity check.
     * <br />顧客納期妥当性チェックを行います。
     * <pre>
     * - CUSTOMER-DUE-DATE validity check
     *     (an error is made when not having become the half a year back * of ETD->CUSTOMER_DUE_DT->ETD)  
     *     An error is made when not having become the half a year back of Date <= Receiving Date <= Date.
     *     ①This is simple addition about 6 to the moon of date of record.
     *        Example,
     *             Six months after March is in September.
     *             Six months after October will be got blocked in April, and will be made into 10+6-12= April.
     *           The date is the same.
     *     ②When the date of calculation carried out is not an effective calendar day, the last day of the moon is adopted.
     *        Example:
     *           After half a year of 2012/6/30 are 2012/12/30.
     *           After half a year of 2012/7/31 are 2013/1/31.
     *           After half a year of 2012/8/31 are 2013/2/28.
     *
     * - 顧客納期妥当性チェック
     *     （ETD→CUSTOMER_DUE_DT→ETDの半年後※となっていない場合エラー）
     *     Date <= Receiving Date <= Dateの半年後となっていない場合エラー
     *     ①基準日の月に6を単純加算。
     *         例えば
     *           3月の6ヵ月後は9月。
     *           10月の6ヵ月後は4月つまり、10+6-12=4月とする。
     *         日付は同じ。
     *     ②算出した日付が有効な暦日ではない場合、その月の末日を採用。
     *         例：
     *           2012/6/30の半年後は2012/12/30
     *           2012/7/31の半年後は2013/1/31
     *           2012/8/31の半年後は2013/2/28
     * </pre>
     * 
     * @param date Date 
     * @param receivingDate Receiving Date 
     * @return check result (true or false)
     */
    public boolean validateConsistencyDueDateReceivingDate(Date date, Date receivingDate);

    /**
     * Perform the number validity check of decision.
     * <br />確定数妥当性チェックを行います。
     * <pre>
     * - The number validity check of decision
     *     An error is made when this is not Firm QTY >= Alloc. QTY.
     *
     * - 確定数妥当性チェック
     *     Firm QTY >= Alloc. QTYとなっていない場合エラー
     * </pre>
     * 
     * @param firmQty Firm QTY 
     * @param allocQty Alloc. QTY
     * @return check result (true or false)
     */
    public boolean validateConsistencyFirmQtyAllocQty(BigDecimal firmQty, BigDecimal allocQty);

    /**
     * Perform decision and a Forecast-QTY check (in a QUANTITY specified, an error is made in decision and an unofficial announcement).
     * <br />確定・内示数チェック（確定・内示共に数量指定の場合エラー）を行います。
     * <pre>
     * - Decision and Forecast-QTY check
     *     (in a QUANTITY specified, an error is made in decision and an unofficial announcement)  
     *     In 0 <> Firm QTY and 0 <> Forecast QTY, an error is made.
     *
     * - 確定・内示数チェック
     *     (確定・内示共に数量指定の場合エラー)
     *     0 <> Firm QTY かつ 0 <> Forecast QTYの場合エラー
     * </pre>
     * 
     * @param firmQty Firm QTY 
     * @param forecastQty Forecast QTY
     * @return check result (true or false)
     */
    public boolean validateConsistencyFirmQtyForecastQty(BigDecimal firmQty, BigDecimal forecastQty);

    /**
     * Perform a QUANTITY validity check.
     * <br />数量妥当性チェックを行います。
     * <pre>
     * - QUANTITY validity check
     *     (an error is made when the number of allocs is over number required)  
     *     An error is made when this is not New QTY >= Alloc. QTY.
     *     ※A blank reads it as 0.
     *
     * - 数量妥当性チェック
     *     (引当数が注文数を超過している場合エラー）
     *     New QTY >= Alloc. QTYとなっていない場合エラー
     *     ※ブランクは0と読み替える
     * </pre>
     * 
     * @param newQty New QTY 
     * @param allocQty Alloc. QTY
     * @return check result (true or false)
     */
    public boolean validateConsistencyNewQtyAllocQty(BigDecimal newQty, BigDecimal allocQty);
    
    /**
     * Perform the amount of total numbers eternal check.
     * <br />合計数量不変チェックを行います。
     * <pre>
     * - The amount of total numbers eternal check
     *     (an error is made when the amount of total numbers changes)  
     *     The sum total of New QTY = an error is made when this is not taking over VALUE .Order QTY.
     *     ※A blank reads it as 0.
     *
     * - 合計数量不変チェック
     *     (合計数量が変わった場合エラー）
     *     New QTYの合計 = 引継値.Order QTYとなっていない場合エラー
     *     ※ブランクは0と読み替える
     * </pre>
     * 
     * @param newQty New QTY
     * @param orderQty Order QTY
     * @return check result (true or false)
     */
    public boolean validateConsistencyNewQtyOrderQty(BigDecimal newQty, BigDecimal orderQty);
    
    /**
     * Perform information modify check.
     * <br />情報変更チェックを行います。
     * <pre>
     * - Information modify check
     *     An error is made when All Data are New QTY >= Hidden Order QTY.
     *     ※A blank reads it as 0.
     *
     * - 情報変更チェック
     *     全明細が【56】:New QTY = 【65】:hidden.Order QTYである場合エラーー
     *     ※ブランクは0と読み替える
     * </pre>
     *
     * @param modInfoFlg Information modify flag
     * @return check result (true or false)
     */
    public boolean validateConsistencyNewQtyOrderQtyHidden(boolean modInfoFlg);
    
    /**
     * Perform a lot multiple check.
     * <br />ロット倍数チェックを行います。
     * <pre>
     * - Lot multiple check
     *     (this is a Warn. when a QUANTITY is not a multiple of the number of lots)  
     *     An error is made when New QTY cannot divide among QTY/Carton.
     *
     * - ロット倍数チェック
     *     (数量がロット数の倍数でない場合ワーニング)
     *     New QTYがQTY/Cartonで割り切れない場合エラー
     * </pre>
     * 
     * @param newQty New QTY
     * @param qtyCarton QTY/Carton
     * @return check result (true or false)
     */
    public boolean validateConsistencyNewQtyQtyCarton(BigDecimal newQty, BigDecimal qtyCarton);

    /**
     * Perform decision and a Forecast-QTY check (an error is made, when this is new and decision and an unofficial announcement have no QUANTITY).
     * <br />確定・内示数チェック（新規で確定・内示共に数量なしの場合エラー）を行います。
     * <pre>
     * - Decision and Forecast-QTY check
     *     (an error is made, when this is new and decision and an unofficial announcement have no QUANTITY)  
     *     0 = hidden.Order QTY And 0 = Firm QTY and the case of 0 = Forecast QTY -- error
     *
     * - 確定・内示数チェック
     *     (新規で確定・内示共に数量なしの場合エラー)
     *     0 = hidden.Order QTY　かつ 0 = Firm QTY　かつ 0 = Forecast QTYの場合エラー
     * </pre>
     * 
     * @param hiddenorderQty hidden.Order QTY
     * @param firmQty Firm QTY
     * @param forecastQty Forecast QTY
     * @return check result (true or false)
     */
    public boolean validateConsistencyOrderQtyFirmQtyForecastQty(BigDecimal hiddenorderQty, BigDecimal firmQty, BigDecimal forecastQty);

    /**
     * Perform a packing CD related check.
     * <br />包装コード関連チェックを行います。
     * <pre>
     * - Packing CD related check
     *     A packing CD related check is performed.
     *     details -- common-specifications .xls -- "-- functional specification common: -- behavior" in a CIGMA night batch is referred to
     * 
     * - 包装コード関連チェック
     *     包装コード関連チェックを行います。
     *     詳細は共通仕様.xls「機能仕様共通：CIGMA夜間バッチ中の振る舞い」を参照
     * </pre>
     * 
     * @param pkgCd Packing CD<br />包装コード
     * @param itemNoGrp ITEM NO GROUP<br />品目番号グループ
     * @return If a packing CD is right, they are true, otherwise, false.<br />包装コードが正しければtrue、そうでなければfalse
     */
    public boolean validateConsistencyPkgCd(String pkgCd, String itemNoGrp);

    /**
     * Perform an authority check.
     * <br />権限チェックを行います。
     * <pre>
     * - Authority check (update authority)  
     *     The following is made into an argument and this is a call about {@link UserAuthService#hasUserAuthForCompPlnt(String, String, String)}.
     *       - Approval ID:WB 001R
     *       - COMPANY CODE
     *       - PLANT CODE
     * 
     * - 権限チェック(更新権限)
     *     以下を引数にして、{@link UserAuthService#hasUserAuthForCompPlnt(String, String, String)}を呼出
     *       - 認可ID:WB001R
     *       - 会社コード
     *       - 製造部工場区分
     * </pre>
     * 
     * @param shipperCd COMPANY CODE<br />会社コード
     * @param plntCd PLANT CODE<br />製造部工場区分
     * @return If there is a functional utilization right over the COMPANY CODE and PLANT CODE which were specified, they will be true, otherwise, false.
     *         <br />指定された会社コード、製造部工場区分に対する機能利用権限があればtrue、そうでなければfalse
     * @throws ApplicationException When an authority check is not made<br />権限チェックができない場合
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd) throws ApplicationException;

    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     * Check during processing in the CIGMA night.
     * <br />CIGMA夜間処理中チェックを行います。
     * <pre>
     * - Check during processing in the - CIGMA night.
     *     Shipper confirms whether to be among a night batch.
     *     details -- common-specifications .xls -- "-- functional specification common: -- behavior" in a CIGMA night batch is referred to
     * 
     * - CIGMA夜間処理中チェック
     *     Shipperが夜間バッチ中かをチェックします。
     *     詳細は共通仕様.xls「機能仕様共通：CIGMA夜間バッチ中の振る舞い」を参照
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
     * Perform an ETD validity check.
     * <br />ETD妥当性チェックを行います。
     * <pre>
     * - CIGMA ADS acquisition
     *     The following is made into an argument and this is the call} about {@link CommonService#searchCigmaAds(String)}.
     *       - compCd COMPANY CODE
     *
     * - ETD validity check
     *     An error is made when this is not < Due Date today.
     * 
     * - CIGMA ADS取得
     *     以下を引数にして、{@link CommonService#searchCigmaAds(String)}を呼出}
     *       - compCd 会社コード
     * 
     * - ETD妥当性チェック
     *     本日 < Due Dateとなっていない場合エラー
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param dueDate Due Date<br />Due Date
     * @return check result (true or false)
     * @throws ApplicationException When an error occurs in CommonService<br />CommonServiceでエラーが発生した場合
     */
    public boolean validateDatabaseProcessingDateOnMultiPoRegister(String compCd, Date dueDate)
        throws ApplicationException;
    
    /**
     * Perform an ETD validity check.
     * <br />ETD妥当性チェックを行います。
     * <pre>
     * - CIGMA ADS acquisition
     *     The following is made into an argument and this is the call} about {@link CommonService#searchCigmaAds(String)}.
     *       - compCd COMPANY CODE
     *
     * - ETD validity check
     *     An error is made when this is not < Due Date today.
     * 
     * - CIGMA ADS取得
     *     以下を引数にして、{@link CommonService#searchCigmaAds(String)}を呼出}
     *       - compCd 会社コード
     * 
     * - ETD妥当性チェック
     *     本日 < Due Dateとなっていない場合エラー
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param dueDate Due Date<br />Due Date
     * @return check result (true or false)
     * @throws ApplicationException When an error occurs in CommonService<br />CommonServiceでエラーが発生した場合
     */
    public boolean validateDatabaseProcessingDateOnRegister(String compCd, Date dueDate)
        throws ApplicationException;
    
    /**
     * Perform a SHIP-TO-NAME acquisition existence check.
     * <br />送荷先名称取得存在チェックを行います。
     * <pre>
     * The check of - CIGMA Ship To Cross Reference Master
     *     The following items are set to {@link TmCigmaShipToXrefCriteriaDomain}.
     *       - lgcyLibCompCd / LEGACY LIBRARY COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *
     *     This is the call about {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}.
     *
     * The check of - NEXUS Ship To Master
     *     The following items are set to {@link TmNxsShipToCriteriaDomain}.
     *       - shipToCd / SHIP TO CODE: The above-mentioned result is the property of {@link TmCigmaShipToXrefDomain}.
     *
     *     This is the call about {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}.
     * 
     * - NEXUS送荷先クロスリファレンス原単位のチェック
     *     {@link TmCigmaShipToXrefCriteriaDomain}に以下の項目を設定
     *       - lgcyLibCompCd/(LEGACYライブラリ)会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       
     *     {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}を呼出}
     * 
     * - NEXUS送荷先原単位のチェック
     *     {@link TmNxsShipToCriteriaDomain}に以下の項目を設定
     *       - shipToCd/送荷先コード:上記の結果{@link TmCigmaShipToXrefDomain}のプロパティ
     *       
     *     {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param tmpDomain SHIP TO NAME   ※Domain for a return VALUE setting<br />送荷先名称　※戻り値設定用ドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a CIGMA Ship To Cross Reference Master and a NEXUS Ship To Master cannot be referred to
     *                              <br />NEXUS送荷先クロスリファレンス原単位、NEXUS送荷先原単位が参照できない場合
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnHeaderMoveToRegister(String lgcyLibCompCd , String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform a SHIP-TO-NAME acquisition existence check.
     * <br />送荷先名称取得存在チェックを行います。
     * <pre>
     * - The check of CIGMA Ship To Cross Reference Master
     *     The following items are set to {@link TmCigmaShipToXrefCriteriaDomain}.
     *       - lgcyLibCompCd / LEGACY LIBRARY COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *
     *     This is the call about {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}.
     *
     * - The check of NEXUS Ship To Master
     *     The following items are set to {@link TmNxsShipToCriteriaDomain}.
     *       - shipToCd / SHIP TO CODE: The above-mentioned result is the property of {@link TmCigmaShipToXrefDomain}.
     *
     *     This is the call about {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}.
     * 
     * - NEXUS送荷先クロスリファレンス原単位のチェック
     *     {@link TmCigmaShipToXrefCriteriaDomain}に以下の項目を設定
     *       - lgcyLibCompCd/(LEGACYライブラリ)会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       
     *     {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}を呼出}
     * 
     * - NEXUS送荷先原単位のチェック
     *     {@link TmNxsShipToCriteriaDomain}に以下の項目を設定
     *       - shipToCd/送荷先コード:上記の結果{@link TmCigmaShipToXrefDomain}のプロパティ
     *       
     *     {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param tmpDomain SHIP TO NAME   ※Domain for a return VALUE setting<br />送荷先名称　※戻り値設定用ドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a CIGMA Ship To Cross Reference Master and a NEXUS Ship To Master cannot be referred to
     *                              <br />NEXUS送荷先クロスリファレンス原単位、NEXUS送荷先原単位が参照できない場合
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnLstDgtChgMainSearch(String lgcyLibCompCd , String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform a SHIP-TO-NAME acquisition existence check.
     * <br />送荷先名称取得存在チェックを行います。
     * <pre>
     * - The check of CIGMA Ship To Cross Reference Master
     *     The following items are set to {@link TmCigmaShipToXrefCriteriaDomain}.
     *       - lgcyLibCompCd / LEGACY LIBRARY COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *
     *     This is the call about {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}.
     *
     * - The check of NEXUS Ship To Master
     *     The following items are set to {@link TmNxsShipToCriteriaDomain}.
     *       - shipToCd / SHIP TO CODE: The above-mentioned result is the property of {@link TmCigmaShipToXrefDomain}.
     *
     *     This is the call about {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}.
     * 
     * - NEXUS送荷先クロスリファレンス原単位のチェック
     *     {@link TmCigmaShipToXrefCriteriaDomain}に以下の項目を設定
     *       - lgcyLibCompCd/(LEGACYライブラリ)会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       
     *     {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}を呼出}
     * 
     * - NEXUS送荷先原単位のチェック
     *     {@link TmNxsShipToCriteriaDomain}に以下の項目を設定
     *       - shipToCd/送荷先コード:上記の結果{@link TmCigmaShipToXrefDomain}のプロパティ
     *       
     *     {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param tmpDomain SHIP TO NAME   ※※Domain for return VALUE setting<br />送荷先名称　※※戻り値設定用ドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a CIGMA Ship To Cross Reference Master and a NEXUS Ship To Master cannot be referred to
     *                              <br />NEXUS送荷先クロスリファレンス原単位、NEXUS送荷先原単位が参照できない場合
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnLstDgtChgRegister(String lgcyLibCompCd , String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform a SHIP-TO-NAME acquisition existence check.
     * <br />送荷先名称取得存在チェックを行います。
     * <pre>
     * - The check of CIGMA Ship To Cross Reference Master
     *     The following items are set to {@link TmCigmaShipToXrefCriteriaDomain}.
     *       - lgcyLibCompCd / LEGACY LIBRARY COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *
     *     This is the call about {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}.
     *
     * - The check of NEXUS Ship To Master
     *     The following items are set to {@link TmNxsShipToCriteriaDomain}.
     *       - shipToCd / SHIP TO CODE: The above-mentioned result is the property of {@link TmCigmaShipToXrefDomain}.
     *
     *     This is the call about {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}.
     * 
     * - NEXUS送荷先クロスリファレンス原単位のチェック
     *     {@link TmCigmaShipToXrefCriteriaDomain}に以下の項目を設定
     *       - lgcyLibCompCd/(LEGACYライブラリ)会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       
     *     {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}を呼出}
     * 
     * - NEXUS送荷先原単位のチェック
     *     {@link TmNxsShipToCriteriaDomain}に以下の項目を設定
     *       - shipToCd/送荷先コード:上記の結果{@link TmCigmaShipToXrefDomain}のプロパティ
     *       
     *     {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param tmpDomain SHIP TO NAME   ※Domain for a return VALUE setting<br />送荷先名称　※戻り値設定用ドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a CIGMA Ship To Cross Reference Master and a NEXUS Ship To Master cannot be referred to
     *                              <br />NEXUS送荷先クロスリファレンス原単位、NEXUS送荷先原単位が参照できない場合
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnMultiPoRegister(String lgcyLibCompCd , String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform a SHIP-TO-NAME acquisition existence check.
     * <br />送荷先名称取得存在チェックを行います。
     * <pre>
     * - The check of CIGMA Ship To Cross Reference Master
     *     The following items are set to {@link TmCigmaShipToXrefCriteriaDomain}.
     *       - lgcyLibCompCd / LEGACY LIBRARY COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *
     *     This is the call about {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}.
     *
     * - The check of NEXUS Ship To Master
     *     The following items are set to {@link TmNxsShipToCriteriaDomain}.
     *       - shipToCd / SHIP TO CODE: The above-mentioned result is the property of {@link TmCigmaShipToXrefDomain}.
     *
     *     This is the call about {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}.
     * 
     * - NEXUS送荷先クロスリファレンス原単位のチェック
     *     {@link TmCigmaShipToXrefCriteriaDomain}に以下の項目を設定
     *       - lgcyLibCompCd/(LEGACYライブラリ)会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       
     *     {@link TmCigmaShipToXrefService#searchByKey(TmCigmaShipToXrefCriteriaDomain)}を呼出}
     * 
     * - NEXUS送荷先原単位のチェック
     *     {@link TmNxsShipToCriteriaDomain}に以下の項目を設定
     *       - shipToCd/送荷先コード:上記の結果{@link TmCigmaShipToXrefDomain}のプロパティ
     *       
     *     {@link TmNxsShipToService#searchByKey(TmNxsShipToCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param lgcyLibCompCd LEGACY LIBRARY COMPANY CODE<br />(LEGACYライブラリ)会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param tmpDomain SHIP-TO-NAME  ※Domain for a return VALUE setting<br />送荷先名称 ※戻り値設定用ドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a CIGMA Ship To Cross Reference Master and a NEXUS Ship To Master cannot be referred to
     *                              <br />NEXUS送荷先クロスリファレンス原単位、NEXUS送荷先原単位が参照できない場合
     */
    public boolean validateDatabaseTmCigmaShipToXrefOnRegister(String lgcyLibCompCd , String customerCd, String lgcyShipTo, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform the ITEM-NO existence check for export.
     * <br />輸出対象品目番号存在チェックを行います。
     * <pre>
     * - CIGMA ADS acquisition
     *     The following is made into an argument and this is the call} about {@link CommonService#searchCigmaAds(String)}.
     *       - compCd / COMPANY CODE
     *
     * - Check of an Export Shipping Item No Special Information Master
     *     The following items are set to {@link TmExpItemNoSpInfoCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *       - itemNo / ITEM NO
     *       - pkgCd / PACKAGE CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *       - aplyStrtDt / APPLY START DATE: This is [ above-mentioned result ] smaller than {@link CommonService#searchCigmaAds (String)}.
     *
     *     Sort order
     *       - APPLY START DATE / APPLY START DATE (descending order)
     *
     *     The 1st affair is acquired by a paging function.
     *
     *     This is the call about {@link TmExpItemNoSpInfoService#searchByConditionForPaging(TmExpItemNoSpInfoCriteriaDomain)}.
     *
     * - 輸出出荷品目番号原単位のチェック
     *     {@link TmExpItemNoSpInfoCriteriaDomain}に以下の項目を設定
     *       - compCd/会社コード
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       - aplyStrtDt/適用開始日:上記の結果{@link CommonService#searchCigmaAds(String)}より小さい
     *       
     *     ソート順
     *       - APPLY START DATE/適用開始日 (降順)
     *     
     *     paging機能で1件目を取得
     *     
     *     {@link TmExpItemNoSpInfoService#searchByConditionForPaging(TmExpItemNoSpInfoCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param itemNo ITEM NO<br />品目番号
     * @param pkgCd PACKAGE CODE<br />包装区分
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param aplyStrtDt APPLY START DATE<br />適用開始日
     * @param tmpDomain Domain for a return VALUE setting (a SHIPPING LOT)<br />戻り値設定用ドメイン(出荷ロット)
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When an error occurs in CommonService,
     *                              <br />When an Export Shipping Item No Special Information Master cannot be referred to
     *                              <br />CommonServiceでエラーが発生した場合、
     *                              <br />輸出出荷品目番号原単位が参照できない場合
     */
    public boolean validateDatabaseTmExpItemNoSpInfo(
        String compCd, String itemNo, String pkgCd, String customerCd, String lgcyShipTo, Date aplyStrtDt, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform the ITEM-NO existence check for export control.
     * <br />輸出規制対象品目番号存在チェックを行います。
     * <pre>
     * - CIGMA ADS acquisition
     *     The following is made into an argument and this is the call about {@link CommonService#searchCigmaAds(String)}.
     *       - compCd / COMPANY CODE
     *
     * - Check of an Export Formality Item No Master
     *     The following items are set to {@link TmExpFormalitiItemNoCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *       - itemNo / ITEM NO
     *       - aplyStrtDt / APPLY START DATE: This is [ above-mentioned result ] smaller than {@link CommonService#searchCigmaAds (String)}.
     *
     *     Sort order
     *       - APPLY START DATE / APPLY START DATE (descending order)
     *
     *     The 1st affair is acquired by a paging function.
     *
     *     This is the call about {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}.
     * 
     * - CIGMA ADS取得
     *     以下を引数にして、{@link CommonService#searchCigmaAds(String)}を呼出}
     *       - compCd/会社コード
     * 
     * - 輸出手続品目番号原単位のチェック
     *     {@link TmExpFormalitiItemNoCriteriaDomain}に以下の項目を設定
     *       - compCd/会社コード
     *       - itemNo/品目番号
     *       - aplyStrtDt/適用開始日:上記の結果{@link CommonService#searchCigmaAds(String)}より小さい
     *       
     *     ソート順
     *       - APPLY START DATE/適用開始日 (降順)
     *     
     *     paging機能で1件目を取得
     *     
     *     {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param itemNo ITEM NO<br />品目番号
     * @param aplyStrtDt APPLY START DATE<br />適用開始日
     * @param tmpDomain Domain for a return VALUE setting (ITEM DESCRIPTION)<br />戻り値設定用ドメイン(品目名称)
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When an error occurs in CommonService and an Export Formality Item No Master cannot be referred to
     *                              <br />CommonServiceでエラーが発生した場合、輸出手続品目番号原単位が参照できない場合
     */
    public boolean validateDatabaseTmExpFormalitiItemNo(String compCd, String itemNo, Date aplyStrtDt, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform the lot multiple check of Firm QTY.
     * <br />Firm QTYのロット倍数チェックを行います。
     * <pre>
     * - Decision and Forecast-QTY check
     *     An error is made when Firm QTY cannot divide among Export-Shipping-Item-No-Special-Information-Master .SHIPPING_LOT.
     * 
     * - 確定・内示数チェック
     *     Firm QTYが輸出出荷品目番号原単位.SHIPPING_LOTで割り切れない場合エラー
     * </pre>
     * 
     * @param firmQty Firm QTY<br />Firm QTY
     * @param shippingLot SHIPPING LOT<br />出荷ロット
     * @return check result (true or false)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByFirmQtyShippingLot(BigDecimal firmQty, BigDecimal shippingLot);
    
    /**
     * Perform the lot multiple check of Forecast QTY.
     * <br />Forecast QTYのロット倍数チェックを行います。
     * <pre>
     * - Decision and Forecast-QTY check
     *     An error is made when Forecast QTY cannot divide among Export-Shipping-Item-No-Special-Information-Master .SHIPPING_LOT.
     * 
     * - 確定・内示数チェック
     *     Forecast QTYが輸出出荷品目番号原単位.SHIPPING_LOTで割り切れない場合エラー
     * </pre>
     * 
     * @param forecastQty Forecast QTY
     * @param shippingLot SHIPPING LOT<br />出荷ロット
     * @return check result (true or false)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnMultiPoRegisterByForecastQtyShippingLot(BigDecimal forecastQty, BigDecimal shippingLot);
    
    /**
     * Perform the lot multiple check of Firm QTY.
     * <br />Firm QTYのロット倍数チェックを行います。
     * <pre>
     * - Decision and Forecast-QTY check
     *     An error is made when Firm QTY cannot divide among Export-Shipping-Item-No-Special-Information-Master .SHIPPING_LOT.
     * 
     * - 確定・内示数チェック
     *     Firm QTYが輸出出荷品目番号原単位.SHIPPING_LOTで割り切れない場合エラー
     * </pre>
     * 
     * @param firmQty Firm QTY
     * @param shippingLot SHIPPING LOT<br />出荷ロット
     * @return check result (true or false)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnRegisterByFirmQtyShippingLot(BigDecimal firmQty, BigDecimal shippingLot);
    
    /**
     * Perform the lot multiple check of Forecast QTY.
     * <br />Forecast QTYのロット倍数チェックを行います。
     * <pre>
     * - Decision and Forecast-QTY check
     *     An error is made when Forecast QTY cannot divide among Export-Shipping-Item-No-Special-Information-Master .SHIPPING_LOT.
     * 
     * - 確定・内示数チェック
     *     Forecast QTYが輸出出荷品目番号原単位.SHIPPING_LOTで割り切れない場合エラー
     * </pre>
     * 
     * @param forecastQty Forecast QTY
     * @param shippingLot SHIPPING LOT<br />出荷ロット
     * @return check result (true or false)
     */
    public boolean validateDatabaseTmExpItemNoSpInfoOnRegisterByForecastQtyShippingLot(BigDecimal forecastQty, BigDecimal shippingLot);
    
    /**
     * Perform an ordering company existence check.
     * <br />受注会社存在チェックを行います。
     * <pre>
     * - The check of NEXUS Company Master
     *     The following items are set to {@link TmNxsCompCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *
     *     This is the call about {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}.
     * 
     * - NEXUS会社原単位のチェック
     *     {@link TmNxsCompCriteriaDomain}に以下の項目を設定
     *       - compCd/会社コード
     *     
     *     {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param tmpDomain The domain for a return VALUE setting<br />戻り値設定用のドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a NEXUS Company Master cannot be referred to<br />NEXUS会社原単位が参照できない場合
     */
    public boolean validateDatabaseTmNxsCompOnHeaderMoveToRegister(String compCd, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform an ordering company existence check.
     * <br />受注会社存在チェックを行います。
     * <pre>
     * - The check of NEXUS Company Master
     *     The following items are set to {@link TmNxsCompCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *
     *     This is the call about {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}.
     * 
     * - NEXUS会社原単位のチェック
     *     {@link TmNxsCompCriteriaDomain}に以下の項目を設定
     *       - compCd/会社コード
     *     
     *     {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param tmpDomain The domain for a return VALUE setting<br />戻り値設定用のドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a NEXUS Company Master cannot be referred to<br />NEXUS会社原単位が参照できない場合
     */
    public boolean validateDatabaseTmNxsComp(String compCd, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform an ordering company existence check.
     * <br />受注会社存在チェックを行います。
     * <pre>
     * - The check of NEXUS Company Master
     *     The following items are set to {@link TmNxsCompCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *
     *     This is the call about {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}.
     * 
     * - NEXUS会社原単位のチェック
     *     {@link TmNxsCompCriteriaDomain}に以下の項目を設定
     *       - compCd/会社コード
     *     
     *     {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param tmpDomain The domain for a return VALUE setting<br />戻り値設定用のドメイン
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a NEXUS Company Master cannot be referred to<br />NEXUS会社原単位が参照できない場合
     */
    public boolean validateDatabaseTmNxsCompOnLstDgtChgRegister(String compCd, WB001OdrRcvDomain tmpDomain)
        throws ApplicationException;
    
    /**
     * Perform an ordering company existence check.
     * <br />受注会社存在チェックを行います。
     * <pre>
     * - The check of NEXUS Company Master
     *     The following items are set to {@link TmNxsCompCriteriaDomain}.
     *       - compCd / COMPANY CODE
     *
     *    This is the call about {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}.
     * - NEXUS会社原単位のチェック
     *     {@link TmNxsCompCriteriaDomain}に以下の項目を設定
     *       - compCd/会社コード
     *     
     *     {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a NEXUS Company Master cannot be referred to<br />NEXUS会社原単位が参照できない場合
     */
    public boolean validateDatabaseTmNxsCompOnMultiPoRegister(String compCd)
        throws ApplicationException;
    
    /**
     * Perform an ordering company existence check.
     * <br />受注会社存在チェックを行います。
     * <pre>
     * - The check of NEXUS Company Master
     *     The following items are set to {@link TmNxsCompCriteriaDomain}.
     *      - compCd / COMPANY CODE
     *
     *     This is the call about {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}.
     * 
     * - NEXUS会社原単位のチェック
     *     {@link TmNxsCompCriteriaDomain}に以下の項目を設定
     *       - compCd/会社コード
     *     
     *     {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @return If there is data of relevance, they will be true, otherwise, false.<br />該当のデータがあればtrue、そうでなければfalse
     * @throws ApplicationException When a NEXUS Company Master cannot be referred to<br />NEXUS会社原単位が参照できない場合
     */
    public boolean validateDatabaseTmNxsCompOnRegister(String compCd)
        throws ApplicationException;
    
    /**
     * Perform a duplication check (Export Receive Order).
     * <br />重複チェック（輸出受注）を行います。
     * <pre>
     * - Check in new data.
     *     The following items of before check in "."
     *
     * - Screen change existence check
     *     In the case of new data, checking is unnecessary.
     *     When the following items of before and after are in agreement, this is ture about a return VALUE.
     *     - customerPoNo/Customer P/O No.
     *     - customerItemNo/Customer Part No.
     *
     * - Duplication check (Export Receive Order)  
     *     The following items of after are set to {@link TtExpRcvOdrCriteriaDomain}.
     *      - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *       - itemNo / ITEM NO
     *       - pkgCd / PACKAGE CODE
     *       - trnsCd / TRANSPORT CODE
     *       - etdDueDt / ETD DUE DATE
     *       - customerPoNo / CUSTOMER PO NO
     *       - customerItemNo / CUSTOMER ITEM NO
     *       - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL
     *       - odrCtrlNo / ORDER CONTROL NO
     *
     *     This is the call about {@link TtExpRcvOdrService#searchByKey(TtExpRcvOdrCriteriaDomain)}.
     * 
     * - 新規データかチェック
     *     beforeの以下の項目が""かチェック
     *        
     * - 画面変更有無チェック
     *     新規データの場合チェック不要
     *     beforeとafterの以下の項目が一致している場合、戻り値をture
     *       - customerPoNo/Customer P/O No.
     *       - customerItemNo/Customer Part No.
     *       
     * - 重複チェック（輸出受注）
     *     {@link TtExpRcvOdrCriteriaDomain}にafterの以下の項目を設定
     *       - rcvOdrCompCd/受注会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - trnsCd/輸送手段コード
     *       - etdDueDt/船積期限
     *       - customerPoNo/得意先PO NO
     *       - customerItemNo/得意先品目番号
     *       - customerItemNoOrg/得意先品目番号オリジナル
     *       - odrCtrlNo/オーダーコントロールNO
     *     
     *     {@link TtExpRcvOdrService#searchByKey(TtExpRcvOdrCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param index Display row no/画面表示行
     * @param after Export-Receive-Order search-condition domain   ※The VALUE after screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain   ※The VALUE before screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @param odrRcvList The list of Customer Order Receiving domain<br />Customer Order Receivingドメインのリスト
     * @return This is true when the following items of before and after are in agreement.
     *         If there is no data of relevance, they will be true, otherwise, false.
     *         <br />beforeとafterの以下の項目が一致している場合、true
     *         該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public boolean validateDatabaseTtExpRcvOdrOnMultiPoRegisterByDuplication(int index, TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before,
        List<? extends WB001OdrRcvDomain> odrRcvList)
        throws ApplicationException;
    
    /**
     * Perform decision and a Forecast-QTY check (an error is made when an unofficial announcement order received exists by definite QUANTITY >0 in addition to an object record).
     * <br />確定・内示数チェック(確定数量>0で対象レコード以外に内示受注が存在する場合エラー)を行います。
     * <pre>
     * - Firm QTY check
     *     firmQty = in the case of 0, this is true about a return VALUE.
     *
     * - Export-Receive-Order acquisition
     *     The following items of after are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *       - itemNo / ITEM NO
     *       - pkgCd / PACKAGE CODE
     *       - etdDueDt / ETD DUE DATE
     *       - customerPoNo / CUSTOMER PO NO
     *       - customerItemNo / CUSTOMER ITEM NO
     *
     *     This is a call about {@link TtExpRcvOdrService#searchByKey (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Decision and Forecast-QTY check
     *     - Check of new data (when the following customerItemNo/CUSTOMER ITEM NOs of before are "")
     *         an Export-Receive-Order acquisition result {@link TtExpRcvOdrDomain} exists -- returning, if it kicks -- a VALUE -- true
     *         In except, this is false about a return VALUE.
     *
     *     - Check of existing data (in the cases of other than the above)
     *         Only in the case of the data whose Export-Receive-Order acquisition result {@link TtExpRcvOdrDomain} corresponds with the following keys of before, this is true about a return VALUE.
     *         In except, this is false about a return VALUE.
     *           - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *           - customerCd / CUSTOMER CODE
     *           - lgcyShipTo / LEGACY SHIP TO
     *           - itemNo / ITEM NO
     *           - pkgCd / PACKAGE CODE
     *           - trnsCd / TRANSPORT CODE
     *           - etdDueDt / ETD DUE DATE
     *           - customerPoNo / CUSTOMER PO NO
     *           - customerItemNo / CUSTOMER ITEM NO
     *           - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL
     *           - odrCtrlNo / ORDER CONTROL NO
     * 
     * - Firm QTYチェック
     *   firmQty ＝ 0の場合、戻り値をtrue
     *     
     * - 輸出受注取得
     *     {@link TtExpRcvOdrCriteriaDomain}にafterの以下の項目を設定
     *       - rcvOdrCompCd/受注会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - etdDueDt/船積期限
     *       - customerPoNo/得意先PO NO
     *       - customerItemNo/得意先品目番号
     *     
     *     {@link TtExpRcvOdrService#searchByKey(TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 確定・内示数チェック
     *     - 新規データのチェック( beforeの以下のcustomerItemNo/得意先品目番号が""の場合)
     *         輸出受注取得結果{@link TtExpRcvOdrDomain}が存在しなけらば戻り値をtrue
     *         以外の場合、戻り値をfalse
     *         
     *     - 既存データのチェック(上記以外の場合)
     *         輸出受注取得結果{@link TtExpRcvOdrDomain}が、beforeの以下のキーに一致するデータのみの場合、戻り値をtrue
     *         以外の場合、戻り値をfalse
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
     * </pre>
     * 
     * @param firmQty Firm QTY
     * @param after Export-Receive-Order search-condition domain   ※The VALUE after screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain   ※The VALUE before screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @return This is true when Firm QTY is 0.
     *         If this is except the above and there is no data of relevance, they will be true, otherwise, false.
     *         <br />Firm QTYが0の場合、true
     *         上記以外で、該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public boolean validateDatabaseTtExpRcvOdrOnMultiPoRegisterByFirmQty(BigDecimal firmQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException;
    
    /**
     * Perform decision and a Forecast-QTY check (an error is made when a firm order receipt exists in addition to the object record of amount of Forecast QTYs >0).
     * <br />確定・内示数チェック(内示数量>0での対象レコード以外に確定受注が存在する場合エラー)を行います。
     * <pre>
     * - Forecast QTY check
     *     Forecast = in the case of 0, this is true about a return VALUE.
     *
     * - Export-Receive-Order acquisition
     *     The following items of after are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *       - itemNo / ITEM NO
     *       - pkgCd / PACKAGE CODE
     *       - etdDueDt / ETD DUE DATE
     *       - customerPoNo / CUSTOMER PO NO
     *       - customerItemNo / CUSTOMER ITEM NO
     *
     *       This is a call about {@link TtExpRcvOdrService#searchByKey (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Decision and Forecast-QTY check
     *     - Check of new data (when the following customerItemNo/CUSTOMER ITEM NOs of before are "")
     *         an Export-Receive-Order acquisition result {@link TtExpRcvOdrDomain} exists -- returning, if it kicks -- a VALUE -- true
     *         In except, this is false about a return VALUE.
     *
     *     - Check of existing data (in the cases of other than the above)
     *         Only in the case of the data whose Export-Receive-Order acquisition result {@link TtExpRcvOdrDomain} corresponds with the following keys of before, this is true about a return VALUE.
     *         In except, this is false about a return VALUE.
     *           - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *           - customerCd / CUSTOMER CODE
     *           - lgcyShipTo / LEGACY SHIP TO
     *           - itemNo / ITEM NO
     *           - pkgCd / PACKAGE CODE
     *           - trnsCd / TRANSPORT CODE
     *           - etdDueDt / ETD DUE DATE
     *           - customerPoNo / CUSTOMER PO NO
     *           - customerItemNo / CUSTOMER ITEM NO
     *           - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL
     *           - odrCtrlNo / ORDER CONTROL NO
     * 
     * - Forecast QTYチェック
     *     Forecast ＝ 0の場合、戻り値をtrue
     *     
     * - 輸出受注取得
     *     {@link TtExpRcvOdrCriteriaDomain}にafterの以下の項目を設定
     *       - rcvOdrCompCd/受注会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - etdDueDt/船積期限
     *       - customerPoNo/得意先PO NO
     *       - customerItemNo/得意先品目番号
     *     
     *     {@link TtExpRcvOdrService#searchByKey(TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 確定・内示数チェック
     *     - 新規データのチェック( beforeの以下のcustomerItemNo/得意先品目番号が""の場合)
     *         輸出受注取得結果{@link TtExpRcvOdrDomain}が存在しなけらば戻り値をtrue
     *         以外の場合、戻り値をfalse
     *         
     *     - 既存データのチェック(上記以外の場合)
     *         輸出受注取得結果{@link TtExpRcvOdrDomain}が、beforeの以下のキーに一致するデータのみの場合、戻り値をtrue
     *         以外の場合、戻り値をfalse
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
     * </pre>
     * 
     * @param forecastQty Forecast QTY
     * @param after Export-Receive-Order search-condition domain   ※The VALUE after screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain   ※The VALUE before screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @return This is true when Firm QTY is 0.
     *         If this is except the above and there is no data of relevance, they will be true, otherwise, false.
     *         <br />Firm QTYが0の場合、true
     *         上記以外で、該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public boolean validateDatabaseTtExpRcvOdrOnMultiPoRegisterByForecastQty(BigDecimal forecastQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException;
    
    /**
     * Perform a duplication check (Export Receive Order).
     * <br />重複チェック（輸出受注）を行います。
     * <pre>
     * - Check in new data.
     *     The following items of before check in "."
     *
     * - Screen change existence check
     *     In the case of new data, checking is unnecessary.
     *     When the following items of before and after are in agreement, this is ture about a return VALUE.
     *     - customerPoNo/Customer P/O No.
     *     - customerItemNo/Customer Part No.
     *
     * - Duplication check (Export Receive Order)  
     *     The following items of after are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *       - itemNo / ITEM NO
     *       - pkgCd / PACKAGE CODE
     *       - trnsCd / TRANSPORT CODE
     *       - etdDueDt / ETD DUE DATE
     *       - customerPoNo / CUSTOMER PO NO
     *       - customerItemNo / CUSTOMER ITEM NO
     *       - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL
     *       - odrCtrlNo / ORDER CONTROL NO
     *
     *     This is the call about {@link TtExpRcvOdrService#searchByKey(TtExpRcvOdrCriteriaDomain)}.
     *
     * - 新規データかチェック
     *     beforeの以下の項目が""かチェック
     *        
     * - 画面変更有無チェック
     *     新規データの場合チェック不要
     *     beforeとafterの以下の項目が一致している場合、戻り値をture
     *       - customerPoNo/Customer P/O No.
     *       - customerItemNo/Customer Part No.
     *       
     * - 重複チェック（輸出受注）
     *     {@link TtExpRcvOdrCriteriaDomain}にafterの以下の項目を設定
     *       - rcvOdrCompCd/受注会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - trnsCd/輸送手段コード
     *       - etdDueDt/船積期限
     *       - customerPoNo/得意先PO NO
     *       - customerItemNo/得意先品目番号
     *       - customerItemNoOrg/得意先品目番号オリジナル
     *       - odrCtrlNo/オーダーコントロールNO
     *     
     *     {@link TtExpRcvOdrService#searchByKey(TtExpRcvOdrCriteriaDomain)}を呼出}
     * </pre>
     * 
     * @param after Export-Receive-Order search-condition domain   ※The VALUE after screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain   ※The VALUE before screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @return This is true when the following items of before and after are in agreement.
     *         If there is no data of relevance, they will be true, otherwise, false.
     *         <br />beforeとafterの以下の項目が一致している場合、true
     *         該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public boolean validateDatabaseTtExpRcvOdrOnRegisterByDuplication(TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException;
    
    /**
     * Perform decision and a Forecast-QTY check (an error is made when an unofficial announcement order received exists by definite QUANTITY >0 in addition to an object record).
     * <br />確定・内示数チェック(確定数量>0で対象レコード以外に内示受注が存在する場合エラー)を行います。
     * <pre>
     * - Firm QTY check
     *     firmQty = in the case of 0, this is true about a return VALUE.
     *
     * - Export-Receive-Order acquisition
     *     The following items of after are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *       - customerCd / CUSTOMER CODE
     *       - lgcyShipTo / LEGACY SHIP TO
     *       - itemNo / ITEM NO
     *       - pkgCd / PACKAGE CODE
     *       - etdDueDt / ETD DUE DATE
     *       - customerPoNo / CUSTOMER PO NO
     *       - customerItemNo / CUSTOMER ITEM NO
     *
     *     This is a call about {@link TtExpRcvOdrService#searchByKey (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Decision and Forecast-QTY check
     *     - Check of new data (when the following customerItemNo/CUSTOMER ITEM NOs of before are "")
     *         an Export-Receive-Order acquisition result {@link TtExpRcvOdrDomain} exists -- returning, if it kicks -- a VALUE -- true
     *         In except, this is false about a return VALUE.
     *
     *     - Check of existing data (in the cases of other than the above)
     *         Only in the case of the data whose Export-Receive-Order acquisition result {@link TtExpRcvOdrDomain} corresponds with the following keys of before, this is true about a return VALUE.
     *         In except, this is false about a return VALUE.
     *           - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *           - customerCd / CUSTOMER CODE
     *           - lgcyShipTo / LEGACY SHIP TO
     *           - itemNo / ITEM NO
     *           - pkgCd / PACKAGE CODE
     *           - trnsCd / TRANSPORT CODE
     *           - etdDueDt / ETD DUE DATE
     *           - customerPoNo / CUSTOMER PO NO
     *           - customerItemNo / CUSTOMER ITEM NO
     *           - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL
     *           - odrCtrlNo / ORDER CONTROL NO
     * 
     * - Firm QTYチェック
     *     firmQty ＝ 0の場合、戻り値をtrue
     *     
     * - 輸出受注取得
     *     {@link TtExpRcvOdrCriteriaDomain}にafterの以下の項目を設定
     *       - rcvOdrCompCd/受注会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - etdDueDt/船積期限
     *       - customerPoNo/得意先PO NO
     *       - customerItemNo/得意先品目番号
     *     
     *     {@link TtExpRcvOdrService#searchByKey(TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 確定・内示数チェック
     *     - 新規データのチェック( beforeの以下のcustomerItemNo/得意先品目番号が""の場合)
     *         輸出受注取得結果{@link TtExpRcvOdrDomain}が存在しなけらば戻り値をtrue
     *         以外の場合、戻り値をfalse
     *         
     *     - 既存データのチェック(上記以外の場合)
     *         輸出受注取得結果{@link TtExpRcvOdrDomain}が、beforeの以下のキーに一致するデータのみの場合、戻り値をtrue
     *         以外の場合、戻り値をfalse
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
     * </pre>
     * 
     * @param firmQty Firm QTY
     * @param after Export-Receive-Order search-condition domain   ※The VALUE after screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain   ※The VALUE before screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @return This is true when Firm QTY is 0.
     *         If this is except the above and there is no data of relevance, they will be true, otherwise, false.
     *         <br />Firm QTYが0の場合、true
     *         上記以外で、該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public boolean validateDatabaseTtExpRcvOdrOnRegisterByFirmQty(BigDecimal firmQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException;
    
    /**
     * Perform decision and a Forecast-QTY check (an error is made when a firm order receipt exists in addition to the object record of amount of Forecast QTYs >0).
     * <br />確定・内示数チェック(内示数量>0での対象レコード以外に確定受注が存在する場合エラー)を行います。
     * <pre>
     * - Firm QTY check
     *       Forecast = in the case of 0, this is true about a return VALUE.
     *
     * - Export-Receive-Order acquisition
     *       The following items of after are set to {@link TtExpRcvOdrCriteriaDomain}.
     *         - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *         - customerCd / CUSTOMER CODE
     *         - lgcyShipTo / LEGACY SHIP TO
     *         - itemNo / ITEM NO
     *         - pkgCd / PACKAGE CODE
     *         - etdDueDt / ETD DUE DATE
     *         - customerPoNo / CUSTOMER PO NO
     *         - customerItemNo / CUSTOMER ITEM NO
     *
     *       This is a call about {@link TtExpRcvOdrService#searchByKey (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Decision and Forecast-QTY check
     *     - Check of new data (when the following customerItemNo/CUSTOMER ITEM NOs of before are "")
     *           an Export-Receive-Order acquisition result {@link TtExpRcvOdrDomain} exists -- returning, if it kicks -- a VALUE -- true
     *           In except, this is false about a return VALUE.
     *
     *     - Check of existing data (in the cases of other than the above)
     *           Only in the case of the data whose Export-Receive-Order acquisition result {@link TtExpRcvOdrDomain} corresponds with the following keys of before, this is true about a return VALUE.
     *           In except, this is false about a return VALUE.
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
     * - Firm QTYチェック
     *     Forecast ＝ 0の場合、戻り値をtrue
     *     
     * - 輸出受注取得
     *     {@link TtExpRcvOdrCriteriaDomain}にafterの以下の項目を設定
     *       - rcvOdrCompCd/受注会社コード
     *       - customerCd/得意先コード
     *       - lgcyShipTo/LEGACY送荷先
     *       - itemNo/品目番号
     *       - pkgCd/包装区分
     *       - etdDueDt/船積期限
     *       - customerPoNo/得意先PO NO
     *       - customerItemNo/得意先品目番号
     *     
     *     {@link TtExpRcvOdrService#searchByKey(TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 確定・内示数チェック
     *     - 新規データのチェック( beforeの以下のcustomerItemNo/得意先品目番号が""の場合)
     *         輸出受注取得結果{@link TtExpRcvOdrDomain}が存在しなけらば戻り値をtrue
     *         以外の場合、戻り値をfalse
     *         
     *     - 既存データのチェック(上記以外の場合)
     *         輸出受注取得結果{@link TtExpRcvOdrDomain}が、beforeの以下のキーに一致するデータのみの場合、戻り値をtrue
     *         以外の場合、戻り値をfalse
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
     * </pre>
     * 
     * @param forecastQty Forecast QTY
     * @param after Export-Receive-Order search-condition domain   The VALUE after * screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更後の値を保持
     * @param before Export-Receive-Order search-condition domain   The VALUE before * screen change is kept.<br />輸出受注検索条件ドメイン　※画面変更前の値を保持
     * @return Forecast This is true when Forecast QTY is 0.<br />
     *                  If this is except the above and there is no data of relevance, they will be true, otherwise, false.
     *         <br />QTYが0の場合、true<br />
     *         上記以外で、該当のデータがなければtrue、そうでなければfalse
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public boolean validateDatabaseTtExpRcvOdrOnRegisterByForecastQty(BigDecimal forecastQty,
        TtExpRcvOdrCriteriaDomain after, TtExpRcvOdrCriteriaDomain before)
        throws ApplicationException;
    
    /**
     * Call Web service "ECA0027_WS_B001:on-line ordering registration header check."
     * <br />Webサービス「ECA0027_WS_B001:オンライン受注登録ヘッダチェック」のコールを行います。
     * <pre>
     * - On-line ordering registration header check
     *     Each argument is made into an argument,
     *     Web service (WSB001){@link WsB001RestService#searchOdrEntryHdrOnHand(String, String, String, String, String, Date)}.
     * 
     * - オンライン受注登録ヘッダチェック
     *     各引数を引数にして、
     *     Webサービス(WSB001){@link WsB001RestService#searchOdrEntryHdrOnHand(String, String, String, String, String, Date)}を呼出
     * </pre>
     * 
     * @param rcvOdrCompCd RECEIVE ORDER COMPANY CODE<br />受注会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param itemNo ITEM NO<br />品目番号
     * @param pkgCd PACKAGE CODE<br />包装区分
     * @param etdDueDt ETD DUE DATE<br />船積期限
     * @param result ※Return VALUE<br />※戻り値
     * @return If an error does not occur in Web service (WSB001), they are true, otherwise, false.
     *         <br />Webサービス(WSB001)でエラーが発生しなければtrue、そうでなければfalse
     * @throws ApplicationException it does not expect by Web service (WSB001) -- the case where an error occurs
     *         <br />Webサービス(WSB001)で予期せぬエラーが発生した場合
     */
    public boolean validateDatabaseWsB001OnHeaderMoveToRegister(
        String rcvOdrCompCd, String customerCd, String lgcyShipTo, String itemNo, String pkgCd, Date etdDueDt, WsB001ResultDomain result)
        throws ApplicationException;
    
    /**
     * Call Web service "ECA0027_WS_B002:on-line ordering registration detailed check."
     * <br />Webサービス「ECA0027_WS_B002：オンライン受注登録明細チェック」のコールを行います。
     * <pre>
     * - On-line ordering registration detailed check
     *     Each argument is made into an argument and this is Web service (WSB002).
     *     {@link WsB002RestService#searchOdrEntryDtlOnHand(String, String, String, String, String, String, List, List, List)}.
     * 
     * - オンライン受注登録明細チェック
     *     各引数を引数にして、Webサービス(WSB002)
     *     {@link WsB002RestService#searchOdrEntryDtlOnHand(String, String, String, String, String, String, List, List, List)}を呼出
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param itemNo ITEM NO<br />品目番号
     * @param pkgCd PACKAGE CODE<br />包装区分
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param indexList Index list<br />インデックスリスト
     * @param etdDueDtList ETD-DUE-DATE list<br />船積期限リスト
     * @param customerItemNoList CUSTOMER-ITEM-NO list<br />得意先品目番号リスト
     * @param result ※Return VALUE<br />※戻り値
     * @return If an error does not occur in Web service (WSB002), they are true, otherwise, false.
     *         <br />Webサービス(WSB002)でエラーが発生しなければtrue、そうでなければfalse
     * @throws ApplicationException it does not expect by Web service (WSB002) -- the case where an error occurs
     *                              <br />Webサービス(WSB002)で予期せぬエラーが発生した場合
     */
    public boolean validateDatabaseWsB002OnMultiPoRegister(
        String compCd, String customerCd, String lgcyShipTo, String itemNo, String pkgCd, String trnsCd, 
        List<String> indexList, List<Date> etdDueDtList, List<String> customerItemNoList, WsB002ResultDomain result)
        throws ApplicationException;
    
    /**
     * Call Web service "ECA0027_WS_B002:on-line ordering registration detailed check."
     * <br />Webサービス「ECA0027_WS_B002：オンライン受注登録明細チェック」のコールを行います。
     * <pre>
     * - On-line ordering registration detailed check
     *     Each argument is made into an argument and this is Web service (WSB002).
     *     {@link WsB002RestService#searchOdrEntryDtlOnHand(String, String, String, String, String, String, List, List, List)}.
     * 
     * - オンライン受注登録明細チェック
     *     各引数を引数にして、Webサービス(WSB002)
     *     {@link WsB002RestService#searchOdrEntryDtlOnHand(String, String, String, String, String, String, List, List, List)}を呼出
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param itemNo ITEM NO<br />品目番号
     * @param pkgCd PACKAGE CODE<br />包装区分
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param indexList Index list<br />インデックスリスト
     * @param etdDueDtList ETD-DUE-DATE list<br />船積期限リスト
     * @param customerItemNoList CUSTOMER-ITEM-NO list<br />得意先品目番号リスト
     * @param result ※Return VALUE<br />※戻り値
     * @return If an error does not occur in Web service (WSB002), they are true, otherwise, false.
     *         <br />Webサービス(WSB002)でエラーが発生しなければtrue、そうでなければfalse
     * @throws ApplicationException it does not expect by Web service (WSB002) -- the case where an error occurs
     *                              <br />Webサービス(WSB002)で予期せぬエラーが発生した場合
     */
    public boolean validateDatabaseWsB002OnRegister(
        String compCd, String customerCd, String lgcyShipTo, String itemNo, String pkgCd, String trnsCd, 
        List<String> indexList, List<Date> etdDueDtList, List<String> customerItemNoList, WsB002ResultDomain result)
        throws ApplicationException;
    
    /**
     * Call Web service "ECA0027_WS_B003:EDI-Receive-Order end change header check."
     * <br />Webサービス「ECA0027_WS_B003：EDI受注末尾変更ヘッダチェック」のコールを行います。
     * <pre>
     * - EDI-Receive-Order end change header check
     *     Each argument is made into an argument and this is Web service (WSB003).
     *     {@link WsB003RestService#searchEdiOdrLastDigChgHdr(String, String, String, String, Date, String, String)}
     *     Call
     * 
     * - EDI受注末尾変更ヘッダチェック
     *     各引数を引数にして、Webサービス(WSB003)
     *     {@link WsB003RestService#searchEdiOdrLastDigChgHdr(String, String, String, String, Date, String, String)}
     *     を呼出
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param shippingDt SHIPPING DATE<br />出荷予定日
     * @param itemNoOrg ITEM NO ORIGINAL<br />品目番号オリジナル
     * @param pkgCd PACKAGE CODE<br />包装区分
     * @return The error code of Web service (WSB003)<br />Webサービス(WSB003)のエラーコード
     * @throws ApplicationException it does not expect by Web service (WSB003) -- the case where an error occurs<br />Webサービス(WSB003)で予期せぬエラーが発生した場合
     */
    public List<String> validateDatabaseWsB003OnLstDgtChgRegister(
        String compCd, String customerCd, String lgcyShipTo, String trnsCd, Date shippingDt, String itemNoOrg, String pkgCd)
        throws ApplicationException;
    
    /**
     * Call Web service "ECA0027_WS_B005:EDI-Receive-Order end change detailed check."
     * <br />Webサービス「ECA0027_WS_B005：EDI受注末尾変更明細チェック」のコールを行います。
     * <pre>
     * - EDI-Receive-Order end change detailed check
     *     Each argument is made into an argument and this is Web service (WSB005).
     *     {@link WsB005RestService#searchEdiOdrLastDigChgDtl(String, String, String, Date, List, List)}.
     *
     * - EDI受注末尾変更明細チェック
     *     各引数を引数にして、Webサービス(WSB005)
     *     {@link WsB005RestService#searchEdiOdrLastDigChgDtl(String, String, String, Date, List, List)}を呼出
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @param shippingDt SHIPPING DATE<br />出荷予定日
     * @param trnsCd TRANSPORT CODE<br />輸送手段コード
     * @param indexList Index list<br />インデックスリスト
     * @param itemNoList ITEM-NO list<br />品目番号リスト
     * @param result ※Return VALUE<br />※戻り値
     * @return This is a list of error codes by Web service (WSB005).<br />Webサービス(WSB005)でエラーコードのリスト
     * @throws ApplicationException it does not expect by Web service (WSB005) -- the case where an error occurs<br />Webサービス(WSB005)で予期せぬエラーが発生した場合
     */
    public List<String> validateDatabaseWsB005OnLstDgtChgRegister(String compCd, String customerCd, String lgcyShipTo, String trnsCd, Date shippingDt,
        List<String> indexList, List<String> itemNoList, WsB005ResultDomain result)
        throws ApplicationException;
    
    /**
     * Call Web service "an ECA0027_WS_B011:EDI base judging."
     * <br />Webサービス「ECA0027_WS_B011:EDI拠点判定」のコールを行います。
     * <pre>
     * - EDI base judging
     *     Each argument is made into an argument and this is Web service (WSB011).
     *     This is a call about {@link WsB011RestService#searchEdiSupport (String, String, String)}.
     * 
     * - EDI拠点判定
     *     各引数を引数にして、Webサービス(WSB011)
     *     {@link WsB011RestService#searchEdiSupport(String, String, String)}を呼出
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @return In with an error, this is empty when you have no setting and error of error CD (MSGID).<br />エラーありの場合、エラーCD(MSGID)を設定、エラーなしの場合、空
     * @throws ApplicationException it does not expect by Web service (WSB011) -- the case where an error occurs<br />Webサービス(WSB011)で予期せぬエラーが発生した場合
     */
    public List<String> validateDatabaseWsB011OnHeaderMoveToRegister(String compCd, String customerCd, String lgcyShipTo)
        throws ApplicationException;
    
    /**
     * Call Web service "an ECA0027_WS_B011:EDI base judging."
     * <br />Webサービス「ECA0027_WS_B011:EDI拠点判定」のコールを行います。
     * <pre>
     * - EDI base judging
     *     Each argument is made into an argument and this is Web service (WSB011).
     *     This is a call about {@link WsB011RestService#searchEdiSupport (String, String, String)}.
     * 
     * - EDI拠点判定
     *     各引数を引数にして、Webサービス(WSB011)
     *     {@link WsB011RestService#searchEdiSupport(String, String, String)}を呼出
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param customerCd CUSTOMER CODE<br />得意先コード
     * @param lgcyShipTo LEGACY SHIP TO<br />LEGACY送荷先
     * @return In with an error, this is empty when you have no setting and error of error CD (MSGID).<br />エラーありの場合、エラーCD(MSGID)を設定、エラーなしの場合、空
     * @throws ApplicationException it does not expect by Web service (WSB011) -- the case where an error occurs<br />Webサービス(WSB011)で予期せぬエラーが発生した場合
     */
    public List<String> validateDatabaseWsB011OnLstDgtChgMainSearch(String compCd, String customerCd, String lgcyShipTo)
        throws ApplicationException;
    
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    
    // --------------------------------- 検索系メソッド search -----------------------------------------------------------
    /**
     * Perform retrieval processing of an ordering search detailed screen.
     * <br />受注検索詳細画面の検索処理を行います。
     * <pre>
     * - Number-of-cases acquisition of an Export Receive Order
     *     criteria is made into an argument,
     *     This is a call about {@link WB001OdrRcvDao#searchCountTtExpRcvOdrByDetailInit (WB001OdrRcvCriteriaDomain)}.
     *
     * - Search of an Export Receive Order
     *     criteria is made into an argument,
     *     This is a call about {@link WB001OdrRcvDao#searchForPagingTtExpRcvOdrByDetailInit (WB001OdrRcvCriteriaDomain)}.
     *
     *     It sorts in following order.
     *       - ETD DUE DATE / ETD DUE DATE (ascending order)
     *       - CUSTOMER CODE / CUSTOMER CODE (ascending order)
     *       - CUSTOMER DUE DATE / CUSTOMER DUE DATE (ascending order)
     *       - CUSTOMER PO NO / CUSTOMER PO NO (ascending order)
     *       - SALES COMPANY PO NO / SALES COMPANY PO NO (ascending order)
     *
     * - Return of search results
     *     Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * 
     * - 輸出受注の件数取得
     *     criteriaを引数にして、
     *     {@link WB001OdrRcvDao#searchCountTtExpRcvOdrByDetailInit(WB001OdrRcvCriteriaDomain)}を呼出
     *     
     * - 輸出受注の検索
     *     criteriaを引数にして、
     *     {@link WB001OdrRcvDao#searchForPagingTtExpRcvOdrByDetailInit(WB001OdrRcvCriteriaDomain)}を呼出
     *     
     *     下記の順にソート
     *       - ETD DUE DATE/船積期限 (昇順)
     *       - CUSTOMER CODE/得意先コード (昇順)
     *       - CUSTOMER DUE DATE/顧客納期 (昇順)
     *       - CUSTOMER PO NO/得意先PO NO (昇順)
     *       - SALES COMPANY PO NO/販売会社PO NO (昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Customer Order Receiving domain<br />Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */ 
    public List<? extends WB001OdrRcvDomain> searchForPagingOnDetailInit(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing of a Last Digit Change Main Screen.
     * <br />品番末尾変更メイン画面の検索処理を行います。
     * <pre>
     * - Authority information is acquired (update authority).
     *     Approval ID:WB 001R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String...)}.
     *
     * - Number-of-cases acquisition of an Export Receive Order
     *     The above-mentioned authority information is set as {@link WB001OdrRcvCriteriaDomain},
     *     {@link WB001OdrRcvDao#searchCountTtExpRcvOdrByLstDgtChgMainSearch (WB001OdrRcvCriteriaDomain)} is called,
     *     The data which fulfills all the following conditions is acquired.
     *       - It corresponds to the conditions specified from the screen.
     *       - Shipper CD and a PLANT CODE correspond to the authority which a login user has.
     *
     * - Search of an Export Receive Order
     *     The above-mentioned search condition {@link WB001OdrRcvCriteriaDomain} is made into an argument,
     *     This is a call about {@link WB001OdrRcvDao#searchForPagingTtExpRcvOdrByLstDgtChgMainSearch(WB001OdrRcvCriteriaDomain)}.
     *     The data which fulfills all the following conditions is acquired.
     *       - It corresponds to the conditions specified from the screen.
     *       - This is contained in the specified page.
     *       - Shipper CD and a PLANT CODE correspond to the authority which a login user has.
     *
     *     It sorts in following order.
     *       - ITEM NO ORIGINAL / ITEM NO ORIGINAL (ascending order)  
     *       - PACKAGE CODE / PACKAGE CODE (ascending order)
     *       - CUSTOMER PO NO / CUSTOMER PO NO (ascending order)
     *       - ORDER CONTROL NO / ORDER CONTROL NO (ascending order)  
     *
     * - Return of search results
     *     Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * 
     * - 権限情報を取得(更新権限)
     *     認可ID:WB001Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - 輸出受注の件数取得
     *     {@link WB001OdrRcvCriteriaDomain}に上記の権限情報を設定し、
     *     {@link WB001OdrRcvDao#searchCountTtExpRcvOdrByLstDgtChgMainSearch(WB001OdrRcvCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当
     *     
     * - 輸出受注の検索
     *     上記の検索条件{@link WB001OdrRcvCriteriaDomain}を引数にして、
     *     {@link WB001OdrRcvDao#searchForPagingTtExpRcvOdrByLstDgtChgMainSearch(WB001OdrRcvCriteriaDomain)}を呼出
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *       - 指定されたページに含まれる
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当
     *     
     *     下記の順にソート
     *       - ITEM NO ORIGINAL/品目番号オリジナル (昇順)
     *       - PACKAGE CODE/包装区分 (昇順)
     *       - CUSTOMER PO NO/得意先PO NO (昇順)
     *       - ORDER CONTROL NO/オーダーコントロールNO (昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Customer Order Receiving domain<br />Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> searchForPagingOnLstDgtChgMainSearch(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing of an ordering search main screen.
     * <br />受注検索メイン画面の検索処理を行います。
     * <pre>
     * - Ordering company name acquisition
     *     The following items of criteria are set to compCd/COMPANY CODE of {@link TmNxsCompCriteriaDomain},
     *     This is a call about {@link TmNxsCompService#searchByKey (TmNxsCompCriteriaDomain)}.
     *       - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *
     * - ITEM-DESCRIPTION acquisition
     *     - CIGMA ADS acquisition
     *         The following is made into an argument and this is the call} about {@link CommonService#searchCigmaAds(String)}.
     *           - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *
     *     - Export-Formality-Item-No-Master search
     *         The following items of criteria are set to {@link TmExpFormalitiItemNoCriteriaDomain},
     *         This is a call about {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}.
     *           - compCd / COMPANY CODE: rcvOdrCompCd/RECEIVE ORDER COMPANY CODE
     *           - itemNo / ITEM NO: itemNo/ITEM NO
     *           - aplyStrtDt / APPLY START DATE: This is smaller than the result of the above-mentioned CIGMA ADS acquisition {@link CommonService#searchCigmaAds (String)}.
     *
     *         Sort order
     *           - APPLY START DATE / APPLY START DATE (descending order)
     *
     *         The 1st affair is acquired by a paging function.
     *
     * - Authority information is acquired (reference authority).
     *     Approval ID:WB 001B is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String...)}.
     *
     * - Authority information is acquired (update authority).
     *     Approval ID:WB 001R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList (String...)}.
     *
     * - Number-of-cases acquisition of an Export Receive Order
     *     The above-mentioned authority information is set as {@link WB001OdrRcvCriteriaDomain},
     *     {@link WB001OdrRcvDao#searchCountTtExpRcvOdrByMainSearch (WB001OdrRcvCriteriaDomain)} is called,
     *     The data which fulfills all the following conditions is acquired.
     *       - It corresponds to the conditions specified from the screen.
     *       - Shipper CD and a PLANT CODE correspond to the authority which a login user has.
     *
     * - Search of an Export Receive Order
     *     The above-mentioned search condition {@link WB001OdrRcvCriteriaDomain} is made into an argument,
     *     This is a call about {@link WB001OdrRcvDao#searchForPagingTtExpRcvOdrByMainSearch (WB001OdrRcvCriteriaDomain)}.
     *     The data which fulfills all the following conditions is acquired.
     *       - It corresponds to the conditions specified from the screen.
     *       - This is contained in the specified page.
     *       - Shipper CD and a PLANT CODE correspond to the authority which a login user has.
     *
     *     It sorts in following order.
     *       - CUSTOMER CODE / CUSTOMER CODE (ascending order)
     *       - LEGACY SHIP TO / LEGACY SHIP TO (ascending order)
     *       - TRANSPORT CODE / TRANSPORT CODE (ascending order)
     *
     * - Return of search results
     *     Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * 
     * - 受注会社名称取得
     *     {@link TmNxsCompCriteriaDomain}のcompCd/会社コードにcriteriaの以下の項目を設定し、
     *     {@link TmNxsCompService#searchByKey(TmNxsCompCriteriaDomain)}を呼出
     *       - rcvOdrCompCd/受注会社コード
     *       
     * - 品目名称取得
     *     - CIGMA ADS取得
     *         以下を引数にして、{@link CommonService#searchCigmaAds(String)}を呼出}
     *           - rcvOdrCompCd/受注会社コード
     *           
     *     - 輸出手続品目番号原単位検索
     *         {@link TmExpFormalitiItemNoCriteriaDomain}にcriteriaの以下の項目を設定し、
     *         {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *           - compCd/会社コード:rcvOdrCompCd/受注会社コード
     *           - itemNo/品目番号:itemNo/品目番号
     *           - aplyStrtDt/適用開始日:上記のCIGMA ADS取得{@link CommonService#searchCigmaAds(String)}の結果より小さい
     *           
     *         ソート順
     *           - APPLY START DATE/適用開始日 (降順)
     *           
     *         paging機能で1件目を取得
     *       
     * - 権限情報を取得(参照権限)
     *     認可ID:WB001Bを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:WB001Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出し
     *     
     * - 輸出受注の件数取得
     *     {@link WB001OdrRcvCriteriaDomain}に上記の権限情報を設定し、
     *     {@link WB001OdrRcvDao#searchCountTtExpRcvOdrByMainSearch(WB001OdrRcvCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当
     *     
     * - 輸出受注の検索
     *     上記の検索条件{@link WB001OdrRcvCriteriaDomain}を引数にして、
     *     {@link WB001OdrRcvDao#searchForPagingTtExpRcvOdrByMainSearch(WB001OdrRcvCriteriaDomain)}を呼出し
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *       - 指定されたページに含まれる
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当
     *     
     *     下記の順にソート
     *       - CUSTOMER CODE/得意先コード (昇順)
     *       - LEGACY SHIP TO/LEGACY送荷先 (昇順)
     *       - TRANSPORT CODE/輸送手段コード (昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Customer Customer Order Receiving domain<br />Order Receivingドメイン
     * @throws ApplicationException When a NEXUS Company Master, an Export Formality Item No Master, and an Export Receive Order cannot be referred to
     *                              <br />NEXUS会社原単位、輸出手続品目番号原単位、輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> searchForPagingOnMainSearch(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform initial processing of an ordering registration header screen.
     * <br />受注登録ヘッダー画面の初期処理を行います。
     * <pre>
     * - CIGMA ADS acquisition
     *     The following of criteria is made into an argument and this is the call} about {@link CommonService#searchCigmaAds(String)}.
     *       - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     * 
     * - CIGMA ADS取得
     *     criteriaの以下を引数にして、{@link CommonService#searchCigmaAds(String)}を呼出}
     *       - rcvOdrCompCd/受注会社コード
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return WB001OdrRcvDomain
     * @throws ApplicationException When an error unexpected by CommonSerivce occurs<br />CommonSerivceで予期せぬエラーが発生した場合
     */
    public WB001OdrRcvDomain searchOnHeaderInit(WB001OdrRcvCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Perform retrieval processing of an ordering search main screen.
     * <br />受注検索メイン画面の検索処理を行います。
     * <pre>
     * - CIGMA ADS acquisition
     *     The following of criteria is made into an argument and this is the call} about {@link CommonService#searchCigmaAds(String)}.
     *       - rcvOdrCompCd / RECEIVE ORDER COMPANY CODE
     *
     * - Search [ of an Export Receive Order and an Export Shipping Item No Special Information Master ]  *1
     *     {@link WB001OdrRcvCriteriaDomain} is set to criteria based on the above-mentioned CIGMA ADS acquisition {@link CommonService#searchCigmaAds (String)}.
     *     {@link WB001OdrRcvDao#searchTtExpRcvOdrByLstDgtChgRegisterInit (WB001OdrRcvCriteriaDomain)} is called,
     *     The data which fulfills all the following conditions is acquired.
     *       - It corresponds to the conditions specified from the screen.
     *
     *     It sorts in following order.
     *       - ITEM NO / ITEM NO (ascending order)
     *
     * - A non last digit is in agreement and it searches the ITEM NO in which the order received existed in the past one month.   *2
     *     - Search of an Export Receive Order and an Export Shipping Item No Special Information Master
     *         {@link WB001OdrRcvCriteriaDomain} is set to criteria based on the above-mentioned CIGMA ADS acquisition {@link CommonService#searchCigmaAds (String)}.
     *         {@link WB001OdrRcvDao#searchTtExpRcvOdrByLstDgtChgRegisterInitPost(WB001OdrRcvCriteriaDomain)} is called,
     *         The data which fulfills all the following conditions is acquired.
     *           - It corresponds to the conditions specified from the screen.
     *
     *         It sorts in following order.
     *           - ITEM NO / ITEM NO (ascending order)  
     * - A non last digit is in agreement and it searches an ITEM NO in stock.   *3
     *     Call of - Web service "ECA0027_WS_B004:EDI-Receive-Order end change candidate acquisition"
     *         itemNoOrg/ITEM NO ORIGINAL of criteria are made into an argument,
     *         This is a call about Web service (WSB004) {@link WsB004RestService#searchEdiOdrLastDigChgCandidate (String, String)}.
     *
     *     - Search of an Export Shipping Item No Special Information Master
     *         The following items are set to {@link TmExpItemNoSpInfoCriteriaDomain},
     *         {@link TmExpItemNoSpInfoService#searchByKey (TmExpItemNoSpInfoCriteriaDomain)} is called,
     *           - compCd / COMPANY CODE: rcvOdrCompCd/RECEIVE ORDER COMPANY CODE of criteria
     *           - itemNo / ITEM NO: partItem as a result of Web service (WSB004)
     *           - pkgCd / PACKAGE CODE: pkgCd/PACKAGE CODE of criteria
     *           - customerCd / CUSTOMER CODE: customerCd/CUSTOMER CODE of criteria
     *           - lgcyShipTo / LEGACY SHIP TO: lgcyShipTo/LEGACY SHIP TO of criteria
     *           - aplyStrtDt / APPLY START DATE: etdDueDt/ETD DUE DATE of the result of above-mentioned *1
     *
     * - Return of search results
     *     Except for duplication for the result of *1 to *3
     *     Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * 
     * - CIGMA ADS取得
     *     criteriaの以下を引数にして、{@link CommonService#searchCigmaAds(String)}を呼出}
     *       - rcvOdrCompCd/受注会社コード
     *       
     * - 輸出受注、輸出出荷品目番号原単位の検索 ※１
     *     criteriaと上記のCIGMA ADS取得{@link CommonService#searchCigmaAds(String)}を元に{@link WB001OdrRcvCriteriaDomain}を設定
     *     {@link WB001OdrRcvDao#searchTtExpRcvOdrByLstDgtChgRegisterInit(WB001OdrRcvCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *     
     *     下記の順にソート
     *       - ITEM NO/品目番号 (昇順)
     *       
     * - 品番末尾以外が一致し、過去1ヶ月間に受注が存在する品目番号を検索 ※2
     *     - 輸出受注、輸出出荷品目番号原単位の検索
     *         criteriaと上記のCIGMA ADS取得{@link CommonService#searchCigmaAds(String)}を元に{@link WB001OdrRcvCriteriaDomain}を設定
     *         {@link WB001OdrRcvDao#searchTtExpRcvOdrByLstDgtChgRegisterInitPost(WB001OdrRcvCriteriaDomain)}を呼出し、
     *         下記の条件をすべて満たすデータを取得
     *           - 画面から指定された条件に該当
     *           
     *         下記の順にソート
     *           - ITEM NO/品目番号 (昇順)
     * - 品番末尾以外が一致し、在庫がある品目番号を検索 ※3
     *     - Webサービス「ECA0027_WS_B004：EDI受注末尾変更候補取得」のコール
     *         criteriaのitemNoOrg/品目番号オリジナルを引数にして、
     *         Webサービス(WSB004){@link WsB004RestService#searchEdiOdrLastDigChgCandidate(String, String)}を呼出
     *         
     *     - 輸出出荷品目番号原単位の検索
     *         {@link TmExpItemNoSpInfoCriteriaDomain}に以下の項目を設定し、
     *         {@link TmExpItemNoSpInfoService#searchByKey(TmExpItemNoSpInfoCriteriaDomain)}を呼出し、
     *           - compCd/会社コード:criteriaのrcvOdrCompCd/受注会社コード
     *           - itemNo/品目番号:Webサービス(WSB004)の結果のpartItem
     *           - pkgCd/包装区分:criteriaのpkgCd/包装区分
     *           - customerCd/得意先コード:criteriaのcustomerCd/得意先コード
     *           - lgcyShipTo/LEGACY送荷先:criteriaのlgcyShipTo/LEGACY送荷先
     *           - aplyStrtDt/適用開始日:上記※１の結果のetdDueDt/船積期限
     *     
     * - 検索結果の返却
     *     ※1から※3の結果を重複を除く
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param odrRcv Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @return Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order and an Export Shipping Item No Special Information Master cannot be referred to
     *                              <br />輸出受注、輸出出荷品目番号原単位が参照できない場合
     */
    public WB001OdrRcvDomain searchOnLstDgtChgRegisterInit(WB001OdrRcvDomain odrRcv)
        throws ApplicationException;
    
    /**
     * Perform initial processing of an ordering registration picture screen.
     * <br />受注登録画面画面の初期処理を行います。
     * <pre>
     * - Search of an Export Receive Order
     *     criteria is made into an argument,
     *     {@link WB001OdrRcvDao#searchTtExpRcvOdrByRegisterInit(WB001OdrRcvDomain)} is called,
     *     The data which fulfills all the following conditions is acquired.
     *       - It corresponds to the conditions specified from the screen.
     *
     *     It sorts in following order.
     *       - ETD DUE DATE / ETD DUE DATE (ascending order)
     *
     * - Combination of data
     *     Export-Receive-Order information retrieval result of Session (WB001. operating-days information) (operating-days information area of *criteria) and the above [ object / for screen display ]
     *     It joins together by date, and etdDueDt/ETD DUE DATE, and creates a registered ordering information arrangement result.
     *
     * - Return of search results
     *     Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * 
     * - 輸出受注の検索
     *     criteriaを引数にして、
     *     {@link WB001OdrRcvDao#searchTtExpRcvOdrByRegisterInit(WB001OdrRcvDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *     
     *     下記の順にソート
     *       - ETD DUE DATE/船積期限 (昇順)
     *       
     * - データの結合
     *     画面表示用にSession(WB001.稼働日情報)(※criteriaの稼働日情報エリア)と上記の輸出受注情報検索結果を
     *     dateとetdDueDt/船積期限で結合し、登録済み受注情報配置結果を作成
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param odrRcv Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @return Customer Customer Order Receiving domain<br />Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public WB001OdrRcvDomain searchOnRegisterInit(WB001OdrRcvDomain odrRcv)
        throws ApplicationException;
    
    /**
     * Perform initial processing of ordering two or moreP / O registration picture.
     * <br />受注複数P/O登録画面の初期処理を行います。
     * <pre>
     * - Search of an Export Receive Order
     *     {@link TtExpRcvOdrCriteriaDomain} is set up based on odrRcv,
     *     {@link TtExpRcvOdrService#searchByCondition (TtExpRcvOdrCriteriaDomain)} is called,
     *     The data which fulfills all the following conditions is acquired.
     *       - It corresponds to the conditions specified from the screen.
     *
     *     It sorts in following order.
     *       - CUSTOMER DUE DATE / CUSTOMER DUE DATE (ascending order)
     *       - CUSTOMER ITEM NO / CUSTOMER ITEM NO (ascending order)
     *       - CUSTOMER PO NO / CUSTOMER PO NO (ascending order)
     *
     * - Return of search results
     *     Search results are returned by the list of {@link WB001OdrRcvDomain}.
     * 
     * - 輸出受注の検索
     *     odrRcvを元に、{@link TtExpRcvOdrCriteriaDomain}を設定し、
     *     {@link TtExpRcvOdrService#searchByCondition(TtExpRcvOdrCriteriaDomain)}を呼出し、
     *     下記の条件をすべて満たすデータを取得
     *       - 画面から指定された条件に該当
     *     
     *     下記の順にソート
     *       - CUSTOMER DUE DATE/顧客納期 (昇順)
     *       - CUSTOMER ITEM NO/得意先品目番号 (昇順)
     *       - CUSTOMER PO NO/得意先PO NO (昇順)
     *     
     * - 検索結果の返却
     *     検索結果を{@link WB001OdrRcvDomain}のリストで返却
     * </pre>
     * 
     * @param odrRcv Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @return Customer Order Customer Order Receiving domain<br />Receivingドメイン
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB001OdrRcvDomain> serchOnMultiPoRegister(WB001OdrRcvDomain odrRcv)
        throws ApplicationException;

    // --------------------------------- 更新系メソッド update -----------------------------------------------------------
    
    // --------------------------------- 削除系メソッド delete -----------------------------------------------------------
    
    // -------------------------------- トランザクション系メソッド transact ----------------------------------------------
    /**
     * Perform Export-Receive-Order registration registration / update / delete process, and the call of Web service "ECA0027_WS_B007:direct delivery ordering reflection."
     * <br />輸出受注登録登録/更新/削除処理、及び、Webサービス「ECA0027_WS_B007：直納受注反映」のコールを行います。
     * <pre>
     * - Perform repetition processing to the line of odrQty/ORDER-QUANTITY <> odrQtyHidden / ORDER QUANTITY.
     *
     * - Lock of an Export Receive Order
     *     The same clause eye of odrRcvList is set to {@link TtExpRcvOdrCriteriaDomain},
     *     This is a call about {@link TtExpRcvOdrService#lockByKeyNoWait(TtExpRcvOdrCriteriaDomain)}.
     *
     * - Update judging
     *     It registers, when {@link TtExpRcvOdrDomain of the above-mentioned result} is zero affair.
     *     In the case of odrQty/ORDER-QUANTITY <> 0, it updates except.
     *     In except, it deletes.
     *
     * - Registration of an Export Receive Order
     *     The following items are set to {@link TtExpRcvOdrDomain} and this is a call about {@link TtExpRcvOdrService#create (TtExpRcvOdrDomain)}.
     *       - Property of odrRcvList {@link WB001OdrRcvDomain}
     *       - pltzAllocQty / Alloc QTY: Zero
     *       - shippedQty / SHIPPED QUANTITY: Zero
     *       - partialDelivCnt / PARTIAL DELIVERY COUNT: Zero
     *       - odrFirmFlg / ORDER FIRM FLAG: "Y" (decision)
     *       - lastFigureChgFlg / LAST FIGURE CHG FLAG: "Y" (end change)
     *       - shippedTyp / SHIPPED TYPE: "1": PKG un-completing.
     *       - plntCd / PLANT CODE: ECAof odrRcvList0027_WS_B005 result is plantCodeLegacy of area.
     *
     * - Update of an Export Receive Order
     *     The following items are set to {@link TtExpRcvOdrDomain}.
     *       - customerItemNo / CUSTOMER ITEM NO: ECAof odrRcvList0027_WS_B005 result is customerPartNo of area.
     *       - odrQty / ORDER QUANTITY: odrQty of odrRcvList
     *       - odrFirmFlg / ORDER FIRM FLAG: "Y" (change)
     *       - shippedTyp / SHIPPED TYPE:
     *           pltzAllocQty/Alloc QTY of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.
     *             When smaller than odrQty of odrRcvList, this is "1" (PKG un-completing).
     *             When equal to odrQty of odrRcvList, this is "2" (finishing of a PKG).
     *           shippedQty/SHIPPED QUANTITY of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.
     *             When equal to odrQty of odrRcvList, this is "3" (finishing of shipment).
     *
     *     The following items are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - key item: odrRcvList
     *       - comUpdateTimestamp / update date: odrRcvList
     *
     *     This is a call about {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}.
     *
     * - Delete of an Export Receive Order
     *     The following items are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - key item: odrRcvList
     *       - comUpdateTimestamp / update date: odrRcvList
     *
     *     This is a call about {@link TtExpRcvOdrService#delete (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Update of an ITEM DESCRIPTION of an Export Formality Item No Master
     *     - APPLY-START-DATE acquisition of an Export Formality Item No Master
     *       The latest APPLY START DATE is acquired etdDueDt / before [ the ETD DUE DATE of {@link TtExpRcvOdrDomain} ] as a result of the lock of the above-mentioned Export Receive Order.
     *         The following items of odrRcvList are set to {@link TmExpFormalitiItemNoCriteriaDomain},
     *         This is a call about {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}.
     *           - compCd / COMPANY CODE: rcvOdrCompCd/RECEIVE ORDER COMPANY CODE
     *           - itemNo / ITEM NO: Same clause eye
     *           - aplyStrtDt / APPLY START DATE: This is the following from etdDueDt/ETD DUE DATE of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.
     *
     *         Sort order
     *           - APPLY START DATE / APPLY START DATE (descending order)
     *
     *         The 1st affair is acquired by a paging function.
     *
     *     - Lock of an Export Formality Item No Master
     *         The following items of odrRcvList are set to {@link TmExpFormalitiItemNoCriteriaDomain},
     *         This is a call about {@link TmExpFormalitiItemNoService#lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain)}.
     *           - compCd / COMPANY CODE: rcvOdrCompCd/RECEIVE ORDER COMPANY CODE
     *           - itemNo / ITEM NO: Same clause eye
     *           - aplyStrtDt / APPLY START DATE: They are aplyStrtDt/APPLY START DATE of {@link TmExpFormalitiItemNoDomain} as a result of APPLY-START-DATE acquisition of the above-mentioned Export Formality Item No Master.
     *
     *     - Update of an Export Formality Item No Master
     *         The above-mentioned result is itemDescription/ITEM DESCRIPTION of {@link TmExpFormalitiItemNoDomain}.
     *         It carries out, only when partName of area is [ ECAof odrRcvList0027_WS_B005 result ] different.
     *
     *         The following items are set to {@link TmExpFormalitiItemNoDomain}.
     *           - itemDescription / ITEM DESCRIPTION: ECAof odrRcvList0027_WS_B005 result is partName of area.
     *
     *         The following items are set to {@link TmExpFormalitiItemNoCriteriaDomain}.
     *           - key item: This is {@link TmExpFormalitiItemNoDomain} as a result of the lock of the above-mentioned Export Formality Item No Master.
     *
     *         This is a call about {@link TmExpFormalitiItemNoService#updateByCondition(TmExpFormalitiItemNoDomain, TmExpFormalitiItemNoCriteriaDomain)}.
     *
     * - CIGMA direct delivery ordering reflection
     *     Call of - Web service "ECA0027_WS_B007:direct delivery ordering reflection"
     *         {@link WB001OdrRcvDomain} set to rcvOdrCompCd/RECEIVE ORDER COMPANY CODE of odrRcvList based on odrRcvList is made into an argument,
     *         The following calls are performed according to the result of the above-mentioned update judging.
     *
     *           This is a call about Web service (WSB007) {@link WsB007RestService#reflectToCusOdr(String, WsB007ParamDomain)}.
     *
     * - Re retrieval of a screen (at the time [ Multiple-p/n-packaged-in-box Create screen ] of changes)
     *     This is a call about {@link WB001OdrRcvService#searchOnLstDgtChgRegisterInit (WB001OdrRcvDomain)}.
     * 
     * - odrQty/注文数量 <> odrQtyHidden/注文数量の行に対し、繰り返し処理を行う
     * 
     * - 輸出受注のロック
     *     {@link TtExpRcvOdrCriteriaDomain}にodrRcvListの同項目を設定し、
     *     {@link TtExpRcvOdrService#lockByKeyNoWait(TtExpRcvOdrCriteriaDomain)}を呼出
     * 
     * - 更新判定
     *     上記の結果{@link TtExpRcvOdrDomain}が0件の場合、登録
     *     以外で、odrQty/注文数量 <> 0の場合、更新
     *     以外の場合、削除
     *     
     * - 輸出受注の登録
     *     {@link TtExpRcvOdrDomain}に以下の項目を設定し、{@link TtExpRcvOdrService#create(TtExpRcvOdrDomain)}を呼出
     *       - odrRcvList{@link WB001OdrRcvDomain}のプロパティ
     *       - pltzAllocQty/梱包引当数量:0
     *       - shippedQty/出荷数量:0
     *       - partialDelivCnt/分納回数:0
     *       - odrFirmFlg/受注確定フラグ:"Y"(確定)
     *       - lastFigureChgFlg/設変振替フラグ:"Y"(末尾変更)
     *       - shippedTyp/出荷済み区分:"1":梱包未完了
     *       - plntCd/製造部工場区分:odrRcvListのECA0027_WS_B005結果エリアのplantCodeLegacy
     *       
     * - 輸出受注の更新
     *     {@link TtExpRcvOdrDomain}に以下の項目を設定
     *       - customerItemNo/得意先品目番号:odrRcvListのECA0027_WS_B005結果エリアのcustomerPartNo
     *       - odrQty/注文数量:odrRcvListのodrQty
     *       - odrFirmFlg/受注確定フラグ:"Y"(振替)
     *       - shippedTyp/出荷済み区分:
     *           上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のpltzAllocQty/梱包引当数量が
     *             odrRcvListのodrQtyより小さい場合、"1"(梱包未完了)
     *             odrRcvListのodrQtyと等しい場合、"2"(梱包済み)
     *           上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のshippedQty/出荷数量が
     *             odrRcvListのodrQtyと等しい場合、"3"(出荷済み)
     *             
     *     {@link TtExpRcvOdrCriteriaDomain}に以下の項目を設定
     *       - キー項目:odrRcvList
     *       - comUpdateTimestamp/更新日時:odrRcvList
     *     
     *     {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 輸出受注の削除
     *     {@link TtExpRcvOdrCriteriaDomain}に以下の項目を設定
     *       - キー項目:odrRcvList
     *       - comUpdateTimestamp/更新日時:odrRcvList
     *     
     *     {@link TtExpRcvOdrService#delete(TtExpRcvOdrCriteriaDomain)}を呼出
     * 
     * - 輸出手続品目番号原単位の品目名称更新
     *     - 輸出手続品目番号原単位の適用開始日取得
     *       上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のetdDueDt/船積期限以前で直近の適用開始日を取得
     *         {@link TmExpFormalitiItemNoCriteriaDomain}にodrRcvListの以下の項目を設定し、
     *         {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *           - compCd/会社コード:rcvOdrCompCd/受注会社コード
     *           - itemNo/品目番号:同項目
     *           - aplyStrtDt/適用開始日:上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のetdDueDt/船積期限より以下
     *         
     *         ソート順
     *           - APPLY START DATE/適用開始日 (降順)
     *         
     *         paging機能で1件目を取得
     *         
     *     - 輸出手続品目番号原単位のロック
     *         {@link TmExpFormalitiItemNoCriteriaDomain}にodrRcvListの以下の項目を設定し、
     *         {@link TmExpFormalitiItemNoService#lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *           - compCd/会社コード:rcvOdrCompCd/受注会社コード
     *           - itemNo/品目番号:同項目
     *           - aplyStrtDt/適用開始日:上記の輸出手続品目番号原単位の適用開始日取得の結果{@link TmExpFormalitiItemNoDomain}のaplyStrtDt/適用開始日
     *           
     *     - 輸出手続品目番号原単位の更新
     *         上記の結果{@link TmExpFormalitiItemNoDomain}のitemDescription/品目名称と
     *         odrRcvListのECA0027_WS_B005結果エリアのpartNameが相違している場合のみ実施
     *         
     *         {@link TmExpFormalitiItemNoDomain}に以下の項目を設定
     *           - itemDescription/品目名称:odrRcvListのECA0027_WS_B005結果エリアのpartName
     *           
     *         {@link TmExpFormalitiItemNoCriteriaDomain}に以下の項目を設定
     *           - キー項目:上記の輸出手続品目番号原単位のロックの結果{@link TmExpFormalitiItemNoDomain}
     *           
     *         {@link TmExpFormalitiItemNoService#updateByCondition(TmExpFormalitiItemNoDomain, TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *         
     * - CIGMA直納受注反映
     *     - Webサービス「ECA0027_WS_B007：直納受注反映」のコール
     *         odrRcvListのrcvOdrCompCd/受注会社コードとodrRcvListを元に設定した{@link WB001OdrRcvDomain}を引数にして、
     *         上記の更新判定の結果に応じて以下の呼出を行う。
     *         
     *           Webサービス(WSB007){@link WsB007RestService#reflectToCusOdr(String, WsB007ParamDomain)}を呼出
     * 
     * - 画面の再検索(小箱内多品番梱包Create画面より遷移時)
     *     {@link WB001OdrRcvService#searchOnLstDgtChgRegisterInit(WB001OdrRcvDomain)}を呼出
     * </pre>
     * 
     * @param odrRcv Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @return Customer Customer Order Receiving domain<br />Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order, an Export Formality Item No Master, and CIGMA cannot be accessed
     *                              <br />輸出受注、輸出手続品目番号原単位、CIGMAにアクセスできない場合
     */
    public WB001OdrRcvDomain transactOnLstDgtChgRegister(WB001OdrRcvDomain odrRcv)
        throws ApplicationException;
    
    /**
     * Perform Export-Receive-Order registration registration / update / delete process, and the call of Web service "ECA0027_WS_B007:direct delivery ordering reflection."
     * <br />輸出受注登録登録/更新/削除処理、及び、Webサービス「ECA0027_WS_B007：直納受注反映」のコールを行います。
     * <pre>
     * - Premise
     *     It narrows down by FasadeService and the following is ending.
     *     Repetition processing is performed to the line as which Check is chosen.
     *
     * - Update judging
     *     It registers, when customerPoNoHidden/CUSTOMER PO NO of odrRcvList are "."
     *     This is except the above and, in the case of firmQty/firm order QUANTITY <> 0, or forecastQty/prospective ORDER-QUANTITY <> 0, updates.
     *     In except, it deletes.
     *
     * - Registration of an Export Receive Order
     *     The following items are set to {@link TtExpRcvOdrDomain} and this is a call about {@link TtExpRcvOdrService#create (TtExpRcvOdrDomain)}.
     *       Property of - odrRcvList {@link WB001OdrRcvDomain}
     *       - odrCtrlNo / ORDER CONTROL NO: Zero
     *       - revisionNo / REVISION NO: Zero
     *       - revisionNoEis / REVISION NO FOR EIS: Zero
     *       - odrQtyOrg / ORDER QUANTITY ORIGINAL: When firmQty / firm order QUANTITY of odrRcvList are larger than 0, they are firmQty / firm order QUANTITY.
     *                                       When forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0, they are forecastQty / prospective ORDER QUANTITY.
     *       - odrQty / ORDER QUANTITY: When firmQty / firm order QUANTITY of odrRcvList are larger than 0, they are firmQty / firm order QUANTITY.
     *                          When forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0, they are forecastQty / prospective ORDER QUANTITY.
     *       - pltzAllocQty / Alloc QTY: Zero
     *       - shippedQty / SHIPPED QUANTITY: Zero
     *       - shippingDt / SHIPPING DATE: ECAof odrRcvList0027_WS_B002 result is a ship date of area.
     *       - partialDelivCnt / PARTIAL DELIVERY COUNT: Zero
     *       - odrFirmFlg / ORDER FIRM FLAG: This is "Y" (decision) when firmQty / firm order QUANTITY of odrRcvList are larger than 0.
     *                          This is "N" (hope) when forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0.
     *       - lastFigureChgFlg / LAST FIGURE CHG FLAG: "N" (ITEM NO ORIGINAL)
     *       - supplierCd / SUPPLIER CODE: ECAof odrRcvList0027_WS_B002 result is a SUPPLIER CODE of area.
     *       - shippedTyp / SHIPPED TYPE: "1": PKG un-completing.
     *
     * - Lock of an Export Receive Order
     *     The same clause eye of odrRcvList is set to {@link TtExpRcvOdrCriteriaDomain},
     *     This is a call about {@link TtExpRcvOdrService#lockByKeyNoWait (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Update of an Export Receive Order
     *     The item below odrRcvList is set to {@link TtExpRcvOdrDomain}.
     *       - customerPoNo / CUSTOMER PO NO: customerPoNo/CUSTOMER PO NO
     *       - customerItemNo / CUSTOMER ITEM NO: customerItemNo/CUSTOMER ITEM NO
     *       - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL: customerItemNoOrg/CUSTOMER ITEM NO ORIGINAL
     *       - customerDueDt / CUSTOMER DUE DATE: customerDueDt/CUSTOMER DUE DATE
     *       - odrQty / ORDER QUANTITY: When firmQty / firm order QUANTITY of odrRcvList are larger than 0, they are firmQty / firm order QUANTITY.
     *                          When forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0, they are forecastQty / prospective ORDER QUANTITY.
     *       - shippingDt / SHIPPING DATE: They are pltzAllocQty/Alloc QTY of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.   = 0
     *                                and shippedQty/SHIPPED QUANTITY -- the case of = 0 -- ECAof odrRcvList0027_WS_B002 result -- ship date of area [   ]
     *       - odrFirmFlg / ORDER FIRM FLAG: This is "Y" (decision) when firmQty / firm order QUANTITY of odrRcvList are larger than 0.
     *                                    This is "N" (hope) when forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0.
     *       - salesCompPoNo / SALES COMPANY PO NO: salesCompPoNo/SALES COMPANY PO NO
     *       - shippedTyp / SHIPPED TYPE:
     *           pltzAllocQty/Alloc QTY of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.
     *             When smaller than odrQty of odrRcvList, this is "1" (PKG un-completing).
     *             When equal to odrQty of odrRcvList, this is "2" (finishing of a PKG).
     *           shippedQty/SHIPPED QUANTITY of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.
     *             When equal to odrQty of odrRcvList, this is "3" (finishing of shipment).
     *
     *     The following items are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - key item: odrRcvList
     *       - comUpdateTimestamp / update date: odrRcvList
     *
     *     This is a call about {@link TtExpRcvOdrService#updateByCondition (TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}.
     *
     * - Delete of an Export Receive Order
     *     The following items are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - key item: odrRcvList
     *       - comUpdateTimestamp / update date: odrRcvList
     *
     *     This is a call about {@link TtExpRcvOdrService#delete (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Update of an ITEM DESCRIPTION of an Export Formality Item No Master
     *     - APPLY-START-DATE acquisition of an Export Formality Item No Master
     *       The latest APPLY START DATE is acquired etdDueDt / before [ the ETD DUE DATE of {@link TtExpRcvOdrDomain} ] as a result of the lock of the above-mentioned Export Receive Order.
     *         The following items of odrRcvList are set to {@link TmExpFormalitiItemNoCriteriaDomain},
     *         This is a call about {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}.
     *           - compCd / COMPANY CODE: rcvOdrCompCd/RECEIVE ORDER COMPANY CODE
     *           - itemNo / ITEM NO: Same clause eye
     *           - aplyStrtDt / APPLY START DATE: This is the following from etdDueDt/ETD DUE DATE of odrRcvList.
     *
     *         Sort order
     *           - APPLY START DATE / APPLY START DATE (descending order)
     *
     *         The 1st affair is acquired by a paging function.
     *
     *     - Lock of an Export Formality Item No Master
     *         The following items of odrRcvList are set to {@link TmExpFormalitiItemNoCriteriaDomain},
     *         This is a call about {@link TmExpFormalitiItemNoService#lockByKeyNoWait (TmExpFormalitiItemNoCriteriaDomain)}.
     *           - compCd / COMPANY CODE: rcvOdrCompCd/RECEIVE ORDER COMPANY CODE
     *           - itemNo / ITEM NO: Same clause eye
     *           - aplyStrtDt / APPLY START DATE: They are aplyStrtDt/APPLY START DATE of {@link TmExpFormalitiItemNoDomain} as a result of APPLY-START-DATE acquisition of the above-mentioned Export Formality Item No Master.
     *
     *     - Update of an Export Formality Item No Master
     *         The above-mentioned result is itemDescription/ITEM DESCRIPTION of {@link TmExpFormalitiItemNoDomain}.
     *         It carries out, only when Session (WB001.CIGMA Part Name) is different.
     *
     *         The following items are set to {@link TmExpFormalitiItemNoDomain}.
     *           - itemDescription / ITEM DESCRIPTION: Session (WB001.CIGMA Part Name)
     *
     *         The following items are set to {@link TmExpFormalitiItemNoCriteriaDomain}.
     *           - key item: This is {@link TmExpFormalitiItemNoDomain} as a result of the lock of the above-mentioned Export Formality Item No Master.
     *
     *         This is a call about {@link TmExpFormalitiItemNoService#updateByCondition(TmExpFormalitiItemNoDomain, TmExpFormalitiItemNoCriteriaDomain)}.
     *
     * - CIGMA direct delivery ordering reflection
     *     Call of - Web service "ECA0027_WS_B007:direct delivery ordering reflection"
     *         {@link WB001OdrRcvDomain} set to rcvOdrCompCd/RECEIVE ORDER COMPANY CODE of odrRcvList based on odrRcvList is made into an argument,
     *         The following calls are performed according to the result of the above-mentioned update judging.
     *
     *           This is a call about Web service (WSB007) {@link WsB007RestService#reflectToCusOdr(String, WsB007ParamDomain)}.
     *
     * - Re retrieval of a screen (at the time [ Multiple-p/n-packaged-in-box Create screen ] of changes)
     *     This is a call about {@link WB001OdrRcvService#serchOnMultiPoRegister (WB001OdrRcvCriteriaDomain)}.
     * 
     * - 前提
     *     以下はFasadeServiceで絞り込み済み。
     *     Checkが選択されている行に対し、繰り返し処理を行う。
     * 
     * - 更新判定
     *     odrRcvListのcustomerPoNoHidden/得意先PO NOが""の場合、登録
     *     上記以外で、firmQty/確定注文数量 <> 0 又は forecastQty/見込注文数量 <> 0の場合、更新
     *     以外の場合、削除
     *     
     * - 輸出受注の登録
     *     {@link TtExpRcvOdrDomain}に以下の項目を設定し、{@link TtExpRcvOdrService#create(TtExpRcvOdrDomain)}を呼出
     *       - odrRcvList{@link WB001OdrRcvDomain}のプロパティ
     *       - odrCtrlNo/オーダーコントロールNO:0
     *       - revisionNo/履歴NO:0
     *       - revisionNoEis/履歴NO(拠点間):0
     *       - odrQtyOrg/注文数量オリジナル:odrRcvListのfirmQty/確定注文数量が0より大きい場合、firmQty/確定注文数量
     *                                      odrRcvListのforecastQty/見込注文数量が0より大きい場合、forecastQty/見込注文数量
     *       - odrQty/注文数量:odrRcvListのfirmQty/確定注文数量が0より大きい場合、firmQty/確定注文数量
     *                         odrRcvListのforecastQty/見込注文数量が0より大きい場合、forecastQty/見込注文数量
     *       - pltzAllocQty/梱包引当数量:0
     *       - shippedQty/出荷数量:0
     *       - shippingDt/出荷予定日:odrRcvListのECA0027_WS_B002結果エリアの出荷日
     *       - partialDelivCnt/分納回数:0
     *       - odrFirmFlg/受注確定フラグ:odrRcvListのfirmQty/確定注文数量が0より大きい場合、"Y"(確定)
     *                         odrRcvListのforecastQty/見込注文数量が0より大きい場合、"N"(見込)
     *       - lastFigureChgFlg/設変振替フラグ:"N"(オリジナル品番)
     *       - supplierCd/仕入先コード:odrRcvListのECA0027_WS_B002結果エリアの仕入先コード
     *       - shippedTyp/出荷済み区分:"1":梱包未完了
     *       
     * - 輸出受注のロック
     *     {@link TtExpRcvOdrCriteriaDomain}にodrRcvListの同項目を設定し、
     *     {@link TtExpRcvOdrService#lockByKeyNoWait(TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 輸出受注の更新
     *     {@link TtExpRcvOdrDomain}にodrRcvList以下の項目を設定
     *       - customerPoNo/得意先PO NO:customerPoNo/得意先PO NO
     *       - customerItemNo/得意先品目番号:customerItemNo/得意先品目番号
     *       - customerItemNoOrg/得意先品目番号オリジナル:customerItemNoOrg/得意先品目番号オリジナル
     *       - customerDueDt/顧客納期:customerDueDt/顧客納期
     *       - odrQty/注文数量:odrRcvListのfirmQty/確定注文数量が0より大きい場合、firmQty/確定注文数量
     *                         odrRcvListのforecastQty/見込注文数量が0より大きい場合、forecastQty/見込注文数量
     *       - shippingDt/出荷予定日:上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のpltzAllocQty/梱包引当数量 ＝ 0
     *                               且つ、shippedQty/出荷数量 ＝ 0の場合、odrRcvListのECA0027_WS_B002結果エリアの出荷日
     *       - odrFirmFlg/受注確定フラグ:odrRcvListのfirmQty/確定注文数量が0より大きい場合、"Y"(確定)
     *                                   odrRcvListのforecastQty/見込注文数量が0より大きい場合、"N"(見込)
     *       - salesCompPoNo/販売会社PO NO:salesCompPoNo/販売会社PO NO
     *       - shippedTyp/出荷済み区分:
     *           上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のpltzAllocQty/梱包引当数量が
     *             odrRcvListのodrQtyより小さい場合、"1"(梱包未完了)
     *             odrRcvListのodrQtyと等しい場合、"2"(梱包済み)
     *           上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のshippedQty/出荷数量が
     *             odrRcvListのodrQtyと等しい場合、"3"(出荷済み)
     *             
     *     {@link TtExpRcvOdrCriteriaDomain}に以下の項目を設定
     *       - キー項目:odrRcvList
     *       - comUpdateTimestamp/更新日時:odrRcvList
     *     
     *     {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 輸出受注の削除
     *     {@link TtExpRcvOdrCriteriaDomain}に以下の項目を設定
     *       - キー項目:odrRcvList
     *       - comUpdateTimestamp/更新日時:odrRcvList
     *     
     *     {@link TtExpRcvOdrService#delete(TtExpRcvOdrCriteriaDomain)}を呼出
     * 
     * - 輸出手続品目番号原単位の品目名称更新
     *     - 輸出手続品目番号原単位の適用開始日取得
     *       上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のetdDueDt/船積期限以前で直近の適用開始日を取得
     *         {@link TmExpFormalitiItemNoCriteriaDomain}にodrRcvListの以下の項目を設定し、
     *         {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *           - compCd/会社コード:rcvOdrCompCd/受注会社コード
     *           - itemNo/品目番号:同項目
     *           - aplyStrtDt/適用開始日:odrRcvListのetdDueDt/船積期限より以下
     *         
     *         ソート順
     *           - APPLY START DATE/適用開始日 (降順)
     *         
     *         paging機能で1件目を取得
     *         
     *     - 輸出手続品目番号原単位のロック
     *         {@link TmExpFormalitiItemNoCriteriaDomain}にodrRcvListの以下の項目を設定し、
     *         {@link TmExpFormalitiItemNoService#lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *           - compCd/会社コード:rcvOdrCompCd/受注会社コード
     *           - itemNo/品目番号:同項目
     *           - aplyStrtDt/適用開始日:上記の輸出手続品目番号原単位の適用開始日取得の結果{@link TmExpFormalitiItemNoDomain}のaplyStrtDt/適用開始日
     *           
     *     - 輸出手続品目番号原単位の更新
     *         上記の結果{@link TmExpFormalitiItemNoDomain}のitemDescription/品目名称と
     *         Session(WB001.CIGMA Part Name)が相違している場合のみ実施
     *         
     *         {@link TmExpFormalitiItemNoDomain}に以下の項目を設定
     *           - itemDescription/品目名称:Session(WB001.CIGMA Part Name)
     *           
     *         {@link TmExpFormalitiItemNoCriteriaDomain}に以下の項目を設定
     *           - キー項目:上記の輸出手続品目番号原単位のロックの結果{@link TmExpFormalitiItemNoDomain}
     *           
     *         {@link TmExpFormalitiItemNoService#updateByCondition(TmExpFormalitiItemNoDomain, TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *         
     * - CIGMA直納受注反映
     *     - Webサービス「ECA0027_WS_B007：直納受注反映」のコール
     *         odrRcvListのrcvOdrCompCd/受注会社コードとodrRcvListを元に設定した{@link WB001OdrRcvDomain}を引数にして、
     *         上記の更新判定の結果に応じて以下の呼出を行う。
     *         
     *           Webサービス(WSB007){@link WsB007RestService#reflectToCusOdr(String, WsB007ParamDomain)}を呼出
     * 
     * - 画面の再検索(小箱内多品番梱包Create画面より遷移時)
     *     {@link WB001OdrRcvService#serchOnMultiPoRegister(WB001OdrRcvDomain)}を呼出
     * </pre>
     * 
     * @param odrRcv Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @return Customer The list of Customer Order Receiving domains<br />Order Receivingドメインのリスト
     * @throws ApplicationException When an Export Receive Order, an Export Formality Item No Master, and CIGMA cannot be accessed
     *                              <br />輸出受注、輸出手続品目番号原単位、CIGMAにアクセスできない場合
     */
    public List<? extends WB001OdrRcvDomain> transactOnMultiPoRegister(WB001OdrRcvDomain odrRcv)
        throws ApplicationException;
    
    /**
     * Perform Export-Receive-Order registration registration / update / delete process, and the call of Web service "ECA0027_WS_B007:direct delivery ordering reflection."
     * <br />輸出受注登録登録/更新/削除処理、及び、Webサービス「ECA0027_WS_B007：直納受注反映」のコールを行います。
     * <pre>
     * - Premise
     *     It narrows down by FasadeService and the following is ending.
     *     Repetition processing is performed to the line as which Check is chosen.
     *
     * - Update judging
     *     It registers, when customerPoNoHidden/CUSTOMER PO NO of odrRcvList are "."
     *     This is except the above and, in the case of firmQty/firm order QUANTITY <> 0, or forecastQty/prospective ORDER-QUANTITY <> 0, updates.
     *     In except, it deletes.
     *
     * - Registration of an Export Receive Order
     *     The following items are set to {@link TtExpRcvOdrDomain} and this is a call about {@link TtExpRcvOdrService#create (TtExpRcvOdrDomain)}.
     *       Property of - odrRcvList {@link WB001OdrRcvDomain}
     *       - odrCtrlNo / ORDER CONTROL NO: Zero
     *       - revisionNo / REVISION NO: Zero
     *       - revisionNoEis / REVISION NO FOR EIS: Zero
     *       - odrQtyOrg / ORDER QUANTITY ORIGINAL: When firmQty / firm order QUANTITY of odrRcvList are larger than 0, they are firmQty / firm order QUANTITY.
     *                                       When forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0, they are forecastQty / prospective ORDER QUANTITY.
     *       - odrQty / ORDER QUANTITY: When firmQty / firm order QUANTITY of odrRcvList are larger than 0, they are firmQty / firm order QUANTITY.
     *                          When forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0, they are forecastQty / prospective ORDER QUANTITY.
     *       - pltzAllocQty / Alloc QTY: Zero
     *       - shippedQty / SHIPPED QUANTITY: Zero
     *       - shippingDt / SHIPPING DATE: ECAof odrRcvList0027_WS_B002 result is a ship date of area.
     *       - partialDelivCnt / PARTIAL DELIVERY COUNT: Zero
     *       - odrFirmFlg / ORDER FIRM FLAG: This is "Y" (decision) when firmQty / firm order QUANTITY of odrRcvList are larger than 0.
     *                                    This is "N" (hope) when forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0.
     *       - lastFigureChgFlg / LAST FIGURE CHG FLAG: "N" (ITEM NO ORIGINAL)
     *       - supplierCd / SUPPLIER CODE: Session (WB001.Supplier Code)
     *       - shippedTyp / SHIPPED TYPE: "1": PKG un-completing.
     *       - plntCd / PLANT CODE: Session (WB001.Plant Code)
     *
     * - Lock of an Export Receive Order
     *     The same clause eye of odrRcvList is set to {@link TtExpRcvOdrCriteriaDomain},
     *     This is a call about {@link TtExpRcvOdrService#lockByKeyNoWait (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Update of an Export Receive Order
     *     The item below odrRcvList is set to {@link TtExpRcvOdrDomain}.
     *       - customerPoNo / CUSTOMER PO NO: customerPoNo/CUSTOMER PO NO
     *       - customerItemNo / CUSTOMER ITEM NO: customerItemNo/CUSTOMER ITEM NO
     *       - customerItemNoOrg / CUSTOMER ITEM NO ORIGINAL: customerItemNoOrg/CUSTOMER ITEM NO ORIGINAL
     *       - customerDueDt / CUSTOMER DUE DATE: customerDueDt/CUSTOMER DUE DATE
     *       - odrQty / ORDER QUANTITY: When firmQty / firm order QUANTITY of odrRcvList are larger than 0, they are firmQty / firm order QUANTITY.
     *                          When forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0, they are forecastQty / prospective ORDER QUANTITY.
     *       - shippingDt / SHIPPING DATE: They are pltzAllocQty/Alloc QTY of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.   = 0
     *                                and shippedQty/SHIPPED QUANTITY -- the case of = 0 -- ECAof odrRcvList0027_WS_B002 result -- ship date of area [   ]
     *       - odrFirmFlg / ORDER FIRM FLAG: This is "Y" (decision) when firmQty / firm order QUANTITY of odrRcvList are larger than 0.
     *                                    This is "N" (hope) when forecastQty / prospective ORDER QUANTITY of odrRcvList are larger than 0.
     *       - salesCompPoNo / SALES COMPANY PO NO: salesCompPoNo/SALES COMPANY PO NO
     *       - shippedTyp / SHIPPED TYPE:
     *           pltzAllocQty/Alloc QTY of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.
     *             When smaller than odrQty of odrRcvList, this is "1" (PKG un-completing).
     *             When equal to odrQty of odrRcvList, this is "2" (finishing of a PKG).
     *           shippedQty/SHIPPED QUANTITY of {@link TtExpRcvOdrDomain} as a result of the lock of the above-mentioned Export Receive Order.
     *             When equal to odrQty of odrRcvList, this is "3" (finishing of shipment).
     *
     *     The following items are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - key item: odrRcvList
     *       - comUpdateTimestamp / update date: odrRcvList
     *
     *     This is a call about {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}.
     *
     * - Delete of an Export Receive Order
     *     The following items are set to {@link TtExpRcvOdrCriteriaDomain}.
     *       - key item: odrRcvList
     *       - comUpdateTimestamp / update date: odrRcvList
     *
     *     This is a call about {@link TtExpRcvOdrService#delete (TtExpRcvOdrCriteriaDomain)}.
     *
     * - Update of an ITEM DESCRIPTION of an Export Formality Item No Master
     *     - APPLY-START-DATE acquisition of an Export Formality Item No Master
     *       The latest APPLY START DATE is acquired etdDueDt / before [ the ETD DUE DATE of {@link TtExpRcvOdrDomain} ] as a result of the lock of the above-mentioned Export Receive Order.
     *         The following items of odrRcvList are set to {@link TmExpFormalitiItemNoCriteriaDomain},
     *         This is a call about {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}.
     *           - compCd / COMPANY CODE: rcvOdrCompCd/RECEIVE ORDER COMPANY CODE
     *           - itemNo / ITEM NO: Same clause eye
     *           - aplyStrtDt / APPLY START DATE: This is the following from etdDueDt/ETD DUE DATE of odrRcvList.
     *
     *         Sort order
     *           - APPLY START DATE / APPLY START DATE (descending order)
     *
     *         The 1st affair is acquired by a paging function.
     *
     *     - Lock of an Export Formality Item No Master
     *         The following items of odrRcvList are set to {@link TmExpFormalitiItemNoCriteriaDomain},
     *         This is a call about {@link TmExpFormalitiItemNoService#lockByKeyNoWait (TmExpFormalitiItemNoCriteriaDomain)}.
     *           - compCd / COMPANY CODE: rcvOdrCompCd/RECEIVE ORDER COMPANY CODE
     *           - itemNo / ITEM NO: Same clause eye
     *           - aplyStrtDt / APPLY START DATE: They are aplyStrtDt/APPLY START DATE of {@link TmExpFormalitiItemNoDomain} as a result of APPLY-START-DATE acquisition of the above-mentioned Export Formality Item No Master.
     *
     *     - Update of an Export Formality Item No Master
     *         The above-mentioned result is itemDescription/ITEM DESCRIPTION of {@link TmExpFormalitiItemNoDomain}.
     *         It carries out, only when Session (WB001.CIGMA Part Name) is different.
     *
     *         The following items are set to {@link TmExpFormalitiItemNoDomain}.
     *           - itemDescription / ITEM DESCRIPTION: Session (WB001.CIGMA Part Name)
     *
     *         The following items are set to {@link TmExpFormalitiItemNoCriteriaDomain}.
     *           - key item: This is {@link TmExpFormalitiItemNoDomain} as a result of the lock of the above-mentioned Export Formality Item No Master.
     *
     *         This is a call about {@link TmExpFormalitiItemNoService#updateByCondition(TmExpFormalitiItemNoDomain, TmExpFormalitiItemNoCriteriaDomain)}.
     *
     * - CIGMA direct delivery ordering reflection
     *     Call of - Web service "ECA0027_WS_B007:direct delivery ordering reflection"
     *         {@link WB001OdrRcvDomain} set to rcvOdrCompCd/RECEIVE ORDER COMPANY CODE of odrRcvList based on odrRcvList is made into an argument,
     *         The following calls are performed according to the result of the above-mentioned update judging.
     *
     *           This is a call about Web service (WSB007) {@link WsB007RestService#reflectToCusOdr (String, WsB007ParamDomain)}.
     *
     * - Re retrieval of a screen (at the time [ Multiple-p/n-packaged-in-box Create screen ] of changes)
     *     This is a call about {@link WB001OdrRcvService#searchOnRegisterInit(WB001OdrRcvDomain)}.
     * 
     * - 前提
     *     以下はFasadeServiceで絞り込み済み。
     *     Checkが選択されている行に対し、繰り返し処理を行う。
     * 
     * - 更新判定
     *     odrRcvListのcustomerPoNoHidden/得意先PO NOが""の場合、登録
     *     上記以外で、firmQty/確定注文数量 <> 0 又は forecastQty/見込注文数量 <> 0の場合、更新
     *     以外の場合、削除
     *     
     * - 輸出受注の登録
     *     {@link TtExpRcvOdrDomain}に以下の項目を設定し、{@link TtExpRcvOdrService#create(TtExpRcvOdrDomain)}を呼出
     *       - odrRcvList{@link WB001OdrRcvDomain}のプロパティ
     *       - odrCtrlNo/オーダーコントロールNO:0
     *       - revisionNo/履歴NO:0
     *       - revisionNoEis/履歴NO(拠点間):0
     *       - odrQtyOrg/注文数量オリジナル:odrRcvListのfirmQty/確定注文数量が0より大きい場合、firmQty/確定注文数量
     *                                      odrRcvListのforecastQty/見込注文数量が0より大きい場合、forecastQty/見込注文数量
     *       - odrQty/注文数量:odrRcvListのfirmQty/確定注文数量が0より大きい場合、firmQty/確定注文数量
     *                         odrRcvListのforecastQty/見込注文数量が0より大きい場合、forecastQty/見込注文数量
     *       - pltzAllocQty/梱包引当数量:0
     *       - shippedQty/出荷数量:0
     *       - shippingDt/出荷予定日:odrRcvListのECA0027_WS_B002結果エリアの出荷日
     *       - partialDelivCnt/分納回数:0
     *       - odrFirmFlg/受注確定フラグ:odrRcvListのfirmQty/確定注文数量が0より大きい場合、"Y"(確定)
     *                                   odrRcvListのforecastQty/見込注文数量が0より大きい場合、"N"(見込)
     *       - lastFigureChgFlg/設変振替フラグ:"N"(オリジナル品番)
     *       - supplierCd/仕入先コード:Session(WB001.Supplier Code)
     *       - shippedTyp/出荷済み区分:"1":梱包未完了
     *       - plntCd/製造部工場区分:Session(WB001.Plant Code)
     *       
     * - 輸出受注のロック
     *     {@link TtExpRcvOdrCriteriaDomain}にodrRcvListの同項目を設定し、
     *     {@link TtExpRcvOdrService#lockByKeyNoWait(TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 輸出受注の更新
     *     {@link TtExpRcvOdrDomain}にodrRcvList以下の項目を設定
     *       - customerPoNo/得意先PO NO:customerPoNo/得意先PO NO
     *       - customerItemNo/得意先品目番号:customerItemNo/得意先品目番号
     *       - customerItemNoOrg/得意先品目番号オリジナル:customerItemNoOrg/得意先品目番号オリジナル
     *       - customerDueDt/顧客納期:customerDueDt/顧客納期
     *       - odrQty/注文数量:odrRcvListのfirmQty/確定注文数量が0より大きい場合、firmQty/確定注文数量
     *                         odrRcvListのforecastQty/見込注文数量が0より大きい場合、forecastQty/見込注文数量
     *       - shippingDt/出荷予定日:上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のpltzAllocQty/梱包引当数量 ＝ 0
     *                               且つ、shippedQty/出荷数量 ＝ 0の場合、odrRcvListのECA0027_WS_B002結果エリアの出荷日
     *       - odrFirmFlg/受注確定フラグ:odrRcvListのfirmQty/確定注文数量が0より大きい場合、"Y"(確定)
     *                                   odrRcvListのforecastQty/見込注文数量が0より大きい場合、"N"(見込)
     *       - salesCompPoNo/販売会社PO NO:salesCompPoNo/販売会社PO NO
     *       - shippedTyp/出荷済み区分:
     *           上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のpltzAllocQty/梱包引当数量が
     *             odrRcvListのodrQtyより小さい場合、"1"(梱包未完了)
     *             odrRcvListのodrQtyと等しい場合、"2"(梱包済み)
     *           上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のshippedQty/出荷数量が
     *             odrRcvListのodrQtyと等しい場合、"3"(出荷済み)
     *             
     *     {@link TtExpRcvOdrCriteriaDomain}に以下の項目を設定
     *       - キー項目:odrRcvList
     *       - comUpdateTimestamp/更新日時:odrRcvList
     *     
     *     {@link TtExpRcvOdrService#updateByCondition(TtExpRcvOdrDomain, TtExpRcvOdrCriteriaDomain)}を呼出
     *     
     * - 輸出受注の削除
     *     {@link TtExpRcvOdrCriteriaDomain}に以下の項目を設定
     *       - キー項目:odrRcvList
     *       - comUpdateTimestamp/更新日時:odrRcvList
     *     
     *     {@link TtExpRcvOdrService#delete(TtExpRcvOdrCriteriaDomain)}を呼出
     * 
     * - 輸出手続品目番号原単位の品目名称更新
     *     - 輸出手続品目番号原単位の適用開始日取得
     *       上記の輸出受注のロックの結果{@link TtExpRcvOdrDomain}のetdDueDt/船積期限以前で直近の適用開始日を取得
     *         {@link TmExpFormalitiItemNoCriteriaDomain}にodrRcvListの以下の項目を設定し、
     *         {@link TmExpFormalitiItemNoService#searchByConditionForPaging(TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *           - compCd/会社コード:rcvOdrCompCd/受注会社コード
     *           - itemNo/品目番号:同項目
     *           - aplyStrtDt/適用開始日:odrRcvListのetdDueDt/船積期限より以下
     *         
     *         ソート順
     *           - APPLY START DATE/適用開始日 (降順)
     *         
     *         paging機能で1件目を取得
     *         
     *     - 輸出手続品目番号原単位のロック
     *         {@link TmExpFormalitiItemNoCriteriaDomain}にodrRcvListの以下の項目を設定し、
     *         {@link TmExpFormalitiItemNoService#lockByKeyNoWait(TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *           - compCd/会社コード:rcvOdrCompCd/受注会社コード
     *           - itemNo/品目番号:同項目
     *           - aplyStrtDt/適用開始日:上記の輸出手続品目番号原単位の適用開始日取得の結果{@link TmExpFormalitiItemNoDomain}のaplyStrtDt/適用開始日
     *           
     *     - 輸出手続品目番号原単位の更新
     *         上記の結果{@link TmExpFormalitiItemNoDomain}のitemDescription/品目名称と
     *         Session(WB001.CIGMA Part Name)が相違している場合のみ実施
     *         
     *         {@link TmExpFormalitiItemNoDomain}に以下の項目を設定
     *           - itemDescription/品目名称:Session(WB001.CIGMA Part Name)
     *           
     *         {@link TmExpFormalitiItemNoCriteriaDomain}に以下の項目を設定
     *           - キー項目:上記の輸出手続品目番号原単位のロックの結果{@link TmExpFormalitiItemNoDomain}
     *           
     *         {@link TmExpFormalitiItemNoService#updateByCondition(TmExpFormalitiItemNoDomain, TmExpFormalitiItemNoCriteriaDomain)}を呼出
     *         
     * - CIGMA直納受注反映
     *     - Webサービス「ECA0027_WS_B007：直納受注反映」のコール
     *         odrRcvListのrcvOdrCompCd/受注会社コードとodrRcvListを元に設定した{@link WB001OdrRcvDomain}を引数にして、
     *         上記の更新判定の結果に応じて以下の呼出を行う。
     *         
     *           Webサービス(WSB007){@link WsB007RestService#reflectToCusOdr(String, WsB007ParamDomain)}を呼出
     * 
     * - 画面の再検索(小箱内多品番梱包Create画面より遷移時)
     *     {@link WB001OdrRcvService#searchOnRegisterInit(WB001OdrRcvDomain)}を呼出
     * </pre>
     * 
     * @param odrRcv Customer Order Receiving domain<br />Customer Order Receivingドメイン
     * @return Customer Customer Order Receiving domain<br />Order Receivingドメイン
     * @throws ApplicationException When an Export Receive Order, an Export Formality Item No Master, and CIGMA cannot be accessed
     *                              <br />輸出受注、輸出手続品目番号原単位、CIGMAにアクセスできない場合
     */
    public WB001OdrRcvDomain transactOnRegister(WB001OdrRcvDomain odrRcv)
        throws ApplicationException;

    // -------------------------------- プリント系メソッド print ---------------------------------------------------------
}