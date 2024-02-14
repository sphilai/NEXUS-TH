/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * The unregistered data list item result domain of ECA0027_WS_2502.
 * <br />ECA0027_WS_2502の未登録データリスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2502UnregisterDataListItemDomain implements Serializable {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * The non-Palletize list item result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502の未パレタイズリスト項目結果ドメイン
     */
    @XmlElementWrapper
    @XmlElement(name = "pnListItem")
    private List<? extends Ws2502PnListItemDomain> pnList;

    /**
     * The MIX tag list item result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502のMIXタグリスト項目結果ドメイン
     */
    @XmlElementWrapper
    @XmlElement(name = "mixTagListItem")
    private List<? extends Ws2502MixTagListItemDomain> mixTagList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2502UnregisterDataListItemDomain() {
        super();
    }

    /**
     * Getter method for pnList.
     *
     * @return the pnList
     */
    public List<? extends Ws2502PnListItemDomain> getPnList() {
        return pnList;
    }

    /**
     * Setter method for pnList.
     *
     * @param pnList Set for pnList
     */
    public void setPnList(List<? extends Ws2502PnListItemDomain> pnList) {
        this.pnList = pnList;
    }

    /**
     * Getter method for mixTagList.
     *
     * @return the mixTagList
     */
    public List<? extends Ws2502MixTagListItemDomain> getMixTagList() {
        return mixTagList;
    }

    /**
     * Setter method for mixTagList.
     *
     * @param mixTagList Set for mixTagList
     */
    public void setMixTagList(List<? extends Ws2502MixTagListItemDomain> mixTagList) {
        this.mixTagList = mixTagList;
    }
}
