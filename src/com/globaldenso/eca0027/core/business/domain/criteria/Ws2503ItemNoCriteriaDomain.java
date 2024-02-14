/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <br />ECA0027_WS_2503のパラメータドメインです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 7707 $
 */
public class Ws2503ItemNoCriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * ITEM NO<br/>品目番号
     */
    private String itemNo;
    
    /**
     * PACKAGE CODE<br/>包装区分
     */
    private String pkgCd;
    
    /**
     * MIX TAG FLG<br/>MIXタグFLG
     */
    private String mixTagFlg;
    
    /**
     * INDUSTRIAL TYPE CODE<br/>産業別コード
     */
    private String indusTypCd;
    
    /**
     * KANBAN TYPE<br/>かんばん種別
     */
    private String kanbanTyp;
    
    /**
     * TAG SEQUENCE NO<br/>タグSEQ番号
     */
    private String tagSeqNo;
    
    /**
     * KANBAN QUANTITY<br/>かんばん数量
     */
    private String kanbanQty;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Ws2503ItemNoCriteriaDomain() {
    }

    /**
     * Getter method for itemNo.
     *
     * @return the itemNo
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * Setter method for itemNo.
     *
     * @param itemNo Set for itemNo
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
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
     * Getter method for mixTagFlg.
     *
     * @return the mixTagFlg
     */
    public String getMixTagFlg() {
        return mixTagFlg;
    }

    /**
     * Setter method for mixTagFlg.
     *
     * @param mixTagFlg Set for mixTagFlg
     */
    public void setMixTagFlg(String mixTagFlg) {
        this.mixTagFlg = mixTagFlg;
    }

    /**
     * Getter method for indusTypCd.
     *
     * @return the indusTypCd
     */
    public String getIndusTypCd() {
        return indusTypCd;
    }

    /**
     * Setter method for indusTypCd.
     *
     * @param indusTypCd Set for indusTypCd
     */
    public void setIndusTypCd(String indusTypCd) {
        this.indusTypCd = indusTypCd;
    }

    /**
     * Getter method for kanbanTyp.
     *
     * @return the kanbanTyp
     */
    public String getKanbanTyp() {
        return kanbanTyp;
    }

    /**
     * Setter method for kanbanTyp.
     *
     * @param kanbanTyp Set for kanbanTyp
     */
    public void setKanbanTyp(String kanbanTyp) {
        this.kanbanTyp = kanbanTyp;
    }

    /**
     * Getter method for tagSeqNo.
     *
     * @return the tagSeqNo
     */
    public String getTagSeqNo() {
        return tagSeqNo;
    }

    /**
     * Setter method for tagSeqNo.
     *
     * @param tagSeqNo Set for tagSeqNo
     */
    public void setTagSeqNo(String tagSeqNo) {
        this.tagSeqNo = tagSeqNo;
    }

    /**
     * Getter method for kanbanQty.
     *
     * @return the kanbanQty
     */
    public String getKanbanQty() {
        return kanbanQty;
    }

    /**
     * Setter method for kanbanQty.
     *
     * @param kanbanQty Set for kanbanQty
     */
    public void setKanbanQty(String kanbanQty) {
        this.kanbanQty = kanbanQty;
    }
}
