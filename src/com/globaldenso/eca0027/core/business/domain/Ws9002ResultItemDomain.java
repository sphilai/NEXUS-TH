/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Domain that contains the plant information.
 * <br />製造部工場区分情報を格納するドメインです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws9002ResultItemDomain")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ws9002ResultItemDomain {

    /**
     * SERIAL VERSION / シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Plant number / 製造部工場区分コード
     */
    private String plantCd;
    
    /**
     * Default constructor./デフォルトコンストラクタ。
     *
     */
    public Ws9002ResultItemDomain() {
        super();
    }

    /**
     * Getter method for plantCd.
     *
     * @return the plantCd
     */
    public String getPlantCd() {
        return plantCd;
    }

    /**
     * Setter method for plantCd.
     *
     * @param plantCd Set for plantCd
     */
    public void setPlantCd(String plantCd) {
        this.plantCd = plantCd;
    }

}
