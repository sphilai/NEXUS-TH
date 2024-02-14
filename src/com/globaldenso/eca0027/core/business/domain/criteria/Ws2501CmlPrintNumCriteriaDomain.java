/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The Criteria domain for acquiring the result of SearchCmlPrintNum.
 * <br />SearchCmlPrintNumの結果を取得するためのCriteriaドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501CmlPrintNumCriteriaDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * MAIN_MARK 
     */
    private String  mainMark;
    

    /**
     * CML_PRINT_NUM 
     */
    private String cmlPrintNum;


    
    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501CmlPrintNumCriteriaDomain() {
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
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
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


}
