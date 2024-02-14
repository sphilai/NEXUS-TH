/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * Domain for updating of the Manual Invoice Upload screen.<br />
 * Manual Invoice Upload画面の更新用ドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 11662 $
 */
public class W6002UpdateDomain extends AbstractDomain  {
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * W6002 search condition domain<br />
     * W6002検索条件ドメイン
     */
    private W6002CriteriaDomain w6002CriteriaDomain;
  
    /**
     * Shipper CD<br />
     * 荷主コード
     */
    private String shipperCd;
    
    /**
     * CARRIER COMPANY FLAG<br />
     * 運送会社フラグ
     */
    private String carrierCompFlag;
    
    /**
     * CNTRY CD<br />
     * 国コード
     */
    private String cntryCd;

    /**
     * INVOICE No<br />
     * インボイスNo
     */
    private String invoiceNo;
    
    /**
     * main invoice No<br />
     * メインインボイスNo.。
     * 
     * The use in delivery if the main invoice No. has been changed.
     * メインインボイスNo.が変更された場合の連携に利用。
     * ST946 MANUAL SCREEN TRANSITION ADD
     */
    private String parInvoiceNo;
    
    /**
     * Issue Date
     */
    // ST184 INVOICE ISSUE DATE/インボイス発行日 MOD
    // There is no meaning the value of the new Date(). It is for exception of Date(null) -> Date avoided in Beanutils.copyProperties().
    // new Date()の値に意味はない。Beanutils.copyProperties()でのDate(null)→Date例外回避のため。
    //private String invoiceIssueDt;
    private Date invoiceIssueDt = new Date();
    
    /**
     * FUNCTION NO / FUNCTION NO
     */
    private String functionNo;
    
    /**
     * FRT Contain Flg
     */
    private String frtContainFlg;
    
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     *
     */
    public W6002UpdateDomain() {
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
     * Getter method for carrierCompFlag.
     *
     * @return the carrierCompFlag
     */
    public String getCarrierCompFlag() {
        return carrierCompFlag;
    }

    /**
     * Setter method for carrierCompFlag.
     *
     * @param carrierCompFlag Set for carrierCompFlag
     */
    public void setCarrierCompFlag(String carrierCompFlag) {
        this.carrierCompFlag = carrierCompFlag;
    }

    /**
     * Getter method for cntryCd.
     *
     * @return the cntryCd
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * Setter method for cntryCd.
     *
     * @param cntryCd Set for cntryCd
     */
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
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
     * Getter method for parInvoiceNo.
     *
     * @return the parInvoiceNo
     */
    public String getParInvoiceNo() {
        return parInvoiceNo;
    }

    /**
     * Setter method for parInvoiceNo.
     *
     * @param parInvoiceNo Set for parInvoiceNo
     */
    public void setParInvoiceNo(String parInvoiceNo) {
        this.parInvoiceNo = parInvoiceNo;
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
  

}
