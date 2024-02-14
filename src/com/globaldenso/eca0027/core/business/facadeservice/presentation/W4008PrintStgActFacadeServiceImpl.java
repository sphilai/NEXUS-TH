/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.io.File;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4008CriteriaDomain;
import com.globaldenso.eca0027.core.business.domain.criteria.W4005StgActCriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * Staging Actuality form download facade service implementation class of Staging Actuality Register screen
 * <br />山作り実績Register画面のStaging Actuality帳票ダウンロードfacadeサービス実装クラスです。
 * <pre>
 * bean id:w4008PrintStgActFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4008PrintStgActFacadeServiceImpl extends
    AbstractSearchFacadeService<File, W4008CriteriaDomain> {

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4008PrintStgActFacadeServiceImpl() {
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
     * Call the service for which you want to create a PDF file of Staging Actuality form
     * <br />Staging Actuality帳票のPDFファイルを作成するサービスを呼び出します。
     * <pre>
     * - The transfer your search criteria in W4005StgActDomain stgActDomain than w4008CriteriaDomain
     * - Call of W4005StgActService.printStgAct an argument stgActDomain
     * - Return the result of the call W4005StgActService.printStgAct
     *
     * - w4008CriteriaDomainよりW4005StgActDomain stgActDomainに検索条件を移送
     * - stgActDomainを引数にW4005StgActService.printStgActの呼び出し
     * - W4005StgActService.printStgActの呼び出し結果を返却
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected File callServices(W4008CriteriaDomain w4008CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005StgActCriteriaDomain stgActCriteriaDomain = new W4005StgActCriteriaDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgActCriteriaDomain,
            w4008CriteriaDomain, w4008CriteriaDomain.getScreenDateFormat());

        // Call form generation service
        // 帳票生成サービス呼び出し
        File resultFile = w4005StgActService.printStgAct(stgActCriteriaDomain);

        return resultFile;
    }
}
