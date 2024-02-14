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
 * The domain class of WsB012 result
 * <br />WsB012の結果用ドメインクラス。
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
 * @author $Author: G453S402002 $
 * @version $Revision: 13695 $
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "WsB012result")
public class WsB012ResultDomain extends ResultDomain {

    /**
     * Serial version
     * <br />シリアルバージョン。
     */
    private static final long serialVersionUID = 1L;

    /**
     * Request ID
     * <br />リクエストID。
     */
    @XmlElement(name = "requestId")
    private String requestId;

    /**
     * Orders of check result
     * <br />チェック結果複数明細。
     */
    @XmlElementWrapper(name = "odrList")
    @XmlElement(name = "odrItem")
    private List<? extends B0200OdrUploadOdrDomain> odrList;
    
    /**
     * constructor
     * <br />コンストラクタ。
     */
    public WsB012ResultDomain() {
        super();
    }

    /**
     * constructor
     * <br />コンストラクタ。
     * @param resultCode Result code<br />
     * 結果コード
     */
    public WsB012ResultDomain(String resultCode) {
        super(resultCode);
    }

    /**
     * constructor
     * <br />コンストラクタ。
     * @param resultCode Result code<br />
     * 結果コード
     * @param errorList Error list<br />
     * エラーリスト
     */
    public WsB012ResultDomain(String resultCode, List<ErrorListItemDomain> errorList) {
        super(resultCode, errorList);
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
}
