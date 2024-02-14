/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.filter;

import static java.util.Arrays.asList;
import static javax.servlet.http.HttpServletResponse.SC_REQUEST_TIMEOUT;
import static javax.servlet.http.HttpServletResponse.SC_UNAUTHORIZED;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.jersey.core.util.Base64;

/**
 * Filter for user authentication on the development environment
 * <br />開発環境でユーザ認証を行うためのフィルタです。
 * <pre>
 * 
 * This filter operates as follows.
 * - In the case of development environment
 *   - In the case of timeout
 *     An error page is displayed.
 *
 *   - In the attested case
 *     Following processing is continued.
 *
 *   - In the case of not attesting
 *     - In the case of BASIC attestation (Web service is assumed)  
 *       Following processing will be continued if the entered user name and password are in agreement with the contents of the password file.
 *       If not in agreement, a 401 Unauthorized response is returned.
 *
 *     - When other (a Web screen is assumed)
 *       - In the case of GET request
 *         A login screen is displayed.
 *
 *       - In the case of POST request
 *         Following processing will be continued if the entered DSC-ID and password are in agreement with the contents of the password file.
 *         If not in agreement, trial frequency is set as Cookie and a login screen is re-displayed.
 *
 *         However, a login screen is re-displayed when this is over the number of times of the maximum attestation (even if a DSC-ID and a password are right).
 * - In the cases of other than the above (acting before the audience and semi- real environment)
 *   Nothing is done but following processing is continued.(He leaves attestation to real SiteMinder)
 *
 * Judge the judgment of being development environment by the host name of request URL.
 * By default, although this is localhost, it can change by an initialization parameter (localhost).
 * When you carry out the plural specifications of the host name, please divide and describe with a comma.
 *
 * <code>
 * &lt;init-param&gt;
 *   &lt;param-name&gt;localhost&lt;/param-name&gt;
 *     &lt;param-value&gt;<i> host name 1</i>, <i> host name 2</i> --&lt;/param-value&gt;
 * &lt;/init-param&gt;
 * </code>
 *
 * Please divide and describe a DSC-ID and a password with a comma to a password file.
 * Please specify the path of a password file by an initialization parameter (passwordFile).
 *
 * <code>
 * &lt;init-param&gt;
 *   &lt;param-name&gt;passwordFile&lt;/param-name&gt;
 *     /path [ of a &lt;param-value&gt;<i> password file ] <i> &lt;/param-value&gt;
 * &lt;/init-param&gt;
 * </code>
 *
 * Please specify the login page by an initialization parameter (loginPage).
 *
 * <code>
 * &lt;init-param&gt;
 *   &lt;param-name&gt;loginPage&lt;/param-name&gt;
 *     /path [ of a &lt;param-value&gt;<i> password file ] <i> &lt;/param-value&gt;
 * &lt;/init-param&gt;
 * </code>
 *
 * このフィルタは次のように動作します。
 * - 開発環境の場合
 *   - タイムアウトの場合
 *     エラーページを表示する。
 *   
 *   - 認証済みの場合
 *     後続の処理を継続する。
 *   
 *   - 未認証の場合
 *     - BASIC認証の場合 (Webサービスを想定)
 *       入力されたユーザ名・パスワードがパスワードファイルの内容と一致すれば、後続の処理を継続する。
 *       一致しなければ、401 Unauthorizedレスポンスを返す。
 *
 *     - それ以外の場合 (Web画面を想定)
 *       - GETリクエストの場合
 *         ログイン画面を表示する。
 *         
 *       - POSTリクエストの場合
 *         入力されたDSC-ID・パスワードがパスワードファイルの内容と一致すれば、後続の処理を継続する。
 *         一致しなければ、試行回数をCookieに設定して、ログイン画面を再表示する。
 *         
 *         ただし、最大認証回数を超えていた場合、(DSC-ID・パスワードが正しくても)ログイン画面を再表示する。
 * - 上記以外(本番・準本番環境)の場合
 *   何もせず、後続の処理を継続する。(認証は本物のSiteMinderに任せる)
 *
 * 開発環境かどうかの判定は、リクエストURLのホスト名で判断します。
 * デフォルトでは、localhost になっていますが、初期化パラメータ(localhost)で変更できます。
 * ホスト名を複数指定する場合、カンマで区切って記述してください。
 *
 * <code>
 * &lt;init-param&gt;
 *   &lt;param-name&gt;localhost&lt;/param-name&gt;
 *   &lt;param-value&gt;<i>ホスト名1</i>,<i>ホスト名2</i>,…&lt;/param-value&gt;
 * &lt;/init-param&gt;
 * </code>
 * 
 * パスワードファイルにはDSC-IDとパスワードをカンマで区切って記述してください。
 * パスワードファイルのパスは初期化パラメータ(passwordFile)で指定してください。
 * 
 * <code>
 * &lt;init-param&gt;
 *   &lt;param-name&gt;passwordFile&lt;/param-name&gt;
 *   &lt;param-value&gt;<i>パスワードファイルのパス</i>&lt;/param-value&gt;
 * &lt;/init-param&gt;
 * </code>
 * 
 * ログインページは初期化パラメータ(loginPage)で指定してください。
 *
 * <code>
 * &lt;init-param&gt;
 *   &lt;param-name&gt;loginPage&lt;/param-name&gt;
 *   &lt;param-value&gt;<i>パスワードファイルのパス</i>&lt;/param-value&gt;
 * &lt;/init-param&gt;
 * </code>
 *
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class PseudoAuthenticationFilter implements Filter {
    
    /**
     * The maximum trial frequency
     * <br />最大試行回数
     */
    protected static final int MAX_TRY_NO = 5;
    
    /**
     * Servlet context
     * <br />サーブレット・コンテキスト
     */
    protected ServletContext context;

    /**
     * Server Name this is considered that is a local host
     * <br />ローカルホストとみなすサーバ名
     */
    protected List<String> localhosts = new ArrayList<String>(asList("localhost"));

    /**
     * Password information
     * <br />パスワード情報
     */
    protected Map<String, String> credentials = new HashMap<String, String>();
    
    /**
     * Login page
     * <br />ログインページ
     */
    protected String loginPage;
    
    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public PseudoAuthenticationFilter() {
    }
    
    /**
     * {@inheritDoc}
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    public void init(FilterConfig config) throws ServletException {
        
        context = config.getServletContext();
        
        String localhost = config.getInitParameter("localhost");
        if (localhost != null) {
            localhosts.addAll(asList(localhost.split(",\\s*")));
        }

        String passwordFile = config.getInitParameter("passwordFile");
        if (passwordFile != null) {
            readPasswordFile(passwordFile);
        }
        
        loginPage = config.getInitParameter("loginPage");
    }

    /**
     * {@inheritDoc}
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {}

    /**
     * {@inheritDoc}
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        doFilter((HttpServletRequest) request, (HttpServletResponse) response, chain);
    }

    /**
     * Read a password file.
     * <br />パスワードファイルを読み込みます。
     *
     * @param path The path of a password file<br />パスワードファイルのパス
     * @throws ServletException When the read of a password file goes wrong<br />パスワードファイルの読み込みに失敗した場合
     */
    protected void readPasswordFile(String path) throws ServletException {
        BufferedReader reader = null;
        String line = null;
        
        try {
            reader = getBufferedReader(path, "UTF-8");
            
            while ((line = reader.readLine()) != null) {
                String[] s = line.split(",\\s*");
                credentials.put(s[0], s[1]);
            }
        } catch (IOException e) {
            throw new ServletException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close(); 
                } catch (IOException e) {
                    throw new ServletException(e);
                }
            }
        }
    }
    
    /**
     * Perform attestation control according to environment.
     * <br />環境に応じた認証制御を行います。
     * <pre>
     * In the case of development environment, perform the same attestation control as SiteMinder.
     * When other, continue following processing.
     * 開発環境の場合、SiteMinderと同様の認証制御を行います。
     * それ以外の場合は後続の処理を継続します。
     * </pre>
     * 
     * @param request HTTP request<br />HTTPリクエスト
     * @param response HTTP response<br />HTTPレスポンス
     * @param chain Filter chain<br />フィルタ・チェイン
     * @throws IOException When IOException occurs at the time of a forward<br />フォワード時にIOExceptionが発生した場合
     * @throws ServletException When ServletException occurs at the time of a forward<br />フォワード時にServletExceptionが発生した場合
     */
    protected void doFilter(HttpServletRequest request, HttpServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        // 開発環境の場合
        if (isLocalhost(request)) {
            // タイムアウト
            if (isRequestTimeout(request)) {
                response.sendError(SC_REQUEST_TIMEOUT);
            // 認証済み
            } else if (isAuthenticated(request)) {
                // 後続の処理を継続
                doFilter(chain, request, response);
            // 未認証
            } else {
                // BASIC認証の場合
                if (isBasicAuthentication(request)) {
                    // ユーザ認証
                    if (authenticateBasic(request)) {
                        // OK→後続の処理を継続
                        doFilter(chain, request, response);
                    } else {
                        // NG→401レスポンスを送信
                        response.sendError(SC_UNAUTHORIZED);
                    }
                } else {
                    // GETリクエストの場合
                    if (request.getMethod().equals("GET")) {
                        // ログイン画面の表示
                        renderLoginPage(request, response, chain, 0);
                    // POSTリクエストの場合
                    } else {
                        // ユーザ認証
                        if (authenticateForm(request)) {
                            // OK→後続の処理を継続
                            doFilter(chain, request, response);
                        } else {
                            // NG→ログイン画面を再表示
                            renderLoginPage(request, response, chain, getTryNo(request) + 1);
                        }
                    }
                }
            }
        // 上記以外の場合
        } else {
            // 後続の処理を継続
            chain.doFilter(request, response);
        }
    }

    /**
     * Judge whether this is development environment.
     * <br />開発環境かどうかを判定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return If this is development environment, they are true, otherwise, false.<br />開発環境であればtrue、そうでなければfalse
     */
    protected boolean isLocalhost(HttpServletRequest request) {
        return localhosts.contains(request.getServerName());
    }

    /**
     * Judge whether the request timed out.
     * <br />リクエストがタイムアウトしたかどうかを判定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return If it has timed out, they are true, otherwise, false.<br />タイムアウトしていればtrue、そうでなければfalse
     */
    protected boolean isRequestTimeout(HttpServletRequest request) {
        if (request.isRequestedSessionIdFromCookie() || request.isRequestedSessionIdFromURL()) {
            return !request.isRequestedSessionIdValid();
        } else {
            return false;
        }
    }

    /**
     * Judge whether this is finishing [ attestation ].
     * <br />認証済みかどうかを判定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return If this is ending with attestation, they are true, otherwise, false.<br />認証済みであればtrue、そうでなければfalse
     */
    protected boolean isAuthenticated(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        return session != null && session.getAttribute("AUTHENTICATED") != null;
    }

    /**
     * Judge whether this is a request of BASIC attestation.
     * <br />BASIC認証のリクエストかどうかを判定します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return If this is a request of BASIC attestation, they are true, otherwise, false.<br />BASIC認証のリクエストであればtrue、そうでなければfalse
     */
    protected boolean isBasicAuthentication(HttpServletRequest request) {
        return request.getHeader("Authorization") != null;
    }
    
    /**
     * Perform user authentication.(Basic attestation)
     * <br />ユーザ認証を行います。(Basic認証)
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return If a user name and a password are right, they are true, otherwise, false.<br />ユーザ名とパスワードが正しければtrue、そうでなければfalse
     */
    protected boolean authenticateBasic(HttpServletRequest request) {
        String[] credential = getCredential(request);
        
        String username = credential[0];
        String password = credential[1];
        
        return authenticate(request, username, password);
    }
    
    /**
     * Decode the user name and password which were encoded Base64.
     * <br />Base64エンコードされたユーザ名とパスワードをデコードします。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return The user name and password which were decoded<br />デコードしたユーザ名とパスワード
     */
    protected String[] getCredential(HttpServletRequest request) {
        String encodedCredential = request.getHeader("Authorization").split(" ")[1];
        String decodedCredential = Base64.base64Decode(encodedCredential);
        
        return decodedCredential.split(":");
    }

    /**
     * Perform user authentication.(Form attestation)
     * <br />ユーザ認証を行います。(フォーム認証)
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return If a user name and a password are right, they are true, otherwise, false.<br />ユーザ名とパスワードが正しければtrue、そうでなければfalse
     */
    protected boolean authenticateForm(HttpServletRequest request) {
        // 最大認証回数を超えた場合
        if (MAX_TRY_NO <= getTryNo(request)) {
            return false;
        }

        // ユーザ名、パスワードの取得
        String username = request.getParameter("USER");
        String password = request.getParameter("PASSWORD");
        
        // ユーザ認証
        return authenticate(request, username, password);
    }
    
    /**
     * Perform user authentication.(Validation with a password file)
     * <br />ユーザ認証を行います。(パスワードファイルとの検証)
     * <pre>
     * If a user name and a password are right, save an attested marker at a session.
     * ユーザ名とパスワードが正しければ、セッションに認証済みマーカを保存します。
     * </pre>
     * 
     * @param request HTTP request<br />HTTPリクエスト
     * @param username User name<br />ユーザ名
     * @param password Password<br />パスワード
     * @return If a user name and a password are right, they are true, otherwise, false.<br />ユーザ名とパスワードが正しければtrue、そうでなければfalse
     */
    protected boolean authenticate(HttpServletRequest request, String username, String password) {
        if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            request.getSession().setAttribute("AUTHENTICATED", username);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Carry out the lap of the HTTP request and continue following processing.(Only development environment)
     * <br />HTTPリクエストをラップして後続の処理を継続します。(開発環境のみ)
     *
     * @param chain Filter chain<br />Filterチェイン
     * @param request HTTP request<br />HTTPリクエスト
     * @param response HTTP response<br />HTTPレスポンス
     * @throws IOException When an I/O error occurs<br />I/Oエラーが発生した場合
     * @throws ServletException When an error occurs<br />エラーが発生した場合
     */
    protected void doFilter(FilterChain chain, HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
        chain.doFilter(new PseudoAuthenticationRequestWrapper(request), response);
    }
    
    /**
     * Output a login screen.
     * <br />ログイン画面を出力します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param response HTTP response<br />HTTPレスポンス
     * @param chain Filter chain<br />Filterチェイン
     * @param tryNo Trial frequency<br />試行回数
     * @throws IOException When IOException occurs at the time of a forward<br />フォーワード時にIOExceptionが発生した場合
     * @throws ServletException When ServletException occurs at the time of a forward<br />フォワード時にServletExceptionが発生した場合
     */
    protected void renderLoginPage(HttpServletRequest request, HttpServletResponse response,
            FilterChain chain, int tryNo) throws IOException, ServletException {

        // 文字コード、Content-Typeの設定
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        // 試行回数の設定
        if (0 < tryNo) {
            response.addCookie(new Cookie("SMTRYNO", tryNo + ""));
        }

        BufferedReader reader = null;
        PrintWriter writer = null;

        try {
            // ストリームの作成
            reader = getBufferedReader(loginPage, "UTF-8");
            writer = response.getWriter();

            String line = null;
            boolean skip = true;

            // ログイン画面の出力 (ファイルの先頭部分はSiteMinder向けのコメントのため出力しない)
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("<!DOCTYPE") || line.startsWith("<html>")) {
                    skip = false;
                }
                if (!skip) {
                    writer.println(line);
                }
            }
        } finally {
            // ストリームのクローズ
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }

    /**
     * Create the BufferedReader object for reading the specified resource.
     * <br />指定されたリソースを読み込むためのBufferedReaderオブジェクトを作成します。
     *
     * @param path The path of a resource<br />リソースのパス
     * @param encoding The character code of a resource<br />リソースの文字コード
     * @return The created BufferedReader object<br />作成したBufferedReaderオブジェクト
     * @throws IOException When a create of a BufferedReader object goes wrong<br />BufferedReaderオブジェクトの作成に失敗した場合
     */
    protected BufferedReader getBufferedReader(String path, String encoding) throws IOException {
        return new BufferedReader(
            new InputStreamReader(context.getResourceAsStream(path), encoding));
    }

    /**
     * Acquire trial frequency.
     * <br />試行回数を取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @return Trial frequency (this is 0 in the case of the first time)<br />試行回数 (初回の場合は0)
     */
    protected int getTryNo(HttpServletRequest request) {
        return Integer.parseInt(getCookie(request, "SMTRYNO", "0"));
    }

    /**
     * Acquire the VALUE of Cookie.
     * <br />Cookieの値を取得します。
     *
     * @param request HTTP request<br />HTTPリクエスト
     * @param name The name of Cookie<br />Cookieの名前
     * @param defaultValue Default value<br />デフォルト値
     * @return VALUE of specified Cookie (if not found default value)<br />指定されたCookieの値 (見つからなければデフォルト値)
     */
    protected String getCookie(HttpServletRequest request, String name, String defaultValue) {
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals(name)) {
                    return cookie.getValue();
                }
            }
        }
        return defaultValue;
    }
}
