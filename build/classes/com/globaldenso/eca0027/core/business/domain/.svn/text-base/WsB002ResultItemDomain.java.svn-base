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
 * CustomerOrderItem domain is a result of (Check Order Entry Detail On Hand) WB002.
 * <br />WB002(Check Order Entry Detail On Hand)の結果customerOrderItemドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customerOrderItem")
public class WsB002ResultItemDomain {

    /**
     * Serial version.
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * index
     */
    @XmlElement(name = "index")
    private int index;

    /**
     * shippingDueDate
     */
    @XmlElement(name = "shippingDueDate")
    private String shippingDueDate;

    /**
     * Error list
     * <br />エラーリスト
     */
    @XmlElementWrapper(name = "errorList")
    @XmlElement(name = "errorItem")
    private List<ErrorListItemSubDomain> errorList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB002ResultItemDomain() {
    }
    
    /**
     * Getter method for index.
     * <br />index のゲッターメソッドです。
     *
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Setter method for index.
     * <br />index のセッターメソッドです。
     *
     * @param index Set for index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Getter method for shippingDueDate.
     * <br />shippingDueDate のゲッターメソッドです。
     *
     * @return the shippingDueDate
     */
    public String getShippingDueDate() {
        return shippingDueDate;
    }

    /**
     * Setter method for shippingDueDate.
     * shippingDueDate のセッターメソッドです。
     *
     * @param shippingDueDate Set for shippingDueDate
     */
    public void setShippingDueDate(String shippingDueDate) {
        this.shippingDueDate = shippingDueDate;
    }

    /**
     * Getter method for errorList.
     *
     * @return the errorList
     */
    public List<ErrorListItemSubDomain> getErrorList() {
        return errorList;
    }

    /**
     * Setter method for errorList.
     *
     * @param errorList Set for errorList
     */
    public void setErrorList(List<ErrorListItemSubDomain> errorList) {
        this.errorList = errorList;
    }
}
