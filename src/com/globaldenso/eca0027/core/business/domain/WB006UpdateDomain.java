/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a Update domain of the Last Digit Change Main Screen.
 * <br />品番末尾変更メイン画面のUpdateドメインです。
 *
 * @version $Revision: 5759 $
 */
public class WB006UpdateDomain extends AbstractDomain {

    /**
     * serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private WB006CriteriaDomain criteriaDomain;
    
    /**
     * Search results List
     * <br />検索結果List
     */
    private List<? extends WB006ListDomain> listDomainList;

    /**
     * The line selected in search-results area
     * <br />検索結果エリアで選択された行
     */
    private String selectedIndex;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public WB006UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public WB006CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(WB006CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends WB006ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends WB006ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter method for selectedIndex.
     *
     * @return the selectedIndex
     */
    public String getSelectedIndex() {
        return selectedIndex;
    }

    /**
     * Setter method for selectedIndex.
     *
     * @param selectedIndex Set for selectedIndex
     */
    public void setSelectedIndex(String selectedIndex) {
        this.selectedIndex = selectedIndex;
    }
}
