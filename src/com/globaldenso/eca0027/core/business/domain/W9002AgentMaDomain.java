/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;
import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of Agent MA Inquiry screen.
 * <br />Agent MA Inquiry画面の情報を保持するドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9002AgentMaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * ORIGINAL COMPANY CODE<br />
     * (代行依頼元)会社コード
     */
    private String orgCompCd;

    /**
     * AGENT COMPANY CODE<br />
     * (代行依頼先)会社コード
     */
    private String agentCompCd;

    /**
     * BHT UNLOCK AUTHORITY FLAG<br />
     * BHTロック解除権限フラグ
     */
    private String bhtUnlockAuthFlg;

    /**
     * MA OTHER AUTHORITY FLAG<br />
     * マスタ(他)権限フラグ
     */
    private String maOtherAuthFlg;

    /**
     *DOC AUTHORITY FLAG<br />
     * 書類作成権限フラグ
     */
    private String docAuthFlg;

    /**
     *SHIPPING ACTUALITY AUTHORITY FLAG<br />
     * 船積実績権限フラグ
     */
    private String shippingActAuthFlg;

    /**
     *EXPORT REQUEST AUTHORITY FLAG<br />
     * 輸出依頼権限フラグ
     */
    private String expRequestAuthFlg;

    /**
     *EXPORT REQUEST PACKAGE AUTHORITY FLAG<br />
     * 輸出依頼梱包権限フラグ
     */
    private String expRequestPkgAuthFlg;

    /**
     *ERT AUTHORITY FLAG<br />
     * 返却通箱権限フラグ
     */
    private String ertAuthFlg;

    /**
     *RECEIVE ORDER AUTHORITY FLAG<br />
     * 受注権限フラグ
     */
    private String rcvOdrAuthFlg;

    /**
     *PALLETIZE INSTRUCTION AUTHORITY FLAG<br />
     * 梱包指示権限フラグ
     */
    private String pltzInstrAuthFlg;

    /**
     *MIX TAG AUTHORITY FLAG<br />
     * M-TAG権限フラグ
     */
    private String mixTagAuthFlg;

    /**
     *CML AUTHORITY FLAG<br />
     * CML権限フラグ
     */
    private String cmlAuthFlg;

    /**
     *X-TAG AUTHORITY FLAG<br />
     * X-TAG権限フラグ
     */
    private String xTagAuthFlg;

    /**
     *TRANSFER AUTHORITY FLAG<br />
     * 搬出入権限フラグ
     */
    private String trAuthFlg;

    /**
     *STAGING INSTRUCTION AUTHORITY FLAG<br />
     * 荷揃え指示権限フラグ
     */
    private String stgInstrAuthFlg;

    /**
     *STAGING ACTUALITY AUTHORITY FLAG<br />
     * 山作り実績権限フラグ
     */
    private String stgActAuthFlg;

    /**
     *SHIPPING CONFIRM AUTHORITY FLAG<br />
     * 出荷確認権限フラグ
     */
    private String shippingFirmAuthFlg;

    /**
     *PROG CONTROL AUTHORITY FLAG<br />
     * 進度管理権限フラグ
     */
    private String progControlAuthFlg;

    /**
     *UPDATE TIMESTAMP<br />
     * 更新日時
     */
    private Timestamp comUpdateTimestamp;
    
    /**
     *UPDATE Agent Item Domain List<br />
     * 代行会社原単位リスト更新日時
     */
    private List<? extends W9002AgentMaItemDomain> w9002AgentMaItemDomainList;

    /**
     * Delete number<br />
     * 削除件数
     */
    private int delCntTmAgent = 0;
    
    /**
     * Processing mode<br />
     * 処理モード
     */
    private String mode;

    /**
     * Acquisition of COMPANY NAME ABBREVIATION of Org Company<br />
     * Org Companyの会社略称の取得
     */
    private String orgCompNmAbb;

    /**
     * Acquisition of COMPANY NAME ABBREVIATION of Agent Company<br />
     * Agent Companyの会社略称の取得
     */
    private String agtCompNmAbb;

    /**
     * Authority check result<br />
     * 権限チェック結果
     */
    private boolean authCheck;

    /**
     * User authorization list<br />
     * ユーザ権限リスト
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * DscId
     */
    private String dscId;

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9002AgentMaDomain() {
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
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }


    /**
     * Getter method for w9002AgentMaItemDomainList.
     *
     * @return the w9002AgentMaItemDomainList
     */
    public List<? extends W9002AgentMaItemDomain> getW9002AgentMaItemDomainList() {
        return w9002AgentMaItemDomainList;
    }

    /**
     * Setter method for w9002AgentMaItemDomainList.
     *
     * @param agentMaItemDomainList Set for w9002AgentMaItemDomainList
     */
    public void setW9002AgentMaItemDomainList(
        List<? extends W9002AgentMaItemDomain> agentMaItemDomainList) {
        w9002AgentMaItemDomainList = agentMaItemDomainList;
    }

    /**
     * Getter method for delCntTmAgent.
     *
     * @return the delCntTmAgent
     */
    public int getDelCntTmAgent() {
        return delCntTmAgent;
    }

    /**
     * Setter method for delCntTmAgent.
     *
     * @param delCntTmAgent Set for delCntTmAgent
     */
    public void setDelCntTmAgent(int delCntTmAgent) {
        this.delCntTmAgent = delCntTmAgent;
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
     * Getter method for orgCompNmAbb.
     *
     * @return the orgCompNmAbb
     */
    public String getOrgCompNmAbb() {
        return orgCompNmAbb;
    }

    /**
     * Setter method for orgCompNmAbb.
     *
     * @param orgCompNmAbb Set for orgCompNmAbb
     */
    public void setOrgCompNmAbb(String orgCompNmAbb) {
        this.orgCompNmAbb = orgCompNmAbb;
    }

    /**
     * Getter method for agtCompNmAbb.
     *
     * @return the agtCompNmAbb
     */
    public String getAgtCompNmAbb() {
        return agtCompNmAbb;
    }

    /**
     * Setter method for agtCompNmAbb.
     *
     * @param agtCompNmAbb Set for agtCompNmAbb
     */
    public void setAgtCompNmAbb(String agtCompNmAbb) {
        this.agtCompNmAbb = agtCompNmAbb;
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
     * Getter method for authCheck.
     *
     * @return the authCheck
     */
    public boolean isAuthCheck() {
        return authCheck;
    }

    /**
     * Setter method for authCheck.
     *
     * @param authCheck Set for authCheck
     */
    public void setAuthCheck(boolean authCheck) {
        this.authCheck = authCheck;
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
