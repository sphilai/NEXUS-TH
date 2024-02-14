/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The PL layer domain class that holds the criteria information 
 * of CIGMA Customer No X-Reference MA Inquiry Screen.
 * <br/>CIGMA Customer No X-Reference MA Inquiry画面の検索条件を保持するPL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 6487 $
 */
public class W9011CriteriaDomain extends AbstractDomain{

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
    * COMPANY CODE/会社コード  comp cd of consignee
    */
    private String consigneeCd;

    /**
    * RE INVOICE FLAG/リインボイス要否フラグ  Y:Required, N:Not
    */
    private String reInvoiceFlg;

    /**
    * select radio button/選択されたラジオボタン
    */
    private String ck;

    /**
    * Server ID/サーバID
    */
    private String serverId;
    
    /**
    * User function use authority/ユーザ機能利用権限
    */
    private List<? extends UserAuthDomain> userAuthList;

    /**
    * PageInfoCreator object/PageInfoCreatorオブジェクト
    */
    private transient PageInfoCreator pageInfoCreator;

    /**
     * Default constructor./デフォルトコンストラクタ
     */
    public W9011CriteriaDomain() {
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
     * <p>Getter method for consigneeCd.</p>
     *
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * <p>Setter method for consigneeCd.</p>
     *
     * @param consigneeCd Set for consigneeCd
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
    * Getter method for reInvoiceFlg.
    *
    * @return the reInvoiceFlg
    */
    public String getReInvoiceFlg() {
        return reInvoiceFlg;
    }

    /**
    * Setter method for reInvoiceFlg.
    *
    * @param reInvoiceFlg Set for reInvoiceFlg
    */
    public void setReInvoiceFlg(String reInvoiceFlg) {
        this.reInvoiceFlg = reInvoiceFlg;
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
    * Getter method for serverId.
    *
    * @return the serverId
    */
    public String getServerId() {
        return serverId;
    }

    /**
    * Setter method for serverId.
    *
    * @param serverId Set for serverId
    */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
    * Getter method for userAuthList.
    *
    * @return the userAuthList
    */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
    * Setter method for userAuthList.
    *
    * @param userAuthList Set for userAuthList
    */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
    * Getter method for pageInfoCreator.
    *
    * @return the pageInfoCreator
    */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
    * Setter method for pageInfoCreator.
    *
    * @param pageInfoCreator Set for pageInfoCreator
    */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

}
