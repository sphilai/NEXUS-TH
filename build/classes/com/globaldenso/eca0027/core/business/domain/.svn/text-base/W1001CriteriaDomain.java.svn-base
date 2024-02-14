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
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/04/27 14:08:11<BR>
 * 
 * テーブル定義から2558/04/27に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1001CriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE/?????
     */
    private String shipperCd;

    /**
     * REQUEST STATUS/???????  10:has not completed request, 20:has not print approval equest, 30:has not received packing Dep., 40:has not Packed, 50:In progress of PKG, 60:Issue all CML, 90:Cancel
     */
    private String requestStatus;

    /**
     * CONSIGNEE CODE/??????
     */
    private String consigneeCd;

    /**
     * SHIP TO CODE/??????
     */
    private String shipToCd;

    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;

    /**
     * CREATE USER ID/???
     */
    private String comCreateUserId;

    /**
     * TRANSPORT CODE/???????
     */
    private String trnsCd;

    /**
     * UPDATE TIMESTAMP????
     */
    private String fmUpdateTimestamp;
    
    /**
     * UPDATE TIMESTAMP????
     */
    private String toUpdateTimestamp;

    /**
     * ITEM NO/????
     */
    private String pltzItemNo;

    /**
     * ITEM DESCRIPTION/????
     */
    private String itemDescription;

    /**
     * MAIN MARK/????
     */
    private String mainMark;

    /**
     * INVOICE CATEGORY/????  C:Commercial value, I:Commercial value (I), N:No commercial value
     */
    private String invoiceCtgry;

    /**
     * PACKING COMPANY CODE/???????
     */
    private String packingCompCd;

    /**
     * PACKING WAREHOUSE CODE/???????
     */
    private String packingWhCd;

    /**
     * CUSTOMER CODE/??????
     */
    private String customerCd;
    
    /**
     * CUSTOMER SHIP TO CODE/??????????
     */
    private String customerShipTo;

    /**
     * SPLIT SHIPPING NG FLAG/?????????  Y:Prohibit Division, N:Allowed Division
     */
    private String splitShippingNgFlg;
   
    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * PageInfoCreator Object<br />
     * PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    /**
     * Processing mode
     * <br />処理モード
     */
    private String procMode;
    
    /**
     * Server ID<br />
     * サーバID
     */
    private String serverId;
    /**
     * Row number.
     */
    private String rowNum;
    
    /**
     * User function use authority<br />
     * ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * デフォルトコンストラクタ。
     */
    public W1001CriteriaDomain() {
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
     * expRequestNo のゲッターメソッドです。
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * expRequestNo のセッターメソッドです。
     * 
     * @param expRequestNo expRequestNo に設定する
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * shipperCd のゲッターメソッドです。
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd のセッターメソッドです。
     * 
     * @param shipperCd shipperCd に設定する
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * invoiceCtgry のゲッターメソッドです。
     * 
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * invoiceCtgry のセッターメソッドです。
     * 
     * @param invoiceCtgry invoiceCtgry に設定する
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * consigneeCd のゲッターメソッドです。
     * 
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * consigneeCd のセッターメソッドです。
     * 
     * @param consigneeCd consigneeCd に設定する
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
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
     * trnsCd のゲッターメソッドです。
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd のセッターメソッドです。
     * 
     * @param trnsCd trnsCd に設定する
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * splitShippingNgFlg のゲッターメソッドです。
     * 
     * @return the splitShippingNgFlg
     */
    public String getSplitShippingNgFlg() {
        return splitShippingNgFlg;
    }

    /**
     * splitShippingNgFlg のセッターメソッドです。
     * 
     * @param splitShippingNgFlg splitShippingNgFlg に設定する
     */
    public void setSplitShippingNgFlg(String splitShippingNgFlg) {
        this.splitShippingNgFlg = splitShippingNgFlg;
    }

    /**
     * packingWhCd のゲッターメソッドです。
     * 
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * packingWhCd のセッターメソッドです。
     * 
     * @param packingWhCd packingWhCd に設定する
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
    }

    /**
     * packingCompCd のゲッターメソッドです。
     * 
     * @return the packingCompCd
     */
    public String getPackingCompCd() {
        return packingCompCd;
    }

    /**
     * packingCompCd のセッターメソッドです。
     * 
     * @param packingCompCd packingCompCd に設定する
     */
    public void setPackingCompCd(String packingCompCd) {
        this.packingCompCd = packingCompCd;
    }

    /**
     * customerCd のゲッターメソッドです。
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * customerCd のセッターメソッドです。
     * 
     * @param customerCd customerCd に設定する
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }
    
    /**
     * customerShipTo
     * 
     * @return the customerShipTo
     */
    public String getCustomerShipTo() {
        return customerShipTo;
    }

    /**
     * customerShipTo
     * 
     * @param customerShipTo customerShipTo
     */
    public void setCustomerShipTo(String customerShipTo) {
        this.customerShipTo = customerShipTo;
    }

    /**
     * requestStatus のゲッターメソッドです。
     * 
     * @return the requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * requestStatus のセッターメソッドです。
     * 
     * @param requestStatus requestStatus に設定する
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
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
     * pltzItemNo のゲッターメソッドです。
     * 
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * pltzItemNo のセッターメソッドです。
     * 
     * @param pltzItemNo pltzItemNo に設定する
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }

    /**
     * itemDescription のゲッターメソッドです。
     * 
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * itemDescription のセッターメソッドです。
     * 
     * @param itemDescription itemDescription に設定する
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * mainMark のゲッターメソッドです。
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * mainMark のセッターメソッドです。
     * 
     * @param mainMark mainMark に設定する
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * fmUpdateTimestamp のゲッターメソッドです。
     * 
     * @return the fmUpdateTimestamp
     */
    public String getFmUpdateTimestamp() {
        return fmUpdateTimestamp;
    }

    /**
     * fmUpdateTimestamp のセッターメソッドです。
     * 
     * @param fmUpdateTimestamp fmUpdateTimestamp に設定する
     */
    public void setFmUpdateTimestamp(String fmUpdateTimestamp) {
        this.fmUpdateTimestamp = fmUpdateTimestamp;
    }

    /**
     * toUpdateTimestamp のゲッターメソッドです。
     * 
     * @return the toUpdateTimestamp
     */
    public String getToUpdateTimestamp() {
        return toUpdateTimestamp;
    }

    /**
     * toUpdateTimestamp のセッターメソッドです。
     * 
     * @param toUpdateTimestamp toUpdateTimestamp に設定する
     */
    public void setToUpdateTimestamp(String toUpdateTimestamp) {
        this.toUpdateTimestamp = toUpdateTimestamp;
    }

    /**
     * procMode のゲッターメソッドです。
     * 
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * procMode のセッターメソッドです。
     * 
     * @param procMode procMode に設定する
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }
    
    /**
     * <p>Getter method for rowNum.</p>
     *
     * @return the rowNum
     */
    public String getRowNum() {
        return rowNum;
    }

    /**
     * <p>Setter method for rowNum.</p>
     *
     * @param rowNum Set for rowNum
     */
    public void setRowNum(String rowNum) {
        this.rowNum = rowNum;
    }

}
