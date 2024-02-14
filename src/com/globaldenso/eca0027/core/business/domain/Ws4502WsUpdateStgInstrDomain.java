/*
 * Project : NEXUS_EXPORT
 *
 * Date of update          : 2014/03/06
 * Development company name: DENSO SI, INC.
 * Details of update       : New
 * (c) Copyright 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.util.Date;

/**
 * <p>
 * ECA0027_WS_4502の更新情報を格納するドメインです
 * </p>
 * 
 * @version 1.00
 */
public class Ws4502WsUpdateStgInstrDomain {

    /**
     * Staging Instruction No.
     * 荷揃え指示NO
     */
    private String stgInstrNo = "";
    
    /**
     * Paletize Status Code
     * パレタイズステータスコード
     */
    private String pltzStatus = "";

    /**
     * Staging Instruction Status
     * 荷揃え指示ステータス
     */
    private String stgInstrStatus = "";
 
    /**
     * Worked Date
     * 荷揃え実績日
     */
    private Date workedDt;

    /**
     * Worked Method Type
     * 荷揃え実績手段区分
     */
    private String workedMethTyp = "";

    /**
     * Worked Issuer DSC-ID
     * 荷揃え実績者DSC-ID
     */
    private String workedId = "";

    /**
     * Worked Issuer Name
     * 荷揃え実績者名
     */
    private String workedIssureNm = "";

    /**
     * <p>
     * DSC-ID of BHT user<BR>
     * 呼出元ユーザのDSC-ID
     * </p>
     */
    private String dscId;

    /**
     * <p>
     * Screen ID<BR>
     * 画面ID
     * </p>
     */
    private String screenId;
    
    /**
     * <p>
     * Default Constructor
     * デフォルトコンストラクタです。
     * </p>
     */
    public Ws4502WsUpdateStgInstrDomain() {
    }
    
    /**
     * <p>
     * getter method of DSC-ID of BHT user<BR>
     * 呼出元ユーザのDSC-ID のゲッターメソッドです。
     * </p>
     *
     * @return the dscId
     */
    public String getDscId() {
        return dscId;
    }

    /**
     * <p>
     * setter method of DSC-ID of BHT user<BR>
     * 呼出元ユーザのDSC-ID のセッターメソッドです。
     * </p>
     *
     * @param dscId
     *            dscId に設定する
     */

    public void setDscId(String dscId) {
        this.dscId = dscId;
    }
    
    /**
     * <p>
     * Getter method for StgInstrNo
     * </p>
     * 
     * @return the StgInstrNo
     */
    public String getStgInstrNo() {
        return stgInstrNo;
    }

    /**
     * <p>
     * Setter method for StgInstrNo
     * </p>
     * 
     * @param stgInstrNo Set for StgInstrNo
     */
    public void setStgInstrNo(String stgInstrNo) {
        this.stgInstrNo = stgInstrNo;
    }

    /**
     * <p>
     * Getter method for PltzStatus
     * </p>
     * 
     * @return the PltzStatus
     */
    public String getPltzStatus() {
        return pltzStatus;
    }

    /**
     * <p>
     * Setter method for PltzStatus
     * </p>
     * 
     * @param pltzStatus Set for PltzStatus
     */
    public void setPltzStatus(String pltzStatus) {
        this.pltzStatus = pltzStatus;
    }

    /**
     * <p>
     * Getter method for InstrStatus
     * </p>
     * 
     * @return the InstrStatus
     */
    public String getStgInstrStatus() {
        return stgInstrStatus;
    }

    /**
     * <p>
     * Setter method for XXXXX
     * </p>
     * 
     * @param stgInstrStatus Set for StgInstrStatus
     */
    public void setStgInstrStatus(String stgInstrStatus) {
        this.stgInstrStatus = stgInstrStatus;
    }

    /**
     * <p>
     * Getter method for WorkedDt
     * </p>
     * 
     * @return the WorkedDt
     */
    public Date getWorkedDt() {
        return workedDt;
    }

    /**
     * <p>
     * Setter method for WorkedDt
     * </p>
     * 
     * @param workedDt Set for WorkedDt
     */
    public void setWorkedDt(Date workedDt) {
        this.workedDt = workedDt;
    }

    /**
     * <p>
     * Getter method for WorkedMethTyp
     * </p>
     * 
     * @return the WorkedMethTyp
     */
    public String getWorkedMethTyp() {
        return workedMethTyp;
    }

    /**
     * <p>
     * Setter method for WorkedMethTyp
     * </p>
     * 
     * @param workedMethTyp Set for WorkedMethTyp
     */
    public void setWorkedMethTyp(String workedMethTyp) {
        this.workedMethTyp = workedMethTyp;
    }

    /**
     * <p>
     * Getter method for WorkedId
     * </p>
     * 
     * @return the WorkedId
     */
    public String getWorkedId() {
        return workedId;
    }

    /**
     * <p>
     * Setter method for WorkedId
     * </p>
     * 
     * @param workedId Set for WorkedId
     */
    public void setWorkedId(String workedId) {
        this.workedId = workedId;
    }

    /**
     * <p>
     * Getter method for WorkedIssureNm
     * </p>
     * 
     * @return the WorkedIssureNm
     */
    public String getWorkedIssureNm() {
        return workedIssureNm;
    }

    /**
     * <p>
     * Setter method for WorkedIssureNm
     * </p>
     * 
     * @param workedIssureNm Set for WorkedIssureNm
     */
    public void setWorkedIssureNm(String workedIssureNm) {
        this.workedIssureNm = workedIssureNm;
    }

    /**
     * <p>
     * getter method of Screen ID<BR>
     * 画面ID のゲッターメソッドです。
     * </p>
     *
     * @return Screen ID   (画面ID)
     */
    public String getScreenId() {
        return screenId;
    }

    /**
     * <p>
     * setter method of Screen ID<BR>
     * 画面ID のセッターメソッドです。
     * </p>
     *
     * @param screenId Screen ID
     *            画面IDに設定する
     */
    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }
}
