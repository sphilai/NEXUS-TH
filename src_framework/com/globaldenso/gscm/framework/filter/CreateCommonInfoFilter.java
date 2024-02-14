/*
 * PROJECT：GSCM 共通機能群
 * PROJECT：GSCM Common Functions
 *
 * 画面共通情報を設定するFilterクラス
 * Set Screen Common Information Filter Class
 *
 * Version.
 * 1.0.1
 *
 * Copyright (c) 2013 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.gscm.framework.filter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.globaldenso.ai.common.core.context.DensoContext;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.gscm.framework.business.domain.MenuDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserConfDomain;
import com.globaldenso.gscm.framework.business.domain.TmUserDomain;
import com.globaldenso.gscm.framework.business.domain.UserDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserConfCriteriaDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmUserCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.SearchMainMenuService;
import com.globaldenso.gscm.framework.business.service.TmUserConfService;
import com.globaldenso.gscm.framework.business.service.TmUserService;
import com.globaldenso.gscm.framework.presentation.ScreenInfoDomain;
import com.globaldenso.gscm.framework.presentation.WindowInfoDomain;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.SpringUtil;

/**
 * 画面共通情報を設定するFilterクラス
 * Set Screen Common Information Filter Class
 * <p>
 * DensoContext汎用エリアへ画面共通情報を設定する。<br/>
 * Set common information of the screen to Denso Context Common fields<br/>
 * 当Filterクラスにて、GSCM共通基盤提供の画面共通情報クラス(com.globaldenso.gscm.framework.util.CommonInfoDomain)内にあるプロパティ情報を設定します。<br/>
 * In this Filter class,set property information which is in screen common information class of GSCM common base(com.globaldenso.gscm.framework.util.CommonInfoDomain)<br/>
 * 但し、業務アプリにてGSCM共通基盤提供の画面共通情報クラスを継承しサブクラスを作成している場合は、業務アプリにて必要な情報の設定を行う必要がある。<br/>
 * But,it's required for setting necessary information on the business application if inherit screen common information of GSCM common base on the business application and create sub class<br/>
 * ※画面共通情報サブクラスを作成した場合、初期化パラメータ「CommonInfoClassName」を業務アプリにて作成したサブクラスに変更する。<br/>
 * ※Change CommonInfoClassName of init argument to the sub class created on the business apllication if create common information of the screen sub class<br/>
 * ※当Filterクラスで設定した内容を業務で変更したい又は画面共通情報サブクラスを作成したことにより不足分の情報を設定したい場合、初期化パラメータ「CommonInfoSetClassName」<br/>
 * に実行したいクラスのフルパスを指定する。ここで指定するクラスはGSCM共通基盤提供のinterfaceクラス(com.globaldenso.gscm.framework.filter.CreateCommonInfo)を利用する。<br/>
 * ※When change the content which is set in this Filter class or set lack of information because of creating screen common information sub class,<br/>
 * Specify the full path of the class to CommonInfoSetClassName of init argument.Use the interface class of GSCM common base(com.globaldenso.gscm.framework.filter.CreateCommonInfo)<br/>
 * <table border=1>
 * <th>初期化パラメータ名</th>
 * <th>Name of initialized argument</th>
 * <th>必須</th>
 * <th>Required subject</th>
 * <th>設定値</th>
 * <th>Value for set</th>
 * <tr>
 * <td>CommonInfoClassName</td>
 * <td>○</td>
 * <td>画面共通情報を格納するクラスのフルパスを指定する。</td>
 * <td>Specify the full path of the class for setting screen common information</td>
 * </tr>
 * <tr>
 * <td>CreateCommonInfoClassName</td>
 * <td></td>
 * <td>画面共通情報の設定処理が実装されているクラスのフルパスを指定する。</td>
 * <td>Specify the full path of the class for implementing screen common information of setting</td>
 * </tr>
 * </table>
 * </p>
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10885 $
 */
public class CreateCommonInfoFilter implements Filter {
    /**
     * 画面共通情報保持クラス名
     * Name of maintained screen common information
     */
    private String commonInfoClassName = null;
    /**
     * 画面共通情報設定クラス名
     * Name of setting screen common information
     */
    private String commonInfoSetClassName = null;

