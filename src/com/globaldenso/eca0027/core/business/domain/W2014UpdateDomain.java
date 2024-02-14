/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of X-Tag Main Screen
 * and the detail information of X-Tag Main Screen List section
 * <br />まとめCMLMain Screen画面の一括更新ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W2014UpdateDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * X-TAG
     * <br />まとめメインマーク
     */
    private String xmainMark;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W2014UpdateDomain() {
    }
    
    /**
     * Getter method for xmainMark.
     *
     * @return the xmainMark
     */
    public String getXmainMark() {
        return xmainMark;
    }
    
    /**
     * Setter method for xmainMark.
     *
     * @param xmainMark Set for xmainMark
     */
    public void setXmainMark(String xmainMark) {
        this.xmainMark = xmainMark;
    }
}
