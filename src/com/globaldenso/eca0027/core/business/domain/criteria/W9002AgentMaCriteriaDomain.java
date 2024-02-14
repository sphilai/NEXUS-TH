/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.sql.Timestamp;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain of search criteria Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面の検索条件ドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class W9002AgentMaCriteriaDomain extends AbstractDomain {

    /**
     * Serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Org Company
     */
    private String prmOrgCompCd;

    /**
     * Agent Company
     */
    private String prmAgentCompCd;

    /**
     * Function
     */
    private String prmFunctionNo;

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
     * Function no
     */
    private String functionNo;
    
    /**
     * Processing mode.<br />
     * 処理モード
     */
    private String procMode;
    
    /**
     * Login person COMPANY CODE.<br />
     * ログイン者会社コード
     */
    private String loginCompCd;
    
    /**
     * COMPANY CODE to possess update privileges.<br />
     * 更新権限を保有する会社コード
     */
    private List<String> authUpdCompCd;

    /**
     * Authority check SERVER ID.<br />
     * 権限チェック用サーバID
     */
    private String serverId;

    /**
     * User authorization list.<br />
     * ユーザ権限リスト
     */
    private List<UserAuthDomain> userAuthList;
    
    /**
     * Deletion Org Company.<br />
     * 削除用 Org Company
     */
    private String delOrgCompCd;

    /**
     * Deletion Agent Company.<br />
     * 削除用 Agent Company
     */
    private String delAgentCompCd;

    /**
     * Deletion LAST UPDATE DATE.<br />
     * 削除用 最終更新日時
     */
    private Timestamp delComUpdateTimestamp;

    /**
     * Locking COMPANY CODE.<br />
     * ロック用 会社コード
     */
    private String argOrgCompCd;

    /**
     * Processing mode.<br />
     * 処理モード
     */
    private String mode;

    /**
     * BHT UNLOCK AUTHORITY FLAG/ BHT UNLOCK AUTHORITY FLAG.<br />
     * BHT UNLOCK AUTHORITY FLAG/BHTロック解除権限フラグ
     */
    private String bhtUnlockAuthFlg;

    /**
     * MA OTHER AUTHORITY FLAG/ MA OTHER AUTHORITY FLAG.<br />
     * MA OTHER AUTHORITY FLAG/マスタ(他)権限フラグ
     */
    private String maOtherAuthFlg;

    /**
     * DOC AUTHORITY FLAG/ DOC AUTHORITY FLAG.<br />
     * DOC AUTHORITY FLAG/書類作成権限フラグ
     */
    private String docAuthFlg;

    /**
     * SHIPPING ACTUALITY AUTHORITY FLAG/ SHIPPING ACTUALITY AUTHORITY FLAG.<br />
     * SHIPPING ACTUALITY AUTHORITY FLAG/船積実績権限フラグ
     */
    private String shippingActAuthFlg;

    /**
     * EXPORT REQUEST AUTHORITY FLAG/ EXPORT REQUEST AUTHORITY FLAG.<br />
     * EXPORT REQUEST AUTHORITY FLAG/輸出依頼権限フラグ
     */
    private String expRequestAuthFlg;

    /**
     * EXPORT REQUEST PACKAGE AUTHORITY FLAG/ EXPORT REQUEST PACKAGE AUTHORITY FLAG.<br />
     * EXPORT REQUEST PACKAGE AUTHORITY FLAG/輸出依頼梱包権限フラグ
     */
    private String expRequestPkgAuthFlg;

    /**
     * ERT AUTHORITY FLAG/ ERT AUTHORITY FLAG.<br />
     * ERT AUTHORITY FLAG/返却通箱権限フラグ
     */
    private String ertAuthFlg;

    /**
     * RECEIVE ORDER AUTHORITY FLAG/ RECEIVE ORDER AUTHORITY FLAG.<br />
     * RECEIVE ORDER AUTHORITY FLAG/受注権限フラグ
     */
    private String rcvOdrAuthFlg;

    /**
     * PALLETIZE INSTRUCTION AUTHORITY FLAG/ PALLETIZE INSTRUCTION AUTHORITY FLAG.<br />
     * PALLETIZE INSTRUCTION AUTHORITY FLAG/梱包指示権限フラグ
     */
    private String pltzInstrAuthFlg;

    /**
     * MIX TAG AUTHORITY FLAG/ MIX TAG AUTHORITY FLAG.<br />
     * MIX TAG AUTHORITY FLAG/M-TAG権限フラグ
     */
    private String mixTagAuthFlg;

    /**
     * CML AUTHORITY FLAG/ CML AUTHORITY FLAG.<br />
     * CML AUTHORITY FLAG/CML権限フラグ
     */
    private String cmlAuthFlg;

    /**
     * X-TAG AUTHORITY FLAG/ X-TAG AUTHORITY FLAG.<br />
     * X-TAG AUTHORITY FLAG/X-TAG権限フラグ
     */
    private String xTagAuthFlg;

    /**
     * TRANSFER AUTHORITY FLAG/ TRANSFER AUTHORITY FLAG.<br />
     * TRANSFER AUTHORITY FLAG/搬出入権限フラグ
     */
    private String trAuthFlg;

    /**
     * STAGING INSTRUCTION AUTHORITY FLAG/ STAGING INSTRUCTION AUTHORITY FLAG.<br />
     * STAGING INSTRUCTION AUTHORITY FLAG/荷揃え指示権限フラグ
     */
    private String stgInstrAuthFlg;

    /**
     * STAGING ACTUALITY AUTHORITY FLAG/ STAGING ACTUALITY AUTHORITY FLAG.<br />
     * STAGING ACTUALITY AUTHORITY FLAG/山作り実績権限フラグ
     */
    private String stgActAuthFlg;

    /**
     * SHIPPING CONFIRM AUTHORITY FLAG/ SHIPPING CONFIRM AUTHORITY FLAG.<br />
     * SHIPPING CONFIRM AUTHORITY FLAG/出荷確認権限フラグ
     */
    private String shippingFirmAuthFlg;

    /**
     * PROG CONTROL AUTHORITY FLAG/ PROG CONTROL AUTHORITY FLAG.<br />
     * PROG CONTROL AUTHORITY FLAG/進度管理権限フラグ
     */
    private String progControlAuthFlg;

    /**
     * dscId
     */
    private String dscId;
    
    /**
     * dscIdList
     */
    private List<TmUserConfDomain> dscIdList;
    
    /**
     * PageInfoCreator object.<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * The default constructor.<br />
     * デフォルトコンストラクター
     *
     */
    public W9002AgentMaCriteriaDomain() {
    }

    /**
     * Getter method for bhtUnlockAuthFlg.
     *
     * @return the bhtUnlockAuthFlg
     */
    public String getBhtUnlockAuthFlg() {
        return bhtUnlockAuthFlg;
    }

    /**
     * Setter method for bhtUnlockAuthFlg.
     *
     * @param bhtUnlockAuthFlg Set for bhtUnlockAuthFlg
     */
    public void setBhtUnlockAuthFlg(String bhtUnlockAuthFlg) {
        this.bhtUnlockAuthFlg = bhtUnlockAuthFlg;
    }

    /**
     * Getter method for maOtherAuthFlg.
     *
     * @return the maOtherAuthFlg
     */
    public String getMaOtherAuthFlg() {
        return maOtherAuthFlg;
    }

    /**
     * Setter method for maOtherAuthFlg.
     *
     * @param maOtherAuthFlg Set for maOtherAuthFlg
     */
    public void setMaOtherAuthFlg(String maOtherAuthFlg) {
        this.maOtherAuthFlg = maOtherAuthFlg;
    }

    /**
     * Getter method for docAuthFlg.
     *
     * @return the docAuthFlg
     */
    public String getDocAuthFlg() {
        return docAuthFlg;
    }

    /**
     * Setter method for docAuthFlg.
     *
     * @param docAuthFlg Set for docAuthFlg
     */
    public void setDocAuthFlg(String docAuthFlg) {
        this.docAuthFlg = docAuthFlg;
    }

    /**
     * Getter method for shippingActAuthFlg.
     *
     * @return the shippingActAuthFlg
     */
    public String getShippingActAuthFlg() {
        return shippingActAuthFlg;
    }

    /**
     * Setter method for shippingActAuthFlg.
     *
     * @param shippingActAuthFlg Set for shippingActAuthFlg
     */
    public void setShippingActAuthFlg(String shippingActAuthFlg) {
        this.shippingActAuthFlg = shippingActAuthFlg;
    }

    /**
     * Getter method for expRequestAuthFlg.
     *
     * @return the expRequestAuthFlg
     */
    public String getExpRequestAuthFlg() {
        return expRequestAuthFlg;
    }

    /**
     * Setter method for expRequestAuthFlg.
     *
     * @param expRequestAuthFlg Set for expRequestAuthFlg
     */
    public void setExpRequestAuthFlg(String expRequestAuthFlg) {
        this.expRequestAuthFlg = expRequestAuthFlg;
    }

    /**
     * Getter method for expRequestPkgAuthFlg.
     *
     * @return the expRequestPkgAuthFlg
     */
    public String getExpRequestPkgAuthFlg() {
        return expRequestPkgAuthFlg;
    }

    /**
     * Setter method for expRequestPkgAuthFlg.
     *
     * @param expRequestPkgAuthFlg Set for expRequestPkgAuthFlg
     */
    public void setExpRequestPkgAuthFlg(String expRequestPkgAuthFlg) {
        this.expRequestPkgAuthFlg = expRequestPkgAuthFlg;
    }

    /**
     * Getter method for ertAuthFlg.
     *
     * @return the ertAuthFlg
     */
    public String getErtAuthFlg() {
        return ertAuthFlg;
    }

    /**
     * Setter method for ertAuthFlg.
     *
     * @param ertAuthFlg Set for ertAuthFlg
     */
    public void setErtAuthFlg(String ertAuthFlg) {
        this.ertAuthFlg = ertAuthFlg;
    }

    /**
     * Getter method for rcvOdrAuthFlg.
     *
     * @return the rcvOdrAuthFlg
     */
    public String getRcvOdrAuthFlg() {
        return rcvOdrAuthFlg;
    }

    /**
     * Setter method for rcvOdrAuthFlg.
     *
     * @param rcvOdrAuthFlg Set for rcvOdrAuthFlg
     */
    public void setRcvOdrAuthFlg(String rcvOdrAuthFlg) {
        this.rcvOdrAuthFlg = rcvOdrAuthFlg;
    }

    /**
     * Getter method for pltzInstrAuthFlg.
     *
     * @return the pltzInstrAuthFlg
     */
    public String getPltzInstrAuthFlg() {
        return pltzInstrAuthFlg;
    }

    /**
     * Setter method for pltzInstrAuthFlg.
     *
     * @param pltzInstrAuthFlg Set for pltzInstrAuthFlg
     */
    public void setPltzInstrAuthFlg(String pltzInstrAuthFlg) {
        this.pltzInstrAuthFlg = pltzInstrAuthFlg;
    }

    /**
     * Getter method for mixTagAuthFlg.
     *
     * @return the mixTagAuthFlg
     */
    public String getMixTagAuthFlg() {
        return mixTagAuthFlg;
    }

    /**
     * Setter method for mixTagAuthFlg.
     *
     * @param mixTagAuthFlg Set for mixTagAuthFlg
     */
    public void setMixTagAuthFlg(String mixTagAuthFlg) {
        this.mixTagAuthFlg = mixTagAuthFlg;
    }

    /**
     * Getter method for cmlAuthFlg.
     *
     * @return the cmlAuthFlg
     */
    public String getCmlAuthFlg() {
        return cmlAuthFlg;
    }

    /**
     * Setter method for cmlAuthFlg.
     *
     * @param cmlAuthFlg Set for cmlAuthFlg
     */
    public void setCmlAuthFlg(String cmlAuthFlg) {
        this.cmlAuthFlg = cmlAuthFlg;
    }

    /**
     * Getter method for xTagAuthFlg.
     *
     * @return the xTagAuthFlg
     */
    public String getXTagAuthFlg() {
        return xTagAuthFlg;
    }

    /**
     * Setter method for xTagAuthFlg.
     *
     * @param tagAuthFlg Set for xTagAuthFlg
     */
    public void setXTagAuthFlg(String tagAuthFlg) {
        xTagAuthFlg = tagAuthFlg;
    }

    /**
     * Getter method for trAuthFlg.
     *
     * @return the trAuthFlg
     */
    public String getTrAuthFlg() {
        return trAuthFlg;
    }

    /**
     * Setter method for trAuthFlg.
     *
     * @param trAuthFlg Set for trAuthFlg
     */
    public void setTrAuthFlg(String trAuthFlg) {
        this.trAuthFlg = trAuthFlg;
    }

    /**
     * Getter method for stgInstrAuthFlg.
     *
     * @return the stgInstrAuthFlg
     */
    public String getStgInstrAuthFlg() {
        return stgInstrAuthFlg;
    }

    /**
     * Setter method for stgInstrAuthFlg.
     *
     * @param stgInstrAuthFlg Set for stgInstrAuthFlg
     */
    public void setStgInstrAuthFlg(String stgInstrAuthFlg) {
        this.stgInstrAuthFlg = stgInstrAuthFlg;
    }

    /**
     * Getter method for stgActAuthFlg.
     *
     * @return the stgActAuthFlg
     */
    public String getStgActAuthFlg() {
        return stgActAuthFlg;
    }

    /**
     * Setter method for stgActAuthFlg.
     *
     * @param stgActAuthFlg Set for stgActAuthFlg
     */
    public void setStgActAuthFlg(String stgActAuthFlg) {
        this.stgActAuthFlg = stgActAuthFlg;
    }

    /**
     * Getter method for shippingFirmAuthFlg.
     *
     * @return the shippingFirmAuthFlg
     */
    public String getShippingFirmAuthFlg() {
        return shippingFirmAuthFlg;
    }

    /**
     * Setter method for shippingFirmAuthFlg.
     *
     * @param shippingFirmAuthFlg Set for shippingFirmAuthFlg
     */
    public void setShippingFirmAuthFlg(String shippingFirmAuthFlg) {
        this.shippingFirmAuthFlg = shippingFirmAuthFlg;
    }

    /**
     * Getter method for progControlAuthFlg.
     *
     * @return the progControlAuthFlg
     */
    public String getProgControlAuthFlg() {
        return progControlAuthFlg;
    }

    /**
     * Setter method for progControlAuthFlg.
     *
     * @param progControlAuthFlg Set for progControlAuthFlg
     */
    public void setProgControlAuthFlg(String progControlAuthFlg) {
        this.progControlAuthFlg = progControlAuthFlg;
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
     * Getter method for loginCompCd.
     *
     * @return the loginCompCd
     */
    public String getLoginCompCd() {
        return loginCompCd;
    }

    /**
     * Setter method for loginCompCd.
     *
     * @param loginCompCd Set for loginCompCd
     */
    public void setLoginCompCd(String loginCompCd) {
        this.loginCompCd = loginCompCd;
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
     * Getter method for delOrgCompCd.
     *
     * @return the delOrgCompCd
     */
    public String getDelOrgCompCd() {
        return delOrgCompCd;
    }

    /**
     * Setter method for delOrgCompCd.
     *
     * @param delOrgCompCd Set for delOrgCompCd
     */
    public void setDelOrgCompCd(String delOrgCompCd) {
        this.delOrgCompCd = delOrgCompCd;
    }

    /**
     * Getter method for delAgentCompCd.
     *
     * @return the delAgentCompCd
     */
    public String getDelAgentCompCd() {
        return delAgentCompCd;
    }

    /**
     * Setter method for delAgentCompCd.
     *
     * @param delAgentCompCd Set for delAgentCompCd
     */
    public void setDelAgentCompCd(String delAgentCompCd) {
        this.delAgentCompCd = delAgentCompCd;
    }

    /**
     * Getter method for delComUpdateTimestamp.
     *
     * @return the delComUpdateTimestamp
     */
    public Timestamp getDelComUpdateTimestamp() {
        return delComUpdateTimestamp;
    }

    /**
     * Setter method for delComUpdateTimestamp.
     *
     * @param delComUpdateTimestamp Set for delComUpdateTimestamp
     */
    public void setDelComUpdateTimestamp(Timestamp delComUpdateTimestamp) {
        this.delComUpdateTimestamp = delComUpdateTimestamp;
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
     * Getter method for dscIdList.
     *
     * @return the dscIdList
     */
    public List<TmUserConfDomain> getDscIdList() {
        return dscIdList;
    }

    /**
     * Setter method for dscIdList.
     *
     * @param dscIdList Set for dscIdList
     */
    public void setDscIdList(List<TmUserConfDomain> dscIdList) {
        this.dscIdList = dscIdList;
    }

    /**
     * Getter method for argOrgCompCd.
     *
     * @return the argOrgCompCd
     */
    public String getArgOrgCompCd() {
        return argOrgCompCd;
    }

    /**
     * Setter method for argOrgCompCd.
     *
     * @param argOrgCompCd Set for argOrgCompCd
     */
    public void setArgOrgCompCd(String argOrgCompCd) {
        this.argOrgCompCd = argOrgCompCd;
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
     * Getter method for prmOrgCompCd.
     *
     * @return the prmOrgCompCd
     */
    public String getPrmOrgCompCd() {
        return prmOrgCompCd;
    }

    /**
     * Setter method for prmOrgCompCd.
     *
     * @param prmOrgCompCd Set for prmOrgCompCd
     */
    public void setPrmOrgCompCd(String prmOrgCompCd) {
        this.prmOrgCompCd = prmOrgCompCd;
    }

    /**
     * Getter method for prmAgentCompCd.
     *
     * @return the prmAgentCompCd
     */
    public String getPrmAgentCompCd() {
        return prmAgentCompCd;
    }

    /**
     * Setter method for prmAgentCompCd.
     *
     * @param prmAgentCompCd Set for prmAgentCompCd
     */
    public void setPrmAgentCompCd(String prmAgentCompCd) {
        this.prmAgentCompCd = prmAgentCompCd;
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

}
