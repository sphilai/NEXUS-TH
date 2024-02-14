/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * 
 * Type in the functional overview of the class.
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class WsCigmaComnAuxCriteriaDomain extends AbstractDomain {

    /**
     * Type in the role of the field.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Library name.<br />
     * ライブラリ名
     */
    private String lib;
    
    /**
     * COMP_CD
     */
    private String compCd;
    
    /**
     * ACCESSIBILITY_TYP
     */
    private String accessibilityTyp;
    
    /**
     * CIGMA_ADS
     */
    private Date cigmaAds;
    
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public WsCigmaComnAuxCriteriaDomain() {
        super();
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
     * Getter method for accessibilityTyp.
     *
     * @return the accessibilityTyp
     */
    public String getAccessibilityTyp() {
        return accessibilityTyp;
    }

    /**
     * Setter method for accessibilityTyp.
     *
     * @param accessibilityTyp Set for accessibilityTyp
     */
    public void setAccessibilityTyp(String accessibilityTyp) {
        this.accessibilityTyp = accessibilityTyp;
    }


    /**
     * Getter method for cigmaAds.
     *
     * @return the cigmaAds
     */
    public Date getCigmaAds() {
        return cigmaAds;
    }

    /**
     * Setter method for cigmaAds.
     *
     * @param cigmaAds Set for cigmaAds
     */
    public void setCigmaAds(Date cigmaAds) {
        this.cigmaAds = cigmaAds;
    }


    /**
     * Getter method for lib.
     *
     * @return the lib
     */
    public String getLib() {
        return lib;
    }

    /**
     * Setter method for lib.
     *
     * @param lib Set for lib
     */
    public void setLib(String lib) {
        this.lib = lib;
    }
    
}
