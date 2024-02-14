/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of mass update for the Update Screen of B/L.
 * <br />B/Lアップロード画面の一括更新ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W7007UpdateDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search conditions domain of B / L upload screen<br />
     * B/Lアップロード画面の検索条件ドメイン
     */
    private W7007CriteriaDomain criteriaDomain;
    
    /**
     * List of domain of B / L upload screen<br />
     * B/Lアップロード画面のListドメインのリスト
     */
    private List<? extends W7007ListDomain> listDomainList;
    
    /**
     * update count
     */
    private int updateCount;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7007UpdateDomain() {
        super();
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W7007CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W7007CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W7007ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W7007ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for updateCount.
     *
     * @return the updateCount
     */
    public int getUpdateCount() {
        return updateCount;
    }

    /**
     * Setter method for updateCount.
     *
     * @param updateCount Set for updateCount
     */
    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }
}
