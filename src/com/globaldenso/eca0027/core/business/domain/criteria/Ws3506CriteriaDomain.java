/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * The domain of the result data of selecting update data for Ws3506.<BR>
 * </p>
 *
 * @version 1.00
 */
public class Ws3506CriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID<BR>
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;
    
    /**
     * TR_NO
     */
    private String trNo;
    
    /**
     * TR_ITEM_TYP
     */
    private String trItemTyp;
    
    /**
     * TR_RCV_METH
     */
    private String trRcvMethTyp;
    
    /**
     * EDIT_COUNT
     */
    private String editCnt;
    
    /**
     * Screen ID
     */
    private String screenId;
    
    /**
     * Default Constructor.
     */
    public Ws3506CriteriaDomain() {
    }

    /**
     * <p>
     * Getter method for dscId.
     * </p>
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * <p>
     * Setter method for dscId.
     * </p>
     * 
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * <p>
     * Getter method for trNo.
     * </p>
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>
     * Setter method for trNo.
     * </p>
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * <p>
     * Getter method for trItemTyp.
     * </p>
     * 
     * @return the trItemTyp
     */
    public String getTrItemTyp() {
        return trItemTyp;
    }

    /**
     * <p>
     * Setter method for trItemTyp.
     * </p>
     * 
     * @param trItemTyp Set for trItemTyp
     */
    public void setTrItemTyp(String trItemTyp) {
        this.trItemTyp = trItemTyp;
    }

    /**
     * <p>Getter method for editCnt.</p>
     *
     * @return the editCnt
     */
    public String getEditCnt() {
        return editCnt;
    }

    /**
     * <p>Setter method for editCnt.</p>
     *
     * @param editCnt Set for editCnt
     */
    public void setEditCnt(String editCnt) {
        this.editCnt = editCnt;
    }

    /**
     * <p>Getter method for serialVersionUID.</p>
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * <p>
     * Getter method for trRcvMethTyp.
     * </p>
     * 
     * @return the trRcvMethTyp
     */
    public String getTrRcvMethTyp() {
        return trRcvMethTyp;
    }

    /**
     * <p>
     * Setter method for trRcvMethTyp.
     * </p>
     * 
     * @param trRcvMethTyp Set for trRcvMethTyp
     */
    public void setTrRcvMethTyp(String trRcvMethTyp) {
        this.trRcvMethTyp = trRcvMethTyp;
    }

    /**
     * <p>
     * Getter method for screenId.
     * </p>
     * 
     * @return the screenId
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * <p>
     * Setter method for screenId.
     * </p>
     * 
     * @param screenId Set for screenId
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }
}
