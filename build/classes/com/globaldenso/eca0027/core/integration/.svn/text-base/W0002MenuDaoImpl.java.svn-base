/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.W0002MenuDao;
import com.globaldenso.eca0027.core.business.domain.W0002CigmaStatusDomain;
import com.globaldenso.eca0027.core.business.domain.W0002MenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002OtherMenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002ServerDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002CigmaStatusCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002MenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002OtherMenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002ServerCriteriaDomain;


/**
 * The DAO implementation class for menu screen
 * <br />メニュー画面のDAO実装クラスです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10657 $
 */
public class W0002MenuDaoImpl extends SqlMapClientDaoSupport implements W0002MenuDao {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public W0002MenuDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W0002MenuDao#searchVmMenu(com.globaldenso.eca0027.core.business.domain.criteria.W0002MenuCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W0002MenuDomain> searchVmMenu(W0002MenuCriteriaDomain criteria) throws ApplicationException {
        return (List<? extends W0002MenuDomain>) getSqlMapClientTemplate()
            .queryForList("W0002Menu.SearchVmMenu", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W0002MenuDao#searchTmOtherSysLink(com.globaldenso.eca0027.core.business.domain.criteria.W0002OtherMenuCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W0002OtherMenuDomain> searchTmOtherSysLink(W0002OtherMenuCriteriaDomain criteria) throws ApplicationException {
        return (List<W0002OtherMenuDomain>) getSqlMapClientTemplate()
            .queryForList("W0002Menu.SearchTmOtherSysLink", criteria);
    }
    
    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W0002MenuDao#searchTmServer(com.globaldenso.eca0027.core.business.domain.criteria.W0002ServerCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W0002ServerDomain> searchTmServer(W0002ServerCriteriaDomain criteria) throws ApplicationException {
        return (List<W0002ServerDomain>) getSqlMapClientTemplate()
            .queryForList("W0002Menu.SearchTmServer", criteria);
    }

    /**
     * {@inheritDoc}
     * @see com.globaldenso.eca0027.core.business.dao.W0002MenuDao#searchTmCigmaEnv(com.globaldenso.eca0027.core.business.domain.criteria.W0002CigmaStatusCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<? extends W0002CigmaStatusDomain> searchTmCigmaEnv(W0002CigmaStatusCriteriaDomain criteria) throws ApplicationException {
        return (List<W0002CigmaStatusDomain>) getSqlMapClientTemplate()
            .queryForList("W0002Menu.SearchTmCigmaEnv", criteria);
    }

}
