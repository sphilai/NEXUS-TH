/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W3006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W3006ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * <p>
 * W3006 for Domain
 * </p>
 * 
 * @author SNT ku
 * @version 1.00
 */
public class W3006ActionForm extends AbstractActionForm {

    /**
     * Serial version
     */
    private static final long serialVersionUID = 1L;

    /**
     * Domain of W3006CriteriaDomain search criteria
     */
    private W3006CriteriaDomain criteriaDomain;

    /**
     * list of result Domain
     */
    private List<? extends W3006ListDomain> listDomainList;

    /**
     * Search results display area flag
     */
    private boolean displayList;

    /** transferred from W3001 flg
     *  true  : from W3001
     *  false : from W3005
     */
    private boolean sqlInitCheck;

    /** transferred from W3001 function flg
     *  true  : Confirm Detail
     *  false : Edit TR
     */
    private boolean sessionFlg;

    /** printable flg */
    private boolean printableFlg;
    
    /**
     * TR_NO
     */
    private String trNo;

    /**
     * Constructor method
     */
    public W3006ActionForm() {
        criteriaDomain = new W3006CriteriaDomain();
    }

    /**
     * <p>
     * Getter method for criteriaDomain.
     * </p>
     * 
     * @return the criteriaDomain
     */
    public W3006CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>
     * Setter method for criteriaDomain.
     * </p>
     * 
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W3006CriteriaDomain criteriaDomain) {
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
    public List<? extends W3006ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>
     * Setter method for listDomainList.
     * </p>
     * 
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W3006ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * <br />
     * Getter List of domain list.。
     * 
     * @param index index
     * @return List list
     */
    public W3006ListDomain getListDomainList(int index) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3006ListDomain>();
        }

        for (int i = listDomainList.size(); i <= index; i++ ) {
            listDomainList().add(new W3006ListDomain());
        }

        return listDomainList.get(index);
    }

    /**
     * <br />
     * setter of listDomainList
     * 
     * @param index index
     * @param listDomain W3006ListDomain
     */
    public void setListDomainList(int index, W3006ListDomain listDomain) {
        if (listDomainList == null) {
            listDomainList = new ArrayList<W3006ListDomain>();
        }
        for (int i = listDomainList.size(); i < index; i++ ) {
            listDomainList().add(new W3006ListDomain());
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
     * Getter method for sqlInitCheck.
     * </p>
     * 
     * @return the sqlInitCheck
     */
    public boolean isSqlInitCheck() {
        return sqlInitCheck;
    }

    /**
     * <p>
     * Setter method for sqlInitCheck.
     * </p>
     * 
     * @param sqlInitCheck Set for sqlInitCheck
     */
    public void setSqlInitCheck(boolean sqlInitCheck) {
        this.sqlInitCheck = sqlInitCheck;
    }

    /**
     * <p>
     * Getter method for sessionFlg.
     * </p>
     * 
     * @return the sessionFlg
     */
    public boolean isSessionFlg() {
        return sessionFlg;
    }

    /**
     * <p>
     * Setter method for sessionFlg.
     * </p>
     * 
     * @param sessionFlg Set for sessionFlg
     */
    public void setSessionFlg(boolean sessionFlg) {
        this.sessionFlg = sessionFlg;
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

}