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

import com.globaldenso.eca0027.core.business.domain.W2011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2011ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CML Create
 * <br />梱包品番情報入力画面のアクション・フォームです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7151 $
 */
public class W2011ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * criteria
     */
    private W2011CriteriaDomain w2011CriteriaDomain;
    
    /**
     * List of List domains (for screen display)
     * <br />Listドメインのリスト (画面表示用)
     */
    private List<? extends W2011ListDomain> listDomainList;
    
    /**
     * List of List domains (for save result)
     * <br />Listドメインのリスト (結果保存用)
     */
    private List<? extends W2011ListDomain> searchResult;
    
    /**
     * Search button pressed flag
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
    public W2011ActionForm() {
        w2011CriteriaDomain = new W2011CriteriaDomain();
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W2011ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
                listDomain.setQty(null);
                listDomain.setTagQty(null);
                listDomain.setMixTagNoErrStyleFlg(null);
            }
        }
    }

    /**
     * Getter method for w2011CriteriaDomain.
     *
     * @return the w2011CriteriaDomain
     */
    public W2011CriteriaDomain getW2011CriteriaDomain() {
        return w2011CriteriaDomain;
    }

    /**
     * Setter method for w2011CriteriaDomain.
     *
     * @param criteriaDomain Set for w2011CriteriaDomain
     */
    public void setW2011CriteriaDomain(W2011CriteriaDomain criteriaDomain) {
        w2011CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2011ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2011ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public W2011ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2011ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2011ListDomain());
        }
        
        return listDomainList.get(index);
    }
    
    /**
     * Setter method for listDomainList
     * <br />ListドメインリストのSetterです。
     *
     * @param index index<br />インデックス
     * @param listDomain List domain<br />Listドメイン
     */
    public void setListDomainList(int index, W2011ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2011ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2011ListDomain());
        }
        
        listDomainList().add(listDomain);
    }

    /**
     * Getter method for searchResult.
     *
     * @return the searchResult
     */
    public List<? extends W2011ListDomain> getSearchResult() {
        return searchResult;
    }

    /**
     * Setter method for searchResult.
     *
     * @param searchResult Set for searchResult
     */
    public void setSearchResult(List<? extends W2011ListDomain> searchResult) {
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
     * @param <T> W2011ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }

}
