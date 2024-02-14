/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * <p>
 * The domain of the result data of selecting update data for Ws3503.<BR>
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws3503CmlDomain implements Serializable {

    /**
     * Serial version ID<BR>
     */
    private static final long serialVersionUID = 1L;

    /**
     * CML(Mainmark)
     */
    private String mainMark;
    
    /**
     * CML(errCd)
     */
    private String errCd;

    /**
     * Default Constructor.
     */
    public Ws3503CmlDomain() {
    }

    /**
     * <p>
     * Getter method for mainMark.
     * </p>
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * <p>
     * Setter method for mainMark.
     * </p>
     * 
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * <p>
     * Getter method for errCd.
     * </p>
     * 
     * @return the errCd
     */
    public String getErrCd() {
        return errCd;
    }

    /**
     * <p>
     * Setter method for errCd.
     * </p>
     * 
     * @param errCd Set for errCd
     */
    public void setErrCd(String errCd) {
        this.errCd = errCd;
    }
}
