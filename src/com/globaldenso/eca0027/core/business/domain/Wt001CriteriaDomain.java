/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.util.PageInfoCreator;

/**
 * The PLlayer domain class that holds the criteria information of Company
 * Search Sub Screen. <br/>会社選択子画面の検索条件を保持するPL層用ドメインクラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt001CriteriaDomain extends AbstractDomain {

    /**
     * SERIAL VERSION ID/シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * COMPANY CODE/会社コード
     */
    private String compCd;

    /**
     * COMPANY NAME/会社名称
     */
    private String compNm;

    /**
     * COMPANY NAME ABBREVIATION/会社略称
     */
    private String compNmAbb;

    /**
     * SHIPPER FLAG/荷主フラグ Y:Can specify the shipper, N:Not
     */
    private String shipperFlg;

    /**
     * CUSTOMS BROKER FLAG/通関代理店フラグ Y:Can specify the Customs Agent, N:Not
     */
    private String customsBrokerFlg;

    /**
     * CARRIER COMPANY FLAG/運送会社フラグ Y:Can specify the Carrier, N:Not
     */
    private String carrierCompFlg;

    /**
     * PageInfoCreator object.
     */
    private transient PageInfoCreator pageInfoCreator;

    /**
     * Default constructor.
     */
    public Wt001CriteriaDomain() {
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
     * Getter method for compNm.
     * </p>
     * 
     * @return the compNm
     */
    public String getCompNm() {
        return compNm;
    }

    /**
     * <p>
     * Setter method for compNm.
     * </p>
     * 
     * @param compNm Set for compNm
     */
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    /**
     * <p>
     * Getter method for compNmAbb.
     * </p>
     * 
     * @return the compNmAbb
     */
    public String getCompNmAbb() {
        return compNmAbb;
    }

    /**
     * <p>
     * Setter method for compNmAbb.
     * </p>
     * 
     * @param compNmAbb Set for compNmAbb
     */
    public void setCompNmAbb(String compNmAbb) {
        this.compNmAbb = compNmAbb;
    }

    /**
     * <p>
     * Getter method for shipperFlg.
     * </p>
     * 
     * @return the shipperFlg
     */
    public String getShipperFlg() {
        return shipperFlg;
    }

    /**
     * <p>
     * Setter method for shipperFlg.
     * </p>
     * 
     * @param shipperFlg Set for shipperFlg
     */
    public void setShipperFlg(String shipperFlg) {
        this.shipperFlg = shipperFlg;
    }

    /**
     * <p>
     * Getter method for customsBrokerFlg.
     * </p>
     * 
     * @return the customsBrokerFlg
     */
    public String getCustomsBrokerFlg() {
        return customsBrokerFlg;
    }

    /**
     * <p>
     * Setter method for customsBrokerFlg.
     * </p>
     * 
     * @param customsBrokerFlg Set for customsBrokerFlg
     */
    public void setCustomsBrokerFlg(String customsBrokerFlg) {
        this.customsBrokerFlg = customsBrokerFlg;
    }

    /**
     * <p>
     * Getter method for carrierCompFlg.
     * </p>
     * 
     * @return the carrierCompFlg
     */
    public String getCarrierCompFlg() {
        return carrierCompFlg;
    }

    /**
     * <p>
     * Setter method for carrierCompFlg.
     * </p>
     * 
     * @param carrierCompFlg Set for carrierCompFlg
     */
    public void setCarrierCompFlg(String carrierCompFlg) {
        this.carrierCompFlg = carrierCompFlg;
    }

    /**
     * <p>Getter method for pageInfoCreator.</p>
     *
     * @return the pageInfoCreator
     */
    public PageInfoCreator getPageInfoCreator() {
        return pageInfoCreator;
    }

    /**
     * <p>Setter method for pageInfoCreator.</p>
     *
     * @param pageInfoCreator Set for pageInfoCreator
     */
    public void setPageInfoCreator(PageInfoCreator pageInfoCreator) {
        this.pageInfoCreator = pageInfoCreator;
    }

}