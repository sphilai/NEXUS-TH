/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt015CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt015ListDomain;
import com.globaldenso.eca0027.core.business.domain.Wt015UnitPriceErrListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt015UnitPriceErrListCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt015UnitPriceErrListService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The init service facade implementation class of Unit Price Error List
 * Sub Screen. <br />
 * 売価登録なし品番表示子画面の初期処理facadeサービス実装クラスです。
 * <pre>
 * bean wt015InitFacadeService
 * </pre>
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt015InitFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<Wt015ListDomain>, Wt015CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {};

    /**
     * wt015UnitPriceErrListService
     */
    private Wt015UnitPriceErrListService wt015UnitPriceErrListService;

    /**
     * Default constructor.
     */
    public Wt015InitFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for wt015UnitPriceErrListService.</p>
     *
     * @param wt015UnitPriceErrListService Set for wt015UnitPriceErrListService
     */
    public void setWt015UnitPriceErrListService(
        Wt015UnitPriceErrListService wt015UnitPriceErrListService) {
        this.wt015UnitPriceErrListService = wt015UnitPriceErrListService;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected Wt015CriteriaDomain filterDomain(
        Wt015CriteriaDomain argDomain) throws GscmApplicationException,
        ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *     - Validate search criteria
     *     - If there is an error
     * 
     * - 共通エラーチェック
     *     - 検索条件を検証
     *     - エラーがある場合
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Wt015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

        // Validate search criteria.
        Validator<Wt015CriteriaDomain> valid = new Validator<Wt015CriteriaDomain>(
            criteriaDomain, "wt015CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT015);

        // Check error.
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Wt015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#databaseCheck(com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Wt015CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the Unit Price Error information.
     * <br />売価登録なし品番情報を検索するサービスを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt015UnitPriceErrListServiceCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt015UnitPriceErrListService.searchCount with tableCriteriaDomain as an argument.
     * - Get the search results.
     *     Call wt015UnitPriceErrListService.searchByCondition with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt015ListDomain), return it.
     *     - Transfer the results of wt015UnitPriceErrListService.searchByCondition to the list of Wt015ListDomain.
     *     - Return the list of Wt015ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt015UnitPriceErrListServiceCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt015UnitPriceErrListService.searchCountの呼び出し
     * - 検索結果の取得
     *       tableCriteriaDomainを引数にwt015UnitPriceErrListService.searchByConditionの呼び出し
     * - 検索結果リストドメインWt015ListDomainのリストを作成し、返却
     *       - wt015UnitPriceErrListService.searchByConditionの呼び出し結果をWt015ListDomainのリストに移送
     *       - Wt015ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.
     *       AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt015ListDomain> callServices(
        Wt015CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt015UnitPriceErrListCriteriaDomain tableCriteriaDomain = 
            new Wt015UnitPriceErrListCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);

        // Get the search results count.
        wt015UnitPriceErrListService.searchCount(tableCriteriaDomain);

        // Call search service.
        List<Wt015UnitPriceErrListDomain> tableResultDomainList = wt015UnitPriceErrListService
            .searchByCondition(tableCriteriaDomain);

        List<Wt015ListDomain> listDomainList = new ArrayList<Wt015ListDomain>();
        if (tableResultDomainList != null) {

            for (Wt015UnitPriceErrListDomain resultDomain : tableResultDomainList) {
                Wt015ListDomain listDomain = new Wt015ListDomain();

                // Copy from search results to displaying Domain on the
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

}
