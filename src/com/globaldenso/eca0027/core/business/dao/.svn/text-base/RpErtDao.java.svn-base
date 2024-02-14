/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.dao;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.LC001TtPltzByHeaderDomain;
import com.globaldenso.eca0027.core.business.domain.LC001TtPltzItemByDetailErtDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzByHeaderCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.LC001TtPltzItemByDetailErtCriteriaDomain;

/**
 * The DAO interface when creating a form of LC001 series.
 * <br />LC001の帳票を作成するときに使用するDAOのインターフェースです。
 * <pre>
 * bean id:rpErtDao
 * </pre>
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public interface RpErtDao {

    /**
     * Get the header information from Palletize.
     * <br />パレタイズからヘッダー情報を取得します。
     * <pre>
     * - Search Palletize Instruction Number
     *   an argument criteriaDomain, call the searchTtPltzByHeader (LC001TtPltzByHeaderCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - The return search results
     * </pre>
     * <pre>
     * - 梱包指示品番を検索
     *     criteriaDomainを引数に、{@link RpErtDao#searchTtPltzByHeader(LC001TtPltzByHeaderCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 検索結果を返却
     * </pre>
     *      
     * @param criteria LC001TtPltzByHeaderCriteriaDomain
     * @return TtPltzByHeaderDomain
     * @throws ApplicationException application exception
     */
    List<LC001TtPltzByHeaderDomain> searchTtPltzByHeader(LC001TtPltzByHeaderCriteriaDomain criteria) throws ApplicationException;

    /**
     * Get the detail information from Palletize Item.
     * <br />パレタイズ対象品から明細情報を取得します。
     * <pre>
     * - Search Palletize Item
     *   an argument criteriaDomain, call the searchTtPltzItemByDetailErt (LC001TtPltzItemByDetailErtCriteriaDomain),
     *    Get the number is 0, an error will occur.
     * 
     * - To return the data retrieved
     * </pre>
     * <pre>
     * - パレタイズ対象品を検索
     *     criteriaDomainを引数に、{@link RpErtDao#searchTtPltzItemByDetailErt(LC001TtPltzItemByDetailErtCriteriaDomain)}を呼び出し、
     *     取得件数が0であれば、エラーとします。
     *     
     * - 取得したデータを返却
     * </pre>
     *
     * @param criteria LC001TtPltzItemByDetailErtCriteriaDomain 
     * @return TtPltzItemByDetailErtDomain
     * @throws ApplicationException application exception
     */
    List<LC001TtPltzItemByDetailErtDomain> searchTtPltzItemByDetailErt(LC001TtPltzItemByDetailErtCriteriaDomain criteria) throws ApplicationException;

}
