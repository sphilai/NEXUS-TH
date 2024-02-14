/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt008ListDomain;
import com.globaldenso.eca0027.core.business.domain.Wt008PortSelectDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt008PortSelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt008PortSelectService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Port Search Sub Screen.
 * <br />港選択子画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class Wt008SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<Wt008ListDomain>, Wt008CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {
        "portNm", "cntryCd"};

    /**
     * wt008PortSelectService
     */
    private Wt008PortSelectService wt008PortSelectService;
                           
    /**
     * Default constructor.
     */
    public Wt008SearchFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for wt008PortSelectService.</p>
     *
     * @param wt008PortSelectService Set for wt008PortSelectService
     */
    public void setWt008PortSelectService(Wt008PortSelectService wt008PortSelectService) {
        this.wt008PortSelectService = wt008PortSelectService;
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
    protected Wt008CriteriaDomain filterDomain(Wt008CriteriaDomain argDomain)
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
    protected void validateItems(Wt008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        // Validate search criteria.
        Validator<Wt008CriteriaDomain> valid = 
            new Validator<Wt008CriteriaDomain>(criteriaDomain, "wt008CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT008);

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
    protected void validateConsistency(Wt008CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(Wt008CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search for the Port information.
     * 港情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt008PortSelectCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt008PortSelectService.searchCount with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get "from" and "to" by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call wt008PortSelectService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(WT008ListDomain), return it.
     *     - Transfer the results of wt008PortSelectService.searchByConditionForPaging to the list of WT008ListDomain.
     *     - Return the list of WT008ListDomain.
     *
     * - 検索条件の移送
     *       criteriaDomainよりWt008PortSelectCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt008PortSelectService.searchCountの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にwt008PortSelectService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWT008ListDomainのリストを作成し、返却
     *       - wt008PortSelectService.searchByConditionForPagingの呼び出し結果をWT008ListDomainのリストに移送
     *       - WT008ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt008ListDomain> callServices(Wt008CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt008PortSelectCriteriaDomain tableCriteriaDomain = new Wt008PortSelectCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);
        
        // Get the search results count.
        int resultCount = wt008PortSelectService.searchCount(tableCriteriaDomain);
        
        // Calculate paging information.
        PageInfoCreator creator = criteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(resultCount, null, null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());

        // Call search service.
        List<Wt008PortSelectDomain> tableResultDomainList = 
            wt008PortSelectService.searchByConditionForPaging(tableCriteriaDomain);
        
        List<Wt008ListDomain> listDomainList = new ArrayList<Wt008ListDomain>();
        if (tableResultDomainList != null) {

            for (Wt008PortSelectDomain resultDomain : tableResultDomainList) {
                Wt008ListDomain listDomain = new Wt008ListDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);
                
                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

}
