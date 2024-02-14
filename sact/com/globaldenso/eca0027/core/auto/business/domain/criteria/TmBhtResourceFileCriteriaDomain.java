/*
 * PROJECT：eca0027
 * 
 * TmBhtResourceFile の検索条件Domainクラス
 * テーブル概要：TM_BHT_RESOURCE_FILE
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.util.Date;
import java.sql.Timestamp;

/**
 * TmBhtResourceFile の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_BHT_RESOURCE_FILE<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 10985 $
 */
public class TmBhtResourceFileCriteriaDomain extends AbstractDomain implements Serializable {

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
     * CNTRY_CD（大なり）
     */
    private String cntryCdGreaterThan;

    /**
     * CNTRY_CD（大なりイコール）
     */
    private String cntryCdGreaterThanEqual;

    /**
     * CNTRY_CD（小なり）
     */
    private String cntryCdLessThan;

    /**
     * CNTRY_CD（小なりイコール）
     */
    private String cntryCdLessThanEqual;

    /**
     * CNTRY_CD（前方一致）
     */
    private String cntryCdLikeFront;

    /**
     * APLY_STRT_DT（大なりイコール）
     */
    private Date aplyStrtDtGreaterThanEqual;

    /**
     * APLY_STRT_DT（小なりイコール）
     */
    private Date aplyStrtDtLessThanEqual;

    /**
     * DEVICE_TYP_ID（大なり）
     */
    private String deviceTypIdGreaterThan;

    /**
     * DEVICE_TYP_ID（大なりイコール）
     */
    private String deviceTypIdGreaterThanEqual;

    /**
     * DEVICE_TYP_ID（小なり）
     */
    private String deviceTypIdLessThan;

    /**
     * DEVICE_TYP_ID（小なりイコール）
     */
    private String deviceTypIdLessThanEqual;

    /**
     * DEVICE_TYP_ID（前方一致）
     */
    private String deviceTypIdLikeFront;

    /**
     * LNG_CD（大なり）
     */
    private String lngCdGreaterThan;

    /**
     * LNG_CD（大なりイコール）
     */
    private String lngCdGreaterThanEqual;

    /**
     * LNG_CD（小なり）
     */
    private String lngCdLessThan;

    /**
     * LNG_CD（小なりイコール）
     */
    private String lngCdLessThanEqual;

    /**
     * LNG_CD（前方一致）
     */
    private String lngCdLikeFront;

    /**
     * COM_UPDATE_FUNC_ID（大なり）
     */
    private String comUpdateFuncIdGreaterThan;

    /**
     * COM_UPDATE_FUNC_ID（大なりイコール）
     */
    private String comUpdateFuncIdGreaterThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（小なり）
     */
    private String comUpdateFuncIdLessThan;

    /**
     * COM_UPDATE_FUNC_ID（小なりイコール）
     */
    private String comUpdateFuncIdLessThanEqual;

    /**
     * COM_UPDATE_FUNC_ID（前方一致）
     */
    private String comUpdateFuncIdLikeFront;

    /**
     * COM_UPDATE_USER_ID（大なり）
     */
    private String comUpdateUserIdGreaterThan;

    /**
     * COM_UPDATE_USER_ID（大なりイコール）
     */
    private String comUpdateUserIdGreaterThanEqual;

    /**
     * COM_UPDATE_USER_ID（小なり）
     */
    private String comUpdateUserIdLessThan;

    /**
     * COM_UPDATE_USER_ID（小なりイコール）
     */
    private String comUpdateUserIdLessThanEqual;

    /**
     * COM_UPDATE_USER_ID（前方一致）
     */
    private String comUpdateUserIdLikeFront;

    /**
     * COM_CREATE_FUNC_ID（大なり）
     */
    private String comCreateFuncIdGreaterThan;

    /**
     * COM_CREATE_FUNC_ID（大なりイコール）
     */
    private String comCreateFuncIdGreaterThanEqual;

    /**
     * COM_CREATE_FUNC_ID（小なり）
     */
    private String comCreateFuncIdLessThan;

    /**
     * COM_CREATE_FUNC_ID（小なりイコール）
     */
    private String comCreateFuncIdLessThanEqual;

    /**
     * COM_CREATE_FUNC_ID（前方一致）
     */
    private String comCreateFuncIdLikeFront;

    /**
     * COM_CREATE_USER_ID（大なり）
     */
    private String comCreateUserIdGreaterThan;

    /**
     * COM_CREATE_USER_ID（大なりイコール）
     */
    private String comCreateUserIdGreaterThanEqual;

