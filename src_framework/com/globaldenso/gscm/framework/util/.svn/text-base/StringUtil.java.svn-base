/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * StringUtilクラス
 * StringUtil class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.math.BigDecimal;

import com.globaldenso.ai.common.core.exception.SystemException;

/**
 * <p>
 * ビジネス層の共通の処理(フォーマット変換)を行うクラス。
 * Common class(format conversion) for Business layer
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 */
public final class StringUtil {

    /**
     * デフォルトコンストラクタ。
     * Default Constructor
     */
    public StringUtil() {
        super();
    }

    /**
     * 文字列の右埋め。
     * Padding with space in the right of the string specified.
     * <p>
     * 指定文字列を右埋めする。
     * Padding with space in the right of the string specified.
     * </p>
     * <li>指定文字列が最大文字数になるまで文字で埋める。</li>
     * <li>Padding spaces until max number of characters.</li>
     * <li>指定文字列に追加される文字は半角スペース固定。</li>
     * <li>Padding character is space constantly.</li>
     * <li>指定文字列の長さ≧最大文字数の場合は処理を行わない。</li>
     * <li>If the length of the string specified≧Max number of characters,nothing to do.</li>
     * 
     * @see #rPad(String, int, char)
     * @param targetStr 指定文字列
     * @param targetStr String specified
     * @param maxLength 最大文字数
     * @param maxLength Max number of characters
     * @return 結果文字列
     * @return Result string
     */
    public static String rPad(String targetStr, int maxLength) {
        return rPad(targetStr, maxLength, '\u0020');
    }

    /**
     * 文字列の右埋め。
     * Padding with character specified in the right of the string specified.
     * <p>
     * 指定文字列を半角スペースで右埋めする。
     * Padding with character specified in the right of the string specified.
     * </p>
     * <li>指定文字列が最大文字数になるまで文字で埋める。</li>
     * <li>Padding character specified until max number of characters</li>
     * <li>指定文字列に追加される文字は引数にて指定。</li>
     * <li>Padding character is character specified of argument.</li>
     * <li>指定文字列の長さ≧最大文字数の場合は処理を行わない。</li>
     * <li>If the length of the string specified≧Max number of characters,nothing to do.</li>
     * 
     * @param targetStr 指定文字列
     * @param targetStr String specified
     * @param maxLength 最大文字数
     * @param maxLength Max number of characters
     * @param buriesChar 追加文字
     * @param buriesChar Padding character
     * @return 結果文字列
     * @return Result string
     */
    public static String rPad(String targetStr, int maxLength, char buriesChar) {
        // 指定文字列がNULLの場合
        // If string specified is null,
        if (targetStr == null) {
            throw new SystemException(new IllegalArgumentException("targetStr is null"));
        }

        // StringBuilderオブジェクトを生成し、指定文字列を追加
        // Create the StringBuilder object and append string specified.
        StringBuilder result = new StringBuilder();
        result.append(targetStr);

        // 追加文字を不足分追加
        // Append padding character to remaining.
        String buriesStr = String.valueOf(buriesChar);
        while (result.length() < maxLength) {
            result.append(buriesStr);
        }

        return result.toString();
    }

    /**
     * 文字列の左埋め。
     * Padding with space in the left of the string specified.
     * <p>
     * 指定文字列を左埋めする。
     * Padding with space in the left of the string specified.
     * </p>
     * <li>指定文字列が最大文字数になるまで文字で埋める。</li>
     * <li>Padding character specified until max number of characters.</li>
     * <li>指定文字列に追加される文字は半角スペース固定。</li>
     * <li>Padding character is space constantly.</li>
     * <li>指定文字列の長さ≧最大文字数の場合は処理を行わない。</li>
     * <li>If the length of the string specified≧Max number of characters,nothing to do.</li>
     * 
     * @see #lPad(String, int, char)
     * @param targetStr 指定文字列
     * @param targetStr String specified
     * @param maxLength 最大文字数
     * @param maxLength Max number of characters
     * @return 結果文字列
     * @return Result string
     */
    public static String lPad(String targetStr, int maxLength) {
        return lPad(targetStr, maxLength, '\u0020');
    }

