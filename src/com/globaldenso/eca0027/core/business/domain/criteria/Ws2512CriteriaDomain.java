/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The parameter domain of ECA0027_WS_2512.
 * <br />ECA0027_WS_2512のパラメータドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
public class Ws2512CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * The COMPANY CODE between bases
     * <br />拠点間会社コード
     */
    private String compCd;
    
    /**
     * PRINTER ID
     * <br />プリンタID
     */
    private String printerId;
    
    /**
     * CML PRINT NUM
     * <br />CML印刷枚数
     * UT300 ADD
     */
    private String cmlPrintNum;
    
    /**
     * MAIN MARK (two or more affairs)  
     * <br />メインマーク(複数件)
     */
    private String mainMark;
    
    /**
     * MAIN-MARK list
     * <br />メインマークリスト
     */
    private List<String> mainMarkList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2512CriteriaDomain() {
    }

    /**
     * Getter method for CompCd.
     *
     * @return the CompCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd  Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * Getter method for printerId.
     *
     * @return the printerId
     */
    public String getPrinterId() {
        return printerId;
    }

    /**
     * Setter method for printerId.
     *
     * @param printerId  Set for printerId
     */
    public void setPrinterId(String printerId) {
        this.printerId = printerId;
    }

    /**
     * Getter method for cmlPrintNum.
     *
     * @return the cmlPrintNum
     */
    public String getCmlPrintNum() {
        return cmlPrintNum;
    }

    /**
     * Setter method for cmlPrintNum.
     *
     * @param cmlPrintNum Set for cmlPrintNum
     */
    public void setCmlPrintNum(String cmlPrintNum) {
        this.cmlPrintNum = cmlPrintNum;
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark  Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for MainMarkList.
     *
     * @return the MainMarkList
     */
    public List<String> getMainMarkList() {
        return mainMarkList;
    }

    /**
     * Setter method for mainMarkList.
     *
     * @param mainMarkList  Set for mainMarkList
     */
    public void setMainMarkList(List<String> mainMarkList) {
        this.mainMarkList = mainMarkList;
    }



}
