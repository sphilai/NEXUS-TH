/*
 * 更新日 開発会社名 更新内容
 * 2013/11/07 XXXXXXXXXXX 新規作成
 *
 * (c) Copyright XXXXXXXXXXX. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * It is the input domain of FacadeService of Ws5501.<BR>
 * Ws5501のFacadeサービスの入力用ドメインです。
 * </p>
 *
 * @version 1.00
 */
public class Ws5501CriteriaDomain extends AbstractDomain {

    /**
     * <p>
     * Serial version ID<BR>
     * シリアルバージョンID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * DSC-ID of BHT user<BR>
     * 呼出元ユーザのDSC-ID
     * </p>
     */
    private String dscId;

    /**
     * <p>
     * Shipping confirm No<BR>
     * 出荷確認No
     * </p>
     */
    private String shippingConfirmNo;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws5501CriteriaDomain() {
    }
    
    /**
     * <p>
     * Constructor for creating an instance of the Web Service parameters.<BR>
     * Webサービスのパラメータからインスタンスを生成するためのコンストラクタです。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (呼出元ユーザのDSC-ID)
     * @param shippingConfirmNo
     *            Shipping confirm No   (出荷確認No)
     */
    public Ws5501CriteriaDomain(String dscId, String shippingConfirmNo) {
        this.dscId = dscId;
        this.shippingConfirmNo = shippingConfirmNo;
    }

    /**
     * <p>
     * getter method of DSC-ID of BHT user<BR>
     * 呼出元ユーザのDSC-ID のゲッターメソッドです。
     * </p>
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * <p>
     * setter method of DSC-ID of BHT user<BR>
     * 呼出元ユーザのDSC-ID のセッターメソッドです。
     * </p>
     *
     * @param dscId
     *            dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * <p>
     * getter method of Shipping confirm No<BR>
     * 出荷確認No のゲッターメソッドです。
     * </p>
     *
     * @return Shipping confirm No   (出荷確認No)
     */
    public String getShippingConfirmNo() {
        return shippingConfirmNo;
    }

    /**
     * <p>
     * setter method of Shipping confirm No<BR>
     * 出荷確認No のセッターメソッドです。
     * </p>
     *
     * @param shippingConfirmNo
     *            出荷確認No に設定する
     */
    public void setShippingConfirmNo(String shippingConfirmNo) {
        this.shippingConfirmNo = shippingConfirmNo;
    }
}
