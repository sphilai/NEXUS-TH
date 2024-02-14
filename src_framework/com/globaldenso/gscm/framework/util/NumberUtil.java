/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * NumberUtilクラス
 * NumberUtil Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.globaldenso.ai.common.core.exception.SystemException;

/**
 * 数値に関する操作を行うためのユーティリティ・クラスです。
 * Utility class for operating numerical value 
 *
 * @author FSI
 * @version 1.0.0
 */
public final class NumberUtil {

    /**
     * 標準数値フォーマット
     * Format of standard numerical value
     */
    private static final String DEFAULT_NUM_FORMAT = "#0.##########";

    /**
     * 標準数値フォーマットリソースキー
     * Resource key for format of standard numerical value
     */
    private static final String RESOURCE_KEY_DEFAULT_NUMBER_FORMAT = "format.system.number";

    /**
     * 数値フォーマットリソースキー
     * Resource key of numerical value format
     */
    private static final String RESOURCE_KEY_NUMBER_FORMAT = "format{0}.number";

    /**
     * カンマ
     * Comma
     */
    private static final String COMMA = ",";

    /**
     * ドット
     * Dot
     */
    private static final String DOT = ".";
    
    /**
     * デフォルトコンストラクタ。
     * Default constructor
     *
     */
    public NumberUtil() {
    }

    /**
     * 
     * 数値文字列のフォーマットを変換します（DB⇒責任会社のフォーマットに形式変換）
     * Convert format of numeric value string (Convert to company format from DB)
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * 書式の変換に失敗した場合、変換前の数値文字列を返します。
     * If fail in converting format,return numeric value string of former conversion
     * </p>
     * 
     * @param num   変換する数値文字列
     * @param num   Numeric value string to be converted
     * @param ownerComp フォーマット変換したい責任会社
     * @param ownerComp Format conversion company 
     * @param locale ロケール
     * @param locale Locale
     * @return 変換された数値文字列
     * @return Numeric value string converted
     */
    public static String formatNumberToOwnerComp(String num, String ownerComp, Locale locale) {

        String format = getNumberFormatFromResource(ownerComp, locale);
        String defaultFormat = getDefaultNumberFormatFromResource(locale);

        return formatNumber(num, defaultFormat, format);
    }

    /**
     * 
     * 数値文字列のフォーマットを変換します（責任会社⇒DBのフォーマットに形式変換）
     * Convert format of numeric value string (Convert to company from DB format)
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * 書式の変換に失敗した場合、変換前の数値文字列を返します。
     * If fail in converting format,return numeric value string of former conversion
     * </p>
     * 
     * @param num   変換する数値文字列
     * @param num   Numeric value string to be converted
     * @param ownerComp フォーマット変換したい責任会社
     * @param ownerComp Format conversion company 
     * @param locale ロケール
     * @param locale Locale
     * @return 変換された数値文字列
     * @return Numeric value string converted
     */
    public static String formatNumberToDb(String num, String ownerComp, Locale locale) {

        Pattern p = Pattern.compile("^[0-9]*[.]*[0-9]*$");

        //引数numが数字と"."（ドット）以外の文字列（カンマや半角スペース）を含まない場合は
        //DB登録時の形式のため、引数の値をそのまま返却する
        //If numeric value string to be converted of argument does not include string(like comma or halfwidht space) except number and dot,
        //Return numeric value string to be converted of argument because of type defined at DB creation

        if (p.matcher(num).find()) {

            return num;

        }

        String format = getNumberFormatFromResource(ownerComp, locale);
        String defaultFormat = getDefaultNumberFormatFromResource(locale);

        return formatNumber(num, format, defaultFormat);
    }

    /**
     * 
     * 数値文字列のフォーマットを変換します
     * Convert format of numeric value string
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * 書式の変換に失敗した場合、変換前の数値文字列を返します。
     * If fail in converting format,return numeric value string of former conversion
     * </p>
     * 
     * @param num   変換する数値文字列
     * @param num   Numeric value string to be converted
     * @param beforeFormat プロパティキー（変換前の数値フォーマット）
     * @param beforeFormat Former property key(Numeric value format of former conversion)
     * @param afterFormat プロパティキー（変換後の数値フォーマット）
     * @param afterFormat Later property key(Numeric value format of later conversion)
     * @return  変換された数値文字列
     * @return Numeric value string converted
     */
    public static String formatNumber(String num, String beforeFormat, String afterFormat) {

        if (CheckUtil.isBlankOrNull(num) || CheckUtil.isBlankOrNull(beforeFormat)
            || CheckUtil.isBlankOrNull(afterFormat)) {
            return null;
        }
        
        String returnString = format(parseNumber(num, beforeFormat), afterFormat);
        
        if (CheckUtil.isBlankOrNull(returnString)) {
            returnString = num;
        }

        return returnString;
    }

    /**
     * 
     * Number オブジェクトを数値文字列に変換します
     * Convert numeric object to numeric value string
     * 
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param num   変換する Number オブジェクト
     * @param num   Numeric object to be converted
     * @param format プロパティキー（変換する数値フォーマット）
     * @param format Property key(Numeric value format to be converted)
     * @return  変換した数値文字列
     * @return  Numeric value string converted
     */
    public static String format(Number num, String format) {

        if (num == null || CheckUtil.isBlankOrNull(format)) {
            return null;
        }
        
        // 数値文字列変換用のフォーマット設定
        // Set format for converting numeric value string
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        String decformat = replaceDecimalFormat(format, dfs);
        if (CheckUtil.isBlankOrNull(decformat)) {
            return null;
        }
        DecimalFormat df = new DecimalFormat(decformat, dfs);

        return df.format(num);
    }

