/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The Mix tag list item result domain of ECA0027_WS_2501.
 * <br />ECA0027_WS_2501のMixタグリスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2501MixTagListItem {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * MIX TAG NO
     * <br />MIXタグNO
     */
    @XmlElement(name = "mixTag")
    private String mixTagNo;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2501MixTagListItem() {
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
}