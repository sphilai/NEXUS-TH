/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * DateUtilクラス
 * DateUtil Class
 * 
 * Version.
 * 1.0.1
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.ai.library.timezonemanage.business.service.TimezoneManageFacadeService;
import com.globaldenso.ai.library.timezonemanage.exception.TimezoneManageException;
import com.globaldenso.gscm.framework.business.domain.TtWorkDateDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TtWorkDateCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TtWorkDateService;

/**
 * 日付に関する操作を行うためのユーティリティ・クラスです。
 * Utility class for operating date
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10885 $
 */
public final class DateUtil {

    // ================================================================ Constant
    /**
     * 日数計算方法:日付指定(YYYY/MM/DD)
     * Method for calculating days:Specify date(YYYY/MM/DD)
     */
    public static final String DATE = "1";

    /**
     * 日数計算方法:N日間指定
     * Method for calculating days:Specify for N days
     */
    public static final String DAY = "2";

    /**
     * 日数計算方法:N月間指定
     * Method for calculating days:Specify for N months
     */
    public static final String MONTH = "3";

    /**
     * 日数計算方法:N年間指定
     * Method for calculating days:Specify for N years
     */
    public static final String YEAR = "4";

    /**
     * 日数計算方法:永年指定（9999/12/31)
     * Method for calculating days:Specify eternality
     */
    public static final String PERMANENT = "5";

    /**
     * The <code>Log</code> instance for this class.
     */
    protected static final Log log = LogFactory.getLog(DateUtil.class);

    /**
     * 時差パラメータのフォーマット。
     * Format of time difference argument
     */
    private static final String FORMAT_TIMEDIFF = "^[-+]+([0][0-9]|[1][0-3]):([0][0]|[3][0]|[4][5])$";

    /**
     * UTC（システム日時）のフォーマットのリソースキー
     * Resource key of UTC(system date-time) format
     */
    private static final String PROPS_KEY_FORMAT_SYSDATE = "format.systemDate";

    /**
     * 日付フォーマットのリソースキー
     * Resource key of date format
     */
    private static final String PROPS_KEY_FORMAT_YMD = "format.ymd";

    /**
     * プラス記号
     * Plus sign
     */
    private static final String SIGN_PLUS = "+";

    /**
     * マイナス記号
     * Minus sign
     */
    private static final String SIGN_MINUS = "-";

    /**
     * 責任会社ごとの日付フォーマットリソースキー
     * Resource key of date format for every company
     */
    private static final String RESOURCE_KEY_FORMAT_DATE_OWNERCMP = "format{0}.yyyymmdd";

    /**
     * 時間フォーマットリソースキー
     * Resource key of time format
     */
    private static final String FORMAT_TIME = " HH:mm:ss";
   
    // ============================================================= constructor
    /**
     * デフォルト・コンストラクタです。
     * Default constructor
     */
    public DateUtil() {
    }

    /**
     * 日付を比較します。
     * Compare date
     * <p>
     * 指定された２つの日付を比較し、endDateがstartDateよりも過去の場合はfalse、 以外の場合はtrueを返却。
     * Compare pair of specified date and if endDate is  before startDate, return false.If other,return true.
     * </p>
     * 
     * @param startDate 開始日(yyyy-MM-dd)
     * @param startDate Start date(yyyy-MM-dd)
     * @param endDate 終了日(yyyy-MM-dd)
     * @param endDate End date(yyyy-MM-dd)
     * @param locale ロケール
     * @param locale Locale
     * @return endDateがstartDateよりも過去の場合はfalse、以外の場合はtrueを返却。
     * @return If endDate is  before startDate, return false.If other,return true.
     */
    public static boolean compareDate(String startDate, String endDate, Locale locale) {

        // リソースを取得
        // Get resource
        Resource rsc = new Resource(locale);

        // どちらかでもNullの場合はチェックを行わない
        // If start date and end date is string empty or null,return true
        if (!CheckUtil.isBlankOrNull(startDate) && !CheckUtil.isBlankOrNull(endDate)) {
            // フォーマットを指定
            // Specify format
            SimpleDateFormat formatDate = new SimpleDateFormat(rsc
                .getResource(PROPS_KEY_FORMAT_YMD));
            try {
                // String型から日付型に変換
                // Convert start date and end date to date type from string type
                Date reStartDate = formatDate.parse(startDate);
                Date reEndDate = formatDate.parse(endDate);

                if (reStartDate.after(reEndDate)) {
                    // 開始日が終了日より未来の場合はfalseを返却
                    // If start date is later than end date,return false
                    return false;
                }
            } catch (ParseException e) {
                // 日付型が指定したフォーマット以外の場合
                // If date type is not specified format,throw exception
                throw new SystemException(e);
            }
        }
        return true;
    }

