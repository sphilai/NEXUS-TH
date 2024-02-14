/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3005ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>
 * W3005 for Domain
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3005ActionForm extends AbstractActionForm {

    /**
     * Serial version
     */
    private static final long serialVersionUID = 1L;

    /**
     * Domain of W3005CriteriaDomain search criteria
     */
    private W3005CriteriaDomain criteriaDomain;

    /**
     * list of result Domain
     */
    private List<? extends W3005ListDomain> listDomainList;

    /**
     * Search results display area flag
     */
    private boolean displayList;

    /**
     * Constructor method
     */
    public W3005ActionForm() {
        criteriaDomain = new W3005CriteriaDomain();
    }

    /**
     * <p>
     * Getter method for criteriaDomain.
     * </p>
     * 
     * @return the criteriaDomain
     */
    public W3005CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>
     * Setter method for criteriaDomain.
     * </p>
     * 
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3005CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * <p>
     * Getter method for displayList.
     * </p>
     * 
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * <p>
     * Setter method for displayList.
     * </p>
     * 
     * @param displayList Set for displayList
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }

    /**
     * <p>
     * Getter method for listDomainList.
     * </p>
     * 
     * @return the listDomainList
     */
    public List<? extends W3005ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>
     * Setter method for listDomainList.
     * </p>
     * 
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W3005ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * <br />
     * Getter List of domain list.。
     * 
     * @param index index
     * @return List list
     */
    public W3005ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3005ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new W3005ListDomain());
        }

        return listDomainList.get(index);
    }

    /**
     * <br />
     * Setter for ListDomainList
     * 
     * @param index index
     * @param listDomain W3005ListDomain
     */
    public void setListDomainList(int index, W3005ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3005ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W3005ListDomain());
        }

        listDomainList().add(listDomain);
    }

    /**
     * <br />
     * {@link #listDomainList} helper method
     * 
     * @param <T> W3001ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T>List<T> listDomainList() {
        return (List<T>)listDomainList;
    }
}