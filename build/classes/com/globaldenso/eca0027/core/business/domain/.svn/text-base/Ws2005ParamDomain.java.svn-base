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
 * The domain class that holds the data to be registered in order allowance performance table.
 * <br />受注引当実績テーブルに登録するデータを保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "data")
public class Ws2005ParamDomain{

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Nightly batch flag
     * <br />夜間バッチフラグ
     */
    @XmlElement(name = "nightFlg")
    private String nightFlg;
    
    /**
     * Description information
     * <br />明細情報
     */
    @XmlElementWrapper(name = "registerDataList")
    @XmlElement(name = "registerDataListItem")
    private List<? extends Ws2005ParamItemDomain> detailList;
    
    /**
     * Default constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2005ParamDomain() {
        super();
    }

    /**
     * Getter method for nightFlg.
     *
     * @return the nightFlg
     */
    public String getNightFlg() {
        return nightFlg;
    }

    /**
     * Setter method for nightFlg.
     *
     * @param nightFlg Set for nightFlg
     */
    public void setNightFlg(String nightFlg) {
        this.nightFlg = nightFlg;
    }

    /**
     * Getter method for detailList.
     *
     * @return the detailList
     */
    public List<? extends Ws2005ParamItemDomain> getDetailList() {
        return detailList;
    }

    /**
     * Setter method for detailList.
     *
     * @param detailList Set for detailList
     */
    public void setDetailList(List<? extends Ws2005ParamItemDomain> detailList) {
        this.detailList = detailList;
    }
}
