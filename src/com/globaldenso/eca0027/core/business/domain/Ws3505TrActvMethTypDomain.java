/*
 * Project : NEXUS_EXPORT
 * 
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <p>
 * Domain to be applied to the Ws3505TransactFacadeServiceResultDomain
 * </p>
 * 
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3505TrActvMethTypDomain {
    
    /**
     * trActvMethTyp
     */
    @XmlElement(name = "trActvMethTyp")
    private String trActvMethTyp;
    
    /**
     * Default Constructor
     */
    public Ws3505TrActvMethTypDomain() {
    }
    
    /**
     * <p>Getter method for trActvMethTyp</p>
     *
     * @return the trActvMethTyp
     */
    public String getTrActvMethTyp() {
        return trActvMethTyp;
    }
    /**
     * <p>Setter method for trActvMethTyp</p>
     *
     * @param trActvMethTyp Set for trActvMethTyp
     */
    public void setTrActvMethTyp(String trActvMethTyp) {
        this.trActvMethTyp = trActvMethTyp;
    }
    
}
