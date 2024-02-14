/*
 * Project : NEXUS_EXPORT
 * 
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>
 * Domain Class to return Xml Information(WS3503)

 * </p>
 * 
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws3503TransactFacadeServiceResultDomain extends ResultDomain {

    /**
     * <p>
     * Serial ID
     * </p>
     */
    private static final long serialVersionUID = 1L;
    
    
    /**
     * successFlg
     */
    @XmlElement(name = "successFlg")
    private String successFlg;
    
    /**
     * TRANSFER REPORT NO/送荷書NO
     */
    @XmlElement(name = "trNo")
    private String trNo;

    /**
     * errorCmlList
     */
    @XmlElementWrapper(name = "errorCmlList")
    @XmlElement(name = "errorCmlListItem")
    private List<Ws3503CmlDomain> errorCmlList;

    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws3503TransactFacadeServiceResultDomain() {
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
    public Ws3503TransactFacadeServiceResultDomain(String resultCode,
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
    public Ws3503TransactFacadeServiceResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * <p>
     * Getter method for trNo.
     * </p>
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>
     * Setter method for trNo.
     * </p>
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }
    
    /**
     * <p>
     * Getter method for successFlg.
     * </p>
     * 
     * @return the successFlg
     */
    public String getSuccessFlg() {
        return successFlg;
    }

    /**
     * <p>
     * Setter method for successFlg.
     * </p>
     * 
     * @param successFlg Set for successFlg
     */
    public void setSuccessFlg(String successFlg) {
        this.successFlg = successFlg;
    }

    /**
     * <p>
     * Getter method for errorCmlList.
     * </p>
     * 
     * @return the errorCmlList
     */
    public List<Ws3503CmlDomain> getErrorCmlList() {
        return errorCmlList;
    }

    /**
     * <p>
     * Setter method for errorCmlList.
     * </p>
     * 
     * @param errorCmlList Set for errorCmlList
     */
    public void setErrorCmlList(List<Ws3503CmlDomain> errorCmlList) {
        this.errorCmlList = errorCmlList;
    }
}
