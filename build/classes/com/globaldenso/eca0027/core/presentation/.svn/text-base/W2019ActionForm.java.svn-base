/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W2019CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2019ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CML Trans Revise
 * <br />CML輸送手段付替え画面のアクション・フォームです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2019ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * criteria
     */
    private W2019CriteriaDomain w2019CriteriaDomain;

    /**
     * detail list
     */
    private List<? extends W2019ListDomain> listDomainList;

    /**
     * constructor.
     */
    public W2019ActionForm() {
        w2019CriteriaDomain = new W2019CriteriaDomain();
    }

    /**
     * Getter method for w2019CriteriaDomain.
     *
     * @return the w2019CriteriaDomain
     */
    public W2019CriteriaDomain getW2019CriteriaDomain() {
        return w2019CriteriaDomain;
    }

    /**
     * Setter method for w2019CriteriaDomain.
     *
     * @param w2019CriteriaDomain Set for w2019CriteriaDomain
     */
    public void setW2019CriteriaDomain(W2019CriteriaDomain w2019CriteriaDomain) {
        this.w2019CriteriaDomain = w2019CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2019ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2019ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    
    /**
     * Getter method for List domain list
     * <br />ListドメインリストのGetterです。
     *
     * @param index index<br />インデックス
     * @return List Domain<br />Listドメイン
     */
    public W2019ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2019ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W2019ListDomain());
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
    public void setListDomainList(int index, W2019ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2019ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W2019ListDomain());
        }
        
        listDomainList().add(listDomain);
    }
    
    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     *
     * @param <T> W2008ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}
