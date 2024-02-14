/*
 * PROJECT：eca0027
 * 
 * TmBhtResourceFile のDomainクラス
 * テーブル概要：TM_BHT_RESOURCE_FILE
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.sql.Timestamp;

/**
 * TmBhtResourceFile のDomainクラスです。<BR>
 * テーブル概要：TM_BHT_RESOURCE_FILE<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class TmBhtResourceFileDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * CNTRY_CD
     */
    private String cntryCd;

    /**
     * APLY_STRT_DT
     */
    private Date aplyStrtDt;

    /**
     * DEVICE_TYP_ID
     */
    private String deviceTypId;

    /**
     * LNG_CD
     */
    private String lngCd;

    /**
     * MAIN_RESOUCE_DLL
     */
    private byte[] mainResouceDll;

    /**
     * PLTZ_RESOUCE_DLL
     */
    private byte[] pltzResouceDll;

    /**
     * CARRY_I_O_RESOUCE_DLL
     */
    private byte[] carryIOResouceDll;

    /**
     * SHIPPING_RESOUCE_DLL
     */
    private byte[] shippingResouceDll;

    /**
     * SETTINGS_RESOUCE_DLL
     */
    private byte[] settingsResouceDll;

    /**
     * COMMON_RESOUCE_DLL
     */
    private byte[] commonResouceDll;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;

    /**
     * デフォルトコンストラクタ。
     */
    public TmBhtResourceFileDomain() {
    }

    /**
     * cntryCd のゲッターメソッドです。
     * 
     * @return the cntryCd
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * cntryCd のセッターメソッドです。
     * 
     * @param cntryCd cntryCd に設定する
     */
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    /**
     * aplyStrtDt のゲッターメソッドです。
     * 
     * @return the aplyStrtDt
     */
    public Date getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * aplyStrtDt のセッターメソッドです。
     * 
     * @param aplyStrtDt aplyStrtDt に設定する
     */
    public void setAplyStrtDt(Date aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

    /**
     * deviceTypId のゲッターメソッドです。
     * 
     * @return the deviceTypId
     */
    public String getDeviceTypId() {
        return deviceTypId;
    }

    /**
     * deviceTypId のセッターメソッドです。
     * 
     * @param deviceTypId deviceTypId に設定する
     */
    public void setDeviceTypId(String deviceTypId) {
        this.deviceTypId = deviceTypId;
    }

    /**
     * lngCd のゲッターメソッドです。
     * 
     * @return the lngCd
     */
    public String getLngCd() {
        return lngCd;
    }

    /**
     * lngCd のセッターメソッドです。
     * 
     * @param lngCd lngCd に設定する
     */
    public void setLngCd(String lngCd) {
        this.lngCd = lngCd;
    }

    /**
     * mainResouceDll のゲッターメソッドです。
     * 
     * @return the mainResouceDll
     */
    public byte[] getMainResouceDll() {
        return mainResouceDll;
    }

    /**
     * mainResouceDll のセッターメソッドです。
     * 
     * @param mainResouceDll mainResouceDll に設定する
     */
    public void setMainResouceDll(byte[] mainResouceDll) {
        this.mainResouceDll = mainResouceDll;
    }

    /**
     * pltzResouceDll のゲッターメソッドです。
     * 
     * @return the pltzResouceDll
     */
    public byte[] getPltzResouceDll() {
        return pltzResouceDll;
    }

    /**
     * pltzResouceDll のセッターメソッドです。
     * 
     * @param pltzResouceDll pltzResouceDll に設定する
     */
    public void setPltzResouceDll(byte[] pltzResouceDll) {
        this.pltzResouceDll = pltzResouceDll;
    }

    /**
     * carryIOResouceDll のゲッターメソッドです。
     * 
     * @return the carryIOResouceDll
     */
    public byte[] getCarryIOResouceDll() {
        return carryIOResouceDll;
    }

    /**
     * carryIOResouceDll のセッターメソッドです。
     * 
     * @param carryIOResouceDll carryIOResouceDll に設定する
     */
    public void setCarryIOResouceDll(byte[] carryIOResouceDll) {
        this.carryIOResouceDll = carryIOResouceDll;
    }

    /**
     * shippingResouceDll のゲッターメソッドです。
     * 
     * @return the shippingResouceDll
     */
    public byte[] getShippingResouceDll() {
        return shippingResouceDll;
    }

    /**
     * shippingResouceDll のセッターメソッドです。
     * 
     * @param shippingResouceDll shippingResouceDll に設定する
     */
    public void setShippingResouceDll(byte[] shippingResouceDll) {
        this.shippingResouceDll = shippingResouceDll;
    }

    /**
     * settingsResouceDll のゲッターメソッドです。
     * 
     * @return the settingsResouceDll
     */
    public byte[] getSettingsResouceDll() {
        return settingsResouceDll;
    }

    /**
     * settingsResouceDll のセッターメソッドです。
     * 
     * @param settingsResouceDll settingsResouceDll に設定する
     */
    public void setSettingsResouceDll(byte[] settingsResouceDll) {
        this.settingsResouceDll = settingsResouceDll;
    }

    /**
     * commonResouceDll のゲッターメソッドです。
     * 
     * @return the commonResouceDll
     */
    public byte[] getCommonResouceDll() {
        return commonResouceDll;
    }

    /**
     * commonResouceDll のセッターメソッドです。
     * 
     * @param commonResouceDll commonResouceDll に設定する
     */
    public void setCommonResouceDll(byte[] commonResouceDll) {
        this.commonResouceDll = commonResouceDll;
    }

    /**
     * comUpdateFuncId のゲッターメソッドです。
     * 
     * @return the comUpdateFuncId
     */
    public String getComUpdateFuncId() {
        return comUpdateFuncId;
    }

    /**
     * comUpdateFuncId のセッターメソッドです。
     * 
     * @param comUpdateFuncId comUpdateFuncId に設定する
     */
    public void setComUpdateFuncId(String comUpdateFuncId) {
        this.comUpdateFuncId = comUpdateFuncId;
    }

    /**
     * comUpdateUserId のゲッターメソッドです。
     * 
     * @return the comUpdateUserId
     */
    public String getComUpdateUserId() {
        return comUpdateUserId;
    }

    /**
     * comUpdateUserId のセッターメソッドです。
     * 
     * @param comUpdateUserId comUpdateUserId に設定する
     */
    public void setComUpdateUserId(String comUpdateUserId) {
        this.comUpdateUserId = comUpdateUserId;
    }

    /**
     * comUpdateTimestamp のゲッターメソッドです。
     * 
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * comUpdateTimestamp のセッターメソッドです。
     * 
     * @param comUpdateTimestamp comUpdateTimestamp に設定する
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }

    /**
     * comCreateFuncId のゲッターメソッドです。
     * 
     * @return the comCreateFuncId
     */
    public String getComCreateFuncId() {
        return comCreateFuncId;
    }

    /**
     * comCreateFuncId のセッターメソッドです。
     * 
     * @param comCreateFuncId comCreateFuncId に設定する
     */
    public void setComCreateFuncId(String comCreateFuncId) {
        this.comCreateFuncId = comCreateFuncId;
    }

    /**
     * comCreateUserId のゲッターメソッドです。
     * 
     * @return the comCreateUserId
     */
    public String getComCreateUserId() {
        return comCreateUserId;
    }

    /**
     * comCreateUserId のセッターメソッドです。
     * 
     * @param comCreateUserId comCreateUserId に設定する
     */
    public void setComCreateUserId(String comCreateUserId) {
        this.comCreateUserId = comCreateUserId;
    }

    /**
     * comCreateTimestamp のゲッターメソッドです。
     * 
     * @return the comCreateTimestamp
     */
    public Timestamp getComCreateTimestamp() {
        return comCreateTimestamp;
    }

    /**
     * comCreateTimestamp のセッターメソッドです。
     * 
     * @param comCreateTimestamp comCreateTimestamp に設定する
     */
    public void setComCreateTimestamp(Timestamp comCreateTimestamp) {
        this.comCreateTimestamp = comCreateTimestamp;
    }

}
