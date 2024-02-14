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
 * The XML ROOT parameter domain of ECA0027_WS_2502.
 * <br />ECA0027_WS_2502のXML ROOTパラメータドメインです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2502Criteria")
public class Ws2502XmlRootCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * PALLETIZE INSTRUCTION NO
     * <br />梱包指示NO
     */
    private String pltzInstrNo;
    
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
    private List<? extends Ws2502ItemNoCriteriaDomain> itemNoCriteriaList;

    
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
    private List<? extends Ws2502PkgItemNoCriteriaDomain> pkgItemNoCriteriaList;
    
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
    private List<? extends Ws2502ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2502XmlRootCriteriaDomain() {
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
    public List<? extends Ws2502ItemNoCriteriaDomain> getItemNoCriteriaList() {
        return itemNoCriteriaList;
    }

    /**
     * Setter method for itemNoCriteriaList.
     *
     * @param itemNoCriteriaList Set for itemNoCriteriaList
     */
    public void setItemNoCriteriaList(
        List<? extends Ws2502ItemNoCriteriaDomain> itemNoCriteriaList) {
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
    public List<? extends Ws2502PkgItemNoCriteriaDomain> getPkgItemNoCriteriaList() {
        return pkgItemNoCriteriaList;
    }

    /**
     * Setter method for pkgItemNoCriteriaList.
     *
     * @param pkgItemNoCriteriaList Set for pkgItemNoCriteriaList
     */
    public void setPkgItemNoCriteriaList(
        List<? extends Ws2502PkgItemNoCriteriaDomain> pkgItemNoCriteriaList) {
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
    public List<? extends Ws2502ProductivityDataInfoCriteriaDomain> getProductivityDataInfoCriteriaList() {
        return productivityDataInfoCriteriaList;
    }

    /**
     * Setter method for productivityDataInfoCriteriaList.
     *
     * @param productivityDataInfoCriteriaList Set for productivityDataInfoCriteriaList
     */
    public void setProductivityDataInfoCriteriaList(
        List<? extends Ws2502ProductivityDataInfoCriteriaDomain> productivityDataInfoCriteriaList) {
        this.productivityDataInfoCriteriaList = productivityDataInfoCriteriaList;
    }
}
