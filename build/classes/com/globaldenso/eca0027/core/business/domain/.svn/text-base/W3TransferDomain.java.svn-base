/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * W3TransferDomain
 * 
 * Version.<BR>
 * 
 * @author $Author: Chaiporn$
 * @version $Revision: ????$
 */
public class W3TransferDomain extends AbstractDomain implements Serializable {

    /**
     * Serial Version ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * CHK
     */
    private String chk;
    /**
     * Plant CD
     */
    private String plantCd;
    /**
     * Item No.
     */
    private String itemNo;
    /**
     * PKG CD
     */
    private String pkgCd;
    /**
     * Act. Tag Qty
     */
    private int actTagQty;
    /**
     * Act. QTY
     */
    private int actQty;
    /**
     * SOH
     */
    private int soh;
    /**
     * Ship Lot
     */
    private int shipLot;
    /**
     * Box No.
     */
    private int boxNo;
    /**
     * Transferable QTY
     */
    private int transQty;
    /**
     * TR_ACTV_METH_TYP
     */
    private String trActvMethTyp;
    
    /**
     * sum(TT_EXP_RCV_ODR.ODR_QTY - TT_EXP_RCV_ODR.SHIPPED_QTY) 
     */
    private BigDecimal sumExpQty;
    
    /**
     * sum(TT_PLTZ_ITEM.QTY)
     */
    private BigDecimal sumQty;
    
    /**
     * sum(TT_TRANSFER_ITEM_ITEM_NO.CARRY_OUT_QTY)
     */
    private BigDecimal sumCarryOutQty;
    
    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;
    
    /**
     * CUSTOMER_CD
     */
    private String customerCd;
    
    /**
     * SHIP_TO
     */
    private String shipTo;
    
    /**
     * AUTH
     */
    private String auth;
    
    /**
     * update count
     */
    private int registerCnt;
    
    /**
     * TR_NO
     */
    private String trNo;

    /**
     * CARRY_OUT_COMP_CD
     */
    private String carryOutCompCd;

    /**
     * CARRY_OUT_WH_CD
     */
    private String carryOutWhCd;

    /**
     * CARRY_IN_COMP_CD
     */
    private String carryInCompCd;

    /**
     * CARRY_IN_WH_CD
     */
    private String carryInWhCd;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * TR_STATUS
     */
    private String trStatus;

    /**
     * TR_ITEM_TYP
     */
    private String trItemTyp;

    /**
     * TR_ISSUER_ID
     */
    private String trIssuerId;

    /**
     * TR_ISSUER_NM
     */
    private String trIssuerNm;

    /**
     * TR_ISSUE_DT
     */
    private Date trIssueDt;

    /**
     * TR_ACTV_DSC_ID
     */
    private String trActvDscId;

    /**
     * TR_ACTV_NM
     */
    private String trActvNm;

    /**
     * TR_ACTV_DT
     */
    private Date trActvDt;

    /**
     * TR_RCV_DSC_ID
     */
    private String trRcvDscId;

    /**
     * TR_RCV_NM
     */
    private String trRcvNm;

    /**
     * TR_RCV_DT
     */
    private Date trRcvDt;

    /**
     * EDIT_CNT
     */
    private BigDecimal editCnt;

    /**
     * FINAL_EDIT_DSC_ID
     */
    private String finalEditDscId;

    /**
     * FINAL_EDIT_NM
     */
    private String finalEditNm;

    /**
     * FINAL_EDIT_DT
     */
    private Date finalEditDt;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;
    
    /**
     * <p>TAG_COUNT</p>
     */
    private int tagQty;

    /**
     * CML Type
     */
    private String cmlTyp;

    /**
     * Trans CD
     */
    private String trnsCd;

    /**
     * Main Mark
     */
    private String mainMark;

    /**
     * Cont sort CD
     */
    private String containerSortingKey;

    /**
     * G/W
     */
    private BigDecimal grossWeight;

    /**
     * CML Issue Date
     */
    private Date expPackingDt;

    /**
     * LAST_TR_STATUS
     */
    private String lastTrStatus;

    /**
     * Export Request No
     */
    private String expRequestNo;

    /**
     * TR_RCV_DATE From
     */
    private String lastTrRcvDtFrom;

    /**
     * TR_RCV_DATE To
     */
    private String lastTrRcvDtTo;
    
