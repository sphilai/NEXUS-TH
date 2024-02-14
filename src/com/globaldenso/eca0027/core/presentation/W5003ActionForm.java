/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W5003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W5003ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Shipping Confirmation Create Screen
 * <br />出荷確認Create画面のアクションフォームクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W5003ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Criteria domain.
     */
    private W5003CriteriaDomain w5003CriteriaDomain;

    /**
     * List domain.
     */
    private List<W5003ListDomain> listDomainList;
    
    /**
     * Search Result.
     */
    private List<W5003ListDomain> searchResult;
    
    /**
     * Search flag.
     */
    private String searchFlg;
    
    /**
     * Display list.
     */
    private boolean displayList;
    
    /**
     * Row number.
     */
    private String rowNum;

    /**
     * constructor.
     */
    public W5003ActionForm() {
        w5003CriteriaDomain = new W5003CriteriaDomain();
    }

    /**
     * Getter method for w5003CriteriaDomain.
     *
     * @return the w5003CriteriaDomain
     */
    public W5003CriteriaDomain getW5003CriteriaDomain() {
        return w5003CriteriaDomain;
    }

    /**
     * Setter method for w5003CriteriaDomain.
     *
     * @param w5003CriteriaDomain Set for w5003CriteriaDomain
     */
    public void setW5003CriteriaDomain(W5003CriteriaDomain w5003CriteriaDomain) {
        this.w5003CriteriaDomain = w5003CriteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<W5003ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<W5003ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for searchResult.
     *
     * @return the searchResult
     */
    public List<W5003ListDomain> getSearchResult() {
        return searchResult;
    }

    /**
     * Setter method for searchResult.
     *
     * @param searchResult Set for searchResult
     */
    public void setSearchResult(List<W5003ListDomain> searchResult) {
        this.searchResult = searchResult;
    }

    /**
     * Getter method for searchFlg.
     *
     * @return the searchFlg
     */
    public String getSearchFlg() {
        return searchFlg;
    }

    /**
     * Setter method for searchFlg.
     *
     * @param searchFlg Set for searchFlg
     */
    public void setSearchFlg(String searchFlg) {
        this.searchFlg = searchFlg;
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