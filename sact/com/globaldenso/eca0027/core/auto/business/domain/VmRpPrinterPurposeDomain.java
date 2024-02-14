/*
 * PROJECT：eca0027
 * 
 * VmRpPrinterPurpose のDomainクラス
 * テーブル概要：VM_RP_PRINTER_PURPOSE
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/24  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VmRpPrinterPurpose のDomainクラスです。<BR>
 * テーブル概要：VM_RP_PRINTER_PURPOSE<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/24 17:56:36<BR>
 * 
 * テーブル定義から2014/02/24に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmRpPrinterPurposeDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * ODR_ERR_PRINTER_FLG
     */
    private String odrErrPrinterFlg;

    /**
     * ODR_ERR_DEF_PRITNTER_FLG
     */
    private String odrErrDefPritnterFlg;

    /**
     * IP_ADDR
     */
    private String ipAddr;

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpPrinterPurposeDomain() {
    }

    /**
     * compCd のゲッターメソッドです。
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * compCd のセッターメソッドです。
     * 
     * @param compCd compCd に設定する
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * plntCd のゲッターメソッドです。
     * 
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * plntCd のセッターメソッドです。
     * 
     * @param plntCd plntCd に設定する
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * odrErrPrinterFlg のゲッターメソッドです。
     * 
     * @return the odrErrPrinterFlg
     */
    public String getOdrErrPrinterFlg() {
        return odrErrPrinterFlg;
    }

    /**
     * odrErrPrinterFlg のセッターメソッドです。
     * 
     * @param odrErrPrinterFlg odrErrPrinterFlg に設定する
     */
    public void setOdrErrPrinterFlg(String odrErrPrinterFlg) {
        this.odrErrPrinterFlg = odrErrPrinterFlg;
    }

    /**
     * odrErrDefPritnterFlg のゲッターメソッドです。
     * 
     * @return the odrErrDefPritnterFlg
     */
    public String getOdrErrDefPritnterFlg() {
        return odrErrDefPritnterFlg;
    }

    /**
     * odrErrDefPritnterFlg のセッターメソッドです。
     * 
     * @param odrErrDefPritnterFlg odrErrDefPritnterFlg に設定する
     */
    public void setOdrErrDefPritnterFlg(String odrErrDefPritnterFlg) {
        this.odrErrDefPritnterFlg = odrErrDefPritnterFlg;
    }

    /**
     * ipAddr のゲッターメソッドです。
     * 
     * @return the ipAddr
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     * ipAddr のセッターメソッドです。
     * 
     * @param ipAddr ipAddr に設定する
     */
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

}
