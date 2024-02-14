/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt010ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Warehouse Search Sub Screen. <br />
 * 倉庫選択子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt010ActionForm extends AbstractActionForm {

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
    private Wt010CriteriaDomain wt010CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<Wt010ListDomain> wt010ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt010ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }

    /**
     * <p>Getter method for wt010CriteriaDomain.</p>
     *
     * @return the wt010CriteriaDomain
     */
    public Wt010CriteriaDomain getWt010CriteriaDomain() {
        if (wt010CriteriaDomain == null) {
            wt010CriteriaDomain = new Wt010CriteriaDomain();
        }
        return wt010CriteriaDomain;
    }

    /**
     * <p>Setter method for wt010CriteriaDomain.</p>
     *
     * @param wt010CriteriaDomain Set for wt010CriteriaDomain
     */
    public void setWt010CriteriaDomain(Wt010CriteriaDomain wt010CriteriaDomain) {
        this.wt010CriteriaDomain = wt010CriteriaDomain;
    }

    /**
     * <p>Getter method for wt010ListDomainList.</p>
     *
     * @return the wt010ListDomainList
     */
    public List<Wt010ListDomain> getWt010ListDomainList() {
        return wt010ListDomainList;
    }

    /**
     * <p>Setter method for wt010ListDomainList.</p>
     *
     * @param wt010ListDomainList Set for wt010ListDomainList
     */
    public void setWt010ListDomainList(List<Wt010ListDomain> wt010ListDomainList) {
        this.wt010ListDomainList = wt010ListDomainList;
    }

}
