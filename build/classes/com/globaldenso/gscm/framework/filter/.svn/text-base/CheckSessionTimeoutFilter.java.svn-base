/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * Version.
 * 1.0.1
 * 
 * Copyright (c) 2017 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * [EN] This is Servlet Filter to check session timeout.<br>
 * [JP] セッションタイムアウトをチェックするためのフィルタです。
 * <p>
 * [EN] If a session timeout occurs, a session timeout error screen will be displayed.<br>
 * [JP] セッションタイムアウトが発生した場合、セッションタイムアウトのエラー画面を表示します。
 * </p>
 * 
 * @author $Author: 81083S603016 $
 * @version $Revision: 6800 $
 * @see javax.servlet.Filter
 */
public class CheckSessionTimeoutFilter implements Filter {

    /**
     * [EN] Page to be displayed at session timeout.<br>
     * [JP] セッションタイムアウト時に表示するページ。
     */
    private static final String SESSION_TIMEOUT_PAGE = "/WEB-INF/jsp/gscm/framework/sessionTimeout.jsp";

    /**
     * [EN] Default constructor.<br>
     * [JP] デフォルトコンストラクタ。
     */
    public CheckSessionTimeoutFilter() {
    }

    /**
     * {@inheritDoc}
     *
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig config) throws ServletException {
        // no-op
    }

    /**
     * {@inheritDoc}
     *
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(
            ServletRequest request, ServletResponse response, FilterChain chain) throws 
            IOException, ServletException {
        
        HttpServletRequest httpRequest = HttpServletRequest.class.cast(request);
        
        // セッションタイムアウトの場合
        if (httpRequest.getRequestedSessionId() != null && !httpRequest.isRequestedSessionIdValid()) {
            // エラー画面を表示
            HttpServletResponse.class.cast(response).setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            request.getRequestDispatcher(SESSION_TIMEOUT_PAGE).forward(request, response);
            return;
        }
        
        chain.doFilter(request, response);
    }

    /**
     * {@inheritDoc}
     *
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {
        // no-op
    }

}
