/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * The domain class that contains the request parameters of WsB006.
 * <br />WsB006のリクエストパラメータを格納するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class WsB006ParamDomain {

    /**
     * Receiving company code<br />
     * 受注会社の拠点間会社コード
     */
    @XmlElement(name = "receivingCompanyCode")
    private String receivingCompanyCode;
    
    /**
     * Detail list<br />
     * 明細
     */
    @XmlElementWrapper(name = "orderEntryDetailList")
    @XmlElement(name = "orderEntryDetailItem")
    private List<? extends WsB006ParamItemDomain> orderEntryDetailList;

    /**
     * Retry Flag<br />
     * 持ち回りフラグ(出荷予定日チェックの制御)<br />
     * Y:Skip check, N:Check
     */
    @XmlElement(name = "rtryFlg")
    private String rtryFlg;

    /**
     * CIGMA ADS<br />
     * 業務日付
     */
    @XmlElement(name = "cigmaAds")
    private String cigmaAds;

    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     */
    public WsB006ParamDomain() {
        super();
    }

    /**
     * Getter method for receivingCompanyCode.
     *
     * @return the receivingCompanyCode
     */
    public String getReceivingCompanyCode() {
        return receivingCompanyCode;
    }

    /**
     * Setter method for receivingCompanyCode.
     *
     * @param receivingCompanyCode Set for receivingCompanyCode
     */
    public void setReceivingCompanyCode(String receivingCompanyCode) {
        this.receivingCompanyCode = receivingCompanyCode;
    }

    /**
     * Getter method for orderEntryDetailList.
     *
     * @return the orderEntryDetailList
     */
    public List<? extends WsB006ParamItemDomain> getOrderEntryDetailList() {
        return orderEntryDetailList;
    }

    /**
     * Setter method for orderEntryDetailList.
     *
     * @param orderEntryDetailList Set for orderEntryDetailList
     */
    public void setOrderEntryDetailList(
        List<? extends WsB006ParamItemDomain> orderEntryDetailList) {
        this.orderEntryDetailList = orderEntryDetailList;
    }

    /**
     * Getter method for rtryFlg.
     *
     * @return the rtryFlg
     */
    public String getRtryFlg() {
        return rtryFlg;
    }

    /**
     * Setter method for rtryFlg.
     *
     * @param rtryFlg Set for rtryFlg
     */
    public void setRtryFlg(String rtryFlg) {
        this.rtryFlg = rtryFlg;
    }

    /**
     * Getter method for cigmaAds.
     *
     * @return the cigmaAds
     */
    public String getCigmaAds() {
        return cigmaAds;
    }

    /**
     * Setter method for cigmaAds.
     *
     * @param cigmaAds Set for cigmaAds
     */
    public void setCigmaAds(String cigmaAds) {
        this.cigmaAds = cigmaAds;
    }
}
