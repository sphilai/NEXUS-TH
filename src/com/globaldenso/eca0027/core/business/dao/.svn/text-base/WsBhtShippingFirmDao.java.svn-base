/*
 * PROJECT：NEXUS
 *
 * The DAO interface of palletizing table lock.
 *
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/10  DNSI  新規作成
 *
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Ws5502TtPltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws5502TtPltzCriteriaDomain;

/**
 * <p>
 * In shipment confirmation update process is the DAO interface of palletizing table lock.<BR>
 * 出荷確認更新処理における、パレタイズテーブルロックのDAOインターフェースです。
 * </p>
 *
 * @version 1.00
 */
public interface WsBhtShippingFirmDao {

    /**
     * <p>
     * Search for data on the condition of ShippingFirmNo, to lock the palletizing table.<BR>
     * ShippingFirmNoを条件にデータを検索し、パレタイズテーブルをロックします。
     * </p>
     * <p>
     * <pre>
     * Use this SQL to retrieve records at the time of the pre-update processing.<BR>
     * 更新前処理のレコード取得時に当SQLを使用します。
     * </pre>
     * </p>
     *
     * @param criteria
     *            Ws5502TtPltzCriteriaDomain   Ws5502TtPltzCriteriaDomainクラス
     * @return List of Ws5502TtPltzDomain   Ws5502TtPltzDomainクラスのList
     * @throws ApplicationException
     *             Application error   アプリケーションエラー
     */
    public List<Ws5502TtPltzDomain> lockTtPltzByConditionNoWait(
            Ws5502TtPltzCriteriaDomain criteria) throws ApplicationException;

}
