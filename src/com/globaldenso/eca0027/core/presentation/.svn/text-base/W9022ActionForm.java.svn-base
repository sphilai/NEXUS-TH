/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W9022CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * 
 * <br />Invoice Template MA Inquiry画面のアクション・フォームです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6762 $
 */
public class W9022ActionForm extends AbstractActionForm {
    
    /**
     * The action form of Invoice Template MA Inquiry screen.
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W9022CriteriaDomain w9022CriteriaDomain;
    
    /**
     * List of search results domain
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W9022ListDomain> listDomainList;
    
    /**
     * Search results display area flag
     * <br />検索結果エリア表示フラグ
     */
    private boolean displayList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9022ActionForm() {
        w9022CriteriaDomain = new W9022CriteriaDomain();
    }

    /**
     * Getter method for w9022CriteriaDomain.
     *
     * @return the w9022CriteriaDomain
     */
    public W9022CriteriaDomain getW9022CriteriaDomain() {
        return w9022CriteriaDomain;
    }

    /**
     * Setter method for w9022CriteriaDomain.
     *
     * @param criteriaDomain Set for w9022CriteriaDomain
     */
    public void setW9022CriteriaDomain(W9022CriteriaDomain criteriaDomain) {
        w9022CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W9022ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W9022ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for displayList.
     *
     * @return the displayList
     */
    public boolean isDisplayList() {
        return displayList;
    }

    /**
     * Setter method for displayList.
     *
     * @param displayList Set for displayList
     */
    public void setDisplayList(boolean displayList) {
        this.displayList = displayList;
    }
}
