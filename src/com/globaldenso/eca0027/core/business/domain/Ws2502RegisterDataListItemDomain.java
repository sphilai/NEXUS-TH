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
 * The registration data list item result domain of ECA0027_WS_2502.
 * <br />ECA0027_WS_2502の登録データリスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2502RegisterDataListItemDomain implements Serializable {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * The MAIN MARK list item result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502のMAIN MARKリスト項目結果ドメイン
     */
    @XmlElementWrapper
    @XmlElement(name = "mainMarkListItem")
    private List<? extends Ws2502MainMarkListItemDomain> mainMarkList;
    
    /**
     * The KANBAN list item result domain of ECA0027_WS_2502
     * <br />ECA0027_WS_2502のかんばんリスト項目結果ドメイン
     */
    @XmlElementWrapper
    @XmlElement(name = "kanbanListItem")
    private List<? extends Ws2502KanbanListItemDomain> kanbanList;
    
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
    public Ws2502RegisterDataListItemDomain() {
        super();
    }

    /**
     * Getter method for mainMarkList.
     *
     * @return the mainMarkList
     */
    public List<? extends Ws2502MainMarkListItemDomain> getMainMarkList() {
        return mainMarkList;
    }

    /**
     * Setter method for mainMarkList.
     *
     * @param mainMarkList Set for mainMarkList
     */
    public void setMainMarkList(
        List<? extends Ws2502MainMarkListItemDomain> mainMarkList) {
        this.mainMarkList = mainMarkList;
    }

    /**
     * Getter method for kanbanList.
     *
     * @return the kanbanList
     */
    public List<? extends Ws2502KanbanListItemDomain> getKanbanList() {
        return kanbanList;
    }

    /**
     * Setter method for kanbanList.
     *
     * @param kanbanList Set for kanbanList
     */
    public void setKanbanList(List<? extends Ws2502KanbanListItemDomain> kanbanList) {
        this.kanbanList = kanbanList;
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
