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
 * The result of ECA0027_WS_2510 is a domain.
 * <br />ECA0027_WS_2510の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2510result")
public class Ws2510ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Palletize-Instruction header result domain
     * <br />梱包指示ヘッダー結果ドメイン
     */
    private Ws2510XMainMarkInfoDomain xMainMarkInfo;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2510ResultDomain() {
    }
    
    /**
     * The constructor for specifying a result CD and generating an instance.(For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws2510ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for specifying a result CD and an error list and generating an instance.(For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode 結果コード
     * @param errorList エラーリスト
     */
    public Ws2510ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for xMainMarkInfo.
     *
     * @return the xMainMarkInfo
     */
    public Ws2510XMainMarkInfoDomain getXMainMarkInfo() {
        return xMainMarkInfo;
    }

    /**
     * Setter method for xMainMarkInfo.
     *
     * @param mainMarkInfo Set for xMainMarkInfo
     */
    public void setXMainMarkInfo(Ws2510XMainMarkInfoDomain mainMarkInfo) {
        xMainMarkInfo = mainMarkInfo;
    }
}
