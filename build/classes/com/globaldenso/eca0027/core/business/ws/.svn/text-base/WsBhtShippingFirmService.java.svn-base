/*
 * PROJECT：NEXUS
 *
 * VtShippfirmMain のServiceインターフェース
 *
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/10  DNSI  新規作成
 *
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.ws;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.auto.business.domain.VtShippingFirmDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws5501ShippingFirmCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Ws5502UpdateShippingFirmDomain;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;

/**
 * <p>
 * The interface for shipment confirmation service.<BR>
 * 出荷確認サービスのインタフェースです。
 * </p>
 *
 * @version 1.00
 */
public interface WsBhtShippingFirmService {

    /**
     * <p>
     * Find the data of shipment confirmation information table, and then return in a list format 
     * search results.<BR>
     * 出荷確認情報テーブルのデータを検索し、検索結果をリスト形式で返却します。
     * </p>
     *
     * @param shippingFirmCriteria
     *            List of Ws5501ShippingFirmCriteriaDomain   (Ws5501ShippingFirmCriteriaDomainクラスのList)
     * @return List of VtShippingFirmDomain   (VtShippingFirmDomainクラスのList)
     * @throws GscmApplicationException
     *             Business error   (業務エラー)
     * @throws ApplicationException
     *             Application error   (アプリケーションエラー)
     */
    public List<VtShippingFirmDomain> searchShippingFirm(
            Ws5501ShippingFirmCriteriaDomain shippingFirmCriteria)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Make the lock of shipment confirmation information table.<BR>
     * 出荷確認情報テーブルのロックを行います。
     * </p>
     *
     * @param wsUpdateShippingFirm
     *            Ws5502UpdateShippingFirmDomain   (Ws5502UpdateShippingFirmDomainクラス)
     * @return Processing result   (処理結果)
     * @throws GscmApplicationException
     *             Business error   (業務エラー)
     * @throws ApplicationException
     *             Application error   (アプリケーションエラー)
     */
    public boolean validateDatabaseTtShippingFirmOnShippingFirm(
            Ws5502UpdateShippingFirmDomain wsUpdateShippingFirm)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Make the lock of palletizing information table.<BR>
     * パレタイズ情報テーブルのロックを行います。
     * </p>
     *
     * @param wsUpdateShippingFirm
     *            Ws5502UpdateShippingFirmDomain   (Ws5502UpdateShippingFirmDomainクラス)
     * @return Processing result   (処理結果)
     * @throws GscmApplicationException
     *             Business error   (業務エラー)
     * @throws ApplicationException
     *             Application error   (アプリケーションエラー)
     */
    public boolean validateDatabaseTtPltzOnShippingFirm(
            Ws5502UpdateShippingFirmDomain wsUpdateShippingFirm)
        throws GscmApplicationException, ApplicationException;

    /**
     * <p>
     * Run the update of the shipment confirmation information table and palletizing table.<BR>
     * 出荷確認情報テーブルおよびパレタイズテーブルの更新を行います。
     * </p>
     *
     * @param wsUpdateShippingFirm
     *            Ws5502UpdateShippingFirmDomain   (Ws5502UpdateShippingFirmDomainクラス)
     * @return Processing result   (処理結果)
     * @throws GscmApplicationException
     *             Business error   (業務エラー)
     * @throws ApplicationException
     *             Application error   (アプリケーションエラー)
     */
    public boolean updateShippingFirm(
            Ws5502UpdateShippingFirmDomain wsUpdateShippingFirm)
        throws GscmApplicationException, ApplicationException;
}
