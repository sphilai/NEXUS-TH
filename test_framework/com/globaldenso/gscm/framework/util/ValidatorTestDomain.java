/*
 * PROJECT：GSCM共通フレームワーク
 * 
 * TestDomainクラス
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * テストで使用するドメイン
 * <p>
 * 
 * <pre>
 * テストで使用するドメイン
 * </pre>
 * 
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class ValidatorTestDomain extends AbstractDomain {

    /** シリアルパージョンID */
    private static final long serialVersionUID = 3723677004354012597L;

    /** プロパティ1 */
    private String property1 = null;
    /** プロパティ2 */
    private String property2 = null;
    /** プロパティ3 */
    private String property3 = null;
    /** プロパティ4 */
    private String property4 = null;
    /** プロパティ5 */
    private String property5 = null;
    /** URLテスト専用プロパティ */
    private String url = null;
    /** Emailテスト専用プロパティ */
    private String email = null;

    /**
     * デフォルトコンストラクタ。
     */
    public ValidatorTestDomain() {
    }

    /**
     * propety1の取得
     * 
     * @return property1
     */
    public String getProperty1() {
        return property1;
    }

    /**
     * property1の設定
     * 
     * @param property1 property1
     */
    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    /**
     * property2の取得
     * 
     * @return property2
     */
    public String getProperty2() {
        return property2;
    }

    /**
     * property2の設定
     * 
     * @param property2 property2
     */
    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    /**
     * property3の取得
     * 
     * @return property3
     */
    public String getProperty3() {
        return property3;
    }

    /**
     * property3の設定
     * 
     * @param property3 property3
     */
    public void setProperty3(String property3) {
        this.property3 = property3;
    }

    /**
     * property4の取得
     * 
     * @return property4
     */
    public String getProperty4() {
        return property4;
    }

    /**
     * property4の設定
     * 
     * @param property4 property4
     */
    public void setProperty4(String property4) {
        this.property4 = property4;
    }

    /**
     * property5の取得
     * 
     * @return property5
     */
    public String getProperty5() {
        return property5;
    }

    /**
     * property5の設定
     * 
     * @param property5 property5
     */
    public void setProperty5(String property5) {
        this.property5 = property5;
    }

    /**
     * URLの取得
     * 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * URLの設定
     * 
     * @param url URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Emailの取得
     * 
     * @return url
     */
    public String getEmail() {
        return email;
    }

    /**
     * Emailの設定
     * 
     * @param email Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
