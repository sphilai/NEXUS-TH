/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * NoDataAffectedAdvice のServiceクラス
 * Service Class of NoDataAffectedAdvice
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * 更新、削除、無効結果の件数に応じアプリケーション例外を投げるAOPクラスです。
 * AOP class throwing application exception accorting to number of modification,deletion and invalid
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class NoDataAffectedAdvice implements AfterReturningAdvice {

    // ------------------------------------------------------------ Constructors
    /**
     * デフォルトコンストラクタです。
     * Default constructor
     */
    public NoDataAffectedAdvice() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    /**
     * 更新、削除、無効結果の件数に応じアプリケーション例外を投げます。
     * Throw application exception accorting to number of modification,deletion and invalid
     *
     * @param returnValue 戻り値
     * @param returnValue Return value
     * @param method 実行中のメソッド
     * @param method Executing method
     * @param args メソッドの引数
     * @param args Method argument
     * @param target メソッド呼び出しの対象オブジェクト
     * @param target Target object of invoking method
     * @throws Throwable
     *    更新、削除、無効結果が 0 件の場合、{@link GscmApplicationException} をスローします。
     *    When result of modification,deletion and invalid is zero record,throw {@link GscmApplicationException}
     */
    public void afterReturning(Object returnValue, Method method, Object[] args,
        Object target) throws Throwable {

        // 件数を取得
        // Get number of records
        int result  = ((Integer) returnValue).intValue();

        if (result == 0) {
            // 件数が0件の時の処理
            // If number of record is 0,throw GscmApplicationException
            // "他のユーザによって更新、又は、削除されています。"
            // "Other user modify or delete"
            throw new GscmApplicationException("GSCM-E0-0010");
        }
    }
}
