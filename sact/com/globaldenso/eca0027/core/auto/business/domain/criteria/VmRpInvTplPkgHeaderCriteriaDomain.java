/*
 * PROJECT：eca0027
 * 
 * VmRpInvTplPkgHeader の検索条件Domainクラス
 * テーブル概要：VM_RP_INV_TPL_PKG_HEADER
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;


/**
 * VmRpInvTplPkgHeader の検索条件Domainクラスです。<BR>
 * テーブル概要：VM_RP_INV_TPL_PKG_HEADER<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 13:29:08<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class VmRpInvTplPkgHeaderCriteriaDomain extends AbstractDomain implements Serializable {

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
     * COMP_CD（大なり）
     */
    private String compCdGreaterThan;

    /**
     * COMP_CD（大なりイコール）
     */
    private String compCdGreaterThanEqual;

    /**
     * COMP_CD（小なり）
     */
    private String compCdLessThan;

    /**
     * COMP_CD（小なりイコール）
     */
    private String compCdLessThanEqual;

    /**
     * COMP_CD（前方一致）
     */
    private String compCdLikeFront;

    /**
     * DOC_NO（大なり）
     */
    private String docNoGreaterThan;

    /**
     * DOC_NO（大なりイコール）
     */
    private String docNoGreaterThanEqual;

    /**
     * DOC_NO（小なり）
     */
    private String docNoLessThan;

    /**
     * DOC_NO（小なりイコール）
     */
    private String docNoLessThanEqual;

    /**
     * DOC_NO（前方一致）
     */
    private String docNoLikeFront;

    /**
     * MASTER_2（大なり）
     */
    private String master2GreaterThan;

    /**
     * MASTER_2（大なりイコール）
     */
    private String master2GreaterThanEqual;

    /**
     * MASTER_2（小なり）
     */
    private String master2LessThan;

    /**
     * MASTER_2（小なりイコール）
     */
    private String master2LessThanEqual;

    /**
     * MASTER_2（前方一致）
     */
    private String master2LikeFront;

    /**
     * MASTER_7（大なり）
     */
    private String master7GreaterThan;

    /**
     * MASTER_7（大なりイコール）
     */
    private String master7GreaterThanEqual;

    /**
     * MASTER_7（小なり）
     */
    private String master7LessThan;

    /**
     * MASTER_7（小なりイコール）
     */
    private String master7LessThanEqual;

    /**
     * MASTER_7（前方一致）
     */
    private String master7LikeFront;

    /**
     * MASTER_8（大なり）
     */
    private String master8GreaterThan;

    /**
     * MASTER_8（大なりイコール）
     */
    private String master8GreaterThanEqual;

    /**
     * MASTER_8（小なり）
     */
    private String master8LessThan;

    /**
     * MASTER_8（小なりイコール）
     */
    private String master8LessThanEqual;

    /**
     * MASTER_8（前方一致）
     */
    private String master8LikeFront;

    /**
     * MASTER_10（大なり）
     */
    private String master10GreaterThan;

    /**
     * MASTER_10（大なりイコール）
     */
    private String master10GreaterThanEqual;

    /**
     * MASTER_10（小なり）
     */
    private String master10LessThan;

    /**
     * MASTER_10（小なりイコール）
     */
    private String master10LessThanEqual;

    /**
     * MASTER_10（前方一致）
     */
    private String master10LikeFront;

    /**
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplPkgHeaderCriteriaDomain() {
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

    /**
     * compCdGreaterThan のゲッターメソッドです。
     * 
     * @return the compCdGreaterThan
     */
    public String getCompCdGreaterThan() {
        return compCdGreaterThan;
    }

    /**
     * compCdGreaterThan のセッターメソッドです。
     * 
     * @param compCdGreaterThan compCdGreaterThan に設定する
     */
    public void setCompCdGreaterThan(String compCdGreaterThan) {
        this.compCdGreaterThan = compCdGreaterThan;
    }

    /**
     * compCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the compCdGreaterThanEqual
     */
    public String getCompCdGreaterThanEqual() {
        return compCdGreaterThanEqual;
    }

    /**
     * compCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param compCdGreaterThanEqual compCdGreaterThanEqual に設定する
     */
    public void setCompCdGreaterThanEqual(String compCdGreaterThanEqual) {
        this.compCdGreaterThanEqual = compCdGreaterThanEqual;
    }

    /**
     * compCdLessThan のゲッターメソッドです。
     * 
     * @return the compCdLessThan
     */
    public String getCompCdLessThan() {
        return compCdLessThan;
    }

    /**
     * compCdLessThan のセッターメソッドです。
     * 
     * @param compCdLessThan compCdLessThan に設定する
     */
    public void setCompCdLessThan(String compCdLessThan) {
        this.compCdLessThan = compCdLessThan;
    }

    /**
     * compCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the compCdLessThanEqual
     */
    public String getCompCdLessThanEqual() {
        return compCdLessThanEqual;
    }

    /**
     * compCdLessThanEqual のセッターメソッドです。
     * 
     * @param compCdLessThanEqual compCdLessThanEqual に設定する
     */
    public void setCompCdLessThanEqual(String compCdLessThanEqual) {
        this.compCdLessThanEqual = compCdLessThanEqual;
    }

    /**
     * compCdLikeFront のゲッターメソッドです。
     * 
     * @return the compCdLikeFront
     */
    public String getCompCdLikeFront() {
        return compCdLikeFront;
    }

    /**
     * compCdLikeFront のセッターメソッドです。
     * 
     * @param compCdLikeFront compCdLikeFront に設定する
     */
    public void setCompCdLikeFront(String compCdLikeFront) {
        this.compCdLikeFront = compCdLikeFront;
    }

    /**
     * docNoGreaterThan のゲッターメソッドです。
     * 
     * @return the docNoGreaterThan
     */
    public String getDocNoGreaterThan() {
        return docNoGreaterThan;
    }

    /**
     * docNoGreaterThan のセッターメソッドです。
     * 
     * @param docNoGreaterThan docNoGreaterThan に設定する
     */
    public void setDocNoGreaterThan(String docNoGreaterThan) {
        this.docNoGreaterThan = docNoGreaterThan;
    }

    /**
     * docNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the docNoGreaterThanEqual
     */
    public String getDocNoGreaterThanEqual() {
        return docNoGreaterThanEqual;
    }

    /**
     * docNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param docNoGreaterThanEqual docNoGreaterThanEqual に設定する
     */
    public void setDocNoGreaterThanEqual(String docNoGreaterThanEqual) {
        this.docNoGreaterThanEqual = docNoGreaterThanEqual;
    }

    /**
     * docNoLessThan のゲッターメソッドです。
     * 
     * @return the docNoLessThan
     */
    public String getDocNoLessThan() {
        return docNoLessThan;
    }

    /**
     * docNoLessThan のセッターメソッドです。
     * 
     * @param docNoLessThan docNoLessThan に設定する
     */
    public void setDocNoLessThan(String docNoLessThan) {
        this.docNoLessThan = docNoLessThan;
    }

    /**
     * docNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the docNoLessThanEqual
     */
    public String getDocNoLessThanEqual() {
        return docNoLessThanEqual;
    }

    /**
     * docNoLessThanEqual のセッターメソッドです。
     * 
     * @param docNoLessThanEqual docNoLessThanEqual に設定する
     */
    public void setDocNoLessThanEqual(String docNoLessThanEqual) {
        this.docNoLessThanEqual = docNoLessThanEqual;
    }

    /**
     * docNoLikeFront のゲッターメソッドです。
     * 
     * @return the docNoLikeFront
     */
    public String getDocNoLikeFront() {
        return docNoLikeFront;
    }

    /**
     * docNoLikeFront のセッターメソッドです。
     * 
     * @param docNoLikeFront docNoLikeFront に設定する
     */
    public void setDocNoLikeFront(String docNoLikeFront) {
        this.docNoLikeFront = docNoLikeFront;
    }

    /**
     * master2GreaterThan のゲッターメソッドです。
     * 
     * @return the master2GreaterThan
     */
    public String getMaster2GreaterThan() {
        return master2GreaterThan;
    }

    /**
     * master2GreaterThan のセッターメソッドです。
     * 
     * @param master2GreaterThan master2GreaterThan に設定する
     */
    public void setMaster2GreaterThan(String master2GreaterThan) {
        this.master2GreaterThan = master2GreaterThan;
    }

    /**
     * master2GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the master2GreaterThanEqual
     */
    public String getMaster2GreaterThanEqual() {
        return master2GreaterThanEqual;
    }

    /**
     * master2GreaterThanEqual のセッターメソッドです。
     * 
     * @param master2GreaterThanEqual master2GreaterThanEqual に設定する
     */
    public void setMaster2GreaterThanEqual(String master2GreaterThanEqual) {
        this.master2GreaterThanEqual = master2GreaterThanEqual;
    }

    /**
     * master2LessThan のゲッターメソッドです。
     * 
     * @return the master2LessThan
     */
    public String getMaster2LessThan() {
        return master2LessThan;
    }

    /**
     * master2LessThan のセッターメソッドです。
     * 
     * @param master2LessThan master2LessThan に設定する
     */
    public void setMaster2LessThan(String master2LessThan) {
        this.master2LessThan = master2LessThan;
    }

    /**
     * master2LessThanEqual のゲッターメソッドです。
     * 
     * @return the master2LessThanEqual
     */
    public String getMaster2LessThanEqual() {
        return master2LessThanEqual;
    }

    /**
     * master2LessThanEqual のセッターメソッドです。
     * 
     * @param master2LessThanEqual master2LessThanEqual に設定する
     */
    public void setMaster2LessThanEqual(String master2LessThanEqual) {
        this.master2LessThanEqual = master2LessThanEqual;
    }

    /**
     * master2LikeFront のゲッターメソッドです。
     * 
     * @return the master2LikeFront
     */
    public String getMaster2LikeFront() {
        return master2LikeFront;
    }

    /**
     * master2LikeFront のセッターメソッドです。
     * 
     * @param master2LikeFront master2LikeFront に設定する
     */
    public void setMaster2LikeFront(String master2LikeFront) {
        this.master2LikeFront = master2LikeFront;
    }

    /**
     * master7GreaterThan のゲッターメソッドです。
     * 
     * @return the master7GreaterThan
     */
    public String getMaster7GreaterThan() {
        return master7GreaterThan;
    }

    /**
     * master7GreaterThan のセッターメソッドです。
     * 
     * @param master7GreaterThan master7GreaterThan に設定する
     */
    public void setMaster7GreaterThan(String master7GreaterThan) {
        this.master7GreaterThan = master7GreaterThan;
    }

    /**
     * master7GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the master7GreaterThanEqual
     */
    public String getMaster7GreaterThanEqual() {
        return master7GreaterThanEqual;
    }

    /**
     * master7GreaterThanEqual のセッターメソッドです。
     * 
     * @param master7GreaterThanEqual master7GreaterThanEqual に設定する
     */
    public void setMaster7GreaterThanEqual(String master7GreaterThanEqual) {
        this.master7GreaterThanEqual = master7GreaterThanEqual;
    }

    /**
     * master7LessThan のゲッターメソッドです。
     * 
     * @return the master7LessThan
     */
    public String getMaster7LessThan() {
        return master7LessThan;
    }

    /**
     * master7LessThan のセッターメソッドです。
     * 
     * @param master7LessThan master7LessThan に設定する
     */
    public void setMaster7LessThan(String master7LessThan) {
        this.master7LessThan = master7LessThan;
    }

    /**
     * master7LessThanEqual のゲッターメソッドです。
     * 
     * @return the master7LessThanEqual
     */
    public String getMaster7LessThanEqual() {
        return master7LessThanEqual;
    }

    /**
     * master7LessThanEqual のセッターメソッドです。
     * 
     * @param master7LessThanEqual master7LessThanEqual に設定する
     */
    public void setMaster7LessThanEqual(String master7LessThanEqual) {
        this.master7LessThanEqual = master7LessThanEqual;
    }

    /**
     * master7LikeFront のゲッターメソッドです。
     * 
     * @return the master7LikeFront
     */
    public String getMaster7LikeFront() {
        return master7LikeFront;
    }

    /**
     * master7LikeFront のセッターメソッドです。
     * 
     * @param master7LikeFront master7LikeFront に設定する
     */
    public void setMaster7LikeFront(String master7LikeFront) {
        this.master7LikeFront = master7LikeFront;
    }

    /**
     * master8GreaterThan のゲッターメソッドです。
     * 
     * @return the master8GreaterThan
     */
    public String getMaster8GreaterThan() {
        return master8GreaterThan;
    }

    /**
     * master8GreaterThan のセッターメソッドです。
     * 
     * @param master8GreaterThan master8GreaterThan に設定する
     */
    public void setMaster8GreaterThan(String master8GreaterThan) {
        this.master8GreaterThan = master8GreaterThan;
    }

    /**
     * master8GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the master8GreaterThanEqual
     */
    public String getMaster8GreaterThanEqual() {
        return master8GreaterThanEqual;
    }

    /**
     * master8GreaterThanEqual のセッターメソッドです。
     * 
     * @param master8GreaterThanEqual master8GreaterThanEqual に設定する
     */
    public void setMaster8GreaterThanEqual(String master8GreaterThanEqual) {
        this.master8GreaterThanEqual = master8GreaterThanEqual;
    }

    /**
     * master8LessThan のゲッターメソッドです。
     * 
     * @return the master8LessThan
     */
    public String getMaster8LessThan() {
        return master8LessThan;
    }

    /**
     * master8LessThan のセッターメソッドです。
     * 
     * @param master8LessThan master8LessThan に設定する
     */
    public void setMaster8LessThan(String master8LessThan) {
        this.master8LessThan = master8LessThan;
    }

    /**
     * master8LessThanEqual のゲッターメソッドです。
     * 
     * @return the master8LessThanEqual
     */
    public String getMaster8LessThanEqual() {
        return master8LessThanEqual;
    }

    /**
     * master8LessThanEqual のセッターメソッドです。
     * 
     * @param master8LessThanEqual master8LessThanEqual に設定する
     */
    public void setMaster8LessThanEqual(String master8LessThanEqual) {
        this.master8LessThanEqual = master8LessThanEqual;
    }

    /**
     * master8LikeFront のゲッターメソッドです。
     * 
     * @return the master8LikeFront
     */
    public String getMaster8LikeFront() {
        return master8LikeFront;
    }

    /**
     * master8LikeFront のセッターメソッドです。
     * 
     * @param master8LikeFront master8LikeFront に設定する
     */
    public void setMaster8LikeFront(String master8LikeFront) {
        this.master8LikeFront = master8LikeFront;
    }

    /**
     * master10GreaterThan のゲッターメソッドです。
     * 
     * @return the master10GreaterThan
     */
    public String getMaster10GreaterThan() {
        return master10GreaterThan;
    }

    /**
     * master10GreaterThan のセッターメソッドです。
     * 
     * @param master10GreaterThan master10GreaterThan に設定する
     */
    public void setMaster10GreaterThan(String master10GreaterThan) {
        this.master10GreaterThan = master10GreaterThan;
    }

    /**
     * master10GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the master10GreaterThanEqual
     */
    public String getMaster10GreaterThanEqual() {
        return master10GreaterThanEqual;
    }

    /**
     * master10GreaterThanEqual のセッターメソッドです。
     * 
     * @param master10GreaterThanEqual master10GreaterThanEqual に設定する
     */
    public void setMaster10GreaterThanEqual(String master10GreaterThanEqual) {
        this.master10GreaterThanEqual = master10GreaterThanEqual;
    }

    /**
     * master10LessThan のゲッターメソッドです。
     * 
     * @return the master10LessThan
     */
    public String getMaster10LessThan() {
        return master10LessThan;
    }

    /**
     * master10LessThan のセッターメソッドです。
     * 
     * @param master10LessThan master10LessThan に設定する
     */
    public void setMaster10LessThan(String master10LessThan) {
        this.master10LessThan = master10LessThan;
    }

    /**
     * master10LessThanEqual のゲッターメソッドです。
     * 
     * @return the master10LessThanEqual
     */
    public String getMaster10LessThanEqual() {
        return master10LessThanEqual;
    }

    /**
     * master10LessThanEqual のセッターメソッドです。
     * 
     * @param master10LessThanEqual master10LessThanEqual に設定する
     */
    public void setMaster10LessThanEqual(String master10LessThanEqual) {
        this.master10LessThanEqual = master10LessThanEqual;
    }

    /**
     * master10LikeFront のゲッターメソッドです。
     * 
     * @return the master10LikeFront
     */
    public String getMaster10LikeFront() {
        return master10LikeFront;
    }

    /**
     * master10LikeFront のセッターメソッドです。
     * 
     * @param master10LikeFront master10LikeFront に設定する
     */
    public void setMaster10LikeFront(String master10LikeFront) {
        this.master10LikeFront = master10LikeFront;
    }

}

