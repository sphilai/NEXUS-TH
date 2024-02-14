/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core;

import java.util.Map;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * AbstractDomain用のMatcherクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class AbstractDomainMatcher extends AbstractEca0027DomainMatcher<AbstractDomain> {

    /**
     * コンストラクタ
     *
     * @param testClass テストクラス
     */
    public AbstractDomainMatcher(Class<?> testClass) {
        super(testClass);
    }

    /**
     * コンストラクタ
     *
     * @param expectedMap 期待値（マップ）
     * @param testClass テストクラス
     * @param ignoreCols 比較対象外のカラム名
     */
    public AbstractDomainMatcher(Map<String, String> expectedMap, Class<?> testClass, String[] ignoreCols) {
        super(expectedMap, testClass, ignoreCols);
    }
}
