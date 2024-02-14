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
 * Results for domain class of plant information service check presence of CIGMA.
 * <br />CIGMAの製造部工場区分情報存在チェックサービスの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS50272 $
 * @version $Revision: 7743 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws9002result")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ws9002ResultDomain extends ResultDomain {

    /**
     * SERIAL VERSION / シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Plant information / 製造部工場区分情報
     */
    @XmlElement(name = "plantInfo")
    private Ws9002ResultItemDomain plantInfo;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public Ws9002ResultDomain() {
        super();
    }
    
    /**
     * The constructor for creating an instance by specifying the code results. (Normal use)
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws9002ResultDomain(String resultCode) {
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
    public Ws9002ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * <p>Getter method for plantInfo.</p>
     *
     * @return the plantInfo
     */
    public Ws9002ResultItemDomain getPlantInfo() {
        return plantInfo;
    }

    /**
     * <p>Setter method for plantInfo.</p>
     *
     * @param plantInfo Set for plantInfo
     */
    public void setPlantInfo(Ws9002ResultItemDomain plantInfo) {
        this.plantInfo = plantInfo;
    }

}
