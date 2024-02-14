/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a parameter domain of ECA0027_WS_2501.
 * <br />ECA0027_WS_2501のパラメータドメインです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class Ws2501ItemNoDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
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
     * MIX TAG FLG
     * <br />MIXタグFLG
     */
    private String mixTagFlg;
    
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
    private BigDecimal tagSeqNo;
    
    /**
     * KANBAN QUANTITY
     * <br />かんばん数量
     */
    private BigDecimal kanbanQty;
    
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
     * PRODUCT DATE
     * <br />PRODUCT DATE
     */
    private String productDate;
    
    /**
     * ORDER NO
     * <br />ORDER NO
     */
    private String orderNo;
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2501ItemNoDomain() {
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
     * Getter method for mixTagFlg.
     *
     * @return the mixTagFlg
     */
    public String getMixTagFlg() {
        return mixTagFlg;
    }

    /**
     * Setter method for mixTagFlg.
     *
     * @param mixTagFlg Set for mixTagFlg
     */
    public void setMixTagFlg(String mixTagFlg) {
        this.mixTagFlg = mixTagFlg;
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
    public BigDecimal getTagSeqNo() {
        return tagSeqNo;
    }

    /**
     * Setter method for tagSeqNo.
     *
     * @param tagSeqNo Set for tagSeqNo
     */
    public void setTagSeqNo(BigDecimal tagSeqNo) {
        this.tagSeqNo = tagSeqNo;
    }

    /**
     * Getter method for kanbanQty.
     *
     * @return the kanbanQty
     */
    public BigDecimal getKanbanQty() {
        return kanbanQty;
    }

    /**
     * Setter method for kanbanQty.
     *
     * @param kanbanQty Set for kanbanQty
     */
    public void setKanbanQty(BigDecimal kanbanQty) {
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

    /**
     * <p>Getter method for productDate.</p>
     *
     * @return the productDate
     */
    public String getProductDate() {
        return productDate;
    }

    /**
     * <p>Setter method for productDate.</p>
     *
     * @param productDate Set for productDate
     */
    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }

    /**
     * <p>Getter method for orderNo.</p>
     *
     * @return the orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * <p>Setter method for orderNo.</p>
     *
     * @param orderNo Set for orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    
}
