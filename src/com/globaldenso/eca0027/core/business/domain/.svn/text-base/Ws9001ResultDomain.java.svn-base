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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The result for domain class of Ws9001.
 * <br />Ws9001の結果用ドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ws9001result")
public class Ws9001ResultDomain extends ResultDomain {

    /**
     * Serial version ID
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Item information
     * <br />品目情報
     */
    @XmlElement(name = "itemInfo")
    private Ws9001ResultItemDomain itemInfo;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws9001ResultDomain() {
        super();
    }

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     * @param resultCode Result code<br />結果コード
     * @param errorList Error list<br />エラーリスト
     */
    public Ws9001ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
    }

    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     * @param resultCode Result code<br />結果コード
     */
    public Ws9001ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * Getter method for itemInfo.
     *
     * @return the itemInfo
     */
    public Ws9001ResultItemDomain getItemInfo() {
        return itemInfo;
    }

    /**
     * Setter method for itemInfo.
     *
     * @param itemInfo Set for itemInfo
     */
    public void setItemInfo(Ws9001ResultItemDomain itemInfo) {
        this.itemInfo = itemInfo;
    }


}
