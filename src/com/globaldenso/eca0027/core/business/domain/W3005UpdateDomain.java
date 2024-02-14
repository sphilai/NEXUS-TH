/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * It is a mass update domain class of Print Carry Out List by CML screen <br />
 * Print Carry Out List by CML画面の一括更新ドメインクラスです。
 * 
 * @author SNT riku
 * @version v.1.0
 */
public class W3005UpdateDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search result list of palletize.
     */
    private List<? extends W3005ListDomain> w3005ListDomainList;

    /**
     * Date format (for display screen).
     */
    private String screenDateFormat;

    /**
     * the count of the row which has been checked
     */
    private int checkedAmount;

    /**
     * Constructor.
     */
    public W3005UpdateDomain() {
    }

    /**
     * Getter method for w3005ListDomainList.
     * 
     * @return the w3005ListDomainList
     */
    public List<? extends W3005ListDomain> getW3005ListDomainList() {
        return w3005ListDomainList;
    }

    /**
     * Setter method for w3005ListDomainList.
     * 
     * @param listDomainList Set for w3005ListDomainList
     */
    public void setW3005ListDomainList(
        List<? extends W3005ListDomain> listDomainList) {
        w3005ListDomainList = listDomainList;
    }

    /**
     * Getter method for screenDateFormat.
     * 
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     * 
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * Getter method for serialVersionUID.
     * 
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Getter method for checkedAmount.
     * 
     * @return the checkedAmount
     */
    public int getCheckedAmount() {
        return checkedAmount;
    }

    /**
     * Setter method for checkedAmount.
     * 
     * @param checkedAmount Set for checkedAmount
     */
    public void setCheckedAmount(int checkedAmount) {
        this.checkedAmount = checkedAmount;
    }

}
