/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the detail information of CIGMA W/H X-Reference MA Edit
 * Screen List section.
 * CIGMA W/H X-Reference MA Edit画面のリストドメインです。
 *
 * @version $Revision: 5759 $
 */
public class W9015ListDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * select radio button/選択されたラジオボタン
     */
    private String ck;

    /**
     * LEGACY LIBRARY COMPANY CODE/(LEGACYライブラリ)会社コード
     */
    private String lgcyLibCompCd;

    /**
     * LEGACY WAREHOUSE CODE/LEGACY倉庫コード
     */
    private String lgcyWhCd;

    /**
     * PLANT CODE/製造部工場区分
     */
    private String plntCd;

    /**
     * COMPANY CODE/会社コード comp cd of wh
     */
    private String compCd;

    /**
     * WAREHOUSE CODE/NEXUS倉庫コード
     */
    private String whCd;

    /**
     * Default constructor./デフォルトコンストラクタ
     */
    public W9015ListDomain() {
    }

    /**
     * <p>Getter method for ck.</p>
     *
     * @return the ck
     */
    public String getCk() {
        return ck;
    }

    /**
     * <p>Setter method for ck.</p>
     *
     * @param ck Set for ck
     */
    public void setCk(String ck) {
        this.ck = ck;
    }

    /**
     * <p>Getter method for lgcyLibCompCd.</p>
     *
     * @return the lgcyLibCompCd
     */
    public String getLgcyLibCompCd() {
        return lgcyLibCompCd;
    }

    /**
     * <p>Setter method for lgcyLibCompCd.</p>
     *
     * @param lgcyLibCompCd Set for lgcyLibCompCd
     */
    public void setLgcyLibCompCd(String lgcyLibCompCd) {
        this.lgcyLibCompCd = lgcyLibCompCd;
    }

    /**
     * <p>Getter method for lgcyWhCd.</p>
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * <p>Setter method for lgcyWhCd.</p>
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * <p>Getter method for plntCd.</p>
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * <p>Setter method for plntCd.</p>
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * <p>Getter method for compCd.</p>
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * <p>Setter method for compCd.</p>
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * <p>Getter method for whCd.</p>
     *
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * <p>Setter method for whCd.</p>
     *
     * @param whCd Set for whCd
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

}
