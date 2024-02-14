/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of transition of the CIGMA W/H X-Reference MA screen.
 * <br/>CIGMA W/H X-Reference MA画面の一括更新ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class W9015UpdateDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Domain for search criteria/検索条件ドメイン
     */
    private W9015CriteriaDomain criteriaDomain;

    /**
     * select radio button/選択されたラジオボタン
     */
    private String ck;

    /**
     * Processing mode/処理モード
     */
    private String procMode;

    /**
     * listDomainList/検索結果ドメインのリスト
     */
    private List<? extends W9015ListDomain> listDomainList;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9015UpdateDomain() {
    }

    /**
     * <p>Getter method for criteriaDomain.</p>
     *
     * @return the criteriaDomain
     */
    public W9015CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * <p>Setter method for criteriaDomain.</p>
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W9015CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
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
     * <p>Getter method for procMode.</p>
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * <p>Setter method for procMode.</p>
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }

    /**
     * <p>Getter method for listDomainList.</p>
     *
     * @return the listDomainList
     */
    public List<? extends W9015ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * <p>Setter method for listDomainList.</p>
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W9015ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

}
