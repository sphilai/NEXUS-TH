/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 画面共通情報を保持するDomainクラス
 * The domain with common screen information
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.util;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * CommonInfoDomainクラス
 * CommonInfoDomain Class
 * <p>
 * CommonInfoDomainクラスです。
 * CommonInfoDomain class
 * </p>
 */
public class CommonInfoDomain extends AbstractDomain {
    /**
     * シリアルバージョンID。
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * ユーザ名称。
     * User Name
     */
    private String userName;

    /**
     * 責任会社略称。
     * Company Abbreviation
     */
    private String ownerCompName;

    /**
     * 数値フォーマット。
     * Numeric format
     */
    private String numberFormat;

    /**
     * 利用可能画面。
     * Permitted Screen
     */
    private List<? extends AbstractDomain> availableMenu;

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public CommonInfoDomain() {
    }

    /**
     * ユーザ名称取得
     * Get the user name
     * <p>
     * ユーザ名称を取得します。
     * Get the user name
     * </p>
     * 
     * @return ユーザ名称
     * @return User name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * ユーザ名称設定
     * Set the user name
     * <p>
     * ユーザ名称を設定します。
     * Set the user name
     * </p>
     * 
     * @param userName ユーザ名称
     * @param userName User name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 責任会社略称取得
     * Get the Company Abbreviation
     * <p>
     * 責任会社略称を取得します。
     * Get the Company Abbreviation
     * </p>
     * 
     * @return 責任会社略称
     * @return Company Abbreviation
     */
    public String getOwnerCompName() {
        return ownerCompName;
    }

    /**
     * 責任会社略称設定
     * Set the Company Abbreviation
     * <p>
     * 責任会社略称を設定します。
     * Set the Company Abbreviation
     * </p>
     * 
     * @param ownerCompName 責任会社略称
     * @param ownerCompName Company Abbreviation
     */
    public void setOwnerCompName(String ownerCompName) {
        this.ownerCompName = ownerCompName;
    }

    /**
     * 数値フォーマット取得
     * Get the numeric format
     * <p>
     * 数値フォーマットを取得します。
     * Get the numeric format
     * </p>
     * 
     * @return 数値フォーマット
     * @return Numeric format
     */
    public String getNumberFormat() {
        return numberFormat;
    }

    /**
     * 数値フォーマット設定
     * Set the numeric format
     * <p>
     * 数値フォーマットを設定します。
     * Set the numeric format
     * </p>
     * 
     * @param numberFormat 数値フォーマット
     * @param numberFormat Numeric format
     */
    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

    /**
     * 利用可能画面取得
     * Get the permitted screen
     * <p>
     * 利用可能画面を取得します。
     * Get the permitted screen
     * </p>
     * 
     * @return 利用可能画面
     * @return Permitted screen
     */
    public List<? extends AbstractDomain> getAvailableMenu() {
        return availableMenu;
    }

    /**
     * 利用可能画面設定
     * Set the permitted screen
     * <p>
     * 利用可能画面を設定します。
     * Set the permitted screen
     * </p>
     * 
     * @param availableMenu 利用可能画面
     * @param availableMenu Permitted screen
     */
    public void setAvailableMenu(List<? extends AbstractDomain> availableMenu) {
        this.availableMenu = availableMenu;
    }
}
