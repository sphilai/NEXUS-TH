/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of list that holds the information of User ID MA screen.
 * <br />User ID MA画面の情報を保持するリストドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9004UserIdMaItemDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * DSC-ID/DSC-ID
     */
    private String dscId;
    
    /**
     * COMPANY NAME ABBREVIATION<br />
     * 会社略称
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
     * COMPANY CODE<br />
     * 会社コード
     */
    private String compCd;

    /**
     * PLANT CODE<br />
     * 製造部工場区分
     */
    private String plntCd;

    /**
     * AUTHORITY MANAGEMENT COMPANY<br />
     * 権限付与会社
     */
    private String authMgtComp;

    /**
     * AUTHORITY MANAGEMENT PROCESS<br />
     * 権限付与製造部
     */
    private String authMgtProc;

    /**
     * LAST UPDATE DATE<br />
     * 最終更新日
     */
    private Timestamp lastUpdate;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9004UserIdMaItemDomain() {
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
}