    /**
     * COM_CREATE_USER_ID（小なり）
     */
    private String comCreateUserIdLessThan;

    /**
     * COM_CREATE_USER_ID（小なりイコール）
     */
    private String comCreateUserIdLessThanEqual;

    /**
     * COM_CREATE_USER_ID（前方一致）
     */
    private String comCreateUserIdLikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public TmBhtResourceFileCriteriaDomain() {
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

    /**
     * cntryCdGreaterThan のゲッターメソッドです。
     * 
     * @return the cntryCdGreaterThan
     */
    public String getCntryCdGreaterThan() {
        return cntryCdGreaterThan;
    }

    /**
     * cntryCdGreaterThan のセッターメソッドです。
     * 
     * @param cntryCdGreaterThan cntryCdGreaterThan に設定する
     */
    public void setCntryCdGreaterThan(String cntryCdGreaterThan) {
        this.cntryCdGreaterThan = cntryCdGreaterThan;
    }

    /**
     * cntryCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cntryCdGreaterThanEqual
     */
    public String getCntryCdGreaterThanEqual() {
        return cntryCdGreaterThanEqual;
    }

    /**
     * cntryCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param cntryCdGreaterThanEqual cntryCdGreaterThanEqual に設定する
     */
    public void setCntryCdGreaterThanEqual(String cntryCdGreaterThanEqual) {
        this.cntryCdGreaterThanEqual = cntryCdGreaterThanEqual;
    }

    /**
     * cntryCdLessThan のゲッターメソッドです。
     * 
     * @return the cntryCdLessThan
     */
    public String getCntryCdLessThan() {
        return cntryCdLessThan;
    }

    /**
     * cntryCdLessThan のセッターメソッドです。
     * 
     * @param cntryCdLessThan cntryCdLessThan に設定する
     */
    public void setCntryCdLessThan(String cntryCdLessThan) {
        this.cntryCdLessThan = cntryCdLessThan;
    }

    /**
     * cntryCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the cntryCdLessThanEqual
     */
    public String getCntryCdLessThanEqual() {
        return cntryCdLessThanEqual;
    }

    /**
     * cntryCdLessThanEqual のセッターメソッドです。
     * 
     * @param cntryCdLessThanEqual cntryCdLessThanEqual に設定する
     */
    public void setCntryCdLessThanEqual(String cntryCdLessThanEqual) {
        this.cntryCdLessThanEqual = cntryCdLessThanEqual;
    }

    /**
     * cntryCdLikeFront のゲッターメソッドです。
     * 
     * @return the cntryCdLikeFront
     */
    public String getCntryCdLikeFront() {
        return cntryCdLikeFront;
    }

    /**
     * cntryCdLikeFront のセッターメソッドです。
     * 
     * @param cntryCdLikeFront cntryCdLikeFront に設定する
     */
    public void setCntryCdLikeFront(String cntryCdLikeFront) {
        this.cntryCdLikeFront = cntryCdLikeFront;
    }

    /**
     * aplyStrtDtGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the aplyStrtDtGreaterThanEqual
     */
    public Date getAplyStrtDtGreaterThanEqual() {
        return aplyStrtDtGreaterThanEqual;
    }

    /**
     * aplyStrtDtGreaterThanEqual のセッターメソッドです。
     * 
     * @param aplyStrtDtGreaterThanEqual aplyStrtDtGreaterThanEqual に設定する
     */
    public void setAplyStrtDtGreaterThanEqual(Date aplyStrtDtGreaterThanEqual) {
        this.aplyStrtDtGreaterThanEqual = aplyStrtDtGreaterThanEqual;
    }

    /**
     * aplyStrtDtLessThanEqual のゲッターメソッドです。
     * 
     * @return the aplyStrtDtLessThanEqual
     */
    public Date getAplyStrtDtLessThanEqual() {
        return aplyStrtDtLessThanEqual;
    }

    /**
     * aplyStrtDtLessThanEqual のセッターメソッドです。
     * 
     * @param aplyStrtDtLessThanEqual aplyStrtDtLessThanEqual に設定する
     */
    public void setAplyStrtDtLessThanEqual(Date aplyStrtDtLessThanEqual) {
        this.aplyStrtDtLessThanEqual = aplyStrtDtLessThanEqual;
    }

    /**
     * deviceTypIdGreaterThan のゲッターメソッドです。
     * 
     * @return the deviceTypIdGreaterThan
     */
    public String getDeviceTypIdGreaterThan() {
        return deviceTypIdGreaterThan;
    }

    /**
     * deviceTypIdGreaterThan のセッターメソッドです。
     * 
     * @param deviceTypIdGreaterThan deviceTypIdGreaterThan に設定する
     */
    public void setDeviceTypIdGreaterThan(String deviceTypIdGreaterThan) {
        this.deviceTypIdGreaterThan = deviceTypIdGreaterThan;
    }

    /**
     * deviceTypIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the deviceTypIdGreaterThanEqual
     */
    public String getDeviceTypIdGreaterThanEqual() {
        return deviceTypIdGreaterThanEqual;
    }

    /**
     * deviceTypIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param deviceTypIdGreaterThanEqual deviceTypIdGreaterThanEqual に設定する
     */
    public void setDeviceTypIdGreaterThanEqual(String deviceTypIdGreaterThanEqual) {
        this.deviceTypIdGreaterThanEqual = deviceTypIdGreaterThanEqual;
    }

    /**
     * deviceTypIdLessThan のゲッターメソッドです。
     * 
     * @return the deviceTypIdLessThan
     */
    public String getDeviceTypIdLessThan() {
        return deviceTypIdLessThan;
    }

    /**
     * deviceTypIdLessThan のセッターメソッドです。
     * 
     * @param deviceTypIdLessThan deviceTypIdLessThan に設定する
     */
    public void setDeviceTypIdLessThan(String deviceTypIdLessThan) {
        this.deviceTypIdLessThan = deviceTypIdLessThan;
    }

    /**
     * deviceTypIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the deviceTypIdLessThanEqual
     */
    public String getDeviceTypIdLessThanEqual() {
        return deviceTypIdLessThanEqual;
    }

    /**
     * deviceTypIdLessThanEqual のセッターメソッドです。
     * 
     * @param deviceTypIdLessThanEqual deviceTypIdLessThanEqual に設定する
     */
    public void setDeviceTypIdLessThanEqual(String deviceTypIdLessThanEqual) {
        this.deviceTypIdLessThanEqual = deviceTypIdLessThanEqual;
    }

    /**
     * deviceTypIdLikeFront のゲッターメソッドです。
     * 
     * @return the deviceTypIdLikeFront
     */
    public String getDeviceTypIdLikeFront() {
        return deviceTypIdLikeFront;
    }

    /**
     * deviceTypIdLikeFront のセッターメソッドです。
     * 
     * @param deviceTypIdLikeFront deviceTypIdLikeFront に設定する
     */
    public void setDeviceTypIdLikeFront(String deviceTypIdLikeFront) {
        this.deviceTypIdLikeFront = deviceTypIdLikeFront;
    }

    /**
     * lngCdGreaterThan のゲッターメソッドです。
     * 
     * @return the lngCdGreaterThan
     */
    public String getLngCdGreaterThan() {
        return lngCdGreaterThan;
    }

    /**
     * lngCdGreaterThan のセッターメソッドです。
     * 
     * @param lngCdGreaterThan lngCdGreaterThan に設定する
     */
    public void setLngCdGreaterThan(String lngCdGreaterThan) {
        this.lngCdGreaterThan = lngCdGreaterThan;
    }

    /**
     * lngCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lngCdGreaterThanEqual
     */
    public String getLngCdGreaterThanEqual() {
        return lngCdGreaterThanEqual;
    }

    /**
     * lngCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param lngCdGreaterThanEqual lngCdGreaterThanEqual に設定する
     */
    public void setLngCdGreaterThanEqual(String lngCdGreaterThanEqual) {
        this.lngCdGreaterThanEqual = lngCdGreaterThanEqual;
    }

    /**
     * lngCdLessThan のゲッターメソッドです。
     * 
     * @return the lngCdLessThan
     */
    public String getLngCdLessThan() {
        return lngCdLessThan;
    }

    /**
     * lngCdLessThan のセッターメソッドです。
     * 
     * @param lngCdLessThan lngCdLessThan に設定する
     */
    public void setLngCdLessThan(String lngCdLessThan) {
        this.lngCdLessThan = lngCdLessThan;
    }

    /**
     * lngCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the lngCdLessThanEqual
     */
    public String getLngCdLessThanEqual() {
        return lngCdLessThanEqual;
    }

    /**
     * lngCdLessThanEqual のセッターメソッドです。
     * 
     * @param lngCdLessThanEqual lngCdLessThanEqual に設定する
     */
    public void setLngCdLessThanEqual(String lngCdLessThanEqual) {
        this.lngCdLessThanEqual = lngCdLessThanEqual;
    }

    /**
     * lngCdLikeFront のゲッターメソッドです。
     * 
     * @return the lngCdLikeFront
     */
    public String getLngCdLikeFront() {
        return lngCdLikeFront;
    }

    /**
     * lngCdLikeFront のセッターメソッドです。
     * 
     * @param lngCdLikeFront lngCdLikeFront に設定する
     */
    public void setLngCdLikeFront(String lngCdLikeFront) {
        this.lngCdLikeFront = lngCdLikeFront;
    }

    /**
     * comUpdateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThan
     */
    public String getComUpdateFuncIdGreaterThan() {
        return comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThan comUpdateFuncIdGreaterThan に設定する
     */
    public void setComUpdateFuncIdGreaterThan(String comUpdateFuncIdGreaterThan) {
        this.comUpdateFuncIdGreaterThan = comUpdateFuncIdGreaterThan;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdGreaterThanEqual
     */
    public String getComUpdateFuncIdGreaterThanEqual() {
        return comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdGreaterThanEqual comUpdateFuncIdGreaterThanEqual に設定する
     */
    public void setComUpdateFuncIdGreaterThanEqual(String comUpdateFuncIdGreaterThanEqual) {
        this.comUpdateFuncIdGreaterThanEqual = comUpdateFuncIdGreaterThanEqual;
    }

    /**
     * comUpdateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThan
     */
    public String getComUpdateFuncIdLessThan() {
        return comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThan comUpdateFuncIdLessThan に設定する
     */
    public void setComUpdateFuncIdLessThan(String comUpdateFuncIdLessThan) {
        this.comUpdateFuncIdLessThan = comUpdateFuncIdLessThan;
    }

    /**
     * comUpdateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLessThanEqual
     */
    public String getComUpdateFuncIdLessThanEqual() {
        return comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLessThanEqual comUpdateFuncIdLessThanEqual に設定する
     */
    public void setComUpdateFuncIdLessThanEqual(String comUpdateFuncIdLessThanEqual) {
        this.comUpdateFuncIdLessThanEqual = comUpdateFuncIdLessThanEqual;
    }

    /**
     * comUpdateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateFuncIdLikeFront
     */
    public String getComUpdateFuncIdLikeFront() {
        return comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateFuncIdLikeFront comUpdateFuncIdLikeFront に設定する
     */
    public void setComUpdateFuncIdLikeFront(String comUpdateFuncIdLikeFront) {
        this.comUpdateFuncIdLikeFront = comUpdateFuncIdLikeFront;
    }

    /**
     * comUpdateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThan
     */
    public String getComUpdateUserIdGreaterThan() {
        return comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThan comUpdateUserIdGreaterThan に設定する
     */
    public void setComUpdateUserIdGreaterThan(String comUpdateUserIdGreaterThan) {
        this.comUpdateUserIdGreaterThan = comUpdateUserIdGreaterThan;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdGreaterThanEqual
     */
    public String getComUpdateUserIdGreaterThanEqual() {
        return comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdGreaterThanEqual comUpdateUserIdGreaterThanEqual に設定する
     */
    public void setComUpdateUserIdGreaterThanEqual(String comUpdateUserIdGreaterThanEqual) {
        this.comUpdateUserIdGreaterThanEqual = comUpdateUserIdGreaterThanEqual;
    }

    /**
     * comUpdateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThan
     */
    public String getComUpdateUserIdLessThan() {
        return comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThan のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThan comUpdateUserIdLessThan に設定する
     */
    public void setComUpdateUserIdLessThan(String comUpdateUserIdLessThan) {
        this.comUpdateUserIdLessThan = comUpdateUserIdLessThan;
    }

    /**
     * comUpdateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLessThanEqual
     */
    public String getComUpdateUserIdLessThanEqual() {
        return comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comUpdateUserIdLessThanEqual comUpdateUserIdLessThanEqual に設定する
     */
    public void setComUpdateUserIdLessThanEqual(String comUpdateUserIdLessThanEqual) {
        this.comUpdateUserIdLessThanEqual = comUpdateUserIdLessThanEqual;
    }

    /**
     * comUpdateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comUpdateUserIdLikeFront
     */
    public String getComUpdateUserIdLikeFront() {
        return comUpdateUserIdLikeFront;
    }

    /**
     * comUpdateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comUpdateUserIdLikeFront comUpdateUserIdLikeFront に設定する
     */
    public void setComUpdateUserIdLikeFront(String comUpdateUserIdLikeFront) {
        this.comUpdateUserIdLikeFront = comUpdateUserIdLikeFront;
    }

    /**
     * comCreateFuncIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThan
     */
    public String getComCreateFuncIdGreaterThan() {
        return comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThan comCreateFuncIdGreaterThan に設定する
     */
    public void setComCreateFuncIdGreaterThan(String comCreateFuncIdGreaterThan) {
        this.comCreateFuncIdGreaterThan = comCreateFuncIdGreaterThan;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdGreaterThanEqual
     */
    public String getComCreateFuncIdGreaterThanEqual() {
        return comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdGreaterThanEqual comCreateFuncIdGreaterThanEqual に設定する
     */
    public void setComCreateFuncIdGreaterThanEqual(String comCreateFuncIdGreaterThanEqual) {
        this.comCreateFuncIdGreaterThanEqual = comCreateFuncIdGreaterThanEqual;
    }

    /**
     * comCreateFuncIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThan
     */
    public String getComCreateFuncIdLessThan() {
        return comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThan のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThan comCreateFuncIdLessThan に設定する
     */
    public void setComCreateFuncIdLessThan(String comCreateFuncIdLessThan) {
        this.comCreateFuncIdLessThan = comCreateFuncIdLessThan;
    }

    /**
     * comCreateFuncIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLessThanEqual
     */
    public String getComCreateFuncIdLessThanEqual() {
        return comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateFuncIdLessThanEqual comCreateFuncIdLessThanEqual に設定する
     */
    public void setComCreateFuncIdLessThanEqual(String comCreateFuncIdLessThanEqual) {
        this.comCreateFuncIdLessThanEqual = comCreateFuncIdLessThanEqual;
    }

    /**
     * comCreateFuncIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateFuncIdLikeFront
     */
    public String getComCreateFuncIdLikeFront() {
        return comCreateFuncIdLikeFront;
    }

    /**
     * comCreateFuncIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateFuncIdLikeFront comCreateFuncIdLikeFront に設定する
     */
    public void setComCreateFuncIdLikeFront(String comCreateFuncIdLikeFront) {
        this.comCreateFuncIdLikeFront = comCreateFuncIdLikeFront;
    }

    /**
     * comCreateUserIdGreaterThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThan
     */
    public String getComCreateUserIdGreaterThan() {
        return comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThan のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThan comCreateUserIdGreaterThan に設定する
     */
    public void setComCreateUserIdGreaterThan(String comCreateUserIdGreaterThan) {
        this.comCreateUserIdGreaterThan = comCreateUserIdGreaterThan;
    }

    /**
     * comCreateUserIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdGreaterThanEqual
     */
    public String getComCreateUserIdGreaterThanEqual() {
        return comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdGreaterThanEqual comCreateUserIdGreaterThanEqual に設定する
     */
    public void setComCreateUserIdGreaterThanEqual(String comCreateUserIdGreaterThanEqual) {
        this.comCreateUserIdGreaterThanEqual = comCreateUserIdGreaterThanEqual;
    }

    /**
     * comCreateUserIdLessThan のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThan
     */
    public String getComCreateUserIdLessThan() {
        return comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThan のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThan comCreateUserIdLessThan に設定する
     */
    public void setComCreateUserIdLessThan(String comCreateUserIdLessThan) {
        this.comCreateUserIdLessThan = comCreateUserIdLessThan;
    }

    /**
     * comCreateUserIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLessThanEqual
     */
    public String getComCreateUserIdLessThanEqual() {
        return comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLessThanEqual のセッターメソッドです。
     * 
     * @param comCreateUserIdLessThanEqual comCreateUserIdLessThanEqual に設定する
     */
    public void setComCreateUserIdLessThanEqual(String comCreateUserIdLessThanEqual) {
        this.comCreateUserIdLessThanEqual = comCreateUserIdLessThanEqual;
    }

    /**
     * comCreateUserIdLikeFront のゲッターメソッドです。
     * 
     * @return the comCreateUserIdLikeFront
     */
    public String getComCreateUserIdLikeFront() {
        return comCreateUserIdLikeFront;
    }

    /**
     * comCreateUserIdLikeFront のセッターメソッドです。
     * 
     * @param comCreateUserIdLikeFront comCreateUserIdLikeFront に設定する
     */
    public void setComCreateUserIdLikeFront(String comCreateUserIdLikeFront) {
        this.comCreateUserIdLikeFront = comCreateUserIdLikeFront;
    }

}

