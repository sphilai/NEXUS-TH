package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


/**
 * This is a domain which stores the error result of Web service.
 * <br />Webサービスのエラー結果を格納するドメインです。
 *
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ErrorListItemDomain {

    /**
     * error code (MESSAGE ID)
     * <br />エラーコード（メッセージID）
     */
    private String errorCode;
    
    /**
     * bind variable
     * <br />バインド変数
     */
    @XmlElementWrapper
    @XmlElement(name = "errorParamListItem")
    private List<ErrorParamListItemDomain> errorParamList;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public ErrorListItemDomain() {
    }

    /**
     * constructor for specifying the error code and a bind variable and generating an instance.
     * <br />エラーコードとバインド変数を指定してインスタンスを生成するためのコンストラクタです。
     *
     * @param errorCode error code<br />エラーコード
     * @param errorParamList bind variable<br />バインド変数
     */
    public ErrorListItemDomain(String errorCode, List<ErrorParamListItemDomain> errorParamList) {
        this.errorCode = errorCode;
        this.errorParamList = errorParamList;
    }
    
    /**
     * Getter method for errorCode.
     *
     * @return error code<br />エラーコード
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for errorCode.
     *
     * @param errorCode error code<br />エラーコード に設定する
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for errorParamList.
     *
     * @return bind variable<br />バインド変数
     */
    public List<ErrorParamListItemDomain> getErrorParamList() {
        return errorParamList;
    }

    /**
     * Setter method for errorParamList.
     *
     * @param errorParamList bind variable<br />バインド変数 に設定する
     */
    public void setErrorParamList(List<ErrorParamListItemDomain> errorParamList) {
        this.errorParamList = errorParamList;
    }
}
