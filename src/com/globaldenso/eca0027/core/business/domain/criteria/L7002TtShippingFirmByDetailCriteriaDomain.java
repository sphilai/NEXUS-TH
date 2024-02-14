/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import java.util.List;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the form of information search [L7002].
 * <br/>帳票【L7002】の情報を取得するための検索条件を保持するドメインクラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10993 $
 */
public class L7002TtShippingFirmByDetailCriteriaDomain extends AbstractDomain {
    
    
    /**
     * Serial version.<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * shipping_firm_no
     */
    private String firmNo = null;
    
    /**
     * SHIPPING_FIRM_NO
     */
    private List<String> firmNoList = null;
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public L7002TtShippingFirmByDetailCriteriaDomain() {
    }
    
    /**
     * Getter method for firmNo.
     *
     * @return the firmNo
     */
    public String getFirmNo() {
        return firmNo;
    }

    /**
     * Setter method for firmNo.
     *
     * @param firmNo Set for firmNo
     */
    public void setFirmNo(String firmNo) {
        this.firmNo = firmNo;
    }
    
    /**
     * Getter method for firmNoList.
     *
     * @return the firmNoList
     */
    public List<String> getFirmNoList() {
        return firmNoList;
    }

    /**
     * Setter method for firmNoList.
     *
     * @param firmNoList Set for firmNoList
     */
    public void setFirmNoList(List<String> firmNoList) {
        this.firmNoList = firmNoList;
    }

}
