/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain class that holds the search criteria of Staging Instruction Main screen
 * <br />荷揃え指示Main画面の検索条件を保持するドメインクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4001CriteriaDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * W/H company code.
     */
    private String whCompCd;

    /**
     * W/H code.
     */
    private String whCd;

    /**
     * Transportation code.
     */
    private String trnsCd;

    /**
     * Container sorting key.
     */
    private String containerSortingKey;

    /**
     * Container loose type.
     */
    private String containerLooseTyp;

    /**
     * Custom timing type.
     */
    private String customTimingTyp;

    /**
     * Shipper code.
     */
    private String shipperCd;

    /**
     * Staging instruction no.
     */
    private String stgInstrNo;

    /**
     * Staging instruction status.
     */
    private String stgInstrStatus;

    /**
     * Worked issuer ID.
     */
    private String workedId;

    /**
     * Staging instruction date from.
     */
    private String stgInstrDtFrom;

    /**
     * Staging instruction date to.
     */
    private String stgInstrDtTo;

    /**
     * Stating instruction issuer ID.
     */
    private String stgInstrIssuerId;

    /**
     * Main mark.
     */
    private String mainMark;

    /**
     * Export request no.
     */
    private String expRequestNo;

    /**
     * PageInfoCreator object.
     */
    private transient PageInfoCreator pageInfoCreator;

    /**
     * Server ID.
     */
    private String serverId;

    /**
     * Function authority list.
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * Date format (for display screen).
     */
    private String screenDateFormat;

    /**
     * Constructor.
     */
    public W4001CriteriaDomain() {
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
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
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
     * Getter method for stgInstrStatus.
     *
     * @return the stgInstrStatus
     */
    public String getStgInstrStatus() {
        return stgInstrStatus;
    }

    /**
     * Setter method for stgInstrStatus.
     *
     * @param stgInstrStatus Set for stgInstrStatus
     */
    public void setStgInstrStatus(String stgInstrStatus) {
        this.stgInstrStatus = stgInstrStatus;
    }

    /**
     * Getter method for workedId.
     *
     * @return the workedId
     */
    public String getWorkedId() {
        return workedId;
    }

    /**
     * Setter method for workedId.
     *
     * @param workedId Set for workedId
     */
    public void setWorkedId(String workedId) {
        this.workedId = workedId;
    }

    /**
     * Getter method for stgInstrDtFrom.
     *
     * @return the stgInstrDtFrom
     */
    public String getStgInstrDtFrom() {
        return stgInstrDtFrom;
    }

    /**
     * Setter method for stgInstrDtFrom.
     *
     * @param stgInstrDtFrom Set for stgInstrDtFrom
     */
    public void setStgInstrDtFrom(String stgInstrDtFrom) {
        this.stgInstrDtFrom = stgInstrDtFrom;
    }

    /**
     * Getter method for stgInstrDtTo.
     *
     * @return the stgInstrDtTo
     */
    public String getStgInstrDtTo() {
        return stgInstrDtTo;
    }

    /**
     * Setter method for stgInstrDtTo.
     *
     * @param stgInstrDtTo Set for stgInstrDtTo
     */
    public void setStgInstrDtTo(String stgInstrDtTo) {
        this.stgInstrDtTo = stgInstrDtTo;
    }

    /**
     * Getter method for stgInstrIssuerId.
     *
     * @return the stgInstrIssuerId
     */
    public String getStgInstrIssuerId() {
        return stgInstrIssuerId;
    }

    /**
     * Setter method for stgInstrIssuerId.
     *
     * @param stgInstrIssuerId Set for stgInstrIssuerId
     */
    public void setStgInstrIssuerId(String stgInstrIssuerId) {
        this.stgInstrIssuerId = stgInstrIssuerId;
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
     * Getter method for expRequestNo.
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * Setter method for expRequestNo.
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
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
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }
}
