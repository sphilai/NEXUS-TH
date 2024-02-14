/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9009CgmShipToXRefMaDao;
import com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9009CgmShipToXRefMaCriteriaDomain;

/**
 * The search dao implementation class of CIGMA Ship to X-Reference MA Screen.
 * <br />
 * CIGMA Ship to X-Reference MA画面のDAO実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9009CgmShipToXRefMaDaoImpl extends SqlMapClientDaoSupport 
    implements W9009CgmShipToXRefMaDao{

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9009CgmShipToXRefMaDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the SqlMap to search count for the ship to information.
     * 送荷先情報の検索結果件数を取得するSqlMapを呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W9009CgmShipToXRefMaDao#searchCount(
     *      com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaCriteriaDomain)
     */
    public int searchCount(W9009CgmShipToXRefMaCriteriaDomain criteria) throws ApplicationException {

        int cnt = (Integer)getSqlMapClientTemplate().queryForObject(
            "W9009CgmShipToXRefMa.SearchCount", criteria);
        return cnt;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the SqlMap to search for the ship to information.
     * 送荷先情報の検索結果を取得するSqlMapを呼び出します。
     * </pre>
     * 
     * @see com.globaldenso.eca0027.core.business.dao.W9009CgmShipToXRefMaDao#searchByConditionForPaging(
     *      com.globaldenso.eca0027.core.business.domain.W9009CgmShipToXRefMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9009CgmShipToXRefMaDomain> searchByConditionForPaging(
        W9009CgmShipToXRefMaCriteriaDomain criteria) throws ApplicationException {

        return (List<W9009CgmShipToXRefMaDomain>)getSqlMapClientTemplate()
            .queryForList("W9009CgmShipToXRefMa.SearchByConditionForPaging",
                criteria);
    }

}
