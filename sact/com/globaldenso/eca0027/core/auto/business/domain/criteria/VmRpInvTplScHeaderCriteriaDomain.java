/*
 * PROJECT：eca0027
 * 
 * VmRpInvTplScHeader の検索条件Domainクラス
 * テーブル概要：VM_RP_INV_TPL_SC_HEADER
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
 * VmRpInvTplScHeader の検索条件Domainクラスです。<BR>
 * テーブル概要：VM_RP_INV_TPL_SC_HEADER<BR>
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
public class VmRpInvTplScHeaderCriteriaDomain extends AbstractDomain implements Serializable {

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
     * MASTER_3
     */
    private String master3;

    /**
     * MASTER_11
     */
    private String master11;

    /**
     * MASTER_7
     */
    private String master7;

    /**
     * MASTER_8
     */
    private String master8;

    /**
     * FILE_DATA_M1
     */
    private byte[] fileDataM1;

    /**
     * FILE_DATA_M12
     */
    private byte[] fileDataM12;

    /**
     * FILE_DATA_M13
     */
    private byte[] fileDataM13;

    /**
     * FILE_DATA_M9
     */
    private byte[] fileDataM9;

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
     * MASTER_3（大なり）
     */
    private String master3GreaterThan;

    /**
     * MASTER_3（大なりイコール）
     */
    private String master3GreaterThanEqual;

    /**
     * MASTER_3（小なり）
     */
    private String master3LessThan;

    /**
     * MASTER_3（小なりイコール）
     */
    private String master3LessThanEqual;

    /**
     * MASTER_3（前方一致）
     */
    private String master3LikeFront;

    /**
     * MASTER_11（大なり）
     */
    private String master11GreaterThan;

    /**
     * MASTER_11（大なりイコール）
     */
    private String master11GreaterThanEqual;

    /**
     * MASTER_11（小なり）
     */
    private String master11LessThan;

    /**
     * MASTER_11（小なりイコール）
     */
    private String master11LessThanEqual;

    /**
     * MASTER_11（前方一致）
     */
    private String master11LikeFront;

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
     * デフォルトコンストラクタ。
     */
    public VmRpInvTplScHeaderCriteriaDomain() {
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
     * master11 のゲッターメソッドです。
     * 
     * @return the master11
     */
    public String getMaster11() {
        return master11;
    }

    /**
     * master11 のセッターメソッドです。
     * 
     * @param master11 master11 に設定する
     */
    public void setMaster11(String master11) {
        this.master11 = master11;
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
     * fileDataM12 のゲッターメソッドです。
     * 
     * @return the fileDataM12
     */
    public byte[] getFileDataM12() {
        return fileDataM12;
    }

    /**
     * fileDataM12 のセッターメソッドです。
     * 
     * @param fileDataM12 fileDataM12 に設定する
     */
    public void setFileDataM12(byte[] fileDataM12) {
        this.fileDataM12 = fileDataM12;
    }

    /**
     * fileDataM13 のゲッターメソッドです。
     * 
     * @return the fileDataM13
     */
    public byte[] getFileDataM13() {
        return fileDataM13;
    }

    /**
     * fileDataM13 のセッターメソッドです。
     * 
     * @param fileDataM13 fileDataM13 に設定する
     */
    public void setFileDataM13(byte[] fileDataM13) {
        this.fileDataM13 = fileDataM13;
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
     * master3GreaterThan のゲッターメソッドです。
     * 
     * @return the master3GreaterThan
     */
    public String getMaster3GreaterThan() {
        return master3GreaterThan;
    }

    /**
     * master3GreaterThan のセッターメソッドです。
     * 
     * @param master3GreaterThan master3GreaterThan に設定する
     */
    public void setMaster3GreaterThan(String master3GreaterThan) {
        this.master3GreaterThan = master3GreaterThan;
    }

    /**
     * master3GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the master3GreaterThanEqual
     */
    public String getMaster3GreaterThanEqual() {
        return master3GreaterThanEqual;
    }

    /**
     * master3GreaterThanEqual のセッターメソッドです。
     * 
     * @param master3GreaterThanEqual master3GreaterThanEqual に設定する
     */
    public void setMaster3GreaterThanEqual(String master3GreaterThanEqual) {
        this.master3GreaterThanEqual = master3GreaterThanEqual;
    }

    /**
     * master3LessThan のゲッターメソッドです。
     * 
     * @return the master3LessThan
     */
    public String getMaster3LessThan() {
        return master3LessThan;
    }

    /**
     * master3LessThan のセッターメソッドです。
     * 
     * @param master3LessThan master3LessThan に設定する
     */
    public void setMaster3LessThan(String master3LessThan) {
        this.master3LessThan = master3LessThan;
    }

    /**
     * master3LessThanEqual のゲッターメソッドです。
     * 
     * @return the master3LessThanEqual
     */
    public String getMaster3LessThanEqual() {
        return master3LessThanEqual;
    }

    /**
     * master3LessThanEqual のセッターメソッドです。
     * 
     * @param master3LessThanEqual master3LessThanEqual に設定する
     */
    public void setMaster3LessThanEqual(String master3LessThanEqual) {
        this.master3LessThanEqual = master3LessThanEqual;
    }

    /**
     * master3LikeFront のゲッターメソッドです。
     * 
     * @return the master3LikeFront
     */
    public String getMaster3LikeFront() {
        return master3LikeFront;
    }

    /**
     * master3LikeFront のセッターメソッドです。
     * 
     * @param master3LikeFront master3LikeFront に設定する
     */
    public void setMaster3LikeFront(String master3LikeFront) {
        this.master3LikeFront = master3LikeFront;
    }

    /**
     * master11GreaterThan のゲッターメソッドです。
     * 
     * @return the master11GreaterThan
     */
    public String getMaster11GreaterThan() {
        return master11GreaterThan;
    }

    /**
     * master11GreaterThan のセッターメソッドです。
     * 
     * @param master11GreaterThan master11GreaterThan に設定する
     */
    public void setMaster11GreaterThan(String master11GreaterThan) {
        this.master11GreaterThan = master11GreaterThan;
    }

    /**
     * master11GreaterThanEqual のゲッターメソッドです。
     * 
     * @return the master11GreaterThanEqual
     */
    public String getMaster11GreaterThanEqual() {
        return master11GreaterThanEqual;
    }

    /**
     * master11GreaterThanEqual のセッターメソッドです。
     * 
     * @param master11GreaterThanEqual master11GreaterThanEqual に設定する
     */
    public void setMaster11GreaterThanEqual(String master11GreaterThanEqual) {
        this.master11GreaterThanEqual = master11GreaterThanEqual;
    }

    /**
     * master11LessThan のゲッターメソッドです。
     * 
     * @return the master11LessThan
     */
    public String getMaster11LessThan() {
        return master11LessThan;
    }

    /**
     * master11LessThan のセッターメソッドです。
     * 
     * @param master11LessThan master11LessThan に設定する
     */
    public void setMaster11LessThan(String master11LessThan) {
        this.master11LessThan = master11LessThan;
    }

    /**
     * master11LessThanEqual のゲッターメソッドです。
     * 
     * @return the master11LessThanEqual
     */
    public String getMaster11LessThanEqual() {
        return master11LessThanEqual;
    }

    /**
     * master11LessThanEqual のセッターメソッドです。
     * 
     * @param master11LessThanEqual master11LessThanEqual に設定する
     */
    public void setMaster11LessThanEqual(String master11LessThanEqual) {
        this.master11LessThanEqual = master11LessThanEqual;
    }

    /**
     * master11LikeFront のゲッターメソッドです。
     * 
     * @return the master11LikeFront
     */
    public String getMaster11LikeFront() {
        return master11LikeFront;
    }

    /**
     * master11LikeFront のセッターメソッドです。
     * 
     * @param master11LikeFront master11LikeFront に設定する
     */
    public void setMaster11LikeFront(String master11LikeFront) {
        this.master11LikeFront = master11LikeFront;
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

}

