/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.domain.criteria;

import com.globaldenso.gscm.framework.business.domain.AbstractDomain;

/**
 * This is a parameter domain of ECA0027_WS_R001.
 * <br />ECA0027_WS_R001のパラメータドメインです。
 *
 * @author $Author: 10088DS50908 $
 * @version $Revision: 9591 $
 */
public class WsR001CriteriaDomain extends AbstractDomain {

    /**
     * Serial version
     * <br />シリアルバージョン
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Parameter domain of ECA0027_WS_R001
     *  <br />ECA0027_WS_R001のパラメータドメイン
     */
    private WsR001MigrationCaseMarkRootCriteriaDomain migrationCaseMarkRoot;
    
    /**
     * constructor
     * <br />デフォルトコンストラクタです。
     */
    public WsR001CriteriaDomain() {
    }

    /**
     * Getter method for migrationCaseMarkRoot.
     *
     * @return the migrationCaseMarkRoot
     */
    public WsR001MigrationCaseMarkRootCriteriaDomain getMigrationCaseMarkRoot() {
        return migrationCaseMarkRoot;
    }

    /**
     * Setter method for migrationCaseMarkRoot.
     *
     * @param migrationCaseMarkRoot Set for migrationCaseMarkRoot
     */
    public void setMigrationCaseMarkRoot(
        WsR001MigrationCaseMarkRootCriteriaDomain migrationCaseMarkRoot) {
        this.migrationCaseMarkRoot = migrationCaseMarkRoot;
    }


}
