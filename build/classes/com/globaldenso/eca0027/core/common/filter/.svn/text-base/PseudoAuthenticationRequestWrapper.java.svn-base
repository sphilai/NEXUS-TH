/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * {@link HttpServletRequestWrapper} that return the DSC-ID as the value of the "UID" for HTTP header
 * <br />HTTPヘッダ「UID」の値としてDSC-IDを返す{@link HttpServletRequestWrapper}です。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class PseudoAuthenticationRequestWrapper extends HttpServletRequestWrapper {
    /** 
     * DSC-ID for the authenticated user <br />
     * 認証されたユーザのDSC-ID 
     */
    protected String dscId;

    /**
     * Constructor to create an object of the class based on the HTTP request
     * <br />HTTPリクエストをもとに当該クラスのオブジェクトを生成するためのコンストラクタです。
     *
     * @param request - HTTP request
     */
    public PseudoAuthenticationRequestWrapper(HttpServletRequest request) {
        super(request);

        // Acquisition of DSC-ID
        // DSC-IDの取得
        this.dscId = (String) request.getSession(false).getAttribute("AUTHENTICATED");
    }

    /**
     * Get the value of the HTTP header that is specified
     * <br />指定されたHTTPヘッダの値を取得します。
     * <pre>
     * If the name is same as UID, returns the DSC-ID that has been authenticated
     * Otherwise, return the value of the HTTP header corresponding
     * 
     * nameがUIDの場合、認証されたDSC-IDを返します。
     * それ以外の場合は、対応するHTTPヘッダの値を返します。
     * </pre>
     * 
     * @param name - HTTP header name
     * @return value of the HTTP header
     */
    @Override
    public String getHeader(String name) {
        if (name.equals("UID")) {
            return dscId;
        } else {
            return super.getHeader(name);
        }
    }
}