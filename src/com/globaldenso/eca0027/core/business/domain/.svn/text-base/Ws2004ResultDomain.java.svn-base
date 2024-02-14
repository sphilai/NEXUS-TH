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
 * This is the input for domain class Item No .. of information (CML for) acquisition service.
 * <br />品目番号情報(CML用)取得サービスの入力用ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ws2004result")
public class Ws2004ResultDomain extends ResultDomain {

    /**
     * Serial version.
     * <br />シリアルバージョン。
     */
    private static final long serialVersionUID = 1L;

    /**
     * Part information
     * <br />品番情報
     */
    @XmlElementWrapper
    @XmlElement(name = "item")
    private List<? extends Ws2004ResultItemDomain> itemList;
    
    /**
     * Constructor
     * <br />コンストラクタ
     *
     */
    public Ws2004ResultDomain() {
        super();
    }

    /**
     * Constructor
     * <br />コンストラクタ
     *
     * @param resultCode Result code<br />結果コード
     */
    public Ws2004ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * Constructor
     * <br />コンストラクタ
     *
     * @param resultCode Result code<br />結果コード
     * @param errorList error code<br />エラーコード
     */
    public Ws2004ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for itemList.
     *
     * @return the itemList
     */
    public List<? extends Ws2004ResultItemDomain> getItemList() {
        return itemList;
    }

    /**
     * Setter method for itemList.
     *
     * @param itemList Set for itemList
     */
    public void setItemList(List<? extends Ws2004ResultItemDomain> itemList) {
        this.itemList = itemList;
    }
}
