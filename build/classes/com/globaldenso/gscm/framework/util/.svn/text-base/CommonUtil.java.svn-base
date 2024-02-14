/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 *
 * CommonUtilクラス
 * CommonUtil Class
 *
 * Version.
 * 1.1.0
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import static com.globaldenso.gscm.framework.util.CheckUtil.isBlankOrNull;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.ConvertUtilsBean;
import org.apache.commons.beanutils.converters.BigDecimalConverter;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.SqlDateConverter;
import org.apache.commons.beanutils.converters.SqlTimestampConverter;
import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.csvlistconvert.CSVFormatException;
import com.globaldenso.ai.library.csvlistconvert.CsvListConversion;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;
import com.globaldenso.gscm.framework.presentation.WindowInfoManager;

/**
 * <p>
 * 共通処理を行うクラス。
 * Class for execute common process
 * </p>
 *
 * @author $Author: 400616000304 $
 */
public final class CommonUtil {
    /**
     * タブコード付与フラグ：オン
     * Flag for setting tab code:ON
     */
    public static final String TAB_CODE_ADD_FLAG_ON = "1";

    /**
     * デフォルトの一時ファイルプレフィックス
     * Prefix of default temporary file
     */
    private static final String DEFAULT_TMP_PREFIX = "csv_work";

    /**
     * 日付書式(西暦2桁)の正規表現
     * Regular expressions of date format(2 digit of AD)
     */
    private static final String REG_EXP_DATE_FORMAT_AD2DIGIT = "^[^y]*[y]{2}[^y]*$";

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    private CommonUtil() {
        super();
    }

    /**
     * ドメインからロケール取得して返します。
     * Get locale from domain and return it
     * <p>
     * Language と別々のフィールドにStringで保持している値を統合しLocaleインスタンスを返却します。
     * Join Language and value which different field maintains with String ,and return Locale instance
     * </p>
     *
     * @param domain ({@link com.globaldenso.gscm.framework.business.domain.AbstractDomain}
     * @return セッションから取得したstrutsが保持しているロケール
     * @return locale struts gotten from session maintains
     */
    public static Locale getLocale(AbstractDomain domain) {
        // 引数のドメインからlanguageCdを取得
        // Get languageCd from domain of argument
        String languageCd = domain.getLanguageCd();
        if (isBlankOrNull(languageCd)) {
            // Locale のコンストラクタにlanguageCdは必須なためエラー
            // Because languageCd is required for locale constructor,throw exception
            throw new SystemException(new IllegalArgumentException("languageCd is null or empty"));
        }

        return new Locale(languageCd);
    }

    /**
     * コピープロパティ(DomainからDomainへコピー)。
     * Copy property(Copy from Domain to Domain)
     * <p>
     * 一部プロパティを除きorigのプロパティをdestにコピーする。
     * Copy Orig property except a property to Dest
     * </p>
     * <li>取得可能であればdestからscreenIdを退避する</li>
     * <li>If it is possible to get screenId,put screen id from Dest to other variable</li>
     * <li>origからdestへプロパティをコピーする</li>
     * <li>Copy property from Orig to Dest</li>
     * <li>screenIdを退避している場合、screenIdをdestへ再設定する</li>
     * <li>If screen id is put at other variable,set screen id to Dest again</li>
     * <li>日付型の変換は、コピー元AbstractDomainの日付書式を利用する</li>
     * <li>Convert date format with date format of source copy AbstractDomain</li>
     *
     * @param dest コピー先AbstractDomain
     * @param dest AbstractDomain of destination copy
     * @param orig コピー元AbstractDomain
     * @param orig AbstractDomain of source copy
     */
    public static void copyPropertiesDomainToDomain(AbstractDomain dest, AbstractDomain orig) {
        copyPropertiesDomainToDomain(dest, orig, orig.getDateFormat());
    }

