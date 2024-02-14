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
import javax.xml.bind.annotation.XmlRootElement;


/**
 * Domain class of WB011(Judge EDI Support) result.
 * <br />WB011(Judge EDI Support)の結果ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WsB011result")
public class WsB011ResultDomain extends ResultDomain {

    /**
     * Serial version ID<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
     
    /**
     * Subsidiary Abbreviation
     */
    @XmlElement(name = "flag")
    private String flag;
    
    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     */
    public WsB011ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying
     *  the result code. (Normal use)<br />
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode Result code<br />
     * 結果コード
     */
    public WsB011ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying
     *  the error code list and results. (Errors)<br />
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode Result code<br />
     * 結果コード
     * @param errorList Error list<br />
     * エラーリスト
     */
    public WsB011ResultDomain(String resultCode,
        List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for flag.
     *
     * @return the flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Setter method for flag.
     *
     * @param flag Set for flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }
}
