/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a domain holding the information on garbage data delete batch.
 * <br />不要データ削除バッチの情報を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class T0100BatchDeleteDomain extends AbstractDomain {
    
    /**
     * serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Mix tag
     * <br />Mixタグ
     */
    private String mixTagNo;
    
    /**
     * Palletize Instr. No.
     * <br />梱包指示No.
     */
    private String pltzInstrNo;

    /**
     * X-TAG
     * <br />まとめメインマーク
     */
    private String xMainMark;
    
    /**
     * staging-instruction No.
     * <br />荷揃え指示No.
     */
    private String stgInstrNo;
    
    /**
     * Staging-Actuality No.
     * <br />山作り実績No.
     */
    private String stgActNo;
    

    /**
     * constructor.
     */
    public T0100BatchDeleteDomain() {
        super();
    }
    

    /**
     * Getter method for mixTagNo
     *
     * @return the mixTagNo
     */
    public String getMixTagNo() {
        return mixTagNo;
    }

    /**
     * Setter method for mixTagNo
     *
     * @param mixTagNo Set for mixTagNo
     */
    public void setMixTagNo(String mixTagNo) {
        this.mixTagNo = mixTagNo;
    }

    /**
     * Getter method for pltzInstrNo
     *
     * @return the pltzInstrNo
     */
    public String getPltzInstrNo() {
        return pltzInstrNo;
    }

    /**
     * Setter method for pltzInstrNo
     *
     * @param pltzInstrNo Set for pltzInstrNo
     */
    public void setPltzInstrNo(String pltzInstrNo) {
        this.pltzInstrNo = pltzInstrNo;
    }


    /**
     * Getter method for xMainMark
     *
     * @return the xMainMark
     */
    public String getXMainMark() {
        return xMainMark;
    }


    /**
     * Setter method for xMainMark
     *
     * @param mainMark Set for xMainMark
     */
    public void setXMainMark(String mainMark) {
        xMainMark = mainMark;
    }


    /**
     * Getter method for stgInstrNo
     *
     * @return the stgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }


    /**
     * Setter method for stgInstrNo
     *
     * @param stgInstrNo Set for stgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * Getter method for stgActNo
     *
     * @return the stgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * Setter method for stgActNo
     *
     * @param stgActNo Set for stgActNo
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }
}
