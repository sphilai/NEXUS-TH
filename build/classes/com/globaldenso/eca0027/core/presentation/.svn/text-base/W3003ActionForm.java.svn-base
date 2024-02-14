/*
 * Project : NEXUS_EXPORT_ORG
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3003ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>W3003 for Domain</p>
 *
 * @author SNT ku
 * @version 1.00
 */
public class W3003ActionForm extends AbstractActionForm {

    /**
     * Serial version   
     */
    private static final long serialVersionUID = 1L;

    /**
     * Domain of W3003CriteriaDomain search criteria
     */
    private W3003CriteriaDomain criteriaDomain;
    
    /**
     * list of result Domain
     */
    private List<? extends W3003ListDomain>  listDomainList;
    
    /**
     * Search results display area flag
     */
    private boolean displayList;
    
    /**
     * Constructor method
     *
     */
    public W3003ActionForm(){
        criteriaDomain = new W3003CriteriaDomain();
    }

    /**
     * <p>Getter method for criteriaDomain.</p>
     *
     * @return the criteriaDomain
     */
    public W3003CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3003CriteriaDomain criteriaDomain) {
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
    public List<? extends W3003ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>Setter method for listDomainList.</p>
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W3003ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }
    /**
     * <br />Getter List of domain list.。
     *
     * @param index index
     * @return List list
     */
    public W3003ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3003ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++) {
            listDomainList().add(new W3003ListDomain());
        }
        
        return listDomainList.get(index);
    }

    /**
     * <br />List domain list Setter
     *
     * @param index index
     * @param listDomain W3003ListDomain
     */
    public void setListDomainList(int index, W3003ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3003ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W3003ListDomain());
        }
        
        listDomainList().add(listDomain);
    }

    /**
     * <br />{@link #listDomainList} helper method  
     *
     * @param <T> W3001ListDomain
     * @return {@link #listDomainList}
     */
    @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }
}