/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain of list in Export Ship to Shipping MA Inquiry screen.
 * <br />Export Ship to Shipping MA Inquiry画面のリストドメインです。
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 15229 $
 */
public class W9007ListDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     *  シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * CK.
     */
    private String checkedKey;

    /**
     * Shipper
     */
    private String compCd;

    /**
     * NEXUS Ship to
     */
    private String shipToCd;

    /**
     * Apply Start Date
     */
    private String aplyStrtDt;

    /**
     * Cont Sort Key
     */
    private String containerSortingKey;

    /**
     * LD CD
     */
    private String loadingCd;

    /**
     * Label Print Num
     */
    private String labelPrintNum;

    /**
     * C/L
     */
    private String containerLooseTyp;

    /**
     * Packing Summary Atch Flg.
     * NL023 ADD
     */
    private String packingSummaryAtchFlg;
    
    /**
     * Single Pltz Qr Flg.
     * NL047 ADD
     */
    private String singlePltzQrFlg;

    /**
     * LAST UPDATE DATE (specification)<br />
     * 最終更新日時(明細)
     */
    private Timestamp comUpdateTimestamp;
   
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W9007ListDomain() {
    }

    /**
     * Getter method for checkedKey.
     *
     * @return the checkedKey
     */
    public String getCheckedKey() {
        return checkedKey;
    }

    /**
     * Setter method for checkedKey.
     *
     * @param checkedKey Set for checkedKey
     */
    public void setCheckedKey(String checkedKey) {
        this.checkedKey = checkedKey;
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
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
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
     *      * Getter method of singlePltzQrFlg.
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


}