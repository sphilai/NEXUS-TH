/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * 画面共通情報設定クラス用interface
 * Interface for Screen Common Information Setting Class
 * 
 * Version.
 * 1.0.1
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;

/**
 * 画面共通情報設定クラス用interface
 * Interface for Screen Common Information Setting Class
 * <p>
 * 業務アプリにて各ウィンドウ毎に保持する画面共通情報の元となる情報を作成するクラスのinterface<br/>
 * GSCM共通基盤が用意する画面共通情報設定Filter(com.globaldenso.gscm.framework.filter.CommonInfoFilter)<br/>
 * 内で呼び出すメソッドは、当interfaceのメソッドを実行するので、画面共通情報設定Filterを利用し、画面共通情報を設定する際は<br/>
 * 必ず当interfaceを利用する。
 * Interface class for creating information of screen common information resource which maintained by work application each screen<br/>
 * Method invoked in screen common information setting filter(com.globaldenso.gscm.framework.filter.CommonInfoFilter) created by GSCM common<br/>
 * executes this interface<br/>
 * Because of this,when set screen common information,use this interface
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface CreateCommonInfo {
    /**
     * 画面共通情報設定メソッド
     * Method of setting screen common information
     * <p>
     * GSCM共通基盤が用意する画面共通情報設定Filterが実行するメソッド。<br/>
     * 業務アプリは、当メソッドに画面共通情報へ設定するロジックを実装する。
     * Method of invoked from screen commom information setting filter created by GSCM common<br/>
     * Work application implements logic setting screen common information to this method
     * </p>
     * 
     * @param request ServletRequest
     * @param response ServletResponse
     * @param commonInfo CommonInfoDomain
     * @return 画面共通情報
     * @return screen common information
     * @throws ApplicationException アプリケーション例外
     * @throws ApplicationException ApplicationException
     */
    public Object execute(ServletRequest request, ServletResponse response, CommonInfoDomain commonInfo) throws ApplicationException;
}
