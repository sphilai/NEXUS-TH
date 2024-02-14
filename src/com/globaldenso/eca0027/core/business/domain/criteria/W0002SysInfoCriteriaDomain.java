/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of system
 * <br />システム情報の検索条件を保持するドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class W0002SysInfoCriteriaDomain extends AbstractDomain {

    /**
     * serial version <br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * LANGUAGE CODE
     * <br />言語コード
     */
    private String lngCd;

    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;
    
    /**
     * OWNER COMPANY
     * <br />責任会社
     */
    private String ownerComp;
    
    /**
     * System date (user's time zone)
     * <br />システム日付 (作業者タイムゾーン)
     */
    private Date sysdate;
    
    /**
     * max count
     * <br />最大取得件数
     */
    private int maxCount;
    
    /**
     * INFORMATION TYPE
     * <br />お知らせ区分
     */
    private String informationTyp;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W0002SysInfoCriteriaDomain() {
    }

    /**
     * Getter method for lngCd.
     *
     * @return the lngCd
     */
    public String getLngCd() {
        return lngCd;
    }

    /**
     * Setter method for lngCd.
     *
     * @param lngCd Set for lngCd
     */
    public void setLngCd(String lngCd) {
        this.lngCd = lngCd;
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
     * Getter method for ownerComp.
     *
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * Setter method for ownerComp.
     *
     * @param ownerComp Set for ownerComp
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * Getter method for sysdate.
     *
     * @return the sysdate
     */
    public Date getSysdate() {
        return sysdate;
    }

    /**
     * Setter method for sysdate.
     *
     * @param sysdate Set for sysdate
     */
    public void setSysdate(Date sysdate) {
        this.sysdate = sysdate;
    }

    /**
     * Getter method for informationTyp.
     *
     * @return the informationTyp
     */
    public String getInformationTyp() {
        return informationTyp;
    }

    /**
     * Setter method for informationTyp.
     *
     * @param informationTyp Set for informationTyp
     */
    public void setInformationTyp(String informationTyp) {
        this.informationTyp = informationTyp;
    }

    /**
     * Getter method for maxCount.
     *
     * @return the maxCount
     */
    public int getMaxCount() {
        return maxCount;
    }

    /**
     * Setter method for maxCount.
     *
     * @param maxCount Set for maxCount
     */
    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }
}
