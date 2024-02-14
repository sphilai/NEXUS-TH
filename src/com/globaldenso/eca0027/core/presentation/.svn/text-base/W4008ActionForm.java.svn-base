/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.CHECK_OFF;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.PAGE_MAX_COUNT;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMapping;

import com.globaldenso.eca0027.core.business.domain.W4008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4008ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Staging Actuality Register Screen
 * <br />山作り実績Register画面のアクションフォームクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4008ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Header infomation for Staging Actuality
     */
    private W4008CriteriaDomain w4008CriteriaDomain;

    /**
     * Palletize list included in Staging Actuality
     */
    private List<? extends W4008ListDomain> w4008ListDomainList;

    /**
     * Staging actuality no that is selected in the search results area.
     */
    private String stgActNo;

    /**
     * constructor.
     */
    public W4008ActionForm() {
        // number of lines to be displayed on one page
        // 1ページの表示行数
        super.setCountPerPage(PAGE_MAX_COUNT);
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W4008CriteriaDomain getW4008CriteriaDomain() {
        if (w4008CriteriaDomain == null) {
            w4008CriteriaDomain = new W4008CriteriaDomain();
        }
        return w4008CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW4008CriteriaDomain(W4008CriteriaDomain criteriaDomain) {
        this.w4008CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W4008ListDomain> getW4008ListDomainList() {
        return w4008ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setW4008ListDomainList(List<? extends W4008ListDomain> listDomainList) {
        this.w4008ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @param index array index no
     * @return the listDomainList
     */
    @SuppressWarnings("unchecked")
    public W4008ListDomain getW4008ListDomain(int index) {
        if (w4008ListDomainList == null) {
            w4008ListDomainList = new ArrayList<W4008ListDomain>();
        }
        for (int i = w4008ListDomainList.size(); i <= index; i++ ) {
            ((List<W4008ListDomain>)w4008ListDomainList).add(new W4008ListDomain());
        }
        return w4008ListDomainList.get(index);
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

    /**
     * {@inheritDoc}
     * 
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w4008ListDomainList == null) {
            return;
        }
        for (W4008ListDomain w4008ListDomain : w4008ListDomainList) {
            w4008ListDomain.setSelected(CHECK_OFF);
        }
    }
}
