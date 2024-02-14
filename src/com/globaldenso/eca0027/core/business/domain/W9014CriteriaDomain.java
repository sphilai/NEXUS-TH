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
 * The PL layer domain class that holds the criteria information of 
 * CIGMA W/H X-Reference MA Inquiry Screen.
 * <br/>CIGMA W/H X-Reference MA Inquiry画面の検索条件を保持するPL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 6487 $
 */

public class W9014CriteriaDomain extends AbstractDomain {

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
     * COMPANY CODE/会社コード comp cd of wh
     */
    private String compCd;

    /**
     * WAREHOUSE CODE/NEXUS倉庫コード
     */
    private String whCd;

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
    public W9014CriteriaDomain() {
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
     * <p>Getter method for compCd.</p>
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * <p>Setter method for compCd.</p>
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * <p>Getter method for whCd.</p>
     *
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * <p>Setter method for whCd.</p>
     *
     * @param whCd Set for whCd
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * <p>Getter method for serverId.</p>
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>Setter method for serverId.</p>
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>Getter method for userAuthList.</p>
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * <p>Setter method for userAuthList.</p>
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * <p>Getter method for pageInfoCreator.</p>
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * <p>Setter method for pageInfoCreator.</p>
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

}

