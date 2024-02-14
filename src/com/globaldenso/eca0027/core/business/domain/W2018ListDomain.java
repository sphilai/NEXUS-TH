/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.math.BigDecimal;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the detail information of
 * Multiple Item No. in 1Box PKG Info Detail Screen
 * List section
 * <br />小箱内多品番梱包PKG Info Detail画面一覧部の明細情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2018ListDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * The index on a display
     * <br />表示上のインデックス
     */
    private int index;
    
    /**
     * DSC-ID
     * <br />DSC-ID
     */
    private String dscId;
    
    /**
     * PACKAGE ITEM NO
     * <br />包装材品目番号
     */
    private String pkgItemNo;
    
    /**
     * QUANTITY
     * <br />数量
     */
    private String qty;
    
    /**
     * BOX FLAG
     * <br />箱フラグ
     */
    private String boxFlg;
    
    /**
     * MODEL CODE
     * <br />型式コード
     */
    private String modelCd;
    
    /**
     * DISABLED Flg
     * <br />利用不可フラグ
     */
    private String disabledFlg;
    
    /**
     * A Delete button non-activity flag
     * <br />Deleteボタン非活性フラグ
     */
    private String deleteBtDisabledFlg;
    
    // ---- Detail画面のsaveで使用 ----// 
    /**
     * RT_TYP
     */
    private String rtTyp;
    
    /**
     * WEIGHT_UNIT
     */
    private String weightUnit;
    
    /**
     * PKG_WEIGHT
     */
    private BigDecimal pkgWeight;
    
    /**
     * ORIGIN_CNTRY
     */
    private String originCntry;
    
    /**
     * CURR_CD
     */
    private String currCd;
    
    /**
     * PKG_NM
     */
    private String pkgNm;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2018ListDomain() {
    }

    /**
     * Getter method for index.
     *
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * Setter method for index.
     *
     * @param index Set for index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Getter method for dscId.
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * Setter method for dscId.
     *
     * @param dscId Set for dscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * Getter method for pkgItemNo.
     *
     * @return the pkgItemNo
     */
    public String getPkgItemNo() {
        return pkgItemNo;
    }

    /**
     * Setter method for pkgItemNo.
     *
     * @param pkgItemNo Set for pkgItemNo
     */
    public void setPkgItemNo(String pkgItemNo) {
        this.pkgItemNo = pkgItemNo;
    }

    /**
     * Getter method for qty.
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * Setter method for qty.
     *
     * @param qty Set for qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * Getter method for boxFlg.
     *
     * @return the boxFlg
     */
    public String getBoxFlg() {
        return boxFlg;
    }

    /**
     * Setter method for boxFlg.
     *
     * @param boxFlg Set for boxFlg
     */
    public void setBoxFlg(String boxFlg) {
        this.boxFlg = boxFlg;
    }

    /**
     * Getter method for modelCd.
     *
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }

    /**
     * Setter method for modelCd.
     *
     * @param modelCd Set for modelCd
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }

    /**
     * Getter method for disabledFlg.
     *
     * @return the disabledFlg
     */
    public String getDisabledFlg() {
        return disabledFlg;
    }

    /**
     * Setter method for disabledFlg.
     *
     * @param disabledFlg Set for disabledFlg
     */
    public void setDisabledFlg(String disabledFlg) {
        this.disabledFlg = disabledFlg;
    }

    /**
     * Getter method for deleteBtDisabledFlg.
     *
     * @return the deleteBtDisabledFlg
     */
    public String getDeleteBtDisabledFlg() {
        return deleteBtDisabledFlg;
    }

    /**
     * Setter method for deleteBtDisabledFlg.
     *
     * @param deleteBtDisabledFlg Set for deleteBtDisabledFlg
     */
    public void setDeleteBtDisabledFlg(String deleteBtDisabledFlg) {
        this.deleteBtDisabledFlg = deleteBtDisabledFlg;
    }

    /**
     * Getter method for rtTyp.
     *
     * @return the rtTyp
     */
    public String getRtTyp() {
        return rtTyp;
    }

    /**
     * Setter method for rtTyp.
     *
     * @param rtTyp Set for rtTyp
     */
    public void setRtTyp(String rtTyp) {
        this.rtTyp = rtTyp;
    }

    /**
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Getter method for pkgWeight.
     *
     * @return the pkgWeight
     */
    public BigDecimal getPkgWeight() {
        return pkgWeight;
    }

    /**
     * Setter method for pkgWeight.
     *
     * @param pkgWeight Set for pkgWeight
     */
    public void setPkgWeight(BigDecimal pkgWeight) {
        this.pkgWeight = pkgWeight;
    }

    /**
     * Getter method for originCntry.
     *
     * @return the originCntry
     */
    public String getOriginCntry() {
        return originCntry;
    }

    /**
     * Setter method for originCntry.
     *
     * @param originCntry Set for originCntry
     */
    public void setOriginCntry(String originCntry) {
        this.originCntry = originCntry;
    }

    /**
     * Getter method for currCd.
     *
     * @return the currCd
     */
    public String getCurrCd() {
        return currCd;
    }

    /**
     * Setter method for currCd.
     *
     * @param currCd Set for currCd
     */
    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    /**
     * Getter method for pkgNm.
     *
     * @return the pkgNm
     */
    public String getPkgNm() {
        return pkgNm;
    }

    /**
     * Setter method for pkgNm.
     *
     * @param pkgNm Set for pkgNm
     */
    public void setPkgNm(String pkgNm) {
        this.pkgNm = pkgNm;
    }
    
}
