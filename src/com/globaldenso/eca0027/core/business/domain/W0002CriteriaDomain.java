/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of Menu Screen
 * <br />メニュー画面の検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W0002CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version <br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SERVER ID <br />
     * サーバID
     */
    private String serverId;
    
    /**
     * LANGUAGE CODE <br />
     * 言語コード
     */
    private String lngCd;
    
    /**
     * OWNER COMPANY <br />
     * 責任会社
     */
    private String compCd;
    
    /**
     * System Date (time of the user's time zone) <br />
     * システム日付 (作業者のタイムゾーン)
     */
    private Date sysdate;
    
    /**
     * Date format (for screen) <br />
     * 日付フォーマット (画面用)
     */
    private String screenDateFormat;

    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W0002CriteriaDomain() {
        super();
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
