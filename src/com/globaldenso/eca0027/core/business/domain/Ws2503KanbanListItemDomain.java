/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The KANBAN list item result domain of ECA0027_WS_2503.
 * <br />ECA0027_WS_2503のかんばんリスト項目結果ドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Ws2503KanbanListItemDomain implements Serializable {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * ITEM NO
     * <br />品目番号
     */
    @XmlElement(name = "pn")
    private String pltzItemNo;
    
    /**
     * PACKAGE CODE
     * <br />包装区分
     */
    @XmlElement(name = "pkgCd")
    private String pkgCd;
    
    /**
     * EXPORT INDUSTRIAL TYPE CODE
     * <br />輸出側産業別コード
     */
    @XmlElement(name = "indusTypCd")
    private String expIndusTypCd;
    
    /**
     * EXPORT KANBAN TYPE
     * <br />輸出側かんばん種別
     */
    @XmlElement(name = "kanbanTyp")
    private String expKanbanTyp;
    
    /**
     * EXPORT REGULATE NO
     * <br />輸出側整理NO
     */
    @XmlElement(name = "tagSeq")
    private String expRegulateNo;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Ws2503KanbanListItemDomain() {
        super();
    }

    /**
     * Getter method for pltzItemNo.
     *
     * @return the pltzItemNo
     */
    public String getPltzItemNo() {
        return pltzItemNo;
    }

    /**
     * Setter method for pltzItemNo.
     *
     * @param pltzItemNo Set for pltzItemNo
     */
    public void setPltzItemNo(String pltzItemNo) {
        this.pltzItemNo = pltzItemNo;
    }

    /**
     * Getter method for pkgCd.
     *
     * @return the pkgCd
     */
    public String getPkgCd() {
        return pkgCd;
    }

    /**
     * Setter method for pkgCd.
     *
     * @param pkgCd Set for pkgCd
     */
    public void setPkgCd(String pkgCd) {
        this.pkgCd = pkgCd;
    }

    /**
     * Getter method for expIndusTypCd.
     *
     * @return the expIndusTypCd
     */
    public String getExpIndusTypCd() {
        return expIndusTypCd;
    }

    /**
     * Setter method for expIndusTypCd.
     *
     * @param expIndusTypCd Set for expIndusTypCd
     */
    public void setExpIndusTypCd(String expIndusTypCd) {
        this.expIndusTypCd = expIndusTypCd;
    }

    /**
     * Getter method for expKanbanTyp.
     *
     * @return the expKanbanTyp
     */
    public String getExpKanbanTyp() {
        return expKanbanTyp;
    }

    /**
     * Setter method for expKanbanTyp.
     *
     * @param expKanbanTyp Set for expKanbanTyp
     */
    public void setExpKanbanTyp(String expKanbanTyp) {
        this.expKanbanTyp = expKanbanTyp;
    }

    /**
     * Getter method for expRegulateNo.
     *
     * @return the expRegulateNo
     */
    public String getExpRegulateNo() {
        return expRegulateNo;
    }

    /**
     * Setter method for expRegulateNo.
     *
     * @param expRegulateNo Set for expRegulateNo
     */
    public void setExpRegulateNo(String expRegulateNo) {
        this.expRegulateNo = expRegulateNo;
    }
}