    /**
     * 日付文字列を Date 型に変換します。
     * Convert date string to date type
     * <p>
     * 対象の文字列が null および空文字("")の場合は、null を返します。<br>
     * If target string is null and string empty,return null<br>
     * </p>
     * 
     * @param date Date 型に変換する文字列
     * @param date String converted to date type
     * @param dateFormat 日付形式のフォーマット
     * @param dateFormat Date format
     * @return Date オブジェクト
     * @return Date Date
     */
    public static Date parseDate(String date, String dateFormat) {

        // NULLまたは空文字の場合
        // If date of argument is string empty or null,if dateFormat of argument is string empty or null,return null
        if (CheckUtil.isBlankOrNull(date) || CheckUtil.isBlankOrNull(dateFormat)) {
            return null;
        }

        // フォーマットを指定
        // Specify format
        SimpleDateFormat parser = new SimpleDateFormat(dateFormat);
        parser.setLenient(false);

        try {
            // 指定したフォーマットの日付型に変換し返却
            // Return Date converted to date type of specified format
            return parser.parse(date);
        } catch (ParseException e) {
            // 日付型が指定したフォーマット以外の場合
            // If date type is not specified format,throw exception
            throw new SystemException(e);
        }
    }

    /**
     * Date 型オブジェクトを日付文字列に変換します。
     * Convert date type to date string
     * <p>
     * 変換元の Date オブジェクトが NULL の場合は NULL を返します。
     * If Date object of source conversion is null,return null
     * </p>
     * 
     * @param date Date 型に変換する文字列
     * @param date Date String converted to date type
     * @param dateFormat 日付形式のフォーマット
     * @param dateFormat Date format
     * @return 変換された文字列
     * @return Conveted string
     */
    public static String formatDate(Date date, String dateFormat) {

        // NULLまたは空文字の場合
        // If date of argument is null,if dateFormat of argument is null or string empty,return null
        if (date == null || CheckUtil.isBlankOrNull(dateFormat)) {
            return null;
        }

        // フォーマットを指定
        // Specify format
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        formatter.setLenient(false);

        // 日付型をString型に変換し返却
        // Convert date type to string type and return it
        return formatter.format(date);
    }

    /**
     * 日付文字列のフォーマットを変更する。
     * Change format of date string
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param date 変換対象の日付文字列
     * @param date Date string of conversion target
     * @param beforeFormat 変換前の日付フォーマット
     * @param beforeFormat Date format former conversion
     * @param afterFormat 変換後の日付フォーマット
     * @param afterFormat Date format later conversion
     * @return 変換した日付文字列
     * @return Date string converted
     */
    public static String formatDate(String date, String beforeFormat, String afterFormat) {

        // 引数の日付文字列をフォーマット変換しString型で返却
        // Convert date string of argument to format and return it with string type
        return formatDate(parseDate(date, beforeFormat), afterFormat);
    }

