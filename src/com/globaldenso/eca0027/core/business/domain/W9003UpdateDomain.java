/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of Agent MA Edit screen.
 * <br />Agent MA Edit画面のドメインです。
 *
 * @version $Revision: 7765 $
 */
public class W9003UpdateDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search conditions domain of the screen<br />
     * 画面の検索条件ドメイン
     */
    private W9003CriteriaDomain criteriaDomain;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9003UpdateDomain() {
    }

    /**
     * Getter method for criteriaDomain.
     *
     * @return the criteriaDomain
     */
    public W9003CriteriaDomain getCriteriaDomain() {
        return criteriaDomain;
    }

    /**
     * Setter method for criteriaDomain.
     *
     * @param criteriaDomain Set for criteriaDomain
     */
    public void setCriteriaDomain(W9003CriteriaDomain criteriaDomain) {
        this.criteriaDomain = criteriaDomain;
    }
    
}
