/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_OFF;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W9011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9011ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * The action form class of CIGMA Customer No. X-Reference MA Inquiry Screen.
 * <br />CIGMA Customer No. X-Reference MA Inquiry画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 6487 $
 */
public class W9011ActionForm extends AbstractActionForm{

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
     * select radio button/選択されたラジオボタン
     */
    private String ck;

    /**
     * Domain for search criteria/検索条件ドメイン
     */
    private W9011CriteriaDomain w9011CriteriaDomain;

    /**
     * listDomainList/検索結果ドメインのリスト
     */
    private List<? extends W9011ListDomain> w9011ListDomainList;

    /**
     * Processing mode / 処理モード
     */
    private String procMode;

    /**
     * Add button flg/Addボタン押下フラグ
     */
    private String addFlg = FLAG_OFF;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9011ActionForm() {
        w9011CriteriaDomain = new W9011CriteriaDomain();
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
     * Getter method for w9011CriteriaDomain.
     *
     * @return the w9011CriteriaDomain
     */
    public W9011CriteriaDomain getW9011CriteriaDomain() {
        if (w9011CriteriaDomain == null) {
            w9011CriteriaDomain = new W9011CriteriaDomain(); 
        }
        return w9011CriteriaDomain;
    }

    /**
     * Setter method for w9011CriteriaDomain.
     *
     * @param criteriaDomain Set for w9011CriteriaDomain
     */
    public void setW9011CriteriaDomain(W9011CriteriaDomain criteriaDomain) {
        w9011CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for w9011ListDomainList.
     *
     * @return the w9011ListDomainList
     */
    public List<? extends W9011ListDomain> getW9011ListDomainList() {
        return w9011ListDomainList;
    }

    /**
     * Setter method for w9011ListDomainList.
     *
     * @param listDomainList Set for w9011ListDomainList
     */
    public void setW9011ListDomainList(List<? extends W9011ListDomain> listDomainList) {
        w9011ListDomainList = listDomainList;
    }

    /**
     * <p>Getter method for procMode.</p>
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * <p>Setter method for procMode.</p>
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
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
