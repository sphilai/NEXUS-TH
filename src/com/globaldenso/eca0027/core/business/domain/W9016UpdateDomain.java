/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of Update Export Shipping Parts Special Information MA Inquiry screen.
 * <br />Export Shipping Parts Special Information MA Inquiry画面のUpdateドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9016UpdateDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     */
    private W9016CriteriaDomain criteriaDomain;
    
    /**
     * List of list domain<br />
     * Listドメインのリスト
     */
    private List<? extends W9016ListDomain> listDomainList;
    
    /**
     * Date format (for screen)<br />
     * 日付フォーマット (画面用)
     */
    private String screenDateFormat;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W9016CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W9016CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W9016ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W9016ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

}
