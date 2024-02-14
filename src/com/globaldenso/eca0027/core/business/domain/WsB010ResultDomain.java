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


/**
 * Domain class of WB010(Get Customer Subsidiary Info) result.<br />
 * <br />WB010(Get Customer Subsidiary Info)の結果ドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WsB010result")
public class WsB010ResultDomain extends ResultDomain {

    /**
     * Serial version<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
     
    /**
     * Subsidiary Abbreviation
     */
    @XmlElement(name = "subsidiaryAbbreviation")
    private String subsidiaryAbbreviation;
    
    /**
     * Default constructor<br />
     * デフォルトコンストラクタです。
     */
    public WsB010ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying
     *  the result code. (Normal use)<br />
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode Result code<br />
     * 結果コード
     */
    public WsB010ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying
     *  the error code list and results. (Errors)<br />
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode Result code<br />
     * 
     * @param errorList Error list<br />
     * エラーリスト
     */
    public WsB010ResultDomain(String resultCode,
        List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for subsidiaryAbbreviation.<br />
     * subsidiaryAbbreviation のゲッターメソッドです。
     *
     * @return the subsidiaryAbbreviation
     */
    public String getSubsidiaryAbbreviation() {
        return subsidiaryAbbreviation;
    }

    /**
     * Setter method for subsidiaryAbbreviation.<br />
     * subsidiaryAbbreviation のセッターメソッドです。
     *
     * @param subsidiaryAbbreviation The value to set the subsidiaryAbbreviation<br />
     * subsidiaryAbbreviation に設定する
     */
    public void setSubsidiaryAbbreviation(String subsidiaryAbbreviation) {
        this.subsidiaryAbbreviation = subsidiaryAbbreviation;
    }
    
}
