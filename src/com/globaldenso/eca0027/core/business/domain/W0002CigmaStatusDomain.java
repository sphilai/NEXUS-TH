/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The Domain Class For BL Layer That Holds The CIGMA nightly batch Information 
 * <br />CIGMA夜間バッチ情報を保持するBL層のドメインクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6750 $
 */
public class W0002CigmaStatusDomain extends AbstractDomain {

    /**
     * Serial Version <br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMPANY CODE <br />
     * 会社コード
     */
    private String compCd;
    
    /**
     * Timezone id <br />
     * タイムゾーンID
     */
    private String timezoneId;
    
    /**
     * Timezone name <br />
     * タイムゾーン名
     */
    private String timezoneName;
    
    /**
     * NIGHT BATCH START TIME <br />
     * 夜間バッチ開始時刻
     */
    private Timestamp nightBatStrtTime;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W0002CigmaStatusDomain() {
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
     * Getter method for timezoneId.
     *
     * @return the timezoneId
     */
    public String getTimezoneId() {
        return timezoneId;
    }

    /**
     * Setter method for timezoneId.
     *
     * @param timezoneId Set for timezoneId
     */
    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    /**
     * Getter method for timezoneName.
     *
     * @return the timezoneName
     */
    public String getTimezoneName() {
        return timezoneName;
    }

    /**
     * Setter method for timezoneName.
     *
     * @param timezoneName Set for timezoneName
     */
    public void setTimezoneName(String timezoneName) {
        this.timezoneName = timezoneName;
    }

    /**
     * Getter method for nightBatStrtTime.
     *
     * @return the nightBatStrtTime
     */
    public Timestamp getNightBatStrtTime() {
        return nightBatStrtTime;
    }

    /**
     * Setter method for nightBatStrtTime.
     *
     * @param nightBatStrtTime Set for nightBatStrtTime
     */
    public void setNightBatStrtTime(Timestamp nightBatStrtTime) {
        this.nightBatStrtTime = nightBatStrtTime;
    }

}
