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

import com.globaldenso.eca0027.core.business.domain.W1004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1004KitListDomain;
import com.globaldenso.eca0027.core.business.domain.W1004ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for Export Request Kit screen.
 * <br />梱包指示Header画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1004ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W1004CriteriaDomain w1004CriteriaDomain;
    
    /**
     * Search-results area display flag <br />検索結果エリア表示フラグ
     */
    private boolean displayList;

    /**
     * The list of search-results domains <br />検索結果ドメインのリスト
     */
    private List<? extends W1004ListDomain> listDomainList;
    
    /**
     * The list of search-results domains <br />検索結果ドメインのリスト
     */
    private List<? extends W1004KitListDomain> kitList;

    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1004ActionForm() {
        w1004CriteriaDomain = new W1004CriteriaDomain();
    }

    /**
     * Getter method for w1004CriteriaDomain
     * <br />
     * @return w1004CriteriaDomain <br />
     */
    public W1004CriteriaDomain getW1004CriteriaDomain() {
        return w1004CriteriaDomain;
    }

    /**
     * Setter method for w1004CriteriaDomain
     * <br />
     *
     * @param criteriaDomain w1004CriteriaDomain
     */
    public void setW1004CriteriaDomain(W1004CriteriaDomain criteriaDomain) {
        w1004CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for displayList
     * <br />
     * @return displayList <br />
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * Setter method for displayList
     * <br />
     *
     * @param displayList boolean
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }

    /**
     * Getter method for listDomainList
     * <br />
     * @return listDomainList <br />
     */
    public List<? extends W1004ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList
     * <br />
     *
     * @param listDomainList listDomainList
     */
    public void setListDomainList(List<? extends W1004ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter method for kitList
     * <br />
     * @return kitList <br />
     */
    public List<? extends W1004KitListDomain> getKitList() {
        return kitList;
    }

    /**
     * Setter method for kitList
     * <br />
     *
     * @param kitList kitList
     */
    public void setKitList(List<? extends W1004KitListDomain> kitList) {
        this.kitList = kitList;
    }

    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index <br />インデックス
     * @return listDomain <br />Listドメイン
     */
    public W1004ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1004ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W1004ListDomain());
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
    public void setListDomainList(int index, W1004ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1004ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W1004ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index <br />インデックス
     * @return kitList <br />Listドメイン
     */
    public W1004KitListDomain getKitList(int index) {
        if (kitList == null) {
            kitList = new ArrayList<W1004KitListDomain>();
        }
    
        for (int i = kitList.size(); i <= index; i++) {
            kitList().add(new W1004KitListDomain());
        }
        
        return kitList.get(index);
    }

    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setKitList(int index, W1004KitListDomain listDomain) {
        if (kitList == null) {
            kitList = new ArrayList<W1004KitListDomain>();
        }
    
        for (int i = kitList.size(); i < index; i++) {
            kitList().add(new W1004KitListDomain());
        }
        
        kitList().add(listDomain);
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W1004ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W1004ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W1004ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> kitList() {
        return (List<T>) kitList;
    }
}
