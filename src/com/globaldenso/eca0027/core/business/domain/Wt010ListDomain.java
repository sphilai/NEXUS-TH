/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The PL layer domain class that holds the detail information of Warehouse Search Sub
 * Screen List section. <br />
 * 倉庫選択子画面一覧部の明細情報を保持するPL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt010ListDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMPANY CODE/会社コード
     */
    private String compCd;

    /**
     * WAREHOUSE CODE/NEXUS倉庫コード
     */
    private String whCd;

    /**
     * WAREHOUSE NAME/倉庫名称
     */
    private String whNm;

    /**
     * Default constructor.
     */
    public Wt010ListDomain() {
    }

    /**
     * <p>
     * Getter method for compCd.
     * </p>
     * 
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * <p>
     * Setter method for compCd.
     * </p>
     * 
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * <p>
     * Getter method for whCd.
     * </p>
     * 
     * @return the whCd
     */
    public String getWhCd() {
        return whCd;
    }

    /**
     * <p>
     * Setter method for whCd.
     * </p>
     * 
     * @param whCd Set for whCd
     */
    public void setWhCd(String whCd) {
        this.whCd = whCd;
    }

    /**
     * <p>
     * Getter method for whNm.
     * </p>
     * 
     * @return the whNm
     */
    public String getWhNm() {
        return whNm;
    }

    /**
     * <p>
     * Setter method for whNm.
     * </p>
     * 
     * @param whNm Set for whNm
     */
    public void setWhNm(String whNm) {
        this.whNm = whNm;
    }

}