    /**
     * デフォルトコンストラクタ
     * Default constructor
     */
    public CreateCommonInfoFilter() {
    }

    /**
     * フィルタが破棄されるタイミングで実行されるメソッド。
     * Method executed when a filter is destroied
     *
     * @see javax.servlet.Filter#destroy()
     */
    public void destroy() {
    }

    /**
     * 画面共通情報設定処理
     * Process for setting screen common information
     * <p>
     * 画面共通情報を作成し、DensoContext汎用エリアへ設定する。
     * Create screen common information and set to DensoContext common area
     * </p>
     *
     * @param request ServletRequest
     * @param response ServletResponse
     * @param chain FilterChain
     * @throws IOException IOException
     * @throws ServletException ServletException
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        String windowId = request.getParameter("windowId");
        String ownerCompCd = request.getParameter("ownerCompCd");
        String languageCd = request.getParameter("languageCd");
        String timeZone = request.getParameter("timeZone");
        String charCd = request.getParameter("charCd");

        if (!CheckUtil.isBlankOrNull(windowId)) {
            DensoContext context = DensoContext.get();

            WindowInfoDomain windowInfo = (WindowInfoDomain)context.getGeneralArea(windowId);
            if (null == windowInfo) {
                windowInfo = new WindowInfoDomain();
            }

            try {
                CommonInfoDomain commonInfoClass = null;
                if (!CheckUtil.isBlankOrNull(commonInfoClassName)) {
                    commonInfoClass = (CommonInfoDomain)Class.forName(commonInfoClassName)
                        .newInstance();
                } else {
                    commonInfoClass = new CommonInfoDomain();
                }

                commonInfoClass = getCommonInfoDomain(context.getDscId(), ownerCompCd, timeZone,
                    languageCd, charCd, commonInfoClass);

                if (!CheckUtil.isBlankOrNull(commonInfoSetClassName)) {
                    Object createCommonInfoClass = Class.forName(commonInfoSetClassName)
                        .newInstance();
                    Method method = createCommonInfoClass.getClass().getMethod(
                        "execute",
                        new Class[] {ServletRequest.class, ServletResponse.class,
                            CommonInfoDomain.class});
                    commonInfoClass = (CommonInfoDomain)method.invoke(createCommonInfoClass,
                        request, response, commonInfoClass);
                }
                // ウィンドウ情報へ生成した画面共通情報を設定
                // Setting created screen common information to window information
                windowInfo.setCommonInfo(commonInfoClass);
            } catch (Exception e) {
                throw new ServletException(e);
            }

            // 画面情報の初期化
            // Initialize screen information
            // ブラウザの「×」ボタンで閉じられた場合、以前の画面情報がゴミ情報としてDensoContext汎用エリア
            // In case of close the window with X button on the blowser,previous screen information exsists as trush information on DensoContext common area.
            // に残るので、トップ画面から起動時は、画面情報をクリアする。
            // Clear screen information when boot up from the top screen
            windowInfo.setScreenIdList(new ArrayList<String[]>());
            windowInfo.setScreenInfo(new HashMap<String, ScreenInfoDomain>());

            context.putGeneralArea(windowId, windowInfo);
        }
        chain.doFilter(request, response);
    }

    /**
     * フィルタ初期処理
     * Process of initializing the filter
     * <p>
     * 本Filterの初期化パラメータに定義する画面共通情報保持クラス名と画面情報設定クラス名を取得する。
     * Getting name of maintained screen common information class and  name of set screen information class for defining the initialized argument of this Filter 
     * </p>
     *
     * @param config FilterConfig
     * @throws ServletException ServletException
     */
    public void init(FilterConfig config) throws ServletException {
        // 画面共通情報保持用クラス名を取得
        // Getting name of maintained screen common information class
        commonInfoClassName = config.getInitParameter("CommonInfoClassName");
        // 画面共通情報設定クラス名を取得
        // Getting name of set screen information class
        commonInfoSetClassName = config.getInitParameter("CreateCommonInfoClassName");
    }

