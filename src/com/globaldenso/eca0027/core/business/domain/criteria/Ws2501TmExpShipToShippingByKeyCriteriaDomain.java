/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain holding the search condition of TmExpShipToShippingByKeyDomain.
 * <br />TmExpShipToShippingByKeyDomainの検索条件を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501TmExpShipToShippingByKeyCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * FROM MAIN MARK
     * <br />開始メインマーク
     */
    private String fromMainMark;
    
    /**
     * TO MAIN MARK
     * <br />終了メインマーク
     */
    private String toMainMark;

    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;

    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;


    /**
     * COMPANY CODE
     * <br />会社コード
     */
    private String compCd;

    /**
     * SHIP TO CODE
     * <br />送荷先コード
     */
    private String shipToCd;

    /**
     * APPLY START DATE
     * <br />適用開始日
     */
    private Date aplyStrtDt;

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
     * LABEL PRINT NUM
     * <br />ラベル発行枚数
     */
    private String labelPrintNum;
    
    /**
     * CONTAINER LOOSE TYPE
     * <br />コンテナルーズ区分
     */
    private String containerLooseTyp;
    
    /**
     * CUSTOM TIMING TYPE
     * <br />通関タイミング区分
     */
    private String customTimingTyp;
    
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
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501TmExpShipToShippingByKeyCriteriaDomain() {
    }
    /**
     * Getter method for fromMainMark.
     *
     * @return the fromMainMark
     */
    public String getFromMainMark() {
        return fromMainMark;
    }
    /**
     * Setter method for fromMainMark.
     *
     * @param fromMainMark Set for fromMainMark
     */
    public void setFromMainMark(String fromMainMark) {
        this.fromMainMark = fromMainMark;
    }
    /**
     * Getter method for toMainMark.
     *
     * @return the toMainMark
     */
    public String getToMainMark() {
        return toMainMark;
    }
    /**
     * Setter method for toMainMark.
     *
     * @param toMainMark Set for toMainMark
     */
    public void setToMainMark(String toMainMark) {
        this.toMainMark = toMainMark;
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
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }
    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
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
     * Getter method for shipToCd.
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }
    /**
     * Setter method for shipToCd.
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }
    /**
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }
    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
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
     * Getter method for labelPrintNum.
     *
     * @return the labelPrintNum
     */
    public String getLabelPrintNum() {
        return labelPrintNum;
    }
    /**
     * Setter method for labelPrintNum.
     *
     * @param labelPrintNum Set for labelPrintNum
     */
    public void setLabelPrintNum(String labelPrintNum) {
        this.labelPrintNum = labelPrintNum;
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
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }
    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
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
