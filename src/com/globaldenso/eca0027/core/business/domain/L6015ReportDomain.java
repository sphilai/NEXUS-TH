/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the information of the document [L6015].
 * <br/>帳票【L6015】の情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11913 $
 */
public class L6015ReportDomain extends AbstractDomain {
    /**
     * serialvVersion<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /** invoiceNo */
    private String invoiceNo = null;
    /** unitOfTotalQuantity1 */
    private String unitOfTotalQuantity1 = null;
    /** unitOfTotalQuantity2 */
    private String unitOfTotalQuantity2 = null;
    /** unitOfTotalQuantity3 */
    private String unitOfTotalQuantity3 = null;
    /** totalQuantity1 */
    private String totalQuantity1 = null;
    /** totalQuantity2 */
    private String totalQuantity2 = null;
    /** totalQuantity3 */
    private String totalQuantity3 = null;
    /** unitOfTotalAmount */
    private String unitOfTotalAmount = null;
    /** totalAmount */
    private String totalAmount = null;
    /** master1 */
    private InputStream master1 = null;
    /** detailList */
    private List<? extends L6015ReportDetailDomain> detailList = null;
    /** free1Nm */
    private String free1Nm = null;
    /** free2Nm */
    private String free2Nm = null;
    /** free3Nm */
    private String free3Nm = null;
    /** free4Nm */
    private String free4Nm = null; // UT258 ADD
    
    /**
     * Default Constructor
     */
    public L6015ReportDomain() {
    }
    
