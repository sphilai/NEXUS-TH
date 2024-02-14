 /*
 * Project : NEXUS_CIGMA
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
 * Results for domain class of W/H information service check presence of CIGMA.
 * <br />CIGMAの倉庫情報存在チェックサービスの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws9005result")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ws9005ResultDomain extends ResultDomain {

    /**
     * SERIAL VERSION / シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * W/H information / 倉庫情報
     */
    @XmlElement(name = "whInfo")
    private Ws9005ResultItemDomain whInfo;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public Ws9005ResultDomain() {
        super();
    }
    
    /**
     * The constructor for creating an instance by specifying the code results. (Normal use)
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws9005ResultDomain(String resultCode) {
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
    public Ws9005ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for whInfo.
     *
     * @return the whInfo
     */
    public Ws9005ResultItemDomain getWhInfo() {
        return whInfo;
    }

    /**
     * Setter method for whInfo.
     *
     * @param whInfo Set for whInfo
     */
    public void setWhInfo(Ws9005ResultItemDomain whInfo) {
        this.whInfo = whInfo;
    }

}
