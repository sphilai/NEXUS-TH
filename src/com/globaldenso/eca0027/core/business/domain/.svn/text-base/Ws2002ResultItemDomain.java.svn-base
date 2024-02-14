/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The domain that contains the part number information.
 * <br />品名情報を格納するドメインです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 13524 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2002ResultItemDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Item No 
     * <br />品目番号
     */
    @XmlElement(name = "itemNo")
    private String itnbr;
    
    /**
     * Lot size of small Box
     * <br />小箱のロットサイズ
     */
    @XmlElement(name = "lotSize")
    private String lotsz;
    
    /**
     * Place of stock
     * <br />在庫場所
     */
    @XmlElement(name = "location")
    private String whslc;
    
    /**
     * On Hand Total Qty
     */
    @XmlElement(name = "onHandTotalQty")
    private String mohtq;
    
    /**
     * Constructor
     * <br />コンストラクタ
     *
     */
    public Ws2002ResultItemDomain() {
        super();
    }

    /**
     * Getter method for itnbr.
     *
     * @return the itnbr
     */
    public String getItnbr() {
        return itnbr;
    }

    /**
     * Setter method for itnbr.
     *
     * @param itnbr Set for itnbr
     */
    public void setItnbr(String itnbr) {
        this.itnbr = itnbr;
    }

    /**
     * Getter method for lotsz.
     *
     * @return the lotsz
     */
    public String getLotsz() {
        return lotsz;
    }

    /**
     * Setter method for lotsz.
     *
     * @param lotsz Set for lotsz
     */
    public void setLotsz(String lotsz) {
        this.lotsz = lotsz;
    }

    /**
     * Getter method for whslc.
     *
     * @return the whslc
     */
    public String getWhslc() {
        return whslc;
    }

    /**
     * Setter method for whslc.
     *
     * @param whslc Set for whslc
     */
    public void setWhslc(String whslc) {
        this.whslc = whslc;
    }

    /**
     * <p>mohtq のゲッターメソッドです。</p>
     *
     * @return the mohtq
     */
    public String getMohtq() {
        return mohtq;
    }

    /**
     * <p>mohtq のセッターメソッドです。</p>
     *
     * @param mohtq mohtq に設定する
     */
    public void setMohtq(String mohtq) {
        this.mohtq = mohtq;
    }
    
}
