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
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain of search condition Invoice Data Create screen.<br />
 * Invoice Data Create画面の検索条件ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6004CriteriaDomain extends AbstractDomain {
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * stgCom
     */
    private String stgCom;
    
    /**
     * stgWh
     */
    private String stgWh;
    
    /**
     * trnsCd
     */
    private String trnsCd;
    
    /**
     * containerLooseTyp
     */
    private String containerLooseTyp;
    
    /**
     * customTimingTyp
     */
    private String customTimingTyp;

    /** 
     * CONTAINER SORTING KEY<br />
     * コンテナ層別キー
     */
    private String containerSortingKey;
    
    /** 
     * flag
     */
    private String flag;

    /** 
     * WORKED DATE<br />
     * 出荷実績日
     */
    private String fmEtd;

    /** 
     * WORKED DATE<br />
     * 出荷実績日
     */
    private String toEtd;

    /** 
     * shippingFirmNo
     */
    private String shippingFirmNo;
    
    /** 
     * stgActNo
     */
    private String stgActNo;
    
    /** 
     * stgInstrNo
     */
    private String stgInstrNo;
    
    /** 
     * WORKED DATE<br />
     * 出荷実績日
     */
    private String fmWorkedDt;

    /** 
     * WORKED DATE<br />
     * 出荷実績日
     */
    private String toWorkedDt;
    
    /** 
     * ISSUE DATE<br />
     * 出荷実績日
     */
    private String fmStgActDt;

    /** 
     * ISSUE DATE<br />
     * 出荷実績日
     */
    private String toStgActDt;
    
    /** 
     * WORKED DATE
     */
    private Date workedDt;

//    /** 
//     * mainMark
//     */
//    private String mainMark;
    
    /** 
     * screenDateFormat
     */
    private String screenDateFormat;

    /**
     * PageInfoCreator object<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Server ID<br />
     * サーバID
     */
    private String serverId;
    
    /**
     * User function use authority<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * DSC-ID/DSC-ID
     */
    private String dscId;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6004CriteriaDomain() {
    }

    /**
     * Getter method for stgCom.
     *
     * @return the stgCom
     */
    public String getStgCom() {
        return stgCom;
    }

    /**
     * Setter method for stgCom.
     *
     * @param stgCom Set for stgCom
     */
    public void setStgCom(String stgCom) {
        this.stgCom = stgCom;
    }

    /**
     * Getter method for stgWh.
     *
     * @return the stgWh
     */
    public String getStgWh() {
        return stgWh;
    }

    /**
     * Setter method for stgWh.
     *
     * @param stgWh Set for stgWh
     */
    public void setStgWh(String stgWh) {
        this.stgWh = stgWh;
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
     * It is a getter method of containerSortingKey.<br />
     * containerSortingKey のゲッターメソッドです。
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * It is the setter method of containerSortingKey.<br />
     * containerSortingKey のセッターメソッドです。
     *
     * @param containerSortingKey containerSortingKey に設定する
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for flag.
     *
     * @return the flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Setter method for flag.
     *
     * @param flag Set for flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
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
     * Getter method for fmEtd.
     *
     * @return the fmEtd
     */
    public String getFmEtd() {
        return fmEtd;
    }

    /**
     * Setter method for fmEtd.
     *
     * @param fmEtd Set for fmEtd
     */
    public void setFmEtd(String fmEtd) {
        this.fmEtd = fmEtd;
    }

    /**
     * Getter method for toEtd.
     *
     * @return the toEtd
     */
    public String getToEtd() {
        return toEtd;
    }

    /**
     * Setter method for toEtd.
     *
     * @param toEtd Set for toEtd
     */
    public void setToEtd(String toEtd) {
        this.toEtd = toEtd;
    }

    /**
     * Getter method for fmWorkedDt.
     *
     * @return the fmWorkedDt
     */
    public String getFmWorkedDt() {
        return fmWorkedDt;
    }

    /**
     * Setter method for fmWorkedDt.
     *
     * @param fmWorkedDt Set for fmWorkedDt
     */
    public void setFmWorkedDt(String fmWorkedDt) {
        this.fmWorkedDt = fmWorkedDt;
    }

    /**
     * Getter method for toWorkedDt.
     *
     * @return the toWorkedDt
     */
    public String getToWorkedDt() {
        return toWorkedDt;
    }

    /**
     * Setter method for toWorkedDt.
     *
     * @param toWorkedDt Set for toWorkedDt
     */
    public void setToWorkedDt(String toWorkedDt) {
        this.toWorkedDt = toWorkedDt;
    }

    /**
     * It is a getter method of pageInfoCreator.<br />
     * pageInfoCreator のゲッターメソッドです。
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * It is the setter method of pageInfoCreator.<br />
     * pageInfoCreator のセッターメソッドです。
     *
     * @param pageInfoCreator I set to pageInfoCreator <br /> pageInfoCreatorに設定する
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
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
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * Getter method for workedDt.
     *
     * @return the workedDt
     */
    public Date getWorkedDt() {
        return workedDt;
    }

    /**
     * Setter method for workedDt.
     *
     * @param workedDt Set for workedDt
     */
    public void setWorkedDt(Date workedDt) {
        this.workedDt = workedDt;
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
     * Getter method for fmStgActDt.
     *
     * @return the fmStgActDt
     */
    public String getFmStgActDt() {
        return fmStgActDt;
    }

    /**
     * Setter method for fmStgActDt.
     *
     * @param fmStgActDt Set for fmStgActDt
     */
    public void setFmStgActDt(String fmStgActDt) {
        this.fmStgActDt = fmStgActDt;
    }

    /**
     * Getter method for toStgActDt.
     *
     * @return the toStgActDt
     */
    public String getToStgActDt() {
        return toStgActDt;
    }

    /**
     * Setter method for toStgActDt.
     *
     * @param toStgActDt Set for toStgActDt
     */
    public void setToStgActDt(String toStgActDt) {
        this.toStgActDt = toStgActDt;
    }
    
}
