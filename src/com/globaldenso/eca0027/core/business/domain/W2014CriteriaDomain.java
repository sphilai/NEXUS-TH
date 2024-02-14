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
 * The domain class that holds the criteria information of X-Tag Main Screen
 * <br />まとめCMLMain Screen画面の検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2014CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * X-TAG
     * <br />まとめメインマーク
     */
    private String xmainMark;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * LOADING CODE
     * <br />荷積位置コード
     */
    private String loadingCd;
    
    /**
     * CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;
    
    /**
     * SHIP TO COMPANY CODE
     * <br />送荷先会社コード
     */
    private String shipToCompCd;
    
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
     * X-TAG PACKING ISSUER ID
     * <br />まとめ梱包者ID
     */
    private String xtagPackingIssuerId;
    
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
    private String issueFromDate;
    
    /**
     * TO) ISSUE DATE
     * <br />まとめ梱包To日
     */
    private String issueToDate;
    
    /**
     * PageInfoCreator object
     * <br />PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
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
     * Date format (for screen display) 
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2014CriteriaDomain() {
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
    public String getIssueFromDate() {
        return issueFromDate;
    }

    /**
     * Setter method for issueFromDate.
     *
     * @param issueFromDate Set for issueFromDate
     */
    public void setIssueFromDate(String issueFromDate) {
        this.issueFromDate = issueFromDate;
    }

    /**
     * Getter method for issueToDate.
     *
     * @return the issueToDate
     */
    public String getIssueToDate() {
        return issueToDate;
    }

    /**
     * Setter method for issueToDate.
     *
     * @param issueToDate Set for issueToDate
     */
    public void setIssueToDate(String issueToDate) {
        this.issueToDate = issueToDate;
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
}
