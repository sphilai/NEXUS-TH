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
import com.globaldenso.gscm.framework.util.PageInfoCreator;

import java.util.List;

/**
 * TtExpRequest のDomainクラスです。<BR>
 * テーブル概要：Export Request/???? Table to hold the header information of the export
 * request/???????????????????<BR>
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日 ： 2558/04/27 14:08:11<BR>
 * テーブル定義から2558/04/27に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1004CriteriaDomain extends AbstractDomain implements Serializable {

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
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;

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
     * TRANSPORT CODE/???????
     */
    private String trnsCd;

    /**
     * WEIGHT UNIT/????
     */
    private String weightUnit;

    /**
     * QUANTITY UNIT/????
     */
    private String qtyUnit1;

    /**
     * QUANTITY/????
     */
    private String qty1;

    /**
     * QUANTITY UNIT/????
     */
    private String qtyUnit2;

    /**
     * QUANTITY/????
     */
    private String qty2;

    /**
     * CURRENCY CODE
     */
    private String currencyCd1;

    /**
     * UNIT PRICE
     */
    private String unitPrice1;

    /**
     * SHIPPER NAME/?????
     */
    private String currencyCd2;

    /**
     * UNIT PRICE
     */
    private String unitPrice2;
    
    /**
     * REQUEST STATUS/???????  10:has not completed request, 20:has not print approval equest, 30:has not received packing Dep., 40:has not Packed, 50:In progress of PKG, 60:Issue all CML, 90:Cancel
     */
    private String requestStatus;

    /**
     * Processing mode (for screen taking over) <br />
     * 処理モード (画面引継ぎ用)
     */
    private String procMode;

    /**
     * User functional utilization right <br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * SERVER ID <br />
     * サーバID
     */
    private String serverId;

    /**
     * Date format (for screen display) <br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * Changing agency SCREEN ID (for Screen fields attributes)  
     * <br />遷移元画面ID (画面表示制御用)
     */
    private String originalScreenId;
    
    /**
     * PageInfoCreator Object<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1004CriteriaDomain() {
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
     * Getter method for qtyUnit1.
     *
     * @return the qtyUnit1
     */
    public String getQtyUnit1() {
        return qtyUnit1;
    }

    /**
     * Setter method for qtyUnit1.
     *
     * @param qtyUnit1 Set for qtyUnit1
     */
    public void setQtyUnit1(String qtyUnit1) {
        this.qtyUnit1 = qtyUnit1;
    }

    /**
     * Getter method for qty1.
     *
     * @return the qty1
     */
    public String getQty1() {
        return qty1;
    }

    /**
     * Setter method for qty1.
     *
     * @param qty1 Set for qty1
     */
    public void setQty1(String qty1) {
        this.qty1 = qty1;
    }
    
    /**
     * Getter method for qtyUnit2.
     *
     * @return the qtyUnit2
     */
    public String getQtyUnit2() {
        return qtyUnit2;
    }

    /**
     * Setter method for qtyUnit2.
     *
     * @param qtyUnit2 Set for qtyUnit2
     */
    public void setQtyUnit2(String qtyUnit2) {
        this.qtyUnit2 = qtyUnit2;
    }

    /**
     * Getter method for qty2.
     *
     * @return the qty2
     */
    public String getQty2() {
        return qty2;
    }

    /**
     * Setter method for qty2.
     *
     * @param qty2 Set for qty2
     */
    public void setQty2(String qty2) {
        this.qty2 = qty2;
    }

    /**
     * Getter method for currencyCd1.
     *
     * @return the currencyCd1
     */
    public String getCurrencyCd1() {
        return currencyCd1;
    }

    /**
     * Setter method for currencyCd1.
     *
     * @param currencyCd1 Set for currencyCd1
     */
    public void setCurrencyCd1(String currencyCd1) {
        this.currencyCd1 = currencyCd1;
    }

    /**
     * Getter method for unitPrice1.
     *
     * @return the unitPrice1
     */
    public String getUnitPrice1() {
        return unitPrice1;
    }

    /**
     * Setter method for unitPrice1.
     *
     * @param unitPrice1 Set for unitPrice1
     */
    public void setUnitPrice1(String unitPrice1) {
        this.unitPrice1 = unitPrice1;
    }

    /**
     * Getter method for currencyCd2.
     *
     * @return the currencyCd2
     */
    public String getCurrencyCd2() {
        return currencyCd2;
    }

    /**
     * Setter method for currencyCd2.
     *
     * @param currencyCd2 Set for currencyCd2
     */
    public void setCurrencyCd2(String currencyCd2) {
        this.currencyCd2 = currencyCd2;
    }

    /**
     * Getter method for unitPrice2.
     *
     * @return the unitPrice2
     */
    public String getUnitPrice2() {
        return unitPrice2;
    }

    /**
     * Setter method for unitPrice2.
     *
     * @param unitPrice2 Set for unitPrice2
     */
    public void setUnitPrice2(String unitPrice2) {
        this.unitPrice2 = unitPrice2;
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

    /**
     * Getter method for procMode.
     *
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * Setter method for procMode.
     *
     * @param procMode Set for procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
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
     * Getter method for originalScreenId.
     *
     * @return the originalScreenId
     */
    public String getOriginalScreenId() {
        return originalScreenId;
    }

    /**
     * Setter method for originalScreenId.
     *
     * @param originalScreenId Set for originalScreenId
     */
    public void setOriginalScreenId(String originalScreenId) {
        this.originalScreenId = originalScreenId;
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
}
