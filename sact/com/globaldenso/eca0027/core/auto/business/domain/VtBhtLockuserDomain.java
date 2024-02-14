/*
 * PROJECT：eca0027
 * 
 * VtBhtLockuser のDomainクラス
 * テーブル概要：VT_BHT_LOCKUSER
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/03/07  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VtBhtLockuser のDomainクラスです。<BR>
 * テーブル概要：VT_BHT_LOCKUSER<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/03/07 14:20:24<BR>
 * 
 * テーブル定義から2014/03/07に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VtBhtLockuserDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

    /**
     * ROLE
     */
    private String role;

    /**
     * AUTH_MGT_COMP
     */
    private String authMgtComp;

    /**
     * AUTH_DATA_TYP
     */
    private String authDataTyp;

    /**
     * AUTH_DATA_FROM
     */
    private String authDataFrom;

    /**
     * AUTH_DATA_TO
     */
    private String authDataTo;

    /**
     * デフォルトコンストラクタ。
     */
    public VtBhtLockuserDomain() {
    }

    /**
     * dscId のゲッターメソッドです。
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * dscId のセッターメソッドです。
     * 
     * @param dscId dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * role のゲッターメソッドです。
     * 
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * role のセッターメソッドです。
     * 
     * @param role role に設定する
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * authMgtComp のゲッターメソッドです。
     * 
     * @return the authMgtComp
     */
    public String getAuthMgtComp() {
        return authMgtComp;
    }

    /**
     * authMgtComp のセッターメソッドです。
     * 
     * @param authMgtComp authMgtComp に設定する
     */
    public void setAuthMgtComp(String authMgtComp) {
        this.authMgtComp = authMgtComp;
    }

    /**
     * authDataTyp のゲッターメソッドです。
     * 
     * @return the authDataTyp
     */
    public String getAuthDataTyp() {
        return authDataTyp;
    }

    /**
     * authDataTyp のセッターメソッドです。
     * 
     * @param authDataTyp authDataTyp に設定する
     */
    public void setAuthDataTyp(String authDataTyp) {
        this.authDataTyp = authDataTyp;
    }

    /**
     * authDataFrom のゲッターメソッドです。
     * 
     * @return the authDataFrom
     */
    public String getAuthDataFrom() {
        return authDataFrom;
    }

    /**
     * authDataFrom のセッターメソッドです。
     * 
     * @param authDataFrom authDataFrom に設定する
     */
    public void setAuthDataFrom(String authDataFrom) {
        this.authDataFrom = authDataFrom;
    }

    /**
     * authDataTo のゲッターメソッドです。
     * 
     * @return the authDataTo
     */
    public String getAuthDataTo() {
        return authDataTo;
    }

    /**
     * authDataTo のセッターメソッドです。
     * 
     * @param authDataTo authDataTo に設定する
     */
    public void setAuthDataTo(String authDataTo) {
        this.authDataTo = authDataTo;
    }

}
