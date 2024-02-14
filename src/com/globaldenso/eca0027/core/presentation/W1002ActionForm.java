/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import com.globaldenso.eca0027.core.business.domain.W1002CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class for Export Request Header screen.
 * <br />梱包指示Header画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W1002ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * FromScreenId
     * 
     */
    private String fromScreenId;
    
    /**
     * Search-condition domain
     * <br />検索条件ドメイン
     */
    private W1002CriteriaDomain w1002CriteriaDomain;
    
    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;
    
    /**
     * Registration mode flag (for screen)
     * <br />登録モードフラグ (画面用)
     */
    private boolean registerFlg;
    
    /**
     * Cancel mode flag (for screen)
     * <br />登録モードフラグ (画面用)
     */
    private boolean cancelFlg;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public W1002ActionForm() {
        w1002CriteriaDomain = new W1002CriteriaDomain();
    }
    
    /**
     * <p>Getter method for fromScreenId.</p>
     *
     * @return the fromScreenId
     */
    public String getFromScreenId() {
        return fromScreenId;
    }

    /**
     * <p>Setter method for fromScreenId.</p>
     *
     * @param fromScreenId Set for fromScreenId
     */
    public void setFromScreenId(String fromScreenId) {
        this.fromScreenId = fromScreenId;
    }

    /**
     * Getter method for w1002CriteriaDomain.
     *
     * @return the w1002CriteriaDomain
     */
    public W1002CriteriaDomain getW1002CriteriaDomain() {
        return w1002CriteriaDomain;
    }

    /**
     * Setter method for w1002CriteriaDomain.
     *
     * @param w1002CriteriaDomain Set for w1002CriteriaDomain
     */
    public void setW1002CriteriaDomain(W1002CriteriaDomain w1002CriteriaDomain) {
        this.w1002CriteriaDomain = w1002CriteriaDomain;
    }
    
    /**
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }
    
    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }

    /**
     * Getter method for registerFlg.
     *
     * @return the registerFlg
     */
    public boolean isRegisterFlg() {
        return registerFlg;
    }

    /**
     * Setter method for registerFlg.
     *
     * @param registerFlg Set for registerFlg
     */
    public void setRegisterFlg(boolean registerFlg) {
        this.registerFlg = registerFlg;
    }

    /**
     * Getter method for cancelFlg.
     *
     * @return the cancelFlg
     */
    public boolean isCancelFlg() {
        return cancelFlg;
    }

    /**
     * Setter method for cancelFlg.
     *
     * @param cancelFlg Set for cancelFlg
     */
    public void setCancelFlg(boolean cancelFlg) {
        this.cancelFlg = cancelFlg;
    }
}
