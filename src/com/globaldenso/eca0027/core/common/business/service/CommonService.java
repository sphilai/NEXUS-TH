/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.business.service;

import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.library.webservicecallrest.domain.WebServiceCallerRestDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VtCompMeasureUnitDomain;
import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * Common Service interface 
 * <br />共通のServiceインターフェースです。
 * <pre>
 * bean id: commonService
 * </pre>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public interface CommonService {

    /**
     * Get resource that corresponding to the specified key.
     * <br />指定されたキーに対応するリソースを取得します。
     * <pre>
     * Get the resources that are specified by using the resource acquisition function of GSCM
     * GSCMのリソース取得機能を利用して指定されたリソースを取得します。
     * </pre>
     * 
     * @param locale - locale of the resource
     * @param key - key of the resource
     * @return value of the resource
     */
    public String getResource(Locale locale, String key);
    
    /**
     * [Pull-down No.1] Get a list of pull-down from the Code Master
     * <br />【プルダウンNo.1】コードマスタよりプルダウンのリストを取得します。
     * 
     * @param cdType - Code Type (null, Not blank)
     * @param langCd - LANGUAGE CODE
     * @param dispType - Display type (1:only code, 2:only value, 3:code and value)
     * @param addBlank - flag of adding blank line
     * @return list of pull-down
     * @throws ApplicationException - If an error occurred during the search of the Code Master
     */
    public List<? extends SelectListItemDomain> searchPullDownList(String cdType, String langCd, 
        int dispType, boolean addBlank) throws ApplicationException;

    /**
     * [Pull-down No.2] Get a list of the pull-down from the time zone management
     * <br />【プルダウンNo.2】タイムゾーン管理よりプルダウンのリストを取得します。
     *
     * @param addBlank - flag of adding blank line
     * @return list of pull-down
     * @throws ApplicationException - If an error occurred during the search of the time zone management
     */
    public List<? extends SelectListItemDomain> searchTimezonePullDownList(
        boolean addBlank) throws ApplicationException;
    
    /**
     * [Pull-down No.5] Get a list of the pull-down from the Currency Master
     * <br />【プルダウンNo.5】通貨原単位よりプルダウンのリストを取得します。
     *
     * @param dispCode - display flag of code
     * @param addBlank - flag of adding blank line
     * @return list of pull-down
     * @throws ApplicationException - If an error occurred during the search of the Currency Master
     */
    public List<? extends SelectListItemDomain> searchCurrencyPullDownList(
        boolean dispCode, boolean addBlank) throws ApplicationException;
    
    /**
     * [Pull-down No.3] Get a list of the pull-down from the Invoice Template Master
     * <br />【プルダウンNo.3】船積書類テンプレート原単位よりプルダウンのリストを取得します。
     *
     * @param nxsCompCd - COMPANY CODE (null, Not blank)
     * @param addBlank - flag of adding blank line
     * @return list of pull-down
     * @throws ApplicationException - If an error occurred during the search of the Invoice Template Master
     */
    public List<? extends SelectListItemDomain> searchInvTemplatePullDownList(String nxsCompCd,
        boolean addBlank) throws ApplicationException;
    
    
    /**
     * [Pull-down No.4] Get a list of the pull-down from the Export Regulate Type
     * <br />【プルダウンNo.4】輸出規制区分原単位よりプルダウンのリストを取得します。
     *
     * @param nxsCompCd - COMPANY CODE
     * @param dispCode - Display flag of code
     * @param addBlank - flag of adding blank line
     * @return list of pull-down
     * @throws ApplicationException - If an error occurred during the search of the Export Regulate Type
     * 輸出規制区分原単位の検索でエラーが発生した場合
     */
    public List<? extends SelectListItemDomain> searchExpRegulationTypePullDownList(String nxsCompCd,
        boolean dispCode, boolean addBlank) throws ApplicationException;

    /**
     * [Pull-down No.6] Get a list (volume) of the pull-down from the Measure Unit Master
     * <br />【プルダウンNo.6】計量単位原単位よりプルダウンのリスト(容積)を取得します。
     *
     * @param dispCode - Display flag of code
     * @param addBlank - flag of adding blank line
     * @return list of pull-down
     * @throws ApplicationException - If an error occurred during the search of the Measure Unit Master
     */
    public List<? extends SelectListItemDomain> searchUnitOfVolumePullDownList(
        boolean dispCode, boolean addBlank) throws ApplicationException;

    /**
     * [Pull-down No.6] Get a list (weight) of the pull-down from the Measure Unit Master
     * <br />【プルダウンNo.6】計量単位原単位よりプルダウンのリスト(重量)を取得します。
     *
     * @param dispCode - Display flag of code
     * @param addBlank - flag of adding blank line
     * @return list of pull-down
     * @throws ApplicationException - If an error occurred during the search of the Measure Unit Master
     */
    public List<? extends SelectListItemDomain> searchUnitOfWeightPullDownList(
        boolean dispCode, boolean addBlank) throws ApplicationException;

    /**
     * [Pull-down No.7] Get a list of the pull-down from the Transportation Type Master
     * <br />【プルダウンNo.7】輸送手段種別原単位よりプルダウンのリストを取得します。
     *
     * @param addBlank - flag of adding blank line
     * @return list of pull-down
     * @throws ApplicationException - If an error occurred during the search of the Transportation Type Master
     */
    public List<? extends SelectListItemDomain> searchTransTypePullDownList(
        boolean addBlank) throws ApplicationException;
    
    /**
     * [Common Specifications No.5] Set the common properties of the domain  (for registration)
     * <br />【共通仕様No.5】ドメインの共通プロパティを設定します。(登録用)
     *
     * @param domain - Domain to be registered
     * @param funcId - Function ID
     */
    public void setCommonPropertyForRegist(AbstractDomain domain, String funcId);
    
    /**
     * [Common Specifications No.6] Set the common properties of the domain  (for Update)
     * <br />【共通仕様No.6】ドメインの共通プロパティを設定します。(更新用)
     *
     * @param domain - Domain to be updated
     * @param funcId - Function ID
     */
    public void setCommonPropertyForUpdate(AbstractDomain domain, String funcId);
    
    /**
     * [Common Specifications No.10] Check that the start date is earlier than the end date
     * <br />【共通仕様No.10】日付の相関チェック(開始日付 <= 終了日付)を行います。
     *
     * @param dateFormat - Date format
     * @param fromDate - the start date
     * @param toDate - the end date
     * @return true or false
     */
    public boolean validateFromToDate(String dateFormat, String fromDate, String toDate);
    
    /**
     * [Common Specifications No.10] Check that the start date is earlier than the end date
     * <br />【共通仕様No.10】日付の相関チェック(開始日付 <= 終了日付)を行います。
     *
     * @param fromDate - the start date
     * @param toDate - the end date
     * @param locale - locale
     * @param formatKey - resource key of date format
     * @return true or false
     */
    public boolean validateFromToDate(String fromDate, String toDate, Locale locale,
        String formatKey);
    
    /**
     * [Common Specifications No.13] Get a value of sequentially numbered in accordance with a key from the Sequence Master
     * <br />【共通仕様No.13】採番原単位からキーに応じた連番付きの値を取得します。
     *
     * @param seqKey - Numbering key
     * @param seqTyp - Numbering type
     * @param num - The number of serial number to get
     * @param funcId - function ID
     * @return - Serial number that is filled 0
     * @throws ApplicationException - If the serial number can not be obtained from the Sequence Master
     */
    public List<String> transactSequence(String seqKey, String seqTyp, int num, String funcId) 
        throws ApplicationException;
    
    /**
     * [Common Specifications No.16] Check the combination of company, customer and NEXUS Ship To
     * <br />【共通仕様No.16】会社、得意先、送荷先の組み合わせチェックを行います。
     * 
     * @param lgcyLibCompCd - COMPANY CODE
     * @param customerCd - CUSTOMER CODE
     * @param lgcyShipToCd - SHIP TO CODE
     * @return true if the combination is exist in CIGMA Ship To Cross Reference Master, otherwise false
     * @throws ApplicationException - If CIGMA Ship To Cross Reference Master can not be queried
     */
    public boolean validateShipperCustomerShipTo(String lgcyLibCompCd, String customerCd, 
        String lgcyShipToCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.17] Check the combination of company, warehouse and plant code
     * <br />【共通仕様No.17】会社、W/H、工場コードの組み合わせチェックを行う。
     *
     * @param lgcyLibCompCd - COMPANY CODE
     * @param lgcyWhCd - WAREHOUSE CODE
     * @param plantCd - PLANT CODE
     * @return true if the combination is exist in CIGMA Warehouse Cross Reference Master, otherwise false
     * @exception ApplicationException - if CIGMA Warehouse Cross Reference Master can not be queried
     */
    public boolean validateShipperWhPlant(String lgcyLibCompCd, String lgcyWhCd, String plantCd)
        throws ApplicationException;

    /**
     * [Common Specifications No.20] Check the combination of warehouse company and warehouse
     * <br />【共通仕様No.20】W/H会社、W/Hの組み合わせチェックを行う。
     *
     * @param compCd - COMPANY CODE
     * @param whCd - WAREHOUSE CODE
     * @return true if the combination is exist in NEXUS Warehouse Master, otherwise false
     * @throws ApplicationException - if NEXUS Warehouse Master can not be queried
     */
    public boolean validateCompWh(String compCd, String whCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.21] check the precision and scale of decimal value
     * <br />【共通仕様No.21】小数値の精度とスケールのチェックを行う。
     *
     * @param value - inputted value
     * @param precision - accuracy (number of integer digits)
     * @param scale - scale (Number of digits after the decimal point)
     * @return true or false
     */
    public boolean validateNumber(String value, int precision, int scale);
    
    /**
     * [Common Specifications No.24] convert unit (for weight unit)
     * <br />【共通仕様No.24】単位変換を行う。(重量単位用)
     *
     * @param value - value to convert (not null)
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @return value that converted (set null if the integer portion is overflow) 
     * @throws ApplicationException - if Unit Of Measure Conversion Item Master (for decimal) can not be queried
     */
    public BigDecimal convertWeightUnit(BigDecimal value, String fromUnitCd, String toUnitCd)
        throws ApplicationException;
    
    /**
     * [Common Specifications No.24] convert unit (for volume unit)
     * <br />【共通仕様No.24】単位変換を行う。(容積単位用)
     *
     * @param value - value to convert (not null)
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @return value that converted (set null if the integer portion is overflow)
     * @throws ApplicationException - if Unit Of Measure Conversion Item Master (for decimal) can not be queried
     */
    public BigDecimal convertVolumeUnit(BigDecimal value, String fromUnitCd, String toUnitCd)
        throws ApplicationException;
    
    /**
     * [Common Specifications No.24] convert unit (for length unit)
     * <br />【共通仕様No.24】単位変換を行う。(長さ単位用)
     *
     * @param value - value to convert (not null)
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @return value that converted (set null if the integer portion is overflow)
     * @throws ApplicationException - if Unit Of Measure Conversion Item Master (for decimal) can not be queried
     */
    public BigDecimal convertLengthUnit(BigDecimal value, String fromUnitCd, String toUnitCd)
        throws ApplicationException;
    
    /**
     *   A [common-specifications No.44] overflow check is performed.(For WEIGHTs)
     * <br />【共通仕様No.44】桁溢れチェックを行う。(重量用)
     *
     * @param weight WEIGHT<br />重量
     * @return When overflow is being carried out, this is true, and this is false except it.<br />桁溢れしている場合はtrue、それ以外はfalse
     */
    public boolean isWeightOverflow(BigDecimal weight);

    /**
     *   A [common-specifications No.44] overflow check is performed.(For length)
     * <br />【共通仕様No.44】桁溢れチェックを行う。(長さ用)
     *
     * @param length Length<br />長さ
     * @return When overflow is being carried out, this is true, and this is false except it.<br />桁溢れしている場合はtrue、それ以外はfalse
     */
    public boolean isLengthOverflow(BigDecimal length);
    
    /**
     *   A [common-specifications No.44] overflow check is performed.(For VOLUMEs)
     * <br />【共通仕様No.44】桁溢れチェックを行う。(容積用)
     *
     * @param volume VOLUME<br />容積
     * @return When overflow is being carried out, this is true, and this is false except it.<br />桁溢れしている場合はtrue、それ以外はfalse
     */
    public boolean isVolumeOverflow(BigDecimal volume);
    
    /**
     *   A [common-specifications No.44] overflow check is performed.(For LOADING RATIOs)
     * <br />【共通仕様No.44】桁溢れチェックを行う。(積載率用)
     *
     * @param loadingRatio LOADING RATIO<br />積載率
     * @return When overflow is being carried out, this is true, and this is false except it.<br />桁溢れしている場合はtrue、それ以外はfalse
     */
    public boolean isLoadingRatioOverflow(BigDecimal loadingRatio);
    
    /**
     * [Common Specifications No.25] Past date Check <br />
     * (The date specified is earlier than the system date that was converted to the time zone specified)
     * <br />【共通仕様No.25】過去日チェック(指定された日付が、指定されたタイムゾーンに
     * 変換したシステム日付より過去でないこと)を行う。
     *
     * @param date - the date specified
     * @param dateFormat - date format
     * @param timezoneId - time zone ID
     * @return true or false
     */
    public boolean validateAfterDate(String date, String dateFormat, String timezoneId);
    
    /**
     * [Common Specifications No.25] Past date Check <br />
     * (The date specified is earlier than the system date that was converted to the time zone specified)
     * <br />【共通仕様No.25】過去日チェック(指定された日付が、指定されたタイムゾーンに
     * 変換したシステム日付より過去でないこと)を行う。
     * <br />
     * <pre>
     * Get the time zone ID from NEXUS Company Master
     * タイムゾーンIDはNEXUS会社原単位から取得する。
     * </pre>
     *
     * @param date - specified date
     * @param dateFormat - date format
     * @param compCd - COMPANY CODE
     * @return true or false
     * @throws ApplicationException - if NEXUS Company Master can not be queried
     */
    public boolean validateAfterDateComp(String date, String dateFormat, String compCd)
        throws ApplicationException;
    
    /**
     * [Common Specifications No.26] Check for the presence of Consignee
     * <br />【共通仕様No.26】Consignee存在チェックを行います。
     *
     * @param compCd COMPANY CODE
     * @return true or false
     * @throws ApplicationException - if NEXUS Company Master can not be queried
     */
    public boolean validateConsignee(String compCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.27] Check for the presence of NEXUS Ship To
     * <br />【共通仕様No.27】NEXUS送荷先存在チェックを行います。
     *
     * @param shipTo - Ship To 
     * @return true or false
     * @throws ApplicationException - if NEXUS Ship To Master can not be queried
     */
    public boolean validateShipTo(String shipTo) throws ApplicationException;
    
    /**
     * [Common Specifications No.28] Check for the presence of OUTER CODE
     * <br />【共通仕様No.28】外装コード存在チェックを行います。
     *
     * @param ownerComp - COMPANY CODE
     * @param outerCd - OUTER CODE
     * @return true or false
     * @throws ApplicationException - if PKG Set MA can not be queried
     */
    public boolean validateOuterCd(String ownerComp, String outerCd)
        throws ApplicationException;
    
    /**
     * [Common Specifications No.31] Get the CIGMA ADS
     * <br />【共通仕様No.31】CIGMA ADSを取得します。
     *
     * @param compCd - COMPANY CODE
     * @return CIGMA ADS
     * @throws ApplicationException - If an error occurred during the search of CIGMA Environment Master
     */
    public Date searchCigmaAds(String compCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.33] Get the availability of CIGMA
     * <br />【共通仕様No.33】CIGMAの利用可否を取得します。
     *
     * @param isShipping24hFunc - '24H shipping corresponding function'=true / '24H shipping non'-function=false
     * @param compCd - COMPANY CODE
     * @return true if CIGAM nightly batch is running, otherwise false
     * @throws ApplicationException - If an error occurred during the search of CIGMA Environment Master
     */
    public boolean searchCigmaAvailable(boolean isShipping24hFunc, String compCd) 
        throws ApplicationException;
    
    /**
     * Get the night flag for WS2005 Web Service parameter
     * <br />WebサービスWS2005に渡す夜間フラグを取得します。
     * 
     * @param compCd COMPANY CODE<br />会社コード
     * @return This is Y, if this is N and 3 when the ACCESSIBILITY TYPE of a CIGMA Environment Master is 1.<br />CIGMA環境原単位の利用可能区分が1であればN、3であればY
     * @throws ApplicationException When a CIGMA Environment Master is unacquirable<br />CIGMA環境原単位が取得できない場合
     */
    public String searchCigmaNightFlg(String compCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.34] Check the existence of the company
     * <br />【共通仕様No.34】会社存在チェックを行います。
     *
     * @param compCd - COMPANY CODE
     * @return true or false
     * @throws ApplicationException - if NEXUS Company Master can not be queried
     */
    public boolean validateCompCd(String compCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.35] Check the existence of the shipper
     * <br />【共通仕様No.35】荷主存在チェックを行います。
     *
     * @param compCd - COMPANY CODE
     * @return true or false
     * @throws ApplicationException - If the COMPANY CODE is not defined in the NEXUS Company Master as a shipper
     */
    public boolean validateShipper(String compCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.36] Check the existence of the customers broker
     * <br />【共通仕様No.36】通関代理店存在チェックを行います。
     *
     * @param compCd - COMPANY CODE
     * @return true or false
     * @throws ApplicationException - if NEXUS Company Master can not be queried
     */
    public boolean validateCustomsBroker(String compCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.37] Check the existence of the carrier
     * <br />【共通仕様No.37】運送会社存在チェックを行います。
     *
     * @param compCd - COMPANY CODE
     * @return true or false
     * @throws ApplicationException - if NEXUS Company Master can not be queried
     */
    public boolean validateCarrier(String compCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.38] Check the existence of the country
     * <br />【共通仕様No.38】国存在チェックを行います。
     *
     * @param cntryCd - COUNTRY CODE
     * @return true or false
     * @throws ApplicationException - if Country Master can not be queried
     */
    public boolean validateCountry(String cntryCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.39] Check the existence of the port
     * <br />【共通仕様No.39】港存在チェックを行います。
     *
     * @param portCd - PORT CODE
     * @param cntryCd - COUNTRY CODE
     * @return true or false
     * @throws ApplicationException - if Port Master can not be queried
     */
    public boolean validatePort(String portCd, String cntryCd) throws ApplicationException;
    
    /**
     * [Common Specifications No.41] Check the association of PACKAGE CODE
     * <br />【共通仕様No.41】包装コード関連チェックを行います。
     *
     * @param pkgCd - PACKAGE CODE
     * @param itemNoGrp - ITEM NO GROUP
     * @return true or false
     */
    public boolean validatePkgCd(String pkgCd, String itemNoGrp);
    
    /**
     * [Common Specifications No.42] Get the domain to use for CIGMA Web service call
     * <br />【共通仕様No.42】CIGMA Webサービス呼出しに使用するドメインを取得します。
     * <pre>
     * The Web service call domain is set URL, user ID, ​​password and library name
     * Webサービス呼出しドメインには、URL、ユーザID、パスワード、ライブラリ名が
     * 設定されています。
     * </pre>
     *
     * @param compCd - COMPANY CODE
     * @param webServicePath - Path of the Web Service
     * @return Web service call domain
     * @throws ApplicationException - If CIGMA is not available
     */
    public WebServiceCallerRestDomain searchCigmaWebServiceCallerRestDomain(String compCd,
        String webServicePath) throws ApplicationException;
    
    /**
     * Get the time zone ID of the company
     * <br />会社のタイムゾーンIDを取得します。
     *
     * @param compCd - COMPANY CODE
     * @return time zone ID
     * @throws ApplicationException - If an error occurred during the search of NEXUS Company Master
     */
    public String searchTimezone(String compCd) throws ApplicationException;
    
    /**
     * Get the weight unit of company
     * <br />会社の重量単位を取得します。
     *
     * @param compCd - COMPANY CODE
     * @return WEIGHT UNIT
     * @throws ApplicationException - If an error occurred during the search of NEXUS Company Master
     */
    public String searchWeightUnit(String compCd) throws ApplicationException;
    
    /**
     * Get the length unit of company
     * <br />会社の長さ単位を取得します。
     *
     * @param compCd - COMPANY CODE
     * @return LENGTH UNIT
     * @throws ApplicationException - If an error occurred during the search of NEXUS Company Master
     */
    public String searchLengthUnit(String compCd) throws ApplicationException;
    
    /**
     * Get the volume unit of company
     * <br />会社の容積単位を取得します。
     *
     * @param compCd - COMPANY CODE
     * @return VOLUME UNIT
     * @throws ApplicationException - If an error occurred during the search of NEXUS Company Master
     */
    public String searchVolumeUnit(String compCd) throws ApplicationException;
    
    /**
     * get Measure Unit of the company and UNIT DISPLAY
     * <br />会社の計量単位および単位表記を取得します。
     *
     * @param compCd - COMPANY CODE
     * @return Measure Unit and UNIT DISPLAY
     * @throws ApplicationException - If an error occurred during the search of Measure Unit Master
     */
    public VtCompMeasureUnitDomain searchMeasureUnit(String compCd) throws ApplicationException;
    
    /**
     * Get the display name for unit code
     * <br />指定された計量単位の単位表記を取得します。
     *
     * @param unitCd unit code
     *        <br />単位コード
     * @return the dispaly name
     *         <br />単位表記
     * @throws ApplicationException - If an error occurred during the search of Measure Unit Master
     *                              <br />計量単位が取得できない場合
     */
    public String searchMeasureUnitDisp(String unitCd) throws ApplicationException;
    
    /**
     * Print PDF document from the printer
     * <br />PDF帳票をプリンタから印刷します。
     *
     * @param pdf - PDF document to print
     * @param copy - output number of copies
     * @param printer - target printer
     * @throws ApplicationException - if failure to print
     */
    public void printPdf(File pdf, int copy, String printer) throws ApplicationException;
    
    /**
     * Combine PDF documents specified into one file
     * <br />指定されたPDFドキュメントを一つのファイルに結合します。
     *
     * @param name - the name of PDF document that combined (without the extension)
     * @param pdfFileList - PDF document for Combine
     * @return PDF document Combined
     */
    // UT304 MULTI LABEL ADD START
    //public File mergePdf(String name, InputStream... srcDocumentList);
    public File mergePdf(String name, File... pdfFileList);
    // UT304 MULTI LABEL ADD END

    // UT186 ZIP DOWNLOAD ADD
    /**
     * Archives the documents that have been specified in the file ID to one of the ZIP file.
     * <br />ファイルIDで指定されたドキュメントを一つのZIPファイルにまとめます。
     * 
     * File names of the respective entry and file name registered in the file manager.
     * Delete is necessary in order to create a temporary file.
     * 各エントリののファイル名はファイルマネージャに登録されているファイル名とします。
     * 一時ファイルを作成するため削除が必要です。
     *
     * @param fileIdList - List of file ID that is file manager registerd.
     * @return ZIP temporary file
     */
    public File searchFileManagerReturnByZip(List<String > fileIdList);

    /**
     * Calculate the effective amount of money from currency code and Company code specified
     * <br />指定された会社コード、通貨コードから有効金額を計算します。
     * 
     * @param compCd - COMPANY CODE
     * @param currCd - CURRENCY CODE
     * @param price - amount of money to calculate
     * @return Effective amount of money
     * @throws ApplicationException - if can not calculate effective amount of money
     */
    public BigDecimal searchEffectivePrice(String compCd, String currCd, BigDecimal price) throws ApplicationException;
    
    // ST959 UNIT CONVERSION ADD START
    /**
     * convert weight unit (none rounded up, none overflow check.)
     * <br />重量単位変換を行う。(切り上げなし、桁数チェックなし。)
     *
     * @param value - value to convert (not null)
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @return value that converted
     * @throws ApplicationException - if Unit Of Measure Conversion Item Master (for decimal) can not be queried
     */
    public BigDecimal convertWeightUnitNoOverflowCheck(BigDecimal value, String fromUnitCd, String toUnitCd)
        throws ApplicationException;
    
    /**
     * convert volume unit (none rounded up, none overflow check.)
     * <br />容積単位変換を行う。(切り上げなし、桁数チェックなし。)
     *
     * @param value - value to convert (not null)
     * @param fromUnitCd - Unit before conversion
     * @param toUnitCd - Unit after conversion
     * @return value that converted
     * @throws ApplicationException - if Unit Of Measure Conversion Item Master (for decimal) can not be queried
     */
    public BigDecimal convertVolumeUnitNoOverflowCheck(BigDecimal value, String fromUnitCd, String toUnitCd)
        throws ApplicationException;
    // ST959 UNIT CONVERSION ADD END
    
    /**
     * Registration of the AI-JB request
     * <br />AI-JBリクエストの登録を行う。
     * 
     * @param screenId - Screen Id
     * @return Request Id
     * @throws ApplicationException - if failure to create
     */
    public String createRequestJob(String screenId) throws ApplicationException;
}
