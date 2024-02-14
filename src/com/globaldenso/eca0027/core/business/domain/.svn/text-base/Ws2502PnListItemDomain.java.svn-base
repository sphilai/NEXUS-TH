/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The non-Palletize list item result domain of ECA0027_WS_2502.
 * <br />ECA0027_WS_2502の未パレタイズリスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2502PnListItemDomain  implements Serializable {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * ITEM NO
     * <br />品目番号
     */
    @XmlElement(name = "pn")
    private String itemNo;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    @XmlElement(name = "pkgCd")
    private String pkgCd;
    
    /**
     * non-PKG QTY
     * <br />未梱包数量
     */
    @XmlElement(name = "unPackedQty")
    private String unPackedQty;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2502PnListItemDomain() {
        super();
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
     * Getter method for unPackedQty.
     *
     * @return the unPackedQty
     */
    public String getUnPackedQty() {
        return unPackedQty;
    }

    /**
     * Setter method for unPackedQty.
     *
     * @param unPackedQty Set for unPackedQty
     */
    public void setUnPackedQty(String unPackedQty) {
        this.unPackedQty = unPackedQty;
    }
}
