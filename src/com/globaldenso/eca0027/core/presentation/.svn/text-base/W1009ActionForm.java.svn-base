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

import com.globaldenso.eca0027.core.business.domain.W1009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W1009ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for Export Packaging Returnable PKG  Material screen.
 * <br />梱包指示Header画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1009ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W1009CriteriaDomain w1009CriteriaDomain;
    
    /**
     * Search-results area display flag <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * The list of search-results domains <br />検索結果ドメインのリスト
     */
    private List<? extends W1009ListDomain> listDomainList;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1009ActionForm() {
        w1009CriteriaDomain = new W1009CriteriaDomain();
    }

    /**
     * Getter method w1009CriteriaDomain
     * <br />
     * @return w1009CriteriaDomain <br />Listドメイン
     */
    public W1009CriteriaDomain getW1009CriteriaDomain() {
        return w1009CriteriaDomain;
    }

    /**
     * Setter method w1009CriteriaDomain
     * <br />
     *
     * @param criteriaDomain W1009CriteriaDomain
     */
    public void setW1009CriteriaDomain(W1009CriteriaDomain criteriaDomain) {
        w1009CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for displayList
     * <br />L
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
     *
     * @return listDomainList <br />
     */
    public List<? extends W1009ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     *
     * @param listDomainList W1009ListDomain
     */
    public void setListDomainList(List<? extends W1009ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    
    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index <br />インデックス
     * @return listDomain <br />Listドメイン
     */
    public W1009ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1009ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W1009ListDomain());
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
    public void setListDomainList(int index, W1009ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W1009ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W1009ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W1009ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W1009ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
