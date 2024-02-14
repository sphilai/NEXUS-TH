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

/**
 * The parameter domain of ECA0027_WS_R001.
 * <br />ECA0027_WS_R001のパラメータドメインです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 9591 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wsR001Criteria")
public class WsR001MigrationCaseMarkRootCriteriaDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * SHIPPER_CD
     * <br />荷主コード
     */
    private String shipperCd;
    
    /**
     * RERUN_FLG
     * <br />リランフラグ
     */
    private String rerunFlg;
    
    /**
     * CASE MARK ITEM LIST
     * <br />ケースマークヘッダリスト
     */
    @XmlElementWrapper(name = "migrationCaseMarkItemList")
    @XmlElement(name = "migrationCaseMarkItem")
    private List<? extends WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsR001MigrationCaseMarkRootCriteriaDomain() {
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
     * Getter method for rerunFlg.
     *
     * @return the rerunFlg
     */
    public String getRerunFlg() {
        return rerunFlg;
    }

    /**
     * Setter method for rerunFlg.
     *
     * @param rerunFlg Set for rerunFlg
     */
    public void setRerunFlg(String rerunFlg) {
        this.rerunFlg = rerunFlg;
    }

    /**
     * Getter method for migrationCaseMarkItemList.
     *
     * @return the migrationCaseMarkItemList
     */
    public List<? extends WsR001migrationCaseMarkItemCriteriaDomain> getMigrationCaseMarkItemList() {
        return migrationCaseMarkItemList;
    }

    /**
     * Setter method for migrationCaseMarkItemList.
     *
     * @param migrationCaseMarkItemList Set for migrationCaseMarkItemList
     */
    public void setMigrationCaseMarkItemList(
        List<? extends WsR001migrationCaseMarkItemCriteriaDomain> migrationCaseMarkItemList) {
        this.migrationCaseMarkItemList = migrationCaseMarkItemList;
    }
    

}
