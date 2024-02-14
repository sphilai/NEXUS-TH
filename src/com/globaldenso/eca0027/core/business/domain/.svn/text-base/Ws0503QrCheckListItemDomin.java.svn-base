package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * <p>
 * The domain to store the result of repeated information Ws0503.<BR>
 * Ws0503の繰り返し結果情報を格納するドメインです。
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws0503QrCheckListItemDomin extends ResultDomain implements
        Serializable {

    /**
     * <p>フィールドの役割を記述してください。</p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Result code<BR>
     * 結果コード
     * </p>
     */
    private String resultCode;
    
    /**
     * <p>
     * Function id<BR>
     * 機能ID
     * </p>
     */
    private String functionId;
    
    /**
     * <p>
     * QR type code<BR>
     * QR種別コード
     * </p>
     */
    private String qrTypCd;
    
    /**
     * <p>
     * Length<BR>
     * データ長
     * </p>
     */
    private String qrLength;

    /**
     * <p>
     * QR Check Detailed Information List<BR>
     * QRチェック詳細情報リスト
     * </p>
     */
    @XmlElementWrapper
    @XmlElement(name = "qrCheckDetailListItem")
    private List<Ws0503QrCheckDetailListItemDomain> qrCheckDetailList;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws0503QrCheckListItemDomin() {
    }

    /**
     * <p>
     * getter method of Result code<BR>
     * 結果コードのゲッターメソッドです。
     * </p>
     *
     * @return Result code   (結果コード)
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * <p>
     * setter method of Result code<BR>
     * 結果コードのセッターメソッドです。
     * </p>
     *
     * @param resultCode 結果コード に設定する
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * <p>
     * getter method of Function id<BR>
     * 機能IDのゲッターメソッドです。
     * </p>
     *
     * @return Function id   (機能ID)
     */

    public String getFunctionId() {
        return functionId;
    }

    /**
     * <p>
     * setter method of Function id<BR>
     * 機能ID のセッターメソッドです。
     * </p>
     *
     * @param functionId 機能ID に設定する
     */
    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    /**
     * <p>
     * getter method of QR type code<BR>
     * QR種別コードのゲッターメソッドです。
     * </p>
     *
     * @return QR type code   (QR種別コード)
     */
    public String getQrTypCd() {
        return qrTypCd;
    }

    /**
     * <p>
     * setter method of QR type code<BR>
     * QR種別コード のセッターメソッドです。
     * </p>
     *
     * @param qrTypCd QR種別コード に設定する
     */
    public void setQrTypCd(String qrTypCd) {
        this.qrTypCd = qrTypCd;
    }

    /**
     * <p>
     * getter method of Length<BR>
     * データ長のゲッターメソッドです。
     * </p>
     *
     * @return Length   (データ長)
     */
    public String getQrLength() {
        return qrLength;
    }

    /**
     * <p>
     * setter method of Length<BR>
     * データ長 のセッターメソッドです。
     * </p>
     *
     * @param qrLength データ長 に設定する
     */
    public void setQrLength(String qrLength) {
        this.qrLength = qrLength;
    }

    /**
     * <p>
     * getter method of QR Check Detailed Information List<BR>
     * QRチェック詳細情報リスト のゲッターメソッドです。
     * </p>
     *
     * @return QR Check Detailed Information List   (QRチェック詳細情報リスト)
     */
    public List<Ws0503QrCheckDetailListItemDomain> getQrCheckList() {
        return qrCheckDetailList;
    }

    /**
     * <p>
     * setter method of QR Check Detailed Information List<BR>
     * QRチェック詳細情報リスト のセッターメソッドです。
     * </p>
     *
     * @param qrCheckDetailList QRチェック詳細情報リスト に設定する
     */
    public void setQrCheckList(
            List<Ws0503QrCheckDetailListItemDomain> qrCheckDetailList) {
        this.qrCheckDetailList = qrCheckDetailList;
    }

}
