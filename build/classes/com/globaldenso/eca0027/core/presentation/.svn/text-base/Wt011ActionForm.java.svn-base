/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt011ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Country Search Sub Screen. <br />
 * 国選択子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt011ActionForm extends AbstractActionForm {

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
    private Wt011CriteriaDomain wt011CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<? extends Wt011ListDomain> wt011ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt011ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public Wt011CriteriaDomain getWt011CriteriaDomain() {
        if (wt011CriteriaDomain == null) {
            wt011CriteriaDomain = new Wt011CriteriaDomain();
        }
        return wt011CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setWt011CriteriaDomain(Wt011CriteriaDomain criteriaDomain) {
        this.wt011CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends Wt011ListDomain> getWt011ListDomainList() {
        return wt011ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setWt011ListDomainList(List<? extends Wt011ListDomain> listDomainList) {
        this.wt011ListDomainList = listDomainList;
    }

}
