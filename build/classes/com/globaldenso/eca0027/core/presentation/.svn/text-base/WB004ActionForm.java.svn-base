/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB004ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for order search main screen.
 * <br />受注検索メイン画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WB004ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private WB004CriteriaDomain wb004CriteriaDomain;
    
    /**
     * Search-results area display flag
     * <br />検索結果ドメインのリスト
     */
    private List<? extends WB004ListDomain> listDomainList; 
    
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
    public WB004ActionForm() {
        wb004CriteriaDomain = new WB004CriteriaDomain();
    }

    /**
     * Getter method for wb004CriteriaDomain.
     *
     * @return the wb004CriteriaDomain
     */
    public WB004CriteriaDomain getWb004CriteriaDomain() {
        return wb004CriteriaDomain;
    }

    /**
     * Setter method for wb004CriteriaDomain.
     *
     * @param wb004CriteriaDomain Set for wb004CriteriaDomain
     */
    public void setWb004CriteriaDomain(WB004CriteriaDomain wb004CriteriaDomain) {
        this.wb004CriteriaDomain = wb004CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends WB004ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends WB004ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List Domain<br />Listドメイン
     */
    public WB004ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<WB004ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new WB004ListDomain());
        }

        return listDomainList.get(index);
    }

    /**
     * Setter method for listDomainList
     * <br />ListドメインリストのSetterです。
     * 
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setListDomainList(int index, WB004ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<WB004ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++ ) {
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
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> WB004ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)listDomainList;
    }
}
