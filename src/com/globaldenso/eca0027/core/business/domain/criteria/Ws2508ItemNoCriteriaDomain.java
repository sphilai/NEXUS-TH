/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a parameter domain of ECA0027_WS_2508.
 * <br />ECA0027_WS_2508のパラメータドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class Ws2508ItemNoCriteriaDomain extends AbstractDomain {
    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * ITEM NO
     * <br />品目番号
     */
    private String itemNo;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCd;
    
    /**
     * INDUSTRIAL TYPE CODE
     * <br />産業別コード
     */
    private String indusTypCd;
    
    /**
     * KANBAN TYPE
     * <br />かんばん種別
     */
    private String kanbanTyp;
    
    /**
     * TAG SEQUENCE NO
     * <br />タグSEQ番号
     */
    private String tagSeqNo;
    
    /**
     * KANBAN QUANTITY
     * <br />かんばん数量
     */
    private String kanbanQty;
    
    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */
    private String customerItemNo;
    
    /**
     * CUSTOMER TAG SEQUENCE NO
     * <br />得意先タグSEQ番号
     */
    private String customerTagSeqNo;

    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2508ItemNoCriteriaDomain() {
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
     * Getter method for indusTypCd.
     *
     * @return the indusTypCd
     */
    public String getIndusTypCd() {
        return indusTypCd;
    }

    /**
     * Setter method for indusTypCd.
     *
     * @param indusTypCd Set for indusTypCd
     */
    public void setIndusTypCd(String indusTypCd) {
        this.indusTypCd = indusTypCd;
    }

    /**
     * Getter method for kanbanTyp.
     *
     * @return the kanbanTyp
     */
    public String getKanbanTyp() {
        return kanbanTyp;
    }

    /**
     * Setter method for kanbanTyp.
     *
     * @param kanbanTyp Set for kanbanTyp
     */
    public void setKanbanTyp(String kanbanTyp) {
        this.kanbanTyp = kanbanTyp;
    }

    /**
     * Getter method for tagSeqNo.
     *
     * @return the tagSeqNo
     */
    public String getTagSeqNo() {
        return tagSeqNo;
    }

    /**
     * Setter method for tagSeqNo.
     *
     * @param tagSeqNo Set for tagSeqNo
     */
    public void setTagSeqNo(String tagSeqNo) {
        this.tagSeqNo = tagSeqNo;
    }

    /**
     * Getter method for kanbanQty.
     *
     * @return the kanbanQty
     */
    public String getKanbanQty() {
        return kanbanQty;
    }

    /**
     * Setter method for kanbanQty.
     *
     * @param kanbanQty Set for kanbanQty
     */
    public void setKanbanQty(String kanbanQty) {
        this.kanbanQty = kanbanQty;
    }

    /**
     * Getter method for customerItemNo.
     *
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * Setter method for customerItemNo.
     *
     * @param customerItemNo Set for customerItemNo
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * Getter method for customerTagSeqNo.
     *
     * @return the customerTagSeqNo
     */
    public String getCustomerTagSeqNo() {
        return customerTagSeqNo;
    }

    /**
     * Setter method for customerTagSeqNo.
     *
     * @param customerTagSeqNo Set for customerTagSeqNo
     */
    public void setCustomerTagSeqNo(String customerTagSeqNo) {
        this.customerTagSeqNo = customerTagSeqNo;
    }



}
