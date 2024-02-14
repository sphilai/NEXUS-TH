/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain that holds the search criteria for getting of header information of form [L2003]. (in the case of single item and multi item number for the result)
 * <br/>帳票【L2003】のヘッダー情報の取得（単品）（多品番品番が結果的に単品になった場合も含む）の検索条件を保持するドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class L2003TtPltzBySingleCriteriaDomain extends AbstractDomain {

    /**
     * Serial version ID.<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * MAIN MARK.<br />
     * メインマーク
     */
    private String mainMark = null;
    
    /**
     * Time zone conversion date. (shipper standard)<br />
     * タイムゾーン変換日付（荷主基準）
     */
    private String aplyStrtDt = null;

    /**
     * Type in the functional overview of the constructor.
     *
     */
    public L2003TtPltzBySingleCriteriaDomain(){
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
     * Getter method for aplyStrtDt.
     *
     * @return the aplyStrtDt
     */
    public String getAplyStrtDt() {
        return aplyStrtDt;
    }

    /**
     * Setter method for aplyStrtDt.
     *
     * @param aplyStrtDt Set for aplyStrtDt
     */
    public void setAplyStrtDt(String aplyStrtDt) {
        this.aplyStrtDt = aplyStrtDt;
    }

}