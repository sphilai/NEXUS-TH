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
 * The result of ECA0027_WS_2512 is a domain.
 * <br />ECA0027_WS_2512の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2512Result")
public class Ws2512ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;


    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public Ws2512ResultDomain() {
        super();
    }

    /**
     * the constructor for specifying a result CD and generating an instance.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode result CD<br />結果コード
     */
    public Ws2512ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * the constructor for specifying a result CD and an error list and generating an instance.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode result CD<br />結果コード
     * @param errorList error list<br />エラーリスト
     */
    public Ws2512ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }


}
