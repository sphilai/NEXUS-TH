/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          :Jul 3, 2014
 * Development company name:XXXXXXXXXXX
 * Details of update       :New
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>Ws3003ResultDomain.</p>
 *
 * @author TIS
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ws3001Result")
public class Ws3003ResultDomain extends ResultDomain {

    /**
     * <p>Default serialize ID</p>
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * <p>List of Item</p>
     */
    @XmlElementWrapper(name = "inventoryItemList")
    @XmlElement(name = "inventoryItem")
    private List <Ws3003ResultItemDomain> inventoryItemList;
    

    /**
     * <p>the constructor.</p>
     *
     */
    public Ws3003ResultDomain() {
        super();
    }

    /**
     * <p>constructor.</p>
     *
     * @param resultCode String
     * @param errorList List<ErrorListItemDomain>
     */
    public Ws3003ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * <p>constructor.</p>
     *
     * @param resultCode String
     */
    public Ws3003ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * <p>Getter method for inventoryItemList.</p>
     *
     * @return the inventoryItemList
     */
    public List<Ws3003ResultItemDomain> getInventoryItemList() {
        return inventoryItemList;
    }

    /**
     * <p>Setter method for inventoryItemList.</p>
     *
     * @param inventoryItemList Set for inventoryItemList
     */
    public void setInventoryItemList(List<Ws3003ResultItemDomain> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }

}
