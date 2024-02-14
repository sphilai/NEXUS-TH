/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The BL layer domain class that holds the criteria information of Package Search Sub Screen.
 * <br/>包装材選択子画面の検索条件を保持するBL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt004PkgSelectCriteriaDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * OWNER COMPANY/責任会社
     */
    private String ownerComp;
    
    /**
     * RT TYPE/再使用区分
     */
    private String rtTyp;
    
    /**
     * PACKAGE ITEM NO/包装材品目番号
     */
    private String pkgItemNo;

    /**
     * MODEL CODE/型式コード
     */
    private String modelCd;

    /**
     * LANGUAGE CODE(DEFAULT)/言語コード(デフォルト)
     */
    private String lngCdDefault;
    
    /**
     * Default constructor.
     */
    public Wt004PkgSelectCriteriaDomain() {
    }

    /**
     * <p>Getter method for ownerComp.</p>
     *
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * <p>Setter method for ownerComp.</p>
     *
     * @param ownerComp Set for ownerComp
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * <p>Getter method for rtTyp.</p>
     *
     * @return the rtTyp
     */
    public String getRtTyp() {
        return rtTyp;
    }

    /**
     * <p>Setter method for rtTyp.</p>
     *
     * @param rtTyp Set for rtTyp
     */
    public void setRtTyp(String rtTyp) {
        this.rtTyp = rtTyp;
    }

    /**
     * <p>Getter method for pkgItemNo.</p>
     *
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * <p>Setter method for pkgItemNo.</p>
     *
     * @param pkgItemNo Set for pkgItemNo
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * <p>Getter method for modelCd.</p>
     *
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }

    /**
     * <p>Setter method for modelCd.</p>
     *
     * @param modelCd Set for modelCd
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }

    /**
     * <p>Getter method for lngCdDefault.</p>
     *
     * @return the lngCdDefault
     */
    public String getLngCdDefault() {
        return lngCdDefault;
    }

    /**
     * <p>Setter method for lngCdDefault.</p>
     *
     * @param lngCdDefault Set for lngCdDefault
     */
    public void setLngCdDefault(String lngCdDefault) {
        this.lngCdDefault = lngCdDefault;
    }

}
