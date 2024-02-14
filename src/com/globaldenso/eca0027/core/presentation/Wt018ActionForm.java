/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt018ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Container No. Info Sub Screen. <br />
 * Container No. Info表示子画面のアクションフォームクラスです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class Wt018ActionForm extends AbstractActionForm {
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
    private Wt018CriteriaDomain wt018CriteriaDomain = null;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<Wt018ListDomain> wt018ListDomainList = null;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt018ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }

    /**
     * <p>wt018CriteriaDomain のゲッターメソッドです。</p>
     *
     * @return the wt018CriteriaDomain
     */
    public Wt018CriteriaDomain getWt018CriteriaDomain() {
        if (wt018CriteriaDomain == null) {
            wt018CriteriaDomain = new Wt018CriteriaDomain();
        }
        return wt018CriteriaDomain;
    }

    /**
     * <p>wt018CriteriaDomain のセッターメソッドです。</p>
     *
     * @param wt018CriteriaDomain wt018CriteriaDomain に設定する
     */
    public void setWt018CriteriaDomain(Wt018CriteriaDomain wt018CriteriaDomain) {
        this.wt018CriteriaDomain = wt018CriteriaDomain;
    }

    /**
     * <p>wt018ListDomainList のゲッターメソッドです。</p>
     *
     * @return the wt018ListDomainList
     */
    public List<Wt018ListDomain> getWt018ListDomainList() {
        return wt018ListDomainList;
    }

    /**
     * <p>wt018ListDomainList のセッターメソッドです。</p>
     *
     * @param wt018ListDomainList wt018ListDomainList に設定する
     */
    public void setWt018ListDomainList(List<Wt018ListDomain> wt018ListDomainList) {
        this.wt018ListDomainList = wt018ListDomainList;
    }
    
}
