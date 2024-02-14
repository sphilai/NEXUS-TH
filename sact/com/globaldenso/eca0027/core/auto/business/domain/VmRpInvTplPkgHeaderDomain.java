/*
 * PROJECT：eca0027
 * 
 * VmRpInvTplPkgHeader のDomainクラス
 * テーブル概要：VM_RP_INV_TPL_PKG_HEADER
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VmRpInvTplPkgHeader のDomainクラスです。<BR>
 * テーブル概要：VM_RP_INV_TPL_PKG_HEADER<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 13:29:08<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class VmRpInvTplPkgHeaderDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * DOC_NO
     */
    private String docNo;

    /**
     * MASTER_2
     */
    private String master2;

    /**
     * MASTER_7
     */
    private String master7;

    /**
     * MASTER_8
     */
    private String master8;

    /**
     * MASTER_10
     */
    private String master10;

    /**
     * FILE_DATA_M1
     */
    private byte[] fileDataM1;

    /**
     * FILE_DATA_M6
     */
    private byte[] fileDataM6;

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplPkgHeaderDomain() {
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
     * docNo のゲッターメソッドです。
     * 
     * @return the docNo
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * docNo のセッターメソッドです。
     * 
     * @param docNo docNo に設定する
     */
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    /**
     * master2 のゲッターメソッドです。
     * 
     * @return the master2
     */
    public String getMaster2() {
        return master2;
    }

    /**
     * master2 のセッターメソッドです。
     * 
     * @param master2 master2 に設定する
     */
    public void setMaster2(String master2) {
        this.master2 = master2;
    }

    /**
     * master7 のゲッターメソッドです。
     * 
     * @return the master7
     */
    public String getMaster7() {
        return master7;
    }

    /**
     * master7 のセッターメソッドです。
     * 
     * @param master7 master7 に設定する
     */
    public void setMaster7(String master7) {
        this.master7 = master7;
    }

    /**
     * master8 のゲッターメソッドです。
     * 
     * @return the master8
     */
    public String getMaster8() {
        return master8;
    }

    /**
     * master8 のセッターメソッドです。
     * 
     * @param master8 master8 に設定する
     */
    public void setMaster8(String master8) {
        this.master8 = master8;
    }

    /**
     * master10 のゲッターメソッドです。
     * 
     * @return the master10
     */
    public String getMaster10() {
        return master10;
    }

    /**
     * master10 のセッターメソッドです。
     * 
     * @param master10 master10 に設定する
     */
    public void setMaster10(String master10) {
        this.master10 = master10;
    }

    /**
     * fileDataM1 のゲッターメソッドです。
     * 
     * @return the fileDataM1
     */
    public byte[] getFileDataM1() {
        return fileDataM1;
    }

    /**
     * fileDataM1 のセッターメソッドです。
     * 
     * @param fileDataM1 fileDataM1 に設定する
     */
    public void setFileDataM1(byte[] fileDataM1) {
        this.fileDataM1 = fileDataM1;
    }

    /**
     * fileDataM6 のゲッターメソッドです。
     * 
     * @return the fileDataM6
     */
    public byte[] getFileDataM6() {
        return fileDataM6;
    }

    /**
     * fileDataM6 のセッターメソッドです。
     * 
     * @param fileDataM6 fileDataM6 に設定する
     */
    public void setFileDataM6(byte[] fileDataM6) {
        this.fileDataM6 = fileDataM6;
    }

}
