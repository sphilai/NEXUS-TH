/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のServiceインターフェース
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.business.domain.W1001ExpRequestDomain;
import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1003UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.W1004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W1001ExpRequestCriteriaDomain;
import com.globaldenso.eca0027.core.business.ws.Ws9002RestService;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;


/**
 * W1001ExpRequest のServiceインターフェースです。<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/27 14:08:11<BR>
 * 
 * テーブル定義から2558/04/27に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public interface W1001ExpRequestService {

    
    /**
     * <<ページング処理用>>
     * 任意の条件を元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * 
     * @param criteria ttExpRequestの CriteriaDomain クラス
     * @return ttExpRequestのDomainクラスのList
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public List<W1001ExpRequestDomain> searchByConditionForPaging(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;

    /**
     * 任意の条件を元にテーブルのデータを検索し、検索結果件数を返却します。
     * 
     * @param criteria ttExpRequestの CriteriaDomain クラス
     * @return int 検索結果件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int searchCount(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.service.W1001ExpRequestService#validateConsistencyShipperPlantAuth(java.lang.String, java.lang.String)
     */
    public boolean validateConsistencyShipperPlantAuth(String shipperCd, String plntCd) throws ApplicationException ;
    /**
     * 主キーを条件にデータを検索し、検索結果を返却します。
     * 
     * <pre>
     * 更新前処理のレコード取得は当SQLを使用して下さい。
     * 
     * SearchByKeyと違い、検索条件に主キー以外の項目も含まれています。
     * </pre>
     * 
     * @param criteria ttExpRequestの CriteriaDomain クラス
     * @return ttExpRequestのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public W1001ExpRequestDomain searchByKeyForChange(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;

    /**
     * データを登録します。
     * 
     * @param domain ttExpRequestのDomainクラス
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public void create(W1001ExpRequestDomain domain) throws ApplicationException;

    /**
     * 主キーを条件に、データを更新します。
     * 
     * @param domain ttExpRequestのDomainクラス
     * @return 更新件数
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     */
    public int update(W1001ExpRequestDomain domain) throws ApplicationException;

    
    /**
     * Check correlation of EXPORT REQUEST DATE
     * <br />梱包指示日の相関チェックを行います。
     * <pre>
     * - Correlative check of the EXPORT REQUEST DATE
     *     Check when both of EXPORT REQUEST DATE(From) and EXPORT REQUEST DATE(To) are inputted
     *     For details, refer sheet "機能仕様共通：日付 From - To の相関チェック" of 共通仕様.xls
     * 
     * - 梱包指示日の相関チェック
     *     梱包指示日(From)と梱包指示日(To)の両方が入力された場合にチェックを行う。
     *     詳細は共通仕様.xls「機能仕様共通：日付 From - To の相関チェック」を参照
     * </pre>
     * 
     * 
     * @param updateDtFrom - EXPORT REQUEST DATE(From)
     * @param updateDtTo EXPORT REQUEST DATE(To)
     * @param dateFormat - Date format
     * @return True if there is no error in the input value, otherwise false
     */
    public boolean validateConsistencyFmUpdateToUpdate(String updateDtFrom, String updateDtTo, String dateFormat);
    
    /**
     * Get search results data
     * @param expRequest <br />
     * 検索条件ドメイン
     * @return that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public int transactOnUpload(List<W1001ExpRequestDomain> expRequest) throws ApplicationException;
    
    /**
     * Get search results data
     * @param expRequest <br />
     * 検索条件ドメイン
     * @return that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W1002CriteriaDomain transactOnRegister(W1001ExpRequestDomain expRequest) throws ApplicationException;
    
    /**
     * Get search results data
     * @param expRequest <br />
     * 検索条件ドメイン
     * @return that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W1002CriteriaDomain transactOnEdit(W1001ExpRequestDomain expRequest) throws ApplicationException;
    
    /**
     * Get search results data
     * @param expRequest <br />
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public void transactOnCancel(W1001ExpRequestDomain expRequest) throws ApplicationException;
    
    /**
     * Get search results data
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return that holds the screen information<br />
     * 画面情報を保持するドメイン
     * @throws ApplicationException If an exception occurs<br />
     * 例外が発生した場合
     */
    public W1002CriteriaDomain searchOnEditInit(W1001ExpRequestCriteriaDomain criteria) throws ApplicationException;
    
    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param addBlank boolean
     * @return SelectListItemDomain List
     * @throws ApplicationException Exception
     */
    public List<? extends SelectListItemDomain> searchCntryCdPullDownList(
        boolean addBlank) throws ApplicationException;
    
    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param w1001ExpRequestCriteriaDomain W1001ExpRequestCriteriaDomain
     * @return containerSortingKey String
     * @throws ApplicationException If an exception occurs<br />
     */
    public String searchContSortKey(
        W1001ExpRequestCriteriaDomain w1001ExpRequestCriteriaDomain) throws ApplicationException;
    
    /**
     * Get the NEXUS Company Master 
     * <br />NEXUSไผ�็คพๅ��ๅ��ไฝ�ใ�’ๅ�–ๅพ—ใ�—ใ�พใ��ใ€�
     *
     * @param compCd - COMPANY CODE
     * @return NEXUS Company Master
     * @throws ApplicationException - If an error occurred during searching NEXUS Company Master
     */
    public TmNxsCompDomain searchNxsComp(String compCd) throws ApplicationException;
    
    /**
     * Check the shipping company existence check
     * <br />Shipper存在チェックを行います。
     * <pre>
     * More common specification xls: see "Common Shipper functional specifications presence check"
     *
     * 詳細は共通仕様.xls「機能仕様共通：Shipper存在チェック」を参照
     * </pre>
     *
     * @param compCd Company code
     * @return True, false and otherwise company code exists in the company NEXUS basic unit as the shipping company
     * @throws ApplicationException If the company NEXUS basic unit can not browse
     */
    public boolean validateDatabaseShipper(String compCd) throws ApplicationException;
    
    /**
     *    Web service "ECA0027_WS_9002:Get Plant Info" is called.
     * <br />Webサービス「ECA0027_WS_9002：Get Plant Info」のコールを行います。
     * <pre>
     * - Get Plant Info
     *       Each argument is made into an argument,
     *       This is a call about Web service (WS9002) {@link Ws9002RestService#getPlantInfo (String, String)}.
     *
     * - Get Plant Info
     *     各引数を引数にして、
     *     Webサービス(WS9002){@link Ws9002RestService#getPlantInfo(String, String)}を呼出
     * </pre>
     * 
     * @param shipperCd shipper cd
     * @param plntCd plant cd
     * @return If an error does not occur in Web service (WS9002), they are true, otherwise, false.<br />Webサービス(WS9002)でエラーが発生しなければtrue、そうでなければfalse
     * @throws ApplicationException it does not expect by Web service (WS9002) -- the case where an error occurs<br />Webサービス(WS9002)で予期せぬエラーが発生した場合
     */
    public boolean validateDatabaseWs9002OnContensOfABoxRegister(String shipperCd, String plntCd)
        throws ApplicationException;
    
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
     * <p>
     * Validate Combination Company Code ,W/H Code ,Shipper
     * </p>
     * @param compCd String
     * @param whCd String
     * @param shipper String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseWhCompanyWhShipper(String compCd, String whCd, String shipper)
        throws ApplicationException;
    /**
     * <p>
     * Validate Combination Company Code ,W/H Code ,Shipper Of Denso Group
     * </p>
     * @param compCd String
     * @param whCd String
     * @param shipper String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseSupplierWhCompanyWhShipper(String compCd, String whCd, String shipper)
        throws ApplicationException;
    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param expRequestNo String
     * @param expRequestItemId String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseKitIsEmpty(String expRequestNo, String expRequestItemId)
        throws ApplicationException;
    
    /**
     * 
     * <p>Type in the functional overview of the method.</p>
     *
     * @param expRequestNo String
     * @param expRequestItemId String
     * @return return boolean
     * @throws ApplicationException ApplicationException
     */
    public boolean validateDatabaseKitIsCommercial(String expRequestNo, String expRequestItemId)
        throws ApplicationException;
    
    /**
     * 
     * File existence check.
     * <br />ファイル存在チェックを行います。
     * <pre>
     * - File existence check.
     *   Check the specified file exists.
     * </pre>
     * <pre>
     * ‐ファイル存在チェック
     *     指定したファイルが存在するかチェックします。
     * </pre>
     * 
     * @param fileSize upload file size<br />
     * アップロードするファイルのファイルサイズ
     * @return True:file exists, false:other<br />
     * ファイルが存在していればtrue、それ以外はfalse
     */
    public boolean validateConsistencyFileExistence(int fileSize);
        
    /**
     * 
     * File path input check.
     * <br />ファイルパス入力チェックを行います。
     * <pre>
     * - File path input check.
     *   Check the effectiveness of the file-pass.
     * </pre>
     * <pre>
     * ‐ファイルパス入力チェック
     *     アップロードされたファイルが取得できるかチェックします（ファイル名が空白かどうか）
     * </pre>
     * 
     * @param fileName FileName to be uploaded<br />
     * アップロードするファイルのファイル名 
     * @return True:file-pass OK, false:other <br />
     * ファイルが指定されていればtrue、それ以外はfalse
     */
    public boolean validateConsistencyFilePathInput(String fileName);
    
    /**
     * 
     * File size check.
     * <br />ファイルサイズチェックを行います。
     * <pre>
     * - File size check.
     *   Check the uploaded file size (less than 5MB).
     * </pre>
     * <pre>
     * ‐ファイルサイズチェック
     *     アップロードするファイルのサイズが5MBを超えていないかチェックします。
     * </pre>
     * 
     * @param fileSize uploaded file size<br />
     * アップロードするファイルのファイルサイズ
     * @return True:file-size less than 5MB, false:other<br />
     * 5MBを超えていなかればtrue、それ以外はfalse
     */
    public boolean validateConsistencyFileSize(int fileSize);

    /**
     * @param updateDomain Search-condition domain<br />検索条件ドメイン
     * @return Search number <br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W1003UpdateDomain searchOnDetailInit(W1003UpdateDomain updateDomain) throws ApplicationException;
    
    /**
     * @param updateDomain W1003UpdateDomain<br />検索条件ドメイン
     * @return updateDomain W1003UpdateDomain <br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W1003UpdateDomain transactOnDetailSave(W1003UpdateDomain updateDomain) throws ApplicationException;
    
    /**
     * @param updateDomain W1003UpdateDomain<br />検索条件ドメイン
     * @return updateDomain W1003UpdateDomain <br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W1003UpdateDomain transactOnDetailDelete(W1003UpdateDomain updateDomain) throws ApplicationException;
    
    /**
     * @param updateDomain Search-condition domain<br />検索条件ドメイン
     * @return Search number <br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W1004UpdateDomain searchOnKitDetailInit(W1004UpdateDomain updateDomain) throws ApplicationException;

    /**
     * @param updateDomain W1004UpdateDomain<br />検索条件ドメイン
     * @return updateDomain W1004UpdateDomain <br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W1004UpdateDomain transactOnKitDetailSave(W1004UpdateDomain updateDomain) throws ApplicationException;

    /**
     * @param updateDomain W1003UpdateDomain<br />検索条件ドメイン
     * @return updateDomain W1003UpdateDomain <br />検索件数
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public W1004UpdateDomain transactOnKitDetailDelete(W1004UpdateDomain updateDomain) throws ApplicationException;
    /**
     * @param value boolean<br />
     * @param value2 boolean<br />
     * @return List<? extends SelectListItemDomain> <br />
     * @throws ApplicationException When an error occurs in processing of DB <br />DBの処理でエラーが発生した場合
     */
    public List<? extends SelectListItemDomain> searchUnitOfVolumePullDownList(boolean value, boolean value2) throws ApplicationException;
}

