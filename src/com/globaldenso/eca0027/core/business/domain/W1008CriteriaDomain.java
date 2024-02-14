/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The domain class of search criteria User ID MA Inquiry screen.
 * <br />User ID MA Inquiry画面の検索条件ドメインです。
 *
 * @version $Revision: 7765 $
 */
public class W1008CriteriaDomain extends AbstractDomain {
    
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    /**
     *Rt Page //Issue 096
     */
    private String rtPage;
    /**
     *Description
     */
    private String description;
    /**
     *Previous Pallet  //Issue 072
     */
    private String previousPallet;
    /**
     *Outer Package Code
     */
    private String outerPkgCd;
    /**
     *Length Unit
     */
    private String lengthUnit;
    /**
     *Length
     */
    private String length;
    /**
     *Width
     */
    private String width;
    /**
     *Height
     */
    private String height;
    /**
     *Volume
     */
    private String volume;
    
    /**
     *Net Weight
     */
    private String netWeight;
    /**
     *Main Mark
     */
    private String mainMark;
    /**
     *Item No.
     */
    private String itemNo;
    /**
     *Pallet No.
     */
    private String palletNo;
    /**
     *Kit.
     */
    private String kit;

    /**
     *Shipper.
     */
    private String shipperCd;
    /**
     *Consignee.
     */
    private String consigneeCd;
    /**
     *ShipTo.
     */
    private String shipToCd;
    /**
     *Trans.
     */
    private String trnsCd;
    /**
     *Weight Unit.
     */
    private String weightUnit;
    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;
    /**
     * Request Status
     */
    private String requestStatus;
    /**
     * Original ScreenId
     */
    private String originalScreenId;
    /**
     * Call ScreenId
     */
    private String callScreenId;
    /**
     * pltzInstrNo
     */
    private String pltzInstrNo;
    /**
     * Gross Weight
     */
    private String grossWeight;   
    /**
     * Date format (for screen display) 
     * <br />日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    /**
     * Date format (for document outputs)
     * <br />日付フォーマット (帳票出力用)
     */
    private String reportDateFormat;
    /**
     * SupplierMainMark
     */
    private String  supplierMainMark;
    /**
     *PackingCompCd
     */
    private String  packingCompCd;
    /**
     *PackingWhCd
     */
    private String  packingWhCd;
    /**
     *Message
     */
    private String  msg;
    /**
     *Confirm Msg
     */
    private String  confirmMsgCd;
    /**
     * A confirmation dialog message.<br />
     * 確認ダイアログのメッセージ
     */
    private String confirmMsg = "";
    /**
     *Volume Unit
     */
    private String volumeUnit;
    /**
     *Packing Type
     */
    private String packingType;
    /**
     *Owner Comp
     */
    private String ownerComp;
    /**
     *Length Unit
     */
    private String lengthUnitHeader;
    /**
     * PageInfoCreator object
     * <br />PageInfoCreatorオブジェクト
     */
    private transient PageInfoCreator pageInfoCreator;
    
    
    /**
     * User functional utilization right
     * <br />ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W1008CriteriaDomain() {
    }
    
    /**
     * <p>Getter method for rtPage.</p>
     *
     * @return the rtPage
     */
    public String getRtPage() {
        return rtPage;
    }

