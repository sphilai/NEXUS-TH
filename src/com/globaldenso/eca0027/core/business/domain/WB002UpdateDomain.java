/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a domain for an update of ordering registration picture.
 * <br />受注登録画面の更新用ドメインです。
 *
 * @version $Revision: 5759 $
 */
public class WB002UpdateDomain extends AbstractDomain {

    /**
     * serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * The search-condition domain of an ordering registration Register screen
     * <br />受注登録Register画面の検索条件ドメイン
     */
    private WB002CriteriaDomain criteriaDomain;

    /**
     * The list of List domains
     * <br />Listドメインのリスト
     */
    private List<WB002ListDomain> listDomainList;

    /**
     * The list of UpdateList domains
     * <br />UpdateListドメインのリスト
     */
    private List<WB002ListDomain> updateListDomainList;

    /**
     * Date format (for screen display)  
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public WB002UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public WB002CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(WB002CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<WB002ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<WB002ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for updateListDomainList.
     *
     * @return the updateListDomainList
     */
    public List<WB002ListDomain> getUpdateListDomainList() {
        return updateListDomainList;
    }

    /**
     * Setter method for updateListDomainList.
     *
     * @param updateListDomainList Set for updateListDomainList
     */
    public void setUpdateListDomainList(List<WB002ListDomain> updateListDomainList) {
        this.updateListDomainList = updateListDomainList;
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