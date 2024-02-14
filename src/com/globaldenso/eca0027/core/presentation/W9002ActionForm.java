/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W9002CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9002ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Action form of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面のアクション・フォームです。
 * 
 * @version $Revision: 7682 $
 */
public class W9002ActionForm extends AbstractActionForm {
    
    /**
     * Serial version ID.
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Search conditions domain
     * <br />検索条件ドメイン
     */
    private W9002CriteriaDomain w9002CriteriaDomain;
    
    /**
     * function no
     */
    private String functionNo;
    
    /**
     * Org Company
     */
    private String orgCompCd;
    
    /**
     * Agent Company
     */
    private String agentCompCd;
    
    /**
     * List of search results domain
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W9002ListDomain> listDomainList; 

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9002ActionForm() {
        w9002CriteriaDomain = new W9002CriteriaDomain();
    }

   /**
     * Getter method for functionNo.
     *
     * @return the functionNo
     */
    public String getFunctionNo() {
        return functionNo;
    }

    /**
     * Setter method for functionNo.
     *
     * @param functionNo Set for functionNo
     */
    public void setFunctionNo(String functionNo) {
        this.functionNo = functionNo;
    }


    /**
     * Getter method for w9002CriteriaDomain.
     *
     * @return the w9002CriteriaDomain
     */
    public W9002CriteriaDomain getW9002CriteriaDomain() {
        return w9002CriteriaDomain;
    }

    /**
     * Setter method for w9002CriteriaDomain.
     *
     * @param criteriaDomain Set for w9002CriteriaDomain
     */
    public void setW9002CriteriaDomain(W9002CriteriaDomain criteriaDomain) {
        w9002CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W9002ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W9002ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for orgCompCd.
     *
     * @return the orgCompCd
     */
    public String getOrgCompCd() {
        return orgCompCd;
    }

    /**
     * Setter method for orgCompCd.
     *
     * @param orgCompCd Set for orgCompCd
     */
    public void setOrgCompCd(String orgCompCd) {
        this.orgCompCd = orgCompCd;
    }

    /**
     * Getter method for agentCompCd.
     *
     * @return the agentCompCd
     */
    public String getAgentCompCd() {
        return agentCompCd;
    }

    /**
     * Setter method for agentCompCd.
     *
     * @param agentCompCd Set for agentCompCd
     */
    public void setAgentCompCd(String agentCompCd) {
        this.agentCompCd = agentCompCd;
    }
}
