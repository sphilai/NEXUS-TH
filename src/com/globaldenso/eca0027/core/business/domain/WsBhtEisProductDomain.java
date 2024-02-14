/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;
import java.util.Map;

import com.globaldenso.eca0027.core.auto.business.domain.TtMixtagDomain;
import com.globaldenso.eca0027.core.auto.business.domain.TtPltzDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is an EisProduct domain.
 * <br />EisProductドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
public class WsBhtEisProductDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    // --------------------------------- Common --------------------------------------------------------------------------
    // --------------------------------- 共通 ----------------------------------------------------------------------------
    /**
     * RESULT CODE
     * <br />結果コード
     */
    private String resultCd;
    
    /**
     * ERROR CODE
     * <br />エラーコード
     */
    private String errCd;
    
    /**
     * ERROR CODE MAP
     * <br />エラーコードMap
     */
    private Map<String, Object[]> errMap;
    
    // --------------------------------- ECA0027_WS_2501_Get Palletize Instruction ---------------------------------------
    /**
     * [ws2502] Internal variable (header) domain
     * <br /> 内部変数（ヘッダー）ドメイン
     */
    private Ws2501InternalVariableHdrDomain ws2501InternalVariableHdrDomain;

    /**
     * [ws2501] customer KANBAN QR domain list
     * <br />得意先かんばんQRドメインリスト
     */
    private List<? extends Ws2501TmCustomerQrPatternHdrByDtlDomain> ws2501TmCustomerQrPatternHdrByDtlList;
    
    /**
     * [ws2501] unpacked up Mix tag domain list
     * <br />未梱包Mixタグドメインリスト
     */
    private List<TtMixtagDomain> ws2501TtMixtagByNoPltzInstrList;
    
    /**
     * [ws2501] Mix tag domain list
     * <br />Mixタグドメインリスト
     */
    private List<TtMixtagDomain> ws2501TtMixtagList;
    
    /**
     * [ws2501] KANBAN domain list
     * <br />かんばんドメインリスト
     */
    private List<? extends Ws2501TtPltzItemByKanbanDomain> ws2501TtPltzItemByKanbanList;
    
    /**
     * [ws2501] Palletize-Instruction domain list
     * <br />梱包指示ドメインリスト
     */
    private List<TtPltzDomain> ws2501TtPltzList;
    
    /**
     * [ws2501] unpacked up domain list
     * <br />未梱包ドメインリスト
     */
    private List<? extends Ws2501UnpackagedItemNoDomain> ws2501UnpackagedItemNoList;
    
    // --------------------------------- ECA0027_WS_2502_Create Inst Palletize -------------------------------------------
    /**
     * [ws2502][ws2503] Time stamp of the CML error report (header) registered by Web service
     * <br />Webサービスで登録したCMLエラーレポート（ヘッダ）のタイムスタンプ
     */
    private String errCreateTimestamp;
    
    /**
     * [ws2502][ws2503]MAIN MARK
     * <br />メインマーク
     */
    private String mainMark;
    
    /**
     * [ws2502] Internal variable (header) domain
     * <br /> 内部変数（ヘッダー）ドメイン
     */
    private Ws2501InternalVariableHdrDomain ws2502InternalVariableHdrDomain;
    
    /**
     * [ws2504] Registered MAIN-MARK list
     * <br /> 登録されたメインマークリスト
     */
    private List<TtPltzDomain> ws2502TtPltzList;
    
    /**
     * [ws2502] KANBAN list
     * <br /> かんばんリスト
     */
    private List<? extends Ws2501TtPltzItemByKanbanDomain> ws2502TtPltzItemByKanbanList;
    
    /**
     * [ws2502] MIX tag list
     * <br /> MIXタグリスト
     */
    private List<String> ws2502MixTagList;
    
    /**
     * [ws2502] unpacked up ITEM-NO list
     * <br /> 未梱包品目番号リスト
     */
    private List<? extends Ws2501UnpackagedItemNoDomain> ws2502UnpackagedItemNoList;
    
    /**
     * [ws2502] unpacked up MIX tag list
     * <br /> 未梱包MIXタグリスト
     */
    private List<String> ws2502UnpackagedMixTagList;
    
    // --------------------------------- ECA0027_WS_2503_Create Non Inst Palletize ---------------------------------------
    /*
     * [ws2502][ws2503] Time stamp of the CML error report (header) registered by Web service
     * <br /> Webサービスで登録したCMLエラーレポート（ヘッダ）のタイムスタンプ
     */
    // private String errCreateTimestamp;
    
    /*
     * [ws2502][ws2503] MAIN MARK
     * <br /> メインマーク
     */
    // private String mainMark;
    
    /**
     * [ws2503] Internal variable (header) domain
     * <br /> 内部変数（ヘッダー）ドメイン
     */
    private Ws2501InternalVariableHdrDomain ws2503InternalVariableHdrDomain;
    
    /**
     * [ws2503] Internal variable (details) domain
     * <br /> 内部変数（明細）ドメイン
     */
    private List<? extends Ws2501InternalVariableDtlDomain> ws2503InternalVariableDtlDomainList;
    
    // --------------------------------- ECA0027_WS_2504_Create E-RT Palletize -------------------------------------------

    /**
     * [ws2504] Registered MAIN-MARK list
     * <br /> 登録されたメインマークリスト
     */
    private List<Ws2504RegistCmlListItemDomain> registCmlList;
    
    /**
     * [ws2504] Number of Print
     * <br /> 印刷部数
     */
    private int cmlPrintNum;
    
    // --------------------------------- ECA0027_WS_2505_Create PKG Spec -------------------------------------------------
    
    // --------------------------------- ECA0027_WS_2507_Print Case Mark Label -------------------------------------------
    
    // --------------------------------- ECA0027_WS_2508_Create Mixed Label ----------------------------------------------
    
    /**
     * [ws2508]Ws2508 MIX_TAG_NO
     */
    private String mixTagNo;
    
    /**
     * [ws2508] Internal variable (header) domain
     * <br /> 内部変数（ヘッダー）ドメイン
     */
    private Ws2501InternalVariableHdrDomain ws2508InternalVariableHdrDomain;
    
    // --------------------------------- ECA0027_WS_2509_Print Mixed Label -----------------------------------------------
    
    // --------------------------------- ECA0027_WS_2510_Create X CML ----------------------------------------------------
    /**
     * [ws2510] X-TAG
     * <br /> まとめメインマーク
     */
    private String xmainMark;
    
    /**
     * [ws2510]PALLET NO
     * <br /> パレットNO
     */
    private String palletNo;
    
    // --------------------------------- ECA0027_WS_2511_Print X CML -----------------------------------------------------
    
    // --------------------------------- ECA0027_WS_2512_Print Case Mark Label(E-RT) -------------------------------------
    
    // --------------------------------- Constructor ------------------------------------------------------------------
    // --------------------------------- コンストラクタ ------------------------------------------------------------------
    /**
     * constructor.
     */
    public WsBhtEisProductDomain() {
        super();
    }
    
    // --------------------------------- Getter / Setter -----------------------------------------------------------------
    /**
     * Getter method for resultCd.
     *
     * @return the resultCd
     */
    public String getResultCd() {
        return resultCd;
    }

    /**
     * Setter method for resultCd.
     *
     * @param resultCd Set for resultCd
     */
    public void setResultCd(String resultCd) {
        this.resultCd = resultCd;
    }

    /**
     * Getter method for errCd.
     *
     * @return the errCd
     */
    public String getErrCd() {
        return errCd;
    }

    /**
     * Setter method for errCd.
     *
     * @param errCd Set for errCd
     */
    public void setErrCd(String errCd) {
        this.errCd = errCd;
    }

    /**
     * Getter method for errMap.
     *
     * @return the errMap
     */
    public Map<String, Object[]> getErrMap() {
        return errMap;
    }

    /**
     * Setter method for errMap.
     *
     * @param errMap Set for errMap
     */
    public void setErrMap(Map<String, Object[]> errMap) {
        this.errMap = errMap;
    }

    /**
     * Getter method for ws2501InternalVariableHdrDomain.
     *
     * @return the ws2501InternalVariableHdrDomain
     */
    public Ws2501InternalVariableHdrDomain getWs2501InternalVariableHdrDomain() {
        return ws2501InternalVariableHdrDomain;
    }

    /**
     * Setter method for ws2501InternalVariableHdrDomain.
     *
     * @param ws2501InternalVariableHdrDomain Set for ws2501InternalVariableHdrDomain
     */
    public void setWs2501InternalVariableHdrDomain(
            Ws2501InternalVariableHdrDomain ws2501InternalVariableHdrDomain) {
        this.ws2501InternalVariableHdrDomain = ws2501InternalVariableHdrDomain;
    }

    /**
     * Getter method for ws2501TmCustomerQrPatternHdrByDtlList.
     *
     * @return the ws2501TmCustomerQrPatternHdrByDtlList
     */
    public List<? extends Ws2501TmCustomerQrPatternHdrByDtlDomain> getWs2501TmCustomerQrPatternHdrByDtlList() {
        return ws2501TmCustomerQrPatternHdrByDtlList;
    }

    /**
     * Setter method for ws2501TmCustomerQrPatternHdrByDtlList.
     *
     * @param ws2501TmCustomerQrPatternHdrByDtlList Set for ws2501TmCustomerQrPatternHdrByDtlList
     */
    public void setWs2501TmCustomerQrPatternHdrByDtlList(
        List<? extends Ws2501TmCustomerQrPatternHdrByDtlDomain> ws2501TmCustomerQrPatternHdrByDtlList) {
        this.ws2501TmCustomerQrPatternHdrByDtlList = ws2501TmCustomerQrPatternHdrByDtlList;
    }

    /**
     * Getter method for ws2501TtMixtagByNoPltzInstrList.
     *
     * @return the ws2501TtMixtagByNoPltzInstrList
     */
    public List<TtMixtagDomain> getWs2501TtMixtagByNoPltzInstrList() {
        return ws2501TtMixtagByNoPltzInstrList;
    }

    /**
     * Setter method for ws2501TtMixtagByNoPltzInstrList.
     *
     * @param ws2501TtMixtagByNoPltzInstrList Set for ws2501TtMixtagByNoPltzInstrList
     */
    public void setWs2501TtMixtagByNoPltzInstrList(
        List<TtMixtagDomain> ws2501TtMixtagByNoPltzInstrList) {
        this.ws2501TtMixtagByNoPltzInstrList = ws2501TtMixtagByNoPltzInstrList;
    }

    /**
     * Getter method for ws2501TtMixtagList.
     *
     * @return the ws2501TtMixtagList
     */
    public List<TtMixtagDomain> getWs2501TtMixtagList() {
        return ws2501TtMixtagList;
    }

    /**
     * Setter method for ws2501TtMixtagList.
     *
     * @param ws2501TtMixtagList Set for ws2501TtMixtagList
     */
    public void setWs2501TtMixtagList(List<TtMixtagDomain> ws2501TtMixtagList) {
        this.ws2501TtMixtagList = ws2501TtMixtagList;
    }

    /**
     * Getter method for ws2501TtPltzItemByKanbanList.
     *
     * @return the ws2501TtPltzItemByKanbanList
     */
    public List<? extends Ws2501TtPltzItemByKanbanDomain> getWs2501TtPltzItemByKanbanList() {
        return ws2501TtPltzItemByKanbanList;
    }

    /**
     * Setter method for ws2501TtPltzItemByKanbanList.
     *
     * @param ws2501TtPltzItemByKanbanList Set for ws2501TtPltzItemByKanbanList
     */
    public void setWs2501TtPltzItemByKanbanList(
        List<? extends Ws2501TtPltzItemByKanbanDomain> ws2501TtPltzItemByKanbanList) {
        this.ws2501TtPltzItemByKanbanList = ws2501TtPltzItemByKanbanList;
    }

    /**
     * Getter method for ws2501TtPltzList.
     *
     * @return the ws2501TtPltzList
     */
    public List<TtPltzDomain> getWs2501TtPltzList() {
        return ws2501TtPltzList;
    }

    /**
     * Setter method for ws2501TtPltzList.
     *
     * @param ws2501TtPltzList Set for ws2501TtPltzList
     */
    public void setWs2501TtPltzList(List<TtPltzDomain> ws2501TtPltzList) {
        this.ws2501TtPltzList = ws2501TtPltzList;
    }

    /**
     * Getter method for ws2501UnpackagedItemNoList.
     *
     * @return the ws2501UnpackagedItemNoList
     */
    public List<? extends Ws2501UnpackagedItemNoDomain> getWs2501UnpackagedItemNoList() {
        return ws2501UnpackagedItemNoList;
    }

    /**
     * Setter method for ws2501UnpackagedItemNoList.
     *
     * @param ws2501UnpackagedItemNoList Set for ws2501UnpackagedItemNoList
     */
    public void setWs2501UnpackagedItemNoList(
        List<? extends Ws2501UnpackagedItemNoDomain> ws2501UnpackagedItemNoList) {
        this.ws2501UnpackagedItemNoList = ws2501UnpackagedItemNoList;
    }

    /**
     * Getter method for errCreateTimestamp.
     *
     * @return the errCreateTimestamp
     */
    public String getErrCreateTimestamp() {
        return errCreateTimestamp;
    }

    /**
     * Setter method for errCreateTimestamp.
     *
     * @param errCreateTimestamp Set for errCreateTimestamp
     */
    public void setErrCreateTimestamp(String errCreateTimestamp) {
        this.errCreateTimestamp = errCreateTimestamp;
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
     * Getter method for ws2502InternalVariableHdrDomain.
     *
     * @return the ws2502InternalVariableHdrDomain
     */
    public Ws2501InternalVariableHdrDomain getWs2502InternalVariableHdrDomain() {
        return ws2502InternalVariableHdrDomain;
    }

    /**
     * Setter method for ws2502InternalVariableHdrDomain.
     *
     * @param ws2502InternalVariableHdrDomain Set for ws2502InternalVariableHdrDomain
     */
    public void setWs2502InternalVariableHdrDomain(
        Ws2501InternalVariableHdrDomain ws2502InternalVariableHdrDomain) {
        this.ws2502InternalVariableHdrDomain = ws2502InternalVariableHdrDomain;
    }

    /**
     * Getter method for ws2502TtPltzList.
     *
     * @return the ws2502TtPltzList
     */
    public List<TtPltzDomain> getWs2502TtPltzList() {
        return ws2502TtPltzList;
    }

    /**
     * Setter method for ws2502TtPltzList.
     *
     * @param ws2502TtPltzList Set for ws2502TtPltzList
     */
    public void setWs2502TtPltzList(List<TtPltzDomain> ws2502TtPltzList) {
        this.ws2502TtPltzList = ws2502TtPltzList;
    }

    /**
     * Getter method for ws2502TtPltzItemByKanbanList.
     *
     * @return the ws2502TtPltzItemByKanbanList
     */
    public List<? extends Ws2501TtPltzItemByKanbanDomain> getWs2502TtPltzItemByKanbanList() {
        return ws2502TtPltzItemByKanbanList;
    }

    /**
     * Setter method for ws2502TtPltzItemByKanbanList.
     *
     * @param ws2502TtPltzItemByKanbanList Set for ws2502TtPltzItemByKanbanList
     */
    public void setWs2502TtPltzItemByKanbanList(
        List<? extends Ws2501TtPltzItemByKanbanDomain> ws2502TtPltzItemByKanbanList) {
        this.ws2502TtPltzItemByKanbanList = ws2502TtPltzItemByKanbanList;
    }

    /**
     * Getter method for ws2502MixTagList.
     *
     * @return the ws2502MixTagList
     */
    public List<String> getWs2502MixTagList() {
        return ws2502MixTagList;
    }

    /**
     * Setter method for ws2502MixTagList.
     *
     * @param ws2502MixTagList Set for ws2502MixTagList
     */
    public void setWs2502MixTagList(List<String> ws2502MixTagList) {
        this.ws2502MixTagList = ws2502MixTagList;
    }

    /**
     * Getter method for ws2502UnpackagedItemNoList.
     *
     * @return the ws2502UnpackagedItemNoList
     */
    public List<? extends Ws2501UnpackagedItemNoDomain> getWs2502UnpackagedItemNoList() {
        return ws2502UnpackagedItemNoList;
    }

    /**
     * Setter method for ws2502UnpackagedItemNoList.
     *
     * @param ws2502UnpackagedItemNoList Set for ws2502UnpackagedItemNoList
     */
    public void setWs2502UnpackagedItemNoList(
        List<? extends Ws2501UnpackagedItemNoDomain> ws2502UnpackagedItemNoList) {
        this.ws2502UnpackagedItemNoList = ws2502UnpackagedItemNoList;
    }

    /**
     * Getter method for ws2502UnpackagedMixTagList.
     *
     * @return the ws2502UnpackagedMixTagList
     */
    public List<String> getWs2502UnpackagedMixTagList() {
        return ws2502UnpackagedMixTagList;
    }

    /**
     * Setter method for ws2502UnpackagedMixTagList.
     *
     * @param ws2502UnpackagedMixTagList Set for ws2502UnpackagedMixTagList
     */
    public void setWs2502UnpackagedMixTagList(
        List<String> ws2502UnpackagedMixTagList) {
        this.ws2502UnpackagedMixTagList = ws2502UnpackagedMixTagList;
    }

    /**
     * Getter method for registCmlList.
     *
     * @return the registCmlList
     */
    public List<Ws2504RegistCmlListItemDomain> getRegistCmlList() {
        return registCmlList;
    }

    /**
     * Setter method for registCmlList.
     *
     * @param registCmlList Set for registCmlList
     */
    public void setRegistCmlList(List<Ws2504RegistCmlListItemDomain> registCmlList) {
        this.registCmlList = registCmlList;
    }

    /**
     * <p>cmlPrintNum のゲッターメソッドです。</p>
     *
     * @return the cmlPrintNum
     */
    public int getCmlPrintNum() {
        return cmlPrintNum;
    }

    /**
     * <p>cmlPrintNum のセッターメソッドです。</p>
     *
     * @param cmlPrintNum cmlPrintNum に設定する
     */
    public void setCmlPrintNum(int cmlPrintNum) {
        this.cmlPrintNum = cmlPrintNum;
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
     * Getter method for palletNo.
     *
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * Setter method for palletNo.
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * Getter method for ws2503InternalVariableHdrDomain.
     *
     * @return the ws2503InternalVariableHdrDomain
     */
    public Ws2501InternalVariableHdrDomain getWs2503InternalVariableHdrDomain() {
        return ws2503InternalVariableHdrDomain;
    }

    /**
     * Setter method for ws2503InternalVariableHdrDomain.
     *
     * @param ws2503InternalVariableHdrDomain Set for ws2503InternalVariableHdrDomain
     */
    public void setWs2503InternalVariableHdrDomain(
        Ws2501InternalVariableHdrDomain ws2503InternalVariableHdrDomain) {
        this.ws2503InternalVariableHdrDomain = ws2503InternalVariableHdrDomain;
    }

    /**
     * Getter method for ws2503InternalVariableDtlDomainList.
     *
     * @return the ws2503InternalVariableDtlDomainList
     */
    public List<? extends Ws2501InternalVariableDtlDomain> getWs2503InternalVariableDtlDomainList() {
        return ws2503InternalVariableDtlDomainList;
    }

    /**
     * Getter method for mixTagNo.
     *
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * Setter method for mixTagNo.
     *
     * @param mixTagNo Set for mixTagNo
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
    }

    /**
     * Getter method for ws2508InternalVariableHdrDomain.
     *
     * @return the ws2508InternalVariableHdrDomain
     */
    public Ws2501InternalVariableHdrDomain getWs2508InternalVariableHdrDomain() {
        return ws2508InternalVariableHdrDomain;
    }

    /**
     * Setter method for ws2508InternalVariableHdrDomain.
     *
     * @param ws2508InternalVariableHdrDomain Set for ws2508InternalVariableHdrDomain
     */
    public void setWs2508InternalVariableHdrDomain(
        Ws2501InternalVariableHdrDomain ws2508InternalVariableHdrDomain) {
        this.ws2508InternalVariableHdrDomain = ws2508InternalVariableHdrDomain;
    }

    /**
     * Setter method for ws2503InternalVariableDtlDomainList.
     *
     * @param ws2503InternalVariableDtlDomainList Set for ws2503InternalVariableDtlDomainList
     */
    public void setWs2503InternalVariableDtlDomainList(
        List<? extends Ws2501InternalVariableDtlDomain> ws2503InternalVariableDtlDomainList) {
        this.ws2503InternalVariableDtlDomainList = ws2503InternalVariableDtlDomainList;
    }
}
