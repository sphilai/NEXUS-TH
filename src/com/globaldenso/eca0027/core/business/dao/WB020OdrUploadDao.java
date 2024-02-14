/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;

/**
 * the interface of the ordering registration DAO.
 * <br />受注登録DAOのインタフェースです。
 * <pre>
 * bean id: wB001OdrRcvDao
 * </pre>
 * 
 * @author $Author: G453S402002 $
 * @version $Revision: 13539 $
 */
public interface WB020OdrUploadDao {
    
    /**
     * Acquire the number of an Export Receive Order.
     * <br />輸出受注の件数を取得します。
     * <pre>
     * - Search of an Export Receive Order
     *       To an argument, sql id:OdrRcv.SearchCountTtExpRcvOdrByDetailInit is performed for criteria.
     *
     * - Return of the search number
     * - 輸出受注の検索
     *     criteriaを引数に、sql id:OdrRcv.SearchCountTtExpRcvOdrByDetailInitを実行
     *     
     * - 検索件数の返却
     * </pre>
     * 
     * @param criteria Customer Order Receiving search-condition domain<br />Customer Order Receiving検索条件ドメイン
     * @return Search number<br />検索件数
     * @throws ApplicationException When an Export Receive Order cannot be referred to<br />輸出受注が参照できない場合
     */
    public List<? extends WB020OdrUploadReqDomain> searchOdrUploadReqMgt(WB020OdrUploadReqDomain wb020OCriteriaDomain)
        throws ApplicationException;
    
}
