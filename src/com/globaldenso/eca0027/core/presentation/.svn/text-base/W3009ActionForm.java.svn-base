/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3009CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3009ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>
 * W3009ActionForm
 * </p>
 * 
 * @author Thalerngsak.P
 * @version 1.00
 */
public class W3009ActionForm extends AbstractActionForm {

    /**
     * Serial version
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search TR No.
     */
    private String trNo;

    /**
     * Domain of W3009CriteriaDomain search criteria
     */
    private W3009CriteriaDomain criteriaDomain;

    /**
     * list of result Domain
     */
    private List<? extends W3009ListDomain> w3009ListDomainList;
    
    /**
     * 
     * Display control
     */

    private boolean displayList;

    /**
     * <p>
     * constructor
     * </p>
     */
    public W3009ActionForm() {
        criteriaDomain = new W3009CriteriaDomain();
    }

    /**
     * <p>
     * trNo getter
     * </p>
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>
     * trNo setter
     * </p>
     * 
     * @param trNo trNo set
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * <p>
     * criteriaDomain getter
     * </p>
     * 
     * @return the criteriaDomain
     */
    public W3009CriteriaDomain getCriteriaDomain() {
        if (criteriaDomain == null) {
            criteriaDomain = new W3009CriteriaDomain();
        }
        return criteriaDomain;
    }

    /**
     * <p>
     * criteriaDomain setter
     * </p>
     * 
     * @param criteriaDomain criteriaDomain set
     */
    public void setCriteriaDomain(W3009CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * <p>w3009ListDomainList getter</p>
     *
     * @return the w3009ListDomainList
     */
    public List<? extends W3009ListDomain> getW3009ListDomainList() {
        return w3009ListDomainList;
    }

    /**
     * <p>w3009ListDomainList setter</p>
     *
     * @param listDomainList w3009ListDomainList set
     */
    public void setW3009ListDomainList(
        List<? extends W3009ListDomain> listDomainList) {
        w3009ListDomainList = listDomainList;
    }
    /**
     * Getter method for listDomainList.
     * 
     * @param index array index no
     * @return the listDomainList
     */
    @SuppressWarnings("unchecked")
    public W3009ListDomain getW3009ListDomain(int index) {
        if (w3009ListDomainList == null) {
            w3009ListDomainList = new ArrayList<W3009ListDomain>();
        }
        for (int i = w3009ListDomainList.size(); i <= index; i++ ) {
            ((List<W3009ListDomain>)w3009ListDomainList).add(new W3009ListDomain());
        }
        return w3009ListDomainList.get(index);
    }
    /**
     * <p>
     * displayList getter
     * </p>
     * 
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * <p>
     * displayList setter
     * </p>
     * 
     * @param displayList displayList set
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }

}
