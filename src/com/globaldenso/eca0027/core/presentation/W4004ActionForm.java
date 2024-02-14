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

import com.globaldenso.eca0027.core.business.domain.W4004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4004ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Staging Instruction Register Screen
 * <br />荷揃え指示Register画面のアクションフォームクラスです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4004ActionForm extends AbstractActionForm {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Header infomation for Staging Instruction
     */
    private W4004CriteriaDomain w4004CriteriaDomain;

    /**
     * Palletize list included in Staging Instruction
     */
    private List<? extends W4004ListDomain> w4004ListDomainList;

    /**
     * Staging instruction no that is selected in the search results area.
     */
    private String stgInstrNo;

    /**
     * constructor.
     */
    public W4004ActionForm() {
        // number of lines to be displayed on one page
        // 1ページの表示行数
        super.setCountPerPage(PAGE_MAX_COUNT);
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W4004CriteriaDomain getW4004CriteriaDomain() {
        if (w4004CriteriaDomain == null) {
            w4004CriteriaDomain = new W4004CriteriaDomain();
        }
        return w4004CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setW4004CriteriaDomain(W4004CriteriaDomain criteriaDomain) {
        this.w4004CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W4004ListDomain> getW4004ListDomainList() {
        return w4004ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setW4004ListDomainList(List<? extends W4004ListDomain> listDomainList) {
        this.w4004ListDomainList = listDomainList;
    }

    /**
     * Getter method for listDomainList.
     * 
     * @param index array index no
     * @return the listDomainList
     */
    @SuppressWarnings("unchecked")
    public W4004ListDomain getW4004ListDomain(int index) {
        if (w4004ListDomainList == null) {
            w4004ListDomainList = new ArrayList<W4004ListDomain>();
        }
        for (int i = w4004ListDomainList.size(); i <= index; i++ ) {
            ((List<W4004ListDomain>)w4004ListDomainList).add(new W4004ListDomain());
        }
        return w4004ListDomainList.get(index);
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

    /**
     * {@inheritDoc}
     * 
     * @see org.apache.struts.action.ActionForm#reset(org.apache.struts.action.ActionMapping,
     *      javax.servlet.http.HttpServletRequest)
     */
    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {
        if (w4004ListDomainList == null) {
            return;
        }
        for (W4004ListDomain w4004ListDomain : w4004ListDomainList) {
            w4004ListDomain.setSelected(CHECK_OFF);
        }
    }
}
