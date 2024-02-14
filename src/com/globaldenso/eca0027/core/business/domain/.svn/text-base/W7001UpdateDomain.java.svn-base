/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * Domain in which updating the Shipping Actuality Main screen.<br />
 * Shipping Actuality Main 画面の更新ドメインです。
 *
 * @author $Author$
 * @version $Revision$
 */
public class W7001UpdateDomain extends AbstractDomain  {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * List of domain W7001List<br />
     * W7001Listドメインのリスト
     */
    private List<? extends W7001ListDomain> listDomainList;
    
    /**
     * update Count
     */
    private int updateCount;

    /**
     * date format (to display the document with business form) <br />
     * 日付フォーマット (画面表示用)
     * NL021 ADD
     */
    private String screenDateFormat;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7001UpdateDomain() {
    }

    /**
     * <p>listDomainList のゲッターメソッドです。</p>
     *
     * @return the listDomainList
     */
    public List<? extends W7001ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>listDomainList のセッターメソッドです。</p>
     *
     * @param listDomainList listDomainList に設定する
     */
    public void setListDomainList(List<? extends W7001ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * <p>updateCount のゲッターメソッドです。</p>
     *
     * @return the updateCount
     */
    public int getUpdateCount() {
        return updateCount;
    }

    /**
     * <p>updateCount のセッターメソッドです。</p>
     *
     * @param updateCount updateCount に設定する
     */
    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * Getter method of screenDateFormat.
     *
     * @return the screenDateFormat.
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method of screenDateFormat.
     *
     * @param screenDateFormat Value to be stored in screenDateFormat.
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }
    
}
