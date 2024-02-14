/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 画面情報保持Domainクラス
 * Screen Information Domain Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.presentation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts.action.ActionForm;

/**
 * 画面情報保持Domainクラス
 * Screen Information Domain Class
 * <p>
 * 画面情報を保持するDomainクラス。
 * Screen Information Domain Class
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class ScreenInfoDomain implements Serializable {
    /** シリアルバージョンID */
    /** serialVersionUID */
    private static final long serialVersionUID = 7004900376101736159L;
    /** ActionForm */
    private ActionForm actionForm = null;
    /** 画面固有汎用情報 */
    /** Screen-specific information */
    private Map<String, Object> generalArea = new HashMap<String, Object>();

    /**
     * デフォルトコンストラクタ
     * Default constructor
     */
    public ScreenInfoDomain() {
    }

    /**
     * コンストラクタ
     * Constructor
     * 
     * @param form フォーム
     * @param form Form
     */
    public ScreenInfoDomain(ActionForm form) {
        this.actionForm = form;
    }

    /**
     * actionForm のゲッターメソッドです。
     * Getter method for actionForm
     * 
     * @return the actionForm
     */
    public ActionForm getActionForm() {
        return actionForm;
    }

    /**
     * actionForm のセッターメソッドです。
     * Setter method for actionForm
     * 
     * @param actionForm actionForm に設定する
     * @param actionForm Set to actionForm
     */
    public void setActionForm(ActionForm actionForm) {
        this.actionForm = actionForm;
    }

    /**
     * generalArea のセッターメソッドです。
     * Setter method for generalArea
     * 
     * @param generalAreaKey 汎用キー
     * @param generalAreaKey Common information key
     * @param generalAreaData 画面固有汎用情報
     * @param generalAreaData Screen-specific information
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
