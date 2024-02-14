/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The domain class that holds the detail information of WB001(Check Order Entry Header On Hand)
 * <br />WB001(Check Order Entry Header On Hand)の結果ドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7416 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class WsR001ResultDomain implements Serializable {
    
    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * result Code
     * <br />結果コード
     */
    private String resultCode;
    
    /**
     * error list
     * <br />エラーリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "errorItem")
    private List<String> errorList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public WsR001ResultDomain() {
    }

    /**
     * The constructor for specifying a CD as a result and generating an instance.(For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public WsR001ResultDomain(String resultCode) {
        this.resultCode = resultCode;

        // 正常でも空のerrorList要素を出力する必要がある
        this.errorList = Collections.emptyList();
    }
    
    /**
     * The constructor for specifying a CD and an error list as a result and generating an instance.(For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode 結果コード
     * @param errorList エラーリスト
     */
    public WsR001ResultDomain(String resultCode, List<String> errorList) {
        this.resultCode = resultCode;
        this.errorList = errorList;
    }

    /**
     * Getter method for resultCode.
     *
     * @return the resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Setter method for resultCode.
     *
     * @param resultCode Set for resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * Getter method for errorList.
     *
     * @return the errorList
     */
    public List<String> getErrorList() {
        return errorList;
    }

    /**
     * Setter method for errorList.
     *
     * @param errorList Set for errorList
     */
    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

}
