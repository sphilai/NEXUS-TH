/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3011ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>
 * The action form class that holds the property of Receive Parts Transfer Report.
 * </p>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3011ActionForm extends AbstractActionForm {

    /**
     * Serial version
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Domain of W3011CriteriaDomain search criteria
     */
    private W3011CriteriaDomain criteriaDomain;

    /**
     * list of result Domain
     */
    private List<? extends W3011ListDomain> listDomainList;

    /**
     * Constructor method
     */
    public W3011ActionForm() {
        criteriaDomain = new W3011CriteriaDomain();
    }

    /**
     * <p>
     * Getter method for listDomainList.
     * </p>
     * 
     * @return the listDomainList
     */
    public List<? extends W3011ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>
     * Setter method for listDomainList.
     * </p>
     * 
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W3011ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * <br />
     * Getter List of domain list.。
     * 
     * @param index index
     * @return List list
     */
    public W3011ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3011ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new W3011ListDomain());
        }

        return listDomainList.get(index);
    }

    /**
     * <br />
     * Setter List of domain list.
     * 
     * @param index index
     * @param listDomain W3011ListDomain
     */
    public void setListDomainList(int index, W3011ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3011ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W3011ListDomain());
        }

        listDomainList().add(listDomain);
    }

    /**
     * <br />
     * {@link #listDomainList} helper method
     * 
     * @param <T> W3010ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)listDomainList;
    }

    /**
     * <p>Getter method for criteriaDomain.</p>
     *
     * @return the criteriaDomain
     */
    public W3011CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3011CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }
}