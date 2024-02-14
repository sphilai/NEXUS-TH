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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * ECA0027_WS_4502の出力情報を保持するドメインです。
 * </p>
 * 
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws4502UpdateFacadeServiceResultDomain extends ResultDomain {

    /**
     * <p>
     * Serial ID
     * シリアルID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタです。
     * <p>
     */
    public Ws4502UpdateFacadeServiceResultDomain() {
        super();
    }

    /**
     * <p>
     * Constructor to Create Instance.(for Error)
     * Specify Result Code and Error List.
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     * </p>
     * 
     * @param resultCode Result Code 結果コード
     * @param errorList Error ListSエラーリスト
     */
    public Ws4502UpdateFacadeServiceResultDomain(String resultCode,
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
    public Ws4502UpdateFacadeServiceResultDomain(String resultCode) {
        super(resultCode);
    }

}