    /**
     * コピープロパティ(DomainからDomainへコピー)。
     * Copy property(Copy from Domain to Domain)
     * <p>
     * 一部プロパティを除きorigのプロパティをdestにコピーする。
     * Copy Orig property except a property to Dest
     * </p>
     * <li>取得可能であればdestからscreenIdを退避する</li>
     * <li>If it is possible to get screenId,put screen id from Dest to other variable</li>
     * <li>origからdestへプロパティをコピーする</li>
     * <li>Copy property from Orig to Dest</li>
     * <li>screenIdを退避している場合、screenIdをdestへ再設定する</li>
     * <li>If screen id is put at other variable,set screen id to Dest again</li>
     * <li>日付型の変換は、日付書式パターンを利用する</li>
     * <li>Convert date format with date format pattern</li>
     *
     * @param dest コピー先AbstractDomain
     * @param dest AbstractDomain of destination copy
     * @param orig コピー元AbstractDomain
     * @param orig AbstractDomain of source copy
     * @param dateFormat 日付書式
     * @param dateFormat Date format
     */
    public static void copyPropertiesDomainToDomain(AbstractDomain dest, AbstractDomain orig, String dateFormat) {

        String screenId = dest.getScreenId();

        // コピー
        // Copy
        copyProperties(dest, orig, dateFormat);

        if (!CheckUtil.isBlankOrNull(screenId)) {
            dest.setScreenId(screenId);
            return;
        }
    }

    /**
     * コピープロパティ(ActionFormからActionFormへコピー)。
     * Copy property(Copy from ActionForm to ActionForm)
     * <p>
     * 一部プロパティを除きorigのプロパティをdestにコピーする。
     * Copy Orig property except a property to Dest
     * </p>
     * <li>取得可能であればdestからscreenIdを退避する</li>
     * <li>If it is possible to get screenId,put screen id from Dest to other variable</li>
     * <li>origからdestへプロパティをコピーする</li>
     * <li>Copy property from Orig to Dest</li>
     * <li>screenIdを退避している場合、screenIdをdestへ再設定する</li>
     * <li>If screen id is put at other variable,set screen id to Dest again</li>
     * <li>日付型の変換は、コピー元AbstractActionFormのウィンドウIDに該当する画面共通情報の日付書式を利用する</li>
     * <li>Convert date type with date format of screen common information assosiated to window id of source copy AbstractActionForm</li>
     * 
     * @param dest コピー先AbstractActionForm
     * @param dest AbstractDomain of destination copy
     * @param orig コピー元AbstractActionForm
     * @param orig AbstractDomain of source copy
     */
    public static void copyPropertiesActionFormToActionForm(AbstractActionForm dest, AbstractActionForm orig) {
        copyPropertiesActionFormToActionForm(dest, orig, getCommonInfoDateFormat(orig.getWindowId()));
    }

    /**
     * コピープロパティ(ActionFormからActionFormへコピー)。
     * Copy property(Copy from ActionForm to ActionForm)
     * <p>
     * 一部プロパティを除きorigのプロパティをdestにコピーする。
     * Copy Orig property except a property to Dest
     * </p>
     * <li>取得可能であればdestからscreenIdを退避する</li>
     * <li>If it is possible to get screenId,put screen id from Dest to other variable</li>
     * <li>origからdestへプロパティをコピーする</li>
     * <li>Copy property from Orig to Dest</li>
     * <li>screenIdを退避している場合、screenIdをdestへ再設定する</li>
     * <li>If screen id is put at other variable,set screen id to Dest again</li>
     * <li>日付型の変換は、日付書式パターンを利用する</li>
     * <li>Convert date type with date format pattern</li>
     * 
     * @param dest コピー先AbstractActionForm
     * @param dest AbstractDomain of destination copy
     * @param orig コピー元AbstractActionForm
     * @param orig AbstractDomain of source copy
     * @param dateFormat 日付書式
     * @param dateFormat Date format
     */
    public static void copyPropertiesActionFormToActionForm(AbstractActionForm dest, AbstractActionForm orig, String dateFormat) {

        String screenId = dest.getScreenId();

        // コピー
        // Copy
        copyProperties(dest, orig, dateFormat);

        if (!CheckUtil.isBlankOrNull(screenId)) {
            dest.setScreenId(screenId);
            return;
        }
    }

