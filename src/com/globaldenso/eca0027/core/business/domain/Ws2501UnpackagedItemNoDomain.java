/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain holding the result of SearchUnpackagedItemNo.
 * <br />SearchUnpackagedItemNoの結果を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501UnpackagedItemNoDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * ITEM_NO
     */
    private String  itemNo;

    /**
     * PKG_CD
     */
    private String  pkgCd;
    
    /**
     * INSTR_QTY
     */
    private String  instrQty;
    
    /**
     * PACKED_QTY
     */
    private String  packedQty;
    
    /**
     * SUM_QTY
     */
    private String  sumQty;

    /**
     * UN_PACKED_QTY
     */
    private String  unPackedQty;

    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501UnpackagedItemNoDomain() {
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
     * Getter method for instrQty.
     *
     * @return the instrQty
     */
    public String getInstrQty() {
        return instrQty;
    }

    /**
     * Setter method for instrQty.
     *
     * @param instrQty Set for instrQty
     */
    public void setInstrQty(String instrQty) {
        this.instrQty = instrQty;
    }

    /**
     * Getter method for packedQty.
     *
     * @return the packedQty
     */
    public String getPackedQty() {
        return packedQty;
    }

    /**
     * Setter method for packedQty.
     *
     * @param packedQty Set for packedQty
     */
    public void setPackedQty(String packedQty) {
        this.packedQty = packedQty;
    }

    /**
     * Getter method for sumQty.
     *
     * @return the sumQty
     */
    public String getSumQty() {
        return sumQty;
    }

    /**
     * Setter method for sumQty.
     *
     * @param sumQty Set for sumQty
     */
    public void setSumQty(String sumQty) {
        this.sumQty = sumQty;
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
