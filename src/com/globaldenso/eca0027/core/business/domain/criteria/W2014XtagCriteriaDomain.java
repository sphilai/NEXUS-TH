/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.sql.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;

/**
 * The domain class that holds the criteria information of X-tag
 * <br />X-tagの検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class W2014XtagCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * CUR WAREHOUSE COMPANY CODE
     * <br />現在倉庫会社コード
     */
    private String curWhCompCd;
    
    /**
     * CUR WAREHOUSE CODE
     * <br />現在倉庫コード
     */
    private String curWhCd;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;
    
    /**
     * LOADING CODE
     * <br />荷積位置コード
     */
    private String loadingCd;
    
    /**
     * SHIP TO COMPANY CODE
     * <br />送荷先会社コード
     */
    private String shipToCompCd;
    
    /**
     * X-TAG
     * <br />まとめメインマーク
     */
    private String xmainMark;
    
    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * MAIN MARK(CML NO)
     * <br />メインマーク（CML No)
     */
    private String mainMark;
    
    /**
     * FM) ISSUE DATE
     * <br />まとめ梱包From日
     */
    private Date issueFromDate;
    
    /**
     * TO) ISSUE DATE
     * <br />まとめ梱包To日
     */
    private Date issueToDate;
    
    /**
     * X-TAG PACKING ISSUER ID
     * <br />まとめ梱包者ID
     */
    private String xtagPackingIssuerId;
    
    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;
    
    /**
     * User functional utilization right
     * <br />ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Browse All authority
     * <br />Browse All 権限
     */
    private String browseAll;

    /**
     * Register All authority
     * <br />Register All 権限
     */
    private String registerAll;
    
    // ---- This is use at search of a Create screen, and init of a Register screen. ----// 
    // ---- Create画面のsearch、Register画面のinitで使用 ----// 
    /**
     * A login person's WEIGHT UNIT
     * <br />ログイン者の重量単位
     */
    private String weightUnit;
    
    /**
     * A login person's WEIGHT-UNIT notation
     * <br />ログイン者の重量単位表記
     */
    private String weightUnitDisplay;

    // ---- This is use at init of a Register screen. ----// 
    // ---- Register画面のinitで使用 ----// 
    /**
     * A login person's Unit of Vol.
     * <br />ログイン者の容積単位
     */
    private String volumeUnit;
    
    /**
     * A login person's Unit-of-Vol. notation
     * <br />ログイン者の容積単位表記
     */
    private String volumeUnitDisplay;

    // ---- This is use at printTag of a Register screen. ----// 
    // ---- Register画面のprintTagで使用 ----// 
    /**
     * Date format (for document outputs)
     * <br />日付フォーマット (帳票出力用)
     */
    private String reportDateFormat;

    /**
     * constructor.
     */
    public W2014XtagCriteriaDomain() {
        super();
    }
    /**
     * Getter method for curWhCompCd.
     *
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }
    /**
     * Setter method for curWhCompCd.
     *
     * @param curWhCompCd Set for curWhCompCd
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }
    /**
     * Getter method for curWhCd.
     *
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }
    /**
     * Setter method for curWhCd.
     *
     * @param curWhCd Set for curWhCd
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }
    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }
    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
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
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }
    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
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
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }
    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }
    /**
     * Getter method for issueFromDate.
     *
     * @return the issueFromDate
     */
    public Date getIssueFromDate() {
        return issueFromDate;
    }
    /**
     * Setter method for issueFromDate.
     *
     * @param issueFromDate Set for issueFromDate
     */
    public void setIssueFromDate(Date issueFromDate) {
        this.issueFromDate = issueFromDate;
    }
    /**
     * Getter method for issueToDate.
     *
     * @return the issueToDate
     */
    public Date getIssueToDate() {
        return issueToDate;
    }
    /**
     * Setter method for issueToDate.
     *
     * @param issueToDate Set for issueToDate
     */
    public void setIssueToDate(Date issueToDate) {
        this.issueToDate = issueToDate;
    }
    /**
     * Getter method for xtagPackingIssuerId.
     *
     * @return the xtagPackingIssuerId
     */
    public String getXtagPackingIssuerId() {
        return xtagPackingIssuerId;
    }
    /**
     * Setter method for xtagPackingIssuerId.
     *
     * @param xtagPackingIssuerId Set for xtagPackingIssuerId
     */
    public void setXtagPackingIssuerId(String xtagPackingIssuerId) {
        this.xtagPackingIssuerId = xtagPackingIssuerId;
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
     * Getter method for browseAll.
     *
     * @return the browseAll
     */
    public String getBrowseAll() {
        return browseAll;
    }
    /**
     * Setter method for browseAll.
     *
     * @param browseAll Set for browseAll
     */
    public void setBrowseAll(String browseAll) {
        this.browseAll = browseAll;
    }
    /**
     * Getter method for registerAll.
     *
     * @return the registerAll
     */
    public String getRegisterAll() {
        return registerAll;
    }
    /**
     * Setter method for registerAll.
     *
     * @param registerAll Set for registerAll
     */
    public void setRegisterAll(String registerAll) {
        this.registerAll = registerAll;
    }
    /**
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }
    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
    /**
     * Getter method for weightUnitDisplay.
     *
     * @return the weightUnitDisplay
     */
    public String getWeightUnitDisplay() {
        return weightUnitDisplay;
    }
    /**
     * Setter method for weightUnitDisplay.
     *
     * @param weightUnitDisplay Set for weightUnitDisplay
     */
    public void setWeightUnitDisplay(String weightUnitDisplay) {
        this.weightUnitDisplay = weightUnitDisplay;
    }
    /**
     * Getter method for volumeUnit.
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }
    /**
     * Setter method for volumeUnit.
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }
    /**
     * Getter method for volumeUnitDisplay.
     *
     * @return the volumeUnitDisplay
     */
    public String getVolumeUnitDisplay() {
        return volumeUnitDisplay;
    }
    /**
     * Setter method for volumeUnitDisplay.
     *
     * @param volumeUnitDisplay Set for volumeUnitDisplay
     */
    public void setVolumeUnitDisplay(String volumeUnitDisplay) {
        this.volumeUnitDisplay = volumeUnitDisplay;
    }
    /**
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }
    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
    }
}
