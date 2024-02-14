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
 * This is a domain for an update of the Last Digit Change Register Screen.
 * <br />品番末尾変更登録画面の更新用ドメインです。
 *
 * @version $Revision: 5759 $
 */
public class WB007UpdateDomain extends AbstractDomain {

    /**
     * serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * WB007CriteriaDomain
     * <br />WB007CriteriaDomain
     */
    private WB007CriteriaDomain criteriaDomain;
    
    /**
     * The list of List domains
     * <br />Listドメインのリスト
     */
    private List<? extends WB007ListDomain> listDomainList;
    
    /**
     * Date format (for screen display)  
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * The counter for the update number preservation
     * <br />更新件数保存用カウンタ
     */
    private int[] countUpdData;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public WB007UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public WB007CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(WB007CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends WB007ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends WB007ListDomain> listDomainList) {
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
    
    /**
     * Getter method for countUpdData.
     *
     * @return the countUpdData
     */
    public int[] getCountUpdData() {
        return countUpdData;
    }

    /**
     * Setter method for countUpdData.
     *
     * @param countUpdData Set for countUpdData
     */
    public void setCountUpdData(int[] countUpdData) {
        this.countUpdData = countUpdData;
    }
}
