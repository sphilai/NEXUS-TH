/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;

/**
 * The domain class that holds the search condition of Palletize Instruction 
 * <br />梱包指示の検索条件を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 10985 $
 */
public class W2001PltzInstrCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CD
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    private String lgcyWhCd;
    
    /**
     * PALLETIZE INSTRUCTION STATUS
     * <br />梱包指示ステータス
     */
    private String pltzInstrStatus;
    
    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * PALLETIZE INSTRUCTION DATE (From)
     * <br />梱包指示日(From)
     */
    private Date pltzInstrDtFrom;
    
    /**
     * PALLETIZE INSTRUCTION DATE (To)
     * <br />梱包指示日(To)
     */
    private Date pltzInstrDtTo;
    
    /**
     * PALLETIZE INSTRUCTION ISSUER ID
     * <br />梱包指示者ID
     */
    private String pltzInstrIssuerId;

    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;
    
    /**
     * User functional utilization right
     * <br />ユーザ機能利用権限
     */
    private List<UserAuthDomain> userAuthList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2001PltzInstrCriteriaDomain() {
        super();
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
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for lgcyWhCd.
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * Setter method for lgcyWhCd.
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * Getter method for pltzInstrStatus.
     *
     * @return the pltzInstrStatus
     */
    public String getPltzInstrStatus() {
        return pltzInstrStatus;
    }

    /**
     * Setter method for pltzInstrStatus.
     *
     * @param pltzInstrStatus Set for pltzInstrStatus
     */
    public void setPltzInstrStatus(String pltzInstrStatus) {
        this.pltzInstrStatus = pltzInstrStatus;
    }

    /**
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * Getter method for pltzInstrDtFrom.
     *
     * @return the pltzInstrDtFrom
     */
    public Date getPltzInstrDtFrom() {
        return pltzInstrDtFrom;
    }

    /**
     * Setter method for pltzInstrDtFrom.
     *
     * @param pltzInstrDtFrom Set for pltzInstrDtFrom
     */
    public void setPltzInstrDtFrom(Date pltzInstrDtFrom) {
        this.pltzInstrDtFrom = pltzInstrDtFrom;
    }

    /**
     * Getter method for pltzInstrDtTo.
     *
     * @return the pltzInstrDtTo
     */
    public Date getPltzInstrDtTo() {
        return pltzInstrDtTo;
    }

    /**
     * Setter method for pltzInstrDtTo.
     *
     * @param pltzInstrDtTo Set for pltzInstrDtTo
     */
    public void setPltzInstrDtTo(Date pltzInstrDtTo) {
        this.pltzInstrDtTo = pltzInstrDtTo;
    }

    /**
     * Getter method for pltzInstrIssuerId.
     *
     * @return the pltzInstrIssuerId
     */
    public String getPltzInstrIssuerId() {
        return pltzInstrIssuerId;
    }

    /**
     * Setter method for pltzInstrIssuerId.
     *
     * @param pltzInstrIssuerId Set for pltzInstrIssuerId
     */
    public void setPltzInstrIssuerId(String pltzInstrIssuerId) {
        this.pltzInstrIssuerId = pltzInstrIssuerId;
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
    public List<UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }
}
