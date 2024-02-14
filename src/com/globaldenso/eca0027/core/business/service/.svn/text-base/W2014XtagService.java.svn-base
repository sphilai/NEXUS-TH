/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TtXpltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TwXpltzDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmPkgSetHdrCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TtXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TwXpltzCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.TmPkgSetHdrService;
import com.globaldenso.eca0027.core.auto.business.service.TtXpltzService;
import com.globaldenso.eca0027.core.auto.business.service.TwXpltzService;
import com.globaldenso.eca0027.core.business.dao.W2014XtagDao;
import com.globaldenso.eca0027.core.business.domain.W2014PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W2014XtagDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014PltzCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W2014XtagCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.service.CommonService;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;

/**
 * The interface of X-Palletize service.
 * <br />まとめパレタイズサービスのインタフェースです。
 * <pre>
 * bean id: w2014XtagService
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public interface W2014XtagService {

    // --------------------------------- Parameter check method validateConsistency ----------------------------------
    // --------------------------------- パラメータチェックメソッド validateConsistency ----------------------------------
    /**
     * Perform a correlation check (CUSTOM TIMING TYPE).
     * <br />相関チェック(通関タイミング区分)を行います。
     * <pre>
     * - Correlation check (CUSTOM TIMING TYPE)
     *     An error is made when ccType(s) (hidden) of all the selected data differ. 
     * 
     * - 相関チェック(通関タイミング区分)
     *     選択された全データのccType(hidden)が異なる場合エラー
     * </pre>
     * 
     * @param pltzList the list of pltzList Palletize domains<br />パレタイズドメインのリスト 
     * @param errCcTypeList list of the customs clearance timing which became a errCcTypeList error -- the object for return values<br />エラーになった通関タイミングのリスト ※戻り値用
     * @return check result (true or false)
     */
    public boolean validateConsistencyCcType(List<? extends W2014PltzDomain> pltzList, List<String> errCcTypeList);
    
    /**
     * Perform the minimum X-TAG number check.
     * <br />最小まとめCML件数チェックを行います。
     * <pre>
     * - The minimum X-TAG number check
     *       In the case of X-TAG < 2 affair, an error is made.
     *
     * - 最小まとめCML件数チェック
     *     まとめCML < 2件の場合エラー
     * </pre>
     * 
     * @param pltzDomainList the list of Palletize domains<br />パレタイズドメインのリスト 
     * @return check result (true or false)
     */
    public boolean validateConsistencyCmlCount(List<? extends W2014PltzDomain> pltzDomainList);
    
    /**
     * Perform the correlation check of date From - To.
     * <br />日付 From - To の相関チェックを行います。
     * <pre>
     * - Correlation check of date From - To
     *       It carries out, when both FM) Issue Date and TO) Issue Date are inputted.
     *       details -- common-specifications .xls -- "-- functional specification common: -- the correlation check " of date From - To is referred to
     * 
     * - 日付 From - To の相関チェック
     *     FM) Issue DateとTO) Issue Dateの両方が入力された場合に実施
     *     詳細は共通仕様.xls「機能仕様共通：日付 From - To の相関チェック」を参照
     * </pre>
     * 
     * @param dateFormat a Date format<br/>日付フォーマット
     * @param issueFromDate FM) Issue Date
     * @param issueToDate TO) Issue Date
     * @return check result (true or false)
     */
    public boolean validateConsistencyFromToDate(String dateFormat, String issueFromDate, String issueToDate);
    
    // --------------------------------- Database check method validateDatabase -----------------------------------
    // --------------------------------- データベースチェックメソッド validateDatabase -----------------------------------
    /**
     * Check the master existence check 2 (Shipper existence check).
     * <br />マスタ存在チェック2(Shipper存在チェック)をチェックします。
     * <pre>
     * - Shipper existence check
     *       details -- common-specifications .xls -- "-- functional specification common: -- the Shipper existence check " is referred to
     * 
     * - Shipper存在チェック
     *     詳細は共通仕様.xls「機能仕様共通：Shipper存在チェック」を参照
     * </pre>
     * 
     * @param shipToCompCd COMPANY CODE<br/>会社コード
     * @return if exists in a NEXUS Company Master as a shipper true, if not exists in a NEXUS Company Master as a shipper false<br />会社コードが荷主としてNEXUS会社原単位に存在すればtrue、そうでければfalse
     * @throws ApplicationException When an error unexpected by CommonService occurs<br />CommonServiceで予期せぬエラーが発生した場合
     */
    public boolean validateDatabaseCompCd(String shipToCompCd)throws ApplicationException;
    
    /**
     * Check the master existence check 1 (W/H Company, NEXUS W/H combination check).
     * <br />マスタ存在チェック1(W/H Company、NEXUS W/H　組み合わせチェック)をチェックします。
     * <pre>
     * - W/H Company and NEXUS W/H Combination check
     *     details -- common-specifications .xls -- "-- functional specification common: -- W/H Company and the NEXUS W/H combination check " are referred to
     *       
     * - W/H Company、NEXUS W/H　組み合わせチェック
     *     詳細は共通仕様.xls「機能仕様共通：W/H Company、NEXUS W/H　組み合わせチェック」を参照
     * </pre>
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @param whCd W/H CD<br />倉庫コード
     * @return It will be true if W/H company and the combination of W/H exist in a NEXUS Warehouse Master, Otherwise, false
     *         <br />W/H会社、W/Hの組み合わせが倉庫原単位に存在すればtrue、そうでなければfalse
     * @throws ApplicationException When an error unexpected by CommonService occurs<br />CommonServiceで予期せぬエラーが発生した場合
     */
    public boolean validateDatabaseCompWh(String compCd, String whCd) throws ApplicationException;
    
    /**
     * Check a Palletize.
     * <br />パレタイズをチェックします。
     * <pre>
     * - The following check implementation
     *       The acquisition number check
     *       This is confirmed whether the mountain of the target CML is made.
     *       The transfer document is published for the target CML, or it checks for nothing under Carry-Out.
     *       This is already checked a X-TAG for the target CML.
     *       This is confirmed whether the target CML is changing the Transport.
     *
     *       The following is set to the list of {@link W2014XtagCriteriaDomain},
     *       This is a call about {@link W2014XtagDao#lockTtPltz(List)}.
     *         - mainMark / MAIN MARK
     * 
     * - 以下のチェック実施
     *     取得件数チェック
     *     対象のCMLが山作りされていないかをチェック
     *     対象のCMLが送荷書が発行されているまたは、搬出中のものがないかをチェック
     *     対象のCMLが既にまとめCMLになっていないかをチェック
     *     対象のCMLが輸送手段の付け替えを行っていないかをチェック
     *   
     *     {@link W2014XtagCriteriaDomain}のリストに以下を設定して、
     *     {@link W2014XtagDao#lockTtPltz(List)}を呼出
     *       - mainMark/メインマーク
     * </pre>
     * 
     * @param mainMarkList CML No LIst
     * @param trnsCd TRANSPORT CODE
     * @param pltzStatusErrList MAIN MARK which became an error with the Palletize status check -- Return values (MAIN MARK with a check error)
     *        <br />パレタイズステータスチェックでエラーになったMAIN MARK ※戻り値用(チェックエラーのあったMAIN MARK)
     * @param lastTrStatusErrList  MAIN MARK which became an error with the Palletize status check -- Return values (MAIN MARK with a check error)
     *        <br />最終搬出入ステータスチェックでエラーになったMAIN MARK ※戻り値用(チェックエラーのあったMAIN MARK)
     * @return The list of error messages<br />エラーメッセージのリスト 
     * @throws ApplicationException When a Palletize cannot be referred to<br />パレタイズが参照できない場合
     */
    public List<String> validateDatabaseTtPltzOnRegister(List<String> mainMarkList, String trnsCd
        , List<String> pltzStatusErrList, List<String> lastTrStatusErrList) throws ApplicationException;
    
    /**
     * Check the DB consistency check 2 (doesn't it exist and isn't the mountain of the Palletize made?).
     * <br />DB整合性チェック2(パレタイズの存在、山作りされていないか)をチェックします。
     * <pre>
     * - This is confirmed the Palletize's existence check and whether the mountain is made.
     *       The following is set to the list of {@link W2014XtagCriteriaDomain},
     *       This is a call about {@link W2014XtagDao#lockTtPltz(List)}.
     *         - mainMark / MAIN MARK
     * 
     * - パレタイズの存在チェック、山作りされていないかチェック
     *     {@link W2014XtagCriteriaDomain}のリストに以下を設定して、
     *     {@link W2014XtagDao#lockTtPltz(List)}を呼出
     *       - mainMark/メインマーク
     * </pre>
     * 
     * @param mainMarkList CML No List
     * @param mainMarkErrList CML No Error List
     * @return If existence and a Palletize Status are "10" (Palletize) at Palletize, they are true, otherwise, false.
     *         <br />パレタイズに存在、且つ、パレタイズステータスが"10"(パレタイズ)ならtrue、そうでなければfalse
     * @throws ApplicationException When a Palletize cannot be referred to<br />パレタイズが参照できない場合
     */
    public String validateDatabaseTtPltzOnRegisterCancel(List<String> mainMarkList, List<String> mainMarkErrList) throws ApplicationException;
    
    /**
     * Check the DB consistency check 1 (existence of a X Palletize).
     * <br />DB整合性チェック1(まとめパレタイズの存在)をチェックします。
     * <pre>
     * - X Palletize's existence check
     *       The following is set as {@link TtXpltzCriteriaDomain},
     *       This is a call about {@link TtXpltzService#lockByKeyNoWait(TtXpltzCriteriaDomain)}.
     *         - xmainMark / X-TAG
     *
     * - まとめパレタイズの存在チェック
     *     {@link TtXpltzCriteriaDomain}に以下を設定して、
     *     {@link TtXpltzService#lockByKeyNoWait(TtXpltzCriteriaDomain)}を呼出
     *       - xmainMark/まとめメインマーク
     * </pre>
     * 
     * @param xmainMark X-TAG<br/>まとめメインマーク
     * @return If this is existence at X Palletize, they are true, otherwise, false.<br />まとめパレタイズに存在ならtrue、そうでなければfalse
     * @throws ApplicationException When a X Palletize cannot be referred to.<br />まとめパレタイズが参照できない場合
     */
    public boolean validateDatabaseTtXpltzOnRegisterCancel(String xmainMark) throws ApplicationException;
    
    /**
     * Check existence of a X Palletize Work.
     * <br />まとめパレタイズワークの存在をチェックします。
     * <pre>
     * - X Palletize Work's existence check
     *       The following is set as {@link TwXpltzCriteriaDomain},
     *       This is a call about {@link TwXpltzService#searchByCondition(TwXpltzCriteriaDomain)}.
     *       - dscId/DSC-ID
     * 
     * - まとめパレタイズワークの存在チェック
     *     {@link TwXpltzCriteriaDomain}に以下を設定して、
     *     {@link TwXpltzService#searchByCondition(TwXpltzCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     * </pre>
     * 
     * @param dscId DSC-ID
     * @return If this is existence at X Palletize Work, they are true, otherwise, false.<br />まとめパレタイズワークに存在ならtrue、そうでなければfalse
     * @throws ApplicationException When a X Palletize Work cannot be referred to<br />まとめパレタイズワークが参照できない場合
     */
    public boolean validateDatabaseTwXpltzOnCreateMoveToRegister(String dscId) throws ApplicationException;
    
    /**
     * Check the same CML of a X Palletize Work.
     * <br />まとめパレタイズワークの同一CMLをチェックします。
     * <pre>
     * The same CML check of - X Palletize Work
     *       The following is set as {@link TwXpltzCriteriaDomain},
     *       This is a call about {@link TwXpltzService#searchByCondition(TwXpltzCriteriaDomain)}.
     *       - dscId/DSC-ID
     *       The 1st affair is acquired.
     * 
     * - まとめパレタイズワークの同一CMLチェック
     *     {@link TwXpltzCriteriaDomain}に以下を設定して、
     *     {@link TwXpltzService#searchByCondition(TwXpltzCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *     1件目を取得
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param customTimingTyp Customs clearance timing (hidden)<br />通関タイミング(hidden)
     * @return If this is existence at X Palletize Work, they are true, otherwise, false.<br />まとめパレタイズワークに存在ならtrue、そうでなければfalse
     * @throws ApplicationException When a X Palletize Work cannot be referred to<br />まとめパレタイズワークが参照できない場合
     */
    public boolean validateDatabaseTwXpltzOnCreateUpdateByCml(String dscId, String customTimingTyp) throws ApplicationException;

    /**
     * Check the registration number.
     * <br />登録件数をチェックします。
     * - The registration number check
     *       The following is set as {@link TwXpltzCriteriaDomain},
     *       This is a call about {@link TwXpltzService#searchByCondition(TwXpltzCriteriaDomain)}.
     *       - dscId/DSC-ID
     * 
     * - 登録件数チェック
     *     {@link TwXpltzCriteriaDomain}に以下を設定して、
     *     {@link TwXpltzService#searchByCondition(TwXpltzCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     * </pre>
     * 
     * @param dscId DSC-ID
     * @param newRec new registration record count<br />新規登録レコード数
     * @return If the sum total of the number of X Palletize Work and new registration record count is less than 99, they are true, otherwise, false.
     *         <br />まとめパレタイズワークの件数と新規登録レコード数の合計が99未満ならtrue、そうでなければfalse
     * @throws ApplicationException When a X Palletize Work cannot be referred to<br />まとめパレタイズワークが参照できない場合
     */
    public boolean validateDatabaseTwXpltzOnCreateUpdateByCount(String dscId, int newRec) throws ApplicationException;

    // --------------------------------- Registration system method create -----------------------------------------------------------
    // --------------------------------- 登録系メソッド create -----------------------------------------------------------
    /**
     * Register a X Palletize Work.
     * <br />まとめパレタイズワークの登録を行います。
     * <pre>
     * - Judgment for registration
     *       This is a call about {@link W2014PltzDomain#getDisabledFlg()}.
     *       When a result is N, X-Palletize registration is carried out.
     *
     * Registration of - X Palletize Work
     *       The following items of pltzList are set to {@link TwXpltzDomain},
     *       This is a call about {@link TwXpltzService#create(TwXpltzDomain)}.
     *       - dscId/DSC-ID
     *       - xmainMark
     *       - customTimingTyp
     * 
     * - 登録対象判定
     *     {@link W2014PltzDomain#getDisabledFlg()}を呼出
     *     結果がNの場合、まとめパレタイズ登録を実施
     * 
     * - まとめパレタイズワークの登録
     *     {@link TwXpltzDomain}にpltzListの以下の項目を設定し、
     *     {@link TwXpltzService#create(TwXpltzDomain)}を呼出
     *       - dscId/DSC-ID
     *       - xmainMark
     *       - customTimingTyp
     *       
     * </pre>
     * 
     * @param pltzList the list of Palletize domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When it cannot register with a X Palletize Work<br/>まとめパレタイズワークに登録できない場合
     */ 
    public void createOnCreateUpdate(List<? extends W2014PltzDomain> pltzList) throws ApplicationException;

    // --------------------------------- Search system method search -----------------------------------------------------------
    // --------------------------------- 検索系メソッド search -----------------------------------------------------------
    /**
     * Acquire the search number of a X-TAG Create screen.
     * <br />まとめCML Create画面の検索件数を取得します。
     * <pre>
     * - Authority information is acquired (update authority).
     *       Approval ID:W 2014R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     * - A Palletize, a X Palletize Work, the search number acquisition of a NEXUS Ship To Master
     *       The list of above-mentioned authority information {@link UserAuthDomain} is set to criteria.
     *       criteria is made into an argument and this is a call about {@link W2014XtagDao#searchCountTtpltz(W2014XtagCriteriaDomain)}.
     *       Refer to {@link #searchForPagingOnCreateSearch(W2014XtagCriteriaDomain)} for the details of retrieval processing.
     *
     * - The search number is returned.
     * 
     * 
     * - 権限情報を取得(更新権限)
     *     認可ID:W2014Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     * - パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位の検索件数取得
     *     criteriaに上記の権限情報{@link UserAuthDomain}のリストを設定
     *     criteriaを引数にして、{@link W2014XtagDao#searchCountTtpltz(W2014XtagCriteriaDomain)}を呼出
     *     検索処理の詳細は{@link #searchForPagingOnCreateSearch(W2014XtagCriteriaDomain)}を参照
     *     
     * - 検索件数を返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return search number<br />検索件数
     * @throws ApplicationException When a Palletize, a X Palletize Work, and a NEXUS Ship To Master cannot be referred to<br />パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位が参照できない場合
     */
    public int searcCountOnCreateSearch(W2014XtagCriteriaDomain criteria) throws ApplicationException;

    
    /**
     * Acquire the search number of a X-TAG Main Screen.
     * <br />まとめCML Main Screen画面の検索件数を取得します。
     * <pre>
     * - Authority information is acquired (reference authority).
     *       Approval ID:W 2014B is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     * - Authority information is acquired (update authority).
     *       Approval ID:W 2014R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     * - The search number acquisition of X Palletize and a Palletize
     *       The list of above-mentioned authority information {@link UserAuthDomain} is set to criteria.
     *       criteria is made into an argument and this is a call about {@link W2014XtagDao#searchCountTtXpltz(W2014XtagCriteriaDomain)}.
     *       Refer to {@link #searchForPagingOnMainSearch(W2014XtagCriteriaDomain)} for the details of retrieval processing.
     *
     * - The search number is returned.
     * 
     * 
     * - 権限情報を取得(参照権限)
     *     認可ID:W2014Bを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:W2014Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     * - まとめパレタイズ、パレタイズの検索件数取得
     *     criteriaに上記の権限情報{@link UserAuthDomain}のリストを設定
     *     criteriaを引数にして、{@link W2014XtagDao#searchCountTtXpltz(W2014XtagCriteriaDomain)}を呼出
     *     検索処理の詳細は{@link #searchForPagingOnMainSearch(W2014XtagCriteriaDomain)}を参照
     *     
     * - 検索件数を返却
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return search number<br />検索件数 
     * @throws ApplicationException When a X Palletize and a Palletize cannot be referred to<br />まとめパレタイズ、パレタイズが参照できない場合
     */
    public int searchCountOnMainSearch(W2014XtagCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Perform retrieval processing of a X-TAG Create screen.
     * <br />まとめCML Create画面の検索処理を行います。
     * <pre>
     * - Authority information is acquired (update authority).
     *       Approval ID:W 2014R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     * - Search of a Palletize, a X Palletize Work, and a NEXUS Ship To Master
     *       The list of above-mentioned authority information {@link UserAuthDomain} is set to criteria.
     *       criteria is made into an argument and this is a call about {@link W2014XtagDao#searchForPagingTtpltz(W2014XtagCriteriaDomain)}.
     *       all the following conditions are fulfilled -- data acquisition is carried out
     *         - It corresponds to the conditions specified from the screen.
     *         - This is contained in the specified page.
     *         - Shipper CD and a PLANT CODE correspond to the authority which a login user has.
     *
     *       Sort order
     *         - SHIPPER_CD / Shipper CD
     *         - MAIN_MARK / MAIN MARK (CML No)
     *
     * - Return of search results
     *     Search results are returned by the list of {@link W2014PltzDomain}.
     *
     *
     * - 権限情報を取得(更新権限)
     *     認可ID:W2014Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     * - パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位の検索
     *     criteriaに上記の権限情報{@link UserAuthDomain}のリストを設定
     *     criteriaを引数にして、{@link W2014XtagDao#searchForPagingTtpltz(W2014XtagCriteriaDomain)}を呼出
     *     下記の条件をすべて満たすデータ取得する
     *       - 画面から指定された条件に該当
     *       - 指定されたページに含まれる
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当
     *     
     *     ソート順
     *       - SHIPPER_CD/荷主コード
     *       - MAIN_MARK/メインマーク（CML No)
     *     
     * - 検索結果の返却
     *   検索結果を{@link W2014PltzDomain}のリストで返却する
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return The list of domains<br />パレタイズドメインのリスト
     * @throws ApplicationException When a Palletize, a X Palletize Work, and a NEXUS Ship To Master cannot be referred to<br />パレタイズ、まとめパレタイズワーク、NEXUS送荷先原単位が参照できない場合
     */
    public List<? extends W2014PltzDomain> searchForPagingOnCreateSearch(W2014XtagCriteriaDomain criteria) throws ApplicationException;

    
    /**
     * Perform retrieval processing of a X-TAG Main Screen.
     * <br />まとめCML Main Screen画面の検索処理を行います。
     * <pre>
     * - Authority information is acquired (reference authority).
     *       Approval ID:W2014B is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     * - Authority information is acquired (update authority).
     *       Approval ID:W2014R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     * - A search of X Palletize and a Palletize
     *       The list of above-mentioned authority information {@link UserAuthDomain} is set to criteria.
     *       criteria is made into an argument and this is a call about {@link W2014XtagDao#searchForPagingTtXpltz(W2014XtagCriteriaDomain)}.
     *       all the following conditions are fulfilled -- data acquisition is carried out
     *         - It corresponds to the conditions specified from the screen.
     *         - This is contained in the specified page.
     *         - Shipper CD and a PLANT CODE correspond to the authority which a login user has.
     *
     *       Sort order
     *         - TRNS_CD / TRANSPORT CODE
     *         - CONTAINER_SORTING_KEY / CONTAINER SORTING KEY
     *         - LOADING_CD / L/D CD
     *         - SHIP_TO_COMP_CD / SHIP TO COMPANY CODE
     *         - XMAIN_MARK / X-TAG
     *
     * - Return of search results
     *     Search results are returned by the list of {@link W2014XtagDomain}.
     * 
     * 
     * - 権限情報を取得(参照権限)
     *     認可ID:W2014Bを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:W2014Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     * - まとめパレタイズ、パレタイズの検索
     *     criteriaに上記の権限情報{@link UserAuthDomain}のリストを設定
     *     criteriaを引数にして、{@link W2014XtagDao#searchForPagingTtXpltz(W2014XtagCriteriaDomain)}を呼出
     *     下記の条件をすべて満たすデータ取得する
     *       - 画面から指定された条件に該当
     *       - 指定されたページに含まれる
     *       - 荷主コード、製造部工場区分がログインユーザが持つ権限に該当
     *     
     *     ソート順
     *       - TRNS_CD/輸送手段コード
     *       - CONTAINER_SORTING_KEY/コンテナ層別キー
     *       - LOADING_CD/荷積位置コード
     *       - SHIP_TO_COMP_CD/送荷先会社コード
     *       - XMAIN_MARK/まとめメインマーク
     *     
     * - 検索結果の返却
     *   検索結果を{@link W2014XtagDomain}のリストで返却する
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return The list of X-Palletize domains<br />まとめパレタイズドメインのリスト
     * @throws ApplicationException When a X Palletize and a Palletize cannot be referred to<br />まとめパレタイズ、パレタイズが参照できない場合
     */
    public List<? extends W2014XtagDomain> searchForPagingOnMainSearch(W2014XtagCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Perform retrieval processing of a X-TAG Register screen.
     * (at the time of the changes from a Create screen)
     * <br />まとめCML Register画面の検索処理を行います。(Create画面からの遷移時)
     * <pre>
     *  - A search of X Palletize Work and a Palletize
     *       criteria is made into an argument and this is a call about {@link W2014XtagDao#searchTwXpltzByCleate(W2014XtagCriteriaDomain)}.
     *       all the following conditions are fulfilled -- data acquisition is carried out
     *       - dscId/DSC-ID
     *
     *       Sort order
     *         - SHIPPER_CD / Shipper CD
     *         - XMAIN_MARK / X-TAG
     *
     * - This is total Shipper acquisition from X Palletize Work and a Palletize.
     *       criteria is made into an argument and this is a call about {@link W2014XtagDao#searchTtPltzByTotalShipper(W2014XtagCriteriaDomain)}.
     *       all the following conditions are fulfilled -- data acquisition is carried out
     *       - dscId/DSC-ID
     *
     * - Return of search results
     *     Search results are returned by the list of {@link W2014XtagDomain}.
     * 
     * - まとめパレタイズワーク、パレタイズの検索
     *     criteriaを引数にして、{@link W2014XtagDao#searchTwXpltzByCleate(W2014XtagCriteriaDomain)}を呼出
     *     下記の条件をすべて満たすデータ取得する
     *       - dscId/DSC-ID
     *     
     *     ソート順
     *       - SHIPPER_CD/荷主コード
     *       - XMAIN_MARK/まとめメインマーク
     *     
     * - まとめパレタイズワーク、パレタイズよりtotal Shipper取得
     *     criteriaを引数にして、{@link W2014XtagDao#searchTtPltzByTotalShipper(W2014XtagCriteriaDomain)}を呼出
     *     下記の条件をすべて満たすデータ取得する
     *       - dscId/DSC-ID
     *       
     * - 検索結果の返却
     *   検索結果を{@link W2014XtagDomain}のリストで返却する
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return The list of X-Palletize domains<br />まとめパレタイズドメインのリスト
     * @throws ApplicationException When a X Palletize Work and a Palletize cannot be referred to<br />まとめパレタイズワーク、パレタイズが参照できない場合
     */
    public W2014XtagDomain searchOnRegisterInitByFromCreate(W2014XtagCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * Perform retrieval processing of a X-TAG Register screen.(at the time of the changes from a Main screen)
     * <br />まとめCML Register画面の検索処理を行います。(Main画面からの遷移時)
     * <pre>
     *  - Authority information is acquired (reference authority).
     *       Approval ID:W 2014B is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     * - Authority information is acquired (update authority).
     *       Approval ID:W 2014R is made into an argument, and this is a call about {@link UserAuthService#getUserAuthList(String...)}.
     *
     * - A search of X Palletize and a Palletize
     *       The list of above-mentioned authority information {@link UserAuthDomain} is set to criteria.
     *       criteria is made into an argument and this is a call about {@link W2014XtagDao#searchTtXpltzByMain(W2014XtagCriteriaDomain)}.
     *       all the following conditions are fulfilled -- data acquisition is carried out
     *         - It corresponds to the conditions specified from the screen.
     *
     *       Sort order
     *         - SHIPPER_CD / Shipper CD
     *         - XMAIN_MARK / X-TAG
     *
     * - Return of search results
     *     Search results are returned by the list of {@link W2014XtagDomain}.
     * 
     * - 権限情報を取得(参照権限)
     *     認可ID:W2014Bを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     * - 権限情報を取得(更新権限)
     *     認可ID:W2014Rを引数にして、{@link UserAuthService#getUserAuthList(String...)}を呼出
     *     
     * - まとめパレタイズ、パレタイズの検索
     *     criteriaに上記の権限情報{@link UserAuthDomain}のリストを設定
     *     criteriaを引数にして、{@link W2014XtagDao#searchTtXpltzByMain(W2014XtagCriteriaDomain)}を呼出
     *     下記の条件をすべて満たすデータ取得する
     *       - 画面から指定された条件に該当
     *     
     *     ソート順
     *       - SHIPPER_CD/荷主コード
     *       - XMAIN_MARK/まとめメインマーク
     *     
     * - 検索結果の返却
     *   検索結果を{@link W2014XtagDomain}のリストで返却する
     * </pre>
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return The list of X-Palletize domains<br />まとめパレタイズドメインのリスト
     * @throws ApplicationException When a X Palletize and a Palletize cannot be referred to<br />まとめパレタイズ、パレタイズが参照できない場合
     */
    public W2014XtagDomain searchOnRegisterInitByFromMain(W2014XtagCriteriaDomain criteria) throws ApplicationException;
    
    // --------------------------------- Update system method update -----------------------------------------------------------
    // --------------------------------- 更新系メソッド update -----------------------------------------------------------
    
    // --------------------------------- Delete system method delete -----------------------------------------------------------
    // --------------------------------- 削除系メソッド delete -----------------------------------------------------------
    /**
     * Delete a X Palletize Work.
     * <br />まとめパレタイズワークを削除します。
     * <pre>
     * - Create of a search-condition domain
     *       {@link TwXpltzCriteriaDomain} is created and the DSC-ID of Argument criteria is set up.
     *       searchCountCheckFlg of a search-condition domain is set as false.
     *
     * - A delete of X Palletize Work
     *       {@link TwXpltzService#searchCount(TwXpltzCriteriaDomain)} is called.
     *       If the acquisition number is one or more, {@link TwXpltzService#deleteByCondition(TwXpltzCriteriaDomain)} will be called,
     *       A X Palletize Work is deleted.
     *       
     * - 検索条件ドメインの作成
     *     {@link TwXpltzCriteriaDomain}を作成し、引数criteriaのDSC-IDを設定する
     *     検索条件ドメインのsearchCountCheckFlgをfalseに設定する
     *     
     * - まとめパレタイズワークの削除
     *     {@link TwXpltzService#searchCount(TwXpltzCriteriaDomain)}を呼出す
     *     取得件数が1以上であれば、{@link TwXpltzService#deleteByCondition(TwXpltzCriteriaDomain)}を呼出し、
     *     まとめパレタイズワークを削除する
     * </pre>
     * 
     * 
     * @param criteria search-condition domain<br />検索条件ドメイン
     * @return delete number<br />削除件数
     * @throws ApplicationException When a X Palletize Work cannot be deleted<br />まとめパレタイズワークが削除できない場合
     */
    public int deleteOnHeaderInit(W2014XtagCriteriaDomain criteria) throws ApplicationException;

    /**
     * Delete a X Palletize Work.
     * <br />まとめパレタイズワークを削除します。
     * <pre>
     * - Create of a search-condition domain
     *       The list of {@link W2014PltzDomain} is created and this is dscId about loginUserDscId of Argument xtag.
     *       mainMark of pltzDomainList of xtag is set as mainMark.
     *
     * - A delete of X Palletize Work
     *       {@link W2014XtagDao#deleteTwXpltz(java.util.List)} is called.
     *
     * - Re retrieval
     * 
     * - 検索条件ドメインの作成
     *     {@link W2014PltzDomain}のリストを作成し、引数xtagのloginUserDscIdをdscIdに
     *     xtagのpltzDomainListのmainMarkをmainMarkに設定する
     *     
     * - まとめパレタイズワークの削除
     *     {@link W2014XtagDao#deleteTwXpltz(java.util.List)}を呼出す
     *     
     * - 再検索
     * </pre>
     * 
     * 
     * @param xtag X-Palletize domain<br />まとめパレタイズドメイン
     * @return X-Palletize domain<br />まとめパレタイズドメイン
     * @throws ApplicationException When a X Palletize Work cannot be deleted<br />まとめパレタイズワークが削除できない場合
     */
    public W2014XtagDomain deleteOnRegisterDelete(W2014XtagDomain xtag) throws ApplicationException;

    /**
     * Delete a X Palletize Work.
     * <br />まとめパレタイズワークを削除します。
     * <pre>
     * - A delete of X Palletize Work
     *       {@link W2014XtagDao#deleteTwXpltz(java.util.List)} is called.
     *
     * - まとめパレタイズワークの削除
     *     {@link W2014XtagDao#deleteTwXpltz(java.util.List)}を呼出す
     * </pre>
     * 
     * 
     * @param pltzList delete pltz domain<br />削除対象のドメイン
     * @return delete number<br />削除件数
     * @throws ApplicationException When a X Palletize Work cannot be deleted<br />まとめパレタイズワークが削除できない場合
     */
    public int deletePltzList(List<? extends W2014PltzDomain> pltzList) throws ApplicationException;

    // -------------------------------- Transaction system method transact ----------------------------------------------
    // -------------------------------- トランザクション系メソッド transact ----------------------------------------------
    /**
     * Register X-Palletize relation.
     * <br />まとめパレタイズ関連の登録を行います。
     * 
     * <pre>
     * - Acquisition of X-Palletize No.
     *       The following is made into an argument, This is a call about * {@link CommonService#transactSequence(java.lang.String, java.lang.String, int, java.lang.String)}.
     *         - assignment-of-order-numbers key: Acquire the following items from criteria and create an assignment-of-order-numbers key.
     *             - outerPkgComCd / OUTER PACKAGE COM CODE
     *             - curWhCd / CUR WAREHOUSE CODE
     *             Time zone of - timeZone / login person
     *         - assignment-of-order-numbers classification: "03" (MAIN MARK (DN))
     *         - the number of the SEQUENCE NO to acquire: One
     *         - function ID: Constant ({@link Eca0027Constants#SCREEN_ID_W2016}) 
     *
     * - N/W of CML, acquisition of G/W
     *       The following is set to {@link W2014PltzCriteriaDomain}.
     *       - dscId/DSC-ID
     *       This is a call about {@link W2014XtagDao#searchTtPltzByWeight(W2014PltzCriteriaDomain)}.
     *
     * - Acquisition of the WEIGHT of exterior cases
     *       The following is set to {@link W2014PltzCriteriaDomain}.
     *       - dscId/DSC-ID
     *       This is a call about {@link W2014XtagDao#searchTmPkgSetDtl(W2014PltzCriteriaDomain)}.
     *       An error is made when an object record does not exist.
     *
     * - Acquire the VOLUME of Outer CD.
     *       The following is set to {@link TmPkgSetHdrCriteriaDomain}.
     *       - dscId/DSC-ID
     *       This is a call about {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}.
     *       An error is made when an object record does not exist.
     *
     * - Acquisition of G/W
     *       - CML unit converted
     *           The following is made into an argument and this is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *             - SUM as a result of VALUE: {@link W2014XtagDao#searchTtPltzByWeight(W2014PltzCriteriaDomain)} to change (grossWeight/GROSS WEIGHT)  
     *             - Result of unit: {@link W2014XtagDao#searchTtPltzByWeight(W2014PltzCriteriaDomain)} before a converted   *1
     *             - the unit after a converted: WEIGHT-UNIT CD of criteria   *2
     *
     *         Unit converted of exterior cases
     *           The following is made into an argument and this is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *             - volume/VOLUME as a result of VALUE: {@link W2014XtagDao#searchTmPkgSetDtl(W2014PltzCriteriaDomain)} to change
     *             - Result of unit: {@link W2014XtagDao#searchTmPkgSetDtl(W2014PltzCriteriaDomain)} before a converted
     *             - the unit after a converted: The above-mentioned *2
     *
     *         The WEIGHT of CML and the WEIGHT of exterior cases are totaled.
     *
     * - Acquisition of N/W
     *         CML unit converted
     *           The following is made into an argument and this is a call about {@link CommonService#convertWeightUnit(BigDecimal, String, String)}.
     *             - SUM as a result of VALUE: {@link W2014XtagDao#searchTtPltzByWeight(W2014PltzCriteriaDomain)} to change (netWeight/NET WEIGHT)
     *             - the unit before a converted: The above-mentioned *1
     *             - the unit after a converted: The above-mentioned *2
     *
     * - Registration processing (X Palletize)
     *       The following is set to {@link TtXpltzDomain}.
     *       - dscId/DSC-ID
     *         VALUE of - criteria
     *         - Result of acquisition of above-mentioned X-Palletize No.
     *         - Result of acquisition of above-mentioned G/W
     *         - Result of acquisition of above-mentioned N/W
     *         - VALUE after a unit converted of the above-mentioned exterior cases
     *       This is a call about {@link TtXpltzService#create(TtXpltzDomain)}.
     *
     * - Delete process (X Palletize Work)
     *       The following is set as {@link TwXpltzCriteriaDomain},
     *       This is a call about {@link TwXpltzService#deleteByCondition(TwXpltzCriteriaDomain)}.
     *       - dscId/DSC-ID
     *
     * - Update process (Palletize)  
     *       The following is set to the list of {@link W2014PltzDomain}.
     *         - mainMark / MAIN MARK
     *         - Result of acquisition of above-mentioned X-Palletize No.
     *       This is a call about {@link W2014XtagDao#updateTtPltzByXmainMark(W2014PltzDomain, List)}.
     *
     * - Re retrieva
     * 
     * - まとめパレタイズNo.の取得
     *     以下を引数にして、
     *     {@link CommonService#transactSequence(java.lang.String, java.lang.String, int, java.lang.String)}を呼出
     *       - 採番キー:criteriaより以下の項目を取得し採番キーを作成
     *           - outerPkgComCd/外装会社コード
     *           - curWhCd/現在倉庫コード
     *           - timeZone/ログイン者のタイムゾーン
     *       - 採番区分:"03"(メインマーク(DN))
     *       - 取得する連番の個数:1
     *       - 機能ID:コンスタント({@link Eca0027Constants#SCREEN_ID_W2016})
     * 
     * - CMLのN/W、G/Wの取得
     *     {@link W2014PltzCriteriaDomain}に以下を設定
     *       - dscId/DSC-ID
     *     {@link W2014XtagDao#searchTtPltzByWeight(W2014PltzCriteriaDomain)}を呼出
     * 
     * - 外装材の重量の取得
     *     {@link W2014PltzCriteriaDomain}に以下を設定
     *       - dscId/DSC-ID
     *     {@link W2014XtagDao#searchTmPkgSetDtl(W2014PltzCriteriaDomain)}を呼出
     *     対象レコードが存在しない場合エラー
     * 
     * - Outer CDの容積を取得
     *     {@link TmPkgSetHdrCriteriaDomain}に以下を設定
     *       - dscId/DSC-ID
     *     {@link TmPkgSetHdrService#searchByKey(TmPkgSetHdrCriteriaDomain)}を呼出
     *     対象レコードが存在しない場合エラー
     *     
     * - G/Wの取得
     *     - CML単位変換
     *         以下を引数にして、{@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *           - 変換する値:{@link W2014XtagDao#searchTtPltzByWeight(W2014PltzCriteriaDomain)}の結果のSUM(grossWeight/グロス重量)
     *           - 変換前の単位:{@link W2014XtagDao#searchTtPltzByWeight(W2014PltzCriteriaDomain)}の結果　※１
     *           - 変換後の単位:criteriaの重量単位コード　※２
     *           
     *       外装材の単位変換
     *         以下を引数にして、{@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *           - 変換する値:{@link W2014XtagDao#searchTmPkgSetDtl(W2014PltzCriteriaDomain)}の結果のvolume/容積
     *           - 変換前の単位:{@link W2014XtagDao#searchTmPkgSetDtl(W2014PltzCriteriaDomain)}の結果
     *           - 変換後の単位:上記※２
     *           
     *       CMLの重量と外装材の重量を合計する
     *           
     * - N/Wの取得
     *       CML単位変換
     *         以下を引数にして、{@link CommonService#convertWeightUnit(BigDecimal, String, String)}を呼出
     *           - 変換する値:{@link W2014XtagDao#searchTtPltzByWeight(W2014PltzCriteriaDomain)}の結果のSUM(netWeight/ネット重量)
     *           - 変換前の単位:上記※１
     *           - 変換後の単位:上記※２
     * 
     * - 登録処理(まとめパレタイズ)
     *     {@link TtXpltzDomain}に以下を設定
     *       - dscId/DSC-ID
     *       - criteriaの値
     *       - 上記まとめパレタイズNo.の取得の結果
     *       - 上記G/Wの取得の結果
     *       - 上記N/Wの取得の結果
     *       - 上記の外装材の単位変換後の値
     *     {@link TtXpltzService#create(TtXpltzDomain)}を呼出
     * 
     * - 削除処理(まとめパレタイズワーク)
     *     {@link TwXpltzCriteriaDomain}に以下を設定して、
     *     {@link TwXpltzService#deleteByCondition(TwXpltzCriteriaDomain)}を呼出
     *       - dscId/DSC-ID
     *       
     * - 更新処理(パレタイズ)
     *     {@link W2014PltzDomain}のリストに以下を設定
     *       - mainMark/メインマーク
     *       - 上記まとめパレタイズNo.の取得の結果
     *     {@link W2014XtagDao#updateTtPltzByXmainMark(W2014PltzDomain, List)}を呼出
     *       
     * - 再検索
     * </pre>
     * 
     * @param xtag X-Palletize domain<br />まとめパレタイズドメイン
     * @return X-Palletize domain<br />まとめパレタイズドメイン
     * @throws ApplicationException When access is impossible for a X Palletize, a Palletize, and a X Palletize Work<br />まとめパレタイズ、パレタイズ、まとめパレタイズワークにアクセスができない場合
     */ 
    public W2014XtagDomain transactOnRegister(W2014XtagDomain xtag) throws ApplicationException;
    
    /**
     * Cancel X-Palletize relation.
     * <br />まとめパレタイズ関連のキャンセルを行います。
     * <pre>
     * - Delete process (X Palletize)
     *       The following is set as {@link TtXpltzCriteriaDomain} from xtag.
     *         - xmainMark / X-TAG
     *       This is a call about {@link TtXpltzService#deleteByCondition(TtXpltzCriteriaDomain)}.
     *
     * - Update process (Palletize)
     *       The following is set to the list of {@link W2014PltzDomain}.
     *         - Result of acquisition of above-mentioned X-Palletize No.
     *       This is a call about {@link W2014XtagDao#updateTtPltzByXmainMark(W2014PltzDomain, List)}.
     * 
     * - 削除処理(まとめパレタイズ)
     *     xtagより{@link TtXpltzCriteriaDomain}に以下を設定
     *       - xmainMark/まとめメインマーク
     *     {@link TtXpltzService#deleteByCondition(TtXpltzCriteriaDomain)}を呼出
     *       
     * - 更新処理(パレタイズ)
     *     {@link W2014PltzDomain}のリストに以下を設定
     *       - 上記まとめパレタイズNo.の取得の結果
     *     {@link W2014XtagDao#updateTtPltzByXmainMark(W2014PltzDomain, List)}を呼出
     * </pre>
     * 
     * @param xtag X-Palletize domain<br />まとめパレタイズドメイン
     * @throws ApplicationException When access is impossible for a X Palletize, a Palletize, and a X Palletize Work<br />まとめパレタイズ、パレタイズにアクセスできない場合
     */ 
    public void transactOnRegisterCancel(W2014XtagDomain xtag) throws ApplicationException;
    
    // -------------------------------- Print system method print ---------------------------------------------------------
    // -------------------------------- プリント系メソッド print ---------------------------------------------------------
    /**
     * Create CML(X).
     * <br />CML(X)を作成します。
     * <pre>
     * - A create of PDF list
     *       {@link L2004ReportService#searchXtag(String, String, String)} is called, and a PDF list is created.
     * 
     * - PDF帳票の作成
     *     {@link L2004ReportService#searchXtag(String, String, String)}を呼出し、PDF帳票を作成する
     * </pre>
     * 
     * 
     * @param criteria X-Palletize search-condition domain<br />まとめパレタイズ検索条件ドメイン
     * @return PDF list<br />PDF帳票
     * @throws ApplicationException When a PDF list cannot be created<br />PDF帳票が作成できない場合
     */
    public File printOnRegisterPrintTag(W2014XtagCriteriaDomain criteria) throws ApplicationException;
}