    /**
     * コピープロパティ(DomainからActionFormへコピー)。
     * Copy property(Copy from Domain to ActionForm)
     * <p>
     * 一部プロパティを除きorigのプロパティをdestにコピーする。
     * Copy Orig property except a property to Dest
     * </p>
     * <li>取得可能であればdestからscreenIdを退避する</li>
     * <li>If it is possible to get screenId,put screen id from Dest to other variable</li>
     * <li>origからdestへプロパティをコピーする</li>
     * <li>Copy property from Orig to Dest</li>
     * <li>screenIdを退避している場合、screenIdをdestへ再設定する</li>
     * <li>If screen id is put at other variable,set screen id to Dest again</li>
     * <li>日付型の変換は、コピー元AbstractDomainの日付書式を利用する</li>
     * <li>Convert date type with date format of source copy AbstractDomain</li>
     *
     * @param dest コピー先AbstractActionForm
     * @param dest AbstractDomain of destination copy
     * @param orig コピー元AbstractDomain
     * @param orig AbstractDomain of source copy
     */
    public static void copyPropertiesDomainToActionForm(AbstractActionForm dest, AbstractDomain orig) {
        copyPropertiesDomainToActionForm(dest, orig, orig.getDateFormat());
    }

    /**
     * コピープロパティ(DomainからActionFormへコピー)。
     * Copy property(Copy from Domain to ActionForm)
     * <p>
     * 一部プロパティを除きorigのプロパティをdestにコピーする。
     * Copy Orig property except a property to Dest
     * </p>
     * <li>取得可能であればdestからscreenIdを退避する</li>
     * <li>If it is possible to get screenId,put screen id from Dest to other variable</li>
     * <li>origからdestへプロパティをコピーする</li>
     * <li>Copy property from Orig to Dest</li>
     * <li>screenIdを退避している場合、screenIdをdestへ再設定する</li>
     * <li>If screen id is put at other variable,set screen id to Dest again</li>
     * <li>日付型の変換は、日付書式パターンを利用する</li>
     * <li>Convert date type with date format pattern</li>
     *
     * @param dest コピー先AbstractActionForm
     * @param dest AbstractDomain of destination copy
     * @param orig コピー元AbstractDomain
     * @param orig AbstractDomain of source copy
     * @param dateFormat 日付書式パターン
     * @param dateFormat Date format pattern
     */
    public static void copyPropertiesDomainToActionForm(AbstractActionForm dest, AbstractDomain orig, String dateFormat) {

        String screenId = dest.getScreenId();

        // コピー
        // Copy
        copyProperties(dest, orig, dateFormat);

        if (!CheckUtil.isBlankOrNull(screenId)) {
            dest.setScreenId(screenId);
            return;
        }
    }

    /**
     * コピープロパティ(ActionFormからDomainへコピー)。
     * Copy property(Copy from ActionForm to Domain)
     * <p>
     * 一部プロパティを除きorigのプロパティをdestにコピーする。
     * Copy Orig property except a property to Dest
     * </p>
     * <li>取得可能であればdestからscreenIdを退避する</li>
     * <li>If it is possible to get screenId,put screen id from Dest to other variable</li>
     * <li>origからdestへプロパティをコピーする</li>
     * <li>Copy property from Orig to Dest</li>
     * <li>screenIdを退避している場合、screenIdをdestへ再設定する</li>
     * <li>If screen id is put at other variable,set screen id to Dest again</li>
     * <li>日付型の変換は、コピー元AbstractActionFormのウィンドウIDに該当する画面共通情報の日付書式を利用する</li>
     * <li>Convert date type with date format of screen common information assosiated to window id of source copy AbstractActionForm</li>
     *
     * @param dest コピー先AbstractDomain
     * @param dest AbstractDomain of destination copy
     * @param orig コピー元AbstractActionForm
     * @param orig AbstractDomain of source copy
     */
    public static void copyPropertiesActionFormToDomain(AbstractDomain dest, AbstractActionForm orig) {
        copyPropertiesActionFormToDomain(dest, orig, getCommonInfoDateFormat(orig.getWindowId()));
    }

