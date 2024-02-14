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
public class Ws3505TrItemTypDomain {
    
    /**
     * trItemTyp
     */
    @XmlElement(name = "trItemTyp")
    private String trItemTyp;
    
    /**
     * Default Constructor
     */
    public Ws3505TrItemTypDomain() {
    }
    
    /**
     * <p>Getter method for trItemTyp</p>
     *
     * @return the trItemTyp
     */
    public String getTrItemTyp() {
        return trItemTyp;
    }
    /**
     * <p>Setter method for trItemTyp</p>
     *
     * @param trItemTyp Set for trItemTyp
     */
    public void setTrItemTyp(String trItemTyp) {
        this.trItemTyp = trItemTyp;
    }
    
}