    /**
     * 日付文字列のフォーマットを変更する。
     * Change format of date string
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param date 変換対象の日付文字列
     * @param date Date string of conversion target
     * @param beforeFormatKey プロパティキー（変換前の日付フォーマット）
     * @param beforeFormatKey Property key（Date format former conversion）
     * @param afterFormatKey プロパティキー（変換後の日付フォーマット）
     * @param afterFormatKey Property key（Date format later conversion）
     * @param locale ロケール
     * @param locale Locale
     * @return 変換した日付文字列
     * @return Date string converted
     */
    public static String formatDate(String date, String beforeFormatKey, String afterFormatKey,
        Locale locale) {

        // locale以外の引数の内、いずれかがNULLまたは空文字の場合
        // If each argument except locale is null or string empty,return null
        if (CheckUtil.isBlankOrNull(date) || CheckUtil.isBlankOrNull(beforeFormatKey)
            || CheckUtil.isBlankOrNull(afterFormatKey)) {
            return null;
        }

        // リソースを取得
        // Get resource
        Resource rs = new Resource(locale);

        // 引数の日付文字列をフォーマット変換しString型で返却
        // Convert date string of argument to format and return it with string type
        return formatDate(parseDate(date, rs.getResource(beforeFormatKey)), rs
            .getResource(afterFormatKey));
    }

    /**
     * 日を増やす。
     * Add day
     * 
     * @param date 元の日付
     * @param date Source date
     * @param format 日付フォーマット
     * @param format Date format
     * @param addDay 増やす日
     * @param addDay Additional day
     * @return 増やした後の日付
     * @return Destination date
     */
    public static String addDate(String date, String format, int addDay) {

        // 引数の日付、日付フォーマットのいずれかがNULLまたは空文字の場合
        // If date or format of argument is null or string empty,return null
        if (CheckUtil.isBlankOrNull(date) || CheckUtil.isBlankOrNull(format)) {
            return null;
        }

        // GregorianCalendarオブジェクトを生成
        // Create GregorianCalendar object
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(parseDate(date, format));
        // 引数の日付から指定された日数を追加
        // Add source additional day of argument to date of argument 
        cal.add(GregorianCalendar.DATE, addDay);

        // Date型からString型に変換し返却
        // Convert from date type to string type,return it
        return formatDate(cal.getTime(), format);
    }

    /**
     * 月数の差分を計算する。
     * Calculate difference of month
     * 
     * @param date1 日付1
     * @param date1 Date1
     * @param date2 日付2
     * @param date2 Date2
     * @param format 日付フォーマット
     * @param format Date format
     * @return 日付1 - 日付2の月数
     * @return Month which is date1 minus date2
     */
    public static long calcmonthDistance(String date1, String date2, String format) {

        // GregorianCalendarオブジェクトを生成
        // Create GregorianCalendar object
        GregorianCalendar cal1 = new GregorianCalendar();
        GregorianCalendar cal2 = new GregorianCalendar();

        cal1.setTime(parseDate(date1, format));
        cal2.setTime(parseDate(date2, format));

        // date1とdate2の差の月数を返却
        // Return month which is date1 of argument minus date2 of argument
        return (cal1.get(GregorianCalendar.YEAR) - cal2.get(GregorianCalendar.YEAR)) * 12
            + (cal1.get(GregorianCalendar.MONTH) - cal2.get(GregorianCalendar.MONTH));
    }

    /**
     * 時差を計算します。
     * Calculate time difference
     * <p>
     * 変換対象の日時が NULL または時差の書式が不正な場合、NULL を返します。
     * When date and time of conversion target is null,if format of time difference is incorrect,return null
     * </p>
     * 
     * @param date 変換対象の日時
     * @param date Date and time of conversion target
     * @param timeDiff 時差(フォーマット：±HH:mm)
     * @param timeDiff Time difference(Format：±HH:mm)
     * @return 時差を計算した日時
     * @return Date and time calculated with time difference
     */
    public static Date getConversionTime(Date date, String timeDiff) {

        // 日付がNULLの場合
        // Date and time of conversion target of argument is null,return null
        if (date == null) {
            return null;
        }

        // 時差のフォーマットチェック
        // Validate time difference format
        if (!CheckUtil.isMatchedFormat(timeDiff, FORMAT_TIMEDIFF)) {
            return null;
        }

        // 時差を分に変換する
        // Convert time difference of argument to minute
        int td = Integer.valueOf(timeDiff.substring(1, 3)).intValue() * 60
            + Integer.valueOf(timeDiff.substring(4)).intValue();
        if (SIGN_MINUS.equals(timeDiff.substring(0, 1))) {
            td = 0 - td;
        }

        // 時差変換
        // Calculate time difference
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(GregorianCalendar.MINUTE, td);

        return cal.getTime();
    }

