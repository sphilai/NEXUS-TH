/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt005ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CML Info Sub Screen. <br />
 * CML Info表示子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt005ActionForm extends AbstractActionForm {

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
    private Wt005CriteriaDomain wt005CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<Wt005ListDomain> wt005ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt005ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }
    /**
     * <p>Getter method for criteriaDomain.</p>
     *
     * @return the criteriaDomain
     */
    public Wt005CriteriaDomain getWt005CriteriaDomain() {
        if (wt005CriteriaDomain == null) {
            wt005CriteriaDomain = new Wt005CriteriaDomain();
        }
        return wt005CriteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setWt005CriteriaDomain(Wt005CriteriaDomain criteriaDomain) {
        this.wt005CriteriaDomain = criteriaDomain;
    }

    /**
     * <p>Getter method for listDomainList.</p>
     *
     * @return the listDomainList
     */
    public List<Wt005ListDomain> getWt005ListDomainList() {
        return wt005ListDomainList;
    }

    /**
     * <p>Setter method for listDomainList.</p>
     *
     * @param listDomainList Set for listDomainList
     */
    public void setWt005ListDomainList(List<Wt005ListDomain> listDomainList) {
        this.wt005ListDomainList = listDomainList;
    }



}
