/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The parameter domain of ECA0027_WS_2501.
 * <br />ECA0027_WS_2501のパラメータドメインです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class Ws2501PkgItemNoDomain extends AbstractDomain {

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
    private BigDecimal pkgQty;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2501PkgItemNoDomain() {
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
    public BigDecimal getPkgQty() {
        return pkgQty;
    }

    /**
     * Setter method for pkgQty.
     *
     * @param pkgQty Set for pkgQty
     */
    public void setPkgQty(BigDecimal pkgQty) {
        this.pkgQty = pkgQty;
    }
}