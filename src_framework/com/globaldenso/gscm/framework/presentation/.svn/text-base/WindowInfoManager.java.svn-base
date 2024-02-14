/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 *
 * WindowInfoManagerクラス
 * WindowInfoManager class
 *
 * Version.
 * 1.1.0
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import java.util.List;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * WindowInfoManagerクラス
 * WindowInfoManager class
 * <p>
 * DensoContext汎用エリアに保持するウィンドウ情報へのアクセスを行う。
 * Access the window information of DensoContext common fields
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WindowInfoManager {
    /** ウィンドウ情報 */
    /** Window information */
    private WindowInfoDomain windowInfo = null;

    /**
     * デフォルトコンストラクタ
     * Default constructor
     *
     * @param windowId ウィンドウID
     * @param windowId Window ID
     */
    public WindowInfoManager(String windowId) {
        windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(windowId);
    }

    /**
     * 画面共通情報取得
     * Get the screen common information
     * <p>
     * ウィンドウ情報より画面共通情報を取得する。
     * Get the screen common information from the window information
     * </p>
     *
     * @return 画面共通情報
     * @return Scrren common information
     */
    public CommonInfoDomain getCommonInfo() {
        if (null == windowInfo) {
            return null;
        }
        return windowInfo.getCommonInfo();
    }

    /**
     * ScreenInfoManagerクラス取得
     * Create the ScreenInfoManager instance
     * <p>
     * ScreenInfoManagerクラスを取得する。
     * Create the ScreenInfoManager instance
     * </p>
     *
     * @param screenId 画面ID
     * @param screenId Screen ID
     * @return ScreenInfoManagerクラス
     * @return ScreenInfoManager Class
     */
    public ScreenInfoManager getScreenInfoManager(String screenId) {
        if (null == windowInfo) {
            return null;
        }
        return new ScreenInfoManager(windowInfo, screenId);
    }

    /**
     * 画面IDスタックリスト取得
     * Get the stack list of screen ID
     * <p>
     * ウィンドウ情報より画面IDスタックリストを取得する。
     * Get the stack list of screen ID from window information
     * </p>
     *
     * @return List<String[]> 画面IDスタックリスト
     * @return List<String[]> Screen ID stack list
     */
    public List<String[]> getScreenIdList() {
        if (null == windowInfo) {
            return null;
        }
        return windowInfo.getScreenIdList();
    }

    /**
     * 画面IDスタックリスト設定
     * Set the stack list of screen ID
     * <p>
     * ウィンドウ情報へ画面IDスタックリストを設定する。
     * Set the stack list of screen ID to window information
     * </p>
     *
     * @param screenIdList 画面IDスタックリスト
     * @param screenIdList Screen ID stack list
     */
    public void setScreenIdList(List<String[]> screenIdList) {
        if (null == windowInfo) {
            return;
        }
        windowInfo.setScreenIdList(screenIdList);
    }

    /**
     * ウィンドウ汎用情報取得
     * Get common information of window
     * <p>
     * ウィンドウ固有に設定した汎用情報を取得する。
     * Get coommon information set at window
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
        if (null == windowInfo) {
            return null;
        }

        return (T)windowInfo.getGeneralArea(generalAreaKey);
    }

    /**
     * 
     * ウィンドウ汎用情報設定
     * Set common information of window
     * 
     * <p>
     * ウィンドウ固有に保持したい汎用情報を設定する。
     * Set coommon information for maintanined at window
     * </p>
     * 
     * @param generalAreaKey 汎用情報キー
     * @param generalAreaKey Common information key
     * @param generalAreaData 汎用情報
     * @param generalAreaData Common information
     */
    public void setGeneralAreaData(String generalAreaKey, Object generalAreaData) {
        if (null == windowInfo) {
            return;
        }
        windowInfo.setGeneralArea(generalAreaKey, generalAreaData);
    }
}
