/*
 * PROJECT：NEXUS_EXPORT 
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;


import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

import java.util.List;

/**
 * <p>Class that hold W3001 Criteria.</p>
 *
 * @author DIAT Chaiporn.A
 * @version 1.00
 */
public class W3001CriteriaDomain extends AbstractDomain{

    /**
     * Serial version ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * TR_NO
     */
    private String trNo;

    /**
     * Carry out company CD
     */
    private String fmWhComCd;

    /**
     * Carry out W/H CD
     */
    private String fmWhCd;

    /**
     * Carry in company CD
     */
    private String toWhComCd;

    /**
     * Carry in W/H CD
     */
    private String toWhCd;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * TR_STATUS
     */
    private String status;

    /**
     * TR_ITEM_TYP
     */
    private String trKind;

    /**
     * TR_ISSUER_ID
     */
    private String trIssuer;

    /**
     * TR Issue date From
     */
    private String fmTrIssueDate;
    
    /**
     * TR Issue date To
     */
    private String toTrIssueDate;
    
    /**
     * Activate date From
     */
    private String fmTrActivateDate;

    /**
     * Activate date To
     */
    private String toTrActivateDate;

    /**
     * CML
     */
    private String cmlNo;
    
    /**
     * Itemno
     */
    private String itemNo;
    
    /**
     * Package CD
     */
    private String pkgCd;

    /**
     * TR_RCV_DT
     */
    private String trRcvDt;

    /**
     * EDIT_CNT TR
     */
    private String editCntFlag;

    /**
     * Confirm or Edit TR
     */
    private String editFlg;
    
    /**
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * User function use authority
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * デフォルトコンストラクタ。
     */
    public W3001CriteriaDomain() {
    }

    /**
     * trNo のゲッターメソッドです。
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * trNo のセッターメソッドです。
     * 
     * @param trNo trNo に設定する
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * <p>Getter method for fmWhComCd.</p>
     *
     * @return the fmWhComCd
     */
    public String getFmWhComCd() {
        return fmWhComCd;
    }

    /**
     * <p>Setter method for fmWhComCd.</p>
     *
     * @param fmWhComCd Set for fmWhComCd
     */
    public void setFmWhComCd(String fmWhComCd) {
        this.fmWhComCd = fmWhComCd;
    }

    /**
     * <p>Getter method for fmWhCd.</p>
     *
     * @return the fmWhCd
     */
    public String getFmWhCd() {
        return fmWhCd;
    }

    /**
     * <p>Setter method for fmWhCd.</p>
     *
     * @param fmWhCd Set for fmWhCd
     */
    public void setFmWhCd(String fmWhCd) {
        this.fmWhCd = fmWhCd;
    }

    /**
     * <p>Getter method for toWhComCd.</p>
     *
     * @return the toWhComCd
     */
    public String getToWhComCd() {
        return toWhComCd;
    }

    /**
     * <p>Setter method for toWhComCd.</p>
     *
     * @param toWhComCd Set for toWhComCd
     */
    public void setToWhComCd(String toWhComCd) {
        this.toWhComCd = toWhComCd;
    }

    /**
     * <p>Getter method for toWhCd.</p>
     *
     * @return the toWhCd
     */
    public String getToWhCd() {
        return toWhCd;
    }

    /**
     * <p>Setter method for toWhCd.</p>
     *
     * @param toWhCd Set for toWhCd
     */
    public void setToWhCd(String toWhCd) {
        this.toWhCd = toWhCd;
    }

    /**
     * shipperCd のゲッターメソッドです。
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd のセッターメソッドです。
     * 
     * @param shipperCd shipperCd に設定する
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * <p>Getter method for trIssueDtFrom.</p>
     *
     * @return the trIssueDtFrom
     */
    

    /**
     * <p>Getter method for status.</p>
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>Setter method for status.</p>
     *
     * @param status Set for status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>Getter method for trKind.</p>
     *
     * @return the trKind
     */
    public String getTrKind() {
        return trKind;
    }

    /**
     * <p>Setter method for trKind.</p>
     *
     * @param trKind Set for trKind
     */
    public void setTrKind(String trKind) {
        this.trKind = trKind;
    }

    /**
     * <p>Getter method for trIssuer.</p>
     *
     * @return the trIssuer
     */
    public String getTrIssuer() {
        return trIssuer;
    }

