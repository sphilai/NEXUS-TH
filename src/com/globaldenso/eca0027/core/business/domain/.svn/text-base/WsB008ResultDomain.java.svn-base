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
 * The domain class of WsB008 result.
 * <br />WsB008の結果用ドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WsB008result")
public class WsB008ResultDomain extends ResultDomain {

    /**
     * Serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Receiving Company Code
     */
    @XmlElement(name = "receivingCompanyCode")
    private String rcvOdrCompCd;
    
    /**
     * Order list<br />
     * 明細
     */
    @XmlElementWrapper(name = "ediReceivingOrderList")
    @XmlElement(name = "ediReceivingOrderItem")
    private List<? extends WsB008ResultItemDomain> ediReceivingOrderList;
    
    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     */
    public WsB008ResultDomain() {
        super();
    }

    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     * @param resultCode Result code<br />
     * 結果コード
     */
    public WsB008ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     *  Default constructor<br />
     * デフォルトコンストラクタです。
     * @param resultCode Result code<br />
     * 結果コード
     * @param errorList Error list<br />
     * エラーリスト
     */
    public WsB008ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
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
     * Getter method for ediReceivingOrderList.
     *
     * @return the ediReceivingOrderList
     */
    public List<? extends WsB008ResultItemDomain> getEdiReceivingOrderList() {
        return ediReceivingOrderList;
    }

    /**
     * Setter method for ediReceivingOrderList.
     *
     * @param ediReceivingOrderList Set for ediReceivingOrderList
     */
    public void setEdiReceivingOrderList(
        List<? extends WsB008ResultItemDomain> ediReceivingOrderList) {
        this.ediReceivingOrderList = ediReceivingOrderList;
    }

    /**
     * Getter method for serialVersionUID.
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}