    /**
     * <p>Setter method for rtPage.</p>
     *
     * @param rtPage Set for rtPage
     */
    public void setRtPage(String rtPage) {
        this.rtPage = rtPage;
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
     * <p>Getter method for pltzInstrNo.</p>
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * <p>Getter method for previousPallet.</p>
     *
     * @return the previousPallet
     */
    public String getPreviousPallet() {
        return previousPallet;
    }

    /**
     * <p>Setter method for previousPallet.</p>
     *
     * @param previousPallet Set for previousPallet
     */
    public void setPreviousPallet(String previousPallet) {
        this.previousPallet = previousPallet;
    }

    /**
     * <p>Setter method for pltzInstrNo.</p>
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
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
     * <p>Getter method for packingType.</p>
     *
     * @return the packingType
     */
    public String getPackingType() {
        return packingType;
    }

    /**
     * <p>Setter method for packingType.</p>
     *
     * @param packingType Set for packingType
     */
    public void setPackingType(String packingType) {
        this.packingType = packingType;
    }

    /**
     * <p>Getter method for volumeUnit.</p>
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * <p>Setter method for volumeUnit.</p>
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * <p>Getter method for confirmMsg.</p>
     *
     * @return the confirmMsg
     */
    public String getConfirmMsg() {
        return confirmMsg;
    }

    /**
     * <p>Setter method for confirmMsg.</p>
     *
     * @param confirmMsg Set for confirmMsg
     */
    public void setConfirmMsg(String confirmMsg) {
        this.confirmMsg = confirmMsg;
    }

    /**
     * <p>Getter method for msg.</p>
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * <p>Getter method for confirmMsgCd.</p>
     *
     * @return the confirmMsgCd
     */
    public String getConfirmMsgCd() {
        return confirmMsgCd;
    }

    /**
     * <p>Setter method for confirmMsgCd.</p>
     *
     * @param confirmMsgCd Set for confirmMsgCd
     */
    public void setConfirmMsgCd(String confirmMsgCd) {
        this.confirmMsgCd = confirmMsgCd;
    }

    /**
     * <p>Setter method for msg.</p>
     *
     * @param msg Set for msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * <p>Getter method for packingWhCd.</p>
     *
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * <p>Setter method for packingWhCd.</p>
     *
     * @param packingWhCd Set for packingWhCd
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
    }

    

    /**
     * <p>Getter method for packingCompCd.</p>
     *
     * @return the packingCompCd
     */
    public String getPackingCompCd() {
        return packingCompCd;
    }


    /**
     * <p>Setter method for packingCompCd.</p>
     *
     * @param packingCompCd Set for packingCompCd
     */
    public void setPackingCompCd(String packingCompCd) {
        this.packingCompCd = packingCompCd;
    }


    /**
     * <p>Getter method for supplierMainMark.</p>
     *
     * @return the supplierMainMark
     */
    public String getSupplierMainMark() {
        return supplierMainMark;
    }



    /**
     * <p>Setter method for supplierMainMark.</p>
     *
     * @param supplierMainMark Set for supplierMainMark
     */
    public void setSupplierMainMark(String supplierMainMark) {
        this.supplierMainMark = supplierMainMark;
    }



    /**
     * <p>Getter method for requestStatus.</p>
     *
     * @return the requestStatus
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * <p>Setter method for requestStatus.</p>
     *
     * @param requestStatus Set for requestStatus
     */
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * <p>Getter method for expRequestNo.</p>
     *
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * <p>Setter method for expRequestNo.</p>
     *
     * @param expRequestNo Set for expRequestNo
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * <p>Getter method for screenDateFormat.</p>
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * <p>Setter method for screenDateFormat.</p>
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * <p>Setter method for userAuthList.</p>
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

   

    /**
     * <p>Getter method for shipperCd.</p>
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * <p>Setter method for shipperCd.</p>
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * <p>Getter method for consigneeCd.</p>
     *
     * @return the consigneeCd
     */
    public String getConsigneeCd() {
        return consigneeCd;
    }

    /**
     * <p>Setter method for consigneeCd.</p>
     *
     * @param consigneeCd Set for consigneeCd
     */
    public void setConsigneeCd(String consigneeCd) {
        this.consigneeCd = consigneeCd;
    }

    /**
     * <p>Getter method for shipToCd.</p>
     *
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * <p>Setter method for shipToCd.</p>
     *
     * @param shipToCd Set for shipToCd
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * <p>Getter method for trnsCd.</p>
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * <p>Setter method for trnsCd.</p>
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * <p>Getter method for weightUnit.</p>
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * <p>Setter method for weightUnit.</p>
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * <p>Getter method for description.</p>
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>Setter method for description.</p>
     *
     * @param description Set for description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>Getter method for weightUnit.</p>
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * <p>Setter method for itemNo.</p>
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    /**
     * <p>Getter method for kit.</p>
     *
     * @return the kit
     */
    public String getKit() {
        return kit;
    }

    /**
     * <p>Setter method for kit.</p>
     *
     * @param kit Set for kit
     */
    public void setKit(String kit) {
        this.kit = kit;
    }

    /**
     * <p>Getter method for pageInfoCreator.</p>
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * <p>Setter method for pageInfoCreator.</p>
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

    /**
     * <p>Getter method for palletNo.</p>
     *
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * <p>Setter method for palletNo.</p>
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
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
     * <p>Getter method for lengthUnit.</p>
     *
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * <p>Setter method for lengthUnit.</p>
     *
     * @param lengthUnit Set for lengthUnit
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    /**
     * <p>Getter method for length.</p>
     *
     * @return the length
     */
    public String getLength() {
        return length;
    }

    /**
     * <p>Setter method for length.</p>
     *
     * @param length Set for length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * <p>Getter method for width.</p>
     *
     * @return the width
     */
    public String getWidth() {
        return width;
    }

    /**
     * <p>Setter method for width.</p>
     *
     * @param width Set for width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * <p>Getter method for height.</p>
     *
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * <p>Setter method for height.</p>
     *
     * @param height Set for height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * <p>Getter method for volume.</p>
     *
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * <p>Setter method for volume.</p>
     *
     * @param volume Set for volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * <p>Getter method for netWeight.</p>
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * <p>Setter method for netWeight.</p>
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
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
     * <p>Getter method for originalScreenId.</p>
     *
     * @return the originalScreenId
     */
    public String getOriginalScreenId() {
        return originalScreenId;
    }

    /**
     * <p>Setter method for originalScreenId.</p>
     *
     * @param originalScreenId Set for originalScreenId
     */
    public void setOriginalScreenId(String originalScreenId) {
        this.originalScreenId = originalScreenId;
    }

    /**
     * <p>Getter method for callScreenId.</p>
     *
     * @return the callScreenId
     */
    public String getCallScreenId() {
        return callScreenId;
    }

    /**
     * <p>Setter method for callScreenId.</p>
     *
     * @param callScreenId Set for callScreenId
     */
    public void setCallScreenId(String callScreenId) {
        this.callScreenId = callScreenId;
    }

   
    /**
     * <p>Getter method for grossWeight.</p>
     *
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * <p>Setter method for grossWeight.</p>
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /**
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
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
   
}
