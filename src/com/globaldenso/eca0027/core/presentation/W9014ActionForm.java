/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W9014CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9014ListDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.FLAG_OFF;
/**
 * The action form class of CIGMA W/H X-Reference MA Inquiry Screen. <br />
 * CIGMA W/H X-Reference MA Inquiry画面のアクションフォームクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 6455 $
 */
public class W9014ActionForm extends AbstractActionForm {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * LEGACY LIBRARY COMPANY CODE/(LEGACYライブラリ)会社コード
     */
    private String lgcyLibCompCd;
    
    /**
     * LEGACY WAREHOUSE CODE/LEGACY倉庫コード
     */
    private String lgcyWhCd;

    /**
     * PLANT CODE/製造部工場区分
     */
    private String plntCd;
    
    /**
     * select radio button/選択されたラジオボタン
     */
    private String ck;
    
    /**
     * Add button flg/Addボタン押下フラグ
     */
    private String addFlg = FLAG_OFF;
    
    /**
     * Processing mode / 処理モード
     */
    private String procMode;
    
    /**
     * Domain for search criteria/検索条件ドメイン
     */
    private W9014CriteriaDomain w9014CriteriaDomain = null;

    /**
     * listDomainList/検索結果ドメインのリスト
     */
    private List<? extends W9014ListDomain> w9014ListDomainList;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9014ActionForm() {
        w9014CriteriaDomain = new W9014CriteriaDomain();
    }

    /**
     * <p>Getter method for lgcyLibCompCd.</p>
     *
     * @return the lgcyLibCompCd
     */
    public String getLgcyLibCompCd() {
        return lgcyLibCompCd;
    }

    /**
     * <p>Setter method for lgcyLibCompCd.</p>
     *
     * @param lgcyLibCompCd Set for lgcyLibCompCd
     */
    public void setLgcyLibCompCd(String lgcyLibCompCd) {
        this.lgcyLibCompCd = lgcyLibCompCd;
    }

    /**
     * <p>Getter method for lgcyWhCd.</p>
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * <p>Setter method for lgcyWhCd.</p>
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * <p>Getter method for plntCd.</p>
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * <p>Setter method for plntCd.</p>
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * <p>Getter method for ck.</p>
     *
     * @return the ck
     */
    public String getCk() {
        return ck;
    }

    /**
     * <p>Setter method for ck.</p>
     *
     * @param ck Set for ck
     */
    public void setCk(String ck) {
        this.ck = ck;
    }

    /**
     * <p>Getter method for addFlg.</p>
     *
     * @return the addFlg
     */
    public String getAddFlg() {
        return addFlg;
    }

    /**
     * <p>Setter method for addFlg.</p>
     *
     * @param addFlg Set for addFlg
     */
    public void setAddFlg(String addFlg) {
        this.addFlg = addFlg;
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
     * <p>Getter method for w9014CriteriaDomain.</p>
     *
     * @return the w9014CriteriaDomain
     */
    public W9014CriteriaDomain getW9014CriteriaDomain() {
        if (w9014CriteriaDomain == null) {
            w9014CriteriaDomain = new W9014CriteriaDomain();
        }
        return w9014CriteriaDomain;
    }

    /**
     * <p>Setter method for w9014CriteriaDomain.</p>
     *
     * @param criteriaDomain Set for w9014CriteriaDomain
     */
    public void setW9014CriteriaDomain(W9014CriteriaDomain criteriaDomain) {
        w9014CriteriaDomain = criteriaDomain;
    }

    /**
     * <p>Getter method for w9014ListDomainList.</p>
     *
     * @return the w9014ListDomainList
     */
    public List<? extends W9014ListDomain> getW9014ListDomainList() {
        return w9014ListDomainList;
    }

    /**
     * <p>Setter method for w9014ListDomainList.</p>
     *
     * @param listDomainList Set for w9014ListDomainList
     */
    public void setW9014ListDomainList(List<? extends W9014ListDomain> listDomainList) {
        w9014ListDomainList = listDomainList;
    }

}
