/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;


/**
 * F070ATTCTL domain of using it by Transfer to GINV Job.
 * <br />船積書類GINV送信ジョブで使用するF070ATTCTLドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13201 $
 */
public class T0400F070AttCtlDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE
     */
    private String shipperCd;

    /**
     * INVOICE NO
     */
    private String invoiceNo;

    /**
     * INVOICE ISSUE DATE
     */
    private String invoiceIssueDt;

    /**
     * DOCUMENT GROUP
     */
    private String docGrp;

    /**
     * DOCUMENT ID
     */
    private String docId;

    /**
     * ZIP ENTRY NAME
     */
    private String zipEntryNm;

    /**
     * ORIGINAL FILE NAME
     */
    private String originalFileNm;

    /**
     * FILE MANAGER FILE ID
     */
    private String fileId;

    /**
     * constructor
     * <br />コンストラクタです。
     *
     */
    public T0400F070AttCtlDomain() {
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
    public String getInvoiceIssueDt() {
        return invoiceIssueDt;
    }

    /**
     * Setter method for invoiceIssueDt.
     *
     * @param invoiceIssueDt Set for invoiceIssueDt
     */
    public void setInvoiceIssueDt(String invoiceIssueDt) {
        this.invoiceIssueDt = invoiceIssueDt;
    }

    /**
     * Getter method for docGrp.
     *
     * @return the docGrp
     */
    public String getDocGrp() {
        return docGrp;
    }

    /**
     * Setter method for docGrp.
     *
     * @param docGrp Set for docGrp
     */
    public void setDocGrp(String docGrp) {
        this.docGrp = docGrp;
    }

    /**
     * Getter method for docId.
     *
     * @return the docId
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Setter method for docId.
     *
     * @param docId Set for docId
     */
    public void setDocId(String docId) {
        this.docId = docId;
    }

    /**
     * Getter method for zipEntryNm.
     *
     * @return the zipEntryNm
     */
    public String getZipEntryNm() {
        return zipEntryNm;
    }

    /**
     * Setter method for zipEntryNm.
     *
     * @param zipEntryNm Set for zipEntryNm
     */
    public void setZipEntryNm(String zipEntryNm) {
        this.zipEntryNm = zipEntryNm;
    }

    /**
     * Getter method for originalFileNm.
     *
     * @return the originalFileNm
     */
    public String getOriginalFileNm() {
        return originalFileNm;
    }

    /**
     * Setter method for originalFileNm.
     *
     * @param originalFileNm Set for originalFileNm
     */
    public void setOriginalFileNm(String originalFileNm) {
        this.originalFileNm = originalFileNm;
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

}
