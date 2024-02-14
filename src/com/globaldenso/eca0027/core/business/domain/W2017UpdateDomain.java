/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the detail information of X-Tag Register
 * <br />X-Tag Register画面の明細情報を保持するドメインクラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6761 $
 */
public class W2017UpdateDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /** criteria */
    private W2017CriteriaDomain criteriaDomain;

    /** detail list */
    private List<? extends W2017ListDomain> listDomainList;

    /** w2016 detail list */
    private List<? extends W2016ListDomain> w2016ListDomainList;

    /** delete flg */
    private String deleteFlg;

    /**
     * constructor.
     */
    public W2017UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W2017CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W2017CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2017ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2017ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for w2016ListDomainList.
     *
     * @return the w2016ListDomainList
     */
    public List<? extends W2016ListDomain> getW2016ListDomainList() {
        return w2016ListDomainList;
    }

    /**
     * Setter method for w2016ListDomainList.
     *
     * @param w2016ListDomainList Set for w2016ListDomainList
     */
    public void setW2016ListDomainList(
        List<? extends W2016ListDomain> w2016ListDomainList) {
        this.w2016ListDomainList = w2016ListDomainList;
    }

    /**
     * Getter method for deleteFlg.
     *
     * @return the deleteFlg
     */
    public String getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * Setter method for deleteFlg.
     *
     * @param deleteFlg Set for deleteFlg
     */
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}
