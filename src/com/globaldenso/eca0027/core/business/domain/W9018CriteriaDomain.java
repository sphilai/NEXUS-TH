/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;
import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain of search criteria Export Formalities by Parts MA Inquiry screen.
 * <br />Export Formalities by Parts MA Inquiry画面の検索条件ドメインです。
 *
 * @version $Revision: 12652 $
 */
public class W9018CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     *Search/Add
     */
    private String selectCondition;

    /**
     *Company
     */
    private String compCd;

    /**
     *Item No.
     */
    private String itemNo;

    /**
     *Apply Start Date
     */
    private String aplyStrtDt;

    /**
     *FM) Apply Start Date
     */
    private String fmAplyStrtDt;

    /**
     *Calender
     */
    private String fmCalendar;

    /**
     *TO) Apply Start Date
     */
    private String toAplyStrtDt;

    /**
     *Calender
     */
    private String toCalendar;

    /**
     *Exp-Reg.
     */
    private String expLimitTyp;

    /**
     *DG Flg
     */
    private String dngrItemFlg;

    /**
     *HS CODE
     */
    private String hsCd;

    /**
     *CIGMA Products
     */
    private String cigmaPrdctFlg;

    /**
     * LAST UPDATE DATE<br />
     *最終更新日時
     */
    private Timestamp comUpdateTimestamp;
    
    /**
     * PageInfoCreator Object<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Processing mode<br />
     * 処理モード
     */
    private String mode;

    /**
     * Disabled Add Radio Button
     */
    private String disabledAdd;
    
    /**
     * User function use authority<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * SERVER ID<br />
     * サーバID
     */
    private String serverId;
    
    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * Display
     * 表示区分
     */
    private String display;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018CriteriaDomain() {
    }

    /**
     * Getter method for selectCondition.
     *
     * @return the selectCondition
     */
    public String getSelectCondition() {
        return selectCondition;
    }

    /**
     * Setter method for selectCondition.
     *
     * @param selectCondition Set for selectCondition
     */
    public void setSelectCondition(String selectCondition) {
        this.selectCondition = selectCondition;
    }
    
    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }
    
    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * Getter method for fmAplyStrtDt.
     *
     * @return the fmAplyStrtDt
     */
    public String getFmAplyStrtDt() {
        return fmAplyStrtDt;
    }

    /**
     * Setter method for fmAplyStrtDt.
     *
     * @param fmAplyStrtDt Set for fmAplyStrtDt
     */
    public void setFmAplyStrtDt(String fmAplyStrtDt) {
        this.fmAplyStrtDt = fmAplyStrtDt;
    }

    /**
     * Getter method for fmCalendar.
     *
     * @return the fmCalendar
     */
    public String getFmCalendar() {
        return fmCalendar;
    }

    /**
     * Setter method for fmCalendar.
     *
     * @param fmCalendar Set for fmCalendar
     */
    public void setFmCalendar(String fmCalendar) {
        this.fmCalendar = fmCalendar;
    }

    /**
     * Getter method for toAplyStrtDt.
     *
     * @return the toAplyStrtDt
     */
    public String getToAplyStrtDt() {
        return toAplyStrtDt;
    }

    /**
     * Setter method for toAplyStrtDt.
     *
     * @param toAplyStrtDt Set for toAplyStrtDt
     */
    public void setToAplyStrtDt(String toAplyStrtDt) {
        this.toAplyStrtDt = toAplyStrtDt;
    }

    /**
     * Getter method for toCalendar.
     *
     * @return the toCalendar
     */
    public String getToCalendar() {
        return toCalendar;
    }

    /**
     * Setter method for toCalendar.
     *
     * @param toCalendar Set for toCalendar
     */
    public void setToCalendar(String toCalendar) {
        this.toCalendar = toCalendar;
    }

    /**
     * Getter method for expLimitTyp.
     *
     * @return the expLimitTyp
     */
    public String getExpLimitTyp() {
        return expLimitTyp;
    }

    /**
     * Setter method for expLimitTyp.
     *
     * @param expLimitTyp Set for expLimitTyp
     */
    public void setExpLimitTyp(String expLimitTyp) {
        this.expLimitTyp = expLimitTyp;
    }

    /**
     * Getter method for dngrItemFlg.
     *
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * Setter method for dngrItemFlg.
     *
     * @param dngrItemFlg Set for dngrItemFlg
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * Getter method for hsCd.
     *
     * @return the hsCd
     */
    public String getHsCd() {
        return hsCd;
    }

    /**
     * Setter method for hsCd.
     *
     * @param hsCd Set for hsCd
     */
    public void setHsCd(String hsCd) {
        this.hsCd = hsCd;
    }

    /**
     * Getter method for cigmaPrdctFlg.
     *
     * @return the cigmaPrdctFlg
     */
    public String getCigmaPrdctFlg() {
        return cigmaPrdctFlg;
    }

    /**
     * Setter method for cigmaPrdctFlg.
     *
     * @param cigmaPrdctFlg Set for cigmaPrdctFlg
     */
    public void setCigmaPrdctFlg(String cigmaPrdctFlg) {
        this.cigmaPrdctFlg = cigmaPrdctFlg;
    }

    /**
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * Getter method for pageInfoCreator.
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * Setter method for pageInfoCreator.
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }
    /**
     * Getter method for mode.
     *
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * Setter method for mode.
     *
     * @param mode Set for mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }
    
    /**
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }
    
    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * Getter method for disabledAdd.
     *
     * @return the disabledAdd
     */
    public String getDisabledAdd() {
        return disabledAdd;
    }

    /**
     * Setter method for disabledAdd.
     *
     * @param disabledAdd Set for disabledAdd
     */
    public void setDisabledAdd(String disabledAdd) {
        this.disabledAdd = disabledAdd;
    }

    /**
     * <p>display のゲッターメソッドです。</p>
     *
     * @return the display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * <p>display のセッターメソッドです。</p>
     *
     * @param display display に設定する
     */
    public void setDisplay(String display) {
        this.display = display;
    }

}
