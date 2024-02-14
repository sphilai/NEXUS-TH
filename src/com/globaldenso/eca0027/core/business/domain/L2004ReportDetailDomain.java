/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of form [L2004] that output for domain form (specification).
 * <br/>帳票【L2004】の帳票出力用ドメイン（明細）です。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L2004ReportDetailDomain extends AbstractDomain {
    
    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Shipper1
     */
    private String shipper1 = null;
    
    /**
     * Shipper2
     */
    private String shipper2 = null;
    
    /**
     * Shipper3
     */
    private String shipper3 = null;
    
    /**
     * Shipper4
     */
    private String shipper4 = null;
    
    /**
     * CML No.1
     */
    private String cmlNo1 = null;
    
    /**
     * CML No.2
     */
    private String cmlNo2 = null;
    
    /**
     * CML No.3
     */
    private String cmlNo3 = null;
    
    /**
     * CML No.4
     */
    private String cmlNo4 = null;
    
    /**
     * Default Constructor
     */
    public L2004ReportDetailDomain() {
    }
    
    /**
     * Getter method for shipper1.
     *
     * @return the shipper1
     */
    public String getShipper1() {
        return shipper1;
    }
    /**
     * Setter method for shipper1.
     *
     * @param shipper1 Set for shipper1.
     */
    public void setShipper1(String shipper1) {
        this.shipper1 = shipper1;
    }
    /**
     * Getter method for shipper2.
     *
     * @return the shipper2
     */
    public String getShipper2() {
        return shipper2;
    }
    /**
     * Setter method for shipper2.
     *
     * @param shipper2 Set for shipper2.
     */
    public void setShipper2(String shipper2) {
        this.shipper2 = shipper2;
    }
    /**
     * Getter method for shipper3.
     *
     * @return the shipper3
     */
    public String getShipper3() {
        return shipper3;
    }
    /**
     * Setter method for shipper3.
     *
     * @param shipper3 Set for shipper3.
     */
    public void setShipper3(String shipper3) {
        this.shipper3 = shipper3;
    }
    /**
     * Getter method for shipper4.
     *
     * @return the shipper4
     */
    public String getShipper4() {
        return shipper4;
    }
    /**
     * Setter method for shipper4.
     *
     * @param shipper4 Set for shipper4.
     */
    public void setShipper4(String shipper4) {
        this.shipper4 = shipper4;
    }
    /**
     * Getter method for cmlNo1.
     *
     * @return the cmlNo1
     */
    public String getCmlNo1() {
        return cmlNo1;
    }
    /**
     * Setter method for cmlNo1.
     *
     * @param cmlNo1 Set for cmlNo1.
     */
    public void setCmlNo1(String cmlNo1) {
        this.cmlNo1 = cmlNo1;
    }
    /**
     * Getter method for cmlNo2.
     *
     * @return the cmlNo2
     */
    public String getCmlNo2() {
        return cmlNo2;
    }
    /**
     * Setter method for cmlNo2.
     *
     * @param cmlNo2 Set for cmlNo2.
     */
    public void setCmlNo2(String cmlNo2) {
        this.cmlNo2 = cmlNo2;
    }
    /**
     * Getter method for cmlNo3.
     *
     * @return the cmlNo3
     */
    public String getCmlNo3() {
        return cmlNo3;
    }
    /**
     * Setter method for cmlNo3.
     *
     * @param cmlNo3 Set for cmlNo3.
     */
    public void setCmlNo3(String cmlNo3) {
        this.cmlNo3 = cmlNo3;
    }
    /**
     * Getter method for cmlNo4.
     *
     * @return the cmlNo4
     */
    public String getCmlNo4() {
        return cmlNo4;
    }
    /**
     * Setter method for cmlNo4.
     *
     * @param cmlNo4 Set for cmlNo4.
     */
    public void setCmlNo4(String cmlNo4) {
        this.cmlNo4 = cmlNo4;
    }

}
