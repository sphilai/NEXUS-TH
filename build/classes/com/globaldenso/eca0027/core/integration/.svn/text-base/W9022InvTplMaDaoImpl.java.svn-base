/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W9022InvTplMaDao;
import com.globaldenso.eca0027.core.business.domain.criteria.W9022InvTplMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9022InvTplMaItemDomain;

/**
 * The DAO implementation class of Invoice Template MA Inquiry.
 * <br />Invoice Template MA Inquiry DAOの実装クラスです。.
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class W9022InvTplMaDaoImpl extends SqlMapClientDaoSupport implements W9022InvTplMaDao {

    /**
     * デフォルトコンストラクタです。
     * <br />Default constructor
     */
    public W9022InvTplMaDaoImpl() {
        super();
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9022InvTplMaDao#searchCountTmInvTpl(W9022InvTplMaCriteriaDomain)
     */
    public int searchCountTmInvTpl(W9022InvTplMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (Integer) getSqlMapClientTemplate()
            .queryForObject("W9022InvTplMa.SearchCountTmInvTpl", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W9022InvTplMaDao#searchForPagingTmInvTpl(W9022InvTplMaCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W9022InvTplMaItemDomain> searchForPagingTmInvTpl(W9022InvTplMaCriteriaDomain criteria) 
        throws ApplicationException {
        return (List<? extends W9022InvTplMaItemDomain>) getSqlMapClientTemplate()
            .queryForList("W9022InvTplMa.SearchForPagingTmInvTpl", criteria);
    }
}
