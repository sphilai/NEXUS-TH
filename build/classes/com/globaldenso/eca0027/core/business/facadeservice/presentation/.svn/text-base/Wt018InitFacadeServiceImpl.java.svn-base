/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.Wt018ContainerInfoDomain;
import com.globaldenso.eca0027.core.business.domain.Wt018CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.Wt018ListDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.Wt018ContainerInfoCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.Wt018ContainerInfoService;
import com.globaldenso.eca0027.core.common.constants.Eca0027Constants;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The init service facade implementation class of Container No. Info
 * Sub Screen. <br />
 * コンテナNo.情報表示子画面の初期表示facadeサービス実装クラスです。
 * 
 * @author $Author$
 * @version $Revision$
 */
public class Wt018InitFacadeServiceImpl extends
    AbstractSearchFacadeService<List<Wt018ListDomain>, Wt018CriteriaDomain> {
    
    /** Validated property name of search criteria. */
    private static final String[] CHECK_TARGET_CRITERIA_PROPERTIES = {};

    /**
     * wt018CmlInfoService
     */
    private Wt018ContainerInfoService wt018ContainerInfoService;
                           
    /**
     * Default constructor.
     */
    public Wt018InitFacadeServiceImpl() {
    }

    /**
     * <p>wt018ContainerInfoService のセッターメソッドです。</p>
     *
     * @param wt018ContainerInfoService wt018ContainerInfoService に設定する
     */
    public void setWt018ContainerInfoService(
        Wt018ContainerInfoService wt018ContainerInfoService) {
        this.wt018ContainerInfoService = wt018ContainerInfoService;
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
    protected Wt018CriteriaDomain filterDomain(Wt018CriteriaDomain argDomain)
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
    protected void validateItems(Wt018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
        // Validate search criteria.
        Validator<Wt018CriteriaDomain> valid = 
            new Validator<Wt018CriteriaDomain>(criteriaDomain, "criteriaDomain");

        valid.isValidateProperties(CHECK_TARGET_CRITERIA_PROPERTIES,
            Eca0027Constants.SCREEN_ID_WT018);

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
    protected void validateConsistency(Wt018CriteriaDomain criteriaDomain)
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
    protected void validateDatabase(Wt018CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * 
     * <pre>
     * This method calls the service to search for Container information.
     * コンテナNo.情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from criteriaDomain to Wt018ContainerInfoCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call wt018ContainerInfoService.searchCount with tableCriteriaDomain as an argument.
     * - Get the results.
     *     Call wt018ContainerInfoService.searchByCondition with tableCriteriaDomain as an argument.
     * - Create a list of domain(Wt018ListDomain), return it.
     *     - Transfer the results of wt018ContainerInfoService.searchByCondition to the list of Wt018ListDomain.
     *     - Return the list of Wt018ListDomain.
     * 
     * - 検索条件の移送
     *       criteriaDomainよりWt018ContainerInfoCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にwt018ContainerInfoService.searchCountの呼び出し
     * - 検索結果を取得
     *       tableCriteriaDomainを引数にwt018ContainerInfoService.searchByConditionの呼び出し
     * - 検索結果リストドメインWt018ListDomainのリストを作成し、返却
     *       - wt018ContainerInfoService.searchByConditionの呼び出し結果をWt018ListDomainのリストに移送
     *       - Wt018ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices
     * (com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<Wt018ListDomain> callServices(Wt018CriteriaDomain criteriaDomain)
        throws GscmApplicationException, ApplicationException {

        
        // Transfer your search criteria.
        Wt018ContainerInfoCriteriaDomain tableCriteriaDomain = new Wt018ContainerInfoCriteriaDomain();
        
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, criteriaDomain);
        
        // Get the number of search results.
        wt018ContainerInfoService.searchCount(tableCriteriaDomain);

        // Get the results.
        List<Wt018ContainerInfoDomain> tableResultDomainList = 
            wt018ContainerInfoService.searchByCondition(tableCriteriaDomain);
        
        List<Wt018ListDomain> listDomainList = new ArrayList<Wt018ListDomain>();
        if (tableResultDomainList != null) {
            for (Wt018ContainerInfoDomain resultDomain : tableResultDomainList) {
                Wt018ListDomain listDomain = new Wt018ListDomain();

                // Copy from search results to displaying Domain on the screen.
                CommonUtil.copyPropertiesDomainToDomain(listDomain, resultDomain);
                
                listDomainList.add(listDomain);
            }
        }

        return listDomainList;
    }
}
