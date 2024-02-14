/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * It is a mass update domain class of Print Carry Out List by CML screen
 * <br />Print Carry Out List by CML画面の一括更新ドメインクラスです。
 *
 * @author SNT ku
 * @version v.1.0
 */
public class W3003UpdateDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search result list of palletize.
     */
    private List<? extends W3003ListDomain> w3003ListDomainList;

    /**
     * Date format (for display screen).
     */
    private String screenDateFormat;
    
    /**
     * date format (report)
     */
    private String reportDateFormat;

    /**
     * the count of the row which has been checked
     */
    private int checkedAmount;

    /**
     * Constructor.
     */
    public W3003UpdateDomain() {
    }

    /**
     * <p>
     * Getter method for w3003ListDomainList.
     * </p>
     * 
     * @return the w3003ListDomainList
     */
    public List<? extends W3003ListDomain> getW3003ListDomainList() {
        return w3003ListDomainList;
    }

    /**
     * <p>
     * Setter method for w3003ListDomainListss.
     * </p>
     * 
     * @param listDomainList Set for w3003ListDomainList
     */
    public void setW3003ListDomainList(
        List<? extends W3003ListDomain> listDomainList) {
        w3003ListDomainList = listDomainList;
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
     * <p>
     * Getter method for reportDateFormat.
     * </p>
     * 
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * <p>
     * Setter method for reportDateFormat.
     * </p>
     * 
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
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
     * <p>
     * Getter method for checkedAmount.
     * </p>
     * 
     * @return the checkedAmount
     */
    public int getCheckedAmount() {
        return checkedAmount;
    }

    /**
     * <p>
     * Setter method for checkedAmount.
     * </p>
     * 
     * @param checkedAmount Set for checkedAmount
     */
    public void setCheckedAmount(int checkedAmount) {
        this.checkedAmount = checkedAmount;
    }
}