    /**
     * 文字列の左埋め。
     * Padding with character specified in the left of the string specified.
     * <p>
     * 指定文字列を半角スペースで左埋めする。
     * Padding with character specified in the left of the string specified.
     * </p>
     * <li>指定文字列が最大文字数になるまで文字で埋める。</li>
     * <li>Padding character specified until max number of characters.</li>
     * <li>指定文字列に追加される文字は引数にて指定。</li>
     * <li>Padding character is character specified of argument.</li>
     * <li>指定文字列の長さ≧最大文字数の場合は処理を行わない。</li>
     * <li>If the length of the string specified≧Max number of characters,nothing to do.</li>
     * 
     * @param targetStr 指定文字列
     * @param targetStr String specified
     * @param maxLength 最大文字数
     * @param maxLength Max number of characters
     * @param buriesChar 追加文字
     * @param buriesChar Padding character
     * @return 結果文字列
     * @return Result string
     */
    public static String lPad(String targetStr, int maxLength, char buriesChar) {
        // 指定文字列がNULLの場合
        // If string specified is null.
        if (targetStr == null) {
            throw new SystemException(new IllegalArgumentException("targetStr is null"));
        }

        // StringBuilderオブジェクトを生成し、指定文字列を追加
        // Create the StringBuilder object and append string specified.
        String buriesStr = String.valueOf(buriesChar);
        StringBuilder result = new StringBuilder();

        // 追加文字を不足分追加
        // Append padding character to remaining.
        for (int i = 0; i < maxLength - targetStr.length(); i++) {
            result.append(buriesStr);
        }
        result.append(targetStr);

        return result.toString();
    }

    /**
     * 文字列"0"除去左詰。
     * Suppress the leading zeros
     * <p>
     * 文字列の左のゼロ除去。
     * Suppress the leading zeros
     * </p>
     * 
     * @param targetStr 指定文字列
     * @param targetStr String specified
     * @return 結果文字列
     * @return Result string
     */
    public static String lTrimZero(String targetStr) {
        // 指定文字列がNULLの場合
        // If string specified is null.
        if (targetStr == null) {
            throw new SystemException(new IllegalArgumentException("targetStr is null"));
        }

        // 文字列の左についている"0"を空文字に置換し返却
        // Return the string suppressed the leading zeros
        return targetStr.replaceAll("(^[0]*)", "");
    }

    /**
     * 文字列の右トリム。
     * Trim right spaces of string
     * <p>
     * 文字列右端の全角/半角スペースを除去する。
     * Trim right spaces of string
     * </p>
     * 
     * @param targetStr 指定文字列
     * @param targetStr String specified
     * @return 結果文字列
     * @return Result string
     */
    public static String rTrim(String targetStr) {
        // 指定文字列がNULLの場合
        // If string specified is null.
        if (targetStr == null) {
            throw new SystemException(new IllegalArgumentException("targetStr is null"));
        }

        // 文字列の右についているスペースを空文字に置換し返却
        // Return the string trimed right spaces.
        return targetStr.replaceAll("[ 　]*$", "");

    }

    /**
     * 文字列の前後をトリム。
     * Trim right and left spaces of string
     * <p>
     * 文字列前後の全角/半角スペースをトリムする。
     * Trim right and left spaces of string
     * </p>
     * 
     * @param targetStr 指定文字列
     * @param targetStr String specified
     * @return 結果文字列
     * @return Result string
     */
    public static String trim(String targetStr) {
        // 指定文字列がNULLの場合
        // If string specified is null.
        if (targetStr == null) {
            throw new SystemException(new IllegalArgumentException("targetStr is null"));
        }

        // 文字列の前後についているスペースを空文字に置換し返却
        // Return the string trimed right and left spaces.
        return targetStr.replaceAll("(^[ 　]*)|([ 　]*$)", "");

    }

    /**
     * 整数文字列取得。
     * Get the integer string
     * <p>
     * BigDecimal型の数値より整数文字列を取得する。
     * Get integer string from numeric of BigDecimal
     * </p>
     * 
     * @param targetDec 指定数値
     * @param targetDec Numeric specified
     * @return 整数文字列
     * @return integer string
     */
    public static String convertIntegerStr(BigDecimal targetDec) {
        // 指定数値がNULLの場合
        // If numeric specified is null.
        if (targetDec == null) {
            throw new SystemException(new IllegalArgumentException("targetDec is null"));
        }

        // BigDecimal型→String型に変換し返却
        // Return the string converted from BigDecimal
        return targetDec.toBigInteger().toString();
    }

