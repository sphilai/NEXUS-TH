/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of form [L4002] that output for domain form.
 * <br/>帳票【L4002】の帳票出力用ドメインです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 10064 $
 */
public class L4002TtPltzByPalletCartonTypCriteriaDomain extends AbstractDomain {

    /**
     * Serial Version ID.<br />
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * STG ACT NO<br />
     * 山作りNo
     */
    private String stgActNo = null;
    
    /**
     * Default Constructor
     */
    public L4002TtPltzByPalletCartonTypCriteriaDomain() {
    }

    /**
     * <p>stgActNo のゲッターメソッドです。</p>
     *
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * <p>stgActNo のセッターメソッドです。</p>
     *
     * @param stgActNo stgActNo に設定する
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }
    
}
