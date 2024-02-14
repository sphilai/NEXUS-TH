/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W9010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9010ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CIGMA Ship to X-Reference MA Edit Screen.
 * <br />送荷先変換マスタ一覧画面ActionFormです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9010ActionForm extends AbstractActionForm {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * LEGACY LIBRARY COMPANY CODE/(LEGACYライブラリ)会社コード
     */
    private String lgcyLibCompCd;

     /**
     * CUSTOMER CODE/得意先コード
     */
    private String customerCd;

    /**
     * LEGACY SHIP TO/LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * select radio button/選択されたラジオボタン
     */
    private String ck;

    /**
     * Processing mode / 処理モード
     */
    private String ProcMode;

    /**
     * Add button flg/Addボタン押下フラグ
     */
    private String addFlg;

    /**
     * Domain for search criteria/検索条件ドメイン
     */
    private W9010CriteriaDomain w9010CriteriaDomain;

   /**
    * listDomainList/検索結果ドメインのリスト
    */
    private List<? extends W9010ListDomain> w9010ListDomainList;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9010ActionForm() {
        w9010CriteriaDomain = new W9010CriteriaDomain();
    }

    /**
     * Getter method for lgcyLibCompCd.
     *
     * @return the lgcyLibCompCd
     */
    public String getLgcyLibCompCd() {
        return lgcyLibCompCd;
    }

    /**
     * Setter method for lgcyLibCompCd.
     *
     * @param lgcyLibCompCd Set for lgcyLibCompCd
     */
    public void setLgcyLibCompCd(String lgcyLibCompCd) {
        this.lgcyLibCompCd = lgcyLibCompCd;
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

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * Getter method for ck.
     *
     * @return the ck
     */
    public String getCk() {
        return ck;
    }

    /**
     * Setter method for ck.
     *
     * @param ck Set for ck
     */
    public void setCk(String ck) {
        this.ck = ck;
    }

    /**
     * Getter method for w9010CriteriaDomain.
     *
     * @return the w9010CriteriaDomain
     */
    public W9010CriteriaDomain getW9010CriteriaDomain() {
        return w9010CriteriaDomain;
    }

    /**
     * Setter method for w9010CriteriaDomain.
     *
     * @param criteriaDomain Set for w9010CriteriaDomain
     */
    public void setW9010CriteriaDomain(W9010CriteriaDomain criteriaDomain) {
        w9010CriteriaDomain = criteriaDomain;
    }

    /**
     * <p>Getter method for w9010ListDomainList.</p>
     *
     * @return the w9010ListDomainList
     */
    public List<? extends W9010ListDomain> getW9010ListDomainList() {
        return w9010ListDomainList;
    }

    /**
     * <p>Setter method for w9010ListDomainList.</p>
     *
     * @param listDomainList Set for w9010ListDomainList
     */
    public void setW9010ListDomainList(List<? extends W9010ListDomain> listDomainList) {
        w9010ListDomainList = listDomainList;
    }

    /**
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return ProcMode;
    }

    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        ProcMode = procMode;
    }

    /**
     * Getter method for addFlg.
     *
     * @return the addFlg
     */
    public String getAddFlg() {
        return addFlg;
    }

    /**
     * Setter method for addFlg.
     *
     * @param addFlg Set for addFlg
     */
    public void setAddFlg(String addFlg) {
        this.addFlg = addFlg;
    }
}
