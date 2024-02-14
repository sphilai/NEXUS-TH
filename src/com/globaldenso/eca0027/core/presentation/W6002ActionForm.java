/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.presentation;

import java.util.Date;

import org.apache.struts.upload.FormFile;

import com.globaldenso.eca0027.core.business.domain.W6002CriteriaDomain;
import com.globaldenso.gscm.framework.presentation.AbstractActionForm;

/**
 * Form of action Documentation Manual Invoice Upload screen.
 * <br />通関書類作成業務 Manual Invoice Upload画面のアクション・フォームです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 11674 $
 */
public class W6002ActionForm extends AbstractActionForm  {
    /**
     * serial version ID.<br />
     * シリアルバージョンID。
     */
    private static final long serialVersionUID = 1L;

    /**
     * W6002 search criteria domain<br />
     * W6002検索条件ドメイン
     */
    private W6002CriteriaDomain w6002CriteriaDomain;
    
    /**
     * Function No
     */
    private String functionNo;

    /**
     * Shipper CD / 荷主コード
     */
    private String takeOverShipperCd;
    
    /**
     * PARENT INVOICE NO/親_インボイスNO
     */
    //private String parInvoiceNo; // ST946 MANUAL SCREEN TRANSITION DEL

    /**
     * INVOICE No / インボイスNo
     */
    private String takeOverInvoiceNo;

    /**
     * Issue Date
     */
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD
    // There is no meaning the value of the new Date(). It is for exception of Date(null) -> Date avoided in Beanutils.copyProperties().
    // new Date()の値に意味はない。Beanutils.copyProperties()でのDate(null)→Date例外回避のため。
    //private String invoiceIssueDt;
    private Date takeOverInvoiceIssueDt = new Date();

    /**
     * FRT Contain Flg
     */
    private String frtContainFlg;
    
    /**
     * Sort of invoice<br/>インボイス表示順
     */
    //private String sortInvoice; // ST946 MANUAL SCREEN TRANSITION DEL
    
    /**
     * upload form file(for Invoice PDF)
     */
    private FormFile invoicePdfFile;
    
    /**
     * upload foem file (for Packing List PDF)
     */
    private FormFile packingListPdfFile;
    
    // ST946 MANUAL SCREEN TRANSITION ADD START
    //
    // key of main invoice
    // 
    // Key of top-level invoice which has been selected in the main screen.
    // It uses the search, registration, as TT_INVOICE.PAR_... .
    // It is saved as a screen information stack in the transition of the W6002.
    // 
    // メイン画面で選択されたトップレベルのインボイスのキー。
    // TT_INVOICE.PAR_...として検索、登録に使用する。
    // W6002内の遷移では画面情報スタックとして持ち回る。
    // 
    /** main invoice key No.1 */
    private String takeOverParInvoiceShipperCd;
    /** main invoice key No.2 */
    private String takeOverParInvoiceNo;
    /** main invoice key No.3 */
    private Date takeOverParInvoiceIssueDt = new Date(); // dummy value. cause copyProperties can't copy null Date
    // ST946 MANUAL SCREEN TRANSITION ADD END

    /**
     * The default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W6002ActionForm() {
        w6002CriteriaDomain = new W6002CriteriaDomain();
    }

    /**
     * Getter method for w6002CriteriaDomain.
     *
     * @return the w6002CriteriaDomain
     */
    public W6002CriteriaDomain getW6002CriteriaDomain() {
        return w6002CriteriaDomain;
    }

    /**
     * Setter method for w6002CriteriaDomain.
     *
     * @param criteriaDomain Set for w6002CriteriaDomain
     */
    public void setW6002CriteriaDomain(W6002CriteriaDomain criteriaDomain) {
        w6002CriteriaDomain = criteriaDomain;
    }

    /**
     * Getter method for functionNo.
     *
     * @return the functionNo
     */
    public String getFunctionNo() {
        return functionNo;
    }

    /**
     * Setter method for functionNo.
     *
     * @param functionNo Set for functionNo
     */
    public void setFunctionNo(String functionNo) {
        this.functionNo = functionNo;
    }

    /**
     * Getter method for takeOverShipperCd.
     *
     * @return the takeOverShipperCd
     */
    public String getTakeOverShipperCd() {
        return takeOverShipperCd;
    }

