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
 * The domain of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面のドメインです。
 *
 * @version $Revision: 7765 $
 */
public class W9002CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Org Company
     */
    private String orgCompCd;

    /**
     * Agent Company
     */
    private String agentCompCd;

    /**
     * Function
     */
    private String function;

    /**
     * Function No.
     */
    private String functionNo;

    /**
     * PageInfoCreator Object<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * User function use authority<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * COMPANY CODE to possess update privileges<br />
     * 更新権限を保有する会社コード
     */
    private List<String> authUpdCompCd;
    
    /**
     * Processing mode<br />
     * 処理モード
     */
    private String procMode;
    
    /**
     * Server ID<br />
     * サーバID
     */
    private String serverId;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9002CriteriaDomain() {
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

    /**
     * Getter method for function.
     *
     * @return the function
     */
    public String getFunction() {
        return function;
    }

    /**
     * Setter method for function.
     *
     * @param function Set for function
     */
    public void setFunction(String function) {
        this.function = function;
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
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
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
     * Getter method for authUpdCompCd.
     *
     * @return the authUpdCompCd
     */
    public List<String> getAuthUpdCompCd() {
        return authUpdCompCd;
    }

    /**
     * Setter method for authUpdCompCd.
     *
     * @param authUpdCompCd Set for authUpdCompCd
     */
    public void setAuthUpdCompCd(List<String> authUpdCompCd) {
        this.authUpdCompCd = authUpdCompCd;
    }

}
