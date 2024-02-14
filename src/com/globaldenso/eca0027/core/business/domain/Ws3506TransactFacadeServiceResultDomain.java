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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * Domain Class to return Xml Information(WS3506)

 * </p>
 * 
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws3506TransactFacadeServiceResultDomain extends ResultDomain {

    /**
     * <p>
     * Serial ID
     * シリアルID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * TR No
     * </p>
     */
    @XmlElement(name = "trNo")
    private String trNo;
    
    /**
     * <p>
     * editCnt
     * </p>
     */
    @XmlElement(name = "editCnt")
    private String editCnt;
    
    /**
     * ws3506ResultDomainList
     */
    private List<Ws3506ResultDomain> ws3506ResultDomainList;
    
    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws3506TransactFacadeServiceResultDomain() {
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
    public Ws3506TransactFacadeServiceResultDomain(String resultCode,
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
    public Ws3506TransactFacadeServiceResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * <p>
     * Getter method for trNo
     * </p>
     * 
     * @return the trNo
     */
    public String getTrNo() {
        return trNo;
    }

    /**
     * <p>
     * Setter method for trNo
     * </p>
     * 
     * @param trNo Set for trNo
     */
    public void setTrNo(String trNo) {
        this.trNo = trNo;
    }

    /**
     * <p>
     * Getter method for editCnt
     * </p>
     * 
     * @return the editCnt
     */
    public String getEditCnt() {
        return editCnt;
    }

    /**
     * <p>
     * Setter method for editCnt
     * </p>
     * 
     * @param editCnt Set for editCnt
     */
    public void setEditCnt(String editCnt) {
        this.editCnt = editCnt;
    }
    
    /**
     * <p>
     * Getter method for ws3506ResultDomainList
     * </p>
     * 
     * @return the ws3506ResultDomainList
     */
    public List<Ws3506ResultDomain> getWs3506ResultDomainList() {
        return ws3506ResultDomainList;
    }

    /**
     * <p>
     * Setter method for ws3506ResultDomainList
     * </p>
     * 
     * @param ws3506ResultDomainList Set for ws3506ResultDomainList
     */
    public void setWs3506ResultDomainList(List<Ws3506ResultDomain> ws3506ResultDomainList) {
        this.ws3506ResultDomainList = ws3506ResultDomainList;
    }
}
