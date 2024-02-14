/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のDomainクラス
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * 
 * @author $Author$
 * @version $Revision$
 */
public class L1002ReportDomain extends AbstractDomain {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Printed Date
     */
    private String printedDate = null;

    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo = null;

    /**
     * ETD/???????
     */
    private String dueDt = null;
    
    /**
     * KIT/????
     */
    private String kit = null;

    /**
     * RT USE FLAG/????
     */
    private String rtUseFlg = null;

    /**
     * EXPREQUEST/????
     */
    private String expRequest = null;
    /**
     * SHIP TO/????
     */
    private String shipTo = null;
    /**
     * PKG COMP/????
     */
    private String pkgComp = null;
    /**
     * TOTAL TAGS/????
     */
    private String totalTags = null;
    /**
     * REQUESTER ISSUE DEPARTMENT NAME/????
     */
    private String requestIssuerDeptNm = null;
    /**
     * REQUESTER ISSUE NAME/????
     */
    private String requestIssuerNm = null;
    /**
     * NICE NET/????
     */
    private String issuerCompNiceNet = null;
    /**
     * TELEPHONE/????
     */
    private String issuerCompTel = null;
    /**
     * ADDRESS/????
     */
    private String addr = null;
    /**
     * CONTACT/????
     */
    private String contact = null;
    /**
     * REQUESTER PACKAGE/????
     */
    private String requestToPackingSec = null;
    /**
     * COMPANY NAME/????
     */
    private String compName = null;
    /**
     * DETAIL LIST/????
     */
    private List<L1002ReportDetailDomain> detailList;
    
    /**
     * Constructor。
     */
    public L1002ReportDomain() {
    }
    
    
    /**
     * <p>Getter method for detailList.</p>
     *
     * @return the detailList
     */
    public List<L1002ReportDetailDomain> getDetailList() {
        return detailList;
    }
    /**
     * <p>Setter method for detailList.</p>
     *
     * @param detailList Set for detailList
     */
    public void setDetailList(List<L1002ReportDetailDomain> detailList) {
        this.detailList = detailList;
    }
    /**
     * <p>Getter method for printedDate.</p>
     *
     * @return the printedDate
     */
    public String getPrintedDate() {
        return printedDate;
    }
    /**
     * <p>Setter method for printedDate.</p>
     *
     * @param printedDate Set for printedDate
     */
    public void setPrintedDate(String printedDate) {
        this.printedDate = printedDate;
    }
    
    /**
     * <p>Getter method for compName.</p>
     *
     * @return the compName
     */
    public String getCompName() {
        return compName;
    }
    /**
     * <p>Setter method for compName.</p>
     *
     * @param compName Set for compName
     */
    public void setCompName(String compName) {
        this.compName = compName;
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
    
    /**
     * <p>Getter method for dueDt.</p>
     *
     * @return the dueDt
     */
    public String getDueDt() {
        return dueDt;
    }
    /**
     * <p>Setter method for dueDt.</p>
     *
     * @param dueDt Set for dueDt
     */
    public void setDueDt(String dueDt) {
        this.dueDt = dueDt;
    }
    /**
     * <p>Getter method for kit.</p>
     *
     * @return the kit
     */
    public String getKit() {
        return kit;
    }
    /**
     * <p>Setter method for kit.</p>
     *
     * @param kit Set for kit
     */
    public void setKit(String kit) {
        this.kit = kit;
    }
    /**
     * <p>Getter method for rtUseFlg.</p>
     *
     * @return the rtUseFlg
     */
    public String getRtUseFlg() {
        return rtUseFlg;
    }
    /**
     * <p>Setter method for rtUseFlg.</p>
     *
     * @param rtUseFlg Set for rtUseFlg
     */
    public void setRtUseFlg(String rtUseFlg) {
        this.rtUseFlg = rtUseFlg;
    }
    /**
     * <p>Getter method for expRequest.</p>
     *
     * @return the expRequest
     */
    public String getExpRequest() {
        return expRequest;
    }
    /**
     * <p>Setter method for expRequest.</p>
     *
     * @param expRequest Set for expRequest
     */
    public void setExpRequest(String expRequest) {
        this.expRequest = expRequest;
    }
    /**
     * <p>Getter method for shipTo.</p>
     *
     * @return the shipTo
     */
    public String getShipTo() {
        return shipTo;
    }
    /**
     * <p>Setter method for shipTo.</p>
     *
     * @param shipTo Set for shipTo
     */
    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }
    /**
     * <p>Getter method for pkgComp.</p>
     *
     * @return the pkgComp
     */
    public String getPkgComp() {
        return pkgComp;
    }
    /**
     * <p>Setter method for pkgComp.</p>
     *
     * @param pkgComp Set for pkgComp
     */
    public void setPkgComp(String pkgComp) {
        this.pkgComp = pkgComp;
    }
    /**
     * <p>Getter method for totalTags.</p>
     *
     * @return the totalTags
     */
    public String getTotalTags() {
        return totalTags;
    }
    /**
     * <p>Setter method for totalTags.</p>
     *
     * @param totalTags Set for totalTags
     */
    public void setTotalTags(String totalTags) {
        this.totalTags = totalTags;
    }
   
