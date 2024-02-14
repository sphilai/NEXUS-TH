/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The Criteria domain for acquiring the result of SearchTmCustomerQrPatternHdrByDtl.
 * <br />SearchTmCustomerQrPatternHdrByDtlの結果を取得するためのCriteriaドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMPANY CODE
     * <br />会社コード
     */
    private String compCd;

    /**
     * COLLATE METHOD TYPE
     * <br />照合方式区分
     */
    private String collateMethTyp;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501TmCustomerQrPatternHdrByDtlCriteriaDomain() {
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
     * Getter method for collateMethTyp.
     *
     * @return the collateMethTyp
     */
    public String getCollateMethTyp() {
        return collateMethTyp;
    }

    /**
     * Setter method for collateMethTyp.
     *
     * @param collateMethTyp Set for collateMethTyp
     */
    public void setCollateMethTyp(String collateMethTyp) {
        this.collateMethTyp = collateMethTyp;
    }
}
