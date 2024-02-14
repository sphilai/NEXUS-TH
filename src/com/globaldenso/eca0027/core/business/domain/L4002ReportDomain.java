/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of Staging Actuality document data is output in the Staging Actuality business
 * <br />山作り実績業務で出力するStaging Actuality帳票の情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000407 $
 * @version $Revision: 12983 $
 */
public class L4002ReportDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Staging actuality no.
     */
    private String stgActNo;

    /**
     * Container sorting key.
     */
    private String containerSortingKey;

    /**
     * Transport type name.
     */
    private String trnsTypNm;

    /**
     * Staging actuality issuer name.
     */
    private String stgActIssuerNm;

    /**
     * Package quantity.
     */
    private String pkgQty;

    /**
     * Gross weight.
     */
    private String grossWeight;

    /**
     * Weight unit.
     */
    private String weightUnit;

    /**
     * Weight unit display.
     */
    private String weightUnitDisp;

    /**
     * Volume.
     */
    private String volume;

    /**
     * Volume unit.
     */
    private String volumeUnit;

    /**
     * Volume unit display.
     */
    private String volumeUnitDisp;

    /**
     * Loading ratio.
     */
    private String loadingRatio;

    /**
     * Denger item flag.
     */
    private String dngrItemFlg;

    /**
     * Weight percent A.
     */
    private String weightPerA;

    /**
     * Weight percent B.
     */
    private String weightPerB;

    /**
     * Weight percent C.
     */
    private String weightPerC;

    /**
     * Weight percent D.
     */
    private String weightPerD;

    /**
     * Date format (for print report).
     */
    private String reportDateFormat;

    /**
     * Print date.
     */
    private String printDt;

    /**
     * QR code stream.
     */
    private InputStream qrCdStream;
    
    /**
     * Transport name.
     */
    private String trnsNm;
    
    /**
     * Staging actuality issuer date.
     */
    private String stgActDt;
    
    /**
     * Package List 1.
     */
    private String pkgList1;

    /**
     * Package List 2.
     */
    private String pkgList2;
    
    /**
     * Package List 3.
     */
    private String pkgList3;
    
    /**
     * Constructor.
     */
    public L4002ReportDomain() {
    }

    /**
     * Getter method for stgActNo.
     *
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * Setter method for stgActNo.
     *
     * @param stgActNo Set for stgActNo
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
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
     * Getter method for trnsTypNm.
     *
     * @return the trnsTypNm
     */
    public String getTrnsTypNm() {
        return trnsTypNm;
    }

    /**
     * Setter method for trnsTypNm.
     *
     * @param trnsTypNm Set for trnsTypNm
     */
    public void setTrnsTypNm(String trnsTypNm) {
        this.trnsTypNm = trnsTypNm;
    }

    /**
     * Getter method for stgActIssuerNm.
     *
     * @return the stgActIssuerNm
     */
    public String getStgActIssuerNm() {
        return stgActIssuerNm;
    }

    /**
     * Setter method for stgActIssuerNm.
     *
     * @param stgActIssuerNm Set for stgActIssuerNm
     */
    public void setStgActIssuerNm(String stgActIssuerNm) {
        this.stgActIssuerNm = stgActIssuerNm;
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
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Getter method for weightUnitDisp.
     *
     * @return the weightUnitDisp
     */
    public String getWeightUnitDisp() {
        return weightUnitDisp;
    }

    /**
     * Setter method for weightUnitDisp.
     *
     * @param weightUnitDisp Set for weightUnitDisp
     */
    public void setWeightUnitDisp(String weightUnitDisp) {
        this.weightUnitDisp = weightUnitDisp;
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
     * Getter method for volumeUnit.
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * Setter method for volumeUnit.
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * Getter method for volumeUnitDisp.
     *
     * @return the volumeUnitDisp
     */
    public String getVolumeUnitDisp() {
        return volumeUnitDisp;
    }

    /**
     * Setter method for volumeUnitDisp.
     *
     * @param volumeUnitDisp Set for volumeUnitDisp
     */
    public void setVolumeUnitDisp(String volumeUnitDisp) {
        this.volumeUnitDisp = volumeUnitDisp;
    }

    /**
     * Getter method for loadingRatio.
     *
     * @return the loadingRatio
     */
    public String getLoadingRatio() {
        return loadingRatio;
    }

    /**
     * Setter method for loadingRatio.
     *
     * @param loadingRatio Set for loadingRatio
     */
    public void setLoadingRatio(String loadingRatio) {
        this.loadingRatio = loadingRatio;
    }

    /**
     * Getter method for dngrItemFlg.
     *
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * Setter method for dngrItemFlg.
     *
     * @param dngrItemFlg Set for dngrItemFlg
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * Getter method for weightPerA.
     *
     * @return the weightPerA
     */
    public String getWeightPerA() {
        return weightPerA;
    }

    /**
     * Setter method for weightPerA.
     *
     * @param weightPerA Set for weightPerA
     */
    public void setWeightPerA(String weightPerA) {
        this.weightPerA = weightPerA;
    }

    /**
     * Getter method for weightPerB.
     *
     * @return the weightPerB
     */
    public String getWeightPerB() {
        return weightPerB;
    }

    /**
     * Setter method for weightPerB.
     *
     * @param weightPerB Set for weightPerB
     */
    public void setWeightPerB(String weightPerB) {
        this.weightPerB = weightPerB;
    }

    /**
     * Getter method for weightPerC.
     *
     * @return the weightPerC
     */
    public String getWeightPerC() {
        return weightPerC;
    }

    /**
     * Setter method for weightPerC.
     *
     * @param weightPerC Set for weightPerC
     */
    public void setWeightPerC(String weightPerC) {
        this.weightPerC = weightPerC;
    }

    /**
     * Getter method for weightPerD.
     *
     * @return the weightPerD
     */
    public String getWeightPerD() {
        return weightPerD;
    }

    /**
     * Setter method for weightPerD.
     *
     * @param weightPerD Set for weightPerD
     */
    public void setWeightPerD(String weightPerD) {
        this.weightPerD = weightPerD;
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
     * Getter method for printDt.
     *
     * @return the printDt
     */
    public String getPrintDt() {
        return printDt;
    }

    /**
     * Setter method for printDt.
     *
     * @param printDt Set for printDt
     */
    public void setPrintDt(String printDt) {
        this.printDt = printDt;
    }

    /**
     * Getter method for qrCdStream.
     *
     * @return the qrCdStream
     */
    public InputStream getQrCdStream() {
        return qrCdStream;
    }

    /**
     * Setter method for qrCdStream.
     *
     * @param qrCdStream Set for qrCdStream
     */
    public void setQrCdStream(InputStream qrCdStream) {
        this.qrCdStream = qrCdStream;
    }

    /**
     * Getter method for serialVersionUID.
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * <p>trnsNm のゲッターメソッドです。</p>
     *
     * @return the trnsNm
     */
    public String getTrnsNm() {
        return trnsNm;
    }

    /**
     * <p>trnsNm のセッターメソッドです。</p>
     *
     * @param trnsNm trnsNm に設定する
     */
    public void setTrnsNm(String trnsNm) {
        this.trnsNm = trnsNm;
    }

    /**
     * <p>stgActDt のゲッターメソッドです。</p>
     *
     * @return the stgActDt
     */
    public String getStgActDt() {
        return stgActDt;
    }

    /**
     * <p>stgActDt のセッターメソッドです。</p>
     *
     * @param stgActDt stgActDt に設定する
     */
    public void setStgActDt(String stgActDt) {
        this.stgActDt = stgActDt;
    }

    /**
     * <p>pkgList1 のゲッターメソッドです。</p>
     *
     * @return the pkgList1
     */
    public String getPkgList1() {
        return pkgList1;
    }

    /**
     * <p>pkgList1 のセッターメソッドです。</p>
     *
     * @param pkgList1 pkgList1 に設定する
     */
    public void setPkgList1(String pkgList1) {
        this.pkgList1 = pkgList1;
    }

    /**
     * <p>pkgList2 のゲッターメソッドです。</p>
     *
     * @return the pkgList2
     */
    public String getPkgList2() {
        return pkgList2;
    }

    /**
     * <p>pkgList2 のセッターメソッドです。</p>
     *
     * @param pkgList2 pkgList2 に設定する
     */
    public void setPkgList2(String pkgList2) {
        this.pkgList2 = pkgList2;
    }

    /**
     * <p>pkgList3 のゲッターメソッドです。</p>
     *
     * @return the pkgList3
     */
    public String getPkgList3() {
        return pkgList3;
    }

    /**
     * <p>pkgList3 のセッターメソッドです。</p>
     *
     * @param pkgList3 pkgList3 に設定する
     */
    public void setPkgList3(String pkgList3) {
        this.pkgList3 = pkgList3;
    }
    
}
