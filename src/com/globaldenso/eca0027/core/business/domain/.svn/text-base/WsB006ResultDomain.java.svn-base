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
 * The domain class of WsB006 result.
 * <br />WsB006の結果用ドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WsB006result")
public class WsB006ResultDomain extends ResultDomain {

    /**
     * Serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Receiving Company Code
     */
    @XmlElement(name = "receivingCompanyCode")
    private String receivingCompanyCode;
        
    /**
     * Order list of Receiving after edit<br />
     * 情報補完結果複数明細
     */
    @XmlElementWrapper(name = "ediReceivingOrderList")
    @XmlElement(name = "ediReceivingOrderItem")
    private List<? extends WsB006ResultItemDomain> ediReceivingOrderList;
    
    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     */
    public WsB006ResultDomain() {
        super();
    }

    /**
     *  Default constructor<br />
     * デフォルトコンストラクタです。
     * @param resultCode Result code<br />
     * 結果コード
     */
    public WsB006ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     * @param resultCode Result code<br />
     * 結果コード
     * @param errorList Error list<br />
     * エラーリスト
     */
    public WsB006ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
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
     * Getter method for ediReceivingOrderList.
     *
     * @return the ediReceivingOrderList
     */
    public List<? extends WsB006ResultItemDomain> getEdiReceivingOrderList() {
        return ediReceivingOrderList;
    }

    /**
     * Setter method for ediReceivingOrderList.
     *
     * @param ediReceivingOrderList Set for ediReceivingOrderList
     */
    public void setEdiReceivingOrderList(
        List<? extends WsB006ResultItemDomain> ediReceivingOrderList) {
        this.ediReceivingOrderList = ediReceivingOrderList;
    }
}
