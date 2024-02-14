/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of form [L2002] that output for domain form (specification).
 * <br />帳票【L2002】の帳票出力用ドメイン（明細）です。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L2002ReportDetailDomain extends AbstractDomain {

    /**
     * Serial Version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = -2292621296700127486L;
    
    /**
     * Item No.1
     */
    private String pno1 = null;
    
    /**
     * Item No.2
     */
    private String pno2 = null;
    
    /**
     * Item No.3
     */
    private String pno3 = null;
    
    /**
     * Item No.4
     */
    private String pno4 = null;
    
    /**
     * PKG CD1
     */  
    private String pkgCd1 = null;
    
    /**
     * PKG CD2
     */  
    private String pkgCd2 = null;
    
    /**
     * PKG CD3
     */  
    private String pkgCd3 = null;
    
    /**
     * PKG CD4
     */  
    private String pkgCd4 = null;
    
    /**
     * QTY1
     */
    private String qty1 = null;
    
    /**
     * QTY2
     */
    private String qty2 = null;
    
    /**
     * QTY3
     */
    private String qty3 = null;
    
    /**
     * QTY4
     */
    private String qty4 = null;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public L2002ReportDetailDomain() {
    }

    /**
     * Getter method for pno1.
     * 
     * @return the pno1
     */
    public String getPno1() {
        return pno1;
    }

    /**
     * Setter method for pno1.
     *
     * @param pno1 Set for pno1.
     */
    public void setPno1(String pno1) {
        this.pno1 = pno1;
    }


    /**
     * Getter method for pno2.
     *
     * @return the pno2
     */
    public String getPno2() {
        return pno2;
    }


    /**
     * Setter method for pno2.
     *
     * @param pno2 Set for pno2.
     */
    public void setPno2(String pno2) {
        this.pno2 = pno2;
    }


    /**
     * Getter method for pno3.
     *
     * @return the pno3
     */
    public String getPno3() {
        return pno3;
    }


    /**
     * Setter method for pno3.
     *
     * @param pno3 Set for pno3.
     */
    public void setPno3(String pno3) {
        this.pno3 = pno3;
    }


    /**
     * Getter method for pno4.
     *
     * @return the pno4
     */
    public String getPno4() {
        return pno4;
    }


    /**
     * Setter method for pno4.
     *
     * @param pno4 Set for pno4.
     */
    public void setPno4(String pno4) {
        this.pno4 = pno4;
    }


    /**
     * Getter method for pkgCd1.
     *
     * @return the pkgCd1
     */
    public String getPkgCd1() {
        return pkgCd1;
    }


    /**
     * Setter method for pkgCd1.
     *
     * @param pkgCd1 Set for pkgCd1.
     */
    public void setPkgCd1(String pkgCd1) {
        this.pkgCd1 = pkgCd1;
    }


    /**
     * Getter method for pkgCd2.
     *
     * @return the pkgCd2
     */
    public String getPkgCd2() {
        return pkgCd2;
    }


    /**
     * Setter method for pkgCd2.
     *
     * @param pkgCd2 Set for pkgCd2.
     */
    public void setPkgCd2(String pkgCd2) {
        this.pkgCd2 = pkgCd2;
    }


    /**
     * Getter method for pkgCd3.
     *
     * @return the pkgCd3
     */
    public String getPkgCd3() {
        return pkgCd3;
    }


    /**
     * Setter method for pkgCd3.
     *
     * @param pkgCd3 Set for pkgCd3.
     */
    public void setPkgCd3(String pkgCd3) {
        this.pkgCd3 = pkgCd3;
    }


    /**
     * Getter method for pkgCd4.
     *
     * @return the pkgCd4
     */
    public String getPkgCd4() {
        return pkgCd4;
    }


    /**
     * Setter method for pkgCd4.
     *
     * @param pkgCd4 Set for pkgCd4.
     */
    public void setPkgCd4(String pkgCd4) {
        this.pkgCd4 = pkgCd4;
    }


    /**
     * Getter method for qty1.
     *
     * @return the qty1
     */
    public String getQty1() {
        return qty1;
    }


    /**
     * Setter method for qty1.
     *
     * @param qty1 Set for qty1.
     */
    public void setQty1(String qty1) {
        this.qty1 = qty1;
    }


    /**
     * Getter method for qty2.
     *
     * @return the qty2
     */
    public String getQty2() {
        return qty2;
    }


    /**
     * Setter method for qty2.
     *
     * @param qty2 Set for qty2.
     */
    public void setQty2(String qty2) {
        this.qty2 = qty2;
    }


    /**
     * Getter method for qty3.
     *
     * @return the qty3
     */
    public String getQty3() {
        return qty3;
    }


    /**
     * Setter method for qty3.
     *
     * @param qty3 Set for qty3.
     */
    public void setQty3(String qty3) {
        this.qty3 = qty3;
    }


    /**
     * Getter method for qty4.
     *
     * @return the qty4
     */
    public String getQty4() {
        return qty4;
    }


    /**
     * Setter method for qty4.
     *
     * @param qty4 Set for qty4.
     */
    public void setQty4(String qty4) {
        this.qty4 = qty4;
    }

}
