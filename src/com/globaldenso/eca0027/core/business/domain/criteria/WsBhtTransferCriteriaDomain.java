/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * The criteria domain of WsBhtTransferCriteriaDomain.<BR>
 * </p>
 *
 * @version 1.00
 */
public class WsBhtTransferCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID<BR>
     */
    private static final long serialVersionUID = 1L;

    /**
     * TR_NO
     */
    private String trNo;

    /**
     * TR Item Typ
     */
    private String trItemTyp;
    
    /**
     * Default Constructor.
     */
    public WsBhtTransferCriteriaDomain() {
    }

    /**
     * <p>
     * Getter method for trNo.
     * </p>
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>
     * Setter method for trNo.
     * </p>
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }
    
    /**
     * <p>
     * Getter method for trItemTyp.
     * </p>
     * 
     * @return the trItemTyp
     */
    public String getTrItemTyp() {
        return trItemTyp;
    }

    /**
     * <p>
     * Setter method for trItemTyp.
     * </p>
     * 
     * @param trItemTyp Set for trItemTyp
     */
    public void setTrItemTyp(String trItemTyp) {
        this.trItemTyp = trItemTyp;
    }
}
