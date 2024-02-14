/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * The domain class that holds the information of the document [L7002].
 * <br/>帳票【L7002】の情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L7002ReportDetailDomain extends AbstractDomain {
    
    /**
     * serial version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /** Exporter */
    private String exporter = null;
    /** Importer */
    private String importer = null;
    /** B/L No. */
    private String blNo = null;
    /** Invoice No. */
    private String invoiceNo = null;
    /** CML */
    private String cml = null;
    /** Vol.(単位) */
    private String m3 = null;
    /** Site */
    private String site = null;
    
    /**
     * Default Constructor
     */
    public L7002ReportDetailDomain() {
    }
    
    /**
     * Getter method for exporter.
     *
     * @return the exporter
     */
    public String getExporter() {
        return exporter;
    }
    /**
     * Setter method for exporter.
     *
     * @param exporter Set for exporter
     */
    public void setExporter(String exporter) {
        this.exporter = exporter;
    }
    /**
     * Getter method for importer.
     *
     * @return the importer
     */
    public String getImporter() {
        return importer;
    }
    /**
     * Setter method for importer.
     *
     * @param importer Set for importer
     */
    public void setImporter(String importer) {
        this.importer = importer;
    }
    /**
     * Getter method for blNo.
     *
     * @return the blNo
     */
    public String getBlNo() {
        return blNo;
    }
    /**
     * Setter method for blNo.
     *
     * @param blNo Set for blNo
     */
    public void setBlNo(String blNo) {
        this.blNo = blNo;
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
     * Getter method for cml.
     *
     * @return the cml
     */
    public String getCml() {
        return cml;
    }
    /**
     * Setter method for cml.
     *
     * @param cml Set for cml
     */
    public void setCml(String cml) {
        this.cml = cml;
    }
    /**
     * Getter method for m3.
     *
     * @return the m3
     */
    public String getM3() {
        return m3;
    }
    /**
     * Setter method for m3.
     *
     * @param m3 Set for m3
     */
    public void setM3(String m3) {
        this.m3 = m3;
    }
    /**
     * Getter method for site.
     *
     * @return the site
     */
    public String getSite() {
        return site;
    }
    /**
     * Setter method for site.
     *
     * @param site Set for site
     */
    public void setSite(String site) {
        this.site = site;
    }
    
    
}
