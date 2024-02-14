/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;
import static com.globaldenso.eca0027.core.common.constants.Eca0027Constants.SCREEN_ID_W9013;
import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W9013CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W9013ListDomain;
import com.globaldenso.eca0027.core.business.domain.W9013NxsWhMaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W9013NxsWhMaCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W9013NxsWhMaService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;
import com.globaldenso.gscm.framework.util.PageInfoCreator;
import com.globaldenso.gscm.framework.util.PageInfoData;
import com.globaldenso.gscm.framework.util.Validator;

/**
 * The search service facade implementation class of Warehouse Search Screen.
 * <br />倉庫検索画面の検索facadeサービス実装クラスです。
 * 
 * @author $Author: 10088DS01586 $
 * @version $Revision: 5759 $
 */

public class W9013SearchFacadeServiceImpl extends
    AbstractSearchFacadeService<List<W9013ListDomain>, W9013CriteriaDomain> {

    /**
     * w9013NxsWhMaService/w9013NxsWhMaサービス
     */
    private W9013NxsWhMaService w9013NxsWhMaService;

    /**
     * Default constructor./デフォルトコンストラクタ。
     */
    public W9013SearchFacadeServiceImpl() {
    }

    /**
     * <p>Setter method for w9013NxsWhMaService.</p>
     *
     * @param nxsWhMaService Set for w9013NxsWhMaService
     */
    public void setW9013NxsWhMaService(W9013NxsWhMaService nxsWhMaService) {
        w9013NxsWhMaService = nxsWhMaService;
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
    protected W9013CriteriaDomain filterDomain(W9013CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException {
        return argDomain;
    }

    /**
     * {@inheritDoc}
     * <pre>
     * - Common error check.
     * - 共通エラーチェックをする。
     * 
     * - Check out the single item.
     * - Check the error.
     * 
     * - 単項目チェックをする。
     * - エラーを確認する。
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService
     *      #validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W9013CriteriaDomain criteriaDomain) 
        throws GscmApplicationException, ValidationException, ApplicationException {

        Validator<W9013CriteriaDomain> valid 
            = new Validator<W9013CriteriaDomain>(criteriaDomain, "w9013CriteriaDomain");

        // Check out the single item.
        String[] properties = {
            "compCd", 
            "whCd", 
            "whNm"
        };
        valid.isValidateProperties(properties, SCREEN_ID_W9013);

        // Check the error.
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
    protected void validateConsistency(W9013CriteriaDomain w9013CriteriaDomain)
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
    protected void validateDatabase(W9013CriteriaDomain argDomain)
        throws GscmApplicationException, ApplicationException,
        ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * This method calls the service to search for the Warehouse information.
     * 倉庫情報を検索するサービスを呼び出します。
     * - Transfer your search criteria.
     *     Transfer your search criteria from w9013CriteriaDomain to NxsWhMaCriteriaDomain tableCriteriaDomain.
     * - Get the number of search results.
     *     Call nxsWhMaService.searchCount with tableCriteriaDomain as an argument.
     * - Calculate the search range corresponding to the requested page.
     *     Get "from" and "to" by using the PageInfoData, set it in tableCriteriaDomain.
     * - Get the results of the one page.
     *     Call nxsWhMaService.searchByConditionForPaging with tableCriteriaDomain as an argument.
     * - Create a list of domain(W9013ListDomain), return it.
     *     - Transfer the results of nxsWhMaService.searchByConditionForPaging to the list of W9013ListDomain.
     *     - Return the list of W9013ListDomain.
     *
     * - 検索条件の移送
     *       w9013CriteriaDomainよりW9013NxsWhMaCriteriaDomain tableCriteriaDomainに検索条件を移送
     * - 検索件数の取得
     *       tableCriteriaDomainを引数にw9013NxsWhMaService.searchCountの呼び出し
     * - 要求ページに対応する検索範囲を算出
     *       PageInfoDataを使用し取得したfrom, toをtableCriteriaDomainに設定
     * - 検索結果を1ページ分取得
     *       tableCriteriaDomainを引数にw9013NxsWhMaService.searchByConditionForPagingの呼び出し
     * - 検索結果リストドメインW9013ListDomainのリストを作成し、返却
     *       - w9013NxsWhMaService.searchByConditionForPagingの呼び出し結果をW9013ListDomainのリストに移送
     *       - W9013ListDomainのリストを返却
     * </pre>
     * 
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<W9013ListDomain> callServices(W9013CriteriaDomain w9013CriteriaDomain)
        throws GscmApplicationException, ApplicationException {
        
        // Copy from the criteria on screen to a search criteria Domain.
        W9013NxsWhMaCriteriaDomain tableCriteriaDomain = new W9013NxsWhMaCriteriaDomain();
        
        // Copy the search criteria.
        CommonUtil.copyPropertiesDomainToDomain(tableCriteriaDomain, w9013CriteriaDomain);
                
        // Get the search results count.
        int resultCount = w9013NxsWhMaService.searchCount(tableCriteriaDomain);
        
        // Calculate paging information.
        PageInfoCreator creator = w9013CriteriaDomain.getPageInfoCreator();
        PageInfoData pageInfo = creator.createPageInfoData(resultCount, null, null, null);
        tableCriteriaDomain.setRowNumFrom(pageInfo.getFromCount());
        tableCriteriaDomain.setRowNumTo(pageInfo.getToCount());

        // Call search service.
        List<W9013NxsWhMaDomain> tableResultDomainList = 
            w9013NxsWhMaService.searchByConditionForPaging(tableCriteriaDomain);
        
        List<W9013ListDomain> w9013ListDomainList = new ArrayList<W9013ListDomain>();
        if (w9013ListDomainList != null) {

            for (W9013NxsWhMaDomain resultDomain : tableResultDomainList) {
                W9013ListDomain w9013ListDomain = new W9013ListDomain();
                
                // Copy the search result.
                CommonUtil.copyPropertiesDomainToDomain(w9013ListDomain, resultDomain);

                w9013ListDomainList.add(w9013ListDomain);
            }
        }

        return w9013ListDomainList;

    }

}
