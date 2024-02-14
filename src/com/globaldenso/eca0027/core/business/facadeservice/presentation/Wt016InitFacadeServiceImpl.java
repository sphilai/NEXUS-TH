/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt016CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt016ListDomain;
import com.globaldenso.eca0027.core.business.domain.Wt016UnregHsCdListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt016UnregHsCdListCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt016UnregHsCdListService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The init service facade implementation class of Unregistered HS CODE List
 * Sub Screen. <br />
 * HS CODE登録なし品番表示子画面の初期処理facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt016InitFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<Wt016ListDomain>, Wt016CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {};

    /**
     * wt016UnregHsCdListService
     */
    private Wt016UnregHsCdListService wt016UnregHsCdListService;

    /**
     * Default constructor.
     */
    public Wt016InitFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for wt016UnregHsCdListService.
     * </p>
     * 
     * @param wt016UnregHsCdListService Set for
     *            wt016UnregHsCdListService
     */
    public void setWt016UnregHsCdListService(
        Wt016UnregHsCdListService wt016UnregHsCdListService) {
        this.wt016UnregHsCdListService = wt016UnregHsCdListService;
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
    protected Wt016CriteriaDomain filterDomain(
        Wt016CriteriaDomain argDomain) throws GscmApplicationException,
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
    protected void validateItems(Wt016CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {

        // Validate search criteria
        Validator<Wt016CriteriaDomain> valid = new Validator<Wt016CriteriaDomain>(
            criteriaDomain, "wt016CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT016);

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
    protected void validateConsistency(Wt016CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(Wt016CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the Unregistered HS CODE information.
     * <br />HS CODE登録なし品番情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt016UnregHsCdListServiceCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt016UnregHsCdListService.searchCount with tableCriteriaDomain as an argument.
     * - Get the search results.
     *     Call wt016UnregHsCdListService.searchByCondition with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt016ListDomain), return it.
     *     - Transfer the results of wt016UnregHsCdListService.searchByCondition to the list of Wt016ListDomain.
     *     - Return the list of Wt016ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt016UnregHsCdListServiceCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt016UnregHsCdListService.searchCountの呼び出し
     * - 検索結果の取得
     *       tableCriteriaDomainを引数にwt016UnregHsCdListService.searchByConditionの呼び出し
     * - 検索結果リストドメインWt016ListDomainのリストを作成し、返却
     *       - wt016UnregHsCdListService.searchByConditionの呼び出し結果をWt016ListDomainのリストに移送
     *       - Wt016ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.
     *       AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt016ListDomain> callServices(
        Wt016CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt016UnregHsCdListCriteriaDomain tableCriteriaDomain = 
            new Wt016UnregHsCdListCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);

        // Get the search results count.
        wt016UnregHsCdListService.searchCount(tableCriteriaDomain);

        // Call search service.
        List<Wt016UnregHsCdListDomain> tableResultDomainList = wt016UnregHsCdListService
            .searchByCondition(tableCriteriaDomain);

        List<Wt016ListDomain> listDomainList = new ArrayList<Wt016ListDomain>();
        if (tableResultDomainList != null) {

            for (Wt016UnregHsCdListDomain resultDomain : tableResultDomainList) {
                Wt016ListDomain listDomain = new Wt016ListDomain();

                // Copy from search results to displaying Domain on the
                // screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

}
