/*
 * PROJECT：eca0027
 * 
 * TtExpRequest の検索条件Domainクラス
 * テーブル概要：Export Request/????  Table to hold the header information of the export request/???????????????????
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/04/27  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * TtExpRequest の検索条件Domainクラスです。<BR>
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
public class W1001ExpRequestCriteriaDomain extends AbstractDomain implements Serializable {

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
     * Function authority list.
     */
    private List<? extends UserAuthDomain> userAuthList;
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
    private Date fmUpdateTimestamp;
    
    /**
     * UPDATE TIMESTAMP????
     */
    private Date toUpdateTimestamp;

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
     * Processing mode.<br />
     * 処理モード
     */
    private String procMode;

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
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1001ExpRequestCriteriaDomain() {
        super();
    }
    
    /**
     * shipperCd
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd
     * 
     * @param shipperCd shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * requestStatus
     * 
     * @return the requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * requestStatus
     * 
     * @param requestStatus requestStatus
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * consigneeCd
     * 
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * consigneeCd
     * 
     * @param consigneeCd consigneeCd
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
     * shipToCd
     * 
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * shipToCd
     * 
     * @param shipToCd shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * expRequestNo
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * expRequestNo
     * 
     * @param expRequestNo expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * comCreateUserId
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId
     * 
     * @param comCreateUserId comCreateUserId
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * trnsCd
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd
     * 
     * @param trnsCd trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * fmUpdateTimestamp
     * 
     * @return the fmUpdateTimestamp
     */
    public Date getFmUpdateTimestamp() {
        return fmUpdateTimestamp;
    }

    /**
     * fmUpdateTimestamp
     * 
     * @param fmUpdateTimestamp fmUpdateTimestamp
     */
    public void setFmUpdateTimestamp(Date fmUpdateTimestamp) {
        this.fmUpdateTimestamp = fmUpdateTimestamp;
    }

    /**
     * toUpdateTimestamp
     * 
     * @return the toUpdateTimestamp
     */
    public Date getToUpdateTimestamp() {
        return toUpdateTimestamp;
    }

    /**
     * toUpdateTimestamp
     * 
     * @param toUpdateTimestamp toUpdateTimestamp
     */
    public void setToUpdateTimestamp(Date toUpdateTimestamp) {
        this.toUpdateTimestamp = toUpdateTimestamp;
    }

    /**
     * pltzItemNo
     * 
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * pltzItemNo
     * 
     * @param pltzItemNo pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }

    /**
     * itemDescription
     * 
     * @return the itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * itemDescription
     * 
     * @param itemDescription itemDescription
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * mainMark
     * 
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * mainMark
     * 
     * @param mainMark mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * invoiceCtgry
     * 
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * invoiceCtgry
     * 
     * @param invoiceCtgry invoiceCtgry
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * packingCompCd
     * 
     * @return the packingCompCd
     */
    public String getPackingCompCd() {
        return packingCompCd;
    }

    /**
     * packingCompCd
     * 
     * @param packingCompCd packingCompCd
     */
    public void setPackingCompCd(String packingCompCd) {
        this.packingCompCd = packingCompCd;
    }

    /**
     * packingWhCd
     * 
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * packingWhCd
     * 
     * @param packingWhCd packingWhCd
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
    }

    /**
     * customerCd
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * customerCd
     * 
     * @param customerCd customerCd
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
     * splitShippingNgFlg
     * 
     * @return the splitShippingNgFlg
     */
    public String getSplitShippingNgFlg() {
        return splitShippingNgFlg;
    }

    /**
     * splitShippingNgFlg
     * 
     * @param splitShippingNgFlg splitShippingNgFlg
     */
    public void setSplitShippingNgFlg(String splitShippingNgFlg) {
        this.splitShippingNgFlg = splitShippingNgFlg;
    }

    /**
     * serverId
     * 
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * serverId
     * 
     * @param serverId serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }
    
    /**
     * procMode
     * 
     * @return the procMode
     */
    public String getProcMode() {
        return procMode;
    }

    /**
     * procMode
     * 
     * @param procMode procMode
     */
    public void setProcMode(String procMode) {
        this.procMode = procMode;
    }

    /**
     * screenDateFormat
     * 
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * screenDateFormat
     * 
     * @param screenDateFormat screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * pageInfoCreator
     * 
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * pageInfoCreator
     * 
     * @param pageInfoCreator pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

    /**
     * <p>Getter method for userAuthList.</p>
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * <p>Setter method for userAuthList.</p>
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

}

