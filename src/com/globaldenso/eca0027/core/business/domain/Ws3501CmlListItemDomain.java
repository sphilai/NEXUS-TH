/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

/**
 * <p>
 * The domain of the result data of Ws3501. (by Cml)<BR>
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3501CmlListItemDomain implements Serializable {

    /**
     * Serial version ID<BR>
     */
    private static final long serialVersionUID = 1L;

    /**
     * TR No (not output in XML)
     */
    @XmlTransient
    private String trNo;

    /**
     * Main Mark
     */
    private String mainMark;
    
    /**
     * Default Constructor.
     */
    public Ws3501CmlListItemDomain() {
    }

    /**
     * <p>
     * Getter trNo for trNo.
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
     * Getter method for mainMark.
     * </p>
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * <p>
     * Setter method for mainMark.
     * </p>
     * 
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }
}