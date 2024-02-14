/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The customer KANBAN list item result domain of ECA0027_WS_2501.
 * <br />ECA0027_WS_2501の得意先かんばんリスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2501CustomerKanbanListItem {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * START POSITION
     * <br />読取開始位置
     */
    @XmlElement(name = "startPos")
    private String strtPos;
    
    /**
     * QR ITEM LENGTH
     * <br />項目桁数
     */
    private String qrItemLength;
    
    /**
     * QR ITEM TYPE
     * <br />項目区分
     */
    private String qrItemTyp;
    
    /**
     * CHECK VALUE
     * <br />チェック値
     */
    @XmlElement(name = "checkValue")
    private String chkValue;
    
    /**
     * QR ITEM ID
     * <br />項目ID
     */
    private String qrItemId;
    
    /**
     * REQUIRE FLAG
     * <br />必須フラグ
     */
    private String reqFlg;
    
    /**
     * ATTRIBUTE TYPE
     * <br />属性区分
     */
    @XmlElement(name = "attributeTyp")
    private String attrTyp;
    
    /**
     * GROUP ID
     * <br />グループID
     */
    private String grpId;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2501CustomerKanbanListItem() {
        super();
    }

    /**
     * Getter method for strtPos.
     *
     * @return the strtPos
     */
    public String getStrtPos() {
        return strtPos;
    }

    /**
     * Setter method for strtPos.
     *
     * @param strtPos Set for strtPos
     */
    public void setStrtPos(String strtPos) {
        this.strtPos = strtPos;
    } 

    /**
     * Getter method for qrItemLength.
     *
     * @return the qrItemLength
     */
    public String getQrItemLength() {
        return qrItemLength;
    }

    /**
     * Setter method for qrItemLength.
     *
     * @param qrItemLength Set for qrItemLength
     */
    public void setQrItemLength(String qrItemLength) {
        this.qrItemLength = qrItemLength;
    }

    /**
     * Getter method for qrItemTyp.
     *
     * @return the qrItemTyp
     */
    public String getQrItemTyp() {
        return qrItemTyp;
    }

    /**
     * Setter method for qrItemTyp.
     *
     * @param qrItemTyp Set for qrItemTyp
     */
    public void setQrItemTyp(String qrItemTyp) {
        this.qrItemTyp = qrItemTyp;
    }

    /**
     * Getter method for chkValue.
     *
     * @return the chkValue
     */
    public String getChkValue() {
        return chkValue;
    }

    /**
     * Setter method for chkValue.
     *
     * @param chkValue Set for chkValue
     */
    public void setChkValue(String chkValue) {
        this.chkValue = chkValue;
    }

    /**
     * Getter method for qrItemId.
     *
     * @return the qrItemId
     */
    public String getQrItemId() {
        return qrItemId;
    }

    /**
     * Setter method for qrItemId.
     *
     * @param qrItemId Set for qrItemId
     */
    public void setQrItemId(String qrItemId) {
        this.qrItemId = qrItemId;
    }

    /**
     * Getter method for reqFlg.
     *
     * @return the reqFlg
     */
    public String getReqFlg() {
        return reqFlg;
    }

    /**
     * Setter method for reqFlg.
     *
     * @param reqFlg Set for reqFlg
     */
    public void setReqFlg(String reqFlg) {
        this.reqFlg = reqFlg;
    }

    /**
     * Getter method for attrTyp.
     *
     * @return the attrTyp
     */
    public String getAttrTyp() {
        return attrTyp;
    }

    /**
     * Setter method for attrTyp.
     *
     * @param attrTyp Set for attrTyp
     */
    public void setAttrTyp(String attrTyp) {
        this.attrTyp = attrTyp;
    }

    /**
     * Getter method for grpId.
     *
     * @return the grpId
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Setter method for grpId.
     *
     * @param grpId Set for grpId
     */
    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }
}
