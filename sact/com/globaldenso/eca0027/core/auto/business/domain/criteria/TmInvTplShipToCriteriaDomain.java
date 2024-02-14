/*
 * PROJECT：eca0027
 * 
 * TmInvTplShipTo の検索条件Domainクラス
 * テーブル概要：TM_INV_TPL_SHIP_TO
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
 * TmInvTplShipTo の検索条件Domainクラスです。<BR>
 * テーブル概要：TM_INV_TPL_SHIP_TO<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2014/02/18 09:47:42<BR>
 * 
 * テーブル定義から2014/02/18に自動生成したモジュールです。
 * 
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class TmInvTplShipToCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMP_CD
     */
    private String compCd;

    /**
     * SHIP_TO_CD
     */
    private String shipToCd;

    /**
     * CML_TYP
     */
    private String cmlTyp;

    /**
     * INVOICE_CTGRY
     */
    private String invoiceCtgry;

    /**
     * INVOICE_CLASS
     */
    private String invoiceClass;

    /**
     * APLY_STRT_DT
     */
    private Date aplyStrtDt;

    /**
     * DOC_NO
     */
    private String docNo;

    /**
     * FREE_1_DISP_FLG
     */
    private String free1DispFlg;

    /**
     * FREE_2_DISP_FLG
     */
    private String free2DispFlg;

    /**
     * FREE_3_DISP_FLG
     */
    private String free3DispFlg;

    /**
     * HS_CD_DISP_FLG
     */
    private String hsCdDispFlg;

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
     * SHIP_TO_CD（大なり）
     */
    private String shipToCdGreaterThan;

    /**
     * SHIP_TO_CD（大なりイコール）
     */
    private String shipToCdGreaterThanEqual;

    /**
     * SHIP_TO_CD（小なり）
     */
    private String shipToCdLessThan;

    /**
     * SHIP_TO_CD（小なりイコール）
     */
    private String shipToCdLessThanEqual;

    /**
     * SHIP_TO_CD（前方一致）
     */
    private String shipToCdLikeFront;

    /**
     * CML_TYP（大なり）
     */
    private String cmlTypGreaterThan;

    /**
     * CML_TYP（大なりイコール）
     */
    private String cmlTypGreaterThanEqual;

    /**
     * CML_TYP（小なり）
     */
    private String cmlTypLessThan;

    /**
     * CML_TYP（小なりイコール）
     */
    private String cmlTypLessThanEqual;

    /**
     * CML_TYP（前方一致）
     */
    private String cmlTypLikeFront;

    /**
     * INVOICE_CTGRY（大なり）
     */
    private String invoiceCtgryGreaterThan;

    /**
     * INVOICE_CTGRY（大なりイコール）
     */
    private String invoiceCtgryGreaterThanEqual;

    /**
     * INVOICE_CTGRY（小なり）
     */
    private String invoiceCtgryLessThan;

    /**
     * INVOICE_CTGRY（小なりイコール）
     */
    private String invoiceCtgryLessThanEqual;

    /**
     * INVOICE_CTGRY（前方一致）
     */
    private String invoiceCtgryLikeFront;

    /**
     * INVOICE_CLASS（大なり）
     */
    private String invoiceClassGreaterThan;

    /**
     * INVOICE_CLASS（大なりイコール）
     */
    private String invoiceClassGreaterThanEqual;

    /**
     * INVOICE_CLASS（小なり）
     */
    private String invoiceClassLessThan;

    /**
     * INVOICE_CLASS（小なりイコール）
     */
    private String invoiceClassLessThanEqual;

    /**
     * INVOICE_CLASS（前方一致）
     */
    private String invoiceClassLikeFront;

    /**
     * APLY_STRT_DT（大なりイコール）
     */
    private Date aplyStrtDtGreaterThanEqual;

    /**
     * APLY_STRT_DT（小なりイコール）
     */
    private Date aplyStrtDtLessThanEqual;

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
     * FREE_1_DISP_FLG（大なり）
     */
    private String free1DispFlgGreaterThan;

    /**
     * FREE_1_DISP_FLG（大なりイコール）
     */
    private String free1DispFlgGreaterThanEqual;

    /**
     * FREE_1_DISP_FLG（小なり）
     */
    private String free1DispFlgLessThan;

    /**
     * FREE_1_DISP_FLG（小なりイコール）
     */
    private String free1DispFlgLessThanEqual;

    /**
     * FREE_1_DISP_FLG（前方一致）
     */
    private String free1DispFlgLikeFront;

    /**
     * FREE_2_DISP_FLG（大なり）
     */
    private String free2DispFlgGreaterThan;

    /**
     * FREE_2_DISP_FLG（大なりイコール）
     */
    private String free2DispFlgGreaterThanEqual;

    /**
     * FREE_2_DISP_FLG（小なり）
     */
    private String free2DispFlgLessThan;

    /**
     * FREE_2_DISP_FLG（小なりイコール）
     */
    private String free2DispFlgLessThanEqual;

    /**
     * FREE_2_DISP_FLG（前方一致）
     */
    private String free2DispFlgLikeFront;

    /**
     * FREE_3_DISP_FLG（大なり）
     */
    private String free3DispFlgGreaterThan;

    /**
     * FREE_3_DISP_FLG（大なりイコール）
     */
    private String free3DispFlgGreaterThanEqual;

    /**
     * FREE_3_DISP_FLG（小なり）
     */
    private String free3DispFlgLessThan;

    /**
     * FREE_3_DISP_FLG（小なりイコール）
     */
    private String free3DispFlgLessThanEqual;

    /**
     * FREE_3_DISP_FLG（前方一致）
     */
    private String free3DispFlgLikeFront;

    /**
     * HS_CD_DISP_FLG（大なり）
     */
    private String hsCdDispFlgGreaterThan;

    /**
     * HS_CD_DISP_FLG（大なりイコール）
     */
    private String hsCdDispFlgGreaterThanEqual;

    /**
     * HS_CD_DISP_FLG（小なり）
     */
    private String hsCdDispFlgLessThan;

    /**
     * HS_CD_DISP_FLG（小なりイコール）
     */
    private String hsCdDispFlgLessThanEqual;

    /**
     * HS_CD_DISP_FLG（前方一致）
     */
    private String hsCdDispFlgLikeFront;

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
    public TmInvTplShipToCriteriaDomain() {
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
     * shipToCd のゲッターメソッドです。
     * 
     * @return the shipToCd
     */
    public String getShipToCd() {
        return shipToCd;
    }

    /**
     * shipToCd のセッターメソッドです。
     * 
     * @param shipToCd shipToCd に設定する
     */
    public void setShipToCd(String shipToCd) {
        this.shipToCd = shipToCd;
    }

    /**
     * cmlTyp のゲッターメソッドです。
     * 
     * @return the cmlTyp
     */
    public String getCmlTyp() {
        return cmlTyp;
    }

    /**
     * cmlTyp のセッターメソッドです。
     * 
     * @param cmlTyp cmlTyp に設定する
     */
    public void setCmlTyp(String cmlTyp) {
        this.cmlTyp = cmlTyp;
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
     * free1DispFlg のゲッターメソッドです。
     * 
     * @return the free1DispFlg
     */
    public String getFree1DispFlg() {
        return free1DispFlg;
    }

    /**
     * free1DispFlg のセッターメソッドです。
     * 
     * @param free1DispFlg free1DispFlg に設定する
     */
    public void setFree1DispFlg(String free1DispFlg) {
        this.free1DispFlg = free1DispFlg;
    }

    /**
     * free2DispFlg のゲッターメソッドです。
     * 
     * @return the free2DispFlg
     */
    public String getFree2DispFlg() {
        return free2DispFlg;
    }

    /**
     * free2DispFlg のセッターメソッドです。
     * 
     * @param free2DispFlg free2DispFlg に設定する
     */
    public void setFree2DispFlg(String free2DispFlg) {
        this.free2DispFlg = free2DispFlg;
    }

    /**
     * free3DispFlg のゲッターメソッドです。
     * 
     * @return the free3DispFlg
     */
    public String getFree3DispFlg() {
        return free3DispFlg;
    }

    /**
     * free3DispFlg のセッターメソッドです。
     * 
     * @param free3DispFlg free3DispFlg に設定する
     */
    public void setFree3DispFlg(String free3DispFlg) {
        this.free3DispFlg = free3DispFlg;
    }

    /**
     * hsCdDispFlg のゲッターメソッドです。
     * 
     * @return the hsCdDispFlg
     */
    public String getHsCdDispFlg() {
        return hsCdDispFlg;
    }

    /**
     * hsCdDispFlg のセッターメソッドです。
     * 
     * @param hsCdDispFlg hsCdDispFlg に設定する
     */
    public void setHsCdDispFlg(String hsCdDispFlg) {
        this.hsCdDispFlg = hsCdDispFlg;
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
     * shipToCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThan
     */
    public String getShipToCdGreaterThan() {
        return shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThan のセッターメソッドです。
     * 
     * @param shipToCdGreaterThan shipToCdGreaterThan に設定する
     */
    public void setShipToCdGreaterThan(String shipToCdGreaterThan) {
        this.shipToCdGreaterThan = shipToCdGreaterThan;
    }

    /**
     * shipToCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdGreaterThanEqual
     */
    public String getShipToCdGreaterThanEqual() {
        return shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipToCdGreaterThanEqual shipToCdGreaterThanEqual に設定する
     */
    public void setShipToCdGreaterThanEqual(String shipToCdGreaterThanEqual) {
        this.shipToCdGreaterThanEqual = shipToCdGreaterThanEqual;
    }

    /**
     * shipToCdLessThan のゲッターメソッドです。
     * 
     * @return the shipToCdLessThan
     */
    public String getShipToCdLessThan() {
        return shipToCdLessThan;
    }

    /**
     * shipToCdLessThan のセッターメソッドです。
     * 
     * @param shipToCdLessThan shipToCdLessThan に設定する
     */
    public void setShipToCdLessThan(String shipToCdLessThan) {
        this.shipToCdLessThan = shipToCdLessThan;
    }

    /**
     * shipToCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipToCdLessThanEqual
     */
    public String getShipToCdLessThanEqual() {
        return shipToCdLessThanEqual;
    }

    /**
     * shipToCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipToCdLessThanEqual shipToCdLessThanEqual に設定する
     */
    public void setShipToCdLessThanEqual(String shipToCdLessThanEqual) {
        this.shipToCdLessThanEqual = shipToCdLessThanEqual;
    }

    /**
     * shipToCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipToCdLikeFront
     */
    public String getShipToCdLikeFront() {
        return shipToCdLikeFront;
    }

    /**
     * shipToCdLikeFront のセッターメソッドです。
     * 
     * @param shipToCdLikeFront shipToCdLikeFront に設定する
     */
    public void setShipToCdLikeFront(String shipToCdLikeFront) {
        this.shipToCdLikeFront = shipToCdLikeFront;
    }

    /**
     * cmlTypGreaterThan のゲッターメソッドです。
     * 
     * @return the cmlTypGreaterThan
     */
    public String getCmlTypGreaterThan() {
        return cmlTypGreaterThan;
    }

    /**
     * cmlTypGreaterThan のセッターメソッドです。
     * 
     * @param cmlTypGreaterThan cmlTypGreaterThan に設定する
     */
    public void setCmlTypGreaterThan(String cmlTypGreaterThan) {
        this.cmlTypGreaterThan = cmlTypGreaterThan;
    }

    /**
     * cmlTypGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the cmlTypGreaterThanEqual
     */
    public String getCmlTypGreaterThanEqual() {
        return cmlTypGreaterThanEqual;
    }

    /**
     * cmlTypGreaterThanEqual のセッターメソッドです。
     * 
     * @param cmlTypGreaterThanEqual cmlTypGreaterThanEqual に設定する
     */
    public void setCmlTypGreaterThanEqual(String cmlTypGreaterThanEqual) {
        this.cmlTypGreaterThanEqual = cmlTypGreaterThanEqual;
    }

    /**
     * cmlTypLessThan のゲッターメソッドです。
     * 
     * @return the cmlTypLessThan
     */
    public String getCmlTypLessThan() {
        return cmlTypLessThan;
    }

    /**
     * cmlTypLessThan のセッターメソッドです。
     * 
     * @param cmlTypLessThan cmlTypLessThan に設定する
     */
    public void setCmlTypLessThan(String cmlTypLessThan) {
        this.cmlTypLessThan = cmlTypLessThan;
    }

    /**
     * cmlTypLessThanEqual のゲッターメソッドです。
     * 
     * @return the cmlTypLessThanEqual
     */
    public String getCmlTypLessThanEqual() {
        return cmlTypLessThanEqual;
    }

    /**
     * cmlTypLessThanEqual のセッターメソッドです。
     * 
     * @param cmlTypLessThanEqual cmlTypLessThanEqual に設定する
     */
    public void setCmlTypLessThanEqual(String cmlTypLessThanEqual) {
        this.cmlTypLessThanEqual = cmlTypLessThanEqual;
    }

    /**
     * cmlTypLikeFront のゲッターメソッドです。
     * 
     * @return the cmlTypLikeFront
     */
    public String getCmlTypLikeFront() {
        return cmlTypLikeFront;
    }

    /**
     * cmlTypLikeFront のセッターメソッドです。
     * 
     * @param cmlTypLikeFront cmlTypLikeFront に設定する
     */
    public void setCmlTypLikeFront(String cmlTypLikeFront) {
        this.cmlTypLikeFront = cmlTypLikeFront;
    }

    /**
     * invoiceCtgryGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceCtgryGreaterThan
     */
    public String getInvoiceCtgryGreaterThan() {
        return invoiceCtgryGreaterThan;
    }

    /**
     * invoiceCtgryGreaterThan のセッターメソッドです。
     * 
     * @param invoiceCtgryGreaterThan invoiceCtgryGreaterThan に設定する
     */
    public void setInvoiceCtgryGreaterThan(String invoiceCtgryGreaterThan) {
        this.invoiceCtgryGreaterThan = invoiceCtgryGreaterThan;
    }

    /**
     * invoiceCtgryGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceCtgryGreaterThanEqual
     */
    public String getInvoiceCtgryGreaterThanEqual() {
        return invoiceCtgryGreaterThanEqual;
    }

    /**
     * invoiceCtgryGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceCtgryGreaterThanEqual invoiceCtgryGreaterThanEqual に設定する
     */
    public void setInvoiceCtgryGreaterThanEqual(String invoiceCtgryGreaterThanEqual) {
        this.invoiceCtgryGreaterThanEqual = invoiceCtgryGreaterThanEqual;
    }

    /**
     * invoiceCtgryLessThan のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLessThan
     */
    public String getInvoiceCtgryLessThan() {
        return invoiceCtgryLessThan;
    }

    /**
     * invoiceCtgryLessThan のセッターメソッドです。
     * 
     * @param invoiceCtgryLessThan invoiceCtgryLessThan に設定する
     */
    public void setInvoiceCtgryLessThan(String invoiceCtgryLessThan) {
        this.invoiceCtgryLessThan = invoiceCtgryLessThan;
    }

    /**
     * invoiceCtgryLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLessThanEqual
     */
    public String getInvoiceCtgryLessThanEqual() {
        return invoiceCtgryLessThanEqual;
    }

    /**
     * invoiceCtgryLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceCtgryLessThanEqual invoiceCtgryLessThanEqual に設定する
     */
    public void setInvoiceCtgryLessThanEqual(String invoiceCtgryLessThanEqual) {
        this.invoiceCtgryLessThanEqual = invoiceCtgryLessThanEqual;
    }

    /**
     * invoiceCtgryLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceCtgryLikeFront
     */
    public String getInvoiceCtgryLikeFront() {
        return invoiceCtgryLikeFront;
    }

    /**
     * invoiceCtgryLikeFront のセッターメソッドです。
     * 
     * @param invoiceCtgryLikeFront invoiceCtgryLikeFront に設定する
     */
    public void setInvoiceCtgryLikeFront(String invoiceCtgryLikeFront) {
        this.invoiceCtgryLikeFront = invoiceCtgryLikeFront;
    }

    /**
     * invoiceClassGreaterThan のゲッターメソッドです。
     * 
     * @return the invoiceClassGreaterThan
     */
    public String getInvoiceClassGreaterThan() {
        return invoiceClassGreaterThan;
    }

    /**
     * invoiceClassGreaterThan のセッターメソッドです。
     * 
     * @param invoiceClassGreaterThan invoiceClassGreaterThan に設定する
     */
    public void setInvoiceClassGreaterThan(String invoiceClassGreaterThan) {
        this.invoiceClassGreaterThan = invoiceClassGreaterThan;
    }

    /**
     * invoiceClassGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceClassGreaterThanEqual
     */
    public String getInvoiceClassGreaterThanEqual() {
        return invoiceClassGreaterThanEqual;
    }

    /**
     * invoiceClassGreaterThanEqual のセッターメソッドです。
     * 
     * @param invoiceClassGreaterThanEqual invoiceClassGreaterThanEqual に設定する
     */
    public void setInvoiceClassGreaterThanEqual(String invoiceClassGreaterThanEqual) {
        this.invoiceClassGreaterThanEqual = invoiceClassGreaterThanEqual;
    }

    /**
     * invoiceClassLessThan のゲッターメソッドです。
     * 
     * @return the invoiceClassLessThan
     */
    public String getInvoiceClassLessThan() {
        return invoiceClassLessThan;
    }

    /**
     * invoiceClassLessThan のセッターメソッドです。
     * 
     * @param invoiceClassLessThan invoiceClassLessThan に設定する
     */
    public void setInvoiceClassLessThan(String invoiceClassLessThan) {
        this.invoiceClassLessThan = invoiceClassLessThan;
    }

    /**
     * invoiceClassLessThanEqual のゲッターメソッドです。
     * 
     * @return the invoiceClassLessThanEqual
     */
    public String getInvoiceClassLessThanEqual() {
        return invoiceClassLessThanEqual;
    }

    /**
     * invoiceClassLessThanEqual のセッターメソッドです。
     * 
     * @param invoiceClassLessThanEqual invoiceClassLessThanEqual に設定する
     */
    public void setInvoiceClassLessThanEqual(String invoiceClassLessThanEqual) {
        this.invoiceClassLessThanEqual = invoiceClassLessThanEqual;
    }

    /**
     * invoiceClassLikeFront のゲッターメソッドです。
     * 
     * @return the invoiceClassLikeFront
     */
    public String getInvoiceClassLikeFront() {
        return invoiceClassLikeFront;
    }

    /**
     * invoiceClassLikeFront のセッターメソッドです。
     * 
     * @param invoiceClassLikeFront invoiceClassLikeFront に設定する
     */
    public void setInvoiceClassLikeFront(String invoiceClassLikeFront) {
        this.invoiceClassLikeFront = invoiceClassLikeFront;
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
     * free1DispFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free1DispFlgGreaterThan
     */
    public String getFree1DispFlgGreaterThan() {
        return free1DispFlgGreaterThan;
    }

    /**
     * free1DispFlgGreaterThan のセッターメソッドです。
     * 
     * @param free1DispFlgGreaterThan free1DispFlgGreaterThan に設定する
     */
    public void setFree1DispFlgGreaterThan(String free1DispFlgGreaterThan) {
        this.free1DispFlgGreaterThan = free1DispFlgGreaterThan;
    }

    /**
     * free1DispFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free1DispFlgGreaterThanEqual
     */
    public String getFree1DispFlgGreaterThanEqual() {
        return free1DispFlgGreaterThanEqual;
    }

    /**
     * free1DispFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free1DispFlgGreaterThanEqual free1DispFlgGreaterThanEqual に設定する
     */
    public void setFree1DispFlgGreaterThanEqual(String free1DispFlgGreaterThanEqual) {
        this.free1DispFlgGreaterThanEqual = free1DispFlgGreaterThanEqual;
    }

    /**
     * free1DispFlgLessThan のゲッターメソッドです。
     * 
     * @return the free1DispFlgLessThan
     */
    public String getFree1DispFlgLessThan() {
        return free1DispFlgLessThan;
    }

    /**
     * free1DispFlgLessThan のセッターメソッドです。
     * 
     * @param free1DispFlgLessThan free1DispFlgLessThan に設定する
     */
    public void setFree1DispFlgLessThan(String free1DispFlgLessThan) {
        this.free1DispFlgLessThan = free1DispFlgLessThan;
    }

    /**
     * free1DispFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free1DispFlgLessThanEqual
     */
    public String getFree1DispFlgLessThanEqual() {
        return free1DispFlgLessThanEqual;
    }

    /**
     * free1DispFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free1DispFlgLessThanEqual free1DispFlgLessThanEqual に設定する
     */
    public void setFree1DispFlgLessThanEqual(String free1DispFlgLessThanEqual) {
        this.free1DispFlgLessThanEqual = free1DispFlgLessThanEqual;
    }

    /**
     * free1DispFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free1DispFlgLikeFront
     */
    public String getFree1DispFlgLikeFront() {
        return free1DispFlgLikeFront;
    }

    /**
     * free1DispFlgLikeFront のセッターメソッドです。
     * 
     * @param free1DispFlgLikeFront free1DispFlgLikeFront に設定する
     */
    public void setFree1DispFlgLikeFront(String free1DispFlgLikeFront) {
        this.free1DispFlgLikeFront = free1DispFlgLikeFront;
    }

    /**
     * free2DispFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free2DispFlgGreaterThan
     */
    public String getFree2DispFlgGreaterThan() {
        return free2DispFlgGreaterThan;
    }

    /**
     * free2DispFlgGreaterThan のセッターメソッドです。
     * 
     * @param free2DispFlgGreaterThan free2DispFlgGreaterThan に設定する
     */
    public void setFree2DispFlgGreaterThan(String free2DispFlgGreaterThan) {
        this.free2DispFlgGreaterThan = free2DispFlgGreaterThan;
    }

    /**
     * free2DispFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free2DispFlgGreaterThanEqual
     */
    public String getFree2DispFlgGreaterThanEqual() {
        return free2DispFlgGreaterThanEqual;
    }

    /**
     * free2DispFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free2DispFlgGreaterThanEqual free2DispFlgGreaterThanEqual に設定する
     */
    public void setFree2DispFlgGreaterThanEqual(String free2DispFlgGreaterThanEqual) {
        this.free2DispFlgGreaterThanEqual = free2DispFlgGreaterThanEqual;
    }

    /**
     * free2DispFlgLessThan のゲッターメソッドです。
     * 
     * @return the free2DispFlgLessThan
     */
    public String getFree2DispFlgLessThan() {
        return free2DispFlgLessThan;
    }

    /**
     * free2DispFlgLessThan のセッターメソッドです。
     * 
     * @param free2DispFlgLessThan free2DispFlgLessThan に設定する
     */
    public void setFree2DispFlgLessThan(String free2DispFlgLessThan) {
        this.free2DispFlgLessThan = free2DispFlgLessThan;
    }

    /**
     * free2DispFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free2DispFlgLessThanEqual
     */
    public String getFree2DispFlgLessThanEqual() {
        return free2DispFlgLessThanEqual;
    }

    /**
     * free2DispFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free2DispFlgLessThanEqual free2DispFlgLessThanEqual に設定する
     */
    public void setFree2DispFlgLessThanEqual(String free2DispFlgLessThanEqual) {
        this.free2DispFlgLessThanEqual = free2DispFlgLessThanEqual;
    }

    /**
     * free2DispFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free2DispFlgLikeFront
     */
    public String getFree2DispFlgLikeFront() {
        return free2DispFlgLikeFront;
    }

    /**
     * free2DispFlgLikeFront のセッターメソッドです。
     * 
     * @param free2DispFlgLikeFront free2DispFlgLikeFront に設定する
     */
    public void setFree2DispFlgLikeFront(String free2DispFlgLikeFront) {
        this.free2DispFlgLikeFront = free2DispFlgLikeFront;
    }

    /**
     * free3DispFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the free3DispFlgGreaterThan
     */
    public String getFree3DispFlgGreaterThan() {
        return free3DispFlgGreaterThan;
    }

    /**
     * free3DispFlgGreaterThan のセッターメソッドです。
     * 
     * @param free3DispFlgGreaterThan free3DispFlgGreaterThan に設定する
     */
    public void setFree3DispFlgGreaterThan(String free3DispFlgGreaterThan) {
        this.free3DispFlgGreaterThan = free3DispFlgGreaterThan;
    }

    /**
     * free3DispFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the free3DispFlgGreaterThanEqual
     */
    public String getFree3DispFlgGreaterThanEqual() {
        return free3DispFlgGreaterThanEqual;
    }

    /**
     * free3DispFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param free3DispFlgGreaterThanEqual free3DispFlgGreaterThanEqual に設定する
     */
    public void setFree3DispFlgGreaterThanEqual(String free3DispFlgGreaterThanEqual) {
        this.free3DispFlgGreaterThanEqual = free3DispFlgGreaterThanEqual;
    }

    /**
     * free3DispFlgLessThan のゲッターメソッドです。
     * 
     * @return the free3DispFlgLessThan
     */
    public String getFree3DispFlgLessThan() {
        return free3DispFlgLessThan;
    }

    /**
     * free3DispFlgLessThan のセッターメソッドです。
     * 
     * @param free3DispFlgLessThan free3DispFlgLessThan に設定する
     */
    public void setFree3DispFlgLessThan(String free3DispFlgLessThan) {
        this.free3DispFlgLessThan = free3DispFlgLessThan;
    }

    /**
     * free3DispFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the free3DispFlgLessThanEqual
     */
    public String getFree3DispFlgLessThanEqual() {
        return free3DispFlgLessThanEqual;
    }

    /**
     * free3DispFlgLessThanEqual のセッターメソッドです。
     * 
     * @param free3DispFlgLessThanEqual free3DispFlgLessThanEqual に設定する
     */
    public void setFree3DispFlgLessThanEqual(String free3DispFlgLessThanEqual) {
        this.free3DispFlgLessThanEqual = free3DispFlgLessThanEqual;
    }

    /**
     * free3DispFlgLikeFront のゲッターメソッドです。
     * 
     * @return the free3DispFlgLikeFront
     */
    public String getFree3DispFlgLikeFront() {
        return free3DispFlgLikeFront;
    }

    /**
     * free3DispFlgLikeFront のセッターメソッドです。
     * 
     * @param free3DispFlgLikeFront free3DispFlgLikeFront に設定する
     */
    public void setFree3DispFlgLikeFront(String free3DispFlgLikeFront) {
        this.free3DispFlgLikeFront = free3DispFlgLikeFront;
    }

    /**
     * hsCdDispFlgGreaterThan のゲッターメソッドです。
     * 
     * @return the hsCdDispFlgGreaterThan
     */
    public String getHsCdDispFlgGreaterThan() {
        return hsCdDispFlgGreaterThan;
    }

    /**
     * hsCdDispFlgGreaterThan のセッターメソッドです。
     * 
     * @param hsCdDispFlgGreaterThan hsCdDispFlgGreaterThan に設定する
     */
    public void setHsCdDispFlgGreaterThan(String hsCdDispFlgGreaterThan) {
        this.hsCdDispFlgGreaterThan = hsCdDispFlgGreaterThan;
    }

    /**
     * hsCdDispFlgGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the hsCdDispFlgGreaterThanEqual
     */
    public String getHsCdDispFlgGreaterThanEqual() {
        return hsCdDispFlgGreaterThanEqual;
    }

    /**
     * hsCdDispFlgGreaterThanEqual のセッターメソッドです。
     * 
     * @param hsCdDispFlgGreaterThanEqual hsCdDispFlgGreaterThanEqual に設定する
     */
    public void setHsCdDispFlgGreaterThanEqual(String hsCdDispFlgGreaterThanEqual) {
        this.hsCdDispFlgGreaterThanEqual = hsCdDispFlgGreaterThanEqual;
    }

    /**
     * hsCdDispFlgLessThan のゲッターメソッドです。
     * 
     * @return the hsCdDispFlgLessThan
     */
    public String getHsCdDispFlgLessThan() {
        return hsCdDispFlgLessThan;
    }

    /**
     * hsCdDispFlgLessThan のセッターメソッドです。
     * 
     * @param hsCdDispFlgLessThan hsCdDispFlgLessThan に設定する
     */
    public void setHsCdDispFlgLessThan(String hsCdDispFlgLessThan) {
        this.hsCdDispFlgLessThan = hsCdDispFlgLessThan;
    }

    /**
     * hsCdDispFlgLessThanEqual のゲッターメソッドです。
     * 
     * @return the hsCdDispFlgLessThanEqual
     */
    public String getHsCdDispFlgLessThanEqual() {
        return hsCdDispFlgLessThanEqual;
    }

    /**
     * hsCdDispFlgLessThanEqual のセッターメソッドです。
     * 
     * @param hsCdDispFlgLessThanEqual hsCdDispFlgLessThanEqual に設定する
     */
    public void setHsCdDispFlgLessThanEqual(String hsCdDispFlgLessThanEqual) {
        this.hsCdDispFlgLessThanEqual = hsCdDispFlgLessThanEqual;
    }

    /**
     * hsCdDispFlgLikeFront のゲッターメソッドです。
     * 
     * @return the hsCdDispFlgLikeFront
     */
    public String getHsCdDispFlgLikeFront() {
        return hsCdDispFlgLikeFront;
    }

    /**
     * hsCdDispFlgLikeFront のセッターメソッドです。
     * 
     * @param hsCdDispFlgLikeFront hsCdDispFlgLikeFront に設定する
     */
    public void setHsCdDispFlgLikeFront(String hsCdDispFlgLikeFront) {
        this.hsCdDispFlgLikeFront = hsCdDispFlgLikeFront;
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

