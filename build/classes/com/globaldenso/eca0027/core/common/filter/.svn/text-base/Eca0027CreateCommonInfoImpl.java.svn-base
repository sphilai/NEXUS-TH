/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.common.filter;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.ai.common.core.exception.SystemException;
import com.globaldenso.eca0027.core.auto.business.domain.VmServerInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmTimeDiffInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.VmUserInfoDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmServerInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmTimeDiffInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.domain.criteria.VmUserInfoCriteriaDomain;
import com.globaldenso.eca0027.core.auto.business.service.VmServerInfoService;
import com.globaldenso.eca0027.core.auto.business.service.VmTimeDiffInfoService;
import com.globaldenso.eca0027.core.auto.business.service.VmUserInfoService;
import com.globaldenso.eca0027.core.common.business.domain.Eca0027CommonInfoDomain;
import com.globaldenso.eca0027.core.common.business.domain.UserAuthDomain;
import com.globaldenso.eca0027.core.common.business.domain.criteria.UserAuthCriteriaDomain;
import com.globaldenso.eca0027.core.common.business.service.UserAuthService;
import com.globaldenso.gscm.framework.business.domain.TmResourcesDomain;
import com.globaldenso.gscm.framework.business.domain.criteria.TmResourcesCriteriaDomain;
import com.globaldenso.gscm.framework.business.service.TmResourcesService;
import com.globaldenso.gscm.framework.filter.CreateCommonInfo;
import com.globaldenso.gscm.framework.util.CommonInfoDomain;
import com.globaldenso.gscm.framework.util.SpringUtil;

import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.NXS_91_0001;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_DATE_FORMAT;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.REPORT_DATE_FORMAT;
import static org.apache.struts.Globals.LOCALE_KEY;

/**
 * 
 * create a domain ({@link Eca0027CommonInfoDomain}) of the common screen information for this system
 * <br />本システムの画面共通情報ドメイン({@link Eca0027CommonInfoDomain})を作成します。
 *
 * @author $Author: 810833613 $
 * @version $Revision: 7874 $
 */
public class Eca0027CreateCommonInfoImpl implements CreateCommonInfo {

    /**
     * constructor.
     * <br />デフォルトコンストラクタです。
     */
    public Eca0027CreateCommonInfoImpl() {
    }
    
    /**
     * {@inheritDoc}
     */
    public Object execute(ServletRequest request, ServletResponse response, CommonInfoDomain commonInfo) 
        throws ApplicationException {
        return execute((HttpServletRequest) request, (Eca0027CommonInfoDomain) commonInfo);
    }
    
    /**
     * Set domain of the screen common information
     * <br />画面共通情報ドメインを設定します。
     *
     * @param request - HTTP request
     * @param commonInfo - domain of the screen common information
     * @return domain of the screen common information
     * @throws ApplicationException - If the Data Base can not be referenced
     */
    protected Eca0027CommonInfoDomain execute(HttpServletRequest request, Eca0027CommonInfoDomain commonInfo) 
        throws ApplicationException {
        
        // A setting of User Information
        // ユーザ情報の設定
        setUserInfo(request, commonInfo);
        
        // A setting of server information
        // サーバ情報の設定
        setServerInfo(request, commonInfo);
        
        // Setting of a user functional utilization right
        // ユーザ機能利用権限の設定
        setUserAuthInfo(request, commonInfo);
        
        // Setting of time difference information
        // 時差情報の設定
        setTimeDiffInfo(request, commonInfo);
        
        // Setting of a locale
        // ロケールの設定
        setLocale(request, commonInfo);
        
        // A setting of Date format
        // 日付フォーマットの設定
        setDateFormat(request, commonInfo);
        
        return commonInfo;
    }
    
    /**
     * Set the information of User Group Master to the domain of screen common information
     * <br />ユーザ集約原単位の情報を画面共通情報ドメインに設定します。
     *
     * @param request - HTTP request
     * @param commonInfo - domain of screen common information
     * @throws ApplicationException - If the user information can not be obtained
     */
    protected void setUserInfo(HttpServletRequest request, Eca0027CommonInfoDomain commonInfo)
        throws ApplicationException {

        // Acquisition of User Information service
        // ユーザ情報サービスの取得
        VmUserInfoService vmUserInfoService = (VmUserInfoService) SpringUtil.getBean("vmUserInfoService");
        
        // Setting of a search condition
        // 検索条件の設定
        VmUserInfoCriteriaDomain criteria = new VmUserInfoCriteriaDomain();
        criteria.setDscId(commonInfo.getLoginUserDscId());
        
        // Acquisition of User Information  
        // ユーザ情報の取得
        List<VmUserInfoDomain> vmUserInfoList = vmUserInfoService.searchByCondition(criteria);
        
        // The existence of User Information is checked in W0002InitAction.
        // ユーザ情報の有無はW0002InitActionにてチェックする
        
        if (!CollectionUtils.isEmpty(vmUserInfoList)) {
            VmUserInfoDomain vmUserInfo = vmUserInfoList.get(0);
            
            // Setting of a screen common information
            // 画面共通情報の設定
            commonInfo.setUsrNmEn(vmUserInfo.getUsrNmEn());
            commonInfo.setCntryCd(vmUserInfo.getCntryCd());
            commonInfo.setWeightUnit(vmUserInfo.getWeightUnit());
            commonInfo.setLengthUnit(vmUserInfo.getLengthUnit());
            commonInfo.setVolumeUnit(vmUserInfo.getVolumeUnit());
            commonInfo.setWeightUnitDisp(vmUserInfo.getWeightUnitDisp());
            commonInfo.setVolumeUnitDisp(vmUserInfo.getVolumeUnitDisp());
            commonInfo.setCompCd(vmUserInfo.getCompCd());
        }
    }
    
