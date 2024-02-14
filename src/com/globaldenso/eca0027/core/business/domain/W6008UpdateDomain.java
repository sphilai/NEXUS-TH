/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * Update of domain Invoice Detail (Full Returnable) screen.<br />
 * Invoice Detail(Full Returnable)画面の更新ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6008UpdateDomain extends AbstractDomain {
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * W6008 Criteria Domain<br />
     * W6008 検索条件ドメイン
     */
    private W6008CriteriaDomain criteriaDomain;
    
    /**
     * W6008 List Domain<br />
     * W6008 検索結果リスト
     */
    private List<? extends W6008ListDomain> listDomainList;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6008UpdateDomain() {
    }
    
    /**
     * Getter method for criteriaDomain.<br />
     * criteriaDomain のゲッターメソッドです。
     *
     * @return the criteriaDomain
     */
    public W6008CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.<br />
     * criteriaDomain のセッターメソッドです。
     *
     * @param criteriaDomain Set for criteriaDomain<br />criteriaDomain に設定する
     */
    public void setCriteriaDomain(W6008CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.<br />
     * listDomainList のゲッターメソッドです。
     *
     * @return the listDomainList
     */
    public List<? extends W6008ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.<br />
     * listDomainList のセッターメソッドです。
     *
     * @param listDomainList Set for listDomainList<br /> listDomainListに設定する
     */
    public void setListDomainList(List<? extends W6008ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for serialVersionUID.<br />
     * serialVersionUID のゲッターメソッドです。
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    

}