    /**
     * コピープロパティ(ActionFormからDomainへコピー)。
     * Copy property(Copy from ActionForm to Domain)
     * <p>
     * 一部プロパティを除きorigのプロパティをdestにコピーする。
     * Copy Orig property except a property to Dest
     * </p>
     * <li>取得可能であればdestからscreenIdを退避する</li>
     * <li>If it is possible to get screenId,put screen id from Dest to other variable</li>
     * <li>origからdestへプロパティをコピーする</li>
     * <li>Copy property from Orig to Dest</li>
     * <li>screenIdを退避している場合、screenIdをdestへ再設定する</li>
     * <li>If screen id is put at other variable,set screen id to Dest again</li>
     * <li>日付型の変換は、日付書式パターンを利用する</li>
     * <li>Convert date type with date format pattern</li>
     *
     * @param dest コピー先AbstractDomain
     * @param dest AbstractDomain of destination copy
     * @param orig コピー元AbstractActionForm
     * @param orig AbstractDomain of source copy
     * @param dateFormat 日付書式パターン
     * @param dateFormat Date format pattern
     */
    public static void copyPropertiesActionFormToDomain(AbstractDomain dest, AbstractActionForm orig, String dateFormat) {

        String screenId = dest.getScreenId();

        // コピー
        // Copy
        copyProperties(dest, orig, dateFormat);

        if (!CheckUtil.isBlankOrNull(screenId)) {
            dest.setScreenId(screenId);
            return;
        }
    }

    /**
     * <p>
     * タブコード付与フラグが"1"の場合、文字列の先頭にタブコードを付与する。
     * When flag for setting tab code is 1,set tab code to head of string
     * </p>
     *
     * @param value 文字列
     * @param value String
     * @param tabcodeflag タブコード付与フラグ
     * @param tabcodeflag Flag for setting tab code
     * @return 加工後の文字列
     * @return Transfered string
     */
    public static String addTabcode(String value, String tabcodeflag) {

        if (TAB_CODE_ADD_FLAG_ON.equals(tabcodeflag)) {
            if (StringUtils.isEmpty(value)) {
                return "\t";
            } else {
                return "\t".concat(value);
            }
        }
        return value;
    }

