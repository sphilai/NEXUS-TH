/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.sql.Timestamp;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaAreaAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaCompAuthDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9004UserIdMaPlantAuthDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;


/**
 * The domain of search criteria User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面の検索条件ドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class W9004UserIdMaCriteriaDomain extends AbstractDomain {

    /**
     * Serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Takeover VALUE Function No.<br />
     * 引継値 Function No.
     */
    private String prmFunctionNo;

    /**
     * Takeover VALUE DSC-ID.<br />
     * 引継値 DSC-ID
     */
    private String prmDscId;

    /**
     * Screen DSC-ID.<br />
     * 画面 DSC-ID
     */
    private String dscId;

    /**
     * Screen Name.<br />
     * 画面 Name
     */
    private String usrNmEn;

    /**
     * Screen Company.<br />
     * 画面 Company
     */
    private String compCd;

    /**
     * Screen E-mail Address.<br />
     * 画面 E-mail Address
     */
    private String mailAdd1;
    
    /**
     * Screen area authority area.<br />
     * 画面 地域権限エリア
     */
    private W9004UserIdMaAreaAuthDomain areaAuthDomain;
    
    /**
     * Screen corporate authority area list.<br />
     * 画面 会社権限エリアリスト
     */
    private List<W9004UserIdMaCompAuthDomain> compAuthList;
    
    /**
     * Screen factory authority area list.<br />
     * 画面 工場権限エリアリスト
     */
    private List<W9004UserIdMaPlantAuthDomain> plantAuthList;

    /**
     * Search authDscId.<br />
     * 検索 authDscId
     */
    private String authDscId;

    /**
     * Search conditions pattern.<br />
     * 検索 条件パターン
     */
    private String whereType;
    
    /**
     * Search sort pattern.<br />
     * 検索 ソートパターン
     */
    private String orderType;
    
    /**
     * Search authMgtComp.<br />
     * 検索 authMgtComp
     */
    private String authMgtComp;
    
    /**
     * authMgtComp List
     */
    private List<String> authMgtCompList;
    
    /**
     * Search authDataFrom.<br />
     * 検索 authDataFrom
     */
    private String authDataFrom;

    /**
     * authDataFrom List
     */
    private List<String> authDataFromList;
    
    /**
     * Search PageInfoCreator object.<br />
     * 検索 PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;

    /**
     * Search Login's authorization is possible company.<br />
     * 検索 ログイン者が権限付与可能な会社
     */
    private List<? extends W9004UserIdMaDomain> loginCompAuthList;
    
    /**
     * Search Login's an authorization can be factory.<br />
     * 検索 ログイン者が権限付与可能な工場
     */
    private List<? extends W9004UserIdMaDomain> loginPlantAuthList;

    /**
     * Search LAST UPDATE DATE.<br />
     * 検索 最終更新日時
     */
    private Timestamp lastUpdate;

    /**
     * Search grpCompCd.<br />
     * 検索 grpCompCd
     */
    private String grpCompCd;
    
    /**
     * Processing mode.<br />
     * 処理モード
     */
    private String mode;
    
    /**
     * User authorization list.<br />
     * ユーザ権限リスト
     */
    private List<UserAuthDomain> userAuthList;
    
    /**
     * Update count
     */
    private String updateCount;
    
    /**
     * Create count
     */
    private String createCount;

    /**
     * Delete count
     */
    private String deleteCount;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクター
     *
     */
    public W9004UserIdMaCriteriaDomain() {
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
     * Getter method for authDscId.
     *
     * @return the authDscId
     */
    public String getAuthDscId() {
        return authDscId;
    }

    /**
     * Setter method for authDscId.
     *
     * @param authDscId Set for authDscId
     */
    public void setAuthDscId(String authDscId) {
        this.authDscId = authDscId;
    }

    /**
     * Getter method for whereType.
     *
     * @return the whereType
     */
    public String getWhereType() {
        return whereType;
    }

    /**
     * Setter method for whereType.
     *
     * @param whereType Set for whereType
     */
    public void setWhereType(String whereType) {
        this.whereType = whereType;
    }

    /**
     * Getter method for orderType.
     *
     * @return the orderType
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Setter method for orderType.
     *
     * @param orderType Set for orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
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
     * Getter method for authMgtCompList.
     *
     * @return the authMgtCompList
     */
    public List<String> getAuthMgtCompList() {
        return authMgtCompList;
    }

    /**
     * Setter method for authMgtCompList.
     *
     * @param authMgtCompList Set for authMgtCompList
     */
    public void setAuthMgtCompList(List<String> authMgtCompList) {
        this.authMgtCompList = authMgtCompList;
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
     * Getter method for authDataFromList.
     *
     * @return the authDataFromList
     */
    public List<String> getAuthDataFromList() {
        return authDataFromList;
    }

    /**
     * Setter method for authDataFromList.
     *
     * @param authDataFromList Set for authDataFromList
     */
    public void setAuthDataFromList(List<String> authDataFromList) {
        this.authDataFromList = authDataFromList;
    }

    /**
     * Getter method for prmFunctionNo.
     *
     * @return the prmFunctionNo
     */
    public String getPrmFunctionNo() {
        return prmFunctionNo;
    }

    /**
     * Setter method for prmFunctionNo.
     *
     * @param prmFunctionNo Set for prmFunctionNo
     */
    public void setPrmFunctionNo(String prmFunctionNo) {
        this.prmFunctionNo = prmFunctionNo;
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
     * Getter method for compAuthList.
     *
     * @return the compAuthList
     */
    public List<W9004UserIdMaCompAuthDomain> getCompAuthList() {
        return compAuthList;
    }

    /**
     * Setter method for compAuthList.
     *
     * @param compAuthList Set for compAuthList
     */
    public void setCompAuthList(List<W9004UserIdMaCompAuthDomain> compAuthList) {
        this.compAuthList = compAuthList;
    }

    /**
     * Getter method for plantAuthList.
     *
     * @return the plantAuthList
     */
    public List<W9004UserIdMaPlantAuthDomain> getPlantAuthList() {
        return plantAuthList;
    }

    /**
     * Setter method for plantAuthList.
     *
     * @param plantAuthList Set for plantAuthList
     */
    public void setPlantAuthList(List<W9004UserIdMaPlantAuthDomain> plantAuthList) {
        this.plantAuthList = plantAuthList;
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
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
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
    public void setLoginPlantAuthList(List<? extends W9004UserIdMaDomain> loginPlantAuthList) {
        this.loginPlantAuthList = loginPlantAuthList;
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
    public void setLoginCompAuthList(List<? extends W9004UserIdMaDomain> loginCompAuthList) {
        this.loginCompAuthList = loginCompAuthList;
    }

    /**
     * Getter method for lastUpdate.
     *
     * @return the lastUpdate
     */
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Setter method for lastUpdate.
     *
     * @param lastUpdate Set for lastUpdate
     */
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
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
     * Getter method for updateCount.
     *
     * @return the updateCount
     */
    public String getUpdateCount() {
        return updateCount;
    }

    /**
     * Setter method for updateCount.
     *
     * @param updateCount Set for updateCount
     */
    public void setUpdateCount(String updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * Getter method for createCount.
     *
     * @return the createCount
     */
    public String getCreateCount() {
        return createCount;
    }

    /**
     * Setter method for createCount.
     *
     * @param createCount Set for createCount
     */
    public void setCreateCount(String createCount) {
        this.createCount = createCount;
    }

    /**
     * Getter method for deleteCount.
     *
     * @return the deleteCount
     */
    public String getDeleteCount() {
        return deleteCount;
    }

    /**
     * Setter method for deleteCount.
     *
     * @param deleteCount Set for deleteCount
     */
    public void setDeleteCount(String deleteCount) {
        this.deleteCount = deleteCount;
    }

}
