/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt014CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt014ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Ship to Search Sub Screen. <br />
 * 送荷先選択子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt014ActionForm extends AbstractActionForm {

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
    private Wt014CriteriaDomain wt014CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<? extends Wt014ListDomain> wt014ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt014ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public Wt014CriteriaDomain getWt014CriteriaDomain() {
        if (wt014CriteriaDomain == null) {
            wt014CriteriaDomain = new Wt014CriteriaDomain();
        }
        return wt014CriteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setWt014CriteriaDomain(Wt014CriteriaDomain criteriaDomain) {
        this.wt014CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends Wt014ListDomain> getWt014ListDomainList() {
        return wt014ListDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setWt014ListDomainList(List<? extends Wt014ListDomain> listDomainList) {
        this.wt014ListDomainList = listDomainList;
    }

}
