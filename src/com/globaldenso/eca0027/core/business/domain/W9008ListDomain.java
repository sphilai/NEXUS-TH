/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of list in Export Ship to Shipping MA Edit screen.
 * <br />Export Ship to Shipping MA Edit画面のリストドメインです。
 *
 * @version $Revision: 7765 $
 */
public class W9008ListDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     *CML Type
     */
    private String cmlTyp;

    /**
     *Inv Category
     */
    private String invoiceCtgry;

    /**
     *Class of Invoice
     */
    private String invoiceClass;

    /**
     * Invoice Class Name
     */
    private String invoiceClassNm;

    /**
     *Inv Template
     */
    private String docNo;

    /**
     *Free1
     */
    private String free1DispFlg;

    /**
     *Free2
     */
    private String free2DispFlg;

    /**
     *Free3
     */
    private String free3DispFlg;

    /**
     *HS CODE
     */
    private String hsCdDispFlg;

    /**
     * LAST UPDATE DATE (specification)<br />
     *最終更新日時(明細)
     */
    private Timestamp comUpdateTimestamp;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9008ListDomain() {
    }

    /**
     * Getter method for cmlTyp.
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * Setter method for cmlTyp.
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * Getter method for invoiceCtgry.
     *
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * Setter method for invoiceCtgry.
     *
     * @param invoiceCtgry Set for invoiceCtgry
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * Getter method for invoiceClass.
     *
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * Setter method for invoiceClass.
     *
     * @param invoiceClass Set for invoiceClass
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
    }

    /**
     * Getter method for invoiceClassNm.
     *
     * @return the invoiceClassNm
     */
    public String getInvoiceClassNm() {
        return invoiceClassNm;
    }

    /**
     * Setter method for invoiceClassNm.
     *
     * @param invoiceClassNm Set for invoiceClassNm
     */
    public void setInvoiceClassNm(String invoiceClassNm) {
        this.invoiceClassNm = invoiceClassNm;
    }

    /**
     * Getter method for docNo.
     *
     * @return the docNo
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Setter method for docNo.
     *
     * @param docNo Set for docNo
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /**
     * Getter method for free1DispFlg.
     *
     * @return the free1DispFlg
     */
    public String getFree1DispFlg() {
        return free1DispFlg;
    }

    /**
     * Setter method for free1DispFlg.
     *
     * @param free1DispFlg Set for free1DispFlg
     */
    public void setFree1DispFlg(String free1DispFlg) {
        this.free1DispFlg = free1DispFlg;
    }

    /**
     * Getter method for free2DispFlg.
     *
     * @return the free2DispFlg
     */
    public String getFree2DispFlg() {
        return free2DispFlg;
    }

    /**
     * Setter method for free2DispFlg.
     *
     * @param free2DispFlg Set for free2DispFlg
     */
    public void setFree2DispFlg(String free2DispFlg) {
        this.free2DispFlg = free2DispFlg;
    }

    /**
     * Getter method for free3DispFlg.
     *
     * @return the free3DispFlg
     */
    public String getFree3DispFlg() {
        return free3DispFlg;
    }

    /**
     * Setter method for free3DispFlg.
     *
     * @param free3DispFlg Set for free3DispFlg
     */
    public void setFree3DispFlg(String free3DispFlg) {
        this.free3DispFlg = free3DispFlg;
    }

    /**
     * Getter method for hsCdDispFlg.
     *
     * @return the hsCdDispFlg
     */
    public String getHsCdDispFlg() {
        return hsCdDispFlg;
    }

    /**
     * Setter method for hsCdDispFlg.
     *
     * @param hsCdDispFlg Set for hsCdDispFlg
     */
    public void setHsCdDispFlg(String hsCdDispFlg) {
        this.hsCdDispFlg = hsCdDispFlg;
    }

    /**
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }
}
