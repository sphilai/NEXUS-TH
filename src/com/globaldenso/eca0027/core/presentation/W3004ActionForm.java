/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3004ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>W3004 for Domain</p>
 *
 * @author TIS Tanaka
 * @version 1.00
 */
public class W3004ActionForm extends AbstractActionForm {

    /**
     * Serial version   
     */
    private static final long serialVersionUID = 1L;

    /**
     * Domain of W3004CriteriaDomain search criteria
     */
    private W3004CriteriaDomain criteriaDomain;
    
    /**
     * list of result Domain
     */
    private List<? extends W3004ListDomain>  listDomainList;
    
    /**
     * Search results display area flag
     */
    private boolean displayList;
    
    /**
     * Constructor method
     *
     */
    public W3004ActionForm(){
        criteriaDomain = new W3004CriteriaDomain();
    }

    /**
     * <p>Getter method for criteriaDomain.</p>
     *
     * @return the criteriaDomain
     */
    public W3004CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3004CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * <p>Getter method for displayList.</p>
     *
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * <p>Setter method for displayList.</p>
     *
     * @param displayList Set for displayList
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }

    /**
     * <p>Getter method for listDomainList.</p>
     *
     * @return the listDomainList
     */
    public List<? extends W3004ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>Setter method for listDomainList.</p>
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W3004ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    /**
     * <br />Getter List of domain list.。
     *
     * @param index index
     * @return List list
     */
    public W3004ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3004ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W3004ListDomain());
        }
        
        return listDomainList.get(index);
    }

    /**
     * <br />ListドメインのSetterです。
     * <br />Setter for ListDomain
     *
     * @param index インデックス
     * @param listDomain Listドメイン
     */
    public void setListDomainList(int index, W3004ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3004ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W3004ListDomain());
        }
        
        listDomainList().add(listDomain);
    }

    /**
     * <br />{@link #listDomainList} helper method  
     *
     * @param <T> W3004ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}