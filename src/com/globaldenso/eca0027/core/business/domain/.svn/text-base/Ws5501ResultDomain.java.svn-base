package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * <p>
 * The domain class that represents the return value of the Ws5501.<BR>
 * Ws5501の戻り値を表すドメインクラスです。
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "result")
public class Ws5501ResultDomain extends ResultDomain implements Serializable {

    /**
     * <p>
     * Serial version ID<BR>
     * シリアルバージョンID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Shipping confirm type Domain<BR>
     * 処理実績区分ドメイン
     * </p>
     */
    private Ws5501ShippingConfirmTypDomain shippingConfirmTyp;

    /**
     * <p>
     * Shipping confirm Header Domain<BR>
     * 出荷確認情報ドメイン
     * </p>
     */
    private Ws5501ShippingConfirmDomain shippingConfirmHeader;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタです。
     * </p>
     *
     */
    public Ws5501ResultDomain() {
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
    public Ws5501ResultDomain(String resultCode) {
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
    public Ws5501ResultDomain(String resultCode,
            List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * <p>
     * getter method of Shipping confirm type Domain<BR>
     * Shipping confirm type Domain のゲッターメソッドです。
     * </p>
     *
     * @return Shipping confirm type Domain
     */
    public Ws5501ShippingConfirmTypDomain getShippingConfirmTyp() {
        return shippingConfirmTyp;
    }

    /**
     * <p>
     * setter method of Shipping confirm type Domain<BR>
     * Shipping confirm type Domain のセッターメソッドです。
     * </p>
     *
     * @param shippingConfirmTyp Shipping confirm type Domain に設定する
     */
    public void setShippingConfirmTyp(
            Ws5501ShippingConfirmTypDomain shippingConfirmTyp) {
        this.shippingConfirmTyp = shippingConfirmTyp;
    }

    /**
     * <p>
     * getter method of Shipping confirm Header Domain<BR>
     * Shipping confirm Header Domain のゲッターメソッドです。
     * </p>
     *
     * @return Shipping confirm Header Domain
     */
    public Ws5501ShippingConfirmDomain getShippingConfirmHeader() {
        return shippingConfirmHeader;
    }

    /**
     * <p>
     * setter method of Shipping confirm Header Domain<BR>
     * Shipping confirm Header Domain のセッターメソッドです。
     * </p>
     *
     * @param shippingConfirmHeader Shipping confirm Header Domain に設定する
     */
    public void setShippingConfirmHeader(
            Ws5501ShippingConfirmDomain shippingConfirmHeader) {
        this.shippingConfirmHeader = shippingConfirmHeader;
    }

}
