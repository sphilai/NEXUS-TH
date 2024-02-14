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
 * The result of ECA0027_WS_2508 is a domain.
 * <br />ECA0027_WS_2508の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2508Result")
public class Ws2508ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * The error report result domain of ECA0027_WS_2508
     * ><br />ECA0027_WS_2508のエラーレポート結果ドメイン
     */
    private Ws2508ErrorReportDomain errorReport;

    /**
     * The Palletize-Instruction header result domain of ECA0027_WS_2508
     * <br />ECA0027_WS_2508の梱包指示ヘッダ結果ドメイン
     */
    private Ws2508MixTagInstrHeaderDomain mixedTagHeader;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2508ResultDomain() {
    }

    /**
     * The constructor for specifying a result CD and generating an instance.(For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode Result CD<br />結果コード
     */
    public Ws2508ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for specifying a result CD and an error list and generating an instance.(For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode Result CD<br />結果コード
     * @param errorList Error list<br />エラーリスト
     */
    public Ws2508ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for errorReport.
     *
     * @return the errorReport
     */
    public Ws2508ErrorReportDomain getErrorReport() {
        return errorReport;
    }

    /**
     * Setter method for errorReport.
     *
     * @param errorReport Set for errorReport
     */
    public void setErrorReport(Ws2508ErrorReportDomain errorReport) {
        this.errorReport = errorReport;
    }

    /**
     * Getter method for mixedTagHeader.
     *
     * @return the mixedTagHeader
     */
    public Ws2508MixTagInstrHeaderDomain getMixedTagHeader() {
        return mixedTagHeader;
    }

    /**
     * Setter method for mixedTagHeader.
     *
     * @param mixedTagHeader Set for mixedTagHeader
     */
    public void setMixedTagHeader(Ws2508MixTagInstrHeaderDomain mixedTagHeader) {
        this.mixedTagHeader = mixedTagHeader;
    }


}
