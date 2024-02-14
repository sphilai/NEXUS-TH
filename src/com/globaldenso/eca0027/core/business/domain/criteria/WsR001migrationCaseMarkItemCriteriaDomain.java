/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * This is a parameter domain of ECA0027_WS_R001.
 * <br />ECA0027_WS_R001のパラメータドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11753 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class WsR001migrationCaseMarkItemCriteriaDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * MAIN MARK
     * <br />メインマーク
     */
    private String mainMark;
    
    /**
     * PALLENT NO
     * <br />パレットNo.
     */
    private String palletNo;
    
    /**
     * CUSTOMER NO
     * <br />得意先No.
     */
    private String customerNo;
    
    /**
     * SHIP TO
     * <br />送荷先No
     */
    private String shipTo;
    
    /**
     * TRNS WAY CD
     * <br />輸送手段コード
     */
    private String trnsWayCd;
    
    /**
     * PLANT CD
     * <br />工場コード
     */
    private String plantCd;
    
    /**
     * WH CD
     * <br />倉庫コード
     */
    private String whCd;
    
    /**
     * MULTI PART NO FLG
     * <br />多品番フラグ
     */
    private String multiPartNoFlg;
    
    /**
     * NET WEIGHT
     * <br />NET重量
     */
    private String netWeight;
    
    /**
     * GROSS WEIGHT
     * <br />Gross重量
     */
    private String grossWeight;
    
    /**
     * VOLUME
     * <br />容積
     */
    private String volume;
    
    /**
     * CONTAINER GROUP CD
     * <br />コンテナグルーピングコード
     */
    private String containerGroupCd;
    
    /**
     * OUTPUT PRINTER ID
     * <br />出力プリンターID
     * 
     * ST958 ADD
     */
    private String printerId;
    
    /**
     * CASE MARK ITEM LIST
     * <br />ケースマーク明細ヘッダリスト
     */
    @XmlElementWrapper(name = "migrationCaseMarkDetailItemList")
    @XmlElement(name = "migrationCaseMarkDetailItem")
    private List<? extends WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsR001migrationCaseMarkItemCriteriaDomain() {
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
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
     * Setter method for palletNo.
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * Getter method for customerNo.
     *
     * @return the customerNo
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * Setter method for customerNo.
     *
     * @param customerNo Set for customerNo
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    /**
     * Getter method for shipTo.
     *
     * @return the shipTo
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * Setter method for shipTo.
     *
     * @param shipTo Set for shipTo
     */
    public void setShipTo(String shipTo) {
        this.shipTo = shipTo;
    }

    /**
     * Getter method for trnsWayCd.
     *
     * @return the trnsWayCd
     */
    public String getTrnsWayCd() {
        return trnsWayCd;
    }

    /**
     * Setter method for trnsWayCd.
     *
     * @param trnsWayCd Set for trnsWayCd
     */
    public void setTrnsWayCd(String trnsWayCd) {
        this.trnsWayCd = trnsWayCd;
    }

    /**
     * Getter method for plantCd.
     *
     * @return the plantCd
     */
    public String getPlantCd() {
        return plantCd;
    }

    /**
     * Setter method for plantCd.
     *
     * @param plantCd Set for plantCd
     */
    public void setPlantCd(String plantCd) {
        this.plantCd = plantCd;
    }

    /**
     * Getter method for whCd.
     *
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * Setter method for whCd.
     *
     * @param whCd Set for whCd
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * Getter method for multiPartNoFlg.
     *
     * @return the multiPartNoFlg
     */
    public String getMultiPartNoFlg() {
        return multiPartNoFlg;
    }

    /**
     * Setter method for multiPartNoFlg.
     *
     * @param multiPartNoFlg Set for multiPartNoFlg
     */
    public void setMultiPartNoFlg(String multiPartNoFlg) {
        this.multiPartNoFlg = multiPartNoFlg;
    }

    /**
     * Getter method for netWeight.
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * Setter method for netWeight.
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * Getter method for grossWeight.
     *
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter method for grossWeight.
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter method for volume.
     *
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Setter method for volume.
     *
     * @param volume Set for volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * Getter method for containerGroupCd.
     *
     * @return the containerGroupCd
     */
    public String getContainerGroupCd() {
        return containerGroupCd;
    }

    /**
     * Setter method for containerGroupCd.
     *
     * @param containerGroupCd Set for containerGroupCd
     */
    public void setContainerGroupCd(String containerGroupCd) {
        this.containerGroupCd = containerGroupCd;
    }

    /**
     * Getter method for printerId.
     *
     * @return the printerId
     */
    public String getPrinterId() {
        return printerId;
    }

    /**
     * Setter method for printerId.
     *
     * @param printerId Set for printerId
     */
    public void setPrinterId(String printerId) {
        this.printerId = printerId;
    }

    /**
     * Getter method for migrationCaseMarkDetailItemList.
     *
     * @return the migrationCaseMarkDetailItemList
     */
    public List<? extends WsR001migrationCaseMarkDetailItemCriteriaDomain> getMigrationCaseMarkDetailItemList() {
        return migrationCaseMarkDetailItemList;
    }

    /**
     * Setter method for migrationCaseMarkDetailItemList.
     *
     * @param migrationCaseMarkDetailItemList Set for migrationCaseMarkDetailItemList
     */
    public void setMigrationCaseMarkDetailItemList(
        List<? extends WsR001migrationCaseMarkDetailItemCriteriaDomain> migrationCaseMarkDetailItemList) {
        this.migrationCaseMarkDetailItemList = migrationCaseMarkDetailItemList;
    }

}