    /**
     * Getter method for invoiceNo.<br />
     * invoiceNo のゲッターメソッドです。
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }
    /**
     * Setter method for invoiceNo.<br />
     * invoiceNo のセッターメソッドです。
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    /**
     * Getter method for unitOfTotalQuantity1.<br />
     * unitOfTotalQuantity1 のゲッターメソッドです。
     *
     * @return the unitOfTotalQuantity1
     */
    public String getUnitOfTotalQuantity1() {
        return unitOfTotalQuantity1;
    }
    /**
     * Setter method for unitOfTotalQuantity1.<br />
     * unitOfTotalQuantity1 のセッターメソッドです。
     *
     * @param unitOfTotalQuantity1 Set for unitOfTotalQuantity1 
     */
    public void setUnitOfTotalQuantity1(String unitOfTotalQuantity1) {
        this.unitOfTotalQuantity1 = unitOfTotalQuantity1;
    }
    /**
     * Getter method for unitOfTotalQuantity2.<br />
     * unitOfTotalQuantity2 のゲッターメソッドです。
     *
     * @return the unitOfTotalQuantity2
     */
    public String getUnitOfTotalQuantity2() {
        return unitOfTotalQuantity2;
    }
    /**
     * Setter method for unitOfTotalQuantity2.<br />
     * unitOfTotalQuantity2 のセッターメソッドです。
     *
     * @param unitOfTotalQuantity2 Set for unitOfTotalQuantity2 
     */
    public void setUnitOfTotalQuantity2(String unitOfTotalQuantity2) {
        this.unitOfTotalQuantity2 = unitOfTotalQuantity2;
    }
    /**
     * Getter method for unitOfTotalQuantity3.<br />
     * unitOfTotalQuantity3 のゲッターメソッドです。
     *
     * @return the unitOfTotalQuantity3
     */
    public String getUnitOfTotalQuantity3() {
        return unitOfTotalQuantity3;
    }
    /**
     * Setter method for unitOfTotalQuantity3.<br />
     * unitOfTotalQuantity3 のセッターメソッドです。
     *
     * @param unitOfTotalQuantity3 Set for unitOfTotalQuantity3 
     */
    public void setUnitOfTotalQuantity3(String unitOfTotalQuantity3) {
        this.unitOfTotalQuantity3 = unitOfTotalQuantity3;
    }
    /**
     * Getter method for totalQuantity1.<br />
     * totalQuantity1 のゲッターメソッドです。
     *
     * @return the totalQuantity1
     */
    public String getTotalQuantity1() {
        return totalQuantity1;
    }
    /**
     * Setter method for totalQuantity1.<br />
     * totalQuantity1 のセッターメソッドです。
     *
     * @param totalQuantity1 Set for totalQuantity1 
     */
    public void setTotalQuantity1(String totalQuantity1) {
        this.totalQuantity1 = totalQuantity1;
    }
    /**
     * Getter method for totalQuantity2.<br />
     * totalQuantity2 のゲッターメソッドです。
     *
     * @return the totalQuantity2
     */
    public String getTotalQuantity2() {
        return totalQuantity2;
    }
    /**
     * Setter method for totalQuantity2.<br />
     * totalQuantity2 のセッターメソッドです。
     *
     * @param totalQuantity2 Set for totalQuantity2 
     */
    public void setTotalQuantity2(String totalQuantity2) {
        this.totalQuantity2 = totalQuantity2;
    }
    /**
     * Getter method for totalQuantity3.<br />
     * totalQuantity3 のゲッターメソッドです。
     *
     * @return the totalQuantity3
     */
    public String getTotalQuantity3() {
        return totalQuantity3;
    }
    /**
     * Setter method for totalQuantity3.<br />
     * totalQuantity3 のセッターメソッドです。
     *
     * @param totalQuantity3 Set for totalQuantity3
     */
    public void setTotalQuantity3(String totalQuantity3) {
        this.totalQuantity3 = totalQuantity3;
    }
    /**
     * Getter method for unitOfTotalAmount.<br />
     * unitOfTotalAmount のゲッターメソッドです。
     *
     * @return the unitOfTotalAmount
     */
    public String getUnitOfTotalAmount() {
        return unitOfTotalAmount;
    }
    /**
     * Setter method for unitOfTotalAmount.<br />
     * unitOfTotalAmount のセッターメソッドです。
     *
     * @param unitOfTotalAmount Set for unitOfTotalAmount 
     */
    public void setUnitOfTotalAmount(String unitOfTotalAmount) {
        this.unitOfTotalAmount = unitOfTotalAmount;
    }
    /**
     * Getter method for totalAmount.<br />
     * totalAmount のゲッターメソッドです。
     *
     * @return the totalAmount
     */
    public String getTotalAmount() {
        return totalAmount;
    }
    /**
     * Setter method for totalAmount.<br />
     * totalAmount のセッターメソッドです。
     *
     * @param totalAmount Set for totalAmount 
     */
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
    /**
     * Getter method for master1.<br />
     * master1 のゲッターメソッドです。
     *
     * @return the master1
     */
    public InputStream getMaster1() {
        return master1;
    }
    /**
     * Setter method for master1.<br />
     * master1 のセッターメソッドです。
     *
     * @param master1 Set for master1 
     */
    public void setMaster1(InputStream master1) {
        this.master1 = master1;
    }
    /**
     * Getter method for detailList.<br />
     * detailList のゲッターメソッドです。
     *
     * @return the detailList
     */
    public List<? extends L6015ReportDetailDomain> getDetailList() {
        return detailList;
    }
    /**
     * Setter method for detailList.<br />
     * detailList のセッターメソッドです。
     *
     * @param detailList Set for detailList 
     */
    public void setDetailList(List<? extends L6015ReportDetailDomain> detailList) {
        this.detailList = detailList;
    }
    /**
     * Getter method for free1Nm.<br />
     * free1Nm のゲッターメソッドです。
     *
     * @return the free1Nm
     */
    public String getFree1Nm() {
        return free1Nm;
    }
    /**
     * Setter method for free1Nm.<br />
     * free1Nm のセッターメソッドです。
     *
     * @param free1Nm Set for free1Nm 
     */
    public void setFree1Nm(String free1Nm) {
        this.free1Nm = free1Nm;
    }
    /**
     * Getter method for free2Nm.<br />
     * free2Nm のゲッターメソッドです。
     *
     * @return the free2Nm
     */
    public String getFree2Nm() {
        return free2Nm;
    }
    /**
     * Setter method for free2Nm.<br />
     * free2Nm のセッターメソッドです。
     *
     * @param free2Nm Set for free2Nm 
     */
    public void setFree2Nm(String free2Nm) {
        this.free2Nm = free2Nm;
    }
    /**
     * Getter method for free3Nm.<br />
     * free3Nm のゲッターメソッドです。
     *
     * @return the free3Nm
     */
    public String getFree3Nm() {
        return free3Nm;
    }
    /**
     * Setter method for free3Nm.<br />
     * free3Nm のセッターメソッドです。
     *
     * @param free3Nm Set for free3Nm 
     */
    public void setFree3Nm(String free3Nm) {
        this.free3Nm = free3Nm;
    }

    /**
     * Getter method for free4Nm.
     *
     * @return the free4Nm
     */
    public String getFree4Nm() {
        return free4Nm;
    }

    /**
     * Setter method for free4Nm.
     *
     * @param free4Nm Set for free4Nm
     */
    public void setFree4Nm(String free4Nm) {
        this.free4Nm = free4Nm;
    }
    
}
