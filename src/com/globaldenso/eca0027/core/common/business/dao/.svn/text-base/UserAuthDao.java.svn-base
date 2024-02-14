/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.domain.criteria.UserAuthCriteriaDomain;

/**
 * DAO Interface For the Authority of User's Function
 * <br />ユーザ機能利用権限のDAOインタフェースです。
 * <pre>
 * bean id: userAuthDao
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface UserAuthDao {

    /**
     * Search the privileges granted to the login-user, and return a list of them
     * <br />ログインユーザに付与されている権限を検索し、検索結果をリスト形式で返却します。
     * 
     * 
     * @param criteria - search result
     * @return list of authority for user's function
     * @throws ApplicationException - exception of application infrastructure
     */
    public List<UserAuthDomain> searchByCondition(UserAuthCriteriaDomain criteria) throws ApplicationException;
}
