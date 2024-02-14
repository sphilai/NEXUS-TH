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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>
 * Domain Class to return Xml Information(WS3501)

 * </p>
 * 
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws3501SearchFacadeServiceResultDomain extends ResultDomain {

    /**
     * <p>
     * Serial ID
     * </p>
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * TR No
     */
    @XmlElement(name = "trNo")
    private String trNo;
    
    /**
     * by Cml
     */
    @XmlElementWrapper(name = "cmlList")
    @XmlElement(name = "cmlListItem")
    private List<Ws3501CmlListItemDomain> cmlList;
    
    /**
     * by ItemNo
     */
    @XmlElementWrapper(name = "itemNoList")
    @XmlElement(name = "itemNoListItem")
    private List<Ws3501ItemNoListItemDomain> itemNoList;
    
    /**
     * <p>
     * Default Constructor
     * </p>
     */
    public Ws3501SearchFacadeServiceResultDomain() {
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
    public Ws3501SearchFacadeServiceResultDomain(String resultCode,
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
    public Ws3501SearchFacadeServiceResultDomain(String resultCode) {
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
     * Getter method for cmlList.
     * </p>
     * 
     * @return the cmlList
     */
    public List<Ws3501CmlListItemDomain> getCmlList() {
        return cmlList;
    }

    /**
     * <p>
     * Setter method for cmlList.
     * </p>
     * 
     * @param cmlList Set for cmlList
     */
    public void setCmlList(List<Ws3501CmlListItemDomain> cmlList) {
        this.cmlList = cmlList;
    }

    /**
     * <p>
     * Getter method for itemNoList.
     * </p>
     * 
     * @return the itemNoList
     */
    public List<Ws3501ItemNoListItemDomain> getItemNoList() {
        return itemNoList;
    }

    /**
     * <p>
     * Setter method for itemNoList.
     * </p>
     * 
     * @param itemNoList Set for itemNoList
     */
    public void setItemNoList(List<Ws3501ItemNoListItemDomain> itemNoList) {
        this.itemNoList = itemNoList;
    }
}
