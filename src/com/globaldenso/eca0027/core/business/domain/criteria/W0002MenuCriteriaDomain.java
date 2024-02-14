/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of menu screen
 * <br />メニュー画面の検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class W0002MenuCriteriaDomain extends AbstractDomain {

    /**
     * serial version <br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMPANY CODE <br />
     * 会社コード
     */
    private String compCd;
    
    /**
     * LANGUAGE CODE <br />
     * 言語コード
     */
    private String lngCd;
    
    /**
     * constructor.
     */
    public W0002MenuCriteriaDomain() {
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

}
