/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 * 
 * ヘッダJSP用のクラス
 * Class for Header JSP
 * 
 * Version.
 * 1.0.0
 * 
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.tiles.ComponentContext;
import org.apache.struts.tiles.Controller;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

/**
 * ヘッダJSP用クラス
 * Class for Header JSP
 * <p>
 * ヘッダJSPへ表示する内容を取得する。<br/>
 * ※GSCM共通基盤がデフォルトで用意する内容は、責任会社略名をCommonInfoDomainクラスより取得する処理となる。<br/>
 * 本処理では業務アプリとして問題がある場合は、業務にて適宜、変更を行う。
 * Get content displayed at header JSP<br/>
 * ※Content GSCM common creates default is process getting company abbreviation from CommonInfoDomain class<br/>
 * When problem as work application occurs in this process,modify by work
 * </p>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class HeaderController implements Controller {
    
    /**
     * デフォルトコンストラクタです。
     * Default constructor
     *
     */
    public HeaderController() {
    }

    /**
     * ヘッダJSPの内容を編集するメソッド。 {@inheritDoc}
     * Method editting content of Header JSP {@inheritDoc}
     * 
     * @see org.apache.struts.tiles.Controller#execute(org.apache.struts.tiles.ComponentContext,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse,
     *      javax.servlet.ServletContext)
     */
    public void execute(ComponentContext context, HttpServletRequest request,
        HttpServletResponse response, ServletContext servletContext) throws Exception {
        String windowId = request.getParameter("windowId");
        String ownerCompCd = "";
        String ownerCompName = "";
        String userName = "";

        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(windowId);
        CommonInfoDomain commonDomain = windowInfo.getCommonInfo();
        if (null != commonDomain) {
            
            ownerCompCd = commonDomain.getOwnerCompCd();
            ownerCompName = commonDomain.getOwnerCompName();
            userName = commonDomain.getUserName();
        }

        request.setAttribute("headerOwnerCompCp", ownerCompCd);
        request.setAttribute("headerOwnerCompName", ownerCompName);
        request.setAttribute("headerUserName", userName);

    }

    /**
     * ※本メソッドは利用しないが、オーバーライドしておく必要があるので、存在するメソッド。 {@inheritDoc}
     * ※This method is not executed but is necessary for being overriden {@inheritDoc}
     * 
     * @see org.apache.struts.tiles.Controller#perform(org.apache.struts.tiles.ComponentContext,
     *      javax.servlet.http.HttpServletRequest,
     *      javax.servlet.http.HttpServletResponse,
     *      javax.servlet.ServletContext)
     */
    public void perform(ComponentContext context, HttpServletRequest request,
        HttpServletResponse response, ServletContext servletContext) throws ServletException,
        IOException {
    }
}
