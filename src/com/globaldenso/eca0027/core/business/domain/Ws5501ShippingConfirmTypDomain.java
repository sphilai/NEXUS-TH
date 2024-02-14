package com.globaldenso.eca0027.core.business.domain;

/**
 * <p>
 * This is the domain that contains the shipment confirmation No.<BR>
 * 出荷確認Noを格納するドメインです。
 * </p>
 *
 * @version 1.00
 */
public class Ws5501ShippingConfirmTypDomain {

    /**
     * <p>
     * Shipping confirm type<BR>
     * 処理実績区分
     * </p>
     */
    private String bhtShippingConfirmTyp;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws5501ShippingConfirmTypDomain() {
    }

    /**
     * <p>
     * getter method of Shipping confirm type<BR>
     * Shipping confirm type のゲッターメソッドです。
     * </p>
     *
     * @return Shipping confirm type
     */
    public String getBhtShippingConfirmTyp() {
        return bhtShippingConfirmTyp;
    }

    /**
     * <p>
     * setter method of Shipping confirm type<BR>
     * Shipping confirm type のセッターメソッドです。
     * </p>
     *
     * @param bhtShippingConfirmTyp Shipping confirm type に設定する
     */
    public void setBhtShippingConfirmTyp(String bhtShippingConfirmTyp) {
        this.bhtShippingConfirmTyp = bhtShippingConfirmTyp;
    }

}