    /**
     * <p>Setter method for trIssuer.</p>
     *
     * @param trIssuer Set for trIssuer
     */
    public void setTrIssuer(String trIssuer) {
        this.trIssuer = trIssuer;
    }

    /**
     * <p>Getter method for editCntFlag.</p>
     *
     * @return the editCntFlag
     */
    public String getEditCntFlag() {
        return editCntFlag;
    }

    /**
     * <p>Setter method for editCntFlag.</p>
     *
     * @param editCntFlag Set for editCntFlag
     */
    public void setEditCntFlag(String editCntFlag) {
        this.editCntFlag = editCntFlag;
    }

    /**
     * <p>Setter method for trRcvDt.</p>
     *
     * @param trRcvDt Set for trRcvDt
     */
    public void setTrRcvDt(String trRcvDt) {
        this.trRcvDt = trRcvDt;
    }
    
    

    /**
     * <p>Getter method for cmlNo.</p>
     *
     * @return the cmlNo
     */
    public String getCmlNo() {
        return cmlNo;
    }

    /**
     * <p>Setter method for cmlNo.</p>
     *
     * @param cmlNo Set for cmlNo
     */
    public void setCmlNo(String cmlNo) {
        this.cmlNo = cmlNo;
    }

    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @return itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * <p>Type in the functional overview of the method.</p>
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    
    /**
     * <p>Getter method for pkgCd.</p>
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * <p>Setter method for pkgCd.</p>
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * pageInfoCreator のゲッターメソッドです。
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * pageInfoCreator のセッターメソッドです。
     *
     * @param pageInfoCreator pageInfoCreator に設定する
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

    /**
     * <p>Getter method for screenDateFormat.</p>
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * <p>Setter method for screenDateFormat.</p>
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * <p>Getter method for userAuthList.</p>
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * <p>Setter method for userAuthList.</p>
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * <p>Getter method for trRcvDt.</p>
     *
     * @return the trRcvDt
     */
    public String getTrRcvDt() {
        return trRcvDt;
    }

    /**
     * <p>Getter method for fmTrIssueDate.</p>
     *
     * @return the fmTrIssueDate
     */
    public String getFmTrIssueDate() {
        return fmTrIssueDate;
    }

    /**
     * <p>Setter method for fmTrIssueDate.</p>
     *
     * @param fmTrIssueDate Set for fmTrIssueDate
     */
    public void setFmTrIssueDate(String fmTrIssueDate) {
        this.fmTrIssueDate = fmTrIssueDate;
    }

    /**
     * <p>Getter method for toTrIssueDate.</p>
     *
     * @return the toTrIssueDate
     */
    public String getToTrIssueDate() {
        return toTrIssueDate;
    }

    /**
     * <p>Setter method for toTrIssueDate.</p>
     *
     * @param toTrIssueDate Set for toTrIssueDate
     */
    public void setToTrIssueDate(String toTrIssueDate) {
        this.toTrIssueDate = toTrIssueDate;
    }

    /**
     * <p>Getter method for fmTrActivateDate.</p>
     *
     * @return the fmTrActivateDate
     */
    public String getFmTrActivateDate() {
        return fmTrActivateDate;
    }

    /**
     * <p>Setter method for fmTrActivateDate.</p>
     *
     * @param fmTrActivateDate Set for fmTrActivateDate
     */
    public void setFmTrActivateDate(String fmTrActivateDate) {
        this.fmTrActivateDate = fmTrActivateDate;
    }

    /**
     * <p>Getter method for toTrActivateDate.</p>
     *
     * @return the toTrActivateDate
     */
    public String getToTrActivateDate() {
        return toTrActivateDate;
    }

    /**
     * <p>Setter method for toTrActivateDate.</p>
     *
     * @param toTrActivateDate Set for toTrActivateDate
     */
    public void setToTrActivateDate(String toTrActivateDate) {
        this.toTrActivateDate = toTrActivateDate;
    }

    /**
     * <p>Getter method for editFlg.</p>
     *
     * @return the editFlg
     */
    public String getEditFlg() {
        return editFlg;
    }

    /**
     * <p>Setter method for editFlg.</p>
     *
     * @param editFlg Set for editFlg
     */
    public void setEditFlg(String editFlg) {
        this.editFlg = editFlg;
    }
   
}
