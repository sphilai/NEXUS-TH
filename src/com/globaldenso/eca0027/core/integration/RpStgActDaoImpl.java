/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.RpStgActDao;
import com.globaldenso.eca0027.core.business.domain.L4002TtPltzByPalletCartonTypDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L4002TtPltzByPalletCartonTypCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L7001TtShippingActByHeaderCriteriaDomain;

/**
 * The DAO implementation class to use for creating the form of L4000 series.<br />
 * L4000番台の帳票作成時に使用するDAO実装クラスです。
 *
 * @version $Revision$
 */
public class RpStgActDaoImpl extends SqlMapClientDaoSupport implements RpStgActDao {

    /**
     * Default constructor.<br />
     * デフォルトコンストラクタです。
     */
    public RpStgActDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.RpStgActDao#searchTtShippingActByHeader(L7001TtShippingActByHeaderCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<L4002TtPltzByPalletCartonTypDomain> searchTtPltzByPalletCartonTyp(L4002TtPltzByPalletCartonTypCriteriaDomain condition) throws ApplicationException {
        return (List<L4002TtPltzByPalletCartonTypDomain>) getSqlMapClientTemplate()
               .queryForList("RpStgAct.SearchTtPltzByPalletCartonTyp", condition);
    }
    
}
