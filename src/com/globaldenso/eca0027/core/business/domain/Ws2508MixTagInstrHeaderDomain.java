/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * The MixTag header result domain of ECA0027_WS_2508.
 * <br />ECA0027_WS_2508のMixTagヘッダ結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2508MixTagInstrHeaderDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * MIX TAG NO
     */
    private String mixTagNo;
    
    /**
     * BOX NO
     */
    private String boxNo;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2508MixTagInstrHeaderDomain() {
        super();
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

    /**
     * Getter method for boxNo.
     *
     * @return the boxNo
     */
    public String getBoxNo() {
        return boxNo;
    }

    /**
     * Setter method for boxNo.
     *
     * @param boxNo Set for boxNo
     */
    public void setBoxNo(String boxNo) {
        this.boxNo = boxNo;
    }
    
}
