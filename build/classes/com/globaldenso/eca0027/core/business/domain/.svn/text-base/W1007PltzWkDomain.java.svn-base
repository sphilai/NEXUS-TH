/*
 * PROJECT：eca0027
 * 
 * W1007PltzWk のDomainクラス
 * テーブル概要：TW_EXP_REQUEST_PLTZ
 * 
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2558/05/26  DNITS  新規作成
 * 
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * W1007PltzWk のDomainクラスです。<BR>
 * テーブル概要：TW_EXP_REQUEST_PLTZ<BR>
 * 
 * <BR>
 * SACT Version： 1.0.1<BR>
 * 生成日      ： 2558/05/26 15:53:05<BR>
 * 
 * テーブル定義から2558/05/26に自動生成したモジュールです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class W1007PltzWkDomain extends AbstractDomain implements Serializable {

    /**
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    /**
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not // ##ISSUE 151
     */
    private String commercialFlg;
    /**
     * COMMERCIAL FLAG/?????  Y:Commercial, N:Not // ##ISSUE 151
     */
    private String commercialKitFlg;
    /**
     * PLTZ_WK_ID
     */
    private BigDecimal pltzWkId;
    /**
     * EXPORT REQUEST NO/????NO
     */
    private String expRequestNo;

    /**
     * EXPORT REQUEST ITEM ID OR EXPORT REQUEST KIT ID/??????ID
     */
    private BigDecimal expRequestItemId;
    /**
     * EXPORT REQUEST KIT ID
     */
    private BigDecimal expRequestKitId;
    /**
     * PALLET_NO
     */
    private String palletNo;

    /**
     * LINE_NO
     */
    private BigDecimal lineNo;

    /**
     * KIT_BRCH
     */
    private BigDecimal kitBrch;

    /**
     * CUSTOMER_ITEM_NO
     */
    private String customerItemNo;

    /**
     * DESCRIPTION
     */
    private String description;

    /**
     * COMPONENT_ITEM_NO
     */
    private String componentItemNo;
    /**
     * MainMark
     */
    private String mainMark;
    /**
     * QTY_UNIT
     */
    private String qtyUnit;
    /**
     * NET_WEIGHT
     */
    private BigDecimal netWeight;
    /**
     * QTY
     */
    private BigDecimal qty;

    /**
     * COM_UPDATE_USER_ID
     */
    private String comUpdateUserId;

    /**
     * COM_UPDATE_TIMESTAMP
     */
    private Timestamp comUpdateTimestamp;

    /**
     * COM_CREATE_USER_ID
     */
    private String comCreateUserId;

    /**
     * COM_CREATE_TIMESTAMP
     */
    private Timestamp comCreateTimestamp;
    /**
     * TYPE
     */
    private String type;
    /**
     * DNGR_GOODS_IMP_EXP_CTRL
     */
    private String dngrGoodsImpExpCtrl;
    /**
     * DNGR_GOODS_IMP_EXP_CTRL
     */
    private String dngrGoodsImpExpCtrlKit;
    /**
     * デフォルトコンストラクタ。
     */
    public W1007PltzWkDomain() {
    }

    /**
     * <p>Getter method for commercialKitFlg.</p>
     *
     * @return the commercialKitFlg
     */
    public String getCommercialKitFlg() {
        return commercialKitFlg;
    }

    /**
     * <p>Setter method for commercialKitFlg.</p>
     *
     * @param commercialKitFlg Set for commercialKitFlg
     */
    public void setCommercialKitFlg(String commercialKitFlg) {
        this.commercialKitFlg = commercialKitFlg;
        if(this.commercialKitFlg != null && this.commercialKitFlg.trim().length() > 0){
            this.commercialFlg = this.commercialKitFlg;
        }
    }

    /**
     * <p>Getter method for dngrGoodsImpExpCtrl.</p>
     *
     * @return the dngrGoodsImpExpCtrl
     */
    public String getDngrGoodsImpExpCtrl() {
        return dngrGoodsImpExpCtrl;
    }

    /**
     * <p>Getter method for commercialFlg.</p>
     *
     * @return the commercialFlg
     */
    public String getCommercialFlg() {
        return commercialFlg;
    }

    /**
     * <p>Setter method for commercialFlg.</p>
     *
     * @param commercialFlg Set for commercialFlg
     */
    public void setCommercialFlg(String commercialFlg) {
        this.commercialFlg = commercialFlg;
    }

    /**
     * <p>Setter method for dngrGoodsImpExpCtrl.</p>
     *
     * @param dngrGoodsImpExpCtrl Set for dngrGoodsImpExpCtrl
     */
    public void setDngrGoodsImpExpCtrl(String dngrGoodsImpExpCtrl) {
        this.dngrGoodsImpExpCtrl = dngrGoodsImpExpCtrl;
    }

    /**
     * <p>Getter method for dngrGoodsImpExpCtrlKit.</p>
     *
     * @return the dngrGoodsImpExpCtrlKit
     */
    public String getDngrGoodsImpExpCtrlKit() {
        return dngrGoodsImpExpCtrlKit;
    }

    /**
     * <p>Setter method for dngrGoodsImpExpCtrlKit.</p>
     *
     * @param dngrGoodsImpExpCtrlKit Set for dngrGoodsImpExpCtrlKit
     */
    public void setDngrGoodsImpExpCtrlKit(String dngrGoodsImpExpCtrlKit) {
        this.dngrGoodsImpExpCtrlKit = dngrGoodsImpExpCtrlKit;
        if(this.dngrGoodsImpExpCtrlKit != null && this.dngrGoodsImpExpCtrlKit.trim().length() > 0){
            this.dngrGoodsImpExpCtrl = this.dngrGoodsImpExpCtrlKit;
        }
    }

    /**
     * <p>Getter method for type.</p>
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * <p>Getter method for netWeight.</p>
     *
     * @return the netWeight
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * <p>Setter method for netWeight.</p>
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * <p>Getter method for mainMark.</p>
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * <p>Setter method for mainMark.</p>
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * <p>Setter method for type.</p>
     *
     * @param type Set for type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>Getter method for pltzWkId.</p>
     *
     * @return the pltzWkId
     */
    public BigDecimal getPltzWkId() {
        return pltzWkId;
    }

    /**
     * <p>Setter method for pltzWkId.</p>
     *
     * @param pltzWkId Set for pltzWkId
     */
    public void setPltzWkId(BigDecimal pltzWkId) {
        this.pltzWkId = pltzWkId;
    }

    /**
     * <p>Getter method for expRequestKitId.</p>
     *
     * @return the expRequestKitId
     */
    public BigDecimal getExpRequestKitId() {
        return expRequestKitId;
    }

    /**
     * <p>Setter method for expRequestKitId.</p>
     *
     * @param expRequestKitId Set for expRequestKitId
     */
    public void setExpRequestKitId(BigDecimal expRequestKitId) {
        this.expRequestKitId = expRequestKitId;
    }

    /**
     * expRequestNo のゲッターメソッドです。
     * 
     * @return the expRequestNo
     */
    public String getExpRequestNo() {
        return expRequestNo;
    }

    /**
     * expRequestNo のセッターメソッドです。
     * 
     * @param expRequestNo expRequestNo に設定する
     */
    public void setExpRequestNo(String expRequestNo) {
        this.expRequestNo = expRequestNo;
    }

    /**
     * expRequestItemId のゲッターメソッドです。
     * 
     * @return the expRequestItemId
     */
    public BigDecimal getExpRequestItemId() {
        return expRequestItemId;
    }

    /**
     * expRequestItemId のセッターメソッドです。
     * 
     * @param expRequestItemId expRequestItemId に設定する
     */
    public void setExpRequestItemId(BigDecimal expRequestItemId) {
        this.expRequestItemId = expRequestItemId;
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
     * lineNo のゲッターメソッドです。
     * 
     * @return the lineNo
     */
    public BigDecimal getLineNo() {
        return lineNo;
    }

    /**
     * lineNo のセッターメソッドです。
     * 
     * @param lineNo lineNo に設定する
     */
    public void setLineNo(BigDecimal lineNo) {
        this.lineNo = lineNo;
    }

    /**
     * kitBrch のゲッターメソッドです。
     * 
     * @return the kitBrch
     */
    public BigDecimal getKitBrch() {
        return kitBrch;
    }

    /**
     * kitBrch のセッターメソッドです。
     * 
     * @param kitBrch kitBrch に設定する
     */
    public void setKitBrch(BigDecimal kitBrch) {
        this.kitBrch = kitBrch;
    }

    /**
     * customerItemNo のゲッターメソッドです。
     * 
     * @return the customerItemNo
     */
    public String getCustomerItemNo() {
        return customerItemNo;
    }

    /**
     * customerItemNo のセッターメソッドです。
     * 
     * @param customerItemNo customerItemNo に設定する
     */
    public void setCustomerItemNo(String customerItemNo) {
        this.customerItemNo = customerItemNo;
    }

    /**
     * description のゲッターメソッドです。
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * description のセッターメソッドです。
     * 
     * @param description description に設定する
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * componentItemNo のゲッターメソッドです。
     * 
     * @return the componentItemNo
     */
    public String getComponentItemNo() {
        return componentItemNo;
    }

    /**
     * componentItemNo のセッターメソッドです。
     * 
     * @param componentItemNo componentItemNo に設定する
     */
    public void setComponentItemNo(String componentItemNo) {
        this.componentItemNo = componentItemNo;
    }

    /**
     * qtyUnit のゲッターメソッドです。
     * 
     * @return the qtyUnit
     */
    public String getQtyUnit() {
        return qtyUnit;
    }

    /**
     * qtyUnit のセッターメソッドです。
     * 
     * @param qtyUnit qtyUnit に設定する
     */
    public void setQtyUnit(String qtyUnit) {
        this.qtyUnit = qtyUnit;
    }

    /**
     * qty のゲッターメソッドです。
     * 
     * @return the qty
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * qty のセッターメソッドです。
     * 
     * @param qty qty に設定する
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
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
