/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of search criteria Export Shipping Item Special Information MA screen.
 *  <br />Export Shipping Item Special Information MA画面の検索条件ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9018ExpFmlByItemMaItemDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * COMPANY CODE<br />
     * 会社コード
     */
    private String compCd;

    /**
     * ITEM NO<br />
     * 品目番号
     */
    private String itemNo;

    /**
     * APPLY START DATE<br />
     * 適用開始日
     */
    private Date aplyStrtDt;

    /**
     * EXPORT LIMIT TYPE<br />
     * 輸出規制区分
     */
    private String expLimitTyp;

    /**
     * DENGER ITEM FLAG<br />
     * 危険品フラグ
     */
    private String dngrItemFlg;

    /**
     * HS CODE<br />
     * HSコード
     */
    private String hsCd;

    /**
     * CIGMA PRDCT FLAG<br />
     * CIGMA製品フラグ
     */
    private String cigmaPrdctFlg;
    
    /**
     * Default constructor.
     *  デフォルトコンストラクタです。
     */
    public W9018ExpFmlByItemMaItemDomain() {
    }

    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
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
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * Getter method for expLimitTyp.
     *
     * @return the expLimitTyp
     */
    public String getExpLimitTyp() {
        return expLimitTyp;
    }

    /**
     * Setter method for expLimitTyp.
     *
     * @param expLimitTyp Set for expLimitTyp
     */
    public void setExpLimitTyp(String expLimitTyp) {
        this.expLimitTyp = expLimitTyp;
    }

    /**
     * Getter method for dngrItemFlg.
     *
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * Setter method for dngrItemFlg.
     *
     * @param dngrItemFlg Set for dngrItemFlg
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * Getter method for hsCd.
     *
     * @return the hsCd
     */
    public String getHsCd() {
        return hsCd;
    }

    /**
     * Setter method for hsCd.
     *
     * @param hsCd Set for hsCd
     */
    public void setHsCd(String hsCd) {
        this.hsCd = hsCd;
    }

    /**
     * Getter method for cigmaPrdctFlg.
     *
     * @return the cigmaPrdctFlg
     */
    public String getCigmaPrdctFlg() {
        return cigmaPrdctFlg;
    }

    /**
     * Setter method for cigmaPrdctFlg.
     *
     * @param cigmaPrdctFlg Set for cigmaPrdctFlg
     */
    public void setCigmaPrdctFlg(String cigmaPrdctFlg) {
        this.cigmaPrdctFlg = cigmaPrdctFlg;
    }

}
