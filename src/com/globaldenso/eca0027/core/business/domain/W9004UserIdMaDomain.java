/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.globaldenso.eca0027.core.auto.business.domain.TmAgentDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsCompDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtUserAuthMgtDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain that holds the information of User ID MA screen.
 * <br />User ID MA画面の情報を保持するドメインです。
 *
 * @version $Revision: 7765 $
 */
public class W9004UserIdMaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * discId/discId
     */
    private String dscId;
    
    /**
     * ORIGINAL COMPANY CODE<br />
     * (代行依頼元)会社コード
     */
    private String orgCompDc;

    /**
     * AGENT COMPANY CODE<br />
     * (代行依頼先)会社コード
     */
    private String agentCompCd;

    /**
     * COMPANY NAME ABBREVIATION/会社略称
     */
    private String compNmAbb;

    /**
     * USER NAME<br />
     * 氏名(漢字)
     */
    private String usrNmEn;

    /**
     * MAIL ADDRESS1<br />
     * メールアドレス１
     */
    private String mailAdd1;

    /**
     * AUTHORITY MANAGEMENT COMPANY<br />
     * 権限付与会社
     */
    private String authMgtComp;

    /**
     * ROLE<br />
     * 役割
     */
    private String role;

    /**
     * Processing mode<br />
     * 処理モード
     */
    private String mode;

    /**
     * LAST UPDATE DATE<br />
     * 最終更新日時
     */
    private Timestamp comUpdeteTimestamp;

    /**
     * TM_USER for LAST UPDATE DATE<br />
     * TM_USER用 最終更新日時
     */
    private Date lastUpdate;
    
    /**
     * authDataFrom
     */
    private String authDataFrom;
    
    /**
     * plntCd
     */
    private String plntCd;

    /**
     * authMgtProc
     */
    private String authMgtProc;

    /**
     * Screen area authority area<br />
     * 画面 地域権限エリア
     */
    private W9004UserIdMaAreaAuthDomain areaAuthDomain;
    
    /**
     * Screen corporate authority area list<br />
     * 画面 会社権限エリアリスト
     */
    private List<? extends W9004UserIdMaCompAuthDomain> compAuthList;
    
    /**
     * Screen factory authority area list<br />
     * 画面 工場権限エリアリスト
     */
    private List<? extends W9004UserIdMaPlantAuthDomain> plantAuthList;

    /**
     * Adm area of information screen control for login's<br />
     * 画面制御用 ログイン者の地域管理者情報
     */
    private List<? extends TtUserAuthMgtDomain> loginAreaMgtDomainList;

    /**
     * Company Information screen control for all<br />
     * 画面制御用 全ての会社情報
     */
    private List<? extends TmNxsCompDomain> allCompList;

    /**
     * Factory information on the screen control for all<br />
     * 画面制御用 全ての工場情報
     */
    private List<? extends W9004UserIdMaDomain> allPlantLis;
    
    /**
     * Adm regional authority and local authority functions use information on the screen for user control<br />
     * 画面制御用 ユーザの地域管理者権限・地域機能利用権限情報
     */
    private List<? extends W9004UserIdMaDomain> userAreaAuthList;
    
    /**
     * Company Adm authority and company functions use authority information on the screen for user control<br />
     * 画面制御用 ユーザの会社管理者権限・会社機能利用権限情報
     */
    private List<? extends W9004UserIdMaDomain> userCompAuthList;
    
    /**
     * Factory Adm authority and function factory use authority information on the screen for user control<br />
     * 画面制御用 ユーザの工場管理者権限・工場機能利用権限情報
     */
    private List<? extends W9004UserIdMaDomain> userPlantAuthList;

    /**
     * Screen control for a login's authorization possible company<br />
     * 画面制御用 ログイン者が権限付与可能な会社
     */
    private List<? extends W9004UserIdMaDomain> loginCompAuthList;

    /**
     * Screen control for a login's authorization can be factory<br />
     * 画面制御用 ログイン者が権限付与可能な工場
     */
    private List<? extends W9004UserIdMaDomain> loginPlantAuthList;
    
    /**
     * Proxy request based companies and the features that are proxy request to the company of screen control for user<br />
     * 画面制御用 ユーザの会社に代行依頼されている代行依頼元会社・機能
     */
    private List<? extends TmAgentDomain> tmAgentList;

    /**
     * Update COMPANY CODE<br />
     * 更新用 会社コード
     */
    private String compCd;

    /**
     * Update user language<br />
     * 更新用 ユーザ言語
     */
    private String userLangCd;

    /**
     * Update GrpCompCd<br />
     * 更新用 GrpCompCd
     */
    private String grpCompCd;

    /**
     * Take over value DSC-ID<br />
     * 引継値 DSC-ID
     */
    private String prmDscId;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9004UserIdMaDomain() {
    }

    /**
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * Getter method for orgCompDc.
     *
     * @return the orgCompDc
     */
    public String getOrgCompDc() {
        return orgCompDc;
    }

    /**
     * Setter method for orgCompDc.
     *
     * @param orgCompDc Set for orgCompDc
     */
    public void setOrgCompDc(String orgCompDc) {
        this.orgCompDc = orgCompDc;
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
     * Getter method for compNmAbb.
     *
     * @return the compNmAbb
     */
    public String getCompNmAbb() {
        return compNmAbb;
    }

    /**
     * Setter method for compNmAbb.
     *
     * @param compNmAbb Set for compNmAbb
     */
    public void setCompNmAbb(String compNmAbb) {
        this.compNmAbb = compNmAbb;
    }

    /**
     * Getter method for usrNmEn.
     *
     * @return the usrNmEn
     */
    public String getUsrNmEn() {
        return usrNmEn;
    }

    /**
     * Setter method for usrNmEn.
     *
     * @param usrNmEn Set for usrNmEn
     */
    public void setUsrNmEn(String usrNmEn) {
        this.usrNmEn = usrNmEn;
    }

    /**
     * Getter method for mailAdd1.
     *
     * @return the mailAdd1
     */
    public String getMailAdd1() {
        return mailAdd1;
    }

    /**
     * Setter method for mailAdd1.
     *
     * @param mailAdd1 Set for mailAdd1
     */
    public void setMailAdd1(String mailAdd1) {
        this.mailAdd1 = mailAdd1;
    }

    /**
     * Getter method for authMgtComp.
     *
     * @return the authMgtComp
     */
    public String getAuthMgtComp() {
        return authMgtComp;
    }

    /**
     * Setter method for authMgtComp.
     *
     * @param authMgtComp Set for authMgtComp
     */
    public void setAuthMgtComp(String authMgtComp) {
        this.authMgtComp = authMgtComp;
    }

    /**
     * Getter method for role.
     *
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * Setter method for role.
     *
     * @param role Set for role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Getter method for mode.
     *
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * Setter method for mode.
     *
     * @param mode Set for mode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Getter method for comUpdeteTimestamp.
     *
     * @return the comUpdeteTimestamp
     */
    public Timestamp getComUpdeteTimestamp() {
        return comUpdeteTimestamp;
    }

    /**
     * Setter method for comUpdeteTimestamp.
     *
     * @param comUpdeteTimestamp Set for comUpdeteTimestamp
     */
    public void setComUpdeteTimestamp(Timestamp comUpdeteTimestamp) {
        this.comUpdeteTimestamp = comUpdeteTimestamp;
    }

    /**
     * Getter method for lastUpdate.
     *
     * @return the lastUpdate
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Setter method for lastUpdate.
     *
     * @param lastUpdate Set for lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Getter method for authDataFrom.
     *
     * @return the authDataFrom
     */
    public String getAuthDataFrom() {
        return authDataFrom;
    }

    /**
     * Setter method for authDataFrom.
     *
     * @param authDataFrom Set for authDataFrom
     */
    public void setAuthDataFrom(String authDataFrom) {
        this.authDataFrom = authDataFrom;
    }

    /**
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for authMgtProc.
     *
     * @return the authMgtProc
     */
    public String getAuthMgtProc() {
        return authMgtProc;
    }

    /**
     * Setter method for authMgtProc.
     *
     * @param authMgtProc Set for authMgtProc
     */
    public void setAuthMgtProc(String authMgtProc) {
        this.authMgtProc = authMgtProc;
    }

    /**
     * Getter method for areaAuthDomain.
     *
     * @return the areaAuthDomain
     */
    public W9004UserIdMaAreaAuthDomain getAreaAuthDomain() {
        return areaAuthDomain;
    }

    /**
     * Setter method for areaAuthDomain.
     *
     * @param areaAuthDomain Set for areaAuthDomain
     */
    public void setAreaAuthDomain(W9004UserIdMaAreaAuthDomain areaAuthDomain) {
        this.areaAuthDomain = areaAuthDomain;
    }

    /**
     * Getter method for compAuthList.
     *
     * @return the compAuthList
     */
    public List<? extends W9004UserIdMaCompAuthDomain> getCompAuthList() {
        return compAuthList;
    }

    /**
     * Setter method for compAuthList.
     *
     * @param compAuthList Set for compAuthList
     */
    public void setCompAuthList(
        List<? extends W9004UserIdMaCompAuthDomain> compAuthList) {
        this.compAuthList = compAuthList;
    }

    /**
     * Getter method for plantAuthList.
     *
     * @return the plantAuthList
     */
    public List<? extends W9004UserIdMaPlantAuthDomain> getPlantAuthList() {
        return plantAuthList;
    }

    /**
     * Setter method for plantAuthList.
     *
     * @param plantAuthList Set for plantAuthList
     */
    public void setPlantAuthList(
        List<? extends W9004UserIdMaPlantAuthDomain> plantAuthList) {
        this.plantAuthList = plantAuthList;
    }

    /**
     * Getter method for loginAreaMgtDomainList.
     *
     * @return the loginAreaMgtDomainList
     */
    public List<? extends TtUserAuthMgtDomain> getLoginAreaMgtDomainList() {
        return loginAreaMgtDomainList;
    }

    /**
     * Setter method for loginAreaMgtDomainList.
     *
     * @param loginAreaMgtDomainList Set for loginAreaMgtDomainList
     */
    public void setLoginAreaMgtDomainList(
        List<? extends TtUserAuthMgtDomain> loginAreaMgtDomainList) {
        this.loginAreaMgtDomainList = loginAreaMgtDomainList;
    }

    /**
     * Getter method for allCompList.
     *
     * @return the allCompList
     */
    public List<? extends TmNxsCompDomain> getAllCompList() {
        return allCompList;
    }

    /**
     * Setter method for allCompList.
     *
     * @param allCompList Set for allCompList
     */
    public void setAllCompList(List<? extends TmNxsCompDomain> allCompList) {
        this.allCompList = allCompList;
    }

    /**
     * Getter method for allPlantLis.
     *
     * @return the allPlantLis
     */
    public List<? extends W9004UserIdMaDomain> getAllPlantLis() {
        return allPlantLis;
    }

    /**
     * Setter method for allPlantLis.
     *
     * @param allPlantLis Set for allPlantLis
     */
    public void setAllPlantLis(List<? extends W9004UserIdMaDomain> allPlantLis) {
        this.allPlantLis = allPlantLis;
    }

    /**
     * Getter method for userAreaAuthList.
     *
     * @return the userAreaAuthList
     */
    public List<? extends W9004UserIdMaDomain> getUserAreaAuthList() {
        return userAreaAuthList;
    }

    /**
     * Setter method for userAreaAuthList.
     *
     * @param userAreaAuthList Set for userAreaAuthList
     */
    public void setUserAreaAuthList(
        List<? extends W9004UserIdMaDomain> userAreaAuthList) {
        this.userAreaAuthList = userAreaAuthList;
    }

    /**
     * Getter method for userCompAuthList.
     *
     * @return the userCompAuthList
     */
    public List<? extends W9004UserIdMaDomain> getUserCompAuthList() {
        return userCompAuthList;
    }

    /**
     * Setter method for userCompAuthList.
     *
     * @param userCompAuthList Set for userCompAuthList
     */
    public void setUserCompAuthList(
        List<? extends W9004UserIdMaDomain> userCompAuthList) {
        this.userCompAuthList = userCompAuthList;
    }

    /**
     * Getter method for userPlantAuthList.
     *
     * @return the userPlantAuthList
     */
    public List<? extends W9004UserIdMaDomain> getUserPlantAuthList() {
        return userPlantAuthList;
    }

    /**
     * Setter method for userPlantAuthList.
     *
     * @param userPlantAuthList Set for userPlantAuthList
     */
    public void setUserPlantAuthList(
        List<? extends W9004UserIdMaDomain> userPlantAuthList) {
        this.userPlantAuthList = userPlantAuthList;
    }

    /**
     * Getter method for loginCompAuthList.
     *
     * @return the loginCompAuthList
     */
    public List<? extends W9004UserIdMaDomain> getLoginCompAuthList() {
        return loginCompAuthList;
    }

    /**
     * Setter method for loginCompAuthList.
     *
     * @param loginCompAuthList Set for loginCompAuthList
     */
    public void setLoginCompAuthList(
        List<? extends W9004UserIdMaDomain> loginCompAuthList) {
        this.loginCompAuthList = loginCompAuthList;
    }

    /**
     * Getter method for loginPlantAuthList.
     *
     * @return the loginPlantAuthList
     */
    public List<? extends W9004UserIdMaDomain> getLoginPlantAuthList() {
        return loginPlantAuthList;
    }

    /**
     * Setter method for loginPlantAuthList.
     *
     * @param loginPlantAuthList Set for loginPlantAuthList
     */
    public void setLoginPlantAuthList(
        List<? extends W9004UserIdMaDomain> loginPlantAuthList) {
        this.loginPlantAuthList = loginPlantAuthList;
    }

    /**
     * Getter method for tmAgentList.
     *
     * @return the tmAgentList
     */
    public List<? extends TmAgentDomain> getTmAgentList() {
        return tmAgentList;
    }

    /**
     * Setter method for tmAgentList.
     *
     * @param tmAgentList Set for tmAgentList
     */
    public void setTmAgentList(List<? extends TmAgentDomain> tmAgentList) {
        this.tmAgentList = tmAgentList;
    }

    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * Getter method for userLangCd.
     *
     * @return the userLangCd
     */
    public String getUserLangCd() {
        return userLangCd;
    }

    /**
     * Setter method for userLangCd.
     *
     * @param userLangCd Set for userLangCd
     */
    public void setUserLangCd(String userLangCd) {
        this.userLangCd = userLangCd;
    }

    /**
     * Getter method for grpCompCd.
     *
     * @return the grpCompCd
     */
    public String getGrpCompCd() {
        return grpCompCd;
    }

    /**
     * Setter method for grpCompCd.
     *
     * @param grpCompCd Set for grpCompCd
     */
    public void setGrpCompCd(String grpCompCd) {
        this.grpCompCd = grpCompCd;
    }

    /**
     * Getter method for prmDscId.
     *
     * @return the prmDscId
     */
    public String getPrmDscId() {
        return prmDscId;
    }

    /**
     * Setter method for prmDscId.
     *
     * @param prmDscId Set for prmDscId
     */
    public void setPrmDscId(String prmDscId) {
        this.prmDscId = prmDscId;
    }
}
