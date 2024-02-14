/*
 * Project : NEXUS_EXPORT 
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CML Info Sub Screen. <br />
 * 品番表示子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt007ActionForm extends AbstractActionForm {

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
    private Wt007CriteriaDomain wt007CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<Wt007ListDomain> wt007ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt007ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }
    /**
     * <p>Getter method for criteriaDomain.</p>
     *
     * @return the criteriaDomain
     */
    public Wt007CriteriaDomain getWt007CriteriaDomain() {
        if (wt007CriteriaDomain == null) {
            wt007CriteriaDomain = new Wt007CriteriaDomain();
        }
        return wt007CriteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setWt007CriteriaDomain(Wt007CriteriaDomain criteriaDomain) {
        this.wt007CriteriaDomain = criteriaDomain;
    }

    /**
     * <p>Getter method for listDomainList.</p>
     *
     * @return the listDomainList
     */
    public List<Wt007ListDomain> getWt007ListDomainList() {
        return wt007ListDomainList;
    }

    /**
     * <p>Setter method for listDomainList.</p>
     *
     * @param listDomainList Set for listDomainList
     */
    public void setWt007ListDomainList(List<Wt007ListDomain> listDomainList) {
        this.wt007ListDomainList = listDomainList;
    }



}
