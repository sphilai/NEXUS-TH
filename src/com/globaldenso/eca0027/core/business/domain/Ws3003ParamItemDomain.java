/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :Jul 14, 2014
 * Development company name:XXXXXXXXXXX
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <p>Ws3003ParamItemDomain</p>
 *
 * @author TIS
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3003ParamItemDomain {
    
    /**
     * <p>Default serialVersion</p>
     */
    
    private static final long serialVersionUID = 1L;

    /**
     * <p>itemNo.</p>
     */
    @XmlElement(name = "itemNo")
    private String itemNo;

    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public Ws3003ParamItemDomain() {
    }

    /**
     * <p>Getter method for itemNo.</p>
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * <p>Setter method for itemNo.</p>
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
    

}
