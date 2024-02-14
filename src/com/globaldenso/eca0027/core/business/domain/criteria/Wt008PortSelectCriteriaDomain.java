/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The BL layer domain class that holds the criteria information of Port Search
 * Sub Screen. <br/>港選択子画面の検索条件を保持するBL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt008PortSelectCriteriaDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * PORT NAME/港名
     */
    private String portNm;

    /**
     * COUNTRY CODE/国コード
     */
    private String cntryCd;

    /**
     * Default constructor.
     */
    public Wt008PortSelectCriteriaDomain() {
    }

    /**
     * <p>
     * Getter method for portNm.
     * </p>
     * 
     * @return the portNm
     */
    public String getPortNm() {
        return portNm;
    }

    /**
     * <p>
     * Setter method for portNm.
     * </p>
     * 
     * @param portNm Set for portNm
     */
    public void setPortNm(String portNm) {
        this.portNm = portNm;
    }

    /**
     * <p>
     * Getter method for cntryCd.
     * </p>
     * 
     * @return the cntryCd
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * <p>
     * Setter method for cntryCd.
     * </p>
     * 
     * @param cntryCd Set for cntryCd
     */
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

}
