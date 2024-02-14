/*
 * PROJECT：eca0027
 * 
 * TmExpShipToShipping の検索条件Domainクラス
 * テーブル概要：Export Ship To Shipping Master/輸出送荷先出荷原単位
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2017/12/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmExpShipToShipping の検索条件Domainクラスです。<BR>
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
public class TmExpShipToShippingCriteriaDomain extends AbstractDomain implements Serializable {

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
     * COMPANY CODE/会社コード:comp cd of shipper（大なり）
     */
    private String compCdGreaterThan;

    /**
     * COMPANY CODE/会社コード:comp cd of shipper（大なりイコール）
     */
    private String compCdGreaterThanEqual;

    /**
     * COMPANY CODE/会社コード:comp cd of shipper（小なり）
     */
    private String compCdLessThan;

    /**
     * COMPANY CODE/会社コード:comp cd of shipper（小なりイコール）
     */
    private String compCdLessThanEqual;

    /**
     * COMPANY CODE/会社コード:comp cd of shipper（前方一致）
     */
    private String compCdLikeFront;

    /**
     * SHIP TO CODE/送荷先コード（大なり）
     */
    private String shipToCdGreaterThan;

    /**
     * SHIP TO CODE/送荷先コード（大なりイコール）
     */
    private String shipToCdGreaterThanEqual;

    /**
     * SHIP TO CODE/送荷先コード（小なり）
     */
    private String shipToCdLessThan;

    /**
     * SHIP TO CODE/送荷先コード（小なりイコール）
     */
    private String shipToCdLessThanEqual;

    /**
     * SHIP TO CODE/送荷先コード（前方一致）
     */
    private String shipToCdLikeFront;

    /**
     * APPLY START DATE/適用開始日（大なりイコール）
     */
    private Date aplyStrtDtGreaterThanEqual;

    /**
     * APPLY START DATE/適用開始日（小なりイコール）
     */
    private Date aplyStrtDtLessThanEqual;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（大なり）
     */
    private String containerSortingKeyGreaterThan;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（大なりイコール）
     */
    private String containerSortingKeyGreaterThanEqual;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（小なり）
     */
    private String containerSortingKeyLessThan;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（小なりイコール）
     */
    private String containerSortingKeyLessThanEqual;

    /**
     * CONTAINER SORTING KEY/コンテナ層別キー（前方一致）
     */
    private String containerSortingKeyLikeFront;

    /**
     * LOADING CODE/荷積位置コード:F:Free,
D:Door,
B:Back（大なり）
     */
    private String loadingCdGreaterThan;

    /**
     * LOADING CODE/荷積位置コード:F:Free,
D:Door,
B:Back（大なりイコール）
     */
    private String loadingCdGreaterThanEqual;

    /**
     * LOADING CODE/荷積位置コード:F:Free,
D:Door,
B:Back（小なり）
     */
    private String loadingCdLessThan;

    /**
     * LOADING CODE/荷積位置コード:F:Free,
D:Door,
B:Back（小なりイコール）
     */
    private String loadingCdLessThanEqual;

    /**
     * LOADING CODE/荷積位置コード:F:Free,
D:Door,
B:Back（前方一致）
     */
    private String loadingCdLikeFront;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分:L:Loose, C:Full Container（大なり）
     */
    private String containerLooseTypGreaterThan;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分:L:Loose, C:Full Container（大なりイコール）
     */
    private String containerLooseTypGreaterThanEqual;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分:L:Loose, C:Full Container（小なり）
     */
    private String containerLooseTypLessThan;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分:L:Loose, C:Full Container（小なりイコール）
     */
    private String containerLooseTypLessThanEqual;

    /**
     * CONTAINER LOOSE TYPE/コンテナルーズ区分:L:Loose, C:Full Container（前方一致）
     */
    private String containerLooseTypLikeFront;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分:A:After Vanning
B:Before Vanning
Z:Mix（大なり）
     */
    private String customTimingTypGreaterThan;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分:A:After Vanning
B:Before Vanning
Z:Mix（大なりイコール）
     */
    private String customTimingTypGreaterThanEqual;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分:A:After Vanning
B:Before Vanning
Z:Mix（小なり）
     */
    private String customTimingTypLessThan;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分:A:After Vanning