    /**
     * ローカルタイムをUTCに変換します。
     * Convert local time to UTC
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param date 変換対象の日時
     * @param date Date and time of conversion target
     * @param format ローカルタイムの日付形式フォーマット
     * @param format Local time format
     * @param timeDiff 時差(フォーマット：±HH:mm)
     * @param timeDiff Time difference(Format：±HH:mm)
     * @return UTCの日付文字列
     * @return Date string of UTC
     */
    public static String getUTC(String date, String format, String timeDiff) {

        // 引数のいずれかがNULLまたは空文字の場合
        // If each argument is null or string empty,return null
        if (CheckUtil.isBlankOrNull(date) || CheckUtil.isBlankOrNull(format)
            || CheckUtil.isBlankOrNull(timeDiff)) {
            return null;
        }

        // String型からDate型に変換
        // Convert date and time of conversion target of argument to date type from string type
        Date dt = parseDate(date, format);

        // 時差変換
        // Convert time difference
        StringBuilder sbTimeDiff = new StringBuilder();
        if (SIGN_MINUS.equals(timeDiff.substring(0, 1))) {
            sbTimeDiff.append(SIGN_PLUS);
        } else {
            sbTimeDiff.append(SIGN_MINUS);
        }
        sbTimeDiff.append(timeDiff.substring(1));

        dt = getConversionTime(dt, sbTimeDiff.toString());

        // Date型からString型に変換
        // Convert to date type from string type
        Resource rs = new Resource();
        return formatDate(dt, rs.getResource(PROPS_KEY_FORMAT_SYSDATE));
    }

    /**
     * ローカルタイムをUTCに変換します。
     * Convert local time to UTC
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param date 変換対象の日時
     * @param date Date and time of conversion target
     * @param formatKey プロパティキー（ローカルタイムの日付形式フォーマット）
     * @param formatKey Property key(Local time format)
     * @param timeDiff 時差(フォーマット：±HH:mm)
     * @param timeDiff Time difference(Format：±HH:mm)
     * @param locale ロケール
     * @param locale Locale
     * @return UTCの日付文字列
     * @return Date string of UTC
     */
    public static String getUTC(String date, String formatKey, String timeDiff, Locale locale) {

        // リソースを取得
        // Get resource
        Resource rs = new Resource(locale);

        // UTC変換した日付文字列を返却
        // Return date string converted to UTC 
        return getUTC(date, rs.getResource(formatKey), timeDiff);
    }

    /**
     * UTCをローカルタイムに変換します。
     * Convert UTC to local time
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param date 変換対象の日時(フォーマット：yyyy-MM-dd HH:mm:ss)
     * @param date Date and time of conversion target(Format：yyyy-MM-dd HH:mm:ss)
     * @param format ローカルタイムの日付形式フォーマット
     * @param format Local time format
     * @param timeDiff 時差(フォーマット：±HH:mm)
     * @param timeDiff Time difference(Format：±HH:mm)
     * @return ローカルタイムの日付文字列
     * @return Date string of local time
     */
    public static String getLocalTime(String date, String format, String timeDiff) {

        // 引数のいずれかがNULLまたは空文字の場合
        // If each argument is null or string empty,return null
        if (CheckUtil.isBlankOrNull(date) || CheckUtil.isBlankOrNull(format)
            || CheckUtil.isBlankOrNull(timeDiff)) {
            return null;
        }

        // リソースを取得
        // Get resource
        Resource rs = new Resource();
        // String型からDate型に変換
        Date dt = parseDate(date, rs.getResource(PROPS_KEY_FORMAT_SYSDATE));

        // 時差変換
        // Convert time difference
        dt = getConversionTime(dt, timeDiff);

        // Date型からString型に変換
        // Convert to date type from string type
        return formatDate(dt, format);
    }

