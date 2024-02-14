/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * <br />Ws3003ParamDomain
 *
 * @author $Author: TIS Tanaka $
 * @version $Revision:  $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws3003ParamDomain{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Detail Domain
     */
    @XmlElementWrapper (name = "dataList")
    @XmlElement(name = "detailItemList")
    private List<? extends Ws3003ParamItemDomain> detailList;
    
    /**
     * Legacy Warehouse CD
     */
    @XmlElement(name = "lgcyWhCd")
    private String lgcyWhCd;
    
    /**
     * constructor
     */
    public Ws3003ParamDomain() {
        super();
    }

    /**
     * Getter method for detailList.
     *
     * @return the detailList
     */
    public List<? extends Ws3003ParamItemDomain> getDetailList() {
        return detailList;
    }

    /**
     * Setter method for detailList.
     *
     * @param detailList Set for detailList
     */
    public void setDetailList(List<? extends Ws3003ParamItemDomain> detailList) {
        this.detailList = detailList;
    }
    
    /**
     * Getter method for lgcyWhCd.
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * Setter method for lgcyWhCd.
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }
}
