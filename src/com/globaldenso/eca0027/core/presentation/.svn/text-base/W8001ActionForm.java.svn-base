/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W8001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W8001ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Action form of Progress Control Main screen.
 * <br />進度管理Main画面のアクション・フォームです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W8001ActionForm extends AbstractActionForm {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search conditions domain
     * <br />検索条件ドメイン
     */
    private W8001CriteriaDomain w8001CriteriaDomain;
    
    /**
     * List of search results domain
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W8001ListDomain> w8001ListDomainList;

    /**
     * Take over VALUE MAIN MARK
     * <br />引継値 メインマーク
     */
    private String cmlNo;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W8001ActionForm() {
        w8001CriteriaDomain = new W8001CriteriaDomain();
    }

    /**
     * Getter method for w8001CriteriaDomain.
     *
     * @return the w8001CriteriaDomain
     */
    public W8001CriteriaDomain getW8001CriteriaDomain() {
        return w8001CriteriaDomain;
    }

    /**
     * Setter method for w8001CriteriaDomain.
     *
     * @param criteriaDomain Set for w8001CriteriaDomain
     */
    public void setW8001CriteriaDomain(W8001CriteriaDomain criteriaDomain) {
        w8001CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for w8001ListDomainList.
     *
     * @return the w8001ListDomainList
     */
    public List<? extends W8001ListDomain> getW8001ListDomainList() {
        return w8001ListDomainList;
    }

    /**
     * Setter method for w8001ListDomainList.
     *
     * @param listDomainList Set for w8001ListDomainList
     */
    public void setW8001ListDomainList(
        List<? extends W8001ListDomain> listDomainList) {
        w8001ListDomainList = listDomainList;
    }

    /**
     * Getter method for cmlNo.
     *
     * @return the cmlNo
     */
    public String getCmlNo() {
        return cmlNo;
    }

    /**
     * Setter method for cmlNo.
     *
     * @param cmlNo Set for cmlNo
     */
    public void setCmlNo(String cmlNo) {
        this.cmlNo = cmlNo;
    }
}
