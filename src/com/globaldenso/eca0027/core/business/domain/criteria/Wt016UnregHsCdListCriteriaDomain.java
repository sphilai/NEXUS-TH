/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The BL layer domain class that holds the criteria information of Unregistered
 * HS CODE List Sub Screen. <br/>HS CODE登録なし品番表示子画面一覧部の検索条件を保持するBL層用のドメインクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt016UnregHsCdListCriteriaDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * SHIPPER CODE/荷主コード
     */
    private String shipperCd;

    /**
     * GRP NO 1/グループNO1 Main+FullRTのインボイスのまとまりで１つのNOが付与される。
     */
    private String grpNo1;

    /**
     * GRP NO 2/グループNO2 FullRTのインボイスに連番が付与される。Mainのインボイスは常に0。
     */
    private String grpNo2;

    /**
     * Default constructor.
     */
    public Wt016UnregHsCdListCriteriaDomain() {
    }

    /**
     * <p>
     * Getter method for shipperCd.
     * </p>
     * 
     * @return the shipperCd
     */
    public String getShipperCd() {
        return shipperCd;
    }

    /**
     * <p>
     * Setter method for shipperCd.
     * </p>
     * 
     * @param shipperCd Set for shipperCd
     */
    public void setShipperCd(String shipperCd) {
        this.shipperCd = shipperCd;
    }

    /**
     * <p>
     * Getter method for grpNo1.
     * </p>
     * 
     * @return the grpNo1
     */
    public String getGrpNo1() {
        return grpNo1;
    }

    /**
     * <p>
     * Setter method for grpNo1.
     * </p>
     * 
     * @param grpNo1 Set for grpNo1
     */
    public void setGrpNo1(String grpNo1) {
        this.grpNo1 = grpNo1;
    }

    /**
     * <p>
     * Getter method for grpNo2.
     * </p>
     * 
     * @return the grpNo2
     */
    public String getGrpNo2() {
        return grpNo2;
    }

    /**
     * <p>
     * Setter method for grpNo2.
     * </p>
     * 
     * @param grpNo2 Set for grpNo2
     */
    public void setGrpNo2(String grpNo2) {
        this.grpNo2 = grpNo2;
    }

}