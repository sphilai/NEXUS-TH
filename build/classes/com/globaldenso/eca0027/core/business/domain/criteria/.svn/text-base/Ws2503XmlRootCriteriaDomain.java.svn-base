/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The XML ROOT parameter domain of ECA0027_WS_2503.
 * <br />ECA0027_WS_2503のXML ROOTパラメータドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2503Criteria")
public class Ws2503XmlRootCriteriaDomain extends AbstractDomain {

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
     * NEXUS WAREHOUSE FLG
     * <br />NEXUS倉庫フラグ
     */
    private String nexusWhFlg;
    
    /**
     * PALLET NO
     * <br />パレットNO
     */
    private String palletNo;
    
    /**
     * ITEM NO LIST
     * <br />品目番号リスト
     */
    @XmlElementWrapper(name = "itemNos")
    @XmlElement(name = "itemNo")
    private List<? extends Ws2503ItemNoCriteriaDomain> itemNoCriteriaList;
    
    /**
     * OUTER CODE
     * <br />外装記号
     */
    private String outerCd;
    
    /**
     * OUTER CODE FLG
     * <br />外装記号フラグ
     */
    private String outerCdFlg;
    
    /**
     * PACKAGE ITEM NO LIST
     * <br />包装材品目番号リスト
     */
    @XmlElementWrapper(name = "pkgItemNos")
    @XmlElement(name = "pkgItemNo")
    private List<? extends Ws2503PkgItemNoCriteriaDomain> pkgItemNoCriteriaList;
    
    /**
     * WORK START TIME
     * <br />作業開始時間
     */
    private String workTimeStrt;
    
    /**
     * WORK END TIME
     * <br />作業終了時間
     */
    private String workTimeEnd;
    
    /**
     * PRODUCTIVITY DATA INFOMATION LIST
     * <br />生産性データ情報リスト
     */
    @XmlElementWrapper(name = "productivityDataInfos")
    @XmlElement(name = "productivityDataInfo")
    private List<? extends Ws2503ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2503XmlRootCriteriaDomain() {
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
     * Getter method for nexusWhFlg.
     *
     * @return the nexusWhFlg
     */
    public String getNexusWhFlg() {
        return nexusWhFlg;
    }

    /**
     * Setter method for nexusWhFlg.
     *
     * @param nexusWhFlg Set for nexusWhFlg
     */
    public void setNexusWhFlg(String nexusWhFlg) {
        this.nexusWhFlg = nexusWhFlg;
    }

    /**
     * Getter method for palletNo.
     *
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * Setter method for palletNo.
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * Getter method for itemNoCriteriaList.
     *
     * @return the itemNoCriteriaList
     */
    public List<? extends Ws2503ItemNoCriteriaDomain> getItemNoCriteriaList() {
        return itemNoCriteriaList;
    }

    /**
     * Setter method for itemNoCriteriaList.
     *
     * @param itemNoCriteriaList Set for itemNoCriteriaList
     */
    public void setItemNoCriteriaList(
        List<? extends Ws2503ItemNoCriteriaDomain> itemNoCriteriaList) {
        this.itemNoCriteriaList = itemNoCriteriaList;
    }

    /**
     * Getter method for outerCd.
     *
     * @return the outerCd
     */
    public String getOuterCd() {
        return outerCd;
    }

    /**
     * Setter method for outerCd.
     *
     * @param outerCd Set for outerCd
     */
    public void setOuterCd(String outerCd) {
        this.outerCd = outerCd;
    }

    /**
     * Getter method for outerCdFlg.
     *
     * @return the outerCdFlg
     */
    public String getOuterCdFlg() {
        return outerCdFlg;
    }

    /**
     * Setter method for outerCdFlg.
     *
     * @param outerCdFlg Set for outerCdFlg
     */
    public void setOuterCdFlg(String outerCdFlg) {
        this.outerCdFlg = outerCdFlg;
    }

    /**
     * Getter method for pkgItemNoCriteriaList.
     *
     * @return the pkgItemNoCriteriaList
     */
    public List<? extends Ws2503PkgItemNoCriteriaDomain> getPkgItemNoCriteriaList() {
        return pkgItemNoCriteriaList;
    }

    /**
     * Setter method for pkgItemNoCriteriaList.
     *
     * @param pkgItemNoCriteriaList Set for pkgItemNoCriteriaList
     */
    public void setPkgItemNoCriteriaList(
        List<? extends Ws2503PkgItemNoCriteriaDomain> pkgItemNoCriteriaList) {
        this.pkgItemNoCriteriaList = pkgItemNoCriteriaList;
    }

    /**
     * Getter method for workTimeStrt.
     *
     * @return the workTimeStrt
     */
    public String getWorkTimeStrt() {
        return workTimeStrt;
    }

    /**
     * Setter method for workTimeStrt.
     *
     * @param workTimeStrt Set for workTimeStrt
     */
    public void setWorkTimeStrt(String workTimeStrt) {
        this.workTimeStrt = workTimeStrt;
    }

    /**
     * Getter method for workTimeEnd.
     *
     * @return the workTimeEnd
     */
    public String getWorkTimeEnd() {
        return workTimeEnd;
    }

    /**
     * Setter method for workTimeEnd.
     *
     * @param workTimeEnd Set for workTimeEnd
     */
    public void setWorkTimeEnd(String workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }

    /**
     * Getter method for productivityDataInfoCriteriaList.
     *
     * @return the productivityDataInfoCriteriaList
     */
    public List<? extends Ws2503ProductivityDataInfoCriteriaDomain> getProductivityDataInfoCriteriaList() {
        return productivityDataInfoCriteriaList;
    }

    /**
     * Setter method for productivityDataInfoCriteriaList.
     *
     * @param productivityDataInfoCriteriaList Set for productivityDataInfoCriteriaList
     */
    public void setProductivityDataInfoCriteriaList(
        List<? extends Ws2503ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList) {
        this.productivityDataInfoCriteriaList = productivityDataInfoCriteriaList;
    }
}
