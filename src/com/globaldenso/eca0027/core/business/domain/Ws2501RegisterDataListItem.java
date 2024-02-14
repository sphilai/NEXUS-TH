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
 * The packed up data list item result domain of ECA0027_WS_2507.
 * <br />ECA0027_WS_2507の梱包済みデータリスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2501RegisterDataListItem {

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
    @XmlElement(name = "mainMarkListItem")
    private List<? extends Ws2501MainMarkListItem> mainMarkList;
    
    /**
     * The list of KANBAN list item result domains
     * <br />かんばんリスト項目結果ドメインのリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "kanbanListItem")
    private List<? extends Ws2501KanbanListItem> kanbanList;
    
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
    public Ws2501RegisterDataListItem() {
        super();
    }

    /**
     * Getter method for mainMarkList.
     *
     * @return the mainMarkList
     */
    public List<? extends Ws2501MainMarkListItem> getMainMarkList() {
        return mainMarkList;
    }

    /**
     * Setter method for mainMarkList.
     *
     * @param mainMarkList Set for mainMarkList
     */
    public void setMainMarkList(List<? extends Ws2501MainMarkListItem> mainMarkList) {
        this.mainMarkList = mainMarkList;
    }

    /**
     * Getter method for kanbanList.
     *
     * @return the kanbanList
     */
    public List<? extends Ws2501KanbanListItem> getKanbanList() {
        return kanbanList;
    }

    /**
     * Setter method for kanbanList.
     *
     * @param kanbanList Set for kanbanList
     */
    public void setKanbanList(List<? extends Ws2501KanbanListItem> kanbanList) {
        this.kanbanList = kanbanList;
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
