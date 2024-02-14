/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of the Progress Control.
 * <br />進度管理の情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8001ProgCtrlPltzItemDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /**
     *Customer Po No
     */
    private String customerPoNo;

    /**
     *Item Description
     */
    private String itemDescription;

    /**
     *Model Cd
     */
    private String modelCd;

    /**
     *Pkg Cd
     */
    private String pkgCd;

    /**
     *Pltz Item No
     */
    private String pltzItemNo;

    /**
     *Sum Qty
     */
    private BigDecimal sumQty;

    /**
     *Pltz Item Odr List
     */
    private List<W8001ProgCtrlPltzItemOdrDomain> pltzItemOdrList;



    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W8001ProgCtrlPltzItemDomain() {
        super();
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
     * Getter method for itemDescription.
     *
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }



    /**
     * Setter method for itemDescription.
     *
     * @param itemDescription Set for itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }



    /**
     * Getter method for modelCd.
     *
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }



    /**
     * Setter method for modelCd.
     *
     * @param modelCd Set for modelCd
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
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
     * Getter method for pltzItemNo.
     *
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }



    /**
     * Setter method for pltzItemNo.
     *
     * @param pltzItemNo Set for pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }



    /**
     * Getter method for sumQty.
     *
     * @return the sumQty
     */
    public BigDecimal getSumQty() {
        return sumQty;
    }



    /**
     * Setter method for sumQty.
     *
     * @param sumQty Set for sumQty
     */
    public void setSumQty(BigDecimal sumQty) {
        this.sumQty = sumQty;
    }



    /**
     * Getter method for pltzItemOdrList.
     *
     * @return the pltzItemOdrList
     */
    public List<W8001ProgCtrlPltzItemOdrDomain> getPltzItemOdrList() {
        return pltzItemOdrList;
    }



    /**
     * Setter method for pltzItemOdrList.
     *
     * @param pltzItemOdrList Set for pltzItemOdrList
     */
    public void setPltzItemOdrList(
        List<W8001ProgCtrlPltzItemOdrDomain> pltzItemOdrList) {
        this.pltzItemOdrList = pltzItemOdrList;
    }

}

