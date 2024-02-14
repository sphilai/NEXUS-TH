/*
 * PROJECT：eca0027
 * 
 * TmMeasureUnit のDomainクラス
 * テーブル概要：TM_MEASURE_UNIT
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/12/05  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmMeasureUnit のDomainクラスです。<BR>
 * テーブル概要：TM_MEASURE_UNIT<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/12/05 16:41:35<BR>
 * 
 * テーブル定義から2014/12/05に自動生成したモジュールです。
 * 
 * @author $Author: 100016296498 $
 * @version $Revision: 10146 $
 */
public class TmMeasureUnitDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * UNIT_CD
     */
    private String unitCd;

    /**
     * UNIT_NM
     */
    private String unitNm;

    /**
     * UNIT_DISP
     */
    private String unitDisp;

    /**
     * LGCY_UNIT_CD
     */
    private String lgcyUnitCd;

    /**
     * LGCY_UNIT_DISP
     */
    private String lgcyUnitDisp;

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
    public TmMeasureUnitDomain() {
    }

    /**
     * unitCd のゲッターメソッドです。
     * 
     * @return the unitCd
     */
    public String getUnitCd() {
        return unitCd;
    }

    /**
     * unitCd のセッターメソッドです。
     * 
     * @param unitCd unitCd に設定する
     */
    public void setUnitCd(String unitCd) {
        this.unitCd = unitCd;
    }

    /**
     * unitNm のゲッターメソッドです。
     * 
     * @return the unitNm
     */
    public String getUnitNm() {
        return unitNm;
    }

    /**
     * unitNm のセッターメソッドです。
     * 
     * @param unitNm unitNm に設定する
     */
    public void setUnitNm(String unitNm) {
        this.unitNm = unitNm;
    }

    /**
     * unitDisp のゲッターメソッドです。
     * 
     * @return the unitDisp
     */
    public String getUnitDisp() {
        return unitDisp;
    }

    /**
     * unitDisp のセッターメソッドです。
     * 
     * @param unitDisp unitDisp に設定する
     */
    public void setUnitDisp(String unitDisp) {
        this.unitDisp = unitDisp;
    }

    /**
     * lgcyUnitCd のゲッターメソッドです。
     * 
     * @return the lgcyUnitCd
     */
    public String getLgcyUnitCd() {
        return lgcyUnitCd;
    }

    /**
     * lgcyUnitCd のセッターメソッドです。
     * 
     * @param lgcyUnitCd lgcyUnitCd に設定する
     */
    public void setLgcyUnitCd(String lgcyUnitCd) {
        this.lgcyUnitCd = lgcyUnitCd;
    }

    /**
     * lgcyUnitDisp のゲッターメソッドです。
     * 
     * @return the lgcyUnitDisp
     */
    public String getLgcyUnitDisp() {
        return lgcyUnitDisp;
    }

    /**
     * lgcyUnitDisp のセッターメソッドです。
     * 
     * @param lgcyUnitDisp lgcyUnitDisp に設定する
     */
    public void setLgcyUnitDisp(String lgcyUnitDisp) {
        this.lgcyUnitDisp = lgcyUnitDisp;
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
