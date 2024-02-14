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
 * 
 * This is a domain class showing the return VALUE of Web service.
 * <br />Webサービスの戻り値を表すドメインクラスです。
 *
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class ResultDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * result code
     * <br />結果コード
     */
    private String resultCode;
    
    /**
     * error list
     * <br />エラーリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "errorListItem")
    private List<ErrorListItemDomain> errorList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public ResultDomain() {
    }

    /**
     * constructor for specifying a CD as a result of , and generating an instance. (For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode result code<br />結果コード
     */
    public ResultDomain(String resultCode) {
        this.resultCode = resultCode;

        // 正常でも空のerrorList要素を出力する必要がある
        this.errorList = Collections.emptyList();
    }
    
    /**
     * constructor for specifying a CD and an error list as a result of , and generating an instance. (For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode result code<br />結果コード
     * @param errorList error list<br />エラーリスト
     */
    public ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        this.resultCode = resultCode;
        this.errorList = errorList;
    }
    
    /**
     * Getter method for resultCode.
     *
     * @return result code<br />結果コード
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Setter method for resultCode.
     *
     * @param resultCode result code<br />結果コード に設定する
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * Getter method for errorList.
     *
     * @return error list<br />エラーリスト
     */
    public List<ErrorListItemDomain> getErrorList() {
        return errorList;
    }

    /**
     * Setter method for errorList.
     *
     * @param errorList error list<br />エラーリスト に設定する
     */
    public void setErrorList(List<ErrorListItemDomain> errorList) {
        this.errorList = errorList;
    }
}
