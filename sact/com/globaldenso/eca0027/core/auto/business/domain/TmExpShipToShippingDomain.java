/*
 * PROJECT：eca0027
 * 
 * TmExpShipToShipping のDomainクラス
 * テーブル概要：Export Ship To Shipping Master/輸出送荷先出荷原単位
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/12/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmExpShipToShipping のDomainクラスです。<BR>
 * テーブル概要：Export Ship To Shipping Master/輸出送荷先出荷原単位<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2017/12/18 16:26:47<BR>
 * 
 * テーブル定義から2017/12/18に自動生成したモジュールです。
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class TmExpShipToShippingDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMPANY CODE/会社コード:comp cd of shipper
     */
    private String compCd;

    /**
     * SHIP TO CODE/送荷先コード
     */
    private String shipToCd;

    /**
     * APPLY START DATE/適用開始日
     */
    private Date aplyStrtDt;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     * LOADING CODE/荷積位置コード:F:Free,
D:Door,
B:Back
     */
    private String loadingCd;

    /**
     * LABEL PRINT NUM/ラベル発行枚数
     */
    private BigDecimal labelPrintNum;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分:L:Loose, C:Full Container
     */
    private String containerLooseTyp;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分:A:After Vanning
B:Before Vanning
Z:Mix
     */
    private String customTimingTyp;

    /**
     * PL SUMMARY ATTACH FLAG/PL SUMMARY添付フラグ:Y:Attach, N:Not
     */
    private String packingSummaryAtchFlg;

    /**
     *      * SINGLE PLTZ QR FLAG/単品パレタイズQRフラグ: Y:QR output target,N:Not
     */
    private String singlePltzQrFlg;

    /**
     * UPDATE FUNCTION ID/更新機能ID
     */
    private String comUpdateFuncId;

    /**
     * UPDATE USER ID/更新者
     */
    private String comUpdateUserId;

    /**
     * UPDATE TIMESTAMP更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * CREATE FUNCTION ID/作成機能ID
     */
    private String comCreateFuncId;

    /**
     * CREATE USER ID/作成者
     */
    private String comCreateUserId;

    /**
     * CREATE TIMESTAMP/作成日時
     */
    private Timestamp comCreateTimestamp;

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpShipToShippingDomain() {
    }

    /**
     * compCd のゲッターメソッドです。
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * compCd のセッターメソッドです。
     * 
     * @param compCd compCd に設定する
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * shipToCd のゲッターメソッドです。
     * 
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * shipToCd のセッターメソッドです。
     * 
     * @param shipToCd shipToCd に設定する
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * aplyStrtDt のゲッターメソッドです。
     * 
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * aplyStrtDt のセッターメソッドです。
     * 
     * @param aplyStrtDt aplyStrtDt に設定する
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * containerSortingKey のゲッターメソッドです。
     * 
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * containerSortingKey のセッターメソッドです。
     * 
     * @param containerSortingKey containerSortingKey に設定する
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * loadingCd のゲッターメソッドです。
     * 
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * loadingCd のセッターメソッドです。
     * 
     * @param loadingCd loadingCd に設定する
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * labelPrintNum のゲッターメソッドです。
     * 
     * @return the labelPrintNum
     */
    public BigDecimal getLabelPrintNum() {
        return labelPrintNum;
    }

    /**
     * labelPrintNum のセッターメソッドです。
     * 
     * @param labelPrintNum labelPrintNum に設定する
     */
    public void setLabelPrintNum(BigDecimal labelPrintNum) {
        this.labelPrintNum = labelPrintNum;
    }

    /**
     * containerLooseTyp のゲッターメソッドです。
     * 
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * containerLooseTyp のセッターメソッドです。
     * 
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * customTimingTyp のゲッターメソッドです。
     * 
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * customTimingTyp のセッターメソッドです。
     * 
     * @param customTimingTyp customTimingTyp に設定する
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
    }

    /**
     * packingSummaryAtchFlg のゲッターメソッドです。
     * 
     * @return the packingSummaryAtchFlg
     */
    public String getPackingSummaryAtchFlg() {
        return packingSummaryAtchFlg;
    }

    /**
     * packingSummaryAtchFlg のセッターメソッドです。
     * 
     * @param packingSummaryAtchFlg packingSummaryAtchFlg に設定する
     */
    public void setPackingSummaryAtchFlg(String packingSummaryAtchFlg) {
        this.packingSummaryAtchFlg = packingSummaryAtchFlg;
    }

    /**
     *      * singlePltzQrFlg のゲッターメソッドです。
     * 
     * @return the singlePltzQrFlg
     */
    public String getSinglePltzQrFlg() {
        return singlePltzQrFlg;
    }

    /**
     * singlePltzQrFlg のセッターメソッドです。
     * 
     * @param singlePltzQrFlg singlePltzQrFlg に設定する
     */
    public void setSinglePltzQrFlg(String singlePltzQrFlg) {
        this.singlePltzQrFlg = singlePltzQrFlg;
    }

    /**
     * comUpdateFuncId のゲッターメソッドです。
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * comUpdateFuncId のセッターメソッドです。
     * 
     * @param comUpdateFuncId comUpdateFuncId に設定する
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * comUpdateUserId のゲッターメソッドです。
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * comUpdateUserId のセッターメソッドです。
     * 
     * @param comUpdateUserId comUpdateUserId に設定する
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * comUpdateTimestamp のゲッターメソッドです。
     * 
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * comUpdateTimestamp のセッターメソッドです。
     * 
     * @param comUpdateTimestamp comUpdateTimestamp に設定する
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * comCreateFuncId のゲッターメソッドです。
     * 
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * comCreateFuncId のセッターメソッドです。
     * 
     * @param comCreateFuncId comCreateFuncId に設定する
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * comCreateUserId のゲッターメソッドです。
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId のセッターメソッドです。
     * 
     * @param comCreateUserId comCreateUserId に設定する
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * comCreateTimestamp のゲッターメソッドです。
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * comCreateTimestamp のセッターメソッドです。
     * 
     * @param comCreateTimestamp comCreateTimestamp に設定する
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

}
