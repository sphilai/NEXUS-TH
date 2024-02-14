/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * The unpacked up data list item result domain of ECA0027_WS_2507.
 * <br />ECA0027_WS_2507の未梱包データリスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2501UnregisterDataListItem {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * The list of unpacked up list item result domains
     * <br />未梱包リスト項目結果ドメインのリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "pnListItem")
    private List<? extends Ws2501PnListItem> pnList;
    
    /**
     * The list of Mix tag list item result domains
     * <br />Mixタグリスト項目結果ドメインのリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "mixTagListItem")
    private List<? extends Ws2501MixTagListItem> mixTagList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2501UnregisterDataListItem() {
        super();
    }

    /**
     * Getter method for pnList.
     *
     * @return the pnList
     */
    public List<? extends Ws2501PnListItem> getPnList() {
        return pnList;
    }

    /**
     * Setter method for pnList.
     *
     * @param pnList Set for pnList
     */
    public void setPnList(List<? extends Ws2501PnListItem> pnList) {
        this.pnList = pnList;
    }

    /**
     * Getter method for mixTagList.
     *
     * @return the mixTagList
     */
    public List<? extends Ws2501MixTagListItem> getMixTagList() {
        return mixTagList;
    }

    /**
     * Setter method for mixTagList.
     *
     * @param mixTagList Set for mixTagList
     */
    public void setMixTagList(List<? extends Ws2501MixTagListItem> mixTagList) {
        this.mixTagList = mixTagList;
    }
}
