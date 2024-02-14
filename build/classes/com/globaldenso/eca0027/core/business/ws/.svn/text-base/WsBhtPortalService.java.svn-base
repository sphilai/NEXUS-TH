/*
 * Project : NEXUS_EXPORT
 *
 * Dete of update          : 2013/12/16
 * Development company name: DENSO IT SOLUTIONS, INC.
 * Details of update       : New
 * (c) Copyright 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VmGetQrCheckDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0501LoginInfoItemCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws0501LoginInfoItemDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws0502PassCriteriaDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * <p>
 * The interface of the login menu service.<BR>
 * ログインメニューサービスのインタフェースです。
 * </p>
 *
 * @version 1.00
 */
public interface WsBhtPortalService {

    /**
     * <p>
     * Login authentication and the BHT application version check.<BR>
     * ログイン認証、BHTアプリバージョンチェック
     * </p>
     *
     * @param loginInfoItemCriteriaDomain
     *            Login Criteria Domain   (LoginInfoの検索条件Domain)
     * @return Processing result   (検索結果)
     * @throws GscmApplicationException
     *             Business error   (業務エラー)
     * @throws ApplicationException
     *             Application error   (アプリケーションエラー)
     */
    public Ws0501LoginInfoItemDomain searchLoginInfo(
            Ws0501LoginInfoItemCriteriaDomain loginInfoItemCriteriaDomain)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Password change.<BR>
     * パスワード変更。
     * </p>
     *
     * @param passCriteriaDomain
     *         Password input domain   (検索条件Domain)
     * @throws GscmApplicationException
     *             Business error   (業務エラー)
     * @throws ApplicationException
     *             Application error   (アプリケーションエラー)
     */
    public void updatePass(Ws0502PassCriteriaDomain passCriteriaDomain)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * QR code check information acquisition.<BR>
     * QRコードチェック情報の取得。
     * </p>
     * <p>
     * <pre>
     * Find the data for the table, and then return in a list format search results.<BR>
     * テーブルのデータを検索し、検索結果をリスト形式で返却します。
     * </pre>
     * </p>
     *
     * @return List of vtGatQrCheck class   (vtGatQrCheckのDomainクラスのList)
     * @throws GscmApplicationException
     *             Business error   (業務エラー)
     * @throws ApplicationException
     *             Application error   (アプリケーションエラー)
     */
    public List<VmGetQrCheckDomain> searchQrChkInfo()
        throws GscmApplicationException, ApplicationException;

}
