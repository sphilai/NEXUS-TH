/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 *
 * ウィンドウ情報保持Domainクラス
 * Window Information Domain Class
 *
 * Version.
 * 1.1.0
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * ウィンドウ情報保持Domainクラス
 * Window Information Domain Class
 * <p>
 * ウィンドウ情報を保持するDomainクラス。
 * Window Information Domain Class
 * </p>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WindowInfoDomain implements Serializable {
    /** シリアルバージョンID */
    /** serialVersionUID */
    private static final long serialVersionUID = 4472834682230384585L;
    /** 画面共通情報保持用Domain */
    /** Screen common information domain */
    private CommonInfoDomain commonInfo = null;
    /** 画面情報保持用Map */
    /** Map for screen information */
    private Map<String, ScreenInfoDomain> screenInfo = new HashMap<String, ScreenInfoDomain>();
    /** 画面IDスタック用List */
    /** Screen ID stack list */
    private List<String[]> screenIdList = new ArrayList<String[]>();
    /** ウィンドウ固有汎用情報 */
    /** Common information of window */
    private Map<String, Object> generalArea = new HashMap<String, Object>();

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public WindowInfoDomain() {

    }

    /**
     * commonInfo のゲッターメソッドです。
     * Getter method for commonInfo
     *
     * @return the commonInfo
     */
    public CommonInfoDomain getCommonInfo() {
        return commonInfo;
    }

    /**
     * commonInfo のセッターメソッドです。
     * Setter method for commonInfo
     *
     * @param commonInfo commonInfo に設定する
     * @param commonInfo Set the commonInfo
     */
    public void setCommonInfo(CommonInfoDomain commonInfo) {
        this.commonInfo = commonInfo;
    }

    /**
     * screenInfo のゲッターメソッドです。
     * Getter method for screenInfo
     *
     * @return the screenInfo
     */
    public Map<String, ScreenInfoDomain> getScreenInfo() {
        return screenInfo;
    }

    /**
     * screenInfo のセッターメソッドです。
     * Setter method for screenInfo
     *
     * @param screenInfo screenInfo に設定する
     * @param screenInfo Set the screenInfo
     */
    public void setScreenInfo(Map<String, ScreenInfoDomain> screenInfo) {
        this.screenInfo = screenInfo;
    }

    /**
     * screenIdList のゲッターメソッドです。
     * Getter method screenIdList
     *
     * @return the screenIdList
     */
    public List<String[]> getScreenIdList() {
        return screenIdList;
    }

    /**
     * screenIdList のセッターメソッドです。
     * Setter method for screenIdList
     *
     * @param screenIdList screenIdList に設定する
     * @param screenIdList Set the screenIdList
     */
    public void setScreenIdList(List<String[]> screenIdList) {
        this.screenIdList = screenIdList;
    }

    /**
     * generalArea のセッターメソッドです。
     * Setter method for generalArea
     * 
     * @param generalAreaKey 汎用キー
     * @param generalAreaKey Common information key
     * @param generalAreaData ウィンドウ固有汎用情報
     * @param generalAreaData Common information of window
     */
    public void setGeneralArea(String generalAreaKey, Object generalAreaData) {
        this.generalArea.put(generalAreaKey, generalAreaData);
    }

    /**
     * generalArea のゲッターメソッドです。
     * Getter method for generalArea
     * <p>
     * パラメータ指定の汎用キーに該当する情報を取得する。
     * Get information fallen under common key specified to argument
     * </p>
     * 
     * @param generalAreaKey 汎用キー
     * @param generalAreaKey Common key
     * @param <T> 戻り値の型
     * @param <T> Type of return value
     * @return 汎用情報
     * @return Common information
     */
    @SuppressWarnings("unchecked")
    public <T>T getGeneralArea(String generalAreaKey) {
        return (T)this.generalArea.get(generalAreaKey);
    }
}
