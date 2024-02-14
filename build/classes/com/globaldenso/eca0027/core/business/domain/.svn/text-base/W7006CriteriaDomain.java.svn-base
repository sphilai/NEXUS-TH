/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of search condition for the Upload Screen of Shipping Document.<br />
 * <br />船積書類アップロード画面の検索条件ドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11609 $
 */
public class W7006CriteriaDomain extends AbstractDomain {

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
     * Inv. No.
     */
    private String invoiceNo;
    
    /**
     * Invoice date<br />
     * インボイス発行日
     */
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD
    //private String invoiceIssueDt;
    private Date invoiceIssueDt;
    
    /**
     * Status
     */
    private String shippingActStatus;

    /**
     * C / O UPLOAD FILE DATA.
     */
    private InputStream uploadCoFileData;
    
    /**
     * C / O UPLOAD FILE NAME.
     */
    private String uploadCoFileName;
    
    /**
     * C / O UPLOAD FILE SIZE.
     */
    private int uploadCoFileSize;
    
    /**
     * C / O (file name)<br />
     * C/O（ファイル名）
     */
    private String coFileName;
    
    /**
     * Non Wooden UPLOAD FILE DATA.
     */
    private InputStream uploadNonWdFileData;
    
    /**
     * Non Wooden UPLOAD FILE NAME.
     */
    private String uploadNonWdFileName;
    
    /**
     * Non Wooden UPLOAD FILE SIZE.
     */
    private int uploadNonWdFileSize;
    
    /**
     * Non Wooden (file name)<br />
     * Non Wooden（ファイル名）
     */
    private String nonWdFileName;
    
    /**
     * Selected row<br />
     * 選択している行
     */
    private int selectedRow;
    
    /**
     * Shipping Actuality No
     */
    private String shippingActNo;
    
    /**
     * Last Modified (Invoice)<br />
     * 最終更新日時（Invoice）
     */
    private Timestamp comUpdateTimestampInvoice;
    
    /**
     * File ID to be updated<br />
     * 更新を行うファイルID
     */
    private String fileId;
    
    /**
     * Last Modified (file)<br />
     * 最終更新日時（ファイル）
     */
    private Timestamp comUpdateTimestampFile;
    
    /**
     * Acquired data to be displayed in the View<br />
     * Viewで表示する取得データ
     */
    private OutputStream viewData;
    
