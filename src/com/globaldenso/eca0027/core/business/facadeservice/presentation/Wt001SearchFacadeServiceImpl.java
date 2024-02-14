/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt001CompSelectDomain;
import com.globaldenso.eca0027.core.business.domain.Wt001CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt001ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt001CompSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt001CompSelectService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Company Search Sub Screen.
 * <br />
 * 会社選択子画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt001SearchFacadeServiceImpl
    extends
    AbstractSearchFacadeService<List<Wt001ListDomain>, Wt001CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {"compCd",
        "compNmAbb", "compNm"};

    /**
     * wt001CompSelectService
     */
    private Wt001CompSelectService wt001CompSelectService;

    /**
     * Default constructor.
     */
    public Wt001SearchFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter method for wt001CompSelectService.
     * </p>
     * 
     * @param wt001CompSelectService Set for wt001CompSelectService
     */
    public void setWt001CompSelectService(
        Wt001CompSelectService wt001CompSelectService) {
        this.wt001CompSelectService = wt001CompSelectService;
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
    protected Wt001CriteriaDomain filterDomain(
        Wt001CriteriaDomain argDomain) throws GscmApplicationException,
        ApplicationException {
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
    protected void validateItems(Wt001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
        // Validate search criteria.
        Validator<Wt001CriteriaDomain> valid = new Validator<Wt001CriteriaDomain>(
            criteriaDomain, "wt001CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT001);

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
    protected void validateConsistency(Wt001CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(Wt001CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for the company information.
     * 会社情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt001CompSelectCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt001CompSelectService.searchCount with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get &quot;from&quot; and &quot;to&quot; by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call wt001CompSelectService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(WT001ListDomain), return it.
     *     - Transfer the results of wt001CompSelectService.searchByConditionForPaging to the list of WT001ListDomain.
     *     - Return the list of WT001ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt001CompSelectCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt001CompSelectService.searchCountの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にwt001CompSelectService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWT001ListDomainのリストを作成し、返却
     *       - wt001CompSelectService.searchByConditionForPagingの呼び出し結果をWT001ListDomainのリストに移送
     *       - WT001ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt001ListDomain> callServices(
        Wt001CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt001CompSelectCriteriaDomain tableCriteriaDomain = new Wt001CompSelectCriteriaDomain();

        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);

        // Get the search results count.
        int resultCount = wt001CompSelectService.searchCount(tableCriteriaDomain);

        // Calculate paging information.
        PageInfoCreator creator = criteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(resultCount, null,
            null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());

        // Call search service.
        List<Wt001CompSelectDomain> tableResultDomainList = wt001CompSelectService
            .searchByConditionForPaging(tableCriteriaDomain);

        List<Wt001ListDomain> listDomainList = new ArrayList<Wt001ListDomain>();
        if (listDomainList != null) {

            for (Wt001CompSelectDomain resultDomain : tableResultDomainList) {
                Wt001ListDomain listDomain = new Wt001ListDomain();

                // Copy from search results to displaying Domain on the
                // screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);
                    
                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

}
