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
import com.globaldenso.eca0027.core.business.domain.W2012CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W2012ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for CML Register Screen.
 * <br />CML Register画面のアクション・フォームです。
 * 
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
public class W2012ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * criteria
     */
    private W2012CriteriaDomain w2012CriteriaDomain;

    /**
     * detail list
     */
    private List<? extends W2012ListDomain> listDomainList;

    /**
     * constructor.
     */
    public W2012ActionForm() {
        w2012CriteriaDomain = new W2012CriteriaDomain();
    }

    /**
     * Getter method for w2012CriteriaDomain.
     *
     * @return the w2012CriteriaDomain
     */
    public W2012CriteriaDomain getW2012CriteriaDomain() {
        return w2012CriteriaDomain;
    }

    /**
     * Setter method for w2012CriteriaDomain.
     *
     * @param criteriaDomain Set for w2012CriteriaDomain
     */
    public void setW2012CriteriaDomain(W2012CriteriaDomain criteriaDomain) {
        w2012CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @return the listDomainList
     */
    public List<? extends W2012ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     * 
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2012ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList
     * <br />ListドメインリストのGetterです。
     * 
     * @param index index<br />インデックス
     * @return List domain<br />Listドメイン
     */
    public W2012ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2012ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new W2012ListDomain());
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
    public void setListDomainList(int index, W2012ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W2012ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W2008ListDomain());
        }

        listDomainList().add(listDomain);
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping, javax.servlet.http.HttpServletRequest)
     */
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (listDomainList != null) {
            for (W2012ListDomain listDomain : listDomainList) {
                listDomain.setSelected(null);
            }
        }
    }

    /**
     * return {@link #listDomainList} (Helper method for Generics)
     * <br />{@link #listDomainList}を返します。(Genericsのためのヘルパーメソッド)
     * 
     * @param <T> W2012ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)listDomainList;
    }
}
