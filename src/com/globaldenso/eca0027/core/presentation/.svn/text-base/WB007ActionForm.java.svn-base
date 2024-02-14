/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W2008ListDomain;
import com.globaldenso.eca0027.core.business.domain.WB007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.WB007ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form of a Last Digit Change Register Screen
 * <br />品番末尾変更登録画面のアクション・フォームです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class WB007ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private WB007CriteriaDomain wb007CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends WB007ListDomain> wb007ListDomainList; 
    
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
    public WB007ActionForm() {
        wb007CriteriaDomain = new WB007CriteriaDomain();
    }

    /**
     * Getter method for wb007CriteriaDomain.
     *
     * @return the wb007CriteriaDomain
     */
    public WB007CriteriaDomain getWb007CriteriaDomain() {
        return wb007CriteriaDomain;
    }

    /**
     * Setter method for wb007CriteriaDomain.
     *
     * @param wb007CriteriaDomain Set for wb007CriteriaDomain
     */
    public void setWb007CriteriaDomain(WB007CriteriaDomain wb007CriteriaDomain) {
        this.wb007CriteriaDomain = wb007CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends WB007ListDomain> getWb007ListDomainList() {
        return wb007ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setWb007ListDomainList(List<? extends WB007ListDomain> listDomainList) {
        this.wb007ListDomainList = listDomainList;
    }

    /**
     * Getter method for List domain list
     * ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List Domain<br />Listドメイン
     */
    public WB007ListDomain getWb007ListDomainList(int index) {
        if (wb007ListDomainList == null) {
            wb007ListDomainList = new ArrayList<WB007ListDomain>();
        }

        for (int i = wb007ListDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new WB007ListDomain());
        }

        return wb007ListDomainList.get(index);
    }

    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     * 
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setWb007ListDomainList(int index, WB007ListDomain listDomain) {
        if (wb007ListDomainList == null) {
            wb007ListDomainList = new ArrayList<WB007ListDomain>();
        }

        for (int i = wb007ListDomainList.size(); i < index; i++ ) {
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
     * return {@link #wb007ListDomainList} (Helper method for Generics)
     * <br />{@link #wb007ListDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> WB007ListDomain
     * @return {@link #wb007ListDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)wb007ListDomainList;
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
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        wb007CriteriaDomain.setIgnoreWarnings(null);
    }
}
