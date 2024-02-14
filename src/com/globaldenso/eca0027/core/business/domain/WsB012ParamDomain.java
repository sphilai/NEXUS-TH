/*
 * Project : NEXUS_EXPORT/NEXUS_CIGMA
 *
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.business.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * The domain class that contains the request parameters of WsB012
 * <br />WsB012のリクエストパラメータを格納するドメインクラス。
 *
 * MGT575 ADD
 *
 * #############################################################
 * Caution/注意:
 * Since this file is common to NEXUS_EXPORT / NEXUS_CIGMA, when you modify one,
 * be sure to copy it to the other.
 * 本ファイルはNEXUS_EXPORT/NEXUS_CIGMA共通であるため、一方を修正した場合、必ず他方にコピーすること。
 * #############################################################
 *
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13695 $
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "data")
public class WsB012ParamDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;

    /**
     * Request ID
     * <br />リクエストID。
     */
    @XmlElement(name = "requestId")
    private String requestId;

    /**
     * Request local date
     * <br />リクエストローカル日付
     */
    @XmlElement(name = "requestLocalDt")
    private String requestLocalDt;

    /**
     * Detail list
     * <br />明細
     */
    @XmlElementWrapper(name = "odrList")
    @XmlElement(name = "odrItem")
    private List<? extends B0200OdrUploadOdrDomain> odrList;

    /**
     * Library name
     * <br />ライブラリ名
     */
    private String lib;

    /**
     * constructor
     * <br />コンストラクタ。
     */
    public WsB012ParamDomain() {
        super();
    }

    /**
     * Getter method for requestId.
     *
     * @return the requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter method for requestId.
     *
     * @param requestId Set for requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter method for requestLocalDt.
     *
     * @return the requestLocalDt
     */
    public String getRequestLocalDt() {
        return requestLocalDt;
    }

    /**
     * Setter method for requestLocalDt.
     *
     * @param requestLocalDt Set for requestLocalDt
     */
    public void setRequestLocalDt(String requestLocalDt) {
        this.requestLocalDt = requestLocalDt;
    }

    /**
     * Getter method for odrList.
     *
     * @return the odrList
     */
    public List<? extends B0200OdrUploadOdrDomain> getOdrList() {
        return odrList;
    }

    /**
     * Setter method for odrList.
     *
     * @param odrList Set for odrList
     */
    public void setOdrList(List<? extends B0200OdrUploadOdrDomain> odrList) {
        this.odrList = odrList;
    }

    /**
     * Getter method for lib.
     *
     * @return the lib
     */
    public String getLib() {
        return lib;
    }

    /**
     * Setter method for lib.
     *
     * @param lib Set for lib
     */
    public void setLib(String lib) {
        this.lib = lib;
    }

    /**
     * Getter method for serialVersionUID.
     *
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
