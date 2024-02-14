/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W2014CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2014ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of X-tag Main Screen
 * <br />X-tag Main Screen画面のアクション・フォームです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2014ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W2014CriteriaDomain w2014CriteriaDomain;
    
    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W2014ListDomain> listDomainList; 
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * X-Tag No selected in search-results area
     * <br />検索結果エリアで選択されたX-Tag No.
     */
    private String xmainMark;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2014ActionForm() {
        w2014CriteriaDomain = new W2014CriteriaDomain();
    }

    /**
     * Getter method for w2014CriteriaDomain.
     *
     * @return the w2014CriteriaDomain
     */
    public W2014CriteriaDomain getW2014CriteriaDomain() {
        return w2014CriteriaDomain;
    }

    /**
     * Setter method for w2014CriteriaDomain.
     *
     * @param criteriaDomain Set for w2014CriteriaDomain
     */
    public void setW2014CriteriaDomain(W2014CriteriaDomain criteriaDomain) {
        w2014CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2014ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2014ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public W2014ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2014ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new W2014ListDomain());
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
    public void setListDomainList(int index, W2014ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2014ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W2014ListDomain());
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
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }

    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> W2014ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)listDomainList;
    }
}
