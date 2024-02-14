/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt008ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Port Search Sub Screen. <br />
 * 港選択子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt008ActionForm extends AbstractActionForm {

    /**
     * <p>
     * Serial version ID.
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Domain for search criteria.
     * </p>
     */
    private Wt008CriteriaDomain wt008CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<Wt008ListDomain> wt008ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt008ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }

    /**
     * <p>Getter method for wt008CriteriaDomain.</p>
     *
     * @return the wt008CriteriaDomain
     */
    public Wt008CriteriaDomain getWt008CriteriaDomain() {
        if (wt008CriteriaDomain == null) {
            wt008CriteriaDomain = new Wt008CriteriaDomain();
        }
        return wt008CriteriaDomain;
    }

    /**
     * <p>Setter method for wt008CriteriaDomain.</p>
     *
     * @param wt008CriteriaDomain Set for wt008CriteriaDomain
     */
    public void setWt008CriteriaDomain(Wt008CriteriaDomain wt008CriteriaDomain) {
        this.wt008CriteriaDomain = wt008CriteriaDomain;
    }

    /**
     * <p>Getter method for wt008ListDomainList.</p>
     *
     * @return the wt008ListDomainList
     */
    public List<Wt008ListDomain> getWt008ListDomainList() {
        return wt008ListDomainList;
    }

    /**
     * <p>Setter method for wt008ListDomainList.</p>
     *
     * @param wt008ListDomainList Set for wt008ListDomainList
     */
    public void setWt008ListDomainList(List<Wt008ListDomain> wt008ListDomainList) {
        this.wt008ListDomainList = wt008ListDomainList;
    }

}
