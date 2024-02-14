/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of CML Header Screen
 * <br />CML Header画面の検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class W2010CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * CUSTOMER CODE
     * <br />得意先コード
     */
    private String customerCd;
    
    /**
     * LEGACY SHIP TO
     * <br />LEGACY送荷先
     */
    private String lgcyShipTo;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * PLANT CODE
     * <br />製造部工場区分
     */
    private String plntCd;
    
    /**
     * LEGACY WAREHOUSE CODE
     * <br />LEGACY倉庫コード
     */
    private String lgcyWhCd;
    
    /**
     * PACKING WAREHOUSE COMPANY CODE
     * <br />梱包倉庫会社コード
     */
    private String packingWhCompCd;
    
    /**
     * PACKING WAREHOUSE CODE
     * <br />梱包倉庫コード
     */
    private String packingWhCd;
    
    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * PALLETIZE INSTR REQUIRED
     * <br />梱包指示有無
     */
    private String pltzInstrRequired;
    
    /**
     * PLANT & W/H DECLARATION
     * <br />工場倉庫区分
     */
    private String plntAndWhDeclaration;
    
    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;
    
    /**
     * User functional utilization right list
     * <br />ユーザ機能利用権限リスト
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * Base VALUE of authority (with no 2:RALL, 1:BALL, and 0:ALL authority)  
     * <br />権限のベース値(2:RALL、1:BALL、0:ALL権限なし)
     */
    private String baseAuthFlg;
    
    /**
     * PALLETIZE INSTRUCTION NO
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />梱包指示NO
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkPltzInstrNo;

    /**
     * SHIPPER CODE
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />荷主コード
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkShipperCd;
    
    /**
     * CUSTOMER CODE
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />得意先コード
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkCustomerCd;
    
    /**
     * LEGACY SHIP TO
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />LEGACY送荷先
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkLgcyShipTo;
    
    /**
     * TRANSPORT CODE
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />輸送手段コード
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkTrnsCd;
    
    /**
     * PLANT CODE
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />製造部工場区分
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkPlntCd;
    
    /**
     * LEGACY WAREHOUSE CODE
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />LEGACY倉庫コード
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkLgcyWhCd;
    
    /**
     * PACKING WAREHOUSE COMPANY CODE
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />梱包倉庫会社コード
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkPackingWhCompCd;
    
    /**
     * PACKING WAREHOUSE CODE
     *    (W2010 taking over item  *3 to the session for other screen display)  
     * <br />梱包倉庫コード
     *  (W2010 他画面表示用セッションへの引継項目 ※3) 
     */
    private String wkPackingWhCd;
    
    /**
     * Manual registration flag
     * <br />マニュアル登録フラグ。
     * UT110 TRIAL SHIPMENT/号試品対応 ADD
     */
    private String manualRegFlg;
    
    /**
     * Pallet/Carton Type
     * <br />パレット・カートン区分
     * UT420 ADD
     */
    private String palletCartonTyp;
    
    /**
     * Pallet/Carton Type Name
     * <br />パレット・カートン区分名称
     * UT420 ADD
     */
    private String palletCartonTypName;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2010CriteriaDomain() {
    }

    /**
     * Getter method for shipperCd.
     *
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * Setter method for shipperCd.
     *
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * Getter method for customerCd.
     *
     * @return the customerCd
     */
    public String getCustomerCd() {
        return customerCd;
    }

    /**
     * Setter method for customerCd.
     *
     * @param customerCd Set for customerCd
     */
    public void setCustomerCd(String customerCd) {
        this.customerCd = customerCd;
    }

    /**
     * Getter method for lgcyShipTo.
     *
     * @return the lgcyShipTo
     */
    public String getLgcyShipTo() {
        return lgcyShipTo;
    }

    /**
     * Setter method for lgcyShipTo.
     *
     * @param lgcyShipTo Set for lgcyShipTo
     */
    public void setLgcyShipTo(String lgcyShipTo) {
        this.lgcyShipTo = lgcyShipTo;
    }

    /**
     * Getter method for trnsCd.
     *
     * @return the trnsCd
     */
    public String getTrnsCd() {
        return trnsCd;
    }

    /**
     * Setter method for trnsCd.
     *
     * @param trnsCd Set for trnsCd
     */
    public void setTrnsCd(String trnsCd) {
        this.trnsCd = trnsCd;
    }

    /**
     * Getter method for plntCd.
     *
     * @return the plntCd
     */
    public String getPlntCd() {
        return plntCd;
    }

    /**
     * Setter method for plntCd.
     *
     * @param plntCd Set for plntCd
     */
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    /**
     * Getter method for lgcyWhCd.
     *
     * @return the lgcyWhCd
     */
    public String getLgcyWhCd() {
        return lgcyWhCd;
    }

    /**
     * Setter method for lgcyWhCd.
     *
     * @param lgcyWhCd Set for lgcyWhCd
     */
    public void setLgcyWhCd(String lgcyWhCd) {
        this.lgcyWhCd = lgcyWhCd;
    }

    /**
     * Getter method for packingWhCompCd.
     *
     * @return the packingWhCompCd
     */
    public String getPackingWhCompCd() {
        return packingWhCompCd;
    }

    /**
     * Setter method for packingWhCompCd.
     *
     * @param packingWhCompCd Set for packingWhCompCd
     */
    public void setPackingWhCompCd(String packingWhCompCd) {
        this.packingWhCompCd = packingWhCompCd;
    }

    /**
     * Getter method for packingWhCd.
     *
     * @return the packingWhCd
     */
    public String getPackingWhCd() {
        return packingWhCd;
    }

    /**
     * Setter method for packingWhCd.
     *
     * @param packingWhCd Set for packingWhCd
     */
    public void setPackingWhCd(String packingWhCd) {
        this.packingWhCd = packingWhCd;
    }

    /**
     * Getter method for pltzInstrNo.
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo.
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }

    /**
     * Getter method for pltzInstrRequired.
     *
     * @return the pltzInstrRequired
     */
    public String getPltzInstrRequired() {
        return pltzInstrRequired;
    }

    /**
     * Setter method for pltzInstrRequired.
     *
     * @param pltzInstrRequired Set for pltzInstrRequired
     */
    public void setPltzInstrRequired(String pltzInstrRequired) {
        this.pltzInstrRequired = pltzInstrRequired;
    }

    /**
     * Getter method for plntAndWhDeclaration.
     *
     * @return the plntAndWhDeclaration
     */
    public String getPlntAndWhDeclaration() {
        return plntAndWhDeclaration;
    }

    /**
     * Setter method for plntAndWhDeclaration.
     *
     * @param plntAndWhDeclaration Set for plntAndWhDeclaration
     */
    public void setPlntAndWhDeclaration(String plntAndWhDeclaration) {
        this.plntAndWhDeclaration = plntAndWhDeclaration;
    }
    
    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for baseAuthFlg.
     *
     * @return the baseAuthFlg
     */
    public String getBaseAuthFlg() {
        return baseAuthFlg;
    }

    /**
     * Setter method for baseAuthFlg.
     *
     * @param baseAuthFlg Set for baseAuthFlg
     */
    public void setBaseAuthFlg(String baseAuthFlg) {
        this.baseAuthFlg = baseAuthFlg;
    }

    /**
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }
    
    /**
     * Getter method for pltzInstrNo.
     *
     * @return the wkPltzInstrNo
     */
    public String getWkPltzInstrNo() {
        return wkPltzInstrNo;
    }

    /**
     * Setter method for wkPltzInstrNo.
     *
     * @param wkPltzInstrNo Set for wkPltzInstrNo
     */
    public void setWkPltzInstrNo(String wkPltzInstrNo) {
        this.wkPltzInstrNo = wkPltzInstrNo;
    }

    /**
     * Getter method for wkShipperCd.
     *
     * @return the wkShipperCd
     */
    public String getWkShipperCd() {
        return wkShipperCd;
    }

    /**
     * Setter method for wkShipperCd.
     *
     * @param wkShipperCd Set for wkShipperCd
     */
    public void setWkShipperCd(String wkShipperCd) {
        this.wkShipperCd = wkShipperCd;
    }

    /**
     * Getter method for wkCustomerCd.
     *
     * @return the wkCustomerCd
     */
    public String getWkCustomerCd() {
        return wkCustomerCd;
    }

    /**
     * Setter method for wkCustomerCd.
     *
     * @param wkCustomerCd Set for wkCustomerCd
     */
    public void setWkCustomerCd(String wkCustomerCd) {
        this.wkCustomerCd = wkCustomerCd;
    }

    /**
     * Getter method for wkLgcyShipTo.
     *
     * @return the wkLgcyShipTo
     */
    public String getWkLgcyShipTo() {
        return wkLgcyShipTo;
    }

    /**
     * Setter method for wkLgcyShipTo.
     *
     * @param wkLgcyShipTo Set for wkLgcyShipTo
     */
    public void setWkLgcyShipTo(String wkLgcyShipTo) {
        this.wkLgcyShipTo = wkLgcyShipTo;
    }

    /**
     * Getter method for wkTrnsCd.
     *
     * @return the wkTrnsCd
     */
    public String getWkTrnsCd() {
        return wkTrnsCd;
    }

    /**
     * Setter method for wkTrnsCd.
     *
     * @param wkTrnsCd Set for wkTrnsCd
     */
    public void setWkTrnsCd(String wkTrnsCd) {
        this.wkTrnsCd = wkTrnsCd;
    }

    /**
     * Getter method for wkPlntCd.
     *
     * @return the wkPlntCd
     */
    public String getWkPlntCd() {
        return wkPlntCd;
    }

    /**
     * Setter method for wkPlntCd.
     *
     * @param wkPlntCd Set for wkPlntCd
     */
    public void setWkPlntCd(String wkPlntCd) {
        this.wkPlntCd = wkPlntCd;
    }

    /**
     * Getter method for wkLgcyWhCd.
     *
     * @return the wkLgcyWhCd
     */
    public String getWkLgcyWhCd() {
        return wkLgcyWhCd;
    }

    /**
     * Setter method for wkLgcyWhCd.
     *
     * @param wkLgcyWhCd Set for wkLgcyWhCd
     */
    public void setWkLgcyWhCd(String wkLgcyWhCd) {
        this.wkLgcyWhCd = wkLgcyWhCd;
    }

    /**
     * Getter method for wkPackingWhCompCd.
     *
     * @return the wkPackingWhCompCd
     */
    public String getWkPackingWhCompCd() {
        return wkPackingWhCompCd;
    }

    /**
     * Setter method for wkPackingWhCompCd.
     *
     * @param wkPackingWhCompCd Set for wkPackingWhCompCd
     */
    public void setWkPackingWhCompCd(String wkPackingWhCompCd) {
        this.wkPackingWhCompCd = wkPackingWhCompCd;
    }

    /**
     * Getter method for wkPackingWhCd.
     *
     * @return the wkPackingWhCd
     */
    public String getWkPackingWhCd() {
        return wkPackingWhCd;
    }

    /**
     * Setter method for wkPackingWhCd.
     *
     * @param wkPackingWhCd Set for wkPackingWhCd
     */
    public void setWkPackingWhCd(String wkPackingWhCd) {
        this.wkPackingWhCd = wkPackingWhCd;
    }

    /**
     * Getter method for manualRegFlg.
     *
     * @return the manualRegFlg
     */
    public String getManualRegFlg() {
        return manualRegFlg;
    }

    /**
     * Setter method for manualRegFlg.
     *
     * @param manualRegFlg Set for manualRegFlg
     */
    public void setManualRegFlg(String manualRegFlg) {
        this.manualRegFlg = manualRegFlg;
    }

    /**
     * Getter method for palletCartonTyp.
     *
     * @return the palletCartonTyp
     */
    public String getPalletCartonTyp() {
        return palletCartonTyp;
    }

    /**
     * Setter method for palletCartonTyp.
     *
     * @param palletCartonTyp Set for palletCartonTyp
     */
    public void setPalletCartonTyp(String palletCartonTyp) {
        this.palletCartonTyp = palletCartonTyp;
    }

    /**
     * Getter method for palletCartonTypName.
     *
     * @return the palletCartonTypName
     */
    public String getPalletCartonTypName() {
        return palletCartonTypName;
    }

    /**
     * Setter method for palletCartonTypName.
     *
     * @param palletCartonTypName Set for palletCartonTypName
     */
    public void setPalletCartonTypName(String palletCartonTypName) {
        this.palletCartonTypName = palletCartonTypName;
    }
}
