/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;
import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of the Progress Control.
 * <br />進度管理の情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8001ProgCtrlPltzItemOdrDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /**
     *Item No
     */
    private String itemNo;

    /**
     *Pkg Cd
     */
    private String pkgCd;

    /**
     *Etd Due Dt
     */
    private Date etdDueDt;

    /**
     *Customer Po No
     */
    private String customerPoNo;

    /**
     *Sum Alloc Qty
     */
    private BigDecimal sumAllocQty;


    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W8001ProgCtrlPltzItemOdrDomain() {
        super();
    }

    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }



    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }



    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }



    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }



    /**
     * Getter method for etdDueDt.
     *
     * @return the etdDueDt
     */
    public Date getEtdDueDt() {
        return etdDueDt;
    }



    /**
     * Setter method for etdDueDt.
     *
     * @param etdDueDt Set for etdDueDt
     */
    public void setEtdDueDt(Date etdDueDt) {
        this.etdDueDt = etdDueDt;
    }



    /**
     * Getter method for customerPoNo.
     *
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }



    /**
     * Setter method for customerPoNo.
     *
     * @param customerPoNo Set for customerPoNo
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }



    /**
     * Getter method for sumAllocQty.
     *
     * @return the sumAllocQty
     */
    public BigDecimal getSumAllocQty() {
        return sumAllocQty;
    }



    /**
     * Setter method for sumAllocQty.
     *
     * @param sumAllocQty Set for sumAllocQty
     */
    public void setSumAllocQty(BigDecimal sumAllocQty) {
        this.sumAllocQty = sumAllocQty;
    }




}

