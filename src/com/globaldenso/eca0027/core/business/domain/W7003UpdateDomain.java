/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of update for the Create Screen of Shipping Actuality.
 * <br />船積実績Create画面の一括更新ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7003UpdateDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search conditions domain of Vessel product performance Create screen<br />
     * 船積実績Create画面の検索条件ドメイン
     */
    private W7003CriteriaDomain criteriaDomain;
    
    /**
     * List of domain Vessel product performance Create screen<br />
     * 船積実績Create画面のListドメインのリスト
     */
    private List<? extends W7003ListDomain> listDomainList;
    
    /**
     * Specification selected line of Vessel product performance Create screen<br />
     * 船積実績Create画面の選択している明細行
     */
    private List<? extends W7003ListDomain> selectedList;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7003UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W7003CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W7003CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W7003ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W7003ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for selectedList.
     *
     * @return the selectedList
     */
    public List<? extends W7003ListDomain> getSelectedList() {
        return selectedList;
    }

    /**
     * Setter method for selectedList.
     *
     * @param selectedList Set for selectedList
     */
    public void setSelectedList(List<? extends W7003ListDomain> selectedList) {
        this.selectedList = selectedList;
    }
}
