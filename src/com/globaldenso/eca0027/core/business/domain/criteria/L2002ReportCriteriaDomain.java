/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the form of information search [L2001].
 * <br />帳票【L2001】の検索情報を保持するドメインクラスです。
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class L2002ReportCriteriaDomain extends AbstractDomain {

    /**
     * Serial version ID.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Mix Tag No.
     */
    private String mixTagNo = null;

    /**
     * Default constructor.<br/>
     * デフォルトコンストラクタです。
     */
    public L2002ReportCriteriaDomain() {
    }
    
    /**
     * Getter method for mixTagNo.
     *
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * Setter method for mixTagNo.
     *
     * @param mixTagNo Set for mixTagNo
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
    }
}
