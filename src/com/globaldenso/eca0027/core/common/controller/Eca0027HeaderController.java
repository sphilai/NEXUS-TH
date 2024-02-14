/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */

package com.globaldenso.eca0027.core.common.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.tiles.ComponentContext;
import org.apache.struts.tiles.Controller;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.WINDOW_ID_0;

/**
 * Controller class that sets the data to display on the header of screen
 * <br />ヘッダ部に表示するデータを設定するControllerクラス
 * <pre>
 * set following information to the request attribute to display on the header of screen
 * - server name
 * - time zone name
 * - user name (English)
 * 
 * ヘッダ部に表示する下記の情報をリクエスト属性に設定する
 * - サーバ名
 * - タイムゾーン名
 * - ユーザ名 (英)
 * </pre>
 *
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Eca0027HeaderController implements Controller {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     *
     */
    public Eca0027HeaderController() {
    }
    
    /**
     * {@inheritDoc}
     * @see org.apache.struts.tiles.Controller#execute(org.apache.struts.tiles.ComponentContext, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.ServletContext)
     */
    public void execute(ComponentContext tileContext,
        HttpServletRequest request, HttpServletResponse response,
        ServletContext servletContext) throws Exception {

        // Acquisition of a screen common information
        // 画面共通情報の取得
        WindowInfoDomain windowInfo = (WindowInfoDomain)DensoContext.get().getGeneralArea(WINDOW_ID_0);
        Eca0027CommonInfoDomain commonInfo = (Eca0027CommonInfoDomain) windowInfo.getCommonInfo();

        // Setting of a header display item
        // ヘッダ表示項目の設定
        request.setAttribute("serverNm", commonInfo.getServerNm());
        request.setAttribute("timeZoneName", commonInfo.getTimeZoneName());
        request.setAttribute("usrNmEn", commonInfo.getUsrNmEn());
        
        // A setting of the item used in inquiry display article
        // 問合せ表示部品で使用する項目の設定
        if (!StringUtils.isEmpty(commonInfo.getOwnerCompCd())) {
            request.setAttribute("headerOwnerCompCp", commonInfo.getOwnerCompCd());
        }
    }

    /**
     * {@inheritDoc}
     * @see org.apache.struts.tiles.Controller#perform(org.apache.struts.tiles.ComponentContext, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, javax.servlet.ServletContext)
     */
    public void perform(ComponentContext tileContext,
        HttpServletRequest request, HttpServletResponse response,
        ServletContext servletContext) throws ServletException, IOException {
    }
}
