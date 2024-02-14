/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9018ExpFmlByItemMaDao;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaDomain;
import com.globaldenso.eca0027.core.business.domain.W9018ExpFmlByItemMaItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain;

/**
 *  The DAO implementation class of Export Formalities by Item MA Inquiry.
 * <br />Export Formalities by Item MA Inquiry DAOの実装クラスです。
 *
 * @author $Author: 810833843 $
 * @version $Revision: 9972 $
 */
public class W9018ExpFmlByItemMaDaoImpl extends SqlMapClientDaoSupport implements W9018ExpFmlByItemMaDao {
    
    /**
     * Type in the functional overview of the constructor.
     *
     */
    public W9018ExpFmlByItemMaDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9018ExpFmlByItemMaDao#searchCountTmExpFormalitiItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain)
     */
    public int searchCountTmExpFormalitiItemNo(W9018ExpFmlByItemMaCriteriaDomain criteria)
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9018ExpFmlByItemMa.SearchCountTmExpFormalitiItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9018ExpFmlByItemMaDao#searchForPagingTmExpFormalitiItemNo(com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9018ExpFmlByItemMaItemDomain> searchForPagingTmExpFormalitiItemNo(W9018ExpFmlByItemMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9018ExpFmlByItemMaItemDomain>) getSqlMapClientTemplate()
            .queryForList("W9018ExpFmlByItemMa.SearchForPagingTmExpFormalitiItemNo", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9018ExpFmlByItemMaDao#searchTmPkgMtrl(com.globaldenso.eca0027.core.business.domain.criteria.W9018ExpFmlByItemMaCriteriaDomain)
     */
    public W9018ExpFmlByItemMaDomain searchTmPkgMtrl(W9018ExpFmlByItemMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (W9018ExpFmlByItemMaDomain) getSqlMapClientTemplate()
            .queryForObject("W9018ExpFmlByItemMa.SearchTmPkgMtrl", criteria);
    }

}
