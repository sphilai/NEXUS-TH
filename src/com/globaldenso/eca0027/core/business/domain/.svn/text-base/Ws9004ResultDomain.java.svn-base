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

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Results for domain class of shipTo information services of existence check CIGMA.
 * <br />CIGMAの送荷先情報存在チェックサービスの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7884 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws9004result")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ws9004ResultDomain extends ResultDomain {

    /**
     * SERIAL VERSION / シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * ShipTo information / 送荷先情報
     */
    @XmlElement(name = "shipToInfo")
    private Ws9004ResultItemDomain shipToInfo;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public Ws9004ResultDomain() {
        super();
    }
    
    /**
     * The constructor for creating an instance by specifying the code results. (Normal use)
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws9004ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying 
     * the error code list and results. (Errors)
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode 結果コード
     * @param errorList エラーリスト
     */
    public Ws9004ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for shipToInfo.</p>
     *
     * @return the shipToInfo
     */
    public Ws9004ResultItemDomain getShipToInfo() {
        return shipToInfo;
    }

    /**
     * Setter method for shipToInfo.</p>
     *
     * @param shipToInfo Set for shipToInfo
     */
    public void setShipToInfo(Ws9004ResultItemDomain shipToInfo) {
        this.shipToInfo = shipToInfo;
    }

}
