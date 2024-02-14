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
 * The result of ECA0027_WS_2503 is a domain.
 * <br />ECA0027_WS_2503の結果ドメインです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 6768 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2503result")
public class Ws2503ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * The error report result domain of ECA0027_WS_2503
     * <br />ECA0027_WS_2503のエラーレポート結果ドメイン
     */
    private Ws2503ErrorReportDomain errorReport;
    
    /**
     * The Palletize-Instruction header result domain of ECA0027_WS_2503
     * <br />ECA0027_WS_2503の梱包指示ヘッダ結果ドメイン
     */
    private Ws2503PalletizeInstrHeaderDomain palletizeHeader;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2503ResultDomain() {
    }

    /**
     * The constructor for specifying a result CD and generating an instance.(For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws2503ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for specifying a result CD and an error list and generating an instance.(For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode 結果コード
     * @param errorList エラーリスト
     */
    public Ws2503ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }
    
    /**
     * Getter method for errorReport.
     *
     * @return the errorReport
     */
    public Ws2503ErrorReportDomain getErrorReport() {
        return errorReport;
    }

    /**
     * Setter method for errorReport.
     *
     * @param errorReport Set for errorReport
     */
    public void setErrorReport(Ws2503ErrorReportDomain errorReport) {
        this.errorReport = errorReport;
    }

    /**
     * Getter method for palletizeInstrHeader.
     *
     * @return the palletizeHeader
     */
    public Ws2503PalletizeInstrHeaderDomain getPalletizeHeader() {
        return palletizeHeader;
    }

    /**
     * Setter method for palletizeInstrHeader.
     *
     * @param palletizeHeader Set for palletizeHeader
     */
    public void setPalletizeHeader(
        Ws2503PalletizeInstrHeaderDomain palletizeHeader) {
        this.palletizeHeader = palletizeHeader;
    }
}
