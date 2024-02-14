/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * SpringUtilクラス
 * SpringUtil class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * <p>
 * Spring関連のユーティリティクラスです。
 * Utility class for Spring
 * </p>
 * 
 * @author DENSO CORPORATION
 */

public final class SpringUtil implements ApplicationContextAware {

    /** Spring設定 */
    /** Spring setting */
    private static ApplicationContext applicationContext;

    /**
     * デフォルトコンストラクタ。
     * Default Constructor
     */
    public SpringUtil() {

    }

    /**
     * bean名を指定して、インスタンスを取得します。
     * Get the instance by specified beanID.
     * <p>
     * ApplicationContextに設定されているbean名を指定して、対応するインスタンスを取得します。
     * Get the instance by specified beanID at ApplicationContext
     * </p>
     * 
     * @param beanId ApplicationContextで設定したbean id
     * @param beanId beanID specified at ApplicationContext
     * @return Object 取得したインスタンス
     * @return Object Instance
     */
    public static Object getBean(final String beanId) {

        return applicationContext.getBean(beanId);

    }

    /**
     * ApplicationContextを取得します。
     * Get the ApplicationContext
     * 
     * @return applicationcontextの取得
     * @return Get the ApplicationContext
     */
    public static final ApplicationContext getApplicationContext() {

        return applicationContext;

    }

    /**
     * {@inheritDoc}
     */
    public void setApplicationContext(final ApplicationContext paramApplicationContext)
        throws BeansException {
        setAppCtx(paramApplicationContext);
    }

    /**
     * staticなフィールドである、applicationContextに値を設定する
     * Set the value to ApplicationContext as static field
     * <p>
     * {@link ApplicationContextAware#setApplicationContext(ApplicationContext)}<br/>
     * の実装メソッドはstaticにすることはできないが<br/>
     * applicationContextフィールドはstaticに保持している必要がある。contextが消えてしまう。<br/>
     * 非staticメソッド内で、staticフィールドにアクセスするとFindBugsで警告が発生するため<br/>
     * インタフェースで実装が強制されるメソッドから、staticフィールドへのアクセスを分離する
     * The applicationContext variable should declare static<br/>
     * and also it should be set by Spring Freamework.<br/>
     * In order to set by Spring Framework,it should be implement ApplicationContextAware#setApplicationContext.<br/>
     * If set the argument to applicationContext of static variable in ApplicationContextAware#setApplicationContext,<br/>
     * FindBugs show warning.<br/>
     * To avoid this warning,create setAppCtx as a static method in private<br/>
     * and invoked from ApplicationContextAware#setApplicationContext.
     * </p>
     * 
     * @param appCtx ApplicationContext
     */
    private static void setAppCtx(ApplicationContext appCtx) {
        applicationContext = appCtx;

    }

}
