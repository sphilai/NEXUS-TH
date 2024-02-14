/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.io.Serializable;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain holding the result of SearchTmCustomerQrPatternHdrByDtl.
 * <br />SearchTmCustomerQrPatternHdrByDtlの結果を保持するドメインです。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Ws2501TmCustomerQrPatternHdrByDtlDomain extends AbstractDomain implements Serializable {

    /**
     * Serial version ID
     * <br />シリアルバージョンID
     */
    private static final long serialVersionUID = 1L;

    /**
     * STRT_POS
     */
    private String  strtPos;

    /**
     * QR_ITEM_LENGTH
     */
    private String  qrItemLength;

    /**
     * QR_ITEM_TYP
     */
    private String  qrItemTyp;

    /**
     * CHK_VALUE
     */
    private String  chkValue;

    /**
     * QR_ITEM_ID
     */
    private String  qrItemId;

    /**
     * REQ_FLG
     */
    private String  reqFlg;

    /**
     * ATTR_TYP
     */
    private String  attrTyp;

    /**
     * GRP_ID
     */
    private String  grpId;


    /**
     * constructor.
     * <br />デフォルトコンストラクタ。
     */
    public Ws2501TmCustomerQrPatternHdrByDtlDomain() {
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
