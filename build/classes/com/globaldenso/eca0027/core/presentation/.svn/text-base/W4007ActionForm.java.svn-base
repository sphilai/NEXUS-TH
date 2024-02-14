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

import com.globaldenso.eca0027.core.business.domain.W4007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4007ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Staging Actuality Create Screen
 * <br />山作り実績Create画面のアクションフォームクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4007ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search criteria for palletize.
     */
    private W4007CriteriaDomain w4007CriteriaDomain;

    /**
     * Search result list of palletize.
     */
    private List<? extends W4007ListDomain> w4007ListDomainList;

    /**
     * constructor.
     */
    public W4007ActionForm() {
        // number of lines to be displayed on one page
        // 1ページの表示行数
        super.setCountPerPage(PAGE_MAX_COUNT);
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W4007CriteriaDomain getW4007CriteriaDomain() {
        if (w4007CriteriaDomain == null) {
            w4007CriteriaDomain = new W4007CriteriaDomain();
        }
        return w4007CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW4007CriteriaDomain(W4007CriteriaDomain criteriaDomain) {
        this.w4007CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W4007ListDomain> getW4007ListDomainList() {
        return w4007ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setW4007ListDomainList(List<? extends W4007ListDomain> listDomainList) {
        this.w4007ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @param index array index no
     * @return the listDomainList
     */
    @SuppressWarnings("unchecked")
    public W4007ListDomain getW4007ListDomain(int index) {
        if (w4007ListDomainList == null) {
            w4007ListDomainList = new ArrayList<W4007ListDomain>();
        }
        for (int i = w4007ListDomainList.size(); i <= index; i++ ) {
            ((List<W4007ListDomain>)w4007ListDomainList).add(new W4007ListDomain());
        }
        return w4007ListDomainList.get(index);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w4007ListDomainList == null) {
            return;
        }
        for (W4007ListDomain w4007ListDomain : w4007ListDomainList) {
            w4007ListDomain.setSelected(CHECK_OFF);
        }
    }
}
