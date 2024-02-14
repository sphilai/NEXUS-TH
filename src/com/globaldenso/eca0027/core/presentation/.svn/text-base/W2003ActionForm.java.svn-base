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

import com.globaldenso.eca0027.core.business.domain.W2003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2003ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for Packaging Instruction Create Screen
 * <br />梱包指示Create画面のアクション・フォームです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class W2003ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W2003CriteriaDomain w2003CriteriaDomain;
    
    /**
     * List of List domain (for screen display)
     * <br />Listドメインのリスト (画面表示用)
     */
    private List<? extends W2003ListDomain> listDomainList;
    
    /**
     * List of List domain (for result save)
     * <br />Listドメインのリスト (結果保存用)
     */
    private List<? extends W2003ListDomain> searchResult;
    
    /**
     * Search button depression flag
     * <br />検索ボタン押下フラグ
     */
    private String searchFlg;
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2003ActionForm() {
        w2003CriteriaDomain = new W2003CriteriaDomain();
    }

    /**
     * Getter method for w2003criteriaDomain.
     *
     * @return the w2003criteriaDomain
     */
    public W2003CriteriaDomain getW2003CriteriaDomain() {
        return w2003CriteriaDomain;
    }

    /**
     * Setter method for w2003criteriaDomain.
     *
     * @param w2003CriteriaDomain Set for w2003criteriaDomain
     */
    public void setW2003CriteriaDomain(W2003CriteriaDomain w2003CriteriaDomain) {
        this.w2003CriteriaDomain = w2003CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2003ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2003ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for searchResult.
     *
     * @return the searchResult
     */
    public List<? extends W2003ListDomain> getSearchResult() {
        return searchResult;
    }

    /**
     * Setter method for searchResult.
     *
     * @param searchResult Set for searchResult
     */
    public void setSearchResult(List<? extends W2003ListDomain> searchResult) {
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
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public W2003ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2003ListDomain>();
        }
        
        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2003ListDomain());
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
    public void setListDomainList(int index, W2003ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2003ListDomain>();
        }
        
        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2003ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W2003ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
                listDomain.setInstrQty(null);
            }
        }
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W2003ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
