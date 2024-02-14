/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt007ItemNoInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007ItemNoInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Wt007ListDomain;
import com.globaldenso.eca0027.core.business.service.Wt007ItemNoInfoService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The init service facade implementation class of Item No. Info
 * Sub Screen. <br />
 * 品番情報表示子画面の初期表示facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt007InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<Wt007ListDomain>, Wt007CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {};

    /**
     * wt007ItemNoInfoService
     */
    private Wt007ItemNoInfoService wt007ItemNoInfoService;
                           
    /**
     * Default constructor.
     */
    public Wt007InitFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter:wt007ItemNoInfoService
     * </p>
     *
     * @param wt007ItemNoInfoService Set wt007ItemNoInfoService.
     */
    public void setWt007ItemNoInfoService(Wt007ItemNoInfoService wt007ItemNoInfoService) {
        this.wt007ItemNoInfoService = wt007ItemNoInfoService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 1.No process especially.
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#filterDomain 
     * (com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected Wt007CriteriaDomain filterDomain(Wt007CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * - Common error checking
     *     Validate search criteria.
     * 
     * - 共通エラーチェック
     *     検索条件入力チェック
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems 
     * (com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(Wt007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        // Validate search criteria.
        Validator<Wt007CriteriaDomain> valid = 
            new Validator<Wt007CriteriaDomain>(criteriaDomain, "criteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT007);

        // Check error.
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * 
     * <pre>
     * 1.No process especially.
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency 
     * (com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Wt007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}
     * 
     * <pre>
     * 1.No process especially.
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#databaseCheck 
     * (com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(Wt007CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for Item No. information.
     * 品番情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt007ItemNoInfoCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt007ItemNoInfoService.searchCount with tableCriteriaDomain as an argument.
     * - Get the results.
     *     Call wt007ItemNoInfoService.searchByCondition with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt007ListDomain), return it.
     *     - Transfer the results of wt007ItemNoInfoService.searchByCondition to the list of Wt007ListDomain.
     *     - Return the list of Wt007ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt007ItemNoInfoCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt007ItemNoInfoService.searchCountの呼び出し
     * - 検索結果を取得
     *       tableCriteriaDomainを引数にwt007ItemNoInfoService.searchByConditionの呼び出し
     * - 検索結果リストドメインWt007ListDomainのリストを作成し、返却
     *       - wt007ItemNoInfoService.searchByConditionの呼び出し結果をWt007ListDomainのリストに移送
     *       - Wt007ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices 
     * (com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt007ListDomain> callServices(
        Wt007CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        
        // Transfer your search criteria.
        Wt007ItemNoInfoCriteriaDomain tableCriteriaDomain = new Wt007ItemNoInfoCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);
        
        // Get the number of search results.
        wt007ItemNoInfoService.searchCount(tableCriteriaDomain);
        
        // Get the results.
        List<Wt007ItemNoInfoDomain> tableResultDomainList = 
            wt007ItemNoInfoService.searchByCondition(tableCriteriaDomain);
        
        List<Wt007ListDomain> listDomainList = new ArrayList<Wt007ListDomain>();
        if (tableResultDomainList != null) {
            for (Wt007ItemNoInfoDomain resultDomain : tableResultDomainList) {
                Wt007ListDomain listDomain = new Wt007ListDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);
                
                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

}
