/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * This is a domain holding the search condition of Customer Order Receiving.
 * <br />Customer Order Receivingの検索条件を保持するドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class WB001OdrRcvCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * RECEIVE ORDER COMPANY CODE
     * <br />受注会社コード
     */
    private String rcvOdrCompCd;

    /**
     * Ordering company name
     * <br />受注会社名
     */
    private String rcvOdrCompNm;

    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * CUSTOMER PO NO
     * <br />得意先PO NO
     */
    private String customerPoNo;

    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * ITEM NO
     * <br />品目番号
     */
    private String itemNo;

    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */
    private String itemNm;

    /**
     * ITEM NO (ORG)  
     * <br />品目番号(ORG)
     */
    private String itemNoOrg;

    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCd;

    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;

    /**
     * ETD DUE DATE
     * <br />船積期限
     */
    private Date etdDueDt;

    /**
     * ONE MONTH BEFORE
     * <br />1ヶ月前
     */
    private Date oneMonthBefore;

    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;

    /**
     * User functional utilization right
     * <br />ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * ORDER CONTROL NO
     * <br />オーダーコントロールNO
     */
    private BigDecimal odrCtrlNo;

    /**
     * SHIPPING_DT
     */
    private Date shippingDt;
    
    /**
     * PageInfoCreator object
     * <br />PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public WB001OdrRcvCriteriaDomain() {
    }

    /**
     * Getter method for rcvOdrCompCd.
     *
     * @return the rcvOdrCompCd
     */
    public String getRcvOdrCompCd() {
        return rcvOdrCompCd;
    }

    /**
     * Setter method for rcvOdrCompCd.
     *
     * @param rcvOdrCompCd Set for rcvOdrCompCd
     */
    public void setRcvOdrCompCd(String rcvOdrCompCd) {
        this.rcvOdrCompCd = rcvOdrCompCd;
    }

    /**
     * Getter method for rcvOdrCompNm.
     *
     * @return the rcvOdrCompNm
     */
    public String getRcvOdrCompNm() {
        return rcvOdrCompNm;
    }

    /**
     * Setter method for rcvOdrCompNm.
     *
     * @param rcvOdrCompNm Set for rcvOdrCompNm
     */
    public void setRcvOdrCompNm(String rcvOdrCompNm) {
        this.rcvOdrCompNm = rcvOdrCompNm;
    }

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
     * Getter method for itemNm.
     *
     * @return the itemNm
     */
    public String getItemNm() {
        return itemNm;
    }

    /**
     * Setter method for itemNm.
     *
     * @param itemNm Set for itemNm
     */
    public void setItemNm(String itemNm) {
        this.itemNm = itemNm;
    }

    /**
     * Getter method for itemNoOrg.
     *
     * @return the itemNoOrg
     */
    public String getItemNoOrg() {
        return itemNoOrg;
    }

    /**
     * Setter method for itemNoOrg.
     *
     * @param itemNoOrg Set for itemNoOrg
     */
    public void setItemNoOrg(String itemNoOrg) {
        this.itemNoOrg = itemNoOrg;
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
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
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
     * Getter method for oneMonthBefore.
     *
     * @return the oneMonthBefore
     */
    public Date getOneMonthBefore() {
        return oneMonthBefore;
    }

    /**
     * Setter method for oneMonthBefore.
     *
     * @param oneMonthBefore Set for oneMonthBefore
     */
    public void setOneMonthBefore(Date oneMonthBefore) {
        this.oneMonthBefore = oneMonthBefore;
    }

    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * Getter method for odrCtrlNo.
     *
     * @return the odrCtrlNo
     */
    public BigDecimal getOdrCtrlNo() {
        return odrCtrlNo;
    }

    /**
     * Setter method for odrCtrlNo.
     *
     * @param odrCtrlNo Set for odrCtrlNo
     */
    public void setOdrCtrlNo(BigDecimal odrCtrlNo) {
        this.odrCtrlNo = odrCtrlNo;
    }

    /**
     * Getter method for shippingDt.
     *
     * @return the shippingDt
     */
    public Date getShippingDt() {
        return shippingDt;
    }

    /**
     * Setter method for shippingDt.
     *
     * @param shippingDt Set for shippingDt
     */
    public void setShippingDt(Date shippingDt) {
        this.shippingDt = shippingDt;
    }

    /**
     * Getter method for pageInfoCreator.
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * Setter method for pageInfoCreator.
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }
}
