/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt011CntrySelectDomain;
import com.globaldenso.eca0027.core.business.domain.Wt011CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt011ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt011CntrySelectCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt011CntrySelectService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Country Search Sub Screen.
 * <br />国選択子画面の検索facadeサービス実装クラスです。
 * <pre>
 * bean id:Wt011SearchFacadeService
 * </pre>
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt011SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<Wt011ListDomain>, Wt011CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {
        "cntryCd", "cntryNm"};

    /**
     * wt011CntrySelect service.
     */
    private Wt011CntrySelectService wt011CntrySelectService;
                           
    /**
     * Default constructor.
     */
    public Wt011SearchFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for wt011CntrySelectService.</p>
     *
     * @param wt011CntrySelectService Set for wt011CntrySelectService
     */
    public void setWt011CntrySelectService(Wt011CntrySelectService wt011CntrySelectService) {
        this.wt011CntrySelectService = wt011CntrySelectService;
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
    protected Wt011CriteriaDomain filterDomain(Wt011CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - Common error checking
     *     - Validate search criteria
     *     - If there is an error
     * - 共通エラーチェック
     *     - 検索条件を検証
     *     - エラーがある場合
     * </pre>
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Wt011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {

        // Validate search criteria
        Validator<Wt011CriteriaDomain> valid = 
            new Validator<Wt011CriteriaDomain>(criteriaDomain, "wt011CriteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT011);

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
    protected void validateConsistency(Wt011CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(Wt011CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search for the Country information.
     * <br />国情報を検索するサービスを呼び出します。
     * 
     * - Transfer your search criteria.
     *     Transfer your search criteria from Wt011CriteriaDomain to Wt011CntrySelectCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt011CntrySelectService.searchCount with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get "from" and "to" by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call wt011CntrySelectService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt011ListDomain), return it.
     *     - Transfer the results of wt011CntrySelectService.searchByConditionForPaging to the list of Wt011ListDomain.
     *     - Return the list of Wt011ListDomain.
     *
     * - 検索条件の移送
     *       Wt011CriteriaDomainよりWt011CntrySelectCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt011CntrySelectService.searchCountの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にwt011CntrySelectService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインWt011ListDomainのリストを作成し、返却
     *       - wt011CntrySelectService.searchByConditionForPagingの呼び出し結果をWt011ListDomainのリストに移送
     *       - Wt011ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt011ListDomain> callServices(Wt011CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Copy from the criteria on screen to a search criteria Domain.
        Wt011CntrySelectCriteriaDomain tableCriteriaDomain = new Wt011CntrySelectCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);

        // Get the search results count.
        int resultCount = wt011CntrySelectService.searchCount(tableCriteriaDomain);

        // Calculate paging information.
        PageInfoCreator creator = criteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(resultCount, null, null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());

        // Call search service.
        List<Wt011CntrySelectDomain> tableResultDomainList = 
            wt011CntrySelectService.searchByConditionForPaging(tableCriteriaDomain);

        List<Wt011ListDomain> listDomainList = new ArrayList<Wt011ListDomain>();

        if (listDomainList != null) {

            for (Wt011CntrySelectDomain resultDomain : tableResultDomainList) {
                Wt011ListDomain listDomain = new Wt011ListDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);

                listDomainList.add(listDomain);
            }
        }

        return listDomainList;

    }

}