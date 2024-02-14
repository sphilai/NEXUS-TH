/*
 * Project : NEXUS_EXPORT
 *
 * Copyright (c) 2014 DENSO CORPORATION. All rights reserved.
 */
package com.globaldenso.eca0027.core.business.facadeservice.presentation;

import java.util.List;

import com.globaldenso.ai.common.core.exception.ApplicationException;
import com.globaldenso.eca0027.core.business.domain.WB020OdrUploadReqDomain;
import com.globaldenso.eca0027.core.business.service.WB020OdrUploadService;
import com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractSearchFacadeService;
import com.globaldenso.gscm.framework.exception.GscmApplicationException;
import com.globaldenso.gscm.framework.exception.ValidationException;

/**
 * The Init service facade implementation class of Staging Actuality Header screen
 * <br />山作り実績Header画面のInit facadeサービス実装クラスです。
 * <pre>
 * bean id:w4006InitFacadeService
 * </pre>
 *
 * @author $Author: G453S402002 $
 * @version $Revision: 13539 $
 */
public class WB020InitFacadeServiceImpl
    extends AbstractSearchFacadeService<List<? extends WB020OdrUploadReqDomain>, WB020OdrUploadReqDomain>
{

    /**
     * Staging actuality service.
     */
    protected WB020OdrUploadService wb020OdrUploadService;

    /**
     * constructor.
     */
    public WB020InitFacadeServiceImpl() {
    }

    /**
     * Setter method for wb020OdrUploadService.
     *
     * @param wb020OdrUploadService Set for wb020OdrUploadService
     */
    public void setWb020OdrUploadService(WB020OdrUploadService wb020OdrUploadService) {
        this.wb020OdrUploadService = wb020OdrUploadService;
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
    protected WB020OdrUploadReqDomain filterDomain(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ApplicationException
    {
        return wb020CriteriaDomain;
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
    protected void validateItems(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException
    {
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
    protected void validateConsistency(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException
    {
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
    protected void validateDatabase(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ApplicationException, ValidationException
    {
    }

    /**
     * {@inheritDoc}.
     * Call the service to clear the information of Staging Actuality Work
     * <br />山作り実績ワークの情報をクリアするサービスを呼び出します。
     * <pre>
     * - The transfer context information to W4005StgActDomain stgActDomain than wb020OdrUploadCriteriaDomain
     *     An argument stgActDomain, Call the W4005StgActService.deleteOnHeaderInit
     *
     * - wb020OdrUploadCriteriaDomainよりW4005StgActDomain stgActDomainにコンテキスト情報を移送
     *    stgActDomainを引数に、W4005StgActService.deleteOnHeaderInitの呼び出し
     * </pre>
     *
     * @see com.globaldenso.gscm.framework.business.facadeservice.presentation.AbstractFacadeService#callServices(com.globaldenso.gscm.framework.business.domain.AbstractDomain)
     */
    @Override
    protected List<? extends WB020OdrUploadReqDomain> callServices(WB020OdrUploadReqDomain wb020CriteriaDomain)
        throws GscmApplicationException, ApplicationException {

        List<? extends WB020OdrUploadReqDomain> listDomainList
            = wb020OdrUploadService.searchOnInit(wb020CriteriaDomain);

        return listDomainList;
    }
}
