/*
 * PROJECT：eca0027
 * 
 * TmPkgMtrl のDomainクラス
 * テーブル概要：TM_PKG_MTRL
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2015/05/15  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.auto.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

/**
 * TmPkgMtrl のDomainクラスです。<BR>
 * テーブル概要：TM_PKG_MTRL<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2015/05/15 10:10:46<BR>
 * 
 * テーブル定義から2015/05/15に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class TmPkgMtrlDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * OWNER_COMP
     */
    private String ownerComp;

    /**
     * PKG_ITEM_NO
     */
    private String pkgItemNo;

    /**
     * MODEL_CD
     */
    private String modelCd;

    /**
     * LENGTH_UNIT
     */
    private String lengthUnit;

    /**
     * LENGTH_OUT
     */
    private BigDecimal lengthOut;

    /**
     * WIDTH_OUT
     */
    private BigDecimal widthOut;

    /**
     * HEIGHT_OUT
     */
    private BigDecimal heightOut;

    /**
     * LENGTH_IN
     */
    private BigDecimal lengthIn;

    /**
     * WIDTH_IN
     */
    private BigDecimal widthIn;

    /**
     * HEIGHT_IN
     */
    private BigDecimal heightIn;

    /**
     * LENGTH_DESIGN
     */
    private BigDecimal lengthDesign;

    /**
     * WIDTH_DESIGN
     */
    private BigDecimal widthDesign;

    /**
     * HEIGHT_DESIGN
     */
    private BigDecimal heightDesign;

    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;

    /**
     * PKG_WEIGHT
     */
    private BigDecimal pkgWeight;

    /**
     * RT_TYP
     */
    private String rtTyp;

    /**
     * ORIGIN_CNTRY_CD
     */
    private String originCntryCd;

    /**
     * PKG_CTGRY_A
     */
    private String pkgCtgryA;

    /**
     * PKG_CTGRY_B
     */
    private String pkgCtgryB;

    /**
     * PKG_CTGRY_C
     */
    private String pkgCtgryC;

    /**
     * SUPPLIER_CD
     */
    private String supplierCd;

    /**
     * CURR_CD
     */
    private String currCd;

    /**
     * CUSTOMS_VALUATION
     */
    private BigDecimal customsValuation;

    /**
     * ITEM_TYP
     */
    private String itemTyp;

    /**
     * ITEM_NO_GRP
     */
    private String itemNoGrp;

    /**
     * ODR_DEPT_TYP
     */
    private String odrDeptTyp;

    /**
     * INNER_OUTER_TYP
     */
    private String innerOuterTyp;

    /**
     * PKG_EXP_DT
     */
    private Date pkgExpDt;

    /**
     * DRAW_ID
     */
    private String drawId;

    /**
     * FILE_ID1
     */
    private String fileId1;

    /**
     * FILE_ID2
     */
    private String fileId2;

    /**
     * FILE_ID3
     */
    private String fileId3;

    /**
     * FILE_ID4
     */
    private String fileId4;

    /**
     * FILE_ID5
     */
    private String fileId5;

    /**
     * PKG_MTRL_NM
     */
    private String pkgMtrlNm;

    /**
     * REV_RECORD
     */
    private String revRecord;

    /**
     * REMARKS
     */
    private String remarks;

    /**
     * DESIGN_COMP
     */
    private String designComp;

    /**
     * WFID
     */
    private String wfid;

    /**
     * MAIL_SEND_DT
     */
    private Date mailSendDt;

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
    public TmPkgMtrlDomain() {
    }

    /**
     * ownerComp のゲッターメソッドです。
     * 
     * @return the ownerComp
     */
    public String getOwnerComp() {
        return ownerComp;
    }

    /**
     * ownerComp のセッターメソッドです。
     * 
     * @param ownerComp ownerComp に設定する
     */
    public void setOwnerComp(String ownerComp) {
        this.ownerComp = ownerComp;
    }

    /**
     * pkgItemNo のゲッターメソッドです。
     * 
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * pkgItemNo のセッターメソッドです。
     * 
     * @param pkgItemNo pkgItemNo に設定する
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * modelCd のゲッターメソッドです。
     * 
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }

    /**
     * modelCd のセッターメソッドです。
     * 
     * @param modelCd modelCd に設定する
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }

    /**
     * lengthUnit のゲッターメソッドです。
     * 
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * lengthUnit のセッターメソッドです。
     * 
     * @param lengthUnit lengthUnit に設定する
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    /**
     * lengthOut のゲッターメソッドです。
     * 
     * @return the lengthOut
     */
    public BigDecimal getLengthOut() {
        return lengthOut;
    }

    /**
     * lengthOut のセッターメソッドです。
     * 
     * @param lengthOut lengthOut に設定する
     */
    public void setLengthOut(BigDecimal lengthOut) {
        this.lengthOut = lengthOut;
    }

    /**
     * widthOut のゲッターメソッドです。
     * 
     * @return the widthOut
     */
    public BigDecimal getWidthOut() {
        return widthOut;
    }

    /**
     * widthOut のセッターメソッドです。
     * 
     * @param widthOut widthOut に設定する
     */
    public void setWidthOut(BigDecimal widthOut) {
        this.widthOut = widthOut;
    }

    /**
     * heightOut のゲッターメソッドです。
     * 
     * @return the heightOut
     */
    public BigDecimal getHeightOut() {
        return heightOut;
    }

    /**
     * heightOut のセッターメソッドです。
     * 
     * @param heightOut heightOut に設定する
     */
    public void setHeightOut(BigDecimal heightOut) {
        this.heightOut = heightOut;
    }

    /**
     * lengthIn のゲッターメソッドです。
     * 
     * @return the lengthIn
     */
    public BigDecimal getLengthIn() {
        return lengthIn;
    }

    /**
     * lengthIn のセッターメソッドです。
     * 
     * @param lengthIn lengthIn に設定する
     */
    public void setLengthIn(BigDecimal lengthIn) {
        this.lengthIn = lengthIn;
    }

    /**
     * widthIn のゲッターメソッドです。
     * 
     * @return the widthIn
     */
    public BigDecimal getWidthIn() {
        return widthIn;
    }

    /**
     * widthIn のセッターメソッドです。
     * 
     * @param widthIn widthIn に設定する
     */
    public void setWidthIn(BigDecimal widthIn) {
        this.widthIn = widthIn;
    }

    /**
     * heightIn のゲッターメソッドです。
     * 
     * @return the heightIn
     */
    public BigDecimal getHeightIn() {
        return heightIn;
    }

    /**
     * heightIn のセッターメソッドです。
     * 
     * @param heightIn heightIn に設定する
     */
    public void setHeightIn(BigDecimal heightIn) {
        this.heightIn = heightIn;
    }

    /**
     * lengthDesign のゲッターメソッドです。
     * 
     * @return the lengthDesign
     */
    public BigDecimal getLengthDesign() {
        return lengthDesign;
    }

    /**
     * lengthDesign のセッターメソッドです。
     * 
     * @param lengthDesign lengthDesign に設定する
     */
    public void setLengthDesign(BigDecimal lengthDesign) {
        this.lengthDesign = lengthDesign;
    }

    /**
     * widthDesign のゲッターメソッドです。
     * 
     * @return the widthDesign
     */
    public BigDecimal getWidthDesign() {
        return widthDesign;
    }

    /**
     * widthDesign のセッターメソッドです。
     * 
     * @param widthDesign widthDesign に設定する
     */
    public void setWidthDesign(BigDecimal widthDesign) {
        this.widthDesign = widthDesign;
    }

    /**
     * heightDesign のゲッターメソッドです。
     * 
     * @return the heightDesign
     */
    public BigDecimal getHeightDesign() {
        return heightDesign;
    }

    /**
     * heightDesign のセッターメソッドです。
     * 
     * @param heightDesign heightDesign に設定する
     */
    public void setHeightDesign(BigDecimal heightDesign) {
        this.heightDesign = heightDesign;
    }

    /**
     * weightUnit のゲッターメソッドです。
     * 
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * weightUnit のセッターメソッドです。
     * 
     * @param weightUnit weightUnit に設定する
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * pkgWeight のゲッターメソッドです。
     * 
     * @return the pkgWeight
     */
    public BigDecimal getPkgWeight() {
        return pkgWeight;
    }

    /**
     * pkgWeight のセッターメソッドです。
     * 
     * @param pkgWeight pkgWeight に設定する
     */
    public void setPkgWeight(BigDecimal pkgWeight) {
        this.pkgWeight = pkgWeight;
    }

    /**
     * rtTyp のゲッターメソッドです。
     * 
     * @return the rtTyp
     */
    public String getRtTyp() {
        return rtTyp;
    }

    /**
     * rtTyp のセッターメソッドです。
     * 
     * @param rtTyp rtTyp に設定する
     */
    public void setRtTyp(String rtTyp) {
        this.rtTyp = rtTyp;
    }

    /**
     * originCntryCd のゲッターメソッドです。
     * 
     * @return the originCntryCd
     */
    public String getOriginCntryCd() {
        return originCntryCd;
    }

    /**
     * originCntryCd のセッターメソッドです。
     * 
     * @param originCntryCd originCntryCd に設定する
     */
    public void setOriginCntryCd(String originCntryCd) {
        this.originCntryCd = originCntryCd;
    }

    /**
     * pkgCtgryA のゲッターメソッドです。
     * 
     * @return the pkgCtgryA
     */
    public String getPkgCtgryA() {
        return pkgCtgryA;
    }

    /**
     * pkgCtgryA のセッターメソッドです。
     * 
     * @param pkgCtgryA pkgCtgryA に設定する
     */
    public void setPkgCtgryA(String pkgCtgryA) {
        this.pkgCtgryA = pkgCtgryA;
    }

    /**
     * pkgCtgryB のゲッターメソッドです。
     * 
     * @return the pkgCtgryB
     */
    public String getPkgCtgryB() {
        return pkgCtgryB;
    }

    /**
     * pkgCtgryB のセッターメソッドです。
     * 
     * @param pkgCtgryB pkgCtgryB に設定する
     */
    public void setPkgCtgryB(String pkgCtgryB) {
        this.pkgCtgryB = pkgCtgryB;
    }

    /**
     * pkgCtgryC のゲッターメソッドです。
     * 
     * @return the pkgCtgryC
     */
    public String getPkgCtgryC() {
        return pkgCtgryC;
    }

    /**
     * pkgCtgryC のセッターメソッドです。
     * 
     * @param pkgCtgryC pkgCtgryC に設定する
     */
    public void setPkgCtgryC(String pkgCtgryC) {
        this.pkgCtgryC = pkgCtgryC;
    }

    /**
     * supplierCd のゲッターメソッドです。
     * 
     * @return the supplierCd
     */
    public String getSupplierCd() {
        return supplierCd;
    }

    /**
     * supplierCd のセッターメソッドです。
     * 
     * @param supplierCd supplierCd に設定する
     */
    public void setSupplierCd(String supplierCd) {
        this.supplierCd = supplierCd;
    }

    /**
     * currCd のゲッターメソッドです。
     * 
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * currCd のセッターメソッドです。
     * 
     * @param currCd currCd に設定する
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    /**
     * customsValuation のゲッターメソッドです。
     * 
     * @return the customsValuation
     */
    public BigDecimal getCustomsValuation() {
        return customsValuation;
    }

    /**
     * customsValuation のセッターメソッドです。
     * 
     * @param customsValuation customsValuation に設定する
     */
    public void setCustomsValuation(BigDecimal customsValuation) {
        this.customsValuation = customsValuation;
    }

    /**
     * itemTyp のゲッターメソッドです。
     * 
     * @return the itemTyp
     */
    public String getItemTyp() {
        return itemTyp;
    }

    /**
     * itemTyp のセッターメソッドです。
     * 
     * @param itemTyp itemTyp に設定する
     */
    public void setItemTyp(String itemTyp) {
        this.itemTyp = itemTyp;
    }

    /**
     * itemNoGrp のゲッターメソッドです。
     * 
     * @return the itemNoGrp
     */
    public String getItemNoGrp() {
        return itemNoGrp;
    }

    /**
     * itemNoGrp のセッターメソッドです。
     * 
     * @param itemNoGrp itemNoGrp に設定する
     */
    public void setItemNoGrp(String itemNoGrp) {
        this.itemNoGrp = itemNoGrp;
    }

    /**
     * odrDeptTyp のゲッターメソッドです。
     * 
     * @return the odrDeptTyp
     */
    public String getOdrDeptTyp() {
        return odrDeptTyp;
    }

    /**
     * odrDeptTyp のセッターメソッドです。
     * 
     * @param odrDeptTyp odrDeptTyp に設定する
     */
    public void setOdrDeptTyp(String odrDeptTyp) {
        this.odrDeptTyp = odrDeptTyp;
    }

    /**
     * innerOuterTyp のゲッターメソッドです。
     * 
     * @return the innerOuterTyp
     */
    public String getInnerOuterTyp() {
        return innerOuterTyp;
    }

    /**
     * innerOuterTyp のセッターメソッドです。
     * 
     * @param innerOuterTyp innerOuterTyp に設定する
     */
    public void setInnerOuterTyp(String innerOuterTyp) {
        this.innerOuterTyp = innerOuterTyp;
    }

    /**
     * pkgExpDt のゲッターメソッドです。
     * 
     * @return the pkgExpDt
     */
    public Date getPkgExpDt() {
        return pkgExpDt;
    }

    /**
     * pkgExpDt のセッターメソッドです。
     * 
     * @param pkgExpDt pkgExpDt に設定する
     */
    public void setPkgExpDt(Date pkgExpDt) {
        this.pkgExpDt = pkgExpDt;
    }

    /**
     * drawId のゲッターメソッドです。
     * 
     * @return the drawId
     */
    public String getDrawId() {
        return drawId;
    }

    /**
     * drawId のセッターメソッドです。
     * 
     * @param drawId drawId に設定する
     */
    public void setDrawId(String drawId) {
        this.drawId = drawId;
    }

    /**
     * fileId1 のゲッターメソッドです。
     * 
     * @return the fileId1
     */
    public String getFileId1() {
        return fileId1;
    }

    /**
     * fileId1 のセッターメソッドです。
     * 
     * @param fileId1 fileId1 に設定する
     */
    public void setFileId1(String fileId1) {
        this.fileId1 = fileId1;
    }

    /**
     * fileId2 のゲッターメソッドです。
     * 
     * @return the fileId2
     */
    public String getFileId2() {
        return fileId2;
    }

    /**
     * fileId2 のセッターメソッドです。
     * 
     * @param fileId2 fileId2 に設定する
     */
    public void setFileId2(String fileId2) {
        this.fileId2 = fileId2;
    }

    /**
     * fileId3 のゲッターメソッドです。
     * 
     * @return the fileId3
     */
    public String getFileId3() {
        return fileId3;
    }

    /**
     * fileId3 のセッターメソッドです。
     * 
     * @param fileId3 fileId3 に設定する
     */
    public void setFileId3(String fileId3) {
        this.fileId3 = fileId3;
    }

    /**
     * fileId4 のゲッターメソッドです。
     * 
     * @return the fileId4
     */
    public String getFileId4() {
        return fileId4;
    }

    /**
     * fileId4 のセッターメソッドです。
     * 
     * @param fileId4 fileId4 に設定する
     */
    public void setFileId4(String fileId4) {
        this.fileId4 = fileId4;
    }

    /**
     * fileId5 のゲッターメソッドです。
     * 
     * @return the fileId5
     */
    public String getFileId5() {
        return fileId5;
    }

    /**
     * fileId5 のセッターメソッドです。
     * 
     * @param fileId5 fileId5 に設定する
     */
    public void setFileId5(String fileId5) {
        this.fileId5 = fileId5;
    }

    /**
     * pkgMtrlNm のゲッターメソッドです。
     * 
     * @return the pkgMtrlNm
     */
    public String getPkgMtrlNm() {
        return pkgMtrlNm;
    }

    /**
     * pkgMtrlNm のセッターメソッドです。
     * 
     * @param pkgMtrlNm pkgMtrlNm に設定する
     */
    public void setPkgMtrlNm(String pkgMtrlNm) {
        this.pkgMtrlNm = pkgMtrlNm;
    }

    /**
     * revRecord のゲッターメソッドです。
     * 
     * @return the revRecord
     */
    public String getRevRecord() {
        return revRecord;
    }

    /**
     * revRecord のセッターメソッドです。
     * 
     * @param revRecord revRecord に設定する
     */
    public void setRevRecord(String revRecord) {
        this.revRecord = revRecord;
    }

    /**
     * remarks のゲッターメソッドです。
     * 
     * @return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * remarks のセッターメソッドです。
     * 
     * @param remarks remarks に設定する
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * designComp のゲッターメソッドです。
     * 
     * @return the designComp
     */
    public String getDesignComp() {
        return designComp;
    }

    /**
     * designComp のセッターメソッドです。
     * 
     * @param designComp designComp に設定する
     */
    public void setDesignComp(String designComp) {
        this.designComp = designComp;
    }

    /**
     * wfid のゲッターメソッドです。
     * 
     * @return the wfid
     */
    public String getWfid() {
        return wfid;
    }

    /**
     * wfid のセッターメソッドです。
     * 
     * @param wfid wfid に設定する
     */
    public void setWfid(String wfid) {
        this.wfid = wfid;
    }

    /**
     * mailSendDt のゲッターメソッドです。
     * 
     * @return the mailSendDt
     */
    public Date getMailSendDt() {
        return mailSendDt;
    }

    /**
     * mailSendDt のセッターメソッドです。
     * 
     * @param mailSendDt mailSendDt に設定する
     */
    public void setMailSendDt(Date mailSendDt) {
        this.mailSendDt = mailSendDt;
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
