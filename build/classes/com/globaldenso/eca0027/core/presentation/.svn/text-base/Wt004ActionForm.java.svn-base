/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt004ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Package Search Sub Screen.
 * <br />包装材選択子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt004ActionForm extends AbstractActionForm {

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
    private Wt004CriteriaDomain wt004CriteriaDomain;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<Wt004ListDomain> wt004ListDomainList;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt004ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }

    /**
     * <p>Getter method for wt004CriteriaDomain.</p>
     *
     * @return the wt004CriteriaDomain
     */
    public Wt004CriteriaDomain getWt004CriteriaDomain() {
        if (wt004CriteriaDomain == null) {
            wt004CriteriaDomain = new Wt004CriteriaDomain();
        }
        return wt004CriteriaDomain;
    }

    /**
     * <p>Setter method for wt004CriteriaDomain.</p>
     *
     * @param wt004CriteriaDomain Set for wt004CriteriaDomain
     */
    public void setWt004CriteriaDomain(Wt004CriteriaDomain wt004CriteriaDomain) {
        this.wt004CriteriaDomain = wt004CriteriaDomain;
    }

    /**
     * <p>Getter method for wt004ListDomainList.</p>
     *
     * @return the wt004ListDomainList
     */
    public List<Wt004ListDomain> getWt004ListDomainList() {
        return wt004ListDomainList;
    }

    /**
     * <p>Setter method for wt004ListDomainList.</p>
     *
     * @param wt004ListDomainList Set for wt004ListDomainList
     */
    public void setWt004ListDomainList(List<Wt004ListDomain> wt004ListDomainList) {
        this.wt004ListDomainList = wt004ListDomainList;
    }

}
