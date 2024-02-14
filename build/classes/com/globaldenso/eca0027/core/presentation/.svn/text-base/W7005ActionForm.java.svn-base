/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import org.apache.struts.upload.FormFile;

import com.globaldenso.eca0027.core.business.domain.W7005CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for B / L Update screen.
 * <br />船荷証券更新画面のアクション・フォームです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7682 $
 */
public class W7005ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private W7005CriteriaDomain w7005CriteriaDomain;
    
    /**
     * Upload Form File
     */
    private FormFile formFileData;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W7005ActionForm() {
        w7005CriteriaDomain = new W7005CriteriaDomain();
    }

    /**
     * Getter method for w7005CriteriaDomain.
     *
     * @return the w7005CriteriaDomain
     */
    public W7005CriteriaDomain getW7005CriteriaDomain() {
        return w7005CriteriaDomain;
    }

    /**
     * Setter method for w7005CriteriaDomain.
     *
     * @param criteriaDomain Set for w7005CriteriaDomain
     */
    public void setW7005CriteriaDomain(W7005CriteriaDomain criteriaDomain) {
        w7005CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for formFileData.
     *
     * @return the formFileData
     */
    public FormFile getFormFileData() {
        return formFileData;
    }

    /**
     * Setter method for formFileData.
     *
     * @param formFileData Set for formFileData
     */
    public void setFormFileData(FormFile formFileData) {
        this.formFileData = formFileData;
    }
}
