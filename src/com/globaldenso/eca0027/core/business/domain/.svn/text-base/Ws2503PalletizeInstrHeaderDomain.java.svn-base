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
 * The Palletize-Instruction header result domain of ECA0027_WS_2503.
 * <br />ECA0027_WS_2503の梱包指示ヘッダ結果ドメインです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12091 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2503PalletizeInstrHeaderDomain implements Serializable {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * MAIN MARK
     * <br />メインマーク
     */
    private String mainMark;
    
    /**
     * PALLET NO
     * <br />パレットNO
     */
    private String palletNo;
    
    /**
     * NUMBER OF PRINT
     * <br />印刷部数
     */
    @XmlElement(name = "cmlPrintNum")
    private int cmlPrintNum;
    
    /**
     * The list of KANBAN list item result domains of ECA0027_WS_2503
     * <br />ECA0027_WS_2503のかんばんリスト項目結果ドメインのリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "kanbanListItem")
    private List<? extends Ws2503KanbanListItemDomain> kanbanList;
    
    /**
     * The list of MIX tag list item result domains of ECA0027_WS_2503
     * <br />ECA0027_WS_2503のMIXタグリスト項目結果ドメインのリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "mixTagListItem")    
    private List<? extends Ws2503MixTagListItemDomain> mixTagList;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2503PalletizeInstrHeaderDomain() {
        super();
    }

    /**
     * Getter method for mainMark.
     *
     * @return the mainMark
     */
    public String getMainMark() {
        return mainMark;
    }

    /**
     * Setter method for mainMark.
     *
     * @param mainMark Set for mainMark
     */
    public void setMainMark(String mainMark) {
        this.mainMark = mainMark;
    }

    /**
     * Getter method for palletNo.
     *
     * @return the palletNo
     */
    public String getPalletNo() {
        return palletNo;
    }

    /**
     * Setter method for palletNo.
     *
     * @param palletNo Set for palletNo
     */
    public void setPalletNo(String palletNo) {
        this.palletNo = palletNo;
    }

    /**
     * <p>cmlPrintNum のゲッターメソッドです。</p>
     *
     * @return the cmlPrintNum
     */
    public int getCmlPrintNum() {
        return cmlPrintNum;
    }

    /**
     * <p>cmlPrintNum のセッターメソッドです。</p>
     *
     * @param cmlPrintNum cmlPrintNum に設定する
     */
    public void setCmlPrintNum(int cmlPrintNum) {
        this.cmlPrintNum = cmlPrintNum;
    }

    /**
     * Getter method for kanbanList.
     *
     * @return the kanbanList
     */
    public List<? extends Ws2503KanbanListItemDomain> getKanbanList() {
        return kanbanList;
    }

    /**
     * Setter method for kanbanList.
     *
     * @param kanbanList Set for kanbanList
     */
    public void setKanbanList(List<? extends Ws2503KanbanListItemDomain> kanbanList) {
        this.kanbanList = kanbanList;
    }

    /**
     * Getter method for mixTagList.
     *
     * @return the mixTagList
     */
    public List<? extends Ws2503MixTagListItemDomain> getMixTagList() {
        return mixTagList;
    }

    /**
     * Setter method for mixTagList.
     *
     * @param mixTagList Set for mixTagList
     */
    public void setMixTagList(List<? extends Ws2503MixTagListItemDomain> mixTagList) {
        this.mixTagList = mixTagList;
    }
}
