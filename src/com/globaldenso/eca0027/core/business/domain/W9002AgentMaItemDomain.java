/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain;

import java.sql.Timestamp;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * The domain class of list for the Inquiry Screen of Agent MA.
 * <br />Agent MA Inquiry画面の情報を保持するリストドメインです。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public class W9002AgentMaItemDomain extends AbstractDomain {

    /**
     * Serial Version<br />
     * シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     *ORIGINAL COMPANY CODE<br />
     * (代行依頼元)会社コード
     */
    private String orgCompCd;

    /**
     *AGENT COMPANY CODE<br />
     * (代行依頼先)会社コード
     */
    private String agentCompCd;

    /**
     *UPDATE TIMESTAMP<br />
     * 更新日時
     */
    private Timestamp comUpdateTimestamp;
    
    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public W9002AgentMaItemDomain() {
    }
    
    /**
     * Getter method for orgCompCd.
     *
     * @return the orgCompCd
     */
    public String getOrgCompCd() {
        return orgCompCd;
    }
    
    /**
     * Setter method for orgCompCd.
     *
     * @param orgCompCd Set for orgCompCd
     */
    public void setOrgCompCd(String orgCompCd) {
        this.orgCompCd = orgCompCd;
    }
    
    /**
     * Getter method for agentCompCd.
     *
     * @return the agentCompCd
     */
    public String getAgentCompCd() {
        return agentCompCd;
    }

    /**
     * Setter method for agentCompCd.
     *
     * @param agentCompCd Set for agentCompCd
     */
    public void setAgentCompCd(String agentCompCd) {
        this.agentCompCd = agentCompCd;
    }

    /**
     * Getter method for comUpdateTimestamp.
     *
     * @return the comUpdateTimestamp
     */
    public Timestamp getComUpdateTimestamp() {
        return comUpdateTimestamp;
    }

    /**
     * Setter method for comUpdateTimestamp.
     *
     * @param comUpdateTimestamp Set for comUpdateTimestamp
     */
    public void setComUpdateTimestamp(Timestamp comUpdateTimestamp) {
        this.comUpdateTimestamp = comUpdateTimestamp;
    }
}
