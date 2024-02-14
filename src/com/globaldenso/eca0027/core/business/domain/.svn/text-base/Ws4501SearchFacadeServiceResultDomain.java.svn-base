/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
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
 * Implement Class of Facade Service(ECA0027_WS_4501)
 * ECA0027_WS_4501の出力情報を保持するドメインです。
 * </p>
 * 
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws4501SearchFacadeServiceResultDomain extends ResultDomain {
    /**
     * <p>
     * Serial ID
     * シリアルID
     * </p>
     */
    private static final long serialVersionUID = 1L;
    /**
     * <p>
     * Ws4501ResultHeaderDomain
     * Ws4501ResultHeaderDomain
     * </p>
     */
    @XmlElement(name = "stagingHeader")
    private Ws4501ResultHeaderDomain ws4501ResultHeaderDomain = new Ws4501ResultHeaderDomain();
    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws4501SearchFacadeServiceResultDomain() {
    }

    /**
     * <p>
     * Constructor to Create Instance.(for Error)
     * Specify Result Code and Error List.
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     * </p>
     * 
     * @param resultCode Result Code 結果コード
     * @param errorList Error List エラーリスト
     */
    public Ws4501SearchFacadeServiceResultDomain(String resultCode,
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
    public Ws4501SearchFacadeServiceResultDomain(String resultCode) {
        super(resultCode);
    }


    /**
     * <p>
     * Getter method for Ws4501ResultHeaderDomain
     * </p>
     * 
     * @return the Ws4501ResultHeaderDomain
     */
    public Ws4501ResultHeaderDomain getWs4501ResultHeaderDomain() {
        return this.ws4501ResultHeaderDomain;
    }
    
    /**
     * <p>
     * Setter method for Ws4501ResultHeaderDomain
     * </p>
     * @param ws4501ResultHeaderDomain ws4501ResultHeaderDomain
     */
    public void setWs4501ResultHeaderDomain(Ws4501ResultHeaderDomain ws4501ResultHeaderDomain) {
        this.ws4501ResultHeaderDomain = ws4501ResultHeaderDomain;
    }
    
}
