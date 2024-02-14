/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of Update Export Formalities by Item MA Inquiry screen.
 * <br />Export Formalities by Item MA Inquiry画面のUpdateドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9018UpdateDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     */
    private W9018CriteriaDomain criteriaDomain;
    
    /**
     * List of list domain<br />
     * Listドメインのリスト
     */
    private List<? extends W9018ListDomain> listDomainList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9018UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W9018CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W9018CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W9018ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W9018ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

}
