/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a parameter domain of ECA0027_WS_2510.
 * <br />ECA0027_WS_2510のパラメータドメインです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 9074 $
 */
public class Ws2510CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * PALLET NO
     * <br />パレットNO
     */
    private String palletNo;
    
    /**
     * CONTAINER SORTING KEY
     * <br />コンテナ層別キー
     */
    private String containerSortingKey;
    
    /**
     * TRANSPORT CODE
     * <br />輸送手段コード
     */
    private String trnsCd;
    
    /**
     * SHIP TO COMPANY CODE
     * <br />送荷先会社コード
     */
    private String shipToCompCd;
    
    /**
     *CUR WAREHOUSE COMPANY CODE
     * <br />現在倉庫会社コード
     */
    private String curWhCompCd;
    
    /**
     * CUR WAREHOUSE CODE
     * <br />現在倉庫コード
     */
    private String curWhCd;
    
    /**
     * LOADING CODE
     * <br />荷積位置コード
     */
    private String loadingCd;
    
    /**
     * CUSTOM TIMING TYPE
     * <br />通関タイミング区分
     */
    private String customTimingTyp;
    
    /**
     * MAIN MARK LIST
     * <br />メインマークリスト
     */
    private List<String> mainMarkList;
    
    /**
     * OUTER PACKAGE COM CODE
     * <br />外装会社コード
     */
    private String outerPkgComCd;
    
    /**
     * OUTER PACKAGE CODE
     * <br />外装コード
     */
    private String outerPkgCd;
    
    /**
     * DENGER ITEM FLAG
     * <br />危険品フラグ
     */
    private String dngrItemFlg;
    
    /**
     * WEIGHT MAP
     * <br />重量MAP
     */
    private Map<String, BigDecimal> weightMap;
    
    /**
     * VOLUME MAP
     * <br />容積MAP
     */
    private Map<String, BigDecimal> volumeMap;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2510CriteriaDomain() {
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
     * Getter method for shipToCompCd.
     *
     * @return the shipToCompCd
     */
    public String getShipToCompCd() {
        return shipToCompCd;
    }

    /**
     * Setter method for shipToCompCd.
     *
     * @param shipToCompCd Set for shipToCompCd
     */
    public void setShipToCompCd(String shipToCompCd) {
        this.shipToCompCd = shipToCompCd;
    }

    /**
     * Getter method for curWhCompCd.
     *
     * @return the curWhCompCd
     */
    public String getCurWhCompCd() {
        return curWhCompCd;
    }

    /**
     * Setter method for curWhCompCd.
     *
     * @param curWhCompCd Set for curWhCompCd
     */
    public void setCurWhCompCd(String curWhCompCd) {
        this.curWhCompCd = curWhCompCd;
    }

    /**
     * Getter method for curWhCd.
     *
     * @return the curWhCd
     */
    public String getCurWhCd() {
        return curWhCd;
    }

    /**
     * Setter method for curWhCd.
     *
     * @param curWhCd Set for curWhCd
     */
    public void setCurWhCd(String curWhCd) {
        this.curWhCd = curWhCd;
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
     * Getter method for mainMarkList.
     *
     * @return the mainMarkList
     */
    public List<String> getMainMarkList() {
        return mainMarkList;
    }

    /**
     * Setter method for mainMarkList.
     *
     * @param mainMarkList Set for mainMarkList
     */
    public void setMainMarkList(List<String> mainMarkList) {
        this.mainMarkList = mainMarkList;
    }

    /**
     * Getter method for outerPkgComCd.
     *
     * @return the outerPkgComCd
     */
    public String getOuterPkgComCd() {
        return outerPkgComCd;
    }

    /**
     * Setter method for outerPkgComCd.
     *
     * @param outerPkgComCd Set for outerPkgComCd
     */
    public void setOuterPkgComCd(String outerPkgComCd) {
        this.outerPkgComCd = outerPkgComCd;
    }

    /**
     * Getter method for outerPkgCd.
     *
     * @return the outerPkgCd
     */
    public String getOuterPkgCd() {
        return outerPkgCd;
    }

    /**
     * Setter method for outerPkgCd.
     *
     * @param outerPkgCd Set for outerPkgCd
     */
    public void setOuterPkgCd(String outerPkgCd) {
        this.outerPkgCd = outerPkgCd;
    }

    /**
     * Getter method for dngrItemFlg.
     *
     * @return the dngrItemFlg
     */
    public String getDngrItemFlg() {
        return dngrItemFlg;
    }

    /**
     * Setter method for dngrItemFlg.
     *
     * @param dngrItemFlg Set for dngrItemFlg
     */
    public void setDngrItemFlg(String dngrItemFlg) {
        this.dngrItemFlg = dngrItemFlg;
    }

    /**
     * Getter method for weightMap.
     *
     * @return the weightMap
     */
    public Map<String, BigDecimal> getWeightMap() {
        return weightMap;
    }

    /**
     * Setter method for weightMap.
     *
     * @param weightMap Set for weightMap
     */
    public void setWeightMap(Map<String, BigDecimal> weightMap) {
        this.weightMap = weightMap;
    }

    /**
     * Getter method for volumeMap.
     *
     * @return the volumeMap
     */
    public Map<String, BigDecimal> getVolumeMap() {
        return volumeMap;
    }

    /**
     * Setter method for volumeMap.
     *
     * @param volumeMap Set for volumeMap
     */
    public void setVolumeMap(Map<String, BigDecimal> volumeMap) {
        this.volumeMap = volumeMap;
    }
}
