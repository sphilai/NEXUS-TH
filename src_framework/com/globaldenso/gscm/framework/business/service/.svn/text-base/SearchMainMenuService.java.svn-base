/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * SearchMainMenuServiceクラス
 * SearchMainMenuService Class
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.AbstractDomain;
import com.globaldenso.gscm.framework.business.domain.MenuDomain;

/**
 * SearchMainMenu のServiceインターフェースです。<BR>
 * Interface of Service for SearchMainMenu<BR>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface SearchMainMenuService {

    /**
     * 引数を元にメニュー原単位を検索し、検索結果をListで返却します。
     * Search menu master with the arguments,and return the search result by list
     * 
     * @param domain 引数
     * @param domain Argument
     * @return 実行結果
     * @return Execution result
     * @throws ApplicationException アプリ基盤のアプリケーション例外です。
     * @throws ApplicationException Application Exception
     */
    public List<MenuDomain> search(AbstractDomain domain) throws ApplicationException;

}
