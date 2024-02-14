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

import com.globaldenso.eca0027.core.business.domain.W2007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2007ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Multiple Item No. in 1Box PKG Create
 * <br />小箱内多品番梱包Create画面のアクション・フォームです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6762 $
 */
public class W2007ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * criteria
     */
    private W2007CriteriaDomain w2007CriteriaDomain;
    
    /**
     * List of List domains (for screen display)
     * <br />Listドメインのリスト (画面表示用)
     */
    private List<? extends W2007ListDomain> listDomainList;
    
    /**
     * List of List domains (for preservation of result)
     * <br />Listドメインのリスト (結果保存用)
     */
    private List<? extends W2007ListDomain> searchResult;
    
    /**
     * press of search button flag
     * <br />検索ボタン押下フラグ
     */
    private String searchFlg;
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;

    /**
     * constructor.
     */
    public W2007ActionForm() {
        w2007CriteriaDomain = new W2007CriteriaDomain();
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W2007ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
                listDomain.setQty(null);
                listDomain.setTagQty(null);
            }
        }
    }

    /**
     * Getter method for w2007CriteriaDomain.
     *
     * @return the w2007CriteriaDomain
     */
    public W2007CriteriaDomain getW2007CriteriaDomain() {
        return w2007CriteriaDomain;
    }

    /**
     * Setter method for w2007CriteriaDomain.
     *
     * @param w2007CriteriaDomain Set for w2007CriteriaDomain
     */
    public void setW2007CriteriaDomain(W2007CriteriaDomain w2007CriteriaDomain) {
        this.w2007CriteriaDomain = w2007CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2007ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2007ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return listDomain<br />Listドメイン
     */
    public W2007ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2007ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2007ListDomain());
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
    public void setListDomainList(int index, W2007ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2007ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2007ListDomain());
        }
        
        listDomainList().add(listDomain);
    }

    /**
     * Getter method for searchResult.
     *
     * @return the searchResult
     */
    public List<? extends W2007ListDomain> getSearchResult() {
        return searchResult;
    }

    /**
     * Setter method for searchResult.
     *
     * @param searchResult Set for searchResult
     */
    public void setSearchResult(List<? extends W2007ListDomain> searchResult) {
        this.searchResult = searchResult;
    }

    /**
     * Getter method for searchFlg.
     *
     * @return the searchFlg
     */
    public String getSearchFlg() {
        return searchFlg;
    }

    /**
     * Setter method for searchFlg.
     *
     * @param searchFlg Set for searchFlg
     */
    public void setSearchFlg(String searchFlg) {
        this.searchFlg = searchFlg;
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
     * @param <T> W2007ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }

}
