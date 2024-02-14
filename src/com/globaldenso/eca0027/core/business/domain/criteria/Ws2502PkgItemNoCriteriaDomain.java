/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import javax.xml.bind.annotation.XmlRootElement;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The parameter domain of ECA0027_WS_2502.
 * <br />ECA0027_WS_2502のパラメータドメインです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
@XmlRootElement(name = "ws2502PkgItemNoCriteria")
public class Ws2502PkgItemNoCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * PACKAGE ITEM NO
     * <br />包装材品目番号
     */
    private String pkgItemNo;
    
    /**
     * PACKAGE QUANTITY
     * <br />数量
     */
    private String pkgQty;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2502PkgItemNoCriteriaDomain() {
    }

    /**
     * Getter method for pkgItemNo.
     *
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * Setter method for pkgItemNo.
     *
     * @param pkgItemNo Set for pkgItemNo
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * Getter method for pkgQty.
     *
     * @return the pkgQty
     */
    public String getPkgQty() {
        return pkgQty;
    }

    /**
     * Setter method for pkgQty.
     *
     * @param pkgQty Set for pkgQty
     */
    public void setPkgQty(String pkgQty) {
        this.pkgQty = pkgQty;
    }
}
