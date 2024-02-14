/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * SearchCountLimitAdvice のServiceクラス
 * Service Class of SearchCountLimitAdvice
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.aop;

import java.lang.reflect.Method;
import java.util.Locale;

import org.springframework.aop.AfterReturningAdvice;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.util.Resource;

/**
 * 検索結果の件数に応じアプリケーション例外を投げるAOPクラスです。
 * AOP class which throws application exception according to number of search result records
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class SearchCountLimitAdvice implements AfterReturningAdvice {

    // ------------------------------------------------------------ Constructors
    /**
     * デフォルトコンストラクタです。
     * Default Constructor
     */
    public SearchCountLimitAdvice() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    /**
     * 検索結果の件数に応じアプリケーション例外を投げます。
     * Throw application exception according to number of search result records
     * 
     * @param returnValue 戻り値
     * @param returnValue Return value
     * @param method 実行中のメソッド
     * @param method Executing method
     * @param args メソッドの引数
     * @param args Method argument
     * @param target メソッド呼び出しの対象オブジェクト
     * @param target Target object
     * @throws Throwable 検索結果が 0 件の場合、{@link ApplicationException} をスローします。
     *             検索結果が最大検索件数を超えていた場合、{@link ApplicationException} をスローします。
     * @throws Throwable When search result record is 0,throw {@link ApplicationException}.
     *             When search result record is over maximum search records,throw {@link ApplicationException}.

     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
        throws Throwable {
        // チェック実施有無の判定
        // Judge whether check or not
        AbstractDomain domain = (AbstractDomain)args[0];
        if (domain.isSearchCountCheckFlg()) {

            // 件数を取得
            // Get number of records
            int result = ((Integer)returnValue).intValue();

            // 0件の場合
            // If search result record is 0,throw exception
            if (result == 0) {
                // 0件のメッセージIDをスロー
                // Throw message ID for which search result record is 0
                throw new GscmApplicationException("GSCM-E0-0001");
            }
            // 上限値を取得
            // Get maximum count value
            int maxCount = 0;

            Locale locale = domain.getLocale();
            
            if (locale == null) {
                locale = new Locale(domain.getLanguageCd());
            }

            Resource rsc = new Resource(locale);
            try {
                maxCount = Integer.parseInt(rsc.getResource("maxCount." + domain.getScreenId()));
            } catch (Exception ex) {
                maxCount = Integer.parseInt(rsc.getResource("maxCount.default"));
            }
            // 上限超過の場合
            // If search result record is more then maximum count value ,throw exception
            if (maxCount < result) {
                // 上限超過のメッセージIDをスロー
                // Throw message ID for which search result record is more than maximum count value
                throw new GscmApplicationException("GSCM-E0-0003", new Object[] {result, maxCount});
            }
        }
    }
}
