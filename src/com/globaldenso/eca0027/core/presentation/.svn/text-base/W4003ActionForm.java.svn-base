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

import com.globaldenso.eca0027.core.business.domain.W4003CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4003ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Staging Instruction Create Screen
 * <br />荷揃え指示Create画面のアクションフォームクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4003ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search criteria for palletize.
     */
    private W4003CriteriaDomain w4003CriteriaDomain;

    /**
     * Search result list of palletize.
     */
    private List<? extends W4003ListDomain> w4003ListDomainList;

    /**
     * constructor.
     */
    public W4003ActionForm() {
        // number of lines to be displayed on one page
        // 1ページの表示行数
        super.setCountPerPage(PAGE_MAX_COUNT);
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W4003CriteriaDomain getW4003CriteriaDomain() {
        if (w4003CriteriaDomain == null) {
            w4003CriteriaDomain = new W4003CriteriaDomain();
        }
        return w4003CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW4003CriteriaDomain(W4003CriteriaDomain criteriaDomain) {
        this.w4003CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W4003ListDomain> getW4003ListDomainList() {
        return w4003ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setW4003ListDomainList(List<? extends W4003ListDomain> listDomainList) {
        this.w4003ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @param index array index no
     * @return the listDomainList
     */
    @SuppressWarnings("unchecked")
    public W4003ListDomain getW4003ListDomain(int index) {
        if (w4003ListDomainList == null) {
            w4003ListDomainList = new ArrayList<W4003ListDomain>();
        }
        for (int i = w4003ListDomainList.size(); i <= index; i++ ) {
            ((List<W4003ListDomain>)w4003ListDomainList).add(new W4003ListDomain());
        }
        return w4003ListDomainList.get(index);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w4003ListDomainList == null) {
            return;
        }
        for (W4003ListDomain w4003ListDomain : w4003ListDomainList) {
            w4003ListDomain.setSelected(CHECK_OFF);
        }
    }
}
