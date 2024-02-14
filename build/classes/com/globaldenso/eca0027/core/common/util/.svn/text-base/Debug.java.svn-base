/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.util;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * デバッグ支援ユーティリティーです。
 *
 * <p>
 * 開発方針で独自のログ出力は禁止されています。
 * 使用後は忘れずに本ユーティリティーの呼び出しコードを削除してください。
 * （テストプログラムは適用外）
 * </p>
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11271 $
 */
public class Debug {

    // ---------------------------------------------------------------- Constans

    /**
     * ダンプ許可パターン。
     */
    private static final String[] allows = new String[] {
        "com.globaldenso.ai"
        , "com.globaldenso.eca0027"
        , "com.globaldenso.gscm"
    };

    /**
     * ダンプ抑止パターン。
     */
    private static final String[] denies = new String[] {
        // 例
        //"com.globaldenso.scope.business.domain.SummaryOutputDomain#targetYear"
        //, "com.globaldenso.scope.business.domain.SummaryOutputDetailDomain"
        "com.globaldenso.gscm.framework.presentation.ActionPageInfoCreator"
    };

    // ------------------------------------------------------------ Constructors
    /**
     * コンストラクタです。
     */
    private Debug() {
    }

    // ---------------------------------------------------------- Public Methods

    /**
     * オブジェクトをダンプします。
     *
     * <p>
     * 任意のオブジェクトの内容を標準出力にダンプします。
     * </p>
     * 
     * @param o オブジェクト（プリミティブ型や、配列も可）
     */
    public static void dump(Object o) {
        dump(o, 0);
    }

    // --------------------------------------------------------- Private Methods

    /**
     * オブジェクトを再帰的にダンプします。
     * 
     * @param o オブジェクト
     * @param level ネストレベル
     */
    private static void dump(Object o, int level) {

        if (10 < level) {
            return;
        }

        if (o == null) {
            println("null.");
            return;
        }

        // 配列の場合
        if (o.getClass().isArray()) {
            println(o.getClass().getSimpleName() + " {");
            int size = Array.getLength(o);
            for (int i = 0; i < size; i++) {
                print("[" + i + "] ", level + 1);
                dump(Array.get(o, i), level + 1);
            }
            println("}", level);

        // Listの場合
        } else if (o instanceof List) {
            println(o.getClass().getSimpleName() + " {");
            int size = ((List<?>)o).size();
            for (int i = 0; i < size; i++) {
                print("[" + i + "] ", level + 1);
                dump(((List<?>)o).get(i), level + 1);
            }
            println("}", level);

        // Mapの場合
        } else if (o instanceof Map) {
            println(o.getClass().getSimpleName() + " {");
            Set<?> keySet = ((Map<?, ?>)o).keySet();
            for (Object key : keySet) {
                print("[" + trapNull(key).toString() + "] ", level + 1);
                dump(((Map<?, ?>)o).get(key), level + 1);
            }
            println("}", level);

        // Dateの場合
        } else if (o instanceof Date) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            println(formatter.format((Date)o));

        // Calendarの場合
        } else if (o instanceof Calendar) {
            Date date = new Date(((Calendar)o).getTimeInMillis());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            println(formatter.format(date));

        } else {

            String classFullName = o.getClass().getName();
            // 許可パターンにマッチし、抑止パターンにマッチしないクラスの場合
            if (match(classFullName, allows) && !match(classFullName, denies)) {
                println(o.getClass().getSimpleName() + " {");
                Class<?> clazz = o.getClass();
                // 継承しているクラス分繰り返す。
                while (clazz != null) {
                    // フィールド分繰り返す。
                    Field[] fields = clazz.getDeclaredFields();
                    for (Field field : fields) {
                        field.setAccessible(true);
                        // 定数フィールドの出力を抑止する。
                        if (
                                Modifier.isStatic(field.getModifiers())
                            &&  Modifier.isFinal(field.getModifiers())
                        )
                        {
                            continue;
                        }
                        print("[" + field.getName() + "] ", level + 1);
                        try {
                            // 抑止パターンにマッチするフィールドの出力を抑止する。
                            if (match(classFullName + "#" + field.getName(), denies)) {
                                println(trapNull2(field.get(o)));
                                continue;
                            }
                            dump(field.get(o), level + 1);
                        } catch (Exception e) {
                            print("Access dinied.");
                        }
                    }
                    clazz = clazz.getSuperclass();
                }
                println("}", level);

            // 抑止パターンにマッチするクラスの出力を抑止する。
            } else if (match(classFullName, denies)) {
                println(trapNull2(o));

            } else {
                println(trapNull(o));
            }
        }
    }

    /**
     * 文字列のパターンを検査します。
     * 
     * @param s 被検査文字列
     * @param patterns パターン
     * @return 1つでもマッチしていればtrue、それ以外はfalse。
     */
    private static boolean match(String s, String[] patterns) {
        for (String pattern : patterns) {
            if (s.startsWith(pattern)) {
                return true;
            }
        }
        return false;
    }

    /**
     * nullを考慮したオブジェクトの文字列表現を返却します。
     * 
     * @param o オブジェクト
     * @return 文字列表現（o.toString() or "null."）
     */
    private static String trapNull(Object o) {
        if (o != null) {
            return o.toString();
        }
        return "null.";
    }

    /**
     * nullを考慮したオブジェクトの文字列表現を返却します。
     * 
     * @param o オブジェクト
     * @return 文字列表現（"Not null." or "null."）
     */
    private static String trapNull2(Object o) {
        if (o != null) {
            return "Not null.";
        }
        return "null.";
    }

    /**
     * 文字列を出力します（改行なし）。
     * 
     * @param s 文字列
     */
    private static void print(String s) {
        print(s, 0);
    }

    /**
     * 文字列を出力します（改行なし）。
     * 
     * @param s 文字列
     * @param level ネストレベル
     */
    private static void print(String s, int level) {
        StringBuffer indent = new StringBuffer();
        for (int i = 0; i < level; i++) {
            indent.append("\t");
        }
        System.out.print(indent.append(s).toString());
    }

    /**
     * 文字列を出力します（改行あり）。
     * 
     * @param s 文字列
     */
    private static void println(String s) {
        println(s, 0);
    }

    /**
     * 文字列を出力します（改行あり）。
     * 
     * @param s 文字列
     * @param level ネストレベル
     */
    private static void println(String s, int level) {
        StringBuffer indent = new StringBuffer();
        for (int i = 0; i < level; i++) {
            indent.append("\t");
        }
        System.out.println(indent.append(s).toString());
    }
}
