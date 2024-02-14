/*
 * Project : NEXUS_EXPORT
 * 
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * Domain Class to return Xml Information(WS3505)

 * </p>
 * 
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws3505TransactFacadeServiceResultDomain extends ResultDomain {

    /**
     * <p>
     * Serial ID
     * シリアルID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * ws3505ResultItemDomain
     * </p>
     */
    @XmlElement(name = "activateResult")
    private Ws3505ResultItemDomain ws3505ResultItemDomain;
    
    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws3505TransactFacadeServiceResultDomain() {
    }

    /**
     * <p>
     * Constructor to Create Instance.(for Error)
     * Specify Result Code and Error List.
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     * </p>
     * 
     * @param resultCode Result Error Code 結果コード
     * @param errorList Error Listエラーリスト
     */
    public Ws3505TransactFacadeServiceResultDomain(String resultCode,
        List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * <p>
     * Constructor to Create Instance.(for Normal)
     * Specify Result Code.
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     * </p>
     * 
     * @param resultCode Result Code 結果コード
     */
    public Ws3505TransactFacadeServiceResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * <p>Getter method for ws3505ResultItemDomain.</p>
     *
     * @return the ws3505ResultItemDomain
     */
    public Ws3505ResultItemDomain getWs3505ResultItemDomain() {
        return ws3505ResultItemDomain;
    }

    /**
     * <p>Setter method for ws3505ResultItemDomain.</p>
     *
     * @param ws3505ResultItemDomain Set for ws3505ResultItemDomain
     */
    public void setWs3505ResultItemDomain(
        Ws3505ResultItemDomain ws3505ResultItemDomain) {
        this.ws3505ResultItemDomain = ws3505ResultItemDomain;
    }
}
