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
 * Domain that contains the W/H information.
 * <br />倉庫情報を格納するドメインです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws9005ResultItemDomain")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ws9005ResultItemDomain {

    /**
     * SERIAL VERSION / シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * W/H number / 倉庫コード
     */
    private String wh;
    
    /**
     * Default constructor./デフォルトコンストラクタ。
     *
     */
    public Ws9005ResultItemDomain() {
        super();
    }

    /**
     * Getter method for wh.
     *
     * @return the wh
     */
    public String getWh() {
        return wh;
    }

    /**
     * Setter method for wh.
     *
     * @param wh Set for wh
     */
    public void setWh(String wh) {
        this.wh = wh;
    }

}
