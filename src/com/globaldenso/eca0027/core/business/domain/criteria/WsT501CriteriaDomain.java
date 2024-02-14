package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * It is the input domain of FacadeService of WsT501.<BR>
 * WsT501のFacadeサービスの入力用ドメインです。
 * </p>
 *
 * @version 1.00
 */
public class WsT501CriteriaDomain extends AbstractDomain {
    
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
     * DSC-ID of manager<BR>
     * マネージャのDSC-ID
     * </p>
     */
    private String mgrDscId;
    
    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public WsT501CriteriaDomain() {
    }
    
    /**
     * <p>
     * Constructor for creating an instance of the Web Service parameters.<BR>
     * Webサービスのパラメータからインスタンスを生成するためのコンストラクタです。
     * </p>
     *
     * @param dscId
     *            DSC-ID of BHT user   (呼出元ユーザのDSC-ID)
     * @param mgrDscId 
     *            DSC-ID of manager   (マネージャのDSC-ID)
     */
    public WsT501CriteriaDomain(String dscId, String mgrDscId) {
        this.dscId = dscId;
        this.mgrDscId = mgrDscId;
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
     * @param dscId dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * <p>
     * getter method of DSC-ID of manager<BR>
     * マネージャのDSC-ID のゲッターメソッドです。
     * </p>
     *
     * @return DSC-ID of manager   (マネージャのDSC-ID)
     */
    public String getMgrDscId() {
        return mgrDscId;
    }

    /**
     * <p>
     * setter method of DSC-ID of manager<BR>
     * マネージャのDSC-ID のセッターメソッドです。
     * </p>
     *
     * @param mgrDscId マネージャのDSC-ID に設定する
     */
    public void setMgrDscId(String mgrDscId) {
        this.mgrDscId = mgrDscId;
    }
}
