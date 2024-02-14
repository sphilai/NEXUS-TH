/*
 * Project : NEXUS_CIGMA/NEXUS_EXPORT
 *
 * Copyright (c) 2016 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The domain corresponding to the response of Ws6011.
 * <br />Ws6011のレスポンスに対応するドメインです。
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 13073 $
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "Ws6011result")
public class Ws6011ResultDomain extends ResultDomain {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Customer item No. info
     * <br />得意先品番情報
     */
    @XmlElementWrapper(name = "itemInfoList")
    @XmlElement(name = "itemInfoItem")
    private List<? extends Ws6011ItemDomain> itemInfoList;

    /**
     * Constructor.
     */
    public Ws6011ResultDomain() {
    }

    /**
     * The constructor for creating an instance by specifying the code results.
     * <br />結果コードを指定してインスタンスを生成するためのコンストラクタです。（正常用）
     *
     * @param resultCode Result code<br />結果コード
     */
    public Ws6011ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * The constructor for creating an instance by specifying the error code list and results.
     * <br />結果コードとエラーリストを指定してインスタンスを生成するためのコンストラクタです。（エラー用）
     *
     * @param resultCode Result code<br />結果コード
     * @param errorList Error list<br />エラーリスト
     */
    public Ws6011ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Getter method for itemInfoList.
     *
     * @return the itemInfoList
     */
    public List<? extends Ws6011ItemDomain> getItemInfoList() {
        return itemInfoList;
    }

    /**
     * Setter method for itemInfoList.
     *
     * @param itemInfoList Set for itemInfoList
     */
    public void setItemInfoList(List<? extends Ws6011ItemDomain> itemInfoList) {
        this.itemInfoList = itemInfoList;
    }
}
