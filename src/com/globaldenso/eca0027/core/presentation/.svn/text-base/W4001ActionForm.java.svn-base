/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W4001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Staging Instruction Main Screen
 * <br />荷揃え指示Main画面のアクションフォームクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4001ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search criteria for staging instruction.
     */
    private W4001CriteriaDomain w4001CriteriaDomain;

    /**
     * Search result list of staging instruction.
     */
    private List<? extends W4001ListDomain> w4001ListDomainList;

    /**
     * Staging instruction no that is selected in the search results area.
     */
    private String stgInstrNo;

    /**
     * Constructor.
     */
    public W4001ActionForm() {
        // number of lines to be displayed on one page
        // 1ページの表示行数
        super.setCountPerPage(PAGE_MAX_COUNT);
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W4001CriteriaDomain getW4001CriteriaDomain() {
        if (w4001CriteriaDomain == null) {
            w4001CriteriaDomain = new W4001CriteriaDomain();
        }
        return w4001CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW4001CriteriaDomain(W4001CriteriaDomain criteriaDomain) {
        this.w4001CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W4001ListDomain> getW4001ListDomainList() {
        return w4001ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setW4001ListDomainList(List<? extends W4001ListDomain> listDomainList) {
        this.w4001ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @param index array index no
     * @return the listDomainList
     */
    @SuppressWarnings("unchecked")
    public W4001ListDomain getW4001ListDomain(int index) {
        if (w4001ListDomainList == null) {
            w4001ListDomainList = new ArrayList<W4001ListDomain>();
        }
        for (int i = w4001ListDomainList.size(); i <= index; i++ ) {
            ((List<W4001ListDomain>)w4001ListDomainList).add(new W4001ListDomain());
        }
        return w4001ListDomainList.get(index);
    }

    /**
     * Getter method for stgInstrNo.
     *
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * Setter method for stgInstrNo.
     *
     * @param stgInstrNo Set for stgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }
}
