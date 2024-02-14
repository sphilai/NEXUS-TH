/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The domain class that contains the updated Invoice information of the request parameter of WsB005.
 * <br />WsB005のリクエストパラメータの更新対象インボイス情報を格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsB005ParamItemDomain {

    /**
     * Index
     */
    @XmlElement(name = "index")
    private String index;
    
    /**
     * Part No.
     */
    @XmlElement(name = "partNo")
    private String partNo;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB005ParamItemDomain() {
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
     * Getter method for partNo.
     *
     * @return the partNo
     */
    public String getPartNo() {
        return partNo;
    }

    /**
     * Setter method for partNo.
     *
     * @param partNo Set for partNo
     */
    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }
}