    /**
     * UTCをローカルタイムに変換します。
     * Convert UTC to local time
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param date 変換対象の日時(フォーマット：yyyy-MM-dd HH:mm:ss)
     * @param date Date and time of conversion target(Format：yyyy-MM-dd HH:mm:ss)
     * @param formatKey ローカルタイムの日付形式フォーマット
     * @param formatKey Local time format
     * @param timeDiff 時差(フォーマット：±HH:mm)
     * @param timeDiff Time difference(Format：±HH:mm)
     * @param locale ロケール
     * @param locale Locale
     * @return ローカルタイムの日付文字列
     * @return Date string of local time
     */
    public static String getLocalTime(String date, String formatKey, String timeDiff, Locale locale) {

        // リソースを取得
        // Get resource
        Resource rs = new Resource(locale);

        // 引数の日付をローカルタイムに変換し返却
        // Convert date and time of conversion target of argument to local time and return it
        return getLocalTime(date, rs.getResource(formatKey), timeDiff);
    }

    /**
     * 保持期限日数取得。
     * Get maintenance limit term
     * <p>
     * 「日数計算方法」と「値」を指定される事により、保持期限日数を返却する。
     *  Return maintenance limit term with specifying term calculation way and value
     * </p>
     * 
     * @param mode 日数計算方法 1:日付指定 2:N日間指定 3:N月間指定 4:N年間指定 5:永年指定
     * @param mode Term calculation way 1:Date Specified 2:N day specified 3:N month specified 4:N year specified 5:Eternality specified
     * @param value 日数計算方法に応じた値
     * @param value Value which is according to term calculation way
     * @return 保持期限日数
     * @return Maintenance limit term
     */
    public static Number getSaveLimitTerm(String mode, String value) {
        Calendar today = Calendar.getInstance();
        return getSaveLimitTerm(mode, value, today);
    }

    /**
     * 業務日付取得。
     * Get work date
     * <p>
     * 業務日付管理DBから業務日付を取得する。
     * Get work date from work date management DB
     * </p>
     * 
     * @param id ID(必須)
     * @param id ID(Required)
     * @param ownerComp 責任会社コード(必須)
     * @param ownerComp Company code(Required)
     * @param optId 汎用フィールド(任意)
     * @param optId Common field(optional)
     * @return 業務日付
     * @return Work date
     */
    public static String getWorkDate(String id, String ownerComp, String optId) {
        TtWorkDateService ttWorkDateService = (TtWorkDateService)SpringUtil
            .getBean("gscmTtWorkDateService");
        TtWorkDateCriteriaDomain criteria = new TtWorkDateCriteriaDomain();
        criteria.setId(id);
        criteria.setCompCd(ownerComp);
        if (optId != null && !"".equals(StringUtil.trim(optId))) {
            criteria.setOptId(optId);
        }
        List<TtWorkDateDomain> ret = null;
        try {
            ret = ttWorkDateService.searchByCondition(criteria);
        } catch (ApplicationException e) {
            log.error("getWorkDate()", e);
        }

        if (ret != null && ret.size() > 0) {
            return ret.get(0).getWorkDate();
        } else {
            return null;
        }
    }

