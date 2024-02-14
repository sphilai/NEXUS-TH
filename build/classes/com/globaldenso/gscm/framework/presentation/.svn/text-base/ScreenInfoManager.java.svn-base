/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * ScreenInfoManagerクラス
 * ScreenInfoManager Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import java.util.Map;

/**
 * ScreenInfoManagerクラス
 * ScreenInfoManager class
 * <p>
 * ウィンドウ情報に保持する画面情報用クラス
 * Screen information save into window information class
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class ScreenInfoManager {
    /** ウィンドウ情報 */
    /** Window information */
    private WindowInfoDomain windowInfo = null;
    
    /** 画面ID */
    /** Screen ID */
    private String screenId = null;

    /**
     * デフォルトコンストラクタ
     * Default constructor
     * 
     * @param windowInfo ウィンドウ情報
     * @param windowInfo Window information
     * @param screenId 画面ID
     * @param screenId Screen ID
     */
    public ScreenInfoManager(WindowInfoDomain windowInfo, String screenId) {
        this.windowInfo = windowInfo;
        this.screenId = screenId;
    }

    /**
     * 画面汎用情報取得
     * Get the screen-specific information from common information
     * <p>
     * 画面固有に設定した汎用情報を取得する。
     * Get the screen-specific information from common information
     * </p>
     * 
     * @param generalAreaKey 汎用情報キー
     * @param generalAreaKey Common information key
     * @param <T> 戻り値の型
     * @param <T> Type of return value
     * @return 汎用情報
     * @return Common information
     */
    @SuppressWarnings("unchecked")
    public <T>T getGeneralAreaData(String generalAreaKey) {
        T generalAreaData = null;

        Map<String, ScreenInfoDomain> screenInfo = (Map<String, ScreenInfoDomain>)windowInfo
            .getScreenInfo();
        if (screenInfo.containsKey(screenId)) {
            ScreenInfoDomain domain = screenInfo.get(screenId);
            generalAreaData = (T)domain.getGeneralArea(generalAreaKey);
        }

        return generalAreaData;
    }

    /**
     * 
     * 画面汎用情報設定
     * Set the screen-specific information into common information
     * 
     * <p>
     * 画面固有に保持したい汎用情報を設定する。
     * Set the screen-specific information into common information
     * </p>
     * 
     * @param generalAreaKey 汎用情報キー
     * @param generalAreaKey Common information key
     * @param generalAreaData 汎用情報
     * @param generalAreaData Common information
     */
    public void setGeneralAreaData(String generalAreaKey, Object generalAreaData) {
        Map<String, ScreenInfoDomain> screenInfo = (Map<String, ScreenInfoDomain>)windowInfo
            .getScreenInfo();
        ScreenInfoDomain domain = screenInfo.get(screenId);
        if (null == domain) {
            domain = new ScreenInfoDomain();
            screenInfo.put(screenId, domain);
        }
        domain.setGeneralArea(generalAreaKey, generalAreaData);
    }
}
