/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The PL layer domain class that holds the criteria information of NEXUS Ship to MA Inquiry Sub Screen.
 * <br/>NEXUS Ship to MA Inquiry画面の検索条件を保持するPL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9006CriteriaDomain extends AbstractDomain {

    /**
     * serialVersionUID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIP TO CODE/送荷先コード
     */
    private String shipToCd;

    /**
     * SHIP TO NAME/送荷先名称
     */
    private String shipToNm;

    /**
     * SHIP TO NAME ABBREVIATION/送荷先略称
     */
    private String shipToNmAbb;

    /**
     * COMPANY CODE/会社コード  comp cd of ship to
     */
    private String nxsShipToCompany;

    /**
     * COMPANY NAME/会社名称
     */
    private String compNm;

    /**
     * PageInfoCreator object/PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Default constructor.
     */
    public W9006CriteriaDomain() {
    }

    /**
     * <p>Getter method for shipToCd.</p>
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * <p>Setter method for shipToCd.</p>
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }
    
    /**
     * <p>Getter method for shipToNm.</p>
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * <p>Setter method for shipToNm.</p>
     * @param shipToNm Set for shipToNm
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
    }

    /**
     * <p>Getter method for shipToNmAbb.</p>
     * @return the shipToNmAbb
     */
    public String getShipToNmAbb() {
        return shipToNmAbb;
    }

    /**
     * <p>Setter method for shipToNmAbb.</p>
     * @param shipToNmAbb Set for shipToNmAbb
     */
    public void setShipToNmAbb(String shipToNmAbb) {
        this.shipToNmAbb = shipToNmAbb;
    }

    /**
     * <p>Getter method for nxsShipToCompany.</p>
     * @return the nxsShipToCompany
     */
    public String getNxsShipToCompany() {
        return nxsShipToCompany;
    }

    /**
     * <p>Setter method for nxsShipToCompany.</p>
     * @param nxsShipToCompany Set for nxsShipToCompany
     */
    public void setNxsShipToCompany(String nxsShipToCompany) {
        this.nxsShipToCompany = nxsShipToCompany;
    }

    /**
     * <p>Getter method for CompNm.</p>
     * @return the CompNm
     */
    public String getcompNm() {
        return compNm;
    }

    /**
     * <p>Setter method for CompNm.</p>
     *
     * @param compNm Set for compNm
     */
    public void setcompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * <p>Getter method for compNm.</p>
     *
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * <p>Setter method for compNm.</p>
     *
     * @param compNm Set for compNm
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
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