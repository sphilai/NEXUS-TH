/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W9013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9013ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Warehouse Search Screen. <br />
 * 倉庫検索画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9013ActionForm extends AbstractActionForm {

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
    private W9013CriteriaDomain w9013CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<W9013ListDomain> w9013ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public W9013ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.PAGE_MAX_COUNT);
    }

    /**
     * <p>Getter method for w9013CriteriaDomain.</p>
     *
     * @return the w9013CriteriaDomain
     */
    public W9013CriteriaDomain getW9013CriteriaDomain() {
        if (w9013CriteriaDomain == null) {
            w9013CriteriaDomain = new W9013CriteriaDomain();
        }
        return w9013CriteriaDomain;
    }

    /**
     * <p>Setter method for w9013CriteriaDomain.</p>
     *
     * @param criteriaDomain Set for w9013CriteriaDomain
     */
    public void setW9013CriteriaDomain(W9013CriteriaDomain criteriaDomain) {
        w9013CriteriaDomain = criteriaDomain;
    }

    /**
     * <p>Getter method for w9013ListDomainList.</p>
     *
     * @return the w9013ListDomainList
     */
    public List<W9013ListDomain> getW9013ListDomainList() {
        return w9013ListDomainList;
    }

    /**
     * <p>Setter method for w9013ListDomainList.</p>
     *
     * @param listDomainList Set for w9013ListDomainList
     */
    public void setW9013ListDomainList(List<W9013ListDomain> listDomainList) {
        w9013ListDomainList = listDomainList;
    }


}
