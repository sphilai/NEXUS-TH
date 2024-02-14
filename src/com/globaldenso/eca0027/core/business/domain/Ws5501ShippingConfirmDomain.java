package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * <p>
 * This is the domain that holds the search result information of shipment confirmation information.<BR>
 * 出荷確認情報の検索結果情報を保持するドメインです。
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws5501ShippingConfirmDomain {

    /**
     * <p>
     * Shipping confirm No
     * </p>
     */
    private String shippingConfirmNo;

    /**
     * <p>
     * Staging action No
     * </p>
     */
    private String stgActNo;

    /**
     * <p>
     * Staging instruction No
     * </p>
     */
    private String stgInstrNo;

    /**
     * <p>
     * Staging detail item
     * </p>
     */
    @XmlElementWrapper
    @XmlElement(name = "stagingDetailItem")
    private List<Ws5501MainMarkDomain> stagingDetail;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws5501ShippingConfirmDomain() {
    }

    /**
     * <p>
     * getter method of Shipping confirm No<BR>
     * Shipping confirm No のゲッターメソッドです。
     * </p>
     *
     * @return Shipping confirm No
     */
    public String getShippingConfirmNo() {
        return shippingConfirmNo;
    }

    /**
     * <p>
     * setter method of Shipping confirm No<BR>
     * Shipping confirm No のセッターメソッドです。
     * </p>
     *
     * @param shippingConfirmNo Shipping confirm No に設定する
     */
    public void setShippingConfirmNo(String shippingConfirmNo) {
        this.shippingConfirmNo = shippingConfirmNo;
    }

    /**
     * <p>
     * getter method of Staging action No<BR>
     * Staging action No のゲッターメソッドです。
     * </p>
     *
     * @return Staging action No
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * <p>
     * setter method of Staging action No<BR>
     * Staging action No のセッターメソッドです。
     * </p>
     *
     * @param stgActNo Staging action No に設定する
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }

    /**
     * <p>
     * getter method of Staging instruction No<BR>
     * Staging instruction No のゲッターメソッドです。
     * </p>
     *
     * @return Staging instruction No
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * <p>
     * setter method of Staging instruction No<BR>
     * Staging instruction No のセッターメソッドです。
     * </p>
     *
     * @param stgInstrNo Staging instruction No に設定する
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * <p>
     * getter method of Staging detail item<BR>
     * Staging detail item のゲッターメソッドです。
     * </p>
     *
     * @return Staging detail item
     */
    public List<Ws5501MainMarkDomain> getStagingDetail() {
        return stagingDetail;
    }

    /**
     * <p>
     * setter method of Staging detail item<BR>
     * Staging detail item のセッターメソッドです。
     * </p>
     *
     * @param stagingDetail Staging detail item に設定する
     */
    public void setStagingDetail(List<Ws5501MainMarkDomain> stagingDetail) {
        this.stagingDetail = stagingDetail;
    }
}
