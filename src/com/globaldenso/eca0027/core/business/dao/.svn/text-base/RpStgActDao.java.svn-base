/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.L4002TtPltzByPalletCartonTypDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.L4002TtPltzByPalletCartonTypCriteriaDomain;

/**
 * The DAO interface when creating a form of L4000 series.
 * </br>L4000番台の帳票を作成するときに使用するDAOのインターフェースです。
 * 
 * <pre>
 * bean id:rpStgActDao
 * </pre>
 * 
 * @author $Author: 10088DS50908 $
 * @version $Revision: 5759 $
 */
public interface RpStgActDao {
    
    /**
     * Get the information on the condition of Staging Actuality No than Palletize.
     * </br>パレタイズより山作り実績Noを条件に情報を取得します。
     * <pre>
     * - Search by combining Palletize, Code Master.
     *   # argument to the condition, sql id: Run the SearchTtPltzByPalletCartonTyp.
     * 
     * - To return the data that has been acquired
     * </pre>
     * <pre>
     * - パレタイズ、コードマスタ を結合して検索します。
     *     conditionを引数に、sql id:SearchTtPltzByPalletCartonTypを実行します。
     *     
     * - 取得したデータを返却する
     * </pre>
     *
     * @param condition search condition
     * @return List<L4002TtPltzByPalletCartonTypDomain>
     * @throws ApplicationException application exception
     */
    List<L4002TtPltzByPalletCartonTypDomain> searchTtPltzByPalletCartonTyp(L4002TtPltzByPalletCartonTypCriteriaDomain condition) throws ApplicationException;
    
}