    /**
     * <p>TR_RCV_METH_TYP</p>
     */
    private String trRcvMethTyp;
    
    /**
     * <p>Legacy W/H from</p>
     */
    private String lgcyWhFrom;
    
    /**
     * <p>Legacy W/H to</p>
     */
    private String lgcyWhTo;
    
    /**
     * <p>Carry out Qty</p>
     */
    private BigDecimal carryOutQty;

    /**
     * PLTZ_ITEM_NO
     */
    private String pltzItemNo;

    /**
     * COMP_NM
     */
    private String compNm;

    /**
     * PKG_FORM_TYP
     */
    private String pkgFormTyp;

    /**
     * On Hand QTY
     */
    private String onHandQty;

    /**
     * Transferable QTY
     */
    private String transferableQty;
    
    /**
     * update Cnt
     */
    private int updateCnt;
    
    /**
     * Edit Transferable QTY
     */
    private int editTransQty;

    /**
     * Edit Tag Qty
     */
    private int editTagQty;
    
    /**
     * Default Constructor
     */
    public W3TransferDomain() {
    }
    
    /**
     * Getter method for chk.
     * 
     * @return the chk
     */
    public String getChk() {
        return chk;
    }

    /**
     * Setter method for chk.
     * 
     * @param chk Set for chk
     */
    public void setChk(String chk) {
        this.chk = chk;
    }

    /**
     * Getter method for plantCd.
     * 
     * @return the plantCd
     */
    public String getPlantCd() {
        return plantCd;
    }

