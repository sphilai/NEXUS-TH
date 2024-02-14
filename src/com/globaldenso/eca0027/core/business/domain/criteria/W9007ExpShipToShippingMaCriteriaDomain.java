/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.eca0027.core.business.domain.W9007ExpShipToShippingMaItemDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain of search criteria Export Ship to Shipping MA screen.
 * <br />Export Ship to Shipping MA画面の検索条件ドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class W9007ExpShipToShippingMaCriteriaDomain extends AbstractDomain {

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
     * OWNER COMPANY CODE/ OWNER COMPANY CODE<br />
     * OWNER COMPANY CODE/責任会社コード
     */
    private String ownerCompCd;

    /**
     * SHIP TO CODE/ SHIP TO CODE<br />
     * SHIP TO CODE/送荷先コード
     */
    private String shipToCd;

    /**
     * CONTAINER SORTING KEY/ CONTAINER SORTING KEY<br />
     * CONTAINER SORTING KEY/コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     * LOADING CODE/ LOADING CODE<br />
     * LOADING CODE/荷積位置コード
     */
    private String loadingCd;

    /**
     * CUSTOM TIMING TYPE/ CUSTOM TIMING TYPE<br />
     * CUSTOM TIMING TYPE/通関タイミング区分
     */
    private String containerLooseTyp;

    /**
     * APPLY START DATE/ APPLY START DATE<br />
     * APPLY START DATE/適用開始日
     */
    private Date aplyStrtDt;
    
    /**
     * APPLY START DATE/ APPLY START DATE<br />
     * APPLY START DATE/適用開始日(タイムゾーン変換後)
     */
    private Date fmtAplyStrtDt;

    /**
     * LABEL PRINT NUM/ LABEL PRINT NUM<br />
     * LABEL PRINT NUM/ラベル発行枚数
     */
    private BigDecimal labelPrintNum;

    /**
     * CUSTOM TIMING TYPE/ CUSTOM TIMING TYPE<br />
     * CUSTOM TIMING TYPE/通関タイミング区分
     */
    private String customTimingTyp;

    /**
     * PACKING SUMMARY ATTACH FLAG<br />
     * PACKING SUMMARY添付フラグ。
     * NL023 ADD
     */
    private String packingSummaryAtchFlg;

    /**
     * SINGLE PLTZ QR FLG/SINGLE PLETIZE QR FLG <br />
     * SINGLE PLTZ QR FLG/単品パレタイズQRフラグ
     * NL047 ADD
     */
    private String singlePltzQrFlg;
    
    /**
     * DOC NO/ DOC NO<br />
     * DOC NO/ドキュメント番号
     */
    private String docNo;

    /**
     * FREE 1 DISPLAY FLAG/ FREE 1 DISPLAY FLAG<br />
     * FREE 1 DISPLAY FLAG/フリー1表示フラグ
     */
    private String free1DispFlg;

    /**
     * FREE 2 DISPLAY FLAG/ FREE 2 DISPLAY FLAG<br />
     * FREE 2 DISPLAY FLAG/フリー2表示フラグ
     */
    private String free2DispFlg;

    /**
     * FREE 3 DISPLAY FLAG/ FREE 3 DISPLAY FLAG<br />
     * FREE 3 DISPLAY FLAG/フリー3表示フラグ
     */
    private String free3DispFlg;

    /**
     * HS CODE DISPLAY FLAG/ HS CODE DISPLAY FLAG<br />
     * HS CODE DISPLAY FLAG/HSコード表示フラグ
     */
    private String hsCdDispFlg;

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
     * PageInfoCreator object.<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;

    /**
     * Date format (screen display).<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * Exp Ship To Shipping Ma Item Domain List / Invoice Template list<br />
     * Exp Ship To Shipping Ma Item Domain List/インボイステンプレートリスト
     */
    private List<? extends W9007ExpShipToShippingMaItemDomain> w9007ExpShipToShippingMaItemDomainList;
    
    /**
     * SERVER ID<br />
     * サーバID
     */
    private String serverId;
    
    /**
     * Display
     * 表示区分
     */
    private String display;
    
    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007ExpShipToShippingMaCriteriaDomain() {
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
     * Getter method for shipToCd.
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * Setter method for shipToCd.
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
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
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
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
     * Getter method for labelPrintNum.
     *
     * @return the labelPrintNum
     */
    public BigDecimal getLabelPrintNum() {
        return labelPrintNum;
    }

    /**
     * Setter method for labelPrintNum.
     *
     * @param labelPrintNum Set for labelPrintNum
     */
    public void setLabelPrintNum(BigDecimal labelPrintNum) {
        this.labelPrintNum = labelPrintNum;
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
     * Getter method of packingSummaryAtchFlg.
     *
     * @return the packingSummaryAtchFlg.
     */
    public String getPackingSummaryAtchFlg() {
        return packingSummaryAtchFlg;
    }

    /**
     * Setter method of packingSummaryAtchFlg.
     *
     * @param packingSummaryAtchFlg Value to be stored in packingSummaryAtchFlg.
     */
    public void setPackingSummaryAtchFlg(String packingSummaryAtchFlg) {
        this.packingSummaryAtchFlg = packingSummaryAtchFlg;
    }

    /**
     *
     * Getter method for singlePltzQrFlg.
     * 
     * @return the singlePltzQrFlg.
     */
    public String getSinglePltzQrFlg() {
        return singlePltzQrFlg;
    }
    
    /**
     * 
     * Setter method for singlePltzQrFlg.
     * 
     * @param singlePltzQrFlg Set for singlePltzQrFlg
     */
    public void setSinglePltzQrFlg(String singlePltzQrFlg) {
        this.singlePltzQrFlg = singlePltzQrFlg;
    }
    /**
     * Getter method for docNo.
     *
     * @return the docNo
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Setter method for docNo.
     *
     * @param docNo Set for docNo
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /**
     * Getter method for free1DispFlg.
     *
     * @return the free1DispFlg
     */
    public String getFree1DispFlg() {
        return free1DispFlg;
    }

    /**
     * Setter method for free1DispFlg.
     *
     * @param free1DispFlg Set for free1DispFlg
     */
    public void setFree1DispFlg(String free1DispFlg) {
        this.free1DispFlg = free1DispFlg;
    }

    /**
     * Getter method for free2DispFlg.
     *
     * @return the free2DispFlg
     */
    public String getFree2DispFlg() {
        return free2DispFlg;
    }

    /**
     * Setter method for free2DispFlg.
     *
     * @param free2DispFlg Set for free2DispFlg
     */
    public void setFree2DispFlg(String free2DispFlg) {
        this.free2DispFlg = free2DispFlg;
    }

    /**
     * Getter method for free3DispFlg.
     *
     * @return the free3DispFlg
     */
    public String getFree3DispFlg() {
        return free3DispFlg;
    }

    /**
     * Setter method for free3DispFlg.
     *
     * @param free3DispFlg Set for free3DispFlg
     */
    public void setFree3DispFlg(String free3DispFlg) {
        this.free3DispFlg = free3DispFlg;
    }

    /**
     * Getter method for hsCdDispFlg.
     *
     * @return the hsCdDispFlg
     */
    public String getHsCdDispFlg() {
        return hsCdDispFlg;
    }

    /**
     * Setter method for hsCdDispFlg.
     *
     * @param hsCdDispFlg Set for hsCdDispFlg
     */
    public void setHsCdDispFlg(String hsCdDispFlg) {
        this.hsCdDispFlg = hsCdDispFlg;
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
     * Getter method for w9007ExpShipToShippingMaItemDomainList.
     *
     * @return the w9007ExpShipToShippingMaItemDomainList
     */
    public List<? extends W9007ExpShipToShippingMaItemDomain> getW9007ExpShipToShippingMaItemDomainList() {
        return w9007ExpShipToShippingMaItemDomainList;
    }

    /**
     * Setter method for w9007ExpShipToShippingMaItemDomainList.
     *
     * @param expShipToShippingMaItemDomainList Set for w9007ExpShipToShippingMaItemDomainList
     */
    public void setW9007ExpShipToShippingMaItemDomainList(
        List<? extends W9007ExpShipToShippingMaItemDomain> expShipToShippingMaItemDomainList) {
        w9007ExpShipToShippingMaItemDomainList = expShipToShippingMaItemDomainList;
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