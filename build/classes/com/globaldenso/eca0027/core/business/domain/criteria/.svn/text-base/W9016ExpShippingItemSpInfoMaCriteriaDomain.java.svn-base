/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.Date;
import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain that holds the information of Export Formalities by Item MA screen.
 * <br />Export Formalities by Item MA画面の情報を保持するドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12652 $
 */
public class W9016ExpShippingItemSpInfoMaCriteriaDomain extends AbstractDomain {

    /**
     * Serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * COMPANY CODE/ COMPANY CODE<br />
     * COMPANY CODE/会社コード
     */
    private String compCd;
    
    /**
     * COMPANY CODE/ COMPANY CODE<br />
     * COMPANY CODE/責任会社コード
     */
    private String ownerCompCd;

    /**
     * ITEM NO/ ITEM NO<br />
     * ITEM NO/品目番号
     */
    private String itemNo;

    /**
     * PACKAGE CODE/ PACKAGE CODE<br />
     * PACKAGE CODE/包装区分
     */
    private String pkgCd;

    /**
     * CUSTOMER CODE/ CUSTOMER CODE<br />
     * CUSTOMER CODE/得意先コード
     */
    private String customerCd;

    /**
     * LEGACY SHIP TO/ LEGACY SHIP TO<br />
     * LEGACY SHIP TO/LEGACY送荷先
     */
    private String lgcyShipTo;

    /**
     * CONTAINER SORTING KEY/ CONTAINER SORTING KEY<br />
     * CONTAINER SORTING KEY/コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     * STAGING INSTRUCTION ITEM FLAG/ STAGING INSTRUCTION ITEM FLAG<br />
     * STAGING INSTRUCTION ITEM FLAG/荷揃指示品フラグ
     */
    private String stgInstrItemFlg;

    /**
     * CUSTOM TIMING TYPE/ CUSTOM TIMING TYPE<br />
     * CUSTOM TIMING TYPE/通関タイミング区分
     */
    private String customTimingTyp;

    /**
     * INVOICE KEY/ INVOICE KEY<br />
     * INVOICE KEY/インボイスキー
     */
    private String invoiceKey;

    /**
     * APPLY START DATE/ APPLY START DATE<br />
     * APPLY START DATE/適用開始日
     */
    private String aplyStrtDt;
    
    /**
     * APPLY START DATE/ APPLY START DATE<br />
     * APPLY START DATE/適用開始日(タイムゾーン変換後)
     */
    private Date fmtAplyStrtDt;
    
    /**
     * ITEM DESCRIPTION/ ITEM DESCRIPTION<br />
     * ITEM DESCRIPTION/品目名称
     */
    private String itemDescription;
    
    /**
     * SHIPPING LOT/ SHIPPING LOT<br />
     * SHIPPING LOT/出荷ロット
     */
    private String shippingLot;
    
    /**
     * LOADING CODE/ LOADING CODE<br />
     * LOADING CODE/荷積位置コード
     */
    private String loadingCd;
    
    /**
     * CONTAINER LOOSE TYPE/ CONTAINER LOOSE TYPE<br />
     * CONTAINER LOOSE TYPE/コンテナルーズ区分
     */
    private String containerLooseTyp;
    
    /**
     * CASEMARK NOTATION/ CASEMARK NOTATION<br />
     * CASEMARK NOTATION/ケースマーク注意書き
     */
    private String casemarkNotation;
    
    /**
     * Processing mode.<br />
     * 処理モード
     */
    private String mode;

    /**
     * User authorization list.<br />
     * ユーザ権限リスト
     */
    private List<UserAuthDomain> userAuthList = null;

    /**
     * SERVER ID.<br />
     * サーバID
     */
    private String serverId;

    /**
     * Date format (screen display).<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * PageInfoCreator object.<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Display
     * ディスプレイ
     */
    private String display;

    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9016ExpShippingItemSpInfoMaCriteriaDomain() {
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
     * <p>ownerCompCd のゲッターメソッドです。</p>
     *
     * @return the ownerCompCd
     */
    public String getOwnerCompCd() {
        return ownerCompCd;
    }

    /**
     * <p>ownerCompCd のセッターメソッドです。</p>
     *
     * @param ownerCompCd ownerCompCd に設定する
     */
    public void setOwnerCompCd(String ownerCompCd) {
        this.ownerCompCd = ownerCompCd;
    }

    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
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
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }
    
    /**
     * <p>fmtAplyStrtDt のゲッターメソッドです。</p>
     *
     * @return the fmtAplyStrtDt
     */
    public Date getFmtAplyStrtDt() {
        return fmtAplyStrtDt;
    }

    /**
     * <p>fmtAplyStrtDt のセッターメソッドです。</p>
     *
     * @param fmtAplyStrtDt fmtAplyStrtDt に設定する
     */
    public void setFmtAplyStrtDt(Date fmtAplyStrtDt) {
        this.fmtAplyStrtDt = fmtAplyStrtDt;
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
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for itemDescription.
     *
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Setter method for itemDescription.
     *
     * @param itemDescription Set for itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * Getter method for shippingLot.
     *
     * @return the shippingLot
     */
    public String getShippingLot() {
        return shippingLot;
    }

    /**
     * Setter method for shippingLot.
     *
     * @param shippingLot Set for shippingLot
     */
    public void setShippingLot(String shippingLot) {
        this.shippingLot = shippingLot;
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
     * Getter method for casemarkNotation.
     *
     * @return the casemarkNotation
     */
    public String getCasemarkNotation() {
        return casemarkNotation;
    }

    /**
     * Setter method for casemarkNotation.
     *
     * @param casemarkNotation Set for casemarkNotation
     */
    public void setCasemarkNotation(String casemarkNotation) {
        this.casemarkNotation = casemarkNotation;
    }

    /**
     * <p>display のゲッターメソッドです。</p>
     *
     * @return the display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * <p>display のセッターメソッドです。</p>
     *
     * @param display display に設定する
     */
    public void setDisplay(String display) {
        this.display = display;
    }
    
}
