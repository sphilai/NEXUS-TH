/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W9006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9006ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of NEXUS Ship to MA Inquiry Screen. <br />
 * NEXUS Ship to MA Inquiry画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9006ActionForm extends AbstractActionForm {

    /**
     * Serial version./シリアルバージョン
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
     * w9006ListDomainList/検索結果ドメインのリスト (画面表示用)
     */
    private List<W9006ListDomain> w9006ListDomainList;

    /**
     * <p>
     * Domain for search criteria/検索条件ドメイン
     * </p>
     */
    private W9006CriteriaDomain w9006CriteriaDomain;

    /**
     * Default constructor.
     */
    public W9006ActionForm() {
        // number of lines to be displayed on one page
        // 1ページの表示行数
        super.setCountPerPage(PAGE_MAX_COUNT);
    }

    /**
     * <p>Getter method for shipToCd.</p>
     *
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
     *
     * @return the shipToNm
     */
    public String getShipToNm() {
        return shipToNm;
    }

    /**
     * <p>Setter method for shipToNm.</p>
     *
     * @param shipToNm Set for shipToNm
     */
    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
    }

    /**
     * <p>Getter method for shipToNmAbb.</p>
     *
     * @return the shipToNmAbb
     */
    public String getShipToNmAbb() {
        return shipToNmAbb;
    }

    /**
     * <p>Setter method for shipToNmAbb.</p>
     *
     * @param shipToNmAbb Set for shipToNmAbb
     */
    public void setShipToNmAbb(String shipToNmAbb) {
        this.shipToNmAbb = shipToNmAbb;
    }

    /**
     * <p>Getter method for nxsShipToCompany.</p>
     *
     * @return the nxsShipToCompany
     */
    public String getNxsShipToCompany() {
        return nxsShipToCompany;
    }

    /**
     * <p>Setter method for nxsShipToCompany.</p>
     *
     * @param nxsShipToCompany Set for nxsShipToCompany
     */
    public void setNxsShipToCompany(String nxsShipToCompany) {
        this.nxsShipToCompany = nxsShipToCompany;
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
     * <p>Getter method for w9006ListDomainList.</p>
     *
     * @return the w9006ListDomainList
     */
    public List<W9006ListDomain> getW9006ListDomainList() {
        return w9006ListDomainList;
    }

    /**
     * <p>Setter method for w9006ListDomainList.</p>
     *
     * @param listDomainList Set for w9006ListDomainList
     */
    public void setW9006ListDomainList(List<W9006ListDomain> listDomainList) {
        w9006ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @param index array index no
     * @return the listDomainList
     */
    @SuppressWarnings("unchecked")
    public W9006ListDomain getW9006ListDomain(int index) {
        if (w9006ListDomainList == null) {
            w9006ListDomainList = new ArrayList<W9006ListDomain>();
        }
        for (int i = w9006ListDomainList.size(); i <= index; i++ ) {
            ((List<W9006ListDomain>)w9006ListDomainList).add(new W9006ListDomain());
        }
        return w9006ListDomainList.get(index);
    }
    
    /**
     * <p>Getter method for w9006CriteriaDomain.</p>
     *
     * @return the w9006CriteriaDomain
     */
    public W9006CriteriaDomain getW9006CriteriaDomain() {
        if (w9006CriteriaDomain == null) {
            w9006CriteriaDomain = new W9006CriteriaDomain();
        }
        return w9006CriteriaDomain;
    }

    /**
     * <p>Setter method for w9006CriteriaDomain.</p>
     *
     * @param criteriaDomain Set for w9006CriteriaDomain
     */
    public void setW9006CriteriaDomain(W9006CriteriaDomain criteriaDomain) {
        w9006CriteriaDomain = criteriaDomain;
    }

}
