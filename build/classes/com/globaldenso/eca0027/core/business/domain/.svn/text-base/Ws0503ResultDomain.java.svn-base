package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * <p>
 * The domain class that represents the return value of the Ws0503.<BR>
 * Ws0503の戻り値を表すドメインクラスです。
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws0503ResultDomain extends ResultDomain implements Serializable {

    /**
     * <p>
     * Serial version ID<BR>
     * シリアルバージョンID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * QR check item list<BR>
     * QRチェック項目リスト
     * </p>
     */
    @XmlElementWrapper
    @XmlElement(name = "qrCheckListItem")
    private List<Ws0503QrCheckListItemDomin> qrCheckList;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタです。
     * </p>
     *
     */
    public Ws0503ResultDomain() {
        super();
    }

    /**
     * <p>
     * The constructor for creating an instance by specifying the code results (Normal use).<BR>
     * 結果コードを指定してインスタンスを生成するためのコンストラクタです（正常用）。
     * </p>
     *
     * @param resultCode
     *            (結果コード)
     */
    public Ws0503ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * <p>
     * The constructor for creating an instance by specifying the error code list and results (Errors).<BR>
     * 結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです（エラー用）。
     * </p>
     *
     * @param resultCode
     *            (結果コード)
     * @param errorList
     *            (エラーリスト)
     */
    public Ws0503ResultDomain(String resultCode,
            List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * <p>
     * getter method of QR check item list<BR>
     * QR check item list のゲッターメソッドです。
     * </p>
     *
     * @return QR check item list
     */
    public List<Ws0503QrCheckListItemDomin> getQrCheckList() {
        return qrCheckList;
    }

    /**
     * <p>
     * setter method of QR check item list<BR>
     * QR check item list のセッターメソッドです。
     * </p>
     *
     * @param qrCheckList QR check item list に設定する
     */
    public void setQrCheckList(List<Ws0503QrCheckListItemDomin> qrCheckList) {
        this.qrCheckList = qrCheckList;
    }
}
