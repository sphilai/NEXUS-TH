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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The result of ECA0027_WS_2501 is a domain.
 * <br />ECA0027_WS_2501の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ws2501result")
public class Ws2501ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Palletize-Instruction header result domain
     * <br />梱包指示ヘッダー結果ドメイン
     */
    private Ws2501PalletizeInstrHeader palletizeInstrHeader;
    
    /**
     * The list of customer KANBAN list item result domains
     * <br />得意先かんばんリスト項目結果ドメインのリスト
     */
    @XmlElementWrapper
    @XmlElement(name = "customerKanbanListItem")
    private List<? extends Ws2501CustomerKanbanListItem> customerKanbanList;

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2501ResultDomain() {
    }

    /**
     * The constructor for specifying a result CD and generating an instance.(For normal)
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode 結果コード
     */
    public Ws2501ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for specifying a result CD and an error list and generating an instance.(For an error)
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode 結果コード
     * @param errorList エラーリスト
     */
    public Ws2501ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }
    
    /**
     * Getter method for palletizeInstrHeader.
     *
     * @return the palletizeInstrHeader
     */
    public Ws2501PalletizeInstrHeader getPalletizeInstrHeader() {
        return palletizeInstrHeader;
    }

    /**
     * Setter method for palletizeInstrHeader.
     *
     * @param palletizeInstrHeader Set for palletizeInstrHeader
     */
    public void setPalletizeInstrHeader(
        Ws2501PalletizeInstrHeader palletizeInstrHeader) {
        this.palletizeInstrHeader = palletizeInstrHeader;
    }

    /**
     * Getter method for customerKanbanList.
     *
     * @return the customerKanbanList
     */
    public List<? extends Ws2501CustomerKanbanListItem> getCustomerKanbanList() {
        return customerKanbanList;
    }

    /**
     * Setter method for customerKanbanList.
     *
     * @param customerKanbanList Set for customerKanbanList
     */
    public void setCustomerKanbanList(
        List<? extends Ws2501CustomerKanbanListItem> customerKanbanList) {
        this.customerKanbanList = customerKanbanList;
    }
}
