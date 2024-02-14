/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaItemDomain;

/**
 * <pre>
 * bean id: W9022InvTplMaDao
 * </pre>
 * 
 * @author $Author: 810833613 $
 * @version $Revision: 7765 $
 */
public interface W9022InvTplMaDao {
    
    /**
     * Get the search result data.
     * <br />検索結果データを取得します。
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search number<br />
     * 検索件数
     * @throws ApplicationException ApplicationException
     */
    public int searchCountTmInvTpl(W9022InvTplMaCriteriaDomain criteria) throws ApplicationException;

    /**
     * Get the search result data.
     * <br />検索結果データを取得します。
     * @param criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Domain list of Master Maintenance<br />
     * マスタメンテナンスのドメインリスト
     * @throws ApplicationException ApplicationException
     */
    public List<? extends W9022InvTplMaItemDomain> searchForPagingTmInvTpl(W9022InvTplMaCriteriaDomain criteria)
        throws ApplicationException;
}