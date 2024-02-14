/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class that holds the criteria information of Empty RT materials (Contens of a box)
 * <br />返却推奨荷姿作成・再印刷・キャンセル画面の検索条件情報を保持するドメインクラスです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class WC001ListDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    
    /**
     * PALLETIZE ITEM NO
     * <br />パレタイズ品目番号
     */
    private String pltzItemNo;

    /**
     * QUANTITY
     * <br />数量
     */
    private String qty;
    
    /**
     * MODEL CODE
     * <br />型式コード
     */
    private String modelCd;
    

    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public WC001ListDomain() {
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
     * Getter method for qty.
     *
     * @return the qty
     */
    public String getQty() {
        return qty;
    }



    /**
     * Setter method for qty.
     *
     * @param qty Set for qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }



    /**
     * Getter method for modelCd.
     *
     * @return the modelCd
     */
    public String getModelCd() {
        return modelCd;
    }



    /**
     * Setter method for modelCd.
     *
     * @param modelCd Set for modelCd
     */
    public void setModelCd(String modelCd) {
        this.modelCd = modelCd;
    }



}