    /**
     * 整数文字列(3桁カンマ区切り)取得。
     * Get the integer string(3-digit comma separated)
     * <p>
     * BigDecimal型の数値より整数文字列をカンマ区切りで取得する。
     * Get the integer string from numeric of BigDecimal separated 3-digit comma.
     * </p>
     * <li> フォーマット：区切り(1,000,000) </li>
     * <li> Format：Delimiter(1,000,000) </li>
     * 
     * @param targetDec 指定数値
     * @param targetDec Numeric specified
     * @return 整数文字列
     * @return integer string
     */
    public static String cnvIntStrToComma(BigDecimal targetDec) {
        // 指定数値がNULLの場合
        // If numeric specified is null.
        if (targetDec == null) {
            throw new SystemException(new IllegalArgumentException("targetDec is null"));
        }

        // 数値を3桁のカンマ区切りにフォーマットし返却
        // Return the 3-digit comma separated string.
        return String.format("%1$,3d", targetDec.toBigInteger());
    }

    /**
     * 空時ブランク取得。
     * Return the empty string when string specified is null or empty string.Otherwise,return the string specified.
     * <p>
     * 文字列が存在する場合対象文字列を返却。文字列が空かnullの場合ブランクを返却する。
     * Return the empty string when string specified is null or empty string.Otherwise,return the string specified.
     * </p>
     * 
     * @param str 対象文字列
     * @param str String specified
     * @return 返却文字列
     * @return Return string
     */
    public static String getEmptyToBlank(String str) {
        if (CheckUtil.isBlankOrNull(str)) {
            // 指定文字列がNULLまたは空文字の場合空文字を返却
            // Return the empty string when string specified is null or empty string.
            return "";
        } else {
            // その他の場合は指定文字列をそのまま返却
            // Otherwise,return the string specified.
            return str;
        }
    }

    /**
     * likeを正しく行うためエスケープを行います。
     * Escape string for executing LIKE condition of SQL statement properly.
     * <p>
     * エスケープ対象文字列 _ % \ ＿ ％ ￥
     * String to escape _ % \ ＿ ％ ￥
     * </p>
     * 
     * @param str String エスケープ対象文字列
     * @param str String String to escape
     * @return String エスケープ済み文字列
     * @return String Escaped string
     */
    public static String getSQLEscapeString(String str) {
        if (CheckUtil.isBlankOrNull(str)) {
            return str;
        }

        String ret = str;
        // [\]の置換
        // Replace [\]
        ret = ret.replaceAll("\\\\", "\\\\\\\\");
        // [%]の置換
        // Replace [%]
        ret = ret.replaceAll("%", "\\\\%");
        // [_]の置換
        // Replace [_]
        ret = ret.replaceAll("_", "\\\\_");
        // [％]の置換
        // Replace [％]
        ret = ret.replaceAll("％", "\\\\％");
        // [＿]の置換
        // Replace [＿]
        ret = ret.replaceAll("＿", "\\\\＿");
        // [¥]の置換
        // Replace [¥]
        ret = ret.replaceAll("￥", "\\\\￥");

        return ret;
    }

    /**
     * String型の文字列をInteger型に変換する。
     * Convert string to integer
     * <p>
     * nullや空文字("")の場合、0として処理する。
     * When the string is null or "", it's regarded as 0.
     * </p>
     * 
     * @param str 変換対象の文字列
     * @param str String specified
     * @return 変換結果（Integer）
     * @return Result(Integer）
     */
    public static Integer parseInteger(String str) {
        // 指定文字列がNULLまたは空文字の場合、"0"をセット
        // Set 0 when string specified is null or empty string.
        if (CheckUtil.isBlankOrNull(str)) {
            str = "0";
        }

        // String型→Integer型に変換し返却
        // Return integer(String→Integer)
        return Integer.valueOf(str);
    }

    /**
     * String型の文字列をBigDecimal型に変換する。
     * Convert string to BigDecimal
     * <p>
     * nullや空文字("")の場合、0として処理する。
     * When the string is null or "", it's regarded as 0.
     * </p>
     * 
     * @param str 変換対象の文字列
     * @param str String specified
     * @return 変換結果（BigDecimal）
     * @return Result（BigDecimal）
     */
    public static BigDecimal parseBigDecimal(String str) {
        // 指定文字列がNULLまたは空文字の場合、"0"をセット
        // Set 0 when string specified is null or empty string.
        if (CheckUtil.isBlankOrNull(str)) {
            str = "0";
        }

        // String型→BigDecimal型に変換し返却
        // Return BigDecimal(String→BigDecimal)
        return new BigDecimal(str);
    }
}
