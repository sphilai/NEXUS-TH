/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W2009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2009ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CML Main Screen 
 * <br />CML一覧画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2009ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * criteria
     */
    private W2009CriteriaDomain w2009CriteriaDomain;

    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W2009ListDomain> listDomainList;

    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * MAIN MARK (for screen taking over)
     * <br />メインマーク (画面引継ぎ用)
     */
    private String mainMark;
    
    /**
     * Processing mode (for screen taking over)
     * <br />処理モード (画面引継ぎ用)
     */
    private String functionMode;
    
    /**
     * constructor.
     */
    public W2009ActionForm() {
        w2009CriteriaDomain = new W2009CriteriaDomain();
    }

    /**
     * Getter method for w2009CriteriaDomain.
     *
     * @return the w2009CriteriaDomain
     */
    public W2009CriteriaDomain getW2009CriteriaDomain() {
        return w2009CriteriaDomain;
    }

    /**
     * Setter method for w2009CriteriaDomain.
     *
     * @param criteriaDomain Set for w2009CriteriaDomain
     */
    public void setW2009CriteriaDomain(W2009CriteriaDomain criteriaDomain) {
        w2009CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @return the listDomainList
     */
    public List<? extends W2009ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     * 
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2009ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return listDomain<br />Listドメイン
     */
    public W2009ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2009ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2009ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setListDomainList(int index, W2009ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2009ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2009ListDomain());
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
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> W2009ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)listDomainList;
    }

    /**
     * Getter method for functionMode.
     *
     * @return the functionMode
     */
    public String getFunctionMode() {
        return functionMode;
    }

    /**
     * Setter method for functionMode.
     *
     * @param functionMode Set for functionMode
     */
    public void setFunctionMode(String functionMode) {
        this.functionMode = functionMode;
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

}
