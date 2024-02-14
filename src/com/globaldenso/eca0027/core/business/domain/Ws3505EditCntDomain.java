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
public class Ws3505EditCntDomain {
    
    /**
     * editCnt
     */
    @XmlElement(name = "editCnt")
    private int editCnt;
    
    /**
     * Default Constructor
     */
    public Ws3505EditCntDomain() {
    }
    
    /**
     * <p>Getter method for editCnt</p>
     *
     * @return the editCnt
     */
    public int getEditCnt() {
        return editCnt;
    }
    /**
     * <p>Setter method for editCnt</p>
     *
     * @param editCnt Set for editCnt
     */
    public void setEditCnt(int editCnt) {
        this.editCnt = editCnt;
    }
    
}
