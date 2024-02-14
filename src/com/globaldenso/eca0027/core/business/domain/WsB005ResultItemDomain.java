/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * The domain class that contains repeated items for the result of domain WsB005.
 * <br />WsB005の結果用ドメインの繰り返し項目を格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsB005ResultItemDomain {

    /**
     * Index
     */
    @XmlElement
    private String index;
    
    /**
     * Error list
     * <br />エラーリスト
     */
    @XmlElementWrapper(name = "errorList")
    @XmlElement(name = "errorItem")
    private List<WsB005ResultSubItemDomain> errorList;
    
    /**
     * Customer Part No.
     */
    @XmlElement(name = "customerPartNo")
    private String customerPartNo;
    
    /**
     * Part No
     */
    @XmlElement(name = "partName")
    private String partName;
    
    /**
     * Plant Code Legacy
     */
    @XmlElement(name = "plantCodeLegacy")
    private String plantCodeLegacy;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB005ResultItemDomain() {
        super();
    }
    
    /**
     * Getter method for index.
     *
     * @return the index
     */
    public String getIndex() {
        return index;
    }

    /**
     * Setter method for index.
     *
     * @param index Set for index
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * Getter method for errorList.
     *
     * @return the errorList
     */
    public List<WsB005ResultSubItemDomain> getErrorList() {
        return errorList;
    }

    /**
     * Setter method for errorList.
     *
     * @param errorList Set for errorList
     */
    public void setErrorList(List<WsB005ResultSubItemDomain> errorList) {
        this.errorList = errorList;
    }

    /**
     * Getter method for customerPartNo.
     *
     * @return the customerPartNo
     */
    public String getCustomerPartNo() {
        return customerPartNo;
    }

    /**
     * Setter method for customerPartNo.
     *
     * @param customerPartNo Set for customerPartNo
     */
    public void setCustomerPartNo(String customerPartNo) {
        this.customerPartNo = customerPartNo;
    }

    /**
     * Getter method for partName.
     *
     * @return the partName
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Setter method for partName.
     *
     * @param partName Set for partName
     */
    public void setPartName(String partName) {
        this.partName = partName;
    }

    /**
     * Getter method for plantCodeLegacy.
     *
     * @return the plantCodeLegacy
     */
    public String getPlantCodeLegacy() {
        return plantCodeLegacy;
    }

    /**
     * Setter method for plantCodeLegacy.
     *
     * @param plantCodeLegacy Set for plantCodeLegacy
     */
    public void setPlantCodeLegacy(String plantCodeLegacy) {
        this.plantCodeLegacy = plantCodeLegacy;
    }
}
