/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core;

import java.util.Map;

import com.globaldenso.eca0027.core.common.business.domain.SelectListItemDomain;


/**
 * SelectListItemDomain用のMatcherクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class SelectListItemDomainMatcher extends AbstractEca0027DomainMatcher<SelectListItemDomain> {

    /**
     * コンストラクタ
     *
     * @param testClass テストクラス
     */
    public SelectListItemDomainMatcher(Class<?> testClass) {
        super(testClass);
    }

    /**
     * コンストラクタ
     *
     * @param expectedMap 期待値（マップ）
     * @param testClass テストクラス
     */
    public SelectListItemDomainMatcher(Map<String, String> expectedMap, Class<?> testClass) {
        super(expectedMap, testClass);
    }
}
