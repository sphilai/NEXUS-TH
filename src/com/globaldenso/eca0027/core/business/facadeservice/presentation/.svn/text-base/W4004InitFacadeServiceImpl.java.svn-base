/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.ArrayList;
import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4001PltzDomain;
import com.globaldenso.eca0027.core.business.domain.W4001StgInstrDomain;
import com.globaldenso.eca0027.core.business.domain.W4004CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.W4004ListDomain;
import com.globaldenso.eca0027.core.business.domain.W4004UpdateDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4001StgInstrCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4001StgInstrService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CheckUtil;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Initialize service facade implementation class of Staging Instruction Register screen
 * <br />荷揃え指示Register画面の初期表示facadeサービス実装クラスです。
 * <pre>
 * bean id:w4004InitFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4004InitFacadeServiceImpl extends
    AbstractSearchFacadeService<W4004UpdateDomain, W4004CriteriaDomain> {

    /**
     * Staging instruction service.
     */
    protected W4001StgInstrService w4001StgInstrService;

    /**
     * constructor.
     */
    public W4004InitFacadeServiceImpl() {
    }

    /**
     * Setter method for w4001StgInstrService.
     *
     * @param stgInstrService Set for w4001StgInstrService
     */
    public void setW4001StgInstrService(W4001StgInstrService stgInstrService) {
        w4001StgInstrService = stgInstrService;
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
    protected W4004CriteriaDomain filterDomain(W4004CriteriaDomain w4004CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4004CriteriaDomain;
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
    protected void validateItems(W4004CriteriaDomain w4004CriteriaDomain)
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
    protected void validateConsistency(W4004CriteriaDomain w4004CriteriaDomain)
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
    protected void validateDatabase(W4004CriteriaDomain w4004CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to search for palletize that make up the Staging instruction
     * <br />荷揃え指示を構成するパレタイズを検索するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W4004StgInstrCriteriaDomain stgInstrCriteriaDomain than w4004CriteriaDomain
     * - In the case of transition from the Main screen
     *     - Search for palletize to be included in the Staging Instruction being created
     *         Call the W4001StgInstrService.searchOnRegisterInitByFromCreate an argument stgInstrCriteriaDomain
     * - In the case of transition from the Create screen
     *     - Search for palletize to be included in the Staging Instruction being created
     *         Call the W4001StgInstrService.searchOnRegisterInitByFromCreate an argument stgInstrCriteriaDomain
     * - Is converted to W4004UpdateDomain search results, return
     *     - Convert W4004UpdateDomain search results
     *     - The return a list of W4004UpdateDomain
     *
     * - w4004CriteriaDomainよりW4004StgInstrCriteriaDomain stgInstrCriteriaDomainに検索条件を移送
     * - Main画面から遷移の場合
     *     - 作成中の荷揃え指示に含めるパレタイズを検索
     *           stgInstrCriteriaDomainを引数にW4001StgInstrService.searchOnRegisterInitByFromMainの呼び出し
     * - Create画面から遷移の場合
     *     - 作成中の荷揃え指示に含めるパレタイズを検索
     *           stgInstrCriteriaDomainを引数にW4001StgInstrService.searchOnRegisterInitByFromCreateの呼び出し
     * - 検索結果をW4004UpdateDomainに変換し、返却
     *     - 検索結果をW4004UpdateDomainに変換
     *     - W4004UpdateDomainのリストを返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected W4004UpdateDomain callServices(W4004CriteriaDomain w4004CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // Create the search criteria domain
        // 検索条件ドメインを作成

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4001StgInstrCriteriaDomain stgInstrCriteriaDomain = new W4001StgInstrCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgInstrCriteriaDomain,
            w4004CriteriaDomain, w4004CriteriaDomain.getScreenDateFormat());

        // Search palletize
        // パレタイズの検索

        W4001StgInstrDomain resultStgInstrDomain = null;

        // In the case of transition from the Main screen
        // Main画面からの遷移の場合
        if (!CheckUtil.isBlankOrNull(w4004CriteriaDomain.getStgInstrNo())) {
            // Call search service
            // 検索サービス呼び出し
            resultStgInstrDomain
                = w4001StgInstrService.searchOnRegisterInitByFromMain(stgInstrCriteriaDomain);

        // In the case of transition from the Create screen
        // Create画面からの遷移の場合
        } else {
            // Call search service
            // 検索サービス呼び出し
            resultStgInstrDomain
                = w4001StgInstrService.searchOnRegisterInitByFromCreate(stgInstrCriteriaDomain);
        }

        // Conversion of the search results
        // 検索結果の変換

        // PL domain of the collective return for
        // 一括返却用のPLドメイン
        W4004UpdateDomain w4004UpdateDomain = new W4004UpdateDomain();

        // BL domain -> PL domain transfer
        // BLドメイン→PLドメイン移送
        W4004CriteriaDomain w4004CriteriaDomain2 = new W4004CriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(w4004CriteriaDomain2,
            resultStgInstrDomain, w4004CriteriaDomain.getScreenDateFormat());
        w4004UpdateDomain.setW4004CriteriaDomain(w4004CriteriaDomain2);

        List<W4004ListDomain> w4004ListDomainList = new ArrayList<W4004ListDomain>();
        for (W4001PltzDomain resultPltzDomain : resultStgInstrDomain.getPltzDomainList()) {
            // BL domain -> PL domain transfer
            // BLドメイン→PLドメイン移送
            W4004ListDomain w4004ListDomain = new W4004ListDomain();
            CommonUtil.copyPropertiesDomainToDomain(w4004ListDomain,
                resultPltzDomain, w4004CriteriaDomain.getScreenDateFormat());
            w4004ListDomainList.add(w4004ListDomain);
        }
        w4004UpdateDomain.setW4004ListDomainList(w4004ListDomainList);

        return w4004UpdateDomain;
    }
}