    /**
     * <p>Getter method for requestIssuerDeptNm.</p>
     *
     * @return the requestIssuerDeptNm
     */
    public String getRequestIssuerDeptNm() {
        return requestIssuerDeptNm;
    }
    /**
     * <p>Setter method for requestIssuerDeptNm.</p>
     *
     * @param requestIssuerDeptNm Set for requestIssuerDeptNm
     */
    public void setRequestIssuerDeptNm(String requestIssuerDeptNm) {
        this.requestIssuerDeptNm = requestIssuerDeptNm;
    }
    
    /**
     * <p>Getter method for requestIssuerNm.</p>
     *
     * @return the requestIssuerNm
     */
    public String getRequestIssuerNm() {
        return requestIssuerNm;
    }
    /**
     * <p>Setter method for requestIssuerNm.</p>
     *
     * @param requestIssuerNm Set for requestIssuerNm
     */
    public void setRequestIssuerNm(String requestIssuerNm) {
        this.requestIssuerNm = requestIssuerNm;
    }
   
    /**
     * <p>Getter method for issuerCompNiceNet.</p>
     *
     * @return the issuerCompNiceNet
     */
    public String getIssuerCompNiceNet() {
        return issuerCompNiceNet;
    }
    /**
     * <p>Setter method for issuerCompNiceNet.</p>
     *
     * @param issuerCompNiceNet Set for issuerCompNiceNet
     */
    public void setIssuerCompNiceNet(String issuerCompNiceNet) {
        this.issuerCompNiceNet = issuerCompNiceNet;
    }
    
    /**
     * <p>Getter method for issuerCompTel.</p>
     *
     * @return the issuerCompTel
     */
    public String getIssuerCompTel() {
        return issuerCompTel;
    }
    /**
     * <p>Setter method for issuerCompTel.</p>
     *
     * @param issuerCompTel Set for issuerCompTel
     */
    public void setIssuerCompTel(String issuerCompTel) {
        this.issuerCompTel = issuerCompTel;
    }
    /**
     * <p>Getter method for addr.</p>
     *
     * @return the addr
     */
    public String getAddr() {
        return addr;
    }
    /**
     * <p>Setter method for addr.</p>
     *
     * @param addr Set for addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }
    /**
     * <p>Getter method for contact.</p>
     *
     * @return the contact
     */
    public String getContact() {
        return contact;
    }
    /**
     * <p>Setter method for contact.</p>
     *
     * @param contact Set for contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
    /**
     * <p>Getter method for requestToPackingSec.</p>
     *
     * @return the requestToPackingSec
     */
    public String getRequestToPackingSec() {
        return requestToPackingSec;
    }
    /**
     * <p>Setter method for requestToPackingSec.</p>
     *
     * @param requestToPackingSec Set for requestToPackingSec
     */
    public void setRequestToPackingSec(String requestToPackingSec) {
        this.requestToPackingSec = requestToPackingSec;
    }
    
}
