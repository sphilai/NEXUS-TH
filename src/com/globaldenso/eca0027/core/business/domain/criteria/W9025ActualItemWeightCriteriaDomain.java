/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds "Actual Item Weight MA"
 * <br />実測製品重量原単位の検索条件を保持するドメインです。
 *
 */
public class W9025ActualItemWeightCriteriaDomain extends AbstractDomain{

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * OWNER COM./ 会社コード
     */
    private String ownerComp;

    /**
     * ITEM NO/ 品目番号
     */
    private String itemNo;
    
    /**
     * OWNER COM./ 会社コード
     */
    private String viewOwnerComp;

    /**
     * ITEM NO/ 品目番号
     */
    private String viewItemNo;
    
    /**
     * UNIT OF WEIGHT/ 重量単位
     */
    private String oldWeightUnit;

    /**
     * ACTUAL ITEM WEIGHT/ 実測製品重量
     */
    private String oldNetWeightA;
        
    /**
     * UNIT OF WEIGHT/ 重量単位
     */
    private String weightUnit;

    /**
     * ACTUAL ITEM WEIGHT/ 実測製品重量
     */
    private String netWeightA;
    
    /**
     *Ignore Warning
     */
    private String ignoreWarning;
 
    /**
     * Msg code
     */
    private String confirmMsgCd;
    
    /**
     * Update count
     */
    private int updateCount;
    
    /**
     * Update count
     */
    private int createCount;
    
    /**
     * Function Id
     */
    private String functionId;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9025ActualItemWeightCriteriaDomain() {
    }

    /**
     * <p>Getter method for ownerComp.</p>
     *
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * <p>Setter method for ownerComp.</p>
     *
     * @param ownerComp Set for ownerComp
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * <p>Getter method for itemNo.</p>
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * <p>Setter method for itemNo.</p>
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * <p>Getter method for viewOwnerComp.</p>
     *
     * @return the viewOwnerComp
     */
    public String getViewOwnerComp() {
        return viewOwnerComp;
    }

    /**
     * <p>Setter method for viewOwnerComp.</p>
     *
     * @param viewOwnerComp Set for viewOwnerComp
     */
    public void setViewOwnerComp(String viewOwnerComp) {
        this.viewOwnerComp = viewOwnerComp;
    }

    /**
     * <p>Getter method for viewItemNo.</p>
     *
     * @return the viewItemNo
     */
    public String getViewItemNo() {
        return viewItemNo;
    }

    /**
     * <p>Setter method for viewItemNo.</p>
     *
     * @param viewItemNo Set for viewItemNo
     */
    public void setViewItemNo(String viewItemNo) {
        this.viewItemNo = viewItemNo;
    }

    /**
     * <p>Getter method for oldWeightUnit.</p>
     *
     * @return the oldWeightUnit
     */
    public String getOldWeightUnit() {
        return oldWeightUnit;
    }

    /**
     * <p>Setter method for oldWeightUnit.</p>
     *
     * @param oldWeightUnit Set for oldWeightUnit
     */
    public void setOldWeightUnit(String oldWeightUnit) {
        this.oldWeightUnit = oldWeightUnit;
    }

    /**
     * <p>Getter method for oldNetWeightA.</p>
     *
     * @return the oldNetWeightA
     */
    public String getOldNetWeightA() {
        return oldNetWeightA;
    }

    /**
     * <p>Setter method for oldNetWeightA.</p>
     *
     * @param oldNetWeightA Set for oldNetWeightA
     */
    public void setOldNetWeightA(String oldNetWeightA) {
        this.oldNetWeightA = oldNetWeightA;
    }

    /**
     * <p>Getter method for weightUnit.</p>
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * <p>Setter method for weightUnit.</p>
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * <p>Getter method for netWeightA.</p>
     *
     * @return the netWeightA
     */
    public String getNetWeightA() {
        return netWeightA;
    }

    /**
     * <p>Setter method for netWeightA.</p>
     *
     * @param netWeightA Set for netWeightA
     */
    public void setNetWeightA(String netWeightA) {
        this.netWeightA = netWeightA;
    }

    /**
     * <p>Getter method for ignoreWarning.</p>
     *
     * @return the ignoreWarning
     */
    public String getIgnoreWarning() {
        return ignoreWarning;
    }

    /**
     * <p>Setter method for ignoreWarning.</p>
     *
     * @param ignoreWarning Set for ignoreWarning
     */
    public void setIgnoreWarning(String ignoreWarning) {
        this.ignoreWarning = ignoreWarning;
    }

    /**
     * <p>Getter method for confirmMsgCd.</p>
     *
     * @return the confirmMsgCd
     */
    public String getConfirmMsgCd() {
        return confirmMsgCd;
    }

    /**
     * <p>Setter method for confirmMsgCd.</p>
     *
     * @param confirmMsgCd Set for confirmMsgCd
     */
    public void setConfirmMsgCd(String confirmMsgCd) {
        this.confirmMsgCd = confirmMsgCd;
    }

    /**
     * <p>Getter method for updateCount.</p>
     *
     * @return the updateCount
     */
    public int getUpdateCount() {
        return updateCount;
    }

    /**
     * <p>Setter method for updateCount.</p>
     *
     * @param updateCount Set for updateCount
     */
    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * <p>Getter method for createCount.</p>
     *
     * @return the createCount
     */
    public int getCreateCount() {
        return createCount;
    }

    /**
     * <p>Setter method for createCount.</p>
     *
     * @param createCount Set for createCount
     */
    public void setCreateCount(int createCount) {
        this.createCount = createCount;
    }

    /**
     * <p>Getter method for functionId.</p>
     *
     * @return the functionId
     */
    public String getFunctionId() {
        return functionId;
    }

    /**
     * <p>Setter method for functionId.</p>
     *
     * @param functionId Set for functionId
     */
    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }


}