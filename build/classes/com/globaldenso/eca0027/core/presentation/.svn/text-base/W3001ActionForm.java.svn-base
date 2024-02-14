/*
 * Project : NEXUS_EXPORT_ORG
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>W3001 for Domain</p>
 *
 * @author DIAT Chaiporn
 * @version 1.00
 */
public class W3001ActionForm extends AbstractActionForm {

    /**
     * Serial version   
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search TR No.
     */
    private String trNo;
    
    /**
     * Domain of W3001CriteriaDomain search criteria
     */
    private W3001CriteriaDomain criteriaDomain;
    
    /**
     * list of result Domain
     */
    private List<? extends W3001ListDomain>  w3001ListDomainList;
    
    /**
     * Search results display area flag
     */
    private boolean displayList;
    
    //kimura add 20160616
    /**
     * Edit button pressed or not
     * to specify which action (Edit TR or Confirm Detail)
     */
    private String editFlg;
    //end
    
    /**
     * Constructor method
     *
     */
    public W3001ActionForm(){
        criteriaDomain = new W3001CriteriaDomain();
    }

    /**
     * <p>Getter method for criteriaDomain.</p>
     *
     * @return the criteriaDomain
     */
    public W3001CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3001CriteriaDomain criteriaDomain) {
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
     * <p>Getter method for w3001ListDomainList.</p>
     *
     * @return the w3001ListDomainList
     */
    public List<? extends W3001ListDomain> getW3001ListDomainList() {
        return w3001ListDomainList;
    }

    /**
     * <p>Setter method for w3001ListDomainList.</p>
     *
     * @param listDomainList Set for w3001ListDomainList
     */
    public void setW3001ListDomainList(List<? extends W3001ListDomain> listDomainList) {
        w3001ListDomainList = listDomainList;
    }

    /**
     * <br />Getter List of domain list.。
     *
     * @param index index
     * @return List list
     */
    @SuppressWarnings("unchecked")
    public W3001ListDomain getW3001ListDomain(int index) {
        if (w3001ListDomainList == null) {
            w3001ListDomainList = new ArrayList<W3001ListDomain>();
        }

        for (int i = w3001ListDomainList.size(); i <= index; i++) {
            ((List<W3001ListDomain>)w3001ListDomainList).add(new W3001ListDomain());
            //w3001ListDomainList().add(new W3001ListDomain());
        }
        
        return w3001ListDomainList.get(index);
    }

    /**
     * <br />ListドメインリストのSetterです。
     *
     * @param index インデックス
     * @param listDomain Listドメイン
     */
   /* public void setListDomainList(int index, W3001ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3001ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++) {
            listDomainList().add(new W3001ListDomain());
        }
        
        listDomainList().add(listDomain);
    }*/
    /**
     * <p>Getter method for trNo.</p>
     *
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>Setter method for trNo.</p>
     *
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * <p>Getter method for editFlg.</p>
     *
     * @return the editFlg
     */
    public String getEditFlg() {
        return editFlg;
    }

    /**
     * <p>Setter method for editFlg.</p>
     *
     * @param editFlg Set for editFlg
     */
    public void setEditFlg(String editFlg) {
        this.editFlg = editFlg;
    }

    /**
     * <br />{@link #listDomainList} helper method  
     *
     * @param <T> W3001ListDomain
     * @return {@link #listDomainList}
     */
   /* @SuppressWarnings("unchecked")
    private <T> List<T> listDomainList() {
        return (List<T>) listDomainList;
    }*/
}