/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * CheckUtilクラス
 * CheckUtil class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import com.globaldenso.ai.common.core.validation.Validations;

/**
 * チェックの共通処理を行うクラス。
 * Common checking class
 * 
 * @author $Author: 10088DS01586 $
 */
public final class CheckUtil {

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public CheckUtil() {
        super();
    }

    /**
     * 引数の文字列が空文字、またはNULLかどうか判断します。
     * Check if string of argument is empty or null.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 空文字、またはNULLの場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is empty string or null.Otherwise,return false.
     */
    public static boolean isBlankOrNull(String input) {
        if (input == null || "".equals(input)) {
            return true;
        }
        return false;
    }

    /**
     * 引数の文字列が半角文字かどうか判断します。
     * Check if string of argument is halfwidth character or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 半角文字の場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is halfwidth character. Otherwise,return false.
     */
    public static boolean isHankaku(String input) {
        return Validations.hankaku(input);
    }

    /**
     * 引数の文字列が全角文字かどうか判断します。
     * Check if string of argument is fullwidth character or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 全角文字の場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is fullwidth character. Otherwise,return false.
     */
    public static boolean isZenkaku(String input) {
        return Validations.zenkaku(input);
    }

    /**
     * 引数の文字列が禁則文字かどうか判断します。
     * Check if string of argument is prohibition character or not. 
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 禁則文字ではない場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is not prohibition character. Otherwise,return false.
     */
    public static boolean isUnprohibited(String input) {
        return Validations.unprohibited(input);
    }

    /**
     * 引数の文字列が半角カタカナかどうか判断します。
     * Check if string of argument is halfwidth KATAKANA or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 半角カタカナの場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is halfwidth KATAKANA. Otherwise,return false.
     */
    public static boolean isHankakuKatakana(String input) {
        return Validations.hankakuKatakana(input);
    }

    /**
     * 引数の文字列が全角カタカナかどうか判断します。
     * Check if string of argument is fullwidth KATAKANA or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 全角カタカナの場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is fullwidth KATAKANA. Otherwise,return false.
     */
    public static boolean isZenkakuKatakana(String input) {
        return Validations.zenkakuKatakana(input);
    }

    /**
     * 引数の文字列がサロゲートペア文字かどうか判断します。
     * Check if string of argument is Surrogates Pair or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return サロゲートペア文字を含まない場合はTrue その他の場合はFlaseを返します。
     * @return Return true when Surrogates Pair is not included. Otherwise,return false.
     */
    public static boolean isSurrogatePair(String input) {
        return Validations.surrogatePair(input);
    }
    
    /**
     * 引数の文字列が日付形式かどうか判断します。
     * Check if string of argument is date format or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @param dateFormat チェック対象の日付フォーマット
     * @param dateFormat Date format to check
     * @return 日付形式の場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is date format. Otherwise,return false.
     */
    public static boolean isDate(String input, String... dateFormat) {
        if (isBlankOrNull(input)) {
            return false;
        }
        for (String format : dateFormat) {
            if (isBlankOrNull(format)) {
                return false;
            }
        }
        // 日付の妥当性チェック
        // Validation check of date format
        return DateUtil.isDate(input, dateFormat);
    }

    /**
     * 引数の文字列が半角英数字かどうか判断します。
     * Check if string of argument is halfwidth alphanumeric or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 半角英数字の場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is halfwidth alphanumeric. Otherwise,return false.
     */
    public static boolean isAlphaNumeric(String input) {
        if (isBlankOrNull(input)) {
            return false;
        }
        if (input.matches("[a-zA-Z0-9]*")) {
            return true;
        }
        return false;
    }

    /**
     * 引数の文字列が半角英数字(大文字のみ)かどうか判断します。
     * Check if string of argument is halfwidth alphanumeric(only capital) or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 半角英数字(大文字のみ)の場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is halfwidth alphanumeric(only capital). Otherwise,return false.
     */
    public static boolean isAlphaNumericUpperOnly(String input) {
        if (isBlankOrNull(input)) {
            return false;
        }
        if (input.matches("^[A-Z0-9]*")) {
            return true;
        }
        return false;
    }

    /**
     * 引数の文字列が半角英字かどうか判断します。
     * Check if string of argument is halfwidth alphabetic character or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 半角英字の場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is halfwidth alphabetic character. Otherwise,return false.
     */
    public static boolean isAlpha(String input) {
        if (isBlankOrNull(input)) {
            return false;
        }
        if (input.matches("^[a-zA-Z]*")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 引数の文字列が半角数字かどうか判断します。
     * Check if string of argument is halfwidth numeric character or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @return 半角数字の場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is halfwidth numeric character. Otherwise,return false.
     */
    public static boolean isNumeric(String input) {
        if (isBlankOrNull(input)) {
            return false;
        }
        if (input.matches("^[0-9]*")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 文字列が数字フォーマットであることをチェックするメソッドです。
     * Check if string of argument is numeric format or not.
     * <p>
     * <ul>
     * <li>許可する文字は半角数字(0～9)、一部の半角記号(+ - .)のみです。</li>
     * <li>halfwidth numeric character and a part of symbols(+ - .) only allow.</li>
     * <li>「+-」は文字列の先頭のみ許可</li>
     * <li>「+-」allow only first digit of string</li>
     * <li>「.」は先頭と最後尾を除く文字列の中で、1つまでであること</li>
     * <li>「.」allow only one except first digit and last digit.
     * </ul>
     * </p>
     * 
     * @param input チェックする文字列
     * @param input String to check
     * @return 数字フォーマットの場合はTrue その他の場合はFalseを返します。
     * @return Return true when string is numeric format. Otherwise,return false.
     */
    public static boolean isNumericalNumber(String input) {
        if (isBlankOrNull(input)) {
            return false;
        }
        if (input.matches("[+-]?\\d+(\\.\\d+)?")) {
            return true;
        } else {
            return false;

        }
    }

    /**
     * 引数の文字列が指定された最大桁数より大きい値かどうか判断します。
     * Check if string of argument is longer than max length specified or not.
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @param maxLength 最大桁数
     * @param maxLength Max length
     * @return 文字列が最大桁数より大きい場合はTrue 小さい場合はFalseを返します。
     * @return Return true when string is longer than max length. Otherwise,return false.
     */
    public static boolean isGreater(String input, int maxLength) {
        if (isBlankOrNull(input)) {
            return false;
        }
        if (input.length() > maxLength) {
            return true;
        }
        return false;
    }

    /**
     * 引数の文字列が指定された書式かどうか判断します。
     * Check if string of argument is match to format specified
     * 
     * @param input チェック対象文字列
     * @param input String to check
     * @param format 書式
     * @param format Format
     * @return 文字列が書式と合致した場合はTrue 合致しない場合はFalseを返します。
     * @return Return true when string is match to format specified.
     */
    public static boolean isMatchedFormat(String input, String format) {
        if (isBlankOrNull(input) || isBlankOrNull(format)) {
            return false;
        }
        if (input.matches(format)) {
            return true;
        } else {
            return false;
        }
    }

}