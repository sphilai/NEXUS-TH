/*
 * PROJECT：NEXUS
 *
 * TtPltz のDAO実装クラス
 *
 * Version.   更新日      更新者        更新内容
 * 1.0.0      2014/02/17  DNITS  新規作成
 *
 * Copyright (c) 2012 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.integration;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.dao.WsBhtShippingFirmDao;
import com.globaldenso.eca0027.core.business.domain.Ws5502TtPltzDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Ws5502TtPltzCriteriaDomain;

/**
 * <p>
 * In shipment confirmation update process, it is DAO implementation class of palletizing table lock.<BR>
 * 出荷確認更新処理における、パレタイズテーブルロックのDAO実装クラスです。
 * </p>
 *
 * @version 1.00
 */
public class WsBhtShippingFirmDaoImpl extends SqlMapClientDaoSupport implements
        WsBhtShippingFirmDao {

    /**
     * default constructor<BR>
     * デフォルトコンストラクタ。
     */
    public WsBhtShippingFirmDaoImpl() {
    }

    /**
     *
     * {@inheritDoc}
     *
     * @see com.globaldenso.eca0027.core.business.dao.WsBhtTtPltzDao#lockTtPltzByConditionNoWait(com.globaldenso.eca0027.core.business.domain.criteria.WsBhtTtPltzCriteriaDomain)
     */
    @SuppressWarnings("unchecked")
    public List<Ws5502TtPltzDomain> lockTtPltzByConditionNoWait(
            Ws5502TtPltzCriteriaDomain criteria) throws ApplicationException {
        return (List<Ws5502TtPltzDomain>) getSqlMapClientTemplate().queryForList(
                "WsBhtShippingFirm.LockTtPltzByConditionNoWait", criteria);
    }

}
