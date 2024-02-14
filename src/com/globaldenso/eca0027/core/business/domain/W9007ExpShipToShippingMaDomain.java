/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain that holds the information of Export Ship to Shipping MA screen.
 * <br />Export Ship to Shipping MA画面の情報を保持するドメインです。
 *
 * @version $Revision: 15229 $
 */
public class W9007ExpShipToShippingMaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * COMPANY CODE<br />
     * 会社コード
     */
    private String compCd;

    /**
     * SHIP TO CODE<br />
     * 送荷先コード
     */
    private String shipToCd;

    /**
     * CONTAINER SORTING KEY<br />
     * コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     * LOADING CODE<br />
     * 荷積位置コード
     */
    private String loadingCd;

    /**
     * CUSTOM TIMING TYPE<br />
     * 通関タイミング区分
     */
    private String containerLooseTyp;

    /**
     * APPLY START DATE<br />
     * 適用開始日
     */
    private Date aplyStrtDt;

    /**
     * LABEL PRINT NUM<br />
     * ラベル発行枚数
     */
    private BigDecimal labelPrintNum;

    /**
     * CUSTOM TIMING TYPE<br />
     * 通関タイミング区分
     */
    private String customTimingTyp;

    /**
     * PACKING SUMMARY ATTACH FLAG<br />
     * PACKING SUMMARY添付フラグ。
     * NL023 ADD
     */
    private String packingSummaryAtchFlg;

    /**
     * SINGLE PLTZ QR FLG <br />
     * SINGLE PLTZ QR FLG/単品パレタイズQRフラグ
     * NL047
     */
    private String singlePltzQrFlg;
    
    /**
     * FREE 1 COLUMN NAME<br />
     * フリー1項目名称
     */
    private String free1TitleNm;

    /**
     * FREE 2 COLUMN NAME<br />
     * フリー2項目名称
     */
    private String free2TitleNm;

    /**
     * FREE 3 COLUMN NAME<br />
     * フリー3項目名称
     */
    private String free3TitleNm;

    /**
     * Exp Ship To Shipping Ma Item Domain List<br />
     * インボイステンプレートリスト
     */
    private List<? extends W9007ExpShipToShippingMaItemDomain> w9007ExpShipToShippingMaItemDomainList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007ExpShipToShippingMaDomain() {
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
     * Getter method for singlePltzQrFlg.
     * 
     * @return the singlePltz QrFlg
     */
    public String getSinglePltzQrFlg(){
        return singlePltzQrFlg;
    }
    
    /**
     * Setter method of singlePltzQrFlg.
     * 
     * @param singlePltzQrFlg Value to be stored in singlePltzQrFlg.
     */
    public void setSinglePltzQrFlg(String singlePltzQrFlg){
        this.singlePltzQrFlg = singlePltzQrFlg;
    }
    
    /**
     * Getter method for free1TitleNm.
     *
     * @return the free1TitleNm
     */
    public String getFree1TitleNm() {
        return free1TitleNm;
    }

    /**
     * Setter method for free1TitleNm.
     *
     * @param free1TitleNm Set for free1TitleNm
     */
    public void setFree1TitleNm(String free1TitleNm) {
        this.free1TitleNm = free1TitleNm;
    }

    /**
     * Getter method for free2TitleNm.
     *
     * @return the free2TitleNm
     */
    public String getFree2TitleNm() {
        return free2TitleNm;
    }

    /**
     * Setter method for free2TitleNm.
     *
     * @param free2TitleNm Set for free2TitleNm
     */
    public void setFree2TitleNm(String free2TitleNm) {
        this.free2TitleNm = free2TitleNm;
    }

    /**
     * Getter method for free3TitleNm.
     *
     * @return the free3TitleNm
     */
    public String getFree3TitleNm() {
        return free3TitleNm;
    }

    /**
     * Setter method for free3TitleNm.
     *
     * @param free3TitleNm Set for free3TitleNm
     */
    public void setFree3TitleNm(String free3TitleNm) {
        this.free3TitleNm = free3TitleNm;
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

}