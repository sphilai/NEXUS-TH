/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2021 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.TmNxsShipToDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.TmNxsShipToCriteriaDomain;
import com.globaldenso.eca0027.core.auto.integration.TmNxsShipToDaoImpl;

/**
 * The search dao implementation class of Ship to Select Screen.
 * Expanded SACT DAO.
 * <br />
 * Ship to Select画面のDAO実装クラスです。
 * SACTのDAOを拡張。
 * 
 * NL040 ADD
 *
 * @author $Author$
 * @version $Revision$
 */
public class Wt014ShipToSelectDaoImpl extends TmNxsShipToDaoImpl {

    /**
     * constructor.
     */
    public Wt014ShipToSelectDaoImpl() {
    }

    /**
     * {@inheritDoc}.
     */
    @SuppressWarnings("unchecked")
    public List<TmNxsShipToDomain> searchByConditionForPaging(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        return (List<TmNxsShipToDomain>)getSqlMapClientTemplate()
            .queryForList("TmNxsShipTo.SearchByConditionForPagingWt014", criteria);
    }

    /**
     * {@inheritDoc}.
     */
    public int searchCount(TmNxsShipToCriteriaDomain criteria) throws ApplicationException {
        int cnt = (Integer)getSqlMapClientTemplate()
            .queryForObject("TmNxsShipTo.SearchCountWt014", criteria);
        return cnt;
    }
}
