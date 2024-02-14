/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The Domain Class For PL Layer That Holds The CIGMA nightly batch Information 
 * <br />CIGMA夜間バッチ情報を保持するPL層のドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W0002CigmaStatusListDomain extends AbstractDomain {

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
     * Timezone name <br />
     * タイムゾーン名
     */
    private String timezoneName;
    
    /**
     * NIGHT BATCH START TIME <br />
     * 夜間バッチ開始時刻
     */
    private String nightBatStrtTime;
    
    /**
     * Constructor
     * <br />デフォルトコンストラクタです。
     */
    public W0002CigmaStatusListDomain() {
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
    public String getNightBatStrtTime() {
        return nightBatStrtTime;
    }

    /**
     * Setter method for nightBatStrtTime.
     *
     * @param nightBatStrtTime Set for nightBatStrtTime
     */
    public void setNightBatStrtTime(String nightBatStrtTime) {
        this.nightBatStrtTime = nightBatStrtTime;
    }
}
