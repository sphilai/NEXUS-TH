/*
 * PROJECT：eca0027
 * 
 * VmRpInvTpl のDomainクラス
 * テーブル概要：VM_RP_INV_TPL
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
 * VmRpInvTpl のDomainクラスです。<BR>
 * テーブル概要：VM_RP_INV_TPL<BR>
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
public class VmRpInvTplDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MASTER_2
     */
    private String master2;

    /**
     * MASTER_3
     */
    private String master3;

    /**
     * MASTER_4
     */
    private String master4;

    /**
     * MASTER_7
     */
    private String master7;

    /**
     * MASTER_8
     */
    private String master8;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * DOC_NO
     */
    private String docNo;

    /**
     * FILE_DATA_M1
     */
    private byte[] fileDataM1;

    /**
     * FILE_DATA_M5
     */
    private byte[] fileDataM5;

    /**
     * FILE_DATA_M6
     */
    private byte[] fileDataM6;

    /**
     * FILE_DATA_M9
     */
    private byte[] fileDataM9;

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplDomain() {
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
     * master3 のゲッターメソッドです。
     * 
     * @return the master3
     */
    public String getMaster3() {
        return master3;
    }

    /**
     * master3 のセッターメソッドです。
     * 
     * @param master3 master3 に設定する
     */
    public void setMaster3(String master3) {
        this.master3 = master3;
    }

    /**
     * master4 のゲッターメソッドです。
     * 
     * @return the master4
     */
    public String getMaster4() {
        return master4;
    }

    /**
     * master4 のセッターメソッドです。
     * 
     * @param master4 master4 に設定する
     */
    public void setMaster4(String master4) {
        this.master4 = master4;
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
     * fileDataM5 のゲッターメソッドです。
     * 
     * @return the fileDataM5
     */
    public byte[] getFileDataM5() {
        return fileDataM5;
    }

    /**
     * fileDataM5 のセッターメソッドです。
     * 
     * @param fileDataM5 fileDataM5 に設定する
     */
    public void setFileDataM5(byte[] fileDataM5) {
        this.fileDataM5 = fileDataM5;
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

    /**
     * fileDataM9 のゲッターメソッドです。
     * 
     * @return the fileDataM9
     */
    public byte[] getFileDataM9() {
        return fileDataM9;
    }

    /**
     * fileDataM9 のセッターメソッドです。
     * 
     * @param fileDataM9 fileDataM9 に設定する
     */
    public void setFileDataM9(byte[] fileDataM9) {
        this.fileDataM9 = fileDataM9;
    }

}
