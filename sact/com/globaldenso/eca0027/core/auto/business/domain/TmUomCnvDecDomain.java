/*
 * PROJECT：eca0027
 * 
 * TmUomCnvDec のDomainクラス
 * テーブル概要：TM_UOM_CNV_DEC
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TmUomCnvDec のDomainクラスです。<BR>
 * テーブル概要：TM_UOM_CNV_DEC<BR>
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
public class TmUomCnvDecDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * UOM_CD_CONV_SRC
     */
    private String uomCdConvSrc;

    /**
     * UOM_CD_CONV_TRGT
     */
    private String uomCdConvTrgt;

    /**
     * UOM_CD_CONV_FACTOR
     */
    private BigDecimal uomCdConvFactor;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_FUNC_ID
     */
    private String comCreateFuncId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_FUNC_ID
     */
    private String comUpdateFuncId;

    /**
     * デフォルトコンストラクタ。
     */
    public TmUomCnvDecDomain() {
    }

    /**
     * uomCdConvSrc のゲッターメソッドです。
     * 
     * @return the uomCdConvSrc
     */
    public String getUomCdConvSrc() {
        return uomCdConvSrc;
    }

    /**
     * uomCdConvSrc のセッターメソッドです。
     * 
     * @param uomCdConvSrc uomCdConvSrc に設定する
     */
    public void setUomCdConvSrc(String uomCdConvSrc) {
        this.uomCdConvSrc = uomCdConvSrc;
    }

    /**
     * uomCdConvTrgt のゲッターメソッドです。
     * 
     * @return the uomCdConvTrgt
     */
    public String getUomCdConvTrgt() {
        return uomCdConvTrgt;
    }

    /**
     * uomCdConvTrgt のセッターメソッドです。
     * 
     * @param uomCdConvTrgt uomCdConvTrgt に設定する
     */
    public void setUomCdConvTrgt(String uomCdConvTrgt) {
        this.uomCdConvTrgt = uomCdConvTrgt;
    }

    /**
     * uomCdConvFactor のゲッターメソッドです。
     * 
     * @return the uomCdConvFactor
     */
    public BigDecimal getUomCdConvFactor() {
        return uomCdConvFactor;
    }

    /**
     * uomCdConvFactor のセッターメソッドです。
     * 
     * @param uomCdConvFactor uomCdConvFactor に設定する
     */
    public void setUomCdConvFactor(BigDecimal uomCdConvFactor) {
        this.uomCdConvFactor = uomCdConvFactor;
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

}
