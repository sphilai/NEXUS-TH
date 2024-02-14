/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of form [L2001] that output for domain form (specification).
 * <br/>帳票【L2001】の帳票出力用ドメイン（明細）です。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 14083 $
 */
public class L2001ReportDetailDomain extends AbstractDomain {
    /**
     * Serial Version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SEQUENCE NO
     * <br />連番
     */ 
    private int no = 0;
    
    /**
     * WAREHOUSE STOCK LOCATION
     * <br />倉庫保管場所
     */ 
    private String locatNo = null;
    
    /**
     * CUSTOMER ITEM NO
     * <br />得意先品目番号
     */ 
    private String customerPno = null;
    
    /**
     * ITEM NO
     * <br />品目番号
     */ 
    private String pno = null;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */ 
    private String pkgCd = null;
    
    /**
     * ITEM DESCRIPTION
     * <br />品目名称
     */ 
    private String description = null;
    
    /**
     * INSTRUCTION QUANTITY
     * <br />梱包指示数量
     */ 
    private BigDecimal instrActQty = null;
    
    /**
     * BOX LOT QUANTITY
     * <br />小箱ロット数量
     */ 
    private BigDecimal qtyBox = null;
    
    /**
     * BOX QUANTITY
     * <br />箱数
     */ 
    private String box = null;

    /**
     * TOTAL NET WEIGHT
     * <br />ネット総重量
     */ 
    private String nw = null;
    
    /**
     * REMARKS column
     * <br />備考欄
     */
    private String remarks = null;
    
    /**
     * Check column
     * <br />チェック欄
     */
    private String check = null;
    
    /**
     * Package Type
     * <br />梱包形態区分
     */
    private String pkf = null;
    
    /**
     * Customer P/O No.
     * <br />得意先P/O No.
     */
    private String poNo = null;
    
    /**
     * ETD due date
     * <br />船積期限
     */
    private String dueDate = null;
    
    /**
     * Alloc QTY
     * <br />引当数量
     */
    private String allocate = null;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public L2001ReportDetailDomain() {
    }

    /**
     * Getter method for no.
     * <br />no のゲッターメソッドです。
     *
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * Setter method for no.
     *
     * @param no Set for no.
     */
    public void setNo(int no) {
        this.no = no;
    }

    /**
     * Getter method for locatNo.
     *
     * @return the locatNo
     */
    public String getLocatNo() {
        return locatNo;
    }

    /**
     * Setter method for locatNo.
     *
     * @param locatNo Set for locatNo.
     */
    public void setLocatNo(String locatNo) {
        this.locatNo = locatNo;
    }

    /**
     * Getter method for customerPno.
     *
     * @return the customerPno
     */
    public String getCustomerPno() {
        return customerPno;
    }

    /**
     * Setter method for customerPno.
     *
     * @param customerPno Set for customerPno.
     */
    public void setCustomerPno(String customerPno) {
        this.customerPno = customerPno;
    }

    /**
     * Getter method for pno .
     *
     * @return the pno
     */
    public String getPno() {
        return pno;
    }

    /**
     * Setter method for pno.
     *
     * @param pno Set for pno.
     */
    public void setPno(String pno) {
        this.pno = pno;
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
     * @param pkgCd Set for pkgCd.
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
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
     * @param description Set for description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for instrActQty.
     *
     * @return the instrActQty
     */
    public BigDecimal getInstrActQty() {
        return instrActQty;
    }

    /**
     * Setter method for instrActQty.
     *
     * @param instrActQty Set for instrActQty.
     */
    public void setInstrActQty(BigDecimal instrActQty) {
        this.instrActQty = instrActQty;
    }

    /**
     * Getter method for qtyBox.
     *
     * @return the qtyBox
     */
    public BigDecimal getQtyBox() {
        return qtyBox;
    }

    /**
     * Setter method for qtyBox.
     *
     * @param qtyBox Set for qtyBox.
     */
    public void setQtyBox(BigDecimal qtyBox) {
        this.qtyBox = qtyBox;
    }

    /**
     * Getter method for nw.
     *
     * @return the nw
     */
    public String getNw() {
        return nw;
    }

    /**
     * Setter method for nw.
     *
     * @param nw Set for nw.
     */
    public void setNw(String nw) {
        this.nw = nw;
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
     * @param remarks Set for remarks.
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * Getter method for check .
     *
     * @return the check
     */
    public String getCheck() {
        return check;
    }

    /**
     * Setter method for check.
     *
     * @param check Set for check .
     */
    public void setCheck(String check) {
        this.check = check;
    }

    /**
     * Getter method for box.
     *
     * @return the box
     */
    public String getBox() {
        return box;
    }

    /**
     * Setter method for box.
     *
     * @param box Set for box.
     */
    public void setBox(String box) {
        this.box = box;
    }

    /**
     * <p>pkf のゲッターメソッドです。</p>
     *
     * @return the pkf
     */
    public String getPkf() {
        return pkf;
    }

    /**
     * <p>pkf のセッターメソッドです。</p>
     *
     * @param pkf pkf に設定する
     */
    public void setPkf(String pkf) {
        this.pkf = pkf;
    }

    /**
     * <p>poNo のゲッターメソッドです。</p>
     *
     * @return the poNo
     */
    public String getPoNo() {
        return poNo;
    }

    /**
     * <p>poNo のセッターメソッドです。</p>
     *
     * @param poNo poNo に設定する
     */
    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    /**
     * <p>dueDate のゲッターメソッドです。</p>
     *
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * <p>dueDate のセッターメソッドです。</p>
     *
     * @param dueDate dueDate に設定する
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * <p>allocate のゲッターメソッドです。</p>
     *
     * @return the allocate
     */
    public String getAllocate() {
        return allocate;
    }

    /**
     * <p>allocate のセッターメソッドです。</p>
     *
     * @param allocate allocate に設定する
     */
    public void setAllocate(String allocate) {
        this.allocate = allocate;
    }
    
}
