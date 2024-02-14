/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The result of ECA0027_WS_2502 is a domain.
 * <br />ECA0027_WS_2502の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2502result")
public class Ws2502ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * The error report result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502のエラーレポート結果ドメイン
     */
    private Ws2502ErrorReportDomain errorReport;
    
    /**
     * The MAIN MARK list item result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502のMAIN MARKリスト項目結果ドメイン
     */
    private Ws2502MainMarkListItemDomain createData;
    
    /**
     * The Palletize-Instruction header result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502の梱包指示ヘッダ結果ドメイン
     */
    private Ws2502PalletizeInstrHeaderDomain palletizeInstrHeader;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2502ResultDomain() {
    }
    
    /**
     * The constructor for specifying a result CD and generating an instance.(For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws2502ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for specifying a result CD and an error list and generating an instance.(For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode 結果コード
     * @param errorList エラーリスト
     */
    public Ws2502ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for errorReport.
     *
     * @return the errorReport
     */
    public Ws2502ErrorReportDomain getErrorReport() {
        return errorReport;
    }

    /**
     * Setter method for errorReport.
     *
     * @param errorReport Set for errorReport
     */
    public void setErrorReport(Ws2502ErrorReportDomain errorReport) {
        this.errorReport = errorReport;
    }

    /**
     * Getter method for createData.
     *
     * @return the createData
     */
    public Ws2502MainMarkListItemDomain getCreateData() {
        return createData;
    }

    /**
     * Setter method for createData.
     *
     * @param createData Set for createData
     */
    public void setCreateData(Ws2502MainMarkListItemDomain createData) {
        this.createData = createData;
    }

    /**
     * Getter method for palletizeInstrHeader.
     *
     * @return the palletizeInstrHeader
     */
    public Ws2502PalletizeInstrHeaderDomain getPalletizeInstrHeader() {
        return palletizeInstrHeader;
    }

    /**
     * Setter method for palletizeInstrHeader.
     *
     * @param palletizeInstrHeader Set for palletizeInstrHeader
     */
    public void setPalletizeInstrHeader(
        Ws2502PalletizeInstrHeaderDomain palletizeInstrHeader) {
        this.palletizeInstrHeader = palletizeInstrHeader;
    }
}
