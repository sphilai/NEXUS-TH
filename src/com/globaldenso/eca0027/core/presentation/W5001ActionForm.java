/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W5001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Shipping Confirmation Main Screen
 * <br />出荷確認Main画面のアクションフォームクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5001ActionForm extends AbstractActionForm {
    
    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search criteria for Shipping Confirmation.
     */
    private W5001CriteriaDomain w5001CriteriaDomain;

    /**
     * Search result list of Shipping Confirmation.
     */
    private List<W5001ListDomain> listDomainList;
    
    /**
     * <p>Display list</p>
     */
    private boolean displayList;
    
    /**
     * Row number.
     */
    private String rowNum;

    /**
     * constructor.
     */
    public W5001ActionForm() {
        w5001CriteriaDomain = new W5001CriteriaDomain();
    }

    /**
     * Getter method for w5001CriteriaDomain.
     *
     * @return the w5001CriteriaDomain
     */
    public W5001CriteriaDomain getW5001CriteriaDomain() {
        return w5001CriteriaDomain;
    }

    /**
     * Setter method for w5001CriteriaDomain.
     *
     * @param w5001CriteriaDomain Set for w5001CriteriaDomain
     */
    public void setW5001CriteriaDomain(W5001CriteriaDomain w5001CriteriaDomain) {
        this.w5001CriteriaDomain = w5001CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<W5001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<W5001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for displayList.
     *
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * Setter method for displayList.
     *
     * @param displayList Set for displayList
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }

    /**
     * Getter method for rowNum.
     *
     * @return the rowNum
     */
    public String getRowNum() {
        return rowNum;
    }

    /**
     * Setter method for rowNum.
     *
     * @param rowNum Set for rowNum
     */
    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }
}
