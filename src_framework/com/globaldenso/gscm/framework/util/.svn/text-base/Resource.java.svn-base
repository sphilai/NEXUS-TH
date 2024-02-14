/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * Resourceクラス
 * Resource Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.util.Locale;

import org.apache.struts.util.MessageResources;

/**
 * <p>
 * Resourcesからリソースを取得するためのラッパークラスです。
 * Wrapper class for getting resource from Resources
 * </p>
 * ResourceBundleに相当する機能を提供します。
 * Provide function which is equivalent to ResourceBundle
 * @author DENSO CORPORATION
 */
public final class Resource {

    /**
     * MessageResources
     */
    private MessageResources mr = ResourcesFactory.getResources();

    /**
     * Locale Info
     */
    private Locale locale = null;

    /**
     * デフォルトコンストラクタ。<br/>
     * Default constructor<br/>
     * Localeを指定する必要がない場合に使用する。
     * Use this method when it is not necessary to specify Locale
     */
    public Resource() {
        super();
    }

    /**
     * 
     * Locale指定のコンストラクタ。
     * Constructor at which locale is specified
     *
     * @param locale ここで指定したロケールのリソースを取得する。
     * @param locale Get locale resource specified here
     */
    public Resource(Locale locale){
        this.locale = locale;
    }

    /**
     * 
     * リソースキーを指定して、対応するリソースを取得します。
     * Specify resource key and get resource
     * 
     * <p>
     * リソースキーと、インスタンス変数のLocale情報からリソースを取得します。
     * Get resource with resource key and locale information of instance valiable
     * </p>
     * 
     * @param key リソースキー
     * @param key Resource key
     * @return リソース値
     * @return Resource value
     */
    public String getResource(String key) {
        return mr.getMessage(locale, key, null);
    }

    /**
     * 
     * リソースキーを指定して、対応するパラメータ付きリソースを取得します。
     * Specify resource key and get resource with argument
     * 
     * <p>
     * リソースキーと、インスタンス変数のLocale情報からパラメータ付きリソースを取得します。
     * Get resource which contains argument resource key and locale information of instance valiable
     * </p>
     * 
     * @param key リソースキー
     * @param key Resource key
     * @param args リソースへのパラメータ
     * @param args Argument to resource
     * @return リソース値とパラメータを合わせた値
     * @return Value which joins resource value and argument
     */
    public String getResource(String key, Object[] args) {
        return mr.getMessage(locale, key, args);
    }
}
