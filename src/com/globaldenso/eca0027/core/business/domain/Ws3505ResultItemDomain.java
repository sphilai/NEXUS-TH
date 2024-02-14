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
 * <p>Domain of Ws3505 Result Item.</p>
 *
 * @author S.Kimura
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3505ResultItemDomain{


    /**
     * trItemTyp
     */
    @XmlElement(name = "trItemTyp")
    private String trItemTyp;

    /**
     * <p>
     * editCnt
     * </p>
     */
    @XmlElement(name = "editCnt")
    private int editCnt;
    
    /**
     * trActvMethTyp
     */
    @XmlElement(name = "trActvMethTyp")
    private String trActvMethTyp;
    
    /**
     * <p>Type in the functional overview of the constructor.</p>
     *
     */
    public Ws3505ResultItemDomain() {
    }

    /**
     * <p>Getter method for trItemTyp.</p>
     *
     * @return the trItemTyp
     */
    public String getTrItemTyp() {
        return trItemTyp;
    }

    /**
     * <p>Setter method for trItemTyp.</p>
     *
     * @param trItemTyp Set for trItemTyp
     */
    public void setTrItemTyp(String trItemTyp) {
        this.trItemTyp = trItemTyp;
    }

    /**
     * <p>Getter method for editCnt.</p>
     *
     * @return the editCnt
     */
    public int getEditCnt() {
        return editCnt;
    }

    /**
     * <p>Setter method for editCnt.</p>
     *
     * @param editCnt Set for editCnt
     */
    public void setEditCnt(int editCnt) {
        this.editCnt = editCnt;
    }

    /**
     * <p>Getter method for trActvMethTyp.</p>
     *
     * @return the trActvMethTyp
     */
    public String getTrActvMethTyp() {
        return trActvMethTyp;
    }

    /**
     * <p>Setter method for trActvMethTyp.</p>
     *
     * @param trActvMethTyp Set for trActvMethTyp
     */
    public void setTrActvMethTyp(String trActvMethTyp) {
        this.trActvMethTyp = trActvMethTyp;
    }

}
