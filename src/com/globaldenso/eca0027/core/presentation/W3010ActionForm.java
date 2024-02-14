/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3010DetailDomain;
import com.globaldenso.eca0027.core.business.domain.W3010ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>
 * The action form class that holds the property of Receive CML Transfer Report.
 * </p>
 * 
 * @author SNT Ri
 * @version 1.00
 */
public class W3010ActionForm extends AbstractActionForm {

    /**
     * Serial version
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Domain of W3003CriteriaDomain search criteria
     */
    private W3010CriteriaDomain criteriaDomain;

    /**
     * Domain of W3010DetailDomain for display
     */
    private W3010DetailDomain detailDomain;

    /**
     * list of result Domain
     */
    private List<? extends W3010ListDomain> listDomainList;

    /**
     * Constructor method
     */
    public W3010ActionForm() {
        detailDomain = new W3010DetailDomain();
        criteriaDomain = new W3010CriteriaDomain();
    }

    /**
     * <p>
     * Getter method for detailDomain.
     * </p>
     * 
     * @return the detailDomain
     */
    public W3010DetailDomain getDetailDomain() {
        return detailDomain;
    }

    /**
     * <p>
     * Setter method for detailDomain.
     * </p>
     * 
     * @param detailDomain Set for detailDomain
     */
    public void setDetailDomain(W3010DetailDomain detailDomain) {
        this.detailDomain = detailDomain;
    }

    /**
     * <p>
     * Getter method for listDomainList.
     * </p>
     * 
     * @return the listDomainList
     */
    public List<? extends W3010ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>
     * Setter method for listDomainList.
     * </p>
     * 
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W3010ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * <br />
     * Getter List of domain list.。
     * 
     * @param index index
     * @return List list
     */
    public W3010ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3010ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new W3010ListDomain());
        }

        return listDomainList.get(index);
    }

    /**
     * <br />
     * Setter List of domain list.
     * 
     * @param index index
     * @param listDomain W3010ListDomain
     */
    public void setListDomainList(int index, W3010ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3010ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W3010ListDomain());
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
    public W3010CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3010CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }
}