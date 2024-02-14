/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W4005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4005ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Staging Actuality Main Screen
 * <br />山作り実績Main画面のアクションフォームクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4005ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search criteria for staging actuality.
     */
    private W4005CriteriaDomain w4005CriteriaDomain;

    /**
     * Search result list of staging actuality.
     */
    private List<? extends W4005ListDomain> w4005ListDomainList;

    /**
     * Staging actuality no that is selected in the search results area.
     */
    private String stgActNo;

    /**
     * Constructor.
     */
    public W4005ActionForm() {
        // number of lines to be displayed on one page
        // 1ページの表示行数
        super.setCountPerPage(PAGE_MAX_COUNT);
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W4005CriteriaDomain getW4005CriteriaDomain() {
        if (w4005CriteriaDomain == null) {
            w4005CriteriaDomain = new W4005CriteriaDomain();
        }
        return w4005CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW4005CriteriaDomain(W4005CriteriaDomain criteriaDomain) {
        this.w4005CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W4005ListDomain> getW4005ListDomainList() {
        return w4005ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setW4005ListDomainList(List<? extends W4005ListDomain> listDomainList) {
        this.w4005ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @param index array index no
     * @return the listDomainList
     */
    @SuppressWarnings("unchecked")
    public W4005ListDomain getW4005ListDomain(int index) {
        if (w4005ListDomainList == null) {
            w4005ListDomainList = new ArrayList<W4005ListDomain>();
        }
        for (int i = w4005ListDomainList.size(); i <= index; i++ ) {
            ((List<W4005ListDomain>)w4005ListDomainList).add(new W4005ListDomain());
        }
        return w4005ListDomainList.get(index);
    }

    /**
     * Getter method for stgActNo.
     *
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * Setter method for stgActNo.
     *
     * @param stgActNo Set for stgActNo
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }
}
