/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria and detail information of X-tag Create Screen
 * <br />X-tag Create画面の一括更新ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2016UpdateDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /** criteria */
    private W2016CriteriaDomain criteriaDomain;

    /** detail list */
    private List<? extends W2016ListDomain> listDomainList;

    /**
     * constructor.
     */
    public W2016UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain
     *
     * @return the criteriaDomain
     */
    public W2016CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W2016CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2016ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2016ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }


}
