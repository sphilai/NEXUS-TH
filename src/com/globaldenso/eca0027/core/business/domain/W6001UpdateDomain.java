/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * Update of Invoice Main screen.
 * <br />Invoice Main 画面の一括更新ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W6001UpdateDomain extends AbstractDomain {
   
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * W6001 search condition domain<br />
     * W6001検索条件ドメイン
     */
    private W6001CriteriaDomain w6001CriteriaDomain;

    /**
     * List of search results W6001 domain<br />
     * W6001検索結果ドメインのリスト
     */
    private List<? extends W6001ListDomain> listDomainList;
    
    /**
     * DSC-ID/DSC-ID
     */
    private String dscId;

    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W6001UpdateDomain() {
        super();
    }

    /**
     * Getter method for w6001CriteriaDomain.
     *
     * @return the w6001CriteriaDomain
     */
    public W6001CriteriaDomain getW6001CriteriaDomain() {
        return w6001CriteriaDomain;
    }

    /**
     * Setter method for w6001CriteriaDomain.
     *
     * @param criteriaDomain Set for w6001CriteriaDomain
     */
    public void setW6001CriteriaDomain(W6001CriteriaDomain criteriaDomain) {
        w6001CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W6001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W6001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
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
