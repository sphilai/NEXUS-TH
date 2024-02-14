/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;
import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of list that holds the information of Export Ship to Shipping MA screen.
 * <br />Export Ship to Shipping MA画面の情報を保持するリストドメインです。
 *
 * @version $Revision: 15229 $
 */
public class W9007ExpShipToShippingMaItemDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * COMPANY CODE<br />
     * 会社コード
     */
    private String compCd;

    /**
     * SHIP TO CODE<br />
     * 送荷先コード
     */
    private String shipToCd;

    /**
     * APPLY START DATE<br />
     * 適用開始日
     */
    private Date aplyStrtDt;

    /**
     * Cml Typ
     */
    private String cmlTyp;

    /**
     * Invoice Ctgry
     */
    private String invoiceCtgry;

    /**
     * Invoice Class
     */
    private String invoiceClass;

    /**
     * Invoice Class Name
     */
    private String invoiceClassNm;
    
    /**
     * CONTAINER SORTING KEY<br />
     * コンテナ層別キー
     */
    private String containerSortingKey;

    /**
     * LOADING CODE<br />
     * 荷積位置コード
     */
    private String loadingCd;

    /**
     * LABEL PRINT NUM<br />
     * ラベル発行枚数
     */
    private String labelPrintNum;

    /**
     * CUSTOM TIMING TYPE<br />
     * 通関タイミング区分
     */
    private String containerLooseTyp;

    /**
     * PACKING SUMMARY ATTACH FLAG<br />
     * PACKING SUMMARY添付フラグ。
     * NL023 ADD
     */
    private String packingSummaryAtchFlg;
    
    /**
     * SINGLE PLTZ QR FLG/SINGLE PLETIZE QR FLG<br />
     * SINGLE PLTZ QR FLG/単品パレタイズQRフラグ
     * NL047 ADD
     */
    private String singlePltzQrFlg;

    /**
     * UPDATE TIMESTAMP<br />
     * 更新日時
     */
    private Timestamp comUpdateTimestamp;

    /**
     * DOC NO<br />
     * ドキュメント番号
     */
    private String docNo;

    /**
     * FREE 1 DISPLAY FLAG<br />
     * フリー1表示フラグ
     */
    private String free1DispFlg;

    /**
     * FREE 2 DISPLAY FLAG<br />
     * フリー2表示フラグ
     */
    private String free2DispFlg;

    /**
     * FREE 3 DISPLAY FLAG<br />
     * フリー3表示フラグ
     */
    private String free3DispFlg;

    /**
     * HS CODE DISPLAY FLAG<br />
     * HSコード表示フラグ
     */
    private String hsCdDispFlg;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007ExpShipToShippingMaItemDomain() {
    }

    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
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
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for labelPrintNum.
     *
     * @return the labelPrintNum
     */
    public String getLabelPrintNum() {
        return labelPrintNum;
    }

    /**
     * Setter method for labelPrintNum.
     *
     * @param labelPrintNum Set for labelPrintNum
     */
    public void setLabelPrintNum(String labelPrintNum) {
        this.labelPrintNum = labelPrintNum;
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
     * Getter method of packingSummaryAtchFlg.
     *
     * @return the packingSummaryAtchFlg.
     */
    public String getPackingSummaryAtchFlg() {
        return packingSummaryAtchFlg;
    }

    /**
     * Setter method of packingSummaryAtchFlg.
     *
     * @param packingSummaryAtchFlg Value to be stored in packingSummaryAtchFlg.
     */
    public void setPackingSummaryAtchFlg(String packingSummaryAtchFlg) {
        this.packingSummaryAtchFlg = packingSummaryAtchFlg;
    }

    /**
     * Getter method of singlePltzQrFlg.
     * 
     * @return the singlePltzQrFlg.
     */
    public String getSinglePltzQrFlg() {
        return singlePltzQrFlg;
    }
    
    /**
     * Setter method of singlePltzQrFlg.
     * 
     * @param singlePltzQrFlg Value to be stored in singlePltzQrFlg.
     */
    public void setSinglePltzQrFlg(String singlePltzQrFlg) {
        this.singlePltzQrFlg = singlePltzQrFlg;
    }
    /**
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * Getter method for docNo.
     *
     * @return the docNo
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * Setter method for docNo.
     *
     * @param docNo Set for docNo
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /**
     * Getter method for free1DispFlg.
     *
     * @return the free1DispFlg
     */
    public String getFree1DispFlg() {
        return free1DispFlg;
    }

    /**
     * Setter method for free1DispFlg.
     *
     * @param free1DispFlg Set for free1DispFlg
     */
    public void setFree1DispFlg(String free1DispFlg) {
        this.free1DispFlg = free1DispFlg;
    }

    /**
     * Getter method for free2DispFlg.
     *
     * @return the free2DispFlg
     */
    public String getFree2DispFlg() {
        return free2DispFlg;
    }

    /**
     * Setter method for free2DispFlg.
     *
     * @param free2DispFlg Set for free2DispFlg
     */
    public void setFree2DispFlg(String free2DispFlg) {
        this.free2DispFlg = free2DispFlg;
    }

    /**
     * Getter method for free3DispFlg.
     *
     * @return the free3DispFlg
     */
    public String getFree3DispFlg() {
        return free3DispFlg;
    }

    /**
     * Setter method for free3DispFlg.
     *
     * @param free3DispFlg Set for free3DispFlg
     */
    public void setFree3DispFlg(String free3DispFlg) {
        this.free3DispFlg = free3DispFlg;
    }

    /**
     * Getter method for hsCdDispFlg.
     *
     * @return the hsCdDispFlg
     */
    public String getHsCdDispFlg() {
        return hsCdDispFlg;
    }

    /**
     * Setter method for hsCdDispFlg.
     *
     * @param hsCdDispFlg Set for hsCdDispFlg
     */
    public void setHsCdDispFlg(String hsCdDispFlg) {
        this.hsCdDispFlg = hsCdDispFlg;
    }

    /**
     * Getter method for cmlTyp.
     *
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * Setter method for cmlTyp.
     *
     * @param cmlTyp Set for cmlTyp
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
    }

    /**
     * Getter method for invoiceCtgry.
     *
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * Setter method for invoiceCtgry.
     *
     * @param invoiceCtgry Set for invoiceCtgry
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * Getter method for invoiceClass.
     *
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * Setter method for invoiceClass.
     *
     * @param invoiceClass Set for invoiceClass
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
    }

    /**
     * Getter method for invoiceClassNm.
     *
     * @return the invoiceClassNm
     */
    public String getInvoiceClassNm() {
        return invoiceClassNm;
    }

    /**
     * Setter method for invoiceClassNm.
     *
     * @param invoiceClassNm Set for invoiceClassNm
     */
    public void setInvoiceClassNm(String invoiceClassNm) {
        this.invoiceClassNm = invoiceClassNm;
    }
}