    /**
     * Set the information of the logged-in server to the domain of screen common information
     * <br />ログインしているサーバの情報を画面共通情報ドメインに設定します。
     *
     * @param request - HTTP request
     * @param commonInfo - domain of the screen common information
     * @throws ApplicationException - If the information of server can not be obtained
     */
    protected void setServerInfo(HttpServletRequest request, Eca0027CommonInfoDomain commonInfo) 
        throws ApplicationException {

        // Service of server information (view) is acquired.
        // サーバ情報(ビュー)のサービスを取得
        VmServerInfoService VmServerInfoService = (VmServerInfoService) SpringUtil.getBean("vmServerInfoService");
        
        // Setting of a search condition
        // 検索条件の設定
        VmServerInfoCriteriaDomain criteria = new VmServerInfoCriteriaDomain();
        criteria.setUrl(getServerUrl(request));
        criteria.setLngCd(commonInfo.getLanguageCd());

        // Acquisition of server information
        // サーバ情報の取得
        List<VmServerInfoDomain> vmServerInfoList = VmServerInfoService.searchByCondition(criteria);

        if (CollectionUtils.isEmpty(vmServerInfoList)) {
            throw new SystemException(NXS_91_0001);
        }
        
        // Setting of a screen common information
        // 画面共通情報の設定
        commonInfo.setServerId(vmServerInfoList.get(0).getServerId());
        commonInfo.setServerNm(vmServerInfoList.get(0).getServerNm());
    }

    /**
     * Get the URL of the local server
     * <br />自サーバのURLを取得します。
     *
     * @param request - HTTP request
     * @return URL of the local server
     */
    protected String getServerUrl(HttpServletRequest request) {
        StringBuilder url = new StringBuilder();
        
        url.append(request.getScheme() + "://");
        url.append(request.getServerName());
        
        if (request.getServerPort() != 80) {
            url.append(":" + request.getServerPort());
        }

        url.append(request.getContextPath());
        url.append("/");
        
        return url.toString();
    }
    
    /**
     * Set the information of user authority to the domain of the screen common information
     * <br />ユーザ機能利用権限の情報を画面共通情報ドメインに設定します。
     *
     * @param request - HTTP request
     * @param commonInfo - domain of the screen common information
     * @throws ApplicationException - If the information of user authority can not be obtained
     */
    protected void setUserAuthInfo(HttpServletRequest request, Eca0027CommonInfoDomain commonInfo) 
        throws ApplicationException {

        // Acquisition of UserAuth service
        // UserAuthサービスの取得
        UserAuthService userAuthService = (UserAuthService) SpringUtil.getBean("userAuthService");
        
        // / Setting of a search condition
        // 検索条件の設定
        UserAuthCriteriaDomain criteria = new UserAuthCriteriaDomain();
        criteria.setDscId(commonInfo.getLoginUserDscId());
        criteria.setServerId(commonInfo.getServerId());
        
        // Acquisition of a user functional utilization right
        // ユーザ機能利用権限の取得
        List<? extends UserAuthDomain> userAuthList = userAuthService.searchByCondition(criteria);
        
        // The existence of authority is checked in W0002InitAction.
        // 権限の有無はW0002InitActionにてチェックする
        
        // Setting of a user functional utilization right
        // ユーザ機能利用権限の設定
        commonInfo.setUserAuthList(userAuthList);
    }
    
    /**
     * Set the information of time zone to domain of the screen common information
     * <br />タイムゾーンの情報を画面共通情報ドメインに設定します。
     *
     * @param request - HTTP request
     * @param commonInfo - domain of the screen common information
     * @throws ApplicationException - If the information of time zone can not be obtained
     */
    protected void setTimeDiffInfo(HttpServletRequest request, Eca0027CommonInfoDomain commonInfo)
        throws ApplicationException {

        // Acquisition of time-difference-information service
        // 時差情報サービスの取得
        VmTimeDiffInfoService vmTimeDiffInfoService = (VmTimeDiffInfoService) SpringUtil.getBean("vmTimeDiffInfoService");
        
        Date sysdate = new Date();
        
        // Setting of a search condition
        // 検索条件の設定
        VmTimeDiffInfoCriteriaDomain criteria = new VmTimeDiffInfoCriteriaDomain();
        criteria.setTimezoneId(commonInfo.getTimeZone());
        criteria.setSummerTimeFromLessThanEqual(sysdate);
        criteria.setSummerTimeToGreaterThanEqual(sysdate);
        
        // Acquisition of time difference information
        // 時差情報の取得
        List<VmTimeDiffInfoDomain> vmTimeDiffInfoList = vmTimeDiffInfoService.searchByCondition(criteria);
        
        // Setting of a screen common information
        // 画面共通情報の設定
        if (0 < vmTimeDiffInfoList.size()) {
            VmTimeDiffInfoDomain vmTimeDiffInfo = vmTimeDiffInfoList.get(0);
            commonInfo.setTimeZone(vmTimeDiffInfo.getTimezoneId());
            commonInfo.setTimeZoneName(getTimeZoneName(vmTimeDiffInfo));
        }
    }
    
