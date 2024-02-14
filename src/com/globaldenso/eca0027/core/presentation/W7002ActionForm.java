/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import com.globaldenso.eca0027.core.business.domain.W7002CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Shipping Actuality Header screen.
 * <br />船積実績Header画面のアクション・フォームです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W7002ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W7002CriteriaDomain w7002CriteriaDomain;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7002ActionForm() {
        w7002CriteriaDomain = new W7002CriteriaDomain();
    }

    /**
     * Getter method for w7002CriteriaDomain.
     *
     * @return the w7002CriteriaDomain
     */
    public W7002CriteriaDomain getW7002CriteriaDomain() {
        return w7002CriteriaDomain;
    }

    /**
     * Setter method for w7002CriteriaDomain.
     *
     * @param criteriaDomain Set for w7002CriteriaDomain
     */
    public void setW7002CriteriaDomain(W7002CriteriaDomain criteriaDomain) {
        w7002CriteriaDomain = criteriaDomain;
    }
}
