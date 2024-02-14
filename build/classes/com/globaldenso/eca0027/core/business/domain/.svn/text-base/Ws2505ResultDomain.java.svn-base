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
 * The result of ECA0027_WS_2505 is a domain.
 * <br />ECA0027_WS_2505の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2505result")
public class Ws2505ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2505ResultDomain() {
        super();
    }

    /**
     * constructor for specifying a result CD and generating an instance.(For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws2505ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * constructor for specifying a result CD and an error list and generating an instance.(For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode 結果コード
     * @param errorList エラーリスト
     */
    public Ws2505ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }
}