    /**
     * 日付の書式チェック。
     * Validate date format
     * <p>
     * ロケールに応じた日付の書式チェックを行う。
     * Validate date format according to locale
     * </p>
     * 
     * @param input チェック対象日付
     * @param input Date of validation target
     * @param dateFormat 日付書式
     * @param dateFormat Date format
     * @return チェック結果
     * @return Validation result
     */
    public static boolean isDate(String input, String... dateFormat) {

        for (String s : dateFormat) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(s);
                // ここでParseException投げる
                // Convert date of validation target of argument to format
                Date result = sdf.parse(input);
                sdf.setLenient(false);
                String reverse = sdf.format(result);
                // 戻して一致するか
                // If date of validation target of argument is format,return true
                if (input.equals(reverse)) {
                    return true;
                }

            } catch (ParseException e) {
                // 不正な日付のときはこのブロックに到達
                // Exception is occurs in case of incorrect date
            }
        }

        return false;
    }

    /**
     * 日付の書式変換。
     * Convert date to format
     * <p>
     * ユーザ設定の「言語」に対応した日付書式に変換する。
     * Convert date to date format corresponded to language user setting
     * </p>
     * 
     * @param input 日付
     * @param input Date
     * @param locale ロケール
     * @param locale Locale
     * @return 書式変換後の日付
     * @return Date converted to format
     */
    public static String formatDate(Date input, Locale locale) {
        return formatDate(input, locale, PROPS_KEY_FORMAT_YMD);

    }

    /**
     * 日付の書式変換。
     * Convert date to format
     * <p>
     * ユーザ設定の「言語」に対応した日付書式に変換する。
     * Convert date to date format corresponded to language user setting
     * </p>
     * 
     * @param input 日付
     * @param input Date
     * @param locale ロケール
     * @param locale Locale
     * @param formatKey フォーマットキー
     * @param formatKey Format key
     * @return 書式変換後の日付
     * @return Date converted to format
     */
    public static String formatDate(Date input, Locale locale, String formatKey) {
        Resource rs = new Resource(locale);
        return formatDate(input, rs.getResource(formatKey));

    }

    /**
     * 日時変換機能。
     * Function converting date and time
     * <p>
     * 指定した日時(GMT)を、指定したタイムゾーンへ変換する。
     * Convert specified date and time(GMT) to specified time zone
     * </p>
     * 
     * @param input 日付(日時)
     * @param input Date(Date and time)
     * @param timezone 変換後タイムゾーン
     * @param timezone Time zone converted
     * @return タイムゾーン変換後の日付
     * @return Date converted to time zone
     */
    public static Date convertTime(Date input, String timezone) {
        TimezoneManageFacadeService timezoneManageFacadeService = (TimezoneManageFacadeService)SpringUtil
            .getBean("timezoneManageFacadeService");
        // GMT
        String gmt = "0000000001";

        Date ret = null;
        try {
            ret = timezoneManageFacadeService.convertDate(input, gmt, timezone);
        } catch (TimezoneManageException e) {
            return null;
        }
        return ret;
    }

    /**
     * UTCをローカルタイムに変換します。（責任会社のフォーマットに書式変換）
     * Convert UTC to local time(To company format)
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param input 変換前日時文字列(フォーマット：yyyy-MM-dd HH:mm:ss)
     * @param input Date and time string former conversion(Format:yyyy-MM-dd HH:mm:ss)
     * @param ownerComp プロパティキー（責任会社コードなど）
     * @param ownerComp Property key（Company code etc.）
     * @param timeDiff タイムゾーン(フォーマット：±HH:mm)
     * @param timeDiff Time zone(Format：±HH:mm)
     * @param locale ロケール
     * @param locale Locale
     * @return 変換後日時文字列（ローカルタイム）
     * @return Date and time string later conversion（Local time）
     */
    public static String getLocalDateByOwnerComp(
        String input, String ownerComp, String timeDiff, Locale locale) {

        String format = getDateFormatFromResource(ownerComp, locale);
        
        if(CheckUtil.isBlankOrNull(format)){
            return null;
        }
        
        return getLocalTime(input, format + FORMAT_TIME, timeDiff);
    }

    /**
     * ローカルタイムをUTCに変換します。
     * Convert local time to UTC
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param input 変換前日時文字列
     * @param input Date and time string former conversion
     * @param ownerComp プロパティキー（責任会社コードなど）
     * @param ownerComp Property key(Company code etc.)
     * @param timeDiff タイムゾーン(フォーマット：±HH:mm)
     * @param timeDiff Time zone(Format：±HH:mm)
     * @param locale ロケール
     * @param locale Locale
     * @return 変換後日時文字列（UTC）
     * @return Date and time string later conversion（UTC）
     */
    public static String getUTCByOwnerComp(
        String input, String ownerComp, String timeDiff, Locale locale) {

        String format = getDateFormatFromResource(ownerComp, locale);
        
        if(CheckUtil.isBlankOrNull(format)){
            return null;
        }
        
        return getUTC(input, format + FORMAT_TIME, timeDiff);
    }

    /**
     * 日付文字列のフォーマットを変換する。（責任会社⇒DBのフォーマットに形式変換）
     * Convert format of date string(Convert to format of DB from company)
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param input 変換前日付文字列
     * @param input Date and time string former conversion
     * @param ownerComp プロパティキー（責任会社コードなど）
     * @param ownerComp Property key(Company code etc.)
     * @param locale ロケール
     * @param locale Locale
     * @return 変換した日付文字列
     * @return Date string later conversion
     */
    public static String formatDateToDb(String input, String ownerComp, Locale locale) {

        String beforeFormat = getDateFormatFromResource(ownerComp, locale);
        
        Resource rs = new Resource(locale);
        String afterFormat = rs.getResource(PROPS_KEY_FORMAT_YMD);

        return formatDate(input, beforeFormat, afterFormat);
    }

    /**
     * 日付文字列のフォーマットを変換する。（DB⇒責任会社のフォーマットに形式変換）
     * Convert format of date string(Convert to company from format of DB)
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param input 変換前日付文字列
     * @param input Date and time string former conversion
     * @param ownerComp プロパティキー（責任会社コードなど）
     * @param ownerComp Property key(Company code etc.)
     * @param locale ロケール
     * @param locale Locale
     * @return 変換した日付文字列
     * @return Date string later conversion
     */
    public static String formatDateToOwnerComp(String input, String ownerComp, Locale locale) {

        Resource rs = new Resource(locale);
        String beforeFormat = rs.getResource(PROPS_KEY_FORMAT_YMD);

        String afterFormat = getDateFormatFromResource(ownerComp, locale);
        
        return formatDate(input, beforeFormat, afterFormat);
    }

    /**
     * 
     * 責任会社ごとに設定された日付フォーマットを取得します。
     * Get date format set at each company
     * 
     * <p>
     * 責任会社ごとのリソースキーが未設定の場合は、defaultのリソースキーを利用します。
     * When resource key at each company is not set,use default resource key
     * </p>
     * 
     * @param ownerComp 責任会社
     * @param ownerComp Company
     * @param locale ロケール
     * @param locale Locale
     * @return 取得した日付フォーマット
     * @return Date format gotten
     */
    private static String getDateFormatFromResource(String ownerComp, Locale locale) {

        if(locale == null){
            return null;
        }
        String changeWord = "";

        if (!CheckUtil.isBlankOrNull(ownerComp)) {
            changeWord = "." + ownerComp;
        }
        String dateFormat = RESOURCE_KEY_FORMAT_DATE_OWNERCMP.replace("{0}", changeWord);

        Resource rs = new Resource(locale);
        String result = rs.getResource(dateFormat);
        
        if (CheckUtil.isBlankOrNull(result)) {
            dateFormat = RESOURCE_KEY_FORMAT_DATE_OWNERCMP.replace("{0}", "");
            result = rs.getResource(dateFormat);
        }

        return result;

    }
    
    /**
     * 保持期限日数取得。
     * Get maintenance limit term
     * <p>
     * 「日数計算方法」と「値」を指定される事により、保持期限日数を返却する。
     * Return maintenance limit term with specifying term calculation way and value
     * </p>
     * 
     * @param mode 日数計算方法 1:日付指定 2:N日間指定 3:N月間指定 4:N年間指定 5:永年指定
     * @param mode Term calculation way 1:Date Specified 2:N day specified 3:N month specified 4:N year specified 5:Eternality specified
     * @param value 日数計算方法に応じた値
     * @param value Value which is according to term calculation way
     * @param today 基準日(本日)
     * @param today Standard day(Today)
     * @return 保持期限日数
     * @return Maintenance limit term
     */
    private static Number getSaveLimitTerm(String mode, String value, Calendar today) {
        try {
            DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            String fromDate = format.format(today.getTime());
            if (DATE.equals(mode)) {
                // 日付指定(YYYY/MM/DD)
                // Specify date(YYYY/MM/DD)
                return differenceDays(value, fromDate);
            } else if (DAY.equals(mode)) {
                // N日間指定
                // Specify for N days
                return Integer.parseInt(value);
            } else if (MONTH.equals(mode)) {
                // N月間指定
                // Specify for N months
                Calendar future = (Calendar)today.clone();
                future.add(Calendar.MONTH, Integer.parseInt(value));
                String toDate = format.format(future.getTime());
                return differenceDays(toDate, fromDate);
            } else if (YEAR.equals(mode)) {
                // N年間指定
                // Specify for N years
                Calendar future = (Calendar)today.clone();
                future.add(Calendar.YEAR, Integer.parseInt(value));
                String toDate = format.format(future.getTime());
                return differenceDays(toDate, fromDate);
            } else if (PERMANENT.equals(mode)) {
                // 永年指定（9999/12/31)
                // Specify eternality（9999/12/31)
                return differenceDays("9999/12/31", fromDate);
            } else {
                return null; // エラー
                             // Return null
            }
        } catch (ParseException e) {
            return null; // エラー
                         // Return null
        }
    }

    /**
     * 2つの日付の差を求めます。 日付文字列 strDate1 - strDate2 が何日かを返します。
     * calculate pair of date difference.Return days which are date string,strDate1, minus date string,strDate2
     * 
     * @param strDate1 日付文字列 yyyy/MM/dd
     * @param strDate1 Date string1 yyyy/MM/dd
     * @param strDate2 日付文字列 yyyy/MM/dd
     * @param strDate2 Date string2 yyyy/MM/dd
     * @return 2つの日付の差
     * @return Pair of date difference
     * @throws ParseException 日付フォーマットが不正な場合
     * @throws ParseException Exception for incorrective date format
     */
    private static int differenceDays(String strDate1, String strDate2) throws ParseException {
        Date date1 = DateFormat.getDateInstance().parse(strDate1);
        Date date2 = DateFormat.getDateInstance().parse(strDate2);
        return differenceDays(date1, date2);
    }

    /**
     * 2つの日付の差を求めます。 java.util.Date 型の日付 date1 - date2 が何日かを返します。 計算方法は以下となります。
     * 1.最初に2つの日付を long 値に変換します。 ※この long 値は 1970 年 1 月 1 日 00:00:00 GMT からの
     * 経過ミリ秒数となります。 2.次にその差を求めます。 3.上記の計算で出た数量を 1 日の時間で割ることで 日付の差を求めることができます。 ※1
     * 日 ( 24 時間) は、86,400,000 ミリ秒です。
     * Calculate pair of date difference.Return days which is argument date1 with Date type minus argument date2 with Date type. Calculation way is under details.
     * 1. Convert pair of date to long value.This long value is milliseconds since Jan 1, 1970, 00:00:00 GMT 
     * 2. Calculate pair of milliseconds difference
     * 3. To divide quantity calculated above by 86,400,000 milliseconds makes date difference
     * One day(24 hours) equals 86,400,000 milliseconds
     * 
     * @param date1 日付 java.util.Date
     * @param date1 Date1 java.util.Date
     * @param date2 日付 java.util.Date
     * @param date2 Date2 java.util.Date
     * @return 2つの日付の差
     * @return Pair of date difference 
     */
    private static int differenceDays(Date date1, Date date2) {
        long datetime1 = date1.getTime();
        long datetime2 = date2.getTime();
        long one_date_time = 1000 * 60 * 60 * 24;
        long diffDays = (datetime1 - datetime2) / one_date_time;
        return (int)diffDays;
    }
}
