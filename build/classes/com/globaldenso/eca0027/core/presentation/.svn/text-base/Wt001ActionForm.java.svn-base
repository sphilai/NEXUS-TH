/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt001ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Company Search Sub Screen. <br />
 * 会社選択子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt001ActionForm extends AbstractActionForm {

    /**
     * <p>
     * Serial version ID。
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Domain for search criteria.
     * </p>
     */
    private Wt001CriteriaDomain wt001CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<Wt001ListDomain> wt001ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt001ActionForm() {
        super();
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }

    /**
     * <p>Getter method for wt001CriteriaDomain.</p>
     *
     * @return the wt001CriteriaDomain
     */
    public Wt001CriteriaDomain getWt001CriteriaDomain() {
        if (wt001CriteriaDomain == null) {
            wt001CriteriaDomain = new Wt001CriteriaDomain();
        }
        return wt001CriteriaDomain;
    }

    /**
     * <p>Setter method for wt001CriteriaDomain.</p>
     *
     * @param wt001CriteriaDomain Set for wt001CriteriaDomain
     */
    public void setWt001CriteriaDomain(Wt001CriteriaDomain wt001CriteriaDomain) {
        this.wt001CriteriaDomain = wt001CriteriaDomain;
    }

    /**
     * <p>Getter method for wt001ListDomainList.</p>
     *
     * @return the wt001ListDomainList
     */
    public List<Wt001ListDomain> getWt001ListDomainList() {
        return wt001ListDomainList;
    }

    /**
     * <p>Setter method for wt001ListDomainList.</p>
     *
     * @param wt001ListDomainList Set for wt001ListDomainList
     */
    public void setWt001ListDomainList(List<Wt001ListDomain> wt001ListDomainList) {
        this.wt001ListDomainList = wt001ListDomainList;
    }

}