    /**
     * 数値文字列を Number 型に変換します
     * Convert numeric value string to numeric type
     * 
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param num   変換する数値文字列
     * @param num   Numeric value string to be converted
     * @param format プロパティキー（変換する数値フォーマット）
     * @param format Property key(Numeric value format to be converted)
     * @return  変換した Number オブジェクト
     * @return  Numeric object converted
     */
    public static Number parseNumber(String num, String format) {

        if (CheckUtil.isBlankOrNull(num) || CheckUtil.isBlankOrNull(format)) {
            return null;
        }
        
        // 数値変換用のフォーマット設定
        // Set format for converting numeric value
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        String decformat = replaceDecimalFormat(format, dfs);
        if (CheckUtil.isBlankOrNull(decformat)) {
            return null;
        }
        DecimalFormat df = new DecimalFormat(decformat, dfs);
        df.setParseBigDecimal(true);
        
        try {
            return df.parse(num);
        } catch (ParseException e) {
            throw new SystemException(e);
        }
    }

    /**
     * 
     * 責任会社ごとに設定された数値フォーマットを取得します<br />
     * Get numeric format set at each company<br />
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
     * @return 取得した数値フォーマット
     * @return Numeric value format gotten
     */
    private static String getNumberFormatFromResource(String ownerComp, Locale locale) {

        if(locale == null){
            return null;
        }

        String changeWord = "";

        if (!CheckUtil.isBlankOrNull(ownerComp)) {
            changeWord = "." + ownerComp;
        }
        String numberFormat = RESOURCE_KEY_NUMBER_FORMAT.replace("{0}", changeWord);

        // リソースを取得
        // Get resource
        Resource rs = new Resource(locale);

        String result = rs.getResource(numberFormat);
        
        if (CheckUtil.isBlankOrNull(result)) {
            numberFormat = RESOURCE_KEY_NUMBER_FORMAT.replace("{0}", "");
            result = rs.getResource(numberFormat);
        }

        return result;
    }

    /**
     * 
     * 標準数値フォーマットを取得します<br />
     * Get format for standart numeric value<br />
     * 
     * <p>
     * 標準数値フォーマットが未設定の場合は、数値フォーマットを"#0.##########"とします。
     * When format for standart numeric value is not set,set "#0.##########" to numeric format
     * </p>
     * 
     * @param locale ロケール
     * @param locale Locale
     * @return 取得した標準数値フォーマット
     * @return Gotten format of standart numeric value
     */
    private static String getDefaultNumberFormatFromResource(Locale locale) {

        // リソースを取得
        // Get resource
        Resource rs = new Resource(locale);

        String result = rs.getResource(RESOURCE_KEY_DEFAULT_NUMBER_FORMAT);
        
        if (CheckUtil.isBlankOrNull(result)) {
            result = DEFAULT_NUM_FORMAT;
        }

        return result;
    }
    
    /**
     * 
     * 数値フォーマットを標準の区切り文字(グループ区切り","、小数点".")に置換えます<br />
     * Replace format of numeric value with delimiter(group delimiter",",decimal point".") <br />
     * <p>
     * 各パラメータがNULLまたは空文字の場合、NULLを返します。
     * If each argument is null or string empty,return null
     * </p>
     * 
     * @param format プロパティキー（変換する数値フォーマット）
     * @param format Property key(Numeric value format to be converted)
     * @param symbols 区切り文字
     * @param symbols Delimiter
     * @return 変換した数値フォーマット
     * @return Converted formtat of numeric value
     */
    private static String replaceDecimalFormat(String format, DecimalFormatSymbols symbols) {

        if (CheckUtil.isBlankOrNull(format)) {
            return null;
        }
        
        // 数値フォーマットチェック
        Pattern p = Pattern.compile("^[#0., \']*$");
        if (!p.matcher(format).matches()) {
            return null;
        }
        
        StringBuffer sb = new StringBuffer(format);
        
        // 区切り文字の初期化
        // Initialize delimiter
        symbols.setDecimalSeparator('?');
        symbols.setGroupingSeparator('?');
        
        p = Pattern.compile("[., \']");
        Matcher m = p.matcher(format);
        while (m.find()) {
            if ("0".equals(format.substring(m.start() - 1, m.start()))
                    || "0".equals(format.substring(m.end(), m.end() + 1))) {
                // 区切り文字の前後いずれかが"0"の場合は小数点
                // If each front and rear of delimiter is "0",delimiter is decimal
                if (symbols.getDecimalSeparator() != '?') {
                    // 小数点が設定済みの場合、エラー
                    // If decimal is already set,return error
                    return null;
                }
                symbols.setDecimalSeparator(m.group().charAt(0));
                sb = sb.replace(m.start(), m.end(), DOT);
            } else {
                // 区切り文字の前後が"0"以外の場合はグループ区切り
                // If each front and rear of delimiter is not "0",delimiter is group delimiter
                if (symbols.getGroupingSeparator() != '?') {
                    // グループ区切りが設定済みの場合、エラー
                    // If group delimiter is already set,return error
                    return null;
                }
                symbols.setGroupingSeparator(m.group().charAt(0));
                sb = sb.replace(m.start(), m.end(), COMMA);
            }
        }
        
        return sb.toString();
    }

}
