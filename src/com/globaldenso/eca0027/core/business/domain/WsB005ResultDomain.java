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
 * The result of domain WB005 (Check EDI Order Last Digit Change Detail).
 * <br />WB005(Check EDI Order Last Digit Change Detail)の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WsB005result")
public class WsB005ResultDomain extends ResultDomain {

    /**
     * Serial version.
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Specification
     * <br />明細
     */
    @XmlElementWrapper(name = "customerOrderList")
    @XmlElement(name = "customerOrderItem")
    private List<? extends WsB005ResultItemDomain> customerOrderList;

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB005ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying the CD results.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode CD Results<br />結果コード
     */
    public WsB005ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error list and CD results.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode CD Results<br />結果コード
     * @param errorList error list<br />エラーリスト
     */
    public WsB005ResultDomain(String resultCode,
        List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for customerOrderList.
     *
     * @return the customerOrderList
     */
    public List<? extends WsB005ResultItemDomain> getCustomerOrderList() {
        return customerOrderList;
    }

    /**
     * Setter method for customerOrderList.
     *
     * @param customerOrderList Set for customerOrderList
     */
    public void setCustomerOrderList(
        List<? extends WsB005ResultItemDomain> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
}
