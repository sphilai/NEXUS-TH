/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The unpacked up list item result domain of ECA0027_WS_2501.
 * <br />ECA0027_WS_2501の未梱包リスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2501PnListItem {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * MIX TAG NO
     * <br />MIXタグNO
     */
    @XmlElement(name = "pn")
    private String itemNo;

    /**
     * MIX TAG NO
     * <br />MIXタグNO
     */
    private String pkgCd;
    
    /**
     * MIX TAG NO
     * <br />MIXタグNO
     */
    @XmlElement(name = "unPackedQty")
    private String unPackedQty;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2501PnListItem() {
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