    /**
     * Setter method for takeOverShipperCd.
     *
     * @param takeOverShipperCd Set for takeOverShipperCd
     */
    public void setTakeOverShipperCd(String takeOverShipperCd) {
        this.takeOverShipperCd = takeOverShipperCd;
    }

    /**
     * Getter method for takeOverInvoiceNo.
     *
     * @return the takeOverInvoiceNo
     */
    public String getTakeOverInvoiceNo() {
        return takeOverInvoiceNo;
    }

    /**
     * Setter method for takeOverInvoiceNo.
     *
     * @param takeOverInvoiceNo Set for takeOverInvoiceNo
     */
    public void setTakeOverInvoiceNo(String takeOverInvoiceNo) {
        this.takeOverInvoiceNo = takeOverInvoiceNo;
    }

    /**
     * Getter method for takeOverInvoiceIssueDt.
     *
     * @return the takeOverInvoiceIssueDt
     */
    public Date getTakeOverInvoiceIssueDt() {
        return takeOverInvoiceIssueDt;
    }

    /**
     * Setter method for takeOverInvoiceIssueDt.
     *
     * @param takeOverInvoiceIssueDt Set for takeOverInvoiceIssueDt
     */
    public void setTakeOverInvoiceIssueDt(Date takeOverInvoiceIssueDt) {
        this.takeOverInvoiceIssueDt = takeOverInvoiceIssueDt;
    }

    /**
     * Getter method for frtContainFlg.
     *
     * @return the frtContainFlg
     */
    public String getFrtContainFlg() {
        return frtContainFlg;
    }

    /**
     * Setter method for frtContainFlg.
     *
     * @param frtContainFlg Set for frtContainFlg
     */
    public void setFrtContainFlg(String frtContainFlg) {
        this.frtContainFlg = frtContainFlg;
    }

    /**
     * Getter method for invoicePdfFile.
     *
     * @return the invoicePdfFile
     */
    public FormFile getInvoicePdfFile() {
        return invoicePdfFile;
    }

    /**
     * Setter method for invoicePdfFile.
     *
     * @param invoicePdfFile Set for invoicePdfFile
     */
    public void setInvoicePdfFile(FormFile invoicePdfFile) {
        this.invoicePdfFile = invoicePdfFile;
    }

    /**
     * Getter method for packingListPdfFile.
     *
     * @return the packingListPdfFile
     */
    public FormFile getPackingListPdfFile() {
        return packingListPdfFile;
    }

    /**
     * Setter method for packingListPdfFile.
     *
     * @param packingListPdfFile Set for packingListPdfFile
     */
    public void setPackingListPdfFile(FormFile packingListPdfFile) {
        this.packingListPdfFile = packingListPdfFile;
    }

    /**
     * Getter method for takeOverParInvoiceShipperCd.
     *
     * @return the takeOverParInvoiceShipperCd
     */
    public String getTakeOverParInvoiceShipperCd() {
        return takeOverParInvoiceShipperCd;
    }

    /**
     * Setter method for takeOverParInvoiceShipperCd.
     *
     * @param takeOverParInvoiceShipperCd Set for takeOverParInvoiceShipperCd
     */
    public void setTakeOverParInvoiceShipperCd(String takeOverParInvoiceShipperCd) {
        this.takeOverParInvoiceShipperCd = takeOverParInvoiceShipperCd;
    }

    /**
     * Getter method for takeOverParInvoiceNo.
     *
     * @return the takeOverParInvoiceNo
     */
    public String getTakeOverParInvoiceNo() {
        return takeOverParInvoiceNo;
    }

    /**
     * Setter method for takeOverParInvoiceNo.
     *
     * @param takeOverParInvoiceNo Set for takeOverParInvoiceNo
     */
    public void setTakeOverParInvoiceNo(String takeOverParInvoiceNo) {
        this.takeOverParInvoiceNo = takeOverParInvoiceNo;
    }

    /**
     * Getter method for takeOverParInvoiceIssueDt.
     *
     * @return the takeOverParInvoiceIssueDt
     */
    public Date getTakeOverParInvoiceIssueDt() {
        return takeOverParInvoiceIssueDt;
    }

    /**
     * Setter method for takeOverParInvoiceIssueDt.
     *
     * @param takeOverParInvoiceIssueDt Set for takeOverParInvoiceIssueDt
     */
    public void setTakeOverParInvoiceIssueDt(Date takeOverParInvoiceIssueDt) {
        this.takeOverParInvoiceIssueDt = takeOverParInvoiceIssueDt;
    }
}
