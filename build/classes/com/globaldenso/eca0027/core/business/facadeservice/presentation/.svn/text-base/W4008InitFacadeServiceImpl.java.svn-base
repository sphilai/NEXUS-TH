/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.W4008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4008ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4008UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Initialize service facade implementation class of Staging Actuality Register screen
 * <br />山作り実績Register画面の初期表示facadeサービス実装クラスです。
 * <pre>
 * bean id:w4008InitFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4008InitFacadeServiceImpl extends
    AbstractSearchFacadeService<W4008UpdateDomain, W4008CriteriaDomain> {

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4008InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w4005StgActService.
     *
     * @param stgActService Set for w4005StgActService
     */
    public void setW4005StgActService(W4005StgActService stgActService) {
        w4005StgActService = stgActService;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#filterDomain(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4008CriteriaDomain filterDomain(W4008CriteriaDomain w4008CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4008CriteriaDomain;
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateItems(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateItems(W4008CriteriaDomain w4008CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateConsistency(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateConsistency(W4008CriteriaDomain w4008CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * <pre>
     * - No processing
     * - 処理なし
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#validateDatabase(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected void validateDatabase(W4008CriteriaDomain w4008CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search for palletize that make up the Staging actuality
     * <br />山作り実績を構成するパレタイズを検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W4008StgActCriteriaDomain stgActCriteriaDomain than w4008CriteriaDomain
     * - In the case of transition from the Main screen
     *     - Search for palletize to be included in the Staging Actuality being created
     *         Call the W4005StgActService.searchOnRegisterInitByFromCreate an argument stgActCriteriaDomain
     * - In the case of transition from the Create screen
     *     - Search for palletize to be included in the Staging Actuality being created
     *         Call the W4005StgActService.searchOnRegisterInitByFromCreate an argument stgActCriteriaDomain
     * - Is converted to W4008UpdateDomain search results, return
     *     - Convert W4008UpdateDomain search results
     *     - The return a list of W4008UpdateDomain
     *
     * - w4008CriteriaDomainよりW4008StgActCriteriaDomain stgActCriteriaDomainに検索条件を移送
     * - Main画面から遷移の場合
     *     - 作成中の山作り実績に含めるパレタイズを検索
     *           stgActCriteriaDomainを引数にW4005StgActService.searchOnRegisterInitByFromMainの呼び出し
     * - Create画面から遷移の場合
     *     - 作成中の山作り実績に含めるパレタイズを検索
     *           stgActCriteriaDomainを引数にW4005StgActService.searchOnRegisterInitByFromCreateの呼び出し
     * - 検索結果をW4008UpdateDomainに変換し、返却
     *     - 検索結果をW4008UpdateDomainに変換
     *     - W4008UpdateDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4008UpdateDomain callServices(W4008CriteriaDomain w4008CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create the search criteria domain
        // 検索条件ドメインを作成

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005StgActCriteriaDomain stgActCriteriaDomain = new W4005StgActCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgActCriteriaDomain,
            w4008CriteriaDomain, w4008CriteriaDomain.getScreenDateFormat());

        // Search palletize
        // パレタイズの検索

        W4005StgActDomain resultStgActDomain = null;

        // In the case of transition from the Main screen
        // Main画面からの遷移の場合
        if (!CheckUtil.isBlankOrNull(w4008CriteriaDomain.getStgActNo())) {
            // Call search service
            // 検索サービス呼び出し
            resultStgActDomain
                = w4005StgActService.searchOnRegisterInitByFromMain(stgActCriteriaDomain);

        // In the case of transition from the Create screen
        // Create画面からの遷移の場合
        } else {
            // Call search service
            // 検索サービス呼び出し
            resultStgActDomain
                = w4005StgActService.searchOnRegisterInitByFromCreate(stgActCriteriaDomain);
        }

        // Conversion of the search results
        // 検索結果の変換

        // PL domain of the collective return for
        // 一括返却用のPLドメイン
        W4008UpdateDomain w4008UpdateDomain = new W4008UpdateDomain();

        // BL domain -> PL domain transfer
        // BLドメイン→PLドメイン移送
        W4008CriteriaDomain w4008CriteriaDomain2 = new W4008CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(w4008CriteriaDomain2,
            resultStgActDomain, w4008CriteriaDomain.getScreenDateFormat());
        w4008UpdateDomain.setW4008CriteriaDomain(w4008CriteriaDomain2);

        List<W4008ListDomain> w4008ListDomainList = new ArrayList<W4008ListDomain>();
        for (W4005PltzDomain resultPltzDomain : resultStgActDomain.getPltzDomainList()) {
            // BL domain -> PL domain transfer
            // BLドメイン→PLドメイン移送
            W4008ListDomain w4008ListDomain = new W4008ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w4008ListDomain,
                resultPltzDomain, w4008CriteriaDomain.getScreenDateFormat());
            w4008ListDomainList.add(w4008ListDomain);
        }
        w4008UpdateDomain.setW4008ListDomainList(w4008ListDomainList);

        return w4008UpdateDomain;
    }
}
