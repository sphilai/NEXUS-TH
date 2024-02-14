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
 * Domain to be applied to the Ws3506ResultDomain
 * </p>
 * 
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3506ResultDomain {
    /**
     * EDIT_COUNT
     */
    @XmlElement(name = "editCount")
    private int editCount;
    
    /**
     * <p>Constructor</p>
     *
     */
    public Ws3506ResultDomain() {
        super();
    }
    /**
     * <p>Getter method for editCount</p>
     *
     * @return the editCount
     */
    public int getEditCount() {
        return editCount;
    }
    /**
     * <p>Setter method for editCount</p>
     *
     * @param editCount Set for editCount
     */
    public void setEditCount(int editCount) {
        this.editCount = editCount;
    }
}
