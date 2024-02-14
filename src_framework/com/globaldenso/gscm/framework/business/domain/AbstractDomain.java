/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 共通の Domain の基底クラス
 * Super class of common Domain
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Locale;

/**
 * 共通の Domain の基底クラス
 * Super class of common Domain
 * <p>
 * 共通の Domain の基底クラスです。
 * Super class of common Domain
 * </p>
 * 
 * @author DENSO CORPORATION
 */
public abstract class AbstractDomain implements Serializable {
    /** 画面ID */
    /** Screen id */
    private String screenId;
    /** 言語コード */
    /** Language code */
    private String languageCd;
    /** タイムゾーン */
    /** Time zone */
    private String timeZone = null;
    /** 責任会社コード */
    /** Company code */
    private String ownerCompCd;
    /** 文字コード */
    /** Character code */
    private String charCd = null;
    /** 日付フォーマット */
    /** Date format */
    private String dateFormat;
    /** 選択チェックボックス */
    /** Select check box */
    private String selected;
    /** 表示件数From */
    /** Display number of records From */
    private int rowNumFrom;
    /** 表示件数To */
    /** Display number of records To */
    private int rowNumTo;
    /** 検索件数チェックフラグ */
    /** Check flag of search number of records  */
    private boolean searchCountCheckFlg = true;
    /** 作成日時 */
    /** Create date and time */
    private Timestamp comCreateTimestamp;
    /** 作成者ID */
    /** Create user id */
    private String comCreateUserId;
    /** 登録機能ID */
    /** Create function id */
    private String comCreateFuncId;
    /** 更新日時 */
    /** Update date and time */
    private Timestamp comUpdateTimestamp;
    /** 更新者ID */
    /** Update user id */
    private String comUpdateUserId;
    /** 更新機能ID */
    /** Update function id */
    private String comUpdateFuncId;
    /** ログインユーザDSC-ID */
    /** Login user DSC-ID */
    private String loginUserDscId;
    /** ロケール */
    /** Locale */
    private Locale locale;
    /** ワーニングチェック処理実施判定フラグ */
    /** Judge flag of warning check */
    private boolean checkValidateWarning = false;
    /** ソート順 */
    /** Sort order */
    private String preferredOrder;

    /**
     * <p>
     * デフォルトコンストラクタ。
     * Default constructor
     * </p>
     */
    public AbstractDomain() {
    }

    /**
     * screenId のゲッターメソッドです。
     * Getter method for screen id
     * 
     * @return the screenId
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * screenId のセッターメソッドです。
     * Setter method for screen id
     * 
     * @param screenId screenId に設定する
     * @param screenId Set to screenId
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * languageCd のゲッターメソッドです。
     * Getter method for language code
     * 
     * @return the languageCd
     */
    public String getLanguageCd() {
        return languageCd;
    }

    /**
     * languageCd のセッターメソッドです。
     * Setter method for language code
     * 
     * @param languageCd languageCd に設定する
     * @param languageCd Set to languageCd
     */
    public void setLanguageCd(String languageCd) {
        this.languageCd = languageCd;
    }

    /**
     * timeZone のゲッターメソッドです。
     * Getter method for timeZone
     * 
     * @return the timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * timeZone のセッターメソッドです。
     * Setter method for timeZone
     * 
     * @param timeZone timeZone に設定する
     * @param timeZone Set to timeZone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * ownerCompCd のゲッターメソッドです。
     * Getter method for ownerCompCd
     * 
     * @return the ownerCompCd
     */
    public String getOwnerCompCd() {
        return ownerCompCd;
    }

    /**
     * ownerCompCd のセッターメソッドです。
     * Setter method for ownerCompCd
     * 
     * @param ownerCompCd ownerCompCd に設定する
     * @param ownerCompCd Set to ownerCompCd
     */
    public void setOwnerCompCd(String ownerCompCd) {
        this.ownerCompCd = ownerCompCd;
    }

    /**
     * charCd のゲッターメソッドです。
     * Getter method for charCd
     * 
     * @return the charCd
     */
    public String getCharCd() {
        return charCd;
    }

    /**
     * charCd のセッターメソッドです。
     * Setter method for charCd
     * 
     * @param charCd charCd に設定する
     * @param charCd Set to charCd
     */
    public void setCharCd(String charCd) {
        this.charCd = charCd;
    }

    /**
     * dateFormat のゲッターメソッドです。
     * Getter method for dateFormat
     * 
     * @return the dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * dateFormat のセッターメソッドです。
     * Setter method for dateFormat
     * 
     * @param dateFormat dateFormat に設定する
     * @param dateFormat Set to dateFormat
     */
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * selected のゲッターメソッドです。
     * Getter method for selected
     * 
     * @return the selected
     */
    public String getSelected() {
        return selected;
    }

    /**
     * selected のセッターメソッドです。
     * Setter method for selected
     * 
     * @param selected selected に設定する
     * @param selected Set to selected
     */
    public void setSelected(String selected) {
        this.selected = selected;
    }

    /**
     * rowNumFrom のゲッターメソッドです。
     * Getter method for rowNumFrom
     * 
     * @return the rowNumFrom
     */
    public int getRowNumFrom() {
        return rowNumFrom;
    }

