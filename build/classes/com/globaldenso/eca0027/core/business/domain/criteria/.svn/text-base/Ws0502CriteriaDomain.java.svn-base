package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * It is the input domain of FacadeService of Ws0502.<BR>
 * Ws0502のFacadeサービスの入力用ドメインです。
 * </p>
 *
 * @version 1.00
 */
public class Ws0502CriteriaDomain extends AbstractDomain {

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
     * Pin code before the change<BR>
     * 変更前PINコード
     * </p>
     */
    private String oldPinCode;

    /**
     * <p>
     * Pin code after the change<BR>
     * 変更後PINコード
     * </p>
     */
    private String newPinCode;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws0502CriteriaDomain() {
    }
    
    /**
     * <p>
     * Constructor for creating an instance of the Web Service parameters.<BR>
     * Webサービスのパラメータからインスタンスを生成するためのコンストラクタです。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (呼出元ユーザのDSC-ID)
     * @param oldPinCode
     *            Pin code before the change   (変更前PINコード)
     * @param newPinCode
     *            Pin code after the change   (変更後PINコード)
     * @param screenId
     *            Screen ID   (画面ID)
     */
    public Ws0502CriteriaDomain(String dscId, String oldPinCode,
            String newPinCode, String screenId) {
        this.dscId = dscId;
        this.oldPinCode = oldPinCode;
        this.newPinCode = newPinCode;
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
     * getter method of Pin code before the change<BR>
     * 変更前PINコード のゲッターメソッドです。
     * </p>
     *
     * @return 変更前PINコード
     */
    public String getOldPinCode() {
        return oldPinCode;
    }

    /**
     * <p>
     * setter method of Pin code before the change<BR>
     * 変更前PINコード のセッターメソッドです。
     * </p>
     *
     * @param oldPinCode
     *            変更前PINコード に設定する
     */
    public void setOldPinCode(String oldPinCode) {
        this.oldPinCode = oldPinCode;
    }

    /**
     * <p>
     * getter method of Pin code after the change<BR>
     * 変更後PINコード のゲッターメソッドです。
     * </p>
     *
     * @return 変更後PINコード
     */
    public String getNewPinCode() {
        return newPinCode;
    }

    /**
     * <p>
     * setter method of Pin code after the change<BR>
     * 変更後PINコード のセッターメソッドです。
     * </p>
     *
     * @param newPinCode
     *            変更後PINコード に設定する
     */
    public void setNewPinCode(String newPinCode) {
        this.newPinCode = newPinCode;
    }

}