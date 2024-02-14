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
 * The domain class that contains the request parameters of Ws7002.
 * <br />Ws7002のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws7002ParamDomain {

    /**
     * Checked Invoice array
     * <br />チェック対象インボイス配列
     */
    @XmlElementWrapper(name = "invoiceDetailList")
    @XmlElement(name = "invoiceDetailItem")
    private List<? extends Ws7002ParamItemDomain> invoiceDetailList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws7002ParamDomain() {
        super();
    }

    /**
     * Getter method for invoiceDetailList.
     *
     * @return the invoiceDetailList
     */
    public List<? extends Ws7002ParamItemDomain> getInvoiceDetailList() {
        return invoiceDetailList;
    }

    /**
     * Setter method for invoiceDetailList.
     *
     * @param invoiceDetailList Set for invoiceDetailList
     */
    public void setInvoiceDetailList(
        List<? extends Ws7002ParamItemDomain> invoiceDetailList) {
        this.invoiceDetailList = invoiceDetailList;
    }
}