B:Before Vanning
Z:Mix（小なりイコール）
     */
    private String customTimingTypLessThanEqual;

    /**
     * CUSTOM TIMING TYPE/通関タイミング区分:A:After Vanning
B:Before Vanning
Z:Mix（前方一致）
     */
    private String customTimingTypLikeFront;

    /**
     * PL SUMMARY ATTACH FLAG/PL SUMMARY添付フラグ:Y:Attach, N:Not（大なり）
     */
    private String packingSummaryAtchFlgGreaterThan;

    /**
     * PL SUMMARY ATTACH FLAG/PL SUMMARY添付フラグ:Y:Attach, N:Not（大なりイコール）
     */
    private String packingSummaryAtchFlgGreaterThanEqual;

    /**
     * PL SUMMARY ATTACH FLAG/PL SUMMARY添付フラグ:Y:Attach, N:Not（小なり）
     */
    private String packingSummaryAtchFlgLessThan;

    /**
     * PL SUMMARY ATTACH FLAG/PL SUMMARY添付フラグ:Y:Attach, N:Not（小なりイコール）
     */
    private String packingSummaryAtchFlgLessThanEqual;

    /**
     * SINGLE PLTZ QR FLAG/単品パレタイズQRフラグ: Y:QR output target,N:Not（大なり）
     */
    private String singlePltzQrFlgGreaterThan;

    /**
     * SINGLE PLTZ QR FLAG/単品パレタイズQRフラグ: Y:QR output target,N:Not（大なりイコール）
     */
    private String singlePltzQrFlgGreaterThanEqual;

    /**
     * SINGLE PLTZ QR FLAG/単品パレタイズQRフラグ: Y:QR output target,N:Not（小なり）
     */
    private String singlePltzQrFlgLessThan;

    /**
     * SINGLE PLTZ QR FLAG/単品パレタイズQRフラグ: Y:QR output target,N:Not（小なりイコール）
     */
    private String singlePltzQrFlgLessThanEqual;

    /**
     * SINGLE PLTZ QR FLAG/単品パレタイズQRフラグ: Y:QR output target,N:Not（前方一致）
     */
    private String singlePltzQrFlgLikeFront;

    /**
     * PL SUMMARY ATTACH FLAG/PL SUMMARY添付フラグ:Y:Attach, N:Not（前方一致）
     */
    private String packingSummaryAtchFlgLikeFront;

    /**
     * UPDATE FUNCTION ID/更新機能ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * UPDATE FUNCTION ID/更新機能ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * UPDATE FUNCTION ID/更新機能ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * UPDATE FUNCTION ID/更新機能ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * UPDATE USER ID/更新者（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * UPDATE USER ID/更新者（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * UPDATE USER ID/更新者（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * UPDATE USER ID/更新者（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * UPDATE USER ID/更新者（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * CREATE FUNCTION ID/作成機能ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * CREATE FUNCTION ID/作成機能ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * CREATE FUNCTION ID/作成機能ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * CREATE FUNCTION ID/作成機能ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * CREATE FUNCTION ID/作成機能ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * CREATE USER ID/作成者（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * CREATE USER ID/作成者（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * CREATE USER ID/作成者（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * CREATE USER ID/作成者（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * CREATE USER ID/作成者（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TmExpShipToShippingCriteriaDomain() {
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
     * singlePltzQrFlg のゲッターメソッドです。
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

    /**
     * compCdGreaterThan のゲッターメソッドです。
     * 
     * @return the compCdGreaterThan
     */
    public String getCompCdGreaterThan() {
        return compCdGreaterThan;
    }

    /**
     * compCdGreaterThan のセッターメソッドです。
     * 
     * @param compCdGreaterThan compCdGreaterThan に設定する
     */
    public void setCompCdGreaterThan(String compCdGreaterThan) {
        this.compCdGreaterThan = compCdGreaterThan;
    }

    /**
     * compCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compCdGreaterThanEqual
     */
    public String getCompCdGreaterThanEqual() {
        return compCdGreaterThanEqual;
    }

    /**
     * compCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param compCdGreaterThanEqual compCdGreaterThanEqual に設定する
     */
    public void setCompCdGreaterThanEqual(String compCdGreaterThanEqual) {
        this.compCdGreaterThanEqual = compCdGreaterThanEqual;
    }

    /**
     * compCdLessThan のゲッターメソッドです。
     * 
     * @return the compCdLessThan
     */
    public String getCompCdLessThan() {
        return compCdLessThan;
    }

    /**
     * compCdLessThan のセッターメソッドです。
     * 
     * @param compCdLessThan compCdLessThan に設定する
     */
    public void setCompCdLessThan(String compCdLessThan) {
        this.compCdLessThan = compCdLessThan;
    }

    /**
     * compCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the compCdLessThanEqual
     */
    public String getCompCdLessThanEqual() {
        return compCdLessThanEqual;
    }

    /**
     * compCdLessThanEqual のセッターメソッドです。
     * 
     * @param compCdLessThanEqual compCdLessThanEqual に設定する
     */
    public void setCompCdLessThanEqual(String compCdLessThanEqual) {
        this.compCdLessThanEqual = compCdLessThanEqual;
    }

    /**
     * compCdLikeFront のゲッターメソッドです。
     * 
     * @return the compCdLikeFront
     */
    public String getCompCdLikeFront() {
        return compCdLikeFront;
    }

    /**
     * compCdLikeFront のセッターメソッドです。
     * 
     * @param compCdLikeFront compCdLikeFront に設定する
     */
    public void setCompCdLikeFront(String compCdLikeFront) {
        this.compCdLikeFront = compCdLikeFront;
    }

    /**
     * shipToCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThan
     */
    public String getShipToCdGreaterThan() {
        return shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCdGreaterThan shipToCdGreaterThan に設定する
     */
    public void setShipToCdGreaterThan(String shipToCdGreaterThan) {
        this.shipToCdGreaterThan = shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThanEqual
     */
    public String getShipToCdGreaterThanEqual() {
        return shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCdGreaterThanEqual shipToCdGreaterThanEqual に設定する
     */
    public void setShipToCdGreaterThanEqual(String shipToCdGreaterThanEqual) {
        this.shipToCdGreaterThanEqual = shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCdLessThan
     */
    public String getShipToCdLessThan() {
        return shipToCdLessThan;
    }

    /**
     * shipToCdLessThan のセッターメソッドです。
     * 
     * @param shipToCdLessThan shipToCdLessThan に設定する
     */
    public void setShipToCdLessThan(String shipToCdLessThan) {
        this.shipToCdLessThan = shipToCdLessThan;
    }

    /**
     * shipToCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdLessThanEqual
     */
    public String getShipToCdLessThanEqual() {
        return shipToCdLessThanEqual;
    }

    /**
     * shipToCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCdLessThanEqual shipToCdLessThanEqual に設定する
     */
    public void setShipToCdLessThanEqual(String shipToCdLessThanEqual) {
        this.shipToCdLessThanEqual = shipToCdLessThanEqual;
    }

    /**
     * shipToCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCdLikeFront
     */
    public String getShipToCdLikeFront() {
        return shipToCdLikeFront;
    }

    /**
     * shipToCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCdLikeFront shipToCdLikeFront に設定する
     */
    public void setShipToCdLikeFront(String shipToCdLikeFront) {
        this.shipToCdLikeFront = shipToCdLikeFront;
    }

    /**
     * aplyStrtDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the aplyStrtDtGreaterThanEqual
     */
    public Date getAplyStrtDtGreaterThanEqual() {
        return aplyStrtDtGreaterThanEqual;
    }

    /**
     * aplyStrtDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param aplyStrtDtGreaterThanEqual aplyStrtDtGreaterThanEqual に設定する
     */
    public void setAplyStrtDtGreaterThanEqual(Date aplyStrtDtGreaterThanEqual) {
        this.aplyStrtDtGreaterThanEqual = aplyStrtDtGreaterThanEqual;
    }

    /**
     * aplyStrtDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the aplyStrtDtLessThanEqual
     */
    public Date getAplyStrtDtLessThanEqual() {
        return aplyStrtDtLessThanEqual;
    }

    /**
     * aplyStrtDtLessThanEqual のセッターメソッドです。
     * 
     * @param aplyStrtDtLessThanEqual aplyStrtDtLessThanEqual に設定する
     */
    public void setAplyStrtDtLessThanEqual(Date aplyStrtDtLessThanEqual) {
        this.aplyStrtDtLessThanEqual = aplyStrtDtLessThanEqual;
    }

    /**
     * containerSortingKeyGreaterThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThan
     */
    public String getContainerSortingKeyGreaterThan() {
        return containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThan のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThan containerSortingKeyGreaterThan に設定する
     */
    public void setContainerSortingKeyGreaterThan(String containerSortingKeyGreaterThan) {
        this.containerSortingKeyGreaterThan = containerSortingKeyGreaterThan;
    }

    /**
     * containerSortingKeyGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyGreaterThanEqual
     */
    public String getContainerSortingKeyGreaterThanEqual() {
        return containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyGreaterThanEqual containerSortingKeyGreaterThanEqual に設定する
     */
    public void setContainerSortingKeyGreaterThanEqual(String containerSortingKeyGreaterThanEqual) {
        this.containerSortingKeyGreaterThanEqual = containerSortingKeyGreaterThanEqual;
    }

    /**
     * containerSortingKeyLessThan のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThan
     */
    public String getContainerSortingKeyLessThan() {
        return containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThan のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThan containerSortingKeyLessThan に設定する
     */
    public void setContainerSortingKeyLessThan(String containerSortingKeyLessThan) {
        this.containerSortingKeyLessThan = containerSortingKeyLessThan;
    }

    /**
     * containerSortingKeyLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLessThanEqual
     */
    public String getContainerSortingKeyLessThanEqual() {
        return containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLessThanEqual のセッターメソッドです。
     * 
     * @param containerSortingKeyLessThanEqual containerSortingKeyLessThanEqual に設定する
     */
    public void setContainerSortingKeyLessThanEqual(String containerSortingKeyLessThanEqual) {
        this.containerSortingKeyLessThanEqual = containerSortingKeyLessThanEqual;
    }

    /**
     * containerSortingKeyLikeFront のゲッターメソッドです。
     * 
     * @return the containerSortingKeyLikeFront
     */
    public String getContainerSortingKeyLikeFront() {
        return containerSortingKeyLikeFront;
    }

    /**
     * containerSortingKeyLikeFront のセッターメソッドです。
     * 
     * @param containerSortingKeyLikeFront containerSortingKeyLikeFront に設定する
     */
    public void setContainerSortingKeyLikeFront(String containerSortingKeyLikeFront) {
        this.containerSortingKeyLikeFront = containerSortingKeyLikeFront;
    }

    /**
     * loadingCdGreaterThan のゲッターメソッドです。
     * 
     * @return the loadingCdGreaterThan
     */
    public String getLoadingCdGreaterThan() {
        return loadingCdGreaterThan;
    }

    /**
     * loadingCdGreaterThan のセッターメソッドです。
     * 
     * @param loadingCdGreaterThan loadingCdGreaterThan に設定する
     */
    public void setLoadingCdGreaterThan(String loadingCdGreaterThan) {
        this.loadingCdGreaterThan = loadingCdGreaterThan;
    }

    /**
     * loadingCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the loadingCdGreaterThanEqual
     */
    public String getLoadingCdGreaterThanEqual() {
        return loadingCdGreaterThanEqual;
    }

    /**
     * loadingCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param loadingCdGreaterThanEqual loadingCdGreaterThanEqual に設定する
     */
    public void setLoadingCdGreaterThanEqual(String loadingCdGreaterThanEqual) {
        this.loadingCdGreaterThanEqual = loadingCdGreaterThanEqual;
    }

    /**
     * loadingCdLessThan のゲッターメソッドです。
     * 
     * @return the loadingCdLessThan
     */
    public String getLoadingCdLessThan() {
        return loadingCdLessThan;
    }

    /**
     * loadingCdLessThan のセッターメソッドです。
     * 
     * @param loadingCdLessThan loadingCdLessThan に設定する
     */
    public void setLoadingCdLessThan(String loadingCdLessThan) {
        this.loadingCdLessThan = loadingCdLessThan;
    }

    /**
     * loadingCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the loadingCdLessThanEqual
     */
    public String getLoadingCdLessThanEqual() {
        return loadingCdLessThanEqual;
    }

    /**
     * loadingCdLessThanEqual のセッターメソッドです。
     * 
     * @param loadingCdLessThanEqual loadingCdLessThanEqual に設定する
     */
    public void setLoadingCdLessThanEqual(String loadingCdLessThanEqual) {
        this.loadingCdLessThanEqual = loadingCdLessThanEqual;
    }

    /**
     * loadingCdLikeFront のゲッターメソッドです。
     * 
     * @return the loadingCdLikeFront
     */
    public String getLoadingCdLikeFront() {
        return loadingCdLikeFront;
    }

    /**
     * loadingCdLikeFront のセッターメソッドです。
     * 
     * @param loadingCdLikeFront loadingCdLikeFront に設定する
     */
    public void setLoadingCdLikeFront(String loadingCdLikeFront) {
        this.loadingCdLikeFront = loadingCdLikeFront;
    }

    /**
     * containerLooseTypGreaterThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThan
     */
    public String getContainerLooseTypGreaterThan() {
        return containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThan のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThan containerLooseTypGreaterThan に設定する
     */
    public void setContainerLooseTypGreaterThan(String containerLooseTypGreaterThan) {
        this.containerLooseTypGreaterThan = containerLooseTypGreaterThan;
    }

    /**
     * containerLooseTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypGreaterThanEqual
     */
    public String getContainerLooseTypGreaterThanEqual() {
        return containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypGreaterThanEqual containerLooseTypGreaterThanEqual に設定する
     */
    public void setContainerLooseTypGreaterThanEqual(String containerLooseTypGreaterThanEqual) {
        this.containerLooseTypGreaterThanEqual = containerLooseTypGreaterThanEqual;
    }

    /**
     * containerLooseTypLessThan のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThan
     */
    public String getContainerLooseTypLessThan() {
        return containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThan のセッターメソッドです。
     * 
     * @param containerLooseTypLessThan containerLooseTypLessThan に設定する
     */
    public void setContainerLooseTypLessThan(String containerLooseTypLessThan) {
        this.containerLooseTypLessThan = containerLooseTypLessThan;
    }

    /**
     * containerLooseTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the containerLooseTypLessThanEqual
     */
    public String getContainerLooseTypLessThanEqual() {
        return containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLessThanEqual のセッターメソッドです。
     * 
     * @param containerLooseTypLessThanEqual containerLooseTypLessThanEqual に設定する
     */
    public void setContainerLooseTypLessThanEqual(String containerLooseTypLessThanEqual) {
        this.containerLooseTypLessThanEqual = containerLooseTypLessThanEqual;
    }

    /**
     * containerLooseTypLikeFront のゲッターメソッドです。
     * 
     * @return the containerLooseTypLikeFront
     */
    public String getContainerLooseTypLikeFront() {
        return containerLooseTypLikeFront;
    }

    /**
     * containerLooseTypLikeFront のセッターメソッドです。
     * 
     * @param containerLooseTypLikeFront containerLooseTypLikeFront に設定する
     */
    public void setContainerLooseTypLikeFront(String containerLooseTypLikeFront) {
        this.containerLooseTypLikeFront = containerLooseTypLikeFront;
    }

    /**
     * customTimingTypGreaterThan のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThan
     */
    public String getCustomTimingTypGreaterThan() {
        return customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThan のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThan customTimingTypGreaterThan に設定する
     */
    public void setCustomTimingTypGreaterThan(String customTimingTypGreaterThan) {
        this.customTimingTypGreaterThan = customTimingTypGreaterThan;
    }

    /**
     * customTimingTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypGreaterThanEqual
     */
    public String getCustomTimingTypGreaterThanEqual() {
        return customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypGreaterThanEqual customTimingTypGreaterThanEqual に設定する
     */
    public void setCustomTimingTypGreaterThanEqual(String customTimingTypGreaterThanEqual) {
        this.customTimingTypGreaterThanEqual = customTimingTypGreaterThanEqual;
    }

    /**
     * customTimingTypLessThan のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThan
     */
    public String getCustomTimingTypLessThan() {
        return customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThan のセッターメソッドです。
     * 
     * @param customTimingTypLessThan customTimingTypLessThan に設定する
     */
    public void setCustomTimingTypLessThan(String customTimingTypLessThan) {
        this.customTimingTypLessThan = customTimingTypLessThan;
    }

    /**
     * customTimingTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the customTimingTypLessThanEqual
     */
    public String getCustomTimingTypLessThanEqual() {
        return customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLessThanEqual のセッターメソッドです。
     * 
     * @param customTimingTypLessThanEqual customTimingTypLessThanEqual に設定する
     */
    public void setCustomTimingTypLessThanEqual(String customTimingTypLessThanEqual) {
        this.customTimingTypLessThanEqual = customTimingTypLessThanEqual;
    }

    /**
     * customTimingTypLikeFront のゲッターメソッドです。
     * 
     * @return the customTimingTypLikeFront
     */
    public String getCustomTimingTypLikeFront() {
        return customTimingTypLikeFront;
    }

    /**
     * customTimingTypLikeFront のセッターメソッドです。
     * 
     * @param customTimingTypLikeFront customTimingTypLikeFront に設定する
     */
    public void setCustomTimingTypLikeFront(String customTimingTypLikeFront) {
        this.customTimingTypLikeFront = customTimingTypLikeFront;
    }

    /**
     * packingSummaryAtchFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the packingSummaryAtchFlgGreaterThan
     */
    public String getPackingSummaryAtchFlgGreaterThan() {
        return packingSummaryAtchFlgGreaterThan;
    }

    /**
     * packingSummaryAtchFlgGreaterThan のセッターメソッドです。
     * 
     * @param packingSummaryAtchFlgGreaterThan packingSummaryAtchFlgGreaterThan に設定する
     */
    public void setPackingSummaryAtchFlgGreaterThan(String packingSummaryAtchFlgGreaterThan) {
        this.packingSummaryAtchFlgGreaterThan = packingSummaryAtchFlgGreaterThan;
    }

    /**
     * packingSummaryAtchFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the packingSummaryAtchFlgGreaterThanEqual
     */
    public String getPackingSummaryAtchFlgGreaterThanEqual() {
        return packingSummaryAtchFlgGreaterThanEqual;
    }

    /**
     * packingSummaryAtchFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param packingSummaryAtchFlgGreaterThanEqual packingSummaryAtchFlgGreaterThanEqual に設定する
     */
    public void setPackingSummaryAtchFlgGreaterThanEqual(String packingSummaryAtchFlgGreaterThanEqual) {
        this.packingSummaryAtchFlgGreaterThanEqual = packingSummaryAtchFlgGreaterThanEqual;
    }

    /**
     * packingSummaryAtchFlgLessThan のゲッターメソッドです。
     * 
     * @return the packingSummaryAtchFlgLessThan
     */
    public String getPackingSummaryAtchFlgLessThan() {
        return packingSummaryAtchFlgLessThan;
    }

    /**
     * packingSummaryAtchFlgLessThan のセッターメソッドです。
     * 
     * @param packingSummaryAtchFlgLessThan packingSummaryAtchFlgLessThan に設定する
     */
    public void setPackingSummaryAtchFlgLessThan(String packingSummaryAtchFlgLessThan) {
        this.packingSummaryAtchFlgLessThan = packingSummaryAtchFlgLessThan;
    }

    /**
     * packingSummaryAtchFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the packingSummaryAtchFlgLessThanEqual
     */
    public String getPackingSummaryAtchFlgLessThanEqual() {
        return packingSummaryAtchFlgLessThanEqual;
    }

    /**
     * packingSummaryAtchFlgLessThanEqual のセッターメソッドです。
     * 
     * @param packingSummaryAtchFlgLessThanEqual packingSummaryAtchFlgLessThanEqual に設定する
     */
    public void setPackingSummaryAtchFlgLessThanEqual(String packingSummaryAtchFlgLessThanEqual) {
        this.packingSummaryAtchFlgLessThanEqual = packingSummaryAtchFlgLessThanEqual;
    }

    /**
     * singlePltzQrFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the singlePltzQrFlgGreaterThan
     */
    public String getSinglePltzQrFlgGreaterThan() {
        return singlePltzQrFlgGreaterThan;
    }

    /**
     * singlePltzQrFlgGreaterThan のセッターメソッドです。
     * 
     * @param singlePltzQrFlgGreaterThan singlePltzQrFlgGreaterThan に設定する
     */
    public void setSinglePltzQrFlgGreaterThan(String singlePltzQrFlgGreaterThan) {
        this.singlePltzQrFlgGreaterThan = singlePltzQrFlgGreaterThan;
    }

    /**
     * singlePltzQrFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the singlePltzQrFlgGreaterThanEqual
     */
    public String getSinglePltzQrFlgGreaterThanEqual() {
        return singlePltzQrFlgGreaterThanEqual;
    }

    /**
     * singlePltzQrFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param singlePltzQrFlgGreaterThanEqual singlePltzQrFlgGreaterThanEqual に設定する
     */
    public void setSinglePltzQrFlgGreaterThanEqual(String singlePltzQrFlgGreaterThanEqual) {
        this.singlePltzQrFlgGreaterThanEqual = singlePltzQrFlgGreaterThanEqual;
    }

    /**
     * singlePltzQrFlgLessThan のゲッターメソッドです。
     * 
     * @return the singlePltzQrFlgLessThan
     */
    public String getSinglePltzQrFlgLessThan() {
        return singlePltzQrFlgLessThan;
    }

    /**
     * singlePltzQrFlgLessThan のセッターメソッドです。
     * 
     * @param singlePltzQrFlgLessThan singlePltzQrFlgLessThan に設定する
     */
    public void setSinglePltzQrFlgLessThan(String singlePltzQrFlgLessThan) {
        this.singlePltzQrFlgLessThan = singlePltzQrFlgLessThan;
    }

    /**
     * singlePltzQrFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the singlePltzQrFlgLessThanEqual
     */
    public String getSinglePltzQrFlgLessThanEqual() {
        return singlePltzQrFlgLessThanEqual;
    }

    /**
     * singlePltzQrFlgLessThanEqual のセッターメソッドです。
     * 
     * @param singlePltzQrFlgLessThanEqual singlePltzQrFlgLessThanEqual に設定する
     */
    public void setSinglePltzQrFlgLessThanEqual(String singlePltzQrFlgLessThanEqual) {
        this.singlePltzQrFlgLessThanEqual = singlePltzQrFlgLessThanEqual;
    }

    /**
     * singlePltzQrFlgLikeFront のゲッターメソッドです。
     * 
     * @return the singlePltzQrFlgLikeFront
     */
    public String getSinglePltzQrFlgLikeFront() {
        return singlePltzQrFlgLikeFront;
    }

    /**
     * singlePltzQrFlgLikeFront のセッターメソッドです。
     * 
     * @param singlePltzQrFlgLikeFront singlePltzQrFlgLikeFront に設定する
     */
    public void setSinglePltzQrFlgLikeFront(String singlePltzQrFlgLikeFront) {
        this.singlePltzQrFlgLikeFront = singlePltzQrFlgLikeFront;
    }

    /**
     * packingSummaryAtchFlgLikeFront のゲッターメソッドです。
     * 
     * @return the packingSummaryAtchFlgLikeFront
     */
    public String getPackingSummaryAtchFlgLikeFront() {
        return packingSummaryAtchFlgLikeFront;
    }

    /**
     * packingSummaryAtchFlgLikeFront のセッターメソッドです。
     * 
     * @param packingSummaryAtchFlgLikeFront packingSummaryAtchFlgLikeFront に設定する
     */
    public void setPackingSummaryAtchFlgLikeFront(String packingSummaryAtchFlgLikeFront) {
        this.packingSummaryAtchFlgLikeFront = packingSummaryAtchFlgLikeFront;
    }

    /**
     * comUpdateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThan
     */
    public String getComUpdateFuncIdGreaterThan() {
        return comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThan comUpdateFuncIdGreaterThan に設定する
     */
    public void setComUpdateFuncIdGreaterThan(String comUpdateFuncIdGreaterThan) {
        this.comUpdateFuncIdGreaterThan = comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThanEqual
     */
    public String getComUpdateFuncIdGreaterThanEqual() {
        return comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThanEqual comUpdateFuncIdGreaterThanEqual に設定する
     */
    public void setComUpdateFuncIdGreaterThanEqual(String comUpdateFuncIdGreaterThanEqual) {
        this.comUpdateFuncIdGreaterThanEqual = comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThan
     */
    public String getComUpdateFuncIdLessThan() {
        return comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThan comUpdateFuncIdLessThan に設定する
     */
    public void setComUpdateFuncIdLessThan(String comUpdateFuncIdLessThan) {
        this.comUpdateFuncIdLessThan = comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThanEqual
     */
    public String getComUpdateFuncIdLessThanEqual() {
        return comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThanEqual comUpdateFuncIdLessThanEqual に設定する
     */
    public void setComUpdateFuncIdLessThanEqual(String comUpdateFuncIdLessThanEqual) {
        this.comUpdateFuncIdLessThanEqual = comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLikeFront
     */
    public String getComUpdateFuncIdLikeFront() {
        return comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLikeFront comUpdateFuncIdLikeFront に設定する
     */
    public void setComUpdateFuncIdLikeFront(String comUpdateFuncIdLikeFront) {
        this.comUpdateFuncIdLikeFront = comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThan
     */
    public String getComUpdateUserIdGreaterThan() {
        return comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThan comUpdateUserIdGreaterThan に設定する
     */
    public void setComUpdateUserIdGreaterThan(String comUpdateUserIdGreaterThan) {
        this.comUpdateUserIdGreaterThan = comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThanEqual
     */
    public String getComUpdateUserIdGreaterThanEqual() {
        return comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThanEqual comUpdateUserIdGreaterThanEqual に設定する
     */
    public void setComUpdateUserIdGreaterThanEqual(String comUpdateUserIdGreaterThanEqual) {
        this.comUpdateUserIdGreaterThanEqual = comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThan
     */
    public String getComUpdateUserIdLessThan() {
        return comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThan comUpdateUserIdLessThan に設定する
     */
    public void setComUpdateUserIdLessThan(String comUpdateUserIdLessThan) {
        this.comUpdateUserIdLessThan = comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThanEqual
     */
    public String getComUpdateUserIdLessThanEqual() {
        return comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThanEqual comUpdateUserIdLessThanEqual に設定する
     */
    public void setComUpdateUserIdLessThanEqual(String comUpdateUserIdLessThanEqual) {
        this.comUpdateUserIdLessThanEqual = comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLikeFront
     */
    public String getComUpdateUserIdLikeFront() {
        return comUpdateUserIdLikeFront;
    }

    /**
     * comUpdateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateUserIdLikeFront comUpdateUserIdLikeFront に設定する
     */
    public void setComUpdateUserIdLikeFront(String comUpdateUserIdLikeFront) {
        this.comUpdateUserIdLikeFront = comUpdateUserIdLikeFront;
    }

    /**
     * comCreateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThan
     */
    public String getComCreateFuncIdGreaterThan() {
        return comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThan comCreateFuncIdGreaterThan に設定する
     */
    public void setComCreateFuncIdGreaterThan(String comCreateFuncIdGreaterThan) {
        this.comCreateFuncIdGreaterThan = comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThanEqual
     */
    public String getComCreateFuncIdGreaterThanEqual() {
        return comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThanEqual comCreateFuncIdGreaterThanEqual に設定する
     */
    public void setComCreateFuncIdGreaterThanEqual(String comCreateFuncIdGreaterThanEqual) {
        this.comCreateFuncIdGreaterThanEqual = comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThan
     */
    public String getComCreateFuncIdLessThan() {
        return comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThan comCreateFuncIdLessThan に設定する
     */
    public void setComCreateFuncIdLessThan(String comCreateFuncIdLessThan) {
        this.comCreateFuncIdLessThan = comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThanEqual
     */
    public String getComCreateFuncIdLessThanEqual() {
        return comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThanEqual comCreateFuncIdLessThanEqual に設定する
     */
    public void setComCreateFuncIdLessThanEqual(String comCreateFuncIdLessThanEqual) {
        this.comCreateFuncIdLessThanEqual = comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLikeFront
     */
    public String getComCreateFuncIdLikeFront() {
        return comCreateFuncIdLikeFront;
    }

    /**
     * comCreateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateFuncIdLikeFront comCreateFuncIdLikeFront に設定する
     */
    public void setComCreateFuncIdLikeFront(String comCreateFuncIdLikeFront) {
        this.comCreateFuncIdLikeFront = comCreateFuncIdLikeFront;
    }

    /**
     * comCreateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThan
     */
    public String getComCreateUserIdGreaterThan() {
        return comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThan comCreateUserIdGreaterThan に設定する
     */
    public void setComCreateUserIdGreaterThan(String comCreateUserIdGreaterThan) {
        this.comCreateUserIdGreaterThan = comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThanEqual
     */
    public String getComCreateUserIdGreaterThanEqual() {
        return comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThanEqual comCreateUserIdGreaterThanEqual に設定する
     */
    public void setComCreateUserIdGreaterThanEqual(String comCreateUserIdGreaterThanEqual) {
        this.comCreateUserIdGreaterThanEqual = comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThan
     */
    public String getComCreateUserIdLessThan() {
        return comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThan のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThan comCreateUserIdLessThan に設定する
     */
    public void setComCreateUserIdLessThan(String comCreateUserIdLessThan) {
        this.comCreateUserIdLessThan = comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThanEqual
     */
    public String getComCreateUserIdLessThanEqual() {
        return comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThanEqual comCreateUserIdLessThanEqual に設定する
     */
    public void setComCreateUserIdLessThanEqual(String comCreateUserIdLessThanEqual) {
        this.comCreateUserIdLessThanEqual = comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLikeFront
     */
    public String getComCreateUserIdLikeFront() {
        return comCreateUserIdLikeFront;
    }

    /**
     * comCreateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateUserIdLikeFront comCreateUserIdLikeFront に設定する
     */
    public void setComCreateUserIdLikeFront(String comCreateUserIdLikeFront) {
        this.comCreateUserIdLikeFront = comCreateUserIdLikeFront;
    }

}

