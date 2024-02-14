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
 * Domain is the result of WB004 (Get EDI Order Last Digit Change Candidate).
 * <br />WB004(Get EDI Order Last Digit Change Candidate)の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WsB004result")
public class WsB004ResultDomain extends ResultDomain {

    /**
     * Serial version.
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Property
     */
    @XmlElementWrapper(name = "partList")
    @XmlElement(name = "partItem")
    private List<String> partList;
     
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB004ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying the CD results.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode CD Results <br />結果コード
     */
    public WsB004ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error list and CD results.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode CD Results <br />結果コード
     * @param errorList error list<br />エラーリスト
     */
    public WsB004ResultDomain(String resultCode,
        List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for itnbrList.
     *
     * @return the itnbrList
     */
    public List<String> getPartList() {
        return partList;
    }

    /**
     * Setter method for itnbrList.
     *
     * @param partList Set for partList
     */
    public void setPartList(List<String> partList) {
        this.partList = partList;
    }

    
}
