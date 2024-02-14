/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of transition / deletion of the CIGMA W/H X-Reference MA screen.
 * <br/>CIGMA W/H X-Reference MA画面の遷移・削除用ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9014UpdateDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * select radio button/選択されたラジオボタン
     */
    private String ck;

    /**
     * Domain for search criteria/検索条件ドメイン
     */
    private W9014CriteriaDomain w9014CriteriaDomain;

    /**
     * listDomainList/検索結果ドメインのリスト
     */
    private List<? extends W9014ListDomain> w9014ListDomainList;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014UpdateDomain() {
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
     * <p>Getter method for w9014CriteriaDomain.</p>
     *
     * @return the w9014CriteriaDomain
     */
    public W9014CriteriaDomain getW9014CriteriaDomain() {
        return w9014CriteriaDomain;
    }

    /**
     * <p>Setter method for w9014CriteriaDomain.</p>
     *
     * @param criteriaDomain Set for w9014CriteriaDomain
     */
    public void setW9014CriteriaDomain(W9014CriteriaDomain criteriaDomain) {
        w9014CriteriaDomain = criteriaDomain;
    }

    /**
     * <p>Getter method for w9014ListDomainList.</p>
     *
     * @return the w9014ListDomainList
     */
    public List<? extends W9014ListDomain> getW9014ListDomainList() {
        return w9014ListDomainList;
    }

    /**
     * <p>Setter method for w9014ListDomainList.</p>
     *
     * @param listDomainList Set for w9014ListDomainList
     */
    public void setW9014ListDomainList(List<? extends W9014ListDomain> listDomainList) {
        w9014ListDomainList = listDomainList;
    }

}
