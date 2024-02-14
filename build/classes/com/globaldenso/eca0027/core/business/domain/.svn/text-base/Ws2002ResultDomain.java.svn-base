/*
 * Project : NEXUS_CIGMA
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
 * The result for domain class of Item No .. information retrieval services.
 * <br />品目番号情報取得サービスの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ws2002result")
public class Ws2002ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Item No . information
     * <br />品目番号情報
     */
    @XmlElementWrapper
    @XmlElement(name = "item")
    private List<? extends Ws2002ResultItemDomain> itemList;
    
    /**
     * Matching method classification
     * <br />照合方式区分
     */
    @XmlElement(name = "dcdiv")
    private String dcdiv;
    
    /**
     * Constructor
     * <br />コンストラクタ
     *
     */
    public Ws2002ResultDomain() {
        super();
    }

    /**
     * Constructor
     * <br />コンストラクタ
     *
     * @param resultCode Result code<br />結果コード
     */
    public Ws2002ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * Constructor
     * <br />コンストラクタ
     *
     * @param resultCode Result code<br />結果コード
     * @param errorList error code<br />エラーコード
     */
    public Ws2002ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for itemList.
     *
     * @return the itemList
     */
    public List<? extends Ws2002ResultItemDomain> getItemList() {
        return itemList;
    }

    /**
     * Setter method for itemList.
     *
     * @param itemList Set for itemList
     */
    public void setItemList(List<? extends Ws2002ResultItemDomain> itemList) {
        this.itemList = itemList;
    }

    /**
     * Getter method for dcdiv.
     *
     * @return the dcdiv
     */
    public String getDcdiv() {
        return dcdiv;
    }

    /**
     * Setter method for dcdiv.
     *
     * @param dcdiv Set for dcdiv
     */
    public void setDcdiv(String dcdiv) {
        this.dcdiv = dcdiv;
    }
}
