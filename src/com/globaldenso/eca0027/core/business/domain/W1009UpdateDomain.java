/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of Export Ship to Shipping MA Edit screen.
 * <br />Export Ship to Shipping MA Edit画面のドメインです。
 *
 * @version $Revision: 7765 $
 */
public class W1009UpdateDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     */
    private W1009CriteriaDomain criteriaDomain;
    
    /**
     * The List domain of a Export Request screen
     * <br />梱包指示Register画面のListドメイン
     */
    private List<? extends W1009ListDomain> listDomainList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1009UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W1009CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W1009CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W1009ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W1009ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    

}
