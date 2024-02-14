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


/**
 * This is a sub domain which stores the error result of Web service.
 * <br />Webサービスのエラー結果を格納する子ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorListItemSubDomain extends ErrorListItemDomain {

    /**
     * Error property
     * <br />エラープロパティ
     */
    @XmlElement
    private String errorProperty;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public ErrorListItemSubDomain() {
        super();
    }
    
    /**
     * An error code, a bind variable, property   constructor for specifying and generating an instance.
     * <br />エラーコード、バインド変数、プロパティ を指定してインスタンスを生成するためのコンストラクタです。
     * 
     * @param errorCode error code<br />エラーコード
     * @param errorParamList bind variable<br />バインド変数
     * @param errorProperty property<br />プロパティ
     */
    public ErrorListItemSubDomain(String errorCode, List<ErrorParamListItemDomain> errorParamList, String errorProperty) {
        super(errorCode, errorParamList);
        this.errorProperty = errorProperty;
    }

    /**
     * Getter method for errorProperty.
     *
     * @return the errorProperty
     */
    public String getErrorProperty() {
        return errorProperty;
    }

    /**
     * Setter method for errorProperty.
     *
     * @param errorProperty Set for errorProperty
     */
    public void setErrorProperty(String errorProperty) {
        this.errorProperty = errorProperty;
    }

}
