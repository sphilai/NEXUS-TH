/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The PL layer domain class that holds the criteria information of Outer Package Search Sub Screen.
 * <br/>外装選択子画面の検索条件を保持するPL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10090 $
 */
public class Wt006CriteriaDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * OWNER COMPANY/責任会社
     */
    private String ownerComp;

    /**
     * OWNER COMPANY CSV/責任会社リスト カンマ区切り
     */
    private String ownerCompCsv;
    
    /**
     * OUTER PKG CODE/外装記号
     */
    private String outerPkgCd;

    /**
     * PACKAGE ITEM NO/包装材品目番号
     */
    private String pkgItemNo;

    /**
     * PageInfoCreator object.
     */
    private transient PageInfoCreator pageInfoCreator;

    /**
     * Default constructor.
     */
    public Wt006CriteriaDomain() {
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
     * <p>Getter method for ownerCompCsv.</p>
     *
     * @return the ownerCompCsv
     */
    public String getOwnerCompCsv() {
        return ownerCompCsv;
    }

    /**
     * <p>Setter method for ownerCompCsv.</p>
     *
     * @param ownerCompCsv Set for ownerCompCsv
     */
    public void setOwnerCompCsv(String ownerCompCsv) {
        this.ownerCompCsv = ownerCompCsv;
    }

    /**
     * <p>Getter method for outerPkgCd.</p>
     *
     * @return the outerPkgCd
     */
    public String getOuterPkgCd() {
        return outerPkgCd;
    }

    /**
     * <p>Setter method for outerPkgCd.</p>
     *
     * @param outerPkgCd Set for outerPkgCd
     */
    public void setOuterPkgCd(String outerPkgCd) {
        this.outerPkgCd = outerPkgCd;
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
     * <p>Getter method for pageInfoCreator.</p>
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * <p>Setter method for pageInfoCreator.</p>
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

}
