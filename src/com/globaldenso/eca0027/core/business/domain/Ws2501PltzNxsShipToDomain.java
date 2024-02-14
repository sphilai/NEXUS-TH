/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain holding the result of SearchPltzNxsShipTo.
 * <br />SearchPltzNxsShipToの結果を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501PltzNxsShipToDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MAIN_MARK
     */
    private String  mainMark;
    /**
     * TRNS_CD
     */
    private String  trnsCd;
    /**
     * CONTAINER_SORTING_KEY
     */
    private String  containerSortingKey;
    /**
     * CML_TYP
     */
    private String  cmlTyp;
    /**
     * INVOICE_KEY
     */
    private String  invoiceKey;
    /**
     * PLTZ_STATUS
     */
    private String  pltzStatus;
    /**
     * STG_INSTR_ITEM_FLG
     */
    private String  stgInstrItemFlg;
    /**
     * CUR_WH_COMP_CD
     */
    private String  curWhCompCd;
    /**
     * CUR_WH_CD
     */
    private String  curWhCd;
    /**
     * XMAIN_MARK
     */
    private String  xmainMark;
    /**
     * LOADING_CD
     */
    private String  loadingCd;
    /**
     * DNGR_ITEM_FLG
     */
    private String  dngrItemFlg;
    /**
     * STAGING INSTRUCTION NO
     * <br />荷揃え指示NO
     */
    private String  stgInstrNo;
    /**
     * CUSTOM_TIMING_TYP
     */
    private String  customTimingTyp;
    /**
     * LAST_TR_STATUS
     */
    private String  lastTrStatus;
    /**
     * MIGRATION_FLG
     */
    private String  migrationFlg;
    /**
     * COMP_CD
     */
    private String  compCd;


    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501PltzNxsShipToDomain() {
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for cmlTyp.
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * Setter method for cmlTyp.
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * Getter method for invoiceKey.
     *
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * Setter method for invoiceKey.
     *
     * @param invoiceKey Set for invoiceKey
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    /**
     * Getter method for pltzStatus.
     *
     * @return the pltzStatus
     */
    public String getPltzStatus() {
        return pltzStatus;
    }

    /**
     * Setter method for pltzStatus.
     *
     * @param pltzStatus Set for pltzStatus
     */
    public void setPltzStatus(String pltzStatus) {
        this.pltzStatus = pltzStatus;
    }

    /**
     * Getter method for stgInstrItemFlg.
     *
     * @return the stgInstrItemFlg
     */
    public String getStgInstrItemFlg() {
        return stgInstrItemFlg;
    }

    /**
     * Setter method for stgInstrItemFlg.
     *
     * @param stgInstrItemFlg Set for stgInstrItemFlg
     */
    public void setStgInstrItemFlg(String stgInstrItemFlg) {
        this.stgInstrItemFlg = stgInstrItemFlg;
    }

    /**
     * Getter method for curWhCompCd.
     *
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * Setter method for curWhCompCd.
     *
     * @param curWhCompCd Set for curWhCompCd
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * Getter method for curWhCd.
     *
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * Setter method for curWhCd.
     *
     * @param curWhCd Set for curWhCd
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
    }

    /**
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }

    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for dngrItemFlg.
     *
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * Setter method for dngrItemFlg.
     *
     * @param dngrItemFlg Set for dngrItemFlg
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * Getter method for stgInstrNo.
     *
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * Setter method for stgInstrNo.
     *
     * @param stgInstrNo Set for stgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }
    
    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * Getter method for lastTrStatus.
     *
     * @return the lastTrStatus
     */
    public String getLastTrStatus() {
        return lastTrStatus;
    }

    /**
     * Setter method for lastTrStatus.
     *
     * @param lastTrStatus Set for lastTrStatus
     */
    public void setLastTrStatus(String lastTrStatus) {
        this.lastTrStatus = lastTrStatus;
    }

    /**
     * Getter method for migrationFlg.
     *
     * @return the migrationFlg
     */
    public String getMigrationFlg() {
        return migrationFlg;
    }

    /**
     * Setter method for migrationFlg.
     *
     * @param migrationFlg Set for migrationFlg
     */
    public void setMigrationFlg(String migrationFlg) {
        this.migrationFlg = migrationFlg;
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
}
