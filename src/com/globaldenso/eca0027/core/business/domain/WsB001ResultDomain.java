/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The domain class that contains the results of running date information.
 * <br />WB001(Check Order Entry Header On Hand)の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WsB001result")
public class WsB001ResultDomain extends ResultDomain {

    /**
     * Serial version ID
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Item Description
     */
    @XmlElement(name = "partName")
    private String partName;

    /**
     * Packing Code
     */
    @XmlElement(name = "plantCodeLegacy")
    private String plantCodeLegacy;

    /**
     * Supplier Code
     */
    @XmlElement(name = "supplierCode")
    private String supplierCode;

    /**
     * Supplier Code
     */
    @XmlElementWrapper(name = "dateList")
    @XmlElement(name = "dateItem")
    private List<? extends WsB001ResultItemDomain> dateList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB001ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying the code results. (Normal use)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode Result code<br />結果コード
     */
    public WsB001ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error code list and results. (Errors)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode Result code<br />結果コード
     * @param errorList Error list<br />エラーリスト
     */
    public WsB001ResultDomain(String resultCode,
        List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for partName.
     *
     * @return the partName
     */
    public String getPartName() {
        return partName;
    }

    /**
     * Setter method for partName.
     *
     * @param partName Set for partName
     */
    public void setPartName(String partName) {
        this.partName = partName;
    }

    /**
     * Getter method for plantCodeLegacy.
     *
     * @return the plantCodeLegacy
     */
    public String getPlantCodeLegacy() {
        return plantCodeLegacy;
    }

    /**
     * Setter method for plantCodeLegacy.
     *
     * @param plantCodeLegacy Set for plantCodeLegacy
     */
    public void setPlantCodeLegacy(String plantCodeLegacy) {
        this.plantCodeLegacy = plantCodeLegacy;
    }

    /**
     * Getter method for supplierCode.
     *
     * @return the supplierCode
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Setter method for supplierCode.
     *
     * @param supplierCode Set for supplierCode
     */
    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * Getter method for dateList.
     *
     * @return the dateList
     */
    public List<? extends WsB001ResultItemDomain> getDateList() {
        return dateList;
    }

    /**
     * Setter method for dateList.
     *
     * @param dateList Set for dateList
     */
    public void setDateList(List<? extends WsB001ResultItemDomain> dateList) {
        this.dateList = dateList;
    }
}
