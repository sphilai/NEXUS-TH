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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * he domain class that contains the request parameters of WsB007.
 * <br />WsB007のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class WsB007ParamDomain {

    /**
     * Receiving company code<br />
     * 受注会社の拠点間会社コード
     */
    @XmlElement(name = "receivingCompanyCode")
    private String receivingCompanyCode;
    
    /**
     * Order update list<br />
     * 明細
     */
    @XmlElementWrapper(name = "expRcvOdrUpdateList")
    @XmlElement(name = "expRcvOdrUpdateItem")
    private List<? extends WsB007ParamItemDomain> expRcvOdrUpdateList;
    
    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     */
    public WsB007ParamDomain() {
        super();
    }

    /**
     * Getter method for receivingCompanyCode.
     *
     * @return the receivingCompanyCode
     */
    public String getReceivingCompanyCode() {
        return receivingCompanyCode;
    }

    /**
     * Setter method for receivingCompanyCode.
     *
     * @param receivingCompanyCode Set for receivingCompanyCode
     */
    public void setReceivingCompanyCode(String receivingCompanyCode) {
        this.receivingCompanyCode = receivingCompanyCode;
    }

    /**
     * Getter method for expRcvOdrUpdateList.
     *
     * @return the expRcvOdrUpdateList
     */
    public List<? extends WsB007ParamItemDomain> getExpRcvOdrUpdateList() {
        return expRcvOdrUpdateList;
    }

    /**
     * Setter method for expRcvOdrUpdateList.
     *
     * @param expRcvOdrUpdateList Set for expRcvOdrUpdateList
     */
    public void setExpRcvOdrUpdateList(
        List<? extends WsB007ParamItemDomain> expRcvOdrUpdateList) {
        this.expRcvOdrUpdateList = expRcvOdrUpdateList;
    }
}
