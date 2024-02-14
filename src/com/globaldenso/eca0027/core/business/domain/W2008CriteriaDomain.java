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
 * The domain class that holds the criteria information of Multiple Item No. in 1Box PKG Register Screen
 * <br />小箱内多品Register画面の検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7966 $
 */
public class W2008CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Changing agency screen
     * <br />遷移元画面
     */
    private String callScreenId;
    
    /**
     * MIX TAG NO
     * <br />MIXタグNO
     */
    private String mixTagNo;
    
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
     * WAREHOUSE COMPANY CODE
     * <br />倉庫会社コード
     */
    private String whCompCd;
    
    /**
     * WAREHOUSE CODE
     * <br />倉庫コード
     */
    private String whCd;
    
    /**
     * MULTI ITEM NO IN BOX STATUS
     * <br />小箱内多品ステータス
     */
    private String mixTagStatus;
    
    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
    /**
     * NET WEIGHT
     * <br />ネット重量
     */
    private String netWeight;
    
    /**
     * GROSS WEIGHT
     * <br />グロス重量
     */
    private String grossWeight;
    
    /**
     * NET WEIGHT overflow flag
     * <br />ネット重量桁あふれフラグ
     */
    private boolean netWeightOverflow;
    
    /**
     * GROSS WEIGHT overflow flag
     * <br />グロス重量桁あふれフラグ
     */
    private boolean grossWeightOverflow;
    
    /**
     * WEIGHT UNIT
     * <br />重量単位
     */
    private String weightUnit;
    
    /**
     * WEIGHT-UNIT notation
     * <br />重量単位表記
     */
    private String weightUnitDisp;
    
    /**
     * CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;
    
    /**
     * LOADING CODE
     * <br />荷積位置コード
     */
    private String loadingCd;
    
    /**
     * INVOICE KEY
     * <br />インボイスキー
     */
    private String invoiceKey;
    
    /**
     * CUSTOM TIMING TYPE
     * <br />通関タイミング区分
     */
    private String customTimingTyp;
    
    /**
     * SHIPPER CODE
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * CONTAINER LOOSE TYPE
     * <br />コンテナルーズ区分
     */
    private String containerLooseTyp;
    
    /**
     * BOX NO
     * <br />箱番号
     */
    private String boxNo;
    
    /**
     * PKG I/P
     * <br />MIXED用RT材有無
     */
    private String pkgIp;
    
    /**
     * IGNORE WARNINGS
     * <br />ワーニング無視
     */
    private String ignoreWarnings;
    
    /**
     * Date format (for document outputs)  
     * <br />日付フォーマット (帳票出力用)
     */
    private String reportDateFormat;
    
    /**
     * User functional utilization right
     * <br />ユーザ機能利用権限
     */
    private List<? extends UserAuthDomain> userAuthList;
    
    /**
     * SERVER ID
     * <br />サーバID
     */
    private String serverId;
    
    /**
     * Login user name
     * <br />ログインユーザ名
     */
    private String loginUserNm;
    
    /**
     * Base VALUE of authority (with no 2:RALL, 1:BALL, and 0:ALL authority)  
     * <br />権限のベース値(2:RALL、1:BALL、0:ALL権限なし)
     */
    private String baseAuthFlg;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2008CriteriaDomain() {
    }

    /**
     * Getter method for callScreenId.
     *
     * @return the callScreenId
     */
    public String getCallScreenId() {
        return callScreenId;
    }

    /**
     * Setter method for callScreenId.
     *
     * @param callScreenId Set for callScreenId
     */
    public void setCallScreenId(String callScreenId) {
        this.callScreenId = callScreenId;
    }

    /**
     * Getter method for mixTagNo.
     *
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * Setter method for mixTagNo.
     *
     * @param mixTagNo Set for mixTagNo
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
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
     * Getter method for whCompCd.
     *
     * @return the whCompCd
     */
    public String getWhCompCd() {
        return whCompCd;
    }

    /**
     * Setter method for whCompCd.
     *
     * @param whCompCd Set for whCompCd
     */
    public void setWhCompCd(String whCompCd) {
        this.whCompCd = whCompCd;
    }

    /**
     * Getter method for whCd.
     *
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * Setter method for whCd.
     *
     * @param whCd Set for whCd
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * Getter method for mixTagStatus.
     *
     * @return the mixTagStatus
     */
    public String getMixTagStatus() {
        return mixTagStatus;
    }

    /**
     * Setter method for mixTagStatus.
     *
     * @param mixTagStatus Set for mixTagStatus
     */
    public void setMixTagStatus(String mixTagStatus) {
        this.mixTagStatus = mixTagStatus;
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
     * Getter method for netWeight.
     *
     * @return the netWeight
     */
    public String getNetWeight() {
        return netWeight;
    }

    /**
     * Setter method for netWeight.
     *
     * @param netWeight Set for netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /**
     * Getter method for grossWeight.
     *
     * @return the grossWeight
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /**
     * Setter method for grossWeight.
     *
     * @param grossWeight Set for grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
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
     * Getter method for weightUnitDisp.
     *
     * @return the weightUnitDisp
     */
    public String getWeightUnitDisp() {
        return weightUnitDisp;
    }

    /**
     * Setter method for weightUnitDisp.
     *
     * @param weightUnitDisp Set for weightUnitDisp
     */
    public void setWeightUnitDisp(String weightUnitDisp) {
        this.weightUnitDisp = weightUnitDisp;
    }

    /**
     * Getter method for containerSortingKey.
     *
     * @return the containerSortingKey
     */
    public String getContainerSortingKey() {
        return containerSortingKey;
    }

    /**
     * Setter method for containerSortingKey.
     *
     * @param containerSortingKey Set for containerSortingKey
     */
    public void setContainerSortingKey(String containerSortingKey) {
        this.containerSortingKey = containerSortingKey;
    }

    /**
     * Getter method for loadingCd.
     *
     * @return the loadingCd
     */
    public String getLoadingCd() {
        return loadingCd;
    }

    /**
     * Setter method for loadingCd.
     *
     * @param loadingCd Set for loadingCd
     */
    public void setLoadingCd(String loadingCd) {
        this.loadingCd = loadingCd;
    }

    /**
     * Getter method for invoiceKey.
     *
     * @return the invoiceKey
     */
    public String getInvoiceKey() {
        return invoiceKey;
    }

    /**
     * Setter method for invoiceKey.
     *
     * @param invoiceKey Set for invoiceKey
     */
    public void setInvoiceKey(String invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    /**
     * Getter method for customTimingTyp.
     *
     * @return the customTimingTyp
     */
    public String getCustomTimingTyp() {
        return customTimingTyp;
    }

    /**
     * Setter method for customTimingTyp.
     *
     * @param customTimingTyp Set for customTimingTyp
     */
    public void setCustomTimingTyp(String customTimingTyp) {
        this.customTimingTyp = customTimingTyp;
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
     * Getter method for containerLooseTyp.
     *
     * @return the containerLooseTyp
     */
    public String getContainerLooseTyp() {
        return containerLooseTyp;
    }

    /**
     * Setter method for containerLooseTyp.
     *
     * @param containerLooseTyp Set for containerLooseTyp
     */
    public void setContainerLooseTyp(String containerLooseTyp) {
        this.containerLooseTyp = containerLooseTyp;
    }

    /**
     * Getter method for boxNo.
     *
     * @return the boxNo
     */
    public String getBoxNo() {
        return boxNo;
    }

    /**
     * Setter method for boxNo.
     *
     * @param boxNo Set for boxNo
     */
    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo;
    }

    /**
     * Getter method for pkgIp.
     *
     * @return the pkgIp
     */
    public String getPkgIp() {
        return pkgIp;
    }

    /**
     * Setter method for pkgIp.
     *
     * @param pkgIp Set for pkgIp
     */
    public void setPkgIp(String pkgIp) {
        this.pkgIp = pkgIp;
    }

    /**
     * Getter method for ignoreWarnings.
     *
     * @return the ignoreWarnings
     */
    public String getIgnoreWarnings() {
        return ignoreWarnings;
    }

    /**
     * Setter method for ignoreWarnings.
     *
     * @param ignoreWarnings Set for ignoreWarnings
     */
    public void setIgnoreWarnings(String ignoreWarnings) {
        this.ignoreWarnings = ignoreWarnings;
    }

    /**
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
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
     * Getter method for loginUserNm.
     *
     * @return the loginUserNm
     */
    public String getLoginUserNm() {
        return loginUserNm;
    }

    /**
     * Setter method for loginUserNm.
     *
     * @param loginUserNm Set for loginUserNm
     */
    public void setLoginUserNm(String loginUserNm) {
        this.loginUserNm = loginUserNm;
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
     * Getter method for netWeightOverflow.
     *
     * @return the netWeightOverflow
     */
    public boolean isNetWeightOverflow() {
        return netWeightOverflow;
    }

    /**
     * Setter method for netWeightOverflow.
     *
     * @param netWeightOverflow Set for netWeightOverflow
     */
    public void setNetWeightOverflow(boolean netWeightOverflow) {
        this.netWeightOverflow = netWeightOverflow;
    }

    /**
     * Getter method for grossWeightOverflow.
     *
     * @return the grossWeightOverflow
     */
    public boolean isGrossWeightOverflow() {
        return grossWeightOverflow;
    }

    /**
     * Setter method for grossWeightOverflow.
     *
     * @param grossWeightOverflow Set for grossWeightOverflow
     */
    public void setGrossWeightOverflow(boolean grossWeightOverflow) {
        this.grossWeightOverflow = grossWeightOverflow;
    }
    
}
