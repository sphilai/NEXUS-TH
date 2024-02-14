/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * It is a mass update domain class of Print Carry Out List by Parts screen
 * <br />Print Carry Out List by Parts画面の一括更新ドメインクラスです。
 *
 * @author TIS Tanaka
 * @version v.1.0
 */
public class W3004UpdateDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search result list.
     */
    private List<? extends W3004ListDomain> w3004ListDomainList;

    /**
     * Date format (for display screen).
     */
    private String screenDateFormat;
    
    /**
     * 日付フォーマット (帳票出力用)
     * date format (for print report)
     */
    private String reportDateFormat;

    /**
     * the count of the row which has been checked
     */
    private int checkedAmount;

    /**
     * Default Constructor.
     */
    public W3004UpdateDomain() {
    }

    /**
     * <p>Getter method for w3004ListDomainList.</p>
     *
     * @return the w3004ListDomainList
     */
    public List<? extends W3004ListDomain> getW3004ListDomainList() {
        return w3004ListDomainList;
    }

    /**
     * <p>Setter method for w3004ListDomainList.</p>
     *
     * @param listDomainList Set for w3004ListDomainList
     */
    public void setW3004ListDomainList(
        List<? extends W3004ListDomain> listDomainList) {
        w3004ListDomainList = listDomainList;
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
     * <p>Getter method for reportDateFormat.</p>
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
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
