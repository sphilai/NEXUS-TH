/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.business.domain;

import java.util.List;

import com.globaldenso.eca0027.core.common.filter.Eca0027CreateCommonInfoImpl;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * 
 * The domain class that created to extend the domain of the common information for GSCM's screen <br .>
 * <pre>
 *     hold the following additional items:
 *     - User name (English)
 *     - COUNTRY CODE
 *     - WEIGHT UNIT
 *     - LENGTH UNIT
 *     - VOLUME UNIT
 *     - Notation of WEIGHT UNIT
 *     - Notation of VOLUME UNIT
 *     - COMPANY CODE
 *     - SERVER ID
 *     - server name
 *     - list of the use authority of user's function
 *     - time zone name (*1)
 *     - locale (*2)
 *     - date format (to display the document with business form)
 *     - date format (to output the document with business form)
 *     
 *     *1 The value of TM_USER_CONF.TIMEZONE_ID is set to time zone ID by GSCM standard parts,
 *        but re-set it with the time zone ID of the system date(calculated from LB_TIMEZONE_MANAGE).
 *     *2 The locale created by LANGUAGE CODE is set to by GSCM standard parts, 
 *        but re-set it with locale created by LANGUAGE CODE and COUNTRY CODE. (Internationalization of date format)
 *     
 * <pre/>
 * <br />GSCMの画面共通情報ドメインを拡張したドメインです。
 * <pre>
 * 以下の追加項目を保持します：
 *   - ユーザ名(英)
 *   - 国コード
 *   - 重量単位
 *   - 長さ単位
 *   - 容積単位
 *   - 重量単位表記
 *   - 容積単位表記
 *   - 会社コード
 *   - サーバID
 *   - サーバ名
 *   - ユーザ機能利用権限リスト
 *   - タイムゾーンID (※1)
 *   - タイムゾーン名 
 *   - ロケール (※2)
 *   - 日付フォーマット (画面表示用)
 *   - 日付フォーマット (帳票出力用)
 *   
 * ※1 GSCM標準部品により、タイムゾーンIDにはTM_USER_CONF.TIMEZONE_IDの値が設定されるが、
 *     システム日付のタイムゾーンID(LB_TIMEZONE_MANAGEから算出)を再設定する
 * ※2 GSCM標準部品により、言語コードから作成したロケールが設定されるが、
 *     言語コードと国コードから作成したロケールを再設定する (日付フォーマットの国際化対応)
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 * @see Eca0027CreateCommonInfoImpl
 */
public class Eca0027CommonInfoDomain extends CommonInfoDomain {

    /**
     * serial version <br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * user name (English) <br />
     * ユーザ名(英)
     */
    private String usrNmEn;
    
    /**
     * COUNTRY CODE <br />
     * 国コード
     */
    private String cntryCd;
    
    /**
     * code of WEIGHT UNIT <br />
     * 重量単位コード
     */
    private String weightUnit;
    
    /**
     * LENGTH UNIT <br />
     * 長さ単位
     */
    private String lengthUnit;
    
    /**
     * code of VOLUME UNIT <br />
     * 容積単位コード
     */
    private String volumeUnit;
    
    /**
     * WEIGHT UNIT <br />
     * 重量単位表記
     */
    private String weightUnitDisp;
    
    /**
     * VOLUME UNIT <br />
     * 容積単位表記
     */
    private String volumeUnitDisp;

    /**
     * COMPANY CODE <br />
     * 会社コード
     */
    private String compCd;
    
    /**
     * SERVER ID <br />
     * サーバID
     */
    private String serverId;
    
    /**
     * server name <br />
     * サーバ名
     */
    private String serverNm;
    
    /**
     * time zone name <br />
     * タイムゾーン名
     */
    private String timeZoneName;
    
    /**
     * list of the use authority of user's function <br />
     * ユーザ機能利用権限リスト
     */
    private List<? extends UserAuthDomain> userAuthList;

    /**
     * date format (to display the document with business form) <br />
     * 日付フォーマット (画面表示用)
     */
    private String screenDateFormat;
    
    /**
     * date format (to output the document with business form) <br />
     * 日付フォーマット (帳票出力用)
     */
    private String reportDateFormat;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Eca0027CommonInfoDomain() {
    }

    /**
     * Getter method for usrNmEn.
     *
     * @return the usrNmEn
     */
    public String getUsrNmEn() {
        return usrNmEn;
    }

