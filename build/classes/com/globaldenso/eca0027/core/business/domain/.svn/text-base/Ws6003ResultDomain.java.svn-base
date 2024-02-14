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
 * The result for domain class of Ws6003Resource.
 * <br />Ws6003Resourceの結果用ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ws6003result")
public class Ws6003ResultDomain extends ResultDomain {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Own base information
     * <br />自拠点情報
     */
    @XmlElement(name = "shipperVatNo")
    private String vatno;
    
    /**
     * Shipping documents information
     * <br />出荷書類情報
     */
    @XmlElementWrapper(name = "shippingDocumentList")
    @XmlElement(name = "shippingDocumentItem")
    private List<? extends Ws6003ResultItemDomain> shipDocList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws6003ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying the code results.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     * @param resultCode Result code <br />結果コード
     */
    public Ws6003ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error code list and results.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     * @param resultCode Result code <br />結果コード
     * @param errorList error list<br />エラーリスト
     */
    public Ws6003ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for vatno.
     *
     * @return the vatno
     */
    public String getVatno() {
        return vatno;
    }

    /**
     * Setter method for vatno.
     *
     * @param vatno Set for vatno
     */
    public void setVatno(String vatno) {
        this.vatno = vatno;
    }

    /**
     * Getter method for shipDocList.
     *
     * @return the shipDocList
     */
    public List<? extends Ws6003ResultItemDomain> getShipDocList() {
        return shipDocList;
    }

    /**
     * Setter method for shipDocList.
     *
     * @param shipDocList Set for shipDocList
     */
    public void setShipDocList(List<? extends Ws6003ResultItemDomain> shipDocList) {
        this.shipDocList = shipDocList;
    }
}
