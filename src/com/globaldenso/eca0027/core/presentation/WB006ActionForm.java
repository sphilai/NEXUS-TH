/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB006ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form of a Last Digit Change Main Screen
 * <br />品番末尾変更メイン画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB006ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private WB006CriteriaDomain wb006CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends WB006ListDomain> wb006ListDomainList; 
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * The line selected in search-results area
     * <br />検索結果エリアで選択された行
     */
    private String selectedIndex;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public WB006ActionForm() {
        wb006CriteriaDomain = new WB006CriteriaDomain();
    }

    /**
     * Getter method for wb006CriteriaDomain.
     *
     * @return the wb006CriteriaDomain
     */
    public WB006CriteriaDomain getWb006CriteriaDomain() {
        return wb006CriteriaDomain;
    }

    /**
     * Setter method for wb006CriteriaDomain.
     *
     * @param wb006CriteriaDomain Set for wb006CriteriaDomain
     */
    public void setWb006CriteriaDomain(WB006CriteriaDomain wb006CriteriaDomain) {
        this.wb006CriteriaDomain = wb006CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends WB006ListDomain> getWb006ListDomainList() {
        return wb006ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setWb006ListDomainList(List<? extends WB006ListDomain> listDomainList) {
        this.wb006ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List Domain<br />Listドメイン
     */
    public WB006ListDomain getWb006ListDomainList(int index) {
        if (wb006ListDomainList == null) {
            wb006ListDomainList = new ArrayList<WB006ListDomain>();
        }

        for (int i = wb006ListDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new WB006ListDomain());
        }

        return wb006ListDomainList.get(index);
    }

    /**
     * Setter method for listDomainList
     * <br />ListドメインリストのSetterです。
     * 
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setWb006ListDomainList(int index, WB006ListDomain listDomain) {
        if (wb006ListDomainList == null) {
            wb006ListDomainList = new ArrayList<WB006ListDomain>();
        }

        for (int i = wb006ListDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W2008ListDomain());
        }

        listDomainList().add(listDomain);
    }

    /**
     * Getter method for displayList.
     *
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * Setter method for displayList.
     *
     * @param displayList Set for displayList
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
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

    /**
     * return {@link #wb006ListDomainList} (Helper method for Generics)
     * {@link #wb006ListDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> WB006ListDomain
     * @return {@link #wb006ListDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)wb006ListDomainList;
    }
}
