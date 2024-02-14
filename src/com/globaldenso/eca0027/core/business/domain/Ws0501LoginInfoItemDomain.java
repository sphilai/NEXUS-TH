package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.List;

import com.globaldenso.eca0027.core.auto.business.domain.TmBhtLockMsgMgtDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 *
 * <p>
 * This is the domain that holds the information of login authentication and BHT application version 
 * check.<BR>
 * ログイン認証、BHTアプリバージョンチェックの情報を保持するドメインです。
 * </p>
 *
 * @version 1.00
 */
public class Ws0501LoginInfoItemDomain extends AbstractDomain implements
        Serializable {

    /**
     * <p>
     * Serial version ID<BR>
     * シリアルバージョンID
     * </p>
     */
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * Result code
     * </p>
     */
    private String resultCode;

    /**
     * <p>
     * Update flag
     * </p>
     */
    private String updateFlg;

    /**
     * <p>
     * Main exe module
     * </p>
     */
    private byte[] mainExe;

    /**
     * <p>
     * Palletize dll module
     * </p>
     */
    private byte[] palletizeDll;

    /**
     * <p>
     * Carry Out/In dll module
     * </p>
     */
    private byte[] carryInOutDll;

    /**
     * <p>
     * Staging/Shipping dll module
     * </p>
     */
    private byte[] shippingDll;

    /**
     * <p>
     * Settings dll module
     * </p>
     */
    private byte[] settingsDll;

    /**
     * <p>
     * Common dll module
     * </p>
     */
    private byte[] commonDll;

    /**
     * <p>
     * Resource module list
     * </p>
     */
    private List<Ws0501ResourceDomain> resourceList;

    /**
     * <p>
     * BHT lock message list
     * </p>
     */
    private List<TmBhtLockMsgMgtDomain> tmBhtLockMsgMgtList;

   /**
    * <p>
    * Default constructor<BR>
    * デフォルトコンストラクタ。
    * </p>
    */
    public Ws0501LoginInfoItemDomain() {
    }

    /**
     * <p>
     * getter method of Result code<BR>
     * Result code のゲッターメソッドです。
     * </p>
     *
     * @return Result code
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * <p>
     * setter method of Result code<BR>
     * Result code のセッターメソッドです。
     * </p>
     *
     * @param resultCode Result code に設定する
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * <p>
     * getter method of Update flag<BR>
     * Update flag のゲッターメソッドです。
     * </p>
     *
     * @return Update flag
     */
    public String getUpdateFlg() {
        return updateFlg;
    }

    /**
     * <p>
     * setter method of Update flag<BR>
     * Update flag のセッターメソッドです。
     * </p>
     *
     * @param updateFlg Update flag に設定する
     */
    public void setUpdateFlg(String updateFlg) {
        this.updateFlg = updateFlg;
    }

    /**
     * <p>
     * getter method of Main exe module<BR>
     * Main exe module のゲッターメソッドです。
     * </p>
     *
     * @return Main exe module
     */
    public byte[] getMainExe() {
        return mainExe;
    }

    /**
     * <p>
     * setter method of Main exe module<BR>
     * Main exe module のセッターメソッドです。
     * </p>
     *
     * @param mainExe Main exe module に設定する
     */
    public void setMainExe(byte[] mainExe) {
        this.mainExe = mainExe;
    }

    /**
     * <p>
     * getter method of Palletize dll module<BR>
     * Palletize dll module のゲッターメソッドです。
     * </p>
     *
     * @return Palletize dll module
     */
    public byte[] getPalletizeDll() {
        return palletizeDll;
    }

    /**
     * <p>
     * setter method of Palletize dll module<BR>
     * Palletize dll module のセッターメソッドです。
     * </p>
     *
     * @param palletizeDll Palletize dll module に設定する
     */
    public void setPalletizeDll(byte[] palletizeDll) {
        this.palletizeDll = palletizeDll;
    }

    /**
     * <p>
     * getter method of Carry Out/In dll module<BR>
     * Carry Out/In dll module のゲッターメソッドです。
     * </p>
     *
     * @return Carry Out/In dll module
     */
    public byte[] getCarryInOutDll() {
        return carryInOutDll;
    }

    /**
     * <p>
     * setter method of Carry Out/In dll module<BR>
     * Carry Out/In dll module のセッターメソッドです。
     * </p>
     *
     * @param carryInOutDll Carry Out/In dll module に設定する
     */
    public void setCarryInOutDll(byte[] carryInOutDll) {
        this.carryInOutDll = carryInOutDll;
    }

    /**
     * <p>
     * getter method of Staging/Shipping dll module<BR>
     * Staging/Shipping dll module のゲッターメソッドです。
     * </p>
     *
     * @return Staging/Shipping dll module
     */
    public byte[] getShippingDll() {
        return shippingDll;
    }

    /**
     * <p>
     * setter method of Staging/Shipping dll module<BR>
     * Staging/Shipping dll module のセッターメソッドです。
     * </p>
     *
     * @param shippingDll Staging/Shipping dll module に設定する
     */
    public void setShippingDll(byte[] shippingDll) {
        this.shippingDll = shippingDll;
    }

    /**
     * <p>
     * getter method of Settings dll module<BR>
     * Settings dll module のゲッターメソッドです。
     * </p>
     *
     * @return Settings dll module
     */
    public byte[] getSettingsDll() {
        return settingsDll;
    }

    /**
     * <p>
     * setter method of Settings dll module<BR>
     * Settings dll module のセッターメソッドです。
     * </p>
     *
     * @param settingsDll Settings dll module に設定する
     */
    public void setSettingsDll(byte[] settingsDll) {
        this.settingsDll = settingsDll;
    }

    /**
     * <p>
     * getter method of Common dll module<BR>
     * Common dll module のゲッターメソッドです。
     * </p>
     *
     * @return Common dll module
     */
    public byte[] getCommonDll() {
        return commonDll;
    }

    /**
     * <p>
     * setter method of Common dll module<BR>
     * Common dll module のセッターメソッドです。
     * </p>
     *
     * @param commonDll Common dll module に設定する
     */
    public void setCommonDll(byte[] commonDll) {
        this.commonDll = commonDll;
    }

    /**
     * <p>
     * getter method of Resource module list<BR>
     * Resource module list のゲッターメソッドです。
     * </p>
     *
     * @return Resource module list
     */
    public List<Ws0501ResourceDomain> getResourceList() {
        return resourceList;
    }

    /**
     * <p>
     * setter method of Resource module list<BR>
     * Resource module list のセッターメソッドです。
     * </p>
     *
     * @param resourceList Resource module list に設定する
     */
    public void setResourceList(List<Ws0501ResourceDomain> resourceList) {
        this.resourceList = resourceList;
    }

    /**
     * <p>
     * getter method of BHT lock message list<BR>
     * BHT lock message list のゲッターメソッドです。
     * </p>
     *
     * @return BHT lock message list
     */
    public List<TmBhtLockMsgMgtDomain> getTmBhtLockMsgMgtList() {
        return tmBhtLockMsgMgtList;
    }

    /**
     * <p>
     * setter method of BHT lock message list<BR>
     * BHT lock message list のセッターメソッドです。
     * </p>
     *
     * @param tmBhtLockMsgMgtList BHT lock message list に設定する
     */
    public void setTmBhtLockMsgMgtList(
            List<TmBhtLockMsgMgtDomain> tmBhtLockMsgMgtList) {
        this.tmBhtLockMsgMgtList = tmBhtLockMsgMgtList;
    }
}
