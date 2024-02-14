/*
 * PROJECT：eca0027
 * 
 * TtCmlErrorHeader の検索条件Domainクラス
 * テーブル概要：TT_CML_ERROR_HEADER
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/18  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.sql.Timestamp;

/**
 * TtCmlErrorHeader の検索条件Domainクラスです。<BR>
 * テーブル概要：TT_CML_ERROR_HEADER<BR>
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
public class TtCmlErrorHeaderCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * DSC_ID
     */
    private String dscId;

    /**
     * ERR_CREATE_TIMESTAMP
     */
    private Timestamp errCreateTimestamp;

    /**
     * PALLET_NO
     */
    private String palletNo;

    /**
     * EXP_PACKING_ISSUER_NM
     */
    private String expPackingIssuerNm;

    /**
     * SHIPPER_CD
     */
    private String shipperCd;

    /**
     * PLTZ_INSTR_NO
     */
    private String pltzInstrNo;

    /**
     * CUSTOMER_CD
     */
    private String customerCd;

    /**
     * LGCY_SHIP_TO
     */
    private String lgcyShipTo;

    /**
     * TRNS_CD
     */
    private String trnsCd;

    /**
     * PLNT_CD
     */
    private String plntCd;

    /**
     * LGCY_WH_CD
     */
    private String lgcyWhCd;

    /**
     * WH_COMP_CD
     */
    private String whCompCd;

    /**
     * WH_CD
     */
    private String whCd;

    /**
     * CHK_RESULT_A
     */
    private String chkResultA;

    /**
     * CHK_RESULT_B
     */
    private String chkResultB;

    /**
     * CHK_RESULT_C
     */
    private String chkResultC;

    /**
     * CHK_RESULT_D
     */
    private String chkResultD;

    /**
     * CHK_RESULT_E
     */
    private String chkResultE;

    /**
     * CHK_RESULT_F
     */
    private String chkResultF;

    /**
     * CHK_RESULT_G
     */
    private String chkResultG;

    /**
     * CHK_RESULT_H
     */
    private String chkResultH;

    /**
     * CHK_RESULT_I
     */
    private String chkResultI;

    /**
     * CHK_RESULT_J
     */
    private String chkResultJ;

    /**
     * CHK_RESULT_K
     */
    private String chkResultK;

    /**
     * CHK_RESULT_L
     */
    private String chkResultL;

    /**
     * CHK_RESULT_M
     */
    private String chkResultM;

    /**
     * CHK_RESULT_N
     */
    private String chkResultN;

    /**
     * CHK_RESULT_O
     */
    private String chkResultO;

    /**
     * CHK_RESULT_P
     */
    private String chkResultP;

    /**
     * CHK_RESULT_Q
     */
    private String chkResultQ;

    /**
     * CHK_RESULT_R
     */
    private String chkResultR;

    /**
     * CHK_RESULT_S
     */
    private String chkResultS;

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
     * DSC_ID（大なり）
     */
    private String dscIdGreaterThan;

    /**
     * DSC_ID（大なりイコール）
     */
    private String dscIdGreaterThanEqual;

    /**
     * DSC_ID（小なり）
     */
    private String dscIdLessThan;

    /**
     * DSC_ID（小なりイコール）
     */
    private String dscIdLessThanEqual;

    /**
     * DSC_ID（前方一致）
     */
    private String dscIdLikeFront;

    /**
     * PALLET_NO（大なり）
     */
    private String palletNoGreaterThan;

    /**
     * PALLET_NO（大なりイコール）
     */
    private String palletNoGreaterThanEqual;

    /**
     * PALLET_NO（小なり）
     */
    private String palletNoLessThan;

    /**
     * PALLET_NO（小なりイコール）
     */
    private String palletNoLessThanEqual;

    /**
     * PALLET_NO（前方一致）
     */
    private String palletNoLikeFront;

    /**
     * EXP_PACKING_ISSUER_NM（大なり）
     */
    private String expPackingIssuerNmGreaterThan;

    /**
     * EXP_PACKING_ISSUER_NM（大なりイコール）
     */
    private String expPackingIssuerNmGreaterThanEqual;

    /**
     * EXP_PACKING_ISSUER_NM（小なり）
     */
    private String expPackingIssuerNmLessThan;

    /**
     * EXP_PACKING_ISSUER_NM（小なりイコール）
     */
    private String expPackingIssuerNmLessThanEqual;

    /**
     * EXP_PACKING_ISSUER_NM（前方一致）
     */
    private String expPackingIssuerNmLikeFront;

    /**
     * SHIPPER_CD（大なり）
     */
    private String shipperCdGreaterThan;

    /**
     * SHIPPER_CD（大なりイコール）
     */
    private String shipperCdGreaterThanEqual;

    /**
     * SHIPPER_CD（小なり）
     */
    private String shipperCdLessThan;

    /**
     * SHIPPER_CD（小なりイコール）
     */
    private String shipperCdLessThanEqual;

    /**
     * SHIPPER_CD（前方一致）
     */
    private String shipperCdLikeFront;

    /**
     * PLTZ_INSTR_NO（大なり）
     */
    private String pltzInstrNoGreaterThan;

    /**
     * PLTZ_INSTR_NO（大なりイコール）
     */
    private String pltzInstrNoGreaterThanEqual;

    /**
     * PLTZ_INSTR_NO（小なり）
     */
    private String pltzInstrNoLessThan;

    /**
     * PLTZ_INSTR_NO（小なりイコール）
     */
    private String pltzInstrNoLessThanEqual;

    /**
     * PLTZ_INSTR_NO（前方一致）
     */
    private String pltzInstrNoLikeFront;

    /**
     * CUSTOMER_CD（大なり）
     */
    private String customerCdGreaterThan;

    /**
     * CUSTOMER_CD（大なりイコール）
     */
    private String customerCdGreaterThanEqual;

    /**
     * CUSTOMER_CD（小なり）
     */
    private String customerCdLessThan;

    /**
     * CUSTOMER_CD（小なりイコール）
     */
    private String customerCdLessThanEqual;

    /**
     * CUSTOMER_CD（前方一致）
     */
    private String customerCdLikeFront;

    /**
     * LGCY_SHIP_TO（大なり）
     */
    private String lgcyShipToGreaterThan;

    /**
     * LGCY_SHIP_TO（大なりイコール）
     */
    private String lgcyShipToGreaterThanEqual;

    /**
     * LGCY_SHIP_TO（小なり）
     */
    private String lgcyShipToLessThan;

    /**
     * LGCY_SHIP_TO（小なりイコール）
     */
    private String lgcyShipToLessThanEqual;

    /**
     * LGCY_SHIP_TO（前方一致）
     */
    private String lgcyShipToLikeFront;

    /**
     * TRNS_CD（大なり）
     */
    private String trnsCdGreaterThan;

    /**
     * TRNS_CD（大なりイコール）
     */
    private String trnsCdGreaterThanEqual;

    /**
     * TRNS_CD（小なり）
     */
    private String trnsCdLessThan;

    /**
     * TRNS_CD（小なりイコール）
     */
    private String trnsCdLessThanEqual;

    /**
     * TRNS_CD（前方一致）
     */
    private String trnsCdLikeFront;

    /**
     * PLNT_CD（大なり）
     */
    private String plntCdGreaterThan;

    /**
     * PLNT_CD（大なりイコール）
     */
    private String plntCdGreaterThanEqual;

    /**
     * PLNT_CD（小なり）
     */
    private String plntCdLessThan;

    /**
     * PLNT_CD（小なりイコール）
     */
    private String plntCdLessThanEqual;

    /**
     * PLNT_CD（前方一致）
     */
    private String plntCdLikeFront;

    /**
     * LGCY_WH_CD（大なり）
     */
    private String lgcyWhCdGreaterThan;

    /**
     * LGCY_WH_CD（大なりイコール）
     */
    private String lgcyWhCdGreaterThanEqual;

    /**
     * LGCY_WH_CD（小なり）
     */
    private String lgcyWhCdLessThan;

    /**
     * LGCY_WH_CD（小なりイコール）
     */
    private String lgcyWhCdLessThanEqual;

    /**
     * LGCY_WH_CD（前方一致）
     */
    private String lgcyWhCdLikeFront;

    /**
     * WH_COMP_CD（大なり）
     */
    private String whCompCdGreaterThan;

    /**
     * WH_COMP_CD（大なりイコール）
     */
    private String whCompCdGreaterThanEqual;

    /**
     * WH_COMP_CD（小なり）
     */
    private String whCompCdLessThan;

    /**
     * WH_COMP_CD（小なりイコール）
     */
    private String whCompCdLessThanEqual;

    /**
     * WH_COMP_CD（前方一致）
     */
    private String whCompCdLikeFront;

    /**
     * WH_CD（大なり）
     */
    private String whCdGreaterThan;

    /**
     * WH_CD（大なりイコール）
     */
    private String whCdGreaterThanEqual;

    /**
     * WH_CD（小なり）
     */
    private String whCdLessThan;

    /**
     * WH_CD（小なりイコール）
     */
    private String whCdLessThanEqual;

    /**
     * WH_CD（前方一致）
     */
    private String whCdLikeFront;

    /**
     * CHK_RESULT_A（大なり）
     */
    private String chkResultAGreaterThan;

    /**
     * CHK_RESULT_A（大なりイコール）
     */
    private String chkResultAGreaterThanEqual;

    /**
     * CHK_RESULT_A（小なり）
     */
    private String chkResultALessThan;

    /**
     * CHK_RESULT_A（小なりイコール）
     */
    private String chkResultALessThanEqual;

    /**
     * CHK_RESULT_A（前方一致）
     */
    private String chkResultALikeFront;

    /**
     * CHK_RESULT_B（大なり）
     */
    private String chkResultBGreaterThan;

    /**
     * CHK_RESULT_B（大なりイコール）
     */
    private String chkResultBGreaterThanEqual;

    /**
     * CHK_RESULT_B（小なり）
     */
    private String chkResultBLessThan;

    /**
     * CHK_RESULT_B（小なりイコール）
     */
    private String chkResultBLessThanEqual;

    /**
     * CHK_RESULT_B（前方一致）
     */
    private String chkResultBLikeFront;

    /**
     * CHK_RESULT_C（大なり）
     */
    private String chkResultCGreaterThan;

    /**
     * CHK_RESULT_C（大なりイコール）
     */
    private String chkResultCGreaterThanEqual;

    /**
     * CHK_RESULT_C（小なり）
     */
    private String chkResultCLessThan;

    /**
     * CHK_RESULT_C（小なりイコール）
     */
    private String chkResultCLessThanEqual;

    /**
     * CHK_RESULT_C（前方一致）
     */
    private String chkResultCLikeFront;

    /**
     * CHK_RESULT_D（大なり）
     */
    private String chkResultDGreaterThan;

    /**
     * CHK_RESULT_D（大なりイコール）
     */
    private String chkResultDGreaterThanEqual;

    /**
     * CHK_RESULT_D（小なり）
     */
    private String chkResultDLessThan;

    /**
     * CHK_RESULT_D（小なりイコール）
     */
    private String chkResultDLessThanEqual;

    /**
     * CHK_RESULT_D（前方一致）
     */
    private String chkResultDLikeFront;

    /**
     * CHK_RESULT_E（大なり）
     */
    private String chkResultEGreaterThan;

    /**
     * CHK_RESULT_E（大なりイコール）
     */
    private String chkResultEGreaterThanEqual;

    /**
     * CHK_RESULT_E（小なり）
     */
    private String chkResultELessThan;

    /**
     * CHK_RESULT_E（小なりイコール）
     */
    private String chkResultELessThanEqual;

    /**
     * CHK_RESULT_E（前方一致）
     */
    private String chkResultELikeFront;

    /**
     * CHK_RESULT_F（大なり）
     */
    private String chkResultFGreaterThan;

    /**
     * CHK_RESULT_F（大なりイコール）
     */
    private String chkResultFGreaterThanEqual;

    /**
     * CHK_RESULT_F（小なり）
     */
    private String chkResultFLessThan;

    /**
     * CHK_RESULT_F（小なりイコール）
     */
    private String chkResultFLessThanEqual;

    /**
     * CHK_RESULT_F（前方一致）
     */
    private String chkResultFLikeFront;

    /**
     * CHK_RESULT_G（大なり）
     */
    private String chkResultGGreaterThan;

    /**
     * CHK_RESULT_G（大なりイコール）
     */
    private String chkResultGGreaterThanEqual;

    /**
     * CHK_RESULT_G（小なり）
     */
    private String chkResultGLessThan;

    /**
     * CHK_RESULT_G（小なりイコール）
     */
    private String chkResultGLessThanEqual;

    /**
     * CHK_RESULT_G（前方一致）
     */
    private String chkResultGLikeFront;

    /**
     * CHK_RESULT_H（大なり）
     */
    private String chkResultHGreaterThan;

    /**
     * CHK_RESULT_H（大なりイコール）
     */
    private String chkResultHGreaterThanEqual;

    /**
     * CHK_RESULT_H（小なり）
     */
    private String chkResultHLessThan;

    /**
     * CHK_RESULT_H（小なりイコール）
     */
    private String chkResultHLessThanEqual;

    /**
     * CHK_RESULT_H（前方一致）
     */
    private String chkResultHLikeFront;

    /**
     * CHK_RESULT_I（大なり）
     */
    private String chkResultIGreaterThan;

    /**
     * CHK_RESULT_I（大なりイコール）
     */
    private String chkResultIGreaterThanEqual;

    /**
     * CHK_RESULT_I（小なり）
     */
    private String chkResultILessThan;

    /**
     * CHK_RESULT_I（小なりイコール）
     */
    private String chkResultILessThanEqual;

    /**
     * CHK_RESULT_I（前方一致）
     */
    private String chkResultILikeFront;

    /**
     * CHK_RESULT_J（大なり）
     */
    private String chkResultJGreaterThan;

    /**
     * CHK_RESULT_J（大なりイコール）
     */
    private String chkResultJGreaterThanEqual;

    /**
     * CHK_RESULT_J（小なり）
     */
    private String chkResultJLessThan;

    /**
     * CHK_RESULT_J（小なりイコール）
     */
    private String chkResultJLessThanEqual;

    /**
     * CHK_RESULT_J（前方一致）
     */
    private String chkResultJLikeFront;

    /**
     * CHK_RESULT_K（大なり）
     */
    private String chkResultKGreaterThan;

    /**
     * CHK_RESULT_K（大なりイコール）
     */
    private String chkResultKGreaterThanEqual;

    /**
     * CHK_RESULT_K（小なり）
     */
    private String chkResultKLessThan;

    /**
     * CHK_RESULT_K（小なりイコール）
     */
    private String chkResultKLessThanEqual;

    /**
     * CHK_RESULT_K（前方一致）
     */
    private String chkResultKLikeFront;

    /**
     * CHK_RESULT_L（大なり）
     */
    private String chkResultLGreaterThan;

    /**
     * CHK_RESULT_L（大なりイコール）
     */
    private String chkResultLGreaterThanEqual;

    /**
     * CHK_RESULT_L（小なり）
     */
    private String chkResultLLessThan;

    /**
     * CHK_RESULT_L（小なりイコール）
     */
    private String chkResultLLessThanEqual;

    /**
     * CHK_RESULT_L（前方一致）
     */
    private String chkResultLLikeFront;

    /**
     * CHK_RESULT_M（大なり）
     */
    private String chkResultMGreaterThan;

    /**
     * CHK_RESULT_M（大なりイコール）
     */
    private String chkResultMGreaterThanEqual;

    /**
     * CHK_RESULT_M（小なり）
     */
    private String chkResultMLessThan;

    /**
     * CHK_RESULT_M（小なりイコール）
     */
    private String chkResultMLessThanEqual;

    /**
     * CHK_RESULT_M（前方一致）
     */
    private String chkResultMLikeFront;

    /**
     * CHK_RESULT_N（大なり）
     */
    private String chkResultNGreaterThan;

    /**
     * CHK_RESULT_N（大なりイコール）
     */
    private String chkResultNGreaterThanEqual;

    /**
     * CHK_RESULT_N（小なり）
     */
    private String chkResultNLessThan;

    /**
     * CHK_RESULT_N（小なりイコール）
     */
    private String chkResultNLessThanEqual;

    /**
     * CHK_RESULT_N（前方一致）
     */
    private String chkResultNLikeFront;

    /**
     * CHK_RESULT_O（大なり）
     */
    private String chkResultOGreaterThan;

    /**
     * CHK_RESULT_O（大なりイコール）
     */
    private String chkResultOGreaterThanEqual;

    /**
     * CHK_RESULT_O（小なり）
     */
    private String chkResultOLessThan;

    /**
     * CHK_RESULT_O（小なりイコール）
     */
    private String chkResultOLessThanEqual;

    /**
     * CHK_RESULT_O（前方一致）
     */
    private String chkResultOLikeFront;

    /**
     * CHK_RESULT_P（大なり）
     */
    private String chkResultPGreaterThan;

    /**
     * CHK_RESULT_P（大なりイコール）
     */
    private String chkResultPGreaterThanEqual;

    /**
     * CHK_RESULT_P（小なり）
     */
    private String chkResultPLessThan;

    /**
     * CHK_RESULT_P（小なりイコール）
     */
    private String chkResultPLessThanEqual;

    /**
     * CHK_RESULT_P（前方一致）
     */
    private String chkResultPLikeFront;

    /**
     * CHK_RESULT_Q（大なり）
     */
    private String chkResultQGreaterThan;

    /**
     * CHK_RESULT_Q（大なりイコール）
     */
    private String chkResultQGreaterThanEqual;

    /**
     * CHK_RESULT_Q（小なり）
     */
    private String chkResultQLessThan;

    /**
     * CHK_RESULT_Q（小なりイコール）
     */
    private String chkResultQLessThanEqual;

    /**
     * CHK_RESULT_Q（前方一致）
     */
    private String chkResultQLikeFront;

    /**
     * CHK_RESULT_R（大なり）
     */
    private String chkResultRGreaterThan;

    /**
     * CHK_RESULT_R（大なりイコール）
     */
    private String chkResultRGreaterThanEqual;

    /**
     * CHK_RESULT_R（小なり）
     */
    private String chkResultRLessThan;

    /**
     * CHK_RESULT_R（小なりイコール）
     */
    private String chkResultRLessThanEqual;

    /**
     * CHK_RESULT_R（前方一致）
     */
    private String chkResultRLikeFront;

    /**
     * CHK_RESULT_S（大なり）
     */
    private String chkResultSGreaterThan;

    /**
     * CHK_RESULT_S（大なりイコール）
     */
    private String chkResultSGreaterThanEqual;

    /**
     * CHK_RESULT_S（小なり）
     */
    private String chkResultSLessThan;

    /**
     * CHK_RESULT_S（小なりイコール）
     */
    private String chkResultSLessThanEqual;

    /**
     * CHK_RESULT_S（前方一致）
     */
    private String chkResultSLikeFront;

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
    public TtCmlErrorHeaderCriteriaDomain() {
    }

    /**
     * dscId のゲッターメソッドです。
     * 
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * dscId のセッターメソッドです。
     * 
     * @param dscId dscId に設定する
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * errCreateTimestamp のゲッターメソッドです。
     * 
     * @return the errCreateTimestamp
     */
    public Timestamp getErrCreateTimestamp() {
        return errCreateTimestamp;
    }

    /**
     * errCreateTimestamp のセッターメソッドです。
     * 
     * @param errCreateTimestamp errCreateTimestamp に設定する
     */
    public void setErrCreateTimestamp(Timestamp errCreateTimestamp) {
        this.errCreateTimestamp = errCreateTimestamp;
    }

    /**
     * palletNo のゲッターメソッドです。
     * 
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * palletNo のセッターメソッドです。
     * 
     * @param palletNo palletNo に設定する
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * expPackingIssuerNm のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNm
     */
    public String getExpPackingIssuerNm() {
        return expPackingIssuerNm;
    }

    /**
     * expPackingIssuerNm のセッターメソッドです。
     * 
     * @param expPackingIssuerNm expPackingIssuerNm に設定する
     */
    public void setExpPackingIssuerNm(String expPackingIssuerNm) {
        this.expPackingIssuerNm = expPackingIssuerNm;
    }

    /**
     * shipperCd のゲッターメソッドです。
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * shipperCd のセッターメソッドです。
     * 
     * @param shipperCd shipperCd に設定する
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * pltzInstrNo のゲッターメソッドです。
     * 
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * pltzInstrNo のセッターメソッドです。
     * 
     * @param pltzInstrNo pltzInstrNo に設定する
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * customerCd のゲッターメソッドです。
     * 
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * customerCd のセッターメソッドです。
     * 
     * @param customerCd customerCd に設定する
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * lgcyShipTo のゲッターメソッドです。
     * 
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * lgcyShipTo のセッターメソッドです。
     * 
     * @param lgcyShipTo lgcyShipTo に設定する
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * trnsCd のゲッターメソッドです。
     * 
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * trnsCd のセッターメソッドです。
     * 
     * @param trnsCd trnsCd に設定する
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
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
     * lgcyWhCd のゲッターメソッドです。
     * 
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * lgcyWhCd のセッターメソッドです。
     * 
     * @param lgcyWhCd lgcyWhCd に設定する
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * whCompCd のゲッターメソッドです。
     * 
     * @return the whCompCd
     */
    public String getWhCompCd() {
        return whCompCd;
    }

    /**
     * whCompCd のセッターメソッドです。
     * 
     * @param whCompCd whCompCd に設定する
     */
    public void setWhCompCd(String whCompCd) {
        this.whCompCd = whCompCd;
    }

    /**
     * whCd のゲッターメソッドです。
     * 
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * whCd のセッターメソッドです。
     * 
     * @param whCd whCd に設定する
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * chkResultA のゲッターメソッドです。
     * 
     * @return the chkResultA
     */
    public String getChkResultA() {
        return chkResultA;
    }

    /**
     * chkResultA のセッターメソッドです。
     * 
     * @param chkResultA chkResultA に設定する
     */
    public void setChkResultA(String chkResultA) {
        this.chkResultA = chkResultA;
    }

    /**
     * chkResultB のゲッターメソッドです。
     * 
     * @return the chkResultB
     */
    public String getChkResultB() {
        return chkResultB;
    }

    /**
     * chkResultB のセッターメソッドです。
     * 
     * @param chkResultB chkResultB に設定する
     */
    public void setChkResultB(String chkResultB) {
        this.chkResultB = chkResultB;
    }

    /**
     * chkResultC のゲッターメソッドです。
     * 
     * @return the chkResultC
     */
    public String getChkResultC() {
        return chkResultC;
    }

    /**
     * chkResultC のセッターメソッドです。
     * 
     * @param chkResultC chkResultC に設定する
     */
    public void setChkResultC(String chkResultC) {
        this.chkResultC = chkResultC;
    }

    /**
     * chkResultD のゲッターメソッドです。
     * 
     * @return the chkResultD
     */
    public String getChkResultD() {
        return chkResultD;
    }

    /**
     * chkResultD のセッターメソッドです。
     * 
     * @param chkResultD chkResultD に設定する
     */
    public void setChkResultD(String chkResultD) {
        this.chkResultD = chkResultD;
    }

    /**
     * chkResultE のゲッターメソッドです。
     * 
     * @return the chkResultE
     */
    public String getChkResultE() {
        return chkResultE;
    }

    /**
     * chkResultE のセッターメソッドです。
     * 
     * @param chkResultE chkResultE に設定する
     */
    public void setChkResultE(String chkResultE) {
        this.chkResultE = chkResultE;
    }

    /**
     * chkResultF のゲッターメソッドです。
     * 
     * @return the chkResultF
     */
    public String getChkResultF() {
        return chkResultF;
    }

    /**
     * chkResultF のセッターメソッドです。
     * 
     * @param chkResultF chkResultF に設定する
     */
    public void setChkResultF(String chkResultF) {
        this.chkResultF = chkResultF;
    }

    /**
     * chkResultG のゲッターメソッドです。
     * 
     * @return the chkResultG
     */
    public String getChkResultG() {
        return chkResultG;
    }

    /**
     * chkResultG のセッターメソッドです。
     * 
     * @param chkResultG chkResultG に設定する
     */
    public void setChkResultG(String chkResultG) {
        this.chkResultG = chkResultG;
    }

    /**
     * chkResultH のゲッターメソッドです。
     * 
     * @return the chkResultH
     */
    public String getChkResultH() {
        return chkResultH;
    }

    /**
     * chkResultH のセッターメソッドです。
     * 
     * @param chkResultH chkResultH に設定する
     */
    public void setChkResultH(String chkResultH) {
        this.chkResultH = chkResultH;
    }

    /**
     * chkResultI のゲッターメソッドです。
     * 
     * @return the chkResultI
     */
    public String getChkResultI() {
        return chkResultI;
    }

    /**
     * chkResultI のセッターメソッドです。
     * 
     * @param chkResultI chkResultI に設定する
     */
    public void setChkResultI(String chkResultI) {
        this.chkResultI = chkResultI;
    }

    /**
     * chkResultJ のゲッターメソッドです。
     * 
     * @return the chkResultJ
     */
    public String getChkResultJ() {
        return chkResultJ;
    }

    /**
     * chkResultJ のセッターメソッドです。
     * 
     * @param chkResultJ chkResultJ に設定する
     */
    public void setChkResultJ(String chkResultJ) {
        this.chkResultJ = chkResultJ;
    }

    /**
     * chkResultK のゲッターメソッドです。
     * 
     * @return the chkResultK
     */
    public String getChkResultK() {
        return chkResultK;
    }

    /**
     * chkResultK のセッターメソッドです。
     * 
     * @param chkResultK chkResultK に設定する
     */
    public void setChkResultK(String chkResultK) {
        this.chkResultK = chkResultK;
    }

    /**
     * chkResultL のゲッターメソッドです。
     * 
     * @return the chkResultL
     */
    public String getChkResultL() {
        return chkResultL;
    }

    /**
     * chkResultL のセッターメソッドです。
     * 
     * @param chkResultL chkResultL に設定する
     */
    public void setChkResultL(String chkResultL) {
        this.chkResultL = chkResultL;
    }

    /**
     * chkResultM のゲッターメソッドです。
     * 
     * @return the chkResultM
     */
    public String getChkResultM() {
        return chkResultM;
    }

    /**
     * chkResultM のセッターメソッドです。
     * 
     * @param chkResultM chkResultM に設定する
     */
    public void setChkResultM(String chkResultM) {
        this.chkResultM = chkResultM;
    }

    /**
     * chkResultN のゲッターメソッドです。
     * 
     * @return the chkResultN
     */
    public String getChkResultN() {
        return chkResultN;
    }

    /**
     * chkResultN のセッターメソッドです。
     * 
     * @param chkResultN chkResultN に設定する
     */
    public void setChkResultN(String chkResultN) {
        this.chkResultN = chkResultN;
    }

    /**
     * chkResultO のゲッターメソッドです。
     * 
     * @return the chkResultO
     */
    public String getChkResultO() {
        return chkResultO;
    }

    /**
     * chkResultO のセッターメソッドです。
     * 
     * @param chkResultO chkResultO に設定する
     */
    public void setChkResultO(String chkResultO) {
        this.chkResultO = chkResultO;
    }

    /**
     * chkResultP のゲッターメソッドです。
     * 
     * @return the chkResultP
     */
    public String getChkResultP() {
        return chkResultP;
    }

    /**
     * chkResultP のセッターメソッドです。
     * 
     * @param chkResultP chkResultP に設定する
     */
    public void setChkResultP(String chkResultP) {
        this.chkResultP = chkResultP;
    }

    /**
     * chkResultQ のゲッターメソッドです。
     * 
     * @return the chkResultQ
     */
    public String getChkResultQ() {
        return chkResultQ;
    }

    /**
     * chkResultQ のセッターメソッドです。
     * 
     * @param chkResultQ chkResultQ に設定する
     */
    public void setChkResultQ(String chkResultQ) {
        this.chkResultQ = chkResultQ;
    }

    /**
     * chkResultR のゲッターメソッドです。
     * 
     * @return the chkResultR
     */
    public String getChkResultR() {
        return chkResultR;
    }

    /**
     * chkResultR のセッターメソッドです。
     * 
     * @param chkResultR chkResultR に設定する
     */
    public void setChkResultR(String chkResultR) {
        this.chkResultR = chkResultR;
    }

    /**
     * chkResultS のゲッターメソッドです。
     * 
     * @return the chkResultS
     */
    public String getChkResultS() {
        return chkResultS;
    }

    /**
     * chkResultS のセッターメソッドです。
     * 
     * @param chkResultS chkResultS に設定する
     */
    public void setChkResultS(String chkResultS) {
        this.chkResultS = chkResultS;
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
     * dscIdGreaterThan のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThan
     */
    public String getDscIdGreaterThan() {
        return dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThan のセッターメソッドです。
     * 
     * @param dscIdGreaterThan dscIdGreaterThan に設定する
     */
    public void setDscIdGreaterThan(String dscIdGreaterThan) {
        this.dscIdGreaterThan = dscIdGreaterThan;
    }

    /**
     * dscIdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdGreaterThanEqual
     */
    public String getDscIdGreaterThanEqual() {
        return dscIdGreaterThanEqual;
    }

    /**
     * dscIdGreaterThanEqual のセッターメソッドです。
     * 
     * @param dscIdGreaterThanEqual dscIdGreaterThanEqual に設定する
     */
    public void setDscIdGreaterThanEqual(String dscIdGreaterThanEqual) {
        this.dscIdGreaterThanEqual = dscIdGreaterThanEqual;
    }

    /**
     * dscIdLessThan のゲッターメソッドです。
     * 
     * @return the dscIdLessThan
     */
    public String getDscIdLessThan() {
        return dscIdLessThan;
    }

    /**
     * dscIdLessThan のセッターメソッドです。
     * 
     * @param dscIdLessThan dscIdLessThan に設定する
     */
    public void setDscIdLessThan(String dscIdLessThan) {
        this.dscIdLessThan = dscIdLessThan;
    }

    /**
     * dscIdLessThanEqual のゲッターメソッドです。
     * 
     * @return the dscIdLessThanEqual
     */
    public String getDscIdLessThanEqual() {
        return dscIdLessThanEqual;
    }

    /**
     * dscIdLessThanEqual のセッターメソッドです。
     * 
     * @param dscIdLessThanEqual dscIdLessThanEqual に設定する
     */
    public void setDscIdLessThanEqual(String dscIdLessThanEqual) {
        this.dscIdLessThanEqual = dscIdLessThanEqual;
    }

    /**
     * dscIdLikeFront のゲッターメソッドです。
     * 
     * @return the dscIdLikeFront
     */
    public String getDscIdLikeFront() {
        return dscIdLikeFront;
    }

    /**
     * dscIdLikeFront のセッターメソッドです。
     * 
     * @param dscIdLikeFront dscIdLikeFront に設定する
     */
    public void setDscIdLikeFront(String dscIdLikeFront) {
        this.dscIdLikeFront = dscIdLikeFront;
    }

    /**
     * palletNoGreaterThan のゲッターメソッドです。
     * 
     * @return the palletNoGreaterThan
     */
    public String getPalletNoGreaterThan() {
        return palletNoGreaterThan;
    }

    /**
     * palletNoGreaterThan のセッターメソッドです。
     * 
     * @param palletNoGreaterThan palletNoGreaterThan に設定する
     */
    public void setPalletNoGreaterThan(String palletNoGreaterThan) {
        this.palletNoGreaterThan = palletNoGreaterThan;
    }

    /**
     * palletNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the palletNoGreaterThanEqual
     */
    public String getPalletNoGreaterThanEqual() {
        return palletNoGreaterThanEqual;
    }

    /**
     * palletNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param palletNoGreaterThanEqual palletNoGreaterThanEqual に設定する
     */
    public void setPalletNoGreaterThanEqual(String palletNoGreaterThanEqual) {
        this.palletNoGreaterThanEqual = palletNoGreaterThanEqual;
    }

    /**
     * palletNoLessThan のゲッターメソッドです。
     * 
     * @return the palletNoLessThan
     */
    public String getPalletNoLessThan() {
        return palletNoLessThan;
    }

    /**
     * palletNoLessThan のセッターメソッドです。
     * 
     * @param palletNoLessThan palletNoLessThan に設定する
     */
    public void setPalletNoLessThan(String palletNoLessThan) {
        this.palletNoLessThan = palletNoLessThan;
    }

    /**
     * palletNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the palletNoLessThanEqual
     */
    public String getPalletNoLessThanEqual() {
        return palletNoLessThanEqual;
    }

    /**
     * palletNoLessThanEqual のセッターメソッドです。
     * 
     * @param palletNoLessThanEqual palletNoLessThanEqual に設定する
     */
    public void setPalletNoLessThanEqual(String palletNoLessThanEqual) {
        this.palletNoLessThanEqual = palletNoLessThanEqual;
    }

    /**
     * palletNoLikeFront のゲッターメソッドです。
     * 
     * @return the palletNoLikeFront
     */
    public String getPalletNoLikeFront() {
        return palletNoLikeFront;
    }

    /**
     * palletNoLikeFront のセッターメソッドです。
     * 
     * @param palletNoLikeFront palletNoLikeFront に設定する
     */
    public void setPalletNoLikeFront(String palletNoLikeFront) {
        this.palletNoLikeFront = palletNoLikeFront;
    }

    /**
     * expPackingIssuerNmGreaterThan のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmGreaterThan
     */
    public String getExpPackingIssuerNmGreaterThan() {
        return expPackingIssuerNmGreaterThan;
    }

    /**
     * expPackingIssuerNmGreaterThan のセッターメソッドです。
     * 
     * @param expPackingIssuerNmGreaterThan expPackingIssuerNmGreaterThan に設定する
     */
    public void setExpPackingIssuerNmGreaterThan(String expPackingIssuerNmGreaterThan) {
        this.expPackingIssuerNmGreaterThan = expPackingIssuerNmGreaterThan;
    }

    /**
     * expPackingIssuerNmGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmGreaterThanEqual
     */
    public String getExpPackingIssuerNmGreaterThanEqual() {
        return expPackingIssuerNmGreaterThanEqual;
    }

    /**
     * expPackingIssuerNmGreaterThanEqual のセッターメソッドです。
     * 
     * @param expPackingIssuerNmGreaterThanEqual expPackingIssuerNmGreaterThanEqual に設定する
     */
    public void setExpPackingIssuerNmGreaterThanEqual(String expPackingIssuerNmGreaterThanEqual) {
        this.expPackingIssuerNmGreaterThanEqual = expPackingIssuerNmGreaterThanEqual;
    }

    /**
     * expPackingIssuerNmLessThan のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmLessThan
     */
    public String getExpPackingIssuerNmLessThan() {
        return expPackingIssuerNmLessThan;
    }

    /**
     * expPackingIssuerNmLessThan のセッターメソッドです。
     * 
     * @param expPackingIssuerNmLessThan expPackingIssuerNmLessThan に設定する
     */
    public void setExpPackingIssuerNmLessThan(String expPackingIssuerNmLessThan) {
        this.expPackingIssuerNmLessThan = expPackingIssuerNmLessThan;
    }

    /**
     * expPackingIssuerNmLessThanEqual のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmLessThanEqual
     */
    public String getExpPackingIssuerNmLessThanEqual() {
        return expPackingIssuerNmLessThanEqual;
    }

    /**
     * expPackingIssuerNmLessThanEqual のセッターメソッドです。
     * 
     * @param expPackingIssuerNmLessThanEqual expPackingIssuerNmLessThanEqual に設定する
     */
    public void setExpPackingIssuerNmLessThanEqual(String expPackingIssuerNmLessThanEqual) {
        this.expPackingIssuerNmLessThanEqual = expPackingIssuerNmLessThanEqual;
    }

    /**
     * expPackingIssuerNmLikeFront のゲッターメソッドです。
     * 
     * @return the expPackingIssuerNmLikeFront
     */
    public String getExpPackingIssuerNmLikeFront() {
        return expPackingIssuerNmLikeFront;
    }

    /**
     * expPackingIssuerNmLikeFront のセッターメソッドです。
     * 
     * @param expPackingIssuerNmLikeFront expPackingIssuerNmLikeFront に設定する
     */
    public void setExpPackingIssuerNmLikeFront(String expPackingIssuerNmLikeFront) {
        this.expPackingIssuerNmLikeFront = expPackingIssuerNmLikeFront;
    }

    /**
     * shipperCdGreaterThan のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThan
     */
    public String getShipperCdGreaterThan() {
        return shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThan のセッターメソッドです。
     * 
     * @param shipperCdGreaterThan shipperCdGreaterThan に設定する
     */
    public void setShipperCdGreaterThan(String shipperCdGreaterThan) {
        this.shipperCdGreaterThan = shipperCdGreaterThan;
    }

    /**
     * shipperCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdGreaterThanEqual
     */
    public String getShipperCdGreaterThanEqual() {
        return shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param shipperCdGreaterThanEqual shipperCdGreaterThanEqual に設定する
     */
    public void setShipperCdGreaterThanEqual(String shipperCdGreaterThanEqual) {
        this.shipperCdGreaterThanEqual = shipperCdGreaterThanEqual;
    }

    /**
     * shipperCdLessThan のゲッターメソッドです。
     * 
     * @return the shipperCdLessThan
     */
    public String getShipperCdLessThan() {
        return shipperCdLessThan;
    }

    /**
     * shipperCdLessThan のセッターメソッドです。
     * 
     * @param shipperCdLessThan shipperCdLessThan に設定する
     */
    public void setShipperCdLessThan(String shipperCdLessThan) {
        this.shipperCdLessThan = shipperCdLessThan;
    }

    /**
     * shipperCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the shipperCdLessThanEqual
     */
    public String getShipperCdLessThanEqual() {
        return shipperCdLessThanEqual;
    }

    /**
     * shipperCdLessThanEqual のセッターメソッドです。
     * 
     * @param shipperCdLessThanEqual shipperCdLessThanEqual に設定する
     */
    public void setShipperCdLessThanEqual(String shipperCdLessThanEqual) {
        this.shipperCdLessThanEqual = shipperCdLessThanEqual;
    }

    /**
     * shipperCdLikeFront のゲッターメソッドです。
     * 
     * @return the shipperCdLikeFront
     */
    public String getShipperCdLikeFront() {
        return shipperCdLikeFront;
    }

    /**
     * shipperCdLikeFront のセッターメソッドです。
     * 
     * @param shipperCdLikeFront shipperCdLikeFront に設定する
     */
    public void setShipperCdLikeFront(String shipperCdLikeFront) {
        this.shipperCdLikeFront = shipperCdLikeFront;
    }

    /**
     * pltzInstrNoGreaterThan のゲッターメソッドです。
     * 
     * @return the pltzInstrNoGreaterThan
     */
    public String getPltzInstrNoGreaterThan() {
        return pltzInstrNoGreaterThan;
    }

    /**
     * pltzInstrNoGreaterThan のセッターメソッドです。
     * 
     * @param pltzInstrNoGreaterThan pltzInstrNoGreaterThan に設定する
     */
    public void setPltzInstrNoGreaterThan(String pltzInstrNoGreaterThan) {
        this.pltzInstrNoGreaterThan = pltzInstrNoGreaterThan;
    }

    /**
     * pltzInstrNoGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrNoGreaterThanEqual
     */
    public String getPltzInstrNoGreaterThanEqual() {
        return pltzInstrNoGreaterThanEqual;
    }

    /**
     * pltzInstrNoGreaterThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrNoGreaterThanEqual pltzInstrNoGreaterThanEqual に設定する
     */
    public void setPltzInstrNoGreaterThanEqual(String pltzInstrNoGreaterThanEqual) {
        this.pltzInstrNoGreaterThanEqual = pltzInstrNoGreaterThanEqual;
    }

    /**
     * pltzInstrNoLessThan のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLessThan
     */
    public String getPltzInstrNoLessThan() {
        return pltzInstrNoLessThan;
    }

    /**
     * pltzInstrNoLessThan のセッターメソッドです。
     * 
     * @param pltzInstrNoLessThan pltzInstrNoLessThan に設定する
     */
    public void setPltzInstrNoLessThan(String pltzInstrNoLessThan) {
        this.pltzInstrNoLessThan = pltzInstrNoLessThan;
    }

    /**
     * pltzInstrNoLessThanEqual のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLessThanEqual
     */
    public String getPltzInstrNoLessThanEqual() {
        return pltzInstrNoLessThanEqual;
    }

    /**
     * pltzInstrNoLessThanEqual のセッターメソッドです。
     * 
     * @param pltzInstrNoLessThanEqual pltzInstrNoLessThanEqual に設定する
     */
    public void setPltzInstrNoLessThanEqual(String pltzInstrNoLessThanEqual) {
        this.pltzInstrNoLessThanEqual = pltzInstrNoLessThanEqual;
    }

    /**
     * pltzInstrNoLikeFront のゲッターメソッドです。
     * 
     * @return the pltzInstrNoLikeFront
     */
    public String getPltzInstrNoLikeFront() {
        return pltzInstrNoLikeFront;
    }

    /**
     * pltzInstrNoLikeFront のセッターメソッドです。
     * 
     * @param pltzInstrNoLikeFront pltzInstrNoLikeFront に設定する
     */
    public void setPltzInstrNoLikeFront(String pltzInstrNoLikeFront) {
        this.pltzInstrNoLikeFront = pltzInstrNoLikeFront;
    }

    /**
     * customerCdGreaterThan のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThan
     */
    public String getCustomerCdGreaterThan() {
        return customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThan のセッターメソッドです。
     * 
     * @param customerCdGreaterThan customerCdGreaterThan に設定する
     */
    public void setCustomerCdGreaterThan(String customerCdGreaterThan) {
        this.customerCdGreaterThan = customerCdGreaterThan;
    }

    /**
     * customerCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdGreaterThanEqual
     */
    public String getCustomerCdGreaterThanEqual() {
        return customerCdGreaterThanEqual;
    }

    /**
     * customerCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param customerCdGreaterThanEqual customerCdGreaterThanEqual に設定する
     */
    public void setCustomerCdGreaterThanEqual(String customerCdGreaterThanEqual) {
        this.customerCdGreaterThanEqual = customerCdGreaterThanEqual;
    }

    /**
     * customerCdLessThan のゲッターメソッドです。
     * 
     * @return the customerCdLessThan
     */
    public String getCustomerCdLessThan() {
        return customerCdLessThan;
    }

    /**
     * customerCdLessThan のセッターメソッドです。
     * 
     * @param customerCdLessThan customerCdLessThan に設定する
     */
    public void setCustomerCdLessThan(String customerCdLessThan) {
        this.customerCdLessThan = customerCdLessThan;
    }

    /**
     * customerCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the customerCdLessThanEqual
     */
    public String getCustomerCdLessThanEqual() {
        return customerCdLessThanEqual;
    }

    /**
     * customerCdLessThanEqual のセッターメソッドです。
     * 
     * @param customerCdLessThanEqual customerCdLessThanEqual に設定する
     */
    public void setCustomerCdLessThanEqual(String customerCdLessThanEqual) {
        this.customerCdLessThanEqual = customerCdLessThanEqual;
    }

    /**
     * customerCdLikeFront のゲッターメソッドです。
     * 
     * @return the customerCdLikeFront
     */
    public String getCustomerCdLikeFront() {
        return customerCdLikeFront;
    }

    /**
     * customerCdLikeFront のセッターメソッドです。
     * 
     * @param customerCdLikeFront customerCdLikeFront に設定する
     */
    public void setCustomerCdLikeFront(String customerCdLikeFront) {
        this.customerCdLikeFront = customerCdLikeFront;
    }

    /**
     * lgcyShipToGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThan
     */
    public String getLgcyShipToGreaterThan() {
        return lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThan のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThan lgcyShipToGreaterThan に設定する
     */
    public void setLgcyShipToGreaterThan(String lgcyShipToGreaterThan) {
        this.lgcyShipToGreaterThan = lgcyShipToGreaterThan;
    }

    /**
     * lgcyShipToGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToGreaterThanEqual
     */
    public String getLgcyShipToGreaterThanEqual() {
        return lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToGreaterThanEqual lgcyShipToGreaterThanEqual に設定する
     */
    public void setLgcyShipToGreaterThanEqual(String lgcyShipToGreaterThanEqual) {
        this.lgcyShipToGreaterThanEqual = lgcyShipToGreaterThanEqual;
    }

    /**
     * lgcyShipToLessThan のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThan
     */
    public String getLgcyShipToLessThan() {
        return lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThan のセッターメソッドです。
     * 
     * @param lgcyShipToLessThan lgcyShipToLessThan に設定する
     */
    public void setLgcyShipToLessThan(String lgcyShipToLessThan) {
        this.lgcyShipToLessThan = lgcyShipToLessThan;
    }

    /**
     * lgcyShipToLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyShipToLessThanEqual
     */
    public String getLgcyShipToLessThanEqual() {
        return lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyShipToLessThanEqual lgcyShipToLessThanEqual に設定する
     */
    public void setLgcyShipToLessThanEqual(String lgcyShipToLessThanEqual) {
        this.lgcyShipToLessThanEqual = lgcyShipToLessThanEqual;
    }

    /**
     * lgcyShipToLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyShipToLikeFront
     */
    public String getLgcyShipToLikeFront() {
        return lgcyShipToLikeFront;
    }

    /**
     * lgcyShipToLikeFront のセッターメソッドです。
     * 
     * @param lgcyShipToLikeFront lgcyShipToLikeFront に設定する
     */
    public void setLgcyShipToLikeFront(String lgcyShipToLikeFront) {
        this.lgcyShipToLikeFront = lgcyShipToLikeFront;
    }

    /**
     * trnsCdGreaterThan のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThan
     */
    public String getTrnsCdGreaterThan() {
        return trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThan のセッターメソッドです。
     * 
     * @param trnsCdGreaterThan trnsCdGreaterThan に設定する
     */
    public void setTrnsCdGreaterThan(String trnsCdGreaterThan) {
        this.trnsCdGreaterThan = trnsCdGreaterThan;
    }

    /**
     * trnsCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdGreaterThanEqual
     */
    public String getTrnsCdGreaterThanEqual() {
        return trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param trnsCdGreaterThanEqual trnsCdGreaterThanEqual に設定する
     */
    public void setTrnsCdGreaterThanEqual(String trnsCdGreaterThanEqual) {
        this.trnsCdGreaterThanEqual = trnsCdGreaterThanEqual;
    }

    /**
     * trnsCdLessThan のゲッターメソッドです。
     * 
     * @return the trnsCdLessThan
     */
    public String getTrnsCdLessThan() {
        return trnsCdLessThan;
    }

    /**
     * trnsCdLessThan のセッターメソッドです。
     * 
     * @param trnsCdLessThan trnsCdLessThan に設定する
     */
    public void setTrnsCdLessThan(String trnsCdLessThan) {
        this.trnsCdLessThan = trnsCdLessThan;
    }

    /**
     * trnsCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the trnsCdLessThanEqual
     */
    public String getTrnsCdLessThanEqual() {
        return trnsCdLessThanEqual;
    }

    /**
     * trnsCdLessThanEqual のセッターメソッドです。
     * 
     * @param trnsCdLessThanEqual trnsCdLessThanEqual に設定する
     */
    public void setTrnsCdLessThanEqual(String trnsCdLessThanEqual) {
        this.trnsCdLessThanEqual = trnsCdLessThanEqual;
    }

    /**
     * trnsCdLikeFront のゲッターメソッドです。
     * 
     * @return the trnsCdLikeFront
     */
    public String getTrnsCdLikeFront() {
        return trnsCdLikeFront;
    }

    /**
     * trnsCdLikeFront のセッターメソッドです。
     * 
     * @param trnsCdLikeFront trnsCdLikeFront に設定する
     */
    public void setTrnsCdLikeFront(String trnsCdLikeFront) {
        this.trnsCdLikeFront = trnsCdLikeFront;
    }

    /**
     * plntCdGreaterThan のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThan
     */
    public String getPlntCdGreaterThan() {
        return plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThan のセッターメソッドです。
     * 
     * @param plntCdGreaterThan plntCdGreaterThan に設定する
     */
    public void setPlntCdGreaterThan(String plntCdGreaterThan) {
        this.plntCdGreaterThan = plntCdGreaterThan;
    }

    /**
     * plntCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdGreaterThanEqual
     */
    public String getPlntCdGreaterThanEqual() {
        return plntCdGreaterThanEqual;
    }

    /**
     * plntCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param plntCdGreaterThanEqual plntCdGreaterThanEqual に設定する
     */
    public void setPlntCdGreaterThanEqual(String plntCdGreaterThanEqual) {
        this.plntCdGreaterThanEqual = plntCdGreaterThanEqual;
    }

    /**
     * plntCdLessThan のゲッターメソッドです。
     * 
     * @return the plntCdLessThan
     */
    public String getPlntCdLessThan() {
        return plntCdLessThan;
    }

    /**
     * plntCdLessThan のセッターメソッドです。
     * 
     * @param plntCdLessThan plntCdLessThan に設定する
     */
    public void setPlntCdLessThan(String plntCdLessThan) {
        this.plntCdLessThan = plntCdLessThan;
    }

    /**
     * plntCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the plntCdLessThanEqual
     */
    public String getPlntCdLessThanEqual() {
        return plntCdLessThanEqual;
    }

    /**
     * plntCdLessThanEqual のセッターメソッドです。
     * 
     * @param plntCdLessThanEqual plntCdLessThanEqual に設定する
     */
    public void setPlntCdLessThanEqual(String plntCdLessThanEqual) {
        this.plntCdLessThanEqual = plntCdLessThanEqual;
    }

    /**
     * plntCdLikeFront のゲッターメソッドです。
     * 
     * @return the plntCdLikeFront
     */
    public String getPlntCdLikeFront() {
        return plntCdLikeFront;
    }

    /**
     * plntCdLikeFront のセッターメソッドです。
     * 
     * @param plntCdLikeFront plntCdLikeFront に設定する
     */
    public void setPlntCdLikeFront(String plntCdLikeFront) {
        this.plntCdLikeFront = plntCdLikeFront;
    }

    /**
     * lgcyWhCdGreaterThan のゲッターメソッドです。
     * 
     * @return the lgcyWhCdGreaterThan
     */
    public String getLgcyWhCdGreaterThan() {
        return lgcyWhCdGreaterThan;
    }

    /**
     * lgcyWhCdGreaterThan のセッターメソッドです。
     * 
     * @param lgcyWhCdGreaterThan lgcyWhCdGreaterThan に設定する
     */
    public void setLgcyWhCdGreaterThan(String lgcyWhCdGreaterThan) {
        this.lgcyWhCdGreaterThan = lgcyWhCdGreaterThan;
    }

    /**
     * lgcyWhCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyWhCdGreaterThanEqual
     */
    public String getLgcyWhCdGreaterThanEqual() {
        return lgcyWhCdGreaterThanEqual;
    }

    /**
     * lgcyWhCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param lgcyWhCdGreaterThanEqual lgcyWhCdGreaterThanEqual に設定する
     */
    public void setLgcyWhCdGreaterThanEqual(String lgcyWhCdGreaterThanEqual) {
        this.lgcyWhCdGreaterThanEqual = lgcyWhCdGreaterThanEqual;
    }

    /**
     * lgcyWhCdLessThan のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLessThan
     */
    public String getLgcyWhCdLessThan() {
        return lgcyWhCdLessThan;
    }

    /**
     * lgcyWhCdLessThan のセッターメソッドです。
     * 
     * @param lgcyWhCdLessThan lgcyWhCdLessThan に設定する
     */
    public void setLgcyWhCdLessThan(String lgcyWhCdLessThan) {
        this.lgcyWhCdLessThan = lgcyWhCdLessThan;
    }

    /**
     * lgcyWhCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLessThanEqual
     */
    public String getLgcyWhCdLessThanEqual() {
        return lgcyWhCdLessThanEqual;
    }

    /**
     * lgcyWhCdLessThanEqual のセッターメソッドです。
     * 
     * @param lgcyWhCdLessThanEqual lgcyWhCdLessThanEqual に設定する
     */
    public void setLgcyWhCdLessThanEqual(String lgcyWhCdLessThanEqual) {
        this.lgcyWhCdLessThanEqual = lgcyWhCdLessThanEqual;
    }

    /**
     * lgcyWhCdLikeFront のゲッターメソッドです。
     * 
     * @return the lgcyWhCdLikeFront
     */
    public String getLgcyWhCdLikeFront() {
        return lgcyWhCdLikeFront;
    }

    /**
     * lgcyWhCdLikeFront のセッターメソッドです。
     * 
     * @param lgcyWhCdLikeFront lgcyWhCdLikeFront に設定する
     */
    public void setLgcyWhCdLikeFront(String lgcyWhCdLikeFront) {
        this.lgcyWhCdLikeFront = lgcyWhCdLikeFront;
    }

    /**
     * whCompCdGreaterThan のゲッターメソッドです。
     * 
     * @return the whCompCdGreaterThan
     */
    public String getWhCompCdGreaterThan() {
        return whCompCdGreaterThan;
    }

    /**
     * whCompCdGreaterThan のセッターメソッドです。
     * 
     * @param whCompCdGreaterThan whCompCdGreaterThan に設定する
     */
    public void setWhCompCdGreaterThan(String whCompCdGreaterThan) {
        this.whCompCdGreaterThan = whCompCdGreaterThan;
    }

    /**
     * whCompCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the whCompCdGreaterThanEqual
     */
    public String getWhCompCdGreaterThanEqual() {
        return whCompCdGreaterThanEqual;
    }

    /**
     * whCompCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param whCompCdGreaterThanEqual whCompCdGreaterThanEqual に設定する
     */
    public void setWhCompCdGreaterThanEqual(String whCompCdGreaterThanEqual) {
        this.whCompCdGreaterThanEqual = whCompCdGreaterThanEqual;
    }

    /**
     * whCompCdLessThan のゲッターメソッドです。
     * 
     * @return the whCompCdLessThan
     */
    public String getWhCompCdLessThan() {
        return whCompCdLessThan;
    }

    /**
     * whCompCdLessThan のセッターメソッドです。
     * 
     * @param whCompCdLessThan whCompCdLessThan に設定する
     */
    public void setWhCompCdLessThan(String whCompCdLessThan) {
        this.whCompCdLessThan = whCompCdLessThan;
    }

    /**
     * whCompCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the whCompCdLessThanEqual
     */
    public String getWhCompCdLessThanEqual() {
        return whCompCdLessThanEqual;
    }

    /**
     * whCompCdLessThanEqual のセッターメソッドです。
     * 
     * @param whCompCdLessThanEqual whCompCdLessThanEqual に設定する
     */
    public void setWhCompCdLessThanEqual(String whCompCdLessThanEqual) {
        this.whCompCdLessThanEqual = whCompCdLessThanEqual;
    }

    /**
     * whCompCdLikeFront のゲッターメソッドです。
     * 
     * @return the whCompCdLikeFront
     */
    public String getWhCompCdLikeFront() {
        return whCompCdLikeFront;
    }

    /**
     * whCompCdLikeFront のセッターメソッドです。
     * 
     * @param whCompCdLikeFront whCompCdLikeFront に設定する
     */
    public void setWhCompCdLikeFront(String whCompCdLikeFront) {
        this.whCompCdLikeFront = whCompCdLikeFront;
    }

    /**
     * whCdGreaterThan のゲッターメソッドです。
     * 
     * @return the whCdGreaterThan
     */
    public String getWhCdGreaterThan() {
        return whCdGreaterThan;
    }

    /**
     * whCdGreaterThan のセッターメソッドです。
     * 
     * @param whCdGreaterThan whCdGreaterThan に設定する
     */
    public void setWhCdGreaterThan(String whCdGreaterThan) {
        this.whCdGreaterThan = whCdGreaterThan;
    }

    /**
     * whCdGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the whCdGreaterThanEqual
     */
    public String getWhCdGreaterThanEqual() {
        return whCdGreaterThanEqual;
    }

    /**
     * whCdGreaterThanEqual のセッターメソッドです。
     * 
     * @param whCdGreaterThanEqual whCdGreaterThanEqual に設定する
     */
    public void setWhCdGreaterThanEqual(String whCdGreaterThanEqual) {
        this.whCdGreaterThanEqual = whCdGreaterThanEqual;
    }

    /**
     * whCdLessThan のゲッターメソッドです。
     * 
     * @return the whCdLessThan
     */
    public String getWhCdLessThan() {
        return whCdLessThan;
    }

    /**
     * whCdLessThan のセッターメソッドです。
     * 
     * @param whCdLessThan whCdLessThan に設定する
     */
    public void setWhCdLessThan(String whCdLessThan) {
        this.whCdLessThan = whCdLessThan;
    }

    /**
     * whCdLessThanEqual のゲッターメソッドです。
     * 
     * @return the whCdLessThanEqual
     */
    public String getWhCdLessThanEqual() {
        return whCdLessThanEqual;
    }

    /**
     * whCdLessThanEqual のセッターメソッドです。
     * 
     * @param whCdLessThanEqual whCdLessThanEqual に設定する
     */
    public void setWhCdLessThanEqual(String whCdLessThanEqual) {
        this.whCdLessThanEqual = whCdLessThanEqual;
    }

    /**
     * whCdLikeFront のゲッターメソッドです。
     * 
     * @return the whCdLikeFront
     */
    public String getWhCdLikeFront() {
        return whCdLikeFront;
    }

    /**
     * whCdLikeFront のセッターメソッドです。
     * 
     * @param whCdLikeFront whCdLikeFront に設定する
     */
    public void setWhCdLikeFront(String whCdLikeFront) {
        this.whCdLikeFront = whCdLikeFront;
    }

    /**
     * chkResultAGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultAGreaterThan
     */
    public String getChkResultAGreaterThan() {
        return chkResultAGreaterThan;
    }

    /**
     * chkResultAGreaterThan のセッターメソッドです。
     * 
     * @param chkResultAGreaterThan chkResultAGreaterThan に設定する
     */
    public void setChkResultAGreaterThan(String chkResultAGreaterThan) {
        this.chkResultAGreaterThan = chkResultAGreaterThan;
    }

    /**
     * chkResultAGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultAGreaterThanEqual
     */
    public String getChkResultAGreaterThanEqual() {
        return chkResultAGreaterThanEqual;
    }

    /**
     * chkResultAGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultAGreaterThanEqual chkResultAGreaterThanEqual に設定する
     */
    public void setChkResultAGreaterThanEqual(String chkResultAGreaterThanEqual) {
        this.chkResultAGreaterThanEqual = chkResultAGreaterThanEqual;
    }

    /**
     * chkResultALessThan のゲッターメソッドです。
     * 
     * @return the chkResultALessThan
     */
    public String getChkResultALessThan() {
        return chkResultALessThan;
    }

    /**
     * chkResultALessThan のセッターメソッドです。
     * 
     * @param chkResultALessThan chkResultALessThan に設定する
     */
    public void setChkResultALessThan(String chkResultALessThan) {
        this.chkResultALessThan = chkResultALessThan;
    }

    /**
     * chkResultALessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultALessThanEqual
     */
    public String getChkResultALessThanEqual() {
        return chkResultALessThanEqual;
    }

    /**
     * chkResultALessThanEqual のセッターメソッドです。
     * 
     * @param chkResultALessThanEqual chkResultALessThanEqual に設定する
     */
    public void setChkResultALessThanEqual(String chkResultALessThanEqual) {
        this.chkResultALessThanEqual = chkResultALessThanEqual;
    }

    /**
     * chkResultALikeFront のゲッターメソッドです。
     * 
     * @return the chkResultALikeFront
     */
    public String getChkResultALikeFront() {
        return chkResultALikeFront;
    }

    /**
     * chkResultALikeFront のセッターメソッドです。
     * 
     * @param chkResultALikeFront chkResultALikeFront に設定する
     */
    public void setChkResultALikeFront(String chkResultALikeFront) {
        this.chkResultALikeFront = chkResultALikeFront;
    }

    /**
     * chkResultBGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultBGreaterThan
     */
    public String getChkResultBGreaterThan() {
        return chkResultBGreaterThan;
    }

    /**
     * chkResultBGreaterThan のセッターメソッドです。
     * 
     * @param chkResultBGreaterThan chkResultBGreaterThan に設定する
     */
    public void setChkResultBGreaterThan(String chkResultBGreaterThan) {
        this.chkResultBGreaterThan = chkResultBGreaterThan;
    }

    /**
     * chkResultBGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultBGreaterThanEqual
     */
    public String getChkResultBGreaterThanEqual() {
        return chkResultBGreaterThanEqual;
    }

    /**
     * chkResultBGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultBGreaterThanEqual chkResultBGreaterThanEqual に設定する
     */
    public void setChkResultBGreaterThanEqual(String chkResultBGreaterThanEqual) {
        this.chkResultBGreaterThanEqual = chkResultBGreaterThanEqual;
    }

    /**
     * chkResultBLessThan のゲッターメソッドです。
     * 
     * @return the chkResultBLessThan
     */
    public String getChkResultBLessThan() {
        return chkResultBLessThan;
    }

    /**
     * chkResultBLessThan のセッターメソッドです。
     * 
     * @param chkResultBLessThan chkResultBLessThan に設定する
     */
    public void setChkResultBLessThan(String chkResultBLessThan) {
        this.chkResultBLessThan = chkResultBLessThan;
    }

    /**
     * chkResultBLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultBLessThanEqual
     */
    public String getChkResultBLessThanEqual() {
        return chkResultBLessThanEqual;
    }

    /**
     * chkResultBLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultBLessThanEqual chkResultBLessThanEqual に設定する
     */
    public void setChkResultBLessThanEqual(String chkResultBLessThanEqual) {
        this.chkResultBLessThanEqual = chkResultBLessThanEqual;
    }

    /**
     * chkResultBLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultBLikeFront
     */
    public String getChkResultBLikeFront() {
        return chkResultBLikeFront;
    }

    /**
     * chkResultBLikeFront のセッターメソッドです。
     * 
     * @param chkResultBLikeFront chkResultBLikeFront に設定する
     */
    public void setChkResultBLikeFront(String chkResultBLikeFront) {
        this.chkResultBLikeFront = chkResultBLikeFront;
    }

    /**
     * chkResultCGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultCGreaterThan
     */
    public String getChkResultCGreaterThan() {
        return chkResultCGreaterThan;
    }

    /**
     * chkResultCGreaterThan のセッターメソッドです。
     * 
     * @param chkResultCGreaterThan chkResultCGreaterThan に設定する
     */
    public void setChkResultCGreaterThan(String chkResultCGreaterThan) {
        this.chkResultCGreaterThan = chkResultCGreaterThan;
    }

    /**
     * chkResultCGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultCGreaterThanEqual
     */
    public String getChkResultCGreaterThanEqual() {
        return chkResultCGreaterThanEqual;
    }

    /**
     * chkResultCGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultCGreaterThanEqual chkResultCGreaterThanEqual に設定する
     */
    public void setChkResultCGreaterThanEqual(String chkResultCGreaterThanEqual) {
        this.chkResultCGreaterThanEqual = chkResultCGreaterThanEqual;
    }

    /**
     * chkResultCLessThan のゲッターメソッドです。
     * 
     * @return the chkResultCLessThan
     */
    public String getChkResultCLessThan() {
        return chkResultCLessThan;
    }

    /**
     * chkResultCLessThan のセッターメソッドです。
     * 
     * @param chkResultCLessThan chkResultCLessThan に設定する
     */
    public void setChkResultCLessThan(String chkResultCLessThan) {
        this.chkResultCLessThan = chkResultCLessThan;
    }

    /**
     * chkResultCLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultCLessThanEqual
     */
    public String getChkResultCLessThanEqual() {
        return chkResultCLessThanEqual;
    }

    /**
     * chkResultCLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultCLessThanEqual chkResultCLessThanEqual に設定する
     */
    public void setChkResultCLessThanEqual(String chkResultCLessThanEqual) {
        this.chkResultCLessThanEqual = chkResultCLessThanEqual;
    }

    /**
     * chkResultCLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultCLikeFront
     */
    public String getChkResultCLikeFront() {
        return chkResultCLikeFront;
    }

    /**
     * chkResultCLikeFront のセッターメソッドです。
     * 
     * @param chkResultCLikeFront chkResultCLikeFront に設定する
     */
    public void setChkResultCLikeFront(String chkResultCLikeFront) {
        this.chkResultCLikeFront = chkResultCLikeFront;
    }

    /**
     * chkResultDGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultDGreaterThan
     */
    public String getChkResultDGreaterThan() {
        return chkResultDGreaterThan;
    }

    /**
     * chkResultDGreaterThan のセッターメソッドです。
     * 
     * @param chkResultDGreaterThan chkResultDGreaterThan に設定する
     */
    public void setChkResultDGreaterThan(String chkResultDGreaterThan) {
        this.chkResultDGreaterThan = chkResultDGreaterThan;
    }

    /**
     * chkResultDGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultDGreaterThanEqual
     */
    public String getChkResultDGreaterThanEqual() {
        return chkResultDGreaterThanEqual;
    }

    /**
     * chkResultDGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultDGreaterThanEqual chkResultDGreaterThanEqual に設定する
     */
    public void setChkResultDGreaterThanEqual(String chkResultDGreaterThanEqual) {
        this.chkResultDGreaterThanEqual = chkResultDGreaterThanEqual;
    }

    /**
     * chkResultDLessThan のゲッターメソッドです。
     * 
     * @return the chkResultDLessThan
     */
    public String getChkResultDLessThan() {
        return chkResultDLessThan;
    }

    /**
     * chkResultDLessThan のセッターメソッドです。
     * 
     * @param chkResultDLessThan chkResultDLessThan に設定する
     */
    public void setChkResultDLessThan(String chkResultDLessThan) {
        this.chkResultDLessThan = chkResultDLessThan;
    }

    /**
     * chkResultDLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultDLessThanEqual
     */
    public String getChkResultDLessThanEqual() {
        return chkResultDLessThanEqual;
    }

    /**
     * chkResultDLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultDLessThanEqual chkResultDLessThanEqual に設定する
     */
    public void setChkResultDLessThanEqual(String chkResultDLessThanEqual) {
        this.chkResultDLessThanEqual = chkResultDLessThanEqual;
    }

    /**
     * chkResultDLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultDLikeFront
     */
    public String getChkResultDLikeFront() {
        return chkResultDLikeFront;
    }

    /**
     * chkResultDLikeFront のセッターメソッドです。
     * 
     * @param chkResultDLikeFront chkResultDLikeFront に設定する
     */
    public void setChkResultDLikeFront(String chkResultDLikeFront) {
        this.chkResultDLikeFront = chkResultDLikeFront;
    }

    /**
     * chkResultEGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultEGreaterThan
     */
    public String getChkResultEGreaterThan() {
        return chkResultEGreaterThan;
    }

    /**
     * chkResultEGreaterThan のセッターメソッドです。
     * 
     * @param chkResultEGreaterThan chkResultEGreaterThan に設定する
     */
    public void setChkResultEGreaterThan(String chkResultEGreaterThan) {
        this.chkResultEGreaterThan = chkResultEGreaterThan;
    }

    /**
     * chkResultEGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultEGreaterThanEqual
     */
    public String getChkResultEGreaterThanEqual() {
        return chkResultEGreaterThanEqual;
    }

    /**
     * chkResultEGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultEGreaterThanEqual chkResultEGreaterThanEqual に設定する
     */
    public void setChkResultEGreaterThanEqual(String chkResultEGreaterThanEqual) {
        this.chkResultEGreaterThanEqual = chkResultEGreaterThanEqual;
    }

    /**
     * chkResultELessThan のゲッターメソッドです。
     * 
     * @return the chkResultELessThan
     */
    public String getChkResultELessThan() {
        return chkResultELessThan;
    }

    /**
     * chkResultELessThan のセッターメソッドです。
     * 
     * @param chkResultELessThan chkResultELessThan に設定する
     */
    public void setChkResultELessThan(String chkResultELessThan) {
        this.chkResultELessThan = chkResultELessThan;
    }

    /**
     * chkResultELessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultELessThanEqual
     */
    public String getChkResultELessThanEqual() {
        return chkResultELessThanEqual;
    }

    /**
     * chkResultELessThanEqual のセッターメソッドです。
     * 
     * @param chkResultELessThanEqual chkResultELessThanEqual に設定する
     */
    public void setChkResultELessThanEqual(String chkResultELessThanEqual) {
        this.chkResultELessThanEqual = chkResultELessThanEqual;
    }

    /**
     * chkResultELikeFront のゲッターメソッドです。
     * 
     * @return the chkResultELikeFront
     */
    public String getChkResultELikeFront() {
        return chkResultELikeFront;
    }

    /**
     * chkResultELikeFront のセッターメソッドです。
     * 
     * @param chkResultELikeFront chkResultELikeFront に設定する
     */
    public void setChkResultELikeFront(String chkResultELikeFront) {
        this.chkResultELikeFront = chkResultELikeFront;
    }

    /**
     * chkResultFGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultFGreaterThan
     */
    public String getChkResultFGreaterThan() {
        return chkResultFGreaterThan;
    }

    /**
     * chkResultFGreaterThan のセッターメソッドです。
     * 
     * @param chkResultFGreaterThan chkResultFGreaterThan に設定する
     */
    public void setChkResultFGreaterThan(String chkResultFGreaterThan) {
        this.chkResultFGreaterThan = chkResultFGreaterThan;
    }

    /**
     * chkResultFGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultFGreaterThanEqual
     */
    public String getChkResultFGreaterThanEqual() {
        return chkResultFGreaterThanEqual;
    }

    /**
     * chkResultFGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultFGreaterThanEqual chkResultFGreaterThanEqual に設定する
     */
    public void setChkResultFGreaterThanEqual(String chkResultFGreaterThanEqual) {
        this.chkResultFGreaterThanEqual = chkResultFGreaterThanEqual;
    }

    /**
     * chkResultFLessThan のゲッターメソッドです。
     * 
     * @return the chkResultFLessThan
     */
    public String getChkResultFLessThan() {
        return chkResultFLessThan;
    }

    /**
     * chkResultFLessThan のセッターメソッドです。
     * 
     * @param chkResultFLessThan chkResultFLessThan に設定する
     */
    public void setChkResultFLessThan(String chkResultFLessThan) {
        this.chkResultFLessThan = chkResultFLessThan;
    }

    /**
     * chkResultFLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultFLessThanEqual
     */
    public String getChkResultFLessThanEqual() {
        return chkResultFLessThanEqual;
    }

    /**
     * chkResultFLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultFLessThanEqual chkResultFLessThanEqual に設定する
     */
    public void setChkResultFLessThanEqual(String chkResultFLessThanEqual) {
        this.chkResultFLessThanEqual = chkResultFLessThanEqual;
    }

    /**
     * chkResultFLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultFLikeFront
     */
    public String getChkResultFLikeFront() {
        return chkResultFLikeFront;
    }

    /**
     * chkResultFLikeFront のセッターメソッドです。
     * 
     * @param chkResultFLikeFront chkResultFLikeFront に設定する
     */
    public void setChkResultFLikeFront(String chkResultFLikeFront) {
        this.chkResultFLikeFront = chkResultFLikeFront;
    }

    /**
     * chkResultGGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultGGreaterThan
     */
    public String getChkResultGGreaterThan() {
        return chkResultGGreaterThan;
    }

    /**
     * chkResultGGreaterThan のセッターメソッドです。
     * 
     * @param chkResultGGreaterThan chkResultGGreaterThan に設定する
     */
    public void setChkResultGGreaterThan(String chkResultGGreaterThan) {
        this.chkResultGGreaterThan = chkResultGGreaterThan;
    }

    /**
     * chkResultGGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultGGreaterThanEqual
     */
    public String getChkResultGGreaterThanEqual() {
        return chkResultGGreaterThanEqual;
    }

    /**
     * chkResultGGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultGGreaterThanEqual chkResultGGreaterThanEqual に設定する
     */
    public void setChkResultGGreaterThanEqual(String chkResultGGreaterThanEqual) {
        this.chkResultGGreaterThanEqual = chkResultGGreaterThanEqual;
    }

    /**
     * chkResultGLessThan のゲッターメソッドです。
     * 
     * @return the chkResultGLessThan
     */
    public String getChkResultGLessThan() {
        return chkResultGLessThan;
    }

    /**
     * chkResultGLessThan のセッターメソッドです。
     * 
     * @param chkResultGLessThan chkResultGLessThan に設定する
     */
    public void setChkResultGLessThan(String chkResultGLessThan) {
        this.chkResultGLessThan = chkResultGLessThan;
    }

    /**
     * chkResultGLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultGLessThanEqual
     */
    public String getChkResultGLessThanEqual() {
        return chkResultGLessThanEqual;
    }

    /**
     * chkResultGLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultGLessThanEqual chkResultGLessThanEqual に設定する
     */
    public void setChkResultGLessThanEqual(String chkResultGLessThanEqual) {
        this.chkResultGLessThanEqual = chkResultGLessThanEqual;
    }

    /**
     * chkResultGLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultGLikeFront
     */
    public String getChkResultGLikeFront() {
        return chkResultGLikeFront;
    }

    /**
     * chkResultGLikeFront のセッターメソッドです。
     * 
     * @param chkResultGLikeFront chkResultGLikeFront に設定する
     */
    public void setChkResultGLikeFront(String chkResultGLikeFront) {
        this.chkResultGLikeFront = chkResultGLikeFront;
    }

    /**
     * chkResultHGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultHGreaterThan
     */
    public String getChkResultHGreaterThan() {
        return chkResultHGreaterThan;
    }

    /**
     * chkResultHGreaterThan のセッターメソッドです。
     * 
     * @param chkResultHGreaterThan chkResultHGreaterThan に設定する
     */
    public void setChkResultHGreaterThan(String chkResultHGreaterThan) {
        this.chkResultHGreaterThan = chkResultHGreaterThan;
    }

    /**
     * chkResultHGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultHGreaterThanEqual
     */
    public String getChkResultHGreaterThanEqual() {
        return chkResultHGreaterThanEqual;
    }

    /**
     * chkResultHGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultHGreaterThanEqual chkResultHGreaterThanEqual に設定する
     */
    public void setChkResultHGreaterThanEqual(String chkResultHGreaterThanEqual) {
        this.chkResultHGreaterThanEqual = chkResultHGreaterThanEqual;
    }

    /**
     * chkResultHLessThan のゲッターメソッドです。
     * 
     * @return the chkResultHLessThan
     */
    public String getChkResultHLessThan() {
        return chkResultHLessThan;
    }

    /**
     * chkResultHLessThan のセッターメソッドです。
     * 
     * @param chkResultHLessThan chkResultHLessThan に設定する
     */
    public void setChkResultHLessThan(String chkResultHLessThan) {
        this.chkResultHLessThan = chkResultHLessThan;
    }

    /**
     * chkResultHLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultHLessThanEqual
     */
    public String getChkResultHLessThanEqual() {
        return chkResultHLessThanEqual;
    }

    /**
     * chkResultHLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultHLessThanEqual chkResultHLessThanEqual に設定する
     */
    public void setChkResultHLessThanEqual(String chkResultHLessThanEqual) {
        this.chkResultHLessThanEqual = chkResultHLessThanEqual;
    }

    /**
     * chkResultHLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultHLikeFront
     */
    public String getChkResultHLikeFront() {
        return chkResultHLikeFront;
    }

    /**
     * chkResultHLikeFront のセッターメソッドです。
     * 
     * @param chkResultHLikeFront chkResultHLikeFront に設定する
     */
    public void setChkResultHLikeFront(String chkResultHLikeFront) {
        this.chkResultHLikeFront = chkResultHLikeFront;
    }

    /**
     * chkResultIGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultIGreaterThan
     */
    public String getChkResultIGreaterThan() {
        return chkResultIGreaterThan;
    }

    /**
     * chkResultIGreaterThan のセッターメソッドです。
     * 
     * @param chkResultIGreaterThan chkResultIGreaterThan に設定する
     */
    public void setChkResultIGreaterThan(String chkResultIGreaterThan) {
        this.chkResultIGreaterThan = chkResultIGreaterThan;
    }

    /**
     * chkResultIGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultIGreaterThanEqual
     */
    public String getChkResultIGreaterThanEqual() {
        return chkResultIGreaterThanEqual;
    }

    /**
     * chkResultIGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultIGreaterThanEqual chkResultIGreaterThanEqual に設定する
     */
    public void setChkResultIGreaterThanEqual(String chkResultIGreaterThanEqual) {
        this.chkResultIGreaterThanEqual = chkResultIGreaterThanEqual;
    }

    /**
     * chkResultILessThan のゲッターメソッドです。
     * 
     * @return the chkResultILessThan
     */
    public String getChkResultILessThan() {
        return chkResultILessThan;
    }

    /**
     * chkResultILessThan のセッターメソッドです。
     * 
     * @param chkResultILessThan chkResultILessThan に設定する
     */
    public void setChkResultILessThan(String chkResultILessThan) {
        this.chkResultILessThan = chkResultILessThan;
    }

    /**
     * chkResultILessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultILessThanEqual
     */
    public String getChkResultILessThanEqual() {
        return chkResultILessThanEqual;
    }

    /**
     * chkResultILessThanEqual のセッターメソッドです。
     * 
     * @param chkResultILessThanEqual chkResultILessThanEqual に設定する
     */
    public void setChkResultILessThanEqual(String chkResultILessThanEqual) {
        this.chkResultILessThanEqual = chkResultILessThanEqual;
    }

    /**
     * chkResultILikeFront のゲッターメソッドです。
     * 
     * @return the chkResultILikeFront
     */
    public String getChkResultILikeFront() {
        return chkResultILikeFront;
    }

    /**
     * chkResultILikeFront のセッターメソッドです。
     * 
     * @param chkResultILikeFront chkResultILikeFront に設定する
     */
    public void setChkResultILikeFront(String chkResultILikeFront) {
        this.chkResultILikeFront = chkResultILikeFront;
    }

    /**
     * chkResultJGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultJGreaterThan
     */
    public String getChkResultJGreaterThan() {
        return chkResultJGreaterThan;
    }

    /**
     * chkResultJGreaterThan のセッターメソッドです。
     * 
     * @param chkResultJGreaterThan chkResultJGreaterThan に設定する
     */
    public void setChkResultJGreaterThan(String chkResultJGreaterThan) {
        this.chkResultJGreaterThan = chkResultJGreaterThan;
    }

    /**
     * chkResultJGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultJGreaterThanEqual
     */
    public String getChkResultJGreaterThanEqual() {
        return chkResultJGreaterThanEqual;
    }

    /**
     * chkResultJGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultJGreaterThanEqual chkResultJGreaterThanEqual に設定する
     */
    public void setChkResultJGreaterThanEqual(String chkResultJGreaterThanEqual) {
        this.chkResultJGreaterThanEqual = chkResultJGreaterThanEqual;
    }

    /**
     * chkResultJLessThan のゲッターメソッドです。
     * 
     * @return the chkResultJLessThan
     */
    public String getChkResultJLessThan() {
        return chkResultJLessThan;
    }

    /**
     * chkResultJLessThan のセッターメソッドです。
     * 
     * @param chkResultJLessThan chkResultJLessThan に設定する
     */
    public void setChkResultJLessThan(String chkResultJLessThan) {
        this.chkResultJLessThan = chkResultJLessThan;
    }

    /**
     * chkResultJLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultJLessThanEqual
     */
    public String getChkResultJLessThanEqual() {
        return chkResultJLessThanEqual;
    }

    /**
     * chkResultJLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultJLessThanEqual chkResultJLessThanEqual に設定する
     */
    public void setChkResultJLessThanEqual(String chkResultJLessThanEqual) {
        this.chkResultJLessThanEqual = chkResultJLessThanEqual;
    }

    /**
     * chkResultJLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultJLikeFront
     */
    public String getChkResultJLikeFront() {
        return chkResultJLikeFront;
    }

    /**
     * chkResultJLikeFront のセッターメソッドです。
     * 
     * @param chkResultJLikeFront chkResultJLikeFront に設定する
     */
    public void setChkResultJLikeFront(String chkResultJLikeFront) {
        this.chkResultJLikeFront = chkResultJLikeFront;
    }

    /**
     * chkResultKGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultKGreaterThan
     */
    public String getChkResultKGreaterThan() {
        return chkResultKGreaterThan;
    }

    /**
     * chkResultKGreaterThan のセッターメソッドです。
     * 
     * @param chkResultKGreaterThan chkResultKGreaterThan に設定する
     */
    public void setChkResultKGreaterThan(String chkResultKGreaterThan) {
        this.chkResultKGreaterThan = chkResultKGreaterThan;
    }

    /**
     * chkResultKGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultKGreaterThanEqual
     */
    public String getChkResultKGreaterThanEqual() {
        return chkResultKGreaterThanEqual;
    }

    /**
     * chkResultKGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultKGreaterThanEqual chkResultKGreaterThanEqual に設定する
     */
    public void setChkResultKGreaterThanEqual(String chkResultKGreaterThanEqual) {
        this.chkResultKGreaterThanEqual = chkResultKGreaterThanEqual;
    }

    /**
     * chkResultKLessThan のゲッターメソッドです。
     * 
     * @return the chkResultKLessThan
     */
    public String getChkResultKLessThan() {
        return chkResultKLessThan;
    }

    /**
     * chkResultKLessThan のセッターメソッドです。
     * 
     * @param chkResultKLessThan chkResultKLessThan に設定する
     */
    public void setChkResultKLessThan(String chkResultKLessThan) {
        this.chkResultKLessThan = chkResultKLessThan;
    }

    /**
     * chkResultKLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultKLessThanEqual
     */
    public String getChkResultKLessThanEqual() {
        return chkResultKLessThanEqual;
    }

    /**
     * chkResultKLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultKLessThanEqual chkResultKLessThanEqual に設定する
     */
    public void setChkResultKLessThanEqual(String chkResultKLessThanEqual) {
        this.chkResultKLessThanEqual = chkResultKLessThanEqual;
    }

    /**
     * chkResultKLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultKLikeFront
     */
    public String getChkResultKLikeFront() {
        return chkResultKLikeFront;
    }

    /**
     * chkResultKLikeFront のセッターメソッドです。
     * 
     * @param chkResultKLikeFront chkResultKLikeFront に設定する
     */
    public void setChkResultKLikeFront(String chkResultKLikeFront) {
        this.chkResultKLikeFront = chkResultKLikeFront;
    }

    /**
     * chkResultLGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultLGreaterThan
     */
    public String getChkResultLGreaterThan() {
        return chkResultLGreaterThan;
    }

    /**
     * chkResultLGreaterThan のセッターメソッドです。
     * 
     * @param chkResultLGreaterThan chkResultLGreaterThan に設定する
     */
    public void setChkResultLGreaterThan(String chkResultLGreaterThan) {
        this.chkResultLGreaterThan = chkResultLGreaterThan;
    }

    /**
     * chkResultLGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultLGreaterThanEqual
     */
    public String getChkResultLGreaterThanEqual() {
        return chkResultLGreaterThanEqual;
    }

    /**
     * chkResultLGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultLGreaterThanEqual chkResultLGreaterThanEqual に設定する
     */
    public void setChkResultLGreaterThanEqual(String chkResultLGreaterThanEqual) {
        this.chkResultLGreaterThanEqual = chkResultLGreaterThanEqual;
    }

    /**
     * chkResultLLessThan のゲッターメソッドです。
     * 
     * @return the chkResultLLessThan
     */
    public String getChkResultLLessThan() {
        return chkResultLLessThan;
    }

    /**
     * chkResultLLessThan のセッターメソッドです。
     * 
     * @param chkResultLLessThan chkResultLLessThan に設定する
     */
    public void setChkResultLLessThan(String chkResultLLessThan) {
        this.chkResultLLessThan = chkResultLLessThan;
    }

    /**
     * chkResultLLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultLLessThanEqual
     */
    public String getChkResultLLessThanEqual() {
        return chkResultLLessThanEqual;
    }

    /**
     * chkResultLLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultLLessThanEqual chkResultLLessThanEqual に設定する
     */
    public void setChkResultLLessThanEqual(String chkResultLLessThanEqual) {
        this.chkResultLLessThanEqual = chkResultLLessThanEqual;
    }

    /**
     * chkResultLLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultLLikeFront
     */
    public String getChkResultLLikeFront() {
        return chkResultLLikeFront;
    }

    /**
     * chkResultLLikeFront のセッターメソッドです。
     * 
     * @param chkResultLLikeFront chkResultLLikeFront に設定する
     */
    public void setChkResultLLikeFront(String chkResultLLikeFront) {
        this.chkResultLLikeFront = chkResultLLikeFront;
    }

    /**
     * chkResultMGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultMGreaterThan
     */
    public String getChkResultMGreaterThan() {
        return chkResultMGreaterThan;
    }

    /**
     * chkResultMGreaterThan のセッターメソッドです。
     * 
     * @param chkResultMGreaterThan chkResultMGreaterThan に設定する
     */
    public void setChkResultMGreaterThan(String chkResultMGreaterThan) {
        this.chkResultMGreaterThan = chkResultMGreaterThan;
    }

    /**
     * chkResultMGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultMGreaterThanEqual
     */
    public String getChkResultMGreaterThanEqual() {
        return chkResultMGreaterThanEqual;
    }

    /**
     * chkResultMGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultMGreaterThanEqual chkResultMGreaterThanEqual に設定する
     */
    public void setChkResultMGreaterThanEqual(String chkResultMGreaterThanEqual) {
        this.chkResultMGreaterThanEqual = chkResultMGreaterThanEqual;
    }

    /**
     * chkResultMLessThan のゲッターメソッドです。
     * 
     * @return the chkResultMLessThan
     */
    public String getChkResultMLessThan() {
        return chkResultMLessThan;
    }

    /**
     * chkResultMLessThan のセッターメソッドです。
     * 
     * @param chkResultMLessThan chkResultMLessThan に設定する
     */
    public void setChkResultMLessThan(String chkResultMLessThan) {
        this.chkResultMLessThan = chkResultMLessThan;
    }

    /**
     * chkResultMLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultMLessThanEqual
     */
    public String getChkResultMLessThanEqual() {
        return chkResultMLessThanEqual;
    }

    /**
     * chkResultMLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultMLessThanEqual chkResultMLessThanEqual に設定する
     */
    public void setChkResultMLessThanEqual(String chkResultMLessThanEqual) {
        this.chkResultMLessThanEqual = chkResultMLessThanEqual;
    }

    /**
     * chkResultMLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultMLikeFront
     */
    public String getChkResultMLikeFront() {
        return chkResultMLikeFront;
    }

    /**
     * chkResultMLikeFront のセッターメソッドです。
     * 
     * @param chkResultMLikeFront chkResultMLikeFront に設定する
     */
    public void setChkResultMLikeFront(String chkResultMLikeFront) {
        this.chkResultMLikeFront = chkResultMLikeFront;
    }

    /**
     * chkResultNGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultNGreaterThan
     */
    public String getChkResultNGreaterThan() {
        return chkResultNGreaterThan;
    }

    /**
     * chkResultNGreaterThan のセッターメソッドです。
     * 
     * @param chkResultNGreaterThan chkResultNGreaterThan に設定する
     */
    public void setChkResultNGreaterThan(String chkResultNGreaterThan) {
        this.chkResultNGreaterThan = chkResultNGreaterThan;
    }

    /**
     * chkResultNGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultNGreaterThanEqual
     */
    public String getChkResultNGreaterThanEqual() {
        return chkResultNGreaterThanEqual;
    }

    /**
     * chkResultNGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultNGreaterThanEqual chkResultNGreaterThanEqual に設定する
     */
    public void setChkResultNGreaterThanEqual(String chkResultNGreaterThanEqual) {
        this.chkResultNGreaterThanEqual = chkResultNGreaterThanEqual;
    }

    /**
     * chkResultNLessThan のゲッターメソッドです。
     * 
     * @return the chkResultNLessThan
     */
    public String getChkResultNLessThan() {
        return chkResultNLessThan;
    }

    /**
     * chkResultNLessThan のセッターメソッドです。
     * 
     * @param chkResultNLessThan chkResultNLessThan に設定する
     */
    public void setChkResultNLessThan(String chkResultNLessThan) {
        this.chkResultNLessThan = chkResultNLessThan;
    }

    /**
     * chkResultNLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultNLessThanEqual
     */
    public String getChkResultNLessThanEqual() {
        return chkResultNLessThanEqual;
    }

    /**
     * chkResultNLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultNLessThanEqual chkResultNLessThanEqual に設定する
     */
    public void setChkResultNLessThanEqual(String chkResultNLessThanEqual) {
        this.chkResultNLessThanEqual = chkResultNLessThanEqual;
    }

    /**
     * chkResultNLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultNLikeFront
     */
    public String getChkResultNLikeFront() {
        return chkResultNLikeFront;
    }

    /**
     * chkResultNLikeFront のセッターメソッドです。
     * 
     * @param chkResultNLikeFront chkResultNLikeFront に設定する
     */
    public void setChkResultNLikeFront(String chkResultNLikeFront) {
        this.chkResultNLikeFront = chkResultNLikeFront;
    }

    /**
     * chkResultOGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultOGreaterThan
     */
    public String getChkResultOGreaterThan() {
        return chkResultOGreaterThan;
    }

    /**
     * chkResultOGreaterThan のセッターメソッドです。
     * 
     * @param chkResultOGreaterThan chkResultOGreaterThan に設定する
     */
    public void setChkResultOGreaterThan(String chkResultOGreaterThan) {
        this.chkResultOGreaterThan = chkResultOGreaterThan;
    }

    /**
     * chkResultOGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultOGreaterThanEqual
     */
    public String getChkResultOGreaterThanEqual() {
        return chkResultOGreaterThanEqual;
    }

    /**
     * chkResultOGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultOGreaterThanEqual chkResultOGreaterThanEqual に設定する
     */
    public void setChkResultOGreaterThanEqual(String chkResultOGreaterThanEqual) {
        this.chkResultOGreaterThanEqual = chkResultOGreaterThanEqual;
    }

    /**
     * chkResultOLessThan のゲッターメソッドです。
     * 
     * @return the chkResultOLessThan
     */
    public String getChkResultOLessThan() {
        return chkResultOLessThan;
    }

    /**
     * chkResultOLessThan のセッターメソッドです。
     * 
     * @param chkResultOLessThan chkResultOLessThan に設定する
     */
    public void setChkResultOLessThan(String chkResultOLessThan) {
        this.chkResultOLessThan = chkResultOLessThan;
    }

    /**
     * chkResultOLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultOLessThanEqual
     */
    public String getChkResultOLessThanEqual() {
        return chkResultOLessThanEqual;
    }

    /**
     * chkResultOLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultOLessThanEqual chkResultOLessThanEqual に設定する
     */
    public void setChkResultOLessThanEqual(String chkResultOLessThanEqual) {
        this.chkResultOLessThanEqual = chkResultOLessThanEqual;
    }

    /**
     * chkResultOLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultOLikeFront
     */
    public String getChkResultOLikeFront() {
        return chkResultOLikeFront;
    }

    /**
     * chkResultOLikeFront のセッターメソッドです。
     * 
     * @param chkResultOLikeFront chkResultOLikeFront に設定する
     */
    public void setChkResultOLikeFront(String chkResultOLikeFront) {
        this.chkResultOLikeFront = chkResultOLikeFront;
    }

    /**
     * chkResultPGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultPGreaterThan
     */
    public String getChkResultPGreaterThan() {
        return chkResultPGreaterThan;
    }

    /**
     * chkResultPGreaterThan のセッターメソッドです。
     * 
     * @param chkResultPGreaterThan chkResultPGreaterThan に設定する
     */
    public void setChkResultPGreaterThan(String chkResultPGreaterThan) {
        this.chkResultPGreaterThan = chkResultPGreaterThan;
    }

    /**
     * chkResultPGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultPGreaterThanEqual
     */
    public String getChkResultPGreaterThanEqual() {
        return chkResultPGreaterThanEqual;
    }

    /**
     * chkResultPGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultPGreaterThanEqual chkResultPGreaterThanEqual に設定する
     */
    public void setChkResultPGreaterThanEqual(String chkResultPGreaterThanEqual) {
        this.chkResultPGreaterThanEqual = chkResultPGreaterThanEqual;
    }

    /**
     * chkResultPLessThan のゲッターメソッドです。
     * 
     * @return the chkResultPLessThan
     */
    public String getChkResultPLessThan() {
        return chkResultPLessThan;
    }

    /**
     * chkResultPLessThan のセッターメソッドです。
     * 
     * @param chkResultPLessThan chkResultPLessThan に設定する
     */
    public void setChkResultPLessThan(String chkResultPLessThan) {
        this.chkResultPLessThan = chkResultPLessThan;
    }

    /**
     * chkResultPLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultPLessThanEqual
     */
    public String getChkResultPLessThanEqual() {
        return chkResultPLessThanEqual;
    }

    /**
     * chkResultPLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultPLessThanEqual chkResultPLessThanEqual に設定する
     */
    public void setChkResultPLessThanEqual(String chkResultPLessThanEqual) {
        this.chkResultPLessThanEqual = chkResultPLessThanEqual;
    }

    /**
     * chkResultPLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultPLikeFront
     */
    public String getChkResultPLikeFront() {
        return chkResultPLikeFront;
    }

    /**
     * chkResultPLikeFront のセッターメソッドです。
     * 
     * @param chkResultPLikeFront chkResultPLikeFront に設定する
     */
    public void setChkResultPLikeFront(String chkResultPLikeFront) {
        this.chkResultPLikeFront = chkResultPLikeFront;
    }

    /**
     * chkResultQGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultQGreaterThan
     */
    public String getChkResultQGreaterThan() {
        return chkResultQGreaterThan;
    }

    /**
     * chkResultQGreaterThan のセッターメソッドです。
     * 
     * @param chkResultQGreaterThan chkResultQGreaterThan に設定する
     */
    public void setChkResultQGreaterThan(String chkResultQGreaterThan) {
        this.chkResultQGreaterThan = chkResultQGreaterThan;
    }

    /**
     * chkResultQGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultQGreaterThanEqual
     */
    public String getChkResultQGreaterThanEqual() {
        return chkResultQGreaterThanEqual;
    }

    /**
     * chkResultQGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultQGreaterThanEqual chkResultQGreaterThanEqual に設定する
     */
    public void setChkResultQGreaterThanEqual(String chkResultQGreaterThanEqual) {
        this.chkResultQGreaterThanEqual = chkResultQGreaterThanEqual;
    }

    /**
     * chkResultQLessThan のゲッターメソッドです。
     * 
     * @return the chkResultQLessThan
     */
    public String getChkResultQLessThan() {
        return chkResultQLessThan;
    }

    /**
     * chkResultQLessThan のセッターメソッドです。
     * 
     * @param chkResultQLessThan chkResultQLessThan に設定する
     */
    public void setChkResultQLessThan(String chkResultQLessThan) {
        this.chkResultQLessThan = chkResultQLessThan;
    }

    /**
     * chkResultQLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultQLessThanEqual
     */
    public String getChkResultQLessThanEqual() {
        return chkResultQLessThanEqual;
    }

    /**
     * chkResultQLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultQLessThanEqual chkResultQLessThanEqual に設定する
     */
    public void setChkResultQLessThanEqual(String chkResultQLessThanEqual) {
        this.chkResultQLessThanEqual = chkResultQLessThanEqual;
    }

    /**
     * chkResultQLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultQLikeFront
     */
    public String getChkResultQLikeFront() {
        return chkResultQLikeFront;
    }

    /**
     * chkResultQLikeFront のセッターメソッドです。
     * 
     * @param chkResultQLikeFront chkResultQLikeFront に設定する
     */
    public void setChkResultQLikeFront(String chkResultQLikeFront) {
        this.chkResultQLikeFront = chkResultQLikeFront;
    }

    /**
     * chkResultRGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultRGreaterThan
     */
    public String getChkResultRGreaterThan() {
        return chkResultRGreaterThan;
    }

    /**
     * chkResultRGreaterThan のセッターメソッドです。
     * 
     * @param chkResultRGreaterThan chkResultRGreaterThan に設定する
     */
    public void setChkResultRGreaterThan(String chkResultRGreaterThan) {
        this.chkResultRGreaterThan = chkResultRGreaterThan;
    }

    /**
     * chkResultRGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultRGreaterThanEqual
     */
    public String getChkResultRGreaterThanEqual() {
        return chkResultRGreaterThanEqual;
    }

    /**
     * chkResultRGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultRGreaterThanEqual chkResultRGreaterThanEqual に設定する
     */
    public void setChkResultRGreaterThanEqual(String chkResultRGreaterThanEqual) {
        this.chkResultRGreaterThanEqual = chkResultRGreaterThanEqual;
    }

    /**
     * chkResultRLessThan のゲッターメソッドです。
     * 
     * @return the chkResultRLessThan
     */
    public String getChkResultRLessThan() {
        return chkResultRLessThan;
    }

    /**
     * chkResultRLessThan のセッターメソッドです。
     * 
     * @param chkResultRLessThan chkResultRLessThan に設定する
     */
    public void setChkResultRLessThan(String chkResultRLessThan) {
        this.chkResultRLessThan = chkResultRLessThan;
    }

    /**
     * chkResultRLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultRLessThanEqual
     */
    public String getChkResultRLessThanEqual() {
        return chkResultRLessThanEqual;
    }

    /**
     * chkResultRLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultRLessThanEqual chkResultRLessThanEqual に設定する
     */
    public void setChkResultRLessThanEqual(String chkResultRLessThanEqual) {
        this.chkResultRLessThanEqual = chkResultRLessThanEqual;
    }

    /**
     * chkResultRLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultRLikeFront
     */
    public String getChkResultRLikeFront() {
        return chkResultRLikeFront;
    }

    /**
     * chkResultRLikeFront のセッターメソッドです。
     * 
     * @param chkResultRLikeFront chkResultRLikeFront に設定する
     */
    public void setChkResultRLikeFront(String chkResultRLikeFront) {
        this.chkResultRLikeFront = chkResultRLikeFront;
    }

    /**
     * chkResultSGreaterThan のゲッターメソッドです。
     * 
     * @return the chkResultSGreaterThan
     */
    public String getChkResultSGreaterThan() {
        return chkResultSGreaterThan;
    }

    /**
     * chkResultSGreaterThan のセッターメソッドです。
     * 
     * @param chkResultSGreaterThan chkResultSGreaterThan に設定する
     */
    public void setChkResultSGreaterThan(String chkResultSGreaterThan) {
        this.chkResultSGreaterThan = chkResultSGreaterThan;
    }

    /**
     * chkResultSGreaterThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultSGreaterThanEqual
     */
    public String getChkResultSGreaterThanEqual() {
        return chkResultSGreaterThanEqual;
    }

    /**
     * chkResultSGreaterThanEqual のセッターメソッドです。
     * 
     * @param chkResultSGreaterThanEqual chkResultSGreaterThanEqual に設定する
     */
    public void setChkResultSGreaterThanEqual(String chkResultSGreaterThanEqual) {
        this.chkResultSGreaterThanEqual = chkResultSGreaterThanEqual;
    }

    /**
     * chkResultSLessThan のゲッターメソッドです。
     * 
     * @return the chkResultSLessThan
     */
    public String getChkResultSLessThan() {
        return chkResultSLessThan;
    }

    /**
     * chkResultSLessThan のセッターメソッドです。
     * 
     * @param chkResultSLessThan chkResultSLessThan に設定する
     */
    public void setChkResultSLessThan(String chkResultSLessThan) {
        this.chkResultSLessThan = chkResultSLessThan;
    }

    /**
     * chkResultSLessThanEqual のゲッターメソッドです。
     * 
     * @return the chkResultSLessThanEqual
     */
    public String getChkResultSLessThanEqual() {
        return chkResultSLessThanEqual;
    }

    /**
     * chkResultSLessThanEqual のセッターメソッドです。
     * 
     * @param chkResultSLessThanEqual chkResultSLessThanEqual に設定する
     */
    public void setChkResultSLessThanEqual(String chkResultSLessThanEqual) {
        this.chkResultSLessThanEqual = chkResultSLessThanEqual;
    }

    /**
     * chkResultSLikeFront のゲッターメソッドです。
     * 
     * @return the chkResultSLikeFront
     */
    public String getChkResultSLikeFront() {
        return chkResultSLikeFront;
    }

    /**
     * chkResultSLikeFront のセッターメソッドです。
     * 
     * @param chkResultSLikeFront chkResultSLikeFront に設定する
     */
    public void setChkResultSLikeFront(String chkResultSLikeFront) {
        this.chkResultSLikeFront = chkResultSLikeFront;
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

