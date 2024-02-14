/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt014CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt014ListDomain;
import com.globaldenso.eca0027.core.business.domain.Wt014ShipToSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt014ShipToSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt014ShipToSelectService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Ship to Search Sub Screen.
 * <br />送荷先選択子画面の検索facadeサービス実装クラスです。
 * <pre>
 * bean id:Wt014SearchFacadeService
 * </pre>
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt014SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<Wt014ListDomain>, Wt014CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {
        "shipToCd", "shipToNmAbb", "shipToNm"};

    /**
     * wt014ShipToSelectService
     */
    private Wt014ShipToSelectService wt014ShipToSelectService;
                           
    /**
     * Default constructor.
     */
    public Wt014SearchFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for wt014ShipToSelectService.</p>
     *
     * @param wt014ShipToSelectService Set for wt014ShipToSelectService
     */
    public void setWt014ShipToSelectService(Wt014ShipToSelectService wt014ShipToSelectService) {
        this.wt014ShipToSelectService = wt014ShipToSelectService;
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
    protected Wt014CriteriaDomain filterDomain(Wt014CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Common error checking
     *     - Validate search criteria
     *     - If there is an error
     * 
     * - 共通エラーチェック
     *     - 検索条件を検証
     *     - エラーがある場合
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Wt014CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        // Validate search criteria.
        Validator<Wt014CriteriaDomain> valid = 
            new Validator<Wt014CriteriaDomain>(criteriaDomain, "wt014CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT014);

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
    protected void validateConsistency(Wt014CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(Wt014CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search for the Ship to information.
     * <br />送荷先情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt014ShipToSelectCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt014ShipToSelectService.searchCount with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get "from" and "to" by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call wt014ShipToSelectService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt014ListDomain), return it.
     *     - Transfer the results of wt014ShipToSelectService.searchByConditionForPaging to the list of Wt014ListDomain.
     *     - Return the list of Wt014ListDomain.
     *
     * - 検索条件の移送
     *       criteriaDomainよりWt014ShipToSelectCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt014ShipToSelectService.searchCountの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にwt014ShipToSelectService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWt014ListDomainのリストを作成し、返却
     *       - wt014ShipToSelectService.searchByConditionForPagingの呼び出し結果をWt014ListDomainのリストに移送
     *       - Wt014ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt014ListDomain> callServices(Wt014CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt014ShipToSelectCriteriaDomain tableCriteriaDomain = new Wt014ShipToSelectCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);

        // Get the search results count.
        int resultCount = wt014ShipToSelectService.searchCount(tableCriteriaDomain);

        // Calculate paging information.
        PageInfoCreator creator = criteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(resultCount, null, null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());

        // Call search service.
        List<Wt014ShipToSelectDomain> tableResultDomainList = 
            wt014ShipToSelectService.searchByConditionForPaging(tableCriteriaDomain);

        List<Wt014ListDomain> listDomainList = new ArrayList<Wt014ListDomain>();
        if (listDomainList != null) {

            for (Wt014ShipToSelectDomain resultDomain : tableResultDomainList) {
                Wt014ListDomain listDomain = new Wt014ListDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;

    }

}