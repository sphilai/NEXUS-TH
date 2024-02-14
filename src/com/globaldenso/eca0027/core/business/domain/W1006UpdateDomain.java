/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that is for updating of a Palletize-Instruction Register screen.
 * <br />梱包指示Register画面の一括更新ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1006UpdateDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * The search-condition domain of a Palletize-Instruction Register screen
     * <br />梱包指示Register画面の検索条件ドメイン
     */
    private W1006CriteriaDomain criteriaDomain;

    /**
     * The List domain of a Palletize-Instruction Register screen
     * <br />梱包指示Register画面のListドメイン
     */
    private List<? extends W1006ListDomain> listDomainList;

    /**
     * Date format (for screen display)
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    /**
     * UserName
     * <br />日付フォーマット (画面表示用)
     */
    private String userName;
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public W1006UpdateDomain() {
    }

    /**
     * <p>Getter method for userName.</p>
     *
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>Setter method for userName.</p>
     *
     * @param userName Set for userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W1006CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W1006CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W1006ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W1006ListDomain> listDomainList) {
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