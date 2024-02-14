package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * It is the input domain of Facade service of Ws5502.<BR>
 * Ws5502のFacadeサービスの入力用ドメインです。
 * </p>
 *
 * @version 1.00
 */
public class Ws5502CriteriaDomain extends AbstractDomain {

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
     * 出荷確認No.取得
     * </p>
     */
    private String shippNo;

    /**
     * <p>
     * Shipping action type<BR>
     * 出荷実績手段区分
     * </p>
     */
    private String sdankubu;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws5502CriteriaDomain() {
    }
    
    /**
     * <p>
     * Constructor for creating an instance of the Web Service parameters.<BR>
     * Webサービスのパラメータからインスタンスを生成するためのコンストラクタです。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (呼出元ユーザのDSC-ID)
     * @param shippNo
     *            Shipping confirm No   (出荷確認No)
     * @param sdankubu
     *            Shipping action type   (出荷実績手段区分)
     * @param screenId
     *            Screen ID   (画面ID)
     */
    public Ws5502CriteriaDomain(String dscId, String shippNo, String sdankubu, String screenId) {
        this.dscId = dscId;
        this.shippNo = shippNo;
        this.sdankubu = sdankubu;
        setScreenId(screenId);
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
     * 出荷確認No.取得 のゲッターメソッドです。
     * </p>
     *
     * @return Shipping confirm No   (出荷確認No)
     */
    public String getShippNo() {
        return shippNo;
    }

    /**
     * <p>
     * setter method of Shipping confirm No<BR>
     * 出荷確認No.取得 のセッターメソッドです。
     * </p>
     *
     * @param shippNo
     *            出荷確認Noに設定する
     */
    public void setShippNo(String shippNo) {
        this.shippNo = shippNo;
    }

    /**
     * <p>
     * getter method of Shipping action type<BR>
     * 出荷実績手段区分のゲッターメソッドです。
     * </p>
     *
     * @return Shipping action type   (出荷実績手段区分)
     */
    public String getSdankubu() {
        return sdankubu;
    }

    /**
     * <p>
     * setter method of Shipping action type<BR>
     * 出荷実績手段区分 のセッターメソッドです。
     * </p>
     *
     * @param sdankubu
     *            出荷実績手段区分に設定する
     */
    public void setSdankubu(String sdankubu) {
        this.sdankubu = sdankubu;

    }

}