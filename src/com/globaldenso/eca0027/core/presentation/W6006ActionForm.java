/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W6006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W6006ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The form of action for Documentation Invoice Grouping screen.
 * <br />通関書類作成業務 Invoice Grouping画面のアクション・フォームです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W6006ActionForm extends AbstractActionForm {
    /**
     * Serial version ID.
     * <br />シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * Search conditions domain
     * <br />検索条件ドメイン
     */
    private W6006CriteriaDomain w6006CriteriaDomain;

    /**
     * List of search results domain
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W6006ListDomain> listDomainList;

    /** 
     * Takeover VALUE SHIPPER CODE / SHIPPER CODE
     * <br />引継値 SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
    * Takeover VALUE Date Shipped
    * <br />引継値 Date Shipped
    */
    private String dateShipped; 

    /** 
     * Takeover VALUE GRP NO 1 / GRP NO 1
     * <br />引継値 GRP NO 1/グループNO1
     */
    private String grpNo1;

    /** 
     * Takeover VALUE GRP NO 2 / GRP NO 2
     * <br />引継値 GRP NO 2/グループNO2
     */
    private String grpNo2;

    /** 
     * Takeover VALUE CUSTOMER CODE / CUSTOMER CODE
     * <br />引継値 CUSTOMER CODE/得意先コード
     */
    private String customerCd;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6006ActionForm() {
        w6006CriteriaDomain = new W6006CriteriaDomain();
    }

    /**
     * Getter method for w6006CriteriaDomain.
     *
     * @return the w6006CriteriaDomain
     */
    public W6006CriteriaDomain getW6006CriteriaDomain() {
        return w6006CriteriaDomain;
    }

    /**
     * Setter method for w6006CriteriaDomain.
     *
     * @param criteriaDomain Set for w6006CriteriaDomain
     */
    public void setW6006CriteriaDomain(W6006CriteriaDomain criteriaDomain) {
        w6006CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W6006ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W6006ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for dateShipped.
     *
     * @return the dateShipped
     */
    public String getDateShipped() {
        return dateShipped;
    }

    /**
     * Setter method for dateShipped.
     *
     * @param dateShipped Set for dateShipped
     */
    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    /**
     * Getter method for grpNo1.
     *
     * @return the grpNo1
     */
    public String getGrpNo1() {
        return grpNo1;
    }

    /**
     * Setter method for grpNo1.
     *
     * @param grpNo1 Set for grpNo1
     */
    public void setGrpNo1(String grpNo1) {
        this.grpNo1 = grpNo1;
    }

    /**
     * Getter method for grpNo2.
     *
     * @return the grpNo2
     */
    public String getGrpNo2() {
        return grpNo2;
    }

    /**
     * Setter method for grpNo2.
     *
     * @param grpNo2 Set for grpNo2
     */
    public void setGrpNo2(String grpNo2) {
        this.grpNo2 = grpNo2;
    }

    /**
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }
}
