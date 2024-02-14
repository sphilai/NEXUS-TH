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
 * The result for domain class of Ws6004Resource.
 * <br />Ws6004Resourceの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ws6004result")
public class Ws6004ResultDomain extends ResultDomain {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Sales unit price information
     * <br />売上単価情報
     */
    @XmlElementWrapper(name = "salesPriceList")
    @XmlElement(name = "salesPriceItem")
    private List<? extends Ws6004ResultItemDomain> salesPriceList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws6004ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying the code results.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     * @param resultCode Result code<br />結果コード
     */
    public Ws6004ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error code list and results.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     * @param resultCode Result code<br />結果コード
     * @param errorList error list<br />エラーリスト
     */
    public Ws6004ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for salesPriceList.
     *
     * @return the salesPriceList
     */
    public List<? extends Ws6004ResultItemDomain> getSalesPriceList() {
        return salesPriceList;
    }

    /**
     * Setter method for salesPriceList.
     *
     * @param salesPriceList Set for salesPriceList
     */
    public void setSalesPriceList(
        List<? extends Ws6004ResultItemDomain> salesPriceList) {
        this.salesPriceList = salesPriceList;
    }

}
