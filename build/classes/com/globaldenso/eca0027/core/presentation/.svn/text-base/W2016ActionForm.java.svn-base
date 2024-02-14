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

import com.globaldenso.eca0027.core.business.domain.W2016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2016ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of X-Tag Create
 * <br />X-Tag Create画面のアクション・フォームです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2016ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * criteria
     */
    private W2016CriteriaDomain w2016CriteriaDomain;

    /**
     * detail list
     */
    private List<? extends W2016ListDomain> w2016ListDomainList;
    
    /**
     * Search-results area display flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;

    /**
     * constructor.
     */
    public W2016ActionForm() {
        w2016CriteriaDomain = new W2016CriteriaDomain();
    }

    /**
     * Getter method for w2016CriteriaDomain.
     *
     * @return the w2016CriteriaDomain
     */
    public W2016CriteriaDomain getW2016CriteriaDomain() {
        return w2016CriteriaDomain;
    }

    /**
     * Setter method for w2016CriteriaDomain.
     *
     * @param criteriaDomain Set for w2016CriteriaDomain
     */
    public void setW2016CriteriaDomain(W2016CriteriaDomain criteriaDomain) {
        w2016CriteriaDomain = criteriaDomain;
    }
    
    /**
     * Getter method for w2016ListDomainList.
     *
     * @return the w2016ListDomainList
     */
    public List<? extends W2016ListDomain> getW2016ListDomainList() {
        return w2016ListDomainList;
    }

    /**
     * Setter method for w2016ListDomainList.
     *
     * @param listDomainList Set for w2016ListDomainList
     */
    public void setW2016ListDomainList(
        List<? extends W2016ListDomain> listDomainList) {
        w2016ListDomainList = listDomainList;
    }

    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List Domain<br />Listドメイン
     */
    public W2016ListDomain getW2016ListDomainList(int index) {
        if (w2016ListDomainList == null) {
            w2016ListDomainList = new ArrayList<W2016ListDomain>();
        }

        for (int i = w2016ListDomainList.size(); i <= index; i++ ) {
            w2016ListDomainList().add(new W2016ListDomain());
        }

        return w2016ListDomainList.get(index);
    }

    /**
     * Setter method for List domain list
     * <br />ListドメインリストのSetterです。
     * 
     * @param index index<br />インデックス
     * @param listDomain List Domain<br />Listドメイン
     */
    public void setW2016ListDomainList(int index, W2016ListDomain listDomain) {
        if (w2016ListDomainList == null) {
            w2016ListDomainList = new ArrayList<W2016ListDomain>();
        }

        for (int i = w2016ListDomainList.size(); i < index; i++ ) {
            w2016ListDomainList().add(new W2016ListDomain());
        }

        w2016ListDomainList().add(listDomain);
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
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w2016ListDomainList != null) {
            for (W2016ListDomain listDomain : w2016ListDomainList) {
                listDomain.setSelected(null);
            }
        }
    }

    /**
     * return {@link #w2016ListDomainList} (Helper method for Generics)
     * <br />{@link #w2016ListDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> W2016ListDomain
     * @return {@link #w2016ListDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> w2016ListDomainList() {
        return (List<T>)w2016ListDomainList;
    }
}
