/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.service;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W0002CigmaStatusDomain;
import com.globaldenso.eca0027.core.business.domain.W0002MenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002OtherMenuDomain;
import com.globaldenso.eca0027.core.business.domain.W0002ServerDomain;
import com.globaldenso.eca0027.core.business.domain.W0002SysInfoDomain;
import com.globaldenso.eca0027.core.business.domain.W0002UserConfDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002CigmaStatusCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002MenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002OtherMenuCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002ServerCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W0002SysInfoCriteriaDomain;

/**
 * Interface of the service that provides menu screen 
 * <br />メニュー画面のサービスインタフェースです。
 *
 * @author $Author: 400616000304 $
 * @version $Revision: 10657 $
 */
public interface W0002MenuService  {

    /**
     * Get the menu information to display on the screen
     * <br />画面に表示するメニュー情報を取得します。
     * 
     * @param criteria ( search condition ) <br /> 検索条件
     * @return menu information <br /> メニュー情報
     * @throws ApplicationException (if the menu information can not be obtained) <br /> ApplicationException メニュー情報が取得できない場合
     */
    public List<? extends W0002MenuDomain> searchOnMenuInitForMenu(W0002MenuCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the other system menu information to display on the screen
     * <br />画面に表示する他システムメニュー情報を取得します。
     * 
     * @param criteria ( search condition ) <br /> 検索条件
     * @return other system menu information <br /> メニュー情報
     * @throws ApplicationException (if the other system menu information can not be obtained) <br /> ApplicationException 他システムメニュー情報が取得できない場合
     */
    public List<? extends W0002OtherMenuDomain> searchOnMenuInitForOtherMenu(W0002OtherMenuCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the server information to display on the screen
     * <br />画面に表示するサーバ情報を取得します。
     *
     * @param criteria ( search condition ) <br /> 検索条件
     * @return server information <br /> サーバ情報
     * @throws ApplicationException (if the server information can not be obtained) <br /> サーバ情報が取得できない場合
     */
    public List<? extends W0002ServerDomain> searchOnMenuInitForServer(W0002ServerCriteriaDomain criteria)
        throws ApplicationException;

    /**
     * Get the system information to display on the screen
     * <br />画面に表示するお知らせ情報(システム連絡)を取得します。
     *
     * @param criteria ( search condition ) <br /> 検索条件
     * @return system information <br /> お知らせ情報(システム連絡)
     * @throws ApplicationException (if the system information can not be obtained) <br /> お知らせ情報(システム連絡)が取得できない場合
     */
    public List<? extends W0002SysInfoDomain> searchOnMenuInitForSystemInfo(W0002SysInfoCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the business information to display on the screen
     * <br />画面に表示するお知らせ情報(ビジネス連絡)を取得します。
     *
     * @param criteria ( search condition ) <br /> 検索条件
     * @return business information <br /> お知らせ情報(ビジネス連絡)
     * @throws ApplicationException (if the business information can not be obtained) <br /> お知らせ情報(ビジネス連絡)が取得できない場合
     */
    public List<? extends W0002SysInfoDomain> searchOnMenuInitForBusinessInfo(W0002SysInfoCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Get the CIGMA nightly batch information to display on the screen
     * <br />画面に表示するCIGMA夜間バッチ情報を取得します。
     *
     * @param criteria ( search condition ) <br /> 検索条件
     * @return nightly batch information <br /> 夜間バッチ情報
     * @throws ApplicationException (if the nightly batch information can not be obtained) <br /> 夜間バッチ情報が取得できない場合
     */
    public List<? extends W0002CigmaStatusDomain> searchOnMenuInitForCigmaStatus(W0002CigmaStatusCriteriaDomain criteria)
        throws ApplicationException;
    
    /**
     * Update the information inputted in the personal settings
     * <br />個人設定で入力された情報を更新します。
     * <pre>
     * - To update 'User Config Master'
     *     update the following items after to get the lock on condition DSC-ID of the logged-in user
     *     - LANGUAGE CODE (entered on the screen)
     *     - TIMEZONE ID (entered on the screen)
     *     - Character code (entered on the screen)
     *     
     * - ユーザ設定原単位の更新
     *     ログインユーザのDSC-IDを条件にロックを取得し、下記項目を更新する
     *       - ユーザ言語コード (画面で入力された言語コード)
     *       - タイムゾーンID (画面で入力されたタイムゾーンID)
     *       - 文字コード (画面で入力された文字コード)
     * 
     * </pre>
     * 
     * @param userConf (User configuration domain) <br /> ユーザ設定ドメイン
     * @throws ApplicationException (if the personal settings can not be obtained) <br /> ユーザ設定情報を更新できなかった場合
     */
    public void updateOnMenuSetup(W0002UserConfDomain userConf) throws ApplicationException;
    
}
