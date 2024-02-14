/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3008ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>
 * W3008 for Domain
 * </p>
 * 
 * @author SNT riku
 * @version 1.00
 */
public class W3008ActionForm extends AbstractActionForm {

    /**
     * Serial version
     */
    private static final long serialVersionUID = 1L;

    /**
     * Domain of W3006CriteriaDomain search criteria
     */
    private W3008CriteriaDomain criteriaDomain;

    /**
     * list of result Domain
     */
    private List<? extends W3008ListDomain> listDomainList;

    /**
     * Search results display area flag
     */
    private boolean displayList;

    /**
     * the flag of what's the table will be display
     */
    private boolean tableFlg;

    /**
     * check the register/edit button has been pushed or not
     */
    private boolean registerFlg;

    /**
     * printable flg
     */
    private boolean printableFlg;
    
    /**
     * cancel flg
     */
    private boolean cancelFlg;
    
    /**
     * TR_NO
     */
    private String trNo;

    /**
     * Constructor method
     */
    public W3008ActionForm() {
        criteriaDomain = new W3008CriteriaDomain();
    }

    /**
     * <p>
     * Getter method for criteriaDomain.
     * </p>
     * 
     * @return the criteriaDomain
     */
    public W3008CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>
     * Setter method for criteriaDomain.
     * </p>
     * 
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3008CriteriaDomain criteriaDomain) {
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
     * Getter method for tableFlg.
     * </p>
     * 
     * @return the tableFlg
     */
    public boolean isTableFlg() {
        return tableFlg;
    }

    /**
     * <p>
     * Setter method for tableFlg.
     * </p>
     * 
     * @param tableFlg Set for tableFlg
     */
    public void setTableFlg(boolean tableFlg) {
        this.tableFlg = tableFlg;
    }

    /**
     * <p>
     * Getter method for registerFlg.
     * </p>
     * 
     * @return the registerFlg
     */
    public boolean isRegisterFlg() {
        return registerFlg;
    }

    /**
     * <p>
     * Setter method for registerFlg.
     * </p>
     * 
     * @param registerFlg Set for registerFlg
     */
    public void setRegisterFlg(boolean registerFlg) {
        this.registerFlg = registerFlg;
    }

    /**
     * <p>
     * Getter method for trNo.
     * </p>
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>
     * Setter method for trNo.
     * </p>
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * <p>
     * Getter method for listDomainList.
     * </p>
     * 
     * @return the listDomainList
     */
    public List<? extends W3008ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>
     * Setter method for listDomainList.
     * </p>
     * 
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W3008ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * <br />
     * Getter List of domain list.。
     * 
     * @param index index
     * @return List list
     */
    public W3008ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3008ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new W3008ListDomain());
        }

        return listDomainList.get(index);
    }

    /**
     * <br />
     * setter of listDomainList
     * 
     * @param index index
     * @param listDomain W3008ListDomain
     */
    public void setListDomainList(int index, W3008ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3008ListDomain>();
        }

        for (int i = listDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W3008ListDomain());
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

    /**
     * <p>
     * Getter method for printableFlg.
     * </p>
     * 
     * @return the printableFlg
     */
    public boolean isPrintableFlg() {
        return printableFlg;
    }

    /**
     * <p>
     * Setter method for printableFlg.
     * </p>
     * 
     * @param printableFlg Set for printableFlg
     */
    public void setPrintableFlg(boolean printableFlg) {
        this.printableFlg = printableFlg;
    }
    
    /**
     * <p>
     * Getter method for cancelFlg.
     * </p>
     * 
     * @return the cancelFlg
     */
    public boolean isCancelFlg() {
        return cancelFlg;
    }

    /**
     * <p>
     * Setter method for cancelFlg.
     * </p>
     * 
     * @param cancelFlg Set for cancelFlg
     */
    public void setCancelFlg(boolean cancelFlg) {
        this.cancelFlg = cancelFlg;
    }
}