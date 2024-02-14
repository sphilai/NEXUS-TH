/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

/**
 * <br />Mock帳票出力用ドメイン（明細）です。
 *
 * @version $Revision: 5759 $
 */
public class L9999ReportDetailDomain {

    /**
     * <br />メインマーク
     */
    private String cmlNo;
    
    /**
     * <br />RT材フラグ
     */
    private String rt;
    
    /**
     * <br />Mixタグ
     */
    private String mixTag;
    
    /**
     * <br />品目名称
     */
    private String description;
    
    /**
     * <br />得意先品目番号または型式
     */
    private String custItemNoOrModItemNo;
    
    /**
     * <br />品目番号
     */
    private String itemNo;
    
    /**
     * <br />数量
     */
    private String qty;
    
    /**
     * <br />包装コード
     */
    private String pkg;
    
    /**
     * <br />注意書き
     */
    private String remarks;

    /**
     * <br />デフォルトコンストラクタです。
     */
    public L9999ReportDetailDomain() {
    }

    /**
     * Getter method for cmlNo.
     *
     * @return the cmlNo
     */
    public String getCmlNo() {
        return cmlNo;
    }

    /**
     * Setter method for cmlNo.
     *
     * @param cmlNo Set for cmlNo
     */
    public void setCmlNo(String cmlNo) {
        this.cmlNo = cmlNo;
    }

    /**
     * Getter method for rt.
     *
     * @return the rt
     */
    public String getRt() {
        return rt;
    }

    /**
     * Setter method for rt.
     *
     * @param rt Set for rt
     */
    public void setRt(String rt) {
        this.rt = rt;
    }

    /**
     * Getter method for mixTag.
     *
     * @return the mixTag
     */
    public String getMixTag() {
        return mixTag;
    }

    /**
     * Setter method for mixTag.
     *
     * @param mixTag Set for mixTag
     */
    public void setMixTag(String mixTag) {
        this.mixTag = mixTag;
    }

    /**
     * Getter method for description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param description Set for description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for custItemNoOrModItemNo.
     *
     * @return the custItemNoOrModItemNo
     */
    public String getCustItemNoOrModItemNo() {
        return custItemNoOrModItemNo;
    }

    /**
     * Setter method for custItemNoOrModItemNo.
     *
     * @param custItemNoOrModItemNo Set for custItemNoOrModItemNo
     */
    public void setCustItemNoOrModItemNo(String custItemNoOrModItemNo) {
        this.custItemNoOrModItemNo = custItemNoOrModItemNo;
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
     * Getter method for qty.
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * Setter method for qty.
     *
     * @param qty Set for qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * Getter method for pkg.
     *
     * @return the pkg
     */
    public String getPkg() {
        return pkg;
    }

    /**
     * Setter method for pkg.
     *
     * @param pkg Set for pkg
     */
    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    /**
     * Getter method for remarks.
     *
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Setter method for remarks.
     *
     * @param remarks Set for remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