    /**
     * CSVの各項目からTabを削除する
     * Delete tab from per CSV item
     *
     * @param csvStream CSVのストリーム（このメソッドではcloseしない）
     * @param csvStream CSV Stream（Not close in this class）
     * @param commonInfoDomain CommonInfoDomain
     * @param commonInfoDomain CommonInfoDomain
     * @param tmpPrefix 一時ファイルのプレフィックス（File.createTempFileの仕様と同じ）
     * @param tmpPrefix Temporary file prefix(Same as File.createTempFile specification)
     * @param tmpSuffix 一時ファイルのサフィックス（File.createTempFileの仕様と同じ）
     * @param tmpSuffix Temporary file suffix（Same as File.createTempFile specification）
     * @param tempDir 一時ファイルの出力先（File.createTempFileの仕様と同じ）
     * @param tempDir Destination output of temporaly file(Same as File.createTempFile specification)
     * @return Tabを削除したCSVのストリーム
     * @return CSV Stream deleted tab from
     * @throws FileNotFoundException 例外
     * @throws FileNotFoundException FileNotFoundException
     * @throws IOException 例外
     * @throws IOException IOException
     * @throws CSVFormatException 例外
     * @throws CSVFormatException CSVFormatException
     */
    public static InputStream removeTabCSVItem(InputStream csvStream,
        CommonInfoDomain commonInfoDomain, String tmpPrefix, String tmpSuffix, File tempDir)
        throws FileNotFoundException, IOException, CSVFormatException {

        if (tmpPrefix == null) {
            tmpPrefix = DEFAULT_TMP_PREFIX;
        }

        File tempFile = File.createTempFile(tmpPrefix, tmpSuffix, tempDir);
        // ファイルが存在したら削除する
        // If temporary file exists,delete temporary file
        tempFile.deleteOnExit();

        String charcd = commonInfoDomain.getCharCd();
        BufferedReader srcReader = null;
        BufferedWriter tmpWriter = null;
        try {
            srcReader = new BufferedReader(new InputStreamReader(csvStream, charcd));
            tmpWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile),
                charcd));
            // 引数(csvStream)で渡ってきたInputStremを1行毎に読み込む
            // Read InputStream of argument(csvStream) each line
            for (String srcLine = srcReader.readLine(); srcLine != null; srcLine = srcReader
                .readLine()) {

                // 1行分のCSVを解析
                // Analize CSV of one line
                List<List<String>> srcCsvList = CsvListConversion.getList(srcLine);

                // 結果行リスト
                // Result list line
                List<List<String>> removedCsvList = new ArrayList<List<String>>();

                // 行数分ループ
                // Loop for number of rows
                // アプリ基盤部品(CsvListConversion)の仕様により、CSVを文字列の2次元リストに変換される
                // As specification of application common parts(CsvListConversion),convert string of CSV to two-dimensional array
                for (Iterator<List<String>> srcLineIt = srcCsvList.iterator(); srcLineIt.hasNext();) {

                    // CSV項目リスト
                    // List of CSV item
                    List<String> srcCoulumnList = srcLineIt.next();
                    // 結果項目リスト
                    // Result list
                    List<String> removedColumnList = new ArrayList<String>(srcCoulumnList.size());

                    // 項目分ループ
                    // Loop for number of items
                    for (Iterator<String> srcColumnIt = srcCoulumnList.iterator(); srcColumnIt
                        .hasNext();) {

                        // 先頭のタブを削除して結果リストへ追加
                        // Delete head tab and add to result list
                        String removedColumn = StringUtils.removeStart(srcColumnIt.next(), "\t");
                        removedColumnList.add(removedColumn);
                    }

                    // 結果行リストへ追加
                    // Add to result list
                    removedCsvList.add(removedColumnList);

                }

                // 1行分一時ファイルへ出力する
                // Write one line in temporary file
                String removedCsvData = CsvListConversion.getCsv(removedCsvList);
                tmpWriter.write(removedCsvData);
            }
        } finally {
            if (srcReader != null) {
                srcReader.close();
            }
            if (tmpWriter != null) {
                tmpWriter.close();
            }
        }

        return new TempFileInputStream(tempFile);

    }

    /**
     * コピープロパティ。
     * Copy property
     * <p>
     * origのプロパティをdestにコピーする。
     * Copy Orig property to Dest
     * </p>
     *
     * @param dest dest
     * @param orig orig
     * @param dateFormatPattern 日付書式パターン
     * @param dateFormatPattern Date format pattern
     */
    public static void copyProperties(Object dest, Object orig, String dateFormatPattern) {
        try {
            // コピー
            // Copy
            DateConverter utilDateConv = new DateConverter(null);
            utilDateConv.setPattern(dateFormatPattern);
            SqlDateConverter sqlDateConv = new SqlDateConverter(null);
            sqlDateConv.setPattern(dateFormatPattern);

            BeanUtilsBean beanUtilsBean = new BeanUtilsBean(
                new ConvertUtilsBean(),
                BeanUtilsBean.getInstance().getPropertyUtils());

            beanUtilsBean.getConvertUtils().register(utilDateConv, java.util.Date.class);
            beanUtilsBean.getConvertUtils().register(utilDateConv, String.class);
            beanUtilsBean.getConvertUtils().register(sqlDateConv, java.sql.Date.class);
            beanUtilsBean.getConvertUtils().register(new SqlTimestampConverter(null), Timestamp.class);
            beanUtilsBean.getConvertUtils().register(new BigDecimalConverter(null), BigDecimal.class);

            Object cloneOrig = null;
            if (null != orig) {
                cloneOrig = beanUtilsBean.cloneBean(orig);
            }
            convertDateString(dest, cloneOrig, dateFormatPattern);
            beanUtilsBean.copyProperties(dest, cloneOrig);
            beanUtilsBean.getConvertUtils().deregister();
        } catch (IllegalAccessException e) {
            // メソッドへのアクセス権限がない場合
            // When there is no access authority of method,throw exception
            throw new SystemException(e);
        } catch (InvocationTargetException e) {
            // メソッドを実行した結果例外が発生した場合
            // When result of method is exception,throw exception
            throw new SystemException(e);
        } catch (InstantiationException e) {
            throw new SystemException(e);
        } catch (NoSuchMethodException e) {
            throw new SystemException(e);
        }
    }

    /**
     * オブジェクト内の日付文字列を変換する。
     * Convert date string at object
     * <p>
     * 引数の変換対象オブジェクト内にある日付文字列用プロパティの値を引数の日付書式の形に変換する。
     * Convert property value for date format at conversion object of argument to type of date format
     * </p>
     *
     * @param convertTypeObj 変換先型オブジェクト
     * @param convertTypeObj Desitination object of conversion type
     * @param convertObj 変換対象オブジェクト
     * @param convertObj Object for conversion
     * @param dateFormat 日付書式文字列
     * @param dateFormat Date format string
     */
    private static void convertDateString(Object convertTypeObj, Object convertObj, String dateFormat) {
        // 変換対象オブジェクトがnullの場合は、処理を行わない。
        // If object for conversion is null,exit function
        if (null == convertTypeObj || null == convertObj) {
            return;
        }

        PropertyDescriptor propDesc = null;

        // 変換先型オブジェクトに存在するプロパティを取得する。
        // Get property at desitination object of conversion type
        Field[] fields = convertTypeObj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String propertyName = field.getName();
            String propertyClassName = field.getType().getName();
            try {
                // 変換先型オブジェクトに宣言されているDate型のプロパティのみ処理対象とする。
                // Property of date type declared at desitination object of conversion type is object for process
                if (!"java.util.Date".equals(propertyClassName)
                        && !"java.sql.Date".equals(propertyClassName)) {
                    continue;
                }
                propDesc = new PropertyDescriptor(propertyName, convertObj.getClass());
                if (!"java.lang.String".equals(propDesc.getPropertyType().getName())) {
                    continue;
                }
                Method getterMethod = propDesc.getReadMethod();
                // 日付文字列の西暦変換を実施する。
                // Convert date string into AD
                String dateString = convertDateFormat((String)getterMethod.invoke(convertObj, (Object[])null), dateFormat);
                Method setterMethod = propDesc.getWriteMethod();
                setterMethod.invoke(convertObj, dateString);
            } catch (IntrospectionException e) {
                continue;
            } catch (IllegalArgumentException e) {
                continue;
            } catch (IllegalAccessException e) {
                continue;
            } catch (InvocationTargetException e) {
                continue;
            }
        }
    }

    /**
     * 画面共通情報(CommonInfo)より日付書式を取得する。
     * Get date format from screen common information
     * <P>
     * DensoContextより画面共通情報(CommonInfo)を取得し、そこに定義してある日付書式を返却する。
     * Get screen common information from DensoContext and return date format defined at screen common information
     * </P>
     * @param windowId ウィンドウID
     * @param windowWd Window Id
     * @return 日付書式
     * @return Date format
     */
    private static String getCommonInfoDateFormat(String windowId) {
        String dateFormat = null;
        if (!CheckUtil.isBlankOrNull(windowId)) {
            WindowInfoManager windowInfoManager = new WindowInfoManager(windowId);
            dateFormat = windowInfoManager.getCommonInfo().getDateFormat();
        }
        return dateFormat;
    }

    /**
     * 日付文字列を日付書式に合わせ変換する。
     * Convert date string accodance with date format
     * <p>
     *   引数の日付文字列を、引数の日付書式に合わせた日付文字列に変換し、呼び出し元に返却する。<br/>
     *   Convert date string of argument to date string accordance with date format of argument and return it<br/>
     * </p>
     * @param dateString 日付文字列
     * @param dateString Date string
     * @param dateFormat 日付書式
     * @param dateFormat Date format
     * @return 変換後日付文字列
     * @return Post-converted date string
     */
    private static String convertDateFormat(String dateString, String dateFormat) {
        String resultString = dateString;
        String afterFormat = null;
        
        // 引数のnullまたは空文字チェックを実施する。
        // Check whether argument is null or not,is empty or not
        if (CheckUtil.isBlankOrNull(dateString) || CheckUtil.isBlankOrNull(dateFormat)) {
            return null;
        }

        // 日付文字列の年が西暦2桁の場合、西暦4桁に変更する。
        // If year of date string is AD 2 digits,convert to AD 4 digits
        Pattern p = Pattern.compile(REG_EXP_DATE_FORMAT_AD2DIGIT);
        if (p.matcher(dateFormat).find()) {
            afterFormat = dateFormat.replaceFirst("yy", "yyyy");
            try {
                resultString = DateUtil.formatDate(dateString, dateFormat, afterFormat);
            } catch(SystemException e) {
                resultString = null;
            }
        }
        
        return resultString;
    }
    

}