    /**
     * Setter method for plantCd.
     * 
     * @param plantCd Set for plantCd
     */
    public void setPlantCd(String plantCd) {
        this.plantCd = plantCd;
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
     * Getter method for actTagQty.
     * 
     * @return the actTagQty
     */
    public int getActTagQty() {
        return actTagQty;
    }

    /**
     * Setter method for actTagQty.
     * 
     * @param actTagQty Set for actTagQty
     */
    public void setActTagQty(int actTagQty) {
        this.actTagQty = actTagQty;
    }

    /**
     * Getter method for actQty.
     * 
     * @return the actQty
     */
    public int getActQty() {
        return actQty;
    }

    /**
     * Setter method for actQty.
     * 
     * @param actQty Set for actQty
     */
    public void setActQty(int actQty) {
        this.actQty = actQty;
    }

    /**
     * Getter method for soh.
     * 
     * @return the soh
     */
    public int getSoh() {
        return soh;
    }

    /**
     * Setter method for soh.
     * 
     * @param soh Set for soh
     */
    public void setSoh(int soh) {
        this.soh = soh;
    }

    /**
     * Getter method for shipLot.
     * 
     * @return the shipLot
     */
    public int getShipLot() {
        return shipLot;
    }

    /**
     * Setter method for shipLot.
     * 
     * @param shipLot Set for shipLot
     */
    public void setShipLot(int shipLot) {
        this.shipLot = shipLot;
    }

    /**
     * Getter method for boxNo.
     * 
     * @return the boxNo
     */
    public int getBoxNo() {
        return boxNo;
    }

    /**
     * Setter method for boxNo.
     * 
     * @param boxNo Set for boxNo
     */
    public void setBoxNo(int boxNo) {
        this.boxNo = boxNo;
    }

    /**
     * Getter method for transQty.
     * 
     * @return the transQty
     */
    public int getTransQty() {
        return transQty;
    }

    /**
     * Setter method for transQty.
     * 
     * @param transQty Set for transQty
     */
    public void setTransQty(int transQty) {
        this.transQty = transQty;
    }
    
    /**
     * Getter method for trActvMethTyp.
     * 
     * @return the trActvMethTyp
     */
    public String getTrActvMethTyp() {
        return trActvMethTyp;
    }

    /**
     * Setter method for trActvMethTyp.
     * 
     * @param trActvMethTyp Set for trActvMethTyp
     */
    public void setTrActvMethTyp(String trActvMethTyp) {
        this.trActvMethTyp = trActvMethTyp;
    }

    /**
     * Getter method for sumExpQty.
     * 
     * @return the sumExpQty
     */
    public BigDecimal getSumExpQty() {
        return sumExpQty;
    }

    /**
     * Setter method for sumExpQty.
     * 
     * @param sumExpQty Set for sumExpQty
     */
    public void setSumExpQty(BigDecimal sumExpQty) {
        this.sumExpQty = sumExpQty;
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
     * Getter method for sumCarryOutQty.
     * 
     * @return the sumCarryOutQty
     */
    public BigDecimal getSumCarryOutQty() {
        return sumCarryOutQty;
    }

    /**
     * Setter method for sumCarryOutQty.
     * 
     * @param sumCarryOutQty Set for sumCarryOutQty
     */
    public void setSumCarryOutQty(BigDecimal sumCarryOutQty) {
        this.sumCarryOutQty = sumCarryOutQty;
    }

    /**
     * Getter method for trNo.
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * Setter method for trNo.
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * Getter method for carryOutCompCd.
     * 
     * @return the carryOutCompCd
     */
    public String getCarryOutCompCd() {
        return carryOutCompCd;
    }

    /**
     * Setter method for carryOutCompCd.
     * 
     * @param carryOutCompCd Set for carryOutCompCd
     */
    public void setCarryOutCompCd(String carryOutCompCd) {
        this.carryOutCompCd = carryOutCompCd;
    }

    /**
     * Getter method for carryOutWhCd.
     * 
     * @return the carryOutWhCd
     */
    public String getCarryOutWhCd() {
        return carryOutWhCd;
    }

    /**
     * Setter method for carryOutWhCd.
     * 
     * @param carryOutWhCd Set for carryOutWhCd
     */
    public void setCarryOutWhCd(String carryOutWhCd) {
        this.carryOutWhCd = carryOutWhCd;
    }

    /**
     * Getter method for carryInCompCd.
     * 
     * @return the carryInCompCd
     */
    public String getCarryInCompCd() {
        return carryInCompCd;
    }

    /**
     * Setter method for carryInCompCd.
     * 
     * @param carryInCompCd Set for carryInCompCd
     */
    public void setCarryInCompCd(String carryInCompCd) {
        this.carryInCompCd = carryInCompCd;
    }

    /**
     * Getter method for carryInWhCd.
     * 
     * @return the carryInWhCd
     */
    public String getCarryInWhCd() {
        return carryInWhCd;
    }

    /**
     * Setter method for carryInWhCd.
     * 
     * @param carryInWhCd Set for carryInWhCd
     */
    public void setCarryInWhCd(String carryInWhCd) {
        this.carryInWhCd = carryInWhCd;
    }

    /**
     * Getter method for shipperCd.
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     * 
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for trStatus.
     * 
     * @return the trStatus
     */
    public String getTrStatus() {
        return trStatus;
    }

    /**
     * Setter method for trStatus.
     * 
     * @param trStatus Set for trStatus
     */
    public void setTrStatus(String trStatus) {
        this.trStatus = trStatus;
    }

    /**
     * Getter method for trItemTyp.
     * 
     * @return the trItemTyp
     */
    public String getTrItemTyp() {
        return trItemTyp;
    }

    /**
     * Setter method for trItemTyp.
     * 
     * @param trItemTyp Set for trItemTyp
     */
    public void setTrItemTyp(String trItemTyp) {
        this.trItemTyp = trItemTyp;
    }

    /**
     * Getter method for trIssuerId.
     * 
     * @return the trIssuerId
     */
    public String getTrIssuerId() {
        return trIssuerId;
    }

    /**
     * Setter method for trIssuerId.
     * 
     * @param trIssuerId Set for trIssuerId
     */
    public void setTrIssuerId(String trIssuerId) {
        this.trIssuerId = trIssuerId;
    }

    /**
     * Getter method for trIssuerNm.
     * 
     * @return the trIssuerNm
     */
    public String getTrIssuerNm() {
        return trIssuerNm;
    }

    /**
     * Setter method for trIssuerNm.
     * 
     * @param trIssuerNm Set for trIssuerNm
     */
    public void setTrIssuerNm(String trIssuerNm) {
        this.trIssuerNm = trIssuerNm;
    }

    /**
     * Getter method for trIssueDt.
     * 
     * @return the trIssueDt
     */
    public Date getTrIssueDt() {
        return trIssueDt;
    }

    /**
     * Setter method for trIssueDt.
     * 
     * @param trIssueDt Set for trIssueDt
     */
    public void setTrIssueDt(Date trIssueDt) {
        this.trIssueDt = trIssueDt;
    }

    /**
     * Getter method for trActvDscId.
     * 
     * @return the trActvDscId
     */
    public String getTrActvDscId() {
        return trActvDscId;
    }

    /**
     * Setter method for trActvDscId.
     * 
     * @param trActvDscId Set for trActvDscId
     */
    public void setTrActvDscId(String trActvDscId) {
        this.trActvDscId = trActvDscId;
    }

    /**
     * Getter method for trActvNm.
     * 
     * @return the trActvNm
     */
    public String getTrActvNm() {
        return trActvNm;
    }

    /**
     * Setter method for trActvNm.
     * 
     * @param trActvNm Set for trActvNm
     */
    public void setTrActvNm(String trActvNm) {
        this.trActvNm = trActvNm;
    }

    /**
     * Getter method for trActvDt.
     * 
     * @return the trActvDt
     */
    public Date getTrActvDt() {
        return trActvDt;
    }

    /**
     * Setter method for trActvDt.
     * 
     * @param trActvDt Set for trActvDt
     */
    public void setTrActvDt(Date trActvDt) {
        this.trActvDt = trActvDt;
    }

    /**
     * Getter method for trRcvDscId.
     * 
     * @return the trRcvDscId
     */
    public String getTrRcvDscId() {
        return trRcvDscId;
    }

    /**
     * Setter method for trRcvDscId.
     * 
     * @param trRcvDscId Set for trRcvDscId
     */
    public void setTrRcvDscId(String trRcvDscId) {
        this.trRcvDscId = trRcvDscId;
    }

    /**
     * Getter method for trRcvNm.
     * 
     * @return the trRcvNm
     */
    public String getTrRcvNm() {
        return trRcvNm;
    }

    /**
     * Setter method for trRcvNm.
     * 
     * @param trRcvNm Set for trRcvNm
     */
    public void setTrRcvNm(String trRcvNm) {
        this.trRcvNm = trRcvNm;
    }

    /**
     * Getter method for trRcvDt.
     * 
     * @return the trRcvDt
     */
    public Date getTrRcvDt() {
        return trRcvDt;
    }

    /**
     * Setter method for trRcvDt.
     * 
     * @param trRcvDt Set for trRcvDt
     */
    public void setTrRcvDt(Date trRcvDt) {
        this.trRcvDt = trRcvDt;
    }

    /**
     * Getter method for editCnt.
     * 
     * @return the editCnt
     */
    public BigDecimal getEditCnt() {
        return editCnt;
    }

    /**
     * Setter method for editCnt.
     * 
     * @param editCnt Set for editCnt
     */
    public void setEditCnt(BigDecimal editCnt) {
        this.editCnt = editCnt;
    }

    /**
     * Getter method for finalEditDscId.
     * 
     * @return the finalEditDscId
     */
    public String getFinalEditDscId() {
        return finalEditDscId;
    }

    /**
     * Setter method for finalEditDscId.
     * 
     * @param finalEditDscId Set for finalEditDscId
     */
    public void setFinalEditDscId(String finalEditDscId) {
        this.finalEditDscId = finalEditDscId;
    }

    /**
     * Getter method for finalEditNm.
     * 
     * @return the finalEditNm
     */
    public String getFinalEditNm() {
        return finalEditNm;
    }

    /**
     * Setter method for finalEditNm.
     * 
     * @param finalEditNm Set for finalEditNm
     */
    public void setFinalEditNm(String finalEditNm) {
        this.finalEditNm = finalEditNm;
    }

    /**
     * Getter method for finalEditDt.
     * 
     * @return the finalEditDt
     */
    public Date getFinalEditDt() {
        return finalEditDt;
    }

    /**
     * Setter method for finalEditDt.
     * 
     * @param finalEditDt Set for finalEditDt
     */
    public void setFinalEditDt(Date finalEditDt) {
        this.finalEditDt = finalEditDt;
    }

    /**
     * Getter method for comUpdateFuncId.
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * Setter method for comUpdateFuncId.
     * 
     * @param comUpdateFuncId Set for comUpdateFuncId
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * Getter method for comUpdateUserId.
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * Setter method for comUpdateUserId.
     * 
     * @param comUpdateUserId Set for comUpdateUserId
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * Getter method for comUpdateUserId.
     * 
     * @return the comUpdateUserId
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     * 
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * Getter method for trNo.
     * 
     * @return the trNo
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * Setter method for comCreateFuncId.
     * 
     * @param comCreateFuncId Set for comCreateFuncId
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * Getter method for comCreateUserId.
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * Setter method for comCreateUserId.
     * 
     * @param comCreateUserId Set for comCreateUserId
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * Getter method for comCreateTimestamp.
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * Setter method for comCreateTimestamp.
     * 
     * @param comCreateTimestamp Set for comCreateTimestamp
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

    /**
     * <p>Getter method for tagQty.</p>
     *
     * @return the tagQty
     */
    public int getTagQty() {
        return tagQty;
    }

    /**
     * <p>Setter method for tagQty.</p>
     *
     * @param tagQty Set for tagQty
     */
    public void setTagQty(int tagQty) {
        this.tagQty = tagQty;
    }

    /**
     * <p>Getter method for cmlTyp.</p>
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * <p>Setter method for cmlTyp.</p>
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * <p>Getter method for trnsCd.</p>
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * <p>Setter method for trnsCd.</p>
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * <p>Getter method for mainMark.</p>
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * <p>Setter method for mainMark.</p>
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * <p>Getter method for containerSortingKey.</p>
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * <p>Setter method for containerSortingKey.</p>
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * <p>Getter method for grossWeight.</p>
     *
     * @return the grossWeight
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * <p>Setter method for grossWeight.</p>
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * <p>Getter method for expPackingDt.</p>
     *
     * @return the expPackingDt
     */
    public Date getExpPackingDt() {
        return expPackingDt;
    }

    /**
     * <p>Setter method for expPackingDt.</p>
     *
     * @param expPackingDt Set for expPackingDt
     */
    public void setExpPackingDt(Date expPackingDt) {
        this.expPackingDt = expPackingDt;
    }

    /**
     * <p>Getter method for lastTrStatus.</p>
     *
     * @return the lastTrStatus
     */
    public String getLastTrStatus() {
        return lastTrStatus;
    }

    /**
     * <p>Setter method for lastTrStatus.</p>
     *
     * @param lastTrStatus Set for lastTrStatus
     */
    public void setLastTrStatus(String lastTrStatus) {
        this.lastTrStatus = lastTrStatus;
    }

    /**
     * <p>Getter method for expRequestNo.</p>
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * <p>Setter method for expRequestNo.</p>
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /* TIS Tanaka Start */
    /**
     * Getter method for customerCd.
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     * 
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for shipTo.
     * 
     * @return the shipTo
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * Setter method for shipTo.
     * 
     * @param shipTo Set for shipTo
     */
    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }
    
    /**
     * Getter method for auth.
     * 
     * @return the auth
     */
    public String getAuth() {
        return auth;
    }

    /**
     * Setter method for auth.
     * 
     * @param auth Set for auth
     */
    public void setAuth(String auth) {
        this.auth = auth;
    }
    /* TIS Tanaka End */

    /**
     * Getter method for lgcyShipTo.
     * 
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     * 
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }
    
    /**
     * Getter method for lastTrRcvDtFrom.
     * 
     * @return the lastTrRcvDtFrom
     */
    public String getLastTrRcvDtFrom() {
        return lastTrRcvDtFrom;
    }

    /**
     * Setter method for lastTrRcvDtFrom.
     * 
     * @param lastTrRcvDtFrom Set for lastTrRcvDtFrom
     */
    public void setLastTrRcvDtFrom(String lastTrRcvDtFrom) {
        this.lastTrRcvDtFrom = lastTrRcvDtFrom;
    }

    /**
     * Getter method for lastTrRcvDtTo.
     * 
     * @return the lastTrRcvDtTo
     */
    public String getLastTrRcvDtTo() {
        return lastTrRcvDtTo;
    }

    /**
     * Setter method for lastTrRcvDtTo.
     * 
     * @param lastTrRcvDtTo Set for lastTrRcvDtTo
     */
    public void setLastTrRcvDtTo(String lastTrRcvDtTo) {
        this.lastTrRcvDtTo = lastTrRcvDtTo;
    }
    /**
     * Getter method for trRcvMethTyp.
     * 
     * @return the trRcvMethTyp
     */
    public String getTrRcvMethTyp() {
        return trRcvMethTyp;
    }

    /**
     * Setter method for trRcvMethTyp.
     * 
     * @param trRcvMethTyp Set for trRcvMethTyp
     */
    public void setTrRcvMethTyp(String trRcvMethTyp) {
        this.trRcvMethTyp = trRcvMethTyp;
    }

    /**
     * <p>Getter legacy W/H from</p>
     *
     * @return lgcyWhFrom
     */
    public String getLgcyWhFrom() {
        return lgcyWhFrom;
    }

    /**
     * <p>Setter legacy W/H from</p>
     *
     * @param lgcyWhFrom String
     */
    public void setLgcyWhFrom(String lgcyWhFrom) {
        this.lgcyWhFrom = lgcyWhFrom;
    }

    /**
     * <p>Getter legacy W/H to</p>
     *
     * @return lgcyWhTo
     */
    public String getLgcyWhTo() {
        return lgcyWhTo;
    }

    /**
     * <p>Setter legacy W/H to</p>
     *
     * @param lgcyWhTo String
     */
    public void setLgcyWhTo(String lgcyWhTo) {
        this.lgcyWhTo = lgcyWhTo;
    }

    /**
     * <p>Getter method for carryOutQty.</p>
     *
     * @return the carryOutQty
     */
    public BigDecimal getCarryOutQty() {
        return carryOutQty;
    }

    /**
     * <p>Setter method for carryOutQty.</p>
     *
     * @param carryOutQty Set for carryOutQty
     */
    public void setCarryOutQty(BigDecimal carryOutQty) {
        this.carryOutQty = carryOutQty;
    }

    /**
     * <p>Getter method for pltzItemNo</p>
     * 
     * @return pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * <p>Setter method for pltzItemNo</p>
     *
     * @param pltzItemNo Set for pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }

    /**
     * <p>Getter method for compNm</p>
     * 
     * @return compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * <p>Setter method for compNm</p>
     *
     * @param compNm Set for compNm
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * <p>Getter method for pkgFormTyp</p>
     * 
     * @return pkgFormTyp
     */
    public String getPkgFormTyp() {
        return pkgFormTyp;
    }

    /**
     * <p>Setter method for pkgFormTyp</p>
     *
     * @param pkgFormTyp Set for pkgFormTyp
     */
    public void setPkgFormTyp(String pkgFormTyp) {
        this.pkgFormTyp = pkgFormTyp;
    }

    /**
     * <p>Getter method for onHandQty.</p>
     *
     * @return the onHandQty
     */
    public String getOnHandQty() {
        return onHandQty;
    }

    /**
     * <p>Setter method for onHandQty.</p>
     *
     * @param onHandQty Set for onHandQty
     */
    public void setOnHandQty(String onHandQty) {
        this.onHandQty = onHandQty;
    }

    /**
     * <p>Getter method for transferableQty.</p>
     *
     * @return the transferableQty
     */
    public String getTransferableQty() {
        return transferableQty;
    }

    /**
     * <p>Setter method for transferableQty.</p>
     *
     * @param transferableQty Set for transferableQty
     */
    public void setTransferableQty(String transferableQty) {
        this.transferableQty = transferableQty;
    }
    
    
    /**
     * Getter method for registerCnt.
     * 
     * @return the registerCnt
     */
    public int getRegisterCnt() {
        return registerCnt;
    }

    /**
     * Setter method for registerCnt.
     * 
     * @param registerCnt Set for registerCnt
     */
    public void setRegisterCnt(int registerCnt) {
        this.registerCnt = registerCnt;
    }
    
    /**
     * Getter method for updateCnt.
     * 
     * @return the updateCnt
     */
    public int getUpdateCnt() {
        return updateCnt;
    }

    /**
     * Setter method for updateCnt.
     * 
     * @param updateCnt Set for updateCnt
     */
    public void setUpdateCnt(int updateCnt) {
        this.updateCnt = updateCnt;
    }

    /**
     * Getter method for editTransQty.
     * 
     * @return the editTransQty
     */
    public int getEditTransQty() {
        return editTransQty;
    }

    /**
     * Setter method for editTransQty.
     * 
     * @param editTransQty Set for editTransQty
     */
    public void setEditTransQty(int editTransQty) {
        this.editTransQty = editTransQty;
    }

    /**
     * Getter method for editTagQty.
     * 
     * @return the editTagQty
     */
    public int getEditTagQty() {
        return editTagQty;
    }

    /**
     * Setter method for editTagQty.
     * 
     * @param editTagQty Set for editTagQty
     */
    public void setEditTagQty(int editTagQty) {
        this.editTagQty = editTagQty;
    }

}
