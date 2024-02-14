/*
 * Project : NEXUS_CIGMA
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * The domain class that contains the updated invoice information of the request
 *  parameter of WsB006.
 * <br />WsB006のリクエストパラメータの更新対象インボイス情報を格納するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsB006ParamItemDomain {

    /**
     * Customer Subsidiary code<br />
     * 得意先輸出入拠点コード
     */
    @XmlElement(name = "customerSubsidiaryCode")
    private String customerSubsidiaryCode;
    
    /**
     * Transmission Date<br />
     * 情報送信日
     */
    @XmlElement(name = "transmissionDate")
    private String transmissionDate;
    
    /**
     * Order type<br />
     * 発注区分 
     * <br />1:Original 2:Change
     */
    @XmlElement(name = "orderType")
    private String orderType;
    
    /**
     * Serial no.<br />
     * 連番
     */
    @XmlElement(name = "serialNo")
    private String serialNo;
    
    /**
     * Legacy customer no.<br />
     * 得意先NO LEGACY
     */
    @XmlElement(name = "customerNoLegacy")
    private String customerNoLegacy;
    
    /**
     * SHIP_TO LEGACY
     */
    @XmlElement(name = "shiptoNoLegacy")
    private String shiptoNoLegacy;
    
    /**
     * Original customer parts no.<br />
     * 得意先品目番号オリジナル
     */
    @XmlElement(name = "customerPartNoOrg")
    private String customerPartNoOrg;
    
    /**
     * Order control no.<br />
     * オーダーコントロールNO
     */
    @XmlElement(name = "orderControlNo")
    private String orderControlNo;
    
    /**
     * Revision no.<br />
     * 履歴NO
     */
    @XmlElement(name = "revisionNo")
    private String revisionNo;
    
    /**
     * Revison no.(between bases)<br />
     * 履歴NO(拠点間)
     */
    @XmlElement(name = "revisionNoEis")
    private String revisionNoEis;
    
    /**
     * Order change type<br />
     * 発注変更区分 
     * <br />1:Add, 2:Change, 3:Delete, 9:Error
     */
    @XmlElement(name = "orderChangeType")
    private String orderChangeType;
    
    /**
     * Customer P/O no.<br />
     * 得意先PO NO
     */
    @XmlElement(name = "customerPoNo")
    private String customerPoNo;
    
    /**
     * Transportation code<br />
     * 輸送コード
     */
    @XmlElement(name = "transportationCode")
    private String transportationCode;
    
    /**
     * Customer due date<br />
     * 顧客納期
     */
    @XmlElement(name = "customerDueDate")
    private String customerDueDate;
    
    /**
     * ETD
     */
    @XmlElement(name = "etdDueDate")
    private String etdDueDate;
    
    /**
     * Firm order flag<br />
     * 受注確定フラグ<br />
     * Y:firm, N: unofficial notification<br />
     * <br />Y:確定, N:内示
     */
    @XmlElement(name = "orderFirmFlag")
    private String orderFirmFlag;
    
    /**
     * Order quantity<br />
     * 注文数量
     */
    @XmlElement(name = "orderQty")
    private String orderQty;
    
    /**
     * Shipping Due Date
     */
    private String shippingDueDate;
    
    /**
     * Supplier code(for customer)<br />
     * 仕入先コード(得意先視点)
     */
    @XmlElement(name = "supplierCode")
    private String supplierCode;
    
    /**
     * Customer Plant Code<br />
     * 得意先工場コード
     */
    @XmlElement(name = "customerPlantCode")
    private String customerPlantCode;
    
    /**
     * Level1 error code list(Comma-separated)<br />
     * レベル1エラーコードリスト(カンマ区切り)
     */
    @XmlElement(name = "level1ErrorCodeList")
    private String level1ErrorCodeList;
    
    /**
     * Level2 error code list(Comma-separated)<br />
     * レベル2エラーコードリスト(カンマ区切り)
     */
    @XmlElement(name = "level2ErrorCodeList")
    private String level2ErrorCodeList;
    
    /**
     * Level3 error code list(Comma-separated)<br />
     * レベル3エラーコードリスト(カンマ区切り)
     */
    @XmlElement(name = "level3ErrorCodeList")
    private String level3ErrorCodeList;
    
    /**
     * Level3 warning code list(Comma-separated)<br />
     * レベル3警告コードリスト(カンマ区切り)
     */
    @XmlElement(name = "level3WarningCodeList")
    private String level3WarningCodeList;
    
    /**
     * Error type<br />
     * エラー区分<br />
     * 0:OK,1:warning,2:error
     * <br />0:正常, 1:警告のみあり, 2:エラーあり
     */
    @XmlElement(name = "errorType")
    private String errorType;
    
    /**
     * Default constructor<br />
     */
    public WsB006ParamItemDomain() {
        super();
    }

    /**
     * Getter method for customerSubsidiaryCode.
     *
     * @return the customerSubsidiaryCode
     */
    public String getCustomerSubsidiaryCode() {
        return customerSubsidiaryCode;
    }

    /**
     * Setter method for customerSubsidiaryCode.
     *
     * @param customerSubsidiaryCode Set for customerSubsidiaryCode
     */
    public void setCustomerSubsidiaryCode(String customerSubsidiaryCode) {
        this.customerSubsidiaryCode = customerSubsidiaryCode;
    }

    /**
     * Getter method for transmissionDate.
     *
     * @return the transmissionDate
     */
    public String getTransmissionDate() {
        return transmissionDate;
    }

    /**
     * Setter method for transmissionDate.
     *
     * @param transmissionDate Set for transmissionDate
     */
    public void setTransmissionDate(String transmissionDate) {
        this.transmissionDate = transmissionDate;
    }

    /**
     * Getter method for orderType.
     *
     * @return the orderType
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Setter method for orderType.
     *
     * @param orderType Set for orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * Getter method for serialNo.
     *
     * @return the serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Setter method for serialNo.
     *
     * @param serialNo Set for serialNo
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * Getter method for customerNoLegacy.
     *
     * @return the customerNoLegacy
     */
    public String getCustomerNoLegacy() {
        return customerNoLegacy;
    }

    /**
     * Setter method for customerNoLegacy.
     *
     * @param customerNoLegacy Set for customerNoLegacy
     */
    public void setCustomerNoLegacy(String customerNoLegacy) {
        this.customerNoLegacy = customerNoLegacy;
    }

    /**
     * Getter method for shiptoNoLegacy.
     *
     * @return the shiptoNoLegacy
     */
    public String getShiptoNoLegacy() {
        return shiptoNoLegacy;
    }

    /**
     * Setter method for shiptoNoLegacy.
     *
     * @param shiptoNoLegacy Set for shiptoNoLegacy
     */
    public void setShiptoNoLegacy(String shiptoNoLegacy) {
        this.shiptoNoLegacy = shiptoNoLegacy;
    }

    /**
     * Getter method for customerPartNoOrg.
     *
     * @return the customerPartNoOrg
     */
    public String getCustomerPartNoOrg() {
        return customerPartNoOrg;
    }

    /**
     * Setter method for customerPartNoOrg.
     *
     * @param customerPartNoOrg Set for customerPartNoOrg
     */
    public void setCustomerPartNoOrg(String customerPartNoOrg) {
        this.customerPartNoOrg = customerPartNoOrg;
    }

    /**
     * Getter method for orderControlNo.
     *
     * @return the orderControlNo
     */
    public String getOrderControlNo() {
        return orderControlNo;
    }

    /**
     * Setter method for orderControlNo.
     *
     * @param orderControlNo Set for orderControlNo
     */
    public void setOrderControlNo(String orderControlNo) {
        this.orderControlNo = orderControlNo;
    }

    /**
     * Getter method for revisionNo.
     *
     * @return the revisionNo
     */
    public String getRevisionNo() {
        return revisionNo;
    }

    /**
     * Setter method for revisionNo.
     *
     * @param revisionNo Set for revisionNo
     */
    public void setRevisionNo(String revisionNo) {
        this.revisionNo = revisionNo;
    }

    /**
     * Getter method for revisionNoEis.
     *
     * @return the revisionNoEis
     */
    public String getRevisionNoEis() {
        return revisionNoEis;
    }

    /**
     * Setter method for revisionNoEis.
     *
     * @param revisionNoEis Set for revisionNoEis
     */
    public void setRevisionNoEis(String revisionNoEis) {
        this.revisionNoEis = revisionNoEis;
    }

    /**
     * Getter method for orderChangeType.
     *
     * @return the orderChangeType
     */
    public String getOrderChangeType() {
        return orderChangeType;
    }

    /**
     * Setter method for orderChangeType.
     *
     * @param orderChangeType Set for orderChangeType
     */
    public void setOrderChangeType(String orderChangeType) {
        this.orderChangeType = orderChangeType;
    }

    /**
     * Getter method for customerPoNo.
     *
     * @return the customerPoNo
     */
    public String getCustomerPoNo() {
        return customerPoNo;
    }

    /**
     * Setter method for customerPoNo.
     *
     * @param customerPoNo Set for customerPoNo
     */
    public void setCustomerPoNo(String customerPoNo) {
        this.customerPoNo = customerPoNo;
    }

    /**
     * Getter method for transportationCode.
     *
     * @return the transportationCode
     */
    public String getTransportationCode() {
        return transportationCode;
    }

    /**
     * Setter method for transportationCode.
     *
     * @param transportationCode Set for transportationCode
     */
    public void setTransportationCode(String transportationCode) {
        this.transportationCode = transportationCode;
    }

    /**
     * Getter method for customerDueDate.
     *
     * @return the customerDueDate
     */
    public String getCustomerDueDate() {
        return customerDueDate;
    }

    /**
     * Setter method for customerDueDate.
     *
     * @param customerDueDate Set for customerDueDate
     */
    public void setCustomerDueDate(String customerDueDate) {
        this.customerDueDate = customerDueDate;
    }

    /**
     * Getter method for etdDueDate.
     *
     * @return the etdDueDate
     */
    public String getEtdDueDate() {
        return etdDueDate;
    }

    /**
     * Setter method for etdDueDate.
     *
     * @param etdDueDate Set for etdDueDate
     */
    public void setEtdDueDate(String etdDueDate) {
        this.etdDueDate = etdDueDate;
    }

    /**
     * Getter method for orderFirmFlag.
     *
     * @return the orderFirmFlag
     */
    public String getOrderFirmFlag() {
        return orderFirmFlag;
    }

    /**
     * Setter method for orderFirmFlag.
     *
     * @param orderFirmFlag Set for orderFirmFlag
     */
    public void setOrderFirmFlag(String orderFirmFlag) {
        this.orderFirmFlag = orderFirmFlag;
    }

    /**
     * Getter method for orderQty.
     *
     * @return the orderQty
     */
    public String getOrderQty() {
        return orderQty;
    }

    /**
     * Setter method for orderQty.
     *
     * @param orderQty Set for orderQty
     */
    public void setOrderQty(String orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * Getter method for supplierCode.
     *
     * @return the supplierCode
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Setter method for supplierCode.
     *
     * @param supplierCode Set for supplierCode
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * Getter method for level1ErrorCodeList.
     *
     * @return the level1ErrorCodeList
     */
    public String getLevel1ErrorCodeList() {
        return level1ErrorCodeList;
    }

    /**
     * Setter method for level1ErrorCodeList.
     *
     * @param level1ErrorCodeList Set for level1ErrorCodeList
     */
    public void setLevel1ErrorCodeList(String level1ErrorCodeList) {
        this.level1ErrorCodeList = level1ErrorCodeList;
    }

    /**
     * Getter method for level2ErrorCodeList.
     *
     * @return the level2ErrorCodeList
     */
    public String getLevel2ErrorCodeList() {
        return level2ErrorCodeList;
    }

    /**
     * Setter method for level2ErrorCodeList.
     *
     * @param level2ErrorCodeList Set for level2ErrorCodeList
     */
    public void setLevel2ErrorCodeList(String level2ErrorCodeList) {
        this.level2ErrorCodeList = level2ErrorCodeList;
    }

    /**
     * Getter method for level3ErrorCodeList.
     *
     * @return the level3ErrorCodeList
     */
    public String getLevel3ErrorCodeList() {
        return level3ErrorCodeList;
    }

    /**
     * Setter method for level3ErrorCodeList.
     *
     * @param level3ErrorCodeList Set for level3ErrorCodeList
     */
    public void setLevel3ErrorCodeList(String level3ErrorCodeList) {
        this.level3ErrorCodeList = level3ErrorCodeList;
    }

    /**
     * Getter method for level3WarningCodeList.
     *
     * @return the level3WarningCodeList
     */
    public String getLevel3WarningCodeList() {
        return level3WarningCodeList;
    }

    /**
     * Setter method for level3WarningCodeList.
     *
     * @param level3WarningCodeList Set for level3WarningCodeList
     */
    public void setLevel3WarningCodeList(String level3WarningCodeList) {
        this.level3WarningCodeList = level3WarningCodeList;
    }

    /**
     * Getter method for errorType.
     *
     * @return the errorType
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * Setter method for errorType.
     *
     * @param errorType Set for errorType
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * Getter method for shippingDueDate.
     *
     * @return the shippingDueDate
     */
    public String getShippingDueDate() {
        return shippingDueDate;
    }

    /**
     * Setter method for shippingDueDate.
     *
     * @param shippingDueDate Set for shippingDueDate
     */
    public void setShippingDueDate(String shippingDueDate) {
        this.shippingDueDate = shippingDueDate;
    }

    /**
     * Getter method for customerPlantCode.
     *
     * @return the customerPlantCode
     */
    public String getCustomerPlantCode() {
        return customerPlantCode;
    }

    /**
     * Setter method for customerPlantCode.
     *
     * @param customerPlantCode Set for customerPlantCode
     */
    public void setCustomerPlantCode(String customerPlantCode) {
        this.customerPlantCode = customerPlantCode;
    }
}
