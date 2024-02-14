/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.InputStream;
import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the information of Staging Instruction document data is output in the Staging Instruction business
 * <br />荷揃え指示業務で出力するStaging Instruction帳票の情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 4687 $
 */
public class L4001ReportDomain extends AbstractDomain {

    /**
     * Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Transport code.
     */
    private String trnsCd;

    /**
     * Container sorting key.
     */
    private String containerSortingKey;

    /**
     * Container loose type.
     */
    private String containerLooseTyp;

    /**
     * Shipper code.
     */
    private String shipperCd;

    /**
     * Staging instruction no.
     */
    private String stgInstrNo;

    /**
     * ETD.
     */
    private String etd;

    /**
     * Staging instruction date.
     */
    private String stgInstrDt;

    /**
     * Staging instruction issuer name.
     */
    private String stgInstrIssuerNm;

    /**
     * Package quantity.
     */
    private String pkgQty;

    /**
     * Weight unit display.
     */
    private String weightUnitDisp;

    /**
     * Volume unit display.
     */
    private String volumeUnitDisp;

    /**
     * Carrier company code.
     */
    private String carrierCompCd;

    /**
     * Print date.
     */
    private String printDt;

    /**
     * Shipper name abbreviation
     */
    private String shipperNmAbb;

    /**
     * QR code stream.
     */
    private InputStream qrCdStream;

    /**
     * Detail domein list.
     */
    private List<? extends L4001ReportDetailDomain> detailDomainList;

    /**
     * Date format (for print report).
     */
    private String reportDateFormat;

    /**
     * Constructor.
     */
    public L4001ReportDomain() {
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
     * Getter method for stgInstrNo.
     *
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * Setter method for stgInstrNo.
     *
     * @param stgInstrNo Set for stgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * Getter method for etd.
     *
     * @return the etd
     */
    public String getEtd() {
        return etd;
    }

    /**
     * Setter method for etd.
     *
     * @param etd Set for etd
     */
    public void setEtd(String etd) {
        this.etd = etd;
    }

    /**
     * Getter method for stgInstrDt.
     *
     * @return the stgInstrDt
     */
    public String getStgInstrDt() {
        return stgInstrDt;
    }

    /**
     * Setter method for stgInstrDt.
     *
     * @param stgInstrDt Set for stgInstrDt
     */
    public void setStgInstrDt(String stgInstrDt) {
        this.stgInstrDt = stgInstrDt;
    }

    /**
     * Getter method for stgInstrIssuerNm.
     *
     * @return the stgInstrIssuerNm
     */
    public String getStgInstrIssuerNm() {
        return stgInstrIssuerNm;
    }

    /**
     * Setter method for stgInstrIssuerNm.
     *
     * @param stgInstrIssuerNm Set for stgInstrIssuerNm
     */
    public void setStgInstrIssuerNm(String stgInstrIssuerNm) {
        this.stgInstrIssuerNm = stgInstrIssuerNm;
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
     * Getter method for shipperNmAbb.
     *
     * @return the shipperNmAbb
     */
    public String getShipperNmAbb() {
        return shipperNmAbb;
    }

    /**
     * Setter method for shipperNmAbb.
     *
     * @param shipperNmAbb Set for shipperNmAbb
     */
    public void setShipperNmAbb(String shipperNmAbb) {
        this.shipperNmAbb = shipperNmAbb;
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
     * Getter method for detailDomainList.
     *
     * @return the detailDomainList
     */
    public List<? extends L4001ReportDetailDomain> getDetailDomainList() {
        return detailDomainList;
    }

    /**
     * Setter method for detailDomainList.
     *
     * @param detailDomainList Set for detailDomainList
     */
    public void setDetailDomainList(
        List<? extends L4001ReportDetailDomain> detailDomainList) {
        this.detailDomainList = detailDomainList;
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
     * Getter method for serialVersionUID.
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}


