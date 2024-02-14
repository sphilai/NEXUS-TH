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
 * The domain that holds the item of information  WSB001(Get Item Info).
 * <br />WSB001(Get Item Info)の品目情報を保持するドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsB001ResultItemDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * DATE
     */
    private String date;
    

    /**
     * WORKING DAY
     */
    private boolean workDayFlag;

    /**
     * CUSTOMER PART NO.
     */
    private String customerPartNo;
    

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB001ResultItemDomain() {
    }


    /**
     * Getter method for date.
     * <br />date のゲッターメソッドです。
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter method for date.
     * <br />date のセッターメソッドです。
     *
     * @param date Set for date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Getter method for workDayFlag.
     * <br />workDayFlag のゲッターメソッドです。
     *
     * @return the workDayFlag
     */
    public boolean isWorkDayFlag() {
        return workDayFlag;
    }


    /**
     * Setter method for workDayFlag.
     * <br />workDayFlag のセッターメソッドです。
     *
     * @param workDayFlag Set for workDayFlag
     */
    public void setWorkDayFlag(boolean workDayFlag) {
        this.workDayFlag = workDayFlag;
    }


    /**
     * Getter method for customerPartNo.
     * <br />customerPartNo のゲッターメソッドです。
     *
     * @return the customerPartNo
     */
    public String getCustomerPartNo() {
        return customerPartNo;
    }


    /**
     * Setter method for customerPartNo.
     * <br />customerPartNo のセッターメソッドです。
     *
     * @param customerPartNo Set for customerPartNo
     */
    public void setCustomerPartNo(String customerPartNo) {
        this.customerPartNo = customerPartNo;
    }


}
