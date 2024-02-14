/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.dao.UserAuthDao;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.domain.criteria.UserAuthCriteriaDomain;

/**
 * This is a DAO implement of a user functional utilization right.
 * <br />ユーザ機能利用権限のDAO実装です。
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class UserAuthDaoImpl extends SqlMapClientDaoSupport implements UserAuthDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public UserAuthDaoImpl() {
    }

    /**
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.common.business.dao.UserAuthDao#searchByCondition(UserAuthCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<UserAuthDomain> searchByCondition(UserAuthCriteriaDomain criteria) throws ApplicationException {
        return (List<UserAuthDomain>) getSqlMapClientTemplate()
                    .queryForList("UserAuth.SearchByCondition", criteria);
    }

}
