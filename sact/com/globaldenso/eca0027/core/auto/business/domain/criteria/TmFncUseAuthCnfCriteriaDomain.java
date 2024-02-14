/*
 * PROJECT：eca0027
 * 
 * TmFncUseAuthCnf の検索条件Domainクラス
 * テーブル概要：TM_FNC_USE_AUTH_CNF
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmFncUseAuthCnf の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_FNC_USE_AUTH_CNF<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class TmFncUseAuthCnfCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * ROLE
     */
    private String role;

    /**
     * SCREEN_ID
     */
    private String screenId;

    /**
     * PERMIT_FUNC_ID
     */
    private String permitFuncId;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * COMP_CD（大なり）
     */
    private String compCdGreaterThan;

    /**
     * COMP_CD（大なりイコール）
     */
    private String compCdGreaterThanEqual;

    /**
     * COMP_CD（小なり）
     */
    private String compCdLessThan;

    /**
     * COMP_CD（小なりイコール）
     */
    private String compCdLessThanEqual;

    /**
     * COMP_CD（前方一致）
     */
    private String compCdLikeFront;

    /**
     * ROLE（大なり）
     */
    private String roleGreaterThan;

    /**
     * ROLE（大なりイコール）
     */
    private String roleGreaterThanEqual;

    /**
     * ROLE（小なり）
     */
    private String roleLessThan;

    /**
     * ROLE（小なりイコール）
     */
    private String roleLessThanEqual;

    /**
     * ROLE（前方一致）
     */
    private String roleLikeFront;

    /**
     * SCREEN_ID（大なり）
     */
    private String screenIdGreaterThan;

    /**
     * SCREEN_ID（大なりイコール）
     */
    private String screenIdGreaterThanEqual;

    /**
     * SCREEN_ID（小なり）
     */
    private String screenIdLessThan;

    /**
     * SCREEN_ID（小なりイコール）
     */
    private String screenIdLessThanEqual;

    /**
     * SCREEN_ID（前方一致）
     */
    private String screenIdLikeFront;

    /**
     * PERMIT_FUNC_ID（大なり）
     */
    private String permitFuncIdGreaterThan;

    /**
     * PERMIT_FUNC_ID（大なりイコール）
     */
    private String permitFuncIdGreaterThanEqual;

    /**
     * PERMIT_FUNC_ID（小なり）
     */
    private String permitFuncIdLessThan;

    /**
     * PERMIT_FUNC_ID（小なりイコール）
     */
    private String permitFuncIdLessThanEqual;

    /**
     * PERMIT_FUNC_ID（前方一致）
     */
    private String permitFuncIdLikeFront;

    /**
     * COM_CREATE_USER_ID（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * COM_CREATE_USER_ID（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * COM_CREATE_USER_ID（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * COM_CREATE_USER_ID（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * COM_CREATE_USER_ID（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * COM_CREATE_FUNC_ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * COM_CREATE_FUNC_ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * COM_CREATE_FUNC_ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * COM_CREATE_FUNC_ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * COM_CREATE_FUNC_ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * COM_UPDATE_USER_ID（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * COM_UPDATE_USER_ID（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * COM_UPDATE_USER_ID（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * COM_UPDATE_USER_ID（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * COM_UPDATE_USER_ID（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * COM_UPDATE_FUNC_ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * COM_UPDATE_FUNC_ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * COM_UPDATE_FUNC_ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TmFncUseAuthCnfCriteriaDomain() {
    }

    /**
     * compCd のゲッターメソッドです。
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * compCd のセッターメソッドです。
     * 
     * @param compCd compCd に設定する
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
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
     * screenId のゲッターメソッドです。
     * 
     * @return the screenId
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * screenId のセッターメソッドです。
     * 
     * @param screenId screenId に設定する
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * permitFuncId のゲッターメソッドです。
     * 
     * @return the permitFuncId
     */
    public String getPermitFuncId() {
        return permitFuncId;
    }

    /**
     * permitFuncId のセッターメソッドです。
     * 
     * @param permitFuncId permitFuncId に設定する
     */
    public void setPermitFuncId(String permitFuncId) {
        this.permitFuncId = permitFuncId;
    }

    /**
     * comCreateTimestamp のゲッターメソッドです。
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * comCreateTimestamp のセッターメソッドです。
     * 
     * @param comCreateTimestamp comCreateTimestamp に設定する
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

    /**
     * comCreateUserId のゲッターメソッドです。
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId のセッターメソッドです。
     * 
     * @param comCreateUserId comCreateUserId に設定する
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * comCreateFuncId のゲッターメソッドです。
     * 
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * comCreateFuncId のセッターメソッドです。
     * 
     * @param comCreateFuncId comCreateFuncId に設定する
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * comUpdateTimestamp のゲッターメソッドです。
     * 
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * comUpdateTimestamp のセッターメソッドです。
     * 
     * @param comUpdateTimestamp comUpdateTimestamp に設定する
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * comUpdateUserId のゲッターメソッドです。
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * comUpdateUserId のセッターメソッドです。
     * 
     * @param comUpdateUserId comUpdateUserId に設定する
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * comUpdateFuncId のゲッターメソッドです。
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * comUpdateFuncId のセッターメソッドです。
     * 
     * @param comUpdateFuncId comUpdateFuncId に設定する
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * compCdGreaterThan のゲッターメソッドです。
     * 
     * @return the compCdGreaterThan
     */
    public String getCompCdGreaterThan() {
        return compCdGreaterThan;
    }

    /**
     * compCdGreaterThan のセッターメソッドです。
     * 
     * @param compCdGreaterThan compCdGreaterThan に設定する
     */
    public void setCompCdGreaterThan(String compCdGreaterThan) {
        this.compCdGreaterThan = compCdGreaterThan;
    }

    /**
     * compCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compCdGreaterThanEqual
     */
    public String getCompCdGreaterThanEqual() {
        return compCdGreaterThanEqual;
    }

    /**
     * compCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param compCdGreaterThanEqual compCdGreaterThanEqual に設定する
     */
    public void setCompCdGreaterThanEqual(String compCdGreaterThanEqual) {
        this.compCdGreaterThanEqual = compCdGreaterThanEqual;
    }

    /**
     * compCdLessThan のゲッターメソッドです。
     * 
     * @return the compCdLessThan
     */
    public String getCompCdLessThan() {
        return compCdLessThan;
    }

    /**
     * compCdLessThan のセッターメソッドです。
     * 
     * @param compCdLessThan compCdLessThan に設定する
     */
    public void setCompCdLessThan(String compCdLessThan) {
        this.compCdLessThan = compCdLessThan;
    }

    /**
     * compCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the compCdLessThanEqual
     */
    public String getCompCdLessThanEqual() {
        return compCdLessThanEqual;
    }

    /**
     * compCdLessThanEqual のセッターメソッドです。
     * 
     * @param compCdLessThanEqual compCdLessThanEqual に設定する
     */
    public void setCompCdLessThanEqual(String compCdLessThanEqual) {
        this.compCdLessThanEqual = compCdLessThanEqual;
    }

    /**
     * compCdLikeFront のゲッターメソッドです。
     * 
     * @return the compCdLikeFront
     */
    public String getCompCdLikeFront() {
        return compCdLikeFront;
    }

    /**
     * compCdLikeFront のセッターメソッドです。
     * 
     * @param compCdLikeFront compCdLikeFront に設定する
     */
    public void setCompCdLikeFront(String compCdLikeFront) {
        this.compCdLikeFront = compCdLikeFront;
    }

    /**
     * roleGreaterThan のゲッターメソッドです。
     * 
     * @return the roleGreaterThan
     */
    public String getRoleGreaterThan() {
        return roleGreaterThan;
    }

    /**
     * roleGreaterThan のセッターメソッドです。
     * 
     * @param roleGreaterThan roleGreaterThan に設定する
     */
    public void setRoleGreaterThan(String roleGreaterThan) {
        this.roleGreaterThan = roleGreaterThan;
    }

    /**
     * roleGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the roleGreaterThanEqual
     */
    public String getRoleGreaterThanEqual() {
        return roleGreaterThanEqual;
    }

    /**
     * roleGreaterThanEqual のセッターメソッドです。
     * 
     * @param roleGreaterThanEqual roleGreaterThanEqual に設定する
     */
    public void setRoleGreaterThanEqual(String roleGreaterThanEqual) {
        this.roleGreaterThanEqual = roleGreaterThanEqual;
    }

    /**
     * roleLessThan のゲッターメソッドです。
     * 
     * @return the roleLessThan
     */
    public String getRoleLessThan() {
        return roleLessThan;
    }

    /**
     * roleLessThan のセッターメソッドです。
     * 
     * @param roleLessThan roleLessThan に設定する
     */
    public void setRoleLessThan(String roleLessThan) {
        this.roleLessThan = roleLessThan;
    }

    /**
     * roleLessThanEqual のゲッターメソッドです。
     * 
     * @return the roleLessThanEqual
     */
    public String getRoleLessThanEqual() {
        return roleLessThanEqual;
    }

    /**
     * roleLessThanEqual のセッターメソッドです。
     * 
     * @param roleLessThanEqual roleLessThanEqual に設定する
     */
    public void setRoleLessThanEqual(String roleLessThanEqual) {
        this.roleLessThanEqual = roleLessThanEqual;
    }

    /**
     * roleLikeFront のゲッターメソッドです。
     * 
     * @return the roleLikeFront
     */
    public String getRoleLikeFront() {
        return roleLikeFront;
    }

    /**
     * roleLikeFront のセッターメソッドです。
     * 
     * @param roleLikeFront roleLikeFront に設定する
     */
    public void setRoleLikeFront(String roleLikeFront) {
        this.roleLikeFront = roleLikeFront;
    }

    /**
     * screenIdGreaterThan のゲッターメソッドです。
     * 
     * @return the screenIdGreaterThan
     */
    public String getScreenIdGreaterThan() {
        return screenIdGreaterThan;
    }

    /**
     * screenIdGreaterThan のセッターメソッドです。
     * 
     * @param screenIdGreaterThan screenIdGreaterThan に設定する
     */
    public void setScreenIdGreaterThan(String screenIdGreaterThan) {
        this.screenIdGreaterThan = screenIdGreaterThan;
    }

    /**
     * screenIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the screenIdGreaterThanEqual
     */
    public String getScreenIdGreaterThanEqual() {
        return screenIdGreaterThanEqual;
    }

    /**
     * screenIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param screenIdGreaterThanEqual screenIdGreaterThanEqual に設定する
     */
    public void setScreenIdGreaterThanEqual(String screenIdGreaterThanEqual) {
        this.screenIdGreaterThanEqual = screenIdGreaterThanEqual;
    }

    /**
     * screenIdLessThan のゲッターメソッドです。
     * 
     * @return the screenIdLessThan
     */
    public String getScreenIdLessThan() {
        return screenIdLessThan;
    }

    /**
     * screenIdLessThan のセッターメソッドです。
     * 
     * @param screenIdLessThan screenIdLessThan に設定する
     */
    public void setScreenIdLessThan(String screenIdLessThan) {
        this.screenIdLessThan = screenIdLessThan;
    }

    /**
     * screenIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the screenIdLessThanEqual
     */
    public String getScreenIdLessThanEqual() {
        return screenIdLessThanEqual;
    }

    /**
     * screenIdLessThanEqual のセッターメソッドです。
     * 
     * @param screenIdLessThanEqual screenIdLessThanEqual に設定する
     */
    public void setScreenIdLessThanEqual(String screenIdLessThanEqual) {
        this.screenIdLessThanEqual = screenIdLessThanEqual;
    }

    /**
     * screenIdLikeFront のゲッターメソッドです。
     * 
     * @return the screenIdLikeFront
     */
    public String getScreenIdLikeFront() {
        return screenIdLikeFront;
    }

    /**
     * screenIdLikeFront のセッターメソッドです。
     * 
     * @param screenIdLikeFront screenIdLikeFront に設定する
     */
    public void setScreenIdLikeFront(String screenIdLikeFront) {
        this.screenIdLikeFront = screenIdLikeFront;
    }

    /**
     * permitFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the permitFuncIdGreaterThan
     */
    public String getPermitFuncIdGreaterThan() {
        return permitFuncIdGreaterThan;
    }

    /**
     * permitFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param permitFuncIdGreaterThan permitFuncIdGreaterThan に設定する
     */
    public void setPermitFuncIdGreaterThan(String permitFuncIdGreaterThan) {
        this.permitFuncIdGreaterThan = permitFuncIdGreaterThan;
    }

    /**
     * permitFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the permitFuncIdGreaterThanEqual
     */
    public String getPermitFuncIdGreaterThanEqual() {
        return permitFuncIdGreaterThanEqual;
    }

    /**
     * permitFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param permitFuncIdGreaterThanEqual permitFuncIdGreaterThanEqual に設定する
     */
    public void setPermitFuncIdGreaterThanEqual(String permitFuncIdGreaterThanEqual) {
        this.permitFuncIdGreaterThanEqual = permitFuncIdGreaterThanEqual;
    }

    /**
     * permitFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the permitFuncIdLessThan
     */
    public String getPermitFuncIdLessThan() {
        return permitFuncIdLessThan;
    }

    /**
     * permitFuncIdLessThan のセッターメソッドです。
     * 
     * @param permitFuncIdLessThan permitFuncIdLessThan に設定する
     */
    public void setPermitFuncIdLessThan(String permitFuncIdLessThan) {
        this.permitFuncIdLessThan = permitFuncIdLessThan;
    }

    /**
     * permitFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the permitFuncIdLessThanEqual
     */
    public String getPermitFuncIdLessThanEqual() {
        return permitFuncIdLessThanEqual;
    }

    /**
     * permitFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param permitFuncIdLessThanEqual permitFuncIdLessThanEqual に設定する
     */
    public void setPermitFuncIdLessThanEqual(String permitFuncIdLessThanEqual) {
        this.permitFuncIdLessThanEqual = permitFuncIdLessThanEqual;
    }

    /**
     * permitFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the permitFuncIdLikeFront
     */
    public String getPermitFuncIdLikeFront() {
        return permitFuncIdLikeFront;
    }

    /**
     * permitFuncIdLikeFront のセッターメソッドです。
     * 
     * @param permitFuncIdLikeFront permitFuncIdLikeFront に設定する
     */
    public void setPermitFuncIdLikeFront(String permitFuncIdLikeFront) {
        this.permitFuncIdLikeFront = permitFuncIdLikeFront;
    }

    /**
     * comCreateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThan
     */
    public String getComCreateUserIdGreaterThan() {
        return comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThan comCreateUserIdGreaterThan に設定する
     */
    public void setComCreateUserIdGreaterThan(String comCreateUserIdGreaterThan) {
        this.comCreateUserIdGreaterThan = comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThanEqual
     */
    public String getComCreateUserIdGreaterThanEqual() {
        return comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThanEqual comCreateUserIdGreaterThanEqual に設定する
     */
    public void setComCreateUserIdGreaterThanEqual(String comCreateUserIdGreaterThanEqual) {
        this.comCreateUserIdGreaterThanEqual = comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThan
     */
    public String getComCreateUserIdLessThan() {
        return comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThan のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThan comCreateUserIdLessThan に設定する
     */
    public void setComCreateUserIdLessThan(String comCreateUserIdLessThan) {
        this.comCreateUserIdLessThan = comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThanEqual
     */
    public String getComCreateUserIdLessThanEqual() {
        return comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThanEqual comCreateUserIdLessThanEqual に設定する
     */
    public void setComCreateUserIdLessThanEqual(String comCreateUserIdLessThanEqual) {
        this.comCreateUserIdLessThanEqual = comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLikeFront
     */
    public String getComCreateUserIdLikeFront() {
        return comCreateUserIdLikeFront;
    }

    /**
     * comCreateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateUserIdLikeFront comCreateUserIdLikeFront に設定する
     */
    public void setComCreateUserIdLikeFront(String comCreateUserIdLikeFront) {
        this.comCreateUserIdLikeFront = comCreateUserIdLikeFront;
    }

    /**
     * comCreateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThan
     */
    public String getComCreateFuncIdGreaterThan() {
        return comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThan comCreateFuncIdGreaterThan に設定する
     */
    public void setComCreateFuncIdGreaterThan(String comCreateFuncIdGreaterThan) {
        this.comCreateFuncIdGreaterThan = comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThanEqual
     */
    public String getComCreateFuncIdGreaterThanEqual() {
        return comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThanEqual comCreateFuncIdGreaterThanEqual に設定する
     */
    public void setComCreateFuncIdGreaterThanEqual(String comCreateFuncIdGreaterThanEqual) {
        this.comCreateFuncIdGreaterThanEqual = comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThan
     */
    public String getComCreateFuncIdLessThan() {
        return comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThan comCreateFuncIdLessThan に設定する
     */
    public void setComCreateFuncIdLessThan(String comCreateFuncIdLessThan) {
        this.comCreateFuncIdLessThan = comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThanEqual
     */
    public String getComCreateFuncIdLessThanEqual() {
        return comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThanEqual comCreateFuncIdLessThanEqual に設定する
     */
    public void setComCreateFuncIdLessThanEqual(String comCreateFuncIdLessThanEqual) {
        this.comCreateFuncIdLessThanEqual = comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLikeFront
     */
    public String getComCreateFuncIdLikeFront() {
        return comCreateFuncIdLikeFront;
    }

    /**
     * comCreateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateFuncIdLikeFront comCreateFuncIdLikeFront に設定する
     */
    public void setComCreateFuncIdLikeFront(String comCreateFuncIdLikeFront) {
        this.comCreateFuncIdLikeFront = comCreateFuncIdLikeFront;
    }

    /**
     * comUpdateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThan
     */
    public String getComUpdateUserIdGreaterThan() {
        return comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThan comUpdateUserIdGreaterThan に設定する
     */
    public void setComUpdateUserIdGreaterThan(String comUpdateUserIdGreaterThan) {
        this.comUpdateUserIdGreaterThan = comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThanEqual
     */
    public String getComUpdateUserIdGreaterThanEqual() {
        return comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThanEqual comUpdateUserIdGreaterThanEqual に設定する
     */
    public void setComUpdateUserIdGreaterThanEqual(String comUpdateUserIdGreaterThanEqual) {
        this.comUpdateUserIdGreaterThanEqual = comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThan
     */
    public String getComUpdateUserIdLessThan() {
        return comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThan comUpdateUserIdLessThan に設定する
     */
    public void setComUpdateUserIdLessThan(String comUpdateUserIdLessThan) {
        this.comUpdateUserIdLessThan = comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThanEqual
     */
    public String getComUpdateUserIdLessThanEqual() {
        return comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThanEqual comUpdateUserIdLessThanEqual に設定する
     */
    public void setComUpdateUserIdLessThanEqual(String comUpdateUserIdLessThanEqual) {
        this.comUpdateUserIdLessThanEqual = comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLikeFront
     */
    public String getComUpdateUserIdLikeFront() {
        return comUpdateUserIdLikeFront;
    }

    /**
     * comUpdateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateUserIdLikeFront comUpdateUserIdLikeFront に設定する
     */
    public void setComUpdateUserIdLikeFront(String comUpdateUserIdLikeFront) {
        this.comUpdateUserIdLikeFront = comUpdateUserIdLikeFront;
    }

    /**
     * comUpdateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThan
     */
    public String getComUpdateFuncIdGreaterThan() {
        return comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThan comUpdateFuncIdGreaterThan に設定する
     */
    public void setComUpdateFuncIdGreaterThan(String comUpdateFuncIdGreaterThan) {
        this.comUpdateFuncIdGreaterThan = comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThanEqual
     */
    public String getComUpdateFuncIdGreaterThanEqual() {
        return comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThanEqual comUpdateFuncIdGreaterThanEqual に設定する
     */
    public void setComUpdateFuncIdGreaterThanEqual(String comUpdateFuncIdGreaterThanEqual) {
        this.comUpdateFuncIdGreaterThanEqual = comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThan
     */
    public String getComUpdateFuncIdLessThan() {
        return comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThan comUpdateFuncIdLessThan に設定する
     */
    public void setComUpdateFuncIdLessThan(String comUpdateFuncIdLessThan) {
        this.comUpdateFuncIdLessThan = comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThanEqual
     */
    public String getComUpdateFuncIdLessThanEqual() {
        return comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThanEqual comUpdateFuncIdLessThanEqual に設定する
     */
    public void setComUpdateFuncIdLessThanEqual(String comUpdateFuncIdLessThanEqual) {
        this.comUpdateFuncIdLessThanEqual = comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLikeFront
     */
    public String getComUpdateFuncIdLikeFront() {
        return comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLikeFront comUpdateFuncIdLikeFront に設定する
     */
    public void setComUpdateFuncIdLikeFront(String comUpdateFuncIdLikeFront) {
        this.comUpdateFuncIdLikeFront = comUpdateFuncIdLikeFront;
    }

}

