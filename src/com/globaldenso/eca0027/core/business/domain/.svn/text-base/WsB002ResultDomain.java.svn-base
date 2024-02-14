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
 * The result of domain WB002 (Check Order Entry Detail On Hand).
 * <br />WB002(Check Order Entry Detail On Hand)の結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WsB002result")
public class WsB002ResultDomain extends ResultDomain {

    /**
     * Serial version.
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Parameter list
     * <br />パラメータリスト
     */
    @XmlElementWrapper(name = "customerOrderList")
    @XmlElement(name = "customerOrderItem")
    private List<WsB002ResultItemDomain> customerOrderList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WsB002ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying the CD results.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode <br />結果コード
     */
    public WsB002ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error list and CD results.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode <br />結果コード
     * @param errorList <br />エラーリスト
     */
    public WsB002ResultDomain(String resultCode,
        List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for customerOrderList.
     * <br />customerOrderList のゲッターメソッドです。
     *
     * @return the customerOrderList
     */
    public List<WsB002ResultItemDomain> getCustomerOrderList() {
        return customerOrderList;
    }

    /**
     * Setter method for customerOrderList.
     *<br />customerOrderList のセッターメソッドです。
     *
     * @param customerOrderList  Set for customerOrderList
     */
    public void setCustomerOrderList(List<WsB002ResultItemDomain> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
}
