/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.OutputStream;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of search condition for the Resister Screen of Shipping Actuality.
 * <br />船積実績Resister画面の検索条件ドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13885 $
 */
public class W7004CriteriaDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Shipper
     */
    private String shipperCd;
    
    /**
     * Consignee
     */
    private String consigneeCd;
    
    /**
     * NEXUS Ship to Com.
     */
    private String shipToCompCd;
    
    /**
     * Trans.
     */
    private String trnsCd;

    /**
     * No. of Inv.
     */
    private String noOfInvoice;
    
    /**
     * No. of Cont.
     */
    private String noOfContainer;
    
    /**
     * PKG_QTY
     */
    private String pkgQty;
    
    /**
     * Status
     */
    private String shippingActStatus;
    
    /**
     * F/R
     */
    private String freightResponsibleCd;
    
    /**
     * Auto Invoice Register<br />
     * インボイス自動作成フラグ
     */
    private String autoInvoiceRegisterFlg;
    
    /**
     * B/L Update
     */
    private String billdUpdate;
    
    /**
     * Registere Date
     */
    private String registerDt;

    /**
     * ATD
     */
    private String atd;
    
    /**
     * ETA
     */
    private String eta;
    
    /**
     * Carrier
     */
    private String carrierCompCd;
    
    /**
     * Vessel
     */
    private String vessel;
    
    /**
     * B/L No
     */
    private String billdNo;
    
    /**
     * C/L
     */
    private String containerLooseTyp;

    /**
     * Shipping Actuality No
     */
    private String shippingActNo;
    
    /**
     * Processing mode<br />
     * 処理モード
     */
    private String procMode;
    
    /**
     * A confirmation dialog<br />
     * 確認ダイアログのメッセージ
     */
    private String confirmMsg = "";
    
    /**
     * the process continuation flag(If the value in flag is 'y', process will be continue).<br />
     * 処理継続フラグ("Y"の時、継続して処理を行う)
     */
    private String continueFlag;
    
    /**
     * Data file (download data)<br />
     * ファイルデータ（ダウンロードデータ）
     */
    private OutputStream fileData;
    
    /**
     * Invalid flag (Print CLP button)<br />
     * 無効フラグ（Print CLPボタン）
     */
    private String disabledFlgForPrintClp;
    
    /**
     * Invalid flag (Move To Other Doc Upload button)<br />
     * 無効フラグ（Move To Other Doc Upload ボタン）
     */
    private String disabledFlgForMoveToOtherDocUpload;
    
    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;

    /**
     * Selected row<br />
     * 選択行
     */
    private String selectedRow;
    
    /**
     * Lock flag 
     * <br />Set the case 'Y', which can obtain the lock of goods for shipment record order information.
     * <br />ロックフラグ
     * <br />船積実績対象品受注情報のロックが取得できた場合'Y'を設定します。
     */
    private String lockFlagForOdr;

    /**
     * CIGMA EDI status.
     * 
     * 20170314 ADD
     * 
     * It is used to inherit information of CIGMA searched by check.
     * チェックで検索したCIGMAの情報の引き継ぎに使用する。
     */
    private String cigmaEdiStatus;

    /**
     * Invocation screen id<br />
     * 呼び元画面ID。
     */
    private String callScreenId;
    
    /**
     * Transition source screen ID (screen display control)<br />
     * 遷移元画面ID (画面表示制御用)
     */
    private String originalScreenId;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7004CriteriaDomain() {
        super();
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
     * Getter method for shipToCompCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * Setter method for shipToCompCd.
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
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
     * Getter method for noOfInvoice.
     *
     * @return the noOfInvoice
     */
    public String getNoOfInvoice() {
        return noOfInvoice;
    }

    /**
     * Setter method for noOfInvoice.
     *
     * @param noOfInvoice Set for noOfInvoice
     */
    public void setNoOfInvoice(String noOfInvoice) {
        this.noOfInvoice = noOfInvoice;
    }

    /**
     * Getter method for noOfContainer.
     *
     * @return the noOfContainer
     */
    public String getNoOfContainer() {
        return noOfContainer;
    }

    /**
     * Setter method for noOfContainer.
     *
     * @param noOfContainer Set for noOfContainer
     */
    public void setNoOfContainer(String noOfContainer) {
        this.noOfContainer = noOfContainer;
    }

    /**
     * Getter method for pkgQty.
     *
     * @return the pkgQty
     */
    public String getPkgQty() {
        return pkgQty;
    }

    /**
     * Setter method for pkgQty.
     *
     * @param pkgQty Set for pkgQty
     */
    public void setPkgQty(String pkgQty) {
        this.pkgQty = pkgQty;
    }

    /**
     * Getter method for shippingActStatus.
     *
     * @return the shippingActStatus
     */
    public String getShippingActStatus() {
        return shippingActStatus;
    }

    /**
     * Setter method for shippingActStatus.
     *
     * @param shippingActStatus Set for shippingActStatus
     */
    public void setShippingActStatus(String shippingActStatus) {
        this.shippingActStatus = shippingActStatus;
    }

    /**
     * Getter method for freightResponsibleCd.
     *
     * @return the freightResponsibleCd
     */
    public String getFreightResponsibleCd() {
        return freightResponsibleCd;
    }

    /**
     * Setter method for freightResponsibleCd.
     *
     * @param freightResponsibleCd Set for freightResponsibleCd
     */
    public void setFreightResponsibleCd(String freightResponsibleCd) {
        this.freightResponsibleCd = freightResponsibleCd;
    }

    /**
     * Getter method for autoInvoiceRegisterFlg.
     *
     * @return the autoInvoiceRegisterFlg
     */
    public String getAutoInvoiceRegisterFlg() {
        return autoInvoiceRegisterFlg;
    }

    /**
     * Setter method for autoInvoiceRegisterFlg.
     *
     * @param autoInvoiceRegisterFlg Set for autoInvoiceRegisterFlg
     */
    public void setAutoInvoiceRegisterFlg(String autoInvoiceRegisterFlg) {
        this.autoInvoiceRegisterFlg = autoInvoiceRegisterFlg;
    }

    /**
     * Getter method for billdUpdate.
     *
     * @return the billdUpdate
     */
    public String getBilldUpdate() {
        return billdUpdate;
    }

    /**
     * Setter method for billdUpdate.
     *
     * @param billdUpdate Set for billdUpdate
     */
    public void setBilldUpdate(String billdUpdate) {
        this.billdUpdate = billdUpdate;
    }

    /**
     * Getter method for registerDt.
     *
     * @return the registerDt
     */
    public String getRegisterDt() {
        return registerDt;
    }

    /**
     * Setter method for registerDt.
     *
     * @param registerDt Set for registerDt
     */
    public void setRegisterDt(String registerDt) {
        this.registerDt = registerDt;
    }

    /**
     * Getter method for atd.
     *
     * @return the atd
     */
    public String getAtd() {
        return atd;
    }

    /**
     * Setter method for atd.
     *
     * @param atd Set for atd
     */
    public void setAtd(String atd) {
        this.atd = atd;
    }

    /**
     * Getter method for eta.
     *
     * @return the eta
     */
    public String getEta() {
        return eta;
    }

    /**
     * Setter method for eta.
     *
     * @param eta Set for eta
     */
    public void setEta(String eta) {
        this.eta = eta;
    }

    /**
     * Getter method for carrierCompCd.
     *
     * @return the carrierCompCd
     */
    public String getCarrierCompCd() {
        return carrierCompCd;
    }

    /**
     * Setter method for carrierCompCd.
     *
     * @param carrierCompCd Set for carrierCompCd
     */
    public void setCarrierCompCd(String carrierCompCd) {
        this.carrierCompCd = carrierCompCd;
    }

    /**
     * Getter method for vessel.
     *
     * @return the vessel
     */
    public String getVessel() {
        return vessel;
    }

    /**
     * Setter method for vessel.
     *
     * @param vessel Set for vessel
     */
    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    /**
     * Getter method for billdNo.
     *
     * @return the billdNo
     */
    public String getBilldNo() {
        return billdNo;
    }

    /**
     * Setter method for billdNo.
     *
     * @param billdNo Set for billdNo
     */
    public void setBilldNo(String billdNo) {
        this.billdNo = billdNo;
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
     * Getter method for shippingActNo.
     *
     * @return the shippingActNo
     */
    public String getShippingActNo() {
        return shippingActNo;
    }

    /**
     * Setter method for shippingActNo.
     *
     * @param shippingActNo Set for shippingActNo
     */
    public void setShippingActNo(String shippingActNo) {
        this.shippingActNo = shippingActNo;
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
     * Getter method for confirmMsg.
     *
     * @return the confirmMsg
     */
    public String getConfirmMsg() {
        return confirmMsg;
    }

    /**
     * Setter method for confirmMsg.
     *
     * @param confirmMsg Set for confirmMsg
     */
    public void setConfirmMsg(String confirmMsg) {
        this.confirmMsg = confirmMsg;
    }

    /**
     * Getter method for continueFlag.
     *
     * @return the continueFlag
     */
    public String getContinueFlag() {
        return continueFlag;
    }

    /**
     * Setter method for continueFlag.
     *
     * @param continueFlag Set for continueFlag
     */
    public void setContinueFlag(String continueFlag) {
        this.continueFlag = continueFlag;
    }

    /**
     * Getter method for fileData.
     *
     * @return the fileData
     */
    public OutputStream getFileData() {
        return fileData;
    }

    /**
     * Setter method for fileData.
     *
     * @param fileData Set for fileData
     */
    public void setFileData(OutputStream fileData) {
        this.fileData = fileData;
    }

    /**
     * Getter method for disabledFlgForPrintClp.
     *
     * @return the disabledFlgForPrintClp
     */
    public String getDisabledFlgForPrintClp() {
        return disabledFlgForPrintClp;
    }

    /**
     * Setter method for disabledFlgForPrintClp.
     *
     * @param disabledFlgForPrintClp Set for disabledFlgForPrintClp
     */
    public void setDisabledFlgForPrintClp(String disabledFlgForPrintClp) {
        this.disabledFlgForPrintClp = disabledFlgForPrintClp;
    }

    /**
     * Getter method for disabledFlgForMoveToOtherDocUpload.
     *
     * @return the disabledFlgForMoveToOtherDocUpload
     */
    public String getDisabledFlgForMoveToOtherDocUpload() {
        return disabledFlgForMoveToOtherDocUpload;
    }

    /**
     * Setter method for disabledFlgForMoveToOtherDocUpload.
     *
     * @param disabledFlgForMoveToOtherDocUpload Set for disabledFlgForMoveToOtherDocUpload
     */
    public void setDisabledFlgForMoveToOtherDocUpload(
        String disabledFlgForMoveToOtherDocUpload) {
        this.disabledFlgForMoveToOtherDocUpload = disabledFlgForMoveToOtherDocUpload;
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
     * Getter method for selectedRow.
     *
     * @return the selectedRow
     */
    public String getSelectedRow() {
        return selectedRow;
    }

    /**
     * Setter method for selectedRow.
     *
     * @param selectedRow Set for selectedRow
     */
    public void setSelectedRow(String selectedRow) {
        this.selectedRow = selectedRow;
    }

    /**
     * Getter method for lockFlagForOdr.
     *
     * @return the lockFlagForOdr
     */
    public String getLockFlagForOdr() {
        return lockFlagForOdr;
    }

    /**
     * Setter method for lockFlagForOdr.
     *
     * @param lockFlagForOdr Set for lockFlagForOdr
     */
    public void setLockFlagForOdr(String lockFlagForOdr) {
        this.lockFlagForOdr = lockFlagForOdr;
    }

    /**
     * Getter method for cigmaEdiStatus.
     *
     * @return the cigmaEdiStatus
     */
    public String getCigmaEdiStatus() {
        return cigmaEdiStatus;
    }

    /**
     * Setter method for cigmaEdiStatus.
     *
     * @param cigmaEdiStatus Set for cigmaEdiStatus
     */
    public void setCigmaEdiStatus(String cigmaEdiStatus) {
        this.cigmaEdiStatus = cigmaEdiStatus;
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
}
