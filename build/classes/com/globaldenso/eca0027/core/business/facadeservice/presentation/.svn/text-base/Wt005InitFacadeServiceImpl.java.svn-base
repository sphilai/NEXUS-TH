/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt005CmlInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Wt005CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt005ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt005CmlInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt005CmlInfoService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The init service facade implementation class of CML Info
 * Sub Screen. <br />
 * CML情報表示子画面の初期表示facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */
public class Wt005InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<Wt005ListDomain>, Wt005CriteriaDomain> {

    /** Validated property name of search criteria. */
    private static final String[] CEHCK_TARGET_CRITERIA_PROPERTIES = {};

    /**
     * wt005CmlInfoService
     */
    private Wt005CmlInfoService wt005CmlInfoService;
                           
    /**
     * Default constructor.
     */
    public Wt005InitFacadeServiceImpl() {
    }

    /**
     * <p>
     * Setter:wt005CmlInfoService
     * </p>
     *
     * @param wt005CmlInfoService Set wt005CmlInfoService.
     */
    public void setWt005CmlInfoService(Wt005CmlInfoService wt005CmlInfoService) {
        this.wt005CmlInfoService = wt005CmlInfoService;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 1.No process especially.
     * - 処理なし。
     * </pre>
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#filterDomain
     * (com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */
    @Override
    protected Wt005CriteriaDomain filterDomain(Wt005CriteriaDomain argDomain)
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
    protected void validateItems(Wt005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        // Validate search criteria.
        Validator<Wt005CriteriaDomain> valid = 
            new Validator<Wt005CriteriaDomain>(criteriaDomain, "criteriaDomain");

        valid.isValidateProperties(CEHCK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT005);

        // Check error.
        if (0 < valid.getErrList().size()) {
            throw new ValidationException(valid.getErrList());
        }
    }
    
    /**
     * {@inheritDoc}
     * <pre>
     * 1.No process especially.
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency
     * (com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(Wt005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}
     * <pre>
     * 1.No process especially.
     * - 処理なし。
     * </pre>
     * 
     * @see com.globaldenso.gscm.sample.core.business.facadeservice.presentation.AbstractFacadeService#databaseCheck
     * (com.globaldenso.gscm.common.business.domain.AbstractDomain)
     */

    @Override
    protected void validateDatabase(Wt005CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for CML information.
     * CML情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt005CmlInfoCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt005CmlInfoService.searchCount with tableCriteriaDomain as an argument.
     * - Get the results.
     *     Call wt005CmlInfoService.searchByCondition with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt005ListDomain), return it.
     *     - Transfer the results of wt005CmlInfoService.searchByCondition to the list of Wt005ListDomain.
     *     - Return the list of Wt005ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt005CmlInfoCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt005CmlInfoService.searchCountの呼び出し
     * - 検索結果を取得
     *       tableCriteriaDomainを引数にwt005CmlInfoService.searchByConditionの呼び出し
     * - 検索結果リストドメインWt005ListDomainのリストを作成し、返却
     *       - wt005CmlInfoService.searchByConditionの呼び出し結果をWt005ListDomainのリストに移送
     *       - Wt005ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices
     * (com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt005ListDomain> callServices(
        Wt005CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        
        // Transfer your search criteria.
        Wt005CmlInfoCriteriaDomain tableCriteriaDomain = new Wt005CmlInfoCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);
        
        // Get the number of search results.
        wt005CmlInfoService.searchCount(tableCriteriaDomain);

        // Get the results.
        List<Wt005CmlInfoDomain> tableResultDomainList = 
            wt005CmlInfoService.searchByCondition(tableCriteriaDomain);
        
        List<Wt005ListDomain> listDomainList = new ArrayList<Wt005ListDomain>();
        if (tableResultDomainList != null) {
            for (Wt005CmlInfoDomain resultDomain : tableResultDomainList) {
                Wt005ListDomain listDomain = new Wt005ListDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);
                
                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }

}