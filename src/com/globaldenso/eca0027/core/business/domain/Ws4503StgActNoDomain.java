package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * <p>
 * Domain to be applied to the Ws4501CreateFacadeServiceResultDomain
 * Ws4503CreateFacadeServiceResultDomainに付属するdomainです
 * </p>
 * 
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws4503StgActNoDomain {
    /**
     * <p>
     * stgActNo
     * 荷揃え指示No.
     * </p>
     */
    @XmlElement(name = "stgActNo")
    private String stgActNo;
    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws4503StgActNoDomain() {
    }
    /**
     * <p>Getter method for StgActNo</p>
     *
     * @return the StgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }
    /**
     * <p>Setter method for StgActNo</p>
     *
     * @param stgActNo Set for StgActNo
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }
    
}