    /**
     * 画面共通情報の内容を設定し、返却する。
     * Set and return content of the screen common information 
     * <p>
     * 画面共通情報に必要な情報を各種テーブルから取得し、設定する。
     * Get and set necessary information for screen common information from every kind of tables
     * </p>
     *
     * @param dscId ログインユーザID
     * @param dscId Login user ID
     * @param ownerCompCd 責任会社コード
     * @param ownerCompCd Company code
     * @param timeZone タイムゾーン
     * @param timeZone Time zone
     * @param languageCd 言語コード
     * @param languageCd Language code
     * @param charCd 文字コード
     * @param charCd Character code
     * @param commonInfo 画面共通情報
     * @param commonInfo Screen common information
     * @return CommonInfoDomain 画面共通情報
     * @return CommonInfoDomain Screen common information domain
     * @throws ApplicationException アプリケーション例外
     * @throws ApplicationException ApplicationException
     */
    private CommonInfoDomain getCommonInfoDomain(String dscId, String ownerCompCd, String timeZone,
        String languageCd, String charCd, CommonInfoDomain commonInfo) throws ApplicationException {
        // CommonInfoDomain commonInfo = new CommonInfoDomain();
        commonInfo.setLoginUserDscId(dscId);

        // ユーザー原単位を検索し、ユーザ名称を取得する
        // Search a user master and get a user name 
        TmUserCriteriaDomain tmUserCriteriaDomain = new TmUserCriteriaDomain();
        tmUserCriteriaDomain.setDscId(dscId); // DSC-ID

        TmUserService tmUserService = (TmUserService)SpringUtil.getBean("gscmTmUserService");
        TmUserDomain tmUserDomain = tmUserService.searchByKey(tmUserCriteriaDomain);

        // ユーザ名称を設定する
        // Set a user name
        if (tmUserDomain != null) {
            commonInfo.setUserName(tmUserDomain.getUsrNmEn()); // 氏名(英字)
                                                               // Name(English)
        }

        // ユーザー設定原単位を検索する
        // Search a user setting master
        TmUserConfCriteriaDomain tmUserConfCriteriaDomain = new TmUserConfCriteriaDomain();
        tmUserConfCriteriaDomain.setDscId(dscId); // DSC-ID
        TmUserConfService tmUserConfService = (TmUserConfService)SpringUtil.getBean("gscmTmUserConfService");
        TmUserConfDomain tmUserConfDomain = tmUserConfService.searchByKey(tmUserConfCriteriaDomain);

        if (tmUserConfDomain != null) {
            if (CheckUtil.isBlankOrNull(ownerCompCd)) {
                ownerCompCd = tmUserConfDomain.getCompCd();
            }
            if (CheckUtil.isBlankOrNull(timeZone)) {
                timeZone = tmUserConfDomain.getTimezoneId();
            }
            if (CheckUtil.isBlankOrNull(languageCd)) {
                languageCd = tmUserConfDomain.getUserLngCd();
            }
            if (CheckUtil.isBlankOrNull(charCd)) {
                charCd = tmUserConfDomain.getCharCd();
            }
        }
        commonInfo.setOwnerCompCd(ownerCompCd);
        commonInfo.setTimeZone(timeZone);
        commonInfo.setLanguageCd(languageCd);
        commonInfo.setCharCd(charCd);
        if (languageCd != null) {
            commonInfo.setLocale(new Locale(languageCd));
        }

        // 利用可能画面
        // Screen enable to use
        UserDomain searchUserDomain = new UserDomain();
        // DSI-ID,責任会社コード,言語コードを取得。
        // Get DSC-ID,company code,language code
        searchUserDomain.setDscId(dscId);
        searchUserDomain.setOwnerCompCd(ownerCompCd);
        searchUserDomain.setLanguageCd(languageCd);
        SearchMainMenuService searchMainMenuService = (SearchMainMenuService)SpringUtil
            .getBean("searchMainMenuService");
        List<MenuDomain> listMenu = searchMainMenuService.search(searchUserDomain);

        commonInfo.setAvailableMenu(listMenu); // 利用可能画面
                                               // Screen enable to use
        return commonInfo;
    }
}
