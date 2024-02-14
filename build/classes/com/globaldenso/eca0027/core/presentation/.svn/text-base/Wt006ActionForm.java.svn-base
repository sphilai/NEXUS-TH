/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.Wt006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt006ListDomain;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of Outer Package Search Sub Screen.
 * <br />外装選択子画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt006ActionForm extends AbstractActionForm {

    /**
     * <p>
     * Serial version ID.
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * select radio button/選択されたラジオボタン
     */
    private String ck;
    
    /**
     * <p>
     * Domain for search criteria.
     * </p>
     */
    private Wt006CriteriaDomain wt006CriteriaDomain;

    /**
     * <p>
     * Domain for search results list.
     * </p>
     */
    private List<Wt006ListDomain> wt006ListDomainList;

    /**
     * <p>
     * Default constructor.
     * </p>
     */
    public Wt006ActionForm() {
        super();
        // 1ページの表示行数
        super.setCountPerPage(Eca0027Constants.SUB_SCREEN_PAGE_MAX_COUNT);
    }

    /**
     * <p>Getter method for ck.</p>
     *
     * @return the ck
     */
    public String getCk() {
        return ck;
    }

    /**
     * <p>Setter method for ck.</p>
     *
     * @param ck Set for ck
     */
    public void setCk(String ck) {
        this.ck = ck;
    }

    /**
     * <p>Getter method for wt006CriteriaDomain.</p>
     *
     * @return the wt006CriteriaDomain
     */
    public Wt006CriteriaDomain getWt006CriteriaDomain() {
        if (wt006CriteriaDomain == null) {
            wt006CriteriaDomain = new Wt006CriteriaDomain();
        }
        return wt006CriteriaDomain;
    }

    /**
     * <p>Setter method for wt006CriteriaDomain.</p>
     *
     * @param wt006CriteriaDomain Set for wt006CriteriaDomain
     */
    public void setWt006CriteriaDomain(Wt006CriteriaDomain wt006CriteriaDomain) {
        this.wt006CriteriaDomain = wt006CriteriaDomain;
    }

    /**
     * <p>Getter method for wt006ListDomainList.</p>
     *
     * @return the wt006ListDomainList
     */
    public List<Wt006ListDomain> getWt006ListDomainList() {
        return wt006ListDomainList;
    }

    /**
     * <p>Setter method for wt006ListDomainList.</p>
     *
     * @param wt006ListDomainList Set for wt006ListDomainList
     */
    public void setWt006ListDomainList(List<Wt006ListDomain> wt006ListDomainList) {
        this.wt006ListDomainList = wt006ListDomainList;
    }


}
