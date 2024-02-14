/*
 * PROJECT:GSCM 共通機能群
 * PROJECT:GSCM Common Functions
 * 
 * MainMenuDao のDAO実装クラス
 * DAO implement class of MainMenuDao
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.dao.MainMenuDao;
import com.globaldenso.gscm.framework.business.domain.MenuDomain;
import com.globaldenso.gscm.framework.business.domain.UserDomain;

/**
 * MainMenu の検索用DAO実装クラスです。<BR>
 * DAO implement class for search MainMenu<BR>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class MainMenuDaoImpl extends SqlMapClientDaoSupport implements MainMenuDao {

    /**
     * SqlMap名。
     * SqlMap name
     */
    private static final String SQL_ID = "MainMenu";

    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public MainMenuDaoImpl() {
    }

    /**
     * {@inheritDoc}
     * 
     * @see com.globaldenso.mbom.business.dao.MainMenuDao#searchByMainMenu(com.globaldenso.mbom.business.domain.UserDomain)
     */
    @SuppressWarnings("unchecked")
    public List<MenuDomain> searchByMainMenu(UserDomain domain) throws ApplicationException {
        return getSqlMapClientTemplate().queryForList(SQL_ID + ".SearchByMainMenu", domain);
    }

}
