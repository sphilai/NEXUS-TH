/*
 * PROJECT：eca0027
 * 
 * TtExpRequest のDomainクラス
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.List;

/**
 * SACT Version： 1.0.1<BR>
 * 生成日 ： 2558/04/27 14:08:11<BR>
 * テーブル定義から2558/04/27に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1009CriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Changing agency screen <br />
     * 遷移元画面
     */
    private String callScreenId;
    
    /**
     * DSC-ID/DSC-ID
     */
    private String dcsId;

    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;
    /**
     * Main Mark
     */
    private String mainMark;
    /**
     * PALLET_NO
     */
    private String palletNo;

    /**
     * SHIPPER CODE/?????
     */
    private String shipperCd;

    /**
     * CONSIGNEE CODE/??????
     */
    private String consigneeCd;

    /**
     * SHIP TO CODE/??????
     */
    private String shipToCd;
    
    /**
     * PACKING COMPANY CODE/???????
     */
    private String packingCompCd;
    
    /**
     * PACKING WAREHOUSE CODE/???????
     */
    private String packingWhCd;

    /**
     * TRANSPORT CODE/???????
     */
    private String trnsCd;
    /**
     *Outer Package Code
     */
    private String outerPkgCd;
    /**
     * WEIGHT UNIT/????
     */
    private String weightUnit;
    /**
     *Owner Comp
     */
    private String ownerComp;
    /**
     * Length UNIT/????
     */
    private String lengthUnitHeader;
    /**
     * REQUEST STATUS/???????  
     * 10:has not completed request,
     * 20:has not print approval equest,
     * 30:has not received packing Dep.,
     * 40:has not Packed,
     * 50:In progress of PKG,
     * 60:Issue all CML,
     * 90:Cancel
     */
    private String requestStatus;

    /**
     * User functional utilization right <br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * Date format (for screen display) <br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1009CriteriaDomain() {
    }

    /**
     * <p>Getter method for lengthUnitHeader.</p>
     *
     * @return the lengthUnitHeader
     */
    public String getLengthUnitHeader() {
        return lengthUnitHeader;
    }

    /**
     * <p>Setter method for lengthUnitHeader.</p>
     *
     * @param lengthUnitHeader Set for lengthUnitHeader
     */
    public void setLengthUnitHeader(String lengthUnitHeader) {
        this.lengthUnitHeader = lengthUnitHeader;
    }

    /**
     * <p>Getter method for outerPkgCd.</p>
     *
     * @return the outerPkgCd
     */
    public String getOuterPkgCd() {
        return outerPkgCd;
    }

    /**
     * <p>Setter method for outerPkgCd.</p>
     *
     * @param outerPkgCd Set for outerPkgCd
     */
    public void setOuterPkgCd(String outerPkgCd) {
        this.outerPkgCd = outerPkgCd;
    }

    /**
     * <p>Getter method for ownerComp.</p>
     *
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * <p>Setter method for ownerComp.</p>
     *
     * @param ownerComp Set for ownerComp
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * Getter method for callScreenId.
     *
     * @return the callScreenId
     */
    public String getCallScreenId() {
        return callScreenId;
    }

    /**
     * Setter method for callScreenId.
     *
     * @param callScreenId Set for callScreenId
     */
    public void setCallScreenId(String callScreenId) {
        this.callScreenId = callScreenId;
    }
    
    /**
     * dcsId のゲッターメソッドです。
     * 
     * @return the dcsId
     */
    public String getDcsId() {
        return dcsId;
    }

    /**
     * dcsId のセッターメソッドです。
     * 
     * @param dcsId dcsId に設定する
     */
    public void setDcsId(String dcsId) {
        this.dcsId = dcsId;
    }

    /**
     * Getter method for expRequestNo.
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * Setter method for expRequestNo.
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
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
     * Setter method for v.
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
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
     * Getter method for consigneeCd.
     *
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * Setter method for consigneeCd.
     *
     * @param consigneeCd Set for consigneeCd
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
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
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
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
     * Getter method for packingCompCd.
     *
     * @return the packingCompCd
     */
    public String getPackingCompCd() {
        return packingCompCd;
    }

    /**
     * Setter method for packingCompCd.
     *
     * @param packingCompCd Set for packingCompCd
     */
    public void setPackingCompCd(String packingCompCd) {
        this.packingCompCd = packingCompCd;
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
     * <p>Getter method for mainMark.</p>
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * <p>Setter method for mainMark.</p>
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for requestStatus.
     *
     * @return the requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * Setter method for requestStatus.
     *
     * @param requestStatus Set for requestStatus
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