    /**
     * rowNumFrom のセッターメソッドです。
     * Setter method for rowNumFrom
     * 
     * @param rowNumFrom rowNumFrom に設定する
     * @param rowNumFrom Set to rowNumFrom
     */
    public void setRowNumFrom(int rowNumFrom) {
        this.rowNumFrom = rowNumFrom;
    }

    /**
     * rowNumTo のゲッターメソッドです。
     * Getter method for rowNumTo
     * 
     * @return the rowNumTo
     */
    public int getRowNumTo() {
        return rowNumTo;
    }

    /**
     * rowNumTo のセッターメソッドです。
     * Setter method for rowNumTo
     * 
     * @param rowNumTo rowNumTo に設定する
     * @param rowNumTo Set to rowNumTo
     */
    public void setRowNumTo(int rowNumTo) {
        this.rowNumTo = rowNumTo;
    }

    /**
     * searchCountCheckFlg のゲッターメソッドです。
     * Getter method for searchCountCheckFlg
     * 
     * @return the searchCountCheckFlg
     */
    public boolean isSearchCountCheckFlg() {
        return searchCountCheckFlg;
    }

    /**
     * searchCountCheckFlg のセッターメソッドです。
     * Setter method for searchCountCheckFlg
     * 
     * @param searchCountCheckFlg searchCountCheckFlg に設定する
     * @param searchCountCheckFlg Set to searchCountCheckFlg
     */
    public void setSearchCountCheckFlg(boolean searchCountCheckFlg) {
        this.searchCountCheckFlg = searchCountCheckFlg;
    }

    /**
     * comCreateTimestamp のゲッターメソッドです。
     * Getter method for comCreateTimestamp
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * comCreateTimestamp のセッターメソッドです。
     * Setter method for comCreateTimestamp
     * 
     * @param comCreateTimestamp comCreateTimestamp に設定する
     * @param comCreateTimestamp Set to comCreateTimestamp
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

    /**
     * comCreateUserId のゲッターメソッドです。
     * Getter method for comCreateUserId
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId のセッターメソッドです。
     * Setter method for comCreateUserId
     * 
     * @param comCreateUserId comCreateUserId に設定する
     * @param comCreateUserId Set to comCreateUserId
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * comCreateFuncId のゲッターメソッドです。
     * Getter method for comCreateFuncId
     * 
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * comCreateFuncId のセッターメソッドです。
     * Setter method for comCreateFuncId
     * 
     * @param comCreateFuncId comCreateFuncId に設定する
     * @param comCreateFuncId Set to comCreateFuncId
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * comUpdateTimestamp のゲッターメソッドです。
     * Getter method for comUpdateTimestamp
     * 
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * comUpdateTimestamp のセッターメソッドです。
     * Setter method for comUpdateTimestamp
     * 
     * @param comUpdateTimestamp comUpdateTimestamp に設定する
     * @param comUpdateTimestamp Set to comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * comUpdateUserId のゲッターメソッドです。
     * Getter method for comUpdateUserId
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * comUpdateUserId のセッターメソッドです。
     * Setter method for comUpdateUserId
     * 
     * @param comUpdateUserId comUpdateUserId に設定する
     * @param comUpdateUserId Set to comUpdateUserId
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * comUpdateFuncId のゲッターメソッドです。
     * Getter method for comUpdateFuncId
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * comUpdateFuncId のセッターメソッドです。
     * Setter method for comUpdateFuncId
     * 
     * @param comUpdateFuncId comUpdateFuncId に設定する
     * @param comUpdateFuncId Set to comUpdateFuncId
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * loginUserDscId のゲッターメソッドです。
     * Getter method for loginUserDscId
     * 
     * @return the loginUserDscId
     */
    public String getLoginUserDscId() {
        return loginUserDscId;
    }

    /**
     * loginUserDscId のセッターメソッドです。
     * Setter method for loginUserDscId
     * 
     * @param loginUserDscId loginUserDscId に設定する
     * @param loginUserDscId Set to loginUserDscId
     */
    public void setLoginUserDscId(String loginUserDscId) {
        this.loginUserDscId = loginUserDscId;
    }

    /**
     * locale のゲッターメソッドです。
     * Getter method for locale
     * 
     * @return the locale
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * locale のセッターメソッドです。
     * Setter method for locale
     * 
     * @param locale localeに設定する
     * @param locale Set to locale
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    /**
     * checkValidateWarning のゲッターメソッドです。
     * Getter method for checkValidateWarning
     * 
     * @return the checkValidateWarning
     */
    public boolean isCheckValidateWarning() {
        return checkValidateWarning;
    }

    /**
     * checkValidateWarning のセッターメソッドです。
     * Setter method for checkValidateWarning
     * 
     * @param checkValidateWarning checkValidateWarningに設定する
     * @param checkValidateWarning Set to checkValidateWarning
     */
    public void setCheckValidateWarning(boolean checkValidateWarning) {
        this.checkValidateWarning = checkValidateWarning;
    }
    /**
     * preferredOrder のゲッターメソッドです。
     * Getter method for preferredOrder
     * 
     * @return the preferredOrder
     */
    public String getPreferredOrder() {
        return preferredOrder;
    }

    /**
     * preferredOrder のセッターメソッドです。
     * Setter method for preferredOrder
     * 
     * @param preferredOrder preferredOrder に設定する
     * @param preferredOrder Set to preferredOrder
     */
    public void setPreferredOrder(String preferredOrder) {
        this.preferredOrder = preferredOrder;
    }
}