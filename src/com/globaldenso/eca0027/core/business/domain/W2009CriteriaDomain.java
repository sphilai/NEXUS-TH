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
 * The domain class that holds the criteria information of CML Main Screen
 * <br />CML Main画面の検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12609 $
 */
public class W2009CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * MAIN MARK
     * <br />メインマーク
     */
    private String mainMark;
    
    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * REVISE FLAG
     * <br />輸送手段付替えフラグ
     */
    private String reviseFlg;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    private String lgcyWhCd;
    
    /**
     * CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;
    
    /**
     * CML TYPE
     * <br />ケースマーク区分
     */
    private String cmlTyp;
    
    /**
     * EXPORT PACKING ISSUER ID
     * <br />輸出梱包者ID
     */
    private String expPackingIssuerId;
    
    /**
     * PACKING WAREHOUSE COMPANY CODE
     * <br />梱包倉庫会社コード
     */
    private String packingWhCompCd;
    
    /**
     * PACKING WAREHOUSE CODE
     * <br />梱包倉庫コード
     */
    private String packingWhCd;
    
    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * FM) ISSUE DATE
     * <br />輸出梱包From日
     */
    private String issueFromDate;
    
    /**
     * TO) ISSUE DATE
     * <br />輸出梱包To日
     */
    private String issueToDate;
    
    /**
     * PALLETIZE ITEM NO
     * <br />パレタイズ品目番号
     */
    private String pltzItemNo;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    private String pkgCd;
    
    /**
     * MIX TAG NO
     * <br />MIXタグNO
     */
    private String mixTagNo;

    /**
     * PageInfoCreator object
     * <br />PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;
    
    /**
     * User functional utilization right list
     * <br />ユーザ機能利用権限リスト
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * Date format (for screen display)  
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * The row number of a selection line
     * <br />選択行の行番号
     */
    private String selectedIdx;
    
    /**
     * The authority class of a selection line
     * <br />選択行の権限区分
     */
    private String selectedAuthFlg;
    
    /**
     * Base VALUE of authority (with no 2:RALL, 1:BALL, and 0:ALL authority)  
     * <br />権限のベース値(2:RALL、1:BALL、0:ALL権限なし)
     */
    private String baseAuthFlg;

    // UT414 ADD START
    /**
     * Date format (for document outputs)
     * <br />日付フォーマット (帳票出力用)。
     */
    private String reportDateFormat;

    /**
     * From Main mark
     * <br />Fromメインマーク。
     */
    private String fromMainMark;

    /**
     * To Main mark
     * <br />Toメインマーク。
     */
    private String toMainMark;

    /**
     * The list of search-results domains
     * <br />検索結果ドメインのリスト
     */
    private List<? extends W2009ListDomain> listDomainList;
    // UT414 ADD END

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2009CriteriaDomain() {
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
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
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
     * Getter method for reviseFlg.
     *
     * @return the reviseFlg
     */
    public String getReviseFlg() {
        return reviseFlg;
    }

    /**
     * Setter method for reviseFlg.
     *
     * @param reviseFlg Set for reviseFlg
     */
    public void setReviseFlg(String reviseFlg) {
        this.reviseFlg = reviseFlg;
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
     * Getter method for lgcyWhCd.
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * Setter method for lgcyWhCd.
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
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
     * Getter method for expPackingIssuerId.
     *
     * @return the expPackingIssuerId
     */
    public String getExpPackingIssuerId() {
        return expPackingIssuerId;
    }

    /**
     * Setter method for expPackingIssuerId.
     *
     * @param expPackingIssuerId Set for expPackingIssuerId
     */
    public void setExpPackingIssuerId(String expPackingIssuerId) {
        this.expPackingIssuerId = expPackingIssuerId;
    }

    /**
     * Getter method for packingWhCompCd.
     *
     * @return the packingWhCompCd
     */
    public String getPackingWhCompCd() {
        return packingWhCompCd;
    }

    /**
     * Setter method for packingWhCompCd.
     *
     * @param packingWhCompCd Set for packingWhCompCd
     */
    public void setPackingWhCompCd(String packingWhCompCd) {
        this.packingWhCompCd = packingWhCompCd;
    }

    /**
     * Getter method for packingWhCd.
     *
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * Setter method for packingWhCd.
     *
     * @param packingWhCd Set for packingWhCd
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
    }

    /**
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * Getter method for issueFromDate.
     *
     * @return the issueFromDate
     */
    public String getIssueFromDate() {
        return issueFromDate;
    }

    /**
     * Setter method for issueFromDate.
     *
     * @param issueFromDate Set for issueFromDate
     */
    public void setIssueFromDate(String issueFromDate) {
        this.issueFromDate = issueFromDate;
    }

    /**
     * Getter method for issueToDate.
     *
     * @return the issueToDate
     */
    public String getIssueToDate() {
        return issueToDate;
    }

    /**
     * Setter method for issueToDate.
     *
     * @param issueToDate Set for issueToDate
     */
    public void setIssueToDate(String issueToDate) {
        this.issueToDate = issueToDate;
    }

    /**
     * Getter method for pltzItemNo.
     *
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * Setter method for pltzItemNo.
     *
     * @param pltzItemNo Set for pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }

    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
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
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * Getter method for selectedIdx.
     *
     * @return the selectedIdx
     */
    public String getSelectedIdx() {
        return selectedIdx;
    }

    /**
     * Setter method for selectedIdx.
     *
     * @param selectedIdx Set for selectedIdx
     */
    public void setSelectedIdx(String selectedIdx) {
        this.selectedIdx = selectedIdx;
    }

    /**
     * Getter method for baseAuthFlg.
     *
     * @return the baseAuthFlg
     */
    public String getBaseAuthFlg() {
        return baseAuthFlg;
    }

    /**
     * Setter method for baseAuthFlg.
     *
     * @param baseAuthFlg Set for baseAuthFlg
     */
    public void setBaseAuthFlg(String baseAuthFlg) {
        this.baseAuthFlg = baseAuthFlg;
    }

    /**
     * Getter method for selectedAuthFlg.
     *
     * @return the selectedAuthFlg
     */
    public String getSelectedAuthFlg() {
        return selectedAuthFlg;
    }

    /**
     * Setter method for selectedAuthFlg.
     *
     * @param selectedAuthFlg Set for selectedAuthFlg
     */
    public void setSelectedAuthFlg(String selectedAuthFlg) {
        this.selectedAuthFlg = selectedAuthFlg;
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
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
    }

    /**
     * Getter method for fromMainMark.
     *
     * @return the fromMainMark
     */
    public String getFromMainMark() {
        return fromMainMark;
    }

    /**
     * Setter method for fromMainMark.
     *
     * @param fromMainMark Set for fromMainMark
     */
    public void setFromMainMark(String fromMainMark) {
        this.fromMainMark = fromMainMark;
    }

    /**
     * Getter method for toMainMark.
     *
     * @return the toMainMark
     */
    public String getToMainMark() {
        return toMainMark;
    }

    /**
     * Setter method for toMainMark.
     *
     * @param toMainMark Set for toMainMark
     */
    public void setToMainMark(String toMainMark) {
        this.toMainMark = toMainMark;
    }

    /**
     * Getter method for listDomainList.
     *
     * @return the listDomainList
     */
    public List<? extends W2009ListDomain> getListDomainList() {
        return listDomainList;
    }

    /**
     * Setter method for listDomainList.
     *
     * @param listDomainList Set for listDomainList
     */
    public void setListDomainList(List<? extends W2009ListDomain> listDomainList) {
        this.listDomainList = listDomainList;
    }


}