    /**
     * Date format (screen display)<br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * CONTAINER LOOSE TYPE.<br />
     * コンテナルーズ区分(C/L)
     */
    private String containerLooseTyp;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W7006CriteriaDomain() {
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
     * Getter method for invoiceNo.
     *
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Setter method for invoiceNo.
     *
     * @param invoiceNo Set for invoiceNo
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Getter method for invoiceIssueDt.
     *
     * @return the invoiceIssueDt
     */
    public Date getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * Setter method for invoiceIssueDt.
     *
     * @param invoiceIssueDt Set for invoiceIssueDt
     */
    public void setInvoiceIssueDt(Date invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
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
     * Getter method for uploadCoFileData.
     *
     * @return the uploadCoFileData
     */
    public InputStream getUploadCoFileData() {
        return uploadCoFileData;
    }

    /**
     * Setter method for uploadCoFileData.
     *
     * @param uploadCoFileData Set for uploadCoFileData
     */
    public void setUploadCoFileData(InputStream uploadCoFileData) {
        this.uploadCoFileData = uploadCoFileData;
    }

    /**
     * Getter method for uploadCoFileName.
     *
     * @return the uploadCoFileName
     */
    public String getUploadCoFileName() {
        return uploadCoFileName;
    }

    /**
     * Setter method for uploadCoFileName.
     *
     * @param uploadCoFileName Set for uploadCoFileName
     */
    public void setUploadCoFileName(String uploadCoFileName) {
        this.uploadCoFileName = uploadCoFileName;
    }

    /**
     * Getter method for uploadCoFileSize.
     *
     * @return the uploadCoFileSize
     */
    public int getUploadCoFileSize() {
        return uploadCoFileSize;
    }

    /**
     * Setter method for uploadCoFileSize.
     *
     * @param uploadCoFileSize Set for uploadCoFileSize
     */
    public void setUploadCoFileSize(int uploadCoFileSize) {
        this.uploadCoFileSize = uploadCoFileSize;
    }

    /**
     * Getter method for coFileName.
     *
     * @return the coFileName
     */
    public String getCoFileName() {
        return coFileName;
    }

    /**
     * Setter method for coFileName.
     *
     * @param coFileName Set for coFileName
     */
    public void setCoFileName(String coFileName) {
        this.coFileName = coFileName;
    }
    
    /**
     * Getter method for uploadNonWdFileData.
     *
     * @return the uploadNonWdFileData
     */
    public InputStream getUploadNonWdFileData() {
        return uploadNonWdFileData;
    }

    /**
     * Setter method for uploadNonWdFileData.
     *
     * @param uploadNonWdFileData Set for uploadNonWdFileData
     */
    public void setUploadNonWdFileData(InputStream uploadNonWdFileData) {
        this.uploadNonWdFileData = uploadNonWdFileData;
    }

    /**
     * Getter method for uploadNonWdFileName.
     *
     * @return the uploadNonWdFileName
     */
    public String getUploadNonWdFileName() {
        return uploadNonWdFileName;
    }

    /**
     * Setter method for uploadNonWdFileName.
     *
     * @param uploadNonWdFileName Set for uploadNonWdFileName
     */
    public void setUploadNonWdFileName(String uploadNonWdFileName) {
        this.uploadNonWdFileName = uploadNonWdFileName;
    }

    /**
     * Getter method for uploadNonWdFileSize.
     *
     * @return the uploadNonWdFileSize
     */
    public int getUploadNonWdFileSize() {
        return uploadNonWdFileSize;
    }

    /**
     * Setter method for uploadNonWdFileSize.
     *
     * @param uploadNonWdFileSize Set for uploadNonWdFileSize
     */
    public void setUploadNonWdFileSize(int uploadNonWdFileSize) {
        this.uploadNonWdFileSize = uploadNonWdFileSize;
    }

    /**
     * Getter method for nonWdFileName.
     *
     * @return the nonWdFileName
     */
    public String getNonWdFileName() {
        return nonWdFileName;
    }

    /**
     * Setter method for nonWdFileName.
     *
     * @param nonWdFileName Set for nonWdFileName
     */
    public void setNonWdFileName(String nonWdFileName) {
        this.nonWdFileName = nonWdFileName;
    }

    /**
     * Getter method for selectedRow.
     *
     * @return the selectedRow
     */
    public int getSelectedRow() {
        return selectedRow;
    }

    /**
     * Setter method for selectedRow.
     *
     * @param selectedRow Set for selectedRow
     */
    public void setSelectedRow(int selectedRow) {
        this.selectedRow = selectedRow;
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
     * Getter method for comUpdateTimestampInvoice.
     *
     * @return the comUpdateTimestampInvoice
     */
    public Timestamp getComUpdateTimestampInvoice() {
        return comUpdateTimestampInvoice;
    }

    /**
     * Setter method for comUpdateTimestampInvoice.
     *
     * @param comUpdateTimestampInvoice Set for comUpdateTimestampInvoice
     */
    public void setComUpdateTimestampInvoice(Timestamp comUpdateTimestampInvoice) {
        this.comUpdateTimestampInvoice = comUpdateTimestampInvoice;
    }

    /**
     * Getter method for fileId.
     *
     * @return the fileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Setter method for fileId.
     *
     * @param fileId Set for fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * Getter method for comUpdateTimestampFile.
     *
     * @return the comUpdateTimestampFile
     */
    public Timestamp getComUpdateTimestampFile() {
        return comUpdateTimestampFile;
    }

    /**
     * Setter method for comUpdateTimestampFile.
     *
     * @param comUpdateTimestampFile Set for comUpdateTimestampFile
     */
    public void setComUpdateTimestampFile(Timestamp comUpdateTimestampFile) {
        this.comUpdateTimestampFile = comUpdateTimestampFile;
    }

    /**
     * Getter method for viewData.
     *
     * @return the viewData
     */
    public OutputStream getViewData() {
        return viewData;
    }

    /**
     * Setter method for viewData.
     *
     * @param viewData Set for viewData
     */
    public void setViewData(OutputStream viewData) {
        this.viewData = viewData;
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
     * <p>containerLooseTyp のゲッターメソッドです。</p>
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * <p>containerLooseTyp のセッターメソッドです。</p>
     *
     * @param containerLooseTyp containerLooseTyp に設定する
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }
    
}
