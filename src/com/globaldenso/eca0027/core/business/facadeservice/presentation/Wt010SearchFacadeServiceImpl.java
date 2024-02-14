/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt010CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt010ListDomain;
import com.globaldenso.eca0027.core.business.domain.Wt010WhSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt010WhSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt010WhSelectService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Warehouse Search Sub Screen.
 * <br />倉庫選択子画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt010SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<Wt010ListDomain>, Wt010CriteriaDomain> {

    /** Validated property name of search condition. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {
        "compCd", "whCd", "whNm"};

    /**
     * wt010WhSelectService
     */
    private Wt010WhSelectService wt010WhSelectService;

    /**
     * Default constructor.
     */
    public Wt010SearchFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for wt010WhSelectService.</p>
     *
     * @param wt010WhSelectService Set for wt010WhSelectService
     */
    public void setWt010WhSelectService(
        Wt010WhSelectService wt010WhSelectService) {
        this.wt010WhSelectService = wt010WhSelectService;
    }
    
    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected Wt010CriteriaDomain filterDomain(Wt010CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

     /**
      * {@inheritDoc}.
      * <pre>
      * - Common error checking
      *
      * - 共通エラーチェック
      * </pre>
      * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
      */
    @Override
    protected void validateItems(Wt010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        // Validate search criteria.
        Validator<Wt010CriteriaDomain> valid = 
            new Validator<Wt010CriteriaDomain>(criteriaDomain, "wt010CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT010);

        // Check error.
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Wt010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing.
     * 
     * - 処理なし。
     * </pre>
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#databaseCheck(com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(Wt010CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search for the Warehouse information.
     * 倉庫情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt010WhSelectCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt010WhSelectService.searchCount with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get "from" and "to" by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call wt010WhSelectService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(WT010ListDomain), return it.
     *     - Transfer the results of wt010WhSelectService.searchByConditionForPaging to the list of WT010ListDomain.
     *     - Return the list of WT010ListDomain.
     *
     * - 検索条件の移送
     *       criteriaDomainよりWt010WhSelectCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt010WhSelectService.searchCountの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にwt010WhSelectService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWT010ListDomainのリストを作成し、返却
     *       - wt010WhSelectService.searchByConditionForPagingの呼び出し結果をWT010ListDomainのリストに移送
     *       - WT010ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt010ListDomain> callServices(Wt010CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Copy from the criteria on screen to a search criteria Domain.
        Wt010WhSelectCriteriaDomain tableCriteriaDomain = new Wt010WhSelectCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);
        
        // Get the search results count.
        int resultCount = wt010WhSelectService.searchCount(tableCriteriaDomain);
        
        // Calculate paging information.
        PageInfoCreator creator = criteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(resultCount, null, null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());

        // Call search service.
        List<Wt010WhSelectDomain> tableResultDomainList = 
            wt010WhSelectService.searchByConditionForPaging(tableCriteriaDomain);
        
        List<Wt010ListDomain> listDomainList = new ArrayList<Wt010ListDomain>();
        if (listDomainList != null) {

            for (Wt010WhSelectDomain resultDomain : tableResultDomainList) {
                Wt010ListDomain listDomain = new Wt010ListDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;

    }

}
