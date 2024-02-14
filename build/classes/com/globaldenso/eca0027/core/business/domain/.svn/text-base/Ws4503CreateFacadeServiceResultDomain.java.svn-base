/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI, INC.
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
 * Domain Class to Store Screen Information(WS4503)
 * WS4503の表示情報を保持するドメインクラスです
 * </p>
 * 
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws4503CreateFacadeServiceResultDomain extends ResultDomain {

    /**
     * <p>
     * Serial ID
     * シリアルID
     * </p>
     */
    private static final long serialVersionUID = 1L;
    /**
     * <p>
     * 山作り実績NOです。
     * </p>
     */
    @XmlElement(name = "stagingActual")
    private Ws4503StgActNoDomain ws4503StgActNoDomain = new Ws4503StgActNoDomain();

    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws4503CreateFacadeServiceResultDomain() {
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
    public Ws4503CreateFacadeServiceResultDomain(String resultCode,
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
    public Ws4503CreateFacadeServiceResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * <p>
     * Getter method for Ws4503StgActNoDomain
     * </p>
     * 
     * @return the Ws4503StgActNoDomain
     */
    public Ws4503StgActNoDomain getWs4503StgActNoDomain() {
        return ws4503StgActNoDomain;
    }
    /**
     * <p>
     * Setter method for set Ws4503StgActNoDomain
     * </p>
     * 
     * @param ws4503StgActNoDomain Set for Ws4503StgActNoDomain
     */
    public void setWs4503StgActNoDomain(Ws4503StgActNoDomain ws4503StgActNoDomain) {

        
        
        this.ws4503StgActNoDomain = ws4503StgActNoDomain;
    }

}