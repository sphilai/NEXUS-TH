/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 *
 * 画面情報を削除するFilterクラス
 * Delete Screen Information Filter Class
 *
 * Version.
 * 1.0.0
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;

/**
 * 画面情報を削除するFilterクラス
 * Delete Screen Information Filter Class
 * <p>
 * DensoContext汎用エリアの画面情報を削除する。
 * Delete screen information of DensoContext common area
 * </p>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 12899 $
 */
public class RemoveScreenInfoFilter implements Filter {
    /**
     * デフォルトコンストラクタ。
     * Default constructor
     */
    public RemoveScreenInfoFilter() {
    }

    /**
     * フィルタが破棄されるタイミングで実行されるメソッド。
     * Method executed when a filter is destroied
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {
    }

    /**
     * 画面情報削除処理
     * Process for deleting screen information
     * <p>
     * DensoContext汎用エリアに管理する画面情報を削除する。<br/>
     * Delete screen information managed on DensoContext common area<br/>
     * ※リクエストパラメータに指定される「windowId」に該当する画面情報が対象となる。
     * ※Target as screen information fallen under windowId specified to request argument
     * </p>
     * @param request ServletRequest
     * @param response ServletResponse
     * @param chain FilterChain
     * @throws IOException IOException
     * @throws ServletException ServletException
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        String windowId = request.getParameter("windowId");

        if (!CheckUtil.isBlankOrNull(windowId)) {
            WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(windowId);
            if (null != windowInfo) {
                windowInfo.setScreenIdList(new ArrayList<String[]>());
                windowInfo.setScreenInfo(new HashMap<String, ScreenInfoDomain>());
            }
        }
        chain.doFilter(request, response);
    }

    /**
     * フィルタ初期処理
     * Process for initializing filter
     * @param config FilterConfig
     * @throws ServletException ServletException
     */
    public void init(FilterConfig config) throws ServletException {
    }
}
