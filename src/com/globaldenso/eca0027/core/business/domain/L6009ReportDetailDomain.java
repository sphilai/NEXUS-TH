/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class of form [L6009] that output for domain form (specification).
 * <br/>帳票【L6009】の帳票出力用ドメイン（明細）です。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L6009ReportDetailDomain extends AbstractDomain {
    /**
     * serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /** model */
    private String model = null;
    /** description */
    private String description = null;
    /** partNo */
    private String partNo = null;
    /** unitPkg */
    private String unitPkg = null;
    /** qty */
    private String qty = null;
    /** netWeight */
    private String netWeight = null;
    /** totalNetWeight */
    private String totalNetWeight = null;
    /** type */
    private String type = null;
    
    /**
     * Default Constructor
     */
    public L6009ReportDetailDomain() {
    }

    /**
     * Getter method for model.<br />
     * model のゲッターメソッドです。
     *
     * @return the model
     */
    public String getModel() {
        return model;
    }
    /**
     * Setter method for model.<br />
     * model のセッターメソッドです。
     *
     * @param model Set for model
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * Getter method for description.<br />
     * description のゲッターメソッドです。
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Setter method for description.<br />
     * description のセッターメソッドです。
     *
     * @param description Set for description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Getter method for partNo.<br />
     * partNo のゲッターメソッドです。
     *
     * @return the partNo
     */
    public String getPartNo() {
        return partNo;
    }
    /**
     * Setter method for partNo.<br />
     * partNo のセッターメソッドです。
     *
     * @param partNo Set for partNo
     */
    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }
    /**
     * Getter method for unitPkg.<br />
     * unitPkg のゲッターメソッドです。
     *
     * @return the unitPkg
     */
    public String getUnitPkg() {
        return unitPkg;
    }
    /**
     * Setter method for unitPkg.<br />
     * unitPkg のセッターメソッドです。
     *
     * @param unitPkg Set for unitPkg
     */
    public void setUnitPkg(String unitPkg) {
        this.unitPkg = unitPkg;
    }
    /**
     * Getter method for qty.<br />
     * qty のゲッターメソッドです。
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }
    /**
     * Setter method for qty.<br />
     * qty のセッターメソッドです。
     *
     * @param qty Set for qty 
     */
    public void setQty(String qty) {
        this.qty = qty;
    }
    /**
     * Getter method for netWeight.<br />
     * netWeight のゲッターメソッドです。
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }
    /**
     * Setter method for netWeight.<br />
     * netWeight のセッターメソッドです。
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }
    /**
     * Getter method for totalNetWeight.<br />
     * totalNetWeight のゲッターメソッドです。
     *
     * @return the totalNetWeight
     */
    public String getTotalNetWeight() {
        return totalNetWeight;
    }
    /**
     * Getter method for totalNetWeight.<br />
     * totalNetWeight のセッターメソッドです。
     *
     * @param totalNetWeight Set for totalNetWeight
     */
    public void setTotalNetWeight(String totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }
    /**
     * Getter method for type.<br />
     * type のゲッターメソッドです。
     *
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * Setter method for type.<br />
     * type のセッターメソッドです。
     *
     * @param type Set for type
     */
    public void setType(String type) {
        this.type = type;
    }
}
