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
 * Domain Class to Store Screen Information(ECA0027_WS_4503)
 * WS4504の印刷の出力情報を保持するドメインクラスです
 * </p>
 * 
 * @version $Revision: 7141 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws4504ProcessFacadeServiceResultDomain extends ResultDomain {
    /**
     * <p>
     * SerialID
     * シリアルID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Default Construcor
     * デフォルトコンストラクタです。
     * <p>
     */
    public Ws4504ProcessFacadeServiceResultDomain() {
    }

    /**
     * <p>
     * Constructor to Create Instance.(for Error)
     * Specify Result Code and Error List.
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     * </p>
     * 
     * @param resultCode Result Code結果コード
     * @param errorList Error List エラーリスト
     */
    public Ws4504ProcessFacadeServiceResultDomain(String resultCode,
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
     * @param resultCode Result Code
     */
    public Ws4504ProcessFacadeServiceResultDomain(String resultCode) {
        super(resultCode);
    }


}
