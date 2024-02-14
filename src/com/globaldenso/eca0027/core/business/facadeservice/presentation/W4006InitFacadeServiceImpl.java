/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.W4005StgActDomain;
import com.globaldenso.eca0027.core.business.domain.W4006CriteriaDomain;
import com.globaldenso.eca0027.core.business.service.W4005StgActService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractDeleteFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;
import com.globaldenso.gscm.framework.util.CommonUtil;

/**
 * The Init service facade implementation class of Staging Actuality Header screen
 * <br />山作り実績Header画面のInit facadeサービス実装クラスです。
 * <pre>
 * bean id:w4006InitFacadeService
 * </pre>
 *
 * @author $Author: masaki_awata@dnitsol.com $
 * @version $Revision: 5446 $
 */
public class W4006InitFacadeServiceImpl extends
    AbstractDeleteFacadeService<Integer, W4006CriteriaDomain> {

    /**
     * Staging actuality service.
     */
    protected W4005StgActService w4005StgActService;

    /**
     * constructor.
     */
    public W4006InitFacadeServiceImpl() {
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
    protected W4006CriteriaDomain filterDomain(W4006CriteriaDomain w4006CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        return w4006CriteriaDomain;
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
    protected void validateItems(W4006CriteriaDomain w4006CriteriaDomain)
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
    protected void validateConsistency(W4006CriteriaDomain w4006CriteriaDomain)
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
    protected void validateDatabase(W4006CriteriaDomain w4006CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException {
    }

    /**
     * {@inheritDoc}.
     * Call the service to clear the information of Staging Actuality Work
     * <br />山作り実績ワークの情報をクリアするサービスを呼び出します。
     * <pre>
     * - The transfer context information to W4005StgActDomain stgActDomain than w4006CriteriaDomain
     *     An argument stgActDomain, Call the W4005StgActService.deleteOnHeaderInit
     *
     * - w4006CriteriaDomainよりW4005StgActDomain stgActDomainにコンテキスト情報を移送
     *    stgActDomainを引数に、W4005StgActService.deleteOnHeaderInitの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected Integer callServices(W4006CriteriaDomain w4006CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        // PL domain -> BL domain transfer
        // PLドメイン→BLドメイン移送
        W4005StgActDomain stgActDomain = new W4005StgActDomain();
        CommonUtil.copyPropertiesDomainToDomain(stgActDomain,
            w4006CriteriaDomain, w4006CriteriaDomain.getScreenDateFormat());

        // Call delete service
        // 削除サービス呼び出し
        Integer deleteCount = w4005StgActService.deleteOnHeaderInit(stgActDomain);

        return deleteCount;
    }
}