    /**
     * Setter method for usrNmEn.
     *
     * @param usrNmEn Set for usrNmEn
     */
    public void setUsrNmEn(String usrNmEn) {
        this.usrNmEn = usrNmEn;
    }

    /**
     * Getter method for cntryCd.
     *
     * @return the cntryCd
     */
    public String getCntryCd() {
        return cntryCd;
    }

    /**
     * Setter method for cntryCd.
     *
     * @param cntryCd Set for cntryCd
     */
    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    /**
     * Getter method for weightUnit.
     *
     * @return the weightUnit
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Setter method for weightUnit.
     *
     * @param weightUnit Set for weightUnit
     */
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * Getter method for lengthUnit.
     *
     * @return the lengthUnit
     */
    public String getLengthUnit() {
        return lengthUnit;
    }

    /**
     * Setter method for lengthUnit.
     *
     * @param lengthUnit Set for lengthUnit
     */
    public void setLengthUnit(String lengthUnit) {
        this.lengthUnit = lengthUnit;
    }

    /**
     * Getter method for volumeUnit.
     *
     * @return the volumeUnit
     */
    public String getVolumeUnit() {
        return volumeUnit;
    }

    /**
     * Setter method for volumeUnit.
     *
     * @param volumeUnit Set for volumeUnit
     */
    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    /**
     * Getter method for weightUnitDisp.
     *
     * @return the weightUnitDisp
     */
    public String getWeightUnitDisp() {
        return weightUnitDisp;
    }

    /**
     * Setter method for weightUnitDisp.
     *
     * @param weightUnitDisp Set for weightUnitDisp
     */
    public void setWeightUnitDisp(String weightUnitDisp) {
        this.weightUnitDisp = weightUnitDisp;
    }

    /**
     * Getter method for volumeUnitDisp.
     *
     * @return the volumeUnitDisp
     */
    public String getVolumeUnitDisp() {
        return volumeUnitDisp;
    }

    /**
     * Setter method for volumeUnitDisp.
     *
     * @param volumeUnitDisp Set for volumeUnitDisp
     */
    public void setVolumeUnitDisp(String volumeUnitDisp) {
        this.volumeUnitDisp = volumeUnitDisp;
    }

    /**
     * Getter method for compCd.
     *
     * @return the compCd
     */
    public String getCompCd() {
        return compCd;
    }

    /**
     * Setter method for compCd.
     *
     * @param compCd Set for compCd
     */
    public void setCompCd(String compCd) {
        this.compCd = compCd;
    }

    /**
     * Getter method for serverId.
     *
     * @return the serverId
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Setter method for serverId.
     *
     * @param serverId Set for serverId
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * Getter method for serverNm.
     *
     * @return the serverNm
     */
    public String getServerNm() {
        return serverNm;
    }

    /**
     * Setter method for serverNm.
     *
     * @param serverNm Set for serverNm
     */
    public void setServerNm(String serverNm) {
        this.serverNm = serverNm;
    }

    /**
     * Getter method for timeZoneName.
     *
     * @return the timeZoneName
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Setter method for timeZoneName.
     *
     * @param timeZoneName Set for timeZoneName
     */
    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    /**
     * Getter method for userAuthList.
     *
     * @return the userAuthList
     */
    public List<? extends UserAuthDomain> getUserAuthList() {
        return userAuthList;
    }

    /**
     * Setter method for userAuthList.
     *
     * @param userAuthList Set for userAuthList
     */
    public void setUserAuthList(List<? extends UserAuthDomain> userAuthList) {
        this.userAuthList = userAuthList;
    }

    /**
     * Getter method for screenDateFormat.
     *
     * @return the screenDateFormat
     */
    public String getScreenDateFormat() {
        return screenDateFormat;
    }

    /**
     * Setter method for screenDateFormat.
     *
     * @param screenDateFormat Set for screenDateFormat
     */
    public void setScreenDateFormat(String screenDateFormat) {
        this.screenDateFormat = screenDateFormat;
    }

    /**
     * Getter method for reportDateFormat.
     *
     * @return the reportDateFormat
     */
    public String getReportDateFormat() {
        return reportDateFormat;
    }

    /**
     * Setter method for reportDateFormat.
     *
     * @param reportDateFormat Set for reportDateFormat
     */
    public void setReportDateFormat(String reportDateFormat) {
        this.reportDateFormat = reportDateFormat;
    }

}
