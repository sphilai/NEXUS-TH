/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;
import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the search criteria for the Shipping Confirmation
 * <br />出荷確認の検索条件を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5001ShippingFirmCriteriaDomain extends AbstractDomain {
    
    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Warehouse Company code.
     */
    private String whCompCd;
    
    /**
     * Warehouse code.
     */
    private String whCd;
    
    /**
     * Transport code.
     */
    private String trnsCd;
    
    /**
     * Container sorting key.
     */
    private String containerSortingKey;
    
    /**
     * Shipping confirm status.
     */
    private String shippingFirmStatus;
    
    /**
     * Shipping confirm no.
     */
    private String shippingFirmNo;
    
    /**
     * Container loose type.
     */
    private String containerLooseTyp;
    
    /**
     * Estimated time of departure.(from)
     */
    private Date fmEtd;
    
    /**
     * Estimated time of departure.(to)
     */
    private Date toEtd;
    
    /**
     * Carrier Company code.
     */
    private String carrierCompCd;
    
    /**
     * Container no.
     */
    private String containerNo;
    
    /**
     * Shipping confirm issuer id.
     */
    private String shippingFirmIssuerId;
    
    /**
     * Shipping worked issuer id.
     */
    private String workedIssuerId;
    
    /**
     * Staging instruction no.
     */
    private String stgInstrNo;
    
    /**
     * Staging actuality no.
     */
    private String stgActNo;
    
    /**
     * Server id.
     */
    private String serverId;
    
    /**
     * User authority list.
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Main mark.
     */
    private String mainMark;
    
    /**
     * Xmain mark.
     */
    private String xmainMark;
    
    /**
     * Constructor.
     *
     */
    public W5001ShippingFirmCriteriaDomain() {
    }

    /**
     * Getter method for whCompCd.
     *
     * @return the whCompCd
     */
    public String getWhCompCd() {
        return whCompCd;
    }

    /**
     * Setter method for whCompCd.
     *
     * @param whCompCd Set for whCompCd
     */
    public void setWhCompCd(String whCompCd) {
        this.whCompCd = whCompCd;
    }

    /**
     * Getter method for whCd.
     *
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * Setter method for whCd.
     *
     * @param whCd Set for whCd
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
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
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for shippingFirmStatus.
     *
     * @return the shippingFirmStatus
     */
    public String getShippingFirmStatus() {
        return shippingFirmStatus;
    }

    /**
     * Setter method for shippingFirmStatus.
     *
     * @param shippingFirmStatus Set for shippingFirmStatus
     */
    public void setShippingFirmStatus(String shippingFirmStatus) {
        this.shippingFirmStatus = shippingFirmStatus;
    }

    /**
     * Getter method for shippingFirmNo.
     *
     * @return the shippingFirmNo
     */
    public String getShippingFirmNo() {
        return shippingFirmNo;
    }

    /**
     * Setter method for shippingFirmNo.
     *
     * @param shippingFirmNo Set for shippingFirmNo
     */
    public void setShippingFirmNo(String shippingFirmNo) {
        this.shippingFirmNo = shippingFirmNo;
    }

    /**
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for fmEtd.
     *
     * @return the fmEtd
     */
    public Date getFmEtd() {
        return fmEtd;
    }

    /**
     * Setter method for fmEtd.
     *
     * @param fmEtd Set for fmEtd
     */
    public void setFmEtd(Date fmEtd) {
        this.fmEtd = fmEtd;
    }

    /**
     * Getter method for toEtd.
     *
     * @return the toEtd
     */
    public Date getToEtd() {
        return toEtd;
    }

    /**
     * Setter method for toEtd.
     *
     * @param toEtd Set for toEtd
     */
    public void setToEtd(Date toEtd) {
        this.toEtd = toEtd;
    }

    /**
     * Getter method for carrierCompCd.
     *
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * Setter method for carrierCompCd.
     *
     * @param carrierCompCd Set for carrierCompCd
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
    }

    /**
     * Getter method for containerNo.
     *
     * @return the containerNo
     */
    public String getContainerNo() {
        return containerNo;
    }

    /**
     * Setter method for containerNo.
     *
     * @param containerNo Set for containerNo
     */
    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    /**
     * Getter method for shippingFirmIssuerId.
     *
     * @return the shippingFirmIssuerId
     */
    public String getShippingFirmIssuerId() {
        return shippingFirmIssuerId;
    }

    /**
     * Setter method for shippingFirmIssuerId.
     *
     * @param shippingFirmIssuerId Set for shippingFirmIssuerId
     */
    public void setShippingFirmIssuerId(String shippingFirmIssuerId) {
        this.shippingFirmIssuerId = shippingFirmIssuerId;
    }

    /**
     * Getter method for workedIssuerId.
     *
     * @return the workedIssuerId
     */
    public String getWorkedIssuerId() {
        return workedIssuerId;
    }

    /**
     * Setter method for workedIssuerId.
     *
     * @param workedIssuerId Set for workedIssuerId
     */
    public void setWorkedIssuerId(String workedIssuerId) {
        this.workedIssuerId = workedIssuerId;
    }

    /**
     * Getter method for stgInstrNo.
     *
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * Setter method for stgInstrNo.
     *
     * @param stgInstrNo Set for stgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * Getter method for stgActNo.
     *
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * Setter method for stgActNo.
     *
     * @param stgActNo Set for stgActNo
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
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
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }
    
}