    /**
     * Return a time zone name (UTC+- time difference).
     * <br />タイムゾーン名(UTC±時差)を返します。
     * 
     * @param vmTimeDiffInfo Time difference information<br />時差情報
     * @return Time zone name<br />タイムゾーン名
     */
    protected String getTimeZoneName(VmTimeDiffInfoDomain vmTimeDiffInfo) {
        String timeDiffSign = vmTimeDiffInfo.getTimeDiffSign();
        String timeDiff = vmTimeDiffInfo.getTimeDiff();

        return String.format("UTC%s%s:%s",
            timeDiffSign,
            StringUtils.substring(timeDiff, 0, 2),
            StringUtils.substring(timeDiff, -2)
        );
    }
    
    /**
     * set the locale
     * <br />ロケールを設定します。
     *
     * @param request - HTTP request
     * @param commonInfo - domain of the screen common information
     */ 
    protected void setLocale(HttpServletRequest request, Eca0027CommonInfoDomain commonInfo) {
        // Acquisition of LANGUAGE CODE, and a COUNTRY CODE
        // 言語コード、国コードの取得
        String languageCd = commonInfo.getLanguageCd();
        String cntryCd = commonInfo.getCntryCd();
        
        if (!StringUtils.isEmpty(languageCd)) {
            // Create of locale (internationalization correspond for every country (example:   Date format))  
            // ロケールの作成 (国ごとの国際化対応 (例: 日付フォーマット))
            Locale locale = null;
            if (StringUtils.isEmpty(cntryCd)) {
                locale = new Locale(languageCd);
            } else {
                locale = new Locale(languageCd, cntryCd);
            }
            
            // A locale information is overwritten.
            // ロケール情報を上書き
            commonInfo.setLocale(locale);
            
            // A setting of the locale information on Struts
            // Strutsのロケール情報の設定
            request.getSession(false).setAttribute(LOCALE_KEY, locale);
        }
    }
    
    /**
     * Set the format of date
     * <br />日付フォーマットを設定します。
     *
     * @param request - HTTP request
     * @param commonInfo - domain of the screen common information
     * @throws ApplicationException - If the format of date can not be obtained
     */
    protected void setDateFormat(HttpServletRequest request, Eca0027CommonInfoDomain commonInfo) 
        throws ApplicationException {
        
        if (commonInfo.getLocale() != null) {
            // Setting of a LOCALE KEY
            // ロケールキーの設定
            String[] localeKeys = {
                commonInfo.getLocale().toString(),
                commonInfo.getLocale().getLanguage(),
                "default"
            };
            
            // A setting of Date format (for screen display)
            // 日付フォーマット (画面表示用)の設定
            for (String localeKey : localeKeys) {
                TmResourcesDomain tmResources = searchDateFormat(localeKey, SCREEN_DATE_FORMAT);
                if (tmResources != null) {
                    commonInfo.setScreenDateFormat(tmResources.getValue());
                    break;
                }
            }
            
            // A setting of Date format (for document outputs)
            // 日付フォーマット (帳票出力用)の設定
            for (String localeKey : localeKeys) {
                TmResourcesDomain tmResources = searchDateFormat(localeKey, REPORT_DATE_FORMAT);
                if (tmResources != null) {
                    commonInfo.setReportDateFormat(tmResources.getValue());
                    break;
                }
            }
        }
    }
    
    /**
     * Get the format of date for the locale key that specified
     * <br />指定されたロケールキーの日付フォーマットを取得します。
     *
     * @param localeKey - locale key
     * @param resourceKey - resource key for the format of date 
     * @return Format of date
     * @throws ApplicationException - If the resources can not be obtained
     */
    protected TmResourcesDomain searchDateFormat(String localeKey, String resourceKey) throws ApplicationException {
        // Resource   Acquisition of service
        // リソース サービスの取得
        TmResourcesService tmResourcesService = (TmResourcesService) SpringUtil.getBean("gscmTmResourcesService");
        
        // Setting of a search condition
        // 検索条件の設定
        TmResourcesCriteriaDomain criteria = new TmResourcesCriteriaDomain();
        criteria.setLocaleKey(localeKey);
        criteria.setResourceKey(resourceKey);
        
        // Acquisition of a resource
        // リソースの取得
        return tmResourcesService.searchByKey(criteria);
    }
}
