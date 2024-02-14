/*
 * PROJECT：eca0027
 * 
 * TmInvTpl のDomainクラス
 * テーブル概要：TM_INV_TPL
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TmInvTpl のDomainクラスです。<BR>
 * テーブル概要：TM_INV_TPL<BR>
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
public class TmInvTplDomain extends AbstractDomain implements Serializable {

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
     * INVOICE_CTGRY
     */
    private String invoiceCtgry;

    /**
     * INVOICE_CLASS
     */
    private String invoiceClass;

    /**
     * MASTER_1
     */
    private String master1;

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
     * MASTER_5
     */
    private String master5;

    /**
     * MASTER_6
     */
    private String master6;

    /**
     * MASTER_7
     */
    private String master7;

    /**
     * MASTER_8
     */
    private String master8;

    /**
     * MASTER_9
     */
    private String master9;

    /**
     * MASTER_10
     */
    private String master10;

    /**
     * MASTER_11
     */
    private String master11;

    /**
     * MASTER_12
     */
    private String master12;

    /**
     * MASTER_13
     */
    private String master13;

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
    public TmInvTplDomain() {
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
     * invoiceCtgry のゲッターメソッドです。
     * 
     * @return the invoiceCtgry
     */
    public String getInvoiceCtgry() {
        return invoiceCtgry;
    }

    /**
     * invoiceCtgry のセッターメソッドです。
     * 
     * @param invoiceCtgry invoiceCtgry に設定する
     */
    public void setInvoiceCtgry(String invoiceCtgry) {
        this.invoiceCtgry = invoiceCtgry;
    }

    /**
     * invoiceClass のゲッターメソッドです。
     * 
     * @return the invoiceClass
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * invoiceClass のセッターメソッドです。
     * 
     * @param invoiceClass invoiceClass に設定する
     */
    public void setInvoiceClass(String invoiceClass) {
        this.invoiceClass = invoiceClass;
    }

    /**
     * master1 のゲッターメソッドです。
     * 
     * @return the master1
     */
    public String getMaster1() {
        return master1;
    }

    /**
     * master1 のセッターメソッドです。
     * 
     * @param master1 master1 に設定する
     */
    public void setMaster1(String master1) {
        this.master1 = master1;
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
     * master5 のゲッターメソッドです。
     * 
     * @return the master5
     */
    public String getMaster5() {
        return master5;
    }

    /**
     * master5 のセッターメソッドです。
     * 
     * @param master5 master5 に設定する
     */
    public void setMaster5(String master5) {
        this.master5 = master5;
    }

    /**
     * master6 のゲッターメソッドです。
     * 
     * @return the master6
     */
    public String getMaster6() {
        return master6;
    }

    /**
     * master6 のセッターメソッドです。
     * 
     * @param master6 master6 に設定する
     */
    public void setMaster6(String master6) {
        this.master6 = master6;
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
     * master9 のゲッターメソッドです。
     * 
     * @return the master9
     */
    public String getMaster9() {
        return master9;
    }

    /**
     * master9 のセッターメソッドです。
     * 
     * @param master9 master9 に設定する
     */
    public void setMaster9(String master9) {
        this.master9 = master9;
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
     * master12 のゲッターメソッドです。
     * 
     * @return the master12
     */
    public String getMaster12() {
        return master12;
    }

    /**
     * master12 のセッターメソッドです。
     * 
     * @param master12 master12 に設定する
     */
    public void setMaster12(String master12) {
        this.master12 = master12;
    }

    /**
     * master13 のゲッターメソッドです。
     * 
     * @return the master13
     */
    public String getMaster13() {
        return master13;
    }

    /**
     * master13 のセッターメソッドです。
     * 
     * @param master13 master13 に設定する
     */
    public void setMaster13(String master13) {
        this.master13 = master13;
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
