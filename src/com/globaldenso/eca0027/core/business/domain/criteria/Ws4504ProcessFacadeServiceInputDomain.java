/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * <p>
 * ECA0027_WS_4504の入力情報を保持するドメインクラスです
 * </p>
 * 
 * @version $Revision: 9334 $
 */
public class Ws4504ProcessFacadeServiceInputDomain extends AbstractDomain {

    /**
     * <p>
     * Serial version ID<BR>
     * シリアルバージョンID
     * </p>
     */
    private static final long serialVersionUID = 1L;
    /**
     * <p>
     * DSCID
     * ユーザのDSCID
     * </p>
     */
    private String dscId = "";
    /**
     * <p>
     * Company code
     * 会社コード
     * </p>
     */
    private String compCd = "";
    /**
     * <p>
     * Printer ID
     * プリンターID
     * </p>
     */
    private String printerId = "";
    /**
     * <p>
     * Staging Act No
     * 山作り実績NO
     * </p>
     */
    private String stgActNo = "";

    /**
     * Default Constructor
     * デフォルトコンストラクタです。
     */
    public Ws4504ProcessFacadeServiceInputDomain() {
    }

    /**
     * <p>
     * Getter method for DscId
     * </p>
     * 
     * @return the DscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * <p>
     * Setter method for DscId
     * </p>
     * 
     * @param dscId Set for DscId
     */
    public void setDscId(String dscId) {
        this.dscId = dscId;
    }

    /**
     * <p>
     * Getter method for CompCd
     * </p>
     * 
     * @return the CompCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * <p>
     * Setter method for CompCd
     * </p>
     * 
     * @param compCd Set for CompCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * <p>
     * Getter method for PrinterId
     * </p>
     * 
     * @return the PrinterId
     */
    public String getPrinterId() {
        return printerId;
    }

    /**
     * <p>
     * Setter method for PrinterId
     * </p>
     * 
     * @param printerId Set for PrinterId
     */
    public void setPrinterId(String printerId) {
        this.printerId = printerId;
    }

    /**
     * <p>
     * Getter method for StgActNo
     * </p>
     * 
     * @return the StgActNo
     */
    public String getStgActNo() {
        return stgActNo;
    }

    /**
     * <p>
     * Setter method for StgActNo
     * </p>
     * 
     * @param stgActNo Set for StgActNo
     */
    public void setStgActNo(String stgActNo) {
        this.stgActNo = stgActNo;
    }
}