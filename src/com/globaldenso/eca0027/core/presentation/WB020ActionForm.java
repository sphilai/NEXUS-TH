/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import org.apache.struts.upload.FormFile;

import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form for Order Upload screen.
 * <br />受注アップロード画面のアクション・フォームです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13539 $
 */
public class WB020ActionForm extends AbstractActionForm {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Conditions domain
     * <br />条件ドメイン
     */
    private WB020OdrUploadReqDomain wb020CriteriaDomain;
    
    /**
     * Search result list
     * <br />検索結果リスト
     */
    private List<? extends WB020OdrUploadReqDomain> wb020ListDomainList;

    /**
     * Upload Form File
     */
    private FormFile formFileData;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WB020ActionForm() {
        wb020CriteriaDomain = new WB020OdrUploadReqDomain();
    }

    /**
     * Getter method for wb020CriteriaDomain.
     *
     * @return the wb020CriteriaDomain
     */
    public WB020OdrUploadReqDomain getWb020CriteriaDomain() {
        return wb020CriteriaDomain;
    }

    /**
     * Setter method for wb020CriteriaDomain.
     *
     * @param wb020CriteriaDomain Set for wb020CriteriaDomain
     */
    public void setWb020CriteriaDomain(
        WB020OdrUploadReqDomain wb020CriteriaDomain) {
        this.wb020CriteriaDomain = wb020CriteriaDomain;
    }

    /**
     * Getter method for wb020ListDomainList.
     *
     * @return the wb020ListDomainList
     */
    public List<? extends WB020OdrUploadReqDomain> getWb020ListDomainList() {
        return wb020ListDomainList;
    }

    /**
     * Setter method for wb020ListDomainList.
     *
     * @param wb020ListDomainList Set for wb020ListDomainList
     */
    public void setWb020ListDomainList(
        List<? extends WB020OdrUploadReqDomain> wb020ListDomainList) {
        this.wb020ListDomainList = wb020ListDomainList;
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
