/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * It is a mass update domain class of shipment confirmation Register screen
 * <br />出荷確認Register画面の一括更新ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5004UpdateDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Criteria Domain.
     */
    private W5004CriteriaDomain criteriaDomain;

    /**
     * Search result list of X-Tag/CML
     */
    private List<? extends W5004ListDomain> listDomainList;

    /**
     * constructor.
     */
    public W5004UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W5004CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W5004CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W5004ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W5004ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
}
