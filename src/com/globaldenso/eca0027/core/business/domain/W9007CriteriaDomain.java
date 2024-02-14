/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain of search criteria Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面の検索条件ドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class W9007CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search/Add
     */
    private String selectCondition;

    /**
     * Shipper
     */
    private String shipperCd;

    /**
     * NEXUS Ship to
     */
    private String shipToCompCd;

    /**
     * Cont Sort Key
     */
    private String containerSortingKey;

    /**
     * LD CD
     */
    private String loadingCd;

    /**
     * C/L
     */
    private String containerLooseTyp;

    /**
     * Packing Summary Atch Flg.
     * NL023 ADD
     */
    private String packingSummaryAtchFlg;

    /**
     * Single Pltz Qr Flg.
     * NL047 ADD
     */
    private String singlePltzQrFlg;
    
    /**
     * authStatus 
     * <br />authority:"true", not authority:"false" 
     */
    private String authStatus;
    
    /**
     * Apply Start Date
     */
    private String applyStartDate;
    
    /**
     * PageInfoCreator Object
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * User function use authority
     * <br />ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;
    
    /**
     * Server ID
     * <br />サーバID
     */
    private String serverId;
    
    /**
     * Date format (for screen)
     * <br />日付フォーマット (画面用)
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
    public W9007CriteriaDomain() {
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
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for shipToCompCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * Setter method for shipToCompCd.
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method of packingSummaryAtchFlg.
     *
     * @return the packingSummaryAtchFlg.
     */
    public String getPackingSummaryAtchFlg() {
        return packingSummaryAtchFlg;
    }

    /**
     * Setter method of packingSummaryAtchFlg.
     *
     * @param packingSummaryAtchFlg Value to be stored in packingSummaryAtchFlg.
     */
    public void setPackingSummaryAtchFlg(String packingSummaryAtchFlg) {
        this.packingSummaryAtchFlg = packingSummaryAtchFlg;
    }

    /**
     * Getter method for singlePltzQrFlg.
     * 
     * @return the singlePltzQrFlg. 
     */
    public String getSinglePltzQrFlg() {
        return singlePltzQrFlg;
    }

    /**
     * Setter method of singlePltzQrFlg.
     * 
     * @param singlePltzQrFlg Value to be stored in singlePltzQrFlg.
     */
    public void setSinglePltzQrFlg(String singlePltzQrFlg) {
        this.singlePltzQrFlg = singlePltzQrFlg;
    }
    
    /**
     * Getter method for authStatus.
     *
     * @return the authStatus
     */
    public String getAuthStatus() {
        return authStatus;
    }

    /**
     * Setter method for authStatus.
     *
     * @param authStatus Set for authStatus
     */
    public void setAuthStatus(String authStatus) {
        this.authStatus = authStatus;
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
     * Getter method for applyStartDate.
     *
     * @return the applyStartDate
     */
    public String getApplyStartDate() {
        return applyStartDate;
    }

    /**
     * Setter method for applyStartDate.
     *
     * @param applyStartDate Set for applyStartDate
     */
    public void setApplyStartDate(String applyStartDate) {
        this.applyStartDate = applyStartDate;
    }

    /**
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
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
