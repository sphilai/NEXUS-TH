/*
 * PROJECT:GSCM 共通機能群
 * PROJECT:GSCM Common Functions
 * 
 * MainMenuDao DAOクラス
 * MainMenuDao DAO Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.MenuDomain;
import com.globaldenso.gscm.framework.business.domain.UserDomain;

/**
 * MainMenuDao DAOクラス
 * MainMenuDao DAO Class
 * <p>
 * MainMenuDao DAOクラスです。
 * MainMenuDao DAO Class
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface MainMenuDao {

    /**
     * 主キーを元にテーブルのデータを検索し、検索結果をリスト形式で返却します。
     * Search table data with primary key and return serach result with list type
     * 
     * @param searchUserDomain SearchUserDomain クラス
     * @param searchUserDomain SearchUserDomain class
     * @return SzuHistoryDomainのDomainクラスのList
     * @return List of SzuHistoryDomain class
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException ApplicationException
     */
    public List<MenuDomain> searchByMainMenu(UserDomain searchUserDomain)
        throws ApplicationException;
}
