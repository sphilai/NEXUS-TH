/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import com.globaldenso.eca0027.core.business.domain.W2002CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for Packaging Instruction Header screen.
 * <br />梱包指示Header画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2002ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W2002CriteriaDomain w2002CriteriaDomain;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W2002ActionForm() {
        w2002CriteriaDomain = new W2002CriteriaDomain();
    }

    /**
     * Getter method for w2002CriteriaDomain.
     *
     * @return the w2002CriteriaDomain
     */
    public W2002CriteriaDomain getW2002CriteriaDomain() {
        return w2002CriteriaDomain;
    }

    /**
     * Setter method for w2002CriteriaDomain.
     *
     * @param w2002CriteriaDomain Set for w2002CriteriaDomain
     */
    public void setW2002CriteriaDomain(W2002CriteriaDomain w2002CriteriaDomain) {
        this.w2002CriteriaDomain = w2002CriteriaDomain;
    }
}
