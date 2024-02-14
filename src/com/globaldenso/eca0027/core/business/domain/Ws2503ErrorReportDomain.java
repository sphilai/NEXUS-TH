/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * The error report result domain of ECA0027_WS_2503.
 * <br />ECA0027_WS_2503のエラーレポート結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2503ErrorReportDomain implements Serializable {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * The time stamp of the CML error report (header) registered by Web service
     * <br />Webサービスで登録したCMLエラーレポート（ヘッダ）のタイムスタンプ
     */
    private String errCreateTimestamp;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2503ErrorReportDomain() {
        super();
    }

    /**
     * Getter method for errCreateTimestamp.
     *
     * @return the errCreateTimestamp
     */
    public String getErrCreateTimestamp() {
        return errCreateTimestamp;
    }

    /**
     * Setter method for errCreateTimestamp.
     *
     * @param errCreateTimestamp Set for errCreateTimestamp
     */
    public void setErrCreateTimestamp(String errCreateTimestamp) {
        this.errCreateTimestamp = errCreateTimestamp;
    }
}
