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
 * The sub-domain class of the domain class that contains the repeated items for the result of domain WsB005.
 * <br />WsB005の結果用ドメインの繰り返し項目を格納するドメインのサブドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsB005ResultSubItemDomain {

    /**
     * Property
     */
    @XmlElement(name = "property")
    private String property;
    
    /**
     * code
     */
    @XmlElement(name = "code")
    private String code;
    
    /**
     * param list
     */
    @XmlElementWrapper(name = "paramList")
    @XmlElement(name = "paramItem")
    private List<String> paramList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB005ResultSubItemDomain() {
        super();
    }

    /**
     * Getter method for property.
     *
     * @return the property
     */
    public String getProperty() {
        return property;
    }

    /**
     * Setter method for property.
     *
     * @param property Set for property
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Getter method for code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for code.
     *
     * @param code Set for code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for paramList.
     *
     * @return the paramList
     */
    public List<String> getParamList() {
        return paramList;
    }

    /**
     * Setter method for paramList.
     *
     * @param paramList Set for paramList
     */
    public void setParamList(List<String> paramList) {
        this.paramList = paramList;
    }
}
