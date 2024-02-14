/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9024ItemNoAplyStrtDtItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9024ItemNoAplyStrtDtCriteriaDomain;

/**
 * DAO interface of Item No. Apply Start Date Refer & Register.
 * <br />Item No. Apply Start Date Refer & RegisterのDAOインタフェースです。
 * <pre>
 * bean id: W9024ItemNoAplyStrtDtDao
 * </pre>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10963 $
 */
public interface W9024ItemNoAplyStrtDtDao {

    /**
     * Get the search result data.
     * <br />検索結果データを取得します。
     * <pre>
     * - Search of the target data
     * 
     * - Return of the search results
     *   Return in W9024ItemNoAplyStrtDtItemDomain search results.
     * </pre>
     * <pre>
     * - 対象データの検索
     *     
     * - 検索結果の返却
     *     検索結果を{@link W9024ItemNoAplyStrtDtItemDomain}で返却します。
     * </pre>
     * 
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return Search results domain<br />
     * 検索結果ドメイン
     * @throws ApplicationException If an exception occurs.<br />
     * 例外が発生した場合
     */
    public W9024ItemNoAplyStrtDtItemDomain searchTmPkgSpecRev(W9024ItemNoAplyStrtDtCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get BRANCH.
     * <br />枝番を取得
     *
     * @param criteria criteria Search conditions domain<br />
     * 検索条件ドメイン
     * @return BRANCH<br />
     * 枝番
     * @throws ApplicationException If an exception occurs.<br />
     * 例外が発生した場合
     */
    public int serachTmPkgSpecRevHis(W9024ItemNoAplyStrtDtCriteriaDomain criteria)
        throws ApplicationException;
}
