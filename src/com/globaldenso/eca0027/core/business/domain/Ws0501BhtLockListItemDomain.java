package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * <p>
 * This is the domain that holds the BHT lock information.<BR>
 * BHTロック情報を保持するドメインです。
 * </p>
 *
 * @version 1.00
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws0501BhtLockListItemDomain implements
        Serializable {

    /**
     * Serial version ID<BR>
     * シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Screen id
     */
    private String screenId;

    /**
     * BHT Lock Message List
     */
    @XmlElementWrapper
    @XmlElement(name = "bhtLockMessageListItem")
    private List<Ws0501BhtLockMessageListItemDomain> bhtLockMessageList;

    /**
     * <p>
     * Default constructor<BR>
     * デフォルトコンストラクタ。
     * </p>
     */
    public Ws0501BhtLockListItemDomain() {
    }

    /**
     * Getter of Screen id
     *
     * @return the screenId
     */
//    @Override
    public String getScreenId() {
        return screenId;
    }

    /**
     * Setter of Screen id
     * 
     * @param screenId
     *            screenId に設定する
     */
//    @Override
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    /**
     * Getter of BHT Lock Message List
     * 
     * @return the bhtLockMessageList
     */
    public List<Ws0501BhtLockMessageListItemDomain> getBhtLockMessageList() {
        return bhtLockMessageList;
    }

    /**
     * Setter of BHT Lock Message List
     * 
     * @param bhtLockMessageList
     *            bhtLockMessageList に設定する
     */
    public void setBhtLockMessageList(
            List<Ws0501BhtLockMessageListItemDomain> bhtLockMessageList) {
        this.bhtLockMessageList = bhtLockMessageList;
    }
}
