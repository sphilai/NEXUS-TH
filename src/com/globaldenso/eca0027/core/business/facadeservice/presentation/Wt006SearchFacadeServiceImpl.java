/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt006CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt006ListDomain;
import com.globaldenso.eca0027.core.business.domain.Wt006OuterPkgSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt006OuterPkgSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt006OuterPkgSelectService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Outer Package Search Sub
 * Screen. <br />
 * 外装選択子画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS50272 $
 * @version $Revision: 10090 $
 */
public class Wt006SearchFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<Wt006ListDomain>, Wt006CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CONDITION_PROPERTIES = {
        "ownerComp", "outerPkgCd", "pkgItemNo"};

    /**
     * wt006OuterPkgSelectService
     */
    private Wt006OuterPkgSelectService wt006OuterPkgSelectService;

    /**
     * Default constructor.
     */
    public Wt006SearchFacadeServiceImpl() {
    }

    /**
     * Setter:wt006OuterPkgSelectService
     * 
     * @param wt006OuterPkgSelectService wt006OuterPkgSelectService に設定する
     */
    public void setWt006OuterPkgSelectService(
        Wt006OuterPkgSelectService wt006OuterPkgSelectService) {
        this.wt006OuterPkgSelectService = wt006OuterPkgSelectService;
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
    protected Wt006CriteriaDomain filterDomain(Wt006CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     * 
     * - 共通エラーチェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Wt006CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        // Validate search criteria.
        Validator<Wt006CriteriaDomain> valid = new Validator<Wt006CriteriaDomain>(
            criteriaDomain, "wt006CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CONDITION_PROPERTIES,
            criteriaDomain.getScreenId());

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
    protected void validateConsistency(Wt006CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(Wt006CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the Outer Package information.
     * 外装情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt006OuterPkgSelectCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt006OuterPkgSelectService.searchCount with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get &quot;from&quot; and &quot;to&quot; by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call wt006OuterPkgSelectService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(WT006ListDomain), return it.
     *     - Transfer the results of wt006OuterPkgSelectService.searchByConditionForPaging to the list of WT006ListDomain.
     *     - Return the list of WT006ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt006OuterPkgSelectCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt006OuterPkgSelectService.searchCountの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にwt006OuterPkgSelectService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWT006ListDomainのリストを作成し、返却
     *       - wt006OuterPkgSelectService.searchByConditionForPagingの呼び出し結果をWT006ListDomainのリストに移送
     *       - WT006ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt006ListDomain> callServices(
        Wt006CriteriaDomain criteriaDomain) throws GscmApplicationException,
        ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt006OuterPkgSelectCriteriaDomain tableCriteriaDomain = new Wt006OuterPkgSelectCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);

        // Get the search results count.
        int totalCount = wt006OuterPkgSelectService
            .searchCount(tableCriteriaDomain);

        // Calculate paging information.
        PageInfoCreator creator = criteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(totalCount, null,
            null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());

        // Call search service.
        List<Wt006OuterPkgSelectDomain> tableResultDomainList = wt006OuterPkgSelectService
            .searchByConditionForPaging(tableCriteriaDomain);

        List<Wt006ListDomain> listDomainList = new ArrayList<Wt006ListDomain>();
        if (tableResultDomainList != null) {
            for (Wt006OuterPkgSelectDomain resultDomain : tableResultDomainList) {
                Wt006ListDomain listDomain = new Wt006ListDomain();

                // Copy from search results to displaying Domain on the
                // screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;

    